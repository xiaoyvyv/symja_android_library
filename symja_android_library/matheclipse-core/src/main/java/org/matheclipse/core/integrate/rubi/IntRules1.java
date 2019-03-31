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
public class IntRules1 { 

	public static void initialize() {
		Initializer.init();
	}

	private static class Initializer  {

		private static void init() {
IIntegrate(51,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),m_),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),n_)),x_Symbol),
    Condition(Subtract(Simp(Times(Power(Plus(a,Times(b,x)),Plus(m,C1)),Power(Plus(c,Times(d,x)),Plus(n,C1)),Power(Times(Subtract(Times(b,c),Times(a,d)),Plus(m,C1)),CN1)),x),Dist(Times(d,Plus(m,n,C2),Power(Times(Subtract(Times(b,c),Times(a,d)),Plus(m,C1)),CN1)),Int(Times(Power(Plus(a,Times(b,x)),Plus(m,C1)),Power(Plus(c,Times(d,x)),n)),x),x)),And(FreeQ(List(a,b,c,d,n),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),LtQ(m,CN1),Not(And(LtQ(n,CN1),Or(EqQ(a,C0),And(NeQ(c,C0),LtQ(Subtract(m,n),C0),IntegerQ(n))))),IntLinearQ(a,b,c,d,m,n,x))));
IIntegrate(52,Int(Times(Power(Plus(a_,Times(b_DEFAULT,x_)),CN1D2),Power(Plus(c_,Times(d_DEFAULT,x_)),CN1D2)),x_Symbol),
    Condition(Simp(Times(ArcCosh(Times(b,x,Power(a,CN1))),Power(b,CN1)),x),And(FreeQ(List(a,b,c,d),x),EqQ(Plus(a,c),C0),EqQ(Subtract(b,d),C0),GtQ(a,C0))));
IIntegrate(53,Int(Times(Power(Plus(a_,Times(b_DEFAULT,x_)),CN1D2),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),CN1D2)),x_Symbol),
    Condition(Int(Power(Subtract(Subtract(Times(a,c),Times(b,Subtract(a,c),x)),Times(Sqr(b),Sqr(x))),CN1D2),x),And(FreeQ(List(a,b,c,d),x),EqQ(Plus(b,d),C0),GtQ(Plus(a,c),C0))));
IIntegrate(54,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),CN1D2),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),CN1D2)),x_Symbol),
    Condition(Dist(Times(C2,Power(b,CN1D2)),Subst(Int(Power(Plus(Times(b,c),Times(CN1,a,d),Times(d,Sqr(x))),CN1D2),x),x,Sqrt(Plus(a,Times(b,x)))),x),And(FreeQ(List(a,b,c,d),x),GtQ(Subtract(Times(b,c),Times(a,d)),C0),GtQ(b,C0))));
IIntegrate(55,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),CN1),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),CN1D3)),x_Symbol),
    Condition(With(List(Set(q,Rt(Times(Subtract(Times(b,c),Times(a,d)),Power(b,CN1)),C3))),Plus(Negate(Simp(Times(Log(RemoveContent(Plus(a,Times(b,x)),x)),Power(Times(C2,b,q),CN1)),x)),Dist(Times(C3,Power(Times(C2,b),CN1)),Subst(Int(Power(Plus(Sqr(q),Times(q,x),Sqr(x)),CN1),x),x,Power(Plus(c,Times(d,x)),C1D3)),x),Negate(Dist(Times(C3,Power(Times(C2,b,q),CN1)),Subst(Int(Power(Subtract(q,x),CN1),x),x,Power(Plus(c,Times(d,x)),C1D3)),x)))),And(FreeQ(List(a,b,c,d),x),PosQ(Times(Subtract(Times(b,c),Times(a,d)),Power(b,CN1))))));
IIntegrate(56,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),CN1),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),CN1D3)),x_Symbol),
    Condition(With(List(Set(q,Rt(Times(CN1,Subtract(Times(b,c),Times(a,d)),Power(b,CN1)),C3))),Plus(Simp(Times(Log(RemoveContent(Plus(a,Times(b,x)),x)),Power(Times(C2,b,q),CN1)),x),Dist(Times(C3,Power(Times(C2,b),CN1)),Subst(Int(Power(Plus(Sqr(q),Times(CN1,q,x),Sqr(x)),CN1),x),x,Power(Plus(c,Times(d,x)),C1D3)),x),Negate(Dist(Times(C3,Power(Times(C2,b,q),CN1)),Subst(Int(Power(Plus(q,x),CN1),x),x,Power(Plus(c,Times(d,x)),C1D3)),x)))),And(FreeQ(List(a,b,c,d),x),NegQ(Times(Subtract(Times(b,c),Times(a,d)),Power(b,CN1))))));
IIntegrate(57,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),CN1),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),QQ(-2L,3L))),x_Symbol),
    Condition(With(List(Set(q,Rt(Times(Subtract(Times(b,c),Times(a,d)),Power(b,CN1)),C3))),Plus(Negate(Simp(Times(Log(RemoveContent(Plus(a,Times(b,x)),x)),Power(Times(C2,b,Sqr(q)),CN1)),x)),Negate(Dist(Times(C3,Power(Times(C2,b,q),CN1)),Subst(Int(Power(Plus(Sqr(q),Times(q,x),Sqr(x)),CN1),x),x,Power(Plus(c,Times(d,x)),C1D3)),x)),Negate(Dist(Times(C3,Power(Times(C2,b,Sqr(q)),CN1)),Subst(Int(Power(Subtract(q,x),CN1),x),x,Power(Plus(c,Times(d,x)),C1D3)),x)))),And(FreeQ(List(a,b,c,d),x),PosQ(Times(Subtract(Times(b,c),Times(a,d)),Power(b,CN1))))));
