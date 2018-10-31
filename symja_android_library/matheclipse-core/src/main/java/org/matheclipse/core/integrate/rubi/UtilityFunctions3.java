package org.matheclipse.core.integrate.rubi;


import org.matheclipse.core.interfaces.IAST;

import static org.matheclipse.core.expression.F.*;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.AbsurdNumberQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.ActivateTrig;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.BinomialQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.CommonFactors;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.ConstantFactor;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.ContentFactor;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.ContentFactorAux;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.EqQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.EveryQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.ExpandToSum;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.ExponentIn;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.ExponentInAux;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.FactorNumericGcd;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.FactorOrder;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.FixSimplify;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.FractionQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.FreeFactors;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.FreeTerms;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.GtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.IGtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.InertTrigQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.IntegerPowerQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.IntegersQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.LeadBase;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.LogQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.LtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Map2;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.MergeFactor;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.MergeFactors;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.MergeableFactorQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.MinimumDegree;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.MonomialFactor;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.MostMainFactorPosition;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.NeQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.NegQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.NonfreeFactors;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.NonfreeTerms;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.NonpositiveFactors;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.NonsumQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.NumericFactor;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.PolynomialDivide;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.PolynomialInAuxQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.PolynomialInQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.PolynomialInSubst;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.PolynomialInSubstAux;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.PositiveFactors;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.PowerQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.ProductQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.RationalQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.RemainingFactors;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Simp;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.SimpFixFactor;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Smallest;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.SqrtNumberSumQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.SumQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.TrigSimplify;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.TrigSimplifyAux;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.TrigSimplifyQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.TrigSimplifyRecur;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.UnifyNegativeBaseFactors;
/** 
 * UtilityFunctions rules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class UtilityFunctions3 { 
  public static IAST RULES = List( 
ISetDelayed(211,FixSimplify(Times(Power(u_,m_DEFAULT),Power(v_,n_),w_DEFAULT)),
    Condition(With(List(Set(z,Simplify(Times(Power(u,Times(m,Power(GCD(m,Negate(n)),-1))),Power(v,Times(n,Power(GCD(m,Negate(n)),-1))))))),Condition(FixSimplify(Times(w,Power(z,GCD(m,Negate(n))))),Or(AbsurdNumberQ(z),SqrtNumberSumQ(z)))),And(RationalQ(m),FractionQ(n),SqrtNumberSumQ(u),SqrtNumberSumQ(Power(v,-1)),GtQ(u,C0),GtQ(v,C0)))),
ISetDelayed(212,FixSimplify(Times(Power(u_,m_DEFAULT),Power(v_,n_),w_DEFAULT)),
    Condition(With(List(Set(z,Simplify(Times(Power(Negate(u),Times(m,Power(GCD(m,n),-1))),Power(v,Times(n,Power(GCD(m,n),-1))))))),Condition(FixSimplify(Times(CN1,w,Power(z,GCD(m,n)))),Or(AbsurdNumberQ(z),SqrtNumberSumQ(z)))),And(IntegerQ(m),FractionQ(n),SqrtNumberSumQ(u),SqrtNumberSumQ(v),LtQ(u,C0),GtQ(v,C0)))),
ISetDelayed(213,FixSimplify(Times(Power(u_,m_DEFAULT),Power(v_,n_),w_DEFAULT)),
    Condition(With(List(Set(z,Simplify(Times(Power(Negate(u),Times(m,Power(GCD(m,Negate(n)),-1))),Power(v,Times(n,Power(GCD(m,Negate(n)),-1))))))),Condition(FixSimplify(Times(CN1,w,Power(z,GCD(m,Negate(n))))),Or(AbsurdNumberQ(z),SqrtNumberSumQ(z)))),And(IntegerQ(m),FractionQ(n),SqrtNumberSumQ(u),SqrtNumberSumQ(Power(v,-1)),LtQ(u,C0),GtQ(v,C0)))),
ISetDelayed(214,FixSimplify(Times(Power(a_,m_),Power(Plus(u_,Times(Power(b_,n_),v_DEFAULT)),p_DEFAULT),w_DEFAULT)),
    Condition(With(List(Set(c,Simplify(Times(Power(a,Times(m,Power(p,-1))),Power(b,n))))),Condition(FixSimplify(Times(w,Power(Plus(Times(Power(a,Times(m,Power(p,-1))),u),Times(c,v)),p))),RationalQ(c))),And(RationalQ(a,b,m,n),Greater(a,C0),Greater(b,C0),IGtQ(p,C0)))),
ISetDelayed(215,FixSimplify(Times(Power(a_,m_DEFAULT),Plus(Times(Power(a_,n_),u_DEFAULT),Times(Power(b_,p_DEFAULT),v_DEFAULT)),w_DEFAULT)),
    Condition(With(List(Set(z,Times(w,Power(a,Plus(m,n)),Plus(u,Times(Power(CN1,p),Power(a,Plus(p,Negate(n))),v))))),Condition(FixSimplify(z),Not(MatchQ(z,Condition(Times($p("ww",true),Power($p("aa"),$p("mm")),Plus($p("uu"),Times(Power($p("bb"),$p("nn")),$p("vv",true)))),And(RationalQ($s("aa"),$s("bb"),$s("mm"),$s("nn")),Greater($s("aa"),C0),Greater($s("bb"),C0),RationalQ(Simplify(Times(Power($s("aa"),$s("mm")),Power($s("bb"),$s("nn"))))))))))),And(RationalQ(m),FractionQ(n),IntegerQ(p),Greater(Plus(p,Negate(n)),C0),SameQ(Plus(a,b),C0)))),
ISetDelayed(216,FixSimplify(Times(Power(Plus(a_,b_),m_DEFAULT),Power(Plus(c_,d_),n_),w_DEFAULT)),
    Condition(With(List(Set(q,Simplify(Times(b,Power(d,-1))))),Condition(FixSimplify(Times(w,Power(q,m),Power(Plus(c,d),Plus(m,n)))),FreeQ(q,Plus))),And(IntegerQ(m),Not(IntegerQ(n)),EqQ(Plus(Times(b,c),Times(CN1,a,d)),C0)))),
ISetDelayed(217,FixSimplify(Times(Power(Plus(Times(Power(a_,m_DEFAULT),u_DEFAULT),Times(Power(a_,n_DEFAULT),v_DEFAULT)),t_DEFAULT),w_DEFAULT)),
    Condition(FixSimplify(Times(Power(a,Times(m,t)),w,Power(Plus(u,Times(Power(a,Plus(n,Negate(m))),v)),t))),And(Not(RationalQ(a)),IntegerQ(t),RationalQ(m,n),And(Less(C0,m),LessEqual(m,n))))),
ISetDelayed(218,FixSimplify(Times(w_DEFAULT,Power(Plus(Times(Power(a_,m_DEFAULT),u_DEFAULT),Times(Power(a_,n_DEFAULT),v_DEFAULT),Times(Power(a_,p_DEFAULT),z_DEFAULT)),t_DEFAULT))),
    Condition(FixSimplify(Times(Power(a,Times(m,t)),w,Power(Plus(u,Times(Power(a,Plus(n,Negate(m))),v),Times(Power(a,Plus(p,Negate(m))),z)),t))),And(Not(RationalQ(a)),IntegerQ(t),RationalQ(m,n,p),And(Less(C0,m),LessEqual(m,n,p))))),
ISetDelayed(219,FixSimplify(Times(w_DEFAULT,Power(Plus(Times(Power(a_,m_DEFAULT),u_DEFAULT),Times(Power(a_,n_DEFAULT),v_DEFAULT),Times(Power(a_,q_DEFAULT),y_DEFAULT),Times(Power(a_,p_DEFAULT),z_DEFAULT)),t_DEFAULT))),
    Condition(FixSimplify(Times(Power(a,Times(m,t)),w,Power(Plus(u,Times(Power(a,Plus(n,Negate(m))),v),Times(Power(a,Plus(p,Negate(m))),z),Times(Power(a,Plus(q,Negate(m))),y)),t))),And(Not(RationalQ(a)),IntegerQ(t),RationalQ(m,n,p),And(Less(C0,m),LessEqual(m,n,p,q))))),
ISetDelayed(220,FixSimplify(Times(Plus(u_DEFAULT,Times(b_DEFAULT,Sqrt(v_)),Times(c_DEFAULT,Sqrt(v_)),Times(d_DEFAULT,Sqrt(v_)),Times(a_DEFAULT,Sqrt($p(v,Plus)))),w_DEFAULT)),
    FixSimplify(Times(w,Plus(u,Times(FixSimplify(Plus(a,b,c,d)),Sqrt(v)))))),
ISetDelayed(221,FixSimplify(Times(Plus(u_DEFAULT,Times(b_DEFAULT,Sqrt(v_)),Times(c_DEFAULT,Sqrt(v_)),Times(a_DEFAULT,Sqrt($p(v,Plus)))),w_DEFAULT)),
    FixSimplify(Times(w,Plus(u,Times(FixSimplify(Plus(a,b,c)),Sqrt(v)))))),
ISetDelayed(222,FixSimplify(Times(Plus(u_DEFAULT,Times(b_DEFAULT,Sqrt(v_)),Times(a_DEFAULT,Sqrt($p(v,Plus)))),w_DEFAULT)),
    FixSimplify(Times(w,Plus(u,Times(FixSimplify(Plus(a,b)),Sqrt(v)))))),
ISetDelayed(223,FixSimplify(Times(u_DEFAULT,Power(v_,m_),Power(w_,n_))),
    Condition(Negate(FixSimplify(Times(u,Power(v,Plus(m,Negate(C1)))))),And(RationalQ(m),Not(RationalQ(w)),FractionQ(n),Less(n,C0),EqQ(Plus(v,Power(w,Negate(n))),C0)))),
ISetDelayed(224,FixSimplify(Times(u_DEFAULT,Power(v_,m_),Power(w_,n_DEFAULT))),
    Condition(Times(Power(CN1,n),FixSimplify(Times(u,Power(v,Plus(m,n))))),And(RationalQ(m),Not(RationalQ(w)),IntegerQ(n),EqQ(Plus(v,w),C0)))),
ISetDelayed(225,FixSimplify(Times(u_DEFAULT,Power(Negate(Power(v_,p_DEFAULT)),m_),Power(w_,n_DEFAULT))),
    Condition(Times(Power(CN1,Times(n,Power(p,-1))),FixSimplify(Times(u,Power(Negate(Power(v,p)),Plus(m,Times(n,Power(p,-1))))))),And(RationalQ(m),Not(RationalQ(w)),IntegerQ(Times(n,Power(p,-1))),EqQ(Plus(v,Negate(w)),C0)))),
ISetDelayed(226,FixSimplify(Times(u_DEFAULT,Power(Negate(Power(v_,p_DEFAULT)),m_),Power(w_,n_DEFAULT))),
    Condition(Times(Power(CN1,Plus(n,Times(n,Power(p,-1)))),FixSimplify(Times(u,Power(Negate(Power(v,p)),Plus(m,Times(n,Power(p,-1))))))),And(RationalQ(m),Not(RationalQ(w)),IntegersQ(n,Times(n,Power(p,-1))),EqQ(Plus(v,w),C0)))),
ISetDelayed(227,FixSimplify(Times(Power(Plus(a_,Negate(b_)),m_DEFAULT),Power(Plus(a_,b_),m_DEFAULT),u_DEFAULT)),
    Condition(Times(u,Power(Plus(Sqr(a),Negate(Sqr(b))),m)),And(IntegerQ(m),AtomQ(a),AtomQ(b)))),
ISetDelayed(228,FixSimplify(Times(Power(Plus(Times(c_Symbol,Sqr(d_Symbol)),Times(CN1,e_Symbol,Plus(Times(b_Symbol,d_Symbol),Times(CN1,a_Symbol,e_Symbol)))),m_DEFAULT),u_DEFAULT)),
    Condition(Times(u,Power(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),m)),And(RationalQ(m),OrderedQ(List(a,b,c,d,e))))),
ISetDelayed(229,FixSimplify(Times(Power(Plus(Times(c_Symbol,Sqr(d_Symbol)),Times(e_Symbol,Plus(Times(CN1,b_Symbol,d_Symbol),Times(a_Symbol,e_Symbol)))),m_DEFAULT),u_DEFAULT)),
    Condition(Times(u,Power(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),m)),And(RationalQ(m),OrderedQ(List(a,b,c,d,e))))),
ISetDelayed(230,FixSimplify(Times(Power(Plus(Times(CN1,c_Symbol,Sqr(d_Symbol)),Times(e_Symbol,Plus(Times(b_Symbol,d_Symbol),Times(CN1,a_Symbol,e_Symbol)))),m_DEFAULT),u_DEFAULT)),
    Condition(Times(Power(CN1,m),u,Power(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),m)),And(IntegerQ(m),OrderedQ(List(a,b,c,d,e))))),
ISetDelayed(231,FixSimplify(Times(Power(Plus(Times(CN1,c_Symbol,Sqr(d_Symbol)),Times(CN1,e_Symbol,Plus(Times(CN1,b_Symbol,d_Symbol),Times(a_Symbol,e_Symbol)))),m_DEFAULT),u_DEFAULT)),
    Condition(Times(Power(CN1,m),u,Power(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),m)),And(RationalQ(m),OrderedQ(List(a,b,c,d,e))))),
ISetDelayed(232,FixSimplify(u_),
    u),
ISetDelayed(233,SimpFixFactor(Power(Plus(Times(a_DEFAULT,Complex(C0,c_)),Times(b_DEFAULT,Complex(C0,d_))),p_DEFAULT),x_),
    Condition(Times(Power(CI,p),SimpFixFactor(Power(Plus(Times(a,c),Times(b,d)),p),x)),IntegerQ(p))),
ISetDelayed(234,SimpFixFactor(Power(Plus(Times(a_DEFAULT,Complex(C0,d_)),Times(b_DEFAULT,Complex(C0,e_)),Times(c_DEFAULT,Complex(C0,f_))),p_DEFAULT),x_),
    Condition(Times(Power(CI,p),SimpFixFactor(Power(Plus(Times(a,d),Times(b,e),Times(c,f)),p),x)),IntegerQ(p))),
ISetDelayed(235,SimpFixFactor(Power(Plus(Times(a_DEFAULT,Power(c_,r_)),Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_DEFAULT),x_),
    Condition(Times(Power(c,Times(r,p)),SimpFixFactor(Power(Plus(a,Times(b,Power(Power(c,r),-1),Power(x,n))),p),x)),And(FreeQ(List(a,b,c),x),IntegersQ(n,p),AtomQ(c),RationalQ(r),Less(r,C0)))),
ISetDelayed(236,SimpFixFactor(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(c_,r_),Power(x_,n_DEFAULT))),p_DEFAULT),x_),
    Condition(Times(Power(c,Times(r,p)),SimpFixFactor(Power(Plus(Times(a,Power(Power(c,r),-1)),Times(b,Power(x,n))),p),x)),And(FreeQ(List(a,b,c),x),IntegersQ(n,p),AtomQ(c),RationalQ(r),Less(r,C0)))),
ISetDelayed(237,SimpFixFactor(Power(Plus(Times(a_DEFAULT,Power(c_,s_DEFAULT)),Times(b_DEFAULT,Power(c_,r_DEFAULT),Power(x_,n_DEFAULT))),p_DEFAULT),x_),
    Condition(Times(Power(c,Times(s,p)),SimpFixFactor(Power(Plus(a,Times(b,Power(c,Plus(r,Negate(s))),Power(x,n))),p),x)),And(FreeQ(List(a,b,c),x),IntegersQ(n,p),RationalQ(s,r),And(Less(C0,s),LessEqual(s,r)),UnsameQ(Power(c,Times(s,p)),CN1)))),
ISetDelayed(238,SimpFixFactor(Power(Plus(Times(a_DEFAULT,Power(c_,s_DEFAULT)),Times(b_DEFAULT,Power(c_,r_DEFAULT),Power(x_,n_DEFAULT))),p_DEFAULT),x_),
    Condition(Times(Power(c,Times(r,p)),SimpFixFactor(Power(Plus(Times(a,Power(c,Plus(s,Negate(r)))),Times(b,Power(x,n))),p),x)),And(FreeQ(List(a,b,c),x),IntegersQ(n,p),RationalQ(s,r),Less(C0,r,s),UnsameQ(Power(c,Times(r,p)),CN1)))),
ISetDelayed(239,SimpFixFactor(u_,x_),
    u),
ISetDelayed(240,FactorNumericGcd(u_),
    If(And(PowerQ(u),RationalQ(Part(u,C2))),Power(FactorNumericGcd(Part(u,C1)),Part(u,C2)),If(ProductQ(u),Map($rubi("FactorNumericGcd"),u),If(SumQ(u),With(List(Set(g,Apply($s("GCD"),Map($rubi("NumericFactor"),Apply($s("List"),u))))),Times(g,Map(Function(Times(Slot1,Power(g,-1))),u))),u)))),
ISetDelayed(241,MergeFactors(u_,v_),
    If(ProductQ(u),MergeFactors(Rest(u),MergeFactors(First(u),v)),If(PowerQ(u),If(MergeableFactorQ(Part(u,C1),Part(u,C2),v),MergeFactor(Part(u,C1),Part(u,C2),v),If(And(RationalQ(Part(u,C2)),Less(Part(u,C2),CN1),MergeableFactorQ(Part(u,C1),CN1,v)),MergeFactors(Power(Part(u,C1),Plus(Part(u,C2),C1)),MergeFactor(Part(u,C1),CN1,v)),Times(u,v))),If(MergeableFactorQ(u,C1,v),MergeFactor(u,C1,v),Times(u,v))))),
ISetDelayed(242,MergeFactor($p("bas"),$p("deg"),v_),
    If(SameQ($s("bas"),v),Power($s("bas"),Plus($s("deg"),C1)),If(PowerQ(v),If(SameQ($s("bas"),Part(v,C1)),Power($s("bas"),Plus($s("deg"),Part(v,C2))),Power(MergeFactor($s("bas"),Times($s("deg"),Power(Part(v,C2),-1)),Part(v,C1)),Part(v,C2))),If(ProductQ(v),If(MergeableFactorQ($s("bas"),$s("deg"),First(v)),Times(MergeFactor($s("bas"),$s("deg"),First(v)),Rest(v)),Times(First(v),MergeFactor($s("bas"),$s("deg"),Rest(v)))),Plus(MergeFactor($s("bas"),$s("deg"),First(v)),MergeFactor($s("bas"),$s("deg"),Rest(v))))))),
ISetDelayed(243,MergeableFactorQ($p("bas"),$p("deg"),v_),
    If(SameQ($s("bas"),v),And(RationalQ(Plus($s("deg"),C1)),Or(GreaterEqual(Plus($s("deg"),C1),C0),And(RationalQ($s("deg")),Greater($s("deg"),C0)))),If(PowerQ(v),If(SameQ($s("bas"),Part(v,C1)),And(RationalQ(Plus($s("deg"),Part(v,C2))),Or(GreaterEqual(Plus($s("deg"),Part(v,C2)),C0),And(RationalQ($s("deg")),Greater($s("deg"),C0)))),And(SumQ(Part(v,C1)),IntegerQ(Part(v,C2)),Or(Not(IntegerQ($s("deg"))),IntegerQ(Times($s("deg"),Power(Part(v,C2),-1)))),MergeableFactorQ($s("bas"),Times($s("deg"),Power(Part(v,C2),-1)),Part(v,C1)))),If(ProductQ(v),Or(MergeableFactorQ($s("bas"),$s("deg"),First(v)),MergeableFactorQ($s("bas"),$s("deg"),Rest(v))),And(SumQ(v),MergeableFactorQ($s("bas"),$s("deg"),First(v)),MergeableFactorQ($s("bas"),$s("deg"),Rest(v))))))),
ISetDelayed(244,TrigSimplifyQ(u_),
    UnsameQ(ActivateTrig(u),TrigSimplify(u))),
ISetDelayed(245,TrigSimplify(u_),
    ActivateTrig(TrigSimplifyRecur(u))),
ISetDelayed(246,TrigSimplifyRecur(u_),
    If(AtomQ(u),u,If(SameQ(Head(u),$s("If")),u,TrigSimplifyAux(Map($rubi("TrigSimplifyRecur"),u))))),
ISetDelayed(247,TrigSimplifyAux(Times(u_DEFAULT,Power(Plus(Times(a_DEFAULT,Power(v_,m_DEFAULT)),Times(b_DEFAULT,Power(v_,n_DEFAULT))),p_))),
    Condition(Times(u,Power(v,Times(m,p)),Power(TrigSimplifyAux(Plus(a,Times(b,Power(v,Plus(n,Negate(m)))))),p)),And(InertTrigQ(v),IntegerQ(p),RationalQ(m,n),Less(m,n)))),
ISetDelayed(248,TrigSimplifyAux(Plus(v_DEFAULT,Times(a_DEFAULT,Sqr($($s("§cos"),u_))),Times(b_DEFAULT,Sqr($($s("§sin"),u_))))),
    Condition(Plus(a,v),SameQ(a,b))),
ISetDelayed(249,TrigSimplifyAux(Plus(v_DEFAULT,Times(a_DEFAULT,Sqr($($s("§sec"),u_))),Times(b_DEFAULT,Sqr($($s("§tan"),u_))))),
    Condition(Plus(a,v),SameQ(a,Negate(b)))),
ISetDelayed(250,TrigSimplifyAux(Plus(v_DEFAULT,Times(b_DEFAULT,Sqr($($s("§cot"),u_))),Times(a_DEFAULT,Sqr($($s("§csc"),u_))))),
    Condition(Plus(a,v),SameQ(a,Negate(b)))),
ISetDelayed(251,TrigSimplifyAux(Power(Plus(v_DEFAULT,Times(a_DEFAULT,Sqr($($s("§cos"),u_))),Times(b_DEFAULT,Sqr($($s("§sin"),u_)))),n_)),
    Power(Plus(Times(Plus(b,Negate(a)),Sqr(Sin(u))),a,v),n)),
ISetDelayed(252,TrigSimplifyAux(Plus(u_,w_DEFAULT,Times(v_DEFAULT,Sqr($($s("§sin"),z_))))),
    Condition(Plus(Times(u,Sqr(Cos(z))),w),SameQ(u,Negate(v)))),
ISetDelayed(253,TrigSimplifyAux(Plus(u_,w_DEFAULT,Times(v_DEFAULT,Sqr($($s("§cos"),z_))))),
    Condition(Plus(Times(u,Sqr(Sin(z))),w),SameQ(u,Negate(v)))),
ISetDelayed(254,TrigSimplifyAux(Plus(u_,w_DEFAULT,Times(v_DEFAULT,Sqr($($s("§tan"),z_))))),
    Condition(Plus(Times(u,Sqr(Sec(z))),w),SameQ(u,v))),
ISetDelayed(255,TrigSimplifyAux(Plus(u_,w_DEFAULT,Times(v_DEFAULT,Sqr($($s("§cot"),z_))))),
    Condition(Plus(Times(u,Sqr(Csc(z))),w),SameQ(u,v))),
ISetDelayed(256,TrigSimplifyAux(Plus(u_,w_DEFAULT,Times(v_DEFAULT,Sqr($($s("§sec"),z_))))),
    Condition(Plus(Times(v,Sqr(Tan(z))),w),SameQ(u,Negate(v)))),
ISetDelayed(257,TrigSimplifyAux(Plus(u_,w_DEFAULT,Times(v_DEFAULT,Sqr($($s("§csc"),z_))))),
    Condition(Plus(Times(v,Sqr(Cot(z))),w),SameQ(u,Negate(v)))),
ISetDelayed(258,TrigSimplifyAux(Times(u_DEFAULT,Power(Plus(a_,Times(b_DEFAULT,$($s("§cos"),v_))),-1),Sqr($($s("§sin"),v_)))),
    Condition(Times(u,Plus(Power(a,-1),Times(CN1,Cos(v),Power(b,-1)))),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0))),
ISetDelayed(259,TrigSimplifyAux(Times(u_DEFAULT,Sqr($($s("§cos"),v_)),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),v_))),-1))),
    Condition(Times(u,Plus(Power(a,-1),Times(CN1,Sin(v),Power(b,-1)))),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0))),
ISetDelayed(260,TrigSimplifyAux(Times(u_DEFAULT,Power($($s("§tan"),v_),n_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power($($s("§tan"),v_),n_DEFAULT))),-1))),
    Condition(Times(u,Power(Plus(b,Times(a,Power(Cot(v),n))),-1)),And(IGtQ(n,C0),NonsumQ(a)))),
ISetDelayed(261,TrigSimplifyAux(Times(u_DEFAULT,Power($($s("§cot"),v_),n_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power($($s("§cot"),v_),n_DEFAULT))),-1))),
    Condition(Times(u,Power(Plus(b,Times(a,Power(Tan(v),n))),-1)),And(IGtQ(n,C0),NonsumQ(a)))),
ISetDelayed(262,TrigSimplifyAux(Times(u_DEFAULT,Power($($s("§sec"),v_),n_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power($($s("§sec"),v_),n_DEFAULT))),-1))),
    Condition(Times(u,Power(Plus(b,Times(a,Power(Cos(v),n))),-1)),And(IGtQ(n,C0),NonsumQ(a)))),
ISetDelayed(263,TrigSimplifyAux(Times(u_DEFAULT,Power($($s("§csc"),v_),n_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power($($s("§csc"),v_),n_DEFAULT))),-1))),
    Condition(Times(u,Power(Plus(b,Times(a,Power(Sin(v),n))),-1)),And(IGtQ(n,C0),NonsumQ(a)))),
ISetDelayed(264,TrigSimplifyAux(Times(u_DEFAULT,Power(Plus(a_,Times(b_DEFAULT,Power($($s("§sec"),v_),n_DEFAULT))),-1),Power($($s("§tan"),v_),n_DEFAULT))),
    Condition(Times(u,Power(Sin(v),n),Power(Plus(b,Times(a,Power(Cos(v),n))),-1)),And(IGtQ(n,C0),NonsumQ(a)))),
ISetDelayed(265,TrigSimplifyAux(Times(u_DEFAULT,Power($($s("§cot"),v_),n_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power($($s("§csc"),v_),n_DEFAULT))),-1))),
    Condition(Times(u,Power(Cos(v),n),Power(Plus(b,Times(a,Power(Sin(v),n))),-1)),And(IGtQ(n,C0),NonsumQ(a)))),
ISetDelayed(266,TrigSimplifyAux(Times(u_DEFAULT,Power(Plus(Times(a_DEFAULT,Power($($s("§sec"),v_),n_DEFAULT)),Times(b_DEFAULT,Power($($s("§tan"),v_),n_DEFAULT))),p_DEFAULT))),
    Condition(Times(u,Power(Sec(v),Times(n,p)),Power(Plus(a,Times(b,Power(Sin(v),n))),p)),IntegersQ(n,p))),
ISetDelayed(267,TrigSimplifyAux(Times(u_DEFAULT,Power(Plus(Times(b_DEFAULT,Power($($s("§cot"),v_),n_DEFAULT)),Times(a_DEFAULT,Power($($s("§csc"),v_),n_DEFAULT))),p_DEFAULT))),
    Condition(Times(u,Power(Csc(v),Times(n,p)),Power(Plus(a,Times(b,Power(Cos(v),n))),p)),IntegersQ(n,p))),
ISetDelayed(268,TrigSimplifyAux(Times(u_DEFAULT,Power(Plus(Times(b_DEFAULT,Power($($s("§sin"),v_),n_DEFAULT)),Times(a_DEFAULT,Power($($s("§tan"),v_),n_DEFAULT))),p_DEFAULT))),
    Condition(Times(u,Power(Tan(v),Times(n,p)),Power(Plus(a,Times(b,Power(Cos(v),n))),p)),IntegersQ(n,p))),
ISetDelayed(269,TrigSimplifyAux(Times(u_DEFAULT,Power(Plus(Times(b_DEFAULT,Power($($s("§cos"),v_),n_DEFAULT)),Times(a_DEFAULT,Power($($s("§cot"),v_),n_DEFAULT))),p_DEFAULT))),
    Condition(Times(u,Power(Cot(v),Times(n,p)),Power(Plus(a,Times(b,Power(Sin(v),n))),p)),IntegersQ(n,p))),
ISetDelayed(270,TrigSimplifyAux(Times(u_DEFAULT,Power($($s("§cos"),v_),m_DEFAULT),Power(Plus(a_DEFAULT,Times(c_DEFAULT,Power($($s("§sec"),v_),n_DEFAULT)),Times(b_DEFAULT,Power($($s("§tan"),v_),n_DEFAULT))),p_DEFAULT))),
    Condition(Times(u,Power(Cos(v),Plus(m,Times(CN1,n,p))),Power(Plus(c,Times(b,Power(Sin(v),n)),Times(a,Power(Cos(v),n))),p)),IntegersQ(m,n,p))),
ISetDelayed(271,TrigSimplifyAux(Times(u_DEFAULT,Power($($s("§sec"),v_),m_DEFAULT),Power(Plus(a_DEFAULT,Times(c_DEFAULT,Power($($s("§sec"),v_),n_DEFAULT)),Times(b_DEFAULT,Power($($s("§tan"),v_),n_DEFAULT))),p_DEFAULT))),
    Condition(Times(u,Power(Sec(v),Plus(m,Times(n,p))),Power(Plus(c,Times(b,Power(Sin(v),n)),Times(a,Power(Cos(v),n))),p)),IntegersQ(m,n,p))),
ISetDelayed(272,TrigSimplifyAux(Times(u_DEFAULT,Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power($($s("§cot"),v_),n_DEFAULT)),Times(c_DEFAULT,Power($($s("§csc"),v_),n_DEFAULT))),p_DEFAULT),Power($($s("§sin"),v_),m_DEFAULT))),
    Condition(Times(u,Power(Sin(v),Plus(m,Times(CN1,n,p))),Power(Plus(c,Times(b,Power(Cos(v),n)),Times(a,Power(Sin(v),n))),p)),IntegersQ(m,n,p))),
ISetDelayed(273,TrigSimplifyAux(Times(u_DEFAULT,Power($($s("§csc"),v_),m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power($($s("§cot"),v_),n_DEFAULT)),Times(c_DEFAULT,Power($($s("§csc"),v_),n_DEFAULT))),p_DEFAULT))),
    Condition(Times(u,Power(Csc(v),Plus(m,Times(n,p))),Power(Plus(c,Times(b,Power(Cos(v),n)),Times(a,Power(Sin(v),n))),p)),IntegersQ(m,n,p))),
ISetDelayed(274,TrigSimplifyAux(Times(u_DEFAULT,Power(Plus(Times(a_DEFAULT,Power($($s("§csc"),v_),m_DEFAULT)),Times(b_DEFAULT,Power($($s("§sin"),v_),n_DEFAULT))),p_DEFAULT))),
    Condition(If(And(EqQ(Plus(m,n,Negate(C2)),C0),EqQ(Plus(a,b),C0)),Times(u,Power(Times(a,Sqr(Cos(v)),Power(Power(Sin(v),m),-1)),p)),Times(u,Power(Times(Plus(a,Times(b,Power(Sin(v),Plus(m,n)))),Power(Power(Sin(v),m),-1)),p))),IntegersQ(m,n))),
ISetDelayed(275,TrigSimplifyAux(Times(u_DEFAULT,Power(Plus(Times(b_DEFAULT,Power($($s("§cos"),v_),n_DEFAULT)),Times(a_DEFAULT,Power($($s("§sec"),v_),m_DEFAULT))),p_DEFAULT))),
    Condition(If(And(EqQ(Plus(m,n,Negate(C2)),C0),EqQ(Plus(a,b),C0)),Times(u,Power(Times(a,Sqr(Sin(v)),Power(Power(Cos(v),m),-1)),p)),Times(u,Power(Times(Plus(a,Times(b,Power(Cos(v),Plus(m,n)))),Power(Power(Cos(v),m),-1)),p))),IntegersQ(m,n))),
ISetDelayed(276,TrigSimplifyAux(u_),
    u),
ISetDelayed(277,TrigSimplifyAux(Times(u_DEFAULT,Power(Times(c_DEFAULT,Power($($s("§tan"),v_),n_DEFAULT),Power($($s("§tan"),w_),n_DEFAULT)),p_DEFAULT))),
    Condition(Times(u,Power(Power(Plus(Negate(c),Times(c,$($s("§sec"),w))),n),p)),And(IntegerQ(n),EqQ(w,Times(C2,v))))),
ISetDelayed(278,ContentFactor($p("expn")),
    TimeConstrained(ContentFactorAux($s("expn")),$s("§$timelimit"),$s("expn"))),
ISetDelayed(279,ContentFactorAux($p("expn")),
    If(AtomQ($s("expn")),$s("expn"),If(IntegerPowerQ($s("expn")),If(And(SumQ(Part($s("expn"),C1)),Less(NumericFactor(Part($s("expn"),C1,C1)),C0)),Times(Power(CN1,Part($s("expn"),C2)),Power(ContentFactorAux(Negate(Part($s("expn"),C1))),Part($s("expn"),C2))),Power(ContentFactorAux(Part($s("expn"),C1)),Part($s("expn"),C2))),If(ProductQ($s("expn")),Module(List(Set($s("num"),C1),$s("tmp")),CompoundExpression(Set($s("tmp"),Map(Function(If(And(SumQ(Slot1),Less(NumericFactor(Part(Slot1,C1)),C0)),CompoundExpression(Set($s("num"),Negate($s("num"))),ContentFactorAux(Negate(Slot1))),ContentFactorAux(Slot1))),$s("expn"))),Times($s("num"),UnifyNegativeBaseFactors($s("tmp"))))),If(SumQ($s("expn")),With(List(Set($s("lst"),CommonFactors(Apply($s("List"),$s("expn"))))),If(Or(SameQ(Part($s("lst"),C1),C1),SameQ(Part($s("lst"),C1),CN1)),$s("expn"),Times(Part($s("lst"),C1),Apply(Plus,Rest($s("lst")))))),$s("expn")))))),
ISetDelayed(280,UnifyNegativeBaseFactors(Times(u_DEFAULT,Power(Negate(v_),m_),Power(v_,n_DEFAULT))),
    Condition(UnifyNegativeBaseFactors(Times(Power(CN1,n),u,Power(Negate(v),Plus(m,n)))),IntegerQ(n))),
ISetDelayed(281,UnifyNegativeBaseFactors(u_),
    u),
ISetDelayed(282,CommonFactors($p("lst")),
    Module(List($s("lst1"),$s("lst2"),$s("lst3"),$s("lst4"),$s("common"),$s("base"),$s("num")),CompoundExpression(Set($s("lst1"),Map($rubi("NonabsurdNumberFactors"),$s("lst"))),Set($s("lst2"),Map($rubi("AbsurdNumberFactors"),$s("lst"))),Set($s("num"),Apply($rubi("AbsurdNumberGCD"),$s("lst2"))),Set($s("common"),$s("num")),Set($s("lst2"),Map(Function(Times(Slot1,Power($s("num"),-1))),$s("lst2"))),While(True,CompoundExpression(Set($s("lst3"),Map($rubi("LeadFactor"),$s("lst1"))),If(Apply($s("SameQ"),$s("lst3")),CompoundExpression(Set($s("common"),Times($s("common"),Part($s("lst3"),C1))),Set($s("lst1"),Map($rubi("RemainingFactors"),$s("lst1")))),If(And(EveryQ(Function(And(LogQ(Slot1),IntegerQ(First(Slot1)),Greater(First(Slot1),C0))),$s("lst3")),EveryQ($rubi("RationalQ"),Set($s("lst4"),Map(Function(FullSimplify(Times(Slot1,Power(First($s("lst3")),-1)))),$s("lst3"))))),CompoundExpression(Set($s("num"),Apply($s("GCD"),$s("lst4"))),Set($s("common"),Times($s("common"),Log(Power(Part(First($s("lst3")),C1),$s("num"))))),Set($s("lst2"),Map2(Function(Times(Slot1,Slot2,Power($s("num"),-1))),$s("lst2"),$s("lst4"))),Set($s("lst1"),Map($rubi("RemainingFactors"),$s("lst1")))),CompoundExpression(Set($s("lst4"),Map($rubi("LeadDegree"),$s("lst1"))),If(And(Apply($s("SameQ"),Map($rubi("LeadBase"),$s("lst1"))),EveryQ($rubi("RationalQ"),$s("lst4"))),CompoundExpression(Set($s("num"),Smallest($s("lst4"))),Set($s("base"),LeadBase(Part($s("lst1"),C1))),If(Unequal($s("num"),C0),Set($s("common"),Times($s("common"),Power($s("base"),$s("num"))))),Set($s("lst2"),Map2(Function(Times(Slot1,Power($s("base"),Plus(Slot2,Negate($s("num")))))),$s("lst2"),$s("lst4"))),Set($s("lst1"),Map($rubi("RemainingFactors"),$s("lst1")))),If(And(Equal(Length($s("lst1")),C2),EqQ(Plus(LeadBase(Part($s("lst1"),C1)),LeadBase(Part($s("lst1"),C2))),C0),NeQ(Part($s("lst1"),C1),C1),IntegerQ(Part($s("lst4"),C1)),FractionQ(Part($s("lst4"),C2))),CompoundExpression(Set($s("num"),Min($s("lst4"))),Set($s("base"),LeadBase(Part($s("lst1"),C2))),If(Unequal($s("num"),C0),Set($s("common"),Times($s("common"),Power($s("base"),$s("num"))))),Set($s("lst2"),List(Times(Part($s("lst2"),C1),Power(CN1,Part($s("lst4"),C1))),Part($s("lst2"),C2))),Set($s("lst2"),Map2(Function(Times(Slot1,Power($s("base"),Plus(Slot2,Negate($s("num")))))),$s("lst2"),$s("lst4"))),Set($s("lst1"),Map($rubi("RemainingFactors"),$s("lst1")))),If(And(Equal(Length($s("lst1")),C2),EqQ(Plus(LeadBase(Part($s("lst1"),C1)),LeadBase(Part($s("lst1"),C2))),C0),NeQ(Part($s("lst1"),C2),C1),IntegerQ(Part($s("lst4"),C2)),FractionQ(Part($s("lst4"),C1))),CompoundExpression(Set($s("num"),Min($s("lst4"))),Set($s("base"),LeadBase(Part($s("lst1"),C1))),If(Unequal($s("num"),C0),Set($s("common"),Times($s("common"),Power($s("base"),$s("num"))))),Set($s("lst2"),List(Part($s("lst2"),C1),Times(Part($s("lst2"),C2),Power(CN1,Part($s("lst4"),C2))))),Set($s("lst2"),Map2(Function(Times(Slot1,Power($s("base"),Plus(Slot2,Negate($s("num")))))),$s("lst2"),$s("lst4"))),Set($s("lst1"),Map($rubi("RemainingFactors"),$s("lst1")))),CompoundExpression(Set($s("num"),MostMainFactorPosition($s("lst3"))),Set($s("lst2"),ReplacePart($s("lst2"),Times(Part($s("lst3"),$s("num")),Part($s("lst2"),$s("num"))),$s("num"))),Set($s("lst1"),ReplacePart($s("lst1"),RemainingFactors(Part($s("lst1"),$s("num"))),$s("num")))))))))),If(EveryQ(Function(SameQ(Slot1,C1)),$s("lst1")),Return(Prepend($s("lst2"),$s("common"))))))))),
ISetDelayed(283,MostMainFactorPosition($p("lst",$s("List"))),
    Module(List(Set($s("§factor"),C1),Set($s("num"),C1),$s("ii")),CompoundExpression(Do(If(Greater(FactorOrder(Part($s("lst"),$s("ii")),$s("§factor")),C0),CompoundExpression(Set($s("§factor"),Part($s("lst"),$s("ii"))),Set($s("num"),$s("ii")))),List($s("ii"),Length($s("lst")))),$s("num")))),
ISetDelayed(284,FactorOrder(u_,v_),
    If(SameQ(u,C1),If(SameQ(v,C1),C0,CN1),If(SameQ(v,C1),C1,Order(u,v)))),
ISetDelayed(285,Smallest($p("num1"),$p("num2")),
    If(Greater($s("num1"),C0),If(Greater($s("num2"),C0),Min($s("num1"),$s("num2")),C0),If(Greater($s("num2"),C0),C0,Max($s("num1"),$s("num2"))))),
ISetDelayed(286,Smallest($p("lst",$s("List"))),
    Module(List(Set($s("num"),Part($s("lst"),C1))),CompoundExpression(Scan(Function(Set($s("num"),Smallest($s("num"),Slot1))),Rest($s("lst"))),$s("num")))),
ISetDelayed(287,MonomialFactor(u_,x_Symbol),
    If(AtomQ(u),If(SameQ(u,x),List(C1,C1),List(C0,u)),If(PowerQ(u),If(IntegerQ(Part(u,C2)),With(List(Set($s("lst"),MonomialFactor(Part(u,C1),x))),List(Times(Part($s("lst"),C1),Part(u,C2)),Power(Part($s("lst"),C2),Part(u,C2)))),If(And(SameQ(Part(u,C1),x),FreeQ(Part(u,C2),x)),List(Part(u,C2),C1),List(C0,u))),If(ProductQ(u),With(List(Set($s("lst1"),MonomialFactor(First(u),x)),Set($s("lst2"),MonomialFactor(Rest(u),x))),List(Plus(Part($s("lst1"),C1),Part($s("lst2"),C1)),Times(Part($s("lst1"),C2),Part($s("lst2"),C2)))),If(SumQ(u),Module(List($s("lst"),$s("deg")),CompoundExpression(Set($s("lst"),Map(Function(MonomialFactor(Slot1,x)),Apply($s("List"),u))),Set($s("deg"),Part($s("lst"),C1,C1)),Scan(Function(Set($s("deg"),MinimumDegree($s("deg"),Part(Slot1,C1)))),Rest($s("lst"))),If(Or(EqQ($s("deg"),C0),And(RationalQ($s("deg")),Less($s("deg"),C0))),List(C0,u),List($s("deg"),Apply(Plus,Map(Function(Times(Power(x,Plus(Part(Slot1,C1),Negate($s("deg")))),Part(Slot1,C2))),$s("lst"))))))),List(C0,u)))))),
ISetDelayed(288,MinimumDegree($p("deg1"),$p("deg2")),
    If(RationalQ($s("deg1")),If(RationalQ($s("deg2")),Min($s("deg1"),$s("deg2")),$s("deg1")),If(RationalQ($s("deg2")),$s("deg2"),With(List(Set($s("deg"),Simplify(Plus($s("deg1"),Negate($s("deg2")))))),If(RationalQ($s("deg")),If(Greater($s("deg"),C0),$s("deg2"),$s("deg1")),If(OrderedQ(List($s("deg1"),$s("deg2"))),$s("deg1"),$s("deg2"))))))),
ISetDelayed(289,ConstantFactor(u_,x_Symbol),
    If(FreeQ(u,x),List(u,C1),If(AtomQ(u),List(C1,u),If(And(PowerQ(u),FreeQ(Part(u,C2),x)),Module(List(Set($s("lst"),ConstantFactor(Part(u,C1),x)),$s("tmp")),If(IntegerQ(Part(u,C2)),List(Power(Part($s("lst"),C1),Part(u,C2)),Power(Part($s("lst"),C2),Part(u,C2))),CompoundExpression(Set($s("tmp"),PositiveFactors(Part($s("lst"),C1))),If(SameQ($s("tmp"),C1),List(C1,u),List(Power($s("tmp"),Part(u,C2)),Power(Times(NonpositiveFactors(Part($s("lst"),C1)),Part($s("lst"),C2)),Part(u,C2))))))),If(ProductQ(u),With(List(Set($s("lst"),Map(Function(ConstantFactor(Slot1,x)),Apply($s("List"),u)))),List(Apply(Times,Map($s("First"),$s("lst"))),Apply(Times,Map(Function(Part(Slot1,C2)),$s("lst"))))),If(SumQ(u),With(List(Set($s("lst1"),Map(Function(ConstantFactor(Slot1,x)),Apply($s("List"),u)))),If(Apply($s("SameQ"),Map(Function(Part(Slot1,C2)),$s("lst1"))),List(Apply(Plus,Map($s("First"),$s("lst1"))),Part($s("lst1"),C1,C2)),With(List(Set($s("lst2"),CommonFactors(Map($s("First"),$s("lst1"))))),List(First($s("lst2")),Apply(Plus,Map2(Times,Rest($s("lst2")),Map(Function(Part(Slot1,C2)),$s("lst1")))))))),List(C1,u))))))),
ISetDelayed(290,PositiveFactors(u_),
    If(EqQ(u,C0),C1,If(RationalQ(u),Abs(u),If(GtQ(u,C0),u,If(ProductQ(u),Map($rubi("PositiveFactors"),u),C1))))),
ISetDelayed(291,NonpositiveFactors(u_),
    If(EqQ(u,C0),u,If(RationalQ(u),Sign(u),If(GtQ(u,C0),C1,If(ProductQ(u),Map($rubi("NonpositiveFactors"),u),u))))),
ISetDelayed(292,PolynomialInQ(u_,v_,x_Symbol),
    PolynomialInAuxQ(u,NonfreeFactors(NonfreeTerms(v,x),x),x)),
ISetDelayed(293,PolynomialInAuxQ(u_,v_,x_),
    If(SameQ(u,v),True,If(AtomQ(u),UnsameQ(u,x),If(PowerQ(u),If(And(PowerQ(v),SameQ(Part(u,C1),Part(v,C1))),IGtQ(Times(Part(u,C2),Power(Part(v,C2),-1)),C0),And(IGtQ(Part(u,C2),C0),PolynomialInAuxQ(Part(u,C1),v,x))),If(Or(SumQ(u),ProductQ(u)),Catch(CompoundExpression(Scan(Function(If(Not(PolynomialInAuxQ(Slot1,v,x)),Throw(False))),u),True)),False))))),
ISetDelayed(294,ExponentIn(u_,v_,x_Symbol),
    ExponentInAux(u,NonfreeFactors(NonfreeTerms(v,x),x),x)),
ISetDelayed(295,ExponentInAux(u_,v_,x_),
    If(SameQ(u,v),C1,If(AtomQ(u),C0,If(PowerQ(u),If(And(PowerQ(v),SameQ(Part(u,C1),Part(v,C1))),Times(Part(u,C2),Power(Part(v,C2),-1)),Times(Part(u,C2),ExponentInAux(Part(u,C1),v,x))),If(ProductQ(u),Apply(Plus,Map(Function(ExponentInAux(Slot1,v,x)),Apply($s("List"),u))),Apply($s("Max"),Map(Function(ExponentInAux(Slot1,v,x)),Apply($s("List"),u)))))))),
ISetDelayed(296,PolynomialInSubst(u_,v_,x_Symbol),
    With(List(Set(w,NonfreeTerms(v,x))),ReplaceAll(PolynomialInSubstAux(u,NonfreeFactors(w,x),x),List(Rule(x,Times(Plus(x,Negate(FreeTerms(v,x))),Power(FreeFactors(w,x),-1))))))),
ISetDelayed(297,PolynomialInSubstAux(u_,v_,x_),
    If(SameQ(u,v),x,If(AtomQ(u),u,If(PowerQ(u),If(And(PowerQ(v),SameQ(Part(u,C1),Part(v,C1))),Power(x,Times(Part(u,C2),Power(Part(v,C2),-1))),Power(PolynomialInSubstAux(Part(u,C1),v,x),Part(u,C2))),Map(Function(PolynomialInSubstAux(Slot1,v,x)),u))))),
ISetDelayed(298,PolynomialDivide(u_,v_,x_Symbol),
    Module(List(Set($s("quo"),PolynomialQuotient(u,v,x)),Set($s("rem"),PolynomialRemainder(u,v,x)),$s("free"),$s("monomial")),CompoundExpression(Set($s("quo"),Apply(Plus,Map(Function(Simp(Together(Times(Coefficient($s("quo"),x,Slot1),Power(x,Slot1))),x)),Exponent($s("quo"),x,$s("List"))))),Set($s("rem"),Together($s("rem"))),Set($s("free"),FreeFactors($s("rem"),x)),Set($s("rem"),NonfreeFactors($s("rem"),x)),Set($s("monomial"),Power(x,Exponent($s("rem"),x,$s("Min")))),If(NegQ(Coefficient($s("rem"),x,C0)),Set($s("monomial"),Negate($s("monomial")))),Set($s("rem"),Apply(Plus,Map(Function(Simp(Together(Times(Coefficient($s("rem"),x,Slot1),Power(x,Slot1),Power($s("monomial"),-1))),x)),Exponent($s("rem"),x,$s("List"))))),If(BinomialQ(v,x),Plus($s("quo"),Times($s("free"),$s("monomial"),$s("rem"),Power(ExpandToSum(v,x),-1))),Plus($s("quo"),Times($s("free"),$s("monomial"),$s("rem"),Power(v,-1))))))),
ISetDelayed(299,PolynomialDivide(u_,v_,w_,x_Symbol),
    ReplaceAll(PolynomialDivide(PolynomialInSubst(u,w,x),PolynomialInSubst(v,w,x),x),List(Rule(x,w))))
  );
}
