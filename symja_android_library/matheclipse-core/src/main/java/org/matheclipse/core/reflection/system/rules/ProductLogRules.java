package org.matheclipse.core.reflection.system.rules;

import static org.matheclipse.core.expression.F.*;
import org.matheclipse.core.interfaces.IAST;

/**
 * Generated by <code>org.matheclipse.core.preprocessor.RulePreprocessor</code>.<br />
 * See GIT repository at: <a href="https://bitbucket.org/axelclk/symja_android_library">https://bitbucket.org/axelclk/symja_android_library under the tools directory</a>.
 */
public interface ProductLogRules {
  /**
   * <ul>
   * <li>index 0 - number of equal rules in <code>RULES</code></li>
	 * </ul>
	 */
  final public static int[] SIZES = { 11 };

  final public static IAST RULES = List(
    IInit(ProductLog, SIZES),
    ISet(ProductLog(C0),
      C0),
    ISet(ProductLog(Times(CN1D2,Pi)),
      Times(CC(0L,1L,1L,2L),Pi)),
    ISet(ProductLog(Negate(Power(E,-1))),
      CN1),
    ISet(ProductLog(E),
      C1),
    ISet(ProductLog(CN1,Times(CN1D2,Pi)),
      Times(CC(0L,1L,-1L,2L),Pi)),
    ISet(ProductLog(CN1,Negate(Power(E,-1))),
      CN1),
    ISet(ProductLog(CInfinity),
      CInfinity),
    ISet(ProductLog(CNInfinity),
      CNInfinity),
    ISet(ProductLog(DirectedInfinity(CI)),
      CInfinity),
    ISet(ProductLog(DirectedInfinity(CNI)),
      CInfinity),
    ISet(ProductLog(CComplexInfinity),
      CInfinity),
    ISetDelayed(Times(Power(E,ProductLog(x_)),ProductLog(x_)),
      x),
    ISetDelayed(ProductLog(C0,x_),
      ProductLog(x)),
    ISetDelayed(ProductLog($p(n,NumberQ),C0),
      Condition(Negate(CInfinity),Unequal(n,C0)))
  );
}
