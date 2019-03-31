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
public class IntRules65 { 

	public static void initialize() {
		Initializer.init();
	}

	private static class Initializer  {

		private static void init() {
IIntegrate(3251,Int(Times(Power($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_DEFAULT),Power(Plus(a_DEFAULT,Times(Power($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT),b_DEFAULT),Times(Power($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2",true)),c_DEFAULT)),p_)),x_Symbol),
    Condition(Dist(Power(Times(Power(C4,p),Power(c,p)),CN1),Int(Times(Power(Cos(Plus(d,Times(e,x))),m),Power(Plus(b,Times(C2,c,Power(Cos(Plus(d,Times(e,x))),n))),Times(C2,p))),x),x),And(FreeQ(List(a,b,c,d,e,m,n),x),EqQ($s("n2"),Times(C2,n)),EqQ(Subtract(Sqr(b),Times(C4,a,c)),C0),IntegerQ(p))));
IIntegrate(3252,Int(Times(Power($($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power($($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT)),Times(c_DEFAULT,Power($($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2",true)))),p_)),x_Symbol),
    Condition(Dist(Times(Power(Plus(a,Times(b,Power(Sin(Plus(d,Times(e,x))),n)),Times(c,Power(Sin(Plus(d,Times(e,x))),Times(C2,n)))),p),Power(Power(Plus(b,Times(C2,c,Power(Sin(Plus(d,Times(e,x))),n))),Times(C2,p)),CN1)),Int(Times(Power(Sin(Plus(d,Times(e,x))),m),Power(Plus(b,Times(C2,c,Power(Sin(Plus(d,Times(e,x))),n))),Times(C2,p))),x),x),And(FreeQ(List(a,b,c,d,e,m,n,p),x),EqQ($s("n2"),Times(C2,n)),EqQ(Subtract(Sqr(b),Times(C4,a,c)),C0),Not(IntegerQ(p)))));
IIntegrate(3253,Int(Times(Power($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_DEFAULT),Power(Plus(a_DEFAULT,Times(Power($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT),b_DEFAULT),Times(Power($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2",true)),c_DEFAULT)),p_)),x_Symbol),
    Condition(Dist(Times(Power(Plus(a,Times(b,Power(Cos(Plus(d,Times(e,x))),n)),Times(c,Power(Cos(Plus(d,Times(e,x))),Times(C2,n)))),p),Power(Power(Plus(b,Times(C2,c,Power(Cos(Plus(d,Times(e,x))),n))),Times(C2,p)),CN1)),Int(Times(Power(Cos(Plus(d,Times(e,x))),m),Power(Plus(b,Times(C2,c,Power(Cos(Plus(d,Times(e,x))),n))),Times(C2,p))),x),x),And(FreeQ(List(a,b,c,d,e,m,n,p),x),EqQ($s("n2"),Times(C2,n)),EqQ(Subtract(Sqr(b),Times(C4,a,c)),C0),Not(IntegerQ(p)))));
IIntegrate(3254,Int(Times(Power($($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power($($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_)),Times(c_DEFAULT,Power($($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2")))),p_)),x_Symbol),
    Condition(Module(List(Set(f,FreeFactors(Cot(Plus(d,Times(e,x))),x))),Negate(Dist(Times(f,Power(e,CN1)),Subst(Int(Times(Power(ExpandToSum(Plus(c,Times(b,Power(Plus(C1,Sqr(x)),Times(C1D2,n))),Times(a,Power(Plus(C1,Sqr(x)),n))),x),p),Power(Power(Plus(C1,Times(Sqr(f),Sqr(x))),Plus(Times(C1D2,m),Times(n,p),C1)),CN1)),x),x,Times(Cot(Plus(d,Times(e,x))),Power(f,CN1))),x))),And(FreeQ(List(a,b,c,d,e),x),EqQ($s("n2"),Times(C2,n)),IntegerQ(Times(C1D2,m)),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),IntegerQ(Times(C1D2,n)),IntegerQ(p))));
IIntegrate(3255,Int(Times(Power($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_DEFAULT),Power(Plus(a_DEFAULT,Times(Power($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_),b_DEFAULT),Times(Power($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2")),c_DEFAULT)),p_)),x_Symbol),
    Condition(Module(List(Set(f,FreeFactors(Tan(Plus(d,Times(e,x))),x))),Dist(Times(f,Power(e,CN1)),Subst(Int(Times(Power(ExpandToSum(Plus(c,Times(b,Power(Plus(C1,Sqr(x)),Times(C1D2,n))),Times(a,Power(Plus(C1,Sqr(x)),n))),x),p),Power(Power(Plus(C1,Times(Sqr(f),Sqr(x))),Plus(Times(C1D2,m),Times(n,p),C1)),CN1)),x),x,Times(Tan(Plus(d,Times(e,x))),Power(f,CN1))),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ($s("n2"),Times(C2,n)),IntegerQ(Times(C1D2,m)),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),IntegerQ(Times(C1D2,n)),IntegerQ(p))));
IIntegrate(3256,Int(Times(Power($($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power($($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT)),Times(c_DEFAULT,Power($($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2",true)))),p_)),x_Symbol),
    Condition(Int(ExpandTrig(Times(Power($($s("§sin"),Plus(d,Times(e,x))),m),Power(Plus(a,Times(b,Power($($s("§sin"),Plus(d,Times(e,x))),n)),Times(c,Power($($s("§sin"),Plus(d,Times(e,x))),Times(C2,n)))),p)),x),x),And(FreeQ(List(a,b,c,d,e),x),EqQ($s("n2"),Times(C2,n)),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),IntegersQ(m,n,p))));
IIntegrate(3257,Int(Times(Power($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_DEFAULT),Power(Plus(a_DEFAULT,Times(Power($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT),b_DEFAULT),Times(Power($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2",true)),c_DEFAULT)),p_)),x_Symbol),
    Condition(Int(ExpandTrig(Times(Power($($s("§cos"),Plus(d,Times(e,x))),m),Power(Plus(a,Times(b,Power($($s("§cos"),Plus(d,Times(e,x))),n)),Times(c,Power($($s("§cos"),Plus(d,Times(e,x))),Times(C2,n)))),p)),x),x),And(FreeQ(List(a,b,c,d,e),x),EqQ($s("n2"),Times(C2,n)),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),IntegersQ(m,n,p))));
IIntegrate(3258,Int(Times(Power($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(Times(f_DEFAULT,$($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))),n_DEFAULT)),Times(c_DEFAULT,Power(Times(f_DEFAULT,$($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))),$p("n2",true)))),p_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(g,FreeFactors(Sin(Plus(d,Times(e,x))),x))),Dist(Times(g,Power(e,CN1)),Subst(Int(Times(Power(Subtract(C1,Times(Sqr(g),Sqr(x))),Times(C1D2,Subtract(m,C1))),Power(Plus(a,Times(b,Power(Times(f,g,x),n)),Times(c,Power(Times(f,g,x),Times(C2,n)))),p)),x),x,Times(Sin(Plus(d,Times(e,x))),Power(g,CN1))),x)),And(FreeQ(List(a,b,c,d,e,f,n,p),x),EqQ($s("n2"),Times(C2,n)),IntegerQ(Times(C1D2,Subtract(m,C1))))));
IIntegrate(3259,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(Times($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),f_DEFAULT),n_DEFAULT)),Times(c_DEFAULT,Power(Times($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),f_DEFAULT),$p("n2",true)))),p_DEFAULT),Power($($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(g,FreeFactors(Cos(Plus(d,Times(e,x))),x))),Negate(Dist(Times(g,Power(e,CN1)),Subst(Int(Times(Power(Subtract(C1,Times(Sqr(g),Sqr(x))),Times(C1D2,Subtract(m,C1))),Power(Plus(a,Times(b,Power(Times(f,g,x),n)),Times(c,Power(Times(f,g,x),Times(C2,n)))),p)),x),x,Times(Cos(Plus(d,Times(e,x))),Power(g,CN1))),x))),And(FreeQ(List(a,b,c,d,e,f,n,p),x),EqQ($s("n2"),Times(C2,n)),IntegerQ(Times(C1D2,Subtract(m,C1))))));
IIntegrate(3260,Int(Times(Power($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power($($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT)),Times(c_DEFAULT,Power($($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2",true)))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Times(Power(C4,p),Power(c,p)),CN1),Int(Times(Power(Cos(Plus(d,Times(e,x))),m),Power(Plus(b,Times(C2,c,Power(Sin(Plus(d,Times(e,x))),n))),Times(C2,p))),x),x),And(FreeQ(List(a,b,c,d,e,m,n),x),EqQ($s("n2"),Times(C2,n)),Not(IntegerQ(Times(C1D2,Subtract(m,C1)))),EqQ(Subtract(Sqr(b),Times(C4,a,c)),C0),IntegerQ(p))));
IIntegrate(3261,Int(Times(Power(Plus(a_DEFAULT,Times(Power($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT),b_DEFAULT),Times(Power($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2",true)),c_DEFAULT)),p_DEFAULT),Power($($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_)),x_Symbol),
    Condition(Dist(Power(Times(Power(C4,p),Power(c,p)),CN1),Int(Times(Power(Sin(Plus(d,Times(e,x))),m),Power(Plus(b,Times(C2,c,Power(Cos(Plus(d,Times(e,x))),n))),Times(C2,p))),x),x),And(FreeQ(List(a,b,c,d,e,m,n),x),EqQ($s("n2"),Times(C2,n)),Not(IntegerQ(Times(C1D2,Subtract(m,C1)))),EqQ(Subtract(Sqr(b),Times(C4,a,c)),C0),IntegerQ(p))));
IIntegrate(3262,Int(Times(Power($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power($($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT)),Times(c_DEFAULT,Power($($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2",true)))),p_)),x_Symbol),
    Condition(Dist(Times(Power(Plus(a,Times(b,Power(Sin(Plus(d,Times(e,x))),n)),Times(c,Power(Sin(Plus(d,Times(e,x))),Times(C2,n)))),p),Power(Power(Plus(b,Times(C2,c,Power(Sin(Plus(d,Times(e,x))),n))),Times(C2,p)),CN1)),Int(Times(Power(Cos(Plus(d,Times(e,x))),m),Power(Plus(b,Times(C2,c,Power(Sin(Plus(d,Times(e,x))),n))),Times(C2,p))),x),x),And(FreeQ(List(a,b,c,d,e,m,n,p),x),EqQ($s("n2"),Times(C2,n)),Not(IntegerQ(Times(C1D2,Subtract(m,C1)))),EqQ(Subtract(Sqr(b),Times(C4,a,c)),C0),Not(IntegerQ(p)))));
IIntegrate(3263,Int(Times(Power(Plus(a_DEFAULT,Times(Power($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT),b_DEFAULT),Times(Power($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2",true)),c_DEFAULT)),p_),Power($($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_)),x_Symbol),
    Condition(Dist(Times(Power(Plus(a,Times(b,Power(Cos(Plus(d,Times(e,x))),n)),Times(c,Power(Cos(Plus(d,Times(e,x))),Times(C2,n)))),p),Power(Power(Plus(b,Times(C2,c,Power(Cos(Plus(d,Times(e,x))),n))),Times(C2,p)),CN1)),Int(Times(Power(Sin(Plus(d,Times(e,x))),m),Power(Plus(b,Times(C2,c,Power(Cos(Plus(d,Times(e,x))),n))),Times(C2,p))),x),x),And(FreeQ(List(a,b,c,d,e,m,n,p),x),EqQ($s("n2"),Times(C2,n)),Not(IntegerQ(Times(C1D2,Subtract(m,C1)))),EqQ(Subtract(Sqr(b),Times(C4,a,c)),C0),Not(IntegerQ(p)))));
IIntegrate(3264,Int(Times(Power($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power($($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_)),Times(c_DEFAULT,Power($($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2")))),p_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(f,FreeFactors(Cot(Plus(d,Times(e,x))),x))),Negate(Dist(Times(Power(f,Plus(m,C1)),Power(e,CN1)),Subst(Int(Times(Power(x,m),Power(ExpandToSum(Plus(c,Times(b,Power(Plus(C1,Sqr(x)),Times(C1D2,n))),Times(a,Power(Plus(C1,Sqr(x)),n))),x),p),Power(Power(Plus(C1,Times(Sqr(f),Sqr(x))),Plus(Times(C1D2,m),Times(n,p),C1)),CN1)),x),x,Times(Cot(Plus(d,Times(e,x))),Power(f,CN1))),x))),And(FreeQ(List(a,b,c,d,e),x),EqQ($s("n2"),Times(C2,n)),IntegerQ(Times(C1D2,m)),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),IntegerQ(Times(C1D2,n)),IntegerQ(p))));
IIntegrate(3265,Int(Times(Power(Plus(a_DEFAULT,Times(Power($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_),b_DEFAULT),Times(Power($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2")),c_DEFAULT)),p_DEFAULT),Power($($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(f,FreeFactors(Tan(Plus(d,Times(e,x))),x))),Dist(Times(Power(f,Plus(m,C1)),Power(e,CN1)),Subst(Int(Times(Power(x,m),Power(ExpandToSum(Plus(c,Times(b,Power(Plus(C1,Sqr(x)),Times(C1D2,n))),Times(a,Power(Plus(C1,Sqr(x)),n))),x),p),Power(Power(Plus(C1,Times(Sqr(f),Sqr(x))),Plus(Times(C1D2,m),Times(n,p),C1)),CN1)),x),x,Times(Tan(Plus(d,Times(e,x))),Power(f,CN1))),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ($s("n2"),Times(C2,n)),IntegerQ(Times(C1D2,m)),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),IntegerQ(Times(C1D2,n)),IntegerQ(p))));
IIntegrate(3266,Int(Times(Power($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power($($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT)),Times(c_DEFAULT,Power($($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2",true)))),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandTrig(Times(Power(Subtract(C1,Sqr($($s("§sin"),Plus(d,Times(e,x))))),Times(C1D2,m)),Power(Plus(a,Times(b,Power($($s("§sin"),Plus(d,Times(e,x))),n)),Times(c,Power($($s("§sin"),Plus(d,Times(e,x))),Times(C2,n)))),p)),x),x),And(FreeQ(List(a,b,c,d,e),x),EqQ($s("n2"),Times(C2,n)),IntegerQ(Times(C1D2,m)),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),IntegersQ(n,p))));
IIntegrate(3267,Int(Times(Power(Plus(a_DEFAULT,Times(Power($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT),b_DEFAULT),Times(Power($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2",true)),c_DEFAULT)),p_DEFAULT),Power($($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_DEFAULT)),x_Symbol),
    Condition(Int(ExpandTrig(Times(Power(Subtract(C1,Sqr($($s("§cos"),Plus(d,Times(e,x))))),Times(C1D2,m)),Power(Plus(a,Times(b,Power($($s("§cos"),Plus(d,Times(e,x))),n)),Times(c,Power($($s("§cos"),Plus(d,Times(e,x))),Times(C2,n)))),p)),x),x),And(FreeQ(List(a,b,c,d,e),x),EqQ($s("n2"),Times(C2,n)),IntegerQ(Times(C1D2,m)),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),IntegersQ(n,p))));
IIntegrate(3268,Int(Times(Power(Plus(a_,Times(c_DEFAULT,Power(Times(f_DEFAULT,$($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))),$p("n2",true))),Times(b_DEFAULT,Power(Times(f_DEFAULT,$($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))),n_))),p_DEFAULT),Power($($s("§tan"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(g,FreeFactors(Sin(Plus(d,Times(e,x))),x))),Dist(Times(Power(g,Plus(m,C1)),Power(e,CN1)),Subst(Int(Times(Power(x,m),Power(Plus(a,Times(b,Power(Times(f,g,x),n)),Times(c,Power(Times(f,g,x),Times(C2,n)))),p),Power(Power(Subtract(C1,Times(Sqr(g),Sqr(x))),Times(C1D2,Plus(m,C1))),CN1)),x),x,Times(Sin(Plus(d,Times(e,x))),Power(g,CN1))),x)),And(FreeQ(List(a,b,c,d,e,f,n),x),IntegerQ(Times(C1D2,Subtract(m,C1))),IntegerQ(Times(C2,p)))));
IIntegrate(3269,Int(Times(Power($($s("§cot"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_DEFAULT),Power(Plus(Times(c_DEFAULT,Power(Times($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),f_DEFAULT),$p("n2",true))),Times(b_DEFAULT,Power(Times($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),f_DEFAULT),n_)),a_),p_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(g,FreeFactors(Cos(Plus(d,Times(e,x))),x))),Negate(Dist(Times(Power(g,Plus(m,C1)),Power(e,CN1)),Subst(Int(Times(Power(x,m),Power(Plus(a,Times(b,Power(Times(f,g,x),n)),Times(c,Power(Times(f,g,x),Times(C2,n)))),p),Power(Power(Subtract(C1,Times(Sqr(g),Sqr(x))),Times(C1D2,Plus(m,C1))),CN1)),x),x,Times(Cos(Plus(d,Times(e,x))),Power(g,CN1))),x))),And(FreeQ(List(a,b,c,d,e,f,n),x),IntegerQ(Times(C1D2,Subtract(m,C1))),IntegerQ(Times(C2,p)))));
IIntegrate(3270,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power($($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT)),Times(c_DEFAULT,Power($($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2",true)))),p_DEFAULT),Power($($s("§tan"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_)),x_Symbol),
    Condition(Dist(Power(Times(Power(C4,p),Power(c,p)),CN1),Int(Times(Power(Tan(Plus(d,Times(e,x))),m),Power(Plus(b,Times(C2,c,Power(Sin(Plus(d,Times(e,x))),n))),Times(C2,p))),x),x),And(FreeQ(List(a,b,c,d,e,m,n),x),EqQ($s("n2"),Times(C2,n)),Not(IntegerQ(Times(C1D2,Subtract(m,C1)))),EqQ(Subtract(Sqr(b),Times(C4,a,c)),C0),IntegerQ(p))));
IIntegrate(3271,Int(Times(Power($($s("§cot"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_),Power(Plus(a_DEFAULT,Times(Power($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT),b_DEFAULT),Times(Power($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2",true)),c_DEFAULT)),p_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Times(Power(C4,p),Power(c,p)),CN1),Int(Times(Power(Cot(Plus(d,Times(e,x))),m),Power(Plus(b,Times(C2,c,Power(Cos(Plus(d,Times(e,x))),n))),Times(C2,p))),x),x),And(FreeQ(List(a,b,c,d,e,m,n),x),EqQ($s("n2"),Times(C2,n)),Not(IntegerQ(Times(C1D2,Subtract(m,C1)))),EqQ(Subtract(Sqr(b),Times(C4,a,c)),C0),IntegerQ(p))));
IIntegrate(3272,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power($($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT)),Times(c_DEFAULT,Power($($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2",true)))),p_),Power($($s("§tan"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_)),x_Symbol),
    Condition(Dist(Times(Power(Plus(a,Times(b,Power(Sin(Plus(d,Times(e,x))),n)),Times(c,Power(Sin(Plus(d,Times(e,x))),Times(C2,n)))),p),Power(Power(Plus(b,Times(C2,c,Power(Sin(Plus(d,Times(e,x))),n))),Times(C2,p)),CN1)),Int(Times(Power(Tan(Plus(d,Times(e,x))),m),Power(Plus(b,Times(C2,c,Power(Sin(Plus(d,Times(e,x))),n))),Times(C2,p))),x),x),And(FreeQ(List(a,b,c,d,e,m,n,p),x),EqQ($s("n2"),Times(C2,n)),Not(IntegerQ(Times(C1D2,Subtract(m,C1)))),EqQ(Subtract(Sqr(b),Times(C4,a,c)),C0),Not(IntegerQ(p)))));
IIntegrate(3273,Int(Times(Power($($s("§cot"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_),Power(Plus(a_DEFAULT,Times(Power($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT),b_DEFAULT),Times(Power($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2",true)),c_DEFAULT)),p_)),x_Symbol),
    Condition(Dist(Times(Power(Plus(a,Times(b,Power(Cos(Plus(d,Times(e,x))),n)),Times(c,Power(Cos(Plus(d,Times(e,x))),Times(C2,n)))),p),Power(Power(Plus(b,Times(C2,c,Power(Cos(Plus(d,Times(e,x))),n))),Times(C2,p)),CN1)),Int(Times(Power(Cot(Plus(d,Times(e,x))),m),Power(Plus(b,Times(C2,c,Power(Cos(Plus(d,Times(e,x))),n))),Times(C2,p))),x),x),And(FreeQ(List(a,b,c,d,e,m,n,p),x),EqQ($s("n2"),Times(C2,n)),Not(IntegerQ(Times(C1D2,Subtract(m,C1)))),EqQ(Subtract(Sqr(b),Times(C4,a,c)),C0),Not(IntegerQ(p)))));
IIntegrate(3274,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power($($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_)),Times(c_DEFAULT,Power($($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2")))),p_DEFAULT),Power($($s("§tan"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(f,FreeFactors(Tan(Plus(d,Times(e,x))),x))),Dist(Times(Power(f,Plus(m,C1)),Power(e,CN1)),Subst(Int(Times(Power(x,m),Power(ExpandToSum(Plus(Times(c,Power(x,Times(C2,n))),Times(b,Power(x,n),Power(Plus(C1,Sqr(x)),Times(C1D2,n))),Times(a,Power(Plus(C1,Sqr(x)),n))),x),p),Power(Power(Plus(C1,Times(Sqr(f),Sqr(x))),Plus(Times(n,p),C1)),CN1)),x),x,Times(Tan(Plus(d,Times(e,x))),Power(f,CN1))),x)),And(FreeQ(List(a,b,c,d,e,m),x),EqQ($s("n2"),Times(C2,n)),Not(IntegerQ(Times(C1D2,Subtract(m,C1)))),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),IntegerQ(Times(C1D2,n)),IntegerQ(p))));
IIntegrate(3275,Int(Times(Power($($s("§cot"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_DEFAULT),Power(Plus(a_DEFAULT,Times(Power($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_),b_DEFAULT),Times(Power($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2")),c_DEFAULT)),p_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(f,FreeFactors(Cot(Plus(d,Times(e,x))),x))),Negate(Dist(Times(Power(f,Plus(m,C1)),Power(e,CN1)),Subst(Int(Times(Power(x,m),Power(ExpandToSum(Plus(Times(c,Power(x,Times(C2,n))),Times(b,Power(x,n),Power(Plus(C1,Sqr(x)),Times(C1D2,n))),Times(a,Power(Plus(C1,Sqr(x)),n))),x),p),Power(Power(Plus(C1,Times(Sqr(f),Sqr(x))),Plus(Times(n,p),C1)),CN1)),x),x,Times(Cot(Plus(d,Times(e,x))),Power(f,CN1))),x))),And(FreeQ(List(a,b,c,d,e,m),x),EqQ($s("n2"),Times(C2,n)),Not(IntegerQ(Times(C1D2,Subtract(m,C1)))),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),IntegerQ(Times(C1D2,n)),IntegerQ(p))));
IIntegrate(3276,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power($($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT)),Times(c_DEFAULT,Power($($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2",true)))),p_DEFAULT),Power($($s("§tan"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_DEFAULT)),x_Symbol),
    Condition(Int(ExpandTrig(Times(Power($($s("§sin"),Plus(d,Times(e,x))),m),Power(Plus(a,Times(b,Power($($s("§sin"),Plus(d,Times(e,x))),n)),Times(c,Power($($s("§sin"),Plus(d,Times(e,x))),Times(C2,n)))),p),Power(Power(Subtract(C1,Sqr($($s("§sin"),Plus(d,Times(e,x))))),Times(C1D2,m)),CN1)),x),x),And(FreeQ(List(a,b,c,d,e),x),EqQ($s("n2"),Times(C2,n)),IntegerQ(Times(C1D2,m)),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),IntegersQ(n,p))));
IIntegrate(3277,Int(Times(Power($($s("§cot"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_DEFAULT),Power(Plus(a_DEFAULT,Times(Power($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT),b_DEFAULT),Times(Power($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2",true)),c_DEFAULT)),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandTrig(Times(Power($($s("§cos"),Plus(d,Times(e,x))),m),Power(Plus(a,Times(b,Power($($s("§cos"),Plus(d,Times(e,x))),n)),Times(c,Power($($s("§cos"),Plus(d,Times(e,x))),Times(C2,n)))),p),Power(Power(Subtract(C1,Sqr($($s("§cos"),Plus(d,Times(e,x))))),Times(C1D2,m)),CN1)),x),x),And(FreeQ(List(a,b,c,d,e),x),EqQ($s("n2"),Times(C2,n)),IntegerQ(Times(C1D2,m)),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),IntegersQ(n,p))));
IIntegrate(3278,Int(Times(Power($($s("§cot"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Power(Times(f_DEFAULT,$($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))),$p("n2",true))),Times(b_DEFAULT,Power(Times(f_DEFAULT,$($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))),n_))),p_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(g,FreeFactors(Sin(Plus(d,Times(e,x))),x))),Dist(Times(Power(g,Plus(m,C1)),Power(e,CN1)),Subst(Int(Times(Power(Subtract(C1,Times(Sqr(g),Sqr(x))),Times(C1D2,Subtract(m,C1))),Power(Plus(a,Times(b,Power(Times(f,g,x),n)),Times(c,Power(Times(f,g,x),Times(C2,n)))),p),Power(Power(x,m),CN1)),x),x,Times(Sin(Plus(d,Times(e,x))),Power(g,CN1))),x)),And(FreeQ(List(a,b,c,d,e,f,n),x),IntegerQ(Times(C1D2,Subtract(m,C1))),IntegerQ(Times(C2,p)))));
IIntegrate(3279,Int(Times(Power(Plus(Times(c_DEFAULT,Power(Times($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),f_DEFAULT),$p("n2",true))),Times(b_DEFAULT,Power(Times($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),f_DEFAULT),n_)),a_),p_DEFAULT),Power($($s("§tan"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(g,FreeFactors(Cos(Plus(d,Times(e,x))),x))),Negate(Dist(Times(Power(g,Plus(m,C1)),Power(e,CN1)),Subst(Int(Times(Power(Subtract(C1,Times(Sqr(g),Sqr(x))),Times(C1D2,Subtract(m,C1))),Power(Plus(a,Times(b,Power(Times(f,g,x),n)),Times(c,Power(Times(f,g,x),Times(C2,n)))),p),Power(Power(x,m),CN1)),x),x,Times(Cos(Plus(d,Times(e,x))),Power(g,CN1))),x))),And(FreeQ(List(a,b,c,d,e,f,n),x),IntegerQ(Times(C1D2,Subtract(m,C1))),IntegerQ(Times(C2,p)))));
IIntegrate(3280,Int(Times(Power($($s("§cot"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power($($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT)),Times(c_DEFAULT,Power($($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2",true)))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Times(Power(C4,p),Power(c,p)),CN1),Int(Times(Power(Cot(Plus(d,Times(e,x))),m),Power(Plus(b,Times(C2,c,Power(Sin(Plus(d,Times(e,x))),n))),Times(C2,p))),x),x),And(FreeQ(List(a,b,c,d,e,m,n),x),EqQ($s("n2"),Times(C2,n)),Not(IntegerQ(Times(C1D2,Subtract(m,C1)))),EqQ(Subtract(Sqr(b),Times(C4,a,c)),C0),IntegerQ(p))));
IIntegrate(3281,Int(Times(Power(Plus(a_DEFAULT,Times(Power($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT),b_DEFAULT),Times(Power($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2",true)),c_DEFAULT)),p_DEFAULT),Power($($s("§tan"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_)),x_Symbol),
    Condition(Dist(Power(Times(Power(C4,p),Power(c,p)),CN1),Int(Times(Power(Tan(Plus(d,Times(e,x))),m),Power(Plus(b,Times(C2,c,Power(Cos(Plus(d,Times(e,x))),n))),Times(C2,p))),x),x),And(FreeQ(List(a,b,c,d,e,m,n),x),EqQ($s("n2"),Times(C2,n)),Not(IntegerQ(Times(C1D2,Subtract(m,C1)))),EqQ(Subtract(Sqr(b),Times(C4,a,c)),C0),IntegerQ(p))));
IIntegrate(3282,Int(Times(Power($($s("§cot"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power($($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT)),Times(c_DEFAULT,Power($($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2",true)))),p_)),x_Symbol),
    Condition(Dist(Times(Power(Plus(a,Times(b,Power(Sin(Plus(d,Times(e,x))),n)),Times(c,Power(Sin(Plus(d,Times(e,x))),Times(C2,n)))),p),Power(Power(Plus(b,Times(C2,c,Power(Sin(Plus(d,Times(e,x))),n))),Times(C2,p)),CN1)),Int(Times(Power(Cot(Plus(d,Times(e,x))),m),Power(Plus(b,Times(C2,c,Power(Sin(Plus(d,Times(e,x))),n))),Times(C2,p))),x),x),And(FreeQ(List(a,b,c,d,e,m,n,p),x),EqQ($s("n2"),Times(C2,n)),Not(IntegerQ(Times(C1D2,Subtract(m,C1)))),EqQ(Subtract(Sqr(b),Times(C4,a,c)),C0),Not(IntegerQ(p)))));
IIntegrate(3283,Int(Times(Power(Plus(a_DEFAULT,Times(Power($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT),b_DEFAULT),Times(Power($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2",true)),c_DEFAULT)),p_),Power($($s("§tan"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_)),x_Symbol),
    Condition(Dist(Times(Power(Plus(a,Times(b,Power(Cos(Plus(d,Times(e,x))),n)),Times(c,Power(Cos(Plus(d,Times(e,x))),Times(C2,n)))),p),Power(Power(Plus(b,Times(C2,c,Power(Cos(Plus(d,Times(e,x))),n))),Times(C2,p)),CN1)),Int(Times(Power(Tan(Plus(d,Times(e,x))),m),Power(Plus(b,Times(C2,c,Power(Cos(Plus(d,Times(e,x))),n))),Times(C2,p))),x),x),And(FreeQ(List(a,b,c,d,e,m,n,p),x),EqQ($s("n2"),Times(C2,n)),Not(IntegerQ(Times(C1D2,Subtract(m,C1)))),EqQ(Subtract(Sqr(b),Times(C4,a,c)),C0),Not(IntegerQ(p)))));
IIntegrate(3284,Int(Times(Power($($s("§cot"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power($($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_)),Times(c_DEFAULT,Power($($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2")))),p_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(f,FreeFactors(Cot(Plus(d,Times(e,x))),x))),Negate(Dist(Times(Power(f,Plus(m,C1)),Power(e,CN1)),Subst(Int(Times(Power(x,m),Power(ExpandToSum(Plus(c,Times(b,Power(Plus(C1,Times(Sqr(f),Sqr(x))),Times(C1D2,n))),Times(a,Power(Plus(C1,Times(Sqr(f),Sqr(x))),n))),x),p),Power(Power(Plus(C1,Times(Sqr(f),Sqr(x))),Plus(Times(n,p),C1)),CN1)),x),x,Times(Cot(Plus(d,Times(e,x))),Power(f,CN1))),x))),And(FreeQ(List(a,b,c,d,e,m),x),EqQ($s("n2"),Times(C2,n)),IntegerQ(Times(C1D2,n)),IntegerQ(p))));
IIntegrate(3285,Int(Times(Power(Plus(Times(Power($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_),b_DEFAULT),Times(Power($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2")),c_DEFAULT),a_),p_DEFAULT),Power($($s("§tan"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(f,FreeFactors(Tan(Plus(d,Times(e,x))),x))),Dist(Times(Power(f,Plus(m,C1)),Power(e,CN1)),Subst(Int(Times(Power(x,m),Power(ExpandToSum(Plus(c,Times(b,Power(Plus(C1,Times(Sqr(f),Sqr(x))),Times(C1D2,n))),Times(a,Power(Plus(C1,Times(Sqr(f),Sqr(x))),n))),x),p),Power(Power(Plus(C1,Times(Sqr(f),Sqr(x))),Plus(Times(n,p),C1)),CN1)),x),x,Times(Tan(Plus(d,Times(e,x))),Power(f,CN1))),x)),And(FreeQ(List(a,b,c,d,e,m),x),EqQ($s("n2"),Times(C2,n)),IntegerQ(Times(C1D2,n)),IntegerQ(p))));
IIntegrate(3286,Int(Times(Power($($s("§cot"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power($($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT)),Times(c_DEFAULT,Power($($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2",true)))),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandTrig(Times(Power(Subtract(C1,Sqr($($s("§sin"),Plus(d,Times(e,x))))),Times(C1D2,m)),Power(Plus(a,Times(b,Power($($s("§sin"),Plus(d,Times(e,x))),n)),Times(c,Power($($s("§sin"),Plus(d,Times(e,x))),Times(C2,n)))),p),Power(Power($($s("§sin"),Plus(d,Times(e,x))),m),CN1)),x),x),And(FreeQ(List(a,b,c,d,e),x),EqQ($s("n2"),Times(C2,n)),IntegerQ(Times(C1D2,m)),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),IntegersQ(n,p))));
IIntegrate(3287,Int(Times(Power(Plus(a_DEFAULT,Times(Power($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT),b_DEFAULT),Times(Power($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2",true)),c_DEFAULT)),p_DEFAULT),Power($($s("§tan"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_DEFAULT)),x_Symbol),
    Condition(Int(ExpandTrig(Times(Power(Subtract(C1,Sqr($($s("§cos"),Plus(d,Times(e,x))))),Times(C1D2,m)),Power(Plus(a,Times(b,Power($($s("§cos"),Plus(d,Times(e,x))),n)),Times(c,Power($($s("§cos"),Plus(d,Times(e,x))),Times(C2,n)))),p),Power(Power($($s("§cos"),Plus(d,Times(e,x))),m),CN1)),x),x),And(FreeQ(List(a,b,c,d,e),x),EqQ($s("n2"),Times(C2,n)),IntegerQ(Times(C1D2,m)),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),IntegersQ(n,p))));
IIntegrate(3288,Int(Times(Plus(A_,Times(B_DEFAULT,$($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))),Times(c_DEFAULT,Sqr($($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))))),n_)),x_Symbol),
    Condition(Dist(Power(Times(Power(C4,n),Power(c,n)),CN1),Int(Times(Plus(ASymbol,Times(BSymbol,Sin(Plus(d,Times(e,x))))),Power(Plus(b,Times(C2,c,Sin(Plus(d,Times(e,x))))),Times(C2,n))),x),x),And(FreeQ(List(a,b,c,d,e,ASymbol,BSymbol),x),EqQ(Subtract(Sqr(b),Times(C4,a,c)),C0),IntegerQ(n))));
IIntegrate(3289,Int(Times(Power(Plus(Times($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),b_DEFAULT),Times(Sqr($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))),c_DEFAULT),a_),n_),Plus(Times($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),B_DEFAULT),A_)),x_Symbol),
    Condition(Dist(Power(Times(Power(C4,n),Power(c,n)),CN1),Int(Times(Plus(ASymbol,Times(BSymbol,Cos(Plus(d,Times(e,x))))),Power(Plus(b,Times(C2,c,Cos(Plus(d,Times(e,x))))),Times(C2,n))),x),x),And(FreeQ(List(a,b,c,d,e,ASymbol,BSymbol),x),EqQ(Subtract(Sqr(b),Times(C4,a,c)),C0),IntegerQ(n))));
IIntegrate(3290,Int(Times(Plus(A_,Times(B_DEFAULT,$($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))),Times(c_DEFAULT,Sqr($($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))))),n_)),x_Symbol),
    Condition(Dist(Times(Power(Plus(a,Times(b,Sin(Plus(d,Times(e,x)))),Times(c,Sqr(Sin(Plus(d,Times(e,x)))))),n),Power(Power(Plus(b,Times(C2,c,Sin(Plus(d,Times(e,x))))),Times(C2,n)),CN1)),Int(Times(Plus(ASymbol,Times(BSymbol,Sin(Plus(d,Times(e,x))))),Power(Plus(b,Times(C2,c,Sin(Plus(d,Times(e,x))))),Times(C2,n))),x),x),And(FreeQ(List(a,b,c,d,e,ASymbol,BSymbol),x),EqQ(Subtract(Sqr(b),Times(C4,a,c)),C0),Not(IntegerQ(n)))));
IIntegrate(3291,Int(Times(Power(Plus(Times($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),b_DEFAULT),Times(Sqr($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))),c_DEFAULT),a_),n_),Plus(Times($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),B_DEFAULT),A_)),x_Symbol),
    Condition(Dist(Times(Power(Plus(a,Times(b,Cos(Plus(d,Times(e,x)))),Times(c,Sqr(Cos(Plus(d,Times(e,x)))))),n),Power(Power(Plus(b,Times(C2,c,Cos(Plus(d,Times(e,x))))),Times(C2,n)),CN1)),Int(Times(Plus(ASymbol,Times(BSymbol,Cos(Plus(d,Times(e,x))))),Power(Plus(b,Times(C2,c,Cos(Plus(d,Times(e,x))))),Times(C2,n))),x),x),And(FreeQ(List(a,b,c,d,e,ASymbol,BSymbol),x),EqQ(Subtract(Sqr(b),Times(C4,a,c)),C0),Not(IntegerQ(n)))));
IIntegrate(3292,Int(Times(Plus(A_,Times(B_DEFAULT,$($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))),Times(c_DEFAULT,Sqr($($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))))),CN1)),x_Symbol),
    Condition(Module(List(Set(q,Rt(Subtract(Sqr(b),Times(C4,a,c)),C2))),Plus(Dist(Plus(BSymbol,Times(Subtract(Times(b,BSymbol),Times(C2,ASymbol,c)),Power(q,CN1))),Int(Power(Plus(b,q,Times(C2,c,Sin(Plus(d,Times(e,x))))),CN1),x),x),Dist(Subtract(BSymbol,Times(Subtract(Times(b,BSymbol),Times(C2,ASymbol,c)),Power(q,CN1))),Int(Power(Plus(b,Negate(q),Times(C2,c,Sin(Plus(d,Times(e,x))))),CN1),x),x))),And(FreeQ(List(a,b,c,d,e,ASymbol,BSymbol),x),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0))));
IIntegrate(3293,Int(Times(Power(Plus(a_DEFAULT,Times($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),b_DEFAULT),Times(Sqr($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))),c_DEFAULT)),CN1),Plus(Times($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),B_DEFAULT),A_)),x_Symbol),
    Condition(Module(List(Set(q,Rt(Subtract(Sqr(b),Times(C4,a,c)),C2))),Plus(Dist(Plus(BSymbol,Times(Subtract(Times(b,BSymbol),Times(C2,ASymbol,c)),Power(q,CN1))),Int(Power(Plus(b,q,Times(C2,c,Cos(Plus(d,Times(e,x))))),CN1),x),x),Dist(Subtract(BSymbol,Times(Subtract(Times(b,BSymbol),Times(C2,ASymbol,c)),Power(q,CN1))),Int(Power(Plus(b,Negate(q),Times(C2,c,Cos(Plus(d,Times(e,x))))),CN1),x),x))),And(FreeQ(List(a,b,c,d,e,ASymbol,BSymbol),x),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0))));
IIntegrate(3294,Int(Times(Plus(A_,Times(B_DEFAULT,$($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))),Times(c_DEFAULT,Sqr($($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))))),n_)),x_Symbol),
    Condition(Int(ExpandTrig(Times(Plus(ASymbol,Times(BSymbol,$($s("§sin"),Plus(d,Times(e,x))))),Power(Plus(a,Times(b,$($s("§sin"),Plus(d,Times(e,x)))),Times(c,Sqr($($s("§sin"),Plus(d,Times(e,x)))))),n)),x),x),And(FreeQ(List(a,b,c,d,e,ASymbol,BSymbol),x),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),IntegerQ(n))));
IIntegrate(3295,Int(Times(Power(Plus(a_DEFAULT,Times($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),b_DEFAULT),Times(Sqr($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))),c_DEFAULT)),n_),Plus(Times($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),B_DEFAULT),A_)),x_Symbol),
    Condition(Int(ExpandTrig(Times(Plus(ASymbol,Times(BSymbol,$($s("§cos"),Plus(d,Times(e,x))))),Power(Plus(a,Times(b,$($s("§cos"),Plus(d,Times(e,x)))),Times(c,Sqr($($s("§cos"),Plus(d,Times(e,x)))))),n)),x),x),And(FreeQ(List(a,b,c,d,e,ASymbol,BSymbol),x),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),IntegerQ(n))));
IIntegrate(3296,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Plus(c,Times(d,x)),m),Cos(Plus(e,Times(f,x))),Power(f,CN1)),x)),Dist(Times(d,m,Power(f,CN1)),Int(Times(Power(Plus(c,Times(d,x)),Subtract(m,C1)),Cos(Plus(e,Times(f,x)))),x),x)),And(FreeQ(List(c,d,e,f),x),GtQ(m,C0))));
IIntegrate(3297,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_),$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),x_Symbol),
    Condition(Subtract(Simp(Times(Power(Plus(c,Times(d,x)),Plus(m,C1)),Sin(Plus(e,Times(f,x))),Power(Times(d,Plus(m,C1)),CN1)),x),Dist(Times(f,Power(Times(d,Plus(m,C1)),CN1)),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,C1)),Cos(Plus(e,Times(f,x)))),x),x)),And(FreeQ(List(c,d,e,f),x),LtQ(m,CN1))));
IIntegrate(3298,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),CN1),$($s("§sin"),Plus(e_DEFAULT,Times(Complex(C0,$p("fz")),f_DEFAULT,x_)))),x_Symbol),
    Condition(Simp(Times(CI,SinhIntegral(Plus(Times(c,f,$s("fz"),Power(d,CN1)),Times(f,$s("fz"),x))),Power(d,CN1)),x),And(FreeQ(List(c,d,e,f,$s("fz")),x),EqQ(Subtract(Times(d,e),Times(c,f,$s("fz"),CI)),C0))));
IIntegrate(3299,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),CN1),$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),x_Symbol),
    Condition(Simp(Times(SinIntegral(Plus(e,Times(f,x))),Power(d,CN1)),x),And(FreeQ(List(c,d,e,f),x),EqQ(Subtract(Times(d,e),Times(c,f)),C0))));
IIntegrate(3300,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),CN1),$($s("§sin"),Plus(e_DEFAULT,Times(Complex(C0,$p("fz")),f_DEFAULT,x_)))),x_Symbol),
    Condition(Simp(Times(CoshIntegral(Subtract(Times(CN1,c,f,$s("fz"),Power(d,CN1)),Times(f,$s("fz"),x))),Power(d,CN1)),x),And(FreeQ(List(c,d,e,f,$s("fz")),x),EqQ(Subtract(Times(d,Subtract(e,Times(C1D2,Pi))),Times(c,f,$s("fz"),CI)),C0),NegQ(Times(c,f,$s("fz"),Power(d,CN1)),C0))));
  }
}
}
