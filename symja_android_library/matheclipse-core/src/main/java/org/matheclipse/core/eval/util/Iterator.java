package org.matheclipse.core.eval.util;

import org.matheclipse.core.builtin.QuantityFunctions;
import org.matheclipse.core.eval.EvalEngine;
import org.matheclipse.core.eval.exception.NoEvalException;
import org.matheclipse.core.eval.exception.WrongArgumentType;
import org.matheclipse.core.expression.F;
import org.matheclipse.core.expression.Num;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.interfaces.IInteger;
import org.matheclipse.core.interfaces.IIterator;
import org.matheclipse.core.interfaces.IIteratorImpl;
import org.matheclipse.core.interfaces.INum;
import org.matheclipse.core.interfaces.IRational;
import org.matheclipse.core.interfaces.ISignedNumber;
import org.matheclipse.core.interfaces.ISymbol;

import ch.ethz.idsc.tensor.qty.IQuantity;
import ch.ethz.idsc.tensor.qty.IQuantityStatic;
import ch.ethz.idsc.tensor.qty.IUnit;

import static org.matheclipse.core.expression.F.Divide;
import static org.matheclipse.core.expression.F.Less;
import static org.matheclipse.core.expression.F.Subtract;

/**
 * Create iterators for functions like <code>Table()</code>, <code>Sum()</code> or <code>Product()</code>
 *
 */
public class Iterator {
	public static class ExprIterator extends IIteratorImpl<IExpr> implements IIterator<IExpr> {

		IExpr count;

		final boolean fNumericMode;

		EvalEngine evalEngine;

		IExpr lowerLimit;

		IExpr maxCounterOrList;

		/**
		 * If <code>maxCounterOrList</code> is a list the <code>maxCounterOrListIndex</code> attribute points to the
		 * current element.
		 */
		int maxCounterOrListIndex;

		IExpr step;

		final IExpr originalLowerLimit;

		final IExpr originalUpperLimit;

		final IExpr originalStep;

		final ISymbol variable;

		IExpr variableValue;
		public ExprIterator(final ISymbol symbol, final EvalEngine engine, final IExpr originalStart,
				final IExpr originalMaxCount, final IExpr originalStep, boolean numericMode) {
			this.variable = symbol;
			this.evalEngine = engine;
			this.originalLowerLimit = originalStart;
			this.originalUpperLimit = originalMaxCount;
			this.originalStep = originalStep;
			this.fNumericMode = numericMode;
		}

		@Override
		public int allocHint() {
			return 10;
		}

		@Override
		public IExpr getLowerLimit() {
			return originalLowerLimit;
		}

		@Override
		public IExpr getStep() {
			return originalStep;
		}

		@Override
		public IExpr getUpperLimit() {
			return originalUpperLimit;
		}

		@Override
		public ISymbol getVariable() {
			return variable;
		}

		/**
		 * Tests if this enumeration contains more elements.
		 * 
		 * @return <code>true</code> if this enumeration contains more elements; <code>false</code> otherwise.
		 */
		@Override
		public boolean hasNext() {
			if (maxCounterOrList == null) {// || (illegalIterator)) {
				throw NoEvalException.CONST;
			}
			if ((maxCounterOrList.isDirectedInfinity()) || (count.isDirectedInfinity())) {
				throw NoEvalException.CONST;
			}
			// if (count == null || count.isDirectedInfinity()) {
			// throw new NoEvalException();
			// }
			if (maxCounterOrList.isList()) {
				if (maxCounterOrListIndex <= ((IAST) maxCounterOrList).size()) {
					return true;
				}
				return false;
			} else {
				if (step.isZero()) {
					throw NoEvalException.CONST;
				}
				if (step.isReal()) {
					if (step.isNegative()) {
						if (F.LessEqual.ofQ(evalEngine, maxCounterOrList, count)) {
							return true;
						}
					} else {
						if (F.LessEqual.ofQ(evalEngine, count, maxCounterOrList)) {
							return true;
						}
					}
				}
				// else {
					IExpr sub = evalEngine.evaluate(Divide(Subtract(maxCounterOrList, count), step));
					if (sub.isReal()) {
					return !sub.isNegative();
					}
				try {
					double d = sub.evalDouble();
					return !(d < 0.0);
				} catch (WrongArgumentType wt) {
					// return false;
				}
					return false;
				// }
			}
			// return false;
		}

		@Override
		public boolean isNumericFunction() {
			return originalLowerLimit.isNumericFunction() && originalStep.isNumericFunction()
					&& originalUpperLimit.isNumericFunction();
		}

		@Override
		public boolean isSetIterator() {
			return variable != null && originalUpperLimit != null && originalUpperLimit.isList();
		}

