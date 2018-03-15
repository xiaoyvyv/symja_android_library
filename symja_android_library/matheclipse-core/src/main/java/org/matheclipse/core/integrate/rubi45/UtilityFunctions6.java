package org.matheclipse.core.integrate.rubi45;


import org.matheclipse.core.interfaces.IAST;

import static org.matheclipse.core.expression.F.*;
import static org.matheclipse.core.expression.F.Integer;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.BinomialQ;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.CalculusQ;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.CancelCommonFactors;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.DerivativeDivides;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.Dist;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.Divides;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.EasyDQ;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.F;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.FixInertTrigFunction;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.FixIntRule;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.FixRhsIntRule;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.FreeFactors;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.FreeTerms;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.G;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.H;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.InertReciprocalQ;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.InertTrigSumQ;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.Int;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.IntSum;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.IntTerm;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.KnownCotangentIntegrandQ;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.KnownSecantIntegrandQ;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.KnownSineIntegrandQ;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.KnownTangentIntegrandQ;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.KnownTrigIntegrandQ;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.LinearQ;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.NegQ;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.NegativeOrZeroQ;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.NegativeQ;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.NonfreeFactors;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.NonfreeTerms;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.NonnumericFactors;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.NonzeroQ;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.NumericFactor;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.PiecewiseLinearQ;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.PosQ;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.PositiveQ;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.PowerQ;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.ProductOfLinearPowersQ;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.ProductQ;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.RationalFunctionExponents;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.RationalFunctionQ;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.RationalQ;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.RemoveContent;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.Rt;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.RtAux;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.Simp;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.SimplerIntegrandQ;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.SimplerQ;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.SimplerSqrtQ;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.SumQ;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.SumSimplerAuxQ;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.SumSimplerQ;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.TogetherSimplify;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.ZeroQ;
/** 
 * UtilityFunctions rules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class UtilityFunctions6 { 
  public static IAST RULES = List( 
ISetDelayed(FixInertTrigFunction(Times(u_DEFAULT,Power(Plus(Times(b_DEFAULT,$($s("§cos"),v_)),Times(a_DEFAULT,$($s("§sin"),v_))),n_DEFAULT),Power($($s("§csc"),v_),m_DEFAULT)),x_),
    Condition(FixInertTrigFunction(Times(u,Power($($s("§sin"),v),Negate(m)),Power(Plus(Times(a,$($s("§sin"),v)),Times(b,$($s("§cos"),v))),n)),x),And(FreeQ(List(a,b,n),x),IntegerQ(m)))),
ISetDelayed(FixInertTrigFunction(Times(Plus(A_DEFAULT,Times(C_DEFAULT,Sqr($(g_,v_))),Times(B_DEFAULT,$(g_,v_))),Power($(f_,v_),m_DEFAULT)),x_),
    Condition(Times(Power($(g,v),Negate(m)),Plus(ASymbol,Times(BSymbol,$(g,v)),Times(CSymbol,Sqr($(g,v))))),And(And(FreeQ(List(ASymbol,BSymbol,CSymbol),x),IntegerQ(m)),Or(InertReciprocalQ(f,g),InertReciprocalQ(g,f))))),
ISetDelayed(FixInertTrigFunction(Times(Plus(A_DEFAULT,Times(C_DEFAULT,Sqr($(g_,v_)))),Power($(f_,v_),m_DEFAULT)),x_),
    Condition(Times(Power($(g,v),Negate(m)),Plus(ASymbol,Times(CSymbol,Sqr($(g,v))))),And(And(FreeQ(List(ASymbol,CSymbol),x),IntegerQ(m)),Or(InertReciprocalQ(f,g),InertReciprocalQ(g,f))))),
ISetDelayed(FixInertTrigFunction(Times(Plus(A_DEFAULT,Times(C_DEFAULT,Sqr($(g_,v_))),Times(B_DEFAULT,$(g_,v_))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$(g_,v_))),n_DEFAULT),Power($(f_,v_),m_DEFAULT)),x_),
    Condition(Times(Power($(g,v),Negate(m)),Plus(ASymbol,Times(BSymbol,$(g,v)),Times(CSymbol,Sqr($(g,v)))),Power(Plus(a,Times(b,$(g,v))),n)),And(And(FreeQ(List(a,b,ASymbol,BSymbol,CSymbol,n),x),IntegerQ(m)),Or(InertReciprocalQ(f,g),InertReciprocalQ(g,f))))),
ISetDelayed(FixInertTrigFunction(Times(Plus(A_DEFAULT,Times(C_DEFAULT,Sqr($(g_,v_)))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$(g_,v_))),n_DEFAULT),Power($(f_,v_),m_DEFAULT)),x_),
    Condition(Times(Power($(g,v),Negate(m)),Plus(ASymbol,Times(CSymbol,Sqr($(g,v)))),Power(Plus(a,Times(b,$(g,v))),n)),And(And(FreeQ(List(a,b,ASymbol,CSymbol,n),x),IntegerQ(m)),Or(InertReciprocalQ(f,g),InertReciprocalQ(g,f))))),
ISetDelayed(FixInertTrigFunction(u_,x_),
    u),
ISetDelayed(InertTrigSumQ(u_,$p("func"),x_),
    Or(MatchQ(u,Condition(Power(Plus(a_,Times(b_DEFAULT,Power(Times(c_DEFAULT,$($s("func"),w_)),p_DEFAULT))),n_DEFAULT),FreeQ(List(a,b,c,n,p),x))),MatchQ(u,Condition(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(Times(d_DEFAULT,$($s("func"),w_)),p_DEFAULT)),Times(c_DEFAULT,Power(Times(d_DEFAULT,$($s("func"),w_)),q_DEFAULT))),n_DEFAULT),FreeQ(List(a,b,c,d,n,p,q),x))))),
ISetDelayed(KnownSineIntegrandQ(u_,x_Symbol),
    KnownTrigIntegrandQ(List($s("§sin"),$s("§cos")),u,x)),
ISetDelayed(KnownTangentIntegrandQ(u_,x_Symbol),
    KnownTrigIntegrandQ(List($s("§tan")),u,x)),
ISetDelayed(KnownCotangentIntegrandQ(u_,x_Symbol),
    KnownTrigIntegrandQ(List($s("§cot")),u,x)),
ISetDelayed(KnownSecantIntegrandQ(u_,x_Symbol),
    KnownTrigIntegrandQ(List($s("§sec"),$s("§csc")),u,x)),
ISetDelayed(KnownTrigIntegrandQ($p("§list"),u_,x_Symbol),
    Or(Or(Or(Or(Or(Or(SameQ(u,C1),MatchQ(u,Condition(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($p("func"),Plus(e_DEFAULT,Times(f_DEFAULT,x))))),m_DEFAULT),And(MemberQ($s("§list"),$s("func")),FreeQ(List(a,b,e,f,m),x))))),MatchQ(u,Condition(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($p("func"),Plus(e_DEFAULT,Times(f_DEFAULT,x))))),m_DEFAULT),Plus(A_DEFAULT,Times(B_DEFAULT,$($p("func"),Plus(e_DEFAULT,Times(f_DEFAULT,x)))))),And(MemberQ($s("§list"),$s("func")),FreeQ(List(a,b,e,f,ASymbol,BSymbol,m),x))))),MatchQ(u,Condition(Plus(A_DEFAULT,Times(C_DEFAULT,Sqr($($p("func"),Plus(e_DEFAULT,Times(f_DEFAULT,x)))))),And(MemberQ($s("§list"),$s("func")),FreeQ(List(e,f,ASymbol,CSymbol),x))))),MatchQ(u,Condition(Plus(A_DEFAULT,Times(B_DEFAULT,$($p("func"),Plus(e_DEFAULT,Times(f_DEFAULT,x)))),Times(C_DEFAULT,Sqr($($p("func"),Plus(e_DEFAULT,Times(f_DEFAULT,x)))))),And(MemberQ($s("§list"),$s("func")),FreeQ(List(e,f,ASymbol,BSymbol,CSymbol),x))))),MatchQ(u,Condition(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($p("func"),Plus(e_DEFAULT,Times(f_DEFAULT,x))))),m_DEFAULT),Plus(A_DEFAULT,Times(C_DEFAULT,Sqr($($p("func"),Plus(e_DEFAULT,Times(f_DEFAULT,x))))))),And(MemberQ($s("§list"),$s("func")),FreeQ(List(a,b,e,f,ASymbol,CSymbol,m),x))))),MatchQ(u,Condition(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($p("func"),Plus(e_DEFAULT,Times(f_DEFAULT,x))))),m_DEFAULT),Plus(A_DEFAULT,Times(B_DEFAULT,$($p("func"),Plus(e_DEFAULT,Times(f_DEFAULT,x)))),Times(C_DEFAULT,Sqr($($p("func"),Plus(e_DEFAULT,Times(f_DEFAULT,x))))))),And(MemberQ($s("§list"),$s("func")),FreeQ(List(a,b,e,f,ASymbol,BSymbol,CSymbol,m),x)))))),
ISetDelayed(PiecewiseLinearQ(u_,v_,x_Symbol),
    And(PiecewiseLinearQ(u,x),PiecewiseLinearQ(v,x))),
ISetDelayed(PiecewiseLinearQ(u_,x_Symbol),
    Or(Or(LinearQ(u,x),MatchQ(u,Condition(Log(Times(c_DEFAULT,Power(F_,v_))),And(FreeQ(List(FSymbol,c),x),LinearQ(v,x))))),MatchQ(u,Condition($(F_,$(G_,v_)),And(LinearQ(v,x),MemberQ(List(List($s("ArcTanh"),$s("Tanh")),List($s("ArcTanh"),$s("Coth")),List($s("ArcCoth"),$s("Coth")),List($s("ArcCoth"),$s("Tanh")),List($s("ArcTan"),$s("Tan")),List($s("ArcTan"),$s("Cot")),List($s("ArcCot"),$s("Cot")),List($s("ArcCot"),$s("Tan"))),List(FSymbol,GSymbol))))))),
ISetDelayed(Divides(y_,u_,x_Symbol),
    Module(List(Set(v,Simplify(Times(u,Power(y,-1))))),If(FreeQ(v,x),v,False))),
ISetDelayed(DerivativeDivides(y_,u_,x_Symbol),
    If(MatchQ(y,Condition(Times(a_DEFAULT,x),FreeQ(a,x))),False,If(If(PolynomialQ(y,x),And(PolynomialQ(u,x),Equal(Exponent(u,x),Plus(Exponent(y,x),Negate(C1)))),EasyDQ(y,x)),Module(List(Set(v,Block(List(Set($s("§showsteps"),False)),D(y,x)))),If(ZeroQ(v),False,CompoundExpression(Set(v,Simplify(Times(u,Power(v,-1)))),If(FreeQ(v,x),v,False)))),False))),
ISetDelayed(EasyDQ(Times(u_DEFAULT,Power(x_,m_DEFAULT)),x_Symbol),
    Condition(EasyDQ(u,x),FreeQ(m,x))),
ISetDelayed(EasyDQ(u_,x_Symbol),
    If(Or(Or(AtomQ(u),FreeQ(u,x)),Equal(Length(u),C0)),True,If(CalculusQ(u),False,If(Equal(Length(u),C1),EasyDQ(Part(u,C1),x),If(Or(BinomialQ(u,x),ProductOfLinearPowersQ(u,x)),True,If(And(RationalFunctionQ(u,x),SameQ(RationalFunctionExponents(u,x),List(C1,C1))),True,If(ProductQ(u),If(FreeQ(First(u),x),EasyDQ(Rest(u),x),If(FreeQ(Rest(u),x),EasyDQ(First(u),x),False)),If(SumQ(u),And(EasyDQ(First(u),x),EasyDQ(Rest(u),x)),If(Equal(Length(u),C2),If(FreeQ(Part(u,C1),x),EasyDQ(Part(u,C2),x),If(FreeQ(Part(u,C2),x),EasyDQ(Part(u,C1),x),False)),False))))))))),
ISetDelayed(ProductOfLinearPowersQ(u_,x_Symbol),
    Or(Or(FreeQ(u,x),MatchQ(u,Condition(Power(v_,n_DEFAULT),And(LinearQ(v,x),FreeQ(n,x))))),And(And(ProductQ(u),ProductOfLinearPowersQ(First(u),x)),ProductOfLinearPowersQ(Rest(u),x)))),
ISetDelayed(Rt(u_,$p(n, Integer)),
    RtAux(TogetherSimplify(u),n)),
ISetDelayed(RtAux(Complex(a_,b_),n_),
    Condition(Power(RtAux(Plus(Times(a,Power(Plus(Sqr(a),Sqr(b)),-1)),Times(CN1,b,Power(Plus(Sqr(a),Sqr(b)),-1),CI)),n),-1),And(And(And(RationalQ(a,b),Or(Not(IntegerQ(a)),Not(IntegerQ(b)))),IntegerQ(Times(a,Power(Plus(Sqr(a),Sqr(b)),-1)))),IntegerQ(Times(b,Power(Plus(Sqr(a),Sqr(b)),-1)))))),
ISetDelayed(RtAux(Negate(Power(v_,m_)),n_),
    Condition(Power(RtAux(Negate(v),n),m),And(And(OddQ(m),SumQ(v)),Less(NumericFactor(Part(v,C1)),C0)))),
ISetDelayed(RtAux(Times(u_DEFAULT,Power(v_,m_DEFAULT),Power(w_,p_DEFAULT)),n_),
    Condition(Times(RtAux(u,n),Power(RtAux(Negate(v),n),m),Power(RtAux(Negate(w),n),p)),And(And(And(And(And(And(OddQ(m),OddQ(p)),SumQ(v)),SumQ(w)),Less(NumericFactor(Part(v,C1)),C0)),SumQ(w)),Less(NumericFactor(Part(w,C1)),C0)))),
ISetDelayed(RtAux(Times(CN1,u_,Power(v_,m_DEFAULT)),n_),
    Condition(Times(RtAux(u,n),RtAux(Negate(Power(v,m)),n)),And(And(And(EvenQ(n),OddQ(m)),SumQ(v)),Less(NumericFactor(Part(v,C1)),C0)))),
ISetDelayed(RtAux(Power(u_,m_),n_),
    Condition(Power(RtAux(Power(u,Negate(m)),n),-1),And(RationalQ(m),Less(m,C0)))),
ISetDelayed(RtAux(Negate(Power(u_,m_)),n_),
    Condition(Power(RtAux(Negate(Power(u,Negate(m))),n),-1),And(RationalQ(m),Less(m,C0)))),
ISetDelayed(RtAux(Times(v_DEFAULT,Power(u_,w_)),n_),
    Condition(Module(List(Set(m,Numerator(NumericFactor(w)))),Condition(Times(RtAux(v,n),Power(RtAux(Power(u,Times(w,Power(m,-1))),Times(n,Power(GCD(m,n),-1))),Times(m,Power(GCD(m,n),-1)))),Greater(m,C1))),Not(NegativeOrZeroQ(v)))),
ISetDelayed(RtAux(u_,n_),
    Condition(Module(List(i),Catch(CompoundExpression(CompoundExpression(Do(If(PositiveQ(Part(u,i)),Throw(Times(RtAux(Part(u,i),n),RtAux(Delete(u,i),n)))),List(i,C1,Length(u))),Do(If(And(NegativeQ(Part(u,i)),NonzeroQ(Plus(Part(u,i),C1))),Throw(Times(RtAux(Negate(Part(u,i)),n),RtAux(Negate(Delete(u,i)),n)))),List(i,C1,Length(u)))),If(SameQ(Part(u,C1),CN1),CompoundExpression(CompoundExpression(CompoundExpression(Do(If(And(SumQ(Part(u,i)),Or(NegQ(Part(u,i,C1)),NegQ(Part(u,i,C2)))),Throw(Times(RtAux(Plus(Negate(First(Part(u,i))),Negate(Rest(Part(u,i)))),n),RtAux(Negate(Delete(u,i)),n)))),List(i,C2,Length(u))),Do(If(And(And(And(PowerQ(Part(u,i)),OddQ(Part(u,i,C2))),SumQ(Part(u,i,C1))),Or(NegQ(Part(u,i,C1,C1)),NegQ(Part(u,i,C1,C2)))),Throw(Times(RtAux(Power(Plus(Negate(First(Part(u,i,C1))),Negate(Rest(Part(u,i,C1)))),Part(u,i,C2)),n),RtAux(Negate(Delete(u,i)),n)))),List(i,C2,Length(u)))),Do(If(Or(AtomQ(Part(u,i)),And(And(PowerQ(Part(u,i)),OddQ(Part(u,i,C2))),AtomQ(Part(u,i,C1)))),Throw(Times(RtAux(Negate(Part(u,i)),n),RtAux(Negate(Delete(u,i)),n)))),List(i,C2,Length(u)))),Times(RtAux(Negate(Part(u,C2)),n),RtAux(Drop(u,C2),n))),CompoundExpression(Do(If(Not(FreeQ(Delete(u,i),RtAux(Negate(Part(u,i)),n))),Throw(Times(RtAux(Negate(Part(u,i)),n),RtAux(Negate(Delete(u,i)),n)))),List(i,C1,Length(u))),Map(Function(RtAux(Slot1,n)),u)))))),And(And(ProductQ(u),EvenQ(n)),Not(And(SameQ(Part(u,C1),CN1),Equal(Length(u),C2)))))),
ISetDelayed(RtAux(u_,n_),
    Condition(Map(Function(RtAux(Slot1,n)),u),And(OddQ(n),ProductQ(u)))),
ISetDelayed(RtAux(u_,n_),
    Condition(Negate(RtAux(Negate(u),n)),And(OddQ(n),NegativeQ(u)))),
ISetDelayed(RtAux(u_,n_),
    Power(u,Power(n,-1))),
ISetDelayed(IntSum(u_,x_Symbol),
    Plus(Simp(Times(FreeTerms(u,x),x),x),IntTerm(NonfreeTerms(u,x),x))),
ISetDelayed(IntTerm(Times(c_DEFAULT,Power(v_,-1)),x_Symbol),
    Condition(Simp(Times(c,Log(RemoveContent(v,x)),Power(Coefficient(v,x,C1),-1)),x),And(FreeQ(c,x),LinearQ(v,x)))),
ISetDelayed(IntTerm(Times(c_DEFAULT,Power(v_,m_DEFAULT)),x_Symbol),
    Condition(Simp(Times(c,Power(v,Plus(m,C1)),Power(Times(Coefficient(v,x,C1),Plus(m,C1)),-1)),x),And(And(FreeQ(List(c,m),x),NonzeroQ(Plus(m,C1))),LinearQ(v,x)))),
ISetDelayed(IntTerm(u_,x_Symbol),
    Condition(Map(Function(IntTerm(Slot1,x)),u),SumQ(u))),
ISetDelayed(IntTerm(u_,x_Symbol),
    Dist(FreeFactors(u,x),Int(NonfreeFactors(u,x),x),x)),
ISetDelayed(SimplerQ(u_,v_),
    If(IntegerQ(u),If(IntegerQ(v),If(Equal(Abs(u),Abs(v)),Less(v,C0),Less(Abs(u),Abs(v))),True),If(IntegerQ(v),False,If(SameQ(Head(u),$s("Rational")),If(SameQ(Head(v),$s("Rational")),If(Equal(Denominator(u),Denominator(v)),SimplerQ(Numerator(u),Numerator(v)),Less(Denominator(u),Denominator(v))),True),If(SameQ(Head(v),$s("Rational")),False,If(SameQ(Head(u),$s("Complex")),If(SameQ(Head(v),$s("Complex")),If(Equal(Re(u),Re(v)),SimplerQ(Im(u),Im(v)),SimplerQ(Re(u),Re(v))),False),If(NumberQ(u),If(NumberQ(v),OrderedQ(List(u,v)),True),If(NumberQ(v),False,If(AtomQ(u),If(AtomQ(v),OrderedQ(List(u,v)),True),If(AtomQ(v),False,If(SameQ(Head(u),Head(v)),If(Equal(Length(u),Length(v)),Catch(CompoundExpression(Do(If(SameQ(Part(u,$s("ii")),Part(v,$s("ii"))),Null,Throw(SimplerQ(Part(u,$s("ii")),Part(v,$s("ii"))))),List($s("ii"),Length(u))),False)),Less(Length(u),Length(v))),Less(LeafCount(u),LeafCount(v))))))))))))),
ISetDelayed(SimplerIntegrandQ(u_,v_,x_Symbol),
    Module(List(Set($s("lst"),CancelCommonFactors(u,v)),$s("u1"),$s("v1")),CompoundExpression(CompoundExpression(Set($s("u1"),Part($s("lst"),C1)),Set($s("v1"),Part($s("lst"),C2))),If(Less(LeafCount($s("u1")),Times(QQ(3L,4L),LeafCount($s("v1")))),True,If(RationalFunctionQ($s("u1"),x),If(RationalFunctionQ($s("v1"),x),Less(Apply(Plus,RationalFunctionExponents($s("u1"),x)),Apply(Plus,RationalFunctionExponents($s("v1"),x))),True),False))))),
ISetDelayed(CancelCommonFactors(u_,v_),
    If(ProductQ(u),If(ProductQ(v),If(MemberQ(v,First(u)),CancelCommonFactors(Rest(u),DeleteCases(v,First(u),C1,C1)),$(Function(List(Times(First(u),Part(Slot1,C1)),Part(Slot1,C2))),CancelCommonFactors(Rest(u),v))),If(MemberQ(u,v),List(DeleteCases(u,v,C1,C1),C1),List(u,v))),If(ProductQ(v),If(MemberQ(v,u),List(C1,DeleteCases(v,u,C1,C1)),List(u,v)),List(u,v)))),
ISetDelayed(SumSimplerQ(u_,v_),
    If(RationalQ(u,v),If(Equal(v,C0),False,If(Greater(v,C0),Less(u,CN1),GreaterEqual(u,Negate(v)))),SumSimplerAuxQ(Expand(u),Expand(v)))),
ISetDelayed(SumSimplerAuxQ(u_,v_),
    Condition(And(Or(RationalQ(First(v)),SumSimplerAuxQ(u,First(v))),Or(RationalQ(Rest(v)),SumSimplerAuxQ(u,Rest(v)))),SumQ(v))),
ISetDelayed(SumSimplerAuxQ(u_,v_),
    Condition(Or(SumSimplerAuxQ(First(u),v),SumSimplerAuxQ(Rest(u),v)),SumQ(u))),
ISetDelayed(SumSimplerAuxQ(u_,v_),
    And(And(UnsameQ(v,C0),SameQ(NonnumericFactors(u),NonnumericFactors(v))),Or(Less(Times(NumericFactor(u),Power(NumericFactor(v),-1)),CN1D2),And(Equal(Times(NumericFactor(u),Power(NumericFactor(v),-1)),CN1D2),Less(NumericFactor(u),C0))))),
ISetDelayed(SimplerSqrtQ(u_,v_),
    Module(List(Set($s("sqrtu"),Rt(u,C2)),Set($s("sqrtv"),Rt(v,C2))),If(IntegerQ($s("sqrtu")),If(IntegerQ($s("sqrtv")),Less($s("sqrtu"),$s("sqrtv")),True),If(IntegerQ($s("sqrtv")),False,If(RationalQ($s("sqrtu")),If(RationalQ($s("sqrtv")),Less($s("sqrtu"),$s("sqrtv")),True),If(RationalQ($s("sqrtv")),False,If(PosQ(u),If(PosQ(v),Less(LeafCount($s("sqrtu")),LeafCount($s("sqrtv"))),True),If(PosQ(v),False,Less(LeafCount($s("sqrtu")),LeafCount($s("sqrtv"))))))))))),
ISetDelayed(FixIntRule(RuleDelayed($p("lhs"),$(F_,$(G_,$p("§list"),$(F_,Plus(u_,v_),$p("test2"))),$p("test1"))),x_),
    Condition(ReplacePart(RuleDelayed($s("lhs"),F(G($s("§list"),F(Plus(u,v),$s("test2"))),$s("test1"))),List(Rule(List(C2,C1,C2,C1,C1),FixRhsIntRule(u,x)),Rule(List(C2,C1,C2,C1,C2),FixRhsIntRule(v,x)))),And(SameQ(FSymbol,$s("Condition")),Or(SameQ(GSymbol,$s("Module")),SameQ(GSymbol,$s("Block")))))),
ISetDelayed(FixIntRule(RuleDelayed($p("lhs"),$(G_,$p("§list"),$(F_,Plus(u_,v_),$p("test2")))),x_),
    Condition(ReplacePart(RuleDelayed($s("lhs"),G($s("§list"),F(Plus(u,v),$s("test2")))),List(Rule(List(C2,C2,C1,C1),FixRhsIntRule(u,x)),Rule(List(C2,C2,C1,C2),FixRhsIntRule(v,x)))),And(SameQ(FSymbol,$s("Condition")),Or(SameQ(GSymbol,$s("Module")),SameQ(GSymbol,$s("Block")))))),
ISetDelayed(FixIntRule(RuleDelayed($p("lhs"),$(F_,$(G_,$p("§list"),Plus(u_,v_)),$p("test"))),x_),
    Condition(ReplacePart(RuleDelayed($s("lhs"),F(G($s("§list"),Plus(u,v)),$s("test"))),List(Rule(List(C2,C1,C2,C1),FixRhsIntRule(u,x)),Rule(List(C2,C1,C2,C2),FixRhsIntRule(v,x)))),And(SameQ(FSymbol,$s("Condition")),Or(SameQ(GSymbol,$s("Module")),SameQ(GSymbol,$s("Block")))))),
ISetDelayed(FixIntRule(RuleDelayed($p("lhs"),$(G_,$p("§list"),Plus(u_,v_))),x_),
    Condition(ReplacePart(RuleDelayed($s("lhs"),G($s("§list"),Plus(u,v))),List(Rule(List(C2,C2,C1),FixRhsIntRule(u,x)),Rule(List(C2,C2,C2),FixRhsIntRule(v,x)))),Or(SameQ(GSymbol,$s("Module")),SameQ(GSymbol,$s("Block"))))),
ISetDelayed(FixIntRule(RuleDelayed($p("lhs"),$(F_,Plus(u_,v_),$p("test"))),x_),
    Condition(ReplacePart(RuleDelayed($s("lhs"),F(Plus(u,v),$s("test"))),List(Rule(List(C2,C1,C1),FixRhsIntRule(u,x)),Rule(List(C2,C1,C2),FixRhsIntRule(v,x)))),SameQ(FSymbol,$s("Condition")))),
ISetDelayed(FixIntRule(RuleDelayed($p("lhs"),Plus(u_,v_)),x_),
    ReplacePart(RuleDelayed($s("lhs"),Plus(u,v)),List(Rule(List(C2,C1),FixRhsIntRule(u,x)),Rule(List(C2,C2),FixRhsIntRule(v,x))))),
ISetDelayed(FixIntRule(RuleDelayed($p("lhs"),$(F_,$(G_,$p("list1"),$(F_,$($p("H"),$p("list2"),u_),$p("test2"))),$p("test1"))),x_),
    Condition(ReplacePart(RuleDelayed($s("lhs"),F(G($s("list1"),F(H($s("list2"),u),$s("test2"))),$s("test1"))),Rule(List(C2,C1,C2,C1,C2),FixRhsIntRule(u,x))),And(And(SameQ(FSymbol,$s("Condition")),Or(SameQ(GSymbol,$s("Module")),SameQ(GSymbol,$s("Block")))),Or(SameQ($s("H"),$s("Module")),SameQ($s("H"),$s("Block")))))),
ISetDelayed(FixIntRule(RuleDelayed($p("lhs"),$(F_,$(G_,$p("§list"),$(F_,$($p("H"),$p("str1"),$p("str2"),$p("str3"),$($p("jp"),u_)),$p("test2"))),$p("test1"))),x_),
    Condition(ReplacePart(RuleDelayed($s("lhs"),F(G($s("§list"),F(H($s("str1"),$s("str2"),$s("str3"),$($s("jp"),u)),$s("test2"))),$s("test1"))),Rule(List(C2,C1,C2,C1,C4,C1),FixRhsIntRule(u,x))),And(And(And(SameQ(FSymbol,$s("Condition")),Or(SameQ(GSymbol,$s("Module")),SameQ(GSymbol,$s("Block")))),SameQ($s("H"),$s("§showstep"))),SameQ($s("jp"),$s("Hold"))))),
ISetDelayed(FixIntRule(RuleDelayed($p("lhs"),$(F_,$(G_,$p("§list"),$(F_,u_,$p("test2"))),$p("test1"))),x_),
    Condition(ReplacePart(RuleDelayed($s("lhs"),F(G($s("§list"),F(u,$s("test2"))),$s("test1"))),Rule(List(C2,C1,C2,C1),FixRhsIntRule(u,x))),And(SameQ(FSymbol,$s("Condition")),Or(SameQ(GSymbol,$s("Module")),SameQ(GSymbol,$s("Block")))))),
ISetDelayed(FixIntRule(RuleDelayed($p("lhs"),$(G_,$p("§list"),$(F_,u_,$p("test2")))),x_),
    Condition(ReplacePart(RuleDelayed($s("lhs"),G($s("§list"),F(u,$s("test2")))),Rule(List(C2,C2,C1),FixRhsIntRule(u,x))),And(SameQ(FSymbol,$s("Condition")),Or(SameQ(GSymbol,$s("Module")),SameQ(GSymbol,$s("Block")))))),
ISetDelayed(FixIntRule(RuleDelayed($p("lhs"),$(F_,$(G_,$p("§list"),u_),$p("test"))),x_),
    Condition(ReplacePart(RuleDelayed($s("lhs"),F(G($s("§list"),u),$s("test"))),Rule(List(C2,C1,C2),FixRhsIntRule(u,x))),And(SameQ(FSymbol,$s("Condition")),Or(SameQ(GSymbol,$s("Module")),SameQ(GSymbol,$s("Block")))))),
ISetDelayed(FixIntRule(RuleDelayed($p("lhs"),$(G_,$p("§list"),u_)),x_),
    Condition(ReplacePart(RuleDelayed($s("lhs"),G($s("§list"),u)),Rule(List(C2,C2),FixRhsIntRule(u,x))),Or(SameQ(GSymbol,$s("Module")),SameQ(GSymbol,$s("Block"))))),
ISetDelayed(FixIntRule(RuleDelayed($p("lhs"),$(F_,u_,$p("test"))),x_),
    Condition(ReplacePart(RuleDelayed($s("lhs"),F(u,$s("test"))),Rule(List(C2,C1),FixRhsIntRule(u,x))),SameQ(FSymbol,$s("Condition")))),
ISetDelayed(FixIntRule(RuleDelayed($p("lhs"),u_),x_),
    ReplacePart(RuleDelayed($s("lhs"),u),Rule(List(C2),FixRhsIntRule(u,x)))),
ISetDelayed(FixRhsIntRule(Plus(u_,v_),x_),
    Plus(FixRhsIntRule(u,x),FixRhsIntRule(v,x))),
ISetDelayed(FixRhsIntRule(Plus(u_,Negate(v_)),x_),
    Plus(FixRhsIntRule(u,x),Negate(FixRhsIntRule(v,x)))),
ISetDelayed(FixRhsIntRule(Negate(u_),x_),
    Negate(FixRhsIntRule(u,x))),
ISetDelayed(FixRhsIntRule(Times(a_,u_),x_),
    Condition(Dist(a,u,x),MemberQ(List($s("Int"),$s("Integrate::Subst")),Head(Unevaluated(u))))),
ISetDelayed(FixRhsIntRule(u_,x_),
    If(And(SameQ(Head(Unevaluated(u)),$s("Integrate::Dist")),Equal(Length(Unevaluated(u)),C2)),Insert(Unevaluated(u),x,C3),If(MemberQ(List($s("Int"),$s("Integrate::Subst"),$s("Integrate"),$s("Integrate::Simp"),$s("Integrate::Dist")),Head(Unevaluated(u))),u,Simp(u,x))))
  );
}
