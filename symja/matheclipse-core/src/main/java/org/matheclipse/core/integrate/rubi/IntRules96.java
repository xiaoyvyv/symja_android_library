package org.matheclipse.core.integrate.rubi;


import org.matheclipse.core.interfaces.IAST;

import static org.matheclipse.core.expression.F.ASymbol;
import static org.matheclipse.core.expression.F.A_DEFAULT;
import static org.matheclipse.core.expression.F.And;
import static org.matheclipse.core.expression.F.ArcCos;
import static org.matheclipse.core.expression.F.ArcCot;
import static org.matheclipse.core.expression.F.ArcCsc;
import static org.matheclipse.core.expression.F.ArcSec;
import static org.matheclipse.core.expression.F.ArcSin;
import static org.matheclipse.core.expression.F.ArcTan;
import static org.matheclipse.core.expression.F.ArcTanh;
import static org.matheclipse.core.expression.F.BSymbol;
import static org.matheclipse.core.expression.F.B_DEFAULT;
import static org.matheclipse.core.expression.F.C0;
import static org.matheclipse.core.expression.F.C1;
import static org.matheclipse.core.expression.F.C1D2;
import static org.matheclipse.core.expression.F.C2;
import static org.matheclipse.core.expression.F.C4;
import static org.matheclipse.core.expression.F.CI;
import static org.matheclipse.core.expression.F.CN1;
import static org.matheclipse.core.expression.F.CN1D2;
import static org.matheclipse.core.expression.F.CN2;
import static org.matheclipse.core.expression.F.CSqrt2;
import static org.matheclipse.core.expression.F.CSymbol;
import static org.matheclipse.core.expression.F.C_DEFAULT;
import static org.matheclipse.core.expression.F.Condition;
import static org.matheclipse.core.expression.F.Cos;
import static org.matheclipse.core.expression.F.CosIntegral;
import static org.matheclipse.core.expression.F.Cot;
import static org.matheclipse.core.expression.F.D;
import static org.matheclipse.core.expression.F.FreeQ;
import static org.matheclipse.core.expression.F.FresnelC;
import static org.matheclipse.core.expression.F.FresnelS;
import static org.matheclipse.core.expression.F.IIntegrate;
import static org.matheclipse.core.expression.F.List;
import static org.matheclipse.core.expression.F.Log;
import static org.matheclipse.core.expression.F.MatchQ;
import static org.matheclipse.core.expression.F.Negate;
import static org.matheclipse.core.expression.F.Not;
import static org.matheclipse.core.expression.F.Pi;
import static org.matheclipse.core.expression.F.Plus;
import static org.matheclipse.core.expression.F.Power;
import static org.matheclipse.core.expression.F.QQ;
import static org.matheclipse.core.expression.F.ReplaceAll;
import static org.matheclipse.core.expression.F.Rule;
import static org.matheclipse.core.expression.F.Set;
import static org.matheclipse.core.expression.F.Sin;
import static org.matheclipse.core.expression.F.SinIntegral;
import static org.matheclipse.core.expression.F.Sqr;
import static org.matheclipse.core.expression.F.Sqrt;
import static org.matheclipse.core.expression.F.Tan;
import static org.matheclipse.core.expression.F.Times;
import static org.matheclipse.core.expression.F.With;
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
import static org.matheclipse.core.expression.F.e_DEFAULT;
import static org.matheclipse.core.expression.F.f;
import static org.matheclipse.core.expression.F.f_;
import static org.matheclipse.core.expression.F.f_DEFAULT;
import static org.matheclipse.core.expression.F.m;
import static org.matheclipse.core.expression.F.m_DEFAULT;
import static org.matheclipse.core.expression.F.n;
import static org.matheclipse.core.expression.F.n_;
import static org.matheclipse.core.expression.F.n_DEFAULT;
import static org.matheclipse.core.expression.F.p;
import static org.matheclipse.core.expression.F.p_;
import static org.matheclipse.core.expression.F.p_DEFAULT;
import static org.matheclipse.core.expression.F.u;
import static org.matheclipse.core.expression.F.u_;
import static org.matheclipse.core.expression.F.u_DEFAULT;
import static org.matheclipse.core.expression.F.v;
import static org.matheclipse.core.expression.F.v_;
import static org.matheclipse.core.expression.F.w;
import static org.matheclipse.core.expression.F.x;
import static org.matheclipse.core.expression.F.x_;
import static org.matheclipse.core.expression.F.x_Symbol;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Dist;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.EqQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.FunctionOfExponentialQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.FunctionOfQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.GtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.IGtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Int;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.IntHide;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.InverseFunctionFreeQ;
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
public class IntRules96 { 
  public static IAST RULES = List( 
IIntegrate(4801,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSin(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),u_DEFAULT),x_Symbol),
    Condition(Unintegrable(Times(u,Power(Plus(a,Times(b,ArcSin(Times(c,x)))),n)),x),FreeQ(List(a,b,c,n),x))),
IIntegrate(4802,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCos(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),u_DEFAULT),x_Symbol),
    Condition(Unintegrable(Times(u,Power(Plus(a,Times(b,ArcCos(Times(c,x)))),n)),x),FreeQ(List(a,b,c,n),x))),
IIntegrate(4803,Int(Power(Plus(a_DEFAULT,Times(ArcSin(Plus(c_,Times(d_DEFAULT,x_))),b_DEFAULT)),n_DEFAULT),x_Symbol),
    Condition(Dist(Power(d,-1),Subst(Int(Power(Plus(a,Times(b,ArcSin(x))),n),x),x,Plus(c,Times(d,x))),x),FreeQ(List(a,b,c,d,n),x))),
IIntegrate(4804,Int(Power(Plus(a_DEFAULT,Times(ArcCos(Plus(c_,Times(d_DEFAULT,x_))),b_DEFAULT)),n_DEFAULT),x_Symbol),
    Condition(Dist(Power(d,-1),Subst(Int(Power(Plus(a,Times(b,ArcCos(x))),n),x),x,Plus(c,Times(d,x))),x),FreeQ(List(a,b,c,d,n),x))),
