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
public class IntRules120 { 

	public static void initialize() {
		Initializer.init();
	}

	private static class Initializer  {

		private static void init() {
IIntegrate(6001,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Sqr(x_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN2)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(p,C1)),Power(Times(C2,b,Power(c,C3),Sqr(d),Plus(p,C1)),CN1)),x)),Negate(Dist(Times(b,p,Power(Times(C2,c),CN1)),Int(Times(x,Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Subtract(p,C1)),Power(Plus(d,Times(e,Sqr(x))),CN2)),x),x)),Simp(Times(x,Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p),Power(Times(C2,Sqr(c),d,Plus(d,Times(e,Sqr(x)))),CN1)),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),GtQ(p,C0))));
IIntegrate(6002,Int(Times(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Times(c,d,Sqr(m)),CN1)),x)),Negate(Dist(Times(Sqr(f),Subtract(m,C1),Power(Times(Sqr(c),d,m),CN1)),Int(Times(Power(Times(f,x),Subtract(m,C2)),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Plus(a,Times(b,ArcTanh(Times(c,x))))),x),x)),Simp(Times(f,Power(Times(f,x),Subtract(m,C1)),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Plus(a,Times(b,ArcTanh(Times(c,x)))),Power(Times(Sqr(c),d,m),CN1)),x)),And(FreeQ(List(a,b,c,d,e,f),x),EqQ(Plus(Times(Sqr(c),d),e),C0),EqQ(Plus(m,Times(C2,q),C2),C0),LtQ(q,CN1))));
IIntegrate(6003,Int(Times(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Times(c,d,Sqr(m)),CN1)),x)),Negate(Dist(Times(Sqr(f),Subtract(m,C1),Power(Times(Sqr(c),d,m),CN1)),Int(Times(Power(Times(f,x),Subtract(m,C2)),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Plus(a,Times(b,ArcCoth(Times(c,x))))),x),x)),Simp(Times(f,Power(Times(f,x),Subtract(m,C1)),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Plus(a,Times(b,ArcCoth(Times(c,x)))),Power(Times(Sqr(c),d,m),CN1)),x)),And(FreeQ(List(a,b,c,d,e,f),x),EqQ(Plus(Times(Sqr(c),d),e),C0),EqQ(Plus(m,Times(C2,q),C2),C0),LtQ(q,CN1))));
IIntegrate(6004,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_),Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,p,Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Subtract(p,C1)),Power(Times(c,d,Sqr(m)),CN1)),x)),Negate(Dist(Times(Sqr(f),Subtract(m,C1),Power(Times(Sqr(c),d,m),CN1)),Int(Times(Power(Times(f,x),Subtract(m,C2)),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p)),x),x)),Dist(Times(Sqr(b),p,Subtract(p,C1),Power(m,CN2)),Int(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Subtract(p,C2))),x),x),Simp(Times(f,Power(Times(f,x),Subtract(m,C1)),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p),Power(Times(Sqr(c),d,m),CN1)),x)),And(FreeQ(List(a,b,c,d,e,f,m),x),EqQ(Plus(Times(Sqr(c),d),e),C0),EqQ(Plus(m,Times(C2,q),C2),C0),LtQ(q,CN1),GtQ(p,C1))));
IIntegrate(6005,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_),Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,p,Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Subtract(p,C1)),Power(Times(c,d,Sqr(m)),CN1)),x)),Negate(Dist(Times(Sqr(f),Subtract(m,C1),Power(Times(Sqr(c),d,m),CN1)),Int(Times(Power(Times(f,x),Subtract(m,C2)),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p)),x),x)),Dist(Times(Sqr(b),p,Subtract(p,C1),Power(m,CN2)),Int(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Subtract(p,C2))),x),x),Simp(Times(f,Power(Times(f,x),Subtract(m,C1)),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p),Power(Times(Sqr(c),d,m),CN1)),x)),And(FreeQ(List(a,b,c,d,e,f,m),x),EqQ(Plus(Times(Sqr(c),d),e),C0),EqQ(Plus(m,Times(C2,q),C2),C0),LtQ(q,CN1),GtQ(p,C1))));
IIntegrate(6006,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_),Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_DEFAULT)),x_Symbol),
    Condition(Subtract(Simp(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(p,C1)),Power(Times(b,c,d,Plus(p,C1)),CN1)),x),Dist(Times(f,m,Power(Times(b,c,Plus(p,C1)),CN1)),Int(Times(Power(Times(f,x),Subtract(m,C1)),Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(p,C1))),x),x)),And(FreeQ(List(a,b,c,d,e,f,m,q),x),EqQ(Plus(Times(Sqr(c),d),e),C0),EqQ(Plus(m,Times(C2,q),C2),C0),LtQ(p,CN1))));
