/*
 * (C) Copyright 2016-2018, by Joris Kinable and Contributors.
 *
 * JGraphT : a free Java graph-theory library
 *
 * See the CONTRIBUTORS.md file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0, or the
 * GNU Lesser General Public License v2.1 or later
 * which is available at
 * http://www.gnu.org/licenses/old-licenses/lgpl-2.1-standalone.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR LGPL-2.1-or-later
 */
package org.jgrapht.alg.vertexcover;

import com.duy.util.DObjects;

import org.jgrapht.Graph;
import org.jgrapht.GraphTests;
import org.jgrapht.alg.interfaces.VertexCoverAlgorithm;
import org.jgrapht.alg.vertexcover.util.RatioVertex;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * Implementation of the 2-opt algorithm for a minimum weighted vertex cover by Clarkson, Kenneth L.
 * "A modification of the greedy algorithm for vertex cover." Information Processing Letters 16.1
 * (1983): 23-25. The solution is guaranteed to be within $2$ times the optimum solution. Runtime:
 * $O(|E|\log |V|)$
 * <p>
 * Note: this class supports pseudo-graphs
 *
 * @param <V> the graph vertex type
 * @param <E> the graph edge type
 * @author Joris Kinable
 */
public class ClarksonTwoApproxVCImpl<V, E>
        implements
        VertexCoverAlgorithm<V> {

    private static int vertexCounter = 0;

    private final Graph<V, E> graph;
    private final Map<V, Double> vertexWeightMap;

    /**
     * Constructs a new ClarksonTwoApproxVCImpl instance where all vertices have uniform weights.
     *
     * @param graph input graph
     */
    public ClarksonTwoApproxVCImpl(Graph<V, E> graph) {
        this.graph = GraphTests.requireUndirected(graph);
        Map<V, Double> map = new HashMap<>();
        for (V vertex : graph
                .vertexSet()) {
            if (map.put(vertex, 1.0) != null) {
                throw new IllegalStateException("Duplicate key");
            }
        }
        this.vertexWeightMap = map;
    }

    /**
     * Constructs a new ClarksonTwoApproxVCImpl instance
     *
     * @param graph           input graph
     * @param vertexWeightMap mapping of vertex weights
     */
    public ClarksonTwoApproxVCImpl(Graph<V, E> graph, Map<V, Double> vertexWeightMap) {
        this.graph = GraphTests.requireUndirected(graph);
        this.vertexWeightMap = DObjects.requireNonNull(vertexWeightMap);
    }

    @Override
    public VertexCover<V> getVertexCover() {
        // Result
        Set<V> cover = new LinkedHashSet<>();
        double weight = 0;

        // Create working graph: for every vertex, create a RatioVertex which maintains its own list
        // of neighbors
        Map<V, RatioVertex<V>> vertexEncapsulationMap = new HashMap<>();
        for (V v1 : graph.vertexSet()) {
            if (graph.degreeOf(v1) > 0) {
                vertexEncapsulationMap
                        .put(v1, new RatioVertex<>(vertexCounter++, v1, vertexWeightMap.get(v1)));
            }
        }

        for (E e : graph.edgeSet()) {
            V u = graph.getEdgeSource(e);
            RatioVertex<V> ux = vertexEncapsulationMap.get(u);
            V v = graph.getEdgeTarget(e);
            RatioVertex<V> vx = vertexEncapsulationMap.get(v);
            ux.addNeighbor(vx);
            vx.addNeighbor(ux);

            assert (ux.neighbors.get(vx).equals(
                    vx.neighbors.get(
                            ux))) : " in an undirected graph, if vx is a neighbor of ux, then ux must be a neighbor of vx";
        }

        TreeSet<RatioVertex<V>> workingGraph = new TreeSet<>();
        workingGraph.addAll(vertexEncapsulationMap.values());
//        assert (workingGraph.size() == vertexEncapsulationMap
//            .size()) : "vertices in vertexEncapsulationMap: " + graph.vertexSet().size()
//                + "vertices in working graph: " + workingGraph.size();

        while (!workingGraph.isEmpty()) { // Continue until all edges are covered

            // Find a vertex vx for which W(vx)/degree(vx) is minimal
            RatioVertex<V> vx = workingGraph.pollFirst();
//            assert (workingGraph.stream().allMatch(
//                    ux -> vx.getRatio() <= ux
//                            .getRatio())) : "vx does not have the smallest ratio among all elements. VX: "
//                        + vx + " WorkingGraph: " + workingGraph;

            // Iterate over all the neighbors ux of vx and update ux.W
            double ratio = vx.getRatio();
            for (RatioVertex<V> nx : vx.neighbors.keySet()) {

                if (nx == vx) // Ignore self loops
                    continue;

                workingGraph.remove(nx);
                nx.weight -= ratio * vx.neighbors.get(nx);

                // Delete vx from nx' neighbor list. Delete nx from the graph and place it back,
                // thereby updating the ordering of the graph
                nx.removeNeighbor(vx);

                if (nx.getDegree() > 0)
                    workingGraph.add(nx);

            }

            // Update cover
            cover.add(vx.v);
            weight += vertexWeightMap.get(vx.v);
//            assert (!workingGraph.stream().anyMatch(
//                    ux -> ux.ID == vx.ID)) : "vx should no longer exist in the working graph";
        }
        return new VertexCoverImpl<>(cover, weight);
    }

}
