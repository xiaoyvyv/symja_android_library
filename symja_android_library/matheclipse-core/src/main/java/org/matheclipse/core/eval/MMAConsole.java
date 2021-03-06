package org.matheclipse.core.eval;

import org.matheclipse.core.basic.Config;
import org.matheclipse.core.eval.exception.AbortException;
import org.matheclipse.core.eval.exception.FailedException;
import org.matheclipse.core.eval.exception.ReturnException;
import org.matheclipse.core.eval.exception.Validate;
import org.matheclipse.core.expression.F;
import org.matheclipse.core.form.Documentation;
import org.matheclipse.core.form.output.ASCIIPrettyPrinter3;
import org.matheclipse.core.form.output.OutputFormFactory;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.parser.client.SyntaxError;
import org.matheclipse.parser.client.math.MathException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/**
 * A read-eval-print loop console for Mathematica like syntax input of expressions.
 *
 * See {@link Console}
 */
public class MMAConsole {
	/**
	 * No timeout limit as the default value for Symja expression evaluation.
	 */
	private long fSeconds = -1;

	private final static int OUTPUTFORM = 0;

	private final static int JAVAFORM = 1;

	private final static int TRADITIONALFORM = 2;

	private final static int PRETTYFORM = 3;

	private final static int INPUTFORM = 4;
	private int fUsedForm = OUTPUTFORM;

	private ExprEvaluator fEvaluator;

	private OutputFormFactory fOutputFactory;

	private OutputFormFactory fOutputTraditionalFactory;
	private OutputFormFactory fInputFactory;
	/**
	 * Use pretty printer for expression output n print stream
	 */
	// private boolean fPrettyPrinter;

	// private File fFile;

	private String fDefaultSystemRulesFilename;

	private static int COUNTER = 1;

	/**
	 * See: <a href="https://stackoverflow.com/a/20387039/24819">Printing out unicode from Java code issue in windows
	 * console</a>
	 */
	private static PrintWriter stdout = new PrintWriter(new OutputStreamWriter(System.out, Charset.forName("UTF-8")),
			true);
	/**
	 * See: <a href="https://stackoverflow.com/a/20387039/24819">Printing out unicode from Java code issue in windows
	 * console</a>
	 */
	private static PrintWriter stderr = new PrintWriter(new OutputStreamWriter(System.err, Charset.forName("UTF-8")),
			true);

	public static void runConsole(final String args[], PrintWriter out, PrintWriter err) {
		stdout = out;
		stderr = err;
		main(args);
	}

