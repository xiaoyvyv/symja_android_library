package org.matheclipse.core.integrate.rubi;


import org.matheclipse.core.interfaces.IAST;

import static org.matheclipse.core.expression.F.$;
import static org.matheclipse.core.expression.F.$s;
import static org.matheclipse.core.expression.F.And;
import static org.matheclipse.core.expression.F.ArcTan;
import static org.matheclipse.core.expression.F.C0;
import static org.matheclipse.core.expression.F.C1;
import static org.matheclipse.core.expression.F.C1D2;
import static org.matheclipse.core.expression.F.C2;
import static org.matheclipse.core.expression.F.C3;
import static org.matheclipse.core.expression.F.CN1;
import static org.matheclipse.core.expression.F.CN1D2;
import static org.matheclipse.core.expression.F.CN2;
import static org.matheclipse.core.expression.F.CSqrt2;
import static org.matheclipse.core.expression.F.Condition;
import static org.matheclipse.core.expression.F.Cos;
import static org.matheclipse.core.expression.F.EllipticE;
import static org.matheclipse.core.expression.F.EllipticF;
import static org.matheclipse.core.expression.F.FreeQ;
import static org.matheclipse.core.expression.F.Hypergeometric2F1;
import static org.matheclipse.core.expression.F.IIntegrate;
import static org.matheclipse.core.expression.F.IntegerQ;
import static org.matheclipse.core.expression.F.List;
import static org.matheclipse.core.expression.F.Negate;
import static org.matheclipse.core.expression.F.Not;
import static org.matheclipse.core.expression.F.Or;
import static org.matheclipse.core.expression.F.Pi;
import static org.matheclipse.core.expression.F.Plus;
import static org.matheclipse.core.expression.F.Power;
import static org.matheclipse.core.expression.F.QQ;
import static org.matheclipse.core.expression.F.Set;
import static org.matheclipse.core.expression.F.Simplify;
import static org.matheclipse.core.expression.F.Sin;
import static org.matheclipse.core.expression.F.Sqr;
import static org.matheclipse.core.expression.F.Sqrt;
import static org.matheclipse.core.expression.F.Tan;
import static org.matheclipse.core.expression.F.Times;
import static org.matheclipse.core.expression.F.With;
import static org.matheclipse.core.expression.F.a;
import static org.matheclipse.core.expression.F.a_;
import static org.matheclipse.core.expression.F.b;
import static org.matheclipse.core.expression.F.b_DEFAULT;
import static org.matheclipse.core.expression.F.c;
import static org.matheclipse.core.expression.F.c_DEFAULT;
import static org.matheclipse.core.expression.F.d;
import static org.matheclipse.core.expression.F.d_DEFAULT;
import static org.matheclipse.core.expression.F.e;
import static org.matheclipse.core.expression.F.e_DEFAULT;
import static org.matheclipse.core.expression.F.f;
import static org.matheclipse.core.expression.F.f_DEFAULT;
import static org.matheclipse.core.expression.F.g;
import static org.matheclipse.core.expression.F.g_DEFAULT;
import static org.matheclipse.core.expression.F.m;
import static org.matheclipse.core.expression.F.m_;
import static org.matheclipse.core.expression.F.m_DEFAULT;
import static org.matheclipse.core.expression.F.n;
import static org.matheclipse.core.expression.F.n_;
import static org.matheclipse.core.expression.F.p;
import static org.matheclipse.core.expression.F.p_;
import static org.matheclipse.core.expression.F.p_DEFAULT;
import static org.matheclipse.core.expression.F.q;
import static org.matheclipse.core.expression.F.x;
import static org.matheclipse.core.expression.F.x_;
import static org.matheclipse.core.expression.F.x_Symbol;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Dist;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.EqQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.FracPart;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.FreeFactors;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.GeQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.GtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.IGtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.ILtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Int;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.IntPart;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.IntegersQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.LeQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.LtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.NeQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.NegQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.PosQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Rt;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Simp;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Subst;