IIntegrate(4805,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSin(Plus(c_,Times(d_DEFAULT,x_))),b_DEFAULT)),n_DEFAULT),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Dist(Power(d,-1),Subst(Int(Times(Power(Plus(Times(Plus(Times(d,e),Times(CN1,c,f)),Power(d,-1)),Times(f,x,Power(d,-1))),m),Power(Plus(a,Times(b,ArcSin(x))),n)),x),x,Plus(c,Times(d,x))),x),FreeQ(List(a,b,c,d,e,f,m,n),x))),
IIntegrate(4806,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCos(Plus(c_,Times(d_DEFAULT,x_))),b_DEFAULT)),n_DEFAULT),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Dist(Power(d,-1),Subst(Int(Times(Power(Plus(Times(Plus(Times(d,e),Times(CN1,c,f)),Power(d,-1)),Times(f,x,Power(d,-1))),m),Power(Plus(a,Times(b,ArcCos(x))),n)),x),x,Plus(c,Times(d,x))),x),FreeQ(List(a,b,c,d,e,f,m,n),x))),
IIntegrate(4807,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSin(Plus(c_,Times(d_DEFAULT,x_))),b_DEFAULT)),n_DEFAULT),Power(Plus(A_DEFAULT,Times(B_DEFAULT,x_),Times(C_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Power(d,-1),Subst(Int(Times(Power(Plus(Times(CN1,CSymbol,Power(d,-2)),Times(CSymbol,Sqr(x),Power(d,-2))),p),Power(Plus(a,Times(b,ArcSin(x))),n)),x),x,Plus(c,Times(d,x))),x),And(FreeQ(List(a,b,c,d,ASymbol,BSymbol,CSymbol,n,p),x),EqQ(Plus(Times(BSymbol,Plus(C1,Negate(Sqr(c)))),Times(C2,ASymbol,c,d)),C0),EqQ(Plus(Times(C2,c,CSymbol),Times(CN1,BSymbol,d)),C0)))),
IIntegrate(4808,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCos(Plus(c_,Times(d_DEFAULT,x_))),b_DEFAULT)),n_DEFAULT),Power(Plus(A_DEFAULT,Times(B_DEFAULT,x_),Times(C_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Power(d,-1),Subst(Int(Times(Power(Plus(Times(CN1,CSymbol,Power(d,-2)),Times(CSymbol,Sqr(x),Power(d,-2))),p),Power(Plus(a,Times(b,ArcCos(x))),n)),x),x,Plus(c,Times(d,x))),x),And(FreeQ(List(a,b,c,d,ASymbol,BSymbol,CSymbol,n,p),x),EqQ(Plus(Times(BSymbol,Plus(C1,Negate(Sqr(c)))),Times(C2,ASymbol,c,d)),C0),EqQ(Plus(Times(C2,c,CSymbol),Times(CN1,BSymbol,d)),C0)))),
IIntegrate(4809,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSin(Plus(c_,Times(d_DEFAULT,x_))),b_DEFAULT)),n_DEFAULT),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power(Plus(A_DEFAULT,Times(B_DEFAULT,x_),Times(C_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Power(d,-1),Subst(Int(Times(Power(Plus(Times(Plus(Times(d,e),Times(CN1,c,f)),Power(d,-1)),Times(f,x,Power(d,-1))),m),Power(Plus(Times(CN1,CSymbol,Power(d,-2)),Times(CSymbol,Sqr(x),Power(d,-2))),p),Power(Plus(a,Times(b,ArcSin(x))),n)),x),x,Plus(c,Times(d,x))),x),And(FreeQ(List(a,b,c,d,e,f,ASymbol,BSymbol,CSymbol,m,n,p),x),EqQ(Plus(Times(BSymbol,Plus(C1,Negate(Sqr(c)))),Times(C2,ASymbol,c,d)),C0),EqQ(Plus(Times(C2,c,CSymbol),Times(CN1,BSymbol,d)),C0)))),
IIntegrate(4810,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCos(Plus(c_,Times(d_DEFAULT,x_))),b_DEFAULT)),n_DEFAULT),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power(Plus(A_DEFAULT,Times(B_DEFAULT,x_),Times(C_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Power(d,-1),Subst(Int(Times(Power(Plus(Times(Plus(Times(d,e),Times(CN1,c,f)),Power(d,-1)),Times(f,x,Power(d,-1))),m),Power(Plus(Times(CN1,CSymbol,Power(d,-2)),Times(CSymbol,Sqr(x),Power(d,-2))),p),Power(Plus(a,Times(b,ArcCos(x))),n)),x),x,Plus(c,Times(d,x))),x),And(FreeQ(List(a,b,c,d,e,f,ASymbol,BSymbol,CSymbol,m,n,p),x),EqQ(Plus(Times(BSymbol,Plus(C1,Negate(Sqr(c)))),Times(C2,ASymbol,c,d)),C0),EqQ(Plus(Times(C2,c,CSymbol),Times(CN1,BSymbol,d)),C0)))),
IIntegrate(4811,Int(Sqrt(Plus(a_DEFAULT,Times(ArcSin(Plus(c_,Times(d_DEFAULT,Sqr(x_)))),b_DEFAULT))),x_Symbol),
    Condition(Plus(Simp(Times(x,Sqrt(Plus(a,Times(b,ArcSin(Plus(c,Times(d,Sqr(x)))))))),x),Negate(Simp(Times(Sqrt(Pi),x,Plus(Cos(Times(a,Power(Times(C2,b),-1))),Times(c,Sin(Times(a,Power(Times(C2,b),-1))))),FresnelC(Times(Sqrt(Times(c,Power(Times(Pi,b),-1))),Sqrt(Plus(a,Times(b,ArcSin(Plus(c,Times(d,Sqr(x))))))))),Power(Times(Sqrt(Times(c,Power(b,-1))),Plus(Cos(Times(C1D2,ArcSin(Plus(c,Times(d,Sqr(x)))))),Times(CN1,c,Sin(Times(C1D2,ArcSin(Plus(c,Times(d,Sqr(x))))))))),-1)),x)),Simp(Times(Sqrt(Pi),x,Plus(Cos(Times(a,Power(Times(C2,b),-1))),Times(CN1,c,Sin(Times(a,Power(Times(C2,b),-1))))),FresnelS(Times(Sqrt(Times(c,Power(Times(Pi,b),-1))),Sqrt(Plus(a,Times(b,ArcSin(Plus(c,Times(d,Sqr(x))))))))),Power(Times(Sqrt(Times(c,Power(b,-1))),Plus(Cos(Times(C1D2,ArcSin(Plus(c,Times(d,Sqr(x)))))),Times(CN1,c,Sin(Times(C1D2,ArcSin(Plus(c,Times(d,Sqr(x))))))))),-1)),x)),And(FreeQ(List(a,b,c,d),x),EqQ(Sqr(c),C1)))),