IIntegrate(58,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),CN1),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),QQ(-2L,3L))),x_Symbol),
    Condition(With(List(Set(q,Rt(Times(CN1,Subtract(Times(b,c),Times(a,d)),Power(b,CN1)),C3))),Plus(Negate(Simp(Times(Log(RemoveContent(Plus(a,Times(b,x)),x)),Power(Times(C2,b,Sqr(q)),CN1)),x)),Dist(Times(C3,Power(Times(C2,b,q),CN1)),Subst(Int(Power(Plus(Sqr(q),Times(CN1,q,x),Sqr(x)),CN1),x),x,Power(Plus(c,Times(d,x)),C1D3)),x),Dist(Times(C3,Power(Times(C2,b,Sqr(q)),CN1)),Subst(Int(Power(Plus(q,x),CN1),x),x,Power(Plus(c,Times(d,x)),C1D3)),x))),And(FreeQ(List(a,b,c,d),x),NegQ(Times(Subtract(Times(b,c),Times(a,d)),Power(b,CN1))))));
IIntegrate(59,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),CN1D3),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),QQ(-2L,3L))),x_Symbol),
    Condition(With(List(Set(q,Rt(Times(d,Power(b,CN1)),C3))),Plus(Negate(Simp(Times(CSqrt3,q,ArcTan(Plus(Times(C2,q,Power(Plus(a,Times(b,x)),C1D3),Power(Times(CSqrt3,Power(Plus(c,Times(d,x)),C1D3)),CN1)),C1DSqrt3)),Power(d,CN1)),x)),Negate(Simp(Times(C3,q,Log(Subtract(Times(q,Power(Plus(a,Times(b,x)),C1D3),Power(Plus(c,Times(d,x)),CN1D3)),C1)),Power(Times(C2,d),CN1)),x)),Negate(Simp(Times(q,Log(Plus(c,Times(d,x))),Power(Times(C2,d),CN1)),x)))),And(FreeQ(List(a,b,c,d),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),PosQ(Times(d,Power(b,CN1))))));
IIntegrate(60,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),CN1D3),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),QQ(-2L,3L))),x_Symbol),
    Condition(With(List(Set(q,Rt(Times(CN1,d,Power(b,CN1)),C3))),Plus(Simp(Times(CSqrt3,q,ArcTan(Subtract(C1DSqrt3,Times(C2,q,Power(Plus(a,Times(b,x)),C1D3),Power(Times(CSqrt3,Power(Plus(c,Times(d,x)),C1D3)),CN1)))),Power(d,CN1)),x),Simp(Times(C3,q,Log(Plus(Times(q,Power(Plus(a,Times(b,x)),C1D3),Power(Plus(c,Times(d,x)),CN1D3)),C1)),Power(Times(C2,d),CN1)),x),Simp(Times(q,Log(Plus(c,Times(d,x))),Power(Times(C2,d),CN1)),x))),And(FreeQ(List(a,b,c,d),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),NegQ(Times(d,Power(b,CN1))))));
IIntegrate(61,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),m_),Power(Plus(c_,Times(d_DEFAULT,x_)),m_)),x_Symbol),
    Condition(Dist(Times(Power(Plus(a,Times(b,x)),m),Power(Plus(c,Times(d,x)),m),Power(Power(Plus(Times(a,c),Times(Plus(Times(b,c),Times(a,d)),x),Times(b,d,Sqr(x))),m),CN1)),Int(Power(Plus(Times(a,c),Times(Plus(Times(b,c),Times(a,d)),x),Times(b,d,Sqr(x))),m),x),x),And(FreeQ(List(a,b,c,d),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),LtQ(CN1,m,C0),LeQ(C3,Denominator(m),C4),AtomQ(Plus(Times(b,c),Times(a,d))))));
IIntegrate(62,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),m_),Power(Plus(c_,Times(d_DEFAULT,x_)),m_)),x_Symbol),
    Condition(Dist(Times(Power(Plus(a,Times(b,x)),m),Power(Plus(c,Times(d,x)),m),Power(Power(Times(Plus(a,Times(b,x)),Plus(c,Times(d,x))),m),CN1)),Int(Power(Plus(Times(a,c),Times(Plus(Times(b,c),Times(a,d)),x),Times(b,d,Sqr(x))),m),x),x),And(FreeQ(List(a,b,c,d),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),LtQ(CN1,m,C0),LeQ(C3,Denominator(m),C4))));
IIntegrate(63,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),m_),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),n_)),x_Symbol),
    Condition(With(List(Set(p,Denominator(m))),Dist(Times(p,Power(b,CN1)),Subst(Int(Times(Power(x,Subtract(Times(p,Plus(m,C1)),C1)),Power(Plus(c,Times(CN1,a,d,Power(b,CN1)),Times(d,Power(x,p),Power(b,CN1))),n)),x),x,Power(Plus(a,Times(b,x)),Power(p,CN1))),x)),And(FreeQ(List(a,b,c,d),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),LtQ(CN1,m,C0),LeQ(CN1,n,C0),LeQ(Denominator(n),Denominator(m)),IntLinearQ(a,b,c,d,m,n,x))));
