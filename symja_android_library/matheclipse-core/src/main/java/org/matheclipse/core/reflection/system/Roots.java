package org.matheclipse.core.reflection.system;

import static org.matheclipse.core.expression.F.C0;
import static org.matheclipse.core.expression.F.List;
import static org.matheclipse.core.expression.F.evalExpandAll;

import java.util.List;

import javax.annotation.Nonnull;

import org.apache.commons.math4.linear.Array2DRowRealMatrix;
import org.apache.commons.math4.linear.EigenDecomposition;
import org.apache.commons.math4.linear.RealMatrix;
import org.matheclipse.core.basic.Config;
import org.matheclipse.core.convert.JASConvert;
import org.matheclipse.core.convert.JASIExpr;
import org.matheclipse.core.convert.VariablesSet;
import org.matheclipse.core.eval.EvalEngine;
import org.matheclipse.core.eval.exception.JASConversionException;
import org.matheclipse.core.eval.exception.WrappedException;
import org.matheclipse.core.eval.interfaces.AbstractFunctionEvaluator;
import org.matheclipse.core.expression.ASTRange;
import org.matheclipse.core.expression.ExprRingFactory;
import org.matheclipse.core.expression.F;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.interfaces.ISymbol;
import org.matheclipse.core.polynomials.QuarticSolver;

import edu.jas.arith.BigRational;
import edu.jas.poly.GenPolynomial;
import edu.jas.poly.Monomial;

/**
 * Determine the roots of a univariate polynomial
 * 
 * See Wikipedia entries for:
 * <a href="http://en.wikipedia.org/wiki/Quadratic_equation">Quadratic
 * equation </a>, <a href="http://en.wikipedia.org/wiki/Cubic_function">Cubic
 * function</a> and
 * <a href="http://en.wikipedia.org/wiki/Quartic_function">Quartic function</a>
 */
public class Roots extends AbstractFunctionEvaluator {

	public Roots() {
	}

	@Override
	public IExpr evaluate(final IAST ast, EvalEngine engine) {
		if (ast.size() != 2) {
			return F.NIL;
		}
		return roots(ast, false, engine);
	}

	protected static IAST roots(final IAST ast, boolean numericSolutions, EvalEngine engine) {
		VariablesSet eVar = new VariablesSet(ast.arg1());
		if (!eVar.isSize(1)) {
			// factor only possible for univariate polynomials
			return F.NIL;
		}
		IExpr expr = evalExpandAll(ast.arg1());
		IAST variables = eVar.getVarList();
		IExpr denom = F.C1;
		if (expr.isAST()) {
			expr = Together.together((IAST) expr);

			// split expr into numerator and denominator
			denom = engine.evaluate(F.Denominator(expr));
			if (!denom.isOne()) {
				// search roots for the numerator expression
				expr = engine.evaluate(F.Numerator(expr));
			}
		}
		return rootsOfVariable(expr, denom, variables, numericSolutions, engine);
	}

	/**
	 * <p>
	 * Given a set of polynomial coefficients, compute the roots of the
	 * polynomial. Depending on the polynomial being considered the roots may
	 * contain complex number. When complex numbers are present they will come
	 * in pairs of complex conjugates.
	 * </p>
	 * 
	 * @param coefficients
	 *            coefficients of the polynomial.
	 * @return the roots of the polynomial
	 */
	@Nonnull
	public static IAST findRoots(double... coefficients) {
		int N = coefficients.length - 1;

		// Construct the companion matrix
		RealMatrix c = new Array2DRowRealMatrix(N, N);

		double a = coefficients[N];
		for (int i = 0; i < N; i++) {
			c.setEntry(i, N - 1, -coefficients[i] / a);
		}
		for (int i = 1; i < N; i++) {
			c.setEntry(i, i - 1, 1);
		}

		try {
			IAST roots = F.List();
			EigenDecomposition ed = new EigenDecomposition(c);

			double[] realValues = ed.getRealEigenvalues();
			double[] imagValues = ed.getImagEigenvalues();

			for (int i = 0; i < N; i++) {
				roots.add(F.chopExpr(F.complexNum(realValues[i], imagValues[i]), Config.DEFAULT_ROOTS_CHOP_DELTA));
			}
			return roots;
		} catch (Exception ime) {
			throw new WrappedException(ime);
		}

	}