IIntegrate(4812,Int(Sqrt(Plus(a_DEFAULT,Times(ArcCos(Plus(C1,Times(d_DEFAULT,Sqr(x_)))),b_DEFAULT))),x_Symbol),
    Condition(Plus(Simp(Times(CN2,Sqrt(Plus(a,Times(b,ArcCos(Plus(C1,Times(d,Sqr(x))))))),Sqr(Sin(Times(C1D2,ArcCos(Plus(C1,Times(d,Sqr(x))))))),Power(Times(d,x),-1)),x),Negate(Simp(Times(C2,Sqrt(Pi),Sin(Times(a,Power(Times(C2,b),-1))),Sin(Times(C1D2,ArcCos(Plus(C1,Times(d,Sqr(x)))))),FresnelC(Times(Sqrt(Power(Times(Pi,b),-1)),Sqrt(Plus(a,Times(b,ArcCos(Plus(C1,Times(d,Sqr(x))))))))),Power(Times(Sqrt(Power(b,-1)),d,x),-1)),x)),Simp(Times(C2,Sqrt(Pi),Cos(Times(a,Power(Times(C2,b),-1))),Sin(Times(C1D2,ArcCos(Plus(C1,Times(d,Sqr(x)))))),FresnelS(Times(Sqrt(Power(Times(Pi,b),-1)),Sqrt(Plus(a,Times(b,ArcCos(Plus(C1,Times(d,Sqr(x))))))))),Power(Times(Sqrt(Power(b,-1)),d,x),-1)),x)),FreeQ(List(a,b,d),x))),
IIntegrate(4813,Int(Sqrt(Plus(a_DEFAULT,Times(ArcCos(Plus(CN1,Times(d_DEFAULT,Sqr(x_)))),b_DEFAULT))),x_Symbol),
    Condition(Plus(Simp(Times(C2,Sqrt(Plus(a,Times(b,ArcCos(Plus(CN1,Times(d,Sqr(x))))))),Sqr(Cos(Times(C1D2,ArcCos(Plus(CN1,Times(d,Sqr(x))))))),Power(Times(d,x),-1)),x),Negate(Simp(Times(C2,Sqrt(Pi),Cos(Times(a,Power(Times(C2,b),-1))),Cos(Times(C1D2,ArcCos(Plus(CN1,Times(d,Sqr(x)))))),FresnelC(Times(Sqrt(Power(Times(Pi,b),-1)),Sqrt(Plus(a,Times(b,ArcCos(Plus(CN1,Times(d,Sqr(x))))))))),Power(Times(Sqrt(Power(b,-1)),d,x),-1)),x)),Negate(Simp(Times(C2,Sqrt(Pi),Sin(Times(a,Power(Times(C2,b),-1))),Cos(Times(C1D2,ArcCos(Plus(CN1,Times(d,Sqr(x)))))),FresnelS(Times(Sqrt(Power(Times(Pi,b),-1)),Sqrt(Plus(a,Times(b,ArcCos(Plus(CN1,Times(d,Sqr(x))))))))),Power(Times(Sqrt(Power(b,-1)),d,x),-1)),x))),FreeQ(List(a,b,d),x))),
IIntegrate(4814,Int(Power(Plus(a_DEFAULT,Times(ArcSin(Plus(c_,Times(d_DEFAULT,Sqr(x_)))),b_DEFAULT)),n_),x_Symbol),
    Condition(Plus(Simp(Times(x,Power(Plus(a,Times(b,ArcSin(Plus(c,Times(d,Sqr(x)))))),n)),x),Negate(Dist(Times(C4,Sqr(b),n,Plus(n,Negate(C1))),Int(Power(Plus(a,Times(b,ArcSin(Plus(c,Times(d,Sqr(x)))))),Plus(n,Negate(C2))),x),x)),Simp(Times(C2,b,n,Sqrt(Plus(Times(CN2,c,d,Sqr(x)),Times(CN1,Sqr(d),Power(x,4)))),Power(Plus(a,Times(b,ArcSin(Plus(c,Times(d,Sqr(x)))))),Plus(n,Negate(C1))),Power(Times(d,x),-1)),x)),And(FreeQ(List(a,b,c,d),x),EqQ(Sqr(c),C1),GtQ(n,C1)))),
IIntegrate(4815,Int(Power(Plus(a_DEFAULT,Times(ArcCos(Plus(c_,Times(d_DEFAULT,Sqr(x_)))),b_DEFAULT)),n_),x_Symbol),
    Condition(Plus(Simp(Times(x,Power(Plus(a,Times(b,ArcCos(Plus(c,Times(d,Sqr(x)))))),n)),x),Negate(Dist(Times(C4,Sqr(b),n,Plus(n,Negate(C1))),Int(Power(Plus(a,Times(b,ArcCos(Plus(c,Times(d,Sqr(x)))))),Plus(n,Negate(C2))),x),x)),Negate(Simp(Times(C2,b,n,Sqrt(Plus(Times(CN2,c,d,Sqr(x)),Times(CN1,Sqr(d),Power(x,4)))),Power(Plus(a,Times(b,ArcCos(Plus(c,Times(d,Sqr(x)))))),Plus(n,Negate(C1))),Power(Times(d,x),-1)),x))),And(FreeQ(List(a,b,c,d),x),EqQ(Sqr(c),C1),GtQ(n,C1)))),
IIntegrate(4816,Int(Power(Plus(a_DEFAULT,Times(ArcSin(Plus(c_,Times(d_DEFAULT,Sqr(x_)))),b_DEFAULT)),-1),x_Symbol),
    Condition(Plus(Negate(Simp(Times(x,Plus(Times(c,Cos(Times(a,Power(Times(C2,b),-1)))),Negate(Sin(Times(a,Power(Times(C2,b),-1))))),CosIntegral(Times(c,Power(Times(C2,b),-1),Plus(a,Times(b,ArcSin(Plus(c,Times(d,Sqr(x)))))))),Power(Times(C2,b,Plus(Cos(Times(C1D2,ArcSin(Plus(c,Times(d,Sqr(x)))))),Times(CN1,c,Sin(Times(C1D2,ArcSin(Plus(c,Times(d,Sqr(x))))))))),-1)),x)),Negate(Simp(Times(x,Plus(Times(c,Cos(Times(a,Power(Times(C2,b),-1)))),Sin(Times(a,Power(Times(C2,b),-1)))),SinIntegral(Times(c,Power(Times(C2,b),-1),Plus(a,Times(b,ArcSin(Plus(c,Times(d,Sqr(x)))))))),Power(Times(C2,b,Plus(Cos(Times(C1D2,ArcSin(Plus(c,Times(d,Sqr(x)))))),Times(CN1,c,Sin(Times(C1D2,ArcSin(Plus(c,Times(d,Sqr(x))))))))),-1)),x))),And(FreeQ(List(a,b,c,d),x),EqQ(Sqr(c),C1)))),