IIntegrate(64,Int(Times(Power(Times(b_DEFAULT,x_),m_),Power(Plus(c_,Times(d_DEFAULT,x_)),n_)),x_Symbol),
    Condition(Simp(Times(Power(c,n),Power(Times(b,x),Plus(m,C1)),Hypergeometric2F1(Negate(n),Plus(m,C1),Plus(m,C2),Times(CN1,d,x,Power(c,CN1))),Power(Times(b,Plus(m,C1)),CN1)),x),And(FreeQ(List(b,c,d,m,n),x),Not(IntegerQ(m)),Or(IntegerQ(n),And(GtQ(c,C0),Not(And(EqQ(n,Negate(C1D2)),EqQ(Subtract(Sqr(c),Sqr(d)),C0),GtQ(Times(CN1,d,Power(Times(b,c),CN1)),C0))))))));
IIntegrate(65,Int(Times(Power(Times(b_DEFAULT,x_),m_),Power(Plus(c_,Times(d_DEFAULT,x_)),n_)),x_Symbol),
    Condition(Simp(Times(Power(Plus(c,Times(d,x)),Plus(n,C1)),Hypergeometric2F1(Negate(m),Plus(n,C1),Plus(n,C2),Plus(C1,Times(d,x,Power(c,CN1)))),Power(Times(d,Plus(n,C1),Power(Times(CN1,d,Power(Times(b,c),CN1)),m)),CN1)),x),And(FreeQ(List(b,c,d,m,n),x),Not(IntegerQ(n)),Or(IntegerQ(m),GtQ(Times(CN1,d,Power(Times(b,c),CN1)),C0)))));
IIntegrate(66,Int(Times(Power(Times(b_DEFAULT,x_),m_),Power(Plus(c_,Times(d_DEFAULT,x_)),n_)),x_Symbol),
    Condition(Dist(Times(Power(c,IntPart(n)),Power(Plus(c,Times(d,x)),FracPart(n)),Power(Power(Plus(C1,Times(d,x,Power(c,CN1))),FracPart(n)),CN1)),Int(Times(Power(Times(b,x),m),Power(Plus(C1,Times(d,x,Power(c,CN1))),n)),x),x),And(FreeQ(List(b,c,d,m,n),x),Not(IntegerQ(m)),Not(IntegerQ(n)),Not(GtQ(c,C0)),Not(GtQ(Times(CN1,d,Power(Times(b,c),CN1)),C0)),Or(And(RationalQ(m),Not(And(EqQ(n,Negate(C1D2)),EqQ(Subtract(Sqr(c),Sqr(d)),C0)))),Not(RationalQ(n))))));
IIntegrate(67,Int(Times(Power(Times(b_DEFAULT,x_),m_),Power(Plus(c_,Times(d_DEFAULT,x_)),n_)),x_Symbol),
    Condition(Dist(Times(Power(Times(CN1,b,c,Power(d,CN1)),IntPart(m)),Power(Times(b,x),FracPart(m)),Power(Power(Times(CN1,d,x,Power(c,CN1)),FracPart(m)),CN1)),Int(Times(Power(Times(CN1,d,x,Power(c,CN1)),m),Power(Plus(c,Times(d,x)),n)),x),x),And(FreeQ(List(b,c,d,m,n),x),Not(IntegerQ(m)),Not(IntegerQ(n)),Not(GtQ(c,C0)),Not(GtQ(Times(CN1,d,Power(Times(b,c),CN1)),C0)))));
IIntegrate(68,Int(Times(Power(Plus(a_,Times(b_DEFAULT,x_)),m_),Power(Plus(c_,Times(d_DEFAULT,x_)),n_)),x_Symbol),
    Condition(Simp(Times(Power(Subtract(Times(b,c),Times(a,d)),n),Power(Plus(a,Times(b,x)),Plus(m,C1)),Hypergeometric2F1(Negate(n),Plus(m,C1),Plus(m,C2),Times(CN1,d,Plus(a,Times(b,x)),Power(Subtract(Times(b,c),Times(a,d)),CN1))),Power(Times(Power(b,Plus(n,C1)),Plus(m,C1)),CN1)),x),And(FreeQ(List(a,b,c,d,m),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),Not(IntegerQ(m)),IntegerQ(n))));
IIntegrate(69,Int(Times(Power(Plus(a_,Times(b_DEFAULT,x_)),m_),Power(Plus(c_,Times(d_DEFAULT,x_)),n_)),x_Symbol),
    Condition(Simp(Times(Power(Plus(a,Times(b,x)),Plus(m,C1)),Hypergeometric2F1(Negate(n),Plus(m,C1),Plus(m,C2),Times(CN1,d,Plus(a,Times(b,x)),Power(Subtract(Times(b,c),Times(a,d)),CN1))),Power(Times(b,Plus(m,C1),Power(Times(b,Power(Subtract(Times(b,c),Times(a,d)),CN1)),n)),CN1)),x),And(FreeQ(List(a,b,c,d,m,n),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),Not(IntegerQ(m)),Not(IntegerQ(n)),GtQ(Times(b,Power(Subtract(Times(b,c),Times(a,d)),CN1)),C0),Or(RationalQ(m),Not(And(RationalQ(n),GtQ(Times(CN1,d,Power(Subtract(Times(b,c),Times(a,d)),CN1)),C0)))))));
