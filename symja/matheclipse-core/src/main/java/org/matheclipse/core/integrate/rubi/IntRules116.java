package org.matheclipse.core.integrate.rubi;


import org.matheclipse.core.interfaces.IAST;

import static org.matheclipse.core.expression.F.$p;
import static org.matheclipse.core.expression.F.$s;
import static org.matheclipse.core.expression.F.And;
import static org.matheclipse.core.expression.F.ArcCosh;
import static org.matheclipse.core.expression.F.ArcSinh;
import static org.matheclipse.core.expression.F.C0;
import static org.matheclipse.core.expression.F.C1;
import static org.matheclipse.core.expression.F.C1D2;
import static org.matheclipse.core.expression.F.C2;
import static org.matheclipse.core.expression.F.C3;
import static org.matheclipse.core.expression.F.CN1;
import static org.matheclipse.core.expression.F.CN1D2;
import static org.matheclipse.core.expression.F.CN2;
import static org.matheclipse.core.expression.F.Condition;
import static org.matheclipse.core.expression.F.Cosh;
import static org.matheclipse.core.expression.F.FreeQ;
import static org.matheclipse.core.expression.F.IIntegrate;
import static org.matheclipse.core.expression.F.IntegerQ;
import static org.matheclipse.core.expression.F.List;
import static org.matheclipse.core.expression.F.Log;
import static org.matheclipse.core.expression.F.Negate;
import static org.matheclipse.core.expression.F.Not;
import static org.matheclipse.core.expression.F.Or;
import static org.matheclipse.core.expression.F.Plus;
import static org.matheclipse.core.expression.F.PolynomialQ;
import static org.matheclipse.core.expression.F.Power;
import static org.matheclipse.core.expression.F.Set;
import static org.matheclipse.core.expression.F.Sinh;
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
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.ExpandExpression;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.ExpandIntegrand;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.FracPart;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.GtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.IGtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.ILtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Int;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.IntHide;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.IntPart;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.InverseFunctionFreeQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.LtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.NeQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Simp;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.SimplifyIntegrand;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Subst;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.SumQ;

