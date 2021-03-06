/*
 * (C) Copyright 2018-2018, by Dimitrios Michail and Contributors.
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
package org.jgrapht.graph;

import org.jgrapht.Graph;
import org.jgrapht.GraphType;
import org.jgrapht.alg.util.Pair;
import org.jgrapht.graph.specifics.ArrayUnenforcedSetEdgeSetFactory;
import org.jgrapht.graph.specifics.DirectedEdgeContainer;
import org.jgrapht.graph.specifics.FastLookupDirectedSpecifics;
import org.jgrapht.graph.specifics.FastLookupUndirectedSpecifics;
import org.jgrapht.graph.specifics.Specifics;
import org.jgrapht.graph.specifics.UndirectedEdgeContainer;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import com.duy.lambda.BiFunction;
import com.duy.lambda.Function;

/**
 * The fast lookup specifics strategy implementation.
 *
 * <p>
 * Graphs constructed using this strategy use additional data structures to improve the performance
 * of methods which depend on edge retrievals, e.g. getEdge(V u, V v), containsEdge(V u, V
 * v),addEdge(V u, V v). A disadvantage is an increase in memory consumption. If memory utilization
 * is an issue, use the {@link DefaultGraphSpecificsStrategy} instead.
 *
 * @param <V> the graph vertex type
 * @param <E> the graph edge type
 * @author Dimitrios Michail
 */
public class FastLookupGraphSpecificsStrategy<V, E>
        implements
        GraphSpecificsStrategy<V, E> {
    private static final long serialVersionUID = -5490869870275054280L;

    @Override
    public Function<GraphType, IntrusiveEdgesSpecifics<V, E>> getIntrusiveEdgesSpecificsFactory() {
        return new Function<GraphType, IntrusiveEdgesSpecifics<V, E>>() {
            @Override
            public IntrusiveEdgesSpecifics<V, E> apply(GraphType type) {
                if (type.isWeighted()) {
                    return new WeightedIntrusiveEdgesSpecifics<V, E>(new LinkedHashMap<E, IntrusiveWeightedEdge>());
                } else {
                    return new UniformIntrusiveEdgesSpecifics<>(new LinkedHashMap<E, IntrusiveEdge>());
                }
            }
        };
    }

    @Override
    public BiFunction<Graph<V, E>, GraphType, Specifics<V, E>> getSpecificsFactory() {
        return new BiFunction<Graph<V, E>, GraphType, Specifics<V, E>>() {
            @Override
            public Specifics<V, E> apply(Graph<V, E> graph, GraphType type) {
                if (type.isDirected()) {
                    return new FastLookupDirectedSpecifics<>(
                            graph, new LinkedHashMap<V, DirectedEdgeContainer<V, E>>(), new HashMap<Pair<V, V>, Set<E>>(), FastLookupGraphSpecificsStrategy.this.getEdgeSetFactory());
                } else {
                    return new FastLookupUndirectedSpecifics<>(
                            graph, new LinkedHashMap<V, UndirectedEdgeContainer<V, E>>(), new HashMap<Pair<V, V>, Set<E>>(), FastLookupGraphSpecificsStrategy.this.getEdgeSetFactory());
                }
            }
        };
    }

    @Override
    public EdgeSetFactory<V, E> getEdgeSetFactory() {
        return new ArrayUnenforcedSetEdgeSetFactory<>();
    }

}
