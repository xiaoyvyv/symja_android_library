package org.matheclipse.core.integrate.rubi;


import org.matheclipse.core.interfaces.IAST;

import static org.matheclipse.core.expression.F.And;
import static org.matheclipse.core.expression.F.ArcCosh;
import static org.matheclipse.core.expression.F.ArcCoth;
import static org.matheclipse.core.expression.F.ArcSinh;
import static org.matheclipse.core.expression.F.ArcTan;
import static org.matheclipse.core.expression.F.ArcTanh;
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
import static org.matheclipse.core.expression.F.D;
import static org.matheclipse.core.expression.F.Exp;
import static org.matheclipse.core.expression.F.FreeQ;
import static org.matheclipse.core.expression.F.IIntegrate;
import static org.matheclipse.core.expression.F.IntegerQ;
import static org.matheclipse.core.expression.F.List;
import static org.matheclipse.core.expression.F.Log;
import static org.matheclipse.core.expression.F.MatchQ;
import static org.matheclipse.core.expression.F.Negate;
import static org.matheclipse.core.expression.F.Not;
import static org.matheclipse.core.expression.F.Or;
import static org.matheclipse.core.expression.F.Plus;
import static org.matheclipse.core.expression.F.PolyLog;
import static org.matheclipse.core.expression.F.PolynomialQ;
import static org.matheclipse.core.expression.F.Power;
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
import static org.matheclipse.core.expression.F.n;
import static org.matheclipse.core.expression.F.n_DEFAULT;
import static org.matheclipse.core.expression.F.p;
import static org.matheclipse.core.expression.F.p_;
import static org.matheclipse.core.expression.F.p_DEFAULT;
import static org.matheclipse.core.expression.F.q;
import static org.matheclipse.core.expression.F.q_;
import static org.matheclipse.core.expression.F.q_DEFAULT;
import static org.matheclipse.core.expression.F.u;
import static org.matheclipse.core.expression.F.u_;
import static org.matheclipse.core.expression.F.v;
import static org.matheclipse.core.expression.F.v_;
import static org.matheclipse.core.expression.F.w;
import static org.matheclipse.core.expression.F.x;
import static org.matheclipse.core.expression.F.x_;
import static org.matheclipse.core.expression.F.x_Symbol;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Dist;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.EqQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.ExpandIntegrand;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.FunctionOfExponentialQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.FunctionOfQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.GtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.IGtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.ILtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Int;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.IntHide;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.IntegersQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.InverseFunctionFreeQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.LtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.NeQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.RationalQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.RemoveContent;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Simp;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.SimplifyIntegrand;

