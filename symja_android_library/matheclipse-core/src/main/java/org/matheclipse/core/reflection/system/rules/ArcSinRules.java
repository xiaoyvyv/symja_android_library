package org.matheclipse.core.reflection.system.rules;

import org.matheclipse.core.interfaces.IAST;

import static org.matheclipse.core.expression.F.ArcSin;
import static org.matheclipse.core.expression.F.C0;
import static org.matheclipse.core.expression.F.C1;
import static org.matheclipse.core.expression.F.C1D2;
import static org.matheclipse.core.expression.F.C1D3;
import static org.matheclipse.core.expression.F.C1D4;
import static org.matheclipse.core.expression.F.C1DSqrt2;
import static org.matheclipse.core.expression.F.C2;
import static org.matheclipse.core.expression.F.C5;
import static org.matheclipse.core.expression.F.CComplexInfinity;
import static org.matheclipse.core.expression.F.CI;
import static org.matheclipse.core.expression.F.CN1;
import static org.matheclipse.core.expression.F.CNI;
import static org.matheclipse.core.expression.F.CSqrt2;
import static org.matheclipse.core.expression.F.CSqrt3;
import static org.matheclipse.core.expression.F.CSqrt5;
import static org.matheclipse.core.expression.F.DirectedInfinity;
import static org.matheclipse.core.expression.F.IInit;
import static org.matheclipse.core.expression.F.ISet;
import static org.matheclipse.core.expression.F.List;
import static org.matheclipse.core.expression.F.Log;
import static org.matheclipse.core.expression.F.Negate;
import static org.matheclipse.core.expression.F.Pi;
import static org.matheclipse.core.expression.F.Plus;
import static org.matheclipse.core.expression.F.QQ;
import static org.matheclipse.core.expression.F.Sqrt;
import static org.matheclipse.core.expression.F.Times;
import static org.matheclipse.core.expression.F.oo;

/**
 * <p>Generated by <code>org.matheclipse.core.preprocessor.RulePreprocessor</code>.</p>
 * <p>See GIT repository at: <a href="https://github.com/axkr/symja_android_library">github.com/axkr/symja_android_library under the tools directory</a>.</p>
 */
public interface ArcSinRules {
  /**
   * <ul>
   * <li>index 0 - number of equal rules in <code>RULES</code></li>
	 * </ul>
	 */
  final public static int[] SIZES = { 16, 0 };

  final public static IAST RULES = List(
    IInit(ArcSin, SIZES),
    // ArcSin(0)=0
    ISet(ArcSin(C0),
      C0),
    // ArcSin((-1+Sqrt(3))/(2*Sqrt(2)))=Pi/12
    ISet(ArcSin(Times(C1D2,C1DSqrt2,Plus(CN1,CSqrt3))),
      Times(QQ(1L,12L),Pi)),
    // ArcSin(1/4*(-1+Sqrt(5)))=Pi/10
    ISet(ArcSin(Times(C1D4,Plus(CN1,CSqrt5))),
      Times(QQ(1L,10L),Pi)),
    // ArcSin(Sqrt(2-Sqrt(2))/2)=Pi/8
    ISet(ArcSin(Times(C1D2,Sqrt(Plus(C2,Negate(CSqrt2))))),
      Times(QQ(1L,8L),Pi)),
    // ArcSin(1/2)=Pi/6
    ISet(ArcSin(C1D2),
      Times(QQ(1L,6L),Pi)),
    // ArcSin(Sqrt(1/2*(5-Sqrt(5)))/2)=Pi/5
    ISet(ArcSin(Times(C1D2,C1DSqrt2,Sqrt(Plus(C5,Negate(CSqrt5))))),
      Times(QQ(1L,5L),Pi)),
    // ArcSin(Sqrt(2)/2)=Pi/4
    ISet(ArcSin(C1DSqrt2),
      Times(C1D4,Pi)),
    // ArcSin(Sqrt(3)/2)=Pi/3
    ISet(ArcSin(Times(C1D2,CSqrt3)),
      Times(C1D3,Pi)),
    // ArcSin(Sqrt(2+Sqrt(2))/2)=3/8*Pi
    ISet(ArcSin(Times(C1D2,Sqrt(Plus(C2,CSqrt2)))),
      Times(QQ(3L,8L),Pi)),
    // ArcSin(Sqrt(1/2*(5+Sqrt(5)))/2)=2/5*Pi
    ISet(ArcSin(Times(C1D2,C1DSqrt2,Sqrt(Plus(C5,CSqrt5)))),
      Times(QQ(2L,5L),Pi)),
    // ArcSin((1+Sqrt(3))/(2*Sqrt(2)))=5/12*Pi
    ISet(ArcSin(Times(C1D2,C1DSqrt2,Plus(C1,CSqrt3))),
      Times(QQ(5L,12L),Pi)),
    // ArcSin(1)=Pi/2
    ISet(ArcSin(C1),
      Times(C1D2,Pi)),
    // ArcSin(I)=I*Log(Sqrt(2)+1)
    ISet(ArcSin(CI),
      Times(CI,Log(Plus(C1,CSqrt2)))),
    // ArcSin(Infinity)=-I*Infinity
    ISet(ArcSin(oo),
      DirectedInfinity(CNI)),
    // ArcSin(I*Infinity)=I*Infinity
    ISet(ArcSin(DirectedInfinity(CI)),
      DirectedInfinity(CI)),
    // ArcSin(ComplexInfinity)=ComplexInfinity
    ISet(ArcSin(CComplexInfinity),
      CComplexInfinity)
  );
}
