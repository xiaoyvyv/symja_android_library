package org.matheclipse.core.reflection.system;

import org.matheclipse.core.basic.Config;
import org.matheclipse.core.eval.EvalEngine;
import org.matheclipse.core.eval.interfaces.AbstractEvaluator;
import org.matheclipse.core.expression.F;
import org.matheclipse.core.expression.ID;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.interfaces.ISymbol;

/**
 * Plots x/y functions
 *
 */
public class PolarPlot extends AbstractEvaluator {
	/**
	 * Constructor for the singleton
	 */
	public final static PolarPlot CONST = new PolarPlot();

	public PolarPlot() {
	}

	@Override
	public IExpr evaluate(final IAST ast, EvalEngine engine) {
		if (Config.USE_MANIPULATE_JS) {
			IExpr temp = F.Manipulate.of(engine, ast);
			if (temp.headID() == ID.JSFormData) {
				return temp;
			}
		}
		return F.NIL;
	}

	@Override
	public void setUp(final ISymbol newSymbol) {
		newSymbol.setAttributes(ISymbol.HOLDALL);
	}
}
