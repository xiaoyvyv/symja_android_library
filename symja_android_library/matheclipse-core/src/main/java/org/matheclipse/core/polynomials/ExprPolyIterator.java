package org.matheclipse.core.polynomials;

import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.polynomials.longexponent.ExpVectorLong;
import org.matheclipse.core.polynomials.longexponent.ExprMonomial;

import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;

/**
 * Iterator over monomials of a polynomial. Adaptor for val.entrySet().iterator().
 * 
 * @author Heinz Kredel
 */

public class ExprPolyIterator implements Iterator<ExprMonomial> {

	/**
	 * Internal iterator over polynomial map.
	 */
	protected final Iterator<Map.Entry<ExpVectorLong, IExpr>> ms;

	/**
	 * Constructor of polynomial iterator.
	 * 
	 * @param m
	 *            SortetMap of a polynomial.
	 */
	public ExprPolyIterator(SortedMap<ExpVectorLong, IExpr> m) {
		ms = m.entrySet().iterator();
	}

	/**
	 * Test for availability of a next monomial.
	 * 
	 * @return true if the iteration has more monomials, else false.
	 */
	@Override
	public boolean hasNext() {
		return ms.hasNext();
	}

	/**
	 * Get next monomial element.
	 * 
	 * @return next monomial.
	 */
	@Override
	public ExprMonomial next() {
		return new ExprMonomial(ms.next());
	}

	/**
	 * Remove the last monomial returned from underlying set if allowed.
	 */
	@Override
	public void remove() {
		ms.remove();
	}

}
