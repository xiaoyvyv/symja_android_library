package org.matheclipse.core.visit;

import com.duy.lambda.Function;
import com.duy.lambda.ObjIntConsumer;
import com.duy.lambda.Predicate;

import org.matheclipse.core.expression.F;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IASTMutable;
import org.matheclipse.core.interfaces.IComplex;
import org.matheclipse.core.interfaces.IComplexNum;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.interfaces.IFraction;
import org.matheclipse.core.interfaces.IInteger;
import org.matheclipse.core.interfaces.INum;
import org.matheclipse.core.interfaces.IPattern;
import org.matheclipse.core.interfaces.IPatternSequence;
import org.matheclipse.core.interfaces.IStringX;
import org.matheclipse.core.interfaces.ISymbol;

/**
 * Replace all occurrences of expressions where the given <code>function.apply()</code> method returns a non
 * <code>F.NIL</code> value. The visitors <code>visit()</code> methods return <code>F.NIL</code> if no substitution
 * occurred.
 */
public class VisitorReplaceAllLambda extends VisitorExpr {
	final Predicate<IExpr> fPredicate;
	final Function<IExpr, IExpr> fFunction;
	final int fOffset;

	public VisitorReplaceAllLambda(Predicate<IExpr> predicate, Function<IExpr, IExpr> function) {
		this(predicate, function, 0);
	}

	public VisitorReplaceAllLambda(Predicate<IExpr> predicate, Function<IExpr, IExpr> function, int offset) {
		super();
		this.fPredicate = predicate;
		this.fFunction = function;
		this.fOffset = offset;
	}

	private IExpr visistAtom(IExpr element) {
		if (fPredicate.test(element)) {
			IExpr temp = fFunction.apply(element);
			if (temp != null && temp.isPresent()) {
				return temp;
			}
		}
		return F.NIL;
	}
	@Override
	public IExpr visit(IInteger element) {
		return visistAtom(element);
	}

	/**
	 *
	 * @return <code>F.NIL</code>, if no evaluation is possible
	 */
	@Override
	public IExpr visit(IFraction element) {
		return visistAtom(element);
	}

	/**
	 *
	 * @return <code>F.NIL</code>, if no evaluation is possible
	 */
	@Override
	public IExpr visit(IComplex element) {
		return visistAtom(element);
	}

	/**
	 *
	 * @return <code>F.NIL</code>, if no evaluation is possible
	 */
	@Override
	public IExpr visit(INum element) {
		return visistAtom(element);
	}

	/**
	 *
	 * @return <code>F.NIL</code>, if no evaluation is possible
	 */
	@Override
	public IExpr visit(IComplexNum element) {
		return visistAtom(element);
	}

	/**
	 *
	 * @return <code>F.NIL</code>, if no evaluation is possible
	 */
	@Override
	public IExpr visit(ISymbol element) {
		return visistAtom(element);
	}

	/**
	 *
	 * @return <code>F.NIL</code>, if no evaluation is possible
	 */
	@Override
	public IExpr visit(IPattern element) {
		return visistAtom(element);
	}

	/**
	 *
	 * @return <code>F.NIL</code>, if no evaluation is possible
	 */
	@Override
	public IExpr visit(IPatternSequence element) {
		return visistAtom(element);
	}

	/**
	 *
	 * @return <code>F.NIL</code>, if no evaluation is possible
	 */
	@Override
	public IExpr visit(IStringX element) {
		return visistAtom(element);
	}

	@Override
	public IExpr visit(IASTMutable ast) {
		if (fPredicate.test(ast)) {
			IExpr temp = fFunction.apply(ast);
			if (temp != null && temp.isPresent()) {
				return temp;
			}
		}
		return visitAST(ast);
	}

	@Override
	protected IExpr visitAST(IAST ast) {
		IExpr temp;
		int i = fOffset;
		int size = ast.size();
		while (i < size) {
			temp = ast.get(i).accept(this);
			if (temp.isPresent()) {
				// something was evaluated - return a new IAST:
				final IASTMutable result = ast.setAtCopy(i++, temp);
				ast.forEach(i, size, new ObjIntConsumer<IExpr>() {
					@Override
					public void accept(IExpr x, int j) {
						IExpr t = x.accept(VisitorReplaceAllLambda.this);
						if (t.isPresent()) {
							result.set(j, t);
						}
					}
				});
				return result;
			}
			i++;
		}
		return F.NIL;
	}
}