IIntegrate(6007,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_),Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_DEFAULT)),x_Symbol),
    Condition(Subtract(Simp(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(p,C1)),Power(Times(b,c,d,Plus(p,C1)),CN1)),x),Dist(Times(f,m,Power(Times(b,c,Plus(p,C1)),CN1)),Int(Times(Power(Times(f,x),Subtract(m,C1)),Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(p,C1))),x),x)),And(FreeQ(List(a,b,c,d,e,f,m,q),x),EqQ(Plus(Times(Sqr(c),d),e),C0),EqQ(Plus(m,Times(C2,q),C2),C0),LtQ(p,CN1))));
IIntegrate(6008,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_DEFAULT)),x_Symbol),
    Condition(Subtract(Simp(Times(Power(Times(f,x),Plus(m,C1)),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p),Power(Times(d,Plus(m,C1)),CN1)),x),Dist(Times(b,c,p,Power(Plus(m,C1),CN1)),Int(Times(Power(Times(f,x),Plus(m,C1)),Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Subtract(p,C1))),x),x)),And(FreeQ(List(a,b,c,d,e,f,m,q),x),EqQ(Plus(Times(Sqr(c),d),e),C0),EqQ(Plus(m,Times(C2,q),C3),C0),GtQ(p,C0),NeQ(m,CN1))));
IIntegrate(6009,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_DEFAULT)),x_Symbol),
    Condition(Subtract(Simp(Times(Power(Times(f,x),Plus(m,C1)),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p),Power(Times(d,f,Plus(m,C1)),CN1)),x),Dist(Times(b,c,p,Power(Times(f,Plus(m,C1)),CN1)),Int(Times(Power(Times(f,x),Plus(m,C1)),Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Subtract(p,C1))),x),x)),And(FreeQ(List(a,b,c,d,e,f,m,q),x),EqQ(Plus(Times(Sqr(c),d),e),C0),EqQ(Plus(m,Times(C2,q),C3),C0),GtQ(p,C0),NeQ(m,CN1))));
