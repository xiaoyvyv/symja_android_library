package org.matheclipse.core.integrate.rubi;


import org.matheclipse.core.interfaces.IAST;

import static org.matheclipse.core.expression.F.And;
import static org.matheclipse.core.expression.F.C0;
import static org.matheclipse.core.expression.F.C1;
import static org.matheclipse.core.expression.F.C1D2;
import static org.matheclipse.core.expression.F.C2;
import static org.matheclipse.core.expression.F.CI;
import static org.matheclipse.core.expression.F.CN1;
import static org.matheclipse.core.expression.F.CN2;
import static org.matheclipse.core.expression.F.Condition;
import static org.matheclipse.core.expression.F.Cos;
import static org.matheclipse.core.expression.F.CosIntegral;
import static org.matheclipse.core.expression.F.Denominator;
import static org.matheclipse.core.expression.F.Exp;
import static org.matheclipse.core.expression.F.FreeQ;
import static org.matheclipse.core.expression.F.FresnelC;
import static org.matheclipse.core.expression.F.FresnelS;
import static org.matheclipse.core.expression.F.IIntegrate;
import static org.matheclipse.core.expression.F.IntegerQ;
import static org.matheclipse.core.expression.F.List;
import static org.matheclipse.core.expression.F.Module;
import static org.matheclipse.core.expression.F.Negate;
import static org.matheclipse.core.expression.F.Not;
import static org.matheclipse.core.expression.F.Or;
import static org.matheclipse.core.expression.F.Pi;
import static org.matheclipse.core.expression.F.Plus;
import static org.matheclipse.core.expression.F.Power;
import static org.matheclipse.core.expression.F.Set;
import static org.matheclipse.core.expression.F.Simplify;
import static org.matheclipse.core.expression.F.Sin;
import static org.matheclipse.core.expression.F.SinIntegral;
import static org.matheclipse.core.expression.F.Sqr;
import static org.matheclipse.core.expression.F.Sqrt;
import static org.matheclipse.core.expression.F.Times;
import static org.matheclipse.core.expression.F.a;
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
import static org.matheclipse.core.expression.F.k;
import static org.matheclipse.core.expression.F.m;
import static org.matheclipse.core.expression.F.m_;
import static org.matheclipse.core.expression.F.m_DEFAULT;
import static org.matheclipse.core.expression.F.n;
import static org.matheclipse.core.expression.F.n_;
import static org.matheclipse.core.expression.F.p;
import static org.matheclipse.core.expression.F.p_;
import static org.matheclipse.core.expression.F.p_DEFAULT;
import static org.matheclipse.core.expression.F.u;
import static org.matheclipse.core.expression.F.u_;
import static org.matheclipse.core.expression.F.x;
import static org.matheclipse.core.expression.F.x_;
import static org.matheclipse.core.expression.F.x_Symbol;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.BinomialMatchQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.BinomialQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Dist;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.EqQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.ExpandToSum;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.ExpandTrigReduce;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.FracPart;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.FractionQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.GtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.IGtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.ILtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Int;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.IntPart;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.LinearMatchQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.LinearQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.LtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.NeQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Rt;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Simp;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Subst;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Unintegrable;