IIntegrate(4817,Int(Power(Plus(a_DEFAULT,Times(ArcCos(Plus(C1,Times(d_DEFAULT,Sqr(x_)))),b_DEFAULT)),-1),x_Symbol),
    Condition(Plus(Simp(Times(x,Cos(Times(a,Power(Times(C2,b),-1))),CosIntegral(Times(Plus(a,Times(b,ArcCos(Plus(C1,Times(d,Sqr(x)))))),Power(Times(C2,b),-1))),Power(Times(CSqrt2,b,Sqrt(Times(CN1,d,Sqr(x)))),-1)),x),Simp(Times(x,Sin(Times(a,Power(Times(C2,b),-1))),SinIntegral(Times(Plus(a,Times(b,ArcCos(Plus(C1,Times(d,Sqr(x)))))),Power(Times(C2,b),-1))),Power(Times(CSqrt2,b,Sqrt(Times(CN1,d,Sqr(x)))),-1)),x)),FreeQ(List(a,b,d),x))),
IIntegrate(4818,Int(Power(Plus(a_DEFAULT,Times(ArcCos(Plus(CN1,Times(d_DEFAULT,Sqr(x_)))),b_DEFAULT)),-1),x_Symbol),
    Condition(Plus(Simp(Times(x,Sin(Times(a,Power(Times(C2,b),-1))),CosIntegral(Times(Plus(a,Times(b,ArcCos(Plus(CN1,Times(d,Sqr(x)))))),Power(Times(C2,b),-1))),Power(Times(CSqrt2,b,Sqrt(Times(d,Sqr(x)))),-1)),x),Negate(Simp(Times(x,Cos(Times(a,Power(Times(C2,b),-1))),SinIntegral(Times(Plus(a,Times(b,ArcCos(Plus(CN1,Times(d,Sqr(x)))))),Power(Times(C2,b),-1))),Power(Times(CSqrt2,b,Sqrt(Times(d,Sqr(x)))),-1)),x))),FreeQ(List(a,b,d),x))),
IIntegrate(4819,Int(Power(Plus(a_DEFAULT,Times(ArcSin(Plus(c_,Times(d_DEFAULT,Sqr(x_)))),b_DEFAULT)),CN1D2),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Sqrt(Pi),x,Plus(Cos(Times(a,Power(Times(C2,b),-1))),Times(CN1,c,Sin(Times(a,Power(Times(C2,b),-1))))),FresnelC(Times(C1,Sqrt(Plus(a,Times(b,ArcSin(Plus(c,Times(d,Sqr(x))))))),Power(Times(Sqrt(Times(b,c)),Sqrt(Pi)),-1))),Power(Times(Sqrt(Times(b,c)),Plus(Cos(Times(C1D2,ArcSin(Plus(c,Times(d,Sqr(x)))))),Times(CN1,c,Sin(Times(C1D2,ArcSin(Plus(c,Times(d,Sqr(x))))))))),-1)),x)),Negate(Simp(Times(Sqrt(Pi),x,Plus(Cos(Times(a,Power(Times(C2,b),-1))),Times(c,Sin(Times(a,Power(Times(C2,b),-1))))),FresnelS(Times(Power(Times(Sqrt(Times(b,c)),Sqrt(Pi)),-1),Sqrt(Plus(a,Times(b,ArcSin(Plus(c,Times(d,Sqr(x))))))))),Power(Times(Sqrt(Times(b,c)),Plus(Cos(Times(C1D2,ArcSin(Plus(c,Times(d,Sqr(x)))))),Times(CN1,c,Sin(Times(C1D2,ArcSin(Plus(c,Times(d,Sqr(x))))))))),-1)),x))),And(FreeQ(List(a,b,c,d),x),EqQ(Sqr(c),C1)))),
IIntegrate(4820,Int(Power(Plus(a_DEFAULT,Times(ArcCos(Plus(C1,Times(d_DEFAULT,Sqr(x_)))),b_DEFAULT)),CN1D2),x_Symbol),
    Condition(Plus(Simp(Times(CN2,Sqrt(Times(Pi,Power(b,-1))),Cos(Times(a,Power(Times(C2,b),-1))),Sin(Times(C1D2,ArcCos(Plus(C1,Times(d,Sqr(x)))))),FresnelC(Times(Sqrt(Power(Times(Pi,b),-1)),Sqrt(Plus(a,Times(b,ArcCos(Plus(C1,Times(d,Sqr(x))))))))),Power(Times(d,x),-1)),x),Negate(Simp(Times(C2,Sqrt(Times(Pi,Power(b,-1))),Sin(Times(a,Power(Times(C2,b),-1))),Sin(Times(C1D2,ArcCos(Plus(C1,Times(d,Sqr(x)))))),FresnelS(Times(Sqrt(Power(Times(Pi,b),-1)),Sqrt(Plus(a,Times(b,ArcCos(Plus(C1,Times(d,Sqr(x))))))))),Power(Times(d,x),-1)),x))),FreeQ(List(a,b,d),x))),
IIntegrate(4821,Int(Power(Plus(a_DEFAULT,Times(ArcCos(Plus(CN1,Times(d_DEFAULT,Sqr(x_)))),b_DEFAULT)),CN1D2),x_Symbol),
    Condition(Plus(Simp(Times(C2,Sqrt(Times(Pi,Power(b,-1))),Sin(Times(a,Power(Times(C2,b),-1))),Cos(Times(C1D2,ArcCos(Plus(CN1,Times(d,Sqr(x)))))),FresnelC(Times(Sqrt(Power(Times(Pi,b),-1)),Sqrt(Plus(a,Times(b,ArcCos(Plus(CN1,Times(d,Sqr(x))))))))),Power(Times(d,x),-1)),x),Negate(Simp(Times(C2,Sqrt(Times(Pi,Power(b,-1))),Cos(Times(a,Power(Times(C2,b),-1))),Cos(Times(C1D2,ArcCos(Plus(CN1,Times(d,Sqr(x)))))),FresnelS(Times(Sqrt(Power(Times(Pi,b),-1)),Sqrt(Plus(a,Times(b,ArcCos(Plus(CN1,Times(d,Sqr(x))))))))),Power(Times(d,x),-1)),x))),FreeQ(List(a,b,d),x))),
