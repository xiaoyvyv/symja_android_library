package org.matheclipse.core.reflection.system.rules;

import org.matheclipse.core.interfaces.IAST;

import static org.matheclipse.core.expression.F.C0;
import static org.matheclipse.core.expression.F.C1;
import static org.matheclipse.core.expression.F.CC;
import static org.matheclipse.core.expression.F.CComplexInfinity;
import static org.matheclipse.core.expression.F.CI;
import static org.matheclipse.core.expression.F.CN1;
import static org.matheclipse.core.expression.F.CNI;
import static org.matheclipse.core.expression.F.CNPiHalf;
import static org.matheclipse.core.expression.F.DirectedInfinity;
import static org.matheclipse.core.expression.F.E;
import static org.matheclipse.core.expression.F.Exp;
import static org.matheclipse.core.expression.F.IInit;
import static org.matheclipse.core.expression.F.ISet;
import static org.matheclipse.core.expression.F.List;
import static org.matheclipse.core.expression.F.Negate;
import static org.matheclipse.core.expression.F.Noo;
import static org.matheclipse.core.expression.F.Pi;
import static org.matheclipse.core.expression.F.ProductLog;
import static org.matheclipse.core.expression.F.Times;
import static org.matheclipse.core.expression.F.oo;

/**
 * <p>Generated by <code>org.matheclipse.core.preprocessor.RulePreprocessor</code>.</p>
 * <p>See GIT repository at: <a href="https://github.com/axkr/symja_android_library">github.com/axkr/symja_android_library under the tools directory</a>.</p>
 */
public interface ProductLogRules {
    /**
     * <ul>
     * <li>index 0 - number of equal rules in <code>RULES</code></li>
     * </ul>
     */
    final public static int[] SIZES = { 11, 0 };

    final public static IAST RULES = List(
            IInit(ProductLog, SIZES),
            // ProductLog(0)=0
            ISet(ProductLog(C0),
                    C0),
            // ProductLog((-1)*1/2*Pi)=I*Pi/2
    ISet(ProductLog(CNPiHalf),
                    Times(CC(0L,1L,1L,2L),Pi)),
            // ProductLog(-1/E)=-1
            ISet(ProductLog(Negate(Exp(CN1))),
                    CN1),
            // ProductLog(E)=1
            ISet(ProductLog(E),
                    C1),
            // ProductLog(-1,-Pi/2)=-1/2*Pi*I
    ISet(ProductLog(CN1,CNPiHalf),
                    Times(CC(0L,1L,-1L,2L),Pi)),
            // ProductLog(-1,-1/E)=-1
            ISet(ProductLog(CN1,Negate(Exp(CN1))),
                    CN1),
            // ProductLog(Infinity)=Infinity
            ISet(ProductLog(oo),
                    oo),
            // ProductLog(-Infinity)=-Infinity
            ISet(ProductLog(Noo),
                    Noo),
            // ProductLog(I*Infinity)=Infinity
            ISet(ProductLog(DirectedInfinity(CI)),
                    oo),
            // ProductLog(-I*Infinity)=Infinity
            ISet(ProductLog(DirectedInfinity(CNI)),
                    oo),
            // ProductLog(ComplexInfinity)=Infinity
            ISet(ProductLog(CComplexInfinity),
      oo)
    );
}