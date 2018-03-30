package org.matheclipse.core.reflection.system.rules;

import org.matheclipse.core.interfaces.IAST;

import static org.matheclipse.core.expression.F.$;
import static org.matheclipse.core.expression.F.$p;
import static org.matheclipse.core.expression.F.C0;
import static org.matheclipse.core.expression.F.C1;
import static org.matheclipse.core.expression.F.C2;
import static org.matheclipse.core.expression.F.CN1;
import static org.matheclipse.core.expression.F.CN1D2;
import static org.matheclipse.core.expression.F.Condition;
import static org.matheclipse.core.expression.F.Cos;
import static org.matheclipse.core.expression.F.Derivative;
import static org.matheclipse.core.expression.F.DiracDelta;
import static org.matheclipse.core.expression.F.Exp;
import static org.matheclipse.core.expression.F.Factorial;
import static org.matheclipse.core.expression.F.FreeQ;
import static org.matheclipse.core.expression.F.Greater;
import static org.matheclipse.core.expression.F.IInit;
import static org.matheclipse.core.expression.F.ISetDelayed;
import static org.matheclipse.core.expression.F.If;
import static org.matheclipse.core.expression.F.IntegerQ;
import static org.matheclipse.core.expression.F.InverseLaplaceTransform;
import static org.matheclipse.core.expression.F.Less;
import static org.matheclipse.core.expression.F.List;
import static org.matheclipse.core.expression.F.Negate;
import static org.matheclipse.core.expression.F.NumberQ;
import static org.matheclipse.core.expression.F.Plus;
import static org.matheclipse.core.expression.F.Power;
import static org.matheclipse.core.expression.F.RealNumberQ;
import static org.matheclipse.core.expression.F.Sin;
import static org.matheclipse.core.expression.F.Sqr;
import static org.matheclipse.core.expression.F.Sqrt;
import static org.matheclipse.core.expression.F.Times;
import static org.matheclipse.core.expression.F.a;
import static org.matheclipse.core.expression.F.a_;
import static org.matheclipse.core.expression.F.n;
import static org.matheclipse.core.expression.F.s;
import static org.matheclipse.core.expression.F.s_;
import static org.matheclipse.core.expression.F.t;
import static org.matheclipse.core.expression.F.t_;

/**
 * <p>Generated by <code>org.matheclipse.core.preprocessor.RulePreprocessor</code>.</p>
 * <p>See GIT repository at: <a href="https://github.com/axkr/symja_android_library">github.com/axkr/symja_android_library under the tools directory</a>.</p>
 */
public interface InverseLaplaceTransformRules {
    /**
     * <ul>
     * <li>index 0 - number of equal rules in <code>RULES</code></li>
     * </ul>
     */
    final public static int[] SIZES = { 0, 8 };

    final public static IAST RULES = List(
            IInit(InverseLaplaceTransform, SIZES),
            // InverseLaplaceTransform(s_,s_,t_):=DiracDelta'(t)
            ISetDelayed(InverseLaplaceTransform(s_,s_,t_),
                    $($(Derivative(C1),DiracDelta),t)),
            // InverseLaplaceTransform(1/s_,s_,t_):=1
            ISetDelayed(InverseLaplaceTransform(Power(s_,-1),s_,t_),
                    C1),
            // InverseLaplaceTransform(s_^n_IntegerQ,s_,t_):=1/(t^(1+n)*(-1-n)!)/;n<-1
            ISetDelayed(InverseLaplaceTransform(Power(s_,$p(n,IntegerQ)),s_,t_),
                    Condition(Times(Power(t,Plus(CN1,Negate(n))),Power(Factorial(Plus(CN1,Negate(n))),-1)),Less(n,CN1))),
            // InverseLaplaceTransform(1/(s_+a_),s_,t_):=E^(-a*t)/;FreeQ(a,s)
            ISetDelayed(InverseLaplaceTransform(Power(Plus(a_,s_),-1),s_,t_),
                    Condition(Exp(Times(CN1,a,t)),FreeQ(a,s))),
            // InverseLaplaceTransform(1/(a_RealNumberQ+s_^2),s_,t_):=If(a>0,Sin(Sqrt(a)*t)/Sqrt(a),(-1+E^(2*Sqrt(-a)*t))/(E^(Sqrt(-a)*t)*2*Sqrt(-a)))
            ISetDelayed(InverseLaplaceTransform(Power(Plus($p(a,RealNumberQ),Sqr(s_)),-1),s_,t_),
                    If(Greater(a,C0),Times(Power(a,CN1D2),Sin(Times(Sqrt(a),t))),Times(Power(Times(Exp(Times(Sqrt(Negate(a)),t)),C2,Sqrt(Negate(a))),-1),Plus(CN1,Exp(Times(C2,Sqrt(Negate(a)),t)))))),
            // InverseLaplaceTransform(s_/(s_^2+a_NumberQ),s_,t_):=Cos(Sqrt(a)*t)/;a>0
            ISetDelayed(InverseLaplaceTransform(Times(s_,Power(Plus($p(a,NumberQ),Sqr(s_)),-1)),s_,t_),
                    Condition(Cos(Times(Sqrt(a),t)),Greater(a,C0))),
            // InverseLaplaceTransform(1/(s_^2+a_^2),s_,t_):=Sin(a*t)/a/;FreeQ(a,s)
            ISetDelayed(InverseLaplaceTransform(Power(Plus(Sqr(a_),Sqr(s_)),-1),s_,t_),
                    Condition(Times(Power(a,-1),Sin(Times(a,t))),FreeQ(a,s))),
            // InverseLaplaceTransform(1/(-a_^2+s_^2),s_,t_):=(-1+E^(2*a*t))/(E^(a*t)*2*a)/;FreeQ(a,s)
            ISetDelayed(InverseLaplaceTransform(Power(Plus(Negate(Sqr(a_)),Sqr(s_)),-1),s_,t_),
                    Condition(Times(Power(Times(Exp(Times(a,t)),C2,a),-1),Plus(CN1,Exp(Times(C2,a,t)))),FreeQ(a,s))),
            // InverseLaplaceTransform(s_/(s_^2+a_^2),s_,t_):=Cos(a*t)/;FreeQ(a,s)
            ISetDelayed(InverseLaplaceTransform(Times(s_,Power(Plus(Sqr(a_),Sqr(s_)),-1)),s_,t_),
                    Condition(Cos(Times(a,t)),FreeQ(a,s)))
    );
}