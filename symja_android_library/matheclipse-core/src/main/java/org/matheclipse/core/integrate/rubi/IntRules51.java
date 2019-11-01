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
public class IntRules51 { 
  public static IAST RULES = List( 
IIntegrate(1021,Integrate(Times(Plus(g_DEFAULT,Times(h_DEFAULT,x_)),Power(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_),Power(Plus(d_,Times(f_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Subtract(Simp(Times(h,Power(Plus(a,Times(b,x),Times(c,Sqr(x))),p),Power(Plus(d,Times(f,Sqr(x))),Plus(q,C1)),Power(Times(C2,f,Plus(p,q,C1)),CN1)),x),Dist(Power(Times(C2,f,Plus(p,q,C1)),CN1),Integrate(Times(Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Subtract(p,C1)),Power(Plus(d,Times(f,Sqr(x))),q),Simp(Plus(Times(h,p,b,d),Times(a,CN2,g,f,Plus(p,q,C1)),Times(Plus(Times(C2,h,p,Subtract(Times(c,d),Times(a,f))),Times(b,CN2,g,f,Plus(p,q,C1))),x),Times(Plus(Times(h,p,CN1,b,f),Times(c,CN2,g,f,Plus(p,q,C1))),Sqr(x))),x)),x),x)),And(FreeQ(List(a,b,c,d,f,g,h,q),x),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),GtQ(p,C0),NeQ(Plus(p,q,C1),C0)))),
IIntegrate(1022,Integrate(Times(Plus(g_DEFAULT,Times(h_DEFAULT,x_)),Power(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),CN1),Power(Plus(d_,Times(e_DEFAULT,x_),Times(f_DEFAULT,Sqr(x_))),CN1)),x_Symbol),
    Condition(With(List(Set(q,Simplify(Plus(Times(Sqr(c),Sqr(d)),Times(CN1,b,c,d,e),Times(a,c,Sqr(e)),Times(Sqr(b),d,f),Times(CN1,C2,a,c,d,f),Times(CN1,a,b,e,f),Times(Sqr(a),Sqr(f)))))),Condition(Plus(Dist(Power(q,CN1),Integrate(Times(Simp(Plus(Times(g,Sqr(c),d),Times(CN1,g,b,c,e),Times(a,h,c,e),Times(g,Sqr(b),f),Times(CN1,a,b,h,f),Times(CN1,a,g,c,f),Times(c,Subtract(Plus(Times(h,c,d),Times(CN1,g,c,e),Times(g,b,f)),Times(a,h,f)),x)),x),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),CN1)),x),x),Dist(Power(q,CN1),Integrate(Times(Simp(Subtract(Plus(Times(CN1,h,c,d,e),Times(g,c,Sqr(e)),Times(b,h,d,f),Times(CN1,g,c,d,f),Times(CN1,g,b,e,f),Times(a,g,Sqr(f))),Times(f,Subtract(Plus(Times(h,c,d),Times(CN1,g,c,e),Times(g,b,f)),Times(a,h,f)),x)),x),Power(Plus(d,Times(e,x),Times(f,Sqr(x))),CN1)),x),x)),NeQ(q,C0))),And(FreeQ(List(a,b,c,d,e,f,g,h),x),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),NeQ(Subtract(Sqr(e),Times(C4,d,f)),C0)))),
IIntegrate(1023,Integrate(Times(Plus(g_DEFAULT,Times(h_DEFAULT,x_)),Power(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),CN1),Power(Plus(d_,Times(f_DEFAULT,Sqr(x_))),CN1)),x_Symbol),
    Condition(With(List(Set(q,Simplify(Plus(Times(Sqr(c),Sqr(d)),Times(Sqr(b),d,f),Times(CN1,C2,a,c,d,f),Times(Sqr(a),Sqr(f)))))),Condition(Plus(Dist(Power(q,CN1),Integrate(Times(Simp(Plus(Times(g,Sqr(c),d),Times(g,Sqr(b),f),Times(CN1,a,b,h,f),Times(CN1,a,g,c,f),Times(c,Subtract(Plus(Times(h,c,d),Times(g,b,f)),Times(a,h,f)),x)),x),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),CN1)),x),x),Dist(Power(q,CN1),Integrate(Times(Simp(Subtract(Plus(Times(b,h,d,f),Times(CN1,g,c,d,f),Times(a,g,Sqr(f))),Times(f,Subtract(Plus(Times(h,c,d),Times(g,b,f)),Times(a,h,f)),x)),x),Power(Plus(d,Times(f,Sqr(x))),CN1)),x),x)),NeQ(q,C0))),And(FreeQ(List(a,b,c,d,f,g,h),x),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0)))),
