package org.matheclipse.core.reflection.system.rules;

import static org.matheclipse.core.expression.F.*;
import org.matheclipse.core.interfaces.IAST;

/**
 * Generated by <code>org.matheclipse.core.preprocessor.RulePreprocessor</code>.<br />
 * See GIT repository at: <a href="https://bitbucket.org/axelclk/symja_android_library">https://bitbucket.org/axelclk/symja_android_library under the tools directory</a>.
 */
public interface ArcTanRules {
  /**
   * <ul>
   * <li>index 0 - number of equal rules in <code>RULES</code></li>
	 * </ul>
	 */
  final public static int[] SIZES = { 18 };

  final public static IAST RULES = List(
    IInit(ArcTan, SIZES),
    ISet(ArcTan(C0),
      C0),
    ISet(ArcTan(C0,C0),
      C0),
    ISet(ArcTan(Plus(C2,Negate(CSqrt3))),
      Times(QQ(1L,12L),Pi)),
    ISet(ArcTan(Plus(CN1,CSqrt2)),
      Times(QQ(1L,8L),Pi)),
    ISet(ArcTan(C1DSqrt3),
      Times(QQ(1L,6L),Pi)),
    ISet(ArcTan(Sqrt(Plus(C5,Times(CN2,CSqrt5)))),
      Times(QQ(1L,5L),Pi)),
    ISet(ArcTan(C1),
      Times(C1D4,Pi)),
    ISet(ArcTan(C1,C1),
      Times(C1D4,Pi)),
    ISet(ArcTan(CN1,CN1),
      Times(QQ(-3L,4L),Pi)),
    ISet(ArcTan(CSqrt3),
      Times(C1D3,Pi)),
    ISet(ArcTan(Plus(C1,CSqrt2)),
      Times(QQ(3L,8L),Pi)),
    ISet(ArcTan(Plus(C2,CSqrt3)),
      Times(QQ(5L,12L),Pi)),
    ISet(ArcTan(CI),
      DirectedInfinity(CI)),
    ISet(ArcTan(CInfinity,y_),
      C0),
    ISet(ArcTan(CInfinity),
      Times(C1D2,Pi)),
    ISet(ArcTan(CNInfinity),
      Times(CN1D2,Pi)),
    ISet(ArcTan(DirectedInfinity(CI)),
      Times(C1D2,Pi)),
    ISet(ArcTan(DirectedInfinity(CNI)),
      Times(CN1D2,Pi))
  );
}