	/**
	 * 
	 * @param expr
	 * @param denom
	 * @param variables
	 * @param numericSolutions
	 * @param engine
	 * @return <code>F.NIL</code> if no evaluation was possible.
	 */
	protected static IAST rootsOfVariable(final IExpr expr, final IExpr denom, final IAST variables,
			boolean numericSolutions, EvalEngine engine) {
		IAST result = F.NIL;
		ASTRange r = new ASTRange(variables, 1);
		List<IExpr> varList = r.toList();

		try {
			result = F.List();
			IExpr temp;
			JASConvert<BigRational> jas = new JASConvert<BigRational>(varList, BigRational.ZERO);
			GenPolynomial<BigRational> polyRat = jas.expr2JAS(expr, numericSolutions);
			if (polyRat.degree(0) <= 2) {
				return rootsOfExprPolynomial(expr, varList);
			}
			IAST factors = Factor.factorComplex(polyRat, jas, varList, F.List, true);
			for (int i = 1; i < factors.size(); i++) {
				temp = F.evalExpand(factors.get(i));
				IAST quarticResultList = QuarticSolver.solve(temp, variables.arg1());
				if (quarticResultList.isPresent()) {
					for (int j = 1; j < quarticResultList.size(); j++) {
						if (numericSolutions) {
							result.add(F.chopExpr(engine.evalN(quarticResultList.get(j)),
									Config.DEFAULT_ROOTS_CHOP_DELTA));
						} else {
							result.add(quarticResultList.get(j));
						}
					}
				} else {
					// if (numericSolutions) {
					double[] coefficients = CoefficientList.coefficientList(temp, (ISymbol) variables.arg1());
					if (coefficients == null) {
						return null;
					}
					IAST resultList = findRoots(coefficients);
					// IAST resultList = RootIntervals.croots(temp, true);
					if (resultList.size() > 0) {
						result.addAll(resultList);
					}
					// }
				}
			}
			result = QuarticSolver.createSet(result);
			return result;
		} catch (JASConversionException e) {
			result = rootsOfExprPolynomial(expr, varList);
		}
		if (result.isPresent()) {
			if (!denom.isNumber()) {
				// eliminate roots from the result list, which occur in the
				// denominator
				int i = 1;
				while (i < result.size()) {
					IExpr temp = denom.replaceAll(F.Rule(variables.arg1(), result.get(i)));
					if (temp.isPresent() && engine.evaluate(temp).isZero()) {
						result.remove(i);
						continue;
					}
					i++;
				}
			}
			return result;
		}
		return F.NIL;
	}

	public static IAST rootsOfExprPolynomial(final IExpr expr, List<IExpr> varList) {
		IAST result = F.NIL;
		try {
			// try to generate a common expression polynomial
			JASIExpr eJas = new JASIExpr(varList, new ExprRingFactory());
			GenPolynomial<IExpr> ePoly = eJas.expr2IExprJAS(expr);
			result = rootsOfPolynomial(ePoly);
			if (result.isPresent() && expr.isNumericMode()) {
				for (int i = 1; i < result.size(); i++) {
					result.set(i, F.chopExpr(result.get(i), Config.DEFAULT_ROOTS_CHOP_DELTA));
				}
			}
		} catch (JASConversionException e2) {
			if (Config.SHOW_STACKTRACE) {
				e2.printStackTrace();
			}
		}
		return result;
	}

	/**
	 * 
	 * @param ePoly
	 * @return <code>F.NIL</code> if no evaluation was possible.
	 */
	private static IAST rootsOfPolynomial(GenPolynomial<IExpr> ePoly) {
		long varDegree = ePoly.degree(0);
		IAST result = List();
		if (ePoly.isConstant()) {
			return result;
		}
		IExpr a;
		IExpr b;
		IExpr c;
		IExpr d;
		IExpr e;
		if (varDegree <= 4) {
			// solve quartic equation: a*x^2 + b*x + c = 0
			a = C0;
			b = C0;
			c = C0;
			d = C0;
			e = C0;
			for (Monomial<IExpr> monomial : ePoly) {
				IExpr coeff = monomial.coefficient();
				long lExp = monomial.exponent().getVal(0);
				if (lExp == 4) {
					a = coeff;
				} else if (lExp == 3) {
					b = coeff;
				} else if (lExp == 2) {
					c = coeff;
				} else if (lExp == 1) {
					d = coeff;
				} else if (lExp == 0) {
					e = coeff;
				} else {
					throw new ArithmeticException("Roots::Unexpected exponent value: " + lExp);
				}
			}
			result = QuarticSolver.quarticSolve(a, b, c, d, e);
			if (result.isPresent()) {
				result = QuarticSolver.createSet(result);
				return result;
			}

		}

		return F.NIL;
	}

}