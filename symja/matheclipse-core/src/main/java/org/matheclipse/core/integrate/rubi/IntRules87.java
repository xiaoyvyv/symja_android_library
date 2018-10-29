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
import static org.matheclipse.core.expression.F.CN1;
import static org.matheclipse.core.expression.F.Coefficient;
import static org.matheclipse.core.expression.F.Condition;
import static org.matheclipse.core.expression.F.Cos;
import static org.matheclipse.core.expression.F.Cosh;
import static org.matheclipse.core.expression.F.Cot;
import static org.matheclipse.core.expression.F.Coth;
import static org.matheclipse.core.expression.F.Csc;
import static org.matheclipse.core.expression.F.Csch;
import static org.matheclipse.core.expression.F.Exp;
import static org.matheclipse.core.expression.F.FSymbol;
import static org.matheclipse.core.expression.F.F_;
import static org.matheclipse.core.expression.F.FreeQ;
import static org.matheclipse.core.expression.F.GSymbol;
import static org.matheclipse.core.expression.F.G_;
import static org.matheclipse.core.expression.F.IIntegrate;
import static org.matheclipse.core.expression.F.IntegerQ;
import static org.matheclipse.core.expression.F.List;
import static org.matheclipse.core.expression.F.Log;
import static org.matheclipse.core.expression.F.MatchQ;
import static org.matheclipse.core.expression.F.Negate;
import static org.matheclipse.core.expression.F.Not;
import static org.matheclipse.core.expression.F.Or;
import static org.matheclipse.core.expression.F.Plus;
import static org.matheclipse.core.expression.F.Power;
import static org.matheclipse.core.expression.F.Sec;
import static org.matheclipse.core.expression.F.Sech;
import static org.matheclipse.core.expression.F.Set;
import static org.matheclipse.core.expression.F.Sin;
import static org.matheclipse.core.expression.F.Sinh;
import static org.matheclipse.core.expression.F.Sqr;
import static org.matheclipse.core.expression.F.Tan;
import static org.matheclipse.core.expression.F.Tanh;
import static org.matheclipse.core.expression.F.Times;
import static org.matheclipse.core.expression.F.True;
import static org.matheclipse.core.expression.F.With;
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
import static org.matheclipse.core.expression.F.q_DEFAULT;
import static org.matheclipse.core.expression.F.r;
import static org.matheclipse.core.expression.F.r_DEFAULT;
import static org.matheclipse.core.expression.F.u;
import static org.matheclipse.core.expression.F.u_;
import static org.matheclipse.core.expression.F.u_DEFAULT;
import static org.matheclipse.core.expression.F.v;
import static org.matheclipse.core.expression.F.v_;
import static org.matheclipse.core.expression.F.v_DEFAULT;
import static org.matheclipse.core.expression.F.w;
import static org.matheclipse.core.expression.F.w_;
import static org.matheclipse.core.expression.F.x;
import static org.matheclipse.core.expression.F.x_;
import static org.matheclipse.core.expression.F.x_Symbol;
import static org.matheclipse.core.expression.F.y;
import static org.matheclipse.core.expression.F.y_;
import static org.matheclipse.core.expression.F.z;
import static org.matheclipse.core.expression.F.z_;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.ActivateTrig;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.DerivativeDivides;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Dist;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.EqQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.ExpandTrigReduce;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.F;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.FalseQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.FracPart;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.FreeFactors;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.FunctionOfQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.FunctionOfTrig;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.G;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.H;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.IGtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.InertTrigFreeQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.InertTrigQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Int;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.IntPart;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.IntegersQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.InverseFunctionFreeQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.LinearQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.NeQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.NegQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.NonfreeFactors;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.NonsumQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.PosQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.RemoveContent;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Simp;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Subst;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.SubstFor;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.SumQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.TrigSimplify;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.TrigSimplifyQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.TryPureTanSubst;