		@Override
		public boolean isValidVariable() {
			return variable != null && originalLowerLimit != null && originalStep != null && originalUpperLimit != null
					&& !originalUpperLimit.isList();
		}

		/**
		 * Returns the next element of this enumeration.
		 * 
		 * @return the next element of this enumeration.
		 */
		@Override
		public IExpr next() {
			if (variable != null && variable != count) {
				variable.assign(count);
			}
			final IExpr temp = count;
			if (maxCounterOrList.isList()) {
				if (maxCounterOrListIndex == ((IAST) maxCounterOrList).size()) {
					maxCounterOrListIndex++;
					return temp;
				}
				count = ((IAST) maxCounterOrList).get(maxCounterOrListIndex++);
			} else {
				count = evalEngine.evaluate(count.add(step));
			}
			return temp;
		}

		/**
		 * Not implemented; throws UnsupportedOperationException
		 * 
		 */
		@Override
		public void remove() throws UnsupportedOperationException {
			throw new UnsupportedOperationException();
		}

		@Override
		public boolean setUp() {
			if (variable != null) {
				variableValue = variable.assignedValue();
			}
			lowerLimit = originalLowerLimit;
			if (!(originalLowerLimit.isReal())) {
				lowerLimit = evalEngine.evalWithoutNumericReset(originalLowerLimit);
			}
			maxCounterOrList = originalUpperLimit;
			if (!(originalUpperLimit.isReal())) {
				maxCounterOrList = evalEngine.evalWithoutNumericReset(originalUpperLimit);
			}
			// points to first element in maxCounterOrList if it's a list
			maxCounterOrListIndex = 1;

			step = originalStep;
			if (!(originalStep.isReal())) {
				step = evalEngine.evalWithoutNumericReset(originalStep);
			}
			if (step.isReal()) {
				if (step.isNegative()) {
					if (evalEngine.evaluate(Less(lowerLimit, maxCounterOrList)) == F.True) {
						return false;
					}
				} else {
					if (evalEngine.evaluate(Less(maxCounterOrList, lowerLimit)) == F.True) {
						return false;
					}
				}
			}
			if (maxCounterOrList.isList()) {
				count = maxCounterOrList.getAt(maxCounterOrListIndex++);
			} else {
				count = lowerLimit;
			}
			if (variable != null && variable != count) {
				variable.assign(count);
			}
			return true;
		} 

		/**
		 * Method Declaration.
		 * 
		 */
		@Override
		public void tearDown() {
			if (variable != null) {
				variable.assign(null);
			}
			EvalEngine.get().setNumericMode(fNumericMode);
		}
	}

	public static class DoubleIterator extends IIteratorImpl<IExpr> implements IIterator<IExpr> {
		double count;

		double lowerLimit;

		double upperLimit;

		double step;

		final ISymbol variable;

		IExpr variableValue;
		final IExpr originalLowerLimit;

		final IExpr originalUpperLimit;

		final IExpr originalStep;

		public DoubleIterator(final ISymbol symbol, final double lowerLimit, final double upperLimit,
				final double step) {
			this.variable = symbol;
			this.lowerLimit = lowerLimit;
			this.upperLimit = upperLimit;
			this.step = step;
			this.originalLowerLimit = F.num(lowerLimit);
			this.originalUpperLimit = F.num(upperLimit);
			this.originalStep = F.num(step);
		}

		@Override
		public int allocHint() {
			if (step < 0) {
				return (int) Math.round((lowerLimit - upperLimit) / (-step) + 1.0);
			}
			return (int) Math.round((upperLimit - lowerLimit) / step + 1.0);
		}

		@Override
		public IExpr getLowerLimit() {
			return originalLowerLimit;
		}

		@Override
		public IExpr getStep() {
			return originalStep;
		}

		@Override
		public IExpr getUpperLimit() {
			return originalUpperLimit;
		}

		@Override
		public ISymbol getVariable() {
			return variable;
		}

		/**
		 * Tests if this enumeration contains more elements.
		 * 
		 * @return <code>true</code> if this enumeration contains more elements; <code>false</code> otherwise.
		 */
		@Override
		public boolean hasNext() {
			if (step < 0) {
				return count >= upperLimit;
			}
			return count <= upperLimit;
		}

		@Override
		public boolean isNumericFunction() {
			return true;
		}

		@Override
		public boolean isSetIterator() {
			return variable != null;
		}

		@Override
		public boolean isValidVariable() {
			return variable != null;
		}

		/**
		 * Returns the next element of this enumeration.
		 * 
		 * @return the next element of this enumeration.
		 */
		@Override
		public IExpr next() {
			final IExpr temp = F.num(count);
			if (variable != null) {
				variable.assign(temp);
			}
			count += step;
			return temp;
		}