	public static void main(final String args[]) {

		// distinguish between lower- and uppercase identifiers
		Config.PARSER_USE_LOWERCASE_SYMBOLS = false;
		Config.USE_VISJS = true;
		Config.FILESYSTEM_ENABLED = true;
		F.initSymbols(null, null, true);
		MMAConsole console;
		try {
			console = new MMAConsole();
		} catch (final SyntaxError e1) {
			e1.printStackTrace();
			return;
		}
		String trimmedInput = null;
		try {
			console.setArgs(args);
		} catch (ReturnException re) {
			return;
		}

		// final File file = console.getFile();
		// if (file != null) {
		// try {
		// final BufferedReader f = new BufferedReader(new FileReader(file));
		// final StringBuilder buff = new StringBuilder(1024);
		// String line;
		// while ((line = f.readLine()) != null) {
		// buff.append(line);
		// buff.append('\n');
		// }
		// f.close();
		// inputExpression = buff.toString();
		// outputExpression = console.interpreter(inputExpression);
		// stdout.println("In [" + COUNTER + "]: " + inputExpression);
		// if (outputExpression.length() > 0) {
		// stdout.println("Out[" + COUNTER + "]: " + outputExpression);
		// }
		// COUNTER++;
		// } catch (final IOException ioe) {
		// final String msg = "Cannot read from the specified file. "
		// + "Make sure the path exists and you have read permission.";
		// stdout.println(msg);
		// return;
		// }
		// }

		while (true) {
			try {
				String inputExpression = console.readString(stdout, ">> ");
				if (inputExpression != null) {
					trimmedInput = inputExpression.trim();
					if (trimmedInput.length() >= 4 && trimmedInput.charAt(0) == '/') {
						String command = trimmedInput.substring(1).toLowerCase(Locale.ENGLISH);
						if (command.equals("exit")) {
							stdout.println("Closing Symja console... bye.");
						System.exit(0);
						} else if (command.equals("java")) {
							stdout.println("Enabling output for JavaForm");
							console.fUsedForm = JAVAFORM;
							continue;
						} else if (command.equals("traditional")) {
							stdout.println("Enabling output for TraditionalForm");
							console.fUsedForm = TRADITIONALFORM;
							continue;
						} else if (command.equals("output")) {
							stdout.println("Enabling output for OutputForm");
							console.fUsedForm = OUTPUTFORM;
						continue;
						} else if (command.equals("pretty")) {
							stdout.println("Enabling output for PrettyPrinterForm");
							console.fUsedForm = PRETTYFORM;
						continue;
						} else if (command.equals("input")) {
							stdout.println("Enabling output for InputForm");
							console.fUsedForm = INPUTFORM;
							continue;
						} else if (command.equals("timeoutoff")) {
							stdout.println("Disabling timeout for evaluation");
						console.fSeconds = -1;
						continue;
						} else if (command.equals("timeouton")) {
							stdout.println("Enabling timeout for evaluation to 60 seconds.");
						console.fSeconds = 60;
						continue;
						}
					}

					// if (trimmedInput.length() > 1 && trimmedInput.charAt(0) == '?') {
					// IAST list = Names.getNamesByPrefix(trimmedInput.substring(1));
					// for (int i = 1; i < list.size(); i++) {
					// stdout.print(list.get(i).toString());
					// if (i != list.argSize()) {
					// stdout.print(", ");
					// }
					// }
					// stdout.println();
					// if (list.size() == 2) {
					// printDocumentation(list.get(1).toString());
					// }
					// continue;
					// }
					// console.interpreter(trimmedInput);
					stdout.println("In [" + COUNTER + "]: " + trimmedInput);
					stdout.flush();
					// if (outputExpression.length() > 0) {
					// stdout.println("Out[" + COUNTER + "]: " + outputExpression);
					// }
					// if (console.fPrettyPrinter) {
					// console.prettyPrinter(trimmedInput);
					// } else {
						console.resultPrinter(trimmedInput);
					// }
					COUNTER++;
				}
				// } catch (final MathRuntimeException mre) {
				// Throwable me = mre.getCause();
				// stdout.println(me.getMessage());
			} catch (final Exception e) {
				stderr.println(e.getMessage());
				stderr.flush();
			}
		}
	}

	private String resultPrinter(String trimmedInput) {
		String outputExpression = interpreter(trimmedInput);
		if (outputExpression.length() > 0) {
			stdout.println("Out[" + COUNTER + "]: " + outputExpression);
			stdout.flush();
		}
		return outputExpression;
	}


	/**
	 * Prints the usage of how to use this class to stdout
	 */
	private static void printUsage() {
		final String lineSeparator = System.getProperty("line.separator");
		final StringBuilder msg = new StringBuilder();
		msg.append(Config.SYMJA);
		msg.append("org.matheclipse.core.eval.MMAConsole [options]" + lineSeparator);
		msg.append(lineSeparator);
		msg.append("Program arguments: " + lineSeparator);
		msg.append("  -h or -help                                 print usage messages" + lineSeparator);
		msg.append("  -c or -code <command>                       run the command" + lineSeparator);
		msg.append("  -f or -function <function> -args arg1 arg2  run the function" + lineSeparator);
		// msg.append(" -file <filename> use given file as input script" + lineSeparator);
		msg.append("  -d or -default <filename>                   use given textfile for an initial package script"
				+ lineSeparator);
		// msg.append(" -pp enable pretty printer" + lineSeparator);

		msg.append("To stop the program type: /exit<RETURN>" + lineSeparator);
		msg.append("To continue an input line type: \\<RETURN>" + lineSeparator);
		msg.append("at the end of the line." + lineSeparator);
		msg.append("To disable the evaluation timeout type: /timeoutoff<RETURN>" + lineSeparator);
		msg.append("To enable the evaluation timeout type: /timeouton<RETURN>" + lineSeparator);
		msg.append("To enable the output in Java form: /java<RETURN>" + lineSeparator);
		msg.append("To enable the output in standard form: /output<RETURN>" + lineSeparator);
		msg.append("To enable the output in standard form: /traditional<RETURN>" + lineSeparator);
		msg.append("****+****+****+****+****+****+****+****+****+****+****+****+");

		stdout.println(msg.toString());
		stdout.flush();
	}