/** 
 * IndefiniteIntegrationRules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class IntRules87 { 
  public static IAST RULES = List( 
IIntegrate(4351,Int(Times(u_,Power(Tanh(Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(With(List(Set(d,FreeFactors(Coth(Times(c,Plus(a,Times(b,x)))),x))),Condition(Dist(Power(Times(b,c,Power(d,Plus(n,Negate(C1)))),-1),Subst(Int(SubstFor(Power(Times(Power(x,n),Plus(C1,Times(CN1,Sqr(d),Sqr(x)))),-1),Times(Coth(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x),x),x,Times(Coth(Times(c,Plus(a,Times(b,x)))),Power(d,-1))),x),And(FunctionOfQ(Times(Coth(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x,True),TryPureTanSubst(Times(ActivateTrig(u),Power(Tanh(Times(c,Plus(a,Times(b,x)))),n)),x)))),And(FreeQ(List(a,b,c),x),IntegerQ(n)))),
IIntegrate(4352,Int(u_,x_Symbol),
    With(List(Set(v,FunctionOfTrig(u,x))),Condition(Simp(With(List(Set(d,FreeFactors(Cot(v),x))),Dist(Times(CN1,d,Power(Coefficient(v,x,C1),-1)),Subst(Int(SubstFor(Power(Plus(C1,Times(Sqr(d),Sqr(x))),-1),Times(Cot(v),Power(d,-1)),u,x),x),x,Times(Cot(v),Power(d,-1))),x)),x),And(Not(FalseQ(v)),FunctionOfQ(NonfreeFactors(Cot(v),x),u,x,True),TryPureTanSubst(ActivateTrig(u),x))))),
IIntegrate(4353,Int(u_,x_Symbol),
    With(List(Set(v,FunctionOfTrig(u,x))),Condition(Simp(With(List(Set(d,FreeFactors(Tan(v),x))),Dist(Times(d,Power(Coefficient(v,x,C1),-1)),Subst(Int(SubstFor(Power(Plus(C1,Times(Sqr(d),Sqr(x))),-1),Times(Tan(v),Power(d,-1)),u,x),x),x,Times(Tan(v),Power(d,-1))),x)),x),And(Not(FalseQ(v)),FunctionOfQ(NonfreeFactors(Tan(v),x),u,x,True),TryPureTanSubst(ActivateTrig(u),x))))),
IIntegrate(4354,Int(Times(Power($(F_,Plus(a_DEFAULT,Times(b_DEFAULT,x_))),p_DEFAULT),Power($(G_,Plus(c_DEFAULT,Times(d_DEFAULT,x_))),q_DEFAULT)),x_Symbol),
    Condition(Int(ExpandTrigReduce(ActivateTrig(Times(Power(F(Plus(a,Times(b,x))),p),Power(G(Plus(c,Times(d,x))),q))),x),x),And(FreeQ(List(a,b,c,d),x),Or(EqQ(FSymbol,$s("§sin")),EqQ(FSymbol,$s("§cos"))),Or(EqQ(GSymbol,$s("§sin")),EqQ(GSymbol,$s("§cos"))),IGtQ(p,C0),IGtQ(q,C0)))),
IIntegrate(4355,Int(Times(Power($(F_,Plus(a_DEFAULT,Times(b_DEFAULT,x_))),p_DEFAULT),Power($(G_,Plus(c_DEFAULT,Times(d_DEFAULT,x_))),q_DEFAULT),Power($($p("H"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),r_DEFAULT)),x_Symbol),
    Condition(Int(ExpandTrigReduce(ActivateTrig(Times(Power(F(Plus(a,Times(b,x))),p),Power(G(Plus(c,Times(d,x))),q),Power(H(Plus(e,Times(f,x))),r))),x),x),And(FreeQ(List(a,b,c,d,e,f),x),Or(EqQ(FSymbol,$s("§sin")),EqQ(FSymbol,$s("§cos"))),Or(EqQ(GSymbol,$s("§sin")),EqQ(GSymbol,$s("§cos"))),Or(EqQ($s("H"),$s("§sin")),EqQ($s("H"),$s("§cos"))),IGtQ(p,C0),IGtQ(q,C0),IGtQ(r,C0)))),
IIntegrate(4356,Int(Times(u_,$(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_))))),x_Symbol),
    Condition(With(List(Set(d,FreeFactors(Sin(Times(c,Plus(a,Times(b,x)))),x))),Condition(Dist(Times(d,Power(Times(b,c),-1)),Subst(Int(SubstFor(C1,Times(Sin(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x),x),x,Times(Sin(Times(c,Plus(a,Times(b,x)))),Power(d,-1))),x),FunctionOfQ(Times(Sin(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x))),And(FreeQ(List(a,b,c),x),Or(EqQ(FSymbol,$s("Cos")),EqQ(FSymbol,$s("§cos")))))),
IIntegrate(4357,Int(Times(u_,$(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_))))),x_Symbol),
    Condition(With(List(Set(d,FreeFactors(Cos(Times(c,Plus(a,Times(b,x)))),x))),Condition(Negate(Dist(Times(d,Power(Times(b,c),-1)),Subst(Int(SubstFor(C1,Times(Cos(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x),x),x,Times(Cos(Times(c,Plus(a,Times(b,x)))),Power(d,-1))),x)),FunctionOfQ(Times(Cos(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x))),And(FreeQ(List(a,b,c),x),Or(EqQ(FSymbol,$s("Sin")),EqQ(FSymbol,$s("§sin")))))),
IIntegrate(4358,Int(Times(Cosh(Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),u_),x_Symbol),
    Condition(With(List(Set(d,FreeFactors(Sinh(Times(c,Plus(a,Times(b,x)))),x))),Condition(Dist(Times(d,Power(Times(b,c),-1)),Subst(Int(SubstFor(C1,Times(Sinh(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x),x),x,Times(Sinh(Times(c,Plus(a,Times(b,x)))),Power(d,-1))),x),FunctionOfQ(Times(Sinh(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x))),FreeQ(List(a,b,c),x))),
IIntegrate(4359,Int(Times(u_,Sinh(Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_))))),x_Symbol),
    Condition(With(List(Set(d,FreeFactors(Cosh(Times(c,Plus(a,Times(b,x)))),x))),Condition(Dist(Times(d,Power(Times(b,c),-1)),Subst(Int(SubstFor(C1,Times(Cosh(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x),x),x,Times(Cosh(Times(c,Plus(a,Times(b,x)))),Power(d,-1))),x),FunctionOfQ(Times(Cosh(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x))),FreeQ(List(a,b,c),x))),
IIntegrate(4360,Int(Times(u_,$(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_))))),x_Symbol),
    Condition(With(List(Set(d,FreeFactors(Sin(Times(c,Plus(a,Times(b,x)))),x))),Condition(Dist(Power(Times(b,c),-1),Subst(Int(SubstFor(Power(x,-1),Times(Sin(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x),x),x,Times(Sin(Times(c,Plus(a,Times(b,x)))),Power(d,-1))),x),FunctionOfQ(Times(Sin(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x))),And(FreeQ(List(a,b,c),x),Or(EqQ(FSymbol,$s("Cot")),EqQ(FSymbol,$s("§cot")))))),
IIntegrate(4361,Int(Times(u_,$(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_))))),x_Symbol),
    Condition(With(List(Set(d,FreeFactors(Cos(Times(c,Plus(a,Times(b,x)))),x))),Condition(Negate(Dist(Power(Times(b,c),-1),Subst(Int(SubstFor(Power(x,-1),Times(Cos(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x),x),x,Times(Cos(Times(c,Plus(a,Times(b,x)))),Power(d,-1))),x)),FunctionOfQ(Times(Cos(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x))),And(FreeQ(List(a,b,c),x),Or(EqQ(FSymbol,$s("Tan")),EqQ(FSymbol,$s("§tan")))))),
IIntegrate(4362,Int(Times(Coth(Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),u_),x_Symbol),
    Condition(With(List(Set(d,FreeFactors(Sinh(Times(c,Plus(a,Times(b,x)))),x))),Condition(Dist(Power(Times(b,c),-1),Subst(Int(SubstFor(Power(x,-1),Times(Sinh(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x),x),x,Times(Sinh(Times(c,Plus(a,Times(b,x)))),Power(d,-1))),x),FunctionOfQ(Times(Sinh(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x))),FreeQ(List(a,b,c),x))),
IIntegrate(4363,Int(Times(u_,Tanh(Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_))))),x_Symbol),
    Condition(With(List(Set(d,FreeFactors(Cosh(Times(c,Plus(a,Times(b,x)))),x))),Condition(Dist(Power(Times(b,c),-1),Subst(Int(SubstFor(Power(x,-1),Times(Cosh(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x),x),x,Times(Cosh(Times(c,Plus(a,Times(b,x)))),Power(d,-1))),x),FunctionOfQ(Times(Cosh(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x))),FreeQ(List(a,b,c),x))),
IIntegrate(4364,Int(Times(u_,Power($(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(With(List(Set(d,FreeFactors(Sin(Times(c,Plus(a,Times(b,x)))),x))),Condition(Dist(Times(d,Power(Times(b,c),-1)),Subst(Int(SubstFor(Power(Plus(C1,Times(CN1,Sqr(d),Sqr(x))),Times(C1D2,Plus(n,Negate(C1)))),Times(Sin(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x),x),x,Times(Sin(Times(c,Plus(a,Times(b,x)))),Power(d,-1))),x),FunctionOfQ(Times(Sin(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x))),And(FreeQ(List(a,b,c),x),IntegerQ(Times(C1D2,Plus(n,Negate(C1)))),NonsumQ(u),Or(EqQ(FSymbol,$s("Cos")),EqQ(FSymbol,$s("§cos")))))),
IIntegrate(4365,Int(Times(u_,Power($(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(With(List(Set(d,FreeFactors(Sin(Times(c,Plus(a,Times(b,x)))),x))),Condition(Dist(Times(d,Power(Times(b,c),-1)),Subst(Int(SubstFor(Power(Plus(C1,Times(CN1,Sqr(d),Sqr(x))),Times(C1D2,Plus(Negate(n),Negate(C1)))),Times(Sin(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x),x),x,Times(Sin(Times(c,Plus(a,Times(b,x)))),Power(d,-1))),x),FunctionOfQ(Times(Sin(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x))),And(FreeQ(List(a,b,c),x),IntegerQ(Times(C1D2,Plus(n,Negate(C1)))),NonsumQ(u),Or(EqQ(FSymbol,$s("Sec")),EqQ(FSymbol,$s("§sec")))))),
IIntegrate(4366,Int(Times(u_,Power($(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(With(List(Set(d,FreeFactors(Cos(Times(c,Plus(a,Times(b,x)))),x))),Condition(Negate(Dist(Times(d,Power(Times(b,c),-1)),Subst(Int(SubstFor(Power(Plus(C1,Times(CN1,Sqr(d),Sqr(x))),Times(C1D2,Plus(n,Negate(C1)))),Times(Cos(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x),x),x,Times(Cos(Times(c,Plus(a,Times(b,x)))),Power(d,-1))),x)),FunctionOfQ(Times(Cos(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x))),And(FreeQ(List(a,b,c),x),IntegerQ(Times(C1D2,Plus(n,Negate(C1)))),NonsumQ(u),Or(EqQ(FSymbol,$s("Sin")),EqQ(FSymbol,$s("§sin")))))),
IIntegrate(4367,Int(Times(u_,Power($(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(With(List(Set(d,FreeFactors(Cos(Times(c,Plus(a,Times(b,x)))),x))),Condition(Negate(Dist(Times(d,Power(Times(b,c),-1)),Subst(Int(SubstFor(Power(Plus(C1,Times(CN1,Sqr(d),Sqr(x))),Times(C1D2,Plus(Negate(n),Negate(C1)))),Times(Cos(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x),x),x,Times(Cos(Times(c,Plus(a,Times(b,x)))),Power(d,-1))),x)),FunctionOfQ(Times(Cos(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x))),And(FreeQ(List(a,b,c),x),IntegerQ(Times(C1D2,Plus(n,Negate(C1)))),NonsumQ(u),Or(EqQ(FSymbol,$s("Csc")),EqQ(FSymbol,$s("§csc")))))),
IIntegrate(4368,Int(Times(Power(Cosh(Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_),u_),x_Symbol),
    Condition(With(List(Set(d,FreeFactors(Sinh(Times(c,Plus(a,Times(b,x)))),x))),Condition(Dist(Times(d,Power(Times(b,c),-1)),Subst(Int(SubstFor(Power(Plus(C1,Times(Sqr(d),Sqr(x))),Times(C1D2,Plus(n,Negate(C1)))),Times(Sinh(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x),x),x,Times(Sinh(Times(c,Plus(a,Times(b,x)))),Power(d,-1))),x),FunctionOfQ(Times(Sinh(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x))),And(FreeQ(List(a,b,c),x),IntegerQ(Times(C1D2,Plus(n,Negate(C1)))),NonsumQ(u)))),
IIntegrate(4369,Int(Times(u_,Power(Sech(Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(With(List(Set(d,FreeFactors(Sinh(Times(c,Plus(a,Times(b,x)))),x))),Condition(Dist(Times(d,Power(Times(b,c),-1)),Subst(Int(SubstFor(Power(Plus(C1,Times(Sqr(d),Sqr(x))),Times(C1D2,Plus(Negate(n),Negate(C1)))),Times(Sinh(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x),x),x,Times(Sinh(Times(c,Plus(a,Times(b,x)))),Power(d,-1))),x),FunctionOfQ(Times(Sinh(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x))),And(FreeQ(List(a,b,c),x),IntegerQ(Times(C1D2,Plus(n,Negate(C1)))),NonsumQ(u)))),
IIntegrate(4370,Int(Times(u_,Power(Sinh(Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(With(List(Set(d,FreeFactors(Cosh(Times(c,Plus(a,Times(b,x)))),x))),Condition(Dist(Times(d,Power(Times(b,c),-1)),Subst(Int(SubstFor(Power(Plus(CN1,Times(Sqr(d),Sqr(x))),Times(C1D2,Plus(n,Negate(C1)))),Times(Cosh(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x),x),x,Times(Cosh(Times(c,Plus(a,Times(b,x)))),Power(d,-1))),x),FunctionOfQ(Times(Cosh(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x))),And(FreeQ(List(a,b,c),x),IntegerQ(Times(C1D2,Plus(n,Negate(C1)))),NonsumQ(u)))),
IIntegrate(4371,Int(Times(Power(Csch(Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_),u_),x_Symbol),
    Condition(With(List(Set(d,FreeFactors(Cosh(Times(c,Plus(a,Times(b,x)))),x))),Condition(Dist(Times(d,Power(Times(b,c),-1)),Subst(Int(SubstFor(Power(Plus(CN1,Times(Sqr(d),Sqr(x))),Times(C1D2,Plus(Negate(n),Negate(C1)))),Times(Cosh(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x),x),x,Times(Cosh(Times(c,Plus(a,Times(b,x)))),Power(d,-1))),x),FunctionOfQ(Times(Cosh(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x))),And(FreeQ(List(a,b,c),x),IntegerQ(Times(C1D2,Plus(n,Negate(C1)))),NonsumQ(u)))),
IIntegrate(4372,Int(Times(u_,Power($(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(With(List(Set(d,FreeFactors(Sin(Times(c,Plus(a,Times(b,x)))),x))),Condition(Dist(Power(Times(b,c,Power(d,Plus(n,Negate(C1)))),-1),Subst(Int(SubstFor(Times(Power(Plus(C1,Times(CN1,Sqr(d),Sqr(x))),Times(C1D2,Plus(n,Negate(C1)))),Power(Power(x,n),-1)),Times(Sin(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x),x),x,Times(Sin(Times(c,Plus(a,Times(b,x)))),Power(d,-1))),x),FunctionOfQ(Times(Sin(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x))),And(FreeQ(List(a,b,c),x),IntegerQ(Times(C1D2,Plus(n,Negate(C1)))),NonsumQ(u),Or(EqQ(FSymbol,$s("Cot")),EqQ(FSymbol,$s("§cot")))))),
IIntegrate(4373,Int(Times(u_,Power($(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(With(List(Set(d,FreeFactors(Cos(Times(c,Plus(a,Times(b,x)))),x))),Condition(Negate(Dist(Power(Times(b,c,Power(d,Plus(n,Negate(C1)))),-1),Subst(Int(SubstFor(Times(Power(Plus(C1,Times(CN1,Sqr(d),Sqr(x))),Times(C1D2,Plus(n,Negate(C1)))),Power(Power(x,n),-1)),Times(Cos(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x),x),x,Times(Cos(Times(c,Plus(a,Times(b,x)))),Power(d,-1))),x)),FunctionOfQ(Times(Cos(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x))),And(FreeQ(List(a,b,c),x),IntegerQ(Times(C1D2,Plus(n,Negate(C1)))),NonsumQ(u),Or(EqQ(FSymbol,$s("Tan")),EqQ(FSymbol,$s("§tan")))))),
IIntegrate(4374,Int(Times(Power(Coth(Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_),u_),x_Symbol),
    Condition(With(List(Set(d,FreeFactors(Sinh(Times(c,Plus(a,Times(b,x)))),x))),Condition(Dist(Power(Times(b,c,Power(d,Plus(n,Negate(C1)))),-1),Subst(Int(SubstFor(Times(Power(Plus(C1,Times(Sqr(d),Sqr(x))),Times(C1D2,Plus(n,Negate(C1)))),Power(Power(x,n),-1)),Times(Sinh(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x),x),x,Times(Sinh(Times(c,Plus(a,Times(b,x)))),Power(d,-1))),x),FunctionOfQ(Times(Sinh(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x))),And(FreeQ(List(a,b,c),x),IntegerQ(Times(C1D2,Plus(n,Negate(C1)))),NonsumQ(u)))),
IIntegrate(4375,Int(Times(u_,Power(Tanh(Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(With(List(Set(d,FreeFactors(Cosh(Times(c,Plus(a,Times(b,x)))),x))),Condition(Dist(Power(Times(b,c,Power(d,Plus(n,Negate(C1)))),-1),Subst(Int(SubstFor(Times(Power(Plus(CN1,Times(Sqr(d),Sqr(x))),Times(C1D2,Plus(n,Negate(C1)))),Power(Power(x,n),-1)),Times(Cosh(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x),x),x,Times(Cosh(Times(c,Plus(a,Times(b,x)))),Power(d,-1))),x),FunctionOfQ(Times(Cosh(Times(c,Plus(a,Times(b,x)))),Power(d,-1)),u,x))),And(FreeQ(List(a,b,c),x),IntegerQ(Times(C1D2,Plus(n,Negate(C1)))),NonsumQ(u)))),
IIntegrate(4376,Int(Times(u_,Plus(v_,Times(d_DEFAULT,Power($(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_DEFAULT)))),x_Symbol),
    Condition(With(List(Set(e,FreeFactors(Sin(Times(c,Plus(a,Times(b,x)))),x))),Condition(Plus(Int(ActivateTrig(Times(u,v)),x),Dist(d,Int(Times(ActivateTrig(u),Power(Cos(Times(c,Plus(a,Times(b,x)))),n)),x),x)),FunctionOfQ(Times(Sin(Times(c,Plus(a,Times(b,x)))),Power(e,-1)),u,x))),And(FreeQ(List(a,b,c,d),x),Not(FreeQ(v,x)),IntegerQ(Times(C1D2,Plus(n,Negate(C1)))),NonsumQ(u),Or(EqQ(FSymbol,$s("Cos")),EqQ(FSymbol,$s("§cos")))))),
IIntegrate(4377,Int(Times(u_,Plus(v_,Times(d_DEFAULT,Power($(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_DEFAULT)))),x_Symbol),
    Condition(With(List(Set(e,FreeFactors(Cos(Times(c,Plus(a,Times(b,x)))),x))),Condition(Plus(Int(ActivateTrig(Times(u,v)),x),Dist(d,Int(Times(ActivateTrig(u),Power(Sin(Times(c,Plus(a,Times(b,x)))),n)),x),x)),FunctionOfQ(Times(Cos(Times(c,Plus(a,Times(b,x)))),Power(e,-1)),u,x))),And(FreeQ(List(a,b,c,d),x),Not(FreeQ(v,x)),IntegerQ(Times(C1D2,Plus(n,Negate(C1)))),NonsumQ(u),Or(EqQ(FSymbol,$s("Sin")),EqQ(FSymbol,$s("§sin")))))),
IIntegrate(4378,Int(u_,x_Symbol),
    With(List(Set(v,FunctionOfTrig(u,x))),Condition(Simp(With(List(Set(d,FreeFactors(Sin(v),x))),Dist(Times(d,Power(Coefficient(v,x,C1),-1)),Subst(Int(SubstFor(C1,Times(Sin(v),Power(d,-1)),Times(u,Power(Cos(v),-1)),x),x),x,Times(Sin(v),Power(d,-1))),x)),x),And(Not(FalseQ(v)),FunctionOfQ(NonfreeFactors(Sin(v),x),Times(u,Power(Cos(v),-1)),x))))),
IIntegrate(4379,Int(u_,x_Symbol),
    With(List(Set(v,FunctionOfTrig(u,x))),Condition(Simp(With(List(Set(d,FreeFactors(Cos(v),x))),Dist(Times(CN1,d,Power(Coefficient(v,x,C1),-1)),Subst(Int(SubstFor(C1,Times(Cos(v),Power(d,-1)),Times(u,Power(Sin(v),-1)),x),x),x,Times(Cos(v),Power(d,-1))),x)),x),And(Not(FalseQ(v)),FunctionOfQ(NonfreeFactors(Cos(v),x),Times(u,Power(Sin(v),-1)),x))))),
IIntegrate(4380,Int(Times(u_DEFAULT,Power(Plus(a_DEFAULT,Times(Sqr($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))),b_DEFAULT),Times(c_DEFAULT,Sqr($($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Plus(a,c),p),Int(ActivateTrig(u),x),x),And(FreeQ(List(a,b,c,d,e,p),x),EqQ(Plus(b,Negate(c)),C0)))),
IIntegrate(4381,Int(Times(u_DEFAULT,Power(Plus(a_DEFAULT,Times(c_DEFAULT,Sqr($($s("§sec"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))))),Times(b_DEFAULT,Sqr($($s("§tan"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Plus(a,c),p),Int(ActivateTrig(u),x),x),And(FreeQ(List(a,b,c,d,e,p),x),EqQ(Plus(b,c),C0)))),
IIntegrate(4382,Int(Times(Power(Plus(a_DEFAULT,Times(Sqr($($s("§cot"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))),b_DEFAULT),Times(Sqr($($s("§csc"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))),c_DEFAULT)),p_DEFAULT),u_DEFAULT),x_Symbol),
    Condition(Dist(Power(Plus(a,c),p),Int(ActivateTrig(u),x),x),And(FreeQ(List(a,b,c,d,e,p),x),EqQ(Plus(b,c),C0)))),
IIntegrate(4383,Int(Times(u_,Power(y_,-1)),x_Symbol),
    Condition(With(List(Set(q,DerivativeDivides(ActivateTrig(y),ActivateTrig(u),x))),Condition(Simp(Times(q,Log(RemoveContent(ActivateTrig(y),x))),x),Not(FalseQ(q)))),Not(InertTrigFreeQ(u)))),
IIntegrate(4384,Int(Times(u_,Power(w_,-1),Power(y_,-1)),x_Symbol),
    Condition(With(List(Set(q,DerivativeDivides(ActivateTrig(Times(y,w)),ActivateTrig(u),x))),Condition(Simp(Times(q,Log(RemoveContent(ActivateTrig(Times(y,w)),x))),x),Not(FalseQ(q)))),Not(InertTrigFreeQ(u)))),
IIntegrate(4385,Int(Times(u_,Power(y_,m_DEFAULT)),x_Symbol),
    Condition(With(List(Set(q,DerivativeDivides(ActivateTrig(y),ActivateTrig(u),x))),Condition(Simp(Times(q,ActivateTrig(Power(y,Plus(m,C1))),Power(Plus(m,C1),-1)),x),Not(FalseQ(q)))),And(FreeQ(m,x),NeQ(m,CN1),Not(InertTrigFreeQ(u))))),
IIntegrate(4386,Int(Times(u_,Power(y_,m_DEFAULT),Power(z_,n_DEFAULT)),x_Symbol),
    Condition(With(List(Set(q,DerivativeDivides(ActivateTrig(Times(y,z)),ActivateTrig(Times(u,Power(z,Plus(n,Negate(m))))),x))),Condition(Simp(Times(q,ActivateTrig(Times(Power(y,Plus(m,C1)),Power(z,Plus(m,C1)))),Power(Plus(m,C1),-1)),x),Not(FalseQ(q)))),And(FreeQ(List(m,n),x),NeQ(m,CN1),Not(InertTrigFreeQ(u))))),
IIntegrate(4387,Int(Times(u_DEFAULT,Power(Times(a_DEFAULT,Power($(F_,Plus(c_DEFAULT,Times(d_DEFAULT,x_))),p_)),n_)),x_Symbol),
    Condition(With(List(Set(v,ActivateTrig(F(Plus(c,Times(d,x)))))),Dist(Times(Power(a,IntPart(n)),Power(Times(v,Power(NonfreeFactors(v,x),-1)),Times(p,IntPart(n))),Power(Times(a,Power(v,p)),FracPart(n)),Power(Power(NonfreeFactors(v,x),Times(p,FracPart(n))),-1)),Int(Times(ActivateTrig(u),Power(NonfreeFactors(v,x),Times(n,p))),x),x)),And(FreeQ(List(a,c,d,n,p),x),InertTrigQ(FSymbol),Not(IntegerQ(n)),IntegerQ(p)))),
IIntegrate(4388,Int(Times(u_DEFAULT,Power(Times(a_DEFAULT,Power(Times(b_DEFAULT,$(F_,Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),p_)),n_DEFAULT)),x_Symbol),
    Condition(With(List(Set(v,ActivateTrig(F(Plus(c,Times(d,x)))))),Dist(Times(Power(a,IntPart(n)),Power(Times(a,Power(Times(b,v),p)),FracPart(n)),Power(Power(Times(b,v),Times(p,FracPart(n))),-1)),Int(Times(ActivateTrig(u),Power(Times(b,v),Times(n,p))),x),x)),And(FreeQ(List(a,b,c,d,n,p),x),InertTrigQ(FSymbol),Not(IntegerQ(n)),Not(IntegerQ(p))))),
IIntegrate(4389,Int(u_,x_Symbol),
    Condition(With(List(Set(v,FunctionOfTrig(u,x))),Condition(With(List(Set(d,FreeFactors(Tan(v),x))),Dist(Times(d,Power(Coefficient(v,x,C1),-1)),Subst(Int(SubstFor(Power(Plus(C1,Times(Sqr(d),Sqr(x))),-1),Times(Tan(v),Power(d,-1)),u,x),x),x,Times(Tan(v),Power(d,-1))),x)),And(Not(FalseQ(v)),FunctionOfQ(NonfreeFactors(Tan(v),x),u,x)))),And(InverseFunctionFreeQ(u,x),Not(MatchQ(u,Condition(Times(v_DEFAULT,Power(Times(c_DEFAULT,Power($($s("§tan"),w_),n_DEFAULT),Power($($s("§tan"),z_),n_DEFAULT)),p_DEFAULT)),And(FreeQ(List(c,p),x),IntegerQ(n),LinearQ(w,x),EqQ(z,Times(C2,w))))))))),
IIntegrate(4390,Int(Times(u_,Power(Times(c_DEFAULT,$($s("§sin"),v_)),m_)),x_Symbol),
    Condition(With(List(Set(w,FunctionOfTrig(Times(u,Power(Sin(Times(C1D2,v)),Times(C2,m)),Power(Power(Times(c,Tan(Times(C1D2,v))),m),-1)),x))),Condition(Dist(Times(Power(Times(c,Sin(v)),m),Power(Times(c,Tan(Times(C1D2,v))),m),Power(Power(Sin(Times(C1D2,v)),Times(C2,m)),-1)),Int(Times(u,Power(Sin(Times(C1D2,v)),Times(C2,m)),Power(Power(Times(c,Tan(Times(C1D2,v))),m),-1)),x),x),And(Not(FalseQ(w)),FunctionOfQ(NonfreeFactors(Tan(w),x),Times(u,Power(Sin(Times(C1D2,v)),Times(C2,m)),Power(Power(Times(c,Tan(Times(C1D2,v))),m),-1)),x)))),And(FreeQ(c,x),LinearQ(v,x),IntegerQ(Plus(m,C1D2)),Not(SumQ(u)),InverseFunctionFreeQ(u,x)))),
IIntegrate(4391,Int(Times(u_DEFAULT,Power(Plus(Times(b_DEFAULT,Power($($s("§sec"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),n_DEFAULT)),Times(a_DEFAULT,Power($($s("§tan"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),n_DEFAULT))),p_)),x_Symbol),
    Condition(Int(Times(ActivateTrig(u),Power(Sec(Plus(c,Times(d,x))),Times(n,p)),Power(Plus(b,Times(a,Power(Sin(Plus(c,Times(d,x))),n))),p)),x),And(FreeQ(List(a,b,c,d),x),IntegersQ(n,p)))),
IIntegrate(4392,Int(Times(Power(Plus(Times(Power($($s("§cot"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),n_DEFAULT),a_DEFAULT),Times(Power($($s("§csc"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),n_DEFAULT),b_DEFAULT)),p_),u_DEFAULT),x_Symbol),
    Condition(Int(Times(ActivateTrig(u),Power(Csc(Plus(c,Times(d,x))),Times(n,p)),Power(Plus(b,Times(a,Power(Cos(Plus(c,Times(d,x))),n))),p)),x),And(FreeQ(List(a,b,c,d),x),IntegersQ(n,p)))),
IIntegrate(4393,Int(Times(u_,Power(Plus(Times(a_,Power($(F_,Plus(c_DEFAULT,Times(d_DEFAULT,x_))),p_DEFAULT)),Times(b_DEFAULT,Power($(F_,Plus(c_DEFAULT,Times(d_DEFAULT,x_))),q_DEFAULT))),n_DEFAULT)),x_Symbol),
    Condition(Int(ActivateTrig(Times(u,Power(F(Plus(c,Times(d,x))),Times(n,p)),Power(Plus(a,Times(b,Power(F(Plus(c,Times(d,x))),Plus(q,Negate(p))))),n))),x),And(FreeQ(List(a,b,c,d,p,q),x),InertTrigQ(FSymbol),IntegerQ(n),PosQ(Plus(q,Negate(p)))))),
IIntegrate(4394,Int(Times(u_,Power(Plus(Times(a_,Power($(F_,Plus(d_DEFAULT,Times(e_DEFAULT,x_))),p_DEFAULT)),Times(b_DEFAULT,Power($(F_,Plus(d_DEFAULT,Times(e_DEFAULT,x_))),q_DEFAULT)),Times(c_DEFAULT,Power($(F_,Plus(d_DEFAULT,Times(e_DEFAULT,x_))),r_DEFAULT))),n_DEFAULT)),x_Symbol),
    Condition(Int(ActivateTrig(Times(u,Power(F(Plus(d,Times(e,x))),Times(n,p)),Power(Plus(a,Times(b,Power(F(Plus(d,Times(e,x))),Plus(q,Negate(p)))),Times(c,Power(F(Plus(d,Times(e,x))),Plus(r,Negate(p))))),n))),x),And(FreeQ(List(a,b,c,d,e,p,q,r),x),InertTrigQ(FSymbol),IntegerQ(n),PosQ(Plus(q,Negate(p))),PosQ(Plus(r,Negate(p)))))),
IIntegrate(4395,Int(Times(u_,Power(Plus(a_,Times(b_DEFAULT,Power($(F_,Plus(d_DEFAULT,Times(e_DEFAULT,x_))),p_DEFAULT)),Times(c_DEFAULT,Power($(F_,Plus(d_DEFAULT,Times(e_DEFAULT,x_))),q_DEFAULT))),n_DEFAULT)),x_Symbol),
    Condition(Int(ActivateTrig(Times(u,Power(F(Plus(d,Times(e,x))),Times(n,p)),Power(Plus(b,Times(a,Power(Power(F(Plus(d,Times(e,x))),p),-1)),Times(c,Power(F(Plus(d,Times(e,x))),Plus(q,Negate(p))))),n))),x),And(FreeQ(List(a,b,c,d,e,p,q),x),InertTrigQ(FSymbol),IntegerQ(n),NegQ(p)))),
IIntegrate(4396,Int(Times(u_DEFAULT,Power(Plus(Times($($s("§cos"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),a_DEFAULT),Times(b_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),n_DEFAULT)),x_Symbol),
    Condition(Int(Times(ActivateTrig(u),Power(Times(a,Power(Exp(Times(a,Plus(c,Times(d,x)),Power(b,-1))),-1)),n)),x),And(FreeQ(List(a,b,c,d,n),x),EqQ(Plus(Sqr(a),Sqr(b)),C0)))),
IIntegrate(4397,Int(u_,x_Symbol),
    Condition(Int(TrigSimplify(u),x),TrigSimplifyQ(u))),
IIntegrate(4398,Int(Times(u_DEFAULT,Power(Times(a_,v_),p_)),x_Symbol),
    Condition(With(List(Set($s("uu"),ActivateTrig(u)),Set($s("vv"),ActivateTrig(v))),Dist(Times(Power(a,IntPart(p)),Power(Times(a,$s("vv")),FracPart(p)),Power(Power($s("vv"),FracPart(p)),-1)),Int(Times($s("uu"),Power($s("vv"),p)),x),x)),And(FreeQ(List(a,p),x),Not(IntegerQ(p)),Not(InertTrigFreeQ(v))))),
IIntegrate(4399,Int(Times(u_DEFAULT,Power(Power(v_,m_),p_)),x_Symbol),
    Condition(With(List(Set($s("uu"),ActivateTrig(u)),Set($s("vv"),ActivateTrig(v))),Dist(Times(Power(Power($s("vv"),m),FracPart(p)),Power(Power($s("vv"),Times(m,FracPart(p))),-1)),Int(Times($s("uu"),Power($s("vv"),Times(m,p))),x),x)),And(FreeQ(List(m,p),x),Not(IntegerQ(p)),Not(InertTrigFreeQ(v))))),
IIntegrate(4400,Int(Times(u_DEFAULT,Power(Times(Power(v_,m_DEFAULT),Power(w_,n_DEFAULT)),p_)),x_Symbol),
    Condition(With(List(Set($s("uu"),ActivateTrig(u)),Set($s("vv"),ActivateTrig(v)),Set($s("ww"),ActivateTrig(w))),Dist(Times(Power(Times(Power($s("vv"),m),Power($s("ww"),n)),FracPart(p)),Power(Times(Power($s("vv"),Times(m,FracPart(p))),Power($s("ww"),Times(n,FracPart(p)))),-1)),Int(Times($s("uu"),Power($s("vv"),Times(m,p)),Power($s("ww"),Times(n,p))),x),x)),And(FreeQ(List(m,n,p),x),Not(IntegerQ(p)),Or(Not(InertTrigFreeQ(v)),Not(InertTrigFreeQ(w))))))
  );
}