IIntegrate(70,Int(Times(Power(Plus(a_,Times(b_DEFAULT,x_)),m_),Power(Plus(c_,Times(d_DEFAULT,x_)),n_)),x_Symbol),
    Condition(Dist(Times(Power(Plus(c,Times(d,x)),FracPart(n)),Power(Times(Power(Times(b,Power(Subtract(Times(b,c),Times(a,d)),CN1)),IntPart(n)),Power(Times(b,Plus(c,Times(d,x)),Power(Subtract(Times(b,c),Times(a,d)),CN1)),FracPart(n))),CN1)),Int(Times(Power(Plus(a,Times(b,x)),m),Power(Simp(Plus(Times(b,c,Power(Subtract(Times(b,c),Times(a,d)),CN1)),Times(b,d,x,Power(Subtract(Times(b,c),Times(a,d)),CN1))),x),n)),x),x),And(FreeQ(List(a,b,c,d,m,n),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),Not(IntegerQ(m)),Not(IntegerQ(n)),Or(RationalQ(m),Not(SimplerQ(Plus(n,C1),Plus(m,C1)))))));
IIntegrate(71,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,u_)),m_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,u_)),n_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Coefficient(u,x,C1),CN1),Subst(Int(Times(Power(Plus(a,Times(b,x)),m),Power(Plus(c,Times(d,x)),n)),x),x,u),x),And(FreeQ(List(a,b,c,d,m,n),x),LinearQ(u,x),NeQ(Coefficient(u,x,C0),C0))));
IIntegrate(72,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),CN1),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),CN1),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(e,Times(f,x)),p),Power(Times(Plus(a,Times(b,x)),Plus(c,Times(d,x))),CN1)),x),x),And(FreeQ(List(a,b,c,d,e,f),x),IntegerQ(p))));
IIntegrate(73,Int(Times(Power(Plus(a_,Times(b_DEFAULT,x_)),m_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,x_)),n_DEFAULT),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),p_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(Plus(Times(a,c),Times(b,d,Sqr(x))),m),Power(Plus(e,Times(f,x)),p)),x),And(FreeQ(List(a,b,c,d,e,f,m,n,p),x),EqQ(Plus(Times(b,c),Times(a,d)),C0),EqQ(n,m),IntegerQ(m))));
IIntegrate(74,Int(Times(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),n_DEFAULT),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),p_DEFAULT)),x_Symbol),
    Condition(Simp(Times(b,Power(Plus(c,Times(d,x)),Plus(n,C1)),Power(Plus(e,Times(f,x)),Plus(p,C1)),Power(Times(d,f,Plus(n,p,C2)),CN1)),x),And(FreeQ(List(a,b,c,d,e,f,n,p),x),NeQ(Plus(n,p,C2),C0),EqQ(Subtract(Times(a,d,f,Plus(n,p,C2)),Times(b,Plus(Times(d,e,Plus(n,C1)),Times(c,f,Plus(p,C1))))),C0))));
IIntegrate(75,Int(Times(Power(Times(d_DEFAULT,x_),n_DEFAULT),Plus(a_,Times(b_DEFAULT,x_)),Power(Plus(e_,Times(f_DEFAULT,x_)),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Plus(a,Times(b,x)),Power(Times(d,x),n),Power(Plus(e,Times(f,x)),p)),x),x),And(FreeQ(List(a,b,d,e,f,n),x),IGtQ(p,C0),EqQ(Plus(Times(b,e),Times(a,f)),C0),Not(And(ILtQ(Plus(n,p,C2),C0),GtQ(Plus(n,Times(C2,p)),C0))))));
IIntegrate(76,Int(Times(Power(Times(d_DEFAULT,x_),n_DEFAULT),Plus(a_,Times(b_DEFAULT,x_)),Power(Plus(e_,Times(f_DEFAULT,x_)),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Plus(a,Times(b,x)),Power(Times(d,x),n),Power(Plus(e,Times(f,x)),p)),x),x),And(FreeQ(List(a,b,d,e,f,n),x),IGtQ(p,C0),Or(NeQ(n,CN1),EqQ(p,C1)),NeQ(Plus(Times(b,e),Times(a,f)),C0),Or(Not(IntegerQ(n)),LtQ(Plus(Times(C9,p),Times(C5,n)),C0),GeQ(Plus(n,p,C1),C0),And(GeQ(Plus(n,p,C2),C0),RationalQ(a,b,d,e,f))),Or(NeQ(Plus(n,p,C3),C0),EqQ(p,C1)))));
IIntegrate(77,Int(Times(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),Power(Plus(c_,Times(d_DEFAULT,x_)),n_DEFAULT),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Plus(a,Times(b,x)),Power(Plus(c,Times(d,x)),n),Power(Plus(e,Times(f,x)),p)),x),x),And(FreeQ(List(a,b,c,d,e,f,n),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),Or(And(ILtQ(n,C0),ILtQ(p,C0)),EqQ(p,C1),And(IGtQ(p,C0),Or(Not(IntegerQ(n)),LeQ(Plus(Times(C9,p),Times(C5,Plus(n,C2))),C0),GeQ(Plus(n,p,C1),C0),And(GeQ(Plus(n,p,C2),C0),RationalQ(a,b,c,d,e,f))))))));
IIntegrate(78,Int(Times(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),n_DEFAULT),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),p_DEFAULT)),x_Symbol),
    Condition(Subtract(Negate(Simp(Times(Subtract(Times(b,e),Times(a,f)),Power(Plus(c,Times(d,x)),Plus(n,C1)),Power(Plus(e,Times(f,x)),Plus(p,C1)),Power(Times(f,Plus(p,C1),Subtract(Times(c,f),Times(d,e))),CN1)),x)),Dist(Times(Subtract(Times(a,d,f,Plus(n,p,C2)),Times(b,Plus(Times(d,e,Plus(n,C1)),Times(c,f,Plus(p,C1))))),Power(Times(f,Plus(p,C1),Subtract(Times(c,f),Times(d,e))),CN1)),Int(Times(Power(Plus(c,Times(d,x)),n),Power(Plus(e,Times(f,x)),Plus(p,C1))),x),x)),And(FreeQ(List(a,b,c,d,e,f,n),x),LtQ(p,CN1),Or(Not(LtQ(n,CN1)),IntegerQ(p),Not(Or(IntegerQ(n),Not(Or(EqQ(e,C0),Not(Or(EqQ(c,C0),LtQ(p,n)))))))))));