/** 
 * IndefiniteIntegrationRules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class IntRules53 { 
  public static IAST RULES = List( 
IIntegrate(2651,Int(Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),n_),x_Symbol),
    Condition(Negate(Simp(Times(Power(C2,Plus(n,C1D2)),Power(a,Plus(n,Negate(C1D2))),b,Cos(Plus(c,Times(d,x))),Hypergeometric2F1(C1D2,Plus(C1D2,Negate(n)),QQ(3L,2L),Times(C1D2,C1,Plus(C1,Times(CN1,b,Sin(Plus(c,Times(d,x))),Power(a,-1))))),Power(Times(d,Sqrt(Plus(a,Times(b,Sin(Plus(c,Times(d,x))))))),-1)),x)),And(FreeQ(List(a,b,c,d,n),x),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),Not(IntegerQ(Times(C2,n))),GtQ(a,C0)))),
IIntegrate(2652,Int(Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),n_),x_Symbol),
    Condition(Dist(Times(Power(a,IntPart(n)),Power(Plus(a,Times(b,Sin(Plus(c,Times(d,x))))),FracPart(n)),Power(Power(Plus(C1,Times(b,Sin(Plus(c,Times(d,x))),Power(a,-1))),FracPart(n)),-1)),Int(Power(Plus(C1,Times(b,Sin(Plus(c,Times(d,x))),Power(a,-1))),n),x),x),And(FreeQ(List(a,b,c,d,n),x),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),Not(IntegerQ(Times(C2,n))),Not(GtQ(a,C0))))),
IIntegrate(2653,Int(Sqrt(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))))),x_Symbol),
    Condition(Simp(Times(C2,Sqrt(Plus(a,b)),EllipticE(Times(C1D2,C1,Plus(c,Times(CN1,C1D2,Pi),Times(d,x))),Times(C2,b,Power(Plus(a,b),-1))),Power(d,-1)),x),And(FreeQ(List(a,b,c,d),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),GtQ(Plus(a,b),C0)))),
IIntegrate(2654,Int(Sqrt(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))))),x_Symbol),
    Condition(Simp(Times(C2,Sqrt(Plus(a,Negate(b))),EllipticE(Times(C1D2,C1,Plus(c,Times(C1D2,Pi),Times(d,x))),Times(CN2,b,Power(Plus(a,Negate(b)),-1))),Power(d,-1)),x),And(FreeQ(List(a,b,c,d),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),GtQ(Plus(a,Negate(b)),C0)))),
IIntegrate(2655,Int(Sqrt(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))))),x_Symbol),
    Condition(Dist(Times(Sqrt(Plus(a,Times(b,Sin(Plus(c,Times(d,x)))))),Power(Times(Plus(a,Times(b,Sin(Plus(c,Times(d,x))))),Power(Plus(a,b),-1)),CN1D2)),Int(Sqrt(Plus(Times(a,Power(Plus(a,b),-1)),Times(b,Sin(Plus(c,Times(d,x))),Power(Plus(a,b),-1)))),x),x),And(FreeQ(List(a,b,c,d),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),Not(GtQ(Plus(a,b),C0))))),
IIntegrate(2656,Int(Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),n_),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,Cos(Plus(c,Times(d,x))),Power(Plus(a,Times(b,Sin(Plus(c,Times(d,x))))),Plus(n,Negate(C1))),Power(Times(d,n),-1)),x)),Dist(Power(n,-1),Int(Times(Power(Plus(a,Times(b,Sin(Plus(c,Times(d,x))))),Plus(n,Negate(C2))),Simp(Plus(Times(Sqr(a),n),Times(Sqr(b),Plus(n,Negate(C1))),Times(a,b,Plus(Times(C2,n),Negate(C1)),Sin(Plus(c,Times(d,x))))),x)),x),x)),And(FreeQ(List(a,b,c,d),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),GtQ(n,C1),IntegerQ(Times(C2,n))))),
IIntegrate(2657,Int(Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),-1),x_Symbol),
    Condition(With(List(Set(q,Rt(Plus(Sqr(a),Negate(Sqr(b))),C2))),Plus(Simp(Times(x,Power(q,-1)),x),Simp(Times(C2,ArcTan(Times(b,Cos(Plus(c,Times(d,x))),Power(Plus(a,q,Times(b,Sin(Plus(c,Times(d,x))))),-1))),Power(Times(d,q),-1)),x))),And(FreeQ(List(a,b,c,d),x),GtQ(Plus(Sqr(a),Negate(Sqr(b))),C0),PosQ(a)))),
IIntegrate(2658,Int(Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),-1),x_Symbol),
    Condition(With(List(Set(q,Rt(Plus(Sqr(a),Negate(Sqr(b))),C2))),Plus(Negate(Simp(Times(x,Power(q,-1)),x)),Negate(Simp(Times(C2,ArcTan(Times(b,Cos(Plus(c,Times(d,x))),Power(Plus(a,Negate(q),Times(b,Sin(Plus(c,Times(d,x))))),-1))),Power(Times(d,q),-1)),x)))),And(FreeQ(List(a,b,c,d),x),GtQ(Plus(Sqr(a),Negate(Sqr(b))),C0),NegQ(a)))),
IIntegrate(2659,Int(Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(Times(C1D2,Pi),c_DEFAULT,Times(d_DEFAULT,x_))))),-1),x_Symbol),
    Condition(With(List(Set(e,FreeFactors(Tan(Times(C1D2,Plus(c,Times(d,x)))),x))),Dist(Times(C2,e,Power(d,-1)),Subst(Int(Power(Plus(a,b,Times(Plus(a,Negate(b)),Sqr(e),Sqr(x))),-1),x),x,Times(Tan(Times(C1D2,Plus(c,Times(d,x)))),Power(e,-1))),x)),And(FreeQ(List(a,b,c,d),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0)))),
IIntegrate(2660,Int(Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),-1),x_Symbol),
    Condition(With(List(Set(e,FreeFactors(Tan(Times(C1D2,Plus(c,Times(d,x)))),x))),Dist(Times(C2,e,Power(d,-1)),Subst(Int(Power(Plus(a,Times(C2,b,e,x),Times(a,Sqr(e),Sqr(x))),-1),x),x,Times(Tan(Times(C1D2,Plus(c,Times(d,x)))),Power(e,-1))),x)),And(FreeQ(List(a,b,c,d),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0)))),
IIntegrate(2661,Int(Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),CN1D2),x_Symbol),
    Condition(Simp(Times(C2,EllipticF(Times(C1D2,C1,Plus(c,Times(CN1,C1D2,Pi),Times(d,x))),Times(C2,b,Power(Plus(a,b),-1))),Power(Times(d,Sqrt(Plus(a,b))),-1)),x),And(FreeQ(List(a,b,c,d),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),GtQ(Plus(a,b),C0)))),
IIntegrate(2662,Int(Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),CN1D2),x_Symbol),
    Condition(Simp(Times(C2,EllipticF(Times(C1D2,C1,Plus(c,Times(C1D2,Pi),Times(d,x))),Times(CN2,b,Power(Plus(a,Negate(b)),-1))),Power(Times(d,Sqrt(Plus(a,Negate(b)))),-1)),x),And(FreeQ(List(a,b,c,d),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),GtQ(Plus(a,Negate(b)),C0)))),
IIntegrate(2663,Int(Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),CN1D2),x_Symbol),
    Condition(Dist(Times(Sqrt(Times(Plus(a,Times(b,Sin(Plus(c,Times(d,x))))),Power(Plus(a,b),-1))),Power(Plus(a,Times(b,Sin(Plus(c,Times(d,x))))),CN1D2)),Int(Power(Plus(Times(a,Power(Plus(a,b),-1)),Times(b,Sin(Plus(c,Times(d,x))),Power(Plus(a,b),-1))),CN1D2),x),x),And(FreeQ(List(a,b,c,d),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),Not(GtQ(Plus(a,b),C0))))),
IIntegrate(2664,Int(Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),n_),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,Cos(Plus(c,Times(d,x))),Power(Plus(a,Times(b,Sin(Plus(c,Times(d,x))))),Plus(n,C1)),Power(Times(d,Plus(n,C1),Plus(Sqr(a),Negate(Sqr(b)))),-1)),x)),Dist(Power(Times(Plus(n,C1),Plus(Sqr(a),Negate(Sqr(b)))),-1),Int(Times(Power(Plus(a,Times(b,Sin(Plus(c,Times(d,x))))),Plus(n,C1)),Simp(Plus(Times(a,Plus(n,C1)),Times(CN1,b,Plus(n,C2),Sin(Plus(c,Times(d,x))))),x)),x),x)),And(FreeQ(List(a,b,c,d),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),LtQ(n,CN1),IntegerQ(Times(C2,n))))),
IIntegrate(2665,Int(Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),n_),x_Symbol),
    Condition(Dist(Times(Cos(Plus(c,Times(d,x))),Power(Times(d,Sqrt(Plus(C1,Sin(Plus(c,Times(d,x))))),Sqrt(Plus(C1,Negate(Sin(Plus(c,Times(d,x))))))),-1)),Subst(Int(Times(Power(Plus(a,Times(b,x)),n),Power(Times(Sqrt(Plus(C1,x)),Sqrt(Plus(C1,Negate(x)))),-1)),x),x,Sin(Plus(c,Times(d,x)))),x),And(FreeQ(List(a,b,c,d,n),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),Not(IntegerQ(Times(C2,n)))))),
IIntegrate(2666,Int(Power(Plus(a_,Times($($s("§cos"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),b_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),n_),x_Symbol),
    Condition(Int(Power(Plus(a,Times(C1D2,b,Sin(Plus(Times(C2,c),Times(C2,d,x))))),n),x),FreeQ(List(a,b,c,d,n),x))),
IIntegrate(2667,Int(Times(Power($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),p_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Times(Power(b,p),f),-1),Subst(Int(Times(Power(Plus(a,x),Plus(m,Times(C1D2,Plus(p,Negate(C1))))),Power(Plus(a,Negate(x)),Times(C1D2,Plus(p,Negate(C1))))),x),x,Times(b,Sin(Plus(e,Times(f,x))))),x),And(FreeQ(List(a,b,e,f,m),x),IntegerQ(Times(C1D2,Plus(p,Negate(C1)))),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),Or(GeQ(p,CN1),Not(IntegerQ(Plus(m,C1D2))))))),
IIntegrate(2668,Int(Times(Power($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),p_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Times(Power(b,p),f),-1),Subst(Int(Times(Power(Plus(a,x),m),Power(Plus(Sqr(b),Negate(Sqr(x))),Times(C1D2,Plus(p,Negate(C1))))),x),x,Times(b,Sin(Plus(e,Times(f,x))))),x),And(FreeQ(List(a,b,e,f,m),x),IntegerQ(Times(C1D2,Plus(p,Negate(C1)))),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0)))),
IIntegrate(2669,Int(Times(Power(Times($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),g_DEFAULT),p_),Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,Power(Times(g,Cos(Plus(e,Times(f,x)))),Plus(p,C1)),Power(Times(f,g,Plus(p,C1)),-1)),x)),Dist(a,Int(Power(Times(g,Cos(Plus(e,Times(f,x)))),p),x),x)),And(FreeQ(List(a,b,e,f,g,p),x),Or(IntegerQ(Times(C2,p)),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0))))),
IIntegrate(2670,Int(Times(Power(Times($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),g_DEFAULT),p_),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_)),x_Symbol),
    Condition(Dist(Power(Times(a,Power(g,-1)),Times(C2,m)),Int(Times(Power(Times(g,Cos(Plus(e,Times(f,x)))),Plus(Times(C2,m),p)),Power(Power(Plus(a,Times(CN1,b,Sin(Plus(e,Times(f,x))))),m),-1)),x),x),And(FreeQ(List(a,b,e,f,g),x),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),IntegerQ(m),LtQ(p,CN1),GeQ(Plus(Times(C2,m),p),C0)))),
IIntegrate(2671,Int(Times(Power(Times($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),g_DEFAULT),p_),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_)),x_Symbol),
    Condition(Simp(Times(b,Power(Times(g,Cos(Plus(e,Times(f,x)))),Plus(p,C1)),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),m),Power(Times(a,f,g,m),-1)),x),And(FreeQ(List(a,b,e,f,g,m,p),x),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),EqQ(Simplify(Plus(m,p,C1)),C0),Not(ILtQ(p,C0))))),
IIntegrate(2672,Int(Times(Power(Times($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),g_DEFAULT),p_),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_)),x_Symbol),
    Condition(Plus(Simp(Times(b,Power(Times(g,Cos(Plus(e,Times(f,x)))),Plus(p,C1)),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),m),Power(Times(a,f,g,Simplify(Plus(Times(C2,m),p,C1))),-1)),x),Dist(Times(Simplify(Plus(m,p,C1)),Power(Times(a,Simplify(Plus(Times(C2,m),p,C1))),-1)),Int(Times(Power(Times(g,Cos(Plus(e,Times(f,x)))),p),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(m,C1))),x),x)),And(FreeQ(List(a,b,e,f,g,m,p),x),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),ILtQ(Simplify(Plus(m,p,C1)),C0),NeQ(Plus(Times(C2,m),p,C1),C0),Not(IGtQ(m,C0))))),
IIntegrate(2673,Int(Times(Power(Times($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),g_DEFAULT),p_),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_)),x_Symbol),
    Condition(Simp(Times(b,Power(Times(g,Cos(Plus(e,Times(f,x)))),Plus(p,C1)),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(m,Negate(C1))),Power(Times(f,g,Plus(m,Negate(C1))),-1)),x),And(FreeQ(List(a,b,e,f,g,m,p),x),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),EqQ(Plus(Times(C2,m),p,Negate(C1)),C0),NeQ(m,C1)))),
IIntegrate(2674,Int(Times(Power(Times($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),g_DEFAULT),p_),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,Power(Times(g,Cos(Plus(e,Times(f,x)))),Plus(p,C1)),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(m,Negate(C1))),Power(Times(f,g,Plus(m,p)),-1)),x)),Dist(Times(a,Plus(Times(C2,m),p,Negate(C1)),Power(Plus(m,p),-1)),Int(Times(Power(Times(g,Cos(Plus(e,Times(f,x)))),p),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(m,Negate(C1)))),x),x)),And(FreeQ(List(a,b,e,f,g,m,p),x),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),IGtQ(Simplify(Times(C1D2,Plus(Times(C2,m),p,Negate(C1)))),C0),NeQ(Plus(m,p),C0)))),
IIntegrate(2675,Int(Times(Power(Times($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),g_DEFAULT),p_),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,Power(Times(g,Cos(Plus(e,Times(f,x)))),Plus(p,C1)),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),m),Power(Times(a,f,g,Plus(p,C1)),-1)),x)),Dist(Times(a,Plus(m,p,C1),Power(Times(Sqr(g),Plus(p,C1)),-1)),Int(Times(Power(Times(g,Cos(Plus(e,Times(f,x)))),Plus(p,C2)),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(m,Negate(C1)))),x),x)),And(FreeQ(List(a,b,e,f,g),x),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),GtQ(m,C0),LeQ(p,Times(CN2,m)),IntegersQ(Plus(m,C1D2),Times(C2,p))))),
IIntegrate(2676,Int(Times(Power(Times($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),g_DEFAULT),p_),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_)),x_Symbol),
    Condition(Plus(Simp(Times(CN2,b,Power(Times(g,Cos(Plus(e,Times(f,x)))),Plus(p,C1)),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(m,Negate(C1))),Power(Times(f,g,Plus(p,C1)),-1)),x),Dist(Times(Sqr(b),Plus(Times(C2,m),p,Negate(C1)),Power(Times(Sqr(g),Plus(p,C1)),-1)),Int(Times(Power(Times(g,Cos(Plus(e,Times(f,x)))),Plus(p,C2)),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(m,Negate(C2)))),x),x)),And(FreeQ(List(a,b,e,f,g),x),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),GtQ(m,C1),LtQ(p,CN1),IntegersQ(Times(C2,m),Times(C2,p))))),
IIntegrate(2677,Int(Times(Power(Times($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),g_DEFAULT),CN1D2),Sqrt(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),x_Symbol),
    Condition(Plus(Dist(Times(a,Sqrt(Plus(C1,Cos(Plus(e,Times(f,x))))),Sqrt(Plus(a,Times(b,Sin(Plus(e,Times(f,x)))))),Power(Plus(a,Times(a,Cos(Plus(e,Times(f,x)))),Times(b,Sin(Plus(e,Times(f,x))))),-1)),Int(Times(Sqrt(Plus(C1,Cos(Plus(e,Times(f,x))))),Power(Times(g,Cos(Plus(e,Times(f,x)))),CN1D2)),x),x),Dist(Times(b,Sqrt(Plus(C1,Cos(Plus(e,Times(f,x))))),Sqrt(Plus(a,Times(b,Sin(Plus(e,Times(f,x)))))),Power(Plus(a,Times(a,Cos(Plus(e,Times(f,x)))),Times(b,Sin(Plus(e,Times(f,x))))),-1)),Int(Times(Sin(Plus(e,Times(f,x))),Power(Times(Sqrt(Times(g,Cos(Plus(e,Times(f,x))))),Sqrt(Plus(C1,Cos(Plus(e,Times(f,x)))))),-1)),x),x)),And(FreeQ(List(a,b,e,f,g),x),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0)))),
IIntegrate(2678,Int(Times(Power(Times($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),g_DEFAULT),p_),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,Power(Times(g,Cos(Plus(e,Times(f,x)))),Plus(p,C1)),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(m,Negate(C1))),Power(Times(f,g,Plus(m,p)),-1)),x)),Dist(Times(a,Plus(Times(C2,m),p,Negate(C1)),Power(Plus(m,p),-1)),Int(Times(Power(Times(g,Cos(Plus(e,Times(f,x)))),p),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(m,Negate(C1)))),x),x)),And(FreeQ(List(a,b,e,f,g,m,p),x),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),GtQ(m,C0),NeQ(Plus(m,p),C0),IntegersQ(Times(C2,m),Times(C2,p))))),
IIntegrate(2679,Int(Times(Power(Times($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),g_DEFAULT),p_),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_)),x_Symbol),
    Condition(Plus(Simp(Times(g,Power(Times(g,Cos(Plus(e,Times(f,x)))),Plus(p,Negate(C1))),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(b,f,Plus(m,p)),-1)),x),Dist(Times(Sqr(g),Plus(p,Negate(C1)),Power(Times(a,Plus(m,p)),-1)),Int(Times(Power(Times(g,Cos(Plus(e,Times(f,x)))),Plus(p,Negate(C2))),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(m,C1))),x),x)),And(FreeQ(List(a,b,e,f,g),x),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),LtQ(m,CN1),GtQ(p,C1),Or(GtQ(m,CN2),EqQ(Plus(Times(C2,m),p,C1),C0),And(EqQ(m,CN2),IntegerQ(p))),NeQ(Plus(m,p),C0),IntegersQ(Times(C2,m),Times(C2,p))))),
IIntegrate(2680,Int(Times(Power(Times($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),g_DEFAULT),p_),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_)),x_Symbol),
    Condition(Plus(Simp(Times(C2,g,Power(Times(g,Cos(Plus(e,Times(f,x)))),Plus(p,Negate(C1))),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(b,f,Plus(Times(C2,m),p,C1)),-1)),x),Dist(Times(Sqr(g),Plus(p,Negate(C1)),Power(Times(Sqr(b),Plus(Times(C2,m),p,C1)),-1)),Int(Times(Power(Times(g,Cos(Plus(e,Times(f,x)))),Plus(p,Negate(C2))),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(m,C2))),x),x)),And(FreeQ(List(a,b,e,f,g),x),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),LeQ(m,CN2),GtQ(p,C1),NeQ(Plus(Times(C2,m),p,C1),C0),Not(ILtQ(Plus(m,p,C1),C0)),IntegersQ(Times(C2,m),Times(C2,p))))),
IIntegrate(2681,Int(Times(Power(Times($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),g_DEFAULT),p_),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_)),x_Symbol),
    Condition(Plus(Simp(Times(b,Power(Times(g,Cos(Plus(e,Times(f,x)))),Plus(p,C1)),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),m),Power(Times(a,f,g,Plus(Times(C2,m),p,C1)),-1)),x),Dist(Times(Plus(m,p,C1),Power(Times(a,Plus(Times(C2,m),p,C1)),-1)),Int(Times(Power(Times(g,Cos(Plus(e,Times(f,x)))),p),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(m,C1))),x),x)),And(FreeQ(List(a,b,e,f,g,m,p),x),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),LtQ(m,CN1),NeQ(Plus(Times(C2,m),p,C1),C0),IntegersQ(Times(C2,m),Times(C2,p))))),
IIntegrate(2682,Int(Times(Power(Times($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),g_DEFAULT),p_),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),-1)),x_Symbol),
    Condition(Plus(Simp(Times(g,Power(Times(g,Cos(Plus(e,Times(f,x)))),Plus(p,Negate(C1))),Power(Times(b,f,Plus(p,Negate(C1))),-1)),x),Dist(Times(Sqr(g),Power(a,-1)),Int(Power(Times(g,Cos(Plus(e,Times(f,x)))),Plus(p,Negate(C2))),x),x)),And(FreeQ(List(a,b,e,f,g),x),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),GtQ(p,C1),IntegerQ(Times(C2,p))))),
IIntegrate(2683,Int(Times(Power(Times($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),g_DEFAULT),p_),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),-1)),x_Symbol),
    Condition(Plus(Simp(Times(b,Power(Times(g,Cos(Plus(e,Times(f,x)))),Plus(p,C1)),Power(Times(a,f,g,Plus(p,Negate(C1)),Plus(a,Times(b,Sin(Plus(e,Times(f,x)))))),-1)),x),Dist(Times(p,Power(Times(a,Plus(p,Negate(C1))),-1)),Int(Power(Times(g,Cos(Plus(e,Times(f,x)))),p),x),x)),And(FreeQ(List(a,b,e,f,g,p),x),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),Not(GeQ(p,C1)),IntegerQ(Times(C2,p))))),
IIntegrate(2684,Int(Times(Sqrt(Times($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),g_DEFAULT)),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1D2)),x_Symbol),
    Condition(Plus(Dist(Times(g,Sqrt(Plus(C1,Cos(Plus(e,Times(f,x))))),Sqrt(Plus(a,Times(b,Sin(Plus(e,Times(f,x)))))),Power(Plus(a,Times(a,Cos(Plus(e,Times(f,x)))),Times(b,Sin(Plus(e,Times(f,x))))),-1)),Int(Times(Sqrt(Plus(C1,Cos(Plus(e,Times(f,x))))),Power(Times(g,Cos(Plus(e,Times(f,x)))),CN1D2)),x),x),Negate(Dist(Times(g,Sqrt(Plus(C1,Cos(Plus(e,Times(f,x))))),Sqrt(Plus(a,Times(b,Sin(Plus(e,Times(f,x)))))),Power(Plus(b,Times(b,Cos(Plus(e,Times(f,x)))),Times(a,Sin(Plus(e,Times(f,x))))),-1)),Int(Times(Sin(Plus(e,Times(f,x))),Power(Times(Sqrt(Times(g,Cos(Plus(e,Times(f,x))))),Sqrt(Plus(C1,Cos(Plus(e,Times(f,x)))))),-1)),x),x))),And(FreeQ(List(a,b,e,f,g),x),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0)))),
IIntegrate(2685,Int(Times(Power(Times($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),g_DEFAULT),QQ(3L,2L)),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1D2)),x_Symbol),
    Condition(Plus(Simp(Times(g,Sqrt(Times(g,Cos(Plus(e,Times(f,x))))),Sqrt(Plus(a,Times(b,Sin(Plus(e,Times(f,x)))))),Power(Times(b,f),-1)),x),Dist(Times(Sqr(g),Power(Times(C2,a),-1)),Int(Times(Sqrt(Plus(a,Times(b,Sin(Plus(e,Times(f,x)))))),Power(Times(g,Cos(Plus(e,Times(f,x)))),CN1D2)),x),x)),And(FreeQ(List(a,b,e,f,g),x),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0)))),
IIntegrate(2686,Int(Times(Power(Times($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),g_DEFAULT),p_),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1D2)),x_Symbol),
    Condition(Plus(Simp(Times(CN2,b,Power(Times(g,Cos(Plus(e,Times(f,x)))),Plus(p,C1)),Power(Times(f,g,Plus(Times(C2,p),Negate(C1)),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),QQ(3L,2L))),-1)),x),Dist(Times(C2,a,Plus(p,Negate(C2)),Power(Plus(Times(C2,p),Negate(C1)),-1)),Int(Times(Power(Times(g,Cos(Plus(e,Times(f,x)))),p),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),QQ(-3L,2L))),x),x)),And(FreeQ(List(a,b,e,f,g),x),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),GtQ(p,C2),IntegerQ(Times(C2,p))))),
IIntegrate(2687,Int(Times(Power(Times($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),g_DEFAULT),p_),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1D2)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,Power(Times(g,Cos(Plus(e,Times(f,x)))),Plus(p,C1)),Power(Times(a,f,g,Plus(p,C1),Sqrt(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))))),-1)),x)),Dist(Times(a,Plus(Times(C2,p),C1),Power(Times(C2,Sqr(g),Plus(p,C1)),-1)),Int(Times(Power(Times(g,Cos(Plus(e,Times(f,x)))),Plus(p,C2)),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),QQ(-3L,2L))),x),x)),And(FreeQ(List(a,b,e,f,g),x),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),LtQ(p,CN1),IntegerQ(Times(C2,p))))),
IIntegrate(2688,Int(Times(Power(Times($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),g_DEFAULT),p_),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(a,m),Power(Times(g,Cos(Plus(e,Times(f,x)))),Plus(p,C1)),Power(Times(f,g,Power(Plus(C1,Sin(Plus(e,Times(f,x)))),Times(C1D2,Plus(p,C1))),Power(Plus(C1,Negate(Sin(Plus(e,Times(f,x))))),Times(C1D2,Plus(p,C1)))),-1)),Subst(Int(Times(Power(Plus(C1,Times(b,x,Power(a,-1))),Plus(m,Times(C1D2,Plus(p,Negate(C1))))),Power(Plus(C1,Times(CN1,b,x,Power(a,-1))),Times(C1D2,Plus(p,Negate(C1))))),x),x,Sin(Plus(e,Times(f,x)))),x),And(FreeQ(List(a,b,e,f,g,p),x),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),IntegerQ(m)))),
IIntegrate(2689,Int(Times(Power(Times($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),g_DEFAULT),p_),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Sqr(a),Power(Times(g,Cos(Plus(e,Times(f,x)))),Plus(p,C1)),Power(Times(f,g,Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Times(C1D2,Plus(p,C1))),Power(Plus(a,Times(CN1,b,Sin(Plus(e,Times(f,x))))),Times(C1D2,Plus(p,C1)))),-1)),Subst(Int(Times(Power(Plus(a,Times(b,x)),Plus(m,Times(C1D2,Plus(p,Negate(C1))))),Power(Plus(a,Times(CN1,b,x)),Times(C1D2,Plus(p,Negate(C1))))),x),x,Sin(Plus(e,Times(f,x)))),x),And(FreeQ(List(a,b,e,f,g,m,p),x),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),Not(IntegerQ(m))))),
IIntegrate(2690,Int(Times(Power(Times($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),g_DEFAULT),p_),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Times(g,Cos(Plus(e,Times(f,x)))),Plus(p,C1)),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),m),Sin(Plus(e,Times(f,x))),Power(Times(f,g,Plus(p,C1)),-1)),x)),Dist(Power(Times(Sqr(g),Plus(p,C1)),-1),Int(Times(Power(Times(g,Cos(Plus(e,Times(f,x)))),Plus(p,C2)),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(m,Negate(C1))),Plus(Times(a,Plus(p,C2)),Times(b,Plus(m,p,C2),Sin(Plus(e,Times(f,x)))))),x),x)),And(FreeQ(List(a,b,e,f,g),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),LtQ(C0,m,C1),LtQ(p,CN1),Or(IntegersQ(Times(C2,m),Times(C2,p)),IntegerQ(m))))),
IIntegrate(2691,Int(Times(Power(Times($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),g_DEFAULT),p_),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Times(g,Cos(Plus(e,Times(f,x)))),Plus(p,C1)),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(m,Negate(C1))),Plus(b,Times(a,Sin(Plus(e,Times(f,x))))),Power(Times(f,g,Plus(p,C1)),-1)),x)),Dist(Power(Times(Sqr(g),Plus(p,C1)),-1),Int(Times(Power(Times(g,Cos(Plus(e,Times(f,x)))),Plus(p,C2)),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(m,Negate(C2))),Plus(Times(Sqr(b),Plus(m,Negate(C1))),Times(Sqr(a),Plus(p,C2)),Times(a,b,Plus(m,p,C1),Sin(Plus(e,Times(f,x)))))),x),x)),And(FreeQ(List(a,b,e,f,g),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),GtQ(m,C1),LtQ(p,CN1),Or(IntegersQ(Times(C2,m),Times(C2,p)),IntegerQ(m))))),
IIntegrate(2692,Int(Times(Power(Times($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),g_DEFAULT),p_),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,Power(Times(g,Cos(Plus(e,Times(f,x)))),Plus(p,C1)),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(m,Negate(C1))),Power(Times(f,g,Plus(m,p)),-1)),x)),Dist(Power(Plus(m,p),-1),Int(Times(Power(Times(g,Cos(Plus(e,Times(f,x)))),p),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(m,Negate(C2))),Plus(Times(Sqr(b),Plus(m,Negate(C1))),Times(Sqr(a),Plus(m,p)),Times(a,b,Plus(Times(C2,m),p,Negate(C1)),Sin(Plus(e,Times(f,x)))))),x),x)),And(FreeQ(List(a,b,e,f,g,p),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),GtQ(m,C1),NeQ(Plus(m,p),C0),Or(IntegersQ(Times(C2,m),Times(C2,p)),IntegerQ(m))))),
IIntegrate(2693,Int(Times(Power(Times($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),g_DEFAULT),p_),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_)),x_Symbol),
    Condition(Plus(Simp(Times(g,Power(Times(g,Cos(Plus(e,Times(f,x)))),Plus(p,Negate(C1))),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(b,f,Plus(m,C1)),-1)),x),Dist(Times(Sqr(g),Plus(p,Negate(C1)),Power(Times(b,Plus(m,C1)),-1)),Int(Times(Power(Times(g,Cos(Plus(e,Times(f,x)))),Plus(p,Negate(C2))),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(m,C1)),Sin(Plus(e,Times(f,x)))),x),x)),And(FreeQ(List(a,b,e,f,g),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),LtQ(m,CN1),GtQ(p,C1),IntegersQ(Times(C2,m),Times(C2,p))))),
IIntegrate(2694,Int(Times(Power(Times($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),g_DEFAULT),p_),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,Power(Times(g,Cos(Plus(e,Times(f,x)))),Plus(p,C1)),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(f,g,Plus(Sqr(a),Negate(Sqr(b))),Plus(m,C1)),-1)),x)),Dist(Power(Times(Plus(Sqr(a),Negate(Sqr(b))),Plus(m,C1)),-1),Int(Times(Power(Times(g,Cos(Plus(e,Times(f,x)))),p),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(m,C1)),Plus(Times(a,Plus(m,C1)),Times(CN1,b,Plus(m,p,C2),Sin(Plus(e,Times(f,x)))))),x),x)),And(FreeQ(List(a,b,e,f,g,p),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),LtQ(m,CN1),IntegersQ(Times(C2,m),Times(C2,p))))),
IIntegrate(2695,Int(Times(Power(Times($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),g_DEFAULT),p_),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_)),x_Symbol),
    Condition(Plus(Simp(Times(g,Power(Times(g,Cos(Plus(e,Times(f,x)))),Plus(p,Negate(C1))),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(b,f,Plus(m,p)),-1)),x),Dist(Times(Sqr(g),Plus(p,Negate(C1)),Power(Times(b,Plus(m,p)),-1)),Int(Times(Power(Times(g,Cos(Plus(e,Times(f,x)))),Plus(p,Negate(C2))),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),m),Plus(b,Times(a,Sin(Plus(e,Times(f,x)))))),x),x)),And(FreeQ(List(a,b,e,f,g,m),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),GtQ(p,C1),NeQ(Plus(m,p),C0),IntegersQ(Times(C2,m),Times(C2,p))))),
IIntegrate(2696,Int(Times(Power(Times($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),g_DEFAULT),p_),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(g,Cos(Plus(e,Times(f,x)))),Plus(p,C1)),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(m,C1)),Plus(b,Times(CN1,a,Sin(Plus(e,Times(f,x))))),Power(Times(f,g,Plus(Sqr(a),Negate(Sqr(b))),Plus(p,C1)),-1)),x),Dist(Power(Times(Sqr(g),Plus(Sqr(a),Negate(Sqr(b))),Plus(p,C1)),-1),Int(Times(Power(Times(g,Cos(Plus(e,Times(f,x)))),Plus(p,C2)),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),m),Plus(Times(Sqr(a),Plus(p,C2)),Times(CN1,Sqr(b),Plus(m,p,C2)),Times(a,b,Plus(m,p,C3),Sin(Plus(e,Times(f,x)))))),x),x)),And(FreeQ(List(a,b,e,f,g,m),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),LtQ(p,CN1),IntegersQ(Times(C2,m),Times(C2,p))))),
IIntegrate(2697,Int(Times(Power(Times($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),g_DEFAULT),CN1D2),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1D2)),x_Symbol),
    Condition(Dist(Times(C2,CSqrt2,Sqrt(Times(g,Cos(Plus(e,Times(f,x))))),Sqrt(Times(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Power(Times(Plus(a,Negate(b)),Plus(C1,Negate(Sin(Plus(e,Times(f,x)))))),-1))),Power(Times(f,g,Sqrt(Plus(a,Times(b,Sin(Plus(e,Times(f,x)))))),Sqrt(Times(Plus(C1,Cos(Plus(e,Times(f,x))),Sin(Plus(e,Times(f,x)))),Power(Plus(C1,Cos(Plus(e,Times(f,x))),Negate(Sin(Plus(e,Times(f,x))))),-1)))),-1)),Subst(Int(Power(Plus(C1,Times(Plus(a,b),Power(x,4),Power(Plus(a,Negate(b)),-1))),CN1D2),x),x,Sqrt(Times(Plus(C1,Cos(Plus(e,Times(f,x))),Sin(Plus(e,Times(f,x)))),Power(Plus(C1,Cos(Plus(e,Times(f,x))),Negate(Sin(Plus(e,Times(f,x))))),-1)))),x),And(FreeQ(List(a,b,e,f,g),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0)))),
IIntegrate(2698,Int(Times(Power(Times($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),g_DEFAULT),p_),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_)),x_Symbol),
    Condition(Simp(Times(g,Power(Times(g,Cos(Plus(e,Times(f,x)))),Plus(p,Negate(C1))),Plus(C1,Negate(Sin(Plus(e,Times(f,x))))),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(CN1,Plus(a,Negate(b)),Plus(C1,Negate(Sin(Plus(e,Times(f,x))))),Power(Times(Plus(a,b),Plus(C1,Sin(Plus(e,Times(f,x))))),-1)),Times(C1D2,m)),Hypergeometric2F1(Plus(m,C1),Plus(Times(C1D2,m),C1),Plus(m,C2),Times(C2,Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Power(Times(Plus(a,b),Plus(C1,Sin(Plus(e,Times(f,x))))),-1))),Power(Times(f,Plus(a,b),Plus(m,C1)),-1)),x),And(FreeQ(List(a,b,e,f,g,m,p),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),EqQ(Plus(m,p,C1),C0)))),
IIntegrate(2699,Int(Times(Power(Times($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),g_DEFAULT),p_),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(g,Cos(Plus(e,Times(f,x)))),Plus(p,C1)),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(f,g,Plus(a,Negate(b)),Plus(p,C1)),-1)),x),Dist(Times(a,Power(Times(Sqr(g),Plus(a,Negate(b))),-1)),Int(Times(Power(Times(g,Cos(Plus(e,Times(f,x)))),Plus(p,C2)),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),m),Power(Plus(C1,Negate(Sin(Plus(e,Times(f,x))))),-1)),x),x)),And(FreeQ(List(a,b,e,f,g,m,p),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),EqQ(Plus(m,p,C2),C0)))),
IIntegrate(2700,Int(Times(Power(Times($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),g_DEFAULT),p_),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(g,Cos(Plus(e,Times(f,x)))),Plus(p,C1)),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(f,g,Plus(a,Negate(b)),Plus(p,C1)),-1)),x),Negate(Dist(Times(b,Plus(m,p,C2),Power(Times(Sqr(g),Plus(a,Negate(b)),Plus(p,C1)),-1)),Int(Times(Power(Times(g,Cos(Plus(e,Times(f,x)))),Plus(p,C2)),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),m)),x),x)),Dist(Times(a,Power(Times(Sqr(g),Plus(a,Negate(b))),-1)),Int(Times(Power(Times(g,Cos(Plus(e,Times(f,x)))),Plus(p,C2)),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),m),Power(Plus(C1,Negate(Sin(Plus(e,Times(f,x))))),-1)),x),x)),And(FreeQ(List(a,b,e,f,g,m,p),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),ILtQ(Plus(m,p,C2),C0))))
  );
}