	// private String[] prettyPrinter3Lines(final String inputExpression) {
	// IExpr result;
	//

	// final StringWriter buf = new StringWriter();
	// try {
	// if (fSeconds <= 0) {
	// result = fEvaluator.eval(inputExpression);
	// } else {
	// result = fEvaluator.evaluateWithTimeout(inputExpression, fSeconds, TimeUnit.SECONDS, true,
	// new EvalCallable(fEvaluator.getEvalEngine()));
	// }
	// if (result != null) {
	// if (result.equals(F.Null)) {
	// return null;
	// }
	// ASCIIPrettyPrinter3 strBuffer = new ASCIIPrettyPrinter3();
	// strBuffer.convert(result);
	// return strBuffer.toStringBuilder();
	// }
	// } catch (final SyntaxError se) {
	// String msg = se.getMessage();
	// stderr.println();
	// stderr.println(msg);
	// return null;
	// } catch (final RuntimeException re) {
	// Throwable me = re.getCause();
	// if (me instanceof MathException) {
	// Validate.printException(buf, me);
	// } else {
	// Validate.printException(buf, re);
	// }
	// return null;
	// } catch (final Exception e) {
	// Validate.printException(buf, e);
	// return null;
	// } catch (final OutOfMemoryError e) {
	// Validate.printException(buf, e);
	// return null;
	// } catch (final StackOverflowError e) {
	// Validate.printException(buf, e);
	// return null;
	// }
	// String[] strArray = new String[3];
	// strArray[0] = "";
	// strArray[1] = buf.toString();
	// strArray[2] = "";
	// return strArray;
	// }

	/**
	 * Create a console which appends each evaluation output in a history list.
	 */
	public MMAConsole() {
		EvalEngine engine = new EvalEngine(false);
		fEvaluator = new ExprEvaluator(engine, false, 100);
		EvalEngine evalEngine = fEvaluator.getEvalEngine();
		evalEngine.setFileSystemEnabled(true);
		fOutputFactory = OutputFormFactory.get(false, false, 5, 7);
		fOutputTraditionalFactory = OutputFormFactory.get(true, false, 5, 7);
		fInputFactory = OutputFormFactory.get(false, false, 5, 7);
		fInputFactory.setQuotes(true);
		// F.$PreRead.assign(//
		// F.Function(F.ReplaceAll(F.Unevaluated(F.Slot1), //
		// F.List(F.RuleDelayed(F.binaryAST2(F.Plot, F.x_, F.y_), F.Manipulate(F.binaryAST2(F.Plot, F.x, F.y))), //
		// F.RuleDelayed(F.ternaryAST3(F.Plot3D, F.x_, F.y_, F.z_), F.Manipulate(F.ternaryAST3(F.Plot3D, F.x, F.y,
		// F.z))//
		// )))));
	}