IIntegrate(4822,Int(Power(Plus(a_DEFAULT,Times(ArcSin(Plus(c_,Times(d_DEFAULT,Sqr(x_)))),b_DEFAULT)),QQ(-3L,2L)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Sqrt(Plus(Times(CN2,c,d,Sqr(x)),Times(CN1,Sqr(d),Power(x,4)))),Power(Times(b,d,x,Sqrt(Plus(a,Times(b,ArcSin(Plus(c,Times(d,Sqr(x)))))))),-1)),x)),Negate(Simp(Times(Power(Times(c,Power(b,-1)),QQ(3L,2L)),Sqrt(Pi),x,Plus(Cos(Times(a,Power(Times(C2,b),-1))),Times(c,Sin(Times(a,Power(Times(C2,b),-1))))),FresnelC(Times(Sqrt(Times(c,Power(Times(Pi,b),-1))),Sqrt(Plus(a,Times(b,ArcSin(Plus(c,Times(d,Sqr(x))))))))),Power(Plus(Cos(Times(C1D2,ArcSin(Plus(c,Times(d,Sqr(x)))))),Times(CN1,c,Sin(Times(C1D2,ArcSin(Plus(c,Times(d,Sqr(x)))))))),-1)),x)),Simp(Times(Power(Times(c,Power(b,-1)),QQ(3L,2L)),Sqrt(Pi),x,Plus(Cos(Times(a,Power(Times(C2,b),-1))),Times(CN1,c,Sin(Times(a,Power(Times(C2,b),-1))))),FresnelS(Times(Sqrt(Times(c,Power(Times(Pi,b),-1))),Sqrt(Plus(a,Times(b,ArcSin(Plus(c,Times(d,Sqr(x))))))))),Power(Plus(Cos(Times(C1D2,ArcSin(Plus(c,Times(d,Sqr(x)))))),Times(CN1,c,Sin(Times(C1D2,ArcSin(Plus(c,Times(d,Sqr(x)))))))),-1)),x)),And(FreeQ(List(a,b,c,d),x),EqQ(Sqr(c),C1)))),
IIntegrate(4823,Int(Power(Plus(a_DEFAULT,Times(ArcCos(Plus(C1,Times(d_DEFAULT,Sqr(x_)))),b_DEFAULT)),QQ(-3L,2L)),x_Symbol),
    Condition(Plus(Simp(Times(Sqrt(Plus(Times(CN2,d,Sqr(x)),Times(CN1,Sqr(d),Power(x,4)))),Power(Times(b,d,x,Sqrt(Plus(a,Times(b,ArcCos(Plus(C1,Times(d,Sqr(x)))))))),-1)),x),Negate(Simp(Times(C2,Power(Power(b,-1),QQ(3L,2L)),Sqrt(Pi),Sin(Times(a,Power(Times(C2,b),-1))),Sin(Times(C1D2,ArcCos(Plus(C1,Times(d,Sqr(x)))))),FresnelC(Times(Sqrt(Power(Times(Pi,b),-1)),Sqrt(Plus(a,Times(b,ArcCos(Plus(C1,Times(d,Sqr(x))))))))),Power(Times(d,x),-1)),x)),Simp(Times(C2,Power(Power(b,-1),QQ(3L,2L)),Sqrt(Pi),Cos(Times(a,Power(Times(C2,b),-1))),Sin(Times(C1D2,ArcCos(Plus(C1,Times(d,Sqr(x)))))),FresnelS(Times(Sqrt(Power(Times(Pi,b),-1)),Sqrt(Plus(a,Times(b,ArcCos(Plus(C1,Times(d,Sqr(x))))))))),Power(Times(d,x),-1)),x)),FreeQ(List(a,b,d),x))),
IIntegrate(4824,Int(Power(Plus(a_DEFAULT,Times(ArcCos(Plus(CN1,Times(d_DEFAULT,Sqr(x_)))),b_DEFAULT)),QQ(-3L,2L)),x_Symbol),
    Condition(Plus(Simp(Times(Sqrt(Plus(Times(C2,d,Sqr(x)),Times(CN1,Sqr(d),Power(x,4)))),Power(Times(b,d,x,Sqrt(Plus(a,Times(b,ArcCos(Plus(CN1,Times(d,Sqr(x)))))))),-1)),x),Negate(Simp(Times(C2,Power(Power(b,-1),QQ(3L,2L)),Sqrt(Pi),Cos(Times(a,Power(Times(C2,b),-1))),Cos(Times(C1D2,ArcCos(Plus(CN1,Times(d,Sqr(x)))))),FresnelC(Times(Sqrt(Power(Times(Pi,b),-1)),Sqrt(Plus(a,Times(b,ArcCos(Plus(CN1,Times(d,Sqr(x))))))))),Power(Times(d,x),-1)),x)),Negate(Simp(Times(C2,Power(Power(b,-1),QQ(3L,2L)),Sqrt(Pi),Sin(Times(a,Power(Times(C2,b),-1))),Cos(Times(C1D2,ArcCos(Plus(CN1,Times(d,Sqr(x)))))),FresnelS(Times(Sqrt(Power(Times(Pi,b),-1)),Sqrt(Plus(a,Times(b,ArcCos(Plus(CN1,Times(d,Sqr(x))))))))),Power(Times(d,x),-1)),x))),FreeQ(List(a,b,d),x))),
