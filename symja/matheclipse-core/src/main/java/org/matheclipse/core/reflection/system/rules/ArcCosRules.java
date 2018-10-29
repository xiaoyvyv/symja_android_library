package org.matheclipse.core.reflection.system.rules;

import org.matheclipse.core.interfaces.IAST;

import static org.matheclipse.core.expression.F.ArcCos;
import static org.matheclipse.core.expression.F.C0;
import static org.matheclipse.core.expression.F.C1;
import static org.matheclipse.core.expression.F.C1D2;
import static org.matheclipse.core.expression.F.C1D3;
import static org.matheclipse.core.expression.F.C1D4;
import static org.matheclipse.core.expression.F.C1DSqrt2;
import static org.matheclipse.core.expression.F.C2;
import static org.matheclipse.core.expression.F.CComplexInfinity;
import static org.matheclipse.core.expression.F.CI;
import static org.matheclipse.core.expression.F.CN1;
import static org.matheclipse.core.expression.F.CN1D2;
import static org.matheclipse.core.expression.F.CNI;
import static org.matheclipse.core.expression.F.CSqrt2;
import static org.matheclipse.core.expression.F.CSqrt3;
import static org.matheclipse.core.expression.F.DirectedInfinity;
import static org.matheclipse.core.expression.F.IInit;
import static org.matheclipse.core.expression.F.ISet;
import static org.matheclipse.core.expression.F.List;
import static org.matheclipse.core.expression.F.Log;
import static org.matheclipse.core.expression.F.Negate;
import static org.matheclipse.core.expression.F.Noo;
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
public interface ArcCosRules {
  /**
   * <ul>
   * <li>index 0 - number of equal rules in <code>RULES</code></li>
	 * </ul>
	 */
  final public static int[] SIZES = { 20, 0 };

  final public static IAST RULES = List(
    IInit(ArcCos, SIZES),
    // ArcCos(0)=Pi/2
    ISet(ArcCos(C0),
      Times(C1D2,Pi)),
    // ArcCos(1/2)=Pi/3
    ISet(ArcCos(C1D2),
      Times(C1D3,Pi)),
    // ArcCos(-1/2)=2/3*Pi
    ISet(ArcCos(CN1D2),
      Times(QQ(2L,3L),Pi)),
    // ArcCos(Sqrt(2)/2)=Pi/4
    ISet(ArcCos(C1DSqrt2),
      Times(C1D4,Pi)),
    // ArcCos(-Sqrt(2)/2)=3/4*Pi
    ISet(ArcCos(Negate(C1DSqrt2)),
      Times(QQ(3L,4L),Pi)),
    // ArcCos(Sqrt(3)/2)=Pi/6
    ISet(ArcCos(Times(C1D2,CSqrt3)),
      Times(QQ(1L,6L),Pi)),
    // ArcCos(-Sqrt(3)/2)=5/6*Pi
    ISet(ArcCos(Times(CN1D2,CSqrt3)),
      Times(QQ(5L,6L),Pi)),
    // ArcCos(Sqrt(2+Sqrt(2))/2)=Pi/8
    ISet(ArcCos(Times(C1D2,Sqrt(Plus(C2,CSqrt2)))),
      Times(QQ(1L,8L),Pi)),
    // ArcCos(-Sqrt(2+Sqrt(2))/2)=7/8*Pi
    ISet(ArcCos(Times(CN1D2,Sqrt(Plus(C2,CSqrt2)))),
      Times(QQ(7L,8L),Pi)),
    // ArcCos((1+Sqrt(3))/(2*Sqrt(2)))=Pi/12
    ISet(ArcCos(Times(C1D2,C1DSqrt2,Plus(C1,CSqrt3))),
      Times(QQ(1L,12L),Pi)),
    // ArcCos((-1-Sqrt(3))/(2*Sqrt(2)))=11/12*Pi
    ISet(ArcCos(Times(C1D2,C1DSqrt2,Plus(CN1,Negate(CSqrt3)))),
      Times(QQ(11L,12L),Pi)),
    // ArcCos(1)=0
    ISet(ArcCos(C1),
      C0),
    // ArcCos(-1)=Pi
    ISet(ArcCos(CN1),
      Pi),
    // ArcCos(I)=Pi/2+I*Log(-1+Sqrt(2))
    ISet(ArcCos(CI),
      Plus(Times(C1D2,Pi),Times(CI,Log(Plus(CN1,CSqrt2))))),
    // ArcCos(-I)=Pi/2+I*Log(1+Sqrt(2))
    ISet(ArcCos(CNI),
      Plus(Times(C1D2,Pi),Times(CI,Log(Plus(C1,CSqrt2))))),
    // ArcCos(Infinity)=I*Infinity
    ISet(ArcCos(oo),
      DirectedInfinity(CI)),
    // ArcCos(-Infinity)=-I*Infinity
    ISet(ArcCos(Noo),
      DirectedInfinity(CNI)),
    // ArcCos(I*Infinity)=-I*Infinity
    ISet(ArcCos(DirectedInfinity(CI)),
      DirectedInfinity(CNI)),
    // ArcCos(-I*Infinity)=I*Infinity
    ISet(ArcCos(DirectedInfinity(CNI)),
      DirectedInfinity(CI)),
    // ArcCos(ComplexInfinity)=ComplexInfinity
    ISet(ArcCos(CComplexInfinity),
      CComplexInfinity)
  );
}
