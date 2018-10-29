package org.matheclipse.core.integrate.rubi;


import org.matheclipse.core.interfaces.IAST;

import static org.matheclipse.core.expression.F.$p;
import static org.matheclipse.core.expression.F.$s;
import static org.matheclipse.core.expression.F.And;
import static org.matheclipse.core.expression.F.ArcCos;
import static org.matheclipse.core.expression.F.ArcSin;
import static org.matheclipse.core.expression.F.C0;
import static org.matheclipse.core.expression.F.C1;
import static org.matheclipse.core.expression.F.C1D2;
import static org.matheclipse.core.expression.F.C2;
import static org.matheclipse.core.expression.F.C3;
import static org.matheclipse.core.expression.F.CN1;
import static org.matheclipse.core.expression.F.CN1D2;
import static org.matheclipse.core.expression.F.CN2;
import static org.matheclipse.core.expression.F.Condition;
import static org.matheclipse.core.expression.F.Cos;
import static org.matheclipse.core.expression.F.Equal;
import static org.matheclipse.core.expression.F.FreeQ;
import static org.matheclipse.core.expression.F.Greater;
import static org.matheclipse.core.expression.F.IIntegrate;
import static org.matheclipse.core.expression.F.IntegerQ;
import static org.matheclipse.core.expression.F.Less;
import static org.matheclipse.core.expression.F.List;
import static org.matheclipse.core.expression.F.Log;
import static org.matheclipse.core.expression.F.Negate;
import static org.matheclipse.core.expression.F.Not;
import static org.matheclipse.core.expression.F.Or;
import static org.matheclipse.core.expression.F.Plus;
import static org.matheclipse.core.expression.F.PolynomialQ;
import static org.matheclipse.core.expression.F.Power;
import static org.matheclipse.core.expression.F.Set;
import static org.matheclipse.core.expression.F.Sin;
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
import static org.matheclipse.core.expression.F.h;
import static org.matheclipse.core.expression.F.h_DEFAULT;
import static org.matheclipse.core.expression.F.m;
import static org.matheclipse.core.expression.F.m_;
import static org.matheclipse.core.expression.F.m_DEFAULT;
import static org.matheclipse.core.expression.F.n;
import static org.matheclipse.core.expression.F.n_;
import static org.matheclipse.core.expression.F.n_DEFAULT;
import static org.matheclipse.core.expression.F.p;
import static org.matheclipse.core.expression.F.p_;
import static org.matheclipse.core.expression.F.p_DEFAULT;
import static org.matheclipse.core.expression.F.u;
import static org.matheclipse.core.expression.F.u_;
import static org.matheclipse.core.expression.F.v;
import static org.matheclipse.core.expression.F.x;
import static org.matheclipse.core.expression.F.x_;
import static org.matheclipse.core.expression.F.x_Symbol;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Dist;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.EqQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.ExpandIntegrand;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.FracPart;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.GtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.IGtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.ILtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Int;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.IntHide;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.IntPart;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.IntegersQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.InverseFunctionFreeQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.LtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.RationalFunctionQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Simp;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.SimplifyIntegrand;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Subst;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.SumQ;

