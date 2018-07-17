package org.matheclipse.core.expression;

import com.duy.lambda.Consumer;

import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IASTAppendable;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.interfaces.ISymbol;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectStreamException;
import java.util.StringTokenizer;

/**
 * <p>
 * (A)bstract (S)yntax (T)ree of a given function.
 * </p>
 * 
 * <p>
 * In Symja, an abstract syntax tree (AST), is a tree representation of the abstract syntactic structure of the Symja
 * source code. Each node of the tree denotes a construct occurring in the source code. The syntax is 'abstract' in the
 * sense that it does not represent every detail that appears in the real syntax. For instance, grouping parentheses are
 * implicit in the tree structure, and a syntactic construct such as a <code>Sin[x]</code> expression will be denoted by
 * an AST with 2 nodes. One node for the header <code>Sin</code> and one node for the argument <code>x</code>.
 * </p>
 * 
 * Internally an AST is represented as a list which contains
 * <ul>
 * <li>the operator of a function (i.e. the &quot;header&quot;-symbol: Sin, Cos, Inverse, Plus, Times,...) at index
 * <code>0</code> and</li>
 * <li>the <code>n</code> arguments of a function in the index <code>1 to n</code></li>
 * </ul>
 * 
 * <p>
 * See: <a href="http://en.wikipedia.org/wiki/Abstract_syntax_tree">Wikipedia: Abstract syntax tree</a>.
 * </p>
 */