IIntegrate(4825,Int(Power(Plus(a_DEFAULT,Times(ArcSin(Plus(c_,Times(d_DEFAULT,Sqr(x_)))),b_DEFAULT)),-2),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Sqrt(Plus(Times(CN2,c,d,Sqr(x)),Times(CN1,Sqr(d),Power(x,4)))),Power(Times(C2,b,d,x,Plus(a,Times(b,ArcSin(Plus(c,Times(d,Sqr(x))))))),-1)),x)),Negate(Simp(Times(x,Plus(Cos(Times(a,Power(Times(C2,b),-1))),Times(c,Sin(Times(a,Power(Times(C2,b),-1))))),CosIntegral(Times(c,Power(Times(C2,b),-1),Plus(a,Times(b,ArcSin(Plus(c,Times(d,Sqr(x)))))))),Power(Times(C4,Sqr(b),Plus(Cos(Times(C1D2,ArcSin(Plus(c,Times(d,Sqr(x)))))),Times(CN1,c,Sin(Times(C1D2,ArcSin(Plus(c,Times(d,Sqr(x))))))))),-1)),x)),Simp(Times(x,Plus(Cos(Times(a,Power(Times(C2,b),-1))),Times(CN1,c,Sin(Times(a,Power(Times(C2,b),-1))))),SinIntegral(Times(c,Power(Times(C2,b),-1),Plus(a,Times(b,ArcSin(Plus(c,Times(d,Sqr(x)))))))),Power(Times(C4,Sqr(b),Plus(Cos(Times(C1D2,ArcSin(Plus(c,Times(d,Sqr(x)))))),Times(CN1,c,Sin(Times(C1D2,ArcSin(Plus(c,Times(d,Sqr(x))))))))),-1)),x)),And(FreeQ(List(a,b,c,d),x),EqQ(Sqr(c),C1)))),
IIntegrate(4826,Int(Power(Plus(a_DEFAULT,Times(ArcCos(Plus(C1,Times(d_DEFAULT,Sqr(x_)))),b_DEFAULT)),-2),x_Symbol),
    Condition(Plus(Simp(Times(Sqrt(Plus(Times(CN2,d,Sqr(x)),Times(CN1,Sqr(d),Power(x,4)))),Power(Times(C2,b,d,x,Plus(a,Times(b,ArcCos(Plus(C1,Times(d,Sqr(x))))))),-1)),x),Simp(Times(x,Sin(Times(a,Power(Times(C2,b),-1))),CosIntegral(Times(Plus(a,Times(b,ArcCos(Plus(C1,Times(d,Sqr(x)))))),Power(Times(C2,b),-1))),Power(Times(C2,CSqrt2,Sqr(b),Sqrt(Times(CN1,d,Sqr(x)))),-1)),x),Negate(Simp(Times(x,Cos(Times(a,Power(Times(C2,b),-1))),SinIntegral(Times(Plus(a,Times(b,ArcCos(Plus(C1,Times(d,Sqr(x)))))),Power(Times(C2,b),-1))),Power(Times(C2,CSqrt2,Sqr(b),Sqrt(Times(CN1,d,Sqr(x)))),-1)),x))),FreeQ(List(a,b,d),x))),
IIntegrate(4827,Int(Power(Plus(a_DEFAULT,Times(ArcCos(Plus(CN1,Times(d_DEFAULT,Sqr(x_)))),b_DEFAULT)),-2),x_Symbol),
    Condition(Plus(Simp(Times(Sqrt(Plus(Times(C2,d,Sqr(x)),Times(CN1,Sqr(d),Power(x,4)))),Power(Times(C2,b,d,x,Plus(a,Times(b,ArcCos(Plus(CN1,Times(d,Sqr(x))))))),-1)),x),Negate(Simp(Times(x,Cos(Times(a,Power(Times(C2,b),-1))),CosIntegral(Times(Plus(a,Times(b,ArcCos(Plus(CN1,Times(d,Sqr(x)))))),Power(Times(C2,b),-1))),Power(Times(C2,CSqrt2,Sqr(b),Sqrt(Times(d,Sqr(x)))),-1)),x)),Negate(Simp(Times(x,Sin(Times(a,Power(Times(C2,b),-1))),SinIntegral(Times(Plus(a,Times(b,ArcCos(Plus(CN1,Times(d,Sqr(x)))))),Power(Times(C2,b),-1))),Power(Times(C2,CSqrt2,Sqr(b),Sqrt(Times(d,Sqr(x)))),-1)),x))),FreeQ(List(a,b,d),x))),
IIntegrate(4828,Int(Power(Plus(a_DEFAULT,Times(ArcSin(Plus(c_,Times(d_DEFAULT,Sqr(x_)))),b_DEFAULT)),n_),x_Symbol),
    Condition(Plus(Simp(Times(x,Power(Plus(a,Times(b,ArcSin(Plus(c,Times(d,Sqr(x)))))),Plus(n,C2)),Power(Times(C4,Sqr(b),Plus(n,C1),Plus(n,C2)),-1)),x),Negate(Dist(Power(Times(C4,Sqr(b),Plus(n,C1),Plus(n,C2)),-1),Int(Power(Plus(a,Times(b,ArcSin(Plus(c,Times(d,Sqr(x)))))),Plus(n,C2)),x),x)),Simp(Times(Sqrt(Plus(Times(CN2,c,d,Sqr(x)),Times(CN1,Sqr(d),Power(x,4)))),Power(Plus(a,Times(b,ArcSin(Plus(c,Times(d,Sqr(x)))))),Plus(n,C1)),Power(Times(C2,b,d,Plus(n,C1),x),-1)),x)),And(FreeQ(List(a,b,c,d),x),EqQ(Sqr(c),C1),LtQ(n,CN1),NeQ(n,CN2)))),
IIntegrate(4829,Int(Power(Plus(a_DEFAULT,Times(ArcCos(Plus(c_,Times(d_DEFAULT,Sqr(x_)))),b_DEFAULT)),n_),x_Symbol),
    Condition(Plus(Simp(Times(x,Power(Plus(a,Times(b,ArcCos(Plus(c,Times(d,Sqr(x)))))),Plus(n,C2)),Power(Times(C4,Sqr(b),Plus(n,C1),Plus(n,C2)),-1)),x),Negate(Dist(Power(Times(C4,Sqr(b),Plus(n,C1),Plus(n,C2)),-1),Int(Power(Plus(a,Times(b,ArcCos(Plus(c,Times(d,Sqr(x)))))),Plus(n,C2)),x),x)),Negate(Simp(Times(Sqrt(Plus(Times(CN2,c,d,Sqr(x)),Times(CN1,Sqr(d),Power(x,4)))),Power(Plus(a,Times(b,ArcCos(Plus(c,Times(d,Sqr(x)))))),Plus(n,C1)),Power(Times(C2,b,d,Plus(n,C1),x),-1)),x))),And(FreeQ(List(a,b,c,d),x),EqQ(Sqr(c),C1),LtQ(n,CN1),NeQ(n,CN2)))),
IIntegrate(4830,Int(Times(Power(ArcSin(Times(a_DEFAULT,Power(x_,p_))),n_DEFAULT),Power(x_,-1)),x_Symbol),
    Condition(Dist(Power(p,-1),Subst(Int(Times(Power(x,n),Cot(x)),x),x,ArcSin(Times(a,Power(x,p)))),x),And(FreeQ(List(a,p),x),IGtQ(n,C0)))),
IIntegrate(4831,Int(Times(Power(ArcCos(Times(a_DEFAULT,Power(x_,p_))),n_DEFAULT),Power(x_,-1)),x_Symbol),
    Condition(Negate(Dist(Power(p,-1),Subst(Int(Times(Power(x,n),Tan(x)),x),x,ArcCos(Times(a,Power(x,p)))),x)),And(FreeQ(List(a,p),x),IGtQ(n,C0)))),