IIntegrate(6010,Int(Times(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Times(f_DEFAULT,x_),m_),Sqrt(Plus(d_,Times(e_DEFAULT,Sqr(x_))))),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(f,x),Plus(m,C1)),Sqrt(Plus(d,Times(e,Sqr(x)))),Plus(a,Times(b,ArcTanh(Times(c,x)))),Power(Times(f,Plus(m,C2)),CN1)),x),Dist(Times(d,Power(Plus(m,C2),CN1)),Int(Times(Power(Times(f,x),m),Plus(a,Times(b,ArcTanh(Times(c,x)))),Power(Plus(d,Times(e,Sqr(x))),CN1D2)),x),x),Negate(Dist(Times(b,c,d,Power(Times(f,Plus(m,C2)),CN1)),Int(Times(Power(Times(f,x),Plus(m,C1)),Power(Plus(d,Times(e,Sqr(x))),CN1D2)),x),x))),And(FreeQ(List(a,b,c,d,e,f,m),x),EqQ(Plus(Times(Sqr(c),d),e),C0),NeQ(m,CN2))));
IIntegrate(6011,Int(Times(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Times(f_DEFAULT,x_),m_),Sqrt(Plus(d_,Times(e_DEFAULT,Sqr(x_))))),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(f,x),Plus(m,C1)),Sqrt(Plus(d,Times(e,Sqr(x)))),Plus(a,Times(b,ArcCoth(Times(c,x)))),Power(Times(f,Plus(m,C2)),CN1)),x),Dist(Times(d,Power(Plus(m,C2),CN1)),Int(Times(Power(Times(f,x),m),Plus(a,Times(b,ArcCoth(Times(c,x)))),Power(Plus(d,Times(e,Sqr(x))),CN1D2)),x),x),Negate(Dist(Times(b,c,d,Power(Times(f,Plus(m,C2)),CN1)),Int(Times(Power(Times(f,x),Plus(m,C1)),Power(Plus(d,Times(e,Sqr(x))),CN1D2)),x),x))),And(FreeQ(List(a,b,c,d,e,f,m),x),EqQ(Plus(Times(Sqr(c),d),e),C0),NeQ(m,CN2))));
IIntegrate(6012,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p)),x),x),And(FreeQ(List(a,b,c,d,e,f,m),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IGtQ(p,C0),IGtQ(q,C1))));
IIntegrate(6013,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p)),x),x),And(FreeQ(List(a,b,c,d,e,f,m),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IGtQ(p,C0),IGtQ(q,C1))));
IIntegrate(6014,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_DEFAULT)),x_Symbol),
    Condition(Subtract(Dist(d,Int(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),Subtract(q,C1)),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p)),x),x),Dist(Times(Sqr(c),d,Power(f,CN2)),Int(Times(Power(Times(f,x),Plus(m,C2)),Power(Plus(d,Times(e,Sqr(x))),Subtract(q,C1)),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p)),x),x)),And(FreeQ(List(a,b,c,d,e,f,m),x),EqQ(Plus(Times(Sqr(c),d),e),C0),GtQ(q,C0),IGtQ(p,C0),Or(RationalQ(m),And(EqQ(p,C1),IntegerQ(q))))));
IIntegrate(6015,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_DEFAULT)),x_Symbol),
    Condition(Subtract(Dist(d,Int(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),Subtract(q,C1)),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p)),x),x),Dist(Times(Sqr(c),d,Power(f,CN2)),Int(Times(Power(Times(f,x),Plus(m,C2)),Power(Plus(d,Times(e,Sqr(x))),Subtract(q,C1)),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p)),x),x)),And(FreeQ(List(a,b,c,d,e,f,m),x),EqQ(Plus(Times(Sqr(c),d),e),C0),GtQ(q,C0),IGtQ(p,C0),Or(RationalQ(m),And(EqQ(p,C1),IntegerQ(q))))));