public class AST extends HMArrayList implements Externalizable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4295200630292148027L;

	public static AST newInstance(final IExpr head) {
		AST ast = new AST(5, false);
		ast.append(head);
		return ast;
	}

	protected static AST newInstance(final int intialCapacity, final IAST ast, int endPosition) {
		AST result = new AST(intialCapacity, false);
		result.appendAll(ast, 0, endPosition);
		return result;
	}

	/**
	 * 
	 * @param intialCapacity
	 *            the initial capacity (i.e. number of arguments without the header element) of the list.
	 * @param head
	 * @return
	 */
	public static AST newInstance(final int intialCapacity, final IExpr head) {
		AST ast = new AST(intialCapacity + 1, false);
		ast.append(head);
		return ast;
	}

	public static AST newInstance(final ISymbol symbol, boolean evalComplex,
			final org.hipparchus.complex.Complex... arr) {
		IExpr[] eArr = new IExpr[arr.length + 1];
		eArr[0] = symbol;
		if (evalComplex) {
			double im;
			for (int i = 1; i <= arr.length; i++) {
				im = arr[i - 1].getImaginary();
				if (F.isZero(im)) {
					eArr[i] = Num.valueOf(arr[i - 1].getReal());
				} else {
					eArr[i] = ComplexNum.valueOf(arr[i - 1].getReal(), arr[i - 1].getImaginary());
				}
			}
		} else {
			for (int i = 1; i <= arr.length; i++) {
				eArr[i] = ComplexNum.valueOf(arr[i - 1].getReal(), arr[i - 1].getImaginary());
			}
		}
		return new AST(eArr);
	}

	/**
	 * Constructs a list with header <i>symbol</i> and the arguments containing the given DoubleImpl values.
	 * 
	 * @param symbol
	 * @param arr
	 * @return
	 */
	public static AST newInstance(final ISymbol symbol, final double... arr) {
		IExpr[] eArr = new IExpr[arr.length + 1];
		eArr[0] = symbol;
		for (int i = 1; i <= arr.length; i++) {
			eArr[i] = Num.valueOf(arr[i - 1]);
		}
		return new AST(eArr);
	}

	/**
	 * Constructs a list with header <i>symbol</i> and the arguments containing the given DoubleImpl matrix values as
	 * <i>List</i> rows
	 * 
	 * @param symbol
	 * @param matrix
	 * @return
	 * @see Num
	 */
	public static AST newInstance(final ISymbol symbol, final double[][] matrix) {
		IExpr[] eArr = new IExpr[matrix.length + 1];
		eArr[0] = symbol;
		for (int i = 1; i <= matrix.length; i++) {
			eArr[i] = newInstance(F.List, matrix[i - 1]);
		}
		return new AST(eArr);
	}

	public static AST newInstance(final ISymbol symbol, final int... arr) {
		IExpr[] eArr = new IExpr[arr.length + 1];
		eArr[0] = symbol;
		for (int i = 1; i <= arr.length; i++) {
			eArr[i] = AbstractIntegerSym.valueOf(arr[i - 1]);
		}
		return new AST(eArr);
	}

	/**
	 * simple parser to simplify unit tests. The parser assumes that the String contains no syntax errors.
	 * 
	 * Example &quot;List[x,List[y]]&quot;
	 * 
	 * @param inputString
	 * @return
	 */
	public static IAST parse(final String inputString) {
		final StringTokenizer tokenizer = new StringTokenizer(inputString, "[],", true);
		String token = tokenizer.nextToken();
		final IASTAppendable list = newInstance(StringX.valueOf(token));
		token = tokenizer.nextToken();
		if ("[".equals(token)) {
			parseList(tokenizer, list);
			return list;
		}
		// syntax fError occured
		return null;

	}

	private static void parseList(final StringTokenizer tokenizer, final IASTAppendable list) {
		String token = tokenizer.nextToken();
		do {
			if ("]".equals(token)) {
				return;
			} else if (" ".equals(token)) {
				// ignore spaces
			} else {
				String arg;
				if (",".equals(token)) {
					arg = tokenizer.nextToken();
				} else {
					arg = token;
				}
				token = tokenizer.nextToken();
				if ("[".equals(token)) {
					IASTAppendable argList = newInstance(StringX.valueOf(arg));
					parseList(tokenizer, argList);
					list.append(argList);
				} else {
					list.append(StringX.valueOf(arg));
					continue;
				}
			}
			token = tokenizer.nextToken();
		} while (tokenizer.hasMoreTokens());
	}


	/**
	 * Public no-arg constructor only needed for serialization
	 * 
	 */
	public AST() {
		super(0);
	}

	public AST(IExpr head, IExpr... es) {
		super(head, es);
	}

	/**
	 * Package private constructor.
	 * 
	 * @param es
	 */
	AST(IExpr[] es) {
		super(es);
	}

	/**
	 * Constructs an empty list with the specified initial capacity.
	 * 
	 * @param initialCapacity
	 *            the initial capacity (i.e. number of arguments without the header element) of the list.
	 * @param setLength
	 *            if <code>true</code>, sets the array's size to initialCapacity.
	 */
	protected AST(final int initialCapacity, final boolean setLength) {
		super(initialCapacity + 1);
		lastIndex += (setLength ? initialCapacity + 1 : 0);
	}

	/** {@inheritDoc} */
	@Override
	public IAST appendOneIdentity(IAST value) {
		if (value.isAST1()) {
			append(value.arg1());
		} else {
			append(value);
		}
		return this;
	}

	/**
	 * Returns a shallow copy of this <tt>AST</tt> instance. (The elements themselves are not copied.)
	 * 
	 * @return a clone of this <tt>AST</tt> instance.
	 */
	@Override
	public IAST clone() {
		AST ast = new AST();
		// ast.fProperties = null;
		ast.array = array.clone();
		ast.hashValue = 0;
		ast.firstIndex = firstIndex;
		ast.lastIndex = lastIndex;
		return ast;
	}

	@Override
	public IASTAppendable copyAppendable() {
		AST ast = new AST();
		// ast.fProperties = null;
		ast.array = array.clone();
		ast.hashValue = 0;
		ast.firstIndex = firstIndex;
		ast.lastIndex = lastIndex;
		return ast;
	}


	@Override
	public int hashCode() {
		if (hashValue == 0) {
			hashValue = 0x811c9dc5;// decimal 2166136261;
			for (int i = firstIndex; i < lastIndex; i++) {
				hashValue = (hashValue * 16777619) ^ (array[i].hashCode() & 0xff);
			}
		}
		return hashValue;
	}

	public IAST removeFromEnd(int fromPosition) {
		if (0 < fromPosition && fromPosition <= size()) {
			if (fromPosition == size()) {
				return this;
		}
			AST ast = new AST(array);
			ast.firstIndex = firstIndex;
			ast.lastIndex = firstIndex + fromPosition;
			return ast;
		} else {
			throw new IndexOutOfBoundsException(
					"Index: " + Integer.valueOf(fromPosition) + ", Size: " + Integer.valueOf(lastIndex - firstIndex));
		}
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
		this.fEvalFlags = objectInput.readShort();

		int size;
		byte attributeFlags = objectInput.readByte();
		if (attributeFlags != 0) {
			size = attributeFlags;
			IExpr[] array = new IExpr[size];
			init(array);
			int exprIDSize = objectInput.readByte();
			for (int i = 0; i < exprIDSize; i++) {
				this.array[i] = F.GLOBAL_IDS[objectInput.readShort()];
			}
			for (int i = exprIDSize; i < size; i++) {
				this.array[i] = (IExpr) objectInput.readObject();
			}
			return;
		}

		size = objectInput.readInt();
		IExpr[] array = new IExpr[size];
		init(array);
		for (int i = 0; i < size; i++) {
			this.array[i] = (IExpr) objectInput.readObject();
		}
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeShort(fEvalFlags);

		int size = size();
		byte attributeFlags = (byte) 0;
		if (size > 0 && size < 128) {
			ExprID temp = F.GLOBAL_IDS_MAP.get(head());
			if (temp != null) {

				short exprID = temp.getExprID();
				if (exprID <= Short.MAX_VALUE) {
					int exprIDSize = 1;
					short[] exprIDArray = new short[size];
					exprIDArray[0] = exprID;
					for (int i = 1; i < size; i++) {
						temp = F.GLOBAL_IDS_MAP.get(get(i));
						if (temp == null) {
							break;
						}
						exprID = temp.getExprID();
						if (exprID <= Short.MAX_VALUE) {
							exprIDArray[i] = exprID;
							exprIDSize++;
						} else {
							break;
						}
					}
					// optimized path
					attributeFlags = (byte) size;
					objectOutput.writeByte(attributeFlags);
					objectOutput.writeByte((byte) exprIDSize);
					for (int i = 0; i < exprIDSize; i++) {
						objectOutput.writeShort(exprIDArray[i]);
					}
					for (int i = exprIDSize; i < size; i++) {
						objectOutput.writeObject(get(i));
					}
					return;
				}
			}
		}

		objectOutput.writeByte(attributeFlags);
		objectOutput.writeInt(size);
		for (int i = 0; i < size; i++) {
			objectOutput.writeObject(get(i));
		}
	}

	private Object writeReplace() throws ObjectStreamException {
		return optional(F.GLOBAL_IDS_MAP.get(this));
	}

	@Override
	public void ifAppendable(Consumer<? super IASTAppendable> consumer) {
		consumer.accept(this);
	}
}