IIntegrate(1024,Integrate(Times(Plus(g_,Times(h_DEFAULT,x_)),Power(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),CN1),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_),Times(f_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Dist(Times(CN2,g),Subst(Integrate(Power(Subtract(Subtract(Times(b,d),Times(a,e)),Times(b,Sqr(x))),CN1),x),x,Sqrt(Plus(d,Times(e,x),Times(f,Sqr(x))))),x),And(FreeQ(List(a,b,c,d,e,f,g,h),x),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),NeQ(Subtract(Sqr(e),Times(C4,d,f)),C0),EqQ(Subtract(Times(c,e),Times(b,f)),C0),EqQ(Subtract(Times(h,e),Times(C2,g,f)),C0)))),
IIntegrate(1025,Integrate(Times(Plus(g_DEFAULT,Times(h_DEFAULT,x_)),Power(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),CN1),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_),Times(f_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Plus(Negate(Dist(Times(Subtract(Times(h,e),Times(C2,g,f)),Power(Times(C2,f),CN1)),Integrate(Power(Times(Plus(a,Times(b,x),Times(c,Sqr(x))),Sqrt(Plus(d,Times(e,x),Times(f,Sqr(x))))),CN1),x),x)),Dist(Times(h,Power(Times(C2,f),CN1)),Integrate(Times(Plus(e,Times(C2,f,x)),Power(Times(Plus(a,Times(b,x),Times(c,Sqr(x))),Sqrt(Plus(d,Times(e,x),Times(f,Sqr(x))))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e,f,g,h),x),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),NeQ(Subtract(Sqr(e),Times(C4,d,f)),C0),EqQ(Subtract(Times(c,e),Times(b,f)),C0),NeQ(Subtract(Times(h,e),Times(C2,g,f)),C0)))),
IIntegrate(1026,Integrate(Times(x_,Power(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),CN1),Power(Plus(d_,Times(e_DEFAULT,x_),Times(f_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Dist(Times(CN2,e),Subst(Integrate(Times(Subtract(C1,Times(d,Sqr(x))),Power(Plus(Times(c,e),Times(CN1,b,f),Times(CN1,e,Plus(Times(C2,c,d),Times(CN1,b,e),Times(C2,a,f)),Sqr(x)),Times(Sqr(d),Subtract(Times(c,e),Times(b,f)),Power(x,C4))),CN1)),x),x,Times(Plus(C1,Times(Plus(e,Sqrt(Subtract(Sqr(e),Times(C4,d,f)))),x,Power(Times(C2,d),CN1))),Power(Plus(d,Times(e,x),Times(f,Sqr(x))),CN1D2))),x),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),NeQ(Subtract(Sqr(e),Times(C4,d,f)),C0),EqQ(Subtract(Times(b,d),Times(a,e)),C0)))),
IIntegrate(1027,Integrate(Times(Plus(g_,Times(h_DEFAULT,x_)),Power(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),CN1),Power(Plus(d_,Times(e_DEFAULT,x_),Times(f_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Dist(g,Subst(Integrate(Power(Plus(a,Times(Subtract(Times(c,d),Times(a,f)),Sqr(x))),CN1),x),x,Times(x,Power(Plus(d,Times(e,x),Times(f,Sqr(x))),CN1D2))),x),And(FreeQ(List(a,b,c,d,e,f,g,h),x),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),NeQ(Subtract(Sqr(e),Times(C4,d,f)),C0),EqQ(Subtract(Times(b,d),Times(a,e)),C0),EqQ(Subtract(Times(C2,h,d),Times(g,e)),C0)))),
IIntegrate(1028,Integrate(Times(Plus(g_,Times(h_DEFAULT,x_)),Power(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),CN1),Power(Plus(d_,Times(e_DEFAULT,x_),Times(f_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Plus(Negate(Dist(Times(Subtract(Times(C2,h,d),Times(g,e)),Power(e,CN1)),Integrate(Power(Times(Plus(a,Times(b,x),Times(c,Sqr(x))),Sqrt(Plus(d,Times(e,x),Times(f,Sqr(x))))),CN1),x),x)),Dist(Times(h,Power(e,CN1)),Integrate(Times(Plus(Times(C2,d),Times(e,x)),Power(Times(Plus(a,Times(b,x),Times(c,Sqr(x))),Sqrt(Plus(d,Times(e,x),Times(f,Sqr(x))))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e,f,g,h),x),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),NeQ(Subtract(Sqr(e),Times(C4,d,f)),C0),EqQ(Subtract(Times(b,d),Times(a,e)),C0),NeQ(Subtract(Times(C2,h,d),Times(g,e)),C0)))),
IIntegrate(1029,Integrate(Times(Plus(g_DEFAULT,Times(h_DEFAULT,x_)),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),CN1),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_),Times(f_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Dist(Times(CN2,g,Subtract(Times(g,b),Times(C2,a,h))),Subst(Integrate(Power(Simp(Subtract(Times(g,Subtract(Times(g,b),Times(C2,a,h)),Subtract(Sqr(b),Times(C4,a,c))),Times(Subtract(Times(b,d),Times(a,e)),Sqr(x))),x),CN1),x),x,Times(Simp(Subtract(Subtract(Times(g,b),Times(C2,a,h)),Times(Subtract(Times(b,h),Times(C2,g,c)),x)),x),Power(Plus(d,Times(e,x),Times(f,Sqr(x))),CN1D2))),x),And(FreeQ(List(a,b,c,d,e,f,g,h),x),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),NeQ(Subtract(Sqr(e),Times(C4,d,f)),C0),NeQ(Subtract(Times(b,d),Times(a,e)),C0),EqQ(Plus(Times(Sqr(h),Subtract(Times(b,d),Times(a,e))),Times(CN1,C2,g,h,Subtract(Times(c,d),Times(a,f))),Times(Sqr(g),Subtract(Times(c,e),Times(b,f)))),C0)))),
IIntegrate(1030,Integrate(Times(Plus(g_,Times(h_DEFAULT,x_)),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),CN1),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_),Times(f_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Dist(Times(CN2,a,g,h),Subst(Integrate(Power(Simp(Plus(Times(C2,Sqr(a),g,h,c),Times(a,e,Sqr(x))),x),CN1),x),x,Times(Simp(Subtract(Times(a,h),Times(g,c,x)),x),Power(Plus(d,Times(e,x),Times(f,Sqr(x))),CN1D2))),x),And(FreeQ(List(a,c,d,e,f,g,h),x),EqQ(Subtract(Plus(Times(a,Sqr(h),e),Times(C2,g,h,Subtract(Times(c,d),Times(a,f)))),Times(Sqr(g),c,e)),C0)))),
IIntegrate(1031,Integrate(Times(Plus(g_,Times(h_DEFAULT,x_)),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),CN1),Power(Plus(d_,Times(f_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Dist(Times(CN2,g,Subtract(Times(g,b),Times(C2,a,h))),Subst(Integrate(Power(Simp(Subtract(Times(g,Subtract(Times(g,b),Times(C2,a,h)),Subtract(Sqr(b),Times(C4,a,c))),Times(b,d,Sqr(x))),x),CN1),x),x,Times(Simp(Subtract(Subtract(Times(g,b),Times(C2,a,h)),Times(Subtract(Times(b,h),Times(C2,g,c)),x)),x),Power(Plus(d,Times(f,Sqr(x))),CN1D2))),x),And(FreeQ(List(a,b,c,d,f,g,h),x),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),EqQ(Subtract(Subtract(Times(b,Sqr(h),d),Times(C2,g,h,Subtract(Times(c,d),Times(a,f)))),Times(Sqr(g),b,f)),C0)))),
IIntegrate(1032,Integrate(Times(Plus(g_DEFAULT,Times(h_DEFAULT,x_)),Power(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),CN1),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_),Times(f_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(With(List(Set(q,Rt(Subtract(Sqr(b),Times(C4,a,c)),C2))),Subtract(Dist(Times(Subtract(Times(C2,c,g),Times(h,Subtract(b,q))),Power(q,CN1)),Integrate(Power(Times(Plus(b,Negate(q),Times(C2,c,x)),Sqrt(Plus(d,Times(e,x),Times(f,Sqr(x))))),CN1),x),x),Dist(Times(Subtract(Times(C2,c,g),Times(h,Plus(b,q))),Power(q,CN1)),Integrate(Power(Times(Plus(b,q,Times(C2,c,x)),Sqrt(Plus(d,Times(e,x),Times(f,Sqr(x))))),CN1),x),x))),And(FreeQ(List(a,b,c,d,e,f,g,h),x),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),NeQ(Subtract(Sqr(e),Times(C4,d,f)),C0),PosQ(Subtract(Sqr(b),Times(C4,a,c)))))),
IIntegrate(1033,Integrate(Times(Plus(g_DEFAULT,Times(h_DEFAULT,x_)),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),CN1),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_),Times(f_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(With(List(Set(q,Rt(Times(CN1,a,c),C2))),Plus(Dist(Plus(Times(C1D2,h),Times(c,g,Power(Times(C2,q),CN1))),Integrate(Power(Times(Plus(Negate(q),Times(c,x)),Sqrt(Plus(d,Times(e,x),Times(f,Sqr(x))))),CN1),x),x),Dist(Subtract(Times(C1D2,h),Times(c,g,Power(Times(C2,q),CN1))),Integrate(Power(Times(Plus(q,Times(c,x)),Sqrt(Plus(d,Times(e,x),Times(f,Sqr(x))))),CN1),x),x))),And(FreeQ(List(a,c,d,e,f,g,h),x),NeQ(Subtract(Sqr(e),Times(C4,d,f)),C0),PosQ(Times(CN1,a,c))))),
IIntegrate(1034,Integrate(Times(Plus(g_DEFAULT,Times(h_DEFAULT,x_)),Power(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),CN1),Power(Plus(d_,Times(f_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(With(List(Set(q,Rt(Subtract(Sqr(b),Times(C4,a,c)),C2))),Subtract(Dist(Times(Subtract(Times(C2,c,g),Times(h,Subtract(b,q))),Power(q,CN1)),Integrate(Power(Times(Plus(b,Negate(q),Times(C2,c,x)),Sqrt(Plus(d,Times(f,Sqr(x))))),CN1),x),x),Dist(Times(Subtract(Times(C2,c,g),Times(h,Plus(b,q))),Power(q,CN1)),Integrate(Power(Times(Plus(b,q,Times(C2,c,x)),Sqrt(Plus(d,Times(f,Sqr(x))))),CN1),x),x))),And(FreeQ(List(a,b,c,d,f,g,h),x),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),PosQ(Subtract(Sqr(b),Times(C4,a,c)))))),
IIntegrate(1035,Integrate(Times(Plus(g_DEFAULT,Times(h_DEFAULT,x_)),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),CN1),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_),Times(f_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(With(List(Set(q,Rt(Subtract(Sqr(Subtract(Times(c,d),Times(a,f))),Times(Subtract(Times(b,d),Times(a,e)),Subtract(Times(c,e),Times(b,f)))),C2))),Subtract(Dist(Power(Times(C2,q),CN1),Integrate(Times(Simp(Subtract(Subtract(Times(h,Subtract(Times(b,d),Times(a,e))),Times(g,Subtract(Subtract(Times(c,d),Times(a,f)),q))),Times(Subtract(Times(g,Subtract(Times(c,e),Times(b,f))),Times(h,Plus(Times(c,d),Times(CN1,a,f),q))),x)),x),Power(Times(Plus(a,Times(b,x),Times(c,Sqr(x))),Sqrt(Plus(d,Times(e,x),Times(f,Sqr(x))))),CN1)),x),x),Dist(Power(Times(C2,q),CN1),Integrate(Times(Simp(Subtract(Subtract(Times(h,Subtract(Times(b,d),Times(a,e))),Times(g,Plus(Times(c,d),Times(CN1,a,f),q))),Times(Subtract(Times(g,Subtract(Times(c,e),Times(b,f))),Times(h,Subtract(Subtract(Times(c,d),Times(a,f)),q))),x)),x),Power(Times(Plus(a,Times(b,x),Times(c,Sqr(x))),Sqrt(Plus(d,Times(e,x),Times(f,Sqr(x))))),CN1)),x),x))),And(FreeQ(List(a,b,c,d,e,f,g,h),x),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),NeQ(Subtract(Sqr(e),Times(C4,d,f)),C0),NeQ(Subtract(Times(b,d),Times(a,e)),C0),NegQ(Subtract(Sqr(b),Times(C4,a,c)))))),
IIntegrate(1036,Integrate(Times(Plus(g_DEFAULT,Times(h_DEFAULT,x_)),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),CN1),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_),Times(f_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(With(List(Set(q,Rt(Plus(Sqr(Subtract(Times(c,d),Times(a,f))),Times(a,c,Sqr(e))),C2))),Subtract(Dist(Power(Times(C2,q),CN1),Integrate(Times(Simp(Plus(Times(CN1,a,h,e),Times(CN1,g,Subtract(Subtract(Times(c,d),Times(a,f)),q)),Times(Subtract(Times(h,Plus(Times(c,d),Times(CN1,a,f),q)),Times(g,c,e)),x)),x),Power(Times(Plus(a,Times(c,Sqr(x))),Sqrt(Plus(d,Times(e,x),Times(f,Sqr(x))))),CN1)),x),x),Dist(Power(Times(C2,q),CN1),Integrate(Times(Simp(Plus(Times(CN1,a,h,e),Times(CN1,g,Plus(Times(c,d),Times(CN1,a,f),q)),Times(Subtract(Times(h,Subtract(Subtract(Times(c,d),Times(a,f)),q)),Times(g,c,e)),x)),x),Power(Times(Plus(a,Times(c,Sqr(x))),Sqrt(Plus(d,Times(e,x),Times(f,Sqr(x))))),CN1)),x),x))),And(FreeQ(List(a,c,d,e,f,g,h),x),NeQ(Subtract(Sqr(e),Times(C4,d,f)),C0),NegQ(Times(CN1,a,c))))),
IIntegrate(1037,Integrate(Times(Plus(g_DEFAULT,Times(h_DEFAULT,x_)),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),CN1),Power(Plus(d_,Times(f_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(With(List(Set(q,Rt(Plus(Sqr(Subtract(Times(c,d),Times(a,f))),Times(Sqr(b),d,f)),C2))),Subtract(Dist(Power(Times(C2,q),CN1),Integrate(Times(Simp(Plus(Times(h,b,d),Times(CN1,g,Subtract(Subtract(Times(c,d),Times(a,f)),q)),Times(Plus(Times(h,Plus(Times(c,d),Times(CN1,a,f),q)),Times(g,b,f)),x)),x),Power(Times(Plus(a,Times(b,x),Times(c,Sqr(x))),Sqrt(Plus(d,Times(f,Sqr(x))))),CN1)),x),x),Dist(Power(Times(C2,q),CN1),Integrate(Times(Simp(Plus(Times(h,b,d),Times(CN1,g,Plus(Times(c,d),Times(CN1,a,f),q)),Times(Plus(Times(h,Subtract(Subtract(Times(c,d),Times(a,f)),q)),Times(g,b,f)),x)),x),Power(Times(Plus(a,Times(b,x),Times(c,Sqr(x))),Sqrt(Plus(d,Times(f,Sqr(x))))),CN1)),x),x))),And(FreeQ(List(a,b,c,d,f,g,h),x),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),NegQ(Subtract(Sqr(b),Times(C4,a,c)))))),
IIntegrate(1038,Integrate(Times(Plus(g_DEFAULT,Times(h_DEFAULT,x_)),Power(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),CN1D2),Power(Plus(d_,Times(e_DEFAULT,x_),Times(f_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(With(List(Set(s,Rt(Subtract(Sqr(b),Times(C4,a,c)),C2)),Set(t,Rt(Subtract(Sqr(e),Times(C4,d,f)),C2))),Dist(Times(Sqrt(Plus(b,s,Times(C2,c,x))),Sqrt(Plus(Times(C2,a),Times(Plus(b,s),x))),Sqrt(Plus(e,t,Times(C2,f,x))),Sqrt(Plus(Times(C2,d),Times(Plus(e,t),x))),Power(Times(Sqrt(Plus(a,Times(b,x),Times(c,Sqr(x)))),Sqrt(Plus(d,Times(e,x),Times(f,Sqr(x))))),CN1)),Integrate(Times(Plus(g,Times(h,x)),Power(Times(Sqrt(Plus(b,s,Times(C2,c,x))),Sqrt(Plus(Times(C2,a),Times(Plus(b,s),x))),Sqrt(Plus(e,t,Times(C2,f,x))),Sqrt(Plus(Times(C2,d),Times(Plus(e,t),x)))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e,f,g,h),x),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),NeQ(Subtract(Sqr(e),Times(C4,d,f)),C0)))),
IIntegrate(1039,Integrate(Times(Plus(g_DEFAULT,Times(h_DEFAULT,x_)),Power(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),CN1D2),Power(Plus(d_,Times(f_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(With(List(Set(s,Rt(Subtract(Sqr(b),Times(C4,a,c)),C2)),Set(t,Rt(Times(CN4,d,f),C2))),Dist(Times(Sqrt(Plus(b,s,Times(C2,c,x))),Sqrt(Plus(Times(C2,a),Times(Plus(b,s),x))),Sqrt(Plus(t,Times(C2,f,x))),Sqrt(Plus(Times(C2,d),Times(t,x))),Power(Times(Sqrt(Plus(a,Times(b,x),Times(c,Sqr(x)))),Sqrt(Plus(d,Times(f,Sqr(x))))),CN1)),Integrate(Times(Plus(g,Times(h,x)),Power(Times(Sqrt(Plus(b,s,Times(C2,c,x))),Sqrt(Plus(Times(C2,a),Times(Plus(b,s),x))),Sqrt(Plus(t,Times(C2,f,x))),Sqrt(Plus(Times(C2,d),Times(t,x)))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,f,g,h),x),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0)))),
IIntegrate(1040,Integrate(Times(Plus(g_DEFAULT,Times(h_DEFAULT,x_)),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),CN1D3),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_),Times(f_DEFAULT,Sqr(x_))),CN1)),x_Symbol),
    Condition(With(List(Set(q,Power(Times(CN9,c,Sqr(h),Power(Subtract(Times(C2,c,g),Times(b,h)),CN2)),C1D3))),Plus(Simp(Times(CSqrt3,h,q,ArcTan(Subtract(C1DSqrt3,Times(Power(C2,QQ(2L,3L)),Power(Subtract(C1,Times(C3,h,Plus(b,Times(C2,c,x)),Power(Subtract(Times(C2,c,g),Times(b,h)),CN1))),QQ(2L,3L)),Power(Times(CSqrt3,Power(Plus(C1,Times(C3,h,Plus(b,Times(C2,c,x)),Power(Subtract(Times(C2,c,g),Times(b,h)),CN1))),C1D3)),CN1)))),Power(f,CN1)),x),Negate(Simp(Times(C3,h,q,Log(Plus(Power(Subtract(C1,Times(C3,h,Plus(b,Times(C2,c,x)),Power(Subtract(Times(C2,c,g),Times(b,h)),CN1))),QQ(2L,3L)),Times(Power(C2,C1D3),Power(Plus(C1,Times(C3,h,Plus(b,Times(C2,c,x)),Power(Subtract(Times(C2,c,g),Times(b,h)),CN1))),C1D3)))),Power(Times(C2,f),CN1)),x)),Simp(Times(h,q,Log(Plus(d,Times(e,x),Times(f,Sqr(x)))),Power(Times(C2,f),CN1)),x))),And(FreeQ(List(a,b,c,d,e,f,g,h),x),EqQ(Subtract(Times(c,e),Times(b,f)),C0),EqQ(Subtract(Times(Sqr(c),d),Times(f,Subtract(Sqr(b),Times(C3,a,c)))),C0),EqQ(Plus(Times(Sqr(c),Sqr(g)),Times(CN1,b,c,g,h),Times(CN1,C2,Sqr(b),Sqr(h)),Times(C9,a,c,Sqr(h))),C0),GtQ(Times(CN9,c,Sqr(h),Power(Subtract(Times(C2,c,g),Times(b,h)),CN2)),C0))))
  );
}
