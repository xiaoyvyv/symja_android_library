package org.matheclipse.core.reflection.system.rules;

import org.matheclipse.core.interfaces.IAST;

import static org.matheclipse.core.expression.F.ArcCosh;
import static org.matheclipse.core.expression.F.ArcCoth;
import static org.matheclipse.core.expression.F.ArcCsch;
import static org.matheclipse.core.expression.F.ArcSech;
import static org.matheclipse.core.expression.F.ArcSinh;
import static org.matheclipse.core.expression.F.ArcTanh;
import static org.matheclipse.core.expression.F.C0;
import static org.matheclipse.core.expression.F.C1;
import static org.matheclipse.core.expression.F.CC;
import static org.matheclipse.core.expression.F.CComplexInfinity;
import static org.matheclipse.core.expression.F.CI;
import static org.matheclipse.core.expression.F.CN1;
import static org.matheclipse.core.expression.F.CN2;
import static org.matheclipse.core.expression.F.CNI;
import static org.matheclipse.core.expression.F.Coth;
import static org.matheclipse.core.expression.F.IInit;
import static org.matheclipse.core.expression.F.ISet;
import static org.matheclipse.core.expression.F.ISetDelayed;
import static org.matheclipse.core.expression.F.Indeterminate;
import static org.matheclipse.core.expression.F.List;
import static org.matheclipse.core.expression.F.Log;
import static org.matheclipse.core.expression.F.Pi;
import static org.matheclipse.core.expression.F.Plus;
import static org.matheclipse.core.expression.F.Power;
import static org.matheclipse.core.expression.F.Sqr;
import static org.matheclipse.core.expression.F.Sqrt;
import static org.matheclipse.core.expression.F.Times;
import static org.matheclipse.core.expression.F.num;
import static org.matheclipse.core.expression.F.oo;
import static org.matheclipse.core.expression.F.x;
import static org.matheclipse.core.expression.F.x_;

/**
 * <p>Generated by <code>org.matheclipse.core.preprocessor.RulePreprocessor</code>.</p>
 * <p>See GIT repository at: <a href="https://github.com/axkr/symja_android_library">github.com/axkr/symja_android_library under the tools directory</a>.</p>
 */
public interface CothRules {
  /**
   * <ul>
   * <li>index 0 - number of equal rules in <code>RULES</code></li>
	 * </ul>
	 */
  final public static int[] SIZES = { 8, 7 };

  final public static IAST RULES = List(
    IInit(Coth, SIZES),
    // Coth(0)=ComplexInfinity
    ISet(Coth(C0),
      CComplexInfinity),
    // Coth(0.0)=ComplexInfinity
    ISet(Coth(num(0.0)),
      CComplexInfinity),
    // Coth(1/4*Pi*I)=-I
    ISet(Coth(Times(CC(0L,1L,1L,4L),Pi)),
      CNI),
    // Coth(1/2*Pi*I)=0
    ISet(Coth(Times(CC(0L,1L,1L,2L),Pi)),
      C0),
    // Coth(3/4*Pi*I)=I
    ISet(Coth(Times(CC(0L,1L,3L,4L),Pi)),
      CI),
    // Coth(Pi*I)=ComplexInfinity
    ISet(Coth(Times(CI,Pi)),
      CComplexInfinity),
    // Coth(ArcSinh(x_)):=Sqrt(1+x^2)/x
    ISetDelayed(Coth(ArcSinh(x_)),
      Times(Power(x,CN1),Sqrt(Plus(C1,Sqr(x))))),
    // Coth(ArcCosh(x_)):=x/(Sqrt(x+1)*Sqrt(-1+x))
    ISetDelayed(Coth(ArcCosh(x_)),
      Times(Power(Times(Sqrt(Plus(x,C1)),Sqrt(Plus(CN1,x))),CN1),x)),
    // Coth(ArcTanh(x_)):=1/x
    ISetDelayed(Coth(ArcTanh(x_)),
      Power(x,CN1)),
    // Coth(ArcCoth(x_)):=x
    ISetDelayed(Coth(ArcCoth(x_)),
      x),
    // Coth(ArcSech(x_)):=1/(x*Sqrt(-1+1/x)*Sqrt(1/x+1))
    ISetDelayed(Coth(ArcSech(x_)),
      Power(Times(x,Sqrt(Plus(CN1,Power(x,CN1))),Sqrt(Plus(Power(x,CN1),C1))),CN1)),
    // Coth(ArcCsch(x_)):=Sqrt(1+1/x^2)*x
    ISetDelayed(Coth(ArcCsch(x_)),
      Times(Sqrt(Plus(C1,Power(x,CN2))),x)),
    // Coth(Log(x_)):=(1+x^2)/(-1+x^2)
    ISetDelayed(Coth(Log(x_)),
      Times(Plus(C1,Sqr(x)),Power(Plus(CN1,Sqr(x)),CN1))),
    // Coth(Infinity)=1
    ISet(Coth(oo),
      C1),
    // Coth(ComplexInfinity)=Indeterminate
    ISet(Coth(CComplexInfinity),
      Indeterminate)
  );
}
