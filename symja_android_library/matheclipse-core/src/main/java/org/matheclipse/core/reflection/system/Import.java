package org.matheclipse.core.reflection.system;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.io.ImportException;
import org.matheclipse.core.basic.Config;
import org.matheclipse.core.builtin.IOFunctions;
import org.matheclipse.core.convert.AST2Expr;
import org.matheclipse.core.eval.EvalEngine;
import org.matheclipse.core.eval.interfaces.AbstractEvaluator;
import org.matheclipse.core.expression.F;
import org.matheclipse.core.expression.WL;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IASTAppendable;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.interfaces.IStringX;
import org.matheclipse.core.io.Extension;
import org.matheclipse.parser.client.Parser;
import org.matheclipse.parser.client.SyntaxError;
import org.matheclipse.parser.client.ast.ASTNode;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.Charset;

/**
 * Import some data from file system.
 *
 */
public class Import extends AbstractEvaluator {

	public Import() {
	}

	@Override
	public IExpr evaluate(final IAST ast, EvalEngine engine) {
		if (Config.isFileSystemEnabled(engine)) {
			if (!(ast.arg1() instanceof IStringX)) {
				return F.NIL;
			}

            IStringX arg1 = (IStringX) ast.arg1();
            Extension format = Extension.importFilename(arg1.toString());
            String fileName = arg1.toString();
            if (ast.size() > 2) {
                if (!(ast.arg2() instanceof IStringX)) {
					return F.NIL;
                }
                format = Extension.importExtension(((IStringX) ast.arg2()).toString());
            }
            FileReader reader = null;

            try {

                File file = new File(fileName);
                switch (format) {
                    case DOT:
                    case GRAPHML:
                        // graph Format
                        reader = new FileReader(fileName);
                        return graphImport(reader, format, engine);

                    case TABLE:
                        reader = new FileReader(fileName);
                        AST2Expr ast2Expr = new AST2Expr(engine.isRelaxedSyntax(), engine);
                        final Parser parser = new Parser(engine.isRelaxedSyntax(), true);

                        CSVFormat csvFormat = CSVFormat.RFC4180.withDelimiter(' ');
                        Iterable<CSVRecord> records = csvFormat.parse(reader);
                        IASTAppendable rowList = F.ListAlloc(256);
                        for (CSVRecord record : records) {
                            IASTAppendable columnList = F.ListAlloc(record.size());
                            for (String string : record) {
                                final ASTNode node = parser.parse(string);
                                IExpr temp = ast2Expr.convert(node);
                                columnList.append(temp);
                            }
                            rowList.append(columnList);
                        }
                        return rowList;
                    case STRING:
                        return of(file, engine);
                    case WXF:
					byte[] byteArray = com.gx.common.io.Files.toByteArray(file);
					return WL.deserialize(byteArray);
                    default:
                }

            } catch (IOException ioe) {
                return engine.printMessage("Import: file " + fileName + " not found!");
            } catch (SyntaxError se) {
                return engine.printMessage("Import: file " + fileName + " syntax error!");
            } catch (Exception ex) {
                return engine.printMessage("Import: file " + fileName + " - " + ex.getMessage());
            } finally {
                if (reader != null) {
                    try {
                        reader.close();
                    } catch (IOException e) {
                    }
                }
            }
        }
        return F.NIL;
    }

    public int[] expectedArgSize() {
        return IOFunctions.ARGS_1_2;
    }

	public static IExpr of(File file, EvalEngine engine) throws IOException {
		String filename = file.getName();
		Extension extension = Extension.importFilename(filename);
		// Extension extension = filename.extension();
		if (extension.equals(Extension.JPG) || extension.equals(Extension.PNG)) {
			// if (filename.hasExtension("jpg") || filename.hasExtension("png")) {
//			return ImageFormat.from(ImageIO.read(file));
            throw new UnsupportedOperationException();
		}

		AST2Expr ast2Expr = new AST2Expr(engine.isRelaxedSyntax(), engine);
		final Parser parser = new Parser(engine.isRelaxedSyntax(), true);
		String str = com.gx.common.io.Files.asCharSource(file, Charset.defaultCharset()).read();
		final ASTNode node = parser.parse(str);
		return ast2Expr.convert(node);
	}

//	private GraphMLImporter<IExpr, DefaultEdge> createGraphImporter(final Graph<IExpr, DefaultEdge> g,
//                                                                    final Map<String, Map<String, Attribute>> vertexAttributes,
//                                                                    final Map<DefaultEdge, Map<String, Attribute>> edgeAttributes, final EvalEngine engine) {
//		return createGraphImporter(g, new VertexProvider<IExpr>() {
//            @Override
//            public IExpr buildVertex(String label, Map<String, Attribute> attributes) {
//                vertexAttributes.put(label, attributes);
//                return engine.parse(label);
//            }
//        }, new EdgeProvider<IExpr, DefaultEdge>() {
//            @Override
//            public DefaultEdge buildEdge(IExpr from, IExpr to, String label, Map<String, Attribute> attributes) {
//                DefaultEdge e = g.getEdgeSupplier().get();
//                edgeAttributes.put(e, attributes);
//                return e;
//            }
//        });
//	}

//	private GraphMLImporter<IExpr, DefaultEdge> createGraphImporter(Graph<IExpr, DefaultEdge> g,
//			VertexProvider<IExpr> vp, EdgeProvider<IExpr, DefaultEdge> ep) {
//		return new GraphMLImporter<IExpr, DefaultEdge>(vp, ep);
//	}

	private IExpr graphImport(Reader reader, Extension format, final EvalEngine engine) throws ImportException {
		Graph<IExpr, DefaultEdge> result;
		switch (format) {
		case DOT:
//			DOTImporter<IExpr, DefaultEdge> dotImporter = new DOTImporter<IExpr, DefaultEdge>(
//                    new VertexProvider<IExpr>() {
//                        @Override
//                        public IExpr buildVertex(String label, Map<String, Attribute> attributes) {
//                            return engine.parse(label);
//                        }
//                    }, new EdgeProvider<IExpr, DefaultEdge>() {
//                @Override
//                public DefaultEdge buildEdge(IExpr from, IExpr to, String label, Map<String, Attribute> attributes) {
//                    return new DefaultEdge();
//                }
//            });
//
//			result = new DefaultDirectedGraph<IExpr, DefaultEdge>(DefaultEdge.class);
//			dotImporter.importGraph(result, reader);
//			return GraphExpr.newInstance(result);
            throw new UnsupportedOperationException("DOTImporter");
		case GRAPHML:
//			result = new DefaultDirectedGraph<IExpr, DefaultEdge>(DefaultEdge.class);
//			Map<String, Map<String, Attribute>> vertexAttributes = new HashMap<>();
//			Map<DefaultEdge, Map<String, Attribute>> edgeAttributes = new HashMap<DefaultEdge, Map<String, Attribute>>();
//			GraphMLImporter<IExpr, DefaultEdge> graphmlImporter = createGraphImporter(result, vertexAttributes,
//					edgeAttributes, engine);
//			graphmlImporter.importGraph(result, reader);
//			return GraphExpr.newInstance(result);
            throw new UnsupportedOperationException("GraphMLImporter");
		default:
		}
        return F.NIL;
    }
}