	/**
	 * Sets the arguments for the <code>main</code> method
	 *
	 * @param args
	 *            the arguments of the program
	 */
	private void setArgs(final String args[]) {
		String function = null;
		for (int i = 0; i < args.length; i++) {
			final String arg = args[i];

			if (arg.equals("-code") || arg.equals("-c")) {
				if (i + 1 >= args.length) {
					final String msg = "You must specify an additional command when using the -code argument";
					stdout.println(msg);
					throw ReturnException.RETURN_FALSE;
				}
				String outputExpression = interpreter(args[i + 1].trim());
					if (outputExpression.length() > 0) {
						stdout.print(outputExpression);
					}
					throw ReturnException.RETURN_TRUE;
			} else if (arg.equals("-function") || arg.equals("-f")) {
				if (i + 1 >= args.length) {
					final String msg = "You must specify a function when using the -function argument";
					stdout.println(msg);
					throw ReturnException.RETURN_FALSE;
				}
					function = args[i + 1];
					i++;
			} else if (arg.equals("-args") || arg.equals("-a")) {
				try {
					if (function != null) {
						StringBuilder inputExpression = new StringBuilder(1024);
						inputExpression.append(function);
						inputExpression.append("[");
						for (int j = i + 1; j < args.length; j++) {
							if (j != i + 1) {
								inputExpression.append(", ");
							}
							inputExpression.append(args[j]);
						}
						inputExpression.append("]");
						String outputExpression = interpreter(inputExpression.toString());
						if (outputExpression.length() > 0) {
							stdout.print(outputExpression);
						}
						throw ReturnException.RETURN_TRUE;
					}
					return;
				} catch (final ArrayIndexOutOfBoundsException aioobe) {
					final String msg = "You must specify a function when " + "using the -function argument";
					stdout.println(msg);
					throw ReturnException.RETURN_FALSE;
				}
			} else if (arg.equals("-help") || arg.equals("-h")) {
				printUsage();
				return;
				// } else if (arg.equals("-debug")) {
				// Config.DEBUG = true;
				// } else if (arg.equals("-file")) {
				// try {
				//// fFile = new File(args[i + 1]);
				// fEvaluator.eval(F.Get(args[i + 1]));
				// i++;
				// } catch (final ArrayIndexOutOfBoundsException aioobe) {
				// final String msg = "You must specify a file when " + "using the -file argument";
				// stdout.println(msg);
				// return;
				// }
			} else if (arg.equals("-default") || arg.equals("-d")) {
				if (i + 1 >= args.length) {
					final String msg = "You must specify a file when using the -d argument";
					stdout.println(msg);
					throw ReturnException.RETURN_FALSE;
				}
					fDefaultSystemRulesFilename = args[i + 1];
					fEvaluator.eval(F.Get(args[i + 1]));
					i++;

				// } else if (arg.equals("-pp")) {
				// fPrettyPrinter = true;
			} else if (arg.charAt(0) == '-') {
				// we don't have any more args to recognize!
				final String msg = "Unknown arg: " + arg;
				stdout.println(msg);
				printUsage();
				return;
			}

		}
		printUsage();
	}

	/**
	 * Evaluates the given string-expression and returns the result in <code>OutputForm</code>
	 *
	 * @param trimmedInput
	 *            a trimmed input string
	 * @return
	 */
	/* package private */ String interpreter(final String trimmedInput) {
		IExpr result;
		final StringWriter buf = new StringWriter();
		try {
			if (trimmedInput.length() > 1 && trimmedInput.charAt(0) == '?') {
				IExpr doc = Documentation.findDocumentation(trimmedInput);
				return printResult(doc);
			}
			if (fSeconds <= 0) {
				result = fEvaluator.eval(trimmedInput);
			} else {
				result = fEvaluator.evaluateWithTimeout(trimmedInput, fSeconds, TimeUnit.SECONDS, true,
						new EvalControlledCallable(fEvaluator.getEvalEngine()));
			}
			if (result != null) {
				return printResult(result);
			}
		} catch (final AbortException re) {
			try {
				return printResult(F.$Aborted);
			} catch (IOException e) {
				Validate.printException(buf, e);
				stderr.println(buf.toString());
				stderr.flush();
				return "";
			}
		} catch (final FailedException re) {
			try {
				return printResult(F.$Failed);
			} catch (IOException e) {
				Validate.printException(buf, e);
				stderr.println(buf.toString());
				stderr.flush();
				return "";
			}
		} catch (final SyntaxError se) {
			String msg = se.getMessage();
			stderr.println(msg);
			stderr.println();
			stderr.flush();
			return "";
		} catch (final RuntimeException re) {
			Throwable me = re.getCause();
			if (me instanceof MathException) {
				Validate.printException(buf, me);
			} else {
				Validate.printException(buf, re);
			}
			stderr.println(buf.toString());
			stderr.flush();
			return "";
		} catch (final Exception e) {
			Validate.printException(buf, e);
			stderr.println(buf.toString());
			stderr.flush();
			return "";
		} catch (final OutOfMemoryError e) {
			Validate.printException(buf, e);
			stderr.println(buf.toString());
			stderr.flush();
			return "";
		} catch (final StackOverflowError e) {
			Validate.printException(buf, e);
			stderr.println(buf.toString());
			stderr.flush();
			return "";
		}
		return buf.toString();
	}

