package org.matheclipse.core.integrate.rubi;


import org.matheclipse.core.interfaces.IAST;

import static org.matheclipse.core.expression.F.And;
import static org.matheclipse.core.expression.F.ArcCoth;
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
import static org.matheclipse.core.expression.F.QQ;
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
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.LtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.NeQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Simp;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Subst;

/** 
 * IndefiniteIntegrationRules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class IntRules119 { 
  public static IAST RULES = List( 
IIntegrate(5951,Int(Times(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Plus(Simp(Times(CN2,Plus(a,Times(b,ArcCoth(Times(c,x)))),ArcTan(Times(Sqrt(Plus(C1,Times(CN1,c,x))),Power(Plus(C1,Times(c,x)),CN1D2))),Power(Times(c,Sqrt(d)),-1)),x),Negate(Simp(Times(CI,b,PolyLog(C2,Times(CN1,CI,Sqrt(Plus(C1,Times(CN1,c,x))),Power(Plus(C1,Times(c,x)),CN1D2))),Power(Times(c,Sqrt(d)),-1)),x)),Simp(Times(CI,b,PolyLog(C2,Times(CI,Sqrt(Plus(C1,Times(CN1,c,x))),Power(Plus(C1,Times(c,x)),CN1D2))),Power(Times(c,Sqrt(d)),-1)),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),GtQ(d,C0)))),
IIntegrate(5952,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Dist(Power(Times(c,Sqrt(d)),-1),Subst(Int(Times(Power(Plus(a,Times(b,x)),p),Sech(x)),x),x,ArcTanh(Times(c,x))),x),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IGtQ(p,C0),GtQ(d,C0)))),
IIntegrate(5953,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Negate(Dist(Times(x,Sqrt(Plus(C1,Negate(Power(Times(Sqr(c),Sqr(x)),-1)))),Power(Plus(d,Times(e,Sqr(x))),CN1D2)),Subst(Int(Times(Power(Plus(a,Times(b,x)),p),Csch(x)),x),x,ArcCoth(Times(c,x))),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IGtQ(p,C0),GtQ(d,C0)))),
IIntegrate(5954,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Dist(Times(Sqrt(Plus(C1,Times(CN1,Sqr(c),Sqr(x)))),Power(Plus(d,Times(e,Sqr(x))),CN1D2)),Int(Times(Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),CN1D2)),x),x),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IGtQ(p,C0),Not(GtQ(d,C0))))),
IIntegrate(5955,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Dist(Times(Sqrt(Plus(C1,Times(CN1,Sqr(c),Sqr(x)))),Power(Plus(d,Times(e,Sqr(x))),CN1D2)),Int(Times(Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),CN1D2)),x),x),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IGtQ(p,C0),Not(GtQ(d,C0))))),
IIntegrate(5956,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),-2)),x_Symbol),
    Condition(Plus(Simp(Times(x,Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p),Power(Times(C2,d,Plus(d,Times(e,Sqr(x)))),-1)),x),Negate(Dist(Times(C1D2,b,c,p),Int(Times(x,Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(p,Negate(C1))),Power(Plus(d,Times(e,Sqr(x))),-2)),x),x)),Simp(Times(Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(p,C1)),Power(Times(C2,b,c,Sqr(d),Plus(p,C1)),-1)),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),GtQ(p,C0)))),
IIntegrate(5957,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),-2)),x_Symbol),
    Condition(Plus(Simp(Times(x,Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p),Power(Times(C2,d,Plus(d,Times(e,Sqr(x)))),-1)),x),Negate(Dist(Times(C1D2,b,c,p),Int(Times(x,Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(p,Negate(C1))),Power(Plus(d,Times(e,Sqr(x))),-2)),x),x)),Simp(Times(Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(p,C1)),Power(Times(C2,b,c,Sqr(d),Plus(p,C1)),-1)),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),GtQ(p,C0)))),
IIntegrate(5958,Int(Times(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),QQ(-3L,2L))),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,Power(Times(c,d,Sqrt(Plus(d,Times(e,Sqr(x))))),-1)),x)),Simp(Times(x,Plus(a,Times(b,ArcTanh(Times(c,x)))),Power(Times(d,Sqrt(Plus(d,Times(e,Sqr(x))))),-1)),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0)))),
IIntegrate(5959,Int(Times(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),QQ(-3L,2L))),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,Power(Times(c,d,Sqrt(Plus(d,Times(e,Sqr(x))))),-1)),x)),Simp(Times(x,Plus(a,Times(b,ArcCoth(Times(c,x)))),Power(Times(d,Sqrt(Plus(d,Times(e,Sqr(x))))),-1)),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0)))),
IIntegrate(5960,Int(Times(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Times(C4,c,d,Sqr(Plus(q,C1))),-1)),x)),Dist(Times(Plus(Times(C2,q),C3),Power(Times(C2,d,Plus(q,C1)),-1)),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Plus(a,Times(b,ArcTanh(Times(c,x))))),x),x),Negate(Simp(Times(x,Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Plus(a,Times(b,ArcTanh(Times(c,x)))),Power(Times(C2,d,Plus(q,C1)),-1)),x))),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),LtQ(q,CN1),NeQ(q,QQ(-3L,2L))))),
IIntegrate(5961,Int(Times(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Times(C4,c,d,Sqr(Plus(q,C1))),-1)),x)),Dist(Times(Plus(Times(C2,q),C3),Power(Times(C2,d,Plus(q,C1)),-1)),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Plus(a,Times(b,ArcCoth(Times(c,x))))),x),x),Negate(Simp(Times(x,Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Plus(a,Times(b,ArcCoth(Times(c,x)))),Power(Times(C2,d,Plus(q,C1)),-1)),x))),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),LtQ(q,CN1),NeQ(q,QQ(-3L,2L))))),
IIntegrate(5962,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),QQ(-3L,2L))),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,p,Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(p,Negate(C1))),Power(Times(c,d,Sqrt(Plus(d,Times(e,Sqr(x))))),-1)),x)),Dist(Times(Sqr(b),p,Plus(p,Negate(C1))),Int(Times(Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(p,Negate(C2))),Power(Plus(d,Times(e,Sqr(x))),QQ(-3L,2L))),x),x),Simp(Times(x,Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p),Power(Times(d,Sqrt(Plus(d,Times(e,Sqr(x))))),-1)),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),GtQ(p,C1)))),
IIntegrate(5963,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),QQ(-3L,2L))),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,p,Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(p,Negate(C1))),Power(Times(c,d,Sqrt(Plus(d,Times(e,Sqr(x))))),-1)),x)),Dist(Times(Sqr(b),p,Plus(p,Negate(C1))),Int(Times(Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(p,Negate(C2))),Power(Plus(d,Times(e,Sqr(x))),QQ(-3L,2L))),x),x),Simp(Times(x,Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p),Power(Times(d,Sqrt(Plus(d,Times(e,Sqr(x))))),-1)),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),GtQ(p,C1)))),
IIntegrate(5964,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,p,Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(p,Negate(C1))),Power(Times(C4,c,d,Sqr(Plus(q,C1))),-1)),x)),Dist(Times(Plus(Times(C2,q),C3),Power(Times(C2,d,Plus(q,C1)),-1)),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p)),x),x),Dist(Times(Sqr(b),p,Plus(p,Negate(C1)),Power(Times(C4,Sqr(Plus(q,C1))),-1)),Int(Times(Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(p,Negate(C2)))),x),x),Negate(Simp(Times(x,Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p),Power(Times(C2,d,Plus(q,C1)),-1)),x))),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),LtQ(q,CN1),GtQ(p,C1),NeQ(q,QQ(-3L,2L))))),
IIntegrate(5965,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,p,Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(p,Negate(C1))),Power(Times(C4,c,d,Sqr(Plus(q,C1))),-1)),x)),Dist(Times(Plus(Times(C2,q),C3),Power(Times(C2,d,Plus(q,C1)),-1)),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p)),x),x),Dist(Times(Sqr(b),p,Plus(p,Negate(C1)),Power(Times(C4,Sqr(Plus(q,C1))),-1)),Int(Times(Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(p,Negate(C2)))),x),x),Negate(Simp(Times(x,Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p),Power(Times(C2,d,Plus(q,C1)),-1)),x))),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),LtQ(q,CN1),GtQ(p,C1),NeQ(q,QQ(-3L,2L))))),
IIntegrate(5966,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(p,C1)),Power(Times(b,c,d,Plus(p,C1)),-1)),x),Dist(Times(C2,c,Plus(q,C1),Power(Times(b,Plus(p,C1)),-1)),Int(Times(x,Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(p,C1))),x),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),LtQ(q,CN1),LtQ(p,CN1)))),
IIntegrate(5967,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(p,C1)),Power(Times(b,c,d,Plus(p,C1)),-1)),x),Dist(Times(C2,c,Plus(q,C1),Power(Times(b,Plus(p,C1)),-1)),Int(Times(x,Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(p,C1))),x),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),LtQ(q,CN1),LtQ(p,CN1)))),
IIntegrate(5968,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Dist(Times(Power(d,q),Power(c,-1)),Subst(Int(Times(Power(Plus(a,Times(b,x)),p),Power(Power(Cosh(x),Times(C2,Plus(q,C1))),-1)),x),x,ArcTanh(Times(c,x))),x),And(FreeQ(List(a,b,c,d,e,p),x),EqQ(Plus(Times(Sqr(c),d),e),C0),ILtQ(Times(C2,Plus(q,C1)),C0),Or(IntegerQ(q),GtQ(d,C0))))),
IIntegrate(5969,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Dist(Times(Power(d,Plus(q,C1D2)),Sqrt(Plus(C1,Times(CN1,Sqr(c),Sqr(x)))),Power(Plus(d,Times(e,Sqr(x))),CN1D2)),Int(Times(Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),q),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p)),x),x),And(FreeQ(List(a,b,c,d,e,p),x),EqQ(Plus(Times(Sqr(c),d),e),C0),ILtQ(Times(C2,Plus(q,C1)),C0),Not(Or(IntegerQ(q),GtQ(d,C0)))))),
IIntegrate(5970,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Negate(Dist(Times(Power(Negate(d),q),Power(c,-1)),Subst(Int(Times(Power(Plus(a,Times(b,x)),p),Power(Power(Sinh(x),Times(C2,Plus(q,C1))),-1)),x),x,ArcCoth(Times(c,x))),x)),And(FreeQ(List(a,b,c,d,e,p),x),EqQ(Plus(Times(Sqr(c),d),e),C0),ILtQ(Times(C2,Plus(q,C1)),C0),IntegerQ(q)))),
IIntegrate(5971,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Negate(Dist(Times(Power(Negate(d),Plus(q,C1D2)),x,Sqrt(Times(Plus(Times(Sqr(c),Sqr(x)),Negate(C1)),Power(Times(Sqr(c),Sqr(x)),-1))),Power(Plus(d,Times(e,Sqr(x))),CN1D2)),Subst(Int(Times(Power(Plus(a,Times(b,x)),p),Power(Power(Sinh(x),Times(C2,Plus(q,C1))),-1)),x),x,ArcCoth(Times(c,x))),x)),And(FreeQ(List(a,b,c,d,e,p),x),EqQ(Plus(Times(Sqr(c),d),e),C0),ILtQ(Times(C2,Plus(q,C1)),C0),Not(IntegerQ(q))))),
IIntegrate(5972,Int(Times(ArcTanh(Times(c_DEFAULT,x_)),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),-1)),x_Symbol),
    Condition(Plus(Dist(C1D2,Int(Times(Log(Plus(C1,Times(c,x))),Power(Plus(d,Times(e,Sqr(x))),-1)),x),x),Negate(Dist(C1D2,Int(Times(Log(Plus(C1,Times(CN1,c,x))),Power(Plus(d,Times(e,Sqr(x))),-1)),x),x))),FreeQ(List(c,d,e),x))),
IIntegrate(5973,Int(Times(ArcCoth(Times(c_DEFAULT,x_)),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),-1)),x_Symbol),
    Condition(Plus(Dist(C1D2,Int(Times(Log(Plus(C1,Power(Times(c,x),-1))),Power(Plus(d,Times(e,Sqr(x))),-1)),x),x),Negate(Dist(C1D2,Int(Times(Log(Plus(C1,Negate(Power(Times(c,x),-1)))),Power(Plus(d,Times(e,Sqr(x))),-1)),x),x))),FreeQ(List(c,d,e),x))),
IIntegrate(5974,Int(Times(Plus(Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT),a_),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),-1)),x_Symbol),
    Condition(Plus(Dist(a,Int(Power(Plus(d,Times(e,Sqr(x))),-1),x),x),Dist(b,Int(Times(ArcTanh(Times(c,x)),Power(Plus(d,Times(e,Sqr(x))),-1)),x),x)),FreeQ(List(a,b,c,d,e),x))),
IIntegrate(5975,Int(Times(Plus(Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT),a_),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),-1)),x_Symbol),
    Condition(Plus(Dist(a,Int(Power(Plus(d,Times(e,Sqr(x))),-1),x),x),Dist(b,Int(Times(ArcCoth(Times(c,x)),Power(Plus(d,Times(e,Sqr(x))),-1)),x),x)),FreeQ(List(a,b,c,d,e),x))),
IIntegrate(5976,Int(Times(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),q_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Power(Plus(d,Times(e,Sqr(x))),q),x))),Plus(Dist(Plus(a,Times(b,ArcTanh(Times(c,x)))),u,x),Negate(Dist(Times(b,c),Int(Times(u,Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),-1)),x),x)))),And(FreeQ(List(a,b,c,d,e),x),Or(IntegerQ(q),ILtQ(Plus(q,C1D2),C0))))),
IIntegrate(5977,Int(Times(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),q_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Power(Plus(d,Times(e,Sqr(x))),q),x))),Plus(Dist(Plus(a,Times(b,ArcCoth(Times(c,x)))),u,x),Negate(Dist(Times(b,c),Int(Times(u,Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),-1)),x),x)))),And(FreeQ(List(a,b,c,d,e),x),Or(IntegerQ(q),ILtQ(Plus(q,C1D2),C0))))),
IIntegrate(5978,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p),Power(Plus(d,Times(e,Sqr(x))),q),x),x),And(FreeQ(List(a,b,c,d,e),x),IntegerQ(q),IGtQ(p,C0)))),
IIntegrate(5979,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p),Power(Plus(d,Times(e,Sqr(x))),q),x),x),And(FreeQ(List(a,b,c,d,e),x),IntegerQ(q),IGtQ(p,C0)))),
IIntegrate(5980,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),-1)),x_Symbol),
    Condition(Plus(Dist(Times(Sqr(f),Power(e,-1)),Int(Times(Power(Times(f,x),Plus(m,Negate(C2))),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p)),x),x),Negate(Dist(Times(d,Sqr(f),Power(e,-1)),Int(Times(Power(Times(f,x),Plus(m,Negate(C2))),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p),Power(Plus(d,Times(e,Sqr(x))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),GtQ(p,C0),GtQ(m,C1)))),
IIntegrate(5981,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),-1)),x_Symbol),
    Condition(Plus(Dist(Times(Sqr(f),Power(e,-1)),Int(Times(Power(Times(f,x),Plus(m,Negate(C2))),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p)),x),x),Negate(Dist(Times(d,Sqr(f),Power(e,-1)),Int(Times(Power(Times(f,x),Plus(m,Negate(C2))),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p),Power(Plus(d,Times(e,Sqr(x))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),GtQ(p,C0),GtQ(m,C1)))),
IIntegrate(5982,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),-1)),x_Symbol),
    Condition(Plus(Dist(Power(d,-1),Int(Times(Power(Times(f,x),m),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p)),x),x),Negate(Dist(Times(e,Power(Times(d,Sqr(f)),-1)),Int(Times(Power(Times(f,x),Plus(m,C2)),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p),Power(Plus(d,Times(e,Sqr(x))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),GtQ(p,C0),LtQ(m,CN1)))),
IIntegrate(5983,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),-1)),x_Symbol),
    Condition(Plus(Dist(Power(d,-1),Int(Times(Power(Times(f,x),m),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p)),x),x),Negate(Dist(Times(e,Power(Times(d,Sqr(f)),-1)),Int(Times(Power(Times(f,x),Plus(m,C2)),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p),Power(Plus(d,Times(e,Sqr(x))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),GtQ(p,C0),LtQ(m,CN1)))),
IIntegrate(5984,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),x_,Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),-1)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(p,C1)),Power(Times(b,e,Plus(p,C1)),-1)),x),Dist(Power(Times(c,d),-1),Int(Times(Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p),Power(Plus(C1,Times(CN1,c,x)),-1)),x),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IGtQ(p,C0)))),
IIntegrate(5985,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),x_,Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),-1)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(p,C1)),Power(Times(b,e,Plus(p,C1)),-1)),x),Dist(Power(Times(c,d),-1),Int(Times(Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p),Power(Plus(C1,Times(CN1,c,x)),-1)),x),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IGtQ(p,C0)))),
IIntegrate(5986,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_),x_,Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),-1)),x_Symbol),
    Condition(Plus(Simp(Times(x,Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(p,C1)),Power(Times(b,c,d,Plus(p,C1)),-1)),x),Negate(Dist(Power(Times(b,c,d,Plus(p,C1)),-1),Int(Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(p,C1)),x),x))),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),Not(IGtQ(p,C0)),NeQ(p,CN1)))),
IIntegrate(5987,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_),x_,Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),-1)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(x,Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(p,C1)),Power(Times(b,c,d,Plus(p,C1)),-1)),x)),Negate(Dist(Power(Times(b,c,d,Plus(p,C1)),-1),Int(Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(p,C1)),x),x))),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),Not(IGtQ(p,C0)),NeQ(p,CN1)))),
IIntegrate(5988,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(x_,-1),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),-1)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(p,C1)),Power(Times(b,d,Plus(p,C1)),-1)),x),Dist(Power(d,-1),Int(Times(Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p),Power(Times(x,Plus(C1,Times(c,x))),-1)),x),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),GtQ(p,C0)))),
IIntegrate(5989,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(x_,-1),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),-1)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(p,C1)),Power(Times(b,d,Plus(p,C1)),-1)),x),Dist(Power(d,-1),Int(Times(Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p),Power(Times(x,Plus(C1,Times(c,x))),-1)),x),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),GtQ(p,C0)))),
IIntegrate(5990,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_),Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),-1)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(f,x),m),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(p,C1)),Power(Times(b,c,d,Plus(p,C1)),-1)),x),Negate(Dist(Times(f,m,Power(Times(b,c,d,Plus(p,C1)),-1)),Int(Times(Power(Times(f,x),Plus(m,Negate(C1))),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(p,C1))),x),x))),And(FreeQ(List(a,b,c,d,e,f,m),x),EqQ(Plus(Times(Sqr(c),d),e),C0),LtQ(p,CN1)))),
IIntegrate(5991,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_),Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),-1)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(f,x),m),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(p,C1)),Power(Times(b,c,d,Plus(p,C1)),-1)),x),Negate(Dist(Times(f,m,Power(Times(b,c,d,Plus(p,C1)),-1)),Int(Times(Power(Times(f,x),Plus(m,Negate(C1))),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(p,C1))),x),x))),And(FreeQ(List(a,b,c,d,e,f,m),x),EqQ(Plus(Times(Sqr(c),d),e),C0),LtQ(p,CN1)))),
IIntegrate(5992,Int(Times(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(x_,m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),-1)),x_Symbol),
    Condition(Int(ExpandIntegrand(Plus(a,Times(b,ArcTanh(Times(c,x)))),Times(Power(x,m),Power(Plus(d,Times(e,Sqr(x))),-1)),x),x),And(FreeQ(List(a,b,c,d,e),x),IntegerQ(m),Not(And(EqQ(m,C1),NeQ(a,C0)))))),
IIntegrate(5993,Int(Times(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(x_,m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),-1)),x_Symbol),
    Condition(Int(ExpandIntegrand(Plus(a,Times(b,ArcCoth(Times(c,x)))),Times(Power(x,m),Power(Plus(d,Times(e,Sqr(x))),-1)),x),x),And(FreeQ(List(a,b,c,d,e),x),IntegerQ(m),Not(And(EqQ(m,C1),NeQ(a,C0)))))),
IIntegrate(5994,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),x_,Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p),Power(Times(C2,e,Plus(q,C1)),-1)),x),Dist(Times(b,p,Power(Times(C2,c,Plus(q,C1)),-1)),Int(Times(Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(p,Negate(C1)))),x),x)),And(FreeQ(List(a,b,c,d,e,q),x),EqQ(Plus(Times(Sqr(c),d),e),C0),GtQ(p,C0),NeQ(q,CN1)))),
IIntegrate(5995,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),x_,Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p),Power(Times(C2,e,Plus(q,C1)),-1)),x),Dist(Times(b,p,Power(Times(C2,c,Plus(q,C1)),-1)),Int(Times(Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(p,Negate(C1)))),x),x)),And(FreeQ(List(a,b,c,d,e,q),x),EqQ(Plus(Times(Sqr(c),d),e),C0),GtQ(p,C0),NeQ(q,CN1)))),
IIntegrate(5996,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_),x_,Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),-2)),x_Symbol),
    Condition(Plus(Simp(Times(x,Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(p,C1)),Power(Times(b,c,d,Plus(p,C1),Plus(d,Times(e,Sqr(x)))),-1)),x),Dist(Times(C4,Power(Times(Sqr(b),Plus(p,C1),Plus(p,C2)),-1)),Int(Times(x,Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(p,C2)),Power(Plus(d,Times(e,Sqr(x))),-2)),x),x),Simp(Times(Plus(C1,Times(Sqr(c),Sqr(x))),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(p,C2)),Power(Times(Sqr(b),e,Plus(p,C1),Plus(p,C2),Plus(d,Times(e,Sqr(x)))),-1)),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),LtQ(p,CN1),NeQ(p,CN2)))),
IIntegrate(5997,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_),x_,Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),-2)),x_Symbol),
    Condition(Plus(Simp(Times(x,Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(p,C1)),Power(Times(b,c,d,Plus(p,C1),Plus(d,Times(e,Sqr(x)))),-1)),x),Dist(Times(C4,Power(Times(Sqr(b),Plus(p,C1),Plus(p,C2)),-1)),Int(Times(x,Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(p,C2)),Power(Plus(d,Times(e,Sqr(x))),-2)),x),x),Simp(Times(Plus(C1,Times(Sqr(c),Sqr(x))),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(p,C2)),Power(Times(Sqr(b),e,Plus(p,C1),Plus(p,C2),Plus(d,Times(e,Sqr(x)))),-1)),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),LtQ(p,CN1),NeQ(p,CN2)))),
IIntegrate(5998,Int(Times(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),Sqr(x_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Times(C4,Power(c,3),d,Sqr(Plus(q,C1))),-1)),x)),Dist(Power(Times(C2,Sqr(c),d,Plus(q,C1)),-1),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Plus(a,Times(b,ArcTanh(Times(c,x))))),x),x),Negate(Simp(Times(x,Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Plus(a,Times(b,ArcTanh(Times(c,x)))),Power(Times(C2,Sqr(c),d,Plus(q,C1)),-1)),x))),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),LtQ(q,CN1),NeQ(q,QQ(-5L,2L))))),
IIntegrate(5999,Int(Times(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),Sqr(x_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Times(C4,Power(c,3),d,Sqr(Plus(q,C1))),-1)),x)),Dist(Power(Times(C2,Sqr(c),d,Plus(q,C1)),-1),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Plus(a,Times(b,ArcCoth(Times(c,x))))),x),x),Negate(Simp(Times(x,Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Plus(a,Times(b,ArcCoth(Times(c,x)))),Power(Times(C2,Sqr(c),d,Plus(q,C1)),-1)),x))),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),LtQ(q,CN1),NeQ(q,QQ(-5L,2L))))),
IIntegrate(6000,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Sqr(x_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),-2)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(p,C1)),Power(Times(C2,b,Power(c,3),Sqr(d),Plus(p,C1)),-1)),x)),Negate(Dist(Times(b,p,Power(Times(C2,c),-1)),Int(Times(x,Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(p,Negate(C1))),Power(Plus(d,Times(e,Sqr(x))),-2)),x),x)),Simp(Times(x,Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p),Power(Times(C2,Sqr(c),d,Plus(d,Times(e,Sqr(x)))),-1)),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),GtQ(p,C0))))
  );
}