		/**
		 * Not implemented; throws UnsupportedOperationException
		 * 
		 */
		@Override
		public void remove() throws UnsupportedOperationException {
			throw new UnsupportedOperationException();
		}

		@Override
		public boolean setUp() {
			if (variable != null) {
				variableValue = variable.assignedValue();
			}
			count = lowerLimit;
			if (step < 0) {
				if (lowerLimit < upperLimit) {
					return false;
				}
			} else {
				if (lowerLimit > upperLimit) {
					return false;
				}
			}

			if (variable != null) {
				variable.assign(originalLowerLimit);
			}
			return true;
		}

		/**
		 * Method Declaration.
		 * 
		 */
		@Override
		public void tearDown() {
			if (variable != null) {
				variable.assign(variableValue);
			}
		}
	}

	public static class RationalIterator extends IIteratorImpl<IExpr> implements IIterator<IExpr> {
		IRational count;

		IRational lowerLimit;

		IRational upperLimit;

		IRational step;

		final ISymbol variable;

		IExpr variableValue = null;
		final IRational originalLowerLimit;

		final IRational originalUpperLimit;

		final IRational originalStep;

		public RationalIterator(final ISymbol symbol, final IRational lowerLimit, final IRational upperLimit,
				final IRational step) {
			this.variable = symbol;
			this.lowerLimit = lowerLimit;
			this.upperLimit = upperLimit;
			this.step = step;
			this.originalLowerLimit = lowerLimit;
			this.originalUpperLimit = upperLimit;
			this.originalStep = step;
		}

		@Override
		public int allocHint() {
			IRational temp = lowerLimit.subtract(upperLimit).divideBy(step);
			IInteger hint = temp.numerator().div(temp.denominator());
			int alloc = hint.toInt();
			if (alloc < 0) {
				return (-alloc) + 1;
			}
			return alloc + 1;
		}

		@Override
		public IExpr getLowerLimit() {
			return originalLowerLimit;
		}

		@Override
		public IExpr getStep() {
			return originalStep;
		}

		@Override
		public IExpr getUpperLimit() {
			return originalUpperLimit;
		}

		@Override
		public ISymbol getVariable() {
			return variable;
		}

		/**
		 * Tests if this enumeration contains more elements.
		 * 
		 * @return <code>true</code> if this enumeration contains more elements; <code>false</code> otherwise.
		 */
		@Override
		public boolean hasNext() {
			if (step.isNegative()) {
				return count.greaterEqualThan(upperLimit).isTrue();
			}
			return count.lessEqualThan(upperLimit).isTrue();
		}

		@Override
		public boolean isNumericFunction() {
			return true;
		}

		@Override
		public boolean isSetIterator() {
			return variable != null;
		}

		@Override
		public boolean isValidVariable() {
			return variable != null;
		}

		/**
		 * Returns the next element of this enumeration.
		 * 
		 * @return the next element of this enumeration.
		 */
		@Override
		public IExpr next() {
			final ISignedNumber temp = count;
			if (variable != null) {
				variable.assign(temp);
			}
			count = (IRational) count.plus(step);
			return temp;
		}

		/**
		 * Not implemented; throws UnsupportedOperationException
		 * 
		 */
		@Override
		public void remove() throws UnsupportedOperationException {
			throw new UnsupportedOperationException();
		}

		@Override
		public boolean setUp() {
			count = lowerLimit;
			if (step.isNegative()) {
				if (lowerLimit.lessThan(upperLimit).isTrue()) {
					return false;
				}
			} else {
				if (lowerLimit.greaterThan(upperLimit).isTrue()) {
					return false;
				}
			}

			if (variable != null) {
				variableValue = variable.assignedValue();
				variable.assign(originalLowerLimit);
			}
			return true;
		}

		/**
		 * Method Declaration.
		 *
		 */
		@Override
		public void tearDown() {
			if (variable != null) {
				variable.assign(variableValue);
			}
		}
	}

	public static class QuantityIterator extends IIteratorImpl<IExpr> implements IIterator<IExpr> {
		IQuantity count;

		IQuantity lowerLimit;

		IQuantity upperLimit;

		IQuantity step;

		final ISymbol variable;

		IExpr variableValue = null;

		final IUnit unit;

		final IQuantity originalLowerLimit;

		final IQuantity originalUpperLimit;

		final IQuantity originalStep;

