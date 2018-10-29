package org.matheclipse.core.integrate.rubi;


import org.matheclipse.core.interfaces.IAST;

import static org.matheclipse.core.expression.F.$p;
import static org.matheclipse.core.expression.F.$s;
import static org.matheclipse.core.expression.F.And;
import static org.matheclipse.core.expression.F.AppellF1;
import static org.matheclipse.core.expression.F.ArcSin;
import static org.matheclipse.core.expression.F.ArcTan;
import static org.matheclipse.core.expression.F.C0;
import static org.matheclipse.core.expression.F.C1;
import static org.matheclipse.core.expression.F.C1D2;
import static org.matheclipse.core.expression.F.C1D4;
import static org.matheclipse.core.expression.F.C2;
import static org.matheclipse.core.expression.F.C3;
import static org.matheclipse.core.expression.F.CN1;
import static org.matheclipse.core.expression.F.CN1D2;
import static org.matheclipse.core.expression.F.CN2;
import static org.matheclipse.core.expression.F.CN3;
import static org.matheclipse.core.expression.F.Coefficient;
import static org.matheclipse.core.expression.F.Condition;
import static org.matheclipse.core.expression.F.EllipticPi;
import static org.matheclipse.core.expression.F.FreeQ;
import static org.matheclipse.core.expression.F.IIntegrate;
import static org.matheclipse.core.expression.F.IntegerQ;
import static org.matheclipse.core.expression.F.List;
import static org.matheclipse.core.expression.F.Negate;
import static org.matheclipse.core.expression.F.Not;
import static org.matheclipse.core.expression.F.Or;
import static org.matheclipse.core.expression.F.Plus;
import static org.matheclipse.core.expression.F.Power;
import static org.matheclipse.core.expression.F.QQ;
import static org.matheclipse.core.expression.F.Simplify;
import static org.matheclipse.core.expression.F.Sqr;
import static org.matheclipse.core.expression.F.Sqrt;
import static org.matheclipse.core.expression.F.Times;
import static org.matheclipse.core.expression.F.a;
import static org.matheclipse.core.expression.F.a_;
import static org.matheclipse.core.expression.F.a_DEFAULT;
import static org.matheclipse.core.expression.F.b;
import static org.matheclipse.core.expression.F.b_DEFAULT;
import static org.matheclipse.core.expression.F.c;
import static org.matheclipse.core.expression.F.c_;
import static org.matheclipse.core.expression.F.c_DEFAULT;
import static org.matheclipse.core.expression.F.d;
import static org.matheclipse.core.expression.F.d_DEFAULT;
import static org.matheclipse.core.expression.F.e;
import static org.matheclipse.core.expression.F.e_;
import static org.matheclipse.core.expression.F.e_DEFAULT;
import static org.matheclipse.core.expression.F.f;
import static org.matheclipse.core.expression.F.f_DEFAULT;
import static org.matheclipse.core.expression.F.m;
import static org.matheclipse.core.expression.F.m_;
import static org.matheclipse.core.expression.F.m_DEFAULT;
import static org.matheclipse.core.expression.F.n;
import static org.matheclipse.core.expression.F.n_;
import static org.matheclipse.core.expression.F.n_DEFAULT;
import static org.matheclipse.core.expression.F.p;
import static org.matheclipse.core.expression.F.p_;
import static org.matheclipse.core.expression.F.p_DEFAULT;
import static org.matheclipse.core.expression.F.q;
import static org.matheclipse.core.expression.F.q_;
import static org.matheclipse.core.expression.F.q_DEFAULT;
import static org.matheclipse.core.expression.F.r;
import static org.matheclipse.core.expression.F.r_;
import static org.matheclipse.core.expression.F.r_DEFAULT;
import static org.matheclipse.core.expression.F.u;
import static org.matheclipse.core.expression.F.u_;
import static org.matheclipse.core.expression.F.u_DEFAULT;
import static org.matheclipse.core.expression.F.v;
import static org.matheclipse.core.expression.F.v_;
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
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.IntBinomialQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.IntPart;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.LeQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.LinearPairQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.LinearQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.LtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.NeQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.NegQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.PosQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Rt;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Simp;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.SimplerSqrtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.SimplifyIntegrand;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Subst;