/** 
 * IndefiniteIntegrationRules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class IntRules116 { 
  public static IAST RULES = List( 
IIntegrate(5801,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSinh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),n),Power(Times(e,Plus(m,C1)),-1)),x),Negate(Dist(Times(b,c,n,Power(Times(e,Plus(m,C1)),-1)),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),Plus(n,Negate(C1))),Power(Plus(C1,Times(Sqr(c),Sqr(x))),CN1D2)),x),x))),And(FreeQ(List(a,b,c,d,e,m),x),IGtQ(n,C0),NeQ(m,CN1)))),
IIntegrate(5802,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCosh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n),Power(Times(e,Plus(m,C1)),-1)),x),Negate(Dist(Times(b,c,n,Power(Times(e,Plus(m,C1)),-1)),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Plus(n,Negate(C1))),Power(Times(Sqrt(Plus(CN1,Times(c,x))),Sqrt(Plus(C1,Times(c,x)))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,m),x),IGtQ(n,C0),NeQ(m,CN1)))),
IIntegrate(5803,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSinh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_),Power(Plus(d_,Times(e_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(d,Times(e,x)),m),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),n)),x),x),And(FreeQ(List(a,b,c,d,e),x),IGtQ(m,C0),LtQ(n,CN1)))),
IIntegrate(5804,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCosh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_),Power(Plus(d_,Times(e_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(d,Times(e,x)),m),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n)),x),x),And(FreeQ(List(a,b,c,d,e),x),IGtQ(m,C0),LtQ(n,CN1)))),
IIntegrate(5805,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSinh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Power(c,Plus(m,C1)),-1),Subst(Int(Times(Power(Plus(a,Times(b,x)),n),Cosh(x),Power(Plus(Times(c,d),Times(e,Sinh(x))),m)),x),x,ArcSinh(Times(c,x))),x),And(FreeQ(List(a,b,c,d,e,n),x),IGtQ(m,C0)))),
IIntegrate(5806,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCosh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Power(c,Plus(m,C1)),-1),Subst(Int(Times(Power(Plus(a,Times(b,x)),n),Power(Plus(Times(c,d),Times(e,Cosh(x))),m),Sinh(x)),x),x,ArcCosh(Times(c,x))),x),And(FreeQ(List(a,b,c,d,e,n),x),IGtQ(m,C0)))),
IIntegrate(5807,Int(Times(Plus(a_DEFAULT,Times(ArcSinh(Times(c_DEFAULT,x_)),b_DEFAULT)),$p("§px")),x_Symbol),
    Condition(With(List(Set(u,IntHide(ExpandExpression($s("§px"),x),x))),Plus(Dist(Plus(a,Times(b,ArcSinh(Times(c,x)))),u,x),Negate(Dist(Times(b,c),Int(SimplifyIntegrand(Times(u,Power(Plus(C1,Times(Sqr(c),Sqr(x))),CN1D2)),x),x),x)))),And(FreeQ(List(a,b,c),x),PolynomialQ($s("§px"),x)))),
IIntegrate(5808,Int(Times(Plus(a_DEFAULT,Times(ArcCosh(Times(c_DEFAULT,x_)),b_DEFAULT)),$p("§px")),x_Symbol),
    Condition(With(List(Set(u,IntHide(ExpandExpression($s("§px"),x),x))),Plus(Dist(Plus(a,Times(b,ArcCosh(Times(c,x)))),u,x),Negate(Dist(Times(b,c,Sqrt(Plus(C1,Times(CN1,Sqr(c),Sqr(x)))),Power(Times(Sqrt(Plus(CN1,Times(c,x))),Sqrt(Plus(C1,Times(c,x)))),-1)),Int(SimplifyIntegrand(Times(u,Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),CN1D2)),x),x),x)))),And(FreeQ(List(a,b,c),x),PolynomialQ($s("§px"),x)))),
IIntegrate(5809,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSinh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_),$p("§px")),x_Symbol),
    Condition(Int(ExpandIntegrand(Times($s("§px"),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),n)),x),x),And(FreeQ(List(a,b,c,n),x),PolynomialQ($s("§px"),x)))),
IIntegrate(5810,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCosh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_),$p("§px")),x_Symbol),
    Condition(Int(ExpandIntegrand(Times($s("§px"),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n)),x),x),And(FreeQ(List(a,b,c,n),x),PolynomialQ($s("§px"),x)))),
IIntegrate(5811,Int(Times(Plus(a_DEFAULT,Times(ArcSinh(Times(c_DEFAULT,x_)),b_DEFAULT)),$p("§px"),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Times($s("§px"),Power(Plus(d,Times(e,x)),m)),x))),Plus(Dist(Plus(a,Times(b,ArcSinh(Times(c,x)))),u,x),Negate(Dist(Times(b,c),Int(SimplifyIntegrand(Times(u,Power(Plus(C1,Times(Sqr(c),Sqr(x))),CN1D2)),x),x),x)))),And(FreeQ(List(a,b,c,d,e,m),x),PolynomialQ($s("§px"),x)))),
IIntegrate(5812,Int(Times(Plus(a_DEFAULT,Times(ArcCosh(Times(c_DEFAULT,x_)),b_DEFAULT)),$p("§px"),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Times($s("§px"),Power(Plus(d,Times(e,x)),m)),x))),Plus(Dist(Plus(a,Times(b,ArcCosh(Times(c,x)))),u,x),Negate(Dist(Times(b,c,Sqrt(Plus(C1,Times(CN1,Sqr(c),Sqr(x)))),Power(Times(Sqrt(Plus(CN1,Times(c,x))),Sqrt(Plus(C1,Times(c,x)))),-1)),Int(SimplifyIntegrand(Times(u,Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),CN1D2)),x),x),x)))),And(FreeQ(List(a,b,c,d,e,m),x),PolynomialQ($s("§px"),x)))),
IIntegrate(5813,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSinh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_),Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_)),p_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Times(Power(Plus(f,Times(g,x)),p),Power(Plus(d,Times(e,x)),m)),x))),Plus(Dist(Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),n),u,x),Negate(Dist(Times(b,c,n),Int(SimplifyIntegrand(Times(u,Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),Plus(n,Negate(C1))),Power(Plus(C1,Times(Sqr(c),Sqr(x))),CN1D2)),x),x),x)))),And(FreeQ(List(a,b,c,d,e,f,g),x),IGtQ(n,C0),IGtQ(p,C0),ILtQ(m,C0),LtQ(Plus(m,p,C1),C0)))),
IIntegrate(5814,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCosh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_),Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_)),p_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Times(Power(Plus(f,Times(g,x)),p),Power(Plus(d,Times(e,x)),m)),x))),Plus(Dist(Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n),u,x),Negate(Dist(Times(b,c,n),Int(SimplifyIntegrand(Times(u,Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Plus(n,Negate(C1))),Power(Times(Sqrt(Plus(C1,Times(c,x))),Sqrt(Plus(CN1,Times(c,x)))),-1)),x),x),x)))),And(FreeQ(List(a,b,c,d,e,f,g),x),IGtQ(n,C0),IGtQ(p,C0),ILtQ(m,C0),LtQ(Plus(m,p,C1),C0)))),
IIntegrate(5815,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSinh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_),Power(Plus(d_,Times(e_DEFAULT,x_)),-2),Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_),Times(h_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Times(Power(Plus(f,Times(g,x),Times(h,Sqr(x))),p),Power(Plus(d,Times(e,x)),-2)),x))),Plus(Dist(Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),n),u,x),Negate(Dist(Times(b,c,n),Int(SimplifyIntegrand(Times(u,Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),Plus(n,Negate(C1))),Power(Plus(C1,Times(Sqr(c),Sqr(x))),CN1D2)),x),x),x)))),And(FreeQ(List(a,b,c,d,e,f,g,h),x),IGtQ(n,C0),IGtQ(p,C0),EqQ(Plus(Times(e,g),Times(CN1,C2,d,h)),C0)))),
IIntegrate(5816,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCosh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_),Power(Plus(d_,Times(e_DEFAULT,x_)),-2),Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_),Times(h_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Times(Power(Plus(f,Times(g,x),Times(h,Sqr(x))),p),Power(Plus(d,Times(e,x)),-2)),x))),Plus(Dist(Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n),u,x),Negate(Dist(Times(b,c,n),Int(SimplifyIntegrand(Times(u,Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Plus(n,Negate(C1))),Power(Times(Sqrt(Plus(C1,Times(c,x))),Sqrt(Plus(CN1,Times(c,x)))),-1)),x),x),x)))),And(FreeQ(List(a,b,c,d,e,f,g,h),x),IGtQ(n,C0),IGtQ(p,C0),EqQ(Plus(Times(e,g),Times(CN1,C2,d,h)),C0)))),
IIntegrate(5817,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSinh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),$p("§px"),Power(Plus(d_,Times(e_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times($s("§px"),Power(Plus(d,Times(e,x)),m),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),n)),x),x),And(FreeQ(List(a,b,c,d,e),x),PolynomialQ($s("§px"),x),IGtQ(n,C0),IntegerQ(m)))),
IIntegrate(5818,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCosh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),$p("§px"),Power(Plus(d_,Times(e_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times($s("§px"),Power(Plus(d,Times(e,x)),m),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n)),x),x),And(FreeQ(List(a,b,c,d,e),x),PolynomialQ($s("§px"),x),IGtQ(n,C0),IntegerQ(m)))),
IIntegrate(5819,Int(Times(Plus(a_DEFAULT,Times(ArcSinh(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Plus(f_,Times(g_DEFAULT,x_)),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Times(Power(Plus(f,Times(g,x)),m),Power(Plus(d,Times(e,Sqr(x))),p)),x))),Plus(Dist(Plus(a,Times(b,ArcSinh(Times(c,x)))),u,x),Negate(Dist(Times(b,c),Int(Dist(Power(Plus(C1,Times(Sqr(c),Sqr(x))),CN1D2),u,x),x),x)))),And(FreeQ(List(a,b,c,d,e,f,g),x),EqQ(e,Times(Sqr(c),d)),IGtQ(m,C0),ILtQ(Plus(p,C1D2),C0),GtQ(d,C0),Or(LtQ(m,Plus(Times(CN2,p),Negate(C1))),GtQ(m,C3))))),
IIntegrate(5820,Int(Times(Plus(a_DEFAULT,Times(ArcCosh(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Plus($p("d1"),Times($p("e1",true),x_)),p_),Power(Plus($p("d2"),Times($p("e2",true),x_)),p_),Power(Plus(f_,Times(g_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Times(Power(Plus(f,Times(g,x)),m),Power(Plus($s("d1"),Times($s("e1"),x)),p),Power(Plus($s("d2"),Times($s("e2"),x)),p)),x))),Plus(Dist(Plus(a,Times(b,ArcCosh(Times(c,x)))),u,x),Negate(Dist(Times(b,c),Int(Dist(Power(Times(Sqrt(Plus(C1,Times(c,x))),Sqrt(Plus(CN1,Times(c,x)))),-1),u,x),x),x)))),And(FreeQ(List(a,b,c,$s("d1"),$s("e1"),$s("d2"),$s("e2"),f,g),x),EqQ(Plus($s("e1"),Times(CN1,c,$s("d1"))),C0),EqQ(Plus($s("e2"),Times(c,$s("d2"))),C0),IGtQ(m,C0),ILtQ(Plus(p,C1D2),C0),GtQ($s("d1"),C0),LtQ($s("d2"),C0),Or(LtQ(m,Plus(Times(CN2,p),Negate(C1))),GtQ(m,C3))))),
IIntegrate(5821,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSinh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,x_)),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(d,Times(e,Sqr(x))),p),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),n)),Power(Plus(f,Times(g,x)),m),x),x),And(FreeQ(List(a,b,c,d,e,f,g),x),EqQ(e,Times(Sqr(c),d)),IGtQ(m,C0),IntegerQ(Plus(p,C1D2)),GtQ(d,C0),IGtQ(n,C0),Or(And(EqQ(n,C1),GtQ(p,CN1)),GtQ(p,C0),EqQ(m,C1),And(EqQ(m,C2),LtQ(p,CN2)))))),
IIntegrate(5822,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCosh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus($p("d1"),Times($p("e1",true),x_)),p_),Power(Plus($p("d2"),Times($p("e2",true),x_)),p_),Power(Plus(f_,Times(g_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus($s("d1"),Times($s("e1"),x)),p),Power(Plus($s("d2"),Times($s("e2"),x)),p),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n)),Power(Plus(f,Times(g,x)),m),x),x),And(FreeQ(List(a,b,c,$s("d1"),$s("e1"),$s("d2"),$s("e2"),f,g),x),EqQ(Plus($s("e1"),Times(CN1,c,$s("d1"))),C0),EqQ(Plus($s("e2"),Times(c,$s("d2"))),C0),IGtQ(m,C0),IntegerQ(Plus(p,C1D2)),GtQ($s("d1"),C0),LtQ($s("d2"),C0),IGtQ(n,C0),Or(And(EqQ(n,C1),GtQ(p,CN1)),GtQ(p,C0),EqQ(m,C1),And(EqQ(m,C2),LtQ(p,CN2)))))),
IIntegrate(5823,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSinh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_)),m_),Sqrt(Plus(d_,Times(e_DEFAULT,Sqr(x_))))),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(f,Times(g,x)),m),Plus(d,Times(e,Sqr(x))),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),Plus(n,C1)),Power(Times(b,c,Sqrt(d),Plus(n,C1)),-1)),x),Negate(Dist(Power(Times(b,c,Sqrt(d),Plus(n,C1)),-1),Int(Times(Plus(Times(d,g,m),Times(C2,e,f,x),Times(e,g,Plus(m,C2),Sqr(x))),Power(Plus(f,Times(g,x)),Plus(m,Negate(C1))),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),Plus(n,C1))),x),x))),And(FreeQ(List(a,b,c,d,e,f,g),x),EqQ(e,Times(Sqr(c),d)),ILtQ(m,C0),GtQ(d,C0),IGtQ(n,C0)))),
IIntegrate(5824,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCosh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Sqrt(Plus($p("d1"),Times($p("e1",true),x_))),Sqrt(Plus($p("d2"),Times($p("e2",true),x_))),Power(Plus(f_,Times(g_DEFAULT,x_)),m_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(f,Times(g,x)),m),Plus(Times($s("d1"),$s("d2")),Times($s("e1"),$s("e2"),Sqr(x))),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Plus(n,C1)),Power(Times(b,c,Sqrt(Times(CN1,$s("d1"),$s("d2"))),Plus(n,C1)),-1)),x),Negate(Dist(Power(Times(b,c,Sqrt(Times(CN1,$s("d1"),$s("d2"))),Plus(n,C1)),-1),Int(Times(Plus(Times($s("d1"),$s("d2"),g,m),Times(C2,$s("e1"),$s("e2"),f,x),Times($s("e1"),$s("e2"),g,Plus(m,C2),Sqr(x))),Power(Plus(f,Times(g,x)),Plus(m,Negate(C1))),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Plus(n,C1))),x),x))),And(FreeQ(List(a,b,c,$s("d1"),$s("e1"),$s("d2"),$s("e2"),f,g),x),EqQ(Plus($s("e1"),Times(CN1,c,$s("d1"))),C0),EqQ(Plus($s("e2"),Times(c,$s("d2"))),C0),ILtQ(m,C0),GtQ($s("d1"),C0),LtQ($s("d2"),C0),IGtQ(n,C0)))),
IIntegrate(5825,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSinh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,x_)),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Sqrt(Plus(d,Times(e,Sqr(x)))),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),n)),Times(Power(Plus(f,Times(g,x)),m),Power(Plus(d,Times(e,Sqr(x))),Plus(p,Negate(C1D2)))),x),x),And(FreeQ(List(a,b,c,d,e,f,g),x),EqQ(e,Times(Sqr(c),d)),IntegerQ(m),IGtQ(Plus(p,C1D2),C0),GtQ(d,C0),IGtQ(n,C0)))),
IIntegrate(5826,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCosh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus($p("d1"),Times($p("e1",true),x_)),p_),Power(Plus($p("d2"),Times($p("e2",true),x_)),p_),Power(Plus(f_,Times(g_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Sqrt(Plus($s("d1"),Times($s("e1"),x))),Sqrt(Plus($s("d2"),Times($s("e2"),x))),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n)),Times(Power(Plus(f,Times(g,x)),m),Power(Plus($s("d1"),Times($s("e1"),x)),Plus(p,Negate(C1D2))),Power(Plus($s("d2"),Times($s("e2"),x)),Plus(p,Negate(C1D2)))),x),x),And(FreeQ(List(a,b,c,$s("d1"),$s("e1"),$s("d2"),$s("e2"),f,g),x),EqQ(Plus($s("e1"),Times(CN1,c,$s("d1"))),C0),EqQ(Plus($s("e2"),Times(c,$s("d2"))),C0),IntegerQ(m),IGtQ(Plus(p,C1D2),C0),GtQ($s("d1"),C0),LtQ($s("d2"),C0),IGtQ(n,C0)))),
IIntegrate(5827,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSinh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,x_)),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(f,Times(g,x)),m),Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1D2)),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),Plus(n,C1)),Power(Times(b,c,Sqrt(d),Plus(n,C1)),-1)),x),Negate(Dist(Power(Times(b,c,Sqrt(d),Plus(n,C1)),-1),Int(ExpandIntegrand(Times(Power(Plus(f,Times(g,x)),Plus(m,Negate(C1))),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),Plus(n,C1))),Times(Plus(Times(d,g,m),Times(e,f,Plus(Times(C2,p),C1),x),Times(e,g,Plus(m,Times(C2,p),C1),Sqr(x))),Power(Plus(d,Times(e,Sqr(x))),Plus(p,Negate(C1D2)))),x),x),x))),And(FreeQ(List(a,b,c,d,e,f,g),x),EqQ(e,Times(Sqr(c),d)),ILtQ(m,C0),IGtQ(Plus(p,Negate(C1D2)),C0),GtQ(d,C0),IGtQ(n,C0)))),
IIntegrate(5828,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCosh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus($p("d1"),Times($p("e1",true),x_)),p_),Power(Plus($p("d2"),Times($p("e2",true),x_)),p_),Power(Plus(f_,Times(g_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(f,Times(g,x)),m),Power(Plus($s("d1"),Times($s("e1"),x)),Plus(p,C1D2)),Power(Plus($s("d2"),Times($s("e2"),x)),Plus(p,C1D2)),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Plus(n,C1)),Power(Times(b,c,Sqrt(Times(CN1,$s("d1"),$s("d2"))),Plus(n,C1)),-1)),x),Negate(Dist(Power(Times(b,c,Sqrt(Times(CN1,$s("d1"),$s("d2"))),Plus(n,C1)),-1),Int(ExpandIntegrand(Times(Power(Plus(f,Times(g,x)),Plus(m,Negate(C1))),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Plus(n,C1))),Times(Plus(Times($s("d1"),$s("d2"),g,m),Times($s("e1"),$s("e2"),f,Plus(Times(C2,p),C1),x),Times($s("e1"),$s("e2"),g,Plus(m,Times(C2,p),C1),Sqr(x))),Power(Plus($s("d1"),Times($s("e1"),x)),Plus(p,Negate(C1D2))),Power(Plus($s("d2"),Times($s("e2"),x)),Plus(p,Negate(C1D2)))),x),x),x))),And(FreeQ(List(a,b,c,$s("d1"),$s("e1"),$s("d2"),$s("e2"),f,g),x),EqQ(Plus($s("e1"),Times(CN1,c,$s("d1"))),C0),EqQ(Plus($s("e2"),Times(c,$s("d2"))),C0),ILtQ(m,C0),IGtQ(Plus(p,Negate(C1D2)),C0),GtQ($s("d1"),C0),LtQ($s("d2"),C0),IGtQ(n,C0)))),
IIntegrate(5829,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSinh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_),Power(Plus(f_,Times(g_DEFAULT,x_)),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(f,Times(g,x)),m),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),Plus(n,C1)),Power(Times(b,c,Sqrt(d),Plus(n,C1)),-1)),x),Negate(Dist(Times(g,m,Power(Times(b,c,Sqrt(d),Plus(n,C1)),-1)),Int(Times(Power(Plus(f,Times(g,x)),Plus(m,Negate(C1))),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),Plus(n,C1))),x),x))),And(FreeQ(List(a,b,c,d,e,f,g),x),EqQ(e,Times(Sqr(c),d)),IGtQ(m,C0),GtQ(d,C0),LtQ(n,CN1)))),
IIntegrate(5830,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCosh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_),Power(Plus($p("d1"),Times($p("e1",true),x_)),CN1D2),Power(Plus($p("d2"),Times($p("e2",true),x_)),CN1D2),Power(Plus(f_,Times(g_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(f,Times(g,x)),m),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Plus(n,C1)),Power(Times(b,c,Sqrt(Times(CN1,$s("d1"),$s("d2"))),Plus(n,C1)),-1)),x),Negate(Dist(Times(g,m,Power(Times(b,c,Sqrt(Times(CN1,$s("d1"),$s("d2"))),Plus(n,C1)),-1)),Int(Times(Power(Plus(f,Times(g,x)),Plus(m,Negate(C1))),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Plus(n,C1))),x),x))),And(FreeQ(List(a,b,c,$s("d1"),$s("e1"),$s("d2"),$s("e2"),f,g),x),EqQ(Plus($s("e1"),Times(CN1,c,$s("d1"))),C0),EqQ(Plus($s("e2"),Times(c,$s("d2"))),C0),IGtQ(m,C0),GtQ($s("d1"),C0),LtQ($s("d2"),C0),LtQ(n,CN1)))),
IIntegrate(5831,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSinh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,x_)),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Dist(Power(Times(Power(c,Plus(m,C1)),Sqrt(d)),-1),Subst(Int(Times(Power(Plus(a,Times(b,x)),n),Power(Plus(Times(c,f),Times(g,Sinh(x))),m)),x),x,ArcSinh(Times(c,x))),x),And(FreeQ(List(a,b,c,d,e,f,g,n),x),EqQ(e,Times(Sqr(c),d)),IntegerQ(m),GtQ(d,C0),Or(GtQ(m,C0),IGtQ(n,C0))))),
IIntegrate(5832,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCosh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus($p("d1"),Times($p("e1",true),x_)),CN1D2),Power(Plus($p("d2"),Times($p("e2",true),x_)),CN1D2),Power(Plus(f_,Times(g_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Times(Power(c,Plus(m,C1)),Sqrt(Times(CN1,$s("d1"),$s("d2")))),-1),Subst(Int(Times(Power(Plus(a,Times(b,x)),n),Power(Plus(Times(c,f),Times(g,Cosh(x))),m)),x),x,ArcCosh(Times(c,x))),x),And(FreeQ(List(a,b,c,$s("d1"),$s("e1"),$s("d2"),$s("e2"),f,g,n),x),EqQ(Plus($s("e1"),Times(CN1,c,$s("d1"))),C0),EqQ(Plus($s("e2"),Times(c,$s("d2"))),C0),IntegerQ(m),GtQ($s("d1"),C0),LtQ($s("d2"),C0),Or(GtQ(m,C0),IGtQ(n,C0))))),
IIntegrate(5833,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSinh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,x_)),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),n),Power(Plus(d,Times(e,Sqr(x))),CN1D2)),Times(Power(Plus(f,Times(g,x)),m),Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1D2))),x),x),And(FreeQ(List(a,b,c,d,e,f,g),x),EqQ(e,Times(Sqr(c),d)),IntegerQ(m),ILtQ(Plus(p,C1D2),C0),GtQ(d,C0),IGtQ(n,C0)))),
IIntegrate(5834,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCosh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus($p("d1"),Times($p("e1",true),x_)),p_),Power(Plus($p("d2"),Times($p("e2",true),x_)),p_),Power(Plus(f_,Times(g_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n),Power(Times(Sqrt(Plus($s("d1"),Times($s("e1"),x))),Sqrt(Plus($s("d2"),Times($s("e2"),x)))),-1)),Times(Power(Plus(f,Times(g,x)),m),Power(Plus($s("d1"),Times($s("e1"),x)),Plus(p,C1D2)),Power(Plus($s("d2"),Times($s("e2"),x)),Plus(p,C1D2))),x),x),And(FreeQ(List(a,b,c,$s("d1"),$s("e1"),$s("d2"),$s("e2"),f,g),x),EqQ(Plus($s("e1"),Times(CN1,c,$s("d1"))),C0),EqQ(Plus($s("e2"),Times(c,$s("d2"))),C0),IntegerQ(m),ILtQ(Plus(p,C1D2),C0),GtQ($s("d1"),C0),LtQ($s("d2"),C0),IGtQ(n,C0)))),
IIntegrate(5835,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSinh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,x_)),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Dist(Times(Power(d,IntPart(p)),Power(Plus(d,Times(e,Sqr(x))),FracPart(p)),Power(Power(Plus(C1,Times(Sqr(c),Sqr(x))),FracPart(p)),-1)),Int(Times(Power(Plus(f,Times(g,x)),m),Power(Plus(C1,Times(Sqr(c),Sqr(x))),p),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),n)),x),x),And(FreeQ(List(a,b,c,d,e,f,g,n),x),EqQ(e,Times(Sqr(c),d)),IntegerQ(m),IntegerQ(Plus(p,Negate(C1D2))),Not(GtQ(d,C0))))),
IIntegrate(5836,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCosh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,x_)),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Dist(Times(Power(Negate(d),IntPart(p)),Power(Plus(d,Times(e,Sqr(x))),FracPart(p)),Power(Times(Power(Plus(C1,Times(c,x)),FracPart(p)),Power(Plus(CN1,Times(c,x)),FracPart(p))),-1)),Int(Times(Power(Plus(f,Times(g,x)),m),Power(Plus(C1,Times(c,x)),p),Power(Plus(CN1,Times(c,x)),p),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n)),x),x),And(FreeQ(List(a,b,c,d,e,f,g,n),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IntegerQ(m),IntegerQ(Plus(p,Negate(C1D2)))))),
IIntegrate(5837,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCosh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus($p("d1"),Times($p("e1",true),x_)),p_),Power(Plus($p("d2"),Times($p("e2",true),x_)),p_),Power(Plus(f_,Times(g_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(Times(CN1,$s("d1"),$s("d2")),IntPart(p)),Power(Plus($s("d1"),Times($s("e1"),x)),FracPart(p)),Power(Plus($s("d2"),Times($s("e2"),x)),FracPart(p)),Power(Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),FracPart(p)),-1)),Int(Times(Power(Plus(f,Times(g,x)),m),Power(Plus(C1,Times(c,x)),p),Power(Plus(CN1,Times(c,x)),p),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n)),x),x),And(FreeQ(List(a,b,c,$s("d1"),$s("e1"),$s("d2"),$s("e2"),f,g,n),x),EqQ(Plus($s("e1"),Times(CN1,c,$s("d1"))),C0),EqQ(Plus($s("e2"),Times(c,$s("d2"))),C0),IntegerQ(m),IntegerQ(Plus(p,Negate(C1D2))),Not(And(GtQ($s("d1"),C0),LtQ($s("d2"),C0)))))),
IIntegrate(5838,Int(Times(Log(Times(h_DEFAULT,Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_)),m_DEFAULT))),Power(Plus(a_DEFAULT,Times(ArcSinh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Plus(Simp(Times(Log(Times(h,Power(Plus(f,Times(g,x)),m))),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),Plus(n,C1)),Power(Times(b,c,Sqrt(d),Plus(n,C1)),-1)),x),Negate(Dist(Times(g,m,Power(Times(b,c,Sqrt(d),Plus(n,C1)),-1)),Int(Times(Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),Plus(n,C1)),Power(Plus(f,Times(g,x)),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f,g,h,m),x),EqQ(e,Times(Sqr(c),d)),GtQ(d,C0),IGtQ(n,C0)))),
IIntegrate(5839,Int(Times(Log(Times(h_DEFAULT,Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_)),m_DEFAULT))),Power(Plus(a_DEFAULT,Times(ArcCosh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus($p("d1"),Times($p("e1",true),x_)),CN1D2),Power(Plus($p("d2"),Times($p("e2",true),x_)),CN1D2)),x_Symbol),
    Condition(Plus(Simp(Times(Log(Times(h,Power(Plus(f,Times(g,x)),m))),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Plus(n,C1)),Power(Times(b,c,Sqrt(Times(CN1,$s("d1"),$s("d2"))),Plus(n,C1)),-1)),x),Negate(Dist(Times(g,m,Power(Times(b,c,Sqrt(Times(CN1,$s("d1"),$s("d2"))),Plus(n,C1)),-1)),Int(Times(Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Plus(n,C1)),Power(Plus(f,Times(g,x)),-1)),x),x))),And(FreeQ(List(a,b,c,$s("d1"),$s("e1"),$s("d2"),$s("e2"),f,g,h,m),x),EqQ(Plus($s("e1"),Times(CN1,c,$s("d1"))),C0),EqQ(Plus($s("e2"),Times(c,$s("d2"))),C0),GtQ($s("d1"),C0),LtQ($s("d2"),C0),IGtQ(n,C0)))),
IIntegrate(5840,Int(Times(Log(Times(h_DEFAULT,Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_)),m_DEFAULT))),Power(Plus(a_DEFAULT,Times(ArcSinh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Dist(Times(Power(d,IntPart(p)),Power(Plus(d,Times(e,Sqr(x))),FracPart(p)),Power(Power(Plus(C1,Times(Sqr(c),Sqr(x))),FracPart(p)),-1)),Int(Times(Log(Times(h,Power(Plus(f,Times(g,x)),m))),Power(Plus(C1,Times(Sqr(c),Sqr(x))),p),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),n)),x),x),And(FreeQ(List(a,b,c,d,e,f,g,h,m,n),x),EqQ(e,Times(Sqr(c),d)),IntegerQ(Plus(p,Negate(C1D2))),Not(GtQ(d,C0))))),
IIntegrate(5841,Int(Times(Log(Times(h_DEFAULT,Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_)),m_DEFAULT))),Power(Plus(a_DEFAULT,Times(ArcCosh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Dist(Times(Power(Negate(d),IntPart(p)),Power(Plus(d,Times(e,Sqr(x))),FracPart(p)),Power(Times(Power(Plus(C1,Times(c,x)),FracPart(p)),Power(Plus(CN1,Times(c,x)),FracPart(p))),-1)),Int(Times(Log(Times(h,Power(Plus(f,Times(g,x)),m))),Power(Plus(C1,Times(c,x)),p),Power(Plus(CN1,Times(c,x)),p),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n)),x),x),And(FreeQ(List(a,b,c,d,e,f,g,h,m,n),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IntegerQ(Plus(p,Negate(C1D2)))))),
IIntegrate(5842,Int(Times(Log(Times(h_DEFAULT,Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_)),m_DEFAULT))),Power(Plus(a_DEFAULT,Times(ArcCosh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus($p("d1"),Times($p("e1",true),x_)),p_),Power(Plus($p("d2"),Times($p("e2",true),x_)),p_)),x_Symbol),
    Condition(Dist(Times(Power(Times(CN1,$s("d1"),$s("d2")),IntPart(p)),Power(Plus($s("d1"),Times($s("e1"),x)),FracPart(p)),Power(Plus($s("d2"),Times($s("e2"),x)),FracPart(p)),Power(Times(Power(Plus(C1,Times(c,x)),FracPart(p)),Power(Plus(CN1,Times(c,x)),FracPart(p))),-1)),Int(Times(Log(Times(h,Power(Plus(f,Times(g,x)),m))),Power(Plus(C1,Times(c,x)),p),Power(Plus(CN1,Times(c,x)),p),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n)),x),x),And(FreeQ(List(a,b,c,$s("d1"),$s("e1"),$s("d2"),$s("e2"),f,g,h,m,n),x),EqQ(Plus($s("e1"),Times(CN1,c,$s("d1"))),C0),EqQ(Plus($s("e2"),Times(c,$s("d2"))),C0),IntegerQ(Plus(p,Negate(C1D2))),Not(And(GtQ($s("d1"),C0),LtQ($s("d2"),C0)))))),
IIntegrate(5843,Int(Times(Plus(a_DEFAULT,Times(ArcSinh(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Power(Plus(f_,Times(g_DEFAULT,x_)),m_)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Times(Power(Plus(d,Times(e,x)),m),Power(Plus(f,Times(g,x)),m)),x))),Plus(Dist(Plus(a,Times(b,ArcSinh(Times(c,x)))),u,x),Negate(Dist(Times(b,c),Int(Dist(Power(Plus(C1,Times(Sqr(c),Sqr(x))),CN1D2),u,x),x),x)))),And(FreeQ(List(a,b,c,d,e,f,g),x),ILtQ(Plus(m,C1D2),C0)))),
IIntegrate(5844,Int(Times(Plus(a_DEFAULT,Times(ArcCosh(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Power(Plus(f_,Times(g_DEFAULT,x_)),m_)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Times(Power(Plus(d,Times(e,x)),m),Power(Plus(f,Times(g,x)),m)),x))),Plus(Dist(Plus(a,Times(b,ArcCosh(Times(c,x)))),u,x),Negate(Dist(Times(b,c),Int(Dist(Power(Times(Sqrt(Plus(C1,Times(c,x))),Sqrt(Plus(CN1,Times(c,x)))),-1),u,x),x),x)))),And(FreeQ(List(a,b,c,d,e,f,g),x),ILtQ(Plus(m,C1D2),C0)))),
IIntegrate(5845,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSinh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,x_)),m_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),n),Times(Power(Plus(d,Times(e,x)),m),Power(Plus(f,Times(g,x)),m)),x),x),And(FreeQ(List(a,b,c,d,e,f,g,n),x),IntegerQ(m)))),
IIntegrate(5846,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCosh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,x_)),m_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n),Times(Power(Plus(d,Times(e,x)),m),Power(Plus(f,Times(g,x)),m)),x),x),And(FreeQ(List(a,b,c,d,e,f,g,n),x),IntegerQ(m)))),
IIntegrate(5847,Int(Times(Plus(a_DEFAULT,Times(ArcSinh(Times(c_DEFAULT,x_)),b_DEFAULT)),u_),x_Symbol),
    Condition(With(List(Set(v,IntHide(u,x))),Condition(Plus(Dist(Plus(a,Times(b,ArcSinh(Times(c,x)))),v,x),Negate(Dist(Times(b,c),Int(SimplifyIntegrand(Times(v,Power(Plus(C1,Times(Sqr(c),Sqr(x))),CN1D2)),x),x),x))),InverseFunctionFreeQ(v,x))),FreeQ(List(a,b,c),x))),
IIntegrate(5848,Int(Times(Plus(a_DEFAULT,Times(ArcCosh(Times(c_DEFAULT,x_)),b_DEFAULT)),u_),x_Symbol),
    Condition(With(List(Set(v,IntHide(u,x))),Condition(Plus(Dist(Plus(a,Times(b,ArcCosh(Times(c,x)))),v,x),Negate(Dist(Times(b,c,Sqrt(Plus(C1,Times(CN1,Sqr(c),Sqr(x)))),Power(Times(Sqrt(Plus(CN1,Times(c,x))),Sqrt(Plus(C1,Times(c,x)))),-1)),Int(SimplifyIntegrand(Times(v,Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),CN1D2)),x),x),x))),InverseFunctionFreeQ(v,x))),FreeQ(List(a,b,c),x))),
IIntegrate(5849,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSinh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_),$p("§px"),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(With(List(Set(u,ExpandIntegrand(Times($s("§px"),Power(Plus(d,Times(e,Sqr(x))),p),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),n)),x))),Condition(Int(u,x),SumQ(u))),And(FreeQ(List(a,b,c,d,e,n),x),PolynomialQ($s("§px"),x),EqQ(e,Times(Sqr(c),d)),IntegerQ(Plus(p,Negate(C1D2)))))),
IIntegrate(5850,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCosh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_),$p("§px"),Power(Plus($p("d1"),Times($p("e1",true),x_)),p_),Power(Plus($p("d2"),Times($p("e2",true),x_)),p_)),x_Symbol),
    Condition(With(List(Set(u,ExpandIntegrand(Times($s("§px"),Power(Plus($s("d1"),Times($s("e1"),x)),p),Power(Plus($s("d2"),Times($s("e2"),x)),p),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n)),x))),Condition(Int(u,x),SumQ(u))),And(FreeQ(List(a,b,c,$s("d1"),$s("e1"),$s("d2"),$s("e2"),n),x),PolynomialQ($s("§px"),x),EqQ(Plus($s("e1"),Times(CN1,c,$s("d1"))),C0),EqQ(Plus($s("e2"),Times(c,$s("d2"))),C0),IntegerQ(Plus(p,Negate(C1D2))))))
  );
}