		public QuantityIterator(final ISymbol symbol, IQuantity lowerLimit, IQuantity upperLimit,
				final IQuantity step) {
			this.unit = lowerLimit.unit();
			if (!lowerLimit.unit().equals(unit)) {
				lowerLimit = (IQuantity) QuantityFunctions.unitConvert(lowerLimit, unit);
			}
			if (!upperLimit.unit().equals(unit)) {
				upperLimit = (IQuantity) QuantityFunctions.unitConvert(upperLimit, unit);
			}
			this.variable = symbol;
			this.lowerLimit = lowerLimit;
			this.upperLimit = upperLimit;
			this.step = step;
			this.originalLowerLimit = lowerLimit;
			this.originalUpperLimit = upperLimit;
			this.originalStep = step;
		}

		public QuantityIterator(final ISymbol symbol, IQuantity lowerLimit, IQuantity upperLimit) {
			this.unit = lowerLimit.unit();
			if (!lowerLimit.unit().equals(unit)) {
				lowerLimit = (IQuantity) QuantityFunctions.unitConvert(lowerLimit, unit);
			}
			if (!upperLimit.unit().equals(unit)) {
				upperLimit = (IQuantity) QuantityFunctions.unitConvert(upperLimit, unit);
			}
			this.step = IQuantityStatic.of(F.C1, unit);
			this.variable = symbol;
			this.lowerLimit = lowerLimit;
			this.upperLimit = upperLimit;
			this.originalLowerLimit = lowerLimit;
			this.originalUpperLimit = upperLimit;
			this.originalStep = step;
		}

		public QuantityIterator(final ISymbol symbol, IQuantity upperLimit) {
			this.unit = upperLimit.unit();
			if (!upperLimit.unit().equals(unit)) {
				upperLimit = (IQuantity) QuantityFunctions.unitConvert(upperLimit, unit);
			}
			this.lowerLimit = IQuantityStatic.of(F.C1, unit);
			this.step = IQuantityStatic.of(F.C1, unit);
			this.variable = symbol;
			this.upperLimit = upperLimit;
			this.originalLowerLimit = lowerLimit;
			this.originalUpperLimit = upperLimit;
			this.originalStep = step;
		}

		@Override
		public int allocHint() {
			// TODO allocate hint

			// IRational temp = lowerLimit.subtract(upperLimit).divideBy(step);
			// IInteger hint = temp.numerator().div(temp.denominator());
			// int alloc = hint.toInt();
			// if (alloc < 0) {
			// return (-alloc) + 1;
			// }
			// return alloc + 1;
			return 10;
		}

		@Override
		public IExpr getLowerLimit() {
			return originalLowerLimit;
		}

		@Override
		public IExpr getStep() {
			return originalStep;
		}

		@Override
		public IExpr getUpperLimit() {
			return originalUpperLimit;
		}

		@Override
		public ISymbol getVariable() {
			return variable;
		}

		/**
		 * Tests if this enumeration contains more elements.
		 *
		 * @return <code>true</code> if this enumeration contains more elements; <code>false</code> otherwise.
		 */
		@Override
		public boolean hasNext() {
			if (step.isNegative()) {
				return count.greaterEqualThan(upperLimit).isTrue();
			}
			return count.lessEqualThan(upperLimit).isTrue();
		}

		@Override
		public boolean isNumericFunction() {
			return true;
		}

		@Override
		public boolean isSetIterator() {
			return variable != null;
		}

		@Override
		public boolean isValidVariable() {
			return variable != null;
		}

		/**
		 * Returns the next element of this enumeration.
		 *
		 * @return the next element of this enumeration.
		 */
		@Override
		public IExpr next() {
			final IQuantity temp = count;
			if (variable != null) {
				variable.assign(temp);
			}
			count = (IQuantity) count.plus(step);
			return temp;
		}

		/**
		 * Not implemented; throws UnsupportedOperationException
		 *
		 */
		@Override
		public void remove() throws UnsupportedOperationException {
			throw new UnsupportedOperationException();
		}

		@Override
		public boolean setUp() {
			count = lowerLimit;
			if (step.isNegative()) {
				if (lowerLimit.lessThan(upperLimit).isTrue()) {
					return false;
				}
			} else {
				if (lowerLimit.greaterThan(upperLimit).isTrue()) {
					return false;
				}
			}
			if (variable != null) {
				variableValue = variable.assignedValue();
				variable.assign(originalLowerLimit);
			}
			return true;
		}

		/**
		 * Method Declaration.
		 * 
		 */
		@Override
		public void tearDown() {
			if (variable != null) {
				variable.assign(variableValue);
			}
		}
	}

	public static class ISignedNumberIterator extends IIteratorImpl<IExpr> implements IIterator<IExpr> {
		ISignedNumber count;

		ISignedNumber lowerLimit;

		ISignedNumber upperLimit;

		ISignedNumber step;

		final ISymbol variable;

