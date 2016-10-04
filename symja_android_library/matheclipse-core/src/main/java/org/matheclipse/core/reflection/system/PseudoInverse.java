package org.matheclipse.core.reflection.system;

import org.hipparchus.linear.DecompositionSolver;
import org.hipparchus.linear.FieldMatrix;
import org.hipparchus.linear.RealMatrix;
import org.matheclipse.core.eval.EvalEngine;
import org.matheclipse.core.eval.interfaces.AbstractMatrix1Matrix;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IExpr;

/**
 * Pseudoinverse of a matrix
 * 
 * See
 * <a href="https://en.wikipedia.org/wiki/Moore%E2%80%93Penrose_pseudoinverse">
 * Moore-Penrose pseudoinverse</a>
 */
public class PseudoInverse extends AbstractMatrix1Matrix {

	public PseudoInverse() {
		super();
	}

	@Override
	public IExpr evaluate(final IAST ast, EvalEngine engine) {
		return numericEval(ast, engine);
	}

	@Override
	public FieldMatrix<IExpr> matrixEval(FieldMatrix<IExpr> matrix) {
		return null;
	}

	@Override
	public RealMatrix realMatrixEval(RealMatrix matrix) {
		final org.hipparchus.linear.SingularValueDecomposition lu = new org.hipparchus.linear.SingularValueDecomposition(matrix);
		DecompositionSolver solver = lu.getSolver();
		return solver.getInverse();
	}
}