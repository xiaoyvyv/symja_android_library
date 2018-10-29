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
import static org.matheclipse.core.expression.F.CN3;
import static org.matheclipse.core.expression.F.Condition;
import static org.matheclipse.core.expression.F.Cos;
import static org.matheclipse.core.expression.F.FreeQ;
import static org.matheclipse.core.expression.F.Hypergeometric2F1;
import static org.matheclipse.core.expression.F.HypergeometricPFQ;
import static org.matheclipse.core.expression.F.IIntegrate;
import static org.matheclipse.core.expression.F.IntegerQ;
import static org.matheclipse.core.expression.F.List;
import static org.matheclipse.core.expression.F.Negate;
import static org.matheclipse.core.expression.F.Not;
import static org.matheclipse.core.expression.F.Or;
import static org.matheclipse.core.expression.F.Plus;
import static org.matheclipse.core.expression.F.PolynomialQ;
import static org.matheclipse.core.expression.F.Power;
import static org.matheclipse.core.expression.F.QQ;
import static org.matheclipse.core.expression.F.Set;
import static org.matheclipse.core.expression.F.Sin;
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
import static org.matheclipse.core.expression.F.q;
import static org.matheclipse.core.expression.F.q_;
import static org.matheclipse.core.expression.F.u;
import static org.matheclipse.core.expression.F.x;
import static org.matheclipse.core.expression.F.x_;
import static org.matheclipse.core.expression.F.x_Symbol;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Dist;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.EqQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.ExpandExpression;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.ExpandIntegrand;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.FracPart;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.GeQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.GtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.HalfIntegerQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.IGtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Int;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.IntHide;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.IntPart;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.LeQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.LtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.NeQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Simp;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.SimplifyIntegrand;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Subst;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Unintegrable;