		IExpr variableValue;
		final ISignedNumber originalLowerLimit;

		final ISignedNumber originalUpperLimit;

		final ISignedNumber originalStep;

		public ISignedNumberIterator(final ISymbol symbol, final ISignedNumber lowerLimit,
				final ISignedNumber upperLimit, final ISignedNumber step) {
			this.variable = symbol;
			this.lowerLimit = lowerLimit;
			this.upperLimit = upperLimit;
			this.step = step;
			this.originalLowerLimit = lowerLimit;
			this.originalUpperLimit = upperLimit;
			this.originalStep = step;
		}

		@Override
		public int allocHint() {
			return 10;
		}

		@Override
		public IExpr getLowerLimit() {
			return originalLowerLimit;
		}

		@Override
		public IExpr getStep() {
			return originalStep;
		}

		@Override
		public IExpr getUpperLimit() {
			return originalUpperLimit;
		}

		@Override
		public ISymbol getVariable() {
			return variable;
		}

		/**
		 * Tests if this enumeration contains more elements.
		 * 
		 * @return <code>true</code> if this enumeration contains more elements; <code>false</code> otherwise.
		 */
		@Override
		public boolean hasNext() {
			if (step.isNegative()) {
				return count.greaterEqualThan(upperLimit).isTrue();
			}
			return count.lessEqualThan(upperLimit).isTrue();
		}

		@Override
		public boolean isNumericFunction() {
			return true;
		}

		@Override
		public boolean isSetIterator() {
			return variable != null;
		}

		@Override
		public boolean isValidVariable() {
			return variable != null;
		}

		/**
		 * Returns the next element of this enumeration.
		 * 
		 * @return the next element of this enumeration.
		 */
		@Override
		public IExpr next() {
			final ISignedNumber temp = count;
			if (variable != null) {
				variable.assign(temp);
			}
			count = (ISignedNumber) count.plus(step);
			return temp;
		}

		/**
		 * Not implemented; throws UnsupportedOperationException
		 * 
		 */
		@Override
		public void remove() throws UnsupportedOperationException {
			throw new UnsupportedOperationException();
		}

		@Override
		public boolean setUp() {
			if (variable != null) {
				variableValue = variable.assignedValue();
			}
			count = lowerLimit;
			if (step.isNegative()) {
				if (lowerLimit.lessThan(upperLimit).isTrue()) {
					return false;
				}
			} else {
				if (lowerLimit.greaterThan(upperLimit).isTrue()) {
					return false;
				}
			}

			if (variable != null) {
				variable.assign(originalLowerLimit);
			}
			return true;
		}

		/**
		 * Method Declaration.
		 * 
		 */
		@Override
		public void tearDown() {
			if (variable != null) {
				variable.assign(variableValue);
			}
		}
	}

	public static class IntIterator extends IIteratorImpl<IExpr> implements IIterator<IExpr> {
		int count;

		int lowerLimit;

		int upperLimit;

		int step;

		final ISymbol variable;

		IExpr variableValue = null;
		final IExpr originalLowerLimit;

		final IExpr originalUpperLimit;

		final IExpr originalStep;

		public IntIterator(final ISymbol symbol, final int lowerLimit, final int upperLimit, final int step) {
			this.variable = symbol;
			this.lowerLimit = lowerLimit;
			this.upperLimit = upperLimit;
			this.step = step;
			this.originalLowerLimit = F.integer(lowerLimit);
			this.originalUpperLimit = F.integer(upperLimit);
			this.originalStep = F.integer(step);
		}

		public IntIterator(final int lowerLimit, final int upperLimit, final int step) {
			this(null, lowerLimit, upperLimit, step);
		}

		public IntIterator(final int lowerLimit, final int upperLimit) {
			this(null, lowerLimit, upperLimit, 1);
		}

		public IntIterator(final int upperLimit) {
			this(null, 1, upperLimit, 1);
		}

		@Override
		public int allocHint() {
			if (step < 0) {
				return (lowerLimit - upperLimit) / (-step) + 1;
			}
			return (upperLimit - lowerLimit) / step + 1;
		}

		@Override
		public IExpr getLowerLimit() {
			return originalLowerLimit;
		}

		@Override
		public IExpr getStep() {
			return originalStep;
		}

		@Override
		public IExpr getUpperLimit() {
			return originalUpperLimit;
		}

		@Override
		public ISymbol getVariable() {
			return variable;
		}

		/**
		 * Tests if this enumeration contains more elements.
		 * 
		 * @return <code>true</code> if this enumeration contains more elements; <code>false</code> otherwise.
		 */
		@Override
		public boolean hasNext() {
			if (step < 0) {
				return count >= upperLimit;
			}
			return count <= upperLimit;
		}