/** 
 * IndefiniteIntegrationRules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class IntRules67 { 
  public static IAST RULES = List( 
IIntegrate(3351,Int(Sin(Times(d_DEFAULT,Sqr(Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),x_Symbol),
    Condition(Simp(Times(Sqrt(Times(C1D2,Pi)),FresnelS(Times(Sqrt(Times(C2,Power(Pi,-1))),Rt(d,C2),Plus(e,Times(f,x)))),Power(Times(f,Rt(d,C2)),-1)),x),FreeQ(List(d,e,f),x))),
IIntegrate(3352,Int(Cos(Times(d_DEFAULT,Sqr(Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),x_Symbol),
    Condition(Simp(Times(Sqrt(Times(C1D2,Pi)),FresnelC(Times(Sqrt(Times(C2,Power(Pi,-1))),Rt(d,C2),Plus(e,Times(f,x)))),Power(Times(f,Rt(d,C2)),-1)),x),FreeQ(List(d,e,f),x))),
IIntegrate(3353,Int(Sin(Plus(c_,Times(d_DEFAULT,Sqr(Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),x_Symbol),
    Condition(Plus(Dist(Sin(c),Int(Cos(Times(d,Sqr(Plus(e,Times(f,x))))),x),x),Dist(Cos(c),Int(Sin(Times(d,Sqr(Plus(e,Times(f,x))))),x),x)),FreeQ(List(c,d,e,f),x))),
IIntegrate(3354,Int(Cos(Plus(c_,Times(d_DEFAULT,Sqr(Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),x_Symbol),
    Condition(Plus(Dist(Cos(c),Int(Cos(Times(d,Sqr(Plus(e,Times(f,x))))),x),x),Negate(Dist(Sin(c),Int(Sin(Times(d,Sqr(Plus(e,Times(f,x))))),x),x))),FreeQ(List(c,d,e,f),x))),
IIntegrate(3355,Int(Sin(Plus(c_DEFAULT,Times(d_DEFAULT,Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),n_)))),x_Symbol),
    Condition(Plus(Dist(Times(C1D2,CI),Int(Exp(Plus(Times(CN1,c,CI),Times(CN1,d,CI,Power(Plus(e,Times(f,x)),n)))),x),x),Negate(Dist(Times(C1D2,CI),Int(Exp(Plus(Times(c,CI),Times(d,CI,Power(Plus(e,Times(f,x)),n)))),x),x))),And(FreeQ(List(c,d,e,f),x),IGtQ(n,C2)))),
IIntegrate(3356,Int(Cos(Plus(c_DEFAULT,Times(d_DEFAULT,Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),n_)))),x_Symbol),
    Condition(Plus(Dist(C1D2,Int(Exp(Plus(Times(CN1,c,CI),Times(CN1,d,CI,Power(Plus(e,Times(f,x)),n)))),x),x),Dist(C1D2,Int(Exp(Plus(Times(c,CI),Times(d,CI,Power(Plus(e,Times(f,x)),n)))),x),x)),And(FreeQ(List(c,d,e,f),x),IGtQ(n,C2)))),
IIntegrate(3357,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sin(Plus(c_DEFAULT,Times(d_DEFAULT,Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),n_)))))),p_),x_Symbol),
    Condition(Int(ExpandTrigReduce(Power(Plus(a,Times(b,Sin(Plus(c,Times(d,Power(Plus(e,Times(f,x)),n)))))),p),x),x),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(p,C1),IGtQ(n,C1)))),
IIntegrate(3358,Int(Power(Plus(a_DEFAULT,Times(Cos(Plus(c_DEFAULT,Times(d_DEFAULT,Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),n_)))),b_DEFAULT)),p_),x_Symbol),
    Condition(Int(ExpandTrigReduce(Power(Plus(a,Times(b,Cos(Plus(c,Times(d,Power(Plus(e,Times(f,x)),n)))))),p),x),x),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(p,C1),IGtQ(n,C1)))),
IIntegrate(3359,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sin(Plus(c_DEFAULT,Times(d_DEFAULT,Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),n_)))))),p_DEFAULT),x_Symbol),
    Condition(Negate(Dist(Power(f,-1),Subst(Int(Times(Power(Plus(a,Times(b,Sin(Plus(c,Times(d,Power(Power(x,n),-1)))))),p),Power(x,-2)),x),x,Power(Plus(e,Times(f,x)),-1)),x)),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(p,C0),ILtQ(n,C0),EqQ(n,CN2)))),
IIntegrate(3360,Int(Power(Plus(a_DEFAULT,Times(Cos(Plus(c_DEFAULT,Times(d_DEFAULT,Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),n_)))),b_DEFAULT)),p_DEFAULT),x_Symbol),
    Condition(Negate(Dist(Power(f,-1),Subst(Int(Times(Power(Plus(a,Times(b,Cos(Plus(c,Times(d,Power(Power(x,n),-1)))))),p),Power(x,-2)),x),x,Power(Plus(e,Times(f,x)),-1)),x)),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(p,C0),ILtQ(n,C0),EqQ(n,CN2)))),
IIntegrate(3361,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sin(Plus(c_DEFAULT,Times(d_DEFAULT,Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),n_)))))),p_DEFAULT),x_Symbol),
    Condition(Dist(Power(Times(n,f),-1),Subst(Int(Times(Power(x,Plus(Power(n,-1),Negate(C1))),Power(Plus(a,Times(b,Sin(Plus(c,Times(d,x))))),p)),x),x,Power(Plus(e,Times(f,x)),n)),x),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(p,C0),IntegerQ(Power(n,-1))))),
IIntegrate(3362,Int(Power(Plus(a_DEFAULT,Times(Cos(Plus(c_DEFAULT,Times(d_DEFAULT,Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),n_)))),b_DEFAULT)),p_DEFAULT),x_Symbol),
    Condition(Dist(Power(Times(n,f),-1),Subst(Int(Times(Power(x,Plus(Power(n,-1),Negate(C1))),Power(Plus(a,Times(b,Cos(Plus(c,Times(d,x))))),p)),x),x,Power(Plus(e,Times(f,x)),n)),x),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(p,C0),IntegerQ(Power(n,-1))))),
IIntegrate(3363,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sin(Plus(c_DEFAULT,Times(d_DEFAULT,Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),n_)))))),p_DEFAULT),x_Symbol),
    Condition(Module(List(Set(k,Denominator(n))),Dist(Times(k,Power(f,-1)),Subst(Int(Times(Power(x,Plus(k,Negate(C1))),Power(Plus(a,Times(b,Sin(Plus(c,Times(d,Power(x,Times(k,n))))))),p)),x),x,Power(Plus(e,Times(f,x)),Power(k,-1))),x)),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(p,C0),FractionQ(n)))),
IIntegrate(3364,Int(Power(Plus(a_DEFAULT,Times(Cos(Plus(c_DEFAULT,Times(d_DEFAULT,Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),n_)))),b_DEFAULT)),p_DEFAULT),x_Symbol),
    Condition(Module(List(Set(k,Denominator(n))),Dist(Times(k,Power(f,-1)),Subst(Int(Times(Power(x,Plus(k,Negate(C1))),Power(Plus(a,Times(b,Cos(Plus(c,Times(d,Power(x,Times(k,n))))))),p)),x),x,Power(Plus(e,Times(f,x)),Power(k,-1))),x)),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(p,C0),FractionQ(n)))),
IIntegrate(3365,Int(Sin(Plus(c_DEFAULT,Times(d_DEFAULT,Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),n_)))),x_Symbol),
    Condition(Plus(Dist(Times(C1D2,CI),Int(Exp(Plus(Times(CN1,c,CI),Times(CN1,d,CI,Power(Plus(e,Times(f,x)),n)))),x),x),Negate(Dist(Times(C1D2,CI),Int(Exp(Plus(Times(c,CI),Times(d,CI,Power(Plus(e,Times(f,x)),n)))),x),x))),FreeQ(List(c,d,e,f,n),x))),
IIntegrate(3366,Int(Cos(Plus(c_DEFAULT,Times(d_DEFAULT,Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),n_)))),x_Symbol),
    Condition(Plus(Dist(C1D2,Int(Exp(Plus(Times(CN1,c,CI),Times(CN1,d,CI,Power(Plus(e,Times(f,x)),n)))),x),x),Dist(C1D2,Int(Exp(Plus(Times(c,CI),Times(d,CI,Power(Plus(e,Times(f,x)),n)))),x),x)),FreeQ(List(c,d,e,f,n),x))),
IIntegrate(3367,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sin(Plus(c_DEFAULT,Times(d_DEFAULT,Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),n_)))))),p_),x_Symbol),
    Condition(Int(ExpandTrigReduce(Power(Plus(a,Times(b,Sin(Plus(c,Times(d,Power(Plus(e,Times(f,x)),n)))))),p),x),x),And(FreeQ(List(a,b,c,d,e,f,n),x),IGtQ(p,C1)))),
IIntegrate(3368,Int(Power(Plus(a_DEFAULT,Times(Cos(Plus(c_DEFAULT,Times(d_DEFAULT,Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),n_)))),b_DEFAULT)),p_),x_Symbol),
    Condition(Int(ExpandTrigReduce(Power(Plus(a,Times(b,Cos(Plus(c,Times(d,Power(Plus(e,Times(f,x)),n)))))),p),x),x),And(FreeQ(List(a,b,c,d,e,f,n),x),IGtQ(p,C1)))),
IIntegrate(3369,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sin(Plus(c_DEFAULT,Times(d_DEFAULT,Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),n_)))))),p_),x_Symbol),
    Condition(Unintegrable(Power(Plus(a,Times(b,Sin(Plus(c,Times(d,Power(Plus(e,Times(f,x)),n)))))),p),x),FreeQ(List(a,b,c,d,e,f,n,p),x))),
IIntegrate(3370,Int(Power(Plus(a_DEFAULT,Times(Cos(Plus(c_DEFAULT,Times(d_DEFAULT,Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),n_)))),b_DEFAULT)),p_),x_Symbol),
    Condition(Unintegrable(Power(Plus(a,Times(b,Cos(Plus(c,Times(d,Power(Plus(e,Times(f,x)),n)))))),p),x),FreeQ(List(a,b,c,d,e,f,n,p),x))),
IIntegrate(3371,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sin(Plus(c_DEFAULT,Times(d_DEFAULT,Power(u_,n_)))))),p_DEFAULT),x_Symbol),
    Condition(Int(Power(Plus(a,Times(b,Sin(Plus(c,Times(d,Power(ExpandToSum(u,x),n)))))),p),x),And(FreeQ(List(a,b,c,d,n,p),x),LinearQ(u,x),Not(LinearMatchQ(u,x))))),
IIntegrate(3372,Int(Power(Plus(a_DEFAULT,Times(Cos(Plus(c_DEFAULT,Times(d_DEFAULT,Power(u_,n_)))),b_DEFAULT)),p_DEFAULT),x_Symbol),
    Condition(Int(Power(Plus(a,Times(b,Cos(Plus(c,Times(d,Power(ExpandToSum(u,x),n)))))),p),x),And(FreeQ(List(a,b,c,d,n,p),x),LinearQ(u,x),Not(LinearMatchQ(u,x))))),
IIntegrate(3373,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sin(u_))),p_DEFAULT),x_Symbol),
    Condition(Int(Power(Plus(a,Times(b,Sin(ExpandToSum(u,x)))),p),x),And(FreeQ(List(a,b,p),x),BinomialQ(u,x),Not(BinomialMatchQ(u,x))))),
IIntegrate(3374,Int(Power(Plus(a_DEFAULT,Times(Cos(u_),b_DEFAULT)),p_DEFAULT),x_Symbol),
    Condition(Int(Power(Plus(a,Times(b,Cos(ExpandToSum(u,x)))),p),x),And(FreeQ(List(a,b,p),x),BinomialQ(u,x),Not(BinomialMatchQ(u,x))))),
IIntegrate(3375,Int(Times(Power(x_,-1),Sin(Times(d_DEFAULT,Power(x_,n_)))),x_Symbol),
    Condition(Simp(Times(SinIntegral(Times(d,Power(x,n))),Power(n,-1)),x),FreeQ(List(d,n),x))),
IIntegrate(3376,Int(Times(Cos(Times(d_DEFAULT,Power(x_,n_))),Power(x_,-1)),x_Symbol),
    Condition(Simp(Times(CosIntegral(Times(d,Power(x,n))),Power(n,-1)),x),FreeQ(List(d,n),x))),
IIntegrate(3377,Int(Times(Power(x_,-1),Sin(Plus(c_,Times(d_DEFAULT,Power(x_,n_))))),x_Symbol),
    Condition(Plus(Dist(Sin(c),Int(Times(Cos(Times(d,Power(x,n))),Power(x,-1)),x),x),Dist(Cos(c),Int(Times(Sin(Times(d,Power(x,n))),Power(x,-1)),x),x)),FreeQ(List(c,d,n),x))),
IIntegrate(3378,Int(Times(Cos(Plus(c_,Times(d_DEFAULT,Power(x_,n_)))),Power(x_,-1)),x_Symbol),
    Condition(Plus(Dist(Cos(c),Int(Times(Cos(Times(d,Power(x,n))),Power(x,-1)),x),x),Negate(Dist(Sin(c),Int(Times(Sin(Times(d,Power(x,n))),Power(x,-1)),x),x))),FreeQ(List(c,d,n),x))),
IIntegrate(3379,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sin(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_)))))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Power(n,-1),Subst(Int(Times(Power(x,Plus(Simplify(Times(Plus(m,C1),Power(n,-1))),Negate(C1))),Power(Plus(a,Times(b,Sin(Plus(c,Times(d,x))))),p)),x),x,Power(x,n)),x),And(FreeQ(List(a,b,c,d,m,n,p),x),IntegerQ(Simplify(Times(Plus(m,C1),Power(n,-1)))),Or(EqQ(p,C1),EqQ(m,Plus(n,Negate(C1))),And(IntegerQ(p),GtQ(Simplify(Times(Plus(m,C1),Power(n,-1))),C0)))))),
IIntegrate(3380,Int(Times(Power(Plus(a_DEFAULT,Times(Cos(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_)))),b_DEFAULT)),p_DEFAULT),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Dist(Power(n,-1),Subst(Int(Times(Power(x,Plus(Simplify(Times(Plus(m,C1),Power(n,-1))),Negate(C1))),Power(Plus(a,Times(b,Cos(Plus(c,Times(d,x))))),p)),x),x,Power(x,n)),x),And(FreeQ(List(a,b,c,d,m,n,p),x),IntegerQ(Simplify(Times(Plus(m,C1),Power(n,-1)))),Or(EqQ(p,C1),EqQ(m,Plus(n,Negate(C1))),And(IntegerQ(p),GtQ(Simplify(Times(Plus(m,C1),Power(n,-1))),C0)))))),
IIntegrate(3381,Int(Times(Power(Times(e_,x_),m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sin(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_)))))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(e,IntPart(m)),Power(Times(e,x),FracPart(m)),Power(Power(x,FracPart(m)),-1)),Int(Times(Power(x,m),Power(Plus(a,Times(b,Sin(Plus(c,Times(d,Power(x,n)))))),p)),x),x),And(FreeQ(List(a,b,c,d,e,m,n,p),x),IntegerQ(Simplify(Times(Plus(m,C1),Power(n,-1))))))),
IIntegrate(3382,Int(Times(Power(Plus(a_DEFAULT,Times(Cos(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_)))),b_DEFAULT)),p_DEFAULT),Power(Times(e_,x_),m_)),x_Symbol),
    Condition(Dist(Times(Power(e,IntPart(m)),Power(Times(e,x),FracPart(m)),Power(Power(x,FracPart(m)),-1)),Int(Times(Power(x,m),Power(Plus(a,Times(b,Cos(Plus(c,Times(d,Power(x,n)))))),p)),x),x),And(FreeQ(List(a,b,c,d,e,m,n,p),x),IntegerQ(Simplify(Times(Plus(m,C1),Power(n,-1))))))),
IIntegrate(3383,Int(Times(Power(x_,m_DEFAULT),Sin(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_))))),x_Symbol),
    Condition(Dist(Times(C2,Power(n,-1)),Subst(Int(Sin(Plus(a,Times(b,Sqr(x)))),x),x,Power(x,Times(C1D2,n))),x),And(FreeQ(List(a,b,m,n),x),EqQ(m,Plus(Times(C1D2,n),Negate(C1)))))),
IIntegrate(3384,Int(Times(Cos(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_)))),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Dist(Times(C2,Power(n,-1)),Subst(Int(Cos(Plus(a,Times(b,Sqr(x)))),x),x,Power(x,Times(C1D2,n))),x),And(FreeQ(List(a,b,m,n),x),EqQ(m,Plus(Times(C1D2,n),Negate(C1)))))),
IIntegrate(3385,Int(Times(Power(Times(e_DEFAULT,x_),m_DEFAULT),Sin(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_))))),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(e,Plus(n,Negate(C1))),Power(Times(e,x),Plus(m,Negate(n),C1)),Cos(Plus(c,Times(d,Power(x,n)))),Power(Times(d,n),-1)),x)),Dist(Times(Power(e,n),Plus(m,Negate(n),C1),Power(Times(d,n),-1)),Int(Times(Power(Times(e,x),Plus(m,Negate(n))),Cos(Plus(c,Times(d,Power(x,n))))),x),x)),And(FreeQ(List(c,d,e),x),IGtQ(n,C0),LtQ(n,Plus(m,C1))))),
IIntegrate(3386,Int(Times(Cos(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_)))),Power(Times(e_DEFAULT,x_),m_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(e,Plus(n,Negate(C1))),Power(Times(e,x),Plus(m,Negate(n),C1)),Sin(Plus(c,Times(d,Power(x,n)))),Power(Times(d,n),-1)),x),Negate(Dist(Times(Power(e,n),Plus(m,Negate(n),C1),Power(Times(d,n),-1)),Int(Times(Power(Times(e,x),Plus(m,Negate(n))),Sin(Plus(c,Times(d,Power(x,n))))),x),x))),And(FreeQ(List(c,d,e),x),IGtQ(n,C0),LtQ(n,Plus(m,C1))))),
IIntegrate(3387,Int(Times(Power(Times(e_DEFAULT,x_),m_),Sin(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_))))),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(e,x),Plus(m,C1)),Sin(Plus(c,Times(d,Power(x,n)))),Power(Times(e,Plus(m,C1)),-1)),x),Negate(Dist(Times(d,n,Power(Times(Power(e,n),Plus(m,C1)),-1)),Int(Times(Power(Times(e,x),Plus(m,n)),Cos(Plus(c,Times(d,Power(x,n))))),x),x))),And(FreeQ(List(c,d,e),x),IGtQ(n,C0),LtQ(m,CN1)))),
IIntegrate(3388,Int(Times(Cos(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_)))),Power(Times(e_DEFAULT,x_),m_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(e,x),Plus(m,C1)),Cos(Plus(c,Times(d,Power(x,n)))),Power(Times(e,Plus(m,C1)),-1)),x),Dist(Times(d,n,Power(Times(Power(e,n),Plus(m,C1)),-1)),Int(Times(Power(Times(e,x),Plus(m,n)),Sin(Plus(c,Times(d,Power(x,n))))),x),x)),And(FreeQ(List(c,d,e),x),IGtQ(n,C0),LtQ(m,CN1)))),
IIntegrate(3389,Int(Times(Power(Times(e_DEFAULT,x_),m_DEFAULT),Sin(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_))))),x_Symbol),
    Condition(Plus(Dist(Times(C1D2,CI),Int(Times(Power(Times(e,x),m),Exp(Plus(Times(CN1,c,CI),Times(CN1,d,CI,Power(x,n))))),x),x),Negate(Dist(Times(C1D2,CI),Int(Times(Power(Times(e,x),m),Exp(Plus(Times(c,CI),Times(d,CI,Power(x,n))))),x),x))),And(FreeQ(List(c,d,e,m),x),IGtQ(n,C0)))),
IIntegrate(3390,Int(Times(Cos(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_)))),Power(Times(e_DEFAULT,x_),m_DEFAULT)),x_Symbol),
    Condition(Plus(Dist(C1D2,Int(Times(Power(Times(e,x),m),Exp(Plus(Times(CN1,c,CI),Times(CN1,d,CI,Power(x,n))))),x),x),Dist(C1D2,Int(Times(Power(Times(e,x),m),Exp(Plus(Times(c,CI),Times(d,CI,Power(x,n))))),x),x)),And(FreeQ(List(c,d,e,m),x),IGtQ(n,C0)))),
IIntegrate(3391,Int(Times(Power(x_,m_DEFAULT),Sqr(Sin(Plus(a_DEFAULT,Times(C1D2,b_DEFAULT,Power(x_,n_)))))),x_Symbol),
    Condition(Plus(Dist(C1D2,Int(Power(x,m),x),x),Negate(Dist(C1D2,Int(Times(Power(x,m),Cos(Plus(Times(C2,a),Times(b,Power(x,n))))),x),x))),FreeQ(List(a,b,m,n),x))),
IIntegrate(3392,Int(Times(Sqr(Cos(Plus(a_DEFAULT,Times(C1D2,b_DEFAULT,Power(x_,n_))))),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Plus(Dist(C1D2,Int(Power(x,m),x),x),Dist(C1D2,Int(Times(Power(x,m),Cos(Plus(Times(C2,a),Times(b,Power(x,n))))),x),x)),FreeQ(List(a,b,m,n),x))),
IIntegrate(3393,Int(Times(Power(x_,m_DEFAULT),Power(Sin(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_)))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(x,Plus(m,C1)),Power(Sin(Plus(a,Times(b,Power(x,n)))),p),Power(Plus(m,C1),-1)),x),Negate(Dist(Times(b,n,p,Power(Plus(m,C1),-1)),Int(Times(Power(Sin(Plus(a,Times(b,Power(x,n)))),Plus(p,Negate(C1))),Cos(Plus(a,Times(b,Power(x,n))))),x),x))),And(FreeQ(List(a,b),x),IGtQ(p,C1),EqQ(Plus(m,n),C0),NeQ(n,C1),IntegerQ(n)))),
IIntegrate(3394,Int(Times(Power(Cos(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_)))),p_),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(x,Plus(m,C1)),Power(Cos(Plus(a,Times(b,Power(x,n)))),p),Power(Plus(m,C1),-1)),x),Dist(Times(b,n,p,Power(Plus(m,C1),-1)),Int(Times(Power(Cos(Plus(a,Times(b,Power(x,n)))),Plus(p,Negate(C1))),Sin(Plus(a,Times(b,Power(x,n))))),x),x)),And(FreeQ(List(a,b),x),IGtQ(p,C1),EqQ(Plus(m,n),C0),NeQ(n,C1),IntegerQ(n)))),
IIntegrate(3395,Int(Times(Power(x_,m_DEFAULT),Power(Sin(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_)))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(n,Power(Sin(Plus(a,Times(b,Power(x,n)))),p),Power(Times(Sqr(b),Sqr(n),Sqr(p)),-1)),x),Dist(Times(Plus(p,Negate(C1)),Power(p,-1)),Int(Times(Power(x,m),Power(Sin(Plus(a,Times(b,Power(x,n)))),Plus(p,Negate(C2)))),x),x),Negate(Simp(Times(Power(x,n),Cos(Plus(a,Times(b,Power(x,n)))),Power(Sin(Plus(a,Times(b,Power(x,n)))),Plus(p,Negate(C1))),Power(Times(b,n,p),-1)),x))),And(FreeQ(List(a,b,m,n),x),EqQ(Plus(m,Times(CN1,C2,n),C1),C0),GtQ(p,C1)))),
IIntegrate(3396,Int(Times(Power(Cos(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_)))),p_),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(n,Power(Cos(Plus(a,Times(b,Power(x,n)))),p),Power(Times(Sqr(b),Sqr(n),Sqr(p)),-1)),x),Dist(Times(Plus(p,Negate(C1)),Power(p,-1)),Int(Times(Power(x,m),Power(Cos(Plus(a,Times(b,Power(x,n)))),Plus(p,Negate(C2)))),x),x),Simp(Times(Power(x,n),Sin(Plus(a,Times(b,Power(x,n)))),Power(Cos(Plus(a,Times(b,Power(x,n)))),Plus(p,Negate(C1))),Power(Times(b,n,p),-1)),x)),And(FreeQ(List(a,b,m,n),x),EqQ(Plus(m,Times(CN1,C2,n),C1),C0),GtQ(p,C1)))),
IIntegrate(3397,Int(Times(Power(x_,m_DEFAULT),Power(Sin(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_)))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Plus(m,Negate(n),C1),Power(x,Plus(m,Times(CN1,C2,n),C1)),Power(Sin(Plus(a,Times(b,Power(x,n)))),p),Power(Times(Sqr(b),Sqr(n),Sqr(p)),-1)),x),Dist(Times(Plus(p,Negate(C1)),Power(p,-1)),Int(Times(Power(x,m),Power(Sin(Plus(a,Times(b,Power(x,n)))),Plus(p,Negate(C2)))),x),x),Negate(Dist(Times(Plus(m,Negate(n),C1),Plus(m,Times(CN1,C2,n),C1),Power(Times(Sqr(b),Sqr(n),Sqr(p)),-1)),Int(Times(Power(x,Plus(m,Times(CN1,C2,n))),Power(Sin(Plus(a,Times(b,Power(x,n)))),p)),x),x)),Negate(Simp(Times(Power(x,Plus(m,Negate(n),C1)),Cos(Plus(a,Times(b,Power(x,n)))),Power(Sin(Plus(a,Times(b,Power(x,n)))),Plus(p,Negate(C1))),Power(Times(b,n,p),-1)),x))),And(FreeQ(List(a,b),x),GtQ(p,C1),IGtQ(n,C0),IGtQ(m,Plus(Times(C2,n),Negate(C1)))))),
IIntegrate(3398,Int(Times(Power(Cos(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_)))),p_),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Plus(m,Negate(n),C1),Power(x,Plus(m,Times(CN1,C2,n),C1)),Power(Cos(Plus(a,Times(b,Power(x,n)))),p),Power(Times(Sqr(b),Sqr(n),Sqr(p)),-1)),x),Dist(Times(Plus(p,Negate(C1)),Power(p,-1)),Int(Times(Power(x,m),Power(Cos(Plus(a,Times(b,Power(x,n)))),Plus(p,Negate(C2)))),x),x),Negate(Dist(Times(Plus(m,Negate(n),C1),Plus(m,Times(CN1,C2,n),C1),Power(Times(Sqr(b),Sqr(n),Sqr(p)),-1)),Int(Times(Power(x,Plus(m,Times(CN1,C2,n))),Power(Cos(Plus(a,Times(b,Power(x,n)))),p)),x),x)),Simp(Times(Power(x,Plus(m,Negate(n),C1)),Sin(Plus(a,Times(b,Power(x,n)))),Power(Cos(Plus(a,Times(b,Power(x,n)))),Plus(p,Negate(C1))),Power(Times(b,n,p),-1)),x)),And(FreeQ(List(a,b),x),GtQ(p,C1),IGtQ(n,C0),IGtQ(m,Plus(Times(C2,n),Negate(C1)))))),
IIntegrate(3399,Int(Times(Power(x_,m_DEFAULT),Power(Sin(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_)))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(x,Plus(m,C1)),Power(Sin(Plus(a,Times(b,Power(x,n)))),p),Power(Plus(m,C1),-1)),x),Dist(Times(Sqr(b),Sqr(n),p,Plus(p,Negate(C1)),Power(Times(Plus(m,C1),Plus(m,n,C1)),-1)),Int(Times(Power(x,Plus(m,Times(C2,n))),Power(Sin(Plus(a,Times(b,Power(x,n)))),Plus(p,Negate(C2)))),x),x),Negate(Dist(Times(Sqr(b),Sqr(n),Sqr(p),Power(Times(Plus(m,C1),Plus(m,n,C1)),-1)),Int(Times(Power(x,Plus(m,Times(C2,n))),Power(Sin(Plus(a,Times(b,Power(x,n)))),p)),x),x)),Negate(Simp(Times(b,n,p,Power(x,Plus(m,n,C1)),Cos(Plus(a,Times(b,Power(x,n)))),Power(Sin(Plus(a,Times(b,Power(x,n)))),Plus(p,Negate(C1))),Power(Times(Plus(m,C1),Plus(m,n,C1)),-1)),x))),And(FreeQ(List(a,b),x),GtQ(p,C1),IGtQ(n,C0),ILtQ(m,Plus(Times(CN2,n),C1)),NeQ(Plus(m,n,C1),C0)))),
IIntegrate(3400,Int(Times(Power(Cos(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_)))),p_),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(x,Plus(m,C1)),Power(Cos(Plus(a,Times(b,Power(x,n)))),p),Power(Plus(m,C1),-1)),x),Dist(Times(Sqr(b),Sqr(n),p,Plus(p,Negate(C1)),Power(Times(Plus(m,C1),Plus(m,n,C1)),-1)),Int(Times(Power(x,Plus(m,Times(C2,n))),Power(Cos(Plus(a,Times(b,Power(x,n)))),Plus(p,Negate(C2)))),x),x),Negate(Dist(Times(Sqr(b),Sqr(n),Sqr(p),Power(Times(Plus(m,C1),Plus(m,n,C1)),-1)),Int(Times(Power(x,Plus(m,Times(C2,n))),Power(Cos(Plus(a,Times(b,Power(x,n)))),p)),x),x)),Simp(Times(b,n,p,Power(x,Plus(m,n,C1)),Sin(Plus(a,Times(b,Power(x,n)))),Power(Cos(Plus(a,Times(b,Power(x,n)))),Plus(p,Negate(C1))),Power(Times(Plus(m,C1),Plus(m,n,C1)),-1)),x)),And(FreeQ(List(a,b),x),GtQ(p,C1),IGtQ(n,C0),ILtQ(m,Plus(Times(CN2,n),C1)),NeQ(Plus(m,n,C1),C0))))
  );
}