/** 
 * IndefiniteIntegrationRules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class IntRules95 { 
  public static IAST RULES = List( 
IIntegrate(4751,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT)),n_),$p("§px")),x_Symbol),
    Condition(Int(ExpandIntegrand(Times($s("§px"),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),n)),x),x),And(FreeQ(List(a,b,c,n),x),PolynomialQ($s("§px"),x)))),
IIntegrate(4752,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT)),n_),$p("§px")),x_Symbol),
    Condition(Int(ExpandIntegrand(Times($s("§px"),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),n)),x),x),And(FreeQ(List(a,b,c,n),x),PolynomialQ($s("§px"),x)))),
IIntegrate(4753,Int(Times(Plus(a_DEFAULT,Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT)),$p("§px"),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Times($s("§px"),Power(Plus(d,Times(e,x)),m)),x))),Plus(Dist(Plus(a,Times(b,ArcSin(Times(c,x)))),u,x),Negate(Dist(Times(b,c),Int(SimplifyIntegrand(Times(u,Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),CN1D2)),x),x),x)))),And(FreeQ(List(a,b,c,d,e,m),x),PolynomialQ($s("§px"),x)))),
IIntegrate(4754,Int(Times(Plus(a_DEFAULT,Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT)),$p("§px"),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Times($s("§px"),Power(Plus(d,Times(e,x)),m)),x))),Plus(Dist(Plus(a,Times(b,ArcCos(Times(c,x)))),u,x),Dist(Times(b,c),Int(SimplifyIntegrand(Times(u,Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),CN1D2)),x),x),x))),And(FreeQ(List(a,b,c,d,e,m),x),PolynomialQ($s("§px"),x)))),
IIntegrate(4755,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT)),n_),Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_)),p_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Times(Power(Plus(f,Times(g,x)),p),Power(Plus(d,Times(e,x)),m)),x))),Plus(Dist(Power(Plus(a,Times(b,ArcSin(Times(c,x)))),n),u,x),Negate(Dist(Times(b,c,n),Int(SimplifyIntegrand(Times(u,Power(Plus(a,Times(b,ArcSin(Times(c,x)))),Plus(n,Negate(C1))),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),CN1D2)),x),x),x)))),And(FreeQ(List(a,b,c,d,e,f,g),x),IGtQ(n,C0),IGtQ(p,C0),ILtQ(m,C0),LtQ(Plus(m,p,C1),C0)))),
IIntegrate(4756,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT)),n_),Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_)),p_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Times(Power(Plus(f,Times(g,x)),p),Power(Plus(d,Times(e,x)),m)),x))),Plus(Dist(Power(Plus(a,Times(b,ArcCos(Times(c,x)))),n),u,x),Dist(Times(b,c,n),Int(SimplifyIntegrand(Times(u,Power(Plus(a,Times(b,ArcCos(Times(c,x)))),Plus(n,Negate(C1))),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),CN1D2)),x),x),x))),And(FreeQ(List(a,b,c,d,e,f,g),x),IGtQ(n,C0),IGtQ(p,C0),ILtQ(m,C0),LtQ(Plus(m,p,C1),C0)))),
IIntegrate(4757,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT)),n_),Power(Plus(d_,Times(e_DEFAULT,x_)),-2),Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_),Times(h_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Times(Power(Plus(f,Times(g,x),Times(h,Sqr(x))),p),Power(Plus(d,Times(e,x)),-2)),x))),Plus(Dist(Power(Plus(a,Times(b,ArcSin(Times(c,x)))),n),u,x),Negate(Dist(Times(b,c,n),Int(SimplifyIntegrand(Times(u,Power(Plus(a,Times(b,ArcSin(Times(c,x)))),Plus(n,Negate(C1))),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),CN1D2)),x),x),x)))),And(FreeQ(List(a,b,c,d,e,f,g,h),x),IGtQ(n,C0),IGtQ(p,C0),EqQ(Plus(Times(e,g),Times(CN1,C2,d,h)),C0)))),
IIntegrate(4758,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT)),n_),Power(Plus(d_,Times(e_DEFAULT,x_)),-2),Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_),Times(h_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Times(Power(Plus(f,Times(g,x),Times(h,Sqr(x))),p),Power(Plus(d,Times(e,x)),-2)),x))),Plus(Dist(Power(Plus(a,Times(b,ArcCos(Times(c,x)))),n),u,x),Dist(Times(b,c,n),Int(SimplifyIntegrand(Times(u,Power(Plus(a,Times(b,ArcCos(Times(c,x)))),Plus(n,Negate(C1))),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),CN1D2)),x),x),x))),And(FreeQ(List(a,b,c,d,e,f,g,h),x),IGtQ(n,C0),IGtQ(p,C0),EqQ(Plus(Times(e,g),Times(CN1,C2,d,h)),C0)))),
IIntegrate(4759,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT)),n_),$p("§px"),Power(Plus(d_,Times(e_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times($s("§px"),Power(Plus(d,Times(e,x)),m),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),n)),x),x),And(FreeQ(List(a,b,c,d,e),x),PolynomialQ($s("§px"),x),IGtQ(n,C0),IntegerQ(m)))),
IIntegrate(4760,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT)),n_),$p("§px"),Power(Plus(d_,Times(e_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times($s("§px"),Power(Plus(d,Times(e,x)),m),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),n)),x),x),And(FreeQ(List(a,b,c,d,e),x),PolynomialQ($s("§px"),x),IGtQ(n,C0),IntegerQ(m)))),
IIntegrate(4761,Int(Times(Plus(a_DEFAULT,Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Plus(f_,Times(g_DEFAULT,x_)),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Times(Power(Plus(f,Times(g,x)),m),Power(Plus(d,Times(e,Sqr(x))),p)),x))),Plus(Dist(Plus(a,Times(b,ArcSin(Times(c,x)))),u,x),Negate(Dist(Times(b,c),Int(Dist(Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),CN1D2),u,x),x),x)))),And(FreeQ(List(a,b,c,d,e,f,g),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IGtQ(m,C0),ILtQ(Plus(p,C1D2),C0),GtQ(d,C0),Or(LtQ(m,Plus(Times(CN2,p),Negate(C1))),GtQ(m,C3))))),
IIntegrate(4762,Int(Times(Plus(a_DEFAULT,Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Plus(f_,Times(g_DEFAULT,x_)),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Times(Power(Plus(f,Times(g,x)),m),Power(Plus(d,Times(e,Sqr(x))),p)),x))),Plus(Dist(Plus(a,Times(b,ArcCos(Times(c,x)))),u,x),Dist(Times(b,c),Int(Dist(Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),CN1D2),u,x),x),x))),And(FreeQ(List(a,b,c,d,e,f,g),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IGtQ(m,C0),ILtQ(Plus(p,C1D2),C0),GtQ(d,C0),Or(LtQ(m,Plus(Times(CN2,p),Negate(C1))),GtQ(m,C3))))),
IIntegrate(4763,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,x_)),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(d,Times(e,Sqr(x))),p),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),n)),Power(Plus(f,Times(g,x)),m),x),x),And(FreeQ(List(a,b,c,d,e,f,g),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IGtQ(m,C0),IntegerQ(Plus(p,C1D2)),GtQ(d,C0),IGtQ(n,C0),Or(Equal(m,C1),Greater(p,C0),And(Equal(n,C1),Greater(p,CN1)),And(Equal(m,C2),Less(p,CN2)))))),
IIntegrate(4764,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,x_)),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(d,Times(e,Sqr(x))),p),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),n)),Power(Plus(f,Times(g,x)),m),x),x),And(FreeQ(List(a,b,c,d,e,f,g),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IGtQ(m,C0),IntegerQ(Plus(p,C1D2)),GtQ(d,C0),IGtQ(n,C0),Or(Equal(m,C1),Greater(p,C0),And(Equal(n,C1),Greater(p,CN1)),And(Equal(m,C2),Less(p,CN2)))))),
IIntegrate(4765,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,x_)),m_),Sqrt(Plus(d_,Times(e_DEFAULT,Sqr(x_))))),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(f,Times(g,x)),m),Plus(d,Times(e,Sqr(x))),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),Plus(n,C1)),Power(Times(b,c,Sqrt(d),Plus(n,C1)),-1)),x),Negate(Dist(Power(Times(b,c,Sqrt(d),Plus(n,C1)),-1),Int(Times(Plus(Times(d,g,m),Times(C2,e,f,x),Times(e,g,Plus(m,C2),Sqr(x))),Power(Plus(f,Times(g,x)),Plus(m,Negate(C1))),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),Plus(n,C1))),x),x))),And(FreeQ(List(a,b,c,d,e,f,g),x),EqQ(Plus(Times(Sqr(c),d),e),C0),ILtQ(m,C0),GtQ(d,C0),IGtQ(n,C0)))),
IIntegrate(4766,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,x_)),m_),Sqrt(Plus(d_,Times(e_DEFAULT,Sqr(x_))))),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Plus(f,Times(g,x)),m),Plus(d,Times(e,Sqr(x))),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),Plus(n,C1)),Power(Times(b,c,Sqrt(d),Plus(n,C1)),-1)),x)),Dist(Power(Times(b,c,Sqrt(d),Plus(n,C1)),-1),Int(Times(Plus(Times(d,g,m),Times(C2,e,f,x),Times(e,g,Plus(m,C2),Sqr(x))),Power(Plus(f,Times(g,x)),Plus(m,Negate(C1))),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),Plus(n,C1))),x),x)),And(FreeQ(List(a,b,c,d,e,f,g),x),EqQ(Plus(Times(Sqr(c),d),e),C0),ILtQ(m,C0),GtQ(d,C0),IGtQ(n,C0)))),
IIntegrate(4767,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,x_)),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Sqrt(Plus(d,Times(e,Sqr(x)))),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),n)),Times(Power(Plus(f,Times(g,x)),m),Power(Plus(d,Times(e,Sqr(x))),Plus(p,Negate(C1D2)))),x),x),And(FreeQ(List(a,b,c,d,e,f,g),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IntegerQ(m),IGtQ(Plus(p,C1D2),C0),GtQ(d,C0),IGtQ(n,C0)))),
IIntegrate(4768,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,x_)),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Sqrt(Plus(d,Times(e,Sqr(x)))),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),n)),Times(Power(Plus(f,Times(g,x)),m),Power(Plus(d,Times(e,Sqr(x))),Plus(p,Negate(C1D2)))),x),x),And(FreeQ(List(a,b,c,d,e,f,g),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IntegerQ(m),IGtQ(Plus(p,C1D2),C0),GtQ(d,C0),IGtQ(n,C0)))),
IIntegrate(4769,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,x_)),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(f,Times(g,x)),m),Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1D2)),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),Plus(n,C1)),Power(Times(b,c,Sqrt(d),Plus(n,C1)),-1)),x),Negate(Dist(Power(Times(b,c,Sqrt(d),Plus(n,C1)),-1),Int(ExpandIntegrand(Times(Power(Plus(f,Times(g,x)),Plus(m,Negate(C1))),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),Plus(n,C1))),Times(Plus(Times(d,g,m),Times(e,f,Plus(Times(C2,p),C1),x),Times(e,g,Plus(m,Times(C2,p),C1),Sqr(x))),Power(Plus(d,Times(e,Sqr(x))),Plus(p,Negate(C1D2)))),x),x),x))),And(FreeQ(List(a,b,c,d,e,f,g),x),EqQ(Plus(Times(Sqr(c),d),e),C0),ILtQ(m,C0),IGtQ(Plus(p,Negate(C1D2)),C0),GtQ(d,C0),IGtQ(n,C0)))),
IIntegrate(4770,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,x_)),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Plus(f,Times(g,x)),m),Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1D2)),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),Plus(n,C1)),Power(Times(b,c,Sqrt(d),Plus(n,C1)),-1)),x)),Dist(Power(Times(b,c,Sqrt(d),Plus(n,C1)),-1),Int(ExpandIntegrand(Times(Power(Plus(f,Times(g,x)),Plus(m,Negate(C1))),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),Plus(n,C1))),Times(Plus(Times(d,g,m),Times(e,f,Plus(Times(C2,p),C1),x),Times(e,g,Plus(m,Times(C2,p),C1),Sqr(x))),Power(Plus(d,Times(e,Sqr(x))),Plus(p,Negate(C1D2)))),x),x),x)),And(FreeQ(List(a,b,c,d,e,f,g),x),EqQ(Plus(Times(Sqr(c),d),e),C0),ILtQ(m,C0),IGtQ(Plus(p,Negate(C1D2)),C0),GtQ(d,C0),IGtQ(n,C0)))),
IIntegrate(4771,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT)),n_),Power(Plus(f_,Times(g_DEFAULT,x_)),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(f,Times(g,x)),m),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),Plus(n,C1)),Power(Times(b,c,Sqrt(d),Plus(n,C1)),-1)),x),Negate(Dist(Times(g,m,Power(Times(b,c,Sqrt(d),Plus(n,C1)),-1)),Int(Times(Power(Plus(f,Times(g,x)),Plus(m,Negate(C1))),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),Plus(n,C1))),x),x))),And(FreeQ(List(a,b,c,d,e,f,g),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IGtQ(m,C0),GtQ(d,C0),LtQ(n,CN1)))),
IIntegrate(4772,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT)),n_),Power(Plus(f_,Times(g_DEFAULT,x_)),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Plus(f,Times(g,x)),m),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),Plus(n,C1)),Power(Times(b,c,Sqrt(d),Plus(n,C1)),-1)),x)),Dist(Times(g,m,Power(Times(b,c,Sqrt(d),Plus(n,C1)),-1)),Int(Times(Power(Plus(f,Times(g,x)),Plus(m,Negate(C1))),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),Plus(n,C1))),x),x)),And(FreeQ(List(a,b,c,d,e,f,g),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IGtQ(m,C0),GtQ(d,C0),LtQ(n,CN1)))),
IIntegrate(4773,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,x_)),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Dist(Power(Times(Power(c,Plus(m,C1)),Sqrt(d)),-1),Subst(Int(Times(Power(Plus(a,Times(b,x)),n),Power(Plus(Times(c,f),Times(g,Sin(x))),m)),x),x,ArcSin(Times(c,x))),x),And(FreeQ(List(a,b,c,d,e,f,g,n),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IntegerQ(m),GtQ(d,C0),Or(GtQ(m,C0),IGtQ(n,C0))))),
IIntegrate(4774,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,x_)),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Negate(Dist(Power(Times(Power(c,Plus(m,C1)),Sqrt(d)),-1),Subst(Int(Times(Power(Plus(a,Times(b,x)),n),Power(Plus(Times(c,f),Times(g,Cos(x))),m)),x),x,ArcCos(Times(c,x))),x)),And(FreeQ(List(a,b,c,d,e,f,g,n),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IntegerQ(m),GtQ(d,C0),Or(GtQ(m,C0),IGtQ(n,C0))))),
IIntegrate(4775,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,x_)),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(a,Times(b,ArcSin(Times(c,x)))),n),Power(Plus(d,Times(e,Sqr(x))),CN1D2)),Times(Power(Plus(f,Times(g,x)),m),Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1D2))),x),x),And(FreeQ(List(a,b,c,d,e,f,g),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IntegerQ(m),ILtQ(Plus(p,C1D2),C0),GtQ(d,C0),IGtQ(n,C0)))),
IIntegrate(4776,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,x_)),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(a,Times(b,ArcCos(Times(c,x)))),n),Power(Plus(d,Times(e,Sqr(x))),CN1D2)),Times(Power(Plus(f,Times(g,x)),m),Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1D2))),x),x),And(FreeQ(List(a,b,c,d,e,f,g),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IntegerQ(m),ILtQ(Plus(p,C1D2),C0),GtQ(d,C0),IGtQ(n,C0)))),
IIntegrate(4777,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,x_)),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Dist(Times(Power(d,IntPart(p)),Power(Plus(d,Times(e,Sqr(x))),FracPart(p)),Power(Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),FracPart(p)),-1)),Int(Times(Power(Plus(f,Times(g,x)),m),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),p),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),n)),x),x),And(FreeQ(List(a,b,c,d,e,f,g,n),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IntegerQ(m),IntegerQ(Plus(p,Negate(C1D2))),Not(GtQ(d,C0))))),
IIntegrate(4778,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,x_)),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Dist(Times(Power(d,IntPart(p)),Power(Plus(d,Times(e,Sqr(x))),FracPart(p)),Power(Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),FracPart(p)),-1)),Int(Times(Power(Plus(f,Times(g,x)),m),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),p),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),n)),x),x),And(FreeQ(List(a,b,c,d,e,f,g,n),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IntegerQ(m),IntegerQ(Plus(p,Negate(C1D2))),Not(GtQ(d,C0))))),
IIntegrate(4779,Int(Times(Log(Times(h_DEFAULT,Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_)),m_DEFAULT))),Power(Plus(a_DEFAULT,Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Plus(Simp(Times(Log(Times(h,Power(Plus(f,Times(g,x)),m))),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),Plus(n,C1)),Power(Times(b,c,Sqrt(d),Plus(n,C1)),-1)),x),Negate(Dist(Times(g,m,Power(Times(b,c,Sqrt(d),Plus(n,C1)),-1)),Int(Times(Power(Plus(a,Times(b,ArcSin(Times(c,x)))),Plus(n,C1)),Power(Plus(f,Times(g,x)),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f,g,h,m),x),EqQ(Plus(Times(Sqr(c),d),e),C0),GtQ(d,C0),IGtQ(n,C0)))),
IIntegrate(4780,Int(Times(Log(Times(h_DEFAULT,Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_)),m_DEFAULT))),Power(Plus(a_DEFAULT,Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Log(Times(h,Power(Plus(f,Times(g,x)),m))),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),Plus(n,C1)),Power(Times(b,c,Sqrt(d),Plus(n,C1)),-1)),x)),Dist(Times(g,m,Power(Times(b,c,Sqrt(d),Plus(n,C1)),-1)),Int(Times(Power(Plus(a,Times(b,ArcCos(Times(c,x)))),Plus(n,C1)),Power(Plus(f,Times(g,x)),-1)),x),x)),And(FreeQ(List(a,b,c,d,e,f,g,h,m),x),EqQ(Plus(Times(Sqr(c),d),e),C0),GtQ(d,C0),IGtQ(n,C0)))),
IIntegrate(4781,Int(Times(Log(Times(h_DEFAULT,Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_)),m_DEFAULT))),Power(Plus(a_DEFAULT,Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Dist(Times(Power(d,IntPart(p)),Power(Plus(d,Times(e,Sqr(x))),FracPart(p)),Power(Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),FracPart(p)),-1)),Int(Times(Log(Times(h,Power(Plus(f,Times(g,x)),m))),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),p),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),n)),x),x),And(FreeQ(List(a,b,c,d,e,f,g,h,m,n),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IntegerQ(Plus(p,Negate(C1D2))),Not(GtQ(d,C0))))),
IIntegrate(4782,Int(Times(Log(Times(h_DEFAULT,Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_)),m_DEFAULT))),Power(Plus(a_DEFAULT,Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Dist(Times(Power(d,IntPart(p)),Power(Plus(d,Times(e,Sqr(x))),FracPart(p)),Power(Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),FracPart(p)),-1)),Int(Times(Log(Times(h,Power(Plus(f,Times(g,x)),m))),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),p),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),n)),x),x),And(FreeQ(List(a,b,c,d,e,f,g,h,m,n),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IntegerQ(Plus(p,Negate(C1D2))),Not(GtQ(d,C0))))),
IIntegrate(4783,Int(Times(Plus(a_DEFAULT,Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Power(Plus(f_,Times(g_DEFAULT,x_)),m_)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Times(Power(Plus(d,Times(e,x)),m),Power(Plus(f,Times(g,x)),m)),x))),Plus(Dist(Plus(a,Times(b,ArcSin(Times(c,x)))),u,x),Negate(Dist(Times(b,c),Int(Dist(Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),CN1D2),u,x),x),x)))),And(FreeQ(List(a,b,c,d,e,f,g),x),ILtQ(Plus(m,C1D2),C0)))),
IIntegrate(4784,Int(Times(Plus(a_DEFAULT,Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Power(Plus(f_,Times(g_DEFAULT,x_)),m_)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Times(Power(Plus(d,Times(e,x)),m),Power(Plus(f,Times(g,x)),m)),x))),Plus(Dist(Plus(a,Times(b,ArcCos(Times(c,x)))),u,x),Dist(Times(b,c),Int(Dist(Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),CN1D2),u,x),x),x))),And(FreeQ(List(a,b,c,d,e,f,g),x),ILtQ(Plus(m,C1D2),C0)))),
IIntegrate(4785,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,x_)),m_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(d,Times(e,x)),m),Power(Plus(f,Times(g,x)),m),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),n)),x),x),And(FreeQ(List(a,b,c,d,e,f,g,n),x),IntegerQ(m)))),
IIntegrate(4786,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,x_)),m_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(d,Times(e,x)),m),Power(Plus(f,Times(g,x)),m),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),n)),x),x),And(FreeQ(List(a,b,c,d,e,f,g,n),x),IntegerQ(m)))),
IIntegrate(4787,Int(Times(Plus(a_DEFAULT,Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT)),u_),x_Symbol),
    Condition(With(List(Set(v,IntHide(u,x))),Condition(Plus(Dist(Plus(a,Times(b,ArcSin(Times(c,x)))),v,x),Negate(Dist(Times(b,c),Int(SimplifyIntegrand(Times(v,Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),CN1D2)),x),x),x))),InverseFunctionFreeQ(v,x))),FreeQ(List(a,b,c),x))),
IIntegrate(4788,Int(Times(Plus(a_DEFAULT,Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT)),u_),x_Symbol),
    Condition(With(List(Set(v,IntHide(u,x))),Condition(Plus(Dist(Plus(a,Times(b,ArcCos(Times(c,x)))),v,x),Dist(Times(b,c),Int(SimplifyIntegrand(Times(v,Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),CN1D2)),x),x),x)),InverseFunctionFreeQ(v,x))),FreeQ(List(a,b,c),x))),
IIntegrate(4789,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),$p("§px"),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(With(List(Set(u,ExpandIntegrand(Times($s("§px"),Power(Plus(d,Times(e,Sqr(x))),p),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),n)),x))),Condition(Int(u,x),SumQ(u))),And(FreeQ(List(a,b,c,d,e,n),x),PolynomialQ($s("§px"),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IntegerQ(Plus(p,Negate(C1D2)))))),
IIntegrate(4790,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),$p("§px"),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(With(List(Set(u,ExpandIntegrand(Times($s("§px"),Power(Plus(d,Times(e,Sqr(x))),p),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),n)),x))),Condition(Int(u,x),SumQ(u))),And(FreeQ(List(a,b,c,d,e,n),x),PolynomialQ($s("§px"),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IntegerQ(Plus(p,Negate(C1D2)))))),
IIntegrate(4791,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),$p("§px",true),Power(Plus(f_,Times(g_DEFAULT,Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_))),m_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,ExpandIntegrand(Times($s("§px"),Power(Plus(f,Times(g,Power(Plus(d,Times(e,Sqr(x))),p))),m),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),n)),x))),Condition(Int(u,x),SumQ(u))),And(FreeQ(List(a,b,c,d,e,f,g),x),PolynomialQ($s("§px"),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IGtQ(Plus(p,C1D2),C0),IntegersQ(m,n)))),
IIntegrate(4792,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),$p("§px",true),Power(Plus(f_,Times(g_DEFAULT,Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_))),m_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,ExpandIntegrand(Times($s("§px"),Power(Plus(f,Times(g,Power(Plus(d,Times(e,Sqr(x))),p))),m),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),n)),x))),Condition(Int(u,x),SumQ(u))),And(FreeQ(List(a,b,c,d,e,f,g),x),PolynomialQ($s("§px"),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IGtQ(Plus(p,C1D2),C0),IntegersQ(m,n)))),
IIntegrate(4793,Int(Times(Power(ArcSin(Times(c_DEFAULT,x_)),n_DEFAULT),$p("§rfx")),x_Symbol),
    Condition(With(List(Set(u,ExpandIntegrand(Power(ArcSin(Times(c,x)),n),$s("§rfx"),x))),Condition(Int(u,x),SumQ(u))),And(FreeQ(c,x),RationalFunctionQ($s("§rfx"),x),IGtQ(n,C0)))),
IIntegrate(4794,Int(Times(Power(ArcCos(Times(c_DEFAULT,x_)),n_DEFAULT),$p("§rfx")),x_Symbol),
    Condition(With(List(Set(u,ExpandIntegrand(Power(ArcCos(Times(c,x)),n),$s("§rfx"),x))),Condition(Int(u,x),SumQ(u))),And(FreeQ(c,x),RationalFunctionQ($s("§rfx"),x),IGtQ(n,C0)))),
IIntegrate(4795,Int(Times(Power(Plus(Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT),a_),n_DEFAULT),$p("§rfx")),x_Symbol),
    Condition(Int(ExpandIntegrand(Times($s("§rfx"),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),n)),x),x),And(FreeQ(List(a,b,c),x),RationalFunctionQ($s("§rfx"),x),IGtQ(n,C0)))),
IIntegrate(4796,Int(Times(Power(Plus(Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT),a_),n_DEFAULT),$p("§rfx")),x_Symbol),
    Condition(Int(ExpandIntegrand(Times($s("§rfx"),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),n)),x),x),And(FreeQ(List(a,b,c),x),RationalFunctionQ($s("§rfx"),x),IGtQ(n,C0)))),
IIntegrate(4797,Int(Times(Power(ArcSin(Times(c_DEFAULT,x_)),n_DEFAULT),$p("§rfx"),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(With(List(Set(u,ExpandIntegrand(Times(Power(Plus(d,Times(e,Sqr(x))),p),Power(ArcSin(Times(c,x)),n)),$s("§rfx"),x))),Condition(Int(u,x),SumQ(u))),And(FreeQ(List(c,d,e),x),RationalFunctionQ($s("§rfx"),x),IGtQ(n,C0),EqQ(Plus(Times(Sqr(c),d),e),C0),IntegerQ(Plus(p,Negate(C1D2)))))),
IIntegrate(4798,Int(Times(Power(ArcCos(Times(c_DEFAULT,x_)),n_DEFAULT),$p("§rfx"),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(With(List(Set(u,ExpandIntegrand(Times(Power(Plus(d,Times(e,Sqr(x))),p),Power(ArcCos(Times(c,x)),n)),$s("§rfx"),x))),Condition(Int(u,x),SumQ(u))),And(FreeQ(List(c,d,e),x),RationalFunctionQ($s("§rfx"),x),IGtQ(n,C0),EqQ(Plus(Times(Sqr(c),d),e),C0),IntegerQ(Plus(p,Negate(C1D2)))))),
IIntegrate(4799,Int(Times(Power(Plus(Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT),a_),n_DEFAULT),$p("§rfx"),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Int(ExpandIntegrand(Power(Plus(d,Times(e,Sqr(x))),p),Times($s("§rfx"),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),n)),x),x),And(FreeQ(List(a,b,c,d,e),x),RationalFunctionQ($s("§rfx"),x),IGtQ(n,C0),EqQ(Plus(Times(Sqr(c),d),e),C0),IntegerQ(Plus(p,Negate(C1D2)))))),
IIntegrate(4800,Int(Times(Power(Plus(Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT),a_),n_DEFAULT),$p("§rfx"),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Int(ExpandIntegrand(Power(Plus(d,Times(e,Sqr(x))),p),Times($s("§rfx"),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),n)),x),x),And(FreeQ(List(a,b,c,d,e),x),RationalFunctionQ($s("§rfx"),x),IGtQ(n,C0),EqQ(Plus(Times(Sqr(c),d),e),C0),IntegerQ(Plus(p,Negate(C1D2))))))
  );
}