	/**
	 * prints a prompt on the console but doesn't print a newline
	 *
	 * @param out
	 * @param prompt
	 *            the prompt string to display
	 *
	 */

	private void printPrompt(final PrintWriter out, final String prompt) {
		out.print(prompt);
		out.flush();
	}

	private String printResult(IExpr result) throws IOException {
		EvalEngine engine = fEvaluator.getEvalEngine();
		EvalEngine.set(engine);
		try {
			engine.reset();
		if (result.equals(F.Null)) {
			return "";
		}
		switch (fUsedForm) {
		case JAVAFORM:
			return result.internalJavaString(false, -1, false, true, false);
		case TRADITIONALFORM:
			StringBuilder traditionalBuffer = new StringBuilder();
			fOutputTraditionalFactory.reset();
				if (fOutputTraditionalFactory.convert(traditionalBuffer, result)) {
			return traditionalBuffer.toString();
				} else {
					return "ERROR-IN-TRADITIONALFORM";
				}
		case PRETTYFORM:
			ASCIIPrettyPrinter3 prettyBuffer = new ASCIIPrettyPrinter3();
			prettyBuffer.convert(result);
				stdout.println();
			String[] outputExpression = prettyBuffer.toStringBuilder();
				ASCIIPrettyPrinter3.prettyPrinter(stdout, outputExpression, "Out[" + COUNTER + "]: ");
			return "";
		case INPUTFORM:
			StringBuilder inputBuffer = new StringBuilder();
			fInputFactory.reset();
				if (fInputFactory.convert(inputBuffer, result)) {
			return inputBuffer.toString();
				} else {
					return "ERROR-IN-INPUTFORM";
				}
			default:
//				if (Desktop.isDesktopSupported()) {
//					IExpr outExpr = result;
//					if (result.isAST(F.Graphics)) {// || result.isAST(F.Graphics3D)) {
//						outExpr = F.Show(outExpr);
//					}
//					String html = F.show(outExpr);
//					if (html != null) {
//						return html;
//					}
//				}

				StringBuilder strBuffer = new StringBuilder();
				fOutputFactory.reset();
				if (fOutputFactory.convert(strBuffer, result)) {
					return strBuffer.toString();
				} else {
					return "ERROR-IN-OUTPUTFORM";
				}
		}
		} finally {
		}
	}

	/**
	 * read a string from the console. The string is terminated by a newline
	 *
	 * @param out
	 *            Description of Parameter
	 * @return the input string (without the newline)
	 */

	private String readString(final PrintWriter out) {
		final StringBuilder input = new StringBuilder();
		//Android Changed: Java 7 doesn't have UTF-8 field, use Charset.forName instead
		final BufferedReader in = new BufferedReader(new InputStreamReader(System.in, Charset.forName("UTF-8")));
		boolean done = false;

		try {
			while (!done) {
				final String s = in.readLine();
				if (s != null) {
					if (s.trim().length()==0) {
						done = true;
						break;
					}
					if ((s.length() > 0) && (s.charAt(s.length() - 1) != '\\')) {
						input.append(s);
						if (org.matheclipse.parser.client.Scanner.isBalancedCode(input)) {
						done = true;
						}
					} else {
						if (s.length() > 1) {
							input.append(s.substring(0, s.length() - 1));
						} else {
							input.append(' ');
						}
					}
				}
			}
		} catch (final IOException e1) {
			e1.printStackTrace();
		}
		return input.toString();
	}

	/**
	 * read a string from the console. The string is terminated by a newline
	 *
	 * @param prompt
	 *            the prompt string to display
	 * @param out
	 *            Description of Parameter
	 * @return the input string (without the newline)
	 */

	private String readString(final PrintWriter out, final String prompt) {
		printPrompt(out, prompt);
		return readString(out);
	}


	/**
	 * Get the default rules textfile name, which should be loaded at startup. This file replaces the default built-in
	 * System.mep resource stream.
	 *
	 * @return default rules textfile name
	 */
	private String getDefaultSystemRulesFilename() {
		return fDefaultSystemRulesFilename;
	}
}