IIntegrate(79,Int(Times(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),n_DEFAULT),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),p_DEFAULT)),x_Symbol),
    Condition(Subtract(Negate(Simp(Times(Subtract(Times(b,e),Times(a,f)),Power(Plus(c,Times(d,x)),Plus(n,C1)),Power(Plus(e,Times(f,x)),Plus(p,C1)),Power(Times(f,Plus(p,C1),Subtract(Times(c,f),Times(d,e))),CN1)),x)),Dist(Times(Subtract(Times(a,d,f,Plus(n,p,C2)),Times(b,Plus(Times(d,e,Plus(n,C1)),Times(c,f,Plus(p,C1))))),Power(Times(f,Plus(p,C1),Subtract(Times(c,f),Times(d,e))),CN1)),Int(Times(Power(Plus(c,Times(d,x)),n),Power(Plus(e,Times(f,x)),Simplify(Plus(p,C1)))),x),x)),And(FreeQ(List(a,b,c,d,e,f,n,p),x),Not(RationalQ(p)),SumSimplerQ(p,C1))));
IIntegrate(80,Int(Times(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),n_DEFAULT),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),p_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(b,Power(Plus(c,Times(d,x)),Plus(n,C1)),Power(Plus(e,Times(f,x)),Plus(p,C1)),Power(Times(d,f,Plus(n,p,C2)),CN1)),x),Dist(Times(Subtract(Times(a,d,f,Plus(n,p,C2)),Times(b,Plus(Times(d,e,Plus(n,C1)),Times(c,f,Plus(p,C1))))),Power(Times(d,f,Plus(n,p,C2)),CN1)),Int(Times(Power(Plus(c,Times(d,x)),n),Power(Plus(e,Times(f,x)),p)),x),x)),And(FreeQ(List(a,b,c,d,e,f,n,p),x),NeQ(Plus(n,p,C2),C0))));
IIntegrate(81,Int(Times(Sqr(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),n_DEFAULT),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),p_DEFAULT)),x_Symbol),
    Condition(Simp(Times(b,Power(Plus(c,Times(d,x)),Plus(n,C1)),Power(Plus(e,Times(f,x)),Plus(p,C1)),Plus(Times(C2,a,d,f,Plus(n,p,C3)),Times(CN1,b,Plus(Times(d,e,Plus(n,C2)),Times(c,f,Plus(p,C2)))),Times(b,d,f,Plus(n,p,C2),x)),Power(Times(Sqr(d),Sqr(f),Plus(n,p,C2),Plus(n,p,C3)),CN1)),x),And(FreeQ(List(a,b,c,d,e,f,n,p),x),NeQ(Plus(n,p,C2),C0),NeQ(Plus(n,p,C3),C0),EqQ(Subtract(Times(d,f,Plus(n,p,C2),Subtract(Times(Sqr(a),d,f,Plus(n,p,C3)),Times(b,Plus(Times(b,c,e),Times(a,Plus(Times(d,e,Plus(n,C1)),Times(c,f,Plus(p,C1)))))))),Times(b,Plus(Times(d,e,Plus(n,C1)),Times(c,f,Plus(p,C1))),Subtract(Times(a,d,f,Plus(n,p,C4)),Times(b,Plus(Times(d,e,Plus(n,C2)),Times(c,f,Plus(p,C2))))))),C0))));
IIntegrate(82,Int(Times(Power(Times(f_DEFAULT,x_),p_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),m_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),n_DEFAULT)),x_Symbol),
    Condition(Plus(Dist(a,Int(Times(Power(Plus(a,Times(b,x)),n),Power(Plus(c,Times(d,x)),n),Power(Times(f,x),p)),x),x),Dist(Times(b,Power(f,CN1)),Int(Times(Power(Plus(a,Times(b,x)),n),Power(Plus(c,Times(d,x)),n),Power(Times(f,x),Plus(p,C1))),x),x)),And(FreeQ(List(a,b,c,d,f,m,n,p),x),EqQ(Plus(Times(b,c),Times(a,d)),C0),EqQ(Subtract(Subtract(m,n),C1),C0),Not(RationalQ(p)),Not(IGtQ(m,C0)),NeQ(Plus(m,n,p,C2),C0))));
