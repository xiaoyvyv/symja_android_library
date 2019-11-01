package org.matheclipse.core.integrate.rubi;


import static org.matheclipse.core.expression.F.*;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.*;
import static org.matheclipse.core.integrate.rubi.UtilityFunctions.*;
import org.matheclipse.core.interfaces.IAST;

/** 
 * IndefiniteIntegrationRules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class IntRules191 { 
  public static IAST RULES = List( 
IIntegrate(3821,Integrate(Times(Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),QQ(3L,2L)),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),CN1D2)),x_Symbol),
    Condition(Subtract(Dist(Times(d,Power(b,CN1)),Integrate(Times(Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Sqrt(Times(d,Csc(Plus(e,Times(f,x)))))),x),x),Dist(Times(a,d,Power(b,CN1)),Integrate(Times(Sqrt(Times(d,Csc(Plus(e,Times(f,x))))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),CN1D2)),x),x)),And(FreeQ(List(a,b,d,e,f),x),EqQ(Subtract(Sqr(a),Sqr(b)),C0)))),
IIntegrate(3822,Integrate(Times(Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),n_),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),CN1D2)),x_Symbol),
    Condition(Plus(Simp(Times(CN2,Sqr(d),Cot(Plus(e,Times(f,x))),Power(Times(d,Csc(Plus(e,Times(f,x)))),Subtract(n,C2)),Power(Times(f,Subtract(Times(C2,n),C3),Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))))),CN1)),x),Dist(Times(Sqr(d),Power(Times(b,Subtract(Times(C2,n),C3)),CN1)),Integrate(Times(Power(Times(d,Csc(Plus(e,Times(f,x)))),Subtract(n,C2)),Subtract(Times(C2,b,Subtract(n,C2)),Times(a,Csc(Plus(e,Times(f,x))))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),CN1D2)),x),x)),And(FreeQ(List(a,b,d,e,f),x),EqQ(Subtract(Sqr(a),Sqr(b)),C0),GtQ(n,C2),IntegerQ(Times(C2,n))))),
IIntegrate(3823,Integrate(Times(Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),n_),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),CN1D2)),x_Symbol),
    Condition(Plus(Simp(Times(Cot(Plus(e,Times(f,x))),Power(Times(d,Csc(Plus(e,Times(f,x)))),n),Power(Times(f,n,Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))))),CN1)),x),Dist(Power(Times(C2,b,d,n),CN1),Integrate(Times(Power(Times(d,Csc(Plus(e,Times(f,x)))),Plus(n,C1)),Plus(a,Times(b,Plus(Times(C2,n),C1),Csc(Plus(e,Times(f,x))))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),CN1D2)),x),x)),And(FreeQ(List(a,b,d,e,f),x),EqQ(Subtract(Sqr(a),Sqr(b)),C0),LtQ(n,C0),IntegerQ(Times(C2,n))))),
IIntegrate(3824,Integrate(Times(Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),n_),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Sqr(d),Cot(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),m),Power(Times(d,Csc(Plus(e,Times(f,x)))),Subtract(n,C2)),Power(Times(f,Subtract(Plus(m,n),C1)),CN1)),x)),Dist(Times(Sqr(d),Power(Times(b,Subtract(Plus(m,n),C1)),CN1)),Integrate(Times(Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),m),Power(Times(d,Csc(Plus(e,Times(f,x)))),Subtract(n,C2)),Plus(Times(b,Subtract(n,C2)),Times(a,m,Csc(Plus(e,Times(f,x)))))),x),x)),And(FreeQ(List(a,b,d,e,f,m),x),EqQ(Subtract(Sqr(a),Sqr(b)),C0),GtQ(n,C2),NeQ(Subtract(Plus(m,n),C1),C0),IntegerQ(n)))),
IIntegrate(3825,Integrate(Times(Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),n_),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_)),x_Symbol),
    Condition(Negate(Dist(Times(Power(Times(a,d,Power(b,CN1)),n),Cot(Plus(e,Times(f,x))),Power(Times(Power(a,Subtract(n,C2)),f,Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Sqrt(Subtract(a,Times(b,Csc(Plus(e,Times(f,x))))))),CN1)),Subst(Integrate(Times(Power(Subtract(a,x),Subtract(n,C1)),Power(Subtract(Times(C2,a),x),Subtract(m,C1D2)),Power(x,CN1D2)),x),x,Subtract(a,Times(b,Csc(Plus(e,Times(f,x)))))),x)),And(FreeQ(List(a,b,d,e,f,m,n),x),EqQ(Subtract(Sqr(a),Sqr(b)),C0),Not(IntegerQ(m)),GtQ(a,C0),Not(IntegerQ(n)),GtQ(Times(a,d,Power(b,CN1)),C0)))),
IIntegrate(3826,Integrate(Times(Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),n_),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_)),x_Symbol),
    Condition(Negate(Dist(Times(Power(Times(CN1,a,d,Power(b,CN1)),n),Cot(Plus(e,Times(f,x))),Power(Times(Power(a,Subtract(n,C1)),f,Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Sqrt(Subtract(a,Times(b,Csc(Plus(e,Times(f,x))))))),CN1)),Subst(Integrate(Times(Power(x,Subtract(m,C1D2)),Power(Subtract(a,x),Subtract(n,C1)),Power(Subtract(Times(C2,a),x),CN1D2)),x),x,Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),x)),And(FreeQ(List(a,b,d,e,f,m,n),x),EqQ(Subtract(Sqr(a),Sqr(b)),C0),Not(IntegerQ(m)),GtQ(a,C0),Not(IntegerQ(n)),LtQ(Times(a,d,Power(b,CN1)),C0)))),
IIntegrate(3827,Integrate(Times(Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),n_DEFAULT),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_)),x_Symbol),
    Condition(Dist(Times(Sqr(a),d,Cot(Plus(e,Times(f,x))),Power(Times(f,Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Sqrt(Subtract(a,Times(b,Csc(Plus(e,Times(f,x))))))),CN1)),Subst(Integrate(Times(Power(Times(d,x),Subtract(n,C1)),Power(Plus(a,Times(b,x)),Subtract(m,C1D2)),Power(Subtract(a,Times(b,x)),CN1D2)),x),x,Csc(Plus(e,Times(f,x)))),x),And(FreeQ(List(a,b,d,e,f,m,n),x),EqQ(Subtract(Sqr(a),Sqr(b)),C0),Not(IntegerQ(m)),GtQ(a,C0)))),
IIntegrate(3828,Integrate(Times(Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),n_DEFAULT),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_)),x_Symbol),
    Condition(Dist(Times(Power(a,IntPart(m)),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),FracPart(m)),Power(Power(Plus(C1,Times(b,Csc(Plus(e,Times(f,x))),Power(a,CN1))),FracPart(m)),CN1)),Integrate(Times(Power(Plus(C1,Times(b,Csc(Plus(e,Times(f,x))),Power(a,CN1))),m),Power(Times(d,Csc(Plus(e,Times(f,x)))),n)),x),x),And(FreeQ(List(a,b,d,e,f,m,n),x),EqQ(Subtract(Sqr(a),Sqr(b)),C0),Not(IntegerQ(m)),Not(GtQ(a,C0))))),
IIntegrate(3829,Integrate(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),Sqrt(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_))),x_Symbol),
    Condition(Plus(Dist(Subtract(a,b),Integrate(Times(Csc(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),CN1D2)),x),x),Dist(b,Integrate(Times(Csc(Plus(e,Times(f,x))),Plus(C1,Csc(Plus(e,Times(f,x)))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),CN1D2)),x),x)),And(FreeQ(List(a,b,e,f),x),NeQ(Subtract(Sqr(a),Sqr(b)),C0)))),
IIntegrate(3830,Integrate(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,Cot(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Subtract(m,C1)),Power(Times(f,m),CN1)),x)),Dist(Power(m,CN1),Integrate(Times(Csc(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Subtract(m,C2)),Plus(Times(Sqr(b),Subtract(m,C1)),Times(Sqr(a),m),Times(a,b,Subtract(Times(C2,m),C1),Csc(Plus(e,Times(f,x)))))),x),x)),And(FreeQ(List(a,b,e,f),x),NeQ(Subtract(Sqr(a),Sqr(b)),C0),GtQ(m,C1),IntegerQ(Times(C2,m))))),
IIntegrate(3831,Integrate(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),CN1)),x_Symbol),
    Condition(Dist(Power(b,CN1),Integrate(Power(Plus(C1,Times(a,Sin(Plus(e,Times(f,x))),Power(b,CN1))),CN1),x),x),And(FreeQ(List(a,b,e,f),x),NeQ(Subtract(Sqr(a),Sqr(b)),C0)))),
IIntegrate(3832,Integrate(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),CN1D2)),x_Symbol),
    Condition(Simp(Times(CN2,Rt(Plus(a,b),C2),Sqrt(Times(b,Subtract(C1,Csc(Plus(e,Times(f,x)))),Power(Plus(a,b),CN1))),Sqrt(Times(CN1,b,Plus(C1,Csc(Plus(e,Times(f,x)))),Power(Subtract(a,b),CN1))),EllipticF(ArcSin(Times(Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Power(Rt(Plus(a,b),C2),CN1))),Times(Plus(a,b),Power(Subtract(a,b),CN1))),Power(Times(b,f,Cot(Plus(e,Times(f,x)))),CN1)),x),And(FreeQ(List(a,b,e,f),x),NeQ(Subtract(Sqr(a),Sqr(b)),C0)))),
IIntegrate(3833,Integrate(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,Cot(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(f,Plus(m,C1),Subtract(Sqr(a),Sqr(b))),CN1)),x)),Dist(Power(Times(Plus(m,C1),Subtract(Sqr(a),Sqr(b))),CN1),Integrate(Times(Csc(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,C1)),Subtract(Times(a,Plus(m,C1)),Times(b,Plus(m,C2),Csc(Plus(e,Times(f,x)))))),x),x)),And(FreeQ(List(a,b,e,f),x),NeQ(Subtract(Sqr(a),Sqr(b)),C0),LtQ(m,CN1),IntegerQ(Times(C2,m))))),
IIntegrate(3834,Integrate(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_)),x_Symbol),
    Condition(Dist(Times(Cot(Plus(e,Times(f,x))),Power(Times(f,Sqrt(Plus(C1,Csc(Plus(e,Times(f,x))))),Sqrt(Subtract(C1,Csc(Plus(e,Times(f,x)))))),CN1)),Subst(Integrate(Times(Power(Plus(a,Times(b,x)),m),Power(Times(Sqrt(Plus(C1,x)),Sqrt(Subtract(C1,x))),CN1)),x),x,Csc(Plus(e,Times(f,x)))),x),And(FreeQ(List(a,b,e,f,m),x),NeQ(Subtract(Sqr(a),Sqr(b)),C0),Not(IntegerQ(Times(C2,m)))))),
IIntegrate(3835,Integrate(Times(Sqr($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Cot(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),m),Power(Times(f,Plus(m,C1)),CN1)),x)),Dist(Times(m,Power(Plus(m,C1),CN1)),Integrate(Times(Csc(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Subtract(m,C1)),Plus(b,Times(a,Csc(Plus(e,Times(f,x)))))),x),x)),And(FreeQ(List(a,b,e,f),x),NeQ(Subtract(Sqr(a),Sqr(b)),C0),GtQ(m,C0)))),
IIntegrate(3836,Integrate(Times(Sqr($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_)),x_Symbol),
    Condition(Subtract(Simp(Times(a,Cot(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(f,Plus(m,C1),Subtract(Sqr(a),Sqr(b))),CN1)),x),Dist(Power(Times(Plus(m,C1),Subtract(Sqr(a),Sqr(b))),CN1),Integrate(Times(Csc(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,C1)),Subtract(Times(b,Plus(m,C1)),Times(a,Plus(m,C2),Csc(Plus(e,Times(f,x)))))),x),x)),And(FreeQ(List(a,b,e,f),x),NeQ(Subtract(Sqr(a),Sqr(b)),C0),LtQ(m,CN1)))),
IIntegrate(3837,Integrate(Times(Sqr($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),CN1D2)),x_Symbol),
    Condition(Plus(Negate(Integrate(Times(Csc(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),CN1D2)),x)),Integrate(Times(Csc(Plus(e,Times(f,x))),Plus(C1,Csc(Plus(e,Times(f,x)))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),CN1D2)),x)),And(FreeQ(List(a,b,e,f),x),NeQ(Subtract(Sqr(a),Sqr(b)),C0)))),
IIntegrate(3838,Integrate(Times(Sqr($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_)),x_Symbol),
    Condition(Plus(Negate(Dist(Times(a,Power(b,CN1)),Integrate(Times(Csc(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),m)),x),x)),Dist(Power(b,CN1),Integrate(Times(Csc(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,C1))),x),x)),And(FreeQ(List(a,b,e,f,m),x),NeQ(Subtract(Sqr(a),Sqr(b)),C0)))),
IIntegrate(3839,Integrate(Times(Power($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),C3),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Sqr(a),Cot(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(b,f,Plus(m,C1),Subtract(Sqr(a),Sqr(b))),CN1)),x)),Dist(Power(Times(b,Plus(m,C1),Subtract(Sqr(a),Sqr(b))),CN1),Integrate(Times(Csc(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,C1)),Simp(Subtract(Times(a,b,Plus(m,C1)),Times(Plus(Sqr(a),Times(Sqr(b),Plus(m,C1))),Csc(Plus(e,Times(f,x))))),x)),x),x)),And(FreeQ(List(a,b,e,f),x),NeQ(Subtract(Sqr(a),Sqr(b)),C0),LtQ(m,CN1)))),
IIntegrate(3840,Integrate(Times(Power($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),C3),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Cot(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(b,f,Plus(m,C2)),CN1)),x)),Dist(Power(Times(b,Plus(m,C2)),CN1),Integrate(Times(Csc(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),m),Subtract(Times(b,Plus(m,C1)),Times(a,Csc(Plus(e,Times(f,x)))))),x),x)),And(FreeQ(List(a,b,e,f,m),x),NeQ(Subtract(Sqr(a),Sqr(b)),C0),Not(LtQ(m,CN1)))))
  );
}
