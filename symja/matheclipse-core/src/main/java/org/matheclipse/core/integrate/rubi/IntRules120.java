package org.matheclipse.core.integrate.rubi;


import org.matheclipse.core.interfaces.IAST;

import static org.matheclipse.core.expression.F.And;
import static org.matheclipse.core.expression.F.ArcCoth;
import static org.matheclipse.core.expression.F.ArcTanh;
import static org.matheclipse.core.expression.F.C0;
import static org.matheclipse.core.expression.F.C1;
import static org.matheclipse.core.expression.F.C1D2;
import static org.matheclipse.core.expression.F.C2;
import static org.matheclipse.core.expression.F.C3;
import static org.matheclipse.core.expression.F.C4;
import static org.matheclipse.core.expression.F.CN1;
import static org.matheclipse.core.expression.F.CN1D2;
import static org.matheclipse.core.expression.F.CN2;
import static org.matheclipse.core.expression.F.Condition;
import static org.matheclipse.core.expression.F.Cosh;
import static org.matheclipse.core.expression.F.Csch;
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
import static org.matheclipse.core.expression.F.Sech;
import static org.matheclipse.core.expression.F.Set;
import static org.matheclipse.core.expression.F.Sinh;
import static org.matheclipse.core.expression.F.Sqr;
import static org.matheclipse.core.expression.F.Sqrt;
import static org.matheclipse.core.expression.F.Times;
import static org.matheclipse.core.expression.F.With;
import static org.matheclipse.core.expression.F.a;
import static org.matheclipse.core.expression.F.a_;
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
import static org.matheclipse.core.expression.F.f_;
import static org.matheclipse.core.expression.F.f_DEFAULT;
import static org.matheclipse.core.expression.F.g;
import static org.matheclipse.core.expression.F.g_DEFAULT;
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
import static org.matheclipse.core.expression.F.u_;
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
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.RationalQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Rt;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Simp;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.SimplifyIntegrand;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Subst;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.SumQ;