IIntegrate(83,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),CN1),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),CN1),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),p_DEFAULT)),x_Symbol),
    Condition(Subtract(Dist(Times(Subtract(Times(b,e),Times(a,f)),Power(Subtract(Times(b,c),Times(a,d)),CN1)),Int(Times(Power(Plus(e,Times(f,x)),Subtract(p,C1)),Power(Plus(a,Times(b,x)),CN1)),x),x),Dist(Times(Subtract(Times(d,e),Times(c,f)),Power(Subtract(Times(b,c),Times(a,d)),CN1)),Int(Times(Power(Plus(e,Times(f,x)),Subtract(p,C1)),Power(Plus(c,Times(d,x)),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),LtQ(C0,p,C1))));
IIntegrate(84,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),CN1),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),CN1),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),p_)),x_Symbol),
    Condition(Plus(Simp(Times(f,Power(Plus(e,Times(f,x)),Subtract(p,C1)),Power(Times(b,d,Subtract(p,C1)),CN1)),x),Dist(Power(Times(b,d),CN1),Int(Times(Plus(Times(b,d,Sqr(e)),Times(CN1,a,c,Sqr(f)),Times(f,Subtract(Subtract(Times(C2,b,d,e),Times(b,c,f)),Times(a,d,f)),x)),Power(Plus(e,Times(f,x)),Subtract(p,C2)),Power(Times(Plus(a,Times(b,x)),Plus(c,Times(d,x))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),GtQ(p,C1))));
IIntegrate(85,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),CN1),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),CN1),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),p_)),x_Symbol),
    Condition(Plus(Simp(Times(f,Power(Plus(e,Times(f,x)),Plus(p,C1)),Power(Times(Plus(p,C1),Subtract(Times(b,e),Times(a,f)),Subtract(Times(d,e),Times(c,f))),CN1)),x),Dist(Power(Times(Subtract(Times(b,e),Times(a,f)),Subtract(Times(d,e),Times(c,f))),CN1),Int(Times(Subtract(Subtract(Subtract(Times(b,d,e),Times(b,c,f)),Times(a,d,f)),Times(b,d,f,x)),Power(Plus(e,Times(f,x)),Plus(p,C1)),Power(Times(Plus(a,Times(b,x)),Plus(c,Times(d,x))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),LtQ(p,CN1))));
IIntegrate(86,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),CN1),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),CN1),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),p_)),x_Symbol),
    Condition(Subtract(Dist(Times(b,Power(Subtract(Times(b,c),Times(a,d)),CN1)),Int(Times(Power(Plus(e,Times(f,x)),p),Power(Plus(a,Times(b,x)),CN1)),x),x),Dist(Times(d,Power(Subtract(Times(b,c),Times(a,d)),CN1)),Int(Times(Power(Plus(e,Times(f,x)),p),Power(Plus(c,Times(d,x)),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e,f,p),x),Not(IntegerQ(p)))));
IIntegrate(87,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),CN1),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),n_DEFAULT),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),p_)),x_Symbol),
    Condition(Int(ExpandIntegrand(Power(Plus(e,Times(f,x)),FractionalPart(p)),Times(Power(Plus(c,Times(d,x)),n),Power(Plus(e,Times(f,x)),IntegerPart(p)),Power(Plus(a,Times(b,x)),CN1)),x),x),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(n,C0),LtQ(p,CN1),FractionQ(p))));
IIntegrate(88,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),m_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),n_DEFAULT),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(a,Times(b,x)),m),Power(Plus(c,Times(d,x)),n),Power(Plus(e,Times(f,x)),p)),x),x),And(FreeQ(List(a,b,c,d,e,f,p),x),IntegersQ(m,n),Or(IntegerQ(p),And(GtQ(m,C0),GeQ(n,CN1))))));
IIntegrate(89,Int(Times(Sqr(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),n_DEFAULT),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),p_DEFAULT)),x_Symbol),
    Condition(Subtract(Simp(Times(Sqr(Subtract(Times(b,c),Times(a,d))),Power(Plus(c,Times(d,x)),Plus(n,C1)),Power(Plus(e,Times(f,x)),Plus(p,C1)),Power(Times(Sqr(d),Subtract(Times(d,e),Times(c,f)),Plus(n,C1)),CN1)),x),Dist(Power(Times(Sqr(d),Subtract(Times(d,e),Times(c,f)),Plus(n,C1)),CN1),Int(Times(Power(Plus(c,Times(d,x)),Plus(n,C1)),Power(Plus(e,Times(f,x)),p),Simp(Subtract(Subtract(Plus(Times(Sqr(a),Sqr(d),f,Plus(n,p,C2)),Times(Sqr(b),c,Plus(Times(d,e,Plus(n,C1)),Times(c,f,Plus(p,C1))))),Times(C2,a,b,d,Plus(Times(d,e,Plus(n,C1)),Times(c,f,Plus(p,C1))))),Times(Sqr(b),d,Subtract(Times(d,e),Times(c,f)),Plus(n,C1),x)),x)),x),x)),And(FreeQ(List(a,b,c,d,e,f,n,p),x),Or(LtQ(n,CN1),And(EqQ(Plus(n,p,C3),C0),NeQ(n,CN1),Or(SumSimplerQ(n,C1),Not(SumSimplerQ(p,C1))))))));
