package org.matheclipse.core.builtin.function;

import org.matheclipse.core.eval.EvalEngine;
import org.matheclipse.core.eval.exception.Validate;
import org.matheclipse.core.eval.interfaces.AbstractCoreFunctionEvaluator;
import org.matheclipse.core.expression.F;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.interfaces.ISymbol;
import org.matheclipse.core.patternmatching.IPatternMatcher;

/**
 * Trace the evaluation steps for a given expression. The resulting trace expression list is wrapped by Hold (i.e.
 * <code>Hold[{...}]</code>.
 * 
 */
public class Trace extends AbstractCoreFunctionEvaluator {

	public Trace() {
	}

	@Override
	public IExpr evaluate(final IAST ast) {
		Validate.checkRange(ast, 2, 3);

		final IExpr temp = ast.arg1();
		IPatternMatcher matcher = null;
		final EvalEngine engine = EvalEngine.get();
		if (ast.size() == 3) {
			matcher = engine.evalPatternMatcher(ast.arg2());
		}

		IAST traceList = engine.evalTrace(temp, matcher, F.List());
		return traceList;
		// final IAST holdList = F.ast(F.Hold);
		// holdList.add(traceList);
		// return holdList;
	}

	@Override
	public void setUp(final ISymbol symbol) {
		symbol.setAttributes(ISymbol.HOLDALL);
	}

}