		@Override
		public boolean isNumericFunction() {
			return true;
		}

		@Override
		public boolean isSetIterator() {
			return variable != null;
		}

		@Override
		public boolean isValidVariable() {
			return variable != null;
		}

		/**
		 * Returns the next element of this enumeration.
		 * 
		 * @return the next element of this enumeration.
		 */
		@Override
		public IExpr next() {
			final IExpr temp = F.integer(count);
			if (variable != null) {
				variable.assign(temp);
			}
			count += step;
			return temp;
		}

		/**
		 * Not implemented; throws UnsupportedOperationException
		 * 
		 */
		@Override
		public void remove() throws UnsupportedOperationException {
			throw new UnsupportedOperationException();
		}

		@Override
		public boolean setUp() {
			if (variable != null) {
				variableValue = variable.assignedValue();
			}
			count = lowerLimit;
			if (step < 0) {
				if (lowerLimit < upperLimit) {
					return false;
				}
			} else {
				if (lowerLimit > upperLimit) {
					return false;
				}
			}

			if (variable != null) {
				variable.assign(originalLowerLimit);
			}
			return true;
		}

		/**
		 * Method Declaration.
		 * 
		 */
		@Override
		public void tearDown() {
			if (variable != null) {
				variable.assign(variableValue);
			}
		}
	}