IIntegrate(90,Int(Times(Sqr(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),n_DEFAULT),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),p_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(b,Plus(a,Times(b,x)),Power(Plus(c,Times(d,x)),Plus(n,C1)),Power(Plus(e,Times(f,x)),Plus(p,C1)),Power(Times(d,f,Plus(n,p,C3)),CN1)),x),Dist(Power(Times(d,f,Plus(n,p,C3)),CN1),Int(Times(Power(Plus(c,Times(d,x)),n),Power(Plus(e,Times(f,x)),p),Simp(Plus(Times(Sqr(a),d,f,Plus(n,p,C3)),Times(CN1,b,Plus(Times(b,c,e),Times(a,Plus(Times(d,e,Plus(n,C1)),Times(c,f,Plus(p,C1)))))),Times(b,Subtract(Times(a,d,f,Plus(n,p,C4)),Times(b,Plus(Times(d,e,Plus(n,C2)),Times(c,f,Plus(p,C2))))),x)),x)),x),x)),And(FreeQ(List(a,b,c,d,e,f,n,p),x),NeQ(Plus(n,p,C3),C0))));
IIntegrate(91,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),CN1D3),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),QQ(-2L,3L)),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),CN1)),x_Symbol),
    Condition(With(List(Set(q,Rt(Times(Subtract(Times(d,e),Times(c,f)),Power(Subtract(Times(b,e),Times(a,f)),CN1)),C3))),Plus(Negate(Simp(Times(CSqrt3,q,ArcTan(Plus(C1DSqrt3,Times(C2,q,Power(Plus(a,Times(b,x)),C1D3),Power(Times(CSqrt3,Power(Plus(c,Times(d,x)),C1D3)),CN1)))),Power(Subtract(Times(d,e),Times(c,f)),CN1)),x)),Simp(Times(q,Log(Plus(e,Times(f,x))),Power(Times(C2,Subtract(Times(d,e),Times(c,f))),CN1)),x),Negate(Simp(Times(C3,q,Log(Subtract(Times(q,Power(Plus(a,Times(b,x)),C1D3)),Power(Plus(c,Times(d,x)),C1D3))),Power(Times(C2,Subtract(Times(d,e),Times(c,f))),CN1)),x)))),FreeQ(List(a,b,c,d,e,f),x)));
IIntegrate(92,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),CN1D2),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),CN1D2),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),CN1)),x_Symbol),
    Condition(Dist(Times(b,f),Subst(Int(Power(Plus(Times(d,Sqr(Subtract(Times(b,e),Times(a,f)))),Times(b,Sqr(f),Sqr(x))),CN1),x),x,Times(Sqrt(Plus(a,Times(b,x))),Sqrt(Plus(c,Times(d,x))))),x),And(FreeQ(List(a,b,c,d,e,f),x),EqQ(Subtract(Times(C2,b,d,e),Times(f,Plus(Times(b,c),Times(a,d)))),C0))));
IIntegrate(93,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),m_),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),n_),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),CN1)),x_Symbol),
    Condition(With(List(Set(q,Denominator(m))),Dist(q,Subst(Int(Times(Power(x,Subtract(Times(q,Plus(m,C1)),C1)),Power(Subtract(Subtract(Times(b,e),Times(a,f)),Times(Subtract(Times(d,e),Times(c,f)),Power(x,q))),CN1)),x),x,Times(Power(Plus(a,Times(b,x)),Power(q,CN1)),Power(Power(Plus(c,Times(d,x)),Power(q,CN1)),CN1))),x)),And(FreeQ(List(a,b,c,d,e,f),x),EqQ(Plus(m,n,C1),C0),RationalQ(n),LtQ(CN1,m,C0),SimplerQ(Plus(a,Times(b,x)),Plus(c,Times(d,x))))));
IIntegrate(94,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),m_),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),n_DEFAULT),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),p_DEFAULT)),x_Symbol),
    Condition(Subtract(Simp(Times(Power(Plus(a,Times(b,x)),Plus(m,C1)),Power(Plus(c,Times(d,x)),n),Power(Plus(e,Times(f,x)),Plus(p,C1)),Power(Times(Plus(m,C1),Subtract(Times(b,e),Times(a,f))),CN1)),x),Dist(Times(n,Subtract(Times(d,e),Times(c,f)),Power(Times(Plus(m,C1),Subtract(Times(b,e),Times(a,f))),CN1)),Int(Times(Power(Plus(a,Times(b,x)),Plus(m,C1)),Power(Plus(c,Times(d,x)),Subtract(n,C1)),Power(Plus(e,Times(f,x)),p)),x),x)),And(FreeQ(List(a,b,c,d,e,f,m,p),x),EqQ(Plus(m,n,p,C2),C0),GtQ(n,C0),Not(And(SumSimplerQ(p,C1),Not(SumSimplerQ(m,C1)))))));
IIntegrate(95,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),m_),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),n_DEFAULT),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),p_DEFAULT)),x_Symbol),
    Condition(Simp(Times(b,Power(Plus(a,Times(b,x)),Plus(m,C1)),Power(Plus(c,Times(d,x)),Plus(n,C1)),Power(Plus(e,Times(f,x)),Plus(p,C1)),Power(Times(Plus(m,C1),Subtract(Times(b,c),Times(a,d)),Subtract(Times(b,e),Times(a,f))),CN1)),x),And(FreeQ(List(a,b,c,d,e,f,m,n,p),x),EqQ(Simplify(Plus(m,n,p,C3)),C0),EqQ(Plus(Times(a,d,f,Plus(m,C1)),Times(b,c,f,Plus(n,C1)),Times(b,d,e,Plus(p,C1))),C0),NeQ(m,CN1))));