IIntegrate(4832,Int(Times(Power(ArcSin(Times(c_DEFAULT,Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_DEFAULT))),-1))),m_DEFAULT),u_DEFAULT),x_Symbol),
    Condition(Int(Times(u,Power(ArcCsc(Plus(Times(a,Power(c,-1)),Times(b,Power(x,n),Power(c,-1)))),m)),x),FreeQ(List(a,b,c,n,m),x))),
IIntegrate(4833,Int(Times(Power(ArcCos(Times(c_DEFAULT,Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_DEFAULT))),-1))),m_DEFAULT),u_DEFAULT),x_Symbol),
    Condition(Int(Times(u,Power(ArcSec(Plus(Times(a,Power(c,-1)),Times(b,Power(x,n),Power(c,-1)))),m)),x),FreeQ(List(a,b,c,n,m),x))),
IIntegrate(4834,Int(Times(Power(ArcSin(Sqrt(Plus(C1,Times(b_DEFAULT,Sqr(x_))))),n_DEFAULT),Power(Plus(C1,Times(b_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Dist(Times(Sqrt(Times(CN1,b,Sqr(x))),Power(Times(b,x),-1)),Subst(Int(Times(Power(ArcSin(x),n),Power(Plus(C1,Negate(Sqr(x))),CN1D2)),x),x,Sqrt(Plus(C1,Times(b,Sqr(x))))),x),FreeQ(List(b,n),x))),
IIntegrate(4835,Int(Times(Power(ArcCos(Sqrt(Plus(C1,Times(b_DEFAULT,Sqr(x_))))),n_DEFAULT),Power(Plus(C1,Times(b_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Dist(Times(Sqrt(Times(CN1,b,Sqr(x))),Power(Times(b,x),-1)),Subst(Int(Times(Power(ArcCos(x),n),Power(Plus(C1,Negate(Sqr(x))),CN1D2)),x),x,Sqrt(Plus(C1,Times(b,Sqr(x))))),x),FreeQ(List(b,n),x))),
IIntegrate(4836,Int(Times(u_DEFAULT,Power(f_,Times(Power(ArcSin(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_DEFAULT),c_DEFAULT))),x_Symbol),
    Condition(Dist(Power(b,-1),Subst(Int(Times(ReplaceAll(u,Rule(x,Plus(Times(CN1,a,Power(b,-1)),Times(Sin(x),Power(b,-1))))),Power(f,Times(c,Power(x,n))),Cos(x)),x),x,ArcSin(Plus(a,Times(b,x)))),x),And(FreeQ(List(a,b,c,f),x),IGtQ(n,C0)))),
IIntegrate(4837,Int(Times(u_DEFAULT,Power(f_,Times(Power(ArcCos(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_DEFAULT),c_DEFAULT))),x_Symbol),
    Condition(Negate(Dist(Power(b,-1),Subst(Int(Times(ReplaceAll(u,Rule(x,Plus(Times(CN1,a,Power(b,-1)),Times(Cos(x),Power(b,-1))))),Power(f,Times(c,Power(x,n))),Sin(x)),x),x,ArcCos(Plus(a,Times(b,x)))),x)),And(FreeQ(List(a,b,c,f),x),IGtQ(n,C0)))),
IIntegrate(4838,Int(ArcSin(Plus(Times(a_DEFAULT,Sqr(x_)),Times(b_DEFAULT,Sqrt(Plus(c_,Times(d_DEFAULT,Sqr(x_))))))),x_Symbol),
    Condition(Plus(Simp(Times(x,ArcSin(Plus(Times(a,Sqr(x)),Times(b,Sqrt(Plus(c,Times(d,Sqr(x)))))))),x),Negate(Dist(Times(x,Sqrt(Plus(Times(Sqr(b),d),Times(Sqr(a),Sqr(x)),Times(C2,a,b,Sqrt(Plus(c,Times(d,Sqr(x))))))),Power(Times(CN1,Sqr(x),Plus(Times(Sqr(b),d),Times(Sqr(a),Sqr(x)),Times(C2,a,b,Sqrt(Plus(c,Times(d,Sqr(x))))))),CN1D2)),Int(Times(x,Plus(Times(b,d),Times(C2,a,Sqrt(Plus(c,Times(d,Sqr(x)))))),Power(Times(Sqrt(Plus(c,Times(d,Sqr(x)))),Sqrt(Plus(Times(Sqr(b),d),Times(Sqr(a),Sqr(x)),Times(C2,a,b,Sqrt(Plus(c,Times(d,Sqr(x)))))))),-1)),x),x))),And(FreeQ(List(a,b,c,d),x),EqQ(Times(Sqr(b),c),C1)))),
IIntegrate(4839,Int(ArcCos(Plus(Times(a_DEFAULT,Sqr(x_)),Times(b_DEFAULT,Sqrt(Plus(c_,Times(d_DEFAULT,Sqr(x_))))))),x_Symbol),
    Condition(Plus(Simp(Times(x,ArcCos(Plus(Times(a,Sqr(x)),Times(b,Sqrt(Plus(c,Times(d,Sqr(x)))))))),x),Dist(Times(x,Sqrt(Plus(Times(Sqr(b),d),Times(Sqr(a),Sqr(x)),Times(C2,a,b,Sqrt(Plus(c,Times(d,Sqr(x))))))),Power(Times(CN1,Sqr(x),Plus(Times(Sqr(b),d),Times(Sqr(a),Sqr(x)),Times(C2,a,b,Sqrt(Plus(c,Times(d,Sqr(x))))))),CN1D2)),Int(Times(x,Plus(Times(b,d),Times(C2,a,Sqrt(Plus(c,Times(d,Sqr(x)))))),Power(Times(Sqrt(Plus(c,Times(d,Sqr(x)))),Sqrt(Plus(Times(Sqr(b),d),Times(Sqr(a),Sqr(x)),Times(C2,a,b,Sqrt(Plus(c,Times(d,Sqr(x)))))))),-1)),x),x)),And(FreeQ(List(a,b,c,d),x),EqQ(Times(Sqr(b),c),C1)))),
IIntegrate(4840,Int(ArcSin(u_),x_Symbol),
    Condition(Plus(Simp(Times(x,ArcSin(u)),x),Negate(Int(SimplifyIntegrand(Times(x,D(u,x),Power(Plus(C1,Negate(Sqr(u))),CN1D2)),x),x))),And(InverseFunctionFreeQ(u,x),Not(FunctionOfExponentialQ(u,x))))),
IIntegrate(4841,Int(ArcCos(u_),x_Symbol),
    Condition(Plus(Simp(Times(x,ArcCos(u)),x),Int(SimplifyIntegrand(Times(x,D(u,x),Power(Plus(C1,Negate(Sqr(u))),CN1D2)),x),x)),And(InverseFunctionFreeQ(u,x),Not(FunctionOfExponentialQ(u,x))))),
IIntegrate(4842,Int(Times(Plus(a_DEFAULT,Times(ArcSin(u_),b_DEFAULT)),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(c,Times(d,x)),Plus(m,C1)),Plus(a,Times(b,ArcSin(u))),Power(Times(d,Plus(m,C1)),-1)),x),Negate(Dist(Times(b,Power(Times(d,Plus(m,C1)),-1)),Int(SimplifyIntegrand(Times(Power(Plus(c,Times(d,x)),Plus(m,C1)),D(u,x),Power(Plus(C1,Negate(Sqr(u))),CN1D2)),x),x),x))),And(FreeQ(List(a,b,c,d,m),x),NeQ(m,CN1),InverseFunctionFreeQ(u,x),Not(FunctionOfQ(Power(Plus(c,Times(d,x)),Plus(m,C1)),u,x)),Not(FunctionOfExponentialQ(u,x))))),
IIntegrate(4843,Int(Times(Plus(a_DEFAULT,Times(ArcCos(u_),b_DEFAULT)),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(c,Times(d,x)),Plus(m,C1)),Plus(a,Times(b,ArcCos(u))),Power(Times(d,Plus(m,C1)),-1)),x),Dist(Times(b,Power(Times(d,Plus(m,C1)),-1)),Int(SimplifyIntegrand(Times(Power(Plus(c,Times(d,x)),Plus(m,C1)),D(u,x),Power(Plus(C1,Negate(Sqr(u))),CN1D2)),x),x),x)),And(FreeQ(List(a,b,c,d,m),x),NeQ(m,CN1),InverseFunctionFreeQ(u,x),Not(FunctionOfQ(Power(Plus(c,Times(d,x)),Plus(m,C1)),u,x)),Not(FunctionOfExponentialQ(u,x))))),
IIntegrate(4844,Int(Times(Plus(a_DEFAULT,Times(ArcSin(u_),b_DEFAULT)),v_),x_Symbol),
    Condition(With(List(Set(w,IntHide(v,x))),Condition(Plus(Dist(Plus(a,Times(b,ArcSin(u))),w,x),Negate(Dist(b,Int(SimplifyIntegrand(Times(w,D(u,x),Power(Plus(C1,Negate(Sqr(u))),CN1D2)),x),x),x))),InverseFunctionFreeQ(w,x))),And(FreeQ(List(a,b),x),InverseFunctionFreeQ(u,x),Not(MatchQ(v,Condition(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x)),m_DEFAULT),FreeQ(List(c,d,m),x))))))),
IIntegrate(4845,Int(Times(Plus(a_DEFAULT,Times(ArcCos(u_),b_DEFAULT)),v_),x_Symbol),
    Condition(With(List(Set(w,IntHide(v,x))),Condition(Plus(Dist(Plus(a,Times(b,ArcCos(u))),w,x),Dist(b,Int(SimplifyIntegrand(Times(w,D(u,x),Power(Plus(C1,Negate(Sqr(u))),CN1D2)),x),x),x)),InverseFunctionFreeQ(w,x))),And(FreeQ(List(a,b),x),InverseFunctionFreeQ(u,x),Not(MatchQ(v,Condition(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x)),m_DEFAULT),FreeQ(List(c,d,m),x))))))),