/** 
 * IndefiniteIntegrationRules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class IntRules94 { 
  public static IAST RULES = List( 
IIntegrate(4701,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(f,x),Plus(m,C1)),Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),n),Power(Times(d,f,Plus(m,C1)),-1)),x),Dist(Times(Sqr(c),Plus(m,Times(C2,p),C3),Power(Times(Sqr(f),Plus(m,C1)),-1)),Int(Times(Power(Times(f,x),Plus(m,C2)),Power(Plus(d,Times(e,Sqr(x))),p),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),n)),x),x),Negate(Dist(Times(b,c,n,Power(d,IntPart(p)),Power(Plus(d,Times(e,Sqr(x))),FracPart(p)),Power(Times(f,Plus(m,C1),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),FracPart(p))),-1)),Int(Times(Power(Times(f,x),Plus(m,C1)),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),Plus(p,C1D2)),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),Plus(n,Negate(C1)))),x),x))),And(FreeQ(List(a,b,c,d,e,f,p),x),EqQ(Plus(Times(Sqr(c),d),e),C0),GtQ(n,C0),LtQ(m,CN1),IntegerQ(m)))),
IIntegrate(4702,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(f,x),Plus(m,C1)),Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),n),Power(Times(d,f,Plus(m,C1)),-1)),x),Dist(Times(Sqr(c),Plus(m,Times(C2,p),C3),Power(Times(Sqr(f),Plus(m,C1)),-1)),Int(Times(Power(Times(f,x),Plus(m,C2)),Power(Plus(d,Times(e,Sqr(x))),p),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),n)),x),x),Dist(Times(b,c,n,Power(d,IntPart(p)),Power(Plus(d,Times(e,Sqr(x))),FracPart(p)),Power(Times(f,Plus(m,C1),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),FracPart(p))),-1)),Int(Times(Power(Times(f,x),Plus(m,C1)),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),Plus(p,C1D2)),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),Plus(n,Negate(C1)))),x),x)),And(FreeQ(List(a,b,c,d,e,f,p),x),EqQ(Plus(Times(Sqr(c),d),e),C0),GtQ(n,C0),LtQ(m,CN1),IntegerQ(m)))),
IIntegrate(4703,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(f,Power(Times(f,x),Plus(m,Negate(C1))),Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),n),Power(Times(C2,e,Plus(p,C1)),-1)),x),Negate(Dist(Times(Sqr(f),Plus(m,Negate(C1)),Power(Times(C2,e,Plus(p,C1)),-1)),Int(Times(Power(Times(f,x),Plus(m,Negate(C2))),Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),n)),x),x)),Dist(Times(b,f,n,Power(d,IntPart(p)),Power(Plus(d,Times(e,Sqr(x))),FracPart(p)),Power(Times(C2,c,Plus(p,C1),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),FracPart(p))),-1)),Int(Times(Power(Times(f,x),Plus(m,Negate(C1))),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),Plus(p,C1D2)),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),Plus(n,Negate(C1)))),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),EqQ(Plus(Times(Sqr(c),d),e),C0),GtQ(n,C0),LtQ(p,CN1),GtQ(m,C1)))),
IIntegrate(4704,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(f,Power(Times(f,x),Plus(m,Negate(C1))),Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),n),Power(Times(C2,e,Plus(p,C1)),-1)),x),Negate(Dist(Times(Sqr(f),Plus(m,Negate(C1)),Power(Times(C2,e,Plus(p,C1)),-1)),Int(Times(Power(Times(f,x),Plus(m,Negate(C2))),Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),n)),x),x)),Negate(Dist(Times(b,f,n,Power(d,IntPart(p)),Power(Plus(d,Times(e,Sqr(x))),FracPart(p)),Power(Times(C2,c,Plus(p,C1),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),FracPart(p))),-1)),Int(Times(Power(Times(f,x),Plus(m,Negate(C1))),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),Plus(p,C1D2)),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),Plus(n,Negate(C1)))),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),EqQ(Plus(Times(Sqr(c),d),e),C0),GtQ(n,C0),LtQ(p,CN1),GtQ(m,C1)))),
IIntegrate(4705,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Times(f,x),Plus(m,C1)),Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),n),Power(Times(C2,d,f,Plus(p,C1)),-1)),x)),Dist(Times(Plus(m,Times(C2,p),C3),Power(Times(C2,d,Plus(p,C1)),-1)),Int(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),n)),x),x),Dist(Times(b,c,n,Power(d,IntPart(p)),Power(Plus(d,Times(e,Sqr(x))),FracPart(p)),Power(Times(C2,f,Plus(p,C1),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),FracPart(p))),-1)),Int(Times(Power(Times(f,x),Plus(m,C1)),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),Plus(p,C1D2)),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),Plus(n,Negate(C1)))),x),x)),And(FreeQ(List(a,b,c,d,e,f,m),x),EqQ(Plus(Times(Sqr(c),d),e),C0),GtQ(n,C0),LtQ(p,CN1),Not(GtQ(m,C1)),Or(IntegerQ(m),IntegerQ(p),EqQ(n,C1))))),
IIntegrate(4706,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Times(f,x),Plus(m,C1)),Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),n),Power(Times(C2,d,f,Plus(p,C1)),-1)),x)),Dist(Times(Plus(m,Times(C2,p),C3),Power(Times(C2,d,Plus(p,C1)),-1)),Int(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),n)),x),x),Negate(Dist(Times(b,c,n,Power(d,IntPart(p)),Power(Plus(d,Times(e,Sqr(x))),FracPart(p)),Power(Times(C2,f,Plus(p,C1),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),FracPart(p))),-1)),Int(Times(Power(Times(f,x),Plus(m,C1)),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),Plus(p,C1D2)),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),Plus(n,Negate(C1)))),x),x))),And(FreeQ(List(a,b,c,d,e,f,m),x),EqQ(Plus(Times(Sqr(c),d),e),C0),GtQ(n,C0),LtQ(p,CN1),Not(GtQ(m,C1)),Or(IntegerQ(m),IntegerQ(p),EqQ(n,C1))))),
IIntegrate(4707,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Plus(Simp(Times(f,Power(Times(f,x),Plus(m,Negate(C1))),Sqrt(Plus(d,Times(e,Sqr(x)))),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),n),Power(Times(e,m),-1)),x),Dist(Times(Sqr(f),Plus(m,Negate(C1)),Power(Times(Sqr(c),m),-1)),Int(Times(Power(Times(f,x),Plus(m,Negate(C2))),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),n),Power(Plus(d,Times(e,Sqr(x))),CN1D2)),x),x),Dist(Times(b,f,n,Sqrt(Plus(C1,Times(CN1,Sqr(c),Sqr(x)))),Power(Times(c,m,Sqrt(Plus(d,Times(e,Sqr(x))))),-1)),Int(Times(Power(Times(f,x),Plus(m,Negate(C1))),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),Plus(n,Negate(C1)))),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),EqQ(Plus(Times(Sqr(c),d),e),C0),GtQ(n,C0),GtQ(m,C1),IntegerQ(m)))),
IIntegrate(4708,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Plus(Simp(Times(f,Power(Times(f,x),Plus(m,Negate(C1))),Sqrt(Plus(d,Times(e,Sqr(x)))),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),n),Power(Times(e,m),-1)),x),Dist(Times(Sqr(f),Plus(m,Negate(C1)),Power(Times(Sqr(c),m),-1)),Int(Times(Power(Times(f,x),Plus(m,Negate(C2))),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),n),Power(Plus(d,Times(e,Sqr(x))),CN1D2)),x),x),Negate(Dist(Times(b,f,n,Sqrt(Plus(C1,Times(CN1,Sqr(c),Sqr(x)))),Power(Times(c,m,Sqrt(Plus(d,Times(e,Sqr(x))))),-1)),Int(Times(Power(Times(f,x),Plus(m,Negate(C1))),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),Plus(n,Negate(C1)))),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),EqQ(Plus(Times(Sqr(c),d),e),C0),GtQ(n,C0),GtQ(m,C1),IntegerQ(m)))),
IIntegrate(4709,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(x_,m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Dist(Power(Times(Power(c,Plus(m,C1)),Sqrt(d)),-1),Subst(Int(Times(Power(Plus(a,Times(b,x)),n),Power(Sin(x),m)),x),x,ArcSin(Times(c,x))),x),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),GtQ(d,C0),IGtQ(n,C0),IntegerQ(m)))),
IIntegrate(4710,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(x_,m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Negate(Dist(Power(Times(Power(c,Plus(m,C1)),Sqrt(d)),-1),Subst(Int(Times(Power(Plus(a,Times(b,x)),n),Power(Cos(x),m)),x),x,ArcCos(Times(c,x))),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),GtQ(d,C0),IGtQ(n,C0),IntegerQ(m)))),
IIntegrate(4711,Int(Times(Plus(a_DEFAULT,Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(f,x),Plus(m,C1)),Plus(a,Times(b,ArcSin(Times(c,x)))),Hypergeometric2F1(C1D2,Times(C1D2,Plus(C1,m)),Times(C1D2,Plus(C3,m)),Times(Sqr(c),Sqr(x))),Power(Times(Sqrt(d),f,Plus(m,C1)),-1)),x),Negate(Simp(Times(b,c,Power(Times(f,x),Plus(m,C2)),HypergeometricPFQ(List(C1,Plus(C1,Times(C1D2,m)),Plus(C1,Times(C1D2,m))),List(Plus(QQ(3L,2L),Times(C1D2,m)),Plus(C2,Times(C1D2,m))),Times(Sqr(c),Sqr(x))),Power(Times(Sqrt(d),Sqr(f),Plus(m,C1),Plus(m,C2)),-1)),x))),And(FreeQ(List(a,b,c,d,e,f,m),x),EqQ(Plus(Times(Sqr(c),d),e),C0),GtQ(d,C0),Not(IntegerQ(m))))),
IIntegrate(4712,Int(Times(Plus(a_DEFAULT,Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(f,x),Plus(m,C1)),Plus(a,Times(b,ArcCos(Times(c,x)))),Hypergeometric2F1(C1D2,Times(C1D2,Plus(C1,m)),Times(C1D2,Plus(C3,m)),Times(Sqr(c),Sqr(x))),Power(Times(Sqrt(d),f,Plus(m,C1)),-1)),x),Simp(Times(b,c,Power(Times(f,x),Plus(m,C2)),HypergeometricPFQ(List(C1,Plus(C1,Times(C1D2,m)),Plus(C1,Times(C1D2,m))),List(Plus(QQ(3L,2L),Times(C1D2,m)),Plus(C2,Times(C1D2,m))),Times(Sqr(c),Sqr(x))),Power(Times(Sqrt(d),Sqr(f),Plus(m,C1),Plus(m,C2)),-1)),x)),And(FreeQ(List(a,b,c,d,e,f,m),x),EqQ(Plus(Times(Sqr(c),d),e),C0),GtQ(d,C0),Not(IntegerQ(m))))),
IIntegrate(4713,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Dist(Times(Sqrt(Plus(C1,Times(CN1,Sqr(c),Sqr(x)))),Power(Plus(d,Times(e,Sqr(x))),CN1D2)),Int(Times(Power(Times(f,x),m),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),n),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),CN1D2)),x),x),And(FreeQ(List(a,b,c,d,e,f,m),x),EqQ(Plus(Times(Sqr(c),d),e),C0),GtQ(n,C0),Not(GtQ(d,C0)),Or(IntegerQ(m),EqQ(n,C1))))),
IIntegrate(4714,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Dist(Times(Sqrt(Plus(C1,Times(CN1,Sqr(c),Sqr(x)))),Power(Plus(d,Times(e,Sqr(x))),CN1D2)),Int(Times(Power(Times(f,x),m),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),n),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),CN1D2)),x),x),And(FreeQ(List(a,b,c,d,e,f,m),x),EqQ(Plus(Times(Sqr(c),d),e),C0),GtQ(n,C0),Not(GtQ(d,C0)),Or(IntegerQ(m),EqQ(n,C1))))),
IIntegrate(4715,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(f,Power(Times(f,x),Plus(m,Negate(C1))),Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),n),Power(Times(e,Plus(m,Times(C2,p),C1)),-1)),x),Dist(Times(Sqr(f),Plus(m,Negate(C1)),Power(Times(Sqr(c),Plus(m,Times(C2,p),C1)),-1)),Int(Times(Power(Times(f,x),Plus(m,Negate(C2))),Power(Plus(d,Times(e,Sqr(x))),p),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),n)),x),x),Dist(Times(b,f,n,Power(d,IntPart(p)),Power(Plus(d,Times(e,Sqr(x))),FracPart(p)),Power(Times(c,Plus(m,Times(C2,p),C1),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),FracPart(p))),-1)),Int(Times(Power(Times(f,x),Plus(m,Negate(C1))),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),Plus(p,C1D2)),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),Plus(n,Negate(C1)))),x),x)),And(FreeQ(List(a,b,c,d,e,f,p),x),EqQ(Plus(Times(Sqr(c),d),e),C0),GtQ(n,C0),GtQ(m,C1),NeQ(Plus(m,Times(C2,p),C1),C0),IntegerQ(m)))),
IIntegrate(4716,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(f,Power(Times(f,x),Plus(m,Negate(C1))),Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),n),Power(Times(e,Plus(m,Times(C2,p),C1)),-1)),x),Dist(Times(Sqr(f),Plus(m,Negate(C1)),Power(Times(Sqr(c),Plus(m,Times(C2,p),C1)),-1)),Int(Times(Power(Times(f,x),Plus(m,Negate(C2))),Power(Plus(d,Times(e,Sqr(x))),p),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),n)),x),x),Negate(Dist(Times(b,f,n,Power(d,IntPart(p)),Power(Plus(d,Times(e,Sqr(x))),FracPart(p)),Power(Times(c,Plus(m,Times(C2,p),C1),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),FracPart(p))),-1)),Int(Times(Power(Times(f,x),Plus(m,Negate(C1))),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),Plus(p,C1D2)),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),Plus(n,Negate(C1)))),x),x))),And(FreeQ(List(a,b,c,d,e,f,p),x),EqQ(Plus(Times(Sqr(c),d),e),C0),GtQ(n,C0),GtQ(m,C1),NeQ(Plus(m,Times(C2,p),C1),C0),IntegerQ(m)))),
IIntegrate(4717,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT)),n_),Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(f,x),m),Sqrt(Plus(C1,Times(CN1,Sqr(c),Sqr(x)))),Power(Plus(d,Times(e,Sqr(x))),p),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),Plus(n,C1)),Power(Times(b,c,Plus(n,C1)),-1)),x),Negate(Dist(Times(f,m,Power(d,IntPart(p)),Power(Plus(d,Times(e,Sqr(x))),FracPart(p)),Power(Times(b,c,Plus(n,C1),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),FracPart(p))),-1)),Int(Times(Power(Times(f,x),Plus(m,Negate(C1))),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),Plus(p,Negate(C1D2))),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),Plus(n,C1))),x),x))),And(FreeQ(List(a,b,c,d,e,f,m,p),x),EqQ(Plus(Times(Sqr(c),d),e),C0),LtQ(n,CN1),EqQ(Plus(m,Times(C2,p),C1),C0)))),
IIntegrate(4718,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT)),n_),Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Times(f,x),m),Sqrt(Plus(C1,Times(CN1,Sqr(c),Sqr(x)))),Power(Plus(d,Times(e,Sqr(x))),p),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),Plus(n,C1)),Power(Times(b,c,Plus(n,C1)),-1)),x)),Dist(Times(f,m,Power(d,IntPart(p)),Power(Plus(d,Times(e,Sqr(x))),FracPart(p)),Power(Times(b,c,Plus(n,C1),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),FracPart(p))),-1)),Int(Times(Power(Times(f,x),Plus(m,Negate(C1))),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),Plus(p,Negate(C1D2))),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),Plus(n,C1))),x),x)),And(FreeQ(List(a,b,c,d,e,f,m,p),x),EqQ(Plus(Times(Sqr(c),d),e),C0),LtQ(n,CN1),EqQ(Plus(m,Times(C2,p),C1),C0)))),
IIntegrate(4719,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT)),n_),Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(f,x),m),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),Plus(n,C1)),Power(Times(b,c,Sqrt(d),Plus(n,C1)),-1)),x),Negate(Dist(Times(f,m,Power(Times(b,c,Sqrt(d),Plus(n,C1)),-1)),Int(Times(Power(Times(f,x),Plus(m,Negate(C1))),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),Plus(n,C1))),x),x))),And(FreeQ(List(a,b,c,d,e,f,m),x),EqQ(Plus(Times(Sqr(c),d),e),C0),LtQ(n,CN1),GtQ(d,C0)))),
IIntegrate(4720,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT)),n_),Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Times(f,x),m),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),Plus(n,C1)),Power(Times(b,c,Sqrt(d),Plus(n,C1)),-1)),x)),Dist(Times(f,m,Power(Times(b,c,Sqrt(d),Plus(n,C1)),-1)),Int(Times(Power(Times(f,x),Plus(m,Negate(C1))),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),Plus(n,C1))),x),x)),And(FreeQ(List(a,b,c,d,e,f,m),x),EqQ(Plus(Times(Sqr(c),d),e),C0),LtQ(n,CN1),GtQ(d,C0)))),
IIntegrate(4721,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT)),n_),Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(f,x),m),Sqrt(Plus(C1,Times(CN1,Sqr(c),Sqr(x)))),Power(Plus(d,Times(e,Sqr(x))),p),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),Plus(n,C1)),Power(Times(b,c,Plus(n,C1)),-1)),x),Negate(Dist(Times(f,m,Power(d,IntPart(p)),Power(Plus(d,Times(e,Sqr(x))),FracPart(p)),Power(Times(b,c,Plus(n,C1),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),FracPart(p))),-1)),Int(Times(Power(Times(f,x),Plus(m,Negate(C1))),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),Plus(p,Negate(C1D2))),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),Plus(n,C1))),x),x)),Dist(Times(c,Plus(m,Times(C2,p),C1),Power(d,IntPart(p)),Power(Plus(d,Times(e,Sqr(x))),FracPart(p)),Power(Times(b,f,Plus(n,C1),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),FracPart(p))),-1)),Int(Times(Power(Times(f,x),Plus(m,C1)),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),Plus(p,Negate(C1D2))),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),Plus(n,C1))),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),EqQ(Plus(Times(Sqr(c),d),e),C0),LtQ(n,CN1),IGtQ(m,CN3),IGtQ(Times(C2,p),C0)))),
IIntegrate(4722,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT)),n_),Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Times(f,x),m),Sqrt(Plus(C1,Times(CN1,Sqr(c),Sqr(x)))),Power(Plus(d,Times(e,Sqr(x))),p),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),Plus(n,C1)),Power(Times(b,c,Plus(n,C1)),-1)),x)),Dist(Times(f,m,Power(d,IntPart(p)),Power(Plus(d,Times(e,Sqr(x))),FracPart(p)),Power(Times(b,c,Plus(n,C1),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),FracPart(p))),-1)),Int(Times(Power(Times(f,x),Plus(m,Negate(C1))),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),Plus(p,Negate(C1D2))),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),Plus(n,C1))),x),x),Negate(Dist(Times(c,Plus(m,Times(C2,p),C1),Power(d,IntPart(p)),Power(Plus(d,Times(e,Sqr(x))),FracPart(p)),Power(Times(b,f,Plus(n,C1),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),FracPart(p))),-1)),Int(Times(Power(Times(f,x),Plus(m,C1)),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),Plus(p,Negate(C1D2))),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),Plus(n,C1))),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),EqQ(Plus(Times(Sqr(c),d),e),C0),LtQ(n,CN1),IGtQ(m,CN3),IGtQ(Times(C2,p),C0)))),
IIntegrate(4723,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(x_,m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(d,p),Power(Power(c,Plus(m,C1)),-1)),Subst(Int(Times(Power(Plus(a,Times(b,x)),n),Power(Sin(x),m),Power(Cos(x),Plus(Times(C2,p),C1))),x),x,ArcSin(Times(c,x))),x),And(FreeQ(List(a,b,c,d,e,n),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IntegerQ(Times(C2,p)),GtQ(p,CN1),IGtQ(m,C0),Or(IntegerQ(p),GtQ(d,C0))))),
IIntegrate(4724,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(x_,m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Negate(Dist(Times(Power(d,p),Power(Power(c,Plus(m,C1)),-1)),Subst(Int(Times(Power(Plus(a,Times(b,x)),n),Power(Cos(x),m),Power(Sin(x),Plus(Times(C2,p),C1))),x),x,ArcCos(Times(c,x))),x)),And(FreeQ(List(a,b,c,d,e,n),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IntegerQ(Times(C2,p)),GtQ(p,CN1),IGtQ(m,C0),Or(IntegerQ(p),GtQ(d,C0))))),
IIntegrate(4725,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT)),n_),Power(x_,m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Dist(Times(Power(d,IntPart(p)),Power(Plus(d,Times(e,Sqr(x))),FracPart(p)),Power(Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),FracPart(p)),-1)),Int(Times(Power(x,m),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),p),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),n)),x),x),And(FreeQ(List(a,b,c,d,e,n),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IntegerQ(Times(C2,p)),GtQ(p,CN1),IGtQ(m,C0),Not(Or(IntegerQ(p),GtQ(d,C0)))))),
IIntegrate(4726,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT)),n_),Power(x_,m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Dist(Times(Power(d,IntPart(p)),Power(Plus(d,Times(e,Sqr(x))),FracPart(p)),Power(Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),FracPart(p)),-1)),Int(Times(Power(x,m),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),p),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),n)),x),x),And(FreeQ(List(a,b,c,d,e,n),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IntegerQ(Times(C2,p)),GtQ(p,CN1),IGtQ(m,C0),Not(Or(IntegerQ(p),GtQ(d,C0)))))),
IIntegrate(4727,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(a,Times(b,ArcSin(Times(c,x)))),n),Power(Plus(d,Times(e,Sqr(x))),CN1D2)),Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1D2))),x),x),And(FreeQ(List(a,b,c,d,e,f,m,n),x),EqQ(Plus(Times(Sqr(c),d),e),C0),GtQ(d,C0),IGtQ(Plus(p,C1D2),C0),Not(IGtQ(Times(C1D2,Plus(m,C1)),C0)),Or(EqQ(m,CN1),EqQ(m,CN2))))),
IIntegrate(4728,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(a,Times(b,ArcCos(Times(c,x)))),n),Power(Plus(d,Times(e,Sqr(x))),CN1D2)),Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1D2))),x),x),And(FreeQ(List(a,b,c,d,e,f,m,n),x),EqQ(Plus(Times(Sqr(c),d),e),C0),GtQ(d,C0),IGtQ(Plus(p,C1D2),C0),Not(IGtQ(Times(C1D2,Plus(m,C1)),C0)),Or(EqQ(m,CN1),EqQ(m,CN2))))),
IIntegrate(4729,Int(Times(Plus(a_DEFAULT,Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT)),x_,Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Plus(a,Times(b,ArcSin(Times(c,x)))),Power(Times(C2,e,Plus(p,C1)),-1)),x),Negate(Dist(Times(b,c,Power(Times(C2,e,Plus(p,C1)),-1)),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),CN1D2)),x),x))),And(FreeQ(List(a,b,c,d,e,p),x),NeQ(Plus(Times(Sqr(c),d),e),C0),NeQ(p,CN1)))),
IIntegrate(4730,Int(Times(Plus(a_DEFAULT,Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT)),x_,Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Plus(a,Times(b,ArcCos(Times(c,x)))),Power(Times(C2,e,Plus(p,C1)),-1)),x),Dist(Times(b,c,Power(Times(C2,e,Plus(p,C1)),-1)),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),CN1D2)),x),x)),And(FreeQ(List(a,b,c,d,e,p),x),NeQ(Plus(Times(Sqr(c),d),e),C0),NeQ(p,CN1)))),
IIntegrate(4731,Int(Times(Plus(a_DEFAULT,Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),p)),x))),Plus(Dist(Plus(a,Times(b,ArcSin(Times(c,x)))),u,x),Negate(Dist(Times(b,c),Int(SimplifyIntegrand(Times(u,Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),CN1D2)),x),x),x)))),And(FreeQ(List(a,b,c,d,e,f,m),x),NeQ(Plus(Times(Sqr(c),d),e),C0),IntegerQ(p),Or(GtQ(p,C0),And(IGtQ(Times(C1D2,Plus(m,Negate(C1))),C0),LeQ(Plus(m,p),C0)))))),
IIntegrate(4732,Int(Times(Plus(a_DEFAULT,Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),p)),x))),Plus(Dist(Plus(a,Times(b,ArcCos(Times(c,x)))),u,x),Dist(Times(b,c),Int(SimplifyIntegrand(Times(u,Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),CN1D2)),x),x),x))),And(FreeQ(List(a,b,c,d,e,f,m),x),NeQ(Plus(Times(Sqr(c),d),e),C0),IntegerQ(p),Or(GtQ(p,C0),And(IGtQ(Times(C1D2,Plus(m,Negate(C1))),C0),LeQ(Plus(m,p),C0)))))),
IIntegrate(4733,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Power(Plus(a,Times(b,ArcSin(Times(c,x)))),n),Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),p)),x),x),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Plus(Times(Sqr(c),d),e),C0),IGtQ(n,C0),IntegerQ(p),IntegerQ(m)))),
IIntegrate(4734,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Power(Plus(a,Times(b,ArcCos(Times(c,x)))),n),Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),p)),x),x),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Plus(Times(Sqr(c),d),e),C0),IGtQ(n,C0),IntegerQ(p),IntegerQ(m)))),
IIntegrate(4735,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Unintegrable(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),p),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),n)),x),FreeQ(List(a,b,c,d,e,f,m,n,p),x))),
IIntegrate(4736,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Unintegrable(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),p),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),n)),x),FreeQ(List(a,b,c,d,e,f,m,n,p),x))),
IIntegrate(4737,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Times(h_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,x_)),p_),Power(Plus(f_,Times(g_DEFAULT,x_)),q_)),x_Symbol),
    Condition(Dist(Power(Times(CN1,Sqr(d),g,Power(e,-1)),q),Int(Times(Power(Times(h,x),m),Power(Plus(d,Times(e,x)),Plus(p,Negate(q))),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),q),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),n)),x),x),And(FreeQ(List(a,b,c,d,e,f,g,h,m,n),x),EqQ(Plus(Times(e,f),Times(d,g)),C0),EqQ(Plus(Times(Sqr(c),Sqr(d)),Negate(Sqr(e))),C0),HalfIntegerQ(p,q),GeQ(Plus(p,Negate(q)),C0),GtQ(d,C0),LtQ(Times(g,Power(e,-1)),C0)))),
IIntegrate(4738,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Times(h_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,x_)),p_),Power(Plus(f_,Times(g_DEFAULT,x_)),q_)),x_Symbol),
    Condition(Dist(Power(Times(CN1,Sqr(d),g,Power(e,-1)),q),Int(Times(Power(Times(h,x),m),Power(Plus(d,Times(e,x)),Plus(p,Negate(q))),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),q),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),n)),x),x),And(FreeQ(List(a,b,c,d,e,f,g,h,m,n),x),EqQ(Plus(Times(e,f),Times(d,g)),C0),EqQ(Plus(Times(Sqr(c),Sqr(d)),Negate(Sqr(e))),C0),HalfIntegerQ(p,q),GeQ(Plus(p,Negate(q)),C0),GtQ(d,C0),LtQ(Times(g,Power(e,-1)),C0)))),
IIntegrate(4739,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Times(h_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,x_)),p_),Power(Plus(f_,Times(g_DEFAULT,x_)),q_)),x_Symbol),
    Condition(Dist(Times(Power(Times(CN1,Sqr(d),g,Power(e,-1)),IntPart(q)),Power(Plus(d,Times(e,x)),FracPart(q)),Power(Plus(f,Times(g,x)),FracPart(q)),Power(Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),FracPart(q)),-1)),Int(Times(Power(Times(h,x),m),Power(Plus(d,Times(e,x)),Plus(p,Negate(q))),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),q),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),n)),x),x),And(FreeQ(List(a,b,c,d,e,f,g,h,m,n),x),EqQ(Plus(Times(e,f),Times(d,g)),C0),EqQ(Plus(Times(Sqr(c),Sqr(d)),Negate(Sqr(e))),C0),HalfIntegerQ(p,q),GeQ(Plus(p,Negate(q)),C0)))),
IIntegrate(4740,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Times(h_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,x_)),p_),Power(Plus(f_,Times(g_DEFAULT,x_)),q_)),x_Symbol),
    Condition(Dist(Times(Power(Times(CN1,Sqr(d),g,Power(e,-1)),IntPart(q)),Power(Plus(d,Times(e,x)),FracPart(q)),Power(Plus(f,Times(g,x)),FracPart(q)),Power(Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),FracPart(q)),-1)),Int(Times(Power(Times(h,x),m),Power(Plus(d,Times(e,x)),Plus(p,Negate(q))),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),q),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),n)),x),x),And(FreeQ(List(a,b,c,d,e,f,g,h,m,n),x),EqQ(Plus(Times(e,f),Times(d,g)),C0),EqQ(Plus(Times(Sqr(c),Sqr(d)),Negate(Sqr(e))),C0),HalfIntegerQ(p,q),GeQ(Plus(p,Negate(q)),C0)))),
IIntegrate(4741,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,x_)),-1)),x_Symbol),
    Condition(Subst(Int(Times(Power(Plus(a,Times(b,x)),n),Cos(x),Power(Plus(Times(c,d),Times(e,Sin(x))),-1)),x),x,ArcSin(Times(c,x))),And(FreeQ(List(a,b,c,d,e),x),IGtQ(n,C0)))),
IIntegrate(4742,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,x_)),-1)),x_Symbol),
    Condition(Negate(Subst(Int(Times(Power(Plus(a,Times(b,x)),n),Sin(x),Power(Plus(Times(c,d),Times(e,Cos(x))),-1)),x),x,ArcCos(Times(c,x)))),And(FreeQ(List(a,b,c,d,e),x),IGtQ(n,C0)))),
IIntegrate(4743,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),n),Power(Times(e,Plus(m,C1)),-1)),x),Negate(Dist(Times(b,c,n,Power(Times(e,Plus(m,C1)),-1)),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),Plus(n,Negate(C1))),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),CN1D2)),x),x))),And(FreeQ(List(a,b,c,d,e,m),x),IGtQ(n,C0),NeQ(m,CN1)))),
IIntegrate(4744,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),n),Power(Times(e,Plus(m,C1)),-1)),x),Dist(Times(b,c,n,Power(Times(e,Plus(m,C1)),-1)),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),Plus(n,Negate(C1))),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),CN1D2)),x),x)),And(FreeQ(List(a,b,c,d,e,m),x),IGtQ(n,C0),NeQ(m,CN1)))),
IIntegrate(4745,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT)),n_),Power(Plus(d_,Times(e_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(d,Times(e,x)),m),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),n)),x),x),And(FreeQ(List(a,b,c,d,e),x),IGtQ(m,C0),LtQ(n,CN1)))),
IIntegrate(4746,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT)),n_),Power(Plus(d_,Times(e_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(d,Times(e,x)),m),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),n)),x),x),And(FreeQ(List(a,b,c,d,e),x),IGtQ(m,C0),LtQ(n,CN1)))),
IIntegrate(4747,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT)),n_),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Power(c,Plus(m,C1)),-1),Subst(Int(Times(Power(Plus(a,Times(b,x)),n),Cos(x),Power(Plus(Times(c,d),Times(e,Sin(x))),m)),x),x,ArcSin(Times(c,x))),x),And(FreeQ(List(a,b,c,d,e,n),x),IGtQ(m,C0)))),
IIntegrate(4748,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT)),n_),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Negate(Dist(Power(Power(c,Plus(m,C1)),-1),Subst(Int(Times(Power(Plus(a,Times(b,x)),n),Sin(x),Power(Plus(Times(c,d),Times(e,Cos(x))),m)),x),x,ArcCos(Times(c,x))),x)),And(FreeQ(List(a,b,c,d,e,n),x),IGtQ(m,C0)))),
IIntegrate(4749,Int(Times(Plus(a_DEFAULT,Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT)),$p("§px")),x_Symbol),
    Condition(With(List(Set(u,IntHide(ExpandExpression($s("§px"),x),x))),Plus(Dist(Plus(a,Times(b,ArcSin(Times(c,x)))),u,x),Negate(Dist(Times(b,c),Int(SimplifyIntegrand(Times(u,Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),CN1D2)),x),x),x)))),And(FreeQ(List(a,b,c),x),PolynomialQ($s("§px"),x)))),
IIntegrate(4750,Int(Times(Plus(a_DEFAULT,Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT)),$p("§px")),x_Symbol),
    Condition(With(List(Set(u,IntHide(ExpandExpression($s("§px"),x),x))),Plus(Dist(Plus(a,Times(b,ArcCos(Times(c,x)))),u,x),Dist(Times(b,c),Int(SimplifyIntegrand(Times(u,Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),CN1D2)),x),x),x))),And(FreeQ(List(a,b,c),x),PolynomialQ($s("§px"),x))))
  );
}