IIntegrate(96,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),m_),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),n_DEFAULT),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),p_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(b,Power(Plus(a,Times(b,x)),Plus(m,C1)),Power(Plus(c,Times(d,x)),Plus(n,C1)),Power(Plus(e,Times(f,x)),Plus(p,C1)),Power(Times(Plus(m,C1),Subtract(Times(b,c),Times(a,d)),Subtract(Times(b,e),Times(a,f))),CN1)),x),Dist(Times(Plus(Times(a,d,f,Plus(m,C1)),Times(b,c,f,Plus(n,C1)),Times(b,d,e,Plus(p,C1))),Power(Times(Plus(m,C1),Subtract(Times(b,c),Times(a,d)),Subtract(Times(b,e),Times(a,f))),CN1)),Int(Times(Power(Plus(a,Times(b,x)),Plus(m,C1)),Power(Plus(c,Times(d,x)),n),Power(Plus(e,Times(f,x)),p)),x),x)),And(FreeQ(List(a,b,c,d,e,f,m,n,p),x),EqQ(Simplify(Plus(m,n,p,C3)),C0),Or(LtQ(m,CN1),SumSimplerQ(m,C1)))));
IIntegrate(97,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),m_),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),n_DEFAULT),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),p_DEFAULT)),x_Symbol),
    Condition(Subtract(Simp(Times(Power(Plus(a,Times(b,x)),Plus(m,C1)),Power(Plus(c,Times(d,x)),n),Power(Plus(e,Times(f,x)),p),Power(Times(b,Plus(m,C1)),CN1)),x),Dist(Power(Times(b,Plus(m,C1)),CN1),Int(Times(Power(Plus(a,Times(b,x)),Plus(m,C1)),Power(Plus(c,Times(d,x)),Subtract(n,C1)),Power(Plus(e,Times(f,x)),Subtract(p,C1)),Simp(Plus(Times(d,e,n),Times(c,f,p),Times(d,f,Plus(n,p),x)),x)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),LtQ(m,CN1),GtQ(n,C0),GtQ(p,C0),Or(IntegersQ(Times(C2,m),Times(C2,n),Times(C2,p)),IntegersQ(m,Plus(n,p)),IntegersQ(p,Plus(m,n))))));
IIntegrate(98,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),m_),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),n_DEFAULT),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),p_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Subtract(Times(b,c),Times(a,d)),Power(Plus(a,Times(b,x)),Plus(m,C1)),Power(Plus(c,Times(d,x)),Subtract(n,C1)),Power(Plus(e,Times(f,x)),Plus(p,C1)),Power(Times(b,Subtract(Times(b,e),Times(a,f)),Plus(m,C1)),CN1)),x),Dist(Power(Times(b,Subtract(Times(b,e),Times(a,f)),Plus(m,C1)),CN1),Int(Times(Power(Plus(a,Times(b,x)),Plus(m,C1)),Power(Plus(c,Times(d,x)),Subtract(n,C2)),Power(Plus(e,Times(f,x)),p),Simp(Plus(Times(a,d,Plus(Times(d,e,Subtract(n,C1)),Times(c,f,Plus(p,C1)))),Times(b,c,Subtract(Times(d,e,Plus(m,Negate(n),C2)),Times(c,f,Plus(m,p,C2)))),Times(d,Plus(Times(a,d,f,Plus(n,p)),Times(b,Subtract(Times(d,e,Plus(m,C1)),Times(c,f,Plus(m,n,p,C1))))),x)),x)),x),x)),And(FreeQ(List(a,b,c,d,e,f,p),x),LtQ(m,CN1),GtQ(n,C1),Or(IntegersQ(Times(C2,m),Times(C2,n),Times(C2,p)),IntegersQ(m,Plus(n,p)),IntegersQ(p,Plus(m,n))))));
IIntegrate(99,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),m_),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),n_DEFAULT),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),p_DEFAULT)),x_Symbol),
    Condition(Subtract(Simp(Times(Power(Plus(a,Times(b,x)),Plus(m,C1)),Power(Plus(c,Times(d,x)),n),Power(Plus(e,Times(f,x)),Plus(p,C1)),Power(Times(Plus(m,C1),Subtract(Times(b,e),Times(a,f))),CN1)),x),Dist(Power(Times(Plus(m,C1),Subtract(Times(b,e),Times(a,f))),CN1),Int(Times(Power(Plus(a,Times(b,x)),Plus(m,C1)),Power(Plus(c,Times(d,x)),Subtract(n,C1)),Power(Plus(e,Times(f,x)),p),Simp(Plus(Times(d,e,n),Times(c,f,Plus(m,p,C2)),Times(d,f,Plus(m,n,p,C2),x)),x)),x),x)),And(FreeQ(List(a,b,c,d,e,f,p),x),LtQ(m,CN1),GtQ(n,C0),Or(IntegersQ(Times(C2,m),Times(C2,n),Times(C2,p)),IntegersQ(m,Plus(n,p)),IntegersQ(p,Plus(m,n))))));
IIntegrate(100,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),m_),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),n_DEFAULT),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),p_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(b,Power(Plus(a,Times(b,x)),Subtract(m,C1)),Power(Plus(c,Times(d,x)),Plus(n,C1)),Power(Plus(e,Times(f,x)),Plus(p,C1)),Power(Times(d,f,Plus(m,n,p,C1)),CN1)),x),Dist(Power(Times(d,f,Plus(m,n,p,C1)),CN1),Int(Times(Power(Plus(a,Times(b,x)),Subtract(m,C2)),Power(Plus(c,Times(d,x)),n),Power(Plus(e,Times(f,x)),p),Simp(Plus(Times(Sqr(a),d,f,Plus(m,n,p,C1)),Times(CN1,b,Plus(Times(b,c,e,Subtract(m,C1)),Times(a,Plus(Times(d,e,Plus(n,C1)),Times(c,f,Plus(p,C1)))))),Times(b,Subtract(Times(a,d,f,Plus(Times(C2,m),n,p)),Times(b,Plus(Times(d,e,Plus(m,n)),Times(c,f,Plus(m,p))))),x)),x)),x),x)),And(FreeQ(List(a,b,c,d,e,f,n,p),x),GtQ(m,C1),NeQ(Plus(m,n,p,C1),C0),IntegerQ(m))));
  }
}
}
