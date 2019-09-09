package org.matheclipse.core.integrate.rubi;


import static org.matheclipse.core.expression.F.*;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.BinomialQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Dist;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.EqQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.ExpandIntegrand;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.ExpandToSum;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.F;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.FunctionOfExponential;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.FunctionOfExponentialFunction;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.FunctionOfExponentialQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.GtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.IGtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.ILtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Int;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.IntHide;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.IntegersQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.InverseFunctionQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.LeQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.LinearMatchQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.LinearQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.LtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.NeQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.NormalizeIntegrand;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.RationalQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Rt;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Simp;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Subst;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.SumQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Unintegrable;

/** 
 * IndefiniteIntegrationRules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class IntRules45 { 

	public static void initialize() {
		Initializer.init();
	}

	private static class Initializer  {

		private static void init() {
IIntegrate(2251,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(F_,Times(e_DEFAULT,Plus(c_DEFAULT,Times(d_DEFAULT,x_)))))),p_),Power(G_,Times(h_DEFAULT,Plus(f_DEFAULT,Times(g_DEFAULT,x_))))),x_Symbol),
    Condition(Simp(Times(Power(a,p),Power(GSymbol,Times(h,Plus(f,Times(g,x)))),Hypergeometric2F1(Negate(p),Times(g,h,Log(GSymbol),Power(Times(d,e,Log(FSymbol)),CN1)),Plus(Times(g,h,Log(GSymbol),Power(Times(d,e,Log(FSymbol)),CN1)),C1),Simplify(Times(CN1,b,Power(FSymbol,Times(e,Plus(c,Times(d,x)))),Power(a,CN1)))),Power(Times(g,h,Log(GSymbol)),CN1)),x),And(FreeQ(List(FSymbol,GSymbol,a,b,c,d,e,f,g,h,p),x),Or(ILtQ(p,C0),GtQ(a,C0)))));
IIntegrate(2252,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(F_,Times(e_DEFAULT,Plus(c_DEFAULT,Times(d_DEFAULT,x_)))))),p_),Power(G_,Times(h_DEFAULT,Plus(f_DEFAULT,Times(g_DEFAULT,x_))))),x_Symbol),
    Condition(Dist(Times(Power(Plus(a,Times(b,Power(FSymbol,Times(e,Plus(c,Times(d,x)))))),p),Power(Power(Plus(C1,Times(b,Power(a,CN1),Power(FSymbol,Times(e,Plus(c,Times(d,x)))))),p),CN1)),Int(Times(Power(GSymbol,Times(h,Plus(f,Times(g,x)))),Power(Plus(C1,Times(b,Power(FSymbol,Times(e,Plus(c,Times(d,x)))),Power(a,CN1))),p)),x),x),And(FreeQ(List(FSymbol,GSymbol,a,b,c,d,e,f,g,h,p),x),Not(Or(ILtQ(p,C0),GtQ(a,C0))))));
IIntegrate(2253,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(F_,Times(e_DEFAULT,v_)))),p_),Power(G_,Times(h_DEFAULT,u_))),x_Symbol),
    Condition(Int(Times(Power(GSymbol,Times(h,ExpandToSum(u,x))),Power(Plus(a,Times(b,Power(FSymbol,Times(e,ExpandToSum(v,x))))),p)),x),And(FreeQ(List(FSymbol,GSymbol,a,b,e,h,p),x),LinearQ(List(u,v),x),Not(LinearMatchQ(List(u,v),x)))));
IIntegrate(2254,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(F_,u_))),p_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,Power(F_,v_))),q_DEFAULT),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(With(List(Set(w,ExpandIntegrand(Power(Plus(e,Times(f,x)),m),Times(Power(Plus(a,Times(b,Power(FSymbol,u))),p),Power(Plus(c,Times(d,Power(FSymbol,v))),q)),x))),Condition(Int(w,x),SumQ(w))),And(FreeQ(List(FSymbol,a,b,c,d,e,f,m),x),IntegersQ(p,q),LinearQ(List(u,v),x),RationalQ(Simplify(Times(u,Power(v,CN1)))))));
IIntegrate(2255,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(F_,Times(e_DEFAULT,Plus(c_DEFAULT,Times(d_DEFAULT,x_)))))),p_DEFAULT),Power(G_,Times(h_DEFAULT,Plus(f_DEFAULT,Times(g_DEFAULT,x_)))),Power($p("H"),Times(t_DEFAULT,Plus(r_DEFAULT,Times(s_DEFAULT,x_))))),x_Symbol),
    Condition(With(List(Set(m,FullSimplify(Times(Plus(Times(g,h,Log(GSymbol)),Times(s,t,Log($s("H")))),Power(Times(d,e,Log(FSymbol)),CN1))))),Condition(Dist(Times(Denominator(m),Power(GSymbol,Subtract(Times(f,h),Times(c,g,h,Power(d,CN1)))),Power($s("H"),Subtract(Times(r,t),Times(c,s,t,Power(d,CN1)))),Power(Times(d,e,Log(FSymbol)),CN1)),Subst(Int(Times(Power(x,Subtract(Numerator(m),C1)),Power(Plus(a,Times(b,Power(x,Denominator(m)))),p)),x),x,Power(FSymbol,Times(e,Plus(c,Times(d,x)),Power(Denominator(m),CN1)))),x),RationalQ(m))),FreeQ(List(FSymbol,GSymbol,$s("H"),a,b,c,d,e,f,g,h,r,s,t,p),x)));
IIntegrate(2256,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(F_,Times(e_DEFAULT,Plus(c_DEFAULT,Times(d_DEFAULT,x_)))))),p_DEFAULT),Power(G_,Times(h_DEFAULT,Plus(f_DEFAULT,Times(g_DEFAULT,x_)))),Power($p("H"),Times(t_DEFAULT,Plus(r_DEFAULT,Times(s_DEFAULT,x_))))),x_Symbol),
    Condition(Dist(Power(GSymbol,Times(Subtract(f,Times(c,g,Power(d,CN1))),h)),Int(Times(Power($s("H"),Times(t,Plus(r,Times(s,x)))),Power(Plus(b,Times(a,Power(Power(FSymbol,Times(e,Plus(c,Times(d,x)))),CN1))),p)),x),x),And(FreeQ(List(FSymbol,GSymbol,$s("H"),a,b,c,d,e,f,g,h,r,s,t),x),EqQ(Plus(Times(d,e,p,Log(FSymbol)),Times(g,h,Log(GSymbol))),C0),IntegerQ(p))));
IIntegrate(2257,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(F_,Times(e_DEFAULT,Plus(c_DEFAULT,Times(d_DEFAULT,x_)))))),p_DEFAULT),Power(G_,Times(h_DEFAULT,Plus(f_DEFAULT,Times(g_DEFAULT,x_)))),Power($p("H"),Times(t_DEFAULT,Plus(r_DEFAULT,Times(s_DEFAULT,x_))))),x_Symbol),
    Condition(Int(Expand(Times(Power(GSymbol,Times(h,Plus(f,Times(g,x)))),Power($s("H"),Times(t,Plus(r,Times(s,x)))),Power(Plus(a,Times(b,Power(FSymbol,Times(e,Plus(c,Times(d,x)))))),p)),x),x),And(FreeQ(List(FSymbol,GSymbol,$s("H"),a,b,c,d,e,f,g,h,r,s,t),x),IGtQ(p,C0))));
IIntegrate(2258,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(F_,Times(e_DEFAULT,Plus(c_DEFAULT,Times(d_DEFAULT,x_)))))),p_),Power(G_,Times(h_DEFAULT,Plus(f_DEFAULT,Times(g_DEFAULT,x_)))),Power($p("H"),Times(t_DEFAULT,Plus(r_DEFAULT,Times(s_DEFAULT,x_))))),x_Symbol),
    Condition(Simp(Times(Power(a,p),Power(GSymbol,Times(h,Plus(f,Times(g,x)))),Power($s("H"),Times(t,Plus(r,Times(s,x)))),Hypergeometric2F1(Negate(p),Times(Plus(Times(g,h,Log(GSymbol)),Times(s,t,Log($s("H")))),Power(Times(d,e,Log(FSymbol)),CN1)),Plus(Times(Plus(Times(g,h,Log(GSymbol)),Times(s,t,Log($s("H")))),Power(Times(d,e,Log(FSymbol)),CN1)),C1),Simplify(Times(CN1,b,Power(FSymbol,Times(e,Plus(c,Times(d,x)))),Power(a,CN1)))),Power(Plus(Times(g,h,Log(GSymbol)),Times(s,t,Log($s("H")))),CN1)),x),And(FreeQ(List(FSymbol,GSymbol,$s("H"),a,b,c,d,e,f,g,h,r,s,t),x),ILtQ(p,C0))));
IIntegrate(2259,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(F_,Times(e_DEFAULT,Plus(c_DEFAULT,Times(d_DEFAULT,x_)))))),p_),Power(G_,Times(h_DEFAULT,Plus(f_DEFAULT,Times(g_DEFAULT,x_)))),Power($p("H"),Times(t_DEFAULT,Plus(r_DEFAULT,Times(s_DEFAULT,x_))))),x_Symbol),
    Condition(Simp(Times(Power(GSymbol,Times(h,Plus(f,Times(g,x)))),Power($s("H"),Times(t,Plus(r,Times(s,x)))),Power(Plus(a,Times(b,Power(FSymbol,Times(e,Plus(c,Times(d,x)))))),p),Hypergeometric2F1(Negate(p),Times(Plus(Times(g,h,Log(GSymbol)),Times(s,t,Log($s("H")))),Power(Times(d,e,Log(FSymbol)),CN1)),Plus(Times(Plus(Times(g,h,Log(GSymbol)),Times(s,t,Log($s("H")))),Power(Times(d,e,Log(FSymbol)),CN1)),C1),Simplify(Times(CN1,b,Power(FSymbol,Times(e,Plus(c,Times(d,x)))),Power(a,CN1)))),Power(Times(Plus(Times(g,h,Log(GSymbol)),Times(s,t,Log($s("H")))),Power(Times(Plus(a,Times(b,Power(FSymbol,Times(e,Plus(c,Times(d,x)))))),Power(a,CN1)),p)),CN1)),x),And(FreeQ(List(FSymbol,GSymbol,$s("H"),a,b,c,d,e,f,g,h,r,s,t,p),x),Not(IntegerQ(p)))));
IIntegrate(2260,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(F_,Times(e_DEFAULT,v_)))),p_),Power(G_,Times(h_DEFAULT,u_)),Power($p("H"),Times(t_DEFAULT,w_))),x_Symbol),
    Condition(Int(Times(Power(GSymbol,Times(h,ExpandToSum(u,x))),Power($s("H"),Times(t,ExpandToSum(w,x))),Power(Plus(a,Times(b,Power(FSymbol,Times(e,ExpandToSum(v,x))))),p)),x),And(FreeQ(List(FSymbol,GSymbol,$s("H"),a,b,e,h,t,p),x),LinearQ(List(u,v,w),x),Not(LinearMatchQ(List(u,v,w),x)))));
IIntegrate(2261,Int(Times(Power(F_,Times(e_DEFAULT,Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),Power(Plus(Times(b_DEFAULT,Power(F_,Times(e_DEFAULT,Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),Times(a_DEFAULT,Power(x_,n_DEFAULT))),p_DEFAULT)),x_Symbol),
    Condition(Subtract(Simp(Times(Power(Plus(Times(a,Power(x,n)),Times(b,Power(FSymbol,Times(e,Plus(c,Times(d,x)))))),Plus(p,C1)),Power(Times(b,d,e,Plus(p,C1),Log(FSymbol)),CN1)),x),Dist(Times(a,n,Power(Times(b,d,e,Log(FSymbol)),CN1)),Int(Times(Power(x,Subtract(n,C1)),Power(Plus(Times(a,Power(x,n)),Times(b,Power(FSymbol,Times(e,Plus(c,Times(d,x)))))),p)),x),x)),And(FreeQ(List(FSymbol,a,b,c,d,e,n,p),x),NeQ(p,CN1))));
IIntegrate(2262,Int(Times(Power(F_,Times(e_DEFAULT,Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),Power(x_,m_DEFAULT),Power(Plus(Times(b_DEFAULT,Power(F_,Times(e_DEFAULT,Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),Times(a_DEFAULT,Power(x_,n_DEFAULT))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(x,m),Power(Plus(Times(a,Power(x,n)),Times(b,Power(FSymbol,Times(e,Plus(c,Times(d,x)))))),Plus(p,C1)),Power(Times(b,d,e,Plus(p,C1),Log(FSymbol)),CN1)),x),Negate(Dist(Times(m,Power(Times(b,d,e,Plus(p,C1),Log(FSymbol)),CN1)),Int(Times(Power(x,Subtract(m,C1)),Power(Plus(Times(a,Power(x,n)),Times(b,Power(FSymbol,Times(e,Plus(c,Times(d,x)))))),Plus(p,C1))),x),x)),Negate(Dist(Times(a,n,Power(Times(b,d,e,Log(FSymbol)),CN1)),Int(Times(Power(x,Subtract(Plus(m,n),C1)),Power(Plus(Times(a,Power(x,n)),Times(b,Power(FSymbol,Times(e,Plus(c,Times(d,x)))))),p)),x),x))),And(FreeQ(List(FSymbol,a,b,c,d,e,m,n,p),x),NeQ(p,CN1))));
IIntegrate(2263,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(F_,u_)),Times(c_DEFAULT,Power(F_,v_))),CN1),Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(With(List(Set(q,Rt(Subtract(Sqr(b),Times(C4,a,c)),C2))),Subtract(Dist(Times(C2,c,Power(q,CN1)),Int(Times(Power(Plus(f,Times(g,x)),m),Power(Plus(b,Negate(q),Times(C2,c,Power(FSymbol,u))),CN1)),x),x),Dist(Times(C2,c,Power(q,CN1)),Int(Times(Power(Plus(f,Times(g,x)),m),Power(Plus(b,q,Times(C2,c,Power(FSymbol,u))),CN1)),x),x))),And(FreeQ(List(FSymbol,a,b,c,f,g),x),EqQ(v,Times(C2,u)),LinearQ(u,x),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),IGtQ(m,C0))));
IIntegrate(2264,Int(Times(Power(F_,u_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(F_,u_)),Times(c_DEFAULT,Power(F_,v_))),CN1),Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(With(List(Set(q,Rt(Subtract(Sqr(b),Times(C4,a,c)),C2))),Subtract(Dist(Times(C2,c,Power(q,CN1)),Int(Times(Power(Plus(f,Times(g,x)),m),Power(FSymbol,u),Power(Plus(b,Negate(q),Times(C2,c,Power(FSymbol,u))),CN1)),x),x),Dist(Times(C2,c,Power(q,CN1)),Int(Times(Power(Plus(f,Times(g,x)),m),Power(FSymbol,u),Power(Plus(b,q,Times(C2,c,Power(FSymbol,u))),CN1)),x),x))),And(FreeQ(List(FSymbol,a,b,c,f,g),x),EqQ(v,Times(C2,u)),LinearQ(u,x),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),IGtQ(m,C0))));
IIntegrate(2265,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(F_,u_)),Times(c_DEFAULT,Power(F_,v_))),CN1),Plus(Times(i_DEFAULT,Power(F_,u_)),h_),Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(With(List(Set(q,Rt(Subtract(Sqr(b),Times(C4,a,c)),C2))),Subtract(Dist(Plus(Simplify(Times(Subtract(Times(C2,c,h),Times(b,i)),Power(q,CN1))),i),Int(Times(Power(Plus(f,Times(g,x)),m),Power(Plus(b,Negate(q),Times(C2,c,Power(FSymbol,u))),CN1)),x),x),Dist(Subtract(Simplify(Times(Subtract(Times(C2,c,h),Times(b,i)),Power(q,CN1))),i),Int(Times(Power(Plus(f,Times(g,x)),m),Power(Plus(b,q,Times(C2,c,Power(FSymbol,u))),CN1)),x),x))),And(FreeQ(List(FSymbol,a,b,c,f,g,h,i),x),EqQ(v,Times(C2,u)),LinearQ(u,x),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),IGtQ(m,C0))));
IIntegrate(2266,Int(Times(Power(Plus(Times(b_DEFAULT,Power(F_,v_)),Times(a_DEFAULT,Power(F_,Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),CN1),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Power(Plus(Times(a,Power(FSymbol,Plus(c,Times(d,x)))),Times(b,Power(FSymbol,v))),CN1),x))),Subtract(Simp(Times(Power(x,m),u),x),Dist(m,Int(Times(Power(x,Subtract(m,C1)),u),x),x))),And(FreeQ(List(FSymbol,a,b,c,d),x),EqQ(v,Negate(Plus(c,Times(d,x)))),GtQ(m,C0))));
IIntegrate(2267,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(F_,v_)),Times(c_DEFAULT,Power(F_,w_))),CN1),u_),x_Symbol),
    Condition(Int(Times(u,Power(FSymbol,v),Power(Plus(c,Times(a,Power(FSymbol,v)),Times(b,Power(FSymbol,Times(C2,v)))),CN1)),x),And(FreeQ(List(FSymbol,a,b,c),x),EqQ(w,Negate(v)),LinearQ(v,x),If(RationalQ(Coefficient(v,x,C1)),GtQ(Coefficient(v,x,C1),C0),LtQ(LeafCount(v),LeafCount(w))))));
IIntegrate(2268,Int(Times(Power(F_,Times(g_DEFAULT,Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),n_DEFAULT))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),CN1)),x_Symbol),
    Condition(Int(ExpandIntegrand(Power(FSymbol,Times(g,Power(Plus(d,Times(e,x)),n))),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),CN1),x),x),FreeQ(List(FSymbol,a,b,c,d,e,g,n),x)));
IIntegrate(2269,Int(Times(Power(F_,Times(g_DEFAULT,Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),n_DEFAULT))),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),CN1)),x_Symbol),
    Condition(Int(ExpandIntegrand(Power(FSymbol,Times(g,Power(Plus(d,Times(e,x)),n))),Power(Plus(a,Times(c,Sqr(x))),CN1),x),x),FreeQ(List(FSymbol,a,c,d,e,g,n),x)));
IIntegrate(2270,Int(Times(Power(F_,Times(g_DEFAULT,Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),n_DEFAULT))),Power(u_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_,Sqr(x_))),CN1)),x_Symbol),
    Condition(Int(ExpandIntegrand(Power(FSymbol,Times(g,Power(Plus(d,Times(e,x)),n))),Times(Power(u,m),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),CN1)),x),x),And(FreeQ(List(FSymbol,a,b,c,d,e,g,n),x),PolynomialQ(u,x),IntegerQ(m))));
IIntegrate(2271,Int(Times(Power(F_,Times(g_DEFAULT,Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),n_DEFAULT))),Power(u_,m_DEFAULT),Power(Plus(a_,Times(c_,Sqr(x_))),CN1)),x_Symbol),
    Condition(Int(ExpandIntegrand(Power(FSymbol,Times(g,Power(Plus(d,Times(e,x)),n))),Times(Power(u,m),Power(Plus(a,Times(c,Sqr(x))),CN1)),x),x),And(FreeQ(List(FSymbol,a,c,d,e,g,n),x),PolynomialQ(u,x),IntegerQ(m))));
IIntegrate(2272,Int(Power(F_,Times(Power(x_,CN2),Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,C4))))),x_Symbol),
    Condition(Subtract(Simp(Times(Sqrt(Pi),Exp(Times(C2,Sqrt(Times(CN1,a,Log(FSymbol))),Sqrt(Times(CN1,b,Log(FSymbol))))),Erf(Times(Plus(Sqrt(Times(CN1,a,Log(FSymbol))),Times(Sqrt(Times(CN1,b,Log(FSymbol))),Sqr(x))),Power(x,CN1))),Power(Times(C4,Sqrt(Times(CN1,b,Log(FSymbol)))),CN1)),x),Simp(Times(Sqrt(Pi),Exp(Times(CN2,Sqrt(Times(CN1,a,Log(FSymbol))),Sqrt(Times(CN1,b,Log(FSymbol))))),Erf(Times(Subtract(Sqrt(Times(CN1,a,Log(FSymbol))),Times(Sqrt(Times(CN1,b,Log(FSymbol))),Sqr(x))),Power(x,CN1))),Power(Times(C4,Sqrt(Times(CN1,b,Log(FSymbol)))),CN1)),x)),FreeQ(List(FSymbol,a,b),x)));
IIntegrate(2273,Int(Times(Power(x_,m_DEFAULT),Power(Plus(Exp(x_),Power(x_,m_DEFAULT)),n_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Plus(Exp(x),Power(x,m)),Plus(n,C1)),Power(Plus(n,C1),CN1)),x)),Dist(m,Int(Times(Power(x,Subtract(m,C1)),Power(Plus(Exp(x),Power(x,m)),n)),x),x),Int(Power(Plus(Exp(x),Power(x,m)),Plus(n,C1)),x)),And(RationalQ(m,n),GtQ(m,C0),LtQ(n,C0),NeQ(n,CN1))));
IIntegrate(2274,Int(Times(u_DEFAULT,Power(F_,Times(a_DEFAULT,Plus(Times(Log(z_),b_DEFAULT),v_DEFAULT)))),x_Symbol),
    Condition(Int(Times(u,Power(FSymbol,Times(a,v)),Power(z,Times(a,b,Log(FSymbol)))),x),FreeQ(List(FSymbol,a,b),x)));
IIntegrate(2275,Int(Power(F_,Times(Plus(a_DEFAULT,Times(Sqr(Log(Times(c_DEFAULT,Power(x_,n_DEFAULT)))),b_DEFAULT)),d_DEFAULT)),x_Symbol),
    Condition(Dist(Times(x,Power(Times(n,Power(Times(c,Power(x,n)),Power(n,CN1))),CN1)),Subst(Int(Exp(Plus(Times(a,d,Log(FSymbol)),Times(x,Power(n,CN1)),Times(b,d,Log(FSymbol),Sqr(x)))),x),x,Log(Times(c,Power(x,n)))),x),FreeQ(List(FSymbol,a,b,c,d,n),x)));
IIntegrate(2276,Int(Times(Power(F_,Times(Plus(a_DEFAULT,Times(Sqr(Log(Times(c_DEFAULT,Power(x_,n_DEFAULT)))),b_DEFAULT)),d_DEFAULT)),Power(Times(e_DEFAULT,x_),m_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(Times(e,x),Plus(m,C1)),Power(Times(e,n,Power(Times(c,Power(x,n)),Times(Plus(m,C1),Power(n,CN1)))),CN1)),Subst(Int(Exp(Plus(Times(a,d,Log(FSymbol)),Times(Plus(m,C1),x,Power(n,CN1)),Times(b,d,Log(FSymbol),Sqr(x)))),x),x,Log(Times(c,Power(x,n)))),x),FreeQ(List(FSymbol,a,b,c,d,e,m,n),x)));
IIntegrate(2277,Int(Power(F_,Times(Sqr(Plus(a_DEFAULT,Times(Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))),b_DEFAULT))),d_DEFAULT)),x_Symbol),
    Condition(Int(Power(FSymbol,Plus(Times(Sqr(a),d),Times(C2,a,b,d,Log(Times(c,Power(x,n)))),Times(Sqr(b),d,Sqr(Log(Times(c,Power(x,n))))))),x),FreeQ(List(FSymbol,a,b,c,d,n),x)));
IIntegrate(2278,Int(Times(Power(F_,Times(Sqr(Plus(a_DEFAULT,Times(Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))),b_DEFAULT))),d_DEFAULT)),Power(Times(e_DEFAULT,x_),m_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(Times(e,x),m),Power(FSymbol,Plus(Times(Sqr(a),d),Times(C2,a,b,d,Log(Times(c,Power(x,n)))),Times(Sqr(b),d,Sqr(Log(Times(c,Power(x,n)))))))),x),FreeQ(List(FSymbol,a,b,c,d,e,m,n),x)));
IIntegrate(2279,Int(Log(Plus(a_,Times(b_DEFAULT,Power(Power(F_,Times(e_DEFAULT,Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),n_DEFAULT)))),x_Symbol),
    Condition(Dist(Power(Times(d,e,n,Log(FSymbol)),CN1),Subst(Int(Times(Log(Plus(a,Times(b,x))),Power(x,CN1)),x),x,Power(Power(FSymbol,Times(e,Plus(c,Times(d,x)))),n)),x),And(FreeQ(List(FSymbol,a,b,c,d,e,n),x),GtQ(a,C0))));
IIntegrate(2280,Int(Log(Plus(a_,Times(b_DEFAULT,Power(Power(F_,Times(e_DEFAULT,Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),n_DEFAULT)))),x_Symbol),
    Condition(Subtract(Simp(Times(x,Log(Plus(a,Times(b,Power(Power(FSymbol,Times(e,Plus(c,Times(d,x)))),n))))),x),Dist(Times(b,d,e,n,Log(FSymbol)),Int(Times(x,Power(Power(FSymbol,Times(e,Plus(c,Times(d,x)))),n),Power(Plus(a,Times(b,Power(Power(FSymbol,Times(e,Plus(c,Times(d,x)))),n))),CN1)),x),x)),And(FreeQ(List(FSymbol,a,b,c,d,e,n),x),Not(GtQ(a,C0)))));
IIntegrate(2281,Int(Times(u_DEFAULT,Power(Times(a_DEFAULT,Power(F_,v_)),n_)),x_Symbol),
    Condition(Dist(Times(Power(Times(a,Power(FSymbol,v)),n),Power(Power(FSymbol,Times(n,v)),CN1)),Int(Times(u,Power(FSymbol,Times(n,v))),x),x),And(FreeQ(List(FSymbol,a,n),x),Not(IntegerQ(n)))));
IIntegrate(2282,Int(u_,x_Symbol),
    Condition(With(List(Set(v,FunctionOfExponential(u,x))),Dist(Times(v,Power(D(v,x),CN1)),Subst(Int(Times(FunctionOfExponentialFunction(u,x),Power(x,CN1)),x),x,v),x)),And(FunctionOfExponentialQ(u,x),Not(MatchQ(u,Condition(Times(w_,Power(Times(a_DEFAULT,Power(v_,n_)),m_)),And(FreeQ(List(a,m,n),x),IntegerQ(Times(m,n)))))),Not(MatchQ(u,Condition(Times(Exp(Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x)))),$(F_,v_)),And(FreeQ(List(a,b,c),x),InverseFunctionQ(F(x)))))))));
IIntegrate(2283,Int(Times(u_DEFAULT,Power(Plus(Times(a_DEFAULT,Power(F_,v_)),Times(b_DEFAULT,Power(F_,w_))),n_)),x_Symbol),
    Condition(Int(Times(u,Power(FSymbol,Times(n,v)),Power(Plus(a,Times(b,Power(FSymbol,ExpandToSum(Subtract(w,v),x)))),n)),x),And(FreeQ(List(FSymbol,a,b,n),x),ILtQ(n,C0),LinearQ(List(v,w),x))));
IIntegrate(2284,Int(Times(u_DEFAULT,Power(Plus(Times(a_DEFAULT,Power(F_,v_)),Times(b_DEFAULT,Power(G_,w_))),n_)),x_Symbol),
    Condition(Int(Times(u,Power(FSymbol,Times(n,v)),Power(Plus(a,Times(b,Exp(ExpandToSum(Subtract(Times(Log(GSymbol),w),Times(Log(FSymbol),v)),x)))),n)),x),And(FreeQ(List(FSymbol,GSymbol,a,b,n),x),ILtQ(n,C0),LinearQ(List(v,w),x))));
IIntegrate(2285,Int(Times(u_DEFAULT,Power(Plus(Times(a_DEFAULT,Power(F_,v_)),Times(b_DEFAULT,Power(F_,w_))),n_)),x_Symbol),
    Condition(Dist(Times(Power(Plus(Times(a,Power(FSymbol,v)),Times(b,Power(FSymbol,w))),n),Power(Times(Power(FSymbol,Times(n,v)),Power(Plus(a,Times(b,Power(FSymbol,ExpandToSum(Subtract(w,v),x)))),n)),CN1)),Int(Times(u,Power(FSymbol,Times(n,v)),Power(Plus(a,Times(b,Power(FSymbol,ExpandToSum(Subtract(w,v),x)))),n)),x),x),And(FreeQ(List(FSymbol,a,b,n),x),Not(IntegerQ(n)),LinearQ(List(v,w),x))));
IIntegrate(2286,Int(Times(u_DEFAULT,Power(Plus(Times(a_DEFAULT,Power(F_,v_)),Times(b_DEFAULT,Power(G_,w_))),n_)),x_Symbol),
    Condition(Dist(Times(Power(Plus(Times(a,Power(FSymbol,v)),Times(b,Power(GSymbol,w))),n),Power(Times(Power(FSymbol,Times(n,v)),Power(Plus(a,Times(b,Exp(ExpandToSum(Subtract(Times(Log(GSymbol),w),Times(Log(FSymbol),v)),x)))),n)),CN1)),Int(Times(u,Power(FSymbol,Times(n,v)),Power(Plus(a,Times(b,Exp(ExpandToSum(Subtract(Times(Log(GSymbol),w),Times(Log(FSymbol),v)),x)))),n)),x),x),And(FreeQ(List(FSymbol,GSymbol,a,b,n),x),Not(IntegerQ(n)),LinearQ(List(v,w),x))));
IIntegrate(2287,Int(Times(u_DEFAULT,Power(F_,v_),Power(G_,w_)),x_Symbol),
    Condition(With(List(Set(z,Plus(Times(v,Log(FSymbol)),Times(w,Log(GSymbol))))),Condition(Int(Times(u,NormalizeIntegrand(Exp(z),x)),x),Or(BinomialQ(z,x),And(PolynomialQ(z,x),LeQ(Exponent(z,x),C2))))),FreeQ(List(FSymbol,GSymbol),x)));
IIntegrate(2288,Int(Times(y_DEFAULT,Power(F_,u_),Plus(v_,w_)),x_Symbol),
    Condition(With(List(Set(z,Times(v,y,Power(Times(Log(FSymbol),D(u,x)),CN1)))),Condition(Simp(Times(Power(FSymbol,u),z),x),EqQ(D(z,x),Times(w,y)))),FreeQ(FSymbol,x)));
IIntegrate(2289,Int(Times(Power(F_,u_),Power(v_,n_DEFAULT),w_),x_Symbol),
    Condition(With(List(Set(z,Plus(Times(Log(FSymbol),v,D(u,x)),Times(Plus(n,C1),D(v,x))))),Condition(Simp(Times(Coefficient(w,x,Exponent(w,x)),Power(FSymbol,u),Power(v,Plus(n,C1)),Power(Coefficient(z,x,Exponent(z,x)),CN1)),x),And(EqQ(Exponent(w,x),Exponent(z,x)),EqQ(Times(w,Coefficient(z,x,Exponent(z,x))),Times(z,Coefficient(w,x,Exponent(w,x))))))),And(FreeQ(List(FSymbol,n),x),PolynomialQ(u,x),PolynomialQ(v,x),PolynomialQ(w,x))));
IIntegrate(2290,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(F_,Times(c_DEFAULT,Sqrt(Plus(d_DEFAULT,Times(e_DEFAULT,x_))),Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_)),CN1D2))))),n_DEFAULT),Power(Plus(A_DEFAULT,Times(B_DEFAULT,x_),Times(C_DEFAULT,Sqr(x_))),CN1)),x_Symbol),
    Condition(Dist(Times(C2,e,g,Power(Times(C,Subtract(Times(e,f),Times(d,g))),CN1)),Subst(Int(Times(Power(Plus(a,Times(b,Power(FSymbol,Times(c,x)))),n),Power(x,CN1)),x),x,Times(Sqrt(Plus(d,Times(e,x))),Power(Plus(f,Times(g,x)),CN1D2))),x),And(FreeQ(List(a,b,c,d,e,f,g,ASymbol,BSymbol,C,FSymbol),x),EqQ(Subtract(Times(C,d,f),Times(ASymbol,e,g)),C0),EqQ(Subtract(Times(BSymbol,e,g),Times(C,Plus(Times(e,f),Times(d,g)))),C0),IGtQ(n,C0))));
IIntegrate(2291,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(F_,Times(c_DEFAULT,Sqrt(Plus(d_DEFAULT,Times(e_DEFAULT,x_))),Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_)),CN1D2))))),n_DEFAULT),Power(Plus(A_,Times(C_DEFAULT,Sqr(x_))),CN1)),x_Symbol),
    Condition(Dist(Times(C2,e,g,Power(Times(C,Subtract(Times(e,f),Times(d,g))),CN1)),Subst(Int(Times(Power(Plus(a,Times(b,Power(FSymbol,Times(c,x)))),n),Power(x,CN1)),x),x,Times(Sqrt(Plus(d,Times(e,x))),Power(Plus(f,Times(g,x)),CN1D2))),x),And(FreeQ(List(a,b,c,d,e,f,g,ASymbol,C,FSymbol),x),EqQ(Subtract(Times(C,d,f),Times(ASymbol,e,g)),C0),EqQ(Plus(Times(e,f),Times(d,g)),C0),IGtQ(n,C0))));
IIntegrate(2292,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(F_,Times(c_DEFAULT,Sqrt(Plus(d_DEFAULT,Times(e_DEFAULT,x_))),Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_)),CN1D2))))),n_),Power(Plus(A_DEFAULT,Times(B_DEFAULT,x_),Times(C_DEFAULT,Sqr(x_))),CN1)),x_Symbol),
    Condition(Unintegrable(Times(Power(Plus(a,Times(b,Power(FSymbol,Times(c,Sqrt(Plus(d,Times(e,x))),Power(Plus(f,Times(g,x)),CN1D2))))),n),Power(Plus(ASymbol,Times(BSymbol,x),Times(C,Sqr(x))),CN1)),x),And(FreeQ(List(a,b,c,d,e,f,g,ASymbol,BSymbol,C,FSymbol,n),x),EqQ(Subtract(Times(C,d,f),Times(ASymbol,e,g)),C0),EqQ(Subtract(Times(BSymbol,e,g),Times(C,Plus(Times(e,f),Times(d,g)))),C0),Not(IGtQ(n,C0)))));
IIntegrate(2293,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(F_,Times(c_DEFAULT,Sqrt(Plus(d_DEFAULT,Times(e_DEFAULT,x_))),Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_)),CN1D2))))),n_),Power(Plus(A_,Times(C_DEFAULT,Sqr(x_))),CN1)),x_Symbol),
    Condition(Unintegrable(Times(Power(Plus(a,Times(b,Power(FSymbol,Times(c,Sqrt(Plus(d,Times(e,x))),Power(Plus(f,Times(g,x)),CN1D2))))),n),Power(Plus(ASymbol,Times(C,Sqr(x))),CN1)),x),And(FreeQ(List(a,b,c,d,e,f,g,ASymbol,C,FSymbol,n),x),EqQ(Subtract(Times(C,d,f),Times(ASymbol,e,g)),C0),EqQ(Plus(Times(e,f),Times(d,g)),C0),Not(IGtQ(n,C0)))));
IIntegrate(2294,Int(Times(Plus(A_DEFAULT,Times(Log(Times(c_DEFAULT,Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),n_DEFAULT))),B_DEFAULT)),Power(Plus(Times(Log(Times(c_DEFAULT,Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),n_DEFAULT))),b_DEFAULT),a_),CN1D2)),x_Symbol),
    Condition(Plus(Simp(Times(BSymbol,Plus(d,Times(e,x)),Sqrt(Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n)))))),Power(Times(b,e),CN1)),x),Dist(Times(Subtract(Times(C2,ASymbol,b),Times(BSymbol,Plus(Times(C2,a),Times(b,n)))),Power(Times(C2,b),CN1)),Int(Power(Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))),CN1D2),x),x)),FreeQ(List(a,b,c,d,e,ASymbol,BSymbol,n),x)));
IIntegrate(2295,Int(Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))),x_Symbol),
    Condition(Subtract(Simp(Times(x,Log(Times(c,Power(x,n)))),x),Simp(Times(n,x),x)),FreeQ(List(c,n),x)));
IIntegrate(2296,Int(Power(Plus(a_DEFAULT,Times(Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))),b_DEFAULT)),p_DEFAULT),x_Symbol),
    Condition(Subtract(Simp(Times(x,Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p)),x),Dist(Times(b,n,p),Int(Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),Subtract(p,C1)),x),x)),And(FreeQ(List(a,b,c,n),x),GtQ(p,C0),IntegerQ(Times(C2,p)))));
IIntegrate(2297,Int(Power(Plus(a_DEFAULT,Times(Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))),b_DEFAULT)),p_),x_Symbol),
    Condition(Subtract(Simp(Times(x,Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),Plus(p,C1)),Power(Times(b,n,Plus(p,C1)),CN1)),x),Dist(Power(Times(b,n,Plus(p,C1)),CN1),Int(Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),Plus(p,C1)),x),x)),And(FreeQ(List(a,b,c,n),x),LtQ(p,CN1),IntegerQ(Times(C2,p)))));
IIntegrate(2298,Int(Power(Log(Times(c_DEFAULT,x_)),CN1),x_Symbol),
    Condition(Simp(Times(LogIntegral(Times(c,x)),Power(c,CN1)),x),FreeQ(c,x)));
IIntegrate(2299,Int(Power(Plus(a_DEFAULT,Times(Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))),b_DEFAULT)),p_),x_Symbol),
    Condition(Dist(Power(Times(n,Power(c,Power(n,CN1))),CN1),Subst(Int(Times(Exp(Times(x,Power(n,CN1))),Power(Plus(a,Times(b,x)),p)),x),x,Log(Times(c,Power(x,n)))),x),And(FreeQ(List(a,b,c,p),x),IntegerQ(Power(n,CN1)))));
IIntegrate(2300,Int(Power(Plus(a_DEFAULT,Times(Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))),b_DEFAULT)),p_),x_Symbol),
    Condition(Dist(Times(x,Power(Times(n,Power(Times(c,Power(x,n)),Power(n,CN1))),CN1)),Subst(Int(Times(Exp(Times(x,Power(n,CN1))),Power(Plus(a,Times(b,x)),p)),x),x,Log(Times(c,Power(x,n)))),x),FreeQ(List(a,b,c,n,p),x)));
  }
}
}
