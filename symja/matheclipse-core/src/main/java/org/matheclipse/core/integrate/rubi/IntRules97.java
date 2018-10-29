package org.matheclipse.core.integrate.rubi;


import org.matheclipse.core.interfaces.IAST;

import static org.matheclipse.core.expression.F.And;
import static org.matheclipse.core.expression.F.ArcCot;
import static org.matheclipse.core.expression.F.ArcCoth;
import static org.matheclipse.core.expression.F.ArcTan;
import static org.matheclipse.core.expression.F.C0;
import static org.matheclipse.core.expression.F.C1;
import static org.matheclipse.core.expression.F.C1D2;
import static org.matheclipse.core.expression.F.C2;
import static org.matheclipse.core.expression.F.C3;
import static org.matheclipse.core.expression.F.C4;
import static org.matheclipse.core.expression.F.CI;
import static org.matheclipse.core.expression.F.CN1;
import static org.matheclipse.core.expression.F.CN1D2;
import static org.matheclipse.core.expression.F.CN2;
import static org.matheclipse.core.expression.F.Condition;
import static org.matheclipse.core.expression.F.Csc;
import static org.matheclipse.core.expression.F.FreeQ;
import static org.matheclipse.core.expression.F.IIntegrate;
import static org.matheclipse.core.expression.F.IntegerQ;
import static org.matheclipse.core.expression.F.List;
import static org.matheclipse.core.expression.F.Log;
import static org.matheclipse.core.expression.F.Negate;
import static org.matheclipse.core.expression.F.Not;
import static org.matheclipse.core.expression.F.Or;
import static org.matheclipse.core.expression.F.Plus;
import static org.matheclipse.core.expression.F.PolyLog;
import static org.matheclipse.core.expression.F.Power;
import static org.matheclipse.core.expression.F.QQ;
import static org.matheclipse.core.expression.F.Sec;
import static org.matheclipse.core.expression.F.Set;
import static org.matheclipse.core.expression.F.Sqr;
import static org.matheclipse.core.expression.F.Sqrt;
import static org.matheclipse.core.expression.F.Times;
import static org.matheclipse.core.expression.F.With;
import static org.matheclipse.core.expression.F.a;
import static org.matheclipse.core.expression.F.a_DEFAULT;
import static org.matheclipse.core.expression.F.b;
import static org.matheclipse.core.expression.F.b_DEFAULT;
import static org.matheclipse.core.expression.F.c;
import static org.matheclipse.core.expression.F.c_DEFAULT;
import static org.matheclipse.core.expression.F.d;
import static org.matheclipse.core.expression.F.d_;
import static org.matheclipse.core.expression.F.d_DEFAULT;
import static org.matheclipse.core.expression.F.e;
import static org.matheclipse.core.expression.F.e_DEFAULT;
import static org.matheclipse.core.expression.F.f;
import static org.matheclipse.core.expression.F.f_DEFAULT;
import static org.matheclipse.core.expression.F.m;
import static org.matheclipse.core.expression.F.m_;
import static org.matheclipse.core.expression.F.m_DEFAULT;
import static org.matheclipse.core.expression.F.p;
import static org.matheclipse.core.expression.F.p_;
import static org.matheclipse.core.expression.F.p_DEFAULT;
import static org.matheclipse.core.expression.F.q;
import static org.matheclipse.core.expression.F.q_;
import static org.matheclipse.core.expression.F.q_DEFAULT;
import static org.matheclipse.core.expression.F.u;
import static org.matheclipse.core.expression.F.x;
import static org.matheclipse.core.expression.F.x_;
import static org.matheclipse.core.expression.F.x_Symbol;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Dist;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.EqQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.ExpandIntegrand;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.GtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.IGtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.ILtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Int;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.IntHide;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.IntegersQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.LtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.NeQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.RemoveContent;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Simp;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.SimplifyIntegrand;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Subst;