IIntegrate(6016,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(f,Power(Times(f,x),Subtract(m,C1)),Sqrt(Plus(d,Times(e,Sqr(x)))),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p),Power(Times(Sqr(c),d,m),CN1)),x)),Dist(Times(b,f,p,Power(Times(c,m),CN1)),Int(Times(Power(Times(f,x),Subtract(m,C1)),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Subtract(p,C1)),Power(Plus(d,Times(e,Sqr(x))),CN1D2)),x),x),Dist(Times(Sqr(f),Subtract(m,C1),Power(Times(Sqr(c),m),CN1)),Int(Times(Power(Times(f,x),Subtract(m,C2)),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p),Power(Plus(d,Times(e,Sqr(x))),CN1D2)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),EqQ(Plus(Times(Sqr(c),d),e),C0),GtQ(p,C0),GtQ(m,C1))));
IIntegrate(6017,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(f,Power(Times(f,x),Subtract(m,C1)),Sqrt(Plus(d,Times(e,Sqr(x)))),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p),Power(Times(Sqr(c),d,m),CN1)),x)),Dist(Times(b,f,p,Power(Times(c,m),CN1)),Int(Times(Power(Times(f,x),Subtract(m,C1)),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Subtract(p,C1)),Power(Plus(d,Times(e,Sqr(x))),CN1D2)),x),x),Dist(Times(Sqr(f),Subtract(m,C1),Power(Times(Sqr(c),m),CN1)),Int(Times(Power(Times(f,x),Subtract(m,C2)),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p),Power(Plus(d,Times(e,Sqr(x))),CN1D2)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),EqQ(Plus(Times(Sqr(c),d),e),C0),GtQ(p,C0),GtQ(m,C1))));
IIntegrate(6018,Int(Times(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(x_,CN1),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Plus(Simp(Times(CN2,Plus(a,Times(b,ArcTanh(Times(c,x)))),ArcTanh(Times(Sqrt(Subtract(C1,Times(c,x))),Power(Plus(C1,Times(c,x)),CN1D2))),Power(d,CN1D2)),x),Simp(Times(b,PolyLog(C2,Times(CN1,Sqrt(Subtract(C1,Times(c,x))),Power(Plus(C1,Times(c,x)),CN1D2))),Power(d,CN1D2)),x),Negate(Simp(Times(b,PolyLog(C2,Times(Sqrt(Subtract(C1,Times(c,x))),Power(Plus(C1,Times(c,x)),CN1D2))),Power(d,CN1D2)),x))),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),GtQ(d,C0))));
IIntegrate(6019,Int(Times(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(x_,CN1),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Plus(Simp(Times(CN2,Plus(a,Times(b,ArcCoth(Times(c,x)))),ArcTanh(Times(Sqrt(Subtract(C1,Times(c,x))),Power(Plus(C1,Times(c,x)),CN1D2))),Power(d,CN1D2)),x),Simp(Times(b,PolyLog(C2,Times(CN1,Sqrt(Subtract(C1,Times(c,x))),Power(Plus(C1,Times(c,x)),CN1D2))),Power(d,CN1D2)),x),Negate(Simp(Times(b,PolyLog(C2,Times(Sqrt(Subtract(C1,Times(c,x))),Power(Plus(C1,Times(c,x)),CN1D2))),Power(d,CN1D2)),x))),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),GtQ(d,C0))));
IIntegrate(6020,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_),Power(x_,CN1),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Dist(Power(d,CN1D2),Subst(Int(Times(Power(Plus(a,Times(b,x)),p),Csch(x)),x),x,ArcTanh(Times(c,x))),x),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IGtQ(p,C0),GtQ(d,C0))));
IIntegrate(6021,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_),Power(x_,CN1),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Negate(Dist(Times(c,x,Sqrt(Subtract(C1,Power(Times(Sqr(c),Sqr(x)),CN1))),Power(Plus(d,Times(e,Sqr(x))),CN1D2)),Subst(Int(Times(Power(Plus(a,Times(b,x)),p),Sech(x)),x),x,ArcCoth(Times(c,x))),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IGtQ(p,C0),GtQ(d,C0))));
IIntegrate(6022,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(x_,CN1),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Dist(Times(Sqrt(Subtract(C1,Times(Sqr(c),Sqr(x)))),Power(Plus(d,Times(e,Sqr(x))),CN1D2)),Int(Times(Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p),Power(Times(x,Sqrt(Subtract(C1,Times(Sqr(c),Sqr(x))))),CN1)),x),x),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IGtQ(p,C0),Not(GtQ(d,C0)))));
IIntegrate(6023,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(x_,CN1),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Dist(Times(Sqrt(Subtract(C1,Times(Sqr(c),Sqr(x)))),Power(Plus(d,Times(e,Sqr(x))),CN1D2)),Int(Times(Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p),Power(Times(x,Sqrt(Subtract(C1,Times(Sqr(c),Sqr(x))))),CN1)),x),x),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IGtQ(p,C0),Not(GtQ(d,C0)))));
IIntegrate(6024,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(x_,CN2),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Sqrt(Plus(d,Times(e,Sqr(x)))),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p),Power(Times(d,x),CN1)),x)),Dist(Times(b,c,p),Int(Times(Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Subtract(p,C1)),Power(Times(x,Sqrt(Plus(d,Times(e,Sqr(x))))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),GtQ(p,C0))));
IIntegrate(6025,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(x_,CN2),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Sqrt(Plus(d,Times(e,Sqr(x)))),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p),Power(Times(d,x),CN1)),x)),Dist(Times(b,c,p),Int(Times(Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Subtract(p,C1)),Power(Times(x,Sqrt(Plus(d,Times(e,Sqr(x))))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),GtQ(p,C0))));
IIntegrate(6026,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(f,x),Plus(m,C1)),Sqrt(Plus(d,Times(e,Sqr(x)))),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p),Power(Times(d,f,Plus(m,C1)),CN1)),x),Negate(Dist(Times(b,c,p,Power(Times(f,Plus(m,C1)),CN1)),Int(Times(Power(Times(f,x),Plus(m,C1)),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Subtract(p,C1)),Power(Plus(d,Times(e,Sqr(x))),CN1D2)),x),x)),Dist(Times(Sqr(c),Plus(m,C2),Power(Times(Sqr(f),Plus(m,C1)),CN1)),Int(Times(Power(Times(f,x),Plus(m,C2)),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p),Power(Plus(d,Times(e,Sqr(x))),CN1D2)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),EqQ(Plus(Times(Sqr(c),d),e),C0),GtQ(p,C0),LtQ(m,CN1),NeQ(m,CN2))));
IIntegrate(6027,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(f,x),Plus(m,C1)),Sqrt(Plus(d,Times(e,Sqr(x)))),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p),Power(Times(d,f,Plus(m,C1)),CN1)),x),Negate(Dist(Times(b,c,p,Power(Times(f,Plus(m,C1)),CN1)),Int(Times(Power(Times(f,x),Plus(m,C1)),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Subtract(p,C1)),Power(Plus(d,Times(e,Sqr(x))),CN1D2)),x),x)),Dist(Times(Sqr(c),Plus(m,C2),Power(Times(Sqr(f),Plus(m,C1)),CN1)),Int(Times(Power(Times(f,x),Plus(m,C2)),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p),Power(Plus(d,Times(e,Sqr(x))),CN1D2)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),EqQ(Plus(Times(Sqr(c),d),e),C0),GtQ(p,C0),LtQ(m,CN1),NeQ(m,CN2))));
IIntegrate(6028,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(x_,m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Subtract(Dist(Power(e,CN1),Int(Times(Power(x,Subtract(m,C2)),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p)),x),x),Dist(Times(d,Power(e,CN1)),Int(Times(Power(x,Subtract(m,C2)),Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p)),x),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IntegersQ(p,Times(C2,q)),LtQ(q,CN1),IGtQ(m,C1),NeQ(p,CN1))));
IIntegrate(6029,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(x_,m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Subtract(Dist(Power(e,CN1),Int(Times(Power(x,Subtract(m,C2)),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p)),x),x),Dist(Times(d,Power(e,CN1)),Int(Times(Power(x,Subtract(m,C2)),Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p)),x),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IntegersQ(p,Times(C2,q)),LtQ(q,CN1),IGtQ(m,C1),NeQ(p,CN1))));
IIntegrate(6030,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(x_,m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Subtract(Dist(Power(d,CN1),Int(Times(Power(x,m),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p)),x),x),Dist(Times(e,Power(d,CN1)),Int(Times(Power(x,Plus(m,C2)),Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p)),x),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IntegersQ(p,Times(C2,q)),LtQ(q,CN1),ILtQ(m,C0),NeQ(p,CN1))));
IIntegrate(6031,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(x_,m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Subtract(Dist(Power(d,CN1),Int(Times(Power(x,m),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p)),x),x),Dist(Times(e,Power(d,CN1)),Int(Times(Power(x,Plus(m,C2)),Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p)),x),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IntegersQ(p,Times(C2,q)),LtQ(q,CN1),ILtQ(m,C0),NeQ(p,CN1))));
IIntegrate(6032,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(x_,m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(x,m),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(p,C1)),Power(Times(b,c,d,Plus(p,C1)),CN1)),x),Dist(Times(c,Plus(m,Times(C2,q),C2),Power(Times(b,Plus(p,C1)),CN1)),Int(Times(Power(x,Plus(m,C1)),Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(p,C1))),x),x),Negate(Dist(Times(m,Power(Times(b,c,Plus(p,C1)),CN1)),Int(Times(Power(x,Subtract(m,C1)),Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(p,C1))),x),x))),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IntegerQ(m),LtQ(q,CN1),LtQ(p,CN1),NeQ(Plus(m,Times(C2,q),C2),C0))));
IIntegrate(6033,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(x_,m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(x,m),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(p,C1)),Power(Times(b,c,d,Plus(p,C1)),CN1)),x),Dist(Times(c,Plus(m,Times(C2,q),C2),Power(Times(b,Plus(p,C1)),CN1)),Int(Times(Power(x,Plus(m,C1)),Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(p,C1))),x),x),Negate(Dist(Times(m,Power(Times(b,c,Plus(p,C1)),CN1)),Int(Times(Power(x,Subtract(m,C1)),Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(p,C1))),x),x))),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IntegerQ(m),LtQ(q,CN1),LtQ(p,CN1),NeQ(Plus(m,Times(C2,q),C2),C0))));
IIntegrate(6034,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(x_,m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Dist(Times(Power(d,q),Power(Power(c,Plus(m,C1)),CN1)),Subst(Int(Times(Power(Plus(a,Times(b,x)),p),Power(Sinh(x),m),Power(Power(Cosh(x),Plus(m,Times(C2,Plus(q,C1)))),CN1)),x),x,ArcTanh(Times(c,x))),x),And(FreeQ(List(a,b,c,d,e,p),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IGtQ(m,C0),ILtQ(Plus(m,Times(C2,q),C1),C0),Or(IntegerQ(q),GtQ(d,C0)))));
IIntegrate(6035,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(x_,m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Dist(Times(Power(d,Plus(q,C1D2)),Sqrt(Subtract(C1,Times(Sqr(c),Sqr(x)))),Power(Plus(d,Times(e,Sqr(x))),CN1D2)),Int(Times(Power(x,m),Power(Subtract(C1,Times(Sqr(c),Sqr(x))),q),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p)),x),x),And(FreeQ(List(a,b,c,d,e,p),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IGtQ(m,C0),ILtQ(Plus(m,Times(C2,q),C1),C0),Not(Or(IntegerQ(q),GtQ(d,C0))))));
IIntegrate(6036,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(x_,m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Negate(Dist(Times(Power(Negate(d),q),Power(Power(c,Plus(m,C1)),CN1)),Subst(Int(Times(Power(Plus(a,Times(b,x)),p),Power(Cosh(x),m),Power(Power(Sinh(x),Plus(m,Times(C2,Plus(q,C1)))),CN1)),x),x,ArcCoth(Times(c,x))),x)),And(FreeQ(List(a,b,c,d,e,p),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IGtQ(m,C0),ILtQ(Plus(m,Times(C2,q),C1),C0),IntegerQ(q))));
IIntegrate(6037,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(x_,m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Negate(Dist(Times(Power(Negate(d),Plus(q,C1D2)),x,Sqrt(Times(Subtract(Times(Sqr(c),Sqr(x)),C1),Power(Times(Sqr(c),Sqr(x)),CN1))),Power(Times(Power(c,m),Sqrt(Plus(d,Times(e,Sqr(x))))),CN1)),Subst(Int(Times(Power(Plus(a,Times(b,x)),p),Power(Cosh(x),m),Power(Power(Sinh(x),Plus(m,Times(C2,Plus(q,C1)))),CN1)),x),x,ArcCoth(Times(c,x))),x)),And(FreeQ(List(a,b,c,d,e,p),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IGtQ(m,C0),ILtQ(Plus(m,Times(C2,q),C1),C0),Not(IntegerQ(q)))));
IIntegrate(6038,Int(Times(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),x_,Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),q_DEFAULT)),x_Symbol),
    Condition(Subtract(Simp(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Plus(a,Times(b,ArcTanh(Times(c,x)))),Power(Times(C2,e,Plus(q,C1)),CN1)),x),Dist(Times(b,c,Power(Times(C2,e,Plus(q,C1)),CN1)),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Subtract(C1,Times(Sqr(c),Sqr(x))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e,q),x),NeQ(q,CN1))));