IIntegrate(4846,Int(Power(Plus(a_DEFAULT,Times(ArcTan(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),x_Symbol),
    Condition(Plus(Simp(Times(x,Power(Plus(a,Times(b,ArcTan(Times(c,x)))),p)),x),Negate(Dist(Times(b,c,p),Int(Times(x,Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(p,Negate(C1))),Power(Plus(C1,Times(Sqr(c),Sqr(x))),-1)),x),x))),And(FreeQ(List(a,b,c),x),IGtQ(p,C0)))),
IIntegrate(4847,Int(Power(Plus(a_DEFAULT,Times(ArcCot(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),x_Symbol),
    Condition(Plus(Simp(Times(x,Power(Plus(a,Times(b,ArcCot(Times(c,x)))),p)),x),Dist(Times(b,c,p),Int(Times(x,Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(p,Negate(C1))),Power(Plus(C1,Times(Sqr(c),Sqr(x))),-1)),x),x)),And(FreeQ(List(a,b,c),x),IGtQ(p,C0)))),
IIntegrate(4848,Int(Times(Plus(a_DEFAULT,Times(ArcTan(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(x_,-1)),x_Symbol),
    Condition(Plus(Simp(Times(a,Log(x)),x),Dist(Times(C1D2,CI,b),Int(Times(Log(Plus(C1,Times(CN1,CI,c,x))),Power(x,-1)),x),x),Negate(Dist(Times(C1D2,CI,b),Int(Times(Log(Plus(C1,Times(CI,c,x))),Power(x,-1)),x),x))),FreeQ(List(a,b,c),x))),
IIntegrate(4849,Int(Times(Plus(a_DEFAULT,Times(ArcCot(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(x_,-1)),x_Symbol),
    Condition(Plus(Simp(Times(a,Log(x)),x),Dist(Times(C1D2,CI,b),Int(Times(Log(Plus(C1,Times(CN1,CI,Power(Times(c,x),-1)))),Power(x,-1)),x),x),Negate(Dist(Times(C1D2,CI,b),Int(Times(Log(Plus(C1,Times(CI,Power(Times(c,x),-1)))),Power(x,-1)),x),x))),FreeQ(List(a,b,c),x))),
IIntegrate(4850,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTan(Times(c_DEFAULT,x_)),b_DEFAULT)),p_),Power(x_,-1)),x_Symbol),
    Condition(Plus(Simp(Times(C2,Power(Plus(a,Times(b,ArcTan(Times(c,x)))),p),ArcTanh(Plus(C1,Times(CN1,C2,Power(Plus(C1,Times(CI,c,x)),-1))))),x),Negate(Dist(Times(C2,b,c,p),Int(Times(Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(p,Negate(C1))),ArcTanh(Plus(C1,Times(CN1,C2,Power(Plus(C1,Times(CI,c,x)),-1)))),Power(Plus(C1,Times(Sqr(c),Sqr(x))),-1)),x),x))),And(FreeQ(List(a,b,c),x),IGtQ(p,C1))))
  );
}
