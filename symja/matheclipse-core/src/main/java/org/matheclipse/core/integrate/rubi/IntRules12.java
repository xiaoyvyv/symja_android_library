package org.matheclipse.core.integrate.rubi;


import org.matheclipse.core.interfaces.IAST;

import static org.matheclipse.core.expression.F.$p;
import static org.matheclipse.core.expression.F.$s;
import static org.matheclipse.core.expression.F.And;
import static org.matheclipse.core.expression.F.C0;
import static org.matheclipse.core.expression.F.C1;
import static org.matheclipse.core.expression.F.C1D2;
import static org.matheclipse.core.expression.F.C2;
import static org.matheclipse.core.expression.F.C3;
import static org.matheclipse.core.expression.F.C4;
import static org.matheclipse.core.expression.F.CN1;
import static org.matheclipse.core.expression.F.CN1D2;
import static org.matheclipse.core.expression.F.CN2;
import static org.matheclipse.core.expression.F.CN4;
import static org.matheclipse.core.expression.F.Coefficient;
import static org.matheclipse.core.expression.F.Condition;
import static org.matheclipse.core.expression.F.Denominator;
import static org.matheclipse.core.expression.F.FreeQ;
import static org.matheclipse.core.expression.F.Hypergeometric2F1;
import static org.matheclipse.core.expression.F.IIntegrate;
import static org.matheclipse.core.expression.F.IntegerQ;
import static org.matheclipse.core.expression.F.LessEqual;
import static org.matheclipse.core.expression.F.List;
import static org.matheclipse.core.expression.F.Log;
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
import static org.matheclipse.core.expression.F.d_;
import static org.matheclipse.core.expression.F.d_DEFAULT;
import static org.matheclipse.core.expression.F.e;
import static org.matheclipse.core.expression.F.e_;
import static org.matheclipse.core.expression.F.e_DEFAULT;
import static org.matheclipse.core.expression.F.f;
import static org.matheclipse.core.expression.F.f_DEFAULT;
import static org.matheclipse.core.expression.F.g;
import static org.matheclipse.core.expression.F.g_;
import static org.matheclipse.core.expression.F.g_DEFAULT;
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
import static org.matheclipse.core.expression.F.r_DEFAULT;
import static org.matheclipse.core.expression.F.u;
import static org.matheclipse.core.expression.F.u_;
import static org.matheclipse.core.expression.F.v;
import static org.matheclipse.core.expression.F.v_;
import static org.matheclipse.core.expression.F.x;
import static org.matheclipse.core.expression.F.x_;
import static org.matheclipse.core.expression.F.x_Symbol;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Dist;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.EqQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.ExpandIntegrand;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.ExpandLinearProduct;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.FracPart;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.GtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.IGtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Int;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.IntPart;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.LinearPairQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.LinearQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.LtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.NeQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.NiceSqrtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.PerfectSquareQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.PosQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.RationalQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.RemoveContent;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Rt;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Simp;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Subst;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Unintegrable;

