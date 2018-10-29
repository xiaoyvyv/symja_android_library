package org.matheclipse.core.integrate.rubi;


import org.matheclipse.core.interfaces.IAST;

import static org.matheclipse.core.expression.F.$;
import static org.matheclipse.core.expression.F.$p;
import static org.matheclipse.core.expression.F.$s;
import static org.matheclipse.core.expression.F.And;
import static org.matheclipse.core.expression.F.C0;
import static org.matheclipse.core.expression.F.C1;
import static org.matheclipse.core.expression.F.C1D2;
import static org.matheclipse.core.expression.F.C2;
import static org.matheclipse.core.expression.F.C4;
import static org.matheclipse.core.expression.F.CI;
import static org.matheclipse.core.expression.F.CN1;
import static org.matheclipse.core.expression.F.CN1D2;
import static org.matheclipse.core.expression.F.CN2;
import static org.matheclipse.core.expression.F.Complex;
import static org.matheclipse.core.expression.F.Condition;
import static org.matheclipse.core.expression.F.Cos;
import static org.matheclipse.core.expression.F.CosIntegral;
import static org.matheclipse.core.expression.F.CoshIntegral;
import static org.matheclipse.core.expression.F.Exp;
import static org.matheclipse.core.expression.F.FreeQ;
import static org.matheclipse.core.expression.F.IIntegrate;
import static org.matheclipse.core.expression.F.IntegerQ;
import static org.matheclipse.core.expression.F.List;
import static org.matheclipse.core.expression.F.Negate;
import static org.matheclipse.core.expression.F.Not;
import static org.matheclipse.core.expression.F.Or;
import static org.matheclipse.core.expression.F.Pi;
import static org.matheclipse.core.expression.F.Plus;
import static org.matheclipse.core.expression.F.Power;
import static org.matheclipse.core.expression.F.Sin;
import static org.matheclipse.core.expression.F.Sqr;
import static org.matheclipse.core.expression.F.Sqrt;
import static org.matheclipse.core.expression.F.Times;
import static org.matheclipse.core.expression.F.a;
import static org.matheclipse.core.expression.F.a_;
import static org.matheclipse.core.expression.F.a_DEFAULT;
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
import static org.matheclipse.core.expression.F.k;
import static org.matheclipse.core.expression.F.k_DEFAULT;
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
import static org.matheclipse.core.expression.F.v_;
import static org.matheclipse.core.expression.F.x;
import static org.matheclipse.core.expression.F.x_;
import static org.matheclipse.core.expression.F.x_Symbol;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.ComplexFreeQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Dist;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.EqQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.ExpandIntegrand;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.ExpandToSum;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.ExpandTrigReduce;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.FracPart;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.GeQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.GtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.IGtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.ILtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Int;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.IntPart;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.LinearMatchQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.LinearQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.LtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.NeQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.RationalQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Simp;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Subst;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Unintegrable;