/** 
 * IndefiniteIntegrationRules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class IntRules97 { 
  public static IAST RULES = List( 
IIntegrate(4851,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCot(Times(c_DEFAULT,x_)),b_DEFAULT)),p_),Power(x_,-1)),x_Symbol),
    Condition(Plus(Simp(Times(C2,Power(Plus(a,Times(b,ArcCot(Times(c,x)))),p),ArcCoth(Plus(C1,Times(CN1,C2,Power(Plus(C1,Times(CI,c,x)),-1))))),x),Dist(Times(C2,b,c,p),Int(Times(Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(p,Negate(C1))),ArcCoth(Plus(C1,Times(CN1,C2,Power(Plus(C1,Times(CI,c,x)),-1)))),Power(Plus(C1,Times(Sqr(c),Sqr(x))),-1)),x),x)),And(FreeQ(List(a,b,c),x),IGtQ(p,C1)))),
IIntegrate(4852,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTan(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Times(d_DEFAULT,x_),m_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(d,x),Plus(m,C1)),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),p),Power(Times(d,Plus(m,C1)),-1)),x),Negate(Dist(Times(b,c,p,Power(Times(d,Plus(m,C1)),-1)),Int(Times(Power(Times(d,x),Plus(m,C1)),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(p,Negate(C1))),Power(Plus(C1,Times(Sqr(c),Sqr(x))),-1)),x),x))),And(FreeQ(List(a,b,c,d,m),x),IGtQ(p,C0),Or(EqQ(p,C1),IntegerQ(m)),NeQ(m,CN1)))),
IIntegrate(4853,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCot(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Times(d_DEFAULT,x_),m_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(d,x),Plus(m,C1)),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),p),Power(Times(d,Plus(m,C1)),-1)),x),Dist(Times(b,c,p,Power(Times(d,Plus(m,C1)),-1)),Int(Times(Power(Times(d,x),Plus(m,C1)),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(p,Negate(C1))),Power(Plus(C1,Times(Sqr(c),Sqr(x))),-1)),x),x)),And(FreeQ(List(a,b,c,d,m),x),IGtQ(p,C0),Or(EqQ(p,C1),IntegerQ(m)),NeQ(m,CN1)))),
IIntegrate(4854,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTan(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,x_)),-1)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Plus(a,Times(b,ArcTan(Times(c,x)))),p),Log(Times(C2,Power(Plus(C1,Times(e,x,Power(d,-1))),-1))),Power(e,-1)),x)),Dist(Times(b,c,p,Power(e,-1)),Int(Times(Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(p,Negate(C1))),Log(Times(C2,Power(Plus(C1,Times(e,x,Power(d,-1))),-1))),Power(Plus(C1,Times(Sqr(c),Sqr(x))),-1)),x),x)),And(FreeQ(List(a,b,c,d,e),x),IGtQ(p,C0),EqQ(Plus(Times(Sqr(c),Sqr(d)),Sqr(e)),C0)))),
IIntegrate(4855,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCot(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,x_)),-1)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Plus(a,Times(b,ArcCot(Times(c,x)))),p),Log(Times(C2,Power(Plus(C1,Times(e,x,Power(d,-1))),-1))),Power(e,-1)),x)),Negate(Dist(Times(b,c,p,Power(e,-1)),Int(Times(Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(p,Negate(C1))),Log(Times(C2,Power(Plus(C1,Times(e,x,Power(d,-1))),-1))),Power(Plus(C1,Times(Sqr(c),Sqr(x))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e),x),IGtQ(p,C0),EqQ(Plus(Times(Sqr(c),Sqr(d)),Sqr(e)),C0)))),
IIntegrate(4856,Int(Times(Plus(a_DEFAULT,Times(ArcTan(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Plus(d_,Times(e_DEFAULT,x_)),-1)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Plus(a,Times(b,ArcTan(Times(c,x)))),Log(Times(C2,Power(Plus(C1,Times(CN1,CI,c,x)),-1))),Power(e,-1)),x)),Dist(Times(b,c,Power(e,-1)),Int(Times(Log(Times(C2,Power(Plus(C1,Times(CN1,CI,c,x)),-1))),Power(Plus(C1,Times(Sqr(c),Sqr(x))),-1)),x),x),Negate(Dist(Times(b,c,Power(e,-1)),Int(Times(Log(Times(C2,c,Plus(d,Times(e,x)),Power(Times(Plus(Times(c,d),Times(CI,e)),Plus(C1,Times(CN1,CI,c,x))),-1))),Power(Plus(C1,Times(Sqr(c),Sqr(x))),-1)),x),x)),Simp(Times(Plus(a,Times(b,ArcTan(Times(c,x)))),Log(Times(C2,c,Plus(d,Times(e,x)),Power(Times(Plus(Times(c,d),Times(CI,e)),Plus(C1,Times(CN1,CI,c,x))),-1))),Power(e,-1)),x)),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Times(Sqr(c),Sqr(d)),Sqr(e)),C0)))),
IIntegrate(4857,Int(Times(Plus(a_DEFAULT,Times(ArcCot(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Plus(d_,Times(e_DEFAULT,x_)),-1)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Plus(a,Times(b,ArcCot(Times(c,x)))),Log(Times(C2,Power(Plus(C1,Times(CN1,CI,c,x)),-1))),Power(e,-1)),x)),Negate(Dist(Times(b,c,Power(e,-1)),Int(Times(Log(Times(C2,Power(Plus(C1,Times(CN1,CI,c,x)),-1))),Power(Plus(C1,Times(Sqr(c),Sqr(x))),-1)),x),x)),Dist(Times(b,c,Power(e,-1)),Int(Times(Log(Times(C2,c,Plus(d,Times(e,x)),Power(Times(Plus(Times(c,d),Times(CI,e)),Plus(C1,Times(CN1,CI,c,x))),-1))),Power(Plus(C1,Times(Sqr(c),Sqr(x))),-1)),x),x),Simp(Times(Plus(a,Times(b,ArcCot(Times(c,x)))),Log(Times(C2,c,Plus(d,Times(e,x)),Power(Times(Plus(Times(c,d),Times(CI,e)),Plus(C1,Times(CN1,CI,c,x))),-1))),Power(e,-1)),x)),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Times(Sqr(c),Sqr(d)),Sqr(e)),C0)))),
IIntegrate(4858,Int(Times(Sqr(Plus(a_DEFAULT,Times(ArcTan(Times(c_DEFAULT,x_)),b_DEFAULT))),Power(Plus(d_,Times(e_DEFAULT,x_)),-1)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Sqr(Plus(a,Times(b,ArcTan(Times(c,x))))),Log(Times(C2,Power(Plus(C1,Times(CN1,CI,c,x)),-1))),Power(e,-1)),x)),Simp(Times(Sqr(Plus(a,Times(b,ArcTan(Times(c,x))))),Log(Times(C2,c,Plus(d,Times(e,x)),Power(Times(Plus(Times(c,d),Times(CI,e)),Plus(C1,Times(CN1,CI,c,x))),-1))),Power(e,-1)),x),Simp(Times(CI,b,Plus(a,Times(b,ArcTan(Times(c,x)))),PolyLog(C2,Plus(C1,Times(CN1,C2,Power(Plus(C1,Times(CN1,CI,c,x)),-1)))),Power(e,-1)),x),Negate(Simp(Times(CI,b,Plus(a,Times(b,ArcTan(Times(c,x)))),PolyLog(C2,Plus(C1,Times(CN1,C2,c,Plus(d,Times(e,x)),Power(Times(Plus(Times(c,d),Times(CI,e)),Plus(C1,Times(CN1,CI,c,x))),-1)))),Power(e,-1)),x)),Negate(Simp(Times(Sqr(b),PolyLog(C3,Plus(C1,Times(CN1,C2,Power(Plus(C1,Times(CN1,CI,c,x)),-1)))),Power(Times(C2,e),-1)),x)),Simp(Times(Sqr(b),PolyLog(C3,Plus(C1,Times(CN1,C2,c,Plus(d,Times(e,x)),Power(Times(Plus(Times(c,d),Times(CI,e)),Plus(C1,Times(CN1,CI,c,x))),-1)))),Power(Times(C2,e),-1)),x)),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Times(Sqr(c),Sqr(d)),Sqr(e)),C0)))),
IIntegrate(4859,Int(Times(Sqr(Plus(a_DEFAULT,Times(ArcCot(Times(c_DEFAULT,x_)),b_DEFAULT))),Power(Plus(d_,Times(e_DEFAULT,x_)),-1)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Sqr(Plus(a,Times(b,ArcCot(Times(c,x))))),Log(Times(C2,Power(Plus(C1,Times(CN1,CI,c,x)),-1))),Power(e,-1)),x)),Simp(Times(Sqr(Plus(a,Times(b,ArcCot(Times(c,x))))),Log(Times(C2,c,Plus(d,Times(e,x)),Power(Times(Plus(Times(c,d),Times(CI,e)),Plus(C1,Times(CN1,CI,c,x))),-1))),Power(e,-1)),x),Negate(Simp(Times(CI,b,Plus(a,Times(b,ArcCot(Times(c,x)))),PolyLog(C2,Plus(C1,Times(CN1,C2,Power(Plus(C1,Times(CN1,CI,c,x)),-1)))),Power(e,-1)),x)),Simp(Times(CI,b,Plus(a,Times(b,ArcCot(Times(c,x)))),PolyLog(C2,Plus(C1,Times(CN1,C2,c,Plus(d,Times(e,x)),Power(Times(Plus(Times(c,d),Times(CI,e)),Plus(C1,Times(CN1,CI,c,x))),-1)))),Power(e,-1)),x),Negate(Simp(Times(Sqr(b),PolyLog(C3,Plus(C1,Times(CN1,C2,Power(Plus(C1,Times(CN1,CI,c,x)),-1)))),Power(Times(C2,e),-1)),x)),Simp(Times(Sqr(b),PolyLog(C3,Plus(C1,Times(CN1,C2,c,Plus(d,Times(e,x)),Power(Times(Plus(Times(c,d),Times(CI,e)),Plus(C1,Times(CN1,CI,c,x))),-1)))),Power(Times(C2,e),-1)),x)),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Times(Sqr(c),Sqr(d)),Sqr(e)),C0)))),
IIntegrate(4860,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTan(Times(c_DEFAULT,x_)),b_DEFAULT)),3),Power(Plus(d_,Times(e_DEFAULT,x_)),-1)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Plus(a,Times(b,ArcTan(Times(c,x)))),3),Log(Times(C2,Power(Plus(C1,Times(CN1,CI,c,x)),-1))),Power(e,-1)),x)),Simp(Times(Power(Plus(a,Times(b,ArcTan(Times(c,x)))),3),Log(Times(C2,c,Plus(d,Times(e,x)),Power(Times(Plus(Times(c,d),Times(CI,e)),Plus(C1,Times(CN1,CI,c,x))),-1))),Power(e,-1)),x),Simp(Times(C3,CI,b,Sqr(Plus(a,Times(b,ArcTan(Times(c,x))))),PolyLog(C2,Plus(C1,Times(CN1,C2,Power(Plus(C1,Times(CN1,CI,c,x)),-1)))),Power(Times(C2,e),-1)),x),Negate(Simp(Times(C3,CI,b,Sqr(Plus(a,Times(b,ArcTan(Times(c,x))))),PolyLog(C2,Plus(C1,Times(CN1,C2,c,Plus(d,Times(e,x)),Power(Times(Plus(Times(c,d),Times(CI,e)),Plus(C1,Times(CN1,CI,c,x))),-1)))),Power(Times(C2,e),-1)),x)),Negate(Simp(Times(C3,Sqr(b),Plus(a,Times(b,ArcTan(Times(c,x)))),PolyLog(C3,Plus(C1,Times(CN1,C2,Power(Plus(C1,Times(CN1,CI,c,x)),-1)))),Power(Times(C2,e),-1)),x)),Simp(Times(C3,Sqr(b),Plus(a,Times(b,ArcTan(Times(c,x)))),PolyLog(C3,Plus(C1,Times(CN1,C2,c,Plus(d,Times(e,x)),Power(Times(Plus(Times(c,d),Times(CI,e)),Plus(C1,Times(CN1,CI,c,x))),-1)))),Power(Times(C2,e),-1)),x),Negate(Simp(Times(C3,CI,Power(b,3),PolyLog(C4,Plus(C1,Times(CN1,C2,Power(Plus(C1,Times(CN1,CI,c,x)),-1)))),Power(Times(C4,e),-1)),x)),Simp(Times(C3,CI,Power(b,3),PolyLog(C4,Plus(C1,Times(CN1,C2,c,Plus(d,Times(e,x)),Power(Times(Plus(Times(c,d),Times(CI,e)),Plus(C1,Times(CN1,CI,c,x))),-1)))),Power(Times(C4,e),-1)),x)),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Times(Sqr(c),Sqr(d)),Sqr(e)),C0)))),
IIntegrate(4861,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCot(Times(c_DEFAULT,x_)),b_DEFAULT)),3),Power(Plus(d_,Times(e_DEFAULT,x_)),-1)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Plus(a,Times(b,ArcCot(Times(c,x)))),3),Log(Times(C2,Power(Plus(C1,Times(CN1,CI,c,x)),-1))),Power(e,-1)),x)),Simp(Times(Power(Plus(a,Times(b,ArcCot(Times(c,x)))),3),Log(Times(C2,c,Plus(d,Times(e,x)),Power(Times(Plus(Times(c,d),Times(CI,e)),Plus(C1,Times(CN1,CI,c,x))),-1))),Power(e,-1)),x),Negate(Simp(Times(C3,CI,b,Sqr(Plus(a,Times(b,ArcCot(Times(c,x))))),PolyLog(C2,Plus(C1,Times(CN1,C2,Power(Plus(C1,Times(CN1,CI,c,x)),-1)))),Power(Times(C2,e),-1)),x)),Simp(Times(C3,CI,b,Sqr(Plus(a,Times(b,ArcCot(Times(c,x))))),PolyLog(C2,Plus(C1,Times(CN1,C2,c,Plus(d,Times(e,x)),Power(Times(Plus(Times(c,d),Times(CI,e)),Plus(C1,Times(CN1,CI,c,x))),-1)))),Power(Times(C2,e),-1)),x),Negate(Simp(Times(C3,Sqr(b),Plus(a,Times(b,ArcCot(Times(c,x)))),PolyLog(C3,Plus(C1,Times(CN1,C2,Power(Plus(C1,Times(CN1,CI,c,x)),-1)))),Power(Times(C2,e),-1)),x)),Simp(Times(C3,Sqr(b),Plus(a,Times(b,ArcCot(Times(c,x)))),PolyLog(C3,Plus(C1,Times(CN1,C2,c,Plus(d,Times(e,x)),Power(Times(Plus(Times(c,d),Times(CI,e)),Plus(C1,Times(CN1,CI,c,x))),-1)))),Power(Times(C2,e),-1)),x),Simp(Times(C3,CI,Power(b,3),PolyLog(C4,Plus(C1,Times(CN1,C2,Power(Plus(C1,Times(CN1,CI,c,x)),-1)))),Power(Times(C4,e),-1)),x),Negate(Simp(Times(C3,CI,Power(b,3),PolyLog(C4,Plus(C1,Times(CN1,C2,c,Plus(d,Times(e,x)),Power(Times(Plus(Times(c,d),Times(CI,e)),Plus(C1,Times(CN1,CI,c,x))),-1)))),Power(Times(C4,e),-1)),x))),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Times(Sqr(c),Sqr(d)),Sqr(e)),C0)))),
IIntegrate(4862,Int(Times(Plus(a_DEFAULT,Times(ArcTan(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Plus(d_,Times(e_DEFAULT,x_)),q_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(d,Times(e,x)),Plus(q,C1)),Plus(a,Times(b,ArcTan(Times(c,x)))),Power(Times(e,Plus(q,C1)),-1)),x),Negate(Dist(Times(b,c,Power(Times(e,Plus(q,C1)),-1)),Int(Times(Power(Plus(d,Times(e,x)),Plus(q,C1)),Power(Plus(C1,Times(Sqr(c),Sqr(x))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,q),x),NeQ(q,CN1)))),
IIntegrate(4863,Int(Times(Plus(a_DEFAULT,Times(ArcCot(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Plus(d_,Times(e_DEFAULT,x_)),q_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(d,Times(e,x)),Plus(q,C1)),Plus(a,Times(b,ArcCot(Times(c,x)))),Power(Times(e,Plus(q,C1)),-1)),x),Dist(Times(b,c,Power(Times(e,Plus(q,C1)),-1)),Int(Times(Power(Plus(d,Times(e,x)),Plus(q,C1)),Power(Plus(C1,Times(Sqr(c),Sqr(x))),-1)),x),x)),And(FreeQ(List(a,b,c,d,e,q),x),NeQ(q,CN1)))),
IIntegrate(4864,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTan(Times(c_DEFAULT,x_)),b_DEFAULT)),p_),Power(Plus(d_,Times(e_DEFAULT,x_)),q_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(d,Times(e,x)),Plus(q,C1)),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),p),Power(Times(e,Plus(q,C1)),-1)),x),Negate(Dist(Times(b,c,p,Power(Times(e,Plus(q,C1)),-1)),Int(ExpandIntegrand(Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(p,Negate(C1))),Times(Power(Plus(d,Times(e,x)),Plus(q,C1)),Power(Plus(C1,Times(Sqr(c),Sqr(x))),-1)),x),x),x))),And(FreeQ(List(a,b,c,d,e),x),IGtQ(p,C1),IntegerQ(q),NeQ(q,CN1)))),
IIntegrate(4865,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCot(Times(c_DEFAULT,x_)),b_DEFAULT)),p_),Power(Plus(d_,Times(e_DEFAULT,x_)),q_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(d,Times(e,x)),Plus(q,C1)),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),p),Power(Times(e,Plus(q,C1)),-1)),x),Dist(Times(b,c,p,Power(Times(e,Plus(q,C1)),-1)),Int(ExpandIntegrand(Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(p,Negate(C1))),Times(Power(Plus(d,Times(e,x)),Plus(q,C1)),Power(Plus(C1,Times(Sqr(c),Sqr(x))),-1)),x),x),x)),And(FreeQ(List(a,b,c,d,e),x),IGtQ(p,C1),IntegerQ(q),NeQ(q,CN1)))),
IIntegrate(4866,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTan(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,x_)),-1)),x_Symbol),
    Condition(Plus(Dist(Times(f,Power(e,-1)),Int(Times(Power(Times(f,x),Plus(m,Negate(C1))),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),p)),x),x),Negate(Dist(Times(d,f,Power(e,-1)),Int(Times(Power(Times(f,x),Plus(m,Negate(C1))),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),p),Power(Plus(d,Times(e,x)),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(p,C0),EqQ(Plus(Times(Sqr(c),Sqr(d)),Sqr(e)),C0),GtQ(m,C0)))),
IIntegrate(4867,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCot(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,x_)),-1)),x_Symbol),
    Condition(Plus(Dist(Times(f,Power(e,-1)),Int(Times(Power(Times(f,x),Plus(m,Negate(C1))),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),p)),x),x),Negate(Dist(Times(d,f,Power(e,-1)),Int(Times(Power(Times(f,x),Plus(m,Negate(C1))),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),p),Power(Plus(d,Times(e,x)),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(p,C0),EqQ(Plus(Times(Sqr(c),Sqr(d)),Sqr(e)),C0),GtQ(m,C0)))),
IIntegrate(4868,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTan(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(x_,-1),Power(Plus(d_,Times(e_DEFAULT,x_)),-1)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(a,Times(b,ArcTan(Times(c,x)))),p),Log(Plus(C2,Times(CN1,C2,Power(Plus(C1,Times(e,x,Power(d,-1))),-1)))),Power(d,-1)),x),Negate(Dist(Times(b,c,p,Power(d,-1)),Int(Times(Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(p,Negate(C1))),Log(Plus(C2,Times(CN1,C2,Power(Plus(C1,Times(e,x,Power(d,-1))),-1)))),Power(Plus(C1,Times(Sqr(c),Sqr(x))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e),x),IGtQ(p,C0),EqQ(Plus(Times(Sqr(c),Sqr(d)),Sqr(e)),C0)))),
IIntegrate(4869,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCot(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(x_,-1),Power(Plus(d_,Times(e_DEFAULT,x_)),-1)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(a,Times(b,ArcCot(Times(c,x)))),p),Log(Plus(C2,Times(CN1,C2,Power(Plus(C1,Times(e,x,Power(d,-1))),-1)))),Power(d,-1)),x),Dist(Times(b,c,p,Power(d,-1)),Int(Times(Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(p,Negate(C1))),Log(Plus(C2,Times(CN1,C2,Power(Plus(C1,Times(e,x,Power(d,-1))),-1)))),Power(Plus(C1,Times(Sqr(c),Sqr(x))),-1)),x),x)),And(FreeQ(List(a,b,c,d,e),x),IGtQ(p,C0),EqQ(Plus(Times(Sqr(c),Sqr(d)),Sqr(e)),C0)))),
IIntegrate(4870,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTan(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_,Times(e_DEFAULT,x_)),-1)),x_Symbol),
    Condition(Plus(Dist(Power(d,-1),Int(Times(Power(Times(f,x),m),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),p)),x),x),Negate(Dist(Times(e,Power(Times(d,f),-1)),Int(Times(Power(Times(f,x),Plus(m,C1)),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),p),Power(Plus(d,Times(e,x)),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(p,C0),EqQ(Plus(Times(Sqr(c),Sqr(d)),Sqr(e)),C0),LtQ(m,CN1)))),
IIntegrate(4871,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCot(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_,Times(e_DEFAULT,x_)),-1)),x_Symbol),
    Condition(Plus(Dist(Power(d,-1),Int(Times(Power(Times(f,x),m),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),p)),x),x),Negate(Dist(Times(e,Power(Times(d,f),-1)),Int(Times(Power(Times(f,x),Plus(m,C1)),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),p),Power(Plus(d,Times(e,x)),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(p,C0),EqQ(Plus(Times(Sqr(c),Sqr(d)),Sqr(e)),C0),LtQ(m,CN1)))),
IIntegrate(4872,Int(Times(Plus(a_DEFAULT,Times(ArcTan(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),q_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,x)),q)),x))),Plus(Dist(Plus(a,Times(b,ArcTan(Times(c,x)))),u,x),Negate(Dist(Times(b,c),Int(SimplifyIntegrand(Times(u,Power(Plus(C1,Times(Sqr(c),Sqr(x))),-1)),x),x),x)))),And(FreeQ(List(a,b,c,d,e,f,q),x),NeQ(q,CN1),IntegerQ(Times(C2,m)),Or(And(IGtQ(m,C0),IGtQ(q,C0)),And(ILtQ(Plus(m,q,C1),C0),LtQ(Times(m,q),C0)))))),
IIntegrate(4873,Int(Times(Plus(a_DEFAULT,Times(ArcCot(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),q_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,x)),q)),x))),Plus(Dist(Plus(a,Times(b,ArcCot(Times(c,x)))),u,x),Dist(Times(b,c),Int(SimplifyIntegrand(Times(u,Power(Plus(C1,Times(Sqr(c),Sqr(x))),-1)),x),x),x))),And(FreeQ(List(a,b,c,d,e,f,q),x),NeQ(q,CN1),IntegerQ(Times(C2,m)),Or(And(IGtQ(m,C0),IGtQ(q,C0)),And(ILtQ(Plus(m,q,C1),C0),LtQ(Times(m,q),C0)))))),
IIntegrate(4874,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTan(Times(c_DEFAULT,x_)),b_DEFAULT)),p_),Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),q_)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,x)),q)),x))),Plus(Dist(Power(Plus(a,Times(b,ArcTan(Times(c,x)))),p),u,x),Negate(Dist(Times(b,c,p),Int(ExpandIntegrand(Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(p,Negate(C1))),Times(u,Power(Plus(C1,Times(Sqr(c),Sqr(x))),-1)),x),x),x)))),And(FreeQ(List(a,b,c,d,e,f,q),x),IGtQ(p,C1),EqQ(Plus(Times(Sqr(c),Sqr(d)),Sqr(e)),C0),IntegersQ(m,q),NeQ(m,CN1),NeQ(q,CN1),ILtQ(Plus(m,q,C1),C0),LtQ(Times(m,q),C0)))),
IIntegrate(4875,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCot(Times(c_DEFAULT,x_)),b_DEFAULT)),p_),Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),q_)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,x)),q)),x))),Plus(Dist(Power(Plus(a,Times(b,ArcCot(Times(c,x)))),p),u,x),Dist(Times(b,c,p),Int(ExpandIntegrand(Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(p,Negate(C1))),Times(u,Power(Plus(C1,Times(Sqr(c),Sqr(x))),-1)),x),x),x))),And(FreeQ(List(a,b,c,d,e,f,q),x),IGtQ(p,C1),EqQ(Plus(Times(Sqr(c),Sqr(d)),Sqr(e)),C0),IntegersQ(m,q),NeQ(m,CN1),NeQ(q,CN1),ILtQ(Plus(m,q,C1),C0),LtQ(Times(m,q),C0)))),
IIntegrate(4876,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTan(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,x_)),q_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Power(Plus(a,Times(b,ArcTan(Times(c,x)))),p),Times(Power(Times(f,x),m),Power(Plus(d,Times(e,x)),q)),x),x),And(FreeQ(List(a,b,c,d,e,f,m),x),IGtQ(p,C0),IntegerQ(q),Or(GtQ(q,C0),NeQ(a,C0),IntegerQ(m))))),
IIntegrate(4877,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCot(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,x_)),q_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Power(Plus(a,Times(b,ArcCot(Times(c,x)))),p),Times(Power(Times(f,x),m),Power(Plus(d,Times(e,x)),q)),x),x),And(FreeQ(List(a,b,c,d,e,f,m),x),IGtQ(p,C0),IntegerQ(q),Or(GtQ(q,C0),NeQ(a,C0),IntegerQ(m))))),
IIntegrate(4878,Int(Times(Plus(a_DEFAULT,Times(ArcTan(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_DEFAULT)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,Power(Plus(d,Times(e,Sqr(x))),q),Power(Times(C2,c,q,Plus(Times(C2,q),C1)),-1)),x)),Dist(Times(C2,d,q,Power(Plus(Times(C2,q),C1),-1)),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(q,Negate(C1))),Plus(a,Times(b,ArcTan(Times(c,x))))),x),x),Simp(Times(x,Power(Plus(d,Times(e,Sqr(x))),q),Plus(a,Times(b,ArcTan(Times(c,x)))),Power(Plus(Times(C2,q),C1),-1)),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(e,Times(Sqr(c),d)),GtQ(q,C0)))),
IIntegrate(4879,Int(Times(Plus(a_DEFAULT,Times(ArcCot(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(b,Power(Plus(d,Times(e,Sqr(x))),q),Power(Times(C2,c,q,Plus(Times(C2,q),C1)),-1)),x),Dist(Times(C2,d,q,Power(Plus(Times(C2,q),C1),-1)),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(q,Negate(C1))),Plus(a,Times(b,ArcCot(Times(c,x))))),x),x),Simp(Times(x,Power(Plus(d,Times(e,Sqr(x))),q),Plus(a,Times(b,ArcCot(Times(c,x)))),Power(Plus(Times(C2,q),C1),-1)),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(e,Times(Sqr(c),d)),GtQ(q,C0)))),
IIntegrate(4880,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTan(Times(c_DEFAULT,x_)),b_DEFAULT)),p_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_DEFAULT)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,p,Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(p,Negate(C1))),Power(Times(C2,c,q,Plus(Times(C2,q),C1)),-1)),x)),Dist(Times(C2,d,q,Power(Plus(Times(C2,q),C1),-1)),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(q,Negate(C1))),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),p)),x),x),Dist(Times(Sqr(b),d,p,Plus(p,Negate(C1)),Power(Times(C2,q,Plus(Times(C2,q),C1)),-1)),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(q,Negate(C1))),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(p,Negate(C2)))),x),x),Simp(Times(x,Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),p),Power(Plus(Times(C2,q),C1),-1)),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(e,Times(Sqr(c),d)),GtQ(q,C0),GtQ(p,C1)))),
IIntegrate(4881,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCot(Times(c_DEFAULT,x_)),b_DEFAULT)),p_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(b,p,Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(p,Negate(C1))),Power(Times(C2,c,q,Plus(Times(C2,q),C1)),-1)),x),Dist(Times(C2,d,q,Power(Plus(Times(C2,q),C1),-1)),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(q,Negate(C1))),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),p)),x),x),Dist(Times(Sqr(b),d,p,Plus(p,Negate(C1)),Power(Times(C2,q,Plus(Times(C2,q),C1)),-1)),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(q,Negate(C1))),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(p,Negate(C2)))),x),x),Simp(Times(x,Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),p),Power(Plus(Times(C2,q),C1),-1)),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(e,Times(Sqr(c),d)),GtQ(q,C0),GtQ(p,C1)))),
IIntegrate(4882,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTan(Times(c_DEFAULT,x_)),b_DEFAULT)),-1),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),-1)),x_Symbol),
    Condition(Simp(Times(Log(RemoveContent(Plus(a,Times(b,ArcTan(Times(c,x)))),x)),Power(Times(b,c,d),-1)),x),And(FreeQ(List(a,b,c,d,e),x),EqQ(e,Times(Sqr(c),d))))),
IIntegrate(4883,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCot(Times(c_DEFAULT,x_)),b_DEFAULT)),-1),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),-1)),x_Symbol),
    Condition(Negate(Simp(Times(Log(RemoveContent(Plus(a,Times(b,ArcCot(Times(c,x)))),x)),Power(Times(b,c,d),-1)),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(e,Times(Sqr(c),d))))),
IIntegrate(4884,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTan(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),-1)),x_Symbol),
    Condition(Simp(Times(Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(p,C1)),Power(Times(b,c,d,Plus(p,C1)),-1)),x),And(FreeQ(List(a,b,c,d,e,p),x),EqQ(e,Times(Sqr(c),d)),NeQ(p,CN1)))),
IIntegrate(4885,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCot(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),-1)),x_Symbol),
    Condition(Negate(Simp(Times(Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(p,C1)),Power(Times(b,c,d,Plus(p,C1)),-1)),x)),And(FreeQ(List(a,b,c,d,e,p),x),EqQ(e,Times(Sqr(c),d)),NeQ(p,CN1)))),
IIntegrate(4886,Int(Times(Plus(a_DEFAULT,Times(ArcTan(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Plus(Simp(Times(CN2,CI,Plus(a,Times(b,ArcTan(Times(c,x)))),ArcTan(Times(Sqrt(Plus(C1,Times(CI,c,x))),Power(Plus(C1,Times(CN1,CI,c,x)),CN1D2))),Power(Times(c,Sqrt(d)),-1)),x),Simp(Times(CI,b,PolyLog(C2,Times(CN1,CI,Sqrt(Plus(C1,Times(CI,c,x))),Power(Plus(C1,Times(CN1,CI,c,x)),CN1D2))),Power(Times(c,Sqrt(d)),-1)),x),Negate(Simp(Times(CI,b,PolyLog(C2,Times(CI,Sqrt(Plus(C1,Times(CI,c,x))),Power(Plus(C1,Times(CN1,CI,c,x)),CN1D2))),Power(Times(c,Sqrt(d)),-1)),x))),And(FreeQ(List(a,b,c,d,e),x),EqQ(e,Times(Sqr(c),d)),GtQ(d,C0)))),
IIntegrate(4887,Int(Times(Plus(a_DEFAULT,Times(ArcCot(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Plus(Simp(Times(CN2,CI,Plus(a,Times(b,ArcCot(Times(c,x)))),ArcTan(Times(Sqrt(Plus(C1,Times(CI,c,x))),Power(Plus(C1,Times(CN1,CI,c,x)),CN1D2))),Power(Times(c,Sqrt(d)),-1)),x),Negate(Simp(Times(CI,b,PolyLog(C2,Times(CN1,CI,Sqrt(Plus(C1,Times(CI,c,x))),Power(Plus(C1,Times(CN1,CI,c,x)),CN1D2))),Power(Times(c,Sqrt(d)),-1)),x)),Simp(Times(CI,b,PolyLog(C2,Times(CI,Sqrt(Plus(C1,Times(CI,c,x))),Power(Plus(C1,Times(CN1,CI,c,x)),CN1D2))),Power(Times(c,Sqrt(d)),-1)),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(e,Times(Sqr(c),d)),GtQ(d,C0)))),
IIntegrate(4888,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTan(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Dist(Power(Times(c,Sqrt(d)),-1),Subst(Int(Times(Power(Plus(a,Times(b,x)),p),Sec(x)),x),x,ArcTan(Times(c,x))),x),And(FreeQ(List(a,b,c,d,e),x),EqQ(e,Times(Sqr(c),d)),IGtQ(p,C0),GtQ(d,C0)))),
IIntegrate(4889,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCot(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Negate(Dist(Times(x,Sqrt(Plus(C1,Power(Times(Sqr(c),Sqr(x)),-1))),Power(Plus(d,Times(e,Sqr(x))),CN1D2)),Subst(Int(Times(Power(Plus(a,Times(b,x)),p),Csc(x)),x),x,ArcCot(Times(c,x))),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(e,Times(Sqr(c),d)),IGtQ(p,C0),GtQ(d,C0)))),
IIntegrate(4890,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTan(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Dist(Times(Sqrt(Plus(C1,Times(Sqr(c),Sqr(x)))),Power(Plus(d,Times(e,Sqr(x))),CN1D2)),Int(Times(Power(Plus(a,Times(b,ArcTan(Times(c,x)))),p),Power(Plus(C1,Times(Sqr(c),Sqr(x))),CN1D2)),x),x),And(FreeQ(List(a,b,c,d,e),x),EqQ(e,Times(Sqr(c),d)),IGtQ(p,C0),Not(GtQ(d,C0))))),
IIntegrate(4891,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCot(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Dist(Times(Sqrt(Plus(C1,Times(Sqr(c),Sqr(x)))),Power(Plus(d,Times(e,Sqr(x))),CN1D2)),Int(Times(Power(Plus(a,Times(b,ArcCot(Times(c,x)))),p),Power(Plus(C1,Times(Sqr(c),Sqr(x))),CN1D2)),x),x),And(FreeQ(List(a,b,c,d,e),x),EqQ(e,Times(Sqr(c),d)),IGtQ(p,C0),Not(GtQ(d,C0))))),
IIntegrate(4892,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTan(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),-2)),x_Symbol),
    Condition(Plus(Simp(Times(x,Power(Plus(a,Times(b,ArcTan(Times(c,x)))),p),Power(Times(C2,d,Plus(d,Times(e,Sqr(x)))),-1)),x),Negate(Dist(Times(C1D2,b,c,p),Int(Times(x,Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(p,Negate(C1))),Power(Plus(d,Times(e,Sqr(x))),-2)),x),x)),Simp(Times(Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(p,C1)),Power(Times(C2,b,c,Sqr(d),Plus(p,C1)),-1)),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(e,Times(Sqr(c),d)),GtQ(p,C0)))),
IIntegrate(4893,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCot(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),-2)),x_Symbol),
    Condition(Plus(Simp(Times(x,Power(Plus(a,Times(b,ArcCot(Times(c,x)))),p),Power(Times(C2,d,Plus(d,Times(e,Sqr(x)))),-1)),x),Dist(Times(C1D2,b,c,p),Int(Times(x,Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(p,Negate(C1))),Power(Plus(d,Times(e,Sqr(x))),-2)),x),x),Negate(Simp(Times(Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(p,C1)),Power(Times(C2,b,c,Sqr(d),Plus(p,C1)),-1)),x))),And(FreeQ(List(a,b,c,d,e),x),EqQ(e,Times(Sqr(c),d)),GtQ(p,C0)))),
IIntegrate(4894,Int(Times(Plus(a_DEFAULT,Times(ArcTan(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),QQ(-3L,2L))),x_Symbol),
    Condition(Plus(Simp(Times(b,Power(Times(c,d,Sqrt(Plus(d,Times(e,Sqr(x))))),-1)),x),Simp(Times(x,Plus(a,Times(b,ArcTan(Times(c,x)))),Power(Times(d,Sqrt(Plus(d,Times(e,Sqr(x))))),-1)),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(e,Times(Sqr(c),d))))),
IIntegrate(4895,Int(Times(Plus(a_DEFAULT,Times(ArcCot(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),QQ(-3L,2L))),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,Power(Times(c,d,Sqrt(Plus(d,Times(e,Sqr(x))))),-1)),x)),Simp(Times(x,Plus(a,Times(b,ArcCot(Times(c,x)))),Power(Times(d,Sqrt(Plus(d,Times(e,Sqr(x))))),-1)),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(e,Times(Sqr(c),d))))),
IIntegrate(4896,Int(Times(Plus(a_DEFAULT,Times(ArcTan(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Plus(Simp(Times(b,Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Times(C4,c,d,Sqr(Plus(q,C1))),-1)),x),Dist(Times(Plus(Times(C2,q),C3),Power(Times(C2,d,Plus(q,C1)),-1)),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Plus(a,Times(b,ArcTan(Times(c,x))))),x),x),Negate(Simp(Times(x,Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Plus(a,Times(b,ArcTan(Times(c,x)))),Power(Times(C2,d,Plus(q,C1)),-1)),x))),And(FreeQ(List(a,b,c,d,e),x),EqQ(e,Times(Sqr(c),d)),LtQ(q,CN1),NeQ(q,QQ(-3L,2L))))),
IIntegrate(4897,Int(Times(Plus(a_DEFAULT,Times(ArcCot(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Times(C4,c,d,Sqr(Plus(q,C1))),-1)),x)),Dist(Times(Plus(Times(C2,q),C3),Power(Times(C2,d,Plus(q,C1)),-1)),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Plus(a,Times(b,ArcCot(Times(c,x))))),x),x),Negate(Simp(Times(x,Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Plus(a,Times(b,ArcCot(Times(c,x)))),Power(Times(C2,d,Plus(q,C1)),-1)),x))),And(FreeQ(List(a,b,c,d,e),x),EqQ(e,Times(Sqr(c),d)),LtQ(q,CN1),NeQ(q,QQ(-3L,2L))))),
IIntegrate(4898,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTan(Times(c_DEFAULT,x_)),b_DEFAULT)),p_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),QQ(-3L,2L))),x_Symbol),
    Condition(Plus(Simp(Times(b,p,Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(p,Negate(C1))),Power(Times(c,d,Sqrt(Plus(d,Times(e,Sqr(x))))),-1)),x),Negate(Dist(Times(Sqr(b),p,Plus(p,Negate(C1))),Int(Times(Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(p,Negate(C2))),Power(Plus(d,Times(e,Sqr(x))),QQ(-3L,2L))),x),x)),Simp(Times(x,Power(Plus(a,Times(b,ArcTan(Times(c,x)))),p),Power(Times(d,Sqrt(Plus(d,Times(e,Sqr(x))))),-1)),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(e,Times(Sqr(c),d)),GtQ(p,C1)))),
IIntegrate(4899,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCot(Times(c_DEFAULT,x_)),b_DEFAULT)),p_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),QQ(-3L,2L))),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,p,Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(p,Negate(C1))),Power(Times(c,d,Sqrt(Plus(d,Times(e,Sqr(x))))),-1)),x)),Negate(Dist(Times(Sqr(b),p,Plus(p,Negate(C1))),Int(Times(Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(p,Negate(C2))),Power(Plus(d,Times(e,Sqr(x))),QQ(-3L,2L))),x),x)),Simp(Times(x,Power(Plus(a,Times(b,ArcCot(Times(c,x)))),p),Power(Times(d,Sqrt(Plus(d,Times(e,Sqr(x))))),-1)),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(e,Times(Sqr(c),d)),GtQ(p,C1)))),
IIntegrate(4900,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTan(Times(c_DEFAULT,x_)),b_DEFAULT)),p_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Plus(Simp(Times(b,p,Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(p,Negate(C1))),Power(Times(C4,c,d,Sqr(Plus(q,C1))),-1)),x),Dist(Times(Plus(Times(C2,q),C3),Power(Times(C2,d,Plus(q,C1)),-1)),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),p)),x),x),Negate(Dist(Times(Sqr(b),p,Plus(p,Negate(C1)),Power(Times(C4,Sqr(Plus(q,C1))),-1)),Int(Times(Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(p,Negate(C2)))),x),x)),Negate(Simp(Times(x,Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),p),Power(Times(C2,d,Plus(q,C1)),-1)),x))),And(FreeQ(List(a,b,c,d,e),x),EqQ(e,Times(Sqr(c),d)),LtQ(q,CN1),GtQ(p,C1),NeQ(q,QQ(-3L,2L)))))
  );
}