/** 
 * IndefiniteIntegrationRules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class IntRules12 { 
  public static IAST RULES = List( 
IIntegrate(601,Int(Times(Power(x_,m_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,Power(x_,$p("mn",true)))),q_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_DEFAULT),Power(Plus(e_,Times(f_DEFAULT,Power(x_,n_DEFAULT))),r_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(x,Times(n,FracPart(q))),Power(Plus(c,Times(d,Power(Power(x,n),-1))),FracPart(q)),Power(Power(Plus(d,Times(c,Power(x,n))),FracPart(q)),-1)),Int(Times(Power(x,Plus(m,Times(CN1,n,q))),Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(d,Times(c,Power(x,n))),q),Power(Plus(e,Times(f,Power(x,n))),r)),x),x),And(FreeQ(List(a,b,c,d,e,f,m,n,p,q,r),x),EqQ($s("mn"),Negate(n)),Not(IntegerQ(q))))),
IIntegrate(602,Int(Times(Power(Times(g_,x_),m_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,$p("mn",true)))),q_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_DEFAULT),Power(Plus(e_,Times(f_DEFAULT,Power(x_,n_DEFAULT))),r_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(g,IntPart(m)),Power(Times(g,x),FracPart(m)),Power(Power(x,FracPart(m)),-1)),Int(Times(Power(x,m),Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(Power(x,n),-1))),q),Power(Plus(e,Times(f,Power(x,n))),r)),x),x),And(FreeQ(List(a,b,c,d,e,f,g,m,n,p,q,r),x),EqQ($s("mn"),Negate(n))))),
IIntegrate(603,Int(Times(Power(Times(g_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_DEFAULT),Power(Plus(e_,Times(f_DEFAULT,Power(x_,n_))),r_DEFAULT)),x_Symbol),
    Condition(Unintegrable(Times(Power(Times(g,x),m),Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),q),Power(Plus(e,Times(f,Power(x,n))),r)),x),FreeQ(List(a,b,c,d,e,f,g,m,n,p,q,r),x))),
IIntegrate(604,Int(Times(Power(u_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(v_,n_))),p_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,Power(v_,n_))),q_DEFAULT),Power(Plus(e_,Times(f_DEFAULT,Power(v_,n_))),r_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(u,m),Power(Times(Coefficient(v,x,C1),Power(v,m)),-1)),Subst(Int(Times(Power(x,m),Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),q),Power(Plus(e,Times(f,Power(x,n))),r)),x),x,v),x),And(FreeQ(List(a,b,c,d,e,f,m,n,p,q,r),x),LinearPairQ(u,v,x)))),
IIntegrate(605,Int(Times(Power(Times(g_DEFAULT,x_),m_DEFAULT),Power(Plus($p("e1"),Times($p("f1",true),Power(x_,$p("n2",true)))),r_DEFAULT),Power(Plus($p("e2"),Times($p("f2",true),Power(x_,$p("n2",true)))),r_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(Times(g,x),m),Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),q),Power(Plus(Times($s("e1"),$s("e2")),Times($s("f1"),$s("f2"),Power(x,n))),r)),x),And(FreeQ(List(a,b,c,d,$s("e1"),$s("f1"),$s("e2"),$s("f2"),g,m,n,p,q,r),x),EqQ($s("n2"),Times(C1D2,n)),EqQ(Plus(Times($s("e2"),$s("f1")),Times($s("e1"),$s("f2"))),C0),Or(IntegerQ(r),And(GtQ($s("e1"),C0),GtQ($s("e2"),C0)))))),
IIntegrate(606,Int(Times(Power(Times(g_DEFAULT,x_),m_DEFAULT),Power(Plus($p("e1"),Times($p("f1",true),Power(x_,$p("n2",true)))),r_DEFAULT),Power(Plus($p("e2"),Times($p("f2",true),Power(x_,$p("n2",true)))),r_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(Plus($s("e1"),Times($s("f1"),Power(x,Times(C1D2,n)))),FracPart(r)),Power(Plus($s("e2"),Times($s("f2"),Power(x,Times(C1D2,n)))),FracPart(r)),Power(Power(Plus(Times($s("e1"),$s("e2")),Times($s("f1"),$s("f2"),Power(x,n))),FracPart(r)),-1)),Int(Times(Power(Times(g,x),m),Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),q),Power(Plus(Times($s("e1"),$s("e2")),Times($s("f1"),$s("f2"),Power(x,n))),r)),x),x),And(FreeQ(List(a,b,c,d,$s("e1"),$s("f1"),$s("e2"),$s("f2"),g,m,n,p,q,r),x),EqQ($s("n2"),Times(C1D2,n)),EqQ(Plus(Times($s("e2"),$s("f1")),Times($s("e1"),$s("f2"))),C0)))),
IIntegrate(607,Int(Power(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_),x_Symbol),
    Condition(Simp(Times(C2,Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,C1)),Power(Times(Plus(Times(C2,p),C1),Plus(b,Times(C2,c,x))),-1)),x),And(FreeQ(List(a,b,c,p),x),EqQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),LtQ(p,CN1)))),
IIntegrate(608,Int(Power(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),CN1D2),x_Symbol),
    Condition(Dist(Times(Plus(Times(C1D2,b),Times(c,x)),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),CN1D2)),Int(Power(Plus(Times(C1D2,b),Times(c,x)),-1),x),x),And(FreeQ(List(a,b,c),x),EqQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0)))),
IIntegrate(609,Int(Power(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_),x_Symbol),
    Condition(Simp(Times(Plus(b,Times(C2,c,x)),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),p),Power(Times(C2,c,Plus(Times(C2,p),C1)),-1)),x),And(FreeQ(List(a,b,c,p),x),EqQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),NeQ(p,Negate(Power(C2,-1)))))),
IIntegrate(610,Int(Power(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_),x_Symbol),
    Condition(With(List(Set(q,Rt(Plus(Sqr(b),Times(CN1,C4,a,c)),C2))),Dist(Power(Power(c,p),-1),Int(Times(Power(Simp(Plus(Times(C1D2,b),Times(CN1,C1D2,q),Times(c,x)),x),p),Power(Simp(Plus(Times(C1D2,b),Times(C1D2,q),Times(c,x)),x),p)),x),x)),And(FreeQ(List(a,b,c),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),IGtQ(p,C0),PerfectSquareQ(Plus(Sqr(b),Times(CN1,C4,a,c)))))),
IIntegrate(611,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_),x_Symbol),
    Condition(Int(ExpandIntegrand(Power(Plus(a,Times(b,x),Times(c,Sqr(x))),p),x),x),And(FreeQ(List(a,b,c),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),IGtQ(p,C0),Or(EqQ(a,C0),Not(PerfectSquareQ(Plus(Sqr(b),Times(CN1,C4,a,c)))))))),
IIntegrate(612,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_),x_Symbol),
    Condition(Plus(Simp(Times(Plus(b,Times(C2,c,x)),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),p),Power(Times(C2,c,Plus(Times(C2,p),C1)),-1)),x),Negate(Dist(Times(p,Plus(Sqr(b),Times(CN1,C4,a,c)),Power(Times(C2,c,Plus(Times(C2,p),C1)),-1)),Int(Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,Negate(C1))),x),x))),And(FreeQ(List(a,b,c),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),GtQ(p,C0),IntegerQ(Times(C4,p))))),
IIntegrate(613,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),QQ(-3L,2L)),x_Symbol),
    Condition(Simp(Times(CN2,Plus(b,Times(C2,c,x)),Power(Times(Plus(Sqr(b),Times(CN1,C4,a,c)),Sqrt(Plus(a,Times(b,x),Times(c,Sqr(x))))),-1)),x),And(FreeQ(List(a,b,c),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0)))),
IIntegrate(614,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_),x_Symbol),
    Condition(Plus(Simp(Times(Plus(b,Times(C2,c,x)),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,C1)),Power(Times(Plus(p,C1),Plus(Sqr(b),Times(CN1,C4,a,c))),-1)),x),Negate(Dist(Times(C2,c,Plus(Times(C2,p),C3),Power(Times(Plus(p,C1),Plus(Sqr(b),Times(CN1,C4,a,c))),-1)),Int(Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,C1)),x),x))),And(FreeQ(List(a,b,c),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),LtQ(p,CN1),NeQ(p,QQ(-3L,2L)),IntegerQ(Times(C4,p))))),
IIntegrate(615,Int(Power(Plus(Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),-1),x_Symbol),
    Condition(Plus(Simp(Times(Log(x),Power(b,-1)),x),Negate(Simp(Times(Log(RemoveContent(Plus(b,Times(c,x)),x)),Power(b,-1)),x))),FreeQ(List(b,c),x))),
IIntegrate(616,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),-1),x_Symbol),
    Condition(With(List(Set(q,Rt(Plus(Sqr(b),Times(CN1,C4,a,c)),C2))),Plus(Dist(Times(c,Power(q,-1)),Int(Power(Simp(Plus(Times(C1D2,b),Times(CN1,C1D2,q),Times(c,x)),x),-1),x),x),Negate(Dist(Times(c,Power(q,-1)),Int(Power(Simp(Plus(Times(C1D2,b),Times(C1D2,q),Times(c,x)),x),-1),x),x)))),And(FreeQ(List(a,b,c),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),PosQ(Plus(Sqr(b),Times(CN1,C4,a,c))),PerfectSquareQ(Plus(Sqr(b),Times(CN1,C4,a,c)))))),
IIntegrate(617,Int(Power(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),-1),x_Symbol),
    Condition(With(List(Set(q,Plus(C1,Times(CN1,C4,Simplify(Times(a,c,Power(b,-2))))))),Condition(Dist(Times(CN2,Power(b,-1)),Subst(Int(Power(Plus(q,Negate(Sqr(x))),-1),x),x,Plus(C1,Times(C2,c,x,Power(b,-1)))),x),And(RationalQ(q),Or(EqQ(Sqr(q),C1),Not(RationalQ(Plus(Sqr(b),Times(CN1,C4,a,c)))))))),And(FreeQ(List(a,b,c),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0)))),
IIntegrate(618,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),-1),x_Symbol),
    Condition(Dist(CN2,Subst(Int(Power(Simp(Plus(Sqr(b),Times(CN1,C4,a,c),Negate(Sqr(x))),x),-1),x),x,Plus(b,Times(C2,c,x))),x),And(FreeQ(List(a,b,c),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0)))),
IIntegrate(619,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_),x_Symbol),
    Condition(Dist(Power(Times(C2,c,Power(Times(CN4,c,Power(Plus(Sqr(b),Times(CN1,C4,a,c)),-1)),p)),-1),Subst(Int(Power(Simp(Plus(C1,Times(CN1,Sqr(x),Power(Plus(Sqr(b),Times(CN1,C4,a,c)),-1))),x),p),x),x,Plus(b,Times(C2,c,x))),x),And(FreeQ(List(a,b,c,p),x),GtQ(Plus(Times(C4,a),Times(CN1,Sqr(b),Power(c,-1))),C0)))),
IIntegrate(620,Int(Power(Plus(Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),CN1D2),x_Symbol),
    Condition(Dist(C2,Subst(Int(Power(Plus(C1,Times(CN1,c,Sqr(x))),-1),x),x,Times(x,Power(Plus(Times(b,x),Times(c,Sqr(x))),CN1D2))),x),FreeQ(List(b,c),x))),
IIntegrate(621,Int(Power(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),CN1D2),x_Symbol),
    Condition(Dist(C2,Subst(Int(Power(Plus(Times(C4,c),Negate(Sqr(x))),-1),x),x,Times(Plus(b,Times(C2,c,x)),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),CN1D2))),x),And(FreeQ(List(a,b,c),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0)))),
IIntegrate(622,Int(Power(Plus(Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_),x_Symbol),
    Condition(Dist(Times(Power(Plus(Times(b,x),Times(c,Sqr(x))),p),Power(Power(Times(CN1,c,Plus(Times(b,x),Times(c,Sqr(x))),Power(b,-2)),p),-1)),Int(Power(Plus(Times(CN1,c,x,Power(b,-1)),Times(CN1,Sqr(c),Sqr(x),Power(b,-2))),p),x),x),And(FreeQ(List(b,c),x),RationalQ(p),LessEqual(C3,Denominator(p),C4)))),
IIntegrate(623,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_),x_Symbol),
    Condition(With(List(Set(d,Denominator(p))),Condition(Dist(Times(d,Sqrt(Sqr(Plus(b,Times(C2,c,x)))),Power(Plus(b,Times(C2,c,x)),-1)),Subst(Int(Times(Power(x,Plus(Times(d,Plus(p,C1)),Negate(C1))),Power(Plus(Sqr(b),Times(CN1,C4,a,c),Times(C4,c,Power(x,d))),CN1D2)),x),x,Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Power(d,-1))),x),LessEqual(C3,d,C4))),And(FreeQ(List(a,b,c),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),RationalQ(p)))),
IIntegrate(624,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_),x_Symbol),
    Condition(With(List(Set(q,Rt(Plus(Sqr(b),Times(CN1,C4,a,c)),C2))),Negate(Simp(Times(Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,C1)),Hypergeometric2F1(Negate(p),Plus(p,C1),Plus(p,C2),Times(Plus(b,q,Times(C2,c,x)),Power(Times(C2,q),-1))),Power(Times(q,Plus(p,C1),Power(Times(Plus(q,Negate(b),Times(CN1,C2,c,x)),Power(Times(C2,q),-1)),Plus(p,C1))),-1)),x))),And(FreeQ(List(a,b,c,p),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),Not(IntegerQ(Times(C4,p)))))),
IIntegrate(625,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,u_),Times(c_DEFAULT,Sqr(u_))),p_),x_Symbol),
    Condition(Dist(Power(Coefficient(u,x,C1),-1),Subst(Int(Power(Plus(a,Times(b,x),Times(c,Sqr(x))),p),x),x,u),x),And(FreeQ(List(a,b,c,p),x),LinearQ(u,x),NeQ(u,x)))),
IIntegrate(626,Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(Plus(d,Times(e,x)),Plus(m,p)),Power(Plus(Times(a,Power(d,-1)),Times(c,x,Power(e,-1))),p)),x),And(FreeQ(List(a,b,c,d,e,m),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),EqQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),IntegerQ(p)))),
IIntegrate(627,Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),m_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(Plus(d,Times(e,x)),Plus(m,p)),Power(Plus(Times(a,Power(d,-1)),Times(c,x,Power(e,-1))),p)),x),And(FreeQ(List(a,c,d,e,m,p),x),EqQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),Or(IntegerQ(p),And(GtQ(a,C0),GtQ(d,C0),IntegerQ(Plus(m,p))))))),
IIntegrate(628,Int(Times(Plus(d_,Times(e_DEFAULT,x_)),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),-1)),x_Symbol),
    Condition(Simp(Times(d,Log(RemoveContent(Plus(a,Times(b,x),Times(c,Sqr(x))),x)),Power(b,-1)),x),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(C2,c,d),Times(CN1,b,e)),C0)))),
IIntegrate(629,Int(Times(Plus(d_,Times(e_DEFAULT,x_)),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Simp(Times(d,Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,C1)),Power(Times(b,Plus(p,C1)),-1)),x),And(FreeQ(List(a,b,c,d,e,p),x),EqQ(Plus(Times(C2,c,d),Times(CN1,b,e)),C0),NeQ(p,CN1)))),
IIntegrate(630,Int(Times(Plus(d_,Times(e_DEFAULT,x_)),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(Plus(d,Times(e,x)),Plus(p,C1)),Power(Plus(Times(a,Power(d,-1)),Times(c,x,Power(e,-1))),p)),x),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Times(C2,c,d),Times(CN1,b,e)),C0),IGtQ(p,C0),EqQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0)))),
IIntegrate(631,Int(Times(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Plus(d,Times(e,x)),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),p)),x),x),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Times(C2,c,d),Times(CN1,b,e)),C0),IntegerQ(p),Or(GtQ(p,C0),EqQ(a,C0))))),
IIntegrate(632,Int(Times(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),Power(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),-1)),x_Symbol),
    Condition(With(List(Set(q,Rt(Plus(Sqr(b),Times(CN1,C4,a,c)),C2))),Plus(Dist(Times(Plus(Times(c,d),Times(CN1,e,Plus(Times(C1D2,b),Times(CN1,C1D2,q)))),Power(q,-1)),Int(Power(Plus(Times(C1D2,b),Times(CN1,C1D2,q),Times(c,x)),-1),x),x),Negate(Dist(Times(Plus(Times(c,d),Times(CN1,e,Plus(Times(C1D2,b),Times(C1D2,q)))),Power(q,-1)),Int(Power(Plus(Times(C1D2,b),Times(C1D2,q),Times(c,x)),-1),x),x)))),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Times(C2,c,d),Times(CN1,b,e)),C0),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),NiceSqrtQ(Plus(Sqr(b),Times(CN1,C4,a,c)))))),
IIntegrate(633,Int(Times(Plus(d_,Times(e_DEFAULT,x_)),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),-1)),x_Symbol),
    Condition(With(List(Set(q,Rt(Times(CN1,a,c),C2))),Plus(Dist(Plus(Times(C1D2,e),Times(c,d,Power(Times(C2,q),-1))),Int(Power(Plus(Negate(q),Times(c,x)),-1),x),x),Dist(Plus(Times(C1D2,e),Times(CN1,c,d,Power(Times(C2,q),-1))),Int(Power(Plus(q,Times(c,x)),-1),x),x))),And(FreeQ(List(a,c,d,e),x),NiceSqrtQ(Times(CN1,a,c))))),
IIntegrate(634,Int(Times(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),Power(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),-1)),x_Symbol),
    Condition(Plus(Dist(Times(Plus(Times(C2,c,d),Times(CN1,b,e)),Power(Times(C2,c),-1)),Int(Power(Plus(a,Times(b,x),Times(c,Sqr(x))),-1),x),x),Dist(Times(e,Power(Times(C2,c),-1)),Int(Times(Plus(b,Times(C2,c,x)),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),-1)),x),x)),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Times(C2,c,d),Times(CN1,b,e)),C0),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),Not(NiceSqrtQ(Plus(Sqr(b),Times(CN1,C4,a,c))))))),
IIntegrate(635,Int(Times(Plus(d_,Times(e_DEFAULT,x_)),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),-1)),x_Symbol),
    Condition(Plus(Dist(d,Int(Power(Plus(a,Times(c,Sqr(x))),-1),x),x),Dist(e,Int(Times(x,Power(Plus(a,Times(c,Sqr(x))),-1)),x),x)),And(FreeQ(List(a,c,d,e),x),Not(NiceSqrtQ(Times(CN1,a,c)))))),
IIntegrate(636,Int(Times(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),QQ(-3L,2L))),x_Symbol),
    Condition(Simp(Times(CN2,Plus(Times(b,d),Times(CN1,C2,a,e),Times(Plus(Times(C2,c,d),Times(CN1,b,e)),x)),Power(Times(Plus(Sqr(b),Times(CN1,C4,a,c)),Sqrt(Plus(a,Times(b,x),Times(c,Sqr(x))))),-1)),x),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Times(C2,c,d),Times(CN1,b,e)),C0),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0)))),
IIntegrate(637,Int(Times(Plus(d_,Times(e_DEFAULT,x_)),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),QQ(-3L,2L))),x_Symbol),
    Condition(Simp(Times(Plus(Times(CN1,a,e),Times(c,d,x)),Power(Times(a,c,Sqrt(Plus(a,Times(c,Sqr(x))))),-1)),x),FreeQ(List(a,c,d,e),x))),
IIntegrate(638,Int(Times(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Plus(Times(b,d),Times(CN1,C2,a,e),Times(Plus(Times(C2,c,d),Times(CN1,b,e)),x)),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,C1)),Power(Times(Plus(p,C1),Plus(Sqr(b),Times(CN1,C4,a,c))),-1)),x),Negate(Dist(Times(Plus(Times(C2,p),C3),Plus(Times(C2,c,d),Times(CN1,b,e)),Power(Times(Plus(p,C1),Plus(Sqr(b),Times(CN1,C4,a,c))),-1)),Int(Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,C1)),x),x))),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Times(C2,c,d),Times(CN1,b,e)),C0),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),LtQ(p,CN1),NeQ(p,QQ(-3L,2L))))),
IIntegrate(639,Int(Times(Plus(d_,Times(e_DEFAULT,x_)),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Plus(Times(a,e),Times(CN1,c,d,x)),Power(Plus(a,Times(c,Sqr(x))),Plus(p,C1)),Power(Times(C2,a,c,Plus(p,C1)),-1)),x),Dist(Times(d,Plus(Times(C2,p),C3),Power(Times(C2,a,Plus(p,C1)),-1)),Int(Power(Plus(a,Times(c,Sqr(x))),Plus(p,C1)),x),x)),And(FreeQ(List(a,c,d,e),x),LtQ(p,CN1),NeQ(p,QQ(-3L,2L))))),
IIntegrate(640,Int(Times(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(e,Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,C1)),Power(Times(C2,c,Plus(p,C1)),-1)),x),Dist(Times(Plus(Times(C2,c,d),Times(CN1,b,e)),Power(Times(C2,c),-1)),Int(Power(Plus(a,Times(b,x),Times(c,Sqr(x))),p),x),x)),And(FreeQ(List(a,b,c,d,e,p),x),NeQ(Plus(Times(C2,c,d),Times(CN1,b,e)),C0),NeQ(p,CN1)))),
IIntegrate(641,Int(Times(Plus(d_,Times(e_DEFAULT,x_)),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(e,Power(Plus(a,Times(c,Sqr(x))),Plus(p,C1)),Power(Times(C2,c,Plus(p,C1)),-1)),x),Dist(d,Int(Power(Plus(a,Times(c,Sqr(x))),p),x),x)),And(FreeQ(List(a,c,d,e,p),x),NeQ(p,CN1)))),
IIntegrate(642,Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Power(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Dist(Times(Power(e,m),Power(Power(c,Times(C1D2,m)),-1)),Int(Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,Times(C1D2,m))),x),x),And(FreeQ(List(a,b,c,d,e,p),x),EqQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),Not(IntegerQ(p)),EqQ(Plus(Times(C2,c,d),Times(CN1,b,e)),C0),IntegerQ(Times(C1D2,m))))),
IIntegrate(643,Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Power(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Dist(Times(Power(e,Plus(m,Negate(C1))),Power(Power(c,Times(C1D2,Plus(m,Negate(C1)))),-1)),Int(Times(Plus(d,Times(e,x)),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,Times(C1D2,Plus(m,Negate(C1)))))),x),x),And(FreeQ(List(a,b,c,d,e,p),x),EqQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),Not(IntegerQ(p)),EqQ(Plus(Times(C2,c,d),Times(CN1,b,e)),C0),IntegerQ(Times(C1D2,Plus(m,Negate(C1))))))),
IIntegrate(644,Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Power(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Dist(Times(Power(Plus(a,Times(b,x),Times(c,Sqr(x))),p),Power(Power(Plus(d,Times(e,x)),Times(C2,p)),-1)),Int(Power(Plus(d,Times(e,x)),Plus(m,Times(C2,p))),x),x),And(FreeQ(List(a,b,c,d,e,m,p),x),EqQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),Not(IntegerQ(p)),EqQ(Plus(Times(C2,c,d),Times(CN1,b,e)),C0),Not(IntegerQ(m))))),
IIntegrate(645,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_),Power(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Dist(Times(Power(Plus(a,Times(b,x),Times(c,Sqr(x))),FracPart(p)),Power(Times(Power(c,IntPart(p)),Power(Plus(Times(C1D2,b),Times(c,x)),Times(C2,FracPart(p)))),-1)),Int(ExpandLinearProduct(Power(Plus(Times(C1D2,b),Times(c,x)),Times(C2,p)),Power(Plus(d,Times(e,x)),m),Times(C1D2,b),c,x),x),x),And(FreeQ(List(a,b,c,d,e,m,p),x),EqQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),Not(IntegerQ(p)),NeQ(Plus(Times(C2,c,d),Times(CN1,b,e)),C0),IGtQ(m,C0),EqQ(Plus(m,Times(CN1,C2,p),C1),C0)))),
IIntegrate(646,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_),Power(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Dist(Times(Power(Plus(a,Times(b,x),Times(c,Sqr(x))),FracPart(p)),Power(Times(Power(c,IntPart(p)),Power(Plus(Times(C1D2,b),Times(c,x)),Times(C2,FracPart(p)))),-1)),Int(Times(Power(Plus(d,Times(e,x)),m),Power(Plus(Times(C1D2,b),Times(c,x)),Times(C2,p))),x),x),And(FreeQ(List(a,b,c,d,e,m,p),x),EqQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),Not(IntegerQ(p)),NeQ(Plus(Times(C2,c,d),Times(CN1,b,e)),C0)))),
IIntegrate(647,Int(Times(Power(Times(e_DEFAULT,x_),m_DEFAULT),Power(Plus(Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Power(e,p),-1),Int(Times(Power(Times(e,x),Plus(m,p)),Power(Plus(b,Times(c,x)),p)),x),x),And(FreeQ(List(b,c,e,m),x),IntegerQ(p)))),
IIntegrate(648,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Simp(Times(e,Power(Plus(d,Times(e,x)),Plus(m,Negate(C1))),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,C1)),Power(Times(c,Plus(p,C1)),-1)),x),And(FreeQ(List(a,b,c,d,e,m,p),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),EqQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),Not(IntegerQ(p)),EqQ(Plus(m,p),C0)))),
IIntegrate(649,Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Simp(Times(e,Power(Plus(d,Times(e,x)),Plus(m,Negate(C1))),Power(Plus(a,Times(c,Sqr(x))),Plus(p,C1)),Power(Times(c,Plus(p,C1)),-1)),x),And(FreeQ(List(a,c,d,e,m,p),x),EqQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),Not(IntegerQ(p)),EqQ(Plus(m,p),C0)))),
IIntegrate(650,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Simp(Times(e,Power(Plus(d,Times(e,x)),m),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,C1)),Power(Times(Plus(p,C1),Plus(Times(C2,c,d),Times(CN1,b,e))),-1)),x),And(FreeQ(List(a,b,c,d,e,m,p),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),EqQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),Not(IntegerQ(p)),EqQ(Plus(m,Times(C2,p),C2),C0))))
  );
}