IIntegrate(6039,Int(Times(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),x_,Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),q_DEFAULT)),x_Symbol),
    Condition(Subtract(Simp(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Plus(a,Times(b,ArcCoth(Times(c,x)))),Power(Times(C2,e,Plus(q,C1)),CN1)),x),Dist(Times(b,c,Power(Times(C2,e,Plus(q,C1)),CN1)),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Subtract(C1,Times(Sqr(c),Sqr(x))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e,q),x),NeQ(q,CN1))));
IIntegrate(6040,Int(Times(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),q_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),q)),x))),Subtract(Dist(Plus(a,Times(b,ArcTanh(Times(c,x)))),u,x),Dist(Times(b,c),Int(SimplifyIntegrand(Times(u,Power(Subtract(C1,Times(Sqr(c),Sqr(x))),CN1)),x),x),x))),And(FreeQ(List(a,b,c,d,e,f,m,q),x),Or(And(IGtQ(q,C0),Not(And(ILtQ(Times(C1D2,Subtract(m,C1)),C0),GtQ(Plus(m,Times(C2,q),C3),C0)))),And(IGtQ(Times(C1D2,Plus(m,C1)),C0),Not(And(ILtQ(q,C0),GtQ(Plus(m,Times(C2,q),C3),C0)))),And(ILtQ(Times(C1D2,Plus(m,Times(C2,q),C1)),C0),Not(ILtQ(Times(C1D2,Subtract(m,C1)),C0)))))));
IIntegrate(6041,Int(Times(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),q_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),q)),x))),Subtract(Dist(Plus(a,Times(b,ArcCoth(Times(c,x)))),u,x),Dist(Times(b,c),Int(SimplifyIntegrand(Times(u,Power(Subtract(C1,Times(Sqr(c),Sqr(x))),CN1)),x),x),x))),And(FreeQ(List(a,b,c,d,e,f,m,q),x),Or(And(IGtQ(q,C0),Not(And(ILtQ(Times(C1D2,Subtract(m,C1)),C0),GtQ(Plus(m,Times(C2,q),C3),C0)))),And(IGtQ(Times(C1D2,Plus(m,C1)),C0),Not(And(ILtQ(q,C0),GtQ(Plus(m,Times(C2,q),C3),C0)))),And(ILtQ(Times(C1D2,Plus(m,Times(C2,q),C1)),C0),Not(ILtQ(Times(C1D2,Subtract(m,C1)),C0)))))));
IIntegrate(6042,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),x_,Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN2)),x_Symbol),
    Condition(Subtract(Dist(Power(Times(C4,Sqr(d),Rt(Times(CN1,e,Power(d,CN1)),C2)),CN1),Int(Times(Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p),Power(Subtract(C1,Times(Rt(Times(CN1,e,Power(d,CN1)),C2),x)),CN2)),x),x),Dist(Power(Times(C4,Sqr(d),Rt(Times(CN1,e,Power(d,CN1)),C2)),CN1),Int(Times(Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p),Power(Plus(C1,Times(Rt(Times(CN1,e,Power(d,CN1)),C2),x)),CN2)),x),x)),And(FreeQ(List(a,b,c,d,e),x),IGtQ(p,C0))));
