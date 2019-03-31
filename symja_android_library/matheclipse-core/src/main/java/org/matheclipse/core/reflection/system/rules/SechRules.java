package org.matheclipse.core.reflection.system.rules;

import static org.matheclipse.core.expression.F.*;
import org.matheclipse.core.interfaces.IAST;

/**
 * <p>Generated by <code>org.matheclipse.core.preprocessor.RulePreprocessor</code>.</p>
 * <p>See GIT repository at: <a href="https://github.com/axkr/symja_android_library">github.com/axkr/symja_android_library under the tools directory</a>.</p>
 */
public interface SechRules {
  /**
   * <ul>
   * <li>index 0 - number of equal rules in <code>RULES</code></li>
	 * </ul>
	 */
  final public static int[] SIZES = { 26, 6 };

  final public static IAST RULES = List(
    IInit(Sech, SIZES),
    // Sech(0)=1
    ISet(Sech(C0),
      C1),
    // Sech(1/6*Pi*I)=2/Sqrt(3)
    ISet(Sech(Times(CC(0L,1L,1L,6L),Pi)),
      Times(C2,C1DSqrt3)),
    // Sech(1/5*Pi*I)=-1+Sqrt(5)
    ISet(Sech(Times(CC(0L,1L,1L,5L),Pi)),
      Plus(CN1,CSqrt5)),
    // Sech(1/4*Pi*I)=Sqrt(2)
    ISet(Sech(Times(CC(0L,1L,1L,4L),Pi)),
      CSqrt2),
    // Sech(1/3*Pi*I)=2
    ISet(Sech(Times(CC(0L,1L,1L,3L),Pi)),
      C2),
    // Sech(2/5*Pi*I)=1+Sqrt(5)
    ISet(Sech(Times(CC(0L,1L,2L,5L),Pi)),
      Plus(C1,CSqrt5)),
    // Sech(1/2*Pi*I)=ComplexInfinity
    ISet(Sech(Times(CC(0L,1L,1L,2L),Pi)),
      CComplexInfinity),
    // Sech(2/3*Pi*I)=-2
    ISet(Sech(Times(CC(0L,1L,2L,3L),Pi)),
      CN2),
    // Sech(3/4*Pi*I)=-Sqrt(2)
    ISet(Sech(Times(CC(0L,1L,3L,4L),Pi)),
      Negate(CSqrt2)),
    // Sech(4/5*Pi*I)=1-Sqrt(5)
    ISet(Sech(Times(CC(0L,1L,4L,5L),Pi)),
      Subtract(C1,CSqrt5)),
    // Sech(5/6*Pi*I)=-2/Sqrt(3)
    ISet(Sech(Times(CC(0L,1L,5L,6L),Pi)),
      Times(CN2,C1DSqrt3)),
    // Sech(Pi*I)=-1
    ISet(Sech(Times(CI,Pi)),
      CN1),
    // Sech(7/6*Pi*I)=-2/Sqrt(3)
    ISet(Sech(Times(CC(0L,1L,7L,6L),Pi)),
      Times(CN2,C1DSqrt3)),
    // Sech(6/5*Pi*I)=1-Sqrt(5)
    ISet(Sech(Times(CC(0L,1L,6L,5L),Pi)),
      Subtract(C1,CSqrt5)),
    // Sech(5/4*Pi*I)=-Sqrt(2)
    ISet(Sech(Times(CC(0L,1L,5L,4L),Pi)),
      Negate(CSqrt2)),
    // Sech(4/3*Pi*I)=-2
    ISet(Sech(Times(CC(0L,1L,4L,3L),Pi)),
      CN2),
    // Sech(7/5*Pi*I)=-1-Sqrt(5)
    ISet(Sech(Times(CC(0L,1L,7L,5L),Pi)),
      Subtract(CN1,CSqrt5)),
    // Sech(3/2*Pi*I)=ComplexInfinity
    ISet(Sech(Times(CC(0L,1L,3L,2L),Pi)),
      CComplexInfinity),
    // Sech(8/5*Pi*I)=1+Sqrt(5)
    ISet(Sech(Times(CC(0L,1L,8L,5L),Pi)),
      Plus(C1,CSqrt5)),
    // Sech(5/3*Pi*I)=2
    ISet(Sech(Times(CC(0L,1L,5L,3L),Pi)),
      C2),
    // Sech(7/4*Pi*I)=Sqrt(2)
    ISet(Sech(Times(CC(0L,1L,7L,4L),Pi)),
      CSqrt2),
    // Sech(9/5*Pi*I)=-1+Sqrt(5)
    ISet(Sech(Times(CC(0L,1L,9L,5L),Pi)),
      Plus(CN1,CSqrt5)),
    // Sech(11/6*Pi*I)=2/Sqrt(3)
    ISet(Sech(Times(CC(0L,1L,11L,6L),Pi)),
      Times(C2,C1DSqrt3)),
    // Sech(2*Pi*I)=1
    ISet(Sech(Times(CC(0L,1L,2L,1L),Pi)),
      C1),
    // Sech(ArcSinh(x_)):=1/Sqrt(1+x^2)
    ISetDelayed(Sech(ArcSinh(x_)),
      Power(Plus(C1,Sqr(x)),CN1D2)),
    // Sech(ArcCosh(x_)):=1/x
    ISetDelayed(Sech(ArcCosh(x_)),
      Power(x,CN1)),
    // Sech(ArcTanh(x_)):=Sqrt(1-x^2)
    ISetDelayed(Sech(ArcTanh(x_)),
      Sqrt(Subtract(C1,Sqr(x)))),
    // Sech(ArcCoth(x_)):=Sqrt(1-1/x^2)
    ISetDelayed(Sech(ArcCoth(x_)),
      Sqrt(Subtract(C1,Power(x,CN2)))),
    // Sech(ArcSech(x_)):=x
    ISetDelayed(Sech(ArcSech(x_)),
      x),
    // Sech(ArcCsch(x_)):=1/Sqrt(1+1/x^2)
    ISetDelayed(Sech(ArcCsch(x_)),
      Power(Plus(C1,Power(x,CN2)),CN1D2)),
    // Sech(Infinity)=0
    ISet(Sech(oo),
      C0),
    // Sech(ComplexInfinity)=Indeterminate
    ISet(Sech(CComplexInfinity),
      Indeterminate)
  );
}
