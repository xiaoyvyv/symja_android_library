package org.matheclipse.core.reflection.system.rules;

import org.matheclipse.core.interfaces.IAST;

import static org.matheclipse.core.expression.F.$p;
import static org.matheclipse.core.expression.F.C0;
import static org.matheclipse.core.expression.F.C1;
import static org.matheclipse.core.expression.F.C1D2;
import static org.matheclipse.core.expression.F.C2;
import static org.matheclipse.core.expression.F.CComplexInfinity;
import static org.matheclipse.core.expression.F.CN1;
import static org.matheclipse.core.expression.F.CN1D2;
import static org.matheclipse.core.expression.F.CN2;
import static org.matheclipse.core.expression.F.CN4;
import static org.matheclipse.core.expression.F.Condition;
import static org.matheclipse.core.expression.F.EllipticK;
import static org.matheclipse.core.expression.F.Floor;
import static org.matheclipse.core.expression.F.GreaterEqual;
import static org.matheclipse.core.expression.F.IInit;
import static org.matheclipse.core.expression.F.ISet;
import static org.matheclipse.core.expression.F.ISetDelayed;
import static org.matheclipse.core.expression.F.Integer;
import static org.matheclipse.core.expression.F.LegendreP;
import static org.matheclipse.core.expression.F.LegendreQ;
import static org.matheclipse.core.expression.F.Less;
import static org.matheclipse.core.expression.F.List;
import static org.matheclipse.core.expression.F.Log;
import static org.matheclipse.core.expression.F.Negate;
import static org.matheclipse.core.expression.F.Plus;
import static org.matheclipse.core.expression.F.Power;
import static org.matheclipse.core.expression.F.Subtract;
import static org.matheclipse.core.expression.F.Sum;
import static org.matheclipse.core.expression.F.Times;
import static org.matheclipse.core.expression.F.k;
import static org.matheclipse.core.expression.F.n;
import static org.matheclipse.core.expression.F.x;
import static org.matheclipse.core.expression.F.x_;
import static org.matheclipse.core.expression.F.z;
import static org.matheclipse.core.expression.F.z_;

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
  final public static int[] SIZES = { 2, 3 };

  final public static IAST RULES = List(
    IInit(LegendreQ, SIZES),
    // LegendreQ(x_,1)=ComplexInfinity
    ISet(LegendreQ(x_,C1),
      CComplexInfinity),
    // LegendreQ(x_,-1)=ComplexInfinity
    ISet(LegendreQ(x_,CN1),
      CComplexInfinity),
    // LegendreQ(x_Integer,z_):=ComplexInfinity/;x<0
    ISetDelayed(LegendreQ($p(x, Integer),z_),
      Condition(CComplexInfinity,Less(x,C0))),
    // LegendreQ(0,z_):=-Log(1-z)/2+Log(1+z)/2
    ISetDelayed(LegendreQ(C0,z_),
      Plus(Times(CN1D2,Log(Subtract(C1,z))),Times(C1D2,Log(Plus(C1,z))))),
    // LegendreQ(1,z_):=-1+z*(-Log(1-z)/2+Log(1+z)/2)
    ISetDelayed(LegendreQ(C1,z_),
      Plus(CN1,Times(z,Plus(Times(CN1D2,Log(Subtract(C1,z))),Times(C1D2,Log(Plus(C1,z))))))),
    // LegendreQ(n_Integer,z_):=1/2*(-Log(1-z)+Log(1+z))*LegendreP(n,z)-Sum((-1-4*k+2*n)/((2*k+1)*(-k+n))*LegendreP(-1-2*k+n,z),{k,0,Floor(1/2*(-1+n))})/;n>=0
    ISetDelayed(LegendreQ($p(n, Integer),z_),
      Condition(Subtract(Times(C1D2,Plus(Negate(Log(Subtract(C1,z))),Log(Plus(C1,z))),LegendreP(n,z)),Sum(Times(Plus(CN1,Times(CN4,k),Times(C2,n)),Power(Times(Plus(Times(C2,k),C1),Plus(Negate(k),n)),CN1),LegendreP(Plus(CN1,Times(CN2,k),n),z)),List(k,C0,Floor(Times(C1D2,Plus(CN1,n)))))),GreaterEqual(n,C0))),
    // LegendreQ(-1/2,-1+2*z_):=EllipticK(z)
    ISetDelayed(LegendreQ(CN1D2,Plus(CN1,Times(C2,z_))),
      EllipticK(z))
  );
}