/** 
 * IndefiniteIntegrationRules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class IntRules120 { 
  public static IAST RULES = List( 
IIntegrate(6001,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Sqr(x_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),-2)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(p,C1)),Power(Times(C2,b,Power(c,3),Sqr(d),Plus(p,C1)),-1)),x)),Negate(Dist(Times(b,p,Power(Times(C2,c),-1)),Int(Times(x,Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(p,Negate(C1))),Power(Plus(d,Times(e,Sqr(x))),-2)),x),x)),Simp(Times(x,Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p),Power(Times(C2,Sqr(c),d,Plus(d,Times(e,Sqr(x)))),-1)),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),GtQ(p,C0)))),
IIntegrate(6002,Int(Times(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Times(c,d,Sqr(m)),-1)),x)),Negate(Dist(Times(Sqr(f),Plus(m,Negate(C1)),Power(Times(Sqr(c),d,m),-1)),Int(Times(Power(Times(f,x),Plus(m,Negate(C2))),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Plus(a,Times(b,ArcTanh(Times(c,x))))),x),x)),Simp(Times(f,Power(Times(f,x),Plus(m,Negate(C1))),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Plus(a,Times(b,ArcTanh(Times(c,x)))),Power(Times(Sqr(c),d,m),-1)),x)),And(FreeQ(List(a,b,c,d,e,f),x),EqQ(Plus(Times(Sqr(c),d),e),C0),EqQ(Plus(m,Times(C2,q),C2),C0),LtQ(q,CN1)))),
IIntegrate(6003,Int(Times(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Times(c,d,Sqr(m)),-1)),x)),Negate(Dist(Times(Sqr(f),Plus(m,Negate(C1)),Power(Times(Sqr(c),d,m),-1)),Int(Times(Power(Times(f,x),Plus(m,Negate(C2))),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Plus(a,Times(b,ArcCoth(Times(c,x))))),x),x)),Simp(Times(f,Power(Times(f,x),Plus(m,Negate(C1))),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Plus(a,Times(b,ArcCoth(Times(c,x)))),Power(Times(Sqr(c),d,m),-1)),x)),And(FreeQ(List(a,b,c,d,e,f),x),EqQ(Plus(Times(Sqr(c),d),e),C0),EqQ(Plus(m,Times(C2,q),C2),C0),LtQ(q,CN1)))),
IIntegrate(6004,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_),Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,p,Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(p,Negate(C1))),Power(Times(c,d,Sqr(m)),-1)),x)),Negate(Dist(Times(Sqr(f),Plus(m,Negate(C1)),Power(Times(Sqr(c),d,m),-1)),Int(Times(Power(Times(f,x),Plus(m,Negate(C2))),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p)),x),x)),Dist(Times(Sqr(b),p,Plus(p,Negate(C1)),Power(m,-2)),Int(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(p,Negate(C2)))),x),x),Simp(Times(f,Power(Times(f,x),Plus(m,Negate(C1))),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p),Power(Times(Sqr(c),d,m),-1)),x)),And(FreeQ(List(a,b,c,d,e,f,m),x),EqQ(Plus(Times(Sqr(c),d),e),C0),EqQ(Plus(m,Times(C2,q),C2),C0),LtQ(q,CN1),GtQ(p,C1)))),
IIntegrate(6005,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_),Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,p,Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(p,Negate(C1))),Power(Times(c,d,Sqr(m)),-1)),x)),Negate(Dist(Times(Sqr(f),Plus(m,Negate(C1)),Power(Times(Sqr(c),d,m),-1)),Int(Times(Power(Times(f,x),Plus(m,Negate(C2))),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p)),x),x)),Dist(Times(Sqr(b),p,Plus(p,Negate(C1)),Power(m,-2)),Int(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(p,Negate(C2)))),x),x),Simp(Times(f,Power(Times(f,x),Plus(m,Negate(C1))),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p),Power(Times(Sqr(c),d,m),-1)),x)),And(FreeQ(List(a,b,c,d,e,f,m),x),EqQ(Plus(Times(Sqr(c),d),e),C0),EqQ(Plus(m,Times(C2,q),C2),C0),LtQ(q,CN1),GtQ(p,C1)))),
IIntegrate(6006,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_),Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(p,C1)),Power(Times(b,c,d,Plus(p,C1)),-1)),x),Negate(Dist(Times(f,m,Power(Times(b,c,Plus(p,C1)),-1)),Int(Times(Power(Times(f,x),Plus(m,Negate(C1))),Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(p,C1))),x),x))),And(FreeQ(List(a,b,c,d,e,f,m,q),x),EqQ(Plus(Times(Sqr(c),d),e),C0),EqQ(Plus(m,Times(C2,q),C2),C0),LtQ(p,CN1)))),
IIntegrate(6007,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_),Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(p,C1)),Power(Times(b,c,d,Plus(p,C1)),-1)),x),Negate(Dist(Times(f,m,Power(Times(b,c,Plus(p,C1)),-1)),Int(Times(Power(Times(f,x),Plus(m,Negate(C1))),Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(p,C1))),x),x))),And(FreeQ(List(a,b,c,d,e,f,m,q),x),EqQ(Plus(Times(Sqr(c),d),e),C0),EqQ(Plus(m,Times(C2,q),C2),C0),LtQ(p,CN1)))),
IIntegrate(6008,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(f,x),Plus(m,C1)),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p),Power(Times(d,Plus(m,C1)),-1)),x),Negate(Dist(Times(b,c,p,Power(Plus(m,C1),-1)),Int(Times(Power(Times(f,x),Plus(m,C1)),Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(p,Negate(C1)))),x),x))),And(FreeQ(List(a,b,c,d,e,f,m,q),x),EqQ(Plus(Times(Sqr(c),d),e),C0),EqQ(Plus(m,Times(C2,q),C3),C0),GtQ(p,C0),NeQ(m,CN1)))),
IIntegrate(6009,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(f,x),Plus(m,C1)),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p),Power(Times(d,f,Plus(m,C1)),-1)),x),Negate(Dist(Times(b,c,p,Power(Times(f,Plus(m,C1)),-1)),Int(Times(Power(Times(f,x),Plus(m,C1)),Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(p,Negate(C1)))),x),x))),And(FreeQ(List(a,b,c,d,e,f,m,q),x),EqQ(Plus(Times(Sqr(c),d),e),C0),EqQ(Plus(m,Times(C2,q),C3),C0),GtQ(p,C0),NeQ(m,CN1)))),
IIntegrate(6010,Int(Times(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Times(f_DEFAULT,x_),m_),Sqrt(Plus(d_,Times(e_DEFAULT,Sqr(x_))))),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(f,x),Plus(m,C1)),Sqrt(Plus(d,Times(e,Sqr(x)))),Plus(a,Times(b,ArcTanh(Times(c,x)))),Power(Times(f,Plus(m,C2)),-1)),x),Dist(Times(d,Power(Plus(m,C2),-1)),Int(Times(Power(Times(f,x),m),Plus(a,Times(b,ArcTanh(Times(c,x)))),Power(Plus(d,Times(e,Sqr(x))),CN1D2)),x),x),Negate(Dist(Times(b,c,d,Power(Times(f,Plus(m,C2)),-1)),Int(Times(Power(Times(f,x),Plus(m,C1)),Power(Plus(d,Times(e,Sqr(x))),CN1D2)),x),x))),And(FreeQ(List(a,b,c,d,e,f,m),x),EqQ(Plus(Times(Sqr(c),d),e),C0),NeQ(m,CN2)))),
IIntegrate(6011,Int(Times(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Times(f_DEFAULT,x_),m_),Sqrt(Plus(d_,Times(e_DEFAULT,Sqr(x_))))),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(f,x),Plus(m,C1)),Sqrt(Plus(d,Times(e,Sqr(x)))),Plus(a,Times(b,ArcCoth(Times(c,x)))),Power(Times(f,Plus(m,C2)),-1)),x),Dist(Times(d,Power(Plus(m,C2),-1)),Int(Times(Power(Times(f,x),m),Plus(a,Times(b,ArcCoth(Times(c,x)))),Power(Plus(d,Times(e,Sqr(x))),CN1D2)),x),x),Negate(Dist(Times(b,c,d,Power(Times(f,Plus(m,C2)),-1)),Int(Times(Power(Times(f,x),Plus(m,C1)),Power(Plus(d,Times(e,Sqr(x))),CN1D2)),x),x))),And(FreeQ(List(a,b,c,d,e,f,m),x),EqQ(Plus(Times(Sqr(c),d),e),C0),NeQ(m,CN2)))),
IIntegrate(6012,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p)),x),x),And(FreeQ(List(a,b,c,d,e,f,m),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IGtQ(p,C0),IGtQ(q,C1)))),
IIntegrate(6013,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p)),x),x),And(FreeQ(List(a,b,c,d,e,f,m),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IGtQ(p,C0),IGtQ(q,C1)))),
IIntegrate(6014,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_DEFAULT)),x_Symbol),
    Condition(Plus(Dist(d,Int(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),Plus(q,Negate(C1))),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p)),x),x),Negate(Dist(Times(Sqr(c),d,Power(f,-2)),Int(Times(Power(Times(f,x),Plus(m,C2)),Power(Plus(d,Times(e,Sqr(x))),Plus(q,Negate(C1))),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p)),x),x))),And(FreeQ(List(a,b,c,d,e,f,m),x),EqQ(Plus(Times(Sqr(c),d),e),C0),GtQ(q,C0),IGtQ(p,C0),Or(RationalQ(m),And(EqQ(p,C1),IntegerQ(q)))))),
IIntegrate(6015,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_DEFAULT)),x_Symbol),
    Condition(Plus(Dist(d,Int(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),Plus(q,Negate(C1))),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p)),x),x),Negate(Dist(Times(Sqr(c),d,Power(f,-2)),Int(Times(Power(Times(f,x),Plus(m,C2)),Power(Plus(d,Times(e,Sqr(x))),Plus(q,Negate(C1))),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p)),x),x))),And(FreeQ(List(a,b,c,d,e,f,m),x),EqQ(Plus(Times(Sqr(c),d),e),C0),GtQ(q,C0),IGtQ(p,C0),Or(RationalQ(m),And(EqQ(p,C1),IntegerQ(q)))))),
IIntegrate(6016,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(f,Power(Times(f,x),Plus(m,Negate(C1))),Sqrt(Plus(d,Times(e,Sqr(x)))),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p),Power(Times(Sqr(c),d,m),-1)),x)),Dist(Times(b,f,p,Power(Times(c,m),-1)),Int(Times(Power(Times(f,x),Plus(m,Negate(C1))),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(p,Negate(C1))),Power(Plus(d,Times(e,Sqr(x))),CN1D2)),x),x),Dist(Times(Sqr(f),Plus(m,Negate(C1)),Power(Times(Sqr(c),m),-1)),Int(Times(Power(Times(f,x),Plus(m,Negate(C2))),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p),Power(Plus(d,Times(e,Sqr(x))),CN1D2)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),EqQ(Plus(Times(Sqr(c),d),e),C0),GtQ(p,C0),GtQ(m,C1)))),
IIntegrate(6017,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(f,Power(Times(f,x),Plus(m,Negate(C1))),Sqrt(Plus(d,Times(e,Sqr(x)))),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p),Power(Times(Sqr(c),d,m),-1)),x)),Dist(Times(b,f,p,Power(Times(c,m),-1)),Int(Times(Power(Times(f,x),Plus(m,Negate(C1))),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(p,Negate(C1))),Power(Plus(d,Times(e,Sqr(x))),CN1D2)),x),x),Dist(Times(Sqr(f),Plus(m,Negate(C1)),Power(Times(Sqr(c),m),-1)),Int(Times(Power(Times(f,x),Plus(m,Negate(C2))),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p),Power(Plus(d,Times(e,Sqr(x))),CN1D2)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),EqQ(Plus(Times(Sqr(c),d),e),C0),GtQ(p,C0),GtQ(m,C1)))),
IIntegrate(6018,Int(Times(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(x_,-1),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Plus(Simp(Times(CN2,Plus(a,Times(b,ArcTanh(Times(c,x)))),ArcTanh(Times(Sqrt(Plus(C1,Times(CN1,c,x))),Power(Plus(C1,Times(c,x)),CN1D2))),Power(d,CN1D2)),x),Simp(Times(b,PolyLog(C2,Times(CN1,Sqrt(Plus(C1,Times(CN1,c,x))),Power(Plus(C1,Times(c,x)),CN1D2))),Power(d,CN1D2)),x),Negate(Simp(Times(b,PolyLog(C2,Times(Sqrt(Plus(C1,Times(CN1,c,x))),Power(Plus(C1,Times(c,x)),CN1D2))),Power(d,CN1D2)),x))),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),GtQ(d,C0)))),
IIntegrate(6019,Int(Times(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(x_,-1),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Plus(Simp(Times(CN2,Plus(a,Times(b,ArcCoth(Times(c,x)))),ArcTanh(Times(Sqrt(Plus(C1,Times(CN1,c,x))),Power(Plus(C1,Times(c,x)),CN1D2))),Power(d,CN1D2)),x),Simp(Times(b,PolyLog(C2,Times(CN1,Sqrt(Plus(C1,Times(CN1,c,x))),Power(Plus(C1,Times(c,x)),CN1D2))),Power(d,CN1D2)),x),Negate(Simp(Times(b,PolyLog(C2,Times(Sqrt(Plus(C1,Times(CN1,c,x))),Power(Plus(C1,Times(c,x)),CN1D2))),Power(d,CN1D2)),x))),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),GtQ(d,C0)))),
IIntegrate(6020,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_),Power(x_,-1),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Dist(Power(d,CN1D2),Subst(Int(Times(Power(Plus(a,Times(b,x)),p),Csch(x)),x),x,ArcTanh(Times(c,x))),x),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IGtQ(p,C0),GtQ(d,C0)))),
IIntegrate(6021,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_),Power(x_,-1),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Negate(Dist(Times(c,x,Sqrt(Plus(C1,Negate(Power(Times(Sqr(c),Sqr(x)),-1)))),Power(Plus(d,Times(e,Sqr(x))),CN1D2)),Subst(Int(Times(Power(Plus(a,Times(b,x)),p),Sech(x)),x),x,ArcCoth(Times(c,x))),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IGtQ(p,C0),GtQ(d,C0)))),
IIntegrate(6022,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(x_,-1),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Dist(Times(Sqrt(Plus(C1,Times(CN1,Sqr(c),Sqr(x)))),Power(Plus(d,Times(e,Sqr(x))),CN1D2)),Int(Times(Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p),Power(Times(x,Sqrt(Plus(C1,Times(CN1,Sqr(c),Sqr(x))))),-1)),x),x),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IGtQ(p,C0),Not(GtQ(d,C0))))),
IIntegrate(6023,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(x_,-1),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Dist(Times(Sqrt(Plus(C1,Times(CN1,Sqr(c),Sqr(x)))),Power(Plus(d,Times(e,Sqr(x))),CN1D2)),Int(Times(Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p),Power(Times(x,Sqrt(Plus(C1,Times(CN1,Sqr(c),Sqr(x))))),-1)),x),x),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IGtQ(p,C0),Not(GtQ(d,C0))))),
IIntegrate(6024,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(x_,-2),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Sqrt(Plus(d,Times(e,Sqr(x)))),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p),Power(Times(d,x),-1)),x)),Dist(Times(b,c,p),Int(Times(Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(p,Negate(C1))),Power(Times(x,Sqrt(Plus(d,Times(e,Sqr(x))))),-1)),x),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),GtQ(p,C0)))),
IIntegrate(6025,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(x_,-2),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Sqrt(Plus(d,Times(e,Sqr(x)))),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p),Power(Times(d,x),-1)),x)),Dist(Times(b,c,p),Int(Times(Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(p,Negate(C1))),Power(Times(x,Sqrt(Plus(d,Times(e,Sqr(x))))),-1)),x),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),GtQ(p,C0)))),
IIntegrate(6026,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(f,x),Plus(m,C1)),Sqrt(Plus(d,Times(e,Sqr(x)))),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p),Power(Times(d,f,Plus(m,C1)),-1)),x),Negate(Dist(Times(b,c,p,Power(Times(f,Plus(m,C1)),-1)),Int(Times(Power(Times(f,x),Plus(m,C1)),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(p,Negate(C1))),Power(Plus(d,Times(e,Sqr(x))),CN1D2)),x),x)),Dist(Times(Sqr(c),Plus(m,C2),Power(Times(Sqr(f),Plus(m,C1)),-1)),Int(Times(Power(Times(f,x),Plus(m,C2)),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p),Power(Plus(d,Times(e,Sqr(x))),CN1D2)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),EqQ(Plus(Times(Sqr(c),d),e),C0),GtQ(p,C0),LtQ(m,CN1),NeQ(m,CN2)))),
IIntegrate(6027,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(f,x),Plus(m,C1)),Sqrt(Plus(d,Times(e,Sqr(x)))),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p),Power(Times(d,f,Plus(m,C1)),-1)),x),Negate(Dist(Times(b,c,p,Power(Times(f,Plus(m,C1)),-1)),Int(Times(Power(Times(f,x),Plus(m,C1)),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(p,Negate(C1))),Power(Plus(d,Times(e,Sqr(x))),CN1D2)),x),x)),Dist(Times(Sqr(c),Plus(m,C2),Power(Times(Sqr(f),Plus(m,C1)),-1)),Int(Times(Power(Times(f,x),Plus(m,C2)),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p),Power(Plus(d,Times(e,Sqr(x))),CN1D2)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),EqQ(Plus(Times(Sqr(c),d),e),C0),GtQ(p,C0),LtQ(m,CN1),NeQ(m,CN2)))),
IIntegrate(6028,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(x_,m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Plus(Dist(Power(e,-1),Int(Times(Power(x,Plus(m,Negate(C2))),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p)),x),x),Negate(Dist(Times(d,Power(e,-1)),Int(Times(Power(x,Plus(m,Negate(C2))),Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p)),x),x))),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IntegersQ(p,Times(C2,q)),LtQ(q,CN1),IGtQ(m,C1),NeQ(p,CN1)))),
IIntegrate(6029,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(x_,m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Plus(Dist(Power(e,-1),Int(Times(Power(x,Plus(m,Negate(C2))),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p)),x),x),Negate(Dist(Times(d,Power(e,-1)),Int(Times(Power(x,Plus(m,Negate(C2))),Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p)),x),x))),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IntegersQ(p,Times(C2,q)),LtQ(q,CN1),IGtQ(m,C1),NeQ(p,CN1)))),
IIntegrate(6030,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(x_,m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Plus(Dist(Power(d,-1),Int(Times(Power(x,m),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p)),x),x),Negate(Dist(Times(e,Power(d,-1)),Int(Times(Power(x,Plus(m,C2)),Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p)),x),x))),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IntegersQ(p,Times(C2,q)),LtQ(q,CN1),ILtQ(m,C0),NeQ(p,CN1)))),
IIntegrate(6031,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(x_,m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Plus(Dist(Power(d,-1),Int(Times(Power(x,m),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p)),x),x),Negate(Dist(Times(e,Power(d,-1)),Int(Times(Power(x,Plus(m,C2)),Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p)),x),x))),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IntegersQ(p,Times(C2,q)),LtQ(q,CN1),ILtQ(m,C0),NeQ(p,CN1)))),
IIntegrate(6032,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(x_,m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(x,m),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(p,C1)),Power(Times(b,c,d,Plus(p,C1)),-1)),x),Dist(Times(c,Plus(m,Times(C2,q),C2),Power(Times(b,Plus(p,C1)),-1)),Int(Times(Power(x,Plus(m,C1)),Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(p,C1))),x),x),Negate(Dist(Times(m,Power(Times(b,c,Plus(p,C1)),-1)),Int(Times(Power(x,Plus(m,Negate(C1))),Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(p,C1))),x),x))),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IntegerQ(m),LtQ(q,CN1),LtQ(p,CN1),NeQ(Plus(m,Times(C2,q),C2),C0)))),
IIntegrate(6033,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(x_,m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(x,m),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(p,C1)),Power(Times(b,c,d,Plus(p,C1)),-1)),x),Dist(Times(c,Plus(m,Times(C2,q),C2),Power(Times(b,Plus(p,C1)),-1)),Int(Times(Power(x,Plus(m,C1)),Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(p,C1))),x),x),Negate(Dist(Times(m,Power(Times(b,c,Plus(p,C1)),-1)),Int(Times(Power(x,Plus(m,Negate(C1))),Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(p,C1))),x),x))),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IntegerQ(m),LtQ(q,CN1),LtQ(p,CN1),NeQ(Plus(m,Times(C2,q),C2),C0)))),
IIntegrate(6034,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(x_,m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Dist(Times(Power(d,q),Power(Power(c,Plus(m,C1)),-1)),Subst(Int(Times(Power(Plus(a,Times(b,x)),p),Power(Sinh(x),m),Power(Power(Cosh(x),Plus(m,Times(C2,Plus(q,C1)))),-1)),x),x,ArcTanh(Times(c,x))),x),And(FreeQ(List(a,b,c,d,e,p),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IGtQ(m,C0),ILtQ(Plus(m,Times(C2,q),C1),C0),Or(IntegerQ(q),GtQ(d,C0))))),
IIntegrate(6035,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(x_,m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Dist(Times(Power(d,Plus(q,C1D2)),Sqrt(Plus(C1,Times(CN1,Sqr(c),Sqr(x)))),Power(Plus(d,Times(e,Sqr(x))),CN1D2)),Int(Times(Power(x,m),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),q),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p)),x),x),And(FreeQ(List(a,b,c,d,e,p),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IGtQ(m,C0),ILtQ(Plus(m,Times(C2,q),C1),C0),Not(Or(IntegerQ(q),GtQ(d,C0)))))),
IIntegrate(6036,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(x_,m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Negate(Dist(Times(Power(Negate(d),q),Power(Power(c,Plus(m,C1)),-1)),Subst(Int(Times(Power(Plus(a,Times(b,x)),p),Power(Cosh(x),m),Power(Power(Sinh(x),Plus(m,Times(C2,Plus(q,C1)))),-1)),x),x,ArcCoth(Times(c,x))),x)),And(FreeQ(List(a,b,c,d,e,p),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IGtQ(m,C0),ILtQ(Plus(m,Times(C2,q),C1),C0),IntegerQ(q)))),
IIntegrate(6037,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(x_,m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Negate(Dist(Times(Power(Negate(d),Plus(q,C1D2)),x,Sqrt(Times(Plus(Times(Sqr(c),Sqr(x)),Negate(C1)),Power(Times(Sqr(c),Sqr(x)),-1))),Power(Times(Power(c,m),Sqrt(Plus(d,Times(e,Sqr(x))))),-1)),Subst(Int(Times(Power(Plus(a,Times(b,x)),p),Power(Cosh(x),m),Power(Power(Sinh(x),Plus(m,Times(C2,Plus(q,C1)))),-1)),x),x,ArcCoth(Times(c,x))),x)),And(FreeQ(List(a,b,c,d,e,p),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IGtQ(m,C0),ILtQ(Plus(m,Times(C2,q),C1),C0),Not(IntegerQ(q))))),
IIntegrate(6038,Int(Times(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),x_,Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),q_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Plus(a,Times(b,ArcTanh(Times(c,x)))),Power(Times(C2,e,Plus(q,C1)),-1)),x),Negate(Dist(Times(b,c,Power(Times(C2,e,Plus(q,C1)),-1)),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,q),x),NeQ(q,CN1)))),
IIntegrate(6039,Int(Times(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),x_,Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),q_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Plus(a,Times(b,ArcCoth(Times(c,x)))),Power(Times(C2,e,Plus(q,C1)),-1)),x),Negate(Dist(Times(b,c,Power(Times(C2,e,Plus(q,C1)),-1)),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,q),x),NeQ(q,CN1)))),
IIntegrate(6040,Int(Times(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),q_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),q)),x))),Plus(Dist(Plus(a,Times(b,ArcTanh(Times(c,x)))),u,x),Negate(Dist(Times(b,c),Int(SimplifyIntegrand(Times(u,Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),-1)),x),x),x)))),And(FreeQ(List(a,b,c,d,e,f,m,q),x),Or(And(IGtQ(q,C0),Not(And(ILtQ(Times(C1D2,Plus(m,Negate(C1))),C0),GtQ(Plus(m,Times(C2,q),C3),C0)))),And(IGtQ(Times(C1D2,Plus(m,C1)),C0),Not(And(ILtQ(q,C0),GtQ(Plus(m,Times(C2,q),C3),C0)))),And(ILtQ(Times(C1D2,Plus(m,Times(C2,q),C1)),C0),Not(ILtQ(Times(C1D2,Plus(m,Negate(C1))),C0))))))),
IIntegrate(6041,Int(Times(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),q_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),q)),x))),Plus(Dist(Plus(a,Times(b,ArcCoth(Times(c,x)))),u,x),Negate(Dist(Times(b,c),Int(SimplifyIntegrand(Times(u,Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),-1)),x),x),x)))),And(FreeQ(List(a,b,c,d,e,f,m,q),x),Or(And(IGtQ(q,C0),Not(And(ILtQ(Times(C1D2,Plus(m,Negate(C1))),C0),GtQ(Plus(m,Times(C2,q),C3),C0)))),And(IGtQ(Times(C1D2,Plus(m,C1)),C0),Not(And(ILtQ(q,C0),GtQ(Plus(m,Times(C2,q),C3),C0)))),And(ILtQ(Times(C1D2,Plus(m,Times(C2,q),C1)),C0),Not(ILtQ(Times(C1D2,Plus(m,Negate(C1))),C0))))))),
IIntegrate(6042,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),x_,Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),-2)),x_Symbol),
    Condition(Plus(Dist(Power(Times(C4,Sqr(d),Rt(Times(CN1,e,Power(d,-1)),C2)),-1),Int(Times(Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p),Power(Plus(C1,Times(CN1,Rt(Times(CN1,e,Power(d,-1)),C2),x)),-2)),x),x),Negate(Dist(Power(Times(C4,Sqr(d),Rt(Times(CN1,e,Power(d,-1)),C2)),-1),Int(Times(Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p),Power(Plus(C1,Times(Rt(Times(CN1,e,Power(d,-1)),C2),x)),-2)),x),x))),And(FreeQ(List(a,b,c,d,e),x),IGtQ(p,C0)))),
IIntegrate(6043,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),x_,Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),-2)),x_Symbol),
    Condition(Plus(Dist(Power(Times(C4,Sqr(d),Rt(Times(CN1,e,Power(d,-1)),C2)),-1),Int(Times(Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p),Power(Plus(C1,Times(CN1,Rt(Times(CN1,e,Power(d,-1)),C2),x)),-2)),x),x),Negate(Dist(Power(Times(C4,Sqr(d),Rt(Times(CN1,e,Power(d,-1)),C2)),-1),Int(Times(Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p),Power(Plus(C1,Times(Rt(Times(CN1,e,Power(d,-1)),C2),x)),-2)),x),x))),And(FreeQ(List(a,b,c,d,e),x),IGtQ(p,C0)))),
IIntegrate(6044,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,ExpandIntegrand(Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p),Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),q)),x))),Condition(Int(u,x),SumQ(u))),And(FreeQ(List(a,b,c,d,e,f,m),x),IntegerQ(q),IGtQ(p,C0),Or(GtQ(q,C0),IntegerQ(m))))),
IIntegrate(6045,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,ExpandIntegrand(Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p),Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),q)),x))),Condition(Int(u,x),SumQ(u))),And(FreeQ(List(a,b,c,d,e,f,m),x),IntegerQ(q),IGtQ(p,C0),Or(GtQ(q,C0),IntegerQ(m))))),
IIntegrate(6046,Int(Times(Plus(Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT),a_),Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_DEFAULT)),x_Symbol),
    Condition(Plus(Dist(a,Int(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),q)),x),x),Dist(b,Int(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),q),ArcTanh(Times(c,x))),x),x)),FreeQ(List(a,b,c,d,e,f,m,q),x))),
IIntegrate(6047,Int(Times(Plus(Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT),a_),Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_DEFAULT)),x_Symbol),
    Condition(Plus(Dist(a,Int(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),q)),x),x),Dist(b,Int(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),q),ArcCoth(Times(c,x))),x),x)),FreeQ(List(a,b,c,d,e,f,m,q),x))),
IIntegrate(6048,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,x_)),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),-1)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p),Power(Plus(d,Times(e,Sqr(x))),-1)),Power(Plus(f,Times(g,x)),m),x),x),And(FreeQ(List(a,b,c,d,e,f,g),x),IGtQ(p,C0),EqQ(Plus(Times(Sqr(c),d),e),C0),IGtQ(m,C0)))),
IIntegrate(6049,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,x_)),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),-1)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p),Power(Plus(d,Times(e,Sqr(x))),-1)),Power(Plus(f,Times(g,x)),m),x),x),And(FreeQ(List(a,b,c,d,e,f,g),x),IGtQ(p,C0),EqQ(Plus(Times(Sqr(c),d),e),C0),IGtQ(m,C0)))),
IIntegrate(6050,Int(Times(ArcTanh(u_),Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),-1)),x_Symbol),
    Condition(Plus(Dist(C1D2,Int(Times(Log(Plus(C1,u)),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p),Power(Plus(d,Times(e,Sqr(x))),-1)),x),x),Negate(Dist(C1D2,Int(Times(Log(Plus(C1,Negate(u))),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p),Power(Plus(d,Times(e,Sqr(x))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e),x),IGtQ(p,C0),EqQ(Plus(Times(Sqr(c),d),e),C0),EqQ(Plus(Sqr(u),Negate(Sqr(Plus(C1,Times(CN1,C2,Power(Plus(C1,Times(c,x)),-1)))))),C0))))
  );
}
