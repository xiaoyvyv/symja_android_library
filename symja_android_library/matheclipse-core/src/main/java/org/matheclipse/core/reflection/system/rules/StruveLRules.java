package org.matheclipse.core.reflection.system.rules;

import static org.matheclipse.core.expression.F.*;
import org.matheclipse.core.interfaces.IAST;

/**
 * <p>Generated by <code>org.matheclipse.core.preprocessor.RulePreprocessor</code>.</p>
 * <p>See GIT repository at: <a href="https://github.com/axkr/symja_android_library">github.com/axkr/symja_android_library under the tools directory</a>.</p>
 */
public interface StruveLRules {
  /**
   * <ul>
   * <li>index 0 - number of equal rules in <code>RULES</code></li>
	 * </ul>
	 */
  final public static int[] SIZES = { 1, 2 };

  final public static IAST RULES = List(
    IInit(StruveL, SIZES),
    // StruveL(-1,0)=Times(2/Pi)
    ISet(StruveL(CN1,C0),
      Times(C2,Power(Pi,CN1))),
    // StruveL(-1/2,z_):=Sqrt(2/(Pi*z))*Sinh(z)
    ISetDelayed(StruveL(CN1D2,z_),
      Times(Sqrt(Times(C2,Power(Times(Pi,z),CN1))),Sinh(z))),
    // StruveL(1/2,z_):=Sqrt(2/(Pi*z))*(-1+Cosh(z))
    ISetDelayed(StruveL(C1D2,z_),
      Times(Sqrt(Times(C2,Power(Times(Pi,z),CN1))),Plus(CN1,Cosh(z))))
  );
}
