package org.matheclipse.core.reflection.system;

import org.hipparchus.stat.StatUtils;
import org.matheclipse.core.convert.Expr2Object;
import org.matheclipse.core.eval.EvalEngine;
import org.matheclipse.core.eval.exception.Validate;
import org.matheclipse.core.eval.interfaces.AbstractFunctionEvaluator;
import org.matheclipse.core.expression.F;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.stat.descriptive.SymbolicStatUtils;

public class GeometricMean extends AbstractFunctionEvaluator {
	public GeometricMean() {
	}

	@Override
	public IExpr evaluate(final IAST ast, EvalEngine engine) {
		Validate.checkSize(ast, 2);
		IAST arg1 = Validate.checkASTType(ast, 1);
		if (arg1.isRealVector()) {
			return F.num(StatUtils.geometricMean(arg1.toDoubleVector()));
		}
		if (arg1.size() > 1) {
			return SymbolicStatUtils.geometricMean(arg1);
		}
		return F.NIL;
	}

	@Override
	public IExpr numericEval(final IAST ast, EvalEngine engine) {
		Validate.checkSize(ast, 2);

		double[] values = Expr2Object.toDoubleVector(ast.getAST(1));
		return F.num(StatUtils.geometricMean(values));
	}
}
