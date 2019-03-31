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
public class IntRules52 { 

	public static void initialize() {
		Initializer.init();
	}

	private static class Initializer  {

		private static void init() {
IIntegrate(2601,Int(Times(Power(Times(a_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_DEFAULT),Power(Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Dist(Times(Power(Cos(Plus(e,Times(f,x))),n),Power(Times(b,Tan(Plus(e,Times(f,x)))),n),Power(Power(Times(a,Sin(Plus(e,Times(f,x)))),n),CN1)),Int(Times(Power(Times(a,Sin(Plus(e,Times(f,x)))),Plus(m,n)),Power(Power(Cos(Plus(e,Times(f,x))),n),CN1)),x),x),And(FreeQ(List(a,b,e,f,m,n),x),Not(IntegerQ(n)),Or(ILtQ(m,C0),And(EqQ(m,C1),EqQ(n,Negate(C1D2))),IntegersQ(Subtract(m,C1D2),Subtract(n,C1D2))))));
IIntegrate(2602,Int(Times(Power(Times(a_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_DEFAULT),Power(Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Dist(Times(a,Power(Cos(Plus(e,Times(f,x))),Plus(n,C1)),Power(Times(b,Tan(Plus(e,Times(f,x)))),Plus(n,C1)),Power(Times(b,Power(Times(a,Sin(Plus(e,Times(f,x)))),Plus(n,C1))),CN1)),Int(Times(Power(Times(a,Sin(Plus(e,Times(f,x)))),Plus(m,n)),Power(Power(Cos(Plus(e,Times(f,x))),n),CN1)),x),x),And(FreeQ(List(a,b,e,f,m,n),x),Not(IntegerQ(n)))));
IIntegrate(2603,Int(Times(Power(Times($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),a_DEFAULT),m_),Power(Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Dist(Times(Power(Times(a,Cos(Plus(e,Times(f,x)))),FracPart(m)),Power(Times(Sec(Plus(e,Times(f,x))),Power(a,CN1)),FracPart(m))),Int(Times(Power(Times(b,Tan(Plus(e,Times(f,x)))),n),Power(Power(Times(Sec(Plus(e,Times(f,x))),Power(a,CN1)),m),CN1)),x),x),And(FreeQ(List(a,b,e,f,m,n),x),Not(IntegerQ(m)),Not(IntegerQ(n)))));
IIntegrate(2604,Int(Times(Power(Times($($s("§cot"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),a_DEFAULT),m_),Power(Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Dist(Times(Power(Times(a,Cot(Plus(e,Times(f,x)))),m),Power(Times(b,Tan(Plus(e,Times(f,x)))),m)),Int(Power(Times(b,Tan(Plus(e,Times(f,x)))),Subtract(n,m)),x),x),And(FreeQ(List(a,b,e,f,m,n),x),Not(IntegerQ(m)),Not(IntegerQ(n)))));
IIntegrate(2605,Int(Times(Power(Times(a_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_DEFAULT),Power(Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Negate(Simp(Times(Power(Times(a,Sec(Plus(e,Times(f,x)))),m),Power(Times(b,Tan(Plus(e,Times(f,x)))),Plus(n,C1)),Power(Times(b,f,m),CN1)),x)),And(FreeQ(List(a,b,e,f,m,n),x),EqQ(Plus(m,n,C1),C0))));
IIntegrate(2606,Int(Times(Power(Times(a_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_DEFAULT),Power(Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Dist(Times(a,Power(f,CN1)),Subst(Int(Times(Power(Times(a,x),Subtract(m,C1)),Power(Plus(CN1,Sqr(x)),Times(C1D2,Subtract(n,C1)))),x),x,Sec(Plus(e,Times(f,x)))),x),And(FreeQ(List(a,e,f,m),x),IntegerQ(Times(C1D2,Subtract(n,C1))),Not(And(IntegerQ(Times(C1D2,m)),LtQ(C0,m,Plus(n,C1)))))));
IIntegrate(2607,Int(Times(Power($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),m_),Power(Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Dist(Power(f,CN1),Subst(Int(Times(Power(Times(b,x),n),Power(Plus(C1,Sqr(x)),Subtract(Times(C1D2,m),C1))),x),x,Tan(Plus(e,Times(f,x)))),x),And(FreeQ(List(b,e,f,n),x),IntegerQ(Times(C1D2,m)),Not(And(IntegerQ(Times(C1D2,Subtract(n,C1))),LtQ(C0,n,Subtract(m,C1)))))));
IIntegrate(2608,Int(Times(Power(Times(a_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_DEFAULT),Power(Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Subtract(Simp(Times(Sqr(a),Power(Times(a,Sec(Plus(e,Times(f,x)))),Subtract(m,C2)),Power(Times(b,Tan(Plus(e,Times(f,x)))),Plus(n,C1)),Power(Times(b,f,Plus(n,C1)),CN1)),x),Dist(Times(Sqr(a),Subtract(m,C2),Power(Times(Sqr(b),Plus(n,C1)),CN1)),Int(Times(Power(Times(a,Sec(Plus(e,Times(f,x)))),Subtract(m,C2)),Power(Times(b,Tan(Plus(e,Times(f,x)))),Plus(n,C2))),x),x)),And(FreeQ(List(a,b,e,f),x),LtQ(n,CN1),Or(GtQ(m,C1),And(EqQ(m,C1),EqQ(n,QQ(-3L,2L)))),IntegersQ(Times(C2,m),Times(C2,n)))));
IIntegrate(2609,Int(Times(Power(Times(a_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_DEFAULT),Power(Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Subtract(Simp(Times(Power(Times(a,Sec(Plus(e,Times(f,x)))),m),Power(Times(b,Tan(Plus(e,Times(f,x)))),Plus(n,C1)),Power(Times(b,f,Plus(n,C1)),CN1)),x),Dist(Times(Plus(m,n,C1),Power(Times(Sqr(b),Plus(n,C1)),CN1)),Int(Times(Power(Times(a,Sec(Plus(e,Times(f,x)))),m),Power(Times(b,Tan(Plus(e,Times(f,x)))),Plus(n,C2))),x),x)),And(FreeQ(List(a,b,e,f,m),x),LtQ(n,CN1),IntegersQ(Times(C2,m),Times(C2,n)))));
IIntegrate(2610,Int(Times(Power(Times(a_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_),Power(Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Subtract(Simp(Times(b,Power(Times(a,Sec(Plus(e,Times(f,x)))),m),Power(Times(b,Tan(Plus(e,Times(f,x)))),Subtract(n,C1)),Power(Times(f,m),CN1)),x),Dist(Times(Sqr(b),Subtract(n,C1),Power(Times(Sqr(a),m),CN1)),Int(Times(Power(Times(a,Sec(Plus(e,Times(f,x)))),Plus(m,C2)),Power(Times(b,Tan(Plus(e,Times(f,x)))),Subtract(n,C2))),x),x)),And(FreeQ(List(a,b,e,f),x),GtQ(n,C1),Or(LtQ(m,CN1),And(EqQ(m,CN1),EqQ(n,QQ(3L,2L)))),IntegersQ(Times(C2,m),Times(C2,n)))));
IIntegrate(2611,Int(Times(Power(Times(a_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_DEFAULT),Power(Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Subtract(Simp(Times(b,Power(Times(a,Sec(Plus(e,Times(f,x)))),m),Power(Times(b,Tan(Plus(e,Times(f,x)))),Subtract(n,C1)),Power(Times(f,Subtract(Plus(m,n),C1)),CN1)),x),Dist(Times(Sqr(b),Subtract(n,C1),Power(Subtract(Plus(m,n),C1),CN1)),Int(Times(Power(Times(a,Sec(Plus(e,Times(f,x)))),m),Power(Times(b,Tan(Plus(e,Times(f,x)))),Subtract(n,C2))),x),x)),And(FreeQ(List(a,b,e,f,m),x),GtQ(n,C1),NeQ(Subtract(Plus(m,n),C1),C0),IntegersQ(Times(C2,m),Times(C2,n)))));
IIntegrate(2612,Int(Times(Power(Times(a_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_),Power(Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Times(a,Sec(Plus(e,Times(f,x)))),m),Power(Times(b,Tan(Plus(e,Times(f,x)))),Plus(n,C1)),Power(Times(b,f,m),CN1)),x)),Dist(Times(Plus(m,n,C1),Power(Times(Sqr(a),m),CN1)),Int(Times(Power(Times(a,Sec(Plus(e,Times(f,x)))),Plus(m,C2)),Power(Times(b,Tan(Plus(e,Times(f,x)))),n)),x),x)),And(FreeQ(List(a,b,e,f,n),x),Or(LtQ(m,CN1),And(EqQ(m,CN1),EqQ(n,Negate(C1D2)))),IntegersQ(Times(C2,m),Times(C2,n)))));
IIntegrate(2613,Int(Times(Power(Times(a_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_DEFAULT),Power(Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Plus(Simp(Times(Sqr(a),Power(Times(a,Sec(Plus(e,Times(f,x)))),Subtract(m,C2)),Power(Times(b,Tan(Plus(e,Times(f,x)))),Plus(n,C1)),Power(Times(b,f,Subtract(Plus(m,n),C1)),CN1)),x),Dist(Times(Sqr(a),Subtract(m,C2),Power(Subtract(Plus(m,n),C1),CN1)),Int(Times(Power(Times(a,Sec(Plus(e,Times(f,x)))),Subtract(m,C2)),Power(Times(b,Tan(Plus(e,Times(f,x)))),n)),x),x)),And(FreeQ(List(a,b,e,f,n),x),Or(GtQ(m,C1),And(EqQ(m,C1),EqQ(n,C1D2))),NeQ(Subtract(Plus(m,n),C1),C0),IntegersQ(Times(C2,m),Times(C2,n)))));
IIntegrate(2614,Int(Times($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),Power(Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),CN1D2)),x_Symbol),
    Condition(Dist(Times(Sqrt(Sin(Plus(e,Times(f,x)))),Power(Times(Sqrt(Cos(Plus(e,Times(f,x)))),Sqrt(Times(b,Tan(Plus(e,Times(f,x)))))),CN1)),Int(Power(Times(Sqrt(Cos(Plus(e,Times(f,x)))),Sqrt(Sin(Plus(e,Times(f,x))))),CN1),x),x),FreeQ(List(b,e,f),x)));
IIntegrate(2615,Int(Times(Power($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),CN1),Sqrt(Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),x_Symbol),
    Condition(Dist(Times(Sqrt(Cos(Plus(e,Times(f,x)))),Sqrt(Times(b,Tan(Plus(e,Times(f,x))))),Power(Sin(Plus(e,Times(f,x))),CN1D2)),Int(Times(Sqrt(Cos(Plus(e,Times(f,x)))),Sqrt(Sin(Plus(e,Times(f,x))))),x),x),FreeQ(List(b,e,f),x)));
IIntegrate(2616,Int(Times(Power(Times(a_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_),Power(Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Dist(Times(Power(a,Plus(m,n)),Power(Times(b,Tan(Plus(e,Times(f,x)))),n),Power(Times(Power(Times(a,Sec(Plus(e,Times(f,x)))),n),Power(Times(b,Sin(Plus(e,Times(f,x)))),n)),CN1)),Int(Times(Power(Times(b,Sin(Plus(e,Times(f,x)))),n),Power(Power(Cos(Plus(e,Times(f,x))),Plus(m,n)),CN1)),x),x),And(FreeQ(List(a,b,e,f,m,n),x),IntegerQ(Plus(n,C1D2)),IntegerQ(Plus(m,C1D2)))));
IIntegrate(2617,Int(Times(Power(Times(a_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_DEFAULT),Power(Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Simp(Times(Power(Times(a,Sec(Plus(e,Times(f,x)))),m),Power(Times(b,Tan(Plus(e,Times(f,x)))),Plus(n,C1)),Power(Sqr(Cos(Plus(e,Times(f,x)))),Times(C1D2,Plus(m,n,C1))),Hypergeometric2F1(Times(C1D2,Plus(n,C1)),Times(C1D2,Plus(m,n,C1)),Times(C1D2,Plus(n,C3)),Sqr(Sin(Plus(e,Times(f,x))))),Power(Times(b,f,Plus(n,C1)),CN1)),x),And(FreeQ(List(a,b,e,f,m,n),x),Not(IntegerQ(Times(C1D2,Subtract(n,C1)))),Not(IntegerQ(Times(C1D2,m))))));
IIntegrate(2618,Int(Times(Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),a_DEFAULT),m_),Power(Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Dist(Times(Power(Times(a,Csc(Plus(e,Times(f,x)))),FracPart(m)),Power(Times(Sin(Plus(e,Times(f,x))),Power(a,CN1)),FracPart(m))),Int(Times(Power(Times(b,Tan(Plus(e,Times(f,x)))),n),Power(Power(Times(Sin(Plus(e,Times(f,x))),Power(a,CN1)),m),CN1)),x),x),And(FreeQ(List(a,b,e,f,m,n),x),Not(IntegerQ(m)),Not(IntegerQ(n)))));
IIntegrate(2619,Int(Times(Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),a_DEFAULT),m_),Power(Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Simp(Times(a,b,Power(Times(a,Csc(Plus(e,Times(f,x)))),Subtract(m,C1)),Power(Times(b,Sec(Plus(e,Times(f,x)))),Subtract(n,C1)),Power(Times(f,Subtract(n,C1)),CN1)),x),And(FreeQ(List(a,b,e,f,m,n),x),EqQ(Subtract(Plus(m,n),C2),C0),NeQ(n,C1))));
IIntegrate(2620,Int(Times(Power($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),m_DEFAULT),Power($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),n_DEFAULT)),x_Symbol),
    Condition(Dist(Power(f,CN1),Subst(Int(Times(Power(Plus(C1,Sqr(x)),Subtract(Times(C1D2,Plus(m,n)),C1)),Power(Power(x,m),CN1)),x),x,Tan(Plus(e,Times(f,x)))),x),And(FreeQ(List(e,f),x),IntegersQ(m,n,Times(C1D2,Plus(m,n))))));
IIntegrate(2621,Int(Times(Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),a_DEFAULT),m_),Power($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),n_DEFAULT)),x_Symbol),
    Condition(Negate(Dist(Power(Times(f,Power(a,n)),CN1),Subst(Int(Times(Power(x,Subtract(Plus(m,n),C1)),Power(Power(Plus(CN1,Times(Sqr(x),Power(a,CN2))),Times(C1D2,Plus(n,C1))),CN1)),x),x,Times(a,Csc(Plus(e,Times(f,x))))),x)),And(FreeQ(List(a,e,f,m),x),IntegerQ(Times(C1D2,Plus(n,C1))),Not(And(IntegerQ(Times(C1D2,Plus(m,C1))),LtQ(C0,m,n))))));
IIntegrate(2622,Int(Times(Power($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),n_DEFAULT),Power(Times(a_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_)),x_Symbol),
    Condition(Dist(Power(Times(f,Power(a,n)),CN1),Subst(Int(Times(Power(x,Subtract(Plus(m,n),C1)),Power(Power(Plus(CN1,Times(Sqr(x),Power(a,CN2))),Times(C1D2,Plus(n,C1))),CN1)),x),x,Times(a,Sec(Plus(e,Times(f,x))))),x),And(FreeQ(List(a,e,f,m),x),IntegerQ(Times(C1D2,Plus(n,C1))),Not(And(IntegerQ(Times(C1D2,Plus(m,C1))),LtQ(C0,m,n))))));
IIntegrate(2623,Int(Times(Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),a_DEFAULT),m_),Power(Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(a,Power(Times(a,Csc(Plus(e,Times(f,x)))),Subtract(m,C1)),Power(Times(b,Sec(Plus(e,Times(f,x)))),Plus(n,C1)),Power(Times(f,b,Subtract(m,C1)),CN1)),x)),Dist(Times(Sqr(a),Plus(n,C1),Power(Times(Sqr(b),Subtract(m,C1)),CN1)),Int(Times(Power(Times(a,Csc(Plus(e,Times(f,x)))),Subtract(m,C2)),Power(Times(b,Sec(Plus(e,Times(f,x)))),Plus(n,C2))),x),x)),And(FreeQ(List(a,b,e,f),x),GtQ(m,C1),LtQ(n,CN1),IntegersQ(Times(C2,m),Times(C2,n)))));
IIntegrate(2624,Int(Times(Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),a_DEFAULT),m_),Power(Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Plus(Simp(Times(b,Power(Times(a,Csc(Plus(e,Times(f,x)))),Plus(m,C1)),Power(Times(b,Sec(Plus(e,Times(f,x)))),Subtract(n,C1)),Power(Times(f,a,Subtract(n,C1)),CN1)),x),Dist(Times(Sqr(b),Plus(m,C1),Power(Times(Sqr(a),Subtract(n,C1)),CN1)),Int(Times(Power(Times(a,Csc(Plus(e,Times(f,x)))),Plus(m,C2)),Power(Times(b,Sec(Plus(e,Times(f,x)))),Subtract(n,C2))),x),x)),And(FreeQ(List(a,b,e,f),x),GtQ(n,C1),LtQ(m,CN1),IntegersQ(Times(C2,m),Times(C2,n)))));
IIntegrate(2625,Int(Times(Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),a_DEFAULT),m_),Power(Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(a,b,Power(Times(a,Csc(Plus(e,Times(f,x)))),Subtract(m,C1)),Power(Times(b,Sec(Plus(e,Times(f,x)))),Subtract(n,C1)),Power(Times(f,Subtract(m,C1)),CN1)),x)),Dist(Times(Sqr(a),Subtract(Plus(m,n),C2),Power(Subtract(m,C1),CN1)),Int(Times(Power(Times(a,Csc(Plus(e,Times(f,x)))),Subtract(m,C2)),Power(Times(b,Sec(Plus(e,Times(f,x)))),n)),x),x)),And(FreeQ(List(a,b,e,f,n),x),GtQ(m,C1),IntegersQ(Times(C2,m),Times(C2,n)),Not(GtQ(n,m)))));
IIntegrate(2626,Int(Times(Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),a_DEFAULT),m_DEFAULT),Power(Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Plus(Simp(Times(a,b,Power(Times(a,Csc(Plus(e,Times(f,x)))),Subtract(m,C1)),Power(Times(b,Sec(Plus(e,Times(f,x)))),Subtract(n,C1)),Power(Times(f,Subtract(n,C1)),CN1)),x),Dist(Times(Sqr(b),Subtract(Plus(m,n),C2),Power(Subtract(n,C1),CN1)),Int(Times(Power(Times(a,Csc(Plus(e,Times(f,x)))),m),Power(Times(b,Sec(Plus(e,Times(f,x)))),Subtract(n,C2))),x),x)),And(FreeQ(List(a,b,e,f,m),x),GtQ(n,C1),IntegersQ(Times(C2,m),Times(C2,n)))));
IIntegrate(2627,Int(Times(Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),a_DEFAULT),m_),Power(Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(b,Power(Times(a,Csc(Plus(e,Times(f,x)))),Plus(m,C1)),Power(Times(b,Sec(Plus(e,Times(f,x)))),Subtract(n,C1)),Power(Times(a,f,Plus(m,n)),CN1)),x),Dist(Times(Plus(m,C1),Power(Times(Sqr(a),Plus(m,n)),CN1)),Int(Times(Power(Times(a,Csc(Plus(e,Times(f,x)))),Plus(m,C2)),Power(Times(b,Sec(Plus(e,Times(f,x)))),n)),x),x)),And(FreeQ(List(a,b,e,f,n),x),LtQ(m,CN1),NeQ(Plus(m,n),C0),IntegersQ(Times(C2,m),Times(C2,n)))));
IIntegrate(2628,Int(Times(Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),a_DEFAULT),m_DEFAULT),Power(Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(a,Power(Times(a,Csc(Plus(e,Times(f,x)))),Subtract(m,C1)),Power(Times(b,Sec(Plus(e,Times(f,x)))),Plus(n,C1)),Power(Times(b,f,Plus(m,n)),CN1)),x)),Dist(Times(Plus(n,C1),Power(Times(Sqr(b),Plus(m,n)),CN1)),Int(Times(Power(Times(a,Csc(Plus(e,Times(f,x)))),m),Power(Times(b,Sec(Plus(e,Times(f,x)))),Plus(n,C2))),x),x)),And(FreeQ(List(a,b,e,f,m),x),LtQ(n,CN1),NeQ(Plus(m,n),C0),IntegersQ(Times(C2,m),Times(C2,n)))));
IIntegrate(2629,Int(Times(Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),a_DEFAULT),m_),Power(Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Dist(Times(Power(Times(a,Csc(Plus(e,Times(f,x)))),m),Power(Times(b,Sec(Plus(e,Times(f,x)))),n),Power(Power(Tan(Plus(e,Times(f,x))),n),CN1)),Int(Power(Tan(Plus(e,Times(f,x))),n),x),x),And(FreeQ(List(a,b,e,f,m,n),x),Not(IntegerQ(n)),EqQ(Plus(m,n),C0))));
IIntegrate(2630,Int(Times(Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),a_DEFAULT),m_),Power(Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Dist(Times(Power(Times(a,Csc(Plus(e,Times(f,x)))),m),Power(Times(b,Sec(Plus(e,Times(f,x)))),n),Power(Times(a,Sin(Plus(e,Times(f,x)))),m),Power(Times(b,Cos(Plus(e,Times(f,x)))),n)),Int(Power(Times(Power(Times(a,Sin(Plus(e,Times(f,x)))),m),Power(Times(b,Cos(Plus(e,Times(f,x)))),n)),CN1),x),x),And(FreeQ(List(a,b,e,f,m,n),x),IntegerQ(Subtract(m,C1D2)),IntegerQ(Subtract(n,C1D2)))));
IIntegrate(2631,Int(Times(Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),a_DEFAULT),m_),Power(Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Dist(Times(Sqr(a),Power(Times(a,Csc(Plus(e,Times(f,x)))),Subtract(m,C1)),Power(Times(b,Sec(Plus(e,Times(f,x)))),Plus(n,C1)),Power(Times(a,Sin(Plus(e,Times(f,x)))),Subtract(m,C1)),Power(Times(b,Cos(Plus(e,Times(f,x)))),Plus(n,C1)),Power(b,CN2)),Int(Power(Times(Power(Times(a,Sin(Plus(e,Times(f,x)))),m),Power(Times(b,Cos(Plus(e,Times(f,x)))),n)),CN1),x),x),And(FreeQ(List(a,b,e,f,m,n),x),Not(SimplerQ(Negate(m),Negate(n))))));
IIntegrate(2632,Int(Times(Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),n_),Power(Times(a_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_)),x_Symbol),
    Condition(Dist(Times(Sqr(a),Power(Times(a,Sec(Plus(e,Times(f,x)))),Subtract(m,C1)),Power(Times(b,Csc(Plus(e,Times(f,x)))),Plus(n,C1)),Power(Times(a,Cos(Plus(e,Times(f,x)))),Subtract(m,C1)),Power(Times(b,Sin(Plus(e,Times(f,x)))),Plus(n,C1)),Power(b,CN2)),Int(Power(Times(Power(Times(a,Cos(Plus(e,Times(f,x)))),m),Power(Times(b,Sin(Plus(e,Times(f,x)))),n)),CN1),x),x),FreeQ(List(a,b,e,f,m,n),x)));
IIntegrate(2633,Int(Power($($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),n_),x_Symbol),
    Condition(Negate(Dist(Power(d,CN1),Subst(Int(Expand(Power(Subtract(C1,Sqr(x)),Times(C1D2,Subtract(n,C1))),x),x),x,Cos(Plus(c,Times(d,x)))),x)),And(FreeQ(List(c,d),x),IGtQ(Times(C1D2,Subtract(n,C1)),C0))));
IIntegrate(2634,Int(Sqr($($s("§sin"),Plus(c_DEFAULT,Times(C1D2,d_DEFAULT,x_)))),x_Symbol),
    Condition(Subtract(Simp(Times(C1D2,x),x),Simp(Times(Sin(Plus(Times(C2,c),Times(d,x))),Power(Times(C2,d),CN1)),x)),FreeQ(List(c,d),x)));
IIntegrate(2635,Int(Power(Times(b_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),n_),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,Cos(Plus(c,Times(d,x))),Power(Times(b,Sin(Plus(c,Times(d,x)))),Subtract(n,C1)),Power(Times(d,n),CN1)),x)),Dist(Times(Sqr(b),Subtract(n,C1),Power(n,CN1)),Int(Power(Times(b,Sin(Plus(c,Times(d,x)))),Subtract(n,C2)),x),x)),And(FreeQ(List(b,c,d),x),GtQ(n,C1),IntegerQ(Times(C2,n)))));
IIntegrate(2636,Int(Power(Times(b_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),n_),x_Symbol),
    Condition(Plus(Simp(Times(Cos(Plus(c,Times(d,x))),Power(Times(b,Sin(Plus(c,Times(d,x)))),Plus(n,C1)),Power(Times(b,d,Plus(n,C1)),CN1)),x),Dist(Times(Plus(n,C2),Power(Times(Sqr(b),Plus(n,C1)),CN1)),Int(Power(Times(b,Sin(Plus(c,Times(d,x)))),Plus(n,C2)),x),x)),And(FreeQ(List(b,c,d),x),LtQ(n,CN1),IntegerQ(Times(C2,n)))));
IIntegrate(2637,Int($($s("§sin"),Plus(Times(C1D2,Pi),c_DEFAULT,Times(d_DEFAULT,x_))),x_Symbol),
    Condition(Simp(Times(Sin(Plus(c,Times(d,x))),Power(d,CN1)),x),FreeQ(List(c,d),x)));
IIntegrate(2638,Int($($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),x_Symbol),
    Condition(Negate(Simp(Times(Cos(Plus(c,Times(d,x))),Power(d,CN1)),x)),FreeQ(List(c,d),x)));
IIntegrate(2639,Int(Sqrt($($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Simp(Times(C2,EllipticE(Times(C1D2,C1,Plus(c,Times(CN1,C1D2,Pi),Times(d,x))),C2),Power(d,CN1)),x),FreeQ(List(c,d),x)));
IIntegrate(2640,Int(Sqrt(Times(b_,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),x_Symbol),
    Condition(Dist(Times(Sqrt(Times(b,Sin(Plus(c,Times(d,x))))),Power(Sin(Plus(c,Times(d,x))),CN1D2)),Int(Sqrt(Sin(Plus(c,Times(d,x)))),x),x),FreeQ(List(b,c,d),x)));
IIntegrate(2641,Int(Power($($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),CN1D2),x_Symbol),
    Condition(Simp(Times(C2,EllipticF(Times(C1D2,C1,Plus(c,Times(CN1,C1D2,Pi),Times(d,x))),C2),Power(d,CN1)),x),FreeQ(List(c,d),x)));
IIntegrate(2642,Int(Power(Times(b_,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),CN1D2),x_Symbol),
    Condition(Dist(Times(Sqrt(Sin(Plus(c,Times(d,x)))),Power(Times(b,Sin(Plus(c,Times(d,x)))),CN1D2)),Int(Power(Sin(Plus(c,Times(d,x))),CN1D2),x),x),FreeQ(List(b,c,d),x)));
IIntegrate(2643,Int(Power(Times(b_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),n_),x_Symbol),
    Condition(Simp(Times(Cos(Plus(c,Times(d,x))),Power(Times(b,Sin(Plus(c,Times(d,x)))),Plus(n,C1)),Hypergeometric2F1(C1D2,Times(C1D2,Plus(n,C1)),Times(C1D2,Plus(n,C3)),Sqr(Sin(Plus(c,Times(d,x))))),Power(Times(b,d,Plus(n,C1),Sqrt(Sqr(Cos(Plus(c,Times(d,x)))))),CN1)),x),And(FreeQ(List(b,c,d,n),x),Not(IntegerQ(Times(C2,n))))));
IIntegrate(2644,Int(Sqr(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))))),x_Symbol),
    Condition(Plus(Simp(Times(C1D2,Plus(Times(C2,Sqr(a)),Sqr(b)),x),x),Negate(Simp(Times(C2,a,b,Cos(Plus(c,Times(d,x))),Power(d,CN1)),x)),Negate(Simp(Times(Sqr(b),Cos(Plus(c,Times(d,x))),Sin(Plus(c,Times(d,x))),Power(Times(C2,d),CN1)),x))),FreeQ(List(a,b,c,d),x)));
IIntegrate(2645,Int(Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),n_),x_Symbol),
    Condition(Int(ExpandTrig(Power(Plus(a,Times(b,$($s("§sin"),Plus(c,Times(d,x))))),n),x),x),And(FreeQ(List(a,b,c,d,n),x),EqQ(Subtract(Sqr(a),Sqr(b)),C0),IGtQ(n,C0))));
IIntegrate(2646,Int(Sqrt(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))))),x_Symbol),
    Condition(Simp(Times(CN2,b,Cos(Plus(c,Times(d,x))),Power(Times(d,Sqrt(Plus(a,Times(b,Sin(Plus(c,Times(d,x))))))),CN1)),x),And(FreeQ(List(a,b,c,d),x),EqQ(Subtract(Sqr(a),Sqr(b)),C0))));
