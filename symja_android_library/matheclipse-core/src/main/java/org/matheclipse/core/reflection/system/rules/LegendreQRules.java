package org.matheclipse.core.reflection.system.rules;

import static org.matheclipse.core.expression.F.*;
import org.matheclipse.core.interfaces.IAST;

/**
 * <p>Generated by <code>org.matheclipse.core.preprocessor.RulePreprocessor</code>.</p>
 * <p>See GIT repository at: <a href="https://github.com/axkr/symja_android_library">github.com/axkr/symja_android_library under the tools directory</a>.</p>
 */
public interface LegendreQRules {
  /**
   * <ul>
   * <li>index 0 - number of equal rules in <code>RULES</code></li>
	 * </ul>
	 */
  final public static int[] SIZES = { 2, 2 };

  final public static IAST RULES = List(
    IInit(LegendreQ, SIZES),
    // LegendreQ(x_,1)=ComplexInfinity
    ISet(LegendreQ(x_,C1),
      CComplexInfinity),
    // LegendreQ(x_,-1)=ComplexInfinity
    ISet(LegendreQ(x_,CN1),
      CComplexInfinity),
    // LegendreQ(x_IntegerQ,z_):=ComplexInfinity/;x<0
    ISetDelayed(LegendreQ($p(x,IntegerQ),z_),
      Condition(CComplexInfinity,Less(x,C0))),
    // LegendreQ(0,z_):=-Log(1-z)/2+Log(1+z)/2
    ISetDelayed(LegendreQ(C0,z_),
      Plus(Times(CN1D2,Log(Plus(C1,Negate(z)))),Times(C1D2,Log(Plus(C1,z))))),
    // LegendreQ(1,z_):=-1+z*(-Log(1-z)/2+Log(1+z)/2)
    ISetDelayed(LegendreQ(C1,z_),
      Plus(CN1,Times(z,Plus(Times(CN1D2,Log(Plus(C1,Negate(z)))),Times(C1D2,Log(Plus(C1,z))))))),
    // LegendreQ(n_IntegerQ,z_):=1/2*(-Log(1-z)+Log(1+z))*LegendreP(n,z)-Sum((-1-4*k+2*n)/((2*k+1)*(-k+n))*LegendreP(-1-2*k+n,z),{k,0,Floor(1/2*(-1+n))})/;n>=0
    ISetDelayed(LegendreQ($p(n,IntegerQ),z_),
      Condition(Plus(Times(C1D2,Plus(Negate(Log(Plus(C1,Negate(z)))),Log(Plus(C1,z))),LegendreP(n,z)),Negate(Sum(Times(Plus(CN1,Times(CN4,k),Times(C2,n)),Power(Times(Plus(Times(C2,k),C1),Plus(Negate(k),n)),-1),LegendreP(Plus(CN1,Times(CN2,k),n),z)),List(k,C0,Floor(Times(C1D2,Plus(CN1,n))))))),GreaterEqual(n,C0)))
  );
}