	/**
	 * Iterator specification for functions like <code>Table()</code> or <code>Sum()</code> or <code>Product()</code>
	 * 
	 * @param list
	 *            a list representing an iterator specification
	 * @param engine
	 *            the evaluation engine
	 * @return the iterator
	 */
	public static IIterator<IExpr> create(final IAST list, final EvalEngine engine) {

		EvalEngine evalEngine = engine;
		IExpr lowerLimit;
		IExpr upperLimit;
		IExpr step;
		ISymbol variable;
		boolean fNumericMode;
		// fNumericMode = evalEngine.isNumericMode() ||
		// list.isMember(Predicates.isNumeric(), false);
		boolean localNumericMode = evalEngine.isNumericMode();
		try {
			if (list.hasNumericArgument()) {
				evalEngine.setNumericMode(true);
			}
			fNumericMode = evalEngine.isNumericMode();
			switch (list.size()) {

			case 2:
				lowerLimit = F.C1;
				upperLimit = evalEngine.evalWithoutNumericReset(list.arg1());
				step = F.C1;
				variable = null;
				if (upperLimit instanceof Num) {
					return new DoubleIterator(variable, 1.0, ((INum) upperLimit).doubleValue(), 1.0);
				}
				if (upperLimit.isInteger()) {
					try {
						int iUpperLimit = ((IInteger) upperLimit).toInt();
						return new IntIterator(variable, 1, iUpperLimit, 1);
					} catch (ArithmeticException ae) {
						//
					}
				} else if (upperLimit.isRational()) {
					try {
						return new RationalIterator(variable, F.C1, (IRational) upperLimit, F.C1);
					} catch (ArithmeticException ae) {
						//
					}
				} else if (upperLimit.isQuantity()) {
					return new QuantityIterator(variable, (IQuantity) upperLimit);
				} else if (upperLimit.isReal()) {
					return new ISignedNumberIterator(variable, F.C1, (ISignedNumber) upperLimit, F.C1);
				}
				break;

			case 3:
				lowerLimit = F.C1;
				upperLimit = evalEngine.evalWithoutNumericReset(list.arg2());
				step = F.C1;

				if (list.arg1() instanceof ISymbol) {
					variable = (ISymbol) list.arg1();
				} else {
					variable = null;
				}
				if (upperLimit instanceof Num) {
					return new DoubleIterator(variable, 1.0, ((INum) upperLimit).doubleValue(), 1.0);
				}
				if (upperLimit.isInteger()) {
					try {
						int iUpperLimit = ((IInteger) upperLimit).toInt();
						return new IntIterator(variable, 1, iUpperLimit, 1);
					} catch (ArithmeticException ae) {
						//
					}
				} else if (upperLimit.isRational()) {
					try {
						return new RationalIterator(variable, F.C1, (IRational) upperLimit, F.C1);
					} catch (ArithmeticException ae) {
						//
					}
				} else if (upperLimit.isQuantity()) {
					return new QuantityIterator(variable, (IQuantity) upperLimit);
				} else if (upperLimit.isReal()) {
					return new ISignedNumberIterator(variable, F.C1, (ISignedNumber) upperLimit, F.C1);
				}

				break;
			case 4:
				lowerLimit = evalEngine.evalWithoutNumericReset(list.arg2());
				upperLimit = evalEngine.evalWithoutNumericReset(list.arg3());
				step = F.C1;

				if (list.arg1().isSymbol()) {
					variable = (ISymbol) list.arg1();
				} else {
					variable = null;
				}
				if (lowerLimit instanceof Num && upperLimit instanceof Num) {
					return new DoubleIterator(variable, ((INum) lowerLimit).doubleValue(),
							((INum) upperLimit).doubleValue(), 1.0);
				}
				if (lowerLimit.isInteger() && upperLimit.isInteger()) {
					try {
						int iLowerLimit = ((IInteger) lowerLimit).toInt();
						int iUpperLimit = ((IInteger) upperLimit).toInt();
						return new IntIterator(variable, iLowerLimit, iUpperLimit, 1);
					} catch (ArithmeticException ae) {
						//
					}
				} else if (lowerLimit.isRational() && upperLimit.isRational()) {
					try {
						return new RationalIterator(variable, (IRational) lowerLimit, (IRational) upperLimit, F.C1);
					} catch (ArithmeticException ae) {
						//
					}
				} else if (lowerLimit.isQuantity() && upperLimit.isQuantity()) {
					return new QuantityIterator(variable, (IQuantity) lowerLimit, (IQuantity) upperLimit);
				} else if (lowerLimit.isReal() && upperLimit.isReal()) {
					ISignedNumber iLowerLimit = (ISignedNumber) lowerLimit;
					ISignedNumber iUpperLimit = (ISignedNumber) upperLimit;
					return new ISignedNumberIterator(variable, iLowerLimit, iUpperLimit, F.C1);
				}
				break;

			case 5:
				lowerLimit = evalEngine.evalWithoutNumericReset(list.arg2());
				upperLimit = evalEngine.evalWithoutNumericReset(list.arg3());
				step = evalEngine.evalWithoutNumericReset(list.arg4());
				if (list.arg1() instanceof ISymbol) {
					variable = (ISymbol) list.arg1();
				} else {
					variable = null;
				}
				if (lowerLimit instanceof Num && upperLimit instanceof Num && step instanceof Num) {
					return new DoubleIterator(variable, ((INum) lowerLimit).doubleValue(),
							((INum) upperLimit).doubleValue(), ((INum) step).doubleValue());
				}
				if (lowerLimit.isInteger() && upperLimit.isInteger() && step.isInteger()) {
					try {
						int iLowerLimit = ((IInteger) lowerLimit).toInt();
						int iUpperLimit = ((IInteger) upperLimit).toInt();
						int iStep = ((IInteger) step).toInt();
						return new IntIterator(variable, iLowerLimit, iUpperLimit, iStep);
					} catch (ArithmeticException ae) {
						//
					}
				} else if (lowerLimit.isRational() && upperLimit.isRational() && step.isRational()) {
					try {
						return new RationalIterator(variable, (IRational) lowerLimit, (IRational) upperLimit,
								(IRational) step);
					} catch (ArithmeticException ae) {
						//
					}
				} else if (lowerLimit.isQuantity() && upperLimit.isQuantity() && step.isQuantity()) {
					return new QuantityIterator(variable, (IQuantity) lowerLimit, (IQuantity) upperLimit,
							(IQuantity) step);
				} else if (lowerLimit.isReal() && upperLimit.isReal() && step.isReal()) {
					return new ISignedNumberIterator(variable, (ISignedNumber) lowerLimit, (ISignedNumber) upperLimit,
							(ISignedNumber) step);
				}

				break;
			default:
				lowerLimit = null;
				upperLimit = null;
				step = null;
				variable = null;
			}

			return new ExprIterator(variable, evalEngine, lowerLimit, upperLimit, step, fNumericMode);
		} catch (RuntimeException rex) {
			throw new ClassCastException();
		} finally {
			evalEngine.setNumericMode(localNumericMode);
		}
	}

