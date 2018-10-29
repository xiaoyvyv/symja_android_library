package org.matheclipse.core.integrate.rubi;


import org.matheclipse.core.interfaces.IAST;

import static org.matheclipse.core.expression.F.$p;
import static org.matheclipse.core.expression.F.$s;
import static org.matheclipse.core.expression.F.And;
import static org.matheclipse.core.expression.F.C0;
import static org.matheclipse.core.expression.F.C1;
import static org.matheclipse.core.expression.F.C1D2;
import static org.matheclipse.core.expression.F.C2;
import static org.matheclipse.core.expression.F.CN1;
import static org.matheclipse.core.expression.F.CN1D2;
import static org.matheclipse.core.expression.F.CN2;
import static org.matheclipse.core.expression.F.Coefficient;
import static org.matheclipse.core.expression.F.Condition;
import static org.matheclipse.core.expression.F.Denominator;
import static org.matheclipse.core.expression.F.FreeQ;
import static org.matheclipse.core.expression.F.GCD;
import static org.matheclipse.core.expression.F.IIntegrate;
import static org.matheclipse.core.expression.F.IntegerQ;
import static org.matheclipse.core.expression.F.List;
import static org.matheclipse.core.expression.F.Negate;
import static org.matheclipse.core.expression.F.Not;
import static org.matheclipse.core.expression.F.Or;
import static org.matheclipse.core.expression.F.Plus;
import static org.matheclipse.core.expression.F.Power;
import static org.matheclipse.core.expression.F.QQ;
import static org.matheclipse.core.expression.F.Set;
import static org.matheclipse.core.expression.F.Simplify;
import static org.matheclipse.core.expression.F.Sqr;
import static org.matheclipse.core.expression.F.Sqrt;
import static org.matheclipse.core.expression.F.Times;
import static org.matheclipse.core.expression.F.Unequal;
import static org.matheclipse.core.expression.F.With;
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
import static org.matheclipse.core.expression.F.g;
import static org.matheclipse.core.expression.F.g_;
import static org.matheclipse.core.expression.F.g_DEFAULT;
import static org.matheclipse.core.expression.F.k;
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
import static org.matheclipse.core.expression.F.v;
import static org.matheclipse.core.expression.F.v_;
import static org.matheclipse.core.expression.F.w;
import static org.matheclipse.core.expression.F.w_;
import static org.matheclipse.core.expression.F.x;
import static org.matheclipse.core.expression.F.x_;
import static org.matheclipse.core.expression.F.x_Symbol;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Dist;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.EqQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.ExpandIntegrand;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.FracPart;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.FractionQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.GtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.IGtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.ILtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Int;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.IntPart;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.IntegersQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.LeQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.LinearQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.LtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.NeQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.NegQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.PosQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.RationalQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Simp;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.SimplerQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Subst;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.SumQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Unintegrable;