/** 
 * IndefiniteIntegrationRules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class IntRules66 { 
  public static IAST RULES = List( 
IIntegrate(3301,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),-1),$($s("§sin"),Plus(e_DEFAULT,Times(Complex(C0,$p("fz")),f_DEFAULT,x_)))),x_Symbol),
    Condition(Simp(Times(CoshIntegral(Plus(Times(c,f,$s("fz"),Power(d,-1)),Times(f,$s("fz"),x))),Power(d,-1)),x),And(FreeQ(List(c,d,e,f,$s("fz")),x),EqQ(Plus(Times(d,Plus(e,Times(CN1,C1D2,Pi))),Times(CN1,c,f,$s("fz"),CI)),C0)))),
IIntegrate(3302,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),-1),$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),x_Symbol),
    Condition(Simp(Times(CosIntegral(Plus(e,Times(CN1,C1D2,Pi),Times(f,x))),Power(d,-1)),x),And(FreeQ(List(c,d,e,f),x),EqQ(Plus(Times(d,Plus(e,Times(CN1,C1D2,Pi))),Times(CN1,c,f)),C0)))),
IIntegrate(3303,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),-1),$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Dist(Cos(Times(Plus(Times(d,e),Times(CN1,c,f)),Power(d,-1))),Int(Times(Sin(Plus(Times(c,f,Power(d,-1)),Times(f,x))),Power(Plus(c,Times(d,x)),-1)),x),x),Dist(Sin(Times(Plus(Times(d,e),Times(CN1,c,f)),Power(d,-1))),Int(Times(Cos(Plus(Times(c,f,Power(d,-1)),Times(f,x))),Power(Plus(c,Times(d,x)),-1)),x),x)),And(FreeQ(List(c,d,e,f),x),NeQ(Plus(Times(d,e),Times(CN1,c,f)),C0)))),
IIntegrate(3304,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),CN1D2),$($s("§sin"),Plus(Times(C1D2,Pi),e_DEFAULT,Times(f_DEFAULT,x_)))),x_Symbol),
    Condition(Dist(Times(C2,Power(d,-1)),Subst(Int(Cos(Times(f,Sqr(x),Power(d,-1))),x),x,Sqrt(Plus(c,Times(d,x)))),x),And(FreeQ(List(c,d,e,f),x),ComplexFreeQ(f),EqQ(Plus(Times(d,e),Times(CN1,c,f)),C0)))),
IIntegrate(3305,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),CN1D2),$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),x_Symbol),
    Condition(Dist(Times(C2,Power(d,-1)),Subst(Int(Sin(Times(f,Sqr(x),Power(d,-1))),x),x,Sqrt(Plus(c,Times(d,x)))),x),And(FreeQ(List(c,d,e,f),x),ComplexFreeQ(f),EqQ(Plus(Times(d,e),Times(CN1,c,f)),C0)))),
IIntegrate(3306,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),CN1D2),$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Dist(Cos(Times(Plus(Times(d,e),Times(CN1,c,f)),Power(d,-1))),Int(Times(Sin(Plus(Times(c,f,Power(d,-1)),Times(f,x))),Power(Plus(c,Times(d,x)),CN1D2)),x),x),Dist(Sin(Times(Plus(Times(d,e),Times(CN1,c,f)),Power(d,-1))),Int(Times(Cos(Plus(Times(c,f,Power(d,-1)),Times(f,x))),Power(Plus(c,Times(d,x)),CN1D2)),x),x)),And(FreeQ(List(c,d,e,f),x),ComplexFreeQ(f),NeQ(Plus(Times(d,e),Times(CN1,c,f)),C0)))),
IIntegrate(3307,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),$($s("§sin"),Plus(e_DEFAULT,Times(Pi,k_DEFAULT),Times(f_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Dist(Times(C1D2,CI),Int(Times(Power(Plus(c,Times(d,x)),m),Power(Times(Exp(Times(CI,k,Pi)),Exp(Times(CI,Plus(e,Times(f,x))))),-1)),x),x),Negate(Dist(Times(C1D2,CI),Int(Times(Power(Plus(c,Times(d,x)),m),Exp(Times(CI,k,Pi)),Exp(Times(CI,Plus(e,Times(f,x))))),x),x))),And(FreeQ(List(c,d,e,f,m),x),IntegerQ(Times(C2,k))))),
IIntegrate(3308,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Dist(Times(C1D2,CI),Int(Times(Power(Plus(c,Times(d,x)),m),Power(Exp(Times(CI,Plus(e,Times(f,x)))),-1)),x),x),Negate(Dist(Times(C1D2,CI),Int(Times(Power(Plus(c,Times(d,x)),m),Exp(Times(CI,Plus(e,Times(f,x))))),x),x))),FreeQ(List(c,d,e,f,m),x))),
IIntegrate(3309,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Sqr($($s("§sin"),Plus(e_DEFAULT,Times(C1D2,f_DEFAULT,x_))))),x_Symbol),
    Condition(Plus(Dist(C1D2,Int(Power(Plus(c,Times(d,x)),m),x),x),Negate(Dist(C1D2,Int(Times(Power(Plus(c,Times(d,x)),m),Cos(Plus(Times(C2,e),Times(f,x)))),x),x))),FreeQ(List(c,d,e,f,m),x))),
IIntegrate(3310,Int(Times(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),Power(Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Plus(Simp(Times(d,Power(Times(b,Sin(Plus(e,Times(f,x)))),n),Power(Times(Sqr(f),Sqr(n)),-1)),x),Dist(Times(Sqr(b),Plus(n,Negate(C1)),Power(n,-1)),Int(Times(Plus(c,Times(d,x)),Power(Times(b,Sin(Plus(e,Times(f,x)))),Plus(n,Negate(C2)))),x),x),Negate(Simp(Times(b,Plus(c,Times(d,x)),Cos(Plus(e,Times(f,x))),Power(Times(b,Sin(Plus(e,Times(f,x)))),Plus(n,Negate(C1))),Power(Times(f,n),-1)),x))),And(FreeQ(List(b,c,d,e,f),x),GtQ(n,C1)))),
IIntegrate(3311,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_),Power(Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Plus(Simp(Times(d,m,Power(Plus(c,Times(d,x)),Plus(m,Negate(C1))),Power(Times(b,Sin(Plus(e,Times(f,x)))),n),Power(Times(Sqr(f),Sqr(n)),-1)),x),Dist(Times(Sqr(b),Plus(n,Negate(C1)),Power(n,-1)),Int(Times(Power(Plus(c,Times(d,x)),m),Power(Times(b,Sin(Plus(e,Times(f,x)))),Plus(n,Negate(C2)))),x),x),Negate(Dist(Times(Sqr(d),m,Plus(m,Negate(C1)),Power(Times(Sqr(f),Sqr(n)),-1)),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,Negate(C2))),Power(Times(b,Sin(Plus(e,Times(f,x)))),n)),x),x)),Negate(Simp(Times(b,Power(Plus(c,Times(d,x)),m),Cos(Plus(e,Times(f,x))),Power(Times(b,Sin(Plus(e,Times(f,x)))),Plus(n,Negate(C1))),Power(Times(f,n),-1)),x))),And(FreeQ(List(b,c,d,e,f),x),GtQ(n,C1),GtQ(m,C1)))),
IIntegrate(3312,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_),Power($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),n_)),x_Symbol),
    Condition(Int(ExpandTrigReduce(Power(Plus(c,Times(d,x)),m),Power(Sin(Plus(e,Times(f,x))),n),x),x),And(FreeQ(List(c,d,e,f,m),x),IGtQ(n,C1),Or(Not(RationalQ(m)),And(GeQ(m,CN1),LtQ(m,C1)))))),
IIntegrate(3313,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_),Power($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),n_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(c,Times(d,x)),Plus(m,C1)),Power(Sin(Plus(e,Times(f,x))),n),Power(Times(d,Plus(m,C1)),-1)),x),Negate(Dist(Times(f,n,Power(Times(d,Plus(m,C1)),-1)),Int(ExpandTrigReduce(Power(Plus(c,Times(d,x)),Plus(m,C1)),Times(Cos(Plus(e,Times(f,x))),Power(Sin(Plus(e,Times(f,x))),Plus(n,Negate(C1)))),x),x),x))),And(FreeQ(List(c,d,e,f,m),x),IGtQ(n,C1),GeQ(m,CN2),LtQ(m,CN1)))),
IIntegrate(3314,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_),Power(Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(c,Times(d,x)),Plus(m,C1)),Power(Times(b,Sin(Plus(e,Times(f,x)))),n),Power(Times(d,Plus(m,C1)),-1)),x),Dist(Times(Sqr(b),Sqr(f),n,Plus(n,Negate(C1)),Power(Times(Sqr(d),Plus(m,C1),Plus(m,C2)),-1)),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,C2)),Power(Times(b,Sin(Plus(e,Times(f,x)))),Plus(n,Negate(C2)))),x),x),Negate(Dist(Times(Sqr(f),Sqr(n),Power(Times(Sqr(d),Plus(m,C1),Plus(m,C2)),-1)),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,C2)),Power(Times(b,Sin(Plus(e,Times(f,x)))),n)),x),x)),Negate(Simp(Times(b,f,n,Power(Plus(c,Times(d,x)),Plus(m,C2)),Cos(Plus(e,Times(f,x))),Power(Times(b,Sin(Plus(e,Times(f,x)))),Plus(n,Negate(C1))),Power(Times(Sqr(d),Plus(m,C1),Plus(m,C2)),-1)),x))),And(FreeQ(List(b,c,d,e,f),x),GtQ(n,C1),LtQ(m,CN2)))),
IIntegrate(3315,Int(Times(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),Power(Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Plus(Simp(Times(Plus(c,Times(d,x)),Cos(Plus(e,Times(f,x))),Power(Times(b,Sin(Plus(e,Times(f,x)))),Plus(n,C1)),Power(Times(b,f,Plus(n,C1)),-1)),x),Dist(Times(Plus(n,C2),Power(Times(Sqr(b),Plus(n,C1)),-1)),Int(Times(Plus(c,Times(d,x)),Power(Times(b,Sin(Plus(e,Times(f,x)))),Plus(n,C2))),x),x),Negate(Simp(Times(d,Power(Times(b,Sin(Plus(e,Times(f,x)))),Plus(n,C2)),Power(Times(Sqr(b),Sqr(f),Plus(n,C1),Plus(n,C2)),-1)),x))),And(FreeQ(List(b,c,d,e,f),x),LtQ(n,CN1),NeQ(n,CN2)))),
IIntegrate(3316,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Power(Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(c,Times(d,x)),m),Cos(Plus(e,Times(f,x))),Power(Times(b,Sin(Plus(e,Times(f,x)))),Plus(n,C1)),Power(Times(b,f,Plus(n,C1)),-1)),x),Dist(Times(Plus(n,C2),Power(Times(Sqr(b),Plus(n,C1)),-1)),Int(Times(Power(Plus(c,Times(d,x)),m),Power(Times(b,Sin(Plus(e,Times(f,x)))),Plus(n,C2))),x),x),Dist(Times(Sqr(d),m,Plus(m,Negate(C1)),Power(Times(Sqr(b),Sqr(f),Plus(n,C1),Plus(n,C2)),-1)),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,Negate(C2))),Power(Times(b,Sin(Plus(e,Times(f,x)))),Plus(n,C2))),x),x),Negate(Simp(Times(d,m,Power(Plus(c,Times(d,x)),Plus(m,Negate(C1))),Power(Times(b,Sin(Plus(e,Times(f,x)))),Plus(n,C2)),Power(Times(Sqr(b),Sqr(f),Plus(n,C1),Plus(n,C2)),-1)),x))),And(FreeQ(List(b,c,d,e,f),x),LtQ(n,CN1),NeQ(n,CN2),GtQ(m,C1)))),
IIntegrate(3317,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Power(Plus(c,Times(d,x)),m),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),n),x),x),And(FreeQ(List(a,b,c,d,e,f,m),x),IGtQ(n,C0),Or(EqQ(n,C1),IGtQ(m,C0),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0))))),
IIntegrate(3318,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Times(C2,a),n),Int(Times(Power(Plus(c,Times(d,x)),m),Power(Sin(Plus(Times(C1D2,C1,Plus(e,Times(Pi,a,Power(Times(C2,b),-1)))),Times(C1D2,f,x))),Times(C2,n))),x),x),And(FreeQ(List(a,b,c,d,e,f,m),x),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),IntegerQ(n),Or(GtQ(n,C0),IGtQ(m,C0))))),
IIntegrate(3319,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_)),x_Symbol),
    Condition(Dist(Times(Power(Times(C2,a),IntPart(n)),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),FracPart(n)),Power(Power(Sin(Plus(Times(C1D2,e),Times(a,Pi,Power(Times(C4,b),-1)),Times(C1D2,f,x))),Times(C2,FracPart(n))),-1)),Int(Times(Power(Plus(c,Times(d,x)),m),Power(Sin(Plus(Times(C1D2,e),Times(a,Pi,Power(Times(C4,b),-1)),Times(C1D2,f,x))),Times(C2,n))),x),x),And(FreeQ(List(a,b,c,d,e,f,m),x),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),IntegerQ(Plus(n,C1D2)),Or(GtQ(n,C0),IGtQ(m,C0))))),
IIntegrate(3320,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(Pi,k_DEFAULT),Times(Complex(C0,$p("fz")),f_DEFAULT,x_))))),-1)),x_Symbol),
    Condition(Dist(C2,Int(Times(Power(Plus(c,Times(d,x)),m),Exp(Plus(Times(CN1,CI,e),Times(f,$s("fz"),x))),Power(Times(Exp(Times(CI,Pi,Plus(k,Negate(C1D2)))),Plus(b,Times(C2,a,Exp(Plus(Times(CN1,CI,e),Times(f,$s("fz"),x))),Power(Exp(Times(CI,Pi,Plus(k,Negate(C1D2)))),-1)),Times(CN1,b,Exp(Times(C2,Plus(Times(CN1,CI,e),Times(f,$s("fz"),x)))),Power(Exp(Times(C2,CI,k,Pi)),-1)))),-1)),x),x),And(FreeQ(List(a,b,c,d,e,f,$s("fz")),x),IntegerQ(Times(C2,k)),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),IGtQ(m,C0)))),
IIntegrate(3321,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(Pi,k_DEFAULT),Times(f_DEFAULT,x_))))),-1)),x_Symbol),
    Condition(Dist(C2,Int(Times(Power(Plus(c,Times(d,x)),m),Exp(Times(CI,Pi,Plus(k,Negate(C1D2)))),Exp(Times(CI,Plus(e,Times(f,x)))),Power(Plus(b,Times(C2,a,Exp(Times(CI,Pi,Plus(k,Negate(C1D2)))),Exp(Times(CI,Plus(e,Times(f,x))))),Times(CN1,b,Exp(Times(C2,CI,k,Pi)),Exp(Times(C2,CI,Plus(e,Times(f,x)))))),-1)),x),x),And(FreeQ(List(a,b,c,d,e,f),x),IntegerQ(Times(C2,k)),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),IGtQ(m,C0)))),
IIntegrate(3322,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(Complex(C0,$p("fz")),f_DEFAULT,x_))))),-1)),x_Symbol),
    Condition(Dist(C2,Int(Times(Power(Plus(c,Times(d,x)),m),Exp(Plus(Times(CN1,CI,e),Times(f,$s("fz"),x))),Power(Plus(Times(CN1,CI,b),Times(C2,a,Exp(Plus(Times(CN1,CI,e),Times(f,$s("fz"),x)))),Times(CI,b,Exp(Times(C2,Plus(Times(CN1,CI,e),Times(f,$s("fz"),x)))))),-1)),x),x),And(FreeQ(List(a,b,c,d,e,f,$s("fz")),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),IGtQ(m,C0)))),
IIntegrate(3323,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),-1)),x_Symbol),
    Condition(Dist(C2,Int(Times(Power(Plus(c,Times(d,x)),m),Exp(Times(CI,Plus(e,Times(f,x)))),Power(Plus(Times(CI,b),Times(C2,a,Exp(Times(CI,Plus(e,Times(f,x))))),Times(CN1,CI,b,Exp(Times(C2,CI,Plus(e,Times(f,x)))))),-1)),x),x),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),IGtQ(m,C0)))),
IIntegrate(3324,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),-2)),x_Symbol),
    Condition(Plus(Simp(Times(b,Power(Plus(c,Times(d,x)),m),Cos(Plus(e,Times(f,x))),Power(Times(f,Plus(Sqr(a),Negate(Sqr(b))),Plus(a,Times(b,Sin(Plus(e,Times(f,x)))))),-1)),x),Dist(Times(a,Power(Plus(Sqr(a),Negate(Sqr(b))),-1)),Int(Times(Power(Plus(c,Times(d,x)),m),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),-1)),x),x),Negate(Dist(Times(b,d,m,Power(Times(f,Plus(Sqr(a),Negate(Sqr(b)))),-1)),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,Negate(C1))),Cos(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),IGtQ(m,C0)))),
IIntegrate(3325,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,Power(Plus(c,Times(d,x)),m),Cos(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(n,C1)),Power(Times(f,Plus(n,C1),Plus(Sqr(a),Negate(Sqr(b)))),-1)),x)),Dist(Times(a,Power(Plus(Sqr(a),Negate(Sqr(b))),-1)),Int(Times(Power(Plus(c,Times(d,x)),m),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(n,C1))),x),x),Negate(Dist(Times(b,Plus(n,C2),Power(Times(Plus(n,C1),Plus(Sqr(a),Negate(Sqr(b)))),-1)),Int(Times(Power(Plus(c,Times(d,x)),m),Sin(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(n,C1))),x),x)),Dist(Times(b,d,m,Power(Times(f,Plus(n,C1),Plus(Sqr(a),Negate(Sqr(b)))),-1)),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,Negate(C1))),Cos(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(n,C1))),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),ILtQ(n,CN2),IGtQ(m,C0)))),
IIntegrate(3326,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_DEFAULT)),x_Symbol),
    Condition(Unintegrable(Times(Power(Plus(c,Times(d,x)),m),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),n)),x),FreeQ(List(a,b,c,d,e,f,m,n),x))),
IIntegrate(3327,Int(Times(Power(u_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sin(v_))),n_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(ExpandToSum(u,x),m),Power(Plus(a,Times(b,Sin(ExpandToSum(v,x)))),n)),x),And(FreeQ(List(a,b,m,n),x),LinearQ(List(u,v),x),Not(LinearMatchQ(List(u,v),x))))),
IIntegrate(3328,Int(Times(Power(Plus(a_DEFAULT,Times(Cos(v_),b_DEFAULT)),n_DEFAULT),Power(u_,m_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(ExpandToSum(u,x),m),Power(Plus(a,Times(b,Cos(ExpandToSum(v,x)))),n)),x),And(FreeQ(List(a,b,m,n),x),LinearQ(List(u,v),x),Not(LinearMatchQ(List(u,v),x))))),
IIntegrate(3329,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT),Sin(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Int(ExpandIntegrand(Sin(Plus(c,Times(d,x))),Power(Plus(a,Times(b,Power(x,n))),p),x),x),And(FreeQ(List(a,b,c,d,n),x),IGtQ(p,C0)))),
IIntegrate(3330,Int(Times(Cos(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Cos(Plus(c,Times(d,x))),Power(Plus(a,Times(b,Power(x,n))),p),x),x),And(FreeQ(List(a,b,c,d,n),x),IGtQ(p,C0)))),
IIntegrate(3331,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Sin(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Simp(Times(Power(x,Plus(Negate(n),C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Sin(Plus(c,Times(d,x))),Power(Times(b,n,Plus(p,C1)),-1)),x),Negate(Dist(Times(Plus(Negate(n),C1),Power(Times(b,n,Plus(p,C1)),-1)),Int(Times(Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Sin(Plus(c,Times(d,x))),Power(Power(x,n),-1)),x),x)),Negate(Dist(Times(d,Power(Times(b,n,Plus(p,C1)),-1)),Int(Times(Power(x,Plus(Negate(n),C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Cos(Plus(c,Times(d,x)))),x),x))),And(FreeQ(List(a,b,c,d),x),ILtQ(p,CN1),IGtQ(n,C2)))),
IIntegrate(3332,Int(Times(Cos(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(x,Plus(Negate(n),C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Cos(Plus(c,Times(d,x))),Power(Times(b,n,Plus(p,C1)),-1)),x),Negate(Dist(Times(Plus(Negate(n),C1),Power(Times(b,n,Plus(p,C1)),-1)),Int(Times(Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Cos(Plus(c,Times(d,x))),Power(Power(x,n),-1)),x),x)),Dist(Times(d,Power(Times(b,n,Plus(p,C1)),-1)),Int(Times(Power(x,Plus(Negate(n),C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Sin(Plus(c,Times(d,x)))),x),x)),And(FreeQ(List(a,b,c,d),x),ILtQ(p,CN1),IGtQ(n,C2)))),
IIntegrate(3333,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Sin(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Int(ExpandIntegrand(Sin(Plus(c,Times(d,x))),Power(Plus(a,Times(b,Power(x,n))),p),x),x),And(FreeQ(List(a,b,c,d),x),ILtQ(p,C0),IGtQ(n,C0),Or(EqQ(n,C2),EqQ(p,CN1))))),
IIntegrate(3334,Int(Times(Cos(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(Int(ExpandIntegrand(Cos(Plus(c,Times(d,x))),Power(Plus(a,Times(b,Power(x,n))),p),x),x),And(FreeQ(List(a,b,c,d),x),ILtQ(p,C0),IGtQ(n,C0),Or(EqQ(n,C2),EqQ(p,CN1))))),
IIntegrate(3335,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Sin(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Int(Times(Power(x,Times(n,p)),Power(Plus(b,Times(a,Power(Power(x,n),-1))),p),Sin(Plus(c,Times(d,x)))),x),And(FreeQ(List(a,b,c,d),x),ILtQ(p,C0),ILtQ(n,C0)))),
IIntegrate(3336,Int(Times(Cos(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(Int(Times(Power(x,Times(n,p)),Power(Plus(b,Times(a,Power(Power(x,n),-1))),p),Cos(Plus(c,Times(d,x)))),x),And(FreeQ(List(a,b,c,d),x),ILtQ(p,C0),ILtQ(n,C0)))),
IIntegrate(3337,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Sin(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Unintegrable(Times(Power(Plus(a,Times(b,Power(x,n))),p),Sin(Plus(c,Times(d,x)))),x),FreeQ(List(a,b,c,d,n,p),x))),
IIntegrate(3338,Int(Times(Cos(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(Unintegrable(Times(Power(Plus(a,Times(b,Power(x,n))),p),Cos(Plus(c,Times(d,x)))),x),FreeQ(List(a,b,c,d,n,p),x))),
IIntegrate(3339,Int(Times(Power(Times(e_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT),Sin(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Int(ExpandIntegrand(Sin(Plus(c,Times(d,x))),Times(Power(Times(e,x),m),Power(Plus(a,Times(b,Power(x,n))),p)),x),x),And(FreeQ(List(a,b,c,d,e,m,n),x),IGtQ(p,C0)))),
IIntegrate(3340,Int(Times(Cos(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),Power(Times(e_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Cos(Plus(c,Times(d,x))),Times(Power(Times(e,x),m),Power(Plus(a,Times(b,Power(x,n))),p)),x),x),And(FreeQ(List(a,b,c,d,e,m,n),x),IGtQ(p,C0)))),
IIntegrate(3341,Int(Times(Power(Times(e_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Sin(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Simp(Times(Power(e,m),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Sin(Plus(c,Times(d,x))),Power(Times(b,n,Plus(p,C1)),-1)),x),Negate(Dist(Times(d,Power(e,m),Power(Times(b,n,Plus(p,C1)),-1)),Int(Times(Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Cos(Plus(c,Times(d,x)))),x),x))),And(FreeQ(List(a,b,c,d,e,m,n),x),ILtQ(p,CN1),EqQ(m,Plus(n,Negate(C1))),Or(IntegerQ(n),GtQ(e,C0))))),
IIntegrate(3342,Int(Times(Cos(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),Power(Times(e_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(e,m),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Cos(Plus(c,Times(d,x))),Power(Times(b,n,Plus(p,C1)),-1)),x),Dist(Times(d,Power(e,m),Power(Times(b,n,Plus(p,C1)),-1)),Int(Times(Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Sin(Plus(c,Times(d,x)))),x),x)),And(FreeQ(List(a,b,c,d,e,m,n),x),ILtQ(p,CN1),EqQ(m,Plus(n,Negate(C1))),Or(IntegerQ(n),GtQ(e,C0))))),
IIntegrate(3343,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Sin(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Simp(Times(Power(x,Plus(m,Negate(n),C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Sin(Plus(c,Times(d,x))),Power(Times(b,n,Plus(p,C1)),-1)),x),Negate(Dist(Times(Plus(m,Negate(n),C1),Power(Times(b,n,Plus(p,C1)),-1)),Int(Times(Power(x,Plus(m,Negate(n))),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Sin(Plus(c,Times(d,x)))),x),x)),Negate(Dist(Times(d,Power(Times(b,n,Plus(p,C1)),-1)),Int(Times(Power(x,Plus(m,Negate(n),C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Cos(Plus(c,Times(d,x)))),x),x))),And(FreeQ(List(a,b,c,d,m),x),ILtQ(p,CN1),IGtQ(n,C0),Or(GtQ(Plus(m,Negate(n),C1),C0),GtQ(n,C2)),RationalQ(m)))),
IIntegrate(3344,Int(Times(Cos(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),Power(x_,m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(x,Plus(m,Negate(n),C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Cos(Plus(c,Times(d,x))),Power(Times(b,n,Plus(p,C1)),-1)),x),Negate(Dist(Times(Plus(m,Negate(n),C1),Power(Times(b,n,Plus(p,C1)),-1)),Int(Times(Power(x,Plus(m,Negate(n))),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Cos(Plus(c,Times(d,x)))),x),x)),Dist(Times(d,Power(Times(b,n,Plus(p,C1)),-1)),Int(Times(Power(x,Plus(m,Negate(n),C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Sin(Plus(c,Times(d,x)))),x),x)),And(FreeQ(List(a,b,c,d,m),x),ILtQ(p,CN1),IGtQ(n,C0),Or(GtQ(Plus(m,Negate(n),C1),C0),GtQ(n,C2)),RationalQ(m)))),
IIntegrate(3345,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Sin(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Int(ExpandIntegrand(Sin(Plus(c,Times(d,x))),Times(Power(x,m),Power(Plus(a,Times(b,Power(x,n))),p)),x),x),And(FreeQ(List(a,b,c,d,m),x),ILtQ(p,C0),IGtQ(n,C0),Or(EqQ(n,C2),EqQ(p,CN1)),IntegerQ(m)))),
IIntegrate(3346,Int(Times(Cos(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),Power(x_,m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(Int(ExpandIntegrand(Cos(Plus(c,Times(d,x))),Times(Power(x,m),Power(Plus(a,Times(b,Power(x,n))),p)),x),x),And(FreeQ(List(a,b,c,d,m),x),ILtQ(p,C0),IGtQ(n,C0),Or(EqQ(n,C2),EqQ(p,CN1)),IntegerQ(m)))),
IIntegrate(3347,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Sin(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Int(Times(Power(x,Plus(m,Times(n,p))),Power(Plus(b,Times(a,Power(Power(x,n),-1))),p),Sin(Plus(c,Times(d,x)))),x),And(FreeQ(List(a,b,c,d,m),x),ILtQ(p,C0),ILtQ(n,C0)))),
IIntegrate(3348,Int(Times(Cos(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),Power(x_,m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(Int(Times(Power(x,Plus(m,Times(n,p))),Power(Plus(b,Times(a,Power(Power(x,n),-1))),p),Cos(Plus(c,Times(d,x)))),x),And(FreeQ(List(a,b,c,d,m),x),ILtQ(p,C0),ILtQ(n,C0)))),
IIntegrate(3349,Int(Times(Power(Times(e_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT),Sin(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Unintegrable(Times(Power(Times(e,x),m),Power(Plus(a,Times(b,Power(x,n))),p),Sin(Plus(c,Times(d,x)))),x),FreeQ(List(a,b,c,d,e,m,n,p),x))),
IIntegrate(3350,Int(Times(Cos(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),Power(Times(e_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT)),x_Symbol),
    Condition(Unintegrable(Times(Power(Times(e,x),m),Power(Plus(a,Times(b,Power(x,n))),p),Cos(Plus(c,Times(d,x)))),x),FreeQ(List(a,b,c,d,e,m,n,p),x)))
  );
}
