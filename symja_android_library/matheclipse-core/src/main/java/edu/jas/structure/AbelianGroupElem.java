/*
 * $Id$
 */

package edu.jas.structure;


import org.matheclipse.parser.client.math.MathException;

/**
 * Abelian group element interface. Defines the additive methods.
 *
 * @param <C> element type
 * @author Heinz Kredel
 */

public interface AbelianGroupElem<C> extends Element<C> {


    /**
     * Test if this is zero.
     *
     * @return true if this is 0, else false.
     */
    boolean isZERO();


    /**
     * Signum.
     *
     * @return the sign of this.
     */
    int signum();


    /**
     * Sum of this and S.
     *
     * @param S
     * @return this + S.
     */
    C sum(C S) throws MathException;


    //public <T extends C> T sum(T S);


    /**
     * Subtract S from this.
     *
     * @param S
     * @return this - S.
     */
    C subtract(C S) throws MathException;


    /**
     * Negate this.
     *
     * @return - this.
     */
    C negate() throws MathException;


    /**
     * Absolute value of this.
     *
     * @return |this|.
     */
    C abs() throws MathException;

}