/** 
 * IndefiniteIntegrationRules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class IntRules11 { 
  public static IAST RULES = List( 
IIntegrate(551,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_),Power(Plus(e_,Times(f_DEFAULT,Power(x_,n_))),r_)),x_Symbol),
    Condition(Plus(Dist(Times(b,Power(Plus(Times(b,c),Times(CN1,a,d)),-1)),Int(Times(Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),Plus(q,C1)),Power(Plus(e,Times(f,Power(x,n))),r)),x),x),Negate(Dist(Times(d,Power(Plus(Times(b,c),Times(CN1,a,d)),-1)),Int(Times(Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),q),Power(Plus(e,Times(f,Power(x,n))),r)),x),x))),And(FreeQ(List(a,b,c,d,e,f,n,q),x),ILtQ(p,C0),LeQ(q,CN1)))),
IIntegrate(552,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Sqr(x_))),CN1D2),Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),CN1D2),Power(Plus(e_,Times(f_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Dist(Times(Sqrt(Plus(c,Times(d,Sqr(x)))),Sqrt(Times(a,Plus(e,Times(f,Sqr(x))),Power(Times(e,Plus(a,Times(b,Sqr(x)))),-1))),Power(Times(c,Sqrt(Plus(e,Times(f,Sqr(x)))),Sqrt(Times(a,Plus(c,Times(d,Sqr(x))),Power(Times(c,Plus(a,Times(b,Sqr(x)))),-1)))),-1)),Subst(Int(Power(Times(Sqrt(Plus(C1,Times(CN1,Plus(Times(b,c),Times(CN1,a,d)),Sqr(x),Power(c,-1)))),Sqrt(Plus(C1,Times(CN1,Plus(Times(b,e),Times(CN1,a,f)),Sqr(x),Power(e,-1))))),-1),x),x,Times(x,Power(Plus(a,Times(b,Sqr(x))),CN1D2))),x),FreeQ(List(a,b,c,d,e,f),x))),
IIntegrate(553,Int(Times(Sqrt(Plus(a_,Times(b_DEFAULT,Sqr(x_)))),Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),CN1D2),Power(Plus(e_,Times(f_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Dist(Times(a,Sqrt(Plus(c,Times(d,Sqr(x)))),Sqrt(Times(a,Plus(e,Times(f,Sqr(x))),Power(Times(e,Plus(a,Times(b,Sqr(x)))),-1))),Power(Times(c,Sqrt(Plus(e,Times(f,Sqr(x)))),Sqrt(Times(a,Plus(c,Times(d,Sqr(x))),Power(Times(c,Plus(a,Times(b,Sqr(x)))),-1)))),-1)),Subst(Int(Power(Times(Plus(C1,Times(CN1,b,Sqr(x))),Sqrt(Plus(C1,Times(CN1,Plus(Times(b,c),Times(CN1,a,d)),Sqr(x),Power(c,-1)))),Sqrt(Plus(C1,Times(CN1,Plus(Times(b,e),Times(CN1,a,f)),Sqr(x),Power(e,-1))))),-1),x),x,Times(x,Power(Plus(a,Times(b,Sqr(x))),CN1D2))),x),FreeQ(List(a,b,c,d,e,f),x))),
IIntegrate(554,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Sqr(x_))),QQ(-3L,2L)),Sqrt(Plus(c_,Times(d_DEFAULT,Sqr(x_)))),Power(Plus(e_,Times(f_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Dist(Times(Sqrt(Plus(c,Times(d,Sqr(x)))),Sqrt(Times(a,Plus(e,Times(f,Sqr(x))),Power(Times(e,Plus(a,Times(b,Sqr(x)))),-1))),Power(Times(a,Sqrt(Plus(e,Times(f,Sqr(x)))),Sqrt(Times(a,Plus(c,Times(d,Sqr(x))),Power(Times(c,Plus(a,Times(b,Sqr(x)))),-1)))),-1)),Subst(Int(Times(Sqrt(Plus(C1,Times(CN1,Plus(Times(b,c),Times(CN1,a,d)),Sqr(x),Power(c,-1)))),Power(Plus(C1,Times(CN1,Plus(Times(b,e),Times(CN1,a,f)),Sqr(x),Power(e,-1))),CN1D2)),x),x,Times(x,Power(Plus(a,Times(b,Sqr(x))),CN1D2))),x),FreeQ(List(a,b,c,d,e,f),x))),
IIntegrate(555,Int(Times(Sqrt(Plus(a_,Times(b_DEFAULT,Sqr(x_)))),Sqrt(Plus(c_,Times(d_DEFAULT,Sqr(x_)))),Power(Plus(e_,Times(f_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Plus(Simp(Times(d,x,Sqrt(Plus(a,Times(b,Sqr(x)))),Sqrt(Plus(e,Times(f,Sqr(x)))),Power(Times(C2,f,Sqrt(Plus(c,Times(d,Sqr(x))))),-1)),x),Negate(Dist(Times(c,Plus(Times(d,e),Times(CN1,c,f)),Power(Times(C2,f),-1)),Int(Times(Sqrt(Plus(a,Times(b,Sqr(x)))),Power(Times(Power(Plus(c,Times(d,Sqr(x))),QQ(3L,2L)),Sqrt(Plus(e,Times(f,Sqr(x))))),-1)),x),x)),Dist(Times(b,c,Plus(Times(d,e),Times(CN1,c,f)),Power(Times(C2,d,f),-1)),Int(Power(Times(Sqrt(Plus(a,Times(b,Sqr(x)))),Sqrt(Plus(c,Times(d,Sqr(x)))),Sqrt(Plus(e,Times(f,Sqr(x))))),-1),x),x),Negate(Dist(Times(Plus(Times(b,d,e),Times(CN1,b,c,f),Times(CN1,a,d,f)),Power(Times(C2,d,f),-1)),Int(Times(Sqrt(Plus(c,Times(d,Sqr(x)))),Power(Times(Sqrt(Plus(a,Times(b,Sqr(x)))),Sqrt(Plus(e,Times(f,Sqr(x))))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),PosQ(Times(Plus(Times(d,e),Times(CN1,c,f)),Power(c,-1)))))),
IIntegrate(556,Int(Times(Sqrt(Plus(a_,Times(b_DEFAULT,Sqr(x_)))),Sqrt(Plus(c_,Times(d_DEFAULT,Sqr(x_)))),Power(Plus(e_,Times(f_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Plus(Simp(Times(x,Sqrt(Plus(a,Times(b,Sqr(x)))),Sqrt(Plus(c,Times(d,Sqr(x)))),Power(Times(C2,Sqrt(Plus(e,Times(f,Sqr(x))))),-1)),x),Dist(Times(e,Plus(Times(b,e),Times(CN1,a,f)),Power(Times(C2,f),-1)),Int(Times(Sqrt(Plus(c,Times(d,Sqr(x)))),Power(Times(Sqrt(Plus(a,Times(b,Sqr(x)))),Power(Plus(e,Times(f,Sqr(x))),QQ(3L,2L))),-1)),x),x),Dist(Times(Plus(Times(b,e),Times(CN1,a,f)),Plus(Times(d,e),Times(CN1,C2,c,f)),Power(Times(C2,Sqr(f)),-1)),Int(Power(Times(Sqrt(Plus(a,Times(b,Sqr(x)))),Sqrt(Plus(c,Times(d,Sqr(x)))),Sqrt(Plus(e,Times(f,Sqr(x))))),-1),x),x),Negate(Dist(Times(Plus(Times(b,d,e),Times(CN1,b,c,f),Times(CN1,a,d,f)),Power(Times(C2,Sqr(f)),-1)),Int(Times(Sqrt(Plus(e,Times(f,Sqr(x)))),Power(Times(Sqrt(Plus(a,Times(b,Sqr(x)))),Sqrt(Plus(c,Times(d,Sqr(x))))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),NegQ(Times(Plus(Times(d,e),Times(CN1,c,f)),Power(c,-1)))))),
IIntegrate(557,Int(Times(Sqrt(Plus(a_,Times(b_DEFAULT,Sqr(x_)))),Sqrt(Plus(c_,Times(d_DEFAULT,Sqr(x_)))),Power(Plus(e_,Times(f_DEFAULT,Sqr(x_))),QQ(-3L,2L))),x_Symbol),
    Condition(Plus(Dist(Times(b,Power(f,-1)),Int(Times(Sqrt(Plus(c,Times(d,Sqr(x)))),Power(Times(Sqrt(Plus(a,Times(b,Sqr(x)))),Sqrt(Plus(e,Times(f,Sqr(x))))),-1)),x),x),Negate(Dist(Times(Plus(Times(b,e),Times(CN1,a,f)),Power(f,-1)),Int(Times(Sqrt(Plus(c,Times(d,Sqr(x)))),Power(Times(Sqrt(Plus(a,Times(b,Sqr(x)))),Power(Plus(e,Times(f,Sqr(x))),QQ(3L,2L))),-1)),x),x))),FreeQ(List(a,b,c,d,e,f),x))),
IIntegrate(558,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_),Power(Plus(e_,Times(f_DEFAULT,Power(x_,n_))),r_)),x_Symbol),
    Condition(With(List(Set(u,ExpandIntegrand(Times(Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),q),Power(Plus(e,Times(f,Power(x,n))),r)),x))),Condition(Int(u,x),SumQ(u))),And(FreeQ(List(a,b,c,d,e,f,p,q,r),x),IGtQ(n,C0)))),
IIntegrate(559,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_),Power(Plus(e_,Times(f_DEFAULT,Power(x_,n_))),r_)),x_Symbol),
    Condition(Negate(Subst(Int(Times(Power(Plus(a,Times(b,Power(Power(x,n),-1))),p),Power(Plus(c,Times(d,Power(Power(x,n),-1))),q),Power(Plus(e,Times(f,Power(Power(x,n),-1))),r),Power(x,-2)),x),x,Power(x,-1))),And(FreeQ(List(a,b,c,d,e,f,p,q,r),x),ILtQ(n,C0)))),
IIntegrate(560,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_DEFAULT),Power(Plus(e_,Times(f_DEFAULT,Power(x_,n_))),r_DEFAULT)),x_Symbol),
    Condition(Unintegrable(Times(Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),q),Power(Plus(e,Times(f,Power(x,n))),r)),x),FreeQ(List(a,b,c,d,e,f,n,p,q,r),x))),
IIntegrate(561,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(u_,n_))),p_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,Power(v_,n_))),q_DEFAULT),Power(Plus(e_DEFAULT,Times(f_DEFAULT,Power(w_,n_))),r_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Coefficient(u,x,C1),-1),Subst(Int(Times(Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),q),Power(Plus(e,Times(f,Power(x,n))),r)),x),x,u),x),And(FreeQ(List(a,b,c,d,e,f,p,n,q,r),x),EqQ(u,v),EqQ(u,w),LinearQ(u,x),NeQ(u,x)))),
IIntegrate(562,Int(Times(Power(Plus(c_,Times(d_DEFAULT,Power(x_,$p("mn",true)))),q_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_DEFAULT),Power(Plus(e_,Times(f_DEFAULT,Power(x_,n_DEFAULT))),r_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(d,Times(c,Power(x,n))),q),Power(Plus(e,Times(f,Power(x,n))),r),Power(Power(x,Times(n,q)),-1)),x),And(FreeQ(List(a,b,c,d,e,f,n,p,r),x),EqQ($s("mn"),Negate(n)),IntegerQ(q)))),
IIntegrate(563,Int(Times(Power(Plus(c_,Times(d_DEFAULT,Power(x_,$p("mn",true)))),q_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_DEFAULT),Power(Plus(e_,Times(f_DEFAULT,Power(x_,n_DEFAULT))),r_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(x,Times(n,Plus(p,r))),Power(Plus(b,Times(a,Power(Power(x,n),-1))),p),Power(Plus(c,Times(d,Power(Power(x,n),-1))),q),Power(Plus(f,Times(e,Power(Power(x,n),-1))),r)),x),And(FreeQ(List(a,b,c,d,e,f,n,q),x),EqQ($s("mn"),Negate(n)),IntegerQ(p),IntegerQ(r)))),
IIntegrate(564,Int(Times(Power(Plus(c_,Times(d_DEFAULT,Power(x_,$p("mn",true)))),q_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_DEFAULT),Power(Plus(e_,Times(f_DEFAULT,Power(x_,n_DEFAULT))),r_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(x,Times(n,FracPart(q))),Power(Plus(c,Times(d,Power(Power(x,n),-1))),FracPart(q)),Power(Power(Plus(d,Times(c,Power(x,n))),FracPart(q)),-1)),Int(Times(Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(d,Times(c,Power(x,n))),q),Power(Plus(e,Times(f,Power(x,n))),r),Power(Power(x,Times(n,q)),-1)),x),x),And(FreeQ(List(a,b,c,d,e,f,n,p,q,r),x),EqQ($s("mn"),Negate(n)),Not(IntegerQ(q))))),
IIntegrate(565,Int(Times(Power(Plus($p("e1"),Times($p("f1",true),Power(x_,$p("n2",true)))),r_DEFAULT),Power(Plus($p("e2"),Times($p("f2",true),Power(x_,$p("n2",true)))),r_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),q),Power(Plus(Times($s("e1"),$s("e2")),Times($s("f1"),$s("f2"),Power(x,n))),r)),x),And(FreeQ(List(a,b,c,d,$s("e1"),$s("f1"),$s("e2"),$s("f2"),n,p,q,r),x),EqQ($s("n2"),Times(C1D2,n)),EqQ(Plus(Times($s("e2"),$s("f1")),Times($s("e1"),$s("f2"))),C0),Or(IntegerQ(r),And(GtQ($s("e1"),C0),GtQ($s("e2"),C0)))))),
IIntegrate(566,Int(Times(Power(Plus($p("e1"),Times($p("f1",true),Power(x_,$p("n2",true)))),r_DEFAULT),Power(Plus($p("e2"),Times($p("f2",true),Power(x_,$p("n2",true)))),r_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(Plus($s("e1"),Times($s("f1"),Power(x,Times(C1D2,n)))),FracPart(r)),Power(Plus($s("e2"),Times($s("f2"),Power(x,Times(C1D2,n)))),FracPart(r)),Power(Power(Plus(Times($s("e1"),$s("e2")),Times($s("f1"),$s("f2"),Power(x,n))),FracPart(r)),-1)),Int(Times(Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),q),Power(Plus(Times($s("e1"),$s("e2")),Times($s("f1"),$s("f2"),Power(x,n))),r)),x),x),And(FreeQ(List(a,b,c,d,$s("e1"),$s("f1"),$s("e2"),$s("f2"),n,p,q,r),x),EqQ($s("n2"),Times(C1D2,n)),EqQ(Plus(Times($s("e2"),$s("f1")),Times($s("e1"),$s("f2"))),C0)))),
IIntegrate(567,Int(Times(Power(Times(g_DEFAULT,x_),m_DEFAULT),Power(Times(b_DEFAULT,Power(x_,n_)),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_DEFAULT),Power(Plus(e_,Times(f_DEFAULT,Power(x_,n_))),r_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(g,m),Power(Times(n,Power(b,Plus(Simplify(Times(Plus(m,C1),Power(n,-1))),Negate(C1)))),-1)),Subst(Int(Times(Power(Times(b,x),Plus(p,Simplify(Times(Plus(m,C1),Power(n,-1))),Negate(C1))),Power(Plus(c,Times(d,x)),q),Power(Plus(e,Times(f,x)),r)),x),x,Power(x,n)),x),And(FreeQ(List(b,c,d,e,f,g,m,n,p,q,r),x),Or(IntegerQ(m),GtQ(g,C0)),IntegerQ(Simplify(Times(Plus(m,C1),Power(n,-1))))))),
IIntegrate(568,Int(Times(Power(Times(g_DEFAULT,x_),m_DEFAULT),Power(Times(b_DEFAULT,Power(x_,n_DEFAULT)),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_DEFAULT),Power(Plus(e_,Times(f_DEFAULT,Power(x_,n_))),r_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(g,m),Power(b,IntPart(p)),Power(Times(b,Power(x,n)),FracPart(p)),Power(Power(x,Times(n,FracPart(p))),-1)),Int(Times(Power(x,Plus(m,Times(n,p))),Power(Plus(c,Times(d,Power(x,n))),q),Power(Plus(e,Times(f,Power(x,n))),r)),x),x),And(FreeQ(List(b,c,d,e,f,g,m,n,p,q,r),x),Or(IntegerQ(m),GtQ(g,C0)),Not(IntegerQ(Simplify(Times(Plus(m,C1),Power(n,-1)))))))),
IIntegrate(569,Int(Times(Power(Times(g_,x_),m_),Power(Times(b_DEFAULT,Power(x_,n_DEFAULT)),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_DEFAULT),Power(Plus(e_,Times(f_DEFAULT,Power(x_,n_))),r_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(g,IntPart(m)),Power(Times(g,x),FracPart(m)),Power(Power(x,FracPart(m)),-1)),Int(Times(Power(x,m),Power(Times(b,Power(x,n)),p),Power(Plus(c,Times(d,Power(x,n))),q),Power(Plus(e,Times(f,Power(x,n))),r)),x),x),And(FreeQ(List(b,c,d,e,f,g,m,n,p,q,r),x),Not(IntegerQ(m))))),
IIntegrate(570,Int(Times(Power(Times(g_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_DEFAULT),Power(Plus(e_,Times(f_DEFAULT,Power(x_,n_))),r_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Times(g,x),m),Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),q),Power(Plus(e,Times(f,Power(x,n))),r)),x),x),And(FreeQ(List(a,b,c,d,e,f,g,m,n),x),IGtQ(p,CN2),IGtQ(q,C0),IGtQ(r,C0)))),
IIntegrate(571,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_DEFAULT),Power(Plus(e_,Times(f_DEFAULT,Power(x_,n_))),r_DEFAULT)),x_Symbol),
    Condition(Dist(Power(n,-1),Subst(Int(Times(Power(Plus(a,Times(b,x)),p),Power(Plus(c,Times(d,x)),q),Power(Plus(e,Times(f,x)),r)),x),x,Power(x,n)),x),And(FreeQ(List(a,b,c,d,e,f,m,n,p,q,r),x),EqQ(Plus(m,Negate(n),C1),C0)))),
IIntegrate(572,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_DEFAULT),Power(Plus(e_,Times(f_DEFAULT,Power(x_,n_))),r_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(x,Plus(m,Times(n,Plus(p,q,r)))),Power(Plus(b,Times(a,Power(Power(x,n),-1))),p),Power(Plus(d,Times(c,Power(Power(x,n),-1))),q),Power(Plus(f,Times(e,Power(Power(x,n),-1))),r)),x),And(FreeQ(List(a,b,c,d,e,f,m,n),x),IntegersQ(p,q,r),NegQ(n)))),
IIntegrate(573,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_DEFAULT),Power(Plus(e_,Times(f_DEFAULT,Power(x_,n_))),r_DEFAULT)),x_Symbol),
    Condition(Dist(Power(n,-1),Subst(Int(Times(Power(x,Plus(Simplify(Times(Plus(m,C1),Power(n,-1))),Negate(C1))),Power(Plus(a,Times(b,x)),p),Power(Plus(c,Times(d,x)),q),Power(Plus(e,Times(f,x)),r)),x),x,Power(x,n)),x),And(FreeQ(List(a,b,c,d,e,f,m,n,p,q,r),x),IntegerQ(Simplify(Times(Plus(m,C1),Power(n,-1))))))),
IIntegrate(574,Int(Times(Power(Times(g_,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_DEFAULT),Power(Plus(e_,Times(f_DEFAULT,Power(x_,n_))),r_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(g,IntPart(m)),Power(Times(g,x),FracPart(m)),Power(Power(x,FracPart(m)),-1)),Int(Times(Power(x,m),Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),q),Power(Plus(e,Times(f,Power(x,n))),r)),x),x),And(FreeQ(List(a,b,c,d,e,f,g,m,n,p,q,r),x),IntegerQ(Simplify(Times(Plus(m,C1),Power(n,-1))))))),
IIntegrate(575,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_DEFAULT),Power(Plus(e_,Times(f_DEFAULT,Power(x_,n_))),r_DEFAULT)),x_Symbol),
    Condition(With(List(Set(k,GCD(Plus(m,C1),n))),Condition(Dist(Power(k,-1),Subst(Int(Times(Power(x,Plus(Times(Plus(m,C1),Power(k,-1)),Negate(C1))),Power(Plus(a,Times(b,Power(x,Times(n,Power(k,-1))))),p),Power(Plus(c,Times(d,Power(x,Times(n,Power(k,-1))))),q),Power(Plus(e,Times(f,Power(x,Times(n,Power(k,-1))))),r)),x),x,Power(x,k)),x),Unequal(k,C1))),And(FreeQ(List(a,b,c,d,e,f,p,q,r),x),IGtQ(n,C0),IntegerQ(m)))),
IIntegrate(576,Int(Times(Power(Times(g_DEFAULT,x_),m_),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_),Power(Plus(e_,Times(f_DEFAULT,Power(x_,n_))),r_)),x_Symbol),
    Condition(With(List(Set(k,Denominator(m))),Dist(Times(k,Power(g,-1)),Subst(Int(Times(Power(x,Plus(Times(k,Plus(m,C1)),Negate(C1))),Power(Plus(a,Times(b,Power(x,Times(k,n)),Power(Power(g,n),-1))),p),Power(Plus(c,Times(d,Power(x,Times(k,n)),Power(Power(g,n),-1))),q),Power(Plus(e,Times(f,Power(x,Times(k,n)),Power(Power(g,n),-1))),r)),x),x,Power(Times(g,x),Power(k,-1))),x)),And(FreeQ(List(a,b,c,d,e,f,g,p,q,r),x),IGtQ(n,C0),FractionQ(m)))),
IIntegrate(577,Int(Times(Power(Times(g_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_DEFAULT),Plus(e_,Times(f_DEFAULT,Power(x_,n_)))),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Plus(Times(b,e),Times(CN1,a,f)),Power(Times(g,x),Plus(m,C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),q),Power(Times(a,b,g,n,Plus(p,C1)),-1)),x)),Dist(Power(Times(a,b,n,Plus(p,C1)),-1),Int(Times(Power(Times(g,x),m),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),Plus(q,Negate(C1))),Simp(Plus(Times(c,Plus(Times(b,e,n,Plus(p,C1)),Times(Plus(Times(b,e),Times(CN1,a,f)),Plus(m,C1)))),Times(d,Plus(Times(b,e,n,Plus(p,C1)),Times(Plus(Times(b,e),Times(CN1,a,f)),Plus(m,Times(n,q),C1))),Power(x,n))),x)),x),x)),And(FreeQ(List(a,b,c,d,e,f,g,m),x),IGtQ(n,C0),LtQ(p,CN1),GtQ(q,C0),Not(And(EqQ(q,C1),SimplerQ(Plus(Times(b,c),Times(CN1,a,d)),Plus(Times(b,e),Times(CN1,a,f)))))))),
IIntegrate(578,Int(Times(Power(Times(g_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_),Plus(e_,Times(f_DEFAULT,Power(x_,n_)))),x_Symbol),
    Condition(Plus(Simp(Times(Power(g,Plus(n,Negate(C1))),Plus(Times(b,e),Times(CN1,a,f)),Power(Times(g,x),Plus(m,Negate(n),C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),Plus(q,C1)),Power(Times(b,n,Plus(Times(b,c),Times(CN1,a,d)),Plus(p,C1)),-1)),x),Negate(Dist(Times(Power(g,n),Power(Times(b,n,Plus(Times(b,c),Times(CN1,a,d)),Plus(p,C1)),-1)),Int(Times(Power(Times(g,x),Plus(m,Negate(n))),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),q),Simp(Plus(Times(c,Plus(Times(b,e),Times(CN1,a,f)),Plus(m,Negate(n),C1)),Times(Plus(Times(d,Plus(Times(b,e),Times(CN1,a,f)),Plus(m,Times(n,q),C1)),Times(CN1,b,n,Plus(Times(c,f),Times(CN1,d,e)),Plus(p,C1))),Power(x,n))),x)),x),x))),And(FreeQ(List(a,b,c,d,e,f,g,q),x),IGtQ(n,C0),LtQ(p,CN1),GtQ(Plus(m,Negate(n),C1),C0)))),
IIntegrate(579,Int(Times(Power(Times(g_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_),Plus(e_,Times(f_DEFAULT,Power(x_,n_)))),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Plus(Times(b,e),Times(CN1,a,f)),Power(Times(g,x),Plus(m,C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),Plus(q,C1)),Power(Times(a,g,n,Plus(Times(b,c),Times(CN1,a,d)),Plus(p,C1)),-1)),x)),Dist(Power(Times(a,n,Plus(Times(b,c),Times(CN1,a,d)),Plus(p,C1)),-1),Int(Times(Power(Times(g,x),m),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),q),Simp(Plus(Times(c,Plus(Times(b,e),Times(CN1,a,f)),Plus(m,C1)),Times(e,n,Plus(Times(b,c),Times(CN1,a,d)),Plus(p,C1)),Times(d,Plus(Times(b,e),Times(CN1,a,f)),Plus(m,Times(n,Plus(p,q,C2)),C1),Power(x,n))),x)),x),x)),And(FreeQ(List(a,b,c,d,e,f,g,m,q),x),IGtQ(n,C0),LtQ(p,CN1)))),
IIntegrate(580,Int(Times(Power(Times(g_DEFAULT,x_),m_),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_DEFAULT),Plus(e_,Times(f_DEFAULT,Power(x_,n_)))),x_Symbol),
    Condition(Plus(Simp(Times(e,Power(Times(g,x),Plus(m,C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),q),Power(Times(a,g,Plus(m,C1)),-1)),x),Negate(Dist(Power(Times(a,Power(g,n),Plus(m,C1)),-1),Int(Times(Power(Times(g,x),Plus(m,n)),Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),Plus(q,Negate(C1))),Simp(Plus(Times(c,Plus(Times(b,e),Times(CN1,a,f)),Plus(m,C1)),Times(e,n,Plus(Times(b,c,Plus(p,C1)),Times(a,d,q))),Times(d,Plus(Times(Plus(Times(b,e),Times(CN1,a,f)),Plus(m,C1)),Times(b,e,n,Plus(p,q,C1))),Power(x,n))),x)),x),x))),And(FreeQ(List(a,b,c,d,e,f,g,p),x),IGtQ(n,C0),GtQ(q,C0),LtQ(m,CN1),Not(And(EqQ(q,C1),SimplerQ(Plus(e,Times(f,Power(x,n))),Plus(c,Times(d,Power(x,n))))))))),
IIntegrate(581,Int(Times(Power(Times(g_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_DEFAULT),Plus(e_,Times(f_DEFAULT,Power(x_,n_)))),x_Symbol),
    Condition(Plus(Simp(Times(f,Power(Times(g,x),Plus(m,C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),q),Power(Times(b,g,Plus(m,Times(n,Plus(p,q,C1)),C1)),-1)),x),Dist(Power(Times(b,Plus(m,Times(n,Plus(p,q,C1)),C1)),-1),Int(Times(Power(Times(g,x),m),Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),Plus(q,Negate(C1))),Simp(Plus(Times(c,Plus(Times(Plus(Times(b,e),Times(CN1,a,f)),Plus(m,C1)),Times(b,e,n,Plus(p,q,C1)))),Times(Plus(Times(d,Plus(Times(b,e),Times(CN1,a,f)),Plus(m,C1)),Times(f,n,q,Plus(Times(b,c),Times(CN1,a,d))),Times(b,e,d,n,Plus(p,q,C1))),Power(x,n))),x)),x),x)),And(FreeQ(List(a,b,c,d,e,f,g,m,p),x),IGtQ(n,C0),GtQ(q,C0),Not(And(EqQ(q,C1),SimplerQ(Plus(e,Times(f,Power(x,n))),Plus(c,Times(d,Power(x,n))))))))),
IIntegrate(582,Int(Times(Power(Times(g_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_DEFAULT),Plus(e_,Times(f_DEFAULT,Power(x_,n_)))),x_Symbol),
    Condition(Plus(Simp(Times(f,Power(g,Plus(n,Negate(C1))),Power(Times(g,x),Plus(m,Negate(n),C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),Plus(q,C1)),Power(Times(b,d,Plus(m,Times(n,Plus(p,q,C1)),C1)),-1)),x),Negate(Dist(Times(Power(g,n),Power(Times(b,d,Plus(m,Times(n,Plus(p,q,C1)),C1)),-1)),Int(Times(Power(Times(g,x),Plus(m,Negate(n))),Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),q),Simp(Plus(Times(a,f,c,Plus(m,Negate(n),C1)),Times(Plus(Times(a,f,d,Plus(m,Times(n,q),C1)),Times(b,Plus(Times(f,c,Plus(m,Times(n,p),C1)),Times(CN1,e,d,Plus(m,Times(n,Plus(p,q,C1)),C1))))),Power(x,n))),x)),x),x))),And(FreeQ(List(a,b,c,d,e,f,g,p,q),x),IGtQ(n,C0),GtQ(m,Plus(n,Negate(C1)))))),
IIntegrate(583,Int(Times(Power(Times(g_DEFAULT,x_),m_),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_DEFAULT),Plus(e_,Times(f_DEFAULT,Power(x_,n_)))),x_Symbol),
    Condition(Plus(Simp(Times(e,Power(Times(g,x),Plus(m,C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),Plus(q,C1)),Power(Times(a,c,g,Plus(m,C1)),-1)),x),Dist(Power(Times(a,c,Power(g,n),Plus(m,C1)),-1),Int(Times(Power(Times(g,x),Plus(m,n)),Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),q),Simp(Plus(Times(a,f,c,Plus(m,C1)),Times(CN1,e,Plus(Times(b,c),Times(a,d)),Plus(m,n,C1)),Times(CN1,e,n,Plus(Times(b,c,p),Times(a,d,q))),Times(CN1,b,e,d,Plus(m,Times(n,Plus(p,q,C2)),C1),Power(x,n))),x)),x),x)),And(FreeQ(List(a,b,c,d,e,f,g,p,q),x),IGtQ(n,C0),LtQ(m,CN1)))),
IIntegrate(584,Int(Times(Power(Times(g_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),-1),Plus(e_,Times(f_DEFAULT,Power(x_,n_)))),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Times(g,x),m),Power(Plus(a,Times(b,Power(x,n))),p),Plus(e,Times(f,Power(x,n))),Power(Plus(c,Times(d,Power(x,n))),-1)),x),x),And(FreeQ(List(a,b,c,d,e,f,g,m,p),x),IGtQ(n,C0)))),
IIntegrate(585,Int(Times(Power(Times(g_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_DEFAULT),Plus(e_,Times(f_DEFAULT,Power(x_,n_)))),x_Symbol),
    Condition(Plus(Dist(e,Int(Times(Power(Times(g,x),m),Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),q)),x),x),Dist(Times(f,Power(Power(e,n),-1)),Int(Times(Power(Times(g,x),Plus(m,n)),Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),q)),x),x)),And(FreeQ(List(a,b,c,d,e,f,g,m,p,q),x),IGtQ(n,C0)))),
IIntegrate(586,Int(Times(Power(Times(g_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_DEFAULT),Power(Plus(e_,Times(f_DEFAULT,Power(x_,n_))),r_DEFAULT)),x_Symbol),
    Condition(Plus(Dist(e,Int(Times(Power(Times(g,x),m),Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),q),Power(Plus(e,Times(f,Power(x,n))),Plus(r,Negate(C1)))),x),x),Dist(Times(f,Power(Power(e,n),-1)),Int(Times(Power(Times(g,x),Plus(m,n)),Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),q),Power(Plus(e,Times(f,Power(x,n))),Plus(r,Negate(C1)))),x),x)),And(FreeQ(List(a,b,c,d,e,f,g,m,p,q),x),IGtQ(n,C0),IGtQ(r,C0)))),
IIntegrate(587,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_DEFAULT),Power(Plus(e_,Times(f_DEFAULT,Power(x_,n_))),r_DEFAULT)),x_Symbol),
    Condition(Negate(Subst(Int(Times(Power(Plus(a,Times(b,Power(Power(x,n),-1))),p),Power(Plus(c,Times(d,Power(Power(x,n),-1))),q),Power(Plus(e,Times(f,Power(Power(x,n),-1))),r),Power(Power(x,Plus(m,C2)),-1)),x),x,Power(x,-1))),And(FreeQ(List(a,b,c,d,e,f,p,q,r),x),ILtQ(n,C0),IntegerQ(m)))),
IIntegrate(588,Int(Times(Power(Times(g_DEFAULT,x_),m_),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_DEFAULT),Power(Plus(e_,Times(f_DEFAULT,Power(x_,n_))),r_DEFAULT)),x_Symbol),
    Condition(With(List(Set(k,Denominator(m))),Negate(Dist(Times(k,Power(g,-1)),Subst(Int(Times(Power(Plus(a,Times(b,Power(Times(Power(g,n),Power(x,Times(k,n))),-1))),p),Power(Plus(c,Times(d,Power(Times(Power(g,n),Power(x,Times(k,n))),-1))),q),Power(Plus(e,Times(f,Power(Times(Power(g,n),Power(x,Times(k,n))),-1))),r),Power(Power(x,Plus(Times(k,Plus(m,C1)),C1)),-1)),x),x,Power(Power(Times(g,x),Power(k,-1)),-1)),x))),And(FreeQ(List(a,b,c,d,e,f,g,p,q,r),x),ILtQ(n,C0),FractionQ(m)))),
IIntegrate(589,Int(Times(Power(Times(g_DEFAULT,x_),m_),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_DEFAULT),Power(Plus(e_,Times(f_DEFAULT,Power(x_,n_))),r_DEFAULT)),x_Symbol),
    Condition(Negate(Dist(Times(Power(Times(g,x),m),Power(Power(x,-1),m)),Subst(Int(Times(Power(Plus(a,Times(b,Power(Power(x,n),-1))),p),Power(Plus(c,Times(d,Power(Power(x,n),-1))),q),Power(Plus(e,Times(f,Power(Power(x,n),-1))),r),Power(Power(x,Plus(m,C2)),-1)),x),x,Power(x,-1)),x)),And(FreeQ(List(a,b,c,d,e,f,g,m,p,q,r),x),ILtQ(n,C0),Not(RationalQ(m))))),
IIntegrate(590,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_DEFAULT),Power(Plus(e_,Times(f_DEFAULT,Power(x_,n_))),r_DEFAULT)),x_Symbol),
    Condition(With(List(Set(k,Denominator(n))),Dist(k,Subst(Int(Times(Power(x,Plus(Times(k,Plus(m,C1)),Negate(C1))),Power(Plus(a,Times(b,Power(x,Times(k,n)))),p),Power(Plus(c,Times(d,Power(x,Times(k,n)))),q),Power(Plus(e,Times(f,Power(x,Times(k,n)))),r)),x),x,Power(x,Power(k,-1))),x)),And(FreeQ(List(a,b,c,d,e,f,m,p,q,r),x),FractionQ(n)))),
IIntegrate(591,Int(Times(Power(Times(g_,x_),m_),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_DEFAULT),Power(Plus(e_,Times(f_DEFAULT,Power(x_,n_))),r_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(g,IntPart(m)),Power(Times(g,x),FracPart(m)),Power(Power(x,FracPart(m)),-1)),Int(Times(Power(x,m),Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),q),Power(Plus(e,Times(f,Power(x,n))),r)),x),x),And(FreeQ(List(a,b,c,d,e,f,g,m,p,q,r),x),FractionQ(n)))),
IIntegrate(592,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_DEFAULT),Power(Plus(e_,Times(f_DEFAULT,Power(x_,n_))),r_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Plus(m,C1),-1),Subst(Int(Times(Power(Plus(a,Times(b,Power(x,Simplify(Times(n,Power(Plus(m,C1),-1)))))),p),Power(Plus(c,Times(d,Power(x,Simplify(Times(n,Power(Plus(m,C1),-1)))))),q),Power(Plus(e,Times(f,Power(x,Simplify(Times(n,Power(Plus(m,C1),-1)))))),r)),x),x,Power(x,Plus(m,C1))),x),And(FreeQ(List(a,b,c,d,e,f,m,n,p,q,r),x),IntegerQ(Simplify(Times(n,Power(Plus(m,C1),-1))))))),
IIntegrate(593,Int(Times(Power(Times(g_,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_DEFAULT),Power(Plus(e_,Times(f_DEFAULT,Power(x_,n_))),r_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(g,IntPart(m)),Power(Times(g,x),FracPart(m)),Power(Power(x,FracPart(m)),-1)),Int(Times(Power(x,m),Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),q),Power(Plus(e,Times(f,Power(x,n))),r)),x),x),And(FreeQ(List(a,b,c,d,e,f,g,m,n,p,q,r),x),IntegerQ(Simplify(Times(n,Power(Plus(m,C1),-1))))))),
IIntegrate(594,Int(Times(Power(Times(g_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_DEFAULT),Plus(e_,Times(f_DEFAULT,Power(x_,n_)))),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Plus(Times(b,e),Times(CN1,a,f)),Power(Times(g,x),Plus(m,C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),q),Power(Times(a,b,g,n,Plus(p,C1)),-1)),x)),Dist(Power(Times(a,b,n,Plus(p,C1)),-1),Int(Times(Power(Times(g,x),m),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),Plus(q,Negate(C1))),Simp(Plus(Times(c,Plus(Times(b,e,n,Plus(p,C1)),Times(Plus(Times(b,e),Times(CN1,a,f)),Plus(m,C1)))),Times(d,Plus(Times(b,e,n,Plus(p,C1)),Times(Plus(Times(b,e),Times(CN1,a,f)),Plus(m,Times(n,q),C1))),Power(x,n))),x)),x),x)),And(FreeQ(List(a,b,c,d,e,f,g,m,n),x),LtQ(p,CN1),GtQ(q,C0),Not(And(EqQ(q,C1),SimplerQ(Plus(Times(b,c),Times(CN1,a,d)),Plus(Times(b,e),Times(CN1,a,f)))))))),
IIntegrate(595,Int(Times(Power(Times(g_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_),Plus(e_,Times(f_DEFAULT,Power(x_,n_)))),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Plus(Times(b,e),Times(CN1,a,f)),Power(Times(g,x),Plus(m,C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),Plus(q,C1)),Power(Times(a,g,n,Plus(Times(b,c),Times(CN1,a,d)),Plus(p,C1)),-1)),x)),Dist(Power(Times(a,n,Plus(Times(b,c),Times(CN1,a,d)),Plus(p,C1)),-1),Int(Times(Power(Times(g,x),m),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),q),Simp(Plus(Times(c,Plus(Times(b,e),Times(CN1,a,f)),Plus(m,C1)),Times(e,n,Plus(Times(b,c),Times(CN1,a,d)),Plus(p,C1)),Times(d,Plus(Times(b,e),Times(CN1,a,f)),Plus(m,Times(n,Plus(p,q,C2)),C1),Power(x,n))),x)),x),x)),And(FreeQ(List(a,b,c,d,e,f,g,m,n,q),x),LtQ(p,CN1)))),
IIntegrate(596,Int(Times(Power(Times(g_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_DEFAULT),Plus(e_,Times(f_DEFAULT,Power(x_,n_)))),x_Symbol),
    Condition(Plus(Simp(Times(f,Power(Times(g,x),Plus(m,C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),q),Power(Times(b,g,Plus(m,Times(n,Plus(p,q,C1)),C1)),-1)),x),Dist(Power(Times(b,Plus(m,Times(n,Plus(p,q,C1)),C1)),-1),Int(Times(Power(Times(g,x),m),Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),Plus(q,Negate(C1))),Simp(Plus(Times(c,Plus(Times(Plus(Times(b,e),Times(CN1,a,f)),Plus(m,C1)),Times(b,e,n,Plus(p,q,C1)))),Times(Plus(Times(d,Plus(Times(b,e),Times(CN1,a,f)),Plus(m,C1)),Times(f,n,q,Plus(Times(b,c),Times(CN1,a,d))),Times(b,e,d,n,Plus(p,q,C1))),Power(x,n))),x)),x),x)),And(FreeQ(List(a,b,c,d,e,f,g,m,n,p),x),GtQ(q,C0),Not(And(EqQ(q,C1),SimplerQ(Plus(e,Times(f,Power(x,n))),Plus(c,Times(d,Power(x,n))))))))),
IIntegrate(597,Int(Times(Power(Times(g_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),-1),Plus(e_,Times(f_DEFAULT,Power(x_,n_)))),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Times(g,x),m),Power(Plus(a,Times(b,Power(x,n))),p),Plus(e,Times(f,Power(x,n))),Power(Plus(c,Times(d,Power(x,n))),-1)),x),x),FreeQ(List(a,b,c,d,e,f,g,m,n,p),x))),
IIntegrate(598,Int(Times(Power(Times(g_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_),Plus(e_,Times(f_DEFAULT,Power(x_,n_)))),x_Symbol),
    Condition(Plus(Dist(e,Int(Times(Power(Times(g,x),m),Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),q)),x),x),Dist(Times(f,Power(Times(g,x),m),Power(Power(x,m),-1)),Int(Times(Power(x,Plus(m,n)),Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),q)),x),x)),FreeQ(List(a,b,c,d,e,f,g,m,n,p,q),x))),
IIntegrate(599,Int(Times(Power(x_,m_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,Power(x_,$p("mn",true)))),q_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_DEFAULT),Power(Plus(e_,Times(f_DEFAULT,Power(x_,n_DEFAULT))),r_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(x,Plus(m,Times(CN1,n,q))),Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(d,Times(c,Power(x,n))),q),Power(Plus(e,Times(f,Power(x,n))),r)),x),And(FreeQ(List(a,b,c,d,e,f,m,n,p,r),x),EqQ($s("mn"),Negate(n)),IntegerQ(q)))),
IIntegrate(600,Int(Times(Power(x_,m_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,Power(x_,$p("mn",true)))),q_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_DEFAULT),Power(Plus(e_,Times(f_DEFAULT,Power(x_,n_DEFAULT))),r_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(x,Plus(m,Times(n,Plus(p,r)))),Power(Plus(b,Times(a,Power(Power(x,n),-1))),p),Power(Plus(c,Times(d,Power(Power(x,n),-1))),q),Power(Plus(f,Times(e,Power(Power(x,n),-1))),r)),x),And(FreeQ(List(a,b,c,d,e,f,m,n,q),x),EqQ($s("mn"),Negate(n)),IntegerQ(p),IntegerQ(r))))
  );
}