IIntegrate(6043,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),x_,Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN2)),x_Symbol),
    Condition(Subtract(Dist(Power(Times(C4,Sqr(d),Rt(Times(CN1,e,Power(d,CN1)),C2)),CN1),Int(Times(Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p),Power(Subtract(C1,Times(Rt(Times(CN1,e,Power(d,CN1)),C2),x)),CN2)),x),x),Dist(Power(Times(C4,Sqr(d),Rt(Times(CN1,e,Power(d,CN1)),C2)),CN1),Int(Times(Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p),Power(Plus(C1,Times(Rt(Times(CN1,e,Power(d,CN1)),C2),x)),CN2)),x),x)),And(FreeQ(List(a,b,c,d,e),x),IGtQ(p,C0))));
IIntegrate(6044,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,ExpandIntegrand(Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p),Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),q)),x))),Condition(Int(u,x),SumQ(u))),And(FreeQ(List(a,b,c,d,e,f,m),x),IntegerQ(q),IGtQ(p,C0),Or(GtQ(q,C0),IntegerQ(m)))));
IIntegrate(6045,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,ExpandIntegrand(Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p),Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),q)),x))),Condition(Int(u,x),SumQ(u))),And(FreeQ(List(a,b,c,d,e,f,m),x),IntegerQ(q),IGtQ(p,C0),Or(GtQ(q,C0),IntegerQ(m)))));
IIntegrate(6046,Int(Times(Plus(Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT),a_),Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_DEFAULT)),x_Symbol),
    Condition(Plus(Dist(a,Int(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),q)),x),x),Dist(b,Int(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),q),ArcTanh(Times(c,x))),x),x)),FreeQ(List(a,b,c,d,e,f,m,q),x)));