IIntegrate(2647,Int(Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),n_),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,Cos(Plus(c,Times(d,x))),Power(Plus(a,Times(b,Sin(Plus(c,Times(d,x))))),Subtract(n,C1)),Power(Times(d,n),CN1)),x)),Dist(Times(a,Subtract(Times(C2,n),C1),Power(n,CN1)),Int(Power(Plus(a,Times(b,Sin(Plus(c,Times(d,x))))),Subtract(n,C1)),x),x)),And(FreeQ(List(a,b,c,d),x),EqQ(Subtract(Sqr(a),Sqr(b)),C0),IGtQ(Subtract(n,C1D2),C0))));
IIntegrate(2648,Int(Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),CN1),x_Symbol),
    Condition(Negate(Simp(Times(Cos(Plus(c,Times(d,x))),Power(Times(d,Plus(b,Times(a,Sin(Plus(c,Times(d,x)))))),CN1)),x)),And(FreeQ(List(a,b,c,d),x),EqQ(Subtract(Sqr(a),Sqr(b)),C0))));
IIntegrate(2649,Int(Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),CN1D2),x_Symbol),
    Condition(Dist(Times(CN2,Power(d,CN1)),Subst(Int(Power(Subtract(Times(C2,a),Sqr(x)),CN1),x),x,Times(b,Cos(Plus(c,Times(d,x))),Power(Plus(a,Times(b,Sin(Plus(c,Times(d,x))))),CN1D2))),x),And(FreeQ(List(a,b,c,d),x),EqQ(Subtract(Sqr(a),Sqr(b)),C0))));
IIntegrate(2650,Int(Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),n_),x_Symbol),
    Condition(Plus(Simp(Times(b,Cos(Plus(c,Times(d,x))),Power(Plus(a,Times(b,Sin(Plus(c,Times(d,x))))),n),Power(Times(a,d,Plus(Times(C2,n),C1)),CN1)),x),Dist(Times(Plus(n,C1),Power(Times(a,Plus(Times(C2,n),C1)),CN1)),Int(Power(Plus(a,Times(b,Sin(Plus(c,Times(d,x))))),Plus(n,C1)),x),x)),And(FreeQ(List(a,b,c,d),x),EqQ(Subtract(Sqr(a),Sqr(b)),C0),LtQ(n,CN1),IntegerQ(Times(C2,n)))));
  }
}
}