	/**
	 * Iterator specification for functions like <code>Table()</code> or <code>Sum()</code> or <code>Product()</code>
	 * 
	 * @param list
	 *            a list representing an iterator specification
	 * @param symbol
	 *            the variable symbol
	 * @param engine
	 *            the evaluation engine
	 * @return the iterator
	 */
	public static IIterator<IExpr> create(final IAST list, final ISymbol symbol, final EvalEngine engine) {
		EvalEngine evalEngine = engine;
		IExpr lowerLimit;
		IExpr upperLimit;
		IExpr step;
		ISymbol variable;
		boolean fNumericMode;

		boolean localNumericMode = evalEngine.isNumericMode();
		try {
			if (list.hasNumericArgument()) {
				evalEngine.setNumericMode(true);
			}
			fNumericMode = evalEngine.isNumericMode();
			switch (list.size()) {

			case 2:
				lowerLimit = F.C1;
				upperLimit = evalEngine.evalWithoutNumericReset(list.arg1());
				step = F.C1;
				variable = symbol;
				if (upperLimit instanceof Num) {
					return new DoubleIterator(variable, 1.0, ((INum) upperLimit).doubleValue(), 1.0);
				}
				if (upperLimit.isInteger()) {
					try {
						int iUpperLimit = ((IInteger) upperLimit).toInt();
						return new IntIterator(symbol, 1, iUpperLimit, 1);
					} catch (ArithmeticException ae) {
						//
					}
				} else if (upperLimit.isRational()) {
					try {
						return new RationalIterator(symbol, F.C1, (IRational) upperLimit, F.C1);
					} catch (ArithmeticException ae) {
						//
					}
				} else if (upperLimit.isQuantity()) {
					return new QuantityIterator(symbol, (IQuantity) upperLimit);
				} else if (upperLimit.isReal()) {
					return new ISignedNumberIterator(variable, F.C1, (ISignedNumber) upperLimit, F.C1);
				}
				break;
			case 3:
				lowerLimit = evalEngine.evalWithoutNumericReset(list.arg1());
				upperLimit = evalEngine.evalWithoutNumericReset(list.arg2());
				step = F.C1;
				variable = symbol;
				if (lowerLimit instanceof Num && upperLimit instanceof Num) {
					return new DoubleIterator(variable, ((INum) lowerLimit).doubleValue(),
							((INum) upperLimit).doubleValue(), 1.0);
				}
				if (lowerLimit.isInteger() && upperLimit.isInteger()) {
					try {
						int iLowerLimit = ((IInteger) lowerLimit).toInt();
						int iUpperLimit = ((IInteger) upperLimit).toInt();
						return new IntIterator(symbol, iLowerLimit, iUpperLimit, 1);
					} catch (ArithmeticException ae) {
						//
					}
				} else if (lowerLimit.isRational() && upperLimit.isRational()) {
					try {
						return new RationalIterator(symbol, (IRational) lowerLimit, (IRational) upperLimit, F.C1);
					} catch (ArithmeticException ae) {
						//
					}
				} else if (lowerLimit.isQuantity() && upperLimit.isQuantity()) {
					return new QuantityIterator(symbol, (IQuantity) lowerLimit, (IQuantity) upperLimit);
				} else if (lowerLimit.isReal() && upperLimit.isReal()) {
					return new ISignedNumberIterator(variable, (ISignedNumber) lowerLimit, (ISignedNumber) upperLimit,
							F.C1);
				}
				break;
			case 4:
				lowerLimit = evalEngine.evalWithoutNumericReset(list.arg1());
				upperLimit = evalEngine.evalWithoutNumericReset(list.arg2());
				step = evalEngine.evalWithoutNumericReset(list.arg3());
				variable = symbol;
				if (lowerLimit instanceof Num && upperLimit instanceof Num && step instanceof Num) {
					return new DoubleIterator(variable, ((INum) lowerLimit).doubleValue(),
							((INum) upperLimit).doubleValue(), ((INum) step).doubleValue());
				}
				if (lowerLimit.isInteger() && upperLimit.isInteger() && step.isInteger()) {
					try {
						int iLowerLimit = ((IInteger) lowerLimit).toInt();
						int iUpperLimit = ((IInteger) upperLimit).toInt();
						int iStep = ((IInteger) step).toInt();
						return new IntIterator(symbol, iLowerLimit, iUpperLimit, iStep);
					} catch (ArithmeticException ae) {
						//
					}
				} else if (lowerLimit.isRational() && upperLimit.isRational() && step.isRational()) {
					try {
						return new RationalIterator(symbol, (IRational) lowerLimit, (IRational) upperLimit,
								(IRational) step);
					} catch (ArithmeticException ae) {
						//
					}
				} else if (lowerLimit.isQuantity() && upperLimit.isQuantity() && step.isQuantity()) {
					return new QuantityIterator(symbol, (IQuantity) lowerLimit, (IQuantity) upperLimit,
							(IQuantity) step);
				} else if (lowerLimit.isReal() && upperLimit.isReal() && step.isReal()) {
					return new ISignedNumberIterator(variable, (ISignedNumber) lowerLimit, (ISignedNumber) upperLimit,
							(ISignedNumber) step);
				}
				break;
			default:
				lowerLimit = null;
				upperLimit = null;
				step = null;
				variable = null;
			}
			return new ExprIterator(variable, evalEngine, lowerLimit, upperLimit, step, fNumericMode);
		} catch (RuntimeException rex) {
			throw new ClassCastException();
		} finally {
			evalEngine.setNumericMode(localNumericMode);
		}
	}

}