IIntegrate(6047,Int(Times(Plus(Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT),a_),Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_DEFAULT)),x_Symbol),
    Condition(Plus(Dist(a,Int(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),q)),x),x),Dist(b,Int(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),q),ArcCoth(Times(c,x))),x),x)),FreeQ(List(a,b,c,d,e,f,m,q),x)));
IIntegrate(6048,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,x_)),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p),Power(Plus(d,Times(e,Sqr(x))),CN1)),Power(Plus(f,Times(g,x)),m),x),x),And(FreeQ(List(a,b,c,d,e,f,g),x),IGtQ(p,C0),EqQ(Plus(Times(Sqr(c),d),e),C0),IGtQ(m,C0))));
IIntegrate(6049,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,x_)),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p),Power(Plus(d,Times(e,Sqr(x))),CN1)),Power(Plus(f,Times(g,x)),m),x),x),And(FreeQ(List(a,b,c,d,e,f,g),x),IGtQ(p,C0),EqQ(Plus(Times(Sqr(c),d),e),C0),IGtQ(m,C0))));
IIntegrate(6050,Int(Times(ArcTanh(u_),Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1)),x_Symbol),
    Condition(Subtract(Dist(C1D2,Int(Times(Log(Plus(C1,u)),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p),Power(Plus(d,Times(e,Sqr(x))),CN1)),x),x),Dist(C1D2,Int(Times(Log(Subtract(C1,u)),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p),Power(Plus(d,Times(e,Sqr(x))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e),x),IGtQ(p,C0),EqQ(Plus(Times(Sqr(c),d),e),C0),EqQ(Subtract(Sqr(u),Sqr(Subtract(C1,Times(C2,Power(Plus(C1,Times(c,x)),CN1))))),C0))));
  }
}
}