/** 
 * IndefiniteIntegrationRules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class IntRules118 { 
  public static IAST RULES = List( 
IIntegrate(5901,Int(ArcCosh(u_),x_Symbol),
    Condition(Plus(Simp(Times(x,ArcCosh(u)),x),Negate(Int(SimplifyIntegrand(Times(x,D(u,x),Power(Times(Sqrt(Plus(CN1,u)),Sqrt(Plus(C1,u))),-1)),x),x))),And(InverseFunctionFreeQ(u,x),Not(FunctionOfExponentialQ(u,x))))),
IIntegrate(5902,Int(Times(Plus(a_DEFAULT,Times(ArcSinh(u_),b_DEFAULT)),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(c,Times(d,x)),Plus(m,C1)),Plus(a,Times(b,ArcSinh(u))),Power(Times(d,Plus(m,C1)),-1)),x),Negate(Dist(Times(b,Power(Times(d,Plus(m,C1)),-1)),Int(SimplifyIntegrand(Times(Power(Plus(c,Times(d,x)),Plus(m,C1)),D(u,x),Power(Plus(C1,Sqr(u)),CN1D2)),x),x),x))),And(FreeQ(List(a,b,c,d,m),x),NeQ(m,CN1),InverseFunctionFreeQ(u,x),Not(FunctionOfQ(Power(Plus(c,Times(d,x)),Plus(m,C1)),u,x)),Not(FunctionOfExponentialQ(u,x))))),
IIntegrate(5903,Int(Times(Plus(a_DEFAULT,Times(ArcCosh(u_),b_DEFAULT)),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(c,Times(d,x)),Plus(m,C1)),Plus(a,Times(b,ArcCosh(u))),Power(Times(d,Plus(m,C1)),-1)),x),Negate(Dist(Times(b,Power(Times(d,Plus(m,C1)),-1)),Int(SimplifyIntegrand(Times(Power(Plus(c,Times(d,x)),Plus(m,C1)),D(u,x),Power(Times(Sqrt(Plus(CN1,u)),Sqrt(Plus(C1,u))),-1)),x),x),x))),And(FreeQ(List(a,b,c,d,m),x),NeQ(m,CN1),InverseFunctionFreeQ(u,x),Not(FunctionOfQ(Power(Plus(c,Times(d,x)),Plus(m,C1)),u,x)),Not(FunctionOfExponentialQ(u,x))))),
IIntegrate(5904,Int(Times(Plus(a_DEFAULT,Times(ArcSinh(u_),b_DEFAULT)),v_),x_Symbol),
    Condition(With(List(Set(w,IntHide(v,x))),Condition(Plus(Dist(Plus(a,Times(b,ArcSinh(u))),w,x),Negate(Dist(b,Int(SimplifyIntegrand(Times(w,D(u,x),Power(Plus(C1,Sqr(u)),CN1D2)),x),x),x))),InverseFunctionFreeQ(w,x))),And(FreeQ(List(a,b),x),InverseFunctionFreeQ(u,x),Not(MatchQ(v,Condition(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x)),m_DEFAULT),FreeQ(List(c,d,m),x))))))),
IIntegrate(5905,Int(Times(Plus(a_DEFAULT,Times(ArcCosh(u_),b_DEFAULT)),v_),x_Symbol),
    Condition(With(List(Set(w,IntHide(v,x))),Condition(Plus(Dist(Plus(a,Times(b,ArcCosh(u))),w,x),Negate(Dist(b,Int(SimplifyIntegrand(Times(w,D(u,x),Power(Times(Sqrt(Plus(CN1,u)),Sqrt(Plus(C1,u))),-1)),x),x),x))),InverseFunctionFreeQ(w,x))),And(FreeQ(List(a,b),x),InverseFunctionFreeQ(u,x),Not(MatchQ(v,Condition(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x)),m_DEFAULT),FreeQ(List(c,d,m),x))))))),
IIntegrate(5906,Int(Exp(Times(ArcSinh(u_),n_DEFAULT)),x_Symbol),
    Condition(Int(Power(Plus(u,Sqrt(Plus(C1,Sqr(u)))),n),x),And(IntegerQ(n),PolynomialQ(u,x)))),
IIntegrate(5907,Int(Times(Exp(Times(ArcSinh(u_),n_DEFAULT)),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(x,m),Power(Plus(u,Sqrt(Plus(C1,Sqr(u)))),n)),x),And(RationalQ(m),IntegerQ(n),PolynomialQ(u,x)))),
IIntegrate(5908,Int(Exp(Times(ArcCosh(u_),n_DEFAULT)),x_Symbol),
    Condition(Int(Power(Plus(u,Times(Sqrt(Plus(CN1,u)),Sqrt(Plus(C1,u)))),n),x),And(IntegerQ(n),PolynomialQ(u,x)))),
IIntegrate(5909,Int(Times(Exp(Times(ArcCosh(u_),n_DEFAULT)),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(x,m),Power(Plus(u,Times(Sqrt(Plus(CN1,u)),Sqrt(Plus(C1,u)))),n)),x),And(RationalQ(m),IntegerQ(n),PolynomialQ(u,x)))),
IIntegrate(5910,Int(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),x_Symbol),
    Condition(Plus(Simp(Times(x,Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p)),x),Negate(Dist(Times(b,c,p),Int(Times(x,Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(p,Negate(C1))),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),-1)),x),x))),And(FreeQ(List(a,b,c),x),IGtQ(p,C0)))),
IIntegrate(5911,Int(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),x_Symbol),
    Condition(Plus(Simp(Times(x,Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p)),x),Negate(Dist(Times(b,c,p),Int(Times(x,Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(p,Negate(C1))),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),-1)),x),x))),And(FreeQ(List(a,b,c),x),IGtQ(p,C0)))),
IIntegrate(5912,Int(Times(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(x_,-1)),x_Symbol),
    Condition(Plus(Simp(Times(a,Log(x)),x),Negate(Simp(Times(C1D2,b,PolyLog(C2,Times(CN1,c,x))),x)),Simp(Times(C1D2,b,PolyLog(C2,Times(c,x))),x)),FreeQ(List(a,b,c),x))),
IIntegrate(5913,Int(Times(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(x_,-1)),x_Symbol),
    Condition(Plus(Simp(Times(a,Log(x)),x),Simp(Times(C1D2,b,PolyLog(C2,Negate(Power(Times(c,x),-1)))),x),Negate(Simp(Times(C1D2,b,PolyLog(C2,Power(Times(c,x),-1))),x))),FreeQ(List(a,b,c),x))),
IIntegrate(5914,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_),Power(x_,-1)),x_Symbol),
    Condition(Plus(Simp(Times(C2,Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p),ArcTanh(Plus(C1,Times(CN1,C2,Power(Plus(C1,Times(CN1,c,x)),-1))))),x),Negate(Dist(Times(C2,b,c,p),Int(Times(Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(p,Negate(C1))),ArcTanh(Plus(C1,Times(CN1,C2,Power(Plus(C1,Times(CN1,c,x)),-1)))),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),-1)),x),x))),And(FreeQ(List(a,b,c),x),IGtQ(p,C1)))),
IIntegrate(5915,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_),Power(x_,-1)),x_Symbol),
    Condition(Plus(Simp(Times(C2,Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p),ArcCoth(Plus(C1,Times(CN1,C2,Power(Plus(C1,Times(CN1,c,x)),-1))))),x),Negate(Dist(Times(C2,b,c,p),Int(Times(Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(p,Negate(C1))),ArcCoth(Plus(C1,Times(CN1,C2,Power(Plus(C1,Times(CN1,c,x)),-1)))),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),-1)),x),x))),And(FreeQ(List(a,b,c),x),IGtQ(p,C1)))),
IIntegrate(5916,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Times(d_DEFAULT,x_),m_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(d,x),Plus(m,C1)),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p),Power(Times(d,Plus(m,C1)),-1)),x),Negate(Dist(Times(b,c,p,Power(Times(d,Plus(m,C1)),-1)),Int(Times(Power(Times(d,x),Plus(m,C1)),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(p,Negate(C1))),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),-1)),x),x))),And(FreeQ(List(a,b,c,d,m),x),IGtQ(p,C0),Or(EqQ(p,C1),IntegerQ(m)),NeQ(m,CN1)))),
IIntegrate(5917,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Times(d_DEFAULT,x_),m_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(d,x),Plus(m,C1)),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p),Power(Times(d,Plus(m,C1)),-1)),x),Negate(Dist(Times(b,c,p,Power(Times(d,Plus(m,C1)),-1)),Int(Times(Power(Times(d,x),Plus(m,C1)),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(p,Negate(C1))),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),-1)),x),x))),And(FreeQ(List(a,b,c,d,m),x),IGtQ(p,C0),Or(EqQ(p,C1),IntegerQ(m)),NeQ(m,CN1)))),
IIntegrate(5918,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,x_)),-1)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p),Log(Times(C2,Power(Plus(C1,Times(e,x,Power(d,-1))),-1))),Power(e,-1)),x)),Dist(Times(b,c,p,Power(e,-1)),Int(Times(Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(p,Negate(C1))),Log(Times(C2,Power(Plus(C1,Times(e,x,Power(d,-1))),-1))),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),-1)),x),x)),And(FreeQ(List(a,b,c,d,e),x),IGtQ(p,C0),EqQ(Plus(Times(Sqr(c),Sqr(d)),Negate(Sqr(e))),C0)))),
IIntegrate(5919,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,x_)),-1)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p),Log(Times(C2,Power(Plus(C1,Times(e,x,Power(d,-1))),-1))),Power(e,-1)),x)),Dist(Times(b,c,p,Power(e,-1)),Int(Times(Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(p,Negate(C1))),Log(Times(C2,Power(Plus(C1,Times(e,x,Power(d,-1))),-1))),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),-1)),x),x)),And(FreeQ(List(a,b,c,d,e),x),IGtQ(p,C0),EqQ(Plus(Times(Sqr(c),Sqr(d)),Negate(Sqr(e))),C0)))),
IIntegrate(5920,Int(Times(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Plus(d_,Times(e_DEFAULT,x_)),-1)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Plus(a,Times(b,ArcTanh(Times(c,x)))),Log(Times(C2,Power(Plus(C1,Times(c,x)),-1))),Power(e,-1)),x)),Dist(Times(b,c,Power(e,-1)),Int(Times(Log(Times(C2,Power(Plus(C1,Times(c,x)),-1))),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),-1)),x),x),Negate(Dist(Times(b,c,Power(e,-1)),Int(Times(Log(Times(C2,c,Plus(d,Times(e,x)),Power(Times(Plus(Times(c,d),e),Plus(C1,Times(c,x))),-1))),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),-1)),x),x)),Simp(Times(Plus(a,Times(b,ArcTanh(Times(c,x)))),Log(Times(C2,c,Plus(d,Times(e,x)),Power(Times(Plus(Times(c,d),e),Plus(C1,Times(c,x))),-1))),Power(e,-1)),x)),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Times(Sqr(c),Sqr(d)),Negate(Sqr(e))),C0)))),
IIntegrate(5921,Int(Times(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Plus(d_,Times(e_DEFAULT,x_)),-1)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Plus(a,Times(b,ArcCoth(Times(c,x)))),Log(Times(C2,Power(Plus(C1,Times(c,x)),-1))),Power(e,-1)),x)),Dist(Times(b,c,Power(e,-1)),Int(Times(Log(Times(C2,Power(Plus(C1,Times(c,x)),-1))),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),-1)),x),x),Negate(Dist(Times(b,c,Power(e,-1)),Int(Times(Log(Times(C2,c,Plus(d,Times(e,x)),Power(Times(Plus(Times(c,d),e),Plus(C1,Times(c,x))),-1))),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),-1)),x),x)),Simp(Times(Plus(a,Times(b,ArcCoth(Times(c,x)))),Log(Times(C2,c,Plus(d,Times(e,x)),Power(Times(Plus(Times(c,d),e),Plus(C1,Times(c,x))),-1))),Power(e,-1)),x)),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Times(Sqr(c),Sqr(d)),Negate(Sqr(e))),C0)))),
IIntegrate(5922,Int(Times(Sqr(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT))),Power(Plus(d_,Times(e_DEFAULT,x_)),-1)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Sqr(Plus(a,Times(b,ArcTanh(Times(c,x))))),Log(Times(C2,Power(Plus(C1,Times(c,x)),-1))),Power(e,-1)),x)),Simp(Times(Sqr(Plus(a,Times(b,ArcTanh(Times(c,x))))),Log(Times(C2,c,Plus(d,Times(e,x)),Power(Times(Plus(Times(c,d),e),Plus(C1,Times(c,x))),-1))),Power(e,-1)),x),Simp(Times(b,Plus(a,Times(b,ArcTanh(Times(c,x)))),PolyLog(C2,Plus(C1,Times(CN1,C2,Power(Plus(C1,Times(c,x)),-1)))),Power(e,-1)),x),Negate(Simp(Times(b,Plus(a,Times(b,ArcTanh(Times(c,x)))),PolyLog(C2,Plus(C1,Times(CN1,C2,c,Plus(d,Times(e,x)),Power(Times(Plus(Times(c,d),e),Plus(C1,Times(c,x))),-1)))),Power(e,-1)),x)),Simp(Times(Sqr(b),PolyLog(C3,Plus(C1,Times(CN1,C2,Power(Plus(C1,Times(c,x)),-1)))),Power(Times(C2,e),-1)),x),Negate(Simp(Times(Sqr(b),PolyLog(C3,Plus(C1,Times(CN1,C2,c,Plus(d,Times(e,x)),Power(Times(Plus(Times(c,d),e),Plus(C1,Times(c,x))),-1)))),Power(Times(C2,e),-1)),x))),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Times(Sqr(c),Sqr(d)),Negate(Sqr(e))),C0)))),
IIntegrate(5923,Int(Times(Sqr(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT))),Power(Plus(d_,Times(e_DEFAULT,x_)),-1)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Sqr(Plus(a,Times(b,ArcCoth(Times(c,x))))),Log(Times(C2,Power(Plus(C1,Times(c,x)),-1))),Power(e,-1)),x)),Simp(Times(Sqr(Plus(a,Times(b,ArcCoth(Times(c,x))))),Log(Times(C2,c,Plus(d,Times(e,x)),Power(Times(Plus(Times(c,d),e),Plus(C1,Times(c,x))),-1))),Power(e,-1)),x),Simp(Times(b,Plus(a,Times(b,ArcCoth(Times(c,x)))),PolyLog(C2,Plus(C1,Times(CN1,C2,Power(Plus(C1,Times(c,x)),-1)))),Power(e,-1)),x),Negate(Simp(Times(b,Plus(a,Times(b,ArcCoth(Times(c,x)))),PolyLog(C2,Plus(C1,Times(CN1,C2,c,Plus(d,Times(e,x)),Power(Times(Plus(Times(c,d),e),Plus(C1,Times(c,x))),-1)))),Power(e,-1)),x)),Simp(Times(Sqr(b),PolyLog(C3,Plus(C1,Times(CN1,C2,Power(Plus(C1,Times(c,x)),-1)))),Power(Times(C2,e),-1)),x),Negate(Simp(Times(Sqr(b),PolyLog(C3,Plus(C1,Times(CN1,C2,c,Plus(d,Times(e,x)),Power(Times(Plus(Times(c,d),e),Plus(C1,Times(c,x))),-1)))),Power(Times(C2,e),-1)),x))),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Times(Sqr(c),Sqr(d)),Negate(Sqr(e))),C0)))),
IIntegrate(5924,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),3),Power(Plus(d_,Times(e_DEFAULT,x_)),-1)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),3),Log(Times(C2,Power(Plus(C1,Times(c,x)),-1))),Power(e,-1)),x)),Simp(Times(Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),3),Log(Times(C2,c,Plus(d,Times(e,x)),Power(Times(Plus(Times(c,d),e),Plus(C1,Times(c,x))),-1))),Power(e,-1)),x),Simp(Times(C3,b,Sqr(Plus(a,Times(b,ArcTanh(Times(c,x))))),PolyLog(C2,Plus(C1,Times(CN1,C2,Power(Plus(C1,Times(c,x)),-1)))),Power(Times(C2,e),-1)),x),Negate(Simp(Times(C3,b,Sqr(Plus(a,Times(b,ArcTanh(Times(c,x))))),PolyLog(C2,Plus(C1,Times(CN1,C2,c,Plus(d,Times(e,x)),Power(Times(Plus(Times(c,d),e),Plus(C1,Times(c,x))),-1)))),Power(Times(C2,e),-1)),x)),Simp(Times(C3,Sqr(b),Plus(a,Times(b,ArcTanh(Times(c,x)))),PolyLog(C3,Plus(C1,Times(CN1,C2,Power(Plus(C1,Times(c,x)),-1)))),Power(Times(C2,e),-1)),x),Negate(Simp(Times(C3,Sqr(b),Plus(a,Times(b,ArcTanh(Times(c,x)))),PolyLog(C3,Plus(C1,Times(CN1,C2,c,Plus(d,Times(e,x)),Power(Times(Plus(Times(c,d),e),Plus(C1,Times(c,x))),-1)))),Power(Times(C2,e),-1)),x)),Simp(Times(C3,Power(b,3),PolyLog(C4,Plus(C1,Times(CN1,C2,Power(Plus(C1,Times(c,x)),-1)))),Power(Times(C4,e),-1)),x),Negate(Simp(Times(C3,Power(b,3),PolyLog(C4,Plus(C1,Times(CN1,C2,c,Plus(d,Times(e,x)),Power(Times(Plus(Times(c,d),e),Plus(C1,Times(c,x))),-1)))),Power(Times(C4,e),-1)),x))),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Times(Sqr(c),Sqr(d)),Negate(Sqr(e))),C0)))),
IIntegrate(5925,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),3),Power(Plus(d_,Times(e_DEFAULT,x_)),-1)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),3),Log(Times(C2,Power(Plus(C1,Times(c,x)),-1))),Power(e,-1)),x)),Simp(Times(Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),3),Log(Times(C2,c,Plus(d,Times(e,x)),Power(Times(Plus(Times(c,d),e),Plus(C1,Times(c,x))),-1))),Power(e,-1)),x),Simp(Times(C3,b,Sqr(Plus(a,Times(b,ArcCoth(Times(c,x))))),PolyLog(C2,Plus(C1,Times(CN1,C2,Power(Plus(C1,Times(c,x)),-1)))),Power(Times(C2,e),-1)),x),Negate(Simp(Times(C3,b,Sqr(Plus(a,Times(b,ArcCoth(Times(c,x))))),PolyLog(C2,Plus(C1,Times(CN1,C2,c,Plus(d,Times(e,x)),Power(Times(Plus(Times(c,d),e),Plus(C1,Times(c,x))),-1)))),Power(Times(C2,e),-1)),x)),Simp(Times(C3,Sqr(b),Plus(a,Times(b,ArcCoth(Times(c,x)))),PolyLog(C3,Plus(C1,Times(CN1,C2,Power(Plus(C1,Times(c,x)),-1)))),Power(Times(C2,e),-1)),x),Negate(Simp(Times(C3,Sqr(b),Plus(a,Times(b,ArcCoth(Times(c,x)))),PolyLog(C3,Plus(C1,Times(CN1,C2,c,Plus(d,Times(e,x)),Power(Times(Plus(Times(c,d),e),Plus(C1,Times(c,x))),-1)))),Power(Times(C2,e),-1)),x)),Simp(Times(C3,Power(b,3),PolyLog(C4,Plus(C1,Times(CN1,C2,Power(Plus(C1,Times(c,x)),-1)))),Power(Times(C4,e),-1)),x),Negate(Simp(Times(C3,Power(b,3),PolyLog(C4,Plus(C1,Times(CN1,C2,c,Plus(d,Times(e,x)),Power(Times(Plus(Times(c,d),e),Plus(C1,Times(c,x))),-1)))),Power(Times(C4,e),-1)),x))),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Times(Sqr(c),Sqr(d)),Negate(Sqr(e))),C0)))),
IIntegrate(5926,Int(Times(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Plus(d_,Times(e_DEFAULT,x_)),q_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(d,Times(e,x)),Plus(q,C1)),Plus(a,Times(b,ArcTanh(Times(c,x)))),Power(Times(e,Plus(q,C1)),-1)),x),Negate(Dist(Times(b,c,Power(Times(e,Plus(q,C1)),-1)),Int(Times(Power(Plus(d,Times(e,x)),Plus(q,C1)),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,q),x),NeQ(q,CN1)))),
IIntegrate(5927,Int(Times(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Plus(d_,Times(e_DEFAULT,x_)),q_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(d,Times(e,x)),Plus(q,C1)),Plus(a,Times(b,ArcCoth(Times(c,x)))),Power(Times(e,Plus(q,C1)),-1)),x),Negate(Dist(Times(b,c,Power(Times(e,Plus(q,C1)),-1)),Int(Times(Power(Plus(d,Times(e,x)),Plus(q,C1)),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,q),x),NeQ(q,CN1)))),
IIntegrate(5928,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_),Power(Plus(d_,Times(e_DEFAULT,x_)),q_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(d,Times(e,x)),Plus(q,C1)),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p),Power(Times(e,Plus(q,C1)),-1)),x),Negate(Dist(Times(b,c,p,Power(Times(e,Plus(q,C1)),-1)),Int(ExpandIntegrand(Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(p,Negate(C1))),Times(Power(Plus(d,Times(e,x)),Plus(q,C1)),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),-1)),x),x),x))),And(FreeQ(List(a,b,c,d,e),x),IGtQ(p,C1),IntegerQ(q),NeQ(q,CN1)))),
IIntegrate(5929,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_),Power(Plus(d_,Times(e_DEFAULT,x_)),q_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(d,Times(e,x)),Plus(q,C1)),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p),Power(Times(e,Plus(q,C1)),-1)),x),Negate(Dist(Times(b,c,p,Power(Times(e,Plus(q,C1)),-1)),Int(ExpandIntegrand(Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(p,Negate(C1))),Times(Power(Plus(d,Times(e,x)),Plus(q,C1)),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),-1)),x),x),x))),And(FreeQ(List(a,b,c,d,e),x),IGtQ(p,C1),IntegerQ(q),NeQ(q,CN1)))),
IIntegrate(5930,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,x_)),-1)),x_Symbol),
    Condition(Plus(Dist(Times(f,Power(e,-1)),Int(Times(Power(Times(f,x),Plus(m,Negate(C1))),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p)),x),x),Negate(Dist(Times(d,f,Power(e,-1)),Int(Times(Power(Times(f,x),Plus(m,Negate(C1))),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p),Power(Plus(d,Times(e,x)),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(p,C0),EqQ(Plus(Times(Sqr(c),Sqr(d)),Negate(Sqr(e))),C0),GtQ(m,C0)))),
IIntegrate(5931,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,x_)),-1)),x_Symbol),
    Condition(Plus(Dist(Times(f,Power(e,-1)),Int(Times(Power(Times(f,x),Plus(m,Negate(C1))),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p)),x),x),Negate(Dist(Times(d,f,Power(e,-1)),Int(Times(Power(Times(f,x),Plus(m,Negate(C1))),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p),Power(Plus(d,Times(e,x)),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(p,C0),EqQ(Plus(Times(Sqr(c),Sqr(d)),Negate(Sqr(e))),C0),GtQ(m,C0)))),
IIntegrate(5932,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(x_,-1),Power(Plus(d_,Times(e_DEFAULT,x_)),-1)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p),Log(Plus(C2,Times(CN1,C2,Power(Plus(C1,Times(e,x,Power(d,-1))),-1)))),Power(d,-1)),x),Negate(Dist(Times(b,c,p,Power(d,-1)),Int(Times(Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(p,Negate(C1))),Log(Plus(C2,Times(CN1,C2,Power(Plus(C1,Times(e,x,Power(d,-1))),-1)))),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e),x),IGtQ(p,C0),EqQ(Plus(Times(Sqr(c),Sqr(d)),Negate(Sqr(e))),C0)))),
IIntegrate(5933,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(x_,-1),Power(Plus(d_,Times(e_DEFAULT,x_)),-1)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p),Log(Plus(C2,Times(CN1,C2,Power(Plus(C1,Times(e,x,Power(d,-1))),-1)))),Power(d,-1)),x),Negate(Dist(Times(b,c,p,Power(d,-1)),Int(Times(Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(p,Negate(C1))),Log(Plus(C2,Times(CN1,C2,Power(Plus(C1,Times(e,x,Power(d,-1))),-1)))),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e),x),IGtQ(p,C0),EqQ(Plus(Times(Sqr(c),Sqr(d)),Negate(Sqr(e))),C0)))),
IIntegrate(5934,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_,Times(e_DEFAULT,x_)),-1)),x_Symbol),
    Condition(Plus(Dist(Power(d,-1),Int(Times(Power(Times(f,x),m),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p)),x),x),Negate(Dist(Times(e,Power(Times(d,f),-1)),Int(Times(Power(Times(f,x),Plus(m,C1)),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p),Power(Plus(d,Times(e,x)),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(p,C0),EqQ(Plus(Times(Sqr(c),Sqr(d)),Negate(Sqr(e))),C0),LtQ(m,CN1)))),
IIntegrate(5935,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_,Times(e_DEFAULT,x_)),-1)),x_Symbol),
    Condition(Plus(Dist(Power(d,-1),Int(Times(Power(Times(f,x),m),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p)),x),x),Negate(Dist(Times(e,Power(Times(d,f),-1)),Int(Times(Power(Times(f,x),Plus(m,C1)),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p),Power(Plus(d,Times(e,x)),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(p,C0),EqQ(Plus(Times(Sqr(c),Sqr(d)),Negate(Sqr(e))),C0),LtQ(m,CN1)))),
IIntegrate(5936,Int(Times(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),q_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,x)),q)),x))),Plus(Dist(Plus(a,Times(b,ArcTanh(Times(c,x)))),u,x),Negate(Dist(Times(b,c),Int(SimplifyIntegrand(Times(u,Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),-1)),x),x),x)))),And(FreeQ(List(a,b,c,d,e,f,q),x),NeQ(q,CN1),IntegerQ(Times(C2,m)),Or(And(IGtQ(m,C0),IGtQ(q,C0)),And(ILtQ(Plus(m,q,C1),C0),LtQ(Times(m,q),C0)))))),
IIntegrate(5937,Int(Times(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),q_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,x)),q)),x))),Plus(Dist(Plus(a,Times(b,ArcCoth(Times(c,x)))),u,x),Negate(Dist(Times(b,c),Int(SimplifyIntegrand(Times(u,Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),-1)),x),x),x)))),And(FreeQ(List(a,b,c,d,e,f,q),x),NeQ(q,CN1),IntegerQ(Times(C2,m)),Or(And(IGtQ(m,C0),IGtQ(q,C0)),And(ILtQ(Plus(m,q,C1),C0),LtQ(Times(m,q),C0)))))),
IIntegrate(5938,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_),Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),q_)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,x)),q)),x))),Plus(Dist(Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p),u,x),Negate(Dist(Times(b,c,p),Int(ExpandIntegrand(Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(p,Negate(C1))),Times(u,Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),-1)),x),x),x)))),And(FreeQ(List(a,b,c,d,e,f,q),x),IGtQ(p,C1),EqQ(Plus(Times(Sqr(c),Sqr(d)),Negate(Sqr(e))),C0),IntegersQ(m,q),NeQ(m,CN1),NeQ(q,CN1),ILtQ(Plus(m,q,C1),C0),LtQ(Times(m,q),C0)))),
IIntegrate(5939,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_),Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),q_)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,x)),q)),x))),Plus(Dist(Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p),u,x),Negate(Dist(Times(b,c,p),Int(ExpandIntegrand(Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(p,Negate(C1))),Times(u,Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),-1)),x),x),x)))),And(FreeQ(List(a,b,c,d,e,f,q),x),IGtQ(p,C1),EqQ(Plus(Times(Sqr(c),Sqr(d)),Negate(Sqr(e))),C0),IntegersQ(m,q),NeQ(m,CN1),NeQ(q,CN1),ILtQ(Plus(m,q,C1),C0),LtQ(Times(m,q),C0)))),
IIntegrate(5940,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,x_)),q_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p),Times(Power(Times(f,x),m),Power(Plus(d,Times(e,x)),q)),x),x),And(FreeQ(List(a,b,c,d,e,f,m),x),IGtQ(p,C0),IntegerQ(q),Or(GtQ(q,C0),NeQ(a,C0),IntegerQ(m))))),
IIntegrate(5941,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,x_)),q_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p),Times(Power(Times(f,x),m),Power(Plus(d,Times(e,x)),q)),x),x),And(FreeQ(List(a,b,c,d,e,f,m),x),IGtQ(p,C0),IntegerQ(q),Or(GtQ(q,C0),NeQ(a,C0),IntegerQ(m))))),
IIntegrate(5942,Int(Times(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(b,Power(Plus(d,Times(e,Sqr(x))),q),Power(Times(C2,c,q,Plus(Times(C2,q),C1)),-1)),x),Dist(Times(C2,d,q,Power(Plus(Times(C2,q),C1),-1)),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(q,Negate(C1))),Plus(a,Times(b,ArcTanh(Times(c,x))))),x),x),Simp(Times(x,Power(Plus(d,Times(e,Sqr(x))),q),Plus(a,Times(b,ArcTanh(Times(c,x)))),Power(Plus(Times(C2,q),C1),-1)),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),GtQ(q,C0)))),
IIntegrate(5943,Int(Times(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(b,Power(Plus(d,Times(e,Sqr(x))),q),Power(Times(C2,c,q,Plus(Times(C2,q),C1)),-1)),x),Dist(Times(C2,d,q,Power(Plus(Times(C2,q),C1),-1)),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(q,Negate(C1))),Plus(a,Times(b,ArcCoth(Times(c,x))))),x),x),Simp(Times(x,Power(Plus(d,Times(e,Sqr(x))),q),Plus(a,Times(b,ArcCoth(Times(c,x)))),Power(Plus(Times(C2,q),C1),-1)),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),GtQ(q,C0)))),
IIntegrate(5944,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(b,p,Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(p,Negate(C1))),Power(Times(C2,c,q,Plus(Times(C2,q),C1)),-1)),x),Dist(Times(C2,d,q,Power(Plus(Times(C2,q),C1),-1)),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(q,Negate(C1))),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p)),x),x),Negate(Dist(Times(Sqr(b),d,p,Plus(p,Negate(C1)),Power(Times(C2,q,Plus(Times(C2,q),C1)),-1)),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(q,Negate(C1))),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(p,Negate(C2)))),x),x)),Simp(Times(x,Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p),Power(Plus(Times(C2,q),C1),-1)),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),GtQ(q,C0),GtQ(p,C1)))),
IIntegrate(5945,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(b,p,Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(p,Negate(C1))),Power(Times(C2,c,q,Plus(Times(C2,q),C1)),-1)),x),Dist(Times(C2,d,q,Power(Plus(Times(C2,q),C1),-1)),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(q,Negate(C1))),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p)),x),x),Negate(Dist(Times(Sqr(b),d,p,Plus(p,Negate(C1)),Power(Times(C2,q,Plus(Times(C2,q),C1)),-1)),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(q,Negate(C1))),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(p,Negate(C2)))),x),x)),Simp(Times(x,Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p),Power(Plus(Times(C2,q),C1),-1)),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),GtQ(q,C0),GtQ(p,C1)))),
IIntegrate(5946,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),-1),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),-1)),x_Symbol),
    Condition(Simp(Times(Log(RemoveContent(Plus(a,Times(b,ArcTanh(Times(c,x)))),x)),Power(Times(b,c,d),-1)),x),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0)))),
IIntegrate(5947,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),-1),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),-1)),x_Symbol),
    Condition(Simp(Times(Log(RemoveContent(Plus(a,Times(b,ArcCoth(Times(c,x)))),x)),Power(Times(b,c,d),-1)),x),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0)))),
IIntegrate(5948,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),-1)),x_Symbol),
    Condition(Simp(Times(Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(p,C1)),Power(Times(b,c,d,Plus(p,C1)),-1)),x),And(FreeQ(List(a,b,c,d,e,p),x),EqQ(Plus(Times(Sqr(c),d),e),C0),NeQ(p,CN1)))),
IIntegrate(5949,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),-1)),x_Symbol),
    Condition(Simp(Times(Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(p,C1)),Power(Times(b,c,d,Plus(p,C1)),-1)),x),And(FreeQ(List(a,b,c,d,e,p),x),EqQ(Plus(Times(Sqr(c),d),e),C0),NeQ(p,CN1)))),
IIntegrate(5950,Int(Times(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Plus(Simp(Times(CN2,Plus(a,Times(b,ArcTanh(Times(c,x)))),ArcTan(Times(Sqrt(Plus(C1,Times(CN1,c,x))),Power(Plus(C1,Times(c,x)),CN1D2))),Power(Times(c,Sqrt(d)),-1)),x),Negate(Simp(Times(CI,b,PolyLog(C2,Times(CN1,CI,Sqrt(Plus(C1,Times(CN1,c,x))),Power(Plus(C1,Times(c,x)),CN1D2))),Power(Times(c,Sqrt(d)),-1)),x)),Simp(Times(CI,b,PolyLog(C2,Times(CI,Sqrt(Plus(C1,Times(CN1,c,x))),Power(Plus(C1,Times(c,x)),CN1D2))),Power(Times(c,Sqrt(d)),-1)),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),GtQ(d,C0))))
  );
}