/** 
 * IndefiniteIntegrationRules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class IntRules10 { 
  public static IAST RULES = List( 
IIntegrate(501,Int(Times(Power(Times(e_,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_)),x_Symbol),
    Condition(Dist(Times(Power(e,IntPart(m)),Power(Times(e,x),FracPart(m)),Power(Power(x,FracPart(m)),-1)),Int(Times(Power(x,m),Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),q)),x),x),And(FreeQ(List(a,b,c,d,e,m,n,p,q),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),IntegerQ(Simplify(Times(n,Power(Plus(m,C1),-1)))),Not(IntegerQ(n))))),
IIntegrate(502,Int(Times(Power(Times(e_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Plus(Times(c,b),Times(CN1,a,d)),Power(Times(e,x),Plus(m,C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),Plus(q,Negate(C1))),Power(Times(a,b,e,n,Plus(p,C1)),-1)),x)),Dist(Power(Times(a,b,n,Plus(p,C1)),-1),Int(Times(Power(Times(e,x),m),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),Plus(q,Negate(C2))),Simp(Plus(Times(c,Plus(Times(c,b,n,Plus(p,C1)),Times(Plus(Times(c,b),Times(CN1,a,d)),Plus(m,C1)))),Times(d,Plus(Times(c,b,n,Plus(p,C1)),Times(Plus(Times(c,b),Times(CN1,a,d)),Plus(m,Times(n,Plus(q,Negate(C1))),C1))),Power(x,n))),x)),x),x)),And(FreeQ(List(a,b,c,d,e,m,n),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),LtQ(p,CN1),GtQ(q,C1),IntBinomialQ(a,b,c,d,e,m,n,p,q,x)))),
IIntegrate(503,Int(Times(Power(Times(e_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Times(e,x),Plus(m,C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),q),Power(Times(a,e,n,Plus(p,C1)),-1)),x)),Dist(Power(Times(a,n,Plus(p,C1)),-1),Int(Times(Power(Times(e,x),m),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),Plus(q,Negate(C1))),Simp(Plus(Times(c,Plus(m,Times(n,Plus(p,C1)),C1)),Times(d,Plus(m,Times(n,Plus(p,q,C1)),C1),Power(x,n))),x)),x),x)),And(FreeQ(List(a,b,c,d,e,m,n),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),LtQ(p,CN1),LtQ(C0,q,C1),IntBinomialQ(a,b,c,d,e,m,n,p,q,x)))),
IIntegrate(504,Int(Times(Power(Times(e_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,Power(Times(e,x),Plus(m,C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),Plus(q,C1)),Power(Times(a,e,n,Plus(Times(b,c),Times(CN1,a,d)),Plus(p,C1)),-1)),x)),Dist(Power(Times(a,n,Plus(Times(b,c),Times(CN1,a,d)),Plus(p,C1)),-1),Int(Times(Power(Times(e,x),m),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),q),Simp(Plus(Times(c,b,Plus(m,C1)),Times(n,Plus(Times(b,c),Times(CN1,a,d)),Plus(p,C1)),Times(d,b,Plus(m,Times(n,Plus(p,q,C2)),C1),Power(x,n))),x)),x),x)),And(FreeQ(List(a,b,c,d,e,m,n,q),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),LtQ(p,CN1),IntBinomialQ(a,b,c,d,e,m,n,p,q,x)))),
IIntegrate(505,Int(Times(Power(Times(e_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(e,x),Plus(m,C1)),Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),q),Power(Times(e,Plus(m,Times(n,Plus(p,q)),C1)),-1)),x),Dist(Times(n,Power(Plus(m,Times(n,Plus(p,q)),C1),-1)),Int(Times(Power(Times(e,x),m),Power(Plus(a,Times(b,Power(x,n))),Plus(p,Negate(C1))),Power(Plus(c,Times(d,Power(x,n))),Plus(q,Negate(C1))),Simp(Plus(Times(a,c,Plus(p,q)),Times(Plus(Times(q,Plus(Times(b,c),Times(CN1,a,d))),Times(a,d,Plus(p,q))),Power(x,n))),x)),x),x)),And(FreeQ(List(a,b,c,d,e,m,n),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),GtQ(q,C0),GtQ(p,C0),IntBinomialQ(a,b,c,d,e,m,n,p,q,x)))),
IIntegrate(506,Int(Times(Power(Times(e_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_)),x_Symbol),
    Condition(Plus(Simp(Times(d,Power(Times(e,x),Plus(m,C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),Plus(q,Negate(C1))),Power(Times(b,e,Plus(m,Times(n,Plus(p,q)),C1)),-1)),x),Dist(Power(Times(b,Plus(m,Times(n,Plus(p,q)),C1)),-1),Int(Times(Power(Times(e,x),m),Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),Plus(q,Negate(C2))),Simp(Plus(Times(c,Plus(Times(Plus(Times(c,b),Times(CN1,a,d)),Plus(m,C1)),Times(c,b,n,Plus(p,q)))),Times(Plus(Times(d,Plus(Times(c,b),Times(CN1,a,d)),Plus(m,C1)),Times(d,n,Plus(q,Negate(C1)),Plus(Times(b,c),Times(CN1,a,d))),Times(c,b,d,n,Plus(p,q))),Power(x,n))),x)),x),x)),And(FreeQ(List(a,b,c,d,e,m,n,p),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),GtQ(q,C1),IntBinomialQ(a,b,c,d,e,m,n,p,q,x)))),
IIntegrate(507,Int(Times(Power(x_,m_),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),-1),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),-1)),x_Symbol),
    Condition(Plus(Negate(Dist(Times(a,Power(Plus(Times(b,c),Times(CN1,a,d)),-1)),Int(Times(Power(x,Plus(m,Negate(n))),Power(Plus(a,Times(b,Power(x,n))),-1)),x),x)),Dist(Times(c,Power(Plus(Times(b,c),Times(CN1,a,d)),-1)),Int(Times(Power(x,Plus(m,Negate(n))),Power(Plus(c,Times(d,Power(x,n))),-1)),x),x)),And(FreeQ(List(a,b,c,d,m,n),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),Or(EqQ(m,n),EqQ(m,Plus(Times(C2,n),Negate(C1))))))),
IIntegrate(508,Int(Times(Power(Times(e_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),-1),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),-1)),x_Symbol),
    Condition(Plus(Dist(Times(b,Power(Plus(Times(b,c),Times(CN1,a,d)),-1)),Int(Times(Power(Times(e,x),m),Power(Plus(a,Times(b,Power(x,n))),-1)),x),x),Negate(Dist(Times(d,Power(Plus(Times(b,c),Times(CN1,a,d)),-1)),Int(Times(Power(Times(e,x),m),Power(Plus(c,Times(d,Power(x,n))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,n,m),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0)))),
IIntegrate(509,Int(Times(Power(Times(e_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Times(e,x),m),Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),q)),x),x),And(FreeQ(List(a,b,c,d,e,m),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),IGtQ(p,CN2),Or(IGtQ(q,CN2),And(EqQ(q,CN3),IntegerQ(Times(C1D2,Plus(m,Negate(C1))))))))),
IIntegrate(510,Int(Times(Power(Times(e_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_)),x_Symbol),
    Condition(Simp(Times(Power(a,p),Power(c,q),Power(Times(e,x),Plus(m,C1)),AppellF1(Times(Plus(m,C1),Power(n,-1)),Negate(p),Negate(q),Plus(C1,Times(Plus(m,C1),Power(n,-1))),Times(CN1,b,Power(x,n),Power(a,-1)),Times(CN1,d,Power(x,n),Power(c,-1))),Power(Times(e,Plus(m,C1)),-1)),x),And(FreeQ(List(a,b,c,d,e,m,n,p,q),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),NeQ(m,CN1),NeQ(m,Plus(n,Negate(C1))),Or(IntegerQ(p),GtQ(a,C0)),Or(IntegerQ(q),GtQ(c,C0))))),
IIntegrate(511,Int(Times(Power(Times(e_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_)),x_Symbol),
    Condition(Dist(Times(Power(a,IntPart(p)),Power(Plus(a,Times(b,Power(x,n))),FracPart(p)),Power(Power(Plus(C1,Times(b,Power(x,n),Power(a,-1))),FracPart(p)),-1)),Int(Times(Power(Times(e,x),m),Power(Plus(C1,Times(b,Power(x,n),Power(a,-1))),p),Power(Plus(c,Times(d,Power(x,n))),q)),x),x),And(FreeQ(List(a,b,c,d,e,m,n,p,q),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),NeQ(m,CN1),NeQ(m,Plus(n,Negate(C1))),Not(Or(IntegerQ(p),GtQ(a,C0)))))),
IIntegrate(512,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(v_,n_))),p_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,Power(v_,n_))),q_DEFAULT),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Power(Coefficient(v,x,C1),Plus(m,C1)),-1),Subst(Int(SimplifyIntegrand(Times(Power(Plus(x,Negate(Coefficient(v,x,C0))),m),Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),q)),x),x),x,v),x),And(FreeQ(List(a,b,c,d,n,p,q),x),LinearQ(v,x),IntegerQ(m),NeQ(v,x)))),
IIntegrate(513,Int(Times(Power(u_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(v_,n_))),p_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,Power(v_,n_))),q_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(u,m),Power(Times(Coefficient(v,x,C1),Power(v,m)),-1)),Subst(Int(Times(Power(x,m),Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),q)),x),x,v),x),And(FreeQ(List(a,b,c,d,m,n,p,q),x),LinearPairQ(u,v,x)))),
IIntegrate(514,Int(Times(Power(x_,m_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,Power(x_,$p("mn",true)))),q_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(x,Plus(m,Times(CN1,n,q))),Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(d,Times(c,Power(x,n))),q)),x),And(FreeQ(List(a,b,c,d,m,n,p),x),EqQ($s("mn"),Negate(n)),IntegerQ(q),Or(PosQ(n),Not(IntegerQ(p)))))),
IIntegrate(515,Int(Times(Power(x_,m_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,Power(x_,$p("mn",true)))),q_),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(x,Times(n,FracPart(q))),Power(Plus(c,Times(d,Power(Power(x,n),-1))),FracPart(q)),Power(Power(Plus(d,Times(c,Power(x,n))),FracPart(q)),-1)),Int(Times(Power(x,Plus(m,Times(CN1,n,q))),Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(d,Times(c,Power(x,n))),q)),x),x),And(FreeQ(List(a,b,c,d,m,n,p,q),x),EqQ($s("mn"),Negate(n)),Not(IntegerQ(q)),Not(IntegerQ(p))))),
IIntegrate(516,Int(Times(Power(Times(e_,x_),m_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,$p("mn",true)))),q_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(e,IntPart(m)),Power(Times(e,x),FracPart(m)),Power(Power(x,FracPart(m)),-1)),Int(Times(Power(x,m),Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(Power(x,n),-1))),q)),x),x),And(FreeQ(List(a,b,c,d,e,m,n,p,q),x),EqQ($s("mn"),Negate(n))))),
IIntegrate(517,Int(Times(u_DEFAULT,Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_DEFAULT))),q_DEFAULT),Power(Plus($p("a1"),Times($p("b1",true),Power(x_,$p("non2",true)))),p_DEFAULT),Power(Plus($p("a2"),Times($p("b2",true),Power(x_,$p("non2",true)))),p_DEFAULT)),x_Symbol),
    Condition(Int(Times(u,Power(Plus(Times($s("a1"),$s("a2")),Times($s("b1"),$s("b2"),Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),q)),x),And(FreeQ(List($s("a1"),$s("b1"),$s("a2"),$s("b2"),c,d,n,p,q),x),EqQ($s("non2"),Times(C1D2,n)),EqQ(Plus(Times($s("a2"),$s("b1")),Times($s("a1"),$s("b2"))),C0),Or(IntegerQ(p),And(GtQ($s("a1"),C0),GtQ($s("a2"),C0)))))),
IIntegrate(518,Int(Times(u_DEFAULT,Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_DEFAULT)),Times(e_DEFAULT,Power(x_,$p("n2",true)))),q_DEFAULT),Power(Plus($p("a1"),Times($p("b1",true),Power(x_,$p("non2",true)))),p_DEFAULT),Power(Plus($p("a2"),Times($p("b2",true),Power(x_,$p("non2",true)))),p_DEFAULT)),x_Symbol),
    Condition(Int(Times(u,Power(Plus(Times($s("a1"),$s("a2")),Times($s("b1"),$s("b2"),Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n)),Times(e,Power(x,Times(C2,n)))),q)),x),And(FreeQ(List($s("a1"),$s("b1"),$s("a2"),$s("b2"),c,d,e,n,p,q),x),EqQ($s("non2"),Times(C1D2,n)),EqQ($s("n2"),Times(C2,n)),EqQ(Plus(Times($s("a2"),$s("b1")),Times($s("a1"),$s("b2"))),C0),Or(IntegerQ(p),And(GtQ($s("a1"),C0),GtQ($s("a2"),C0)))))),
IIntegrate(519,Int(Times(u_DEFAULT,Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_DEFAULT))),q_DEFAULT),Power(Plus($p("a1"),Times($p("b1",true),Power(x_,$p("non2",true)))),p_),Power(Plus($p("a2"),Times($p("b2",true),Power(x_,$p("non2",true)))),p_)),x_Symbol),
    Condition(Dist(Times(Power(Plus($s("a1"),Times($s("b1"),Power(x,Times(C1D2,n)))),FracPart(p)),Power(Plus($s("a2"),Times($s("b2"),Power(x,Times(C1D2,n)))),FracPart(p)),Power(Power(Plus(Times($s("a1"),$s("a2")),Times($s("b1"),$s("b2"),Power(x,n))),FracPart(p)),-1)),Int(Times(u,Power(Plus(Times($s("a1"),$s("a2")),Times($s("b1"),$s("b2"),Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),q)),x),x),And(FreeQ(List($s("a1"),$s("b1"),$s("a2"),$s("b2"),c,d,n,p,q),x),EqQ($s("non2"),Times(C1D2,n)),EqQ(Plus(Times($s("a2"),$s("b1")),Times($s("a1"),$s("b2"))),C0),Not(And(EqQ(n,C2),IGtQ(q,C0)))))),
IIntegrate(520,Int(Times(u_DEFAULT,Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_DEFAULT)),Times(e_DEFAULT,Power(x_,$p("n2",true)))),q_DEFAULT),Power(Plus($p("a1"),Times($p("b1",true),Power(x_,$p("non2",true)))),p_DEFAULT),Power(Plus($p("a2"),Times($p("b2",true),Power(x_,$p("non2",true)))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(Plus($s("a1"),Times($s("b1"),Power(x,Times(C1D2,n)))),FracPart(p)),Power(Plus($s("a2"),Times($s("b2"),Power(x,Times(C1D2,n)))),FracPart(p)),Power(Power(Plus(Times($s("a1"),$s("a2")),Times($s("b1"),$s("b2"),Power(x,n))),FracPart(p)),-1)),Int(Times(u,Power(Plus(Times($s("a1"),$s("a2")),Times($s("b1"),$s("b2"),Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n)),Times(e,Power(x,Times(C2,n)))),q)),x),x),And(FreeQ(List($s("a1"),$s("b1"),$s("a2"),$s("b2"),c,d,e,n,p,q),x),EqQ($s("non2"),Times(C1D2,n)),EqQ($s("n2"),Times(C2,n)),EqQ(Plus(Times($s("a2"),$s("b1")),Times($s("a1"),$s("b2"))),C0)))),
IIntegrate(521,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_DEFAULT),Power(Plus(e_,Times(f_DEFAULT,Power(x_,n_))),r_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),q),Power(Plus(e,Times(f,Power(x,n))),r)),x),x),And(FreeQ(List(a,b,c,d,e,f,n),x),IGtQ(p,C0),IGtQ(q,C0),IGtQ(r,C0)))),
IIntegrate(522,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),-1),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),-1),Plus(e_,Times(f_DEFAULT,Power(x_,n_)))),x_Symbol),
    Condition(Plus(Dist(Times(Plus(Times(b,e),Times(CN1,a,f)),Power(Plus(Times(b,c),Times(CN1,a,d)),-1)),Int(Power(Plus(a,Times(b,Power(x,n))),-1),x),x),Negate(Dist(Times(Plus(Times(d,e),Times(CN1,c,f)),Power(Plus(Times(b,c),Times(CN1,a,d)),-1)),Int(Power(Plus(c,Times(d,Power(x,n))),-1),x),x))),FreeQ(List(a,b,c,d,e,f,n),x))),
IIntegrate(523,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),-1),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),CN1D2),Plus(e_,Times(f_DEFAULT,Power(x_,n_)))),x_Symbol),
    Condition(Plus(Dist(Times(f,Power(b,-1)),Int(Power(Plus(c,Times(d,Power(x,n))),CN1D2),x),x),Dist(Times(Plus(Times(b,e),Times(CN1,a,f)),Power(b,-1)),Int(Power(Times(Plus(a,Times(b,Power(x,n))),Sqrt(Plus(c,Times(d,Power(x,n))))),-1),x),x)),FreeQ(List(a,b,c,d,e,f,n),x))),
IIntegrate(524,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),CN1D2),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),CN1D2),Plus(e_,Times(f_DEFAULT,Power(x_,n_)))),x_Symbol),
    Condition(Plus(Dist(Times(f,Power(b,-1)),Int(Times(Sqrt(Plus(a,Times(b,Power(x,n)))),Power(Plus(c,Times(d,Power(x,n))),CN1D2)),x),x),Dist(Times(Plus(Times(b,e),Times(CN1,a,f)),Power(b,-1)),Int(Power(Times(Sqrt(Plus(a,Times(b,Power(x,n)))),Sqrt(Plus(c,Times(d,Power(x,n))))),-1),x),x)),And(FreeQ(List(a,b,c,d,e,f,n),x),Not(And(EqQ(n,C2),Or(And(PosQ(Times(b,Power(a,-1))),PosQ(Times(d,Power(c,-1)))),And(NegQ(Times(b,Power(a,-1))),Or(PosQ(Times(d,Power(c,-1))),And(GtQ(a,C0),Or(Not(GtQ(c,C0)),SimplerSqrtQ(Times(CN1,b,Power(a,-1)),Times(CN1,d,Power(c,-1))))))))))))),
IIntegrate(525,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Sqr(x_))),CN1D2),Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),QQ(-3L,2L)),Plus(e_,Times(f_DEFAULT,Sqr(x_)))),x_Symbol),
    Condition(Plus(Dist(Times(Plus(Times(b,e),Times(CN1,a,f)),Power(Plus(Times(b,c),Times(CN1,a,d)),-1)),Int(Power(Times(Sqrt(Plus(a,Times(b,Sqr(x)))),Sqrt(Plus(c,Times(d,Sqr(x))))),-1),x),x),Negate(Dist(Times(Plus(Times(d,e),Times(CN1,c,f)),Power(Plus(Times(b,c),Times(CN1,a,d)),-1)),Int(Times(Sqrt(Plus(a,Times(b,Sqr(x)))),Power(Plus(c,Times(d,Sqr(x))),QQ(-3L,2L))),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),PosQ(Times(b,Power(a,-1))),PosQ(Times(d,Power(c,-1)))))),
IIntegrate(526,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_DEFAULT),Plus(e_,Times(f_DEFAULT,Power(x_,n_)))),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Plus(Times(b,e),Times(CN1,a,f)),x,Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),q),Power(Times(a,b,n,Plus(p,C1)),-1)),x)),Dist(Power(Times(a,b,n,Plus(p,C1)),-1),Int(Times(Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),Plus(q,Negate(C1))),Simp(Plus(Times(c,Plus(Times(b,e,n,Plus(p,C1)),Times(b,e),Times(CN1,a,f))),Times(d,Plus(Times(b,e,n,Plus(p,C1)),Times(Plus(Times(b,e),Times(CN1,a,f)),Plus(Times(n,q),C1))),Power(x,n))),x)),x),x)),And(FreeQ(List(a,b,c,d,e,f,n),x),LtQ(p,CN1),GtQ(q,C0)))),
IIntegrate(527,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_DEFAULT),Plus(e_,Times(f_DEFAULT,Power(x_,n_)))),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Plus(Times(b,e),Times(CN1,a,f)),x,Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),Plus(q,C1)),Power(Times(a,n,Plus(Times(b,c),Times(CN1,a,d)),Plus(p,C1)),-1)),x)),Dist(Power(Times(a,n,Plus(Times(b,c),Times(CN1,a,d)),Plus(p,C1)),-1),Int(Times(Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),q),Simp(Plus(Times(c,Plus(Times(b,e),Times(CN1,a,f))),Times(e,n,Plus(Times(b,c),Times(CN1,a,d)),Plus(p,C1)),Times(d,Plus(Times(b,e),Times(CN1,a,f)),Plus(Times(n,Plus(p,q,C2)),C1),Power(x,n))),x)),x),x)),And(FreeQ(List(a,b,c,d,e,f,n,q),x),LtQ(p,CN1)))),
IIntegrate(528,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_DEFAULT),Plus(e_,Times(f_DEFAULT,Power(x_,n_)))),x_Symbol),
    Condition(Plus(Simp(Times(f,x,Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),q),Power(Times(b,Plus(Times(n,Plus(p,q,C1)),C1)),-1)),x),Dist(Power(Times(b,Plus(Times(n,Plus(p,q,C1)),C1)),-1),Int(Times(Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),Plus(q,Negate(C1))),Simp(Plus(Times(c,Plus(Times(b,e),Times(CN1,a,f),Times(b,e,n,Plus(p,q,C1)))),Times(Plus(Times(d,Plus(Times(b,e),Times(CN1,a,f))),Times(f,n,q,Plus(Times(b,c),Times(CN1,a,d))),Times(b,d,e,n,Plus(p,q,C1))),Power(x,n))),x)),x),x)),And(FreeQ(List(a,b,c,d,e,f,n,p),x),GtQ(q,C0),NeQ(Plus(Times(n,Plus(p,q,C1)),C1),C0)))),
IIntegrate(529,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(x_,4))),QQ(-3L,4L)),Power(Plus(c_,Times(d_DEFAULT,Power(x_,4))),-1),Plus(e_,Times(f_DEFAULT,Power(x_,4)))),x_Symbol),
    Condition(Plus(Dist(Times(Plus(Times(b,e),Times(CN1,a,f)),Power(Plus(Times(b,c),Times(CN1,a,d)),-1)),Int(Power(Plus(a,Times(b,Power(x,4))),QQ(-3L,4L)),x),x),Negate(Dist(Times(Plus(Times(d,e),Times(CN1,c,f)),Power(Plus(Times(b,c),Times(CN1,a,d)),-1)),Int(Times(Power(Plus(a,Times(b,Power(x,4))),C1D4),Power(Plus(c,Times(d,Power(x,4))),-1)),x),x))),FreeQ(List(a,b,c,d,e,f),x))),
IIntegrate(530,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),-1),Plus(e_,Times(f_DEFAULT,Power(x_,n_)))),x_Symbol),
    Condition(Plus(Dist(Times(f,Power(d,-1)),Int(Power(Plus(a,Times(b,Power(x,n))),p),x),x),Dist(Times(Plus(Times(d,e),Times(CN1,c,f)),Power(d,-1)),Int(Times(Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),-1)),x),x)),FreeQ(List(a,b,c,d,e,f,p,n),x))),
IIntegrate(531,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_DEFAULT),Plus(e_,Times(f_DEFAULT,Power(x_,n_)))),x_Symbol),
    Condition(Plus(Dist(e,Int(Times(Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),q)),x),x),Dist(f,Int(Times(Power(x,n),Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),q)),x),x)),FreeQ(List(a,b,c,d,e,f,n,p,q),x))),
IIntegrate(532,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Sqr(x_))),-1),Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),-1),Power(Plus(e_,Times(f_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Plus(Dist(Times(b,Power(Plus(Times(b,c),Times(CN1,a,d)),-1)),Int(Power(Times(Plus(a,Times(b,Sqr(x))),Sqrt(Plus(e,Times(f,Sqr(x))))),-1),x),x),Negate(Dist(Times(d,Power(Plus(Times(b,c),Times(CN1,a,d)),-1)),Int(Power(Times(Plus(c,Times(d,Sqr(x))),Sqrt(Plus(e,Times(f,Sqr(x))))),-1),x),x))),FreeQ(List(a,b,c,d,e,f),x))),
IIntegrate(533,Int(Times(Power(x_,-2),Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),-1),Power(Plus(e_,Times(f_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Plus(Dist(Power(c,-1),Int(Power(Times(Sqr(x),Sqrt(Plus(e,Times(f,Sqr(x))))),-1),x),x),Negate(Dist(Times(d,Power(c,-1)),Int(Power(Times(Plus(c,Times(d,Sqr(x))),Sqrt(Plus(e,Times(f,Sqr(x))))),-1),x),x))),And(FreeQ(List(c,d,e,f),x),NeQ(Plus(Times(d,e),Times(CN1,c,f)),C0)))),
IIntegrate(534,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Sqr(x_))),-1),Sqrt(Plus(c_,Times(d_DEFAULT,Sqr(x_)))),Sqrt(Plus(e_,Times(f_DEFAULT,Sqr(x_))))),x_Symbol),
    Condition(Plus(Dist(Times(d,Power(b,-1)),Int(Times(Sqrt(Plus(e,Times(f,Sqr(x)))),Power(Plus(c,Times(d,Sqr(x))),CN1D2)),x),x),Dist(Times(Plus(Times(b,c),Times(CN1,a,d)),Power(b,-1)),Int(Times(Sqrt(Plus(e,Times(f,Sqr(x)))),Power(Times(Plus(a,Times(b,Sqr(x))),Sqrt(Plus(c,Times(d,Sqr(x))))),-1)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),GtQ(Times(d,Power(c,-1)),C0),GtQ(Times(f,Power(e,-1)),C0),Not(SimplerSqrtQ(Times(d,Power(c,-1)),Times(f,Power(e,-1))))))),
IIntegrate(535,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Sqr(x_))),-1),Sqrt(Plus(c_,Times(d_DEFAULT,Sqr(x_)))),Sqrt(Plus(e_,Times(f_DEFAULT,Sqr(x_))))),x_Symbol),
    Condition(Plus(Dist(Times(d,Power(b,-1)),Int(Times(Sqrt(Plus(e,Times(f,Sqr(x)))),Power(Plus(c,Times(d,Sqr(x))),CN1D2)),x),x),Dist(Times(Plus(Times(b,c),Times(CN1,a,d)),Power(b,-1)),Int(Times(Sqrt(Plus(e,Times(f,Sqr(x)))),Power(Times(Plus(a,Times(b,Sqr(x))),Sqrt(Plus(c,Times(d,Sqr(x))))),-1)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),Not(SimplerSqrtQ(Times(CN1,f,Power(e,-1)),Times(CN1,d,Power(c,-1))))))),
IIntegrate(536,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Sqr(x_))),-1),Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),CN1D2),Power(Plus(e_,Times(f_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Plus(Negate(Dist(Times(f,Power(Plus(Times(b,e),Times(CN1,a,f)),-1)),Int(Power(Times(Sqrt(Plus(c,Times(d,Sqr(x)))),Sqrt(Plus(e,Times(f,Sqr(x))))),-1),x),x)),Dist(Times(b,Power(Plus(Times(b,e),Times(CN1,a,f)),-1)),Int(Times(Sqrt(Plus(e,Times(f,Sqr(x)))),Power(Times(Plus(a,Times(b,Sqr(x))),Sqrt(Plus(c,Times(d,Sqr(x))))),-1)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),GtQ(Times(d,Power(c,-1)),C0),GtQ(Times(f,Power(e,-1)),C0),Not(SimplerSqrtQ(Times(d,Power(c,-1)),Times(f,Power(e,-1))))))),
IIntegrate(537,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Sqr(x_))),-1),Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),CN1D2),Power(Plus(e_,Times(f_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Simp(Times(C1,EllipticPi(Times(b,c,Power(Times(a,d),-1)),ArcSin(Times(Rt(Times(CN1,d,Power(c,-1)),C2),x)),Times(c,f,Power(Times(d,e),-1))),Power(Times(a,Sqrt(c),Sqrt(e),Rt(Times(CN1,d,Power(c,-1)),C2)),-1)),x),And(FreeQ(List(a,b,c,d,e,f),x),Not(GtQ(Times(d,Power(c,-1)),C0)),GtQ(c,C0),GtQ(e,C0),Not(And(Not(GtQ(Times(f,Power(e,-1)),C0)),SimplerSqrtQ(Times(CN1,f,Power(e,-1)),Times(CN1,d,Power(c,-1)))))))),
IIntegrate(538,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Sqr(x_))),-1),Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),CN1D2),Power(Plus(e_,Times(f_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Dist(Times(Sqrt(Plus(C1,Times(d,Sqr(x),Power(c,-1)))),Power(Plus(c,Times(d,Sqr(x))),CN1D2)),Int(Power(Times(Plus(a,Times(b,Sqr(x))),Sqrt(Plus(C1,Times(d,Sqr(x),Power(c,-1)))),Sqrt(Plus(e,Times(f,Sqr(x))))),-1),x),x),And(FreeQ(List(a,b,c,d,e,f),x),Not(GtQ(c,C0))))),
IIntegrate(539,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Sqr(x_))),-1),Sqrt(Plus(c_,Times(d_DEFAULT,Sqr(x_)))),Power(Plus(e_,Times(f_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Simp(Times(c,Sqrt(Plus(e,Times(f,Sqr(x)))),EllipticPi(Plus(C1,Times(CN1,b,c,Power(Times(a,d),-1))),ArcTan(Times(Rt(Times(d,Power(c,-1)),C2),x)),Plus(C1,Times(CN1,c,f,Power(Times(d,e),-1)))),Power(Times(a,e,Rt(Times(d,Power(c,-1)),C2),Sqrt(Plus(c,Times(d,Sqr(x)))),Sqrt(Times(c,Plus(e,Times(f,Sqr(x))),Power(Times(e,Plus(c,Times(d,Sqr(x)))),-1)))),-1)),x),And(FreeQ(List(a,b,c,d,e,f),x),PosQ(Times(d,Power(c,-1)))))),
IIntegrate(540,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Sqr(x_))),-1),Sqrt(Plus(c_,Times(d_DEFAULT,Sqr(x_)))),Power(Plus(e_,Times(f_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Plus(Dist(Times(d,Power(b,-1)),Int(Power(Times(Sqrt(Plus(c,Times(d,Sqr(x)))),Sqrt(Plus(e,Times(f,Sqr(x))))),-1),x),x),Dist(Times(Plus(Times(b,c),Times(CN1,a,d)),Power(b,-1)),Int(Power(Times(Plus(a,Times(b,Sqr(x))),Sqrt(Plus(c,Times(d,Sqr(x)))),Sqrt(Plus(e,Times(f,Sqr(x))))),-1),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),NegQ(Times(d,Power(c,-1)))))),
IIntegrate(541,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Sqr(x_))),-1),Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),QQ(-3L,2L)),Sqrt(Plus(e_,Times(f_DEFAULT,Sqr(x_))))),x_Symbol),
    Condition(Plus(Dist(Times(b,Power(Plus(Times(b,c),Times(CN1,a,d)),-1)),Int(Times(Sqrt(Plus(e,Times(f,Sqr(x)))),Power(Times(Plus(a,Times(b,Sqr(x))),Sqrt(Plus(c,Times(d,Sqr(x))))),-1)),x),x),Negate(Dist(Times(d,Power(Plus(Times(b,c),Times(CN1,a,d)),-1)),Int(Times(Sqrt(Plus(e,Times(f,Sqr(x)))),Power(Plus(c,Times(d,Sqr(x))),QQ(-3L,2L))),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),PosQ(Times(d,Power(c,-1))),PosQ(Times(f,Power(e,-1)))))),
IIntegrate(542,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Sqr(x_))),-1),Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),QQ(-3L,2L)),Power(Plus(e_,Times(f_DEFAULT,Sqr(x_))),QQ(3L,2L))),x_Symbol),
    Condition(Plus(Dist(Times(Plus(Times(b,e),Times(CN1,a,f)),Power(Plus(Times(b,c),Times(CN1,a,d)),-1)),Int(Times(Sqrt(Plus(e,Times(f,Sqr(x)))),Power(Times(Plus(a,Times(b,Sqr(x))),Sqrt(Plus(c,Times(d,Sqr(x))))),-1)),x),x),Negate(Dist(Times(Plus(Times(d,e),Times(CN1,c,f)),Power(Plus(Times(b,c),Times(CN1,a,d)),-1)),Int(Times(Sqrt(Plus(e,Times(f,Sqr(x)))),Power(Plus(c,Times(d,Sqr(x))),QQ(-3L,2L))),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),PosQ(Times(d,Power(c,-1))),PosQ(Times(f,Power(e,-1)))))),
IIntegrate(543,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Sqr(x_))),-1),Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),QQ(3L,2L)),Sqrt(Plus(e_,Times(f_DEFAULT,Sqr(x_))))),x_Symbol),
    Condition(Plus(Dist(Times(Sqr(Plus(Times(b,c),Times(CN1,a,d))),Power(b,-2)),Int(Times(Sqrt(Plus(e,Times(f,Sqr(x)))),Power(Times(Plus(a,Times(b,Sqr(x))),Sqrt(Plus(c,Times(d,Sqr(x))))),-1)),x),x),Dist(Times(d,Power(b,-2)),Int(Times(Plus(Times(C2,b,c),Times(CN1,a,d),Times(b,d,Sqr(x))),Sqrt(Plus(e,Times(f,Sqr(x)))),Power(Plus(c,Times(d,Sqr(x))),CN1D2)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),PosQ(Times(d,Power(c,-1))),PosQ(Times(f,Power(e,-1)))))),
IIntegrate(544,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Sqr(x_))),-1),Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),q_),Power(Plus(e_,Times(f_DEFAULT,Sqr(x_))),r_)),x_Symbol),
    Condition(Plus(Dist(Times(b,Plus(Times(b,e),Times(CN1,a,f)),Power(Plus(Times(b,c),Times(CN1,a,d)),-2)),Int(Times(Power(Plus(c,Times(d,Sqr(x))),Plus(q,C2)),Power(Plus(e,Times(f,Sqr(x))),Plus(r,Negate(C1))),Power(Plus(a,Times(b,Sqr(x))),-1)),x),x),Negate(Dist(Power(Plus(Times(b,c),Times(CN1,a,d)),-2),Int(Times(Power(Plus(c,Times(d,Sqr(x))),q),Power(Plus(e,Times(f,Sqr(x))),Plus(r,Negate(C1))),Plus(Times(C2,b,c,d,e),Times(CN1,a,Sqr(d),e),Times(CN1,b,Sqr(c),f),Times(Sqr(d),Plus(Times(b,e),Times(CN1,a,f)),Sqr(x)))),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),LtQ(q,CN1),GtQ(r,C1)))),
IIntegrate(545,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Sqr(x_))),-1),Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),q_),Power(Plus(e_,Times(f_DEFAULT,Sqr(x_))),r_)),x_Symbol),
    Condition(Plus(Dist(Times(d,Power(b,-1)),Int(Times(Power(Plus(c,Times(d,Sqr(x))),Plus(q,Negate(C1))),Power(Plus(e,Times(f,Sqr(x))),r)),x),x),Dist(Times(Plus(Times(b,c),Times(CN1,a,d)),Power(b,-1)),Int(Times(Power(Plus(c,Times(d,Sqr(x))),Plus(q,Negate(C1))),Power(Plus(e,Times(f,Sqr(x))),r),Power(Plus(a,Times(b,Sqr(x))),-1)),x),x)),And(FreeQ(List(a,b,c,d,e,f,r),x),GtQ(q,C1)))),
IIntegrate(546,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Sqr(x_))),-1),Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),q_),Power(Plus(e_,Times(f_DEFAULT,Sqr(x_))),r_)),x_Symbol),
    Condition(Plus(Dist(Times(Sqr(b),Power(Plus(Times(b,c),Times(CN1,a,d)),-2)),Int(Times(Power(Plus(c,Times(d,Sqr(x))),Plus(q,C2)),Power(Plus(e,Times(f,Sqr(x))),r),Power(Plus(a,Times(b,Sqr(x))),-1)),x),x),Negate(Dist(Times(d,Power(Plus(Times(b,c),Times(CN1,a,d)),-2)),Int(Times(Power(Plus(c,Times(d,Sqr(x))),q),Power(Plus(e,Times(f,Sqr(x))),r),Plus(Times(C2,b,c),Times(CN1,a,d),Times(b,d,Sqr(x)))),x),x))),And(FreeQ(List(a,b,c,d,e,f,r),x),LtQ(q,CN1)))),
IIntegrate(547,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Sqr(x_))),-1),Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),q_),Power(Plus(e_,Times(f_DEFAULT,Sqr(x_))),r_)),x_Symbol),
    Condition(Plus(Negate(Dist(Times(d,Power(Plus(Times(b,c),Times(CN1,a,d)),-1)),Int(Times(Power(Plus(c,Times(d,Sqr(x))),q),Power(Plus(e,Times(f,Sqr(x))),r)),x),x)),Dist(Times(b,Power(Plus(Times(b,c),Times(CN1,a,d)),-1)),Int(Times(Power(Plus(c,Times(d,Sqr(x))),Plus(q,C1)),Power(Plus(e,Times(f,Sqr(x))),r),Power(Plus(a,Times(b,Sqr(x))),-1)),x),x)),And(FreeQ(List(a,b,c,d,e,f,r),x),LeQ(q,CN1)))),
IIntegrate(548,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Sqr(x_))),-2),Sqrt(Plus(c_,Times(d_DEFAULT,Sqr(x_)))),Sqrt(Plus(e_,Times(f_DEFAULT,Sqr(x_))))),x_Symbol),
    Condition(Plus(Simp(Times(x,Sqrt(Plus(c,Times(d,Sqr(x)))),Sqrt(Plus(e,Times(f,Sqr(x)))),Power(Times(C2,a,Plus(a,Times(b,Sqr(x)))),-1)),x),Dist(Times(d,f,Power(Times(C2,a,Sqr(b)),-1)),Int(Times(Plus(a,Times(CN1,b,Sqr(x))),Power(Times(Sqrt(Plus(c,Times(d,Sqr(x)))),Sqrt(Plus(e,Times(f,Sqr(x))))),-1)),x),x),Dist(Times(Plus(Times(Sqr(b),c,e),Times(CN1,Sqr(a),d,f)),Power(Times(C2,a,Sqr(b)),-1)),Int(Power(Times(Plus(a,Times(b,Sqr(x))),Sqrt(Plus(c,Times(d,Sqr(x)))),Sqrt(Plus(e,Times(f,Sqr(x))))),-1),x),x)),FreeQ(List(a,b,c,d,e,f),x))),
IIntegrate(549,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Sqr(x_))),-2),Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),CN1D2),Power(Plus(e_,Times(f_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Plus(Simp(Times(Sqr(b),x,Sqrt(Plus(c,Times(d,Sqr(x)))),Sqrt(Plus(e,Times(f,Sqr(x)))),Power(Times(C2,a,Plus(Times(b,c),Times(CN1,a,d)),Plus(Times(b,e),Times(CN1,a,f)),Plus(a,Times(b,Sqr(x)))),-1)),x),Negate(Dist(Times(d,f,Power(Times(C2,a,Plus(Times(b,c),Times(CN1,a,d)),Plus(Times(b,e),Times(CN1,a,f))),-1)),Int(Times(Plus(a,Times(b,Sqr(x))),Power(Times(Sqrt(Plus(c,Times(d,Sqr(x)))),Sqrt(Plus(e,Times(f,Sqr(x))))),-1)),x),x)),Dist(Times(Plus(Times(Sqr(b),c,e),Times(C3,Sqr(a),d,f),Times(CN1,C2,a,b,Plus(Times(d,e),Times(c,f)))),Power(Times(C2,a,Plus(Times(b,c),Times(CN1,a,d)),Plus(Times(b,e),Times(CN1,a,f))),-1)),Int(Power(Times(Plus(a,Times(b,Sqr(x))),Sqrt(Plus(c,Times(d,Sqr(x)))),Sqrt(Plus(e,Times(f,Sqr(x))))),-1),x),x)),FreeQ(List(a,b,c,d,e,f),x))),
IIntegrate(550,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_),Power(Plus(e_,Times(f_DEFAULT,Power(x_,n_))),r_)),x_Symbol),
    Condition(Plus(Dist(Times(d,Power(b,-1)),Int(Times(Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),Plus(q,Negate(C1))),Power(Plus(e,Times(f,Power(x,n))),r)),x),x),Dist(Times(Plus(Times(b,c),Times(CN1,a,d)),Power(b,-1)),Int(Times(Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),Plus(q,Negate(C1))),Power(Plus(e,Times(f,Power(x,n))),r)),x),x)),And(FreeQ(List(a,b,c,d,e,f,n,r),x),ILtQ(p,C0),GtQ(q,C0))))
  );
}
