package org.matheclipse.core.integrate.rubi45;


import org.matheclipse.core.interfaces.IAST;

import static org.matheclipse.core.expression.F.*;
import static org.matheclipse.core.expression.F.Integer;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.AlgebraicFunctionFactors;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.AlgebraicFunctionQ;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.BinomialDegree;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.BinomialMatchQ;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.BinomialQ;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.BinomialTest;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.CalculusQ;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.CommonNumericFactors;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.ContentFactor;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.CubicMatchQ;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.ExpandIntegrand;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.FalseQ;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.FractionQ;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.FractionalPowerOfQuotientOfLinears;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.FractionalPowerQ;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.FreeFactors;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.FreeTerms;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.GE;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.GT;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.Gcd;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.GeneralizedBinomialDegree;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.GeneralizedBinomialMatchQ;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.GeneralizedBinomialQ;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.GeneralizedBinomialTest;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.GeneralizedTrinomialDegree;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.GeneralizedTrinomialMatchQ;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.GeneralizedTrinomialQ;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.GeneralizedTrinomialTest;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.IndependentQ;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.IntegerPowerQ;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.IntegersQ;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.InverseFunctionOfQuotientOfLinears;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.InverseFunctionQ;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.LE;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.LinearMatchQ;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.LinearPairQ;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.LinearQ;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.MinimumMonomialExponent;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.MonomialExponent;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.MonomialQ;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.MonomialSumQ;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.NonalgebraicFunctionFactors;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.NonfreeFactors;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.NonfreeTerms;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.NonpolynomialTerms;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.NonrationalFunctionFactors;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.NonzeroQ;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.NotFalseQ;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.NumericFactor;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.PerfectPowerTest;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.PolyQ;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.PolynomialTermQ;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.PolynomialTerms;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.PosQ;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.PowerOfLinearMatchQ;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.PowerOfLinearQ;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.PowerQ;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.ProductQ;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.QuadraticMatchQ;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.QuadraticQ;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.QuotientOfLinearsMatchQ;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.QuotientOfLinearsP;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.QuotientOfLinearsParts;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.QuotientOfLinearsQ;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.RationalFunctionExpand;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.RationalFunctionExponents;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.RationalFunctionFactors;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.RationalFunctionQ;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.RationalPowerQ;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.RationalQ;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.RealNumericQ;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.SplitFreeFactors;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.SubstForFractionalPower;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.SubstForFractionalPowerAuxQ;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.SubstForFractionalPowerOfQuotientOfLinears;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.SubstForFractionalPowerQ;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.SubstForInverseFunction;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.SubstForInverseFunctionOfQuotientOfLinears;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.SumQ;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.TrinomialDegree;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.TrinomialMatchQ;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.TrinomialQ;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.TrinomialTest;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.ZeroQ;
/** 
 * UtilityFunctions rules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class UtilityFunctions1 { 
  public static IAST RULES = List( 
ISetDelayed(LE(u_,v_),
    And(And(RealNumericQ(u),RealNumericQ(v)),LessEqual(Re(N(u)),Re(N(v))))),
ISetDelayed(LE(u_,v_,w_),
    And(LE(u,v),LE(v,w))),
ISetDelayed(GT(u_,v_),
    And(And(RealNumericQ(u),RealNumericQ(v)),Greater(Re(N(u)),Re(N(v))))),
ISetDelayed(GT(u_,v_,w_),
    And(GT(u,v),GT(v,w))),
ISetDelayed(GE(u_,v_),
    And(And(RealNumericQ(u),RealNumericQ(v)),GreaterEqual(Re(N(u)),Re(N(v))))),
ISetDelayed(GE(u_,v_,w_),
    And(GE(u,v),GE(v,w))),
ISetDelayed(IndependentQ(u_,x_),
    FreeQ(u,x)),
ISetDelayed(FreeFactors(u_,x_),
    If(ProductQ(u),Map(Function(If(FreeQ(Slot1,x),Slot1,C1)),u),If(FreeQ(u,x),u,C1))),
ISetDelayed(NonfreeFactors(u_,x_),
    If(ProductQ(u),Map(Function(If(FreeQ(Slot1,x),C1,Slot1)),u),If(FreeQ(u,x),C1,u))),
ISetDelayed(SplitFreeFactors(u_,x_),
    If(ProductQ(u),Map(Function(If(FreeQ(Slot1,x),List(Slot1,C1),List(C1,Slot1))),u),If(FreeQ(u,x),List(u,C1),List(C1,u)))),
ISetDelayed(FreeTerms(u_,x_),
    If(SumQ(u),Map(Function(If(FreeQ(Slot1,x),Slot1,C0)),u),If(FreeQ(u,x),u,C0))),
ISetDelayed(NonfreeTerms(u_,x_),
    If(SumQ(u),Map(Function(If(FreeQ(Slot1,x),C0,Slot1)),u),If(FreeQ(u,x),C0,u))),
ISetDelayed(LinearQ(u_,x_Symbol),
    PolyQ(u,x,C1)),
ISetDelayed(PowerOfLinearQ(Power(u_,m_DEFAULT),x_Symbol),
    And(And(FreeQ(m,x),PolynomialQ(u,x)),If(IntegerQ(m),MatchQ(FactorSquareFree(u),Condition(Power(w_,n_DEFAULT),And(FreeQ(n,x),LinearQ(w,x)))),LinearQ(u,x)))),
ISetDelayed(QuadraticQ(u_,x_Symbol),
    PolyQ(u,x,C2)),
ISetDelayed(PolyQ(u_,x_Symbol,$p(n, Integer)),
    If(ListQ(u),Catch(CompoundExpression(Scan(Function(If(Not(PolyQ(Slot1,x,n)),Throw(False))),u),True)),And(And(PolynomialQ(u,x),Equal(Exponent(u,x),n)),UnsameQ(Coefficient(u,x,n),C0)))),
ISetDelayed(LinearPairQ(u_,v_,x_Symbol),
    And(And(And(LinearQ(u,x),LinearQ(v,x)),NonzeroQ(Plus(u,Negate(x)))),ZeroQ(Plus(Times(Coefficient(u,x,C0),Coefficient(v,x,C1)),Times(CN1,Coefficient(u,x,C1),Coefficient(v,x,C0)))))),
ISetDelayed(BinomialQ(u_,x_Symbol),
    If(ListQ(u),Catch(CompoundExpression(Scan(Function(If(Not(BinomialQ(Slot1,x)),Throw(False))),u),True)),NotFalseQ(BinomialTest(u,x)))),
ISetDelayed(BinomialQ(u_,x_Symbol,n_),
    If(ListQ(u),Catch(CompoundExpression(Scan(Function(If(Not(BinomialQ(Slot1,x,n)),Throw(False))),u),True)),$(Function(And(NotFalseQ(Slot1),SameQ(Part(Slot1,C3),n))),BinomialTest(u,x)))),
ISetDelayed(GeneralizedBinomialQ(u_,x_Symbol),
    If(ListQ(u),Catch(CompoundExpression(Scan(Function(If(Not(GeneralizedBinomialQ(Slot1,x)),Throw(False))),u),True)),NotFalseQ(GeneralizedBinomialTest(u,x)))),
ISetDelayed(TrinomialQ(u_,x_Symbol),
    If(ListQ(u),Catch(CompoundExpression(Scan(Function(If(Not(TrinomialQ(Slot1,x)),Throw(False))),u),True)),And(And(NotFalseQ(TrinomialTest(u,x)),Not(QuadraticQ(u,x))),Not(MatchQ(u,Condition(Sqr(w_),BinomialQ(w,x))))))),
ISetDelayed(GeneralizedTrinomialQ(u_,x_Symbol),
    If(ListQ(u),Catch(CompoundExpression(Scan(Function(If(Not(GeneralizedTrinomialQ(Slot1,x)),Throw(False))),u),True)),NotFalseQ(GeneralizedTrinomialTest(u,x)))),
ISetDelayed(MonomialQ(u_,x_Symbol),
    If(ListQ(u),Catch(CompoundExpression(Scan(Function(If(MonomialQ(Slot1,x),Null,Throw(False))),u),True)),MatchQ(u,Condition(Times(a_DEFAULT,Power(x,n_DEFAULT)),FreeQ(List(a,n),x))))),
ISetDelayed(MonomialSumQ(u_,x_Symbol),
    And(SumQ(u),Catch(CompoundExpression(Scan(Function(If(Or(FreeQ(Slot1,x),MonomialQ(Slot1,x)),Null,Throw(False))),u),True)))),
ISetDelayed(MinimumMonomialExponent(u_,x_Symbol),
    Module(List(Set(n,MonomialExponent(First(u),x))),CompoundExpression(Scan(Function(If(PosQ(Plus(n,Negate(MonomialExponent(Slot1,x)))),Set(n,MonomialExponent(Slot1,x)))),u),n))),
ISetDelayed(MonomialExponent(Times(a_DEFAULT,Power(x_,n_DEFAULT)),x_Symbol),
    Condition(n,FreeQ(List(a,n),x))),
ISetDelayed(LinearMatchQ(u_,x_Symbol),
    If(ListQ(u),Catch(CompoundExpression(Scan(Function(If(Not(LinearMatchQ(Slot1,x)),Throw(False))),u),True)),MatchQ(u,Condition(Plus(a_DEFAULT,Times(b_DEFAULT,x)),FreeQ(List(a,b),x))))),
ISetDelayed(PowerOfLinearMatchQ(u_,x_Symbol),
    If(ListQ(u),Catch(CompoundExpression(Scan(Function(If(Not(PowerOfLinearMatchQ(Slot1,x)),Throw(False))),u),True)),MatchQ(u,Condition(Power(Plus(a_DEFAULT,Times(b_DEFAULT,x)),m_DEFAULT),FreeQ(List(a,b,m),x))))),
ISetDelayed(QuadraticMatchQ(u_,x_Symbol),
    If(ListQ(u),Catch(CompoundExpression(Scan(Function(If(Not(QuadraticMatchQ(Slot1,x)),Throw(False))),u),True)),Or(MatchQ(u,Condition(Plus(a_DEFAULT,Times(b_DEFAULT,x),Times(c_DEFAULT,Sqr(x))),FreeQ(List(a,b,c),x))),MatchQ(u,Condition(Plus(a_DEFAULT,Times(c_DEFAULT,Sqr(x))),FreeQ(List(a,c),x)))))),
ISetDelayed(CubicMatchQ(u_,x_Symbol),
    If(ListQ(u),Catch(CompoundExpression(Scan(Function(If(Not(CubicMatchQ(Slot1,x)),Throw(False))),u),True)),Or(Or(Or(MatchQ(u,Condition(Plus(a_DEFAULT,Times(b_DEFAULT,x),Times(c_DEFAULT,Sqr(x)),Times(d_DEFAULT,Power(x,3))),FreeQ(List(a,b,c,d),x))),MatchQ(u,Condition(Plus(a_DEFAULT,Times(b_DEFAULT,x),Times(d_DEFAULT,Power(x,3))),FreeQ(List(a,b,d),x)))),MatchQ(u,Condition(Plus(a_DEFAULT,Times(c_DEFAULT,Sqr(x)),Times(d_DEFAULT,Power(x,3))),FreeQ(List(a,c,d),x)))),MatchQ(u,Condition(Plus(a_DEFAULT,Times(d_DEFAULT,Power(x,3))),FreeQ(List(a,d),x)))))),
ISetDelayed(BinomialMatchQ(u_,x_Symbol),
    If(ListQ(u),Catch(CompoundExpression(Scan(Function(If(Not(BinomialMatchQ(Slot1,x)),Throw(False))),u),True)),MatchQ(u,Condition(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x,n_DEFAULT))),FreeQ(List(a,b,n),x))))),
ISetDelayed(GeneralizedBinomialMatchQ(u_,x_Symbol),
    If(ListQ(u),Catch(CompoundExpression(Scan(Function(If(Not(GeneralizedBinomialMatchQ(Slot1,x)),Throw(False))),u),True)),MatchQ(u,Condition(Plus(Times(a_DEFAULT,Power(x,q_DEFAULT)),Times(b_DEFAULT,Power(x,n_DEFAULT))),FreeQ(List(a,b,n,q),x))))),
ISetDelayed(TrinomialMatchQ(u_,x_Symbol),
    If(ListQ(u),Catch(CompoundExpression(Scan(Function(If(Not(TrinomialMatchQ(Slot1,x)),Throw(False))),u),True)),MatchQ(u,Condition(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x,n_DEFAULT)),Times(c_DEFAULT,Power(x,j_DEFAULT))),And(FreeQ(List(a,b,c,n),x),ZeroQ(Plus(j,Times(CN1,C2,n)))))))),
ISetDelayed(GeneralizedTrinomialMatchQ(u_,x_Symbol),
    If(ListQ(u),Catch(CompoundExpression(Scan(Function(If(Not(GeneralizedTrinomialMatchQ(Slot1,x)),Throw(False))),u),True)),MatchQ(u,Condition(Plus(Times(a_DEFAULT,Power(x,q_DEFAULT)),Times(b_DEFAULT,Power(x,n_DEFAULT)),Times(c_DEFAULT,Power(x,r_DEFAULT))),And(FreeQ(List(a,b,c,n,q),x),ZeroQ(Plus(r,Negate(Plus(Times(C2,n),Negate(q)))))))))),
ISetDelayed(QuotientOfLinearsMatchQ(u_,x_Symbol),
    If(ListQ(u),Catch(CompoundExpression(Scan(Function(If(Not(QuotientOfLinearsMatchQ(Slot1,x)),Throw(False))),u),True)),MatchQ(u,Condition(Times(e_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x)),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x)),-1)),FreeQ(List(a,b,c,d,e),x))))),
ISetDelayed(PolynomialTermQ(u_,x_Symbol),
    Or(FreeQ(u,x),MatchQ(u,Condition(Times(a_DEFAULT,Power(x,n_DEFAULT)),And(And(FreeQ(a,x),IntegerQ(n)),Greater(n,C0)))))),
ISetDelayed(PolynomialTerms(u_,x_Symbol),
    Map(Function(If(PolynomialTermQ(Slot1,x),Slot1,C0)),u)),
ISetDelayed(NonpolynomialTerms(u_,x_Symbol),
    Map(Function(If(PolynomialTermQ(Slot1,x),C0,Slot1)),u)),
ISetDelayed(BinomialDegree(u_,x_Symbol),
    Part(BinomialTest(u,x),C3)),
ISetDelayed(BinomialTest(u_,x_Symbol),
    If(PolynomialQ(u,x),If(Greater(Exponent(u,x),C0),Module(List(Set($s("lst"),Exponent(u,x,$s("List")))),If(Equal(Length($s("lst")),C1),List(C0,Coefficient(u,x,Exponent(u,x)),Exponent(u,x)),If(And(Equal(Length($s("lst")),C2),Equal(Part($s("lst"),C1),C0)),List(Coefficient(u,x,C0),Coefficient(u,x,Exponent(u,x)),Exponent(u,x)),False))),False),If(PowerQ(u),If(And(SameQ(Part(u,C1),x),FreeQ(Part(u,C2),x)),List(C0,C1,Part(u,C2)),False),Module(List($s("lst1"),$s("lst2")),If(ProductQ(u),If(FreeQ(First(u),x),CompoundExpression(Set($s("lst2"),BinomialTest(Rest(u),x)),If(FalseQ($s("lst2")),False,List(Times(First(u),Part($s("lst2"),C1)),Times(First(u),Part($s("lst2"),C2)),Part($s("lst2"),C3)))),If(FreeQ(Rest(u),x),CompoundExpression(Set($s("lst1"),BinomialTest(First(u),x)),If(FalseQ($s("lst1")),False,List(Times(Rest(u),Part($s("lst1"),C1)),Times(Rest(u),Part($s("lst1"),C2)),Part($s("lst1"),C3)))),CompoundExpression(CompoundExpression(Set($s("lst1"),BinomialTest(First(u),x)),Set($s("lst2"),BinomialTest(Rest(u),x))),If(Or(FalseQ($s("lst1")),FalseQ($s("lst2"))),False,Module(List(a,b,c,d,m,n),CompoundExpression(CompoundExpression(Set(List(a,b,m),$s("lst1")),Set(List(c,d,n),$s("lst2"))),If(ZeroQ(a),If(ZeroQ(c),List(C0,Times(b,d),Plus(m,n)),If(ZeroQ(Plus(m,n)),List(Times(b,d),Times(b,c),m),False)),If(ZeroQ(c),If(ZeroQ(Plus(m,n)),List(Times(b,d),Times(a,d),n),False),If(And(ZeroQ(Plus(m,Negate(n))),ZeroQ(Plus(Times(a,d),Times(b,c)))),List(Times(a,c),Times(b,d),Times(C2,m)),False))))))))),If(SumQ(u),If(FreeQ(First(u),x),CompoundExpression(Set($s("lst2"),BinomialTest(Rest(u),x)),If(FalseQ($s("lst2")),False,List(Plus(First(u),Part($s("lst2"),C1)),Part($s("lst2"),C2),Part($s("lst2"),C3)))),If(FreeQ(Rest(u),x),CompoundExpression(Set($s("lst1"),BinomialTest(First(u),x)),If(FalseQ($s("lst1")),False,List(Plus(Rest(u),Part($s("lst1"),C1)),Part($s("lst1"),C2),Part($s("lst1"),C3)))),CompoundExpression(CompoundExpression(Set($s("lst1"),BinomialTest(First(u),x)),Set($s("lst2"),BinomialTest(Rest(u),x))),If(Or(FalseQ($s("lst1")),FalseQ($s("lst2"))),False,If(ZeroQ(Plus(Part($s("lst1"),C3),Negate(Part($s("lst2"),C3)))),List(Plus(Part($s("lst1"),C1),Part($s("lst2"),C1)),Plus(Part($s("lst1"),C2),Part($s("lst2"),C2)),Part($s("lst1"),C3)),False))))),False)))))),
ISetDelayed(GeneralizedBinomialDegree(u_,x_Symbol),
    $(Function(Plus(Part(Slot1,C3),Negate(Part(Slot1,C4)))),GeneralizedBinomialTest(u,x))),
ISetDelayed(GeneralizedBinomialTest(Plus(Times(b_DEFAULT,Power(x_,n_DEFAULT)),Times(a_DEFAULT,Power(x_,q_DEFAULT))),x_Symbol),
    Condition(List(a,b,n,q),And(FreeQ(List(a,b,n,q),x),PosQ(Plus(n,Negate(q)))))),
ISetDelayed(GeneralizedBinomialTest(Times(a_,u_),x_Symbol),
    Condition(Module(List(Set($s("lst"),GeneralizedBinomialTest(u,x))),Condition(List(Times(a,Part($s("lst"),C1)),Times(a,Part($s("lst"),C2)),Part($s("lst"),C3),Part($s("lst"),C4)),NotFalseQ($s("lst")))),FreeQ(a,x))),
ISetDelayed(GeneralizedBinomialTest(Times(u_,Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Module(List(Set($s("lst"),GeneralizedBinomialTest(u,x))),Condition(List(Part($s("lst"),C1),Part($s("lst"),C2),Plus(m,Part($s("lst"),C3)),Plus(m,Part($s("lst"),C4))),And(And(NotFalseQ($s("lst")),NonzeroQ(Plus(m,Part($s("lst"),C3)))),NonzeroQ(Plus(m,Part($s("lst"),C4)))))),FreeQ(m,x))),
ISetDelayed(GeneralizedBinomialTest(Times(u_,Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Module(List(Set($s("lst"),BinomialTest(u,x))),Condition(List(Part($s("lst"),C1),Part($s("lst"),C2),Plus(m,Part($s("lst"),C3)),m),And(NotFalseQ($s("lst")),NonzeroQ(Plus(m,Part($s("lst"),C3)))))),FreeQ(m,x))),
ISetDelayed(GeneralizedBinomialTest(u_,x_Symbol),
    False),
ISetDelayed(TrinomialDegree(u_,x_Symbol),
    Part(TrinomialTest(u,x),C4)),
ISetDelayed(TrinomialTest(u_,x_Symbol),
    If(PolynomialQ(u,x),Module(List(Set($s("lst"),CoefficientList(u,x))),If(Or(Or(Less(Length($s("lst")),C3),EvenQ(Length($s("lst")))),ZeroQ(Part($s("lst"),Times(C1D2,Plus(Length($s("lst")),C1))))),False,Catch(CompoundExpression(Scan(Function(If(ZeroQ(Slot1),Null,Throw(False))),Drop(Drop(Drop($s("lst"),List(Times(C1D2,Plus(Length($s("lst")),C1)))),C1),CN1)),List(First($s("lst")),Part($s("lst"),Times(C1D2,Plus(Length($s("lst")),C1))),Last($s("lst")),Times(C1D2,Plus(Length($s("lst")),Negate(C1)))))))),If(PowerQ(u),If(ZeroQ(Plus(Part(u,C2),Negate(C2))),Module(List(Set($s("lst"),BinomialTest(Part(u,C1),x))),If(FalseQ($s("lst")),False,List(Sqr(Part($s("lst"),C1)),Times(C2,Part($s("lst"),C1),Part($s("lst"),C2)),Sqr(Part($s("lst"),C2)),Part($s("lst"),C3)))),False),Module(List($s("lst1"),$s("lst2")),If(ProductQ(u),If(FreeQ(First(u),x),CompoundExpression(Set($s("lst2"),TrinomialTest(Rest(u),x)),If(FalseQ($s("lst2")),False,List(Times(First(u),Part($s("lst2"),C1)),Times(First(u),Part($s("lst2"),C2)),Times(First(u),Part($s("lst2"),C3)),Part($s("lst2"),C4)))),If(FreeQ(Rest(u),x),CompoundExpression(Set($s("lst1"),TrinomialTest(First(u),x)),If(FalseQ($s("lst1")),False,List(Times(Rest(u),Part($s("lst1"),C1)),Times(Rest(u),Part($s("lst1"),C2)),Times(Rest(u),Part($s("lst1"),C3)),Part($s("lst1"),C4)))),CompoundExpression(CompoundExpression(Set($s("lst1"),BinomialTest(First(u),x)),Set($s("lst2"),BinomialTest(Rest(u),x))),If(Or(FalseQ($s("lst1")),FalseQ($s("lst2"))),False,Module(List(a,b,c,d,m,n),CompoundExpression(CompoundExpression(Set(List(a,b,m),$s("lst1")),Set(List(c,d,n),$s("lst2"))),If(And(ZeroQ(Plus(m,Negate(n))),NonzeroQ(Plus(Times(a,d),Times(b,c)))),List(Times(a,c),Plus(Times(a,d),Times(b,c)),Times(b,d),m),False))))))),If(SumQ(u),If(FreeQ(First(u),x),CompoundExpression(Set($s("lst2"),TrinomialTest(Rest(u),x)),If(FalseQ($s("lst2")),False,List(Plus(First(u),Part($s("lst2"),C1)),Part($s("lst2"),C2),Part($s("lst2"),C3),Part($s("lst2"),C4)))),If(FreeQ(Rest(u),x),CompoundExpression(Set($s("lst1"),TrinomialTest(First(u),x)),If(FalseQ($s("lst1")),False,List(Plus(Rest(u),Part($s("lst1"),C1)),Part($s("lst1"),C2),Part($s("lst1"),C3),Part($s("lst1"),C4)))),CompoundExpression(Set($s("lst1"),TrinomialTest(First(u),x)),If(FalseQ($s("lst1")),CompoundExpression(Set($s("lst1"),BinomialTest(First(u),x)),If(FalseQ($s("lst1")),False,CompoundExpression(Set($s("lst2"),TrinomialTest(Rest(u),x)),If(FalseQ($s("lst2")),CompoundExpression(Set($s("lst2"),BinomialTest(Rest(u),x)),If(FalseQ($s("lst2")),False,If(ZeroQ(Plus(Part($s("lst1"),C3),Times(CN1,C2,Part($s("lst2"),C3)))),List(Plus(Part($s("lst1"),C1),Part($s("lst2"),C1)),Part($s("lst2"),C2),Part($s("lst1"),C2),Part($s("lst2"),C3)),If(ZeroQ(Plus(Part($s("lst2"),C3),Times(CN1,C2,Part($s("lst1"),C3)))),List(Plus(Part($s("lst1"),C1),Part($s("lst2"),C1)),Part($s("lst1"),C2),Part($s("lst2"),C2),Part($s("lst1"),C3)),False)))),If(And(ZeroQ(Plus(Part($s("lst1"),C3),Negate(Part($s("lst2"),C4)))),NonzeroQ(Plus(Part($s("lst1"),C2),Part($s("lst2"),C2)))),List(Plus(Part($s("lst1"),C1),Part($s("lst2"),C1)),Plus(Part($s("lst1"),C2),Part($s("lst2"),C2)),Part($s("lst2"),C3),Part($s("lst2"),C4)),If(And(ZeroQ(Plus(Part($s("lst1"),C3),Times(CN1,C2,Part($s("lst2"),C4)))),NonzeroQ(Plus(Part($s("lst1"),C2),Part($s("lst2"),C3)))),List(Plus(Part($s("lst1"),C1),Part($s("lst2"),C1)),Part($s("lst2"),C2),Plus(Part($s("lst1"),C2),Part($s("lst2"),C3)),Part($s("lst2"),C4)),False)))))),CompoundExpression(Set($s("lst2"),TrinomialTest(Rest(u),x)),If(FalseQ($s("lst2")),CompoundExpression(Set($s("lst2"),BinomialTest(Rest(u),x)),If(FalseQ($s("lst2")),False,If(And(ZeroQ(Plus(Part($s("lst2"),C3),Negate(Part($s("lst1"),C4)))),NonzeroQ(Plus(Part($s("lst1"),C2),Part($s("lst2"),C2)))),List(Plus(Part($s("lst1"),C1),Part($s("lst2"),C1)),Plus(Part($s("lst1"),C2),Part($s("lst2"),C2)),Part($s("lst1"),C3),Part($s("lst1"),C4)),If(And(ZeroQ(Plus(Part($s("lst2"),C3),Times(CN1,C2,Part($s("lst1"),C4)))),NonzeroQ(Plus(Part($s("lst1"),C3),Part($s("lst2"),C2)))),List(Plus(Part($s("lst1"),C1),Part($s("lst2"),C1)),Part($s("lst1"),C2),Plus(Part($s("lst1"),C3),Part($s("lst2"),C2)),Part($s("lst1"),C4)),False)))),If(And(And(ZeroQ(Plus(Part($s("lst1"),C4),Negate(Part($s("lst2"),C4)))),NonzeroQ(Plus(Part($s("lst1"),C2),Part($s("lst2"),C2)))),NonzeroQ(Plus(Part($s("lst1"),C3),Part($s("lst2"),C3)))),List(Plus(Part($s("lst1"),C1),Part($s("lst2"),C1)),Plus(Part($s("lst1"),C2),Part($s("lst2"),C2)),Plus(Part($s("lst1"),C3),Part($s("lst2"),C3)),Part($s("lst1"),C4)),False))))))),False)))))),
ISetDelayed(GeneralizedTrinomialDegree(u_,x_Symbol),
    $(Function(Plus(Part(Slot1,C4),Negate(Part(Slot1,C5)))),GeneralizedTrinomialTest(u,x))),
ISetDelayed(GeneralizedTrinomialTest(Plus(Times(b_DEFAULT,Power(x_,n_DEFAULT)),Times(a_DEFAULT,Power(x_,q_DEFAULT)),Times(c_DEFAULT,Power(x_,r_DEFAULT))),x_Symbol),
    Condition(List(a,b,c,n,q),And(FreeQ(List(a,b,c,n,q),x),ZeroQ(Plus(r,Negate(Plus(Times(C2,n),Negate(q)))))))),
ISetDelayed(GeneralizedTrinomialTest(Times(a_,u_),x_Symbol),
    Condition(Module(List(Set($s("lst"),GeneralizedTrinomialTest(u,x))),Condition(List(Times(a,Part($s("lst"),C1)),Times(a,Part($s("lst"),C2)),Times(a,Part($s("lst"),C3)),Part($s("lst"),C4),Part($s("lst"),C5)),NotFalseQ($s("lst")))),FreeQ(a,x))),
ISetDelayed(GeneralizedTrinomialTest(Times(u_,Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Module(List(Set($s("lst"),GeneralizedTrinomialTest(u,x))),Condition(List(Part($s("lst"),C1),Part($s("lst"),C2),Part($s("lst"),C3),Plus(m,Part($s("lst"),C4)),Plus(m,Part($s("lst"),C5))),And(And(NotFalseQ($s("lst")),NonzeroQ(Plus(m,Part($s("lst"),C4)))),NonzeroQ(Plus(m,Part($s("lst"),C5)))))),FreeQ(m,x))),
ISetDelayed(GeneralizedTrinomialTest(Times(u_,Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Module(List(Set($s("lst"),TrinomialTest(u,x))),Condition(List(Part($s("lst"),C1),Part($s("lst"),C2),Part($s("lst"),C3),Plus(m,Part($s("lst"),C4)),m),And(NotFalseQ($s("lst")),NonzeroQ(Plus(m,Part($s("lst"),C4)))))),FreeQ(m,x))),
ISetDelayed(GeneralizedTrinomialTest(u_,x_Symbol),
    False),
ISetDelayed(PerfectPowerTest(u_,x_Symbol),
    If(PolynomialQ(u,x),Module(List(Set($s("lst"),FactorSquareFreeList(u)),Set($s("§gcd"),C0),Set(v,C1)),CompoundExpression(CompoundExpression(If(SameQ(Part($s("lst"),C1),List(C1,C1)),Set($s("lst"),Rest($s("lst")))),Scan(Function(Set($s("§gcd"),GCD($s("§gcd"),Part(Slot1,C2)))),$s("lst"))),If(Greater($s("§gcd"),C1),CompoundExpression(Scan(Function(Set(v,Times(v,Power(Part(Slot1,C1),Times(Part(Slot1,C2),Power($s("§gcd"),-1)))))),$s("lst")),Power(Expand(v),$s("§gcd"))),False))),False)),
ISetDelayed(RationalFunctionQ(u_,x_Symbol),
    If(Or(AtomQ(u),FreeQ(u,x)),True,If(IntegerPowerQ(u),RationalFunctionQ(Part(u,C1),x),If(Or(ProductQ(u),SumQ(u)),Catch(CompoundExpression(Scan(Function(If(Not(RationalFunctionQ(Slot1,x)),Throw(False))),u),True)),False)))),
ISetDelayed(RationalFunctionFactors(u_,x_Symbol),
    If(ProductQ(u),Map(Function(If(RationalFunctionQ(Slot1,x),Slot1,C1)),u),If(RationalFunctionQ(u,x),u,C1))),
ISetDelayed(NonrationalFunctionFactors(u_,x_Symbol),
    If(ProductQ(u),Map(Function(If(RationalFunctionQ(Slot1,x),C1,Slot1)),u),If(RationalFunctionQ(u,x),C1,u))),
ISetDelayed(RationalFunctionExponents(u_,x_Symbol),
    If(PolynomialQ(u,x),List(Exponent(u,x),C0),If(IntegerPowerQ(u),If(Greater(Part(u,C2),C0),Times(Part(u,C2),RationalFunctionExponents(Part(u,C1),x)),Times(CN1,Part(u,C2),Reverse(RationalFunctionExponents(Part(u,C1),x)))),If(ProductQ(u),Plus(RationalFunctionExponents(First(u),x),RationalFunctionExponents(Rest(u),x)),If(SumQ(u),Module(List(Set(v,Together(u))),If(SumQ(v),Module(List($s("lst1"),$s("lst2")),CompoundExpression(CompoundExpression(Set($s("lst1"),RationalFunctionExponents(First(u),x)),Set($s("lst2"),RationalFunctionExponents(Rest(u),x))),List(Max(Plus(Part($s("lst1"),C1),Part($s("lst2"),C2)),Plus(Part($s("lst2"),C1),Part($s("lst1"),C2))),Plus(Part($s("lst1"),C2),Part($s("lst2"),C2))))),RationalFunctionExponents(v,x))),List(C0,C0)))))),
ISetDelayed(RationalFunctionExpand(Times(u_,Power(v_,n_)),x_Symbol),
    Condition(Module(List(Set(w,RationalFunctionExpand(u,x))),If(SumQ(w),Map(Function(Times(Slot1,Power(v,n))),w),Times(w,Power(v,n)))),And(FractionQ(n),UnsameQ(v,x)))),
ISetDelayed(RationalFunctionExpand(u_,x_Symbol),
    Module(List(v,w),CompoundExpression(Set(v,ExpandIntegrand(u,x)),If(And(UnsameQ(v,u),Not(MatchQ(u,Condition(Times(Power(x,m_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,x)),p_),Power(Plus(a_,Times(b_DEFAULT,Power(x,n_))),-1)),And(And(FreeQ(List(a,b,c,d,p),x),IntegersQ(m,n)),Equal(m,Plus(n,Negate(C1)))))))),v,CompoundExpression(CompoundExpression(Set(v,ExpandIntegrand(RationalFunctionFactors(u,x),x)),Set(w,NonrationalFunctionFactors(u,x))),If(SumQ(v),Map(Function(Times(Slot1,w)),v),Times(v,w))))))),
ISetDelayed(AlgebraicFunctionQ(u_,x_Symbol),
    If(Or(AtomQ(u),FreeQ(u,x)),True,If(RationalPowerQ(u),AlgebraicFunctionQ(Part(u,C1),x),If(Or(ProductQ(u),SumQ(u)),Catch(CompoundExpression(Scan(Function(If(Not(AlgebraicFunctionQ(Slot1,x)),Throw(False))),u),True)),False)))),
ISetDelayed(AlgebraicFunctionFactors(u_,x_Symbol),
    If(ProductQ(u),Map(Function(If(AlgebraicFunctionQ(Slot1,x),Slot1,C1)),u),If(AlgebraicFunctionQ(u,x),u,C1))),
ISetDelayed(NonalgebraicFunctionFactors(u_,x_Symbol),
    If(ProductQ(u),Map(Function(If(AlgebraicFunctionQ(Slot1,x),C1,Slot1)),u),If(AlgebraicFunctionQ(u,x),C1,u))),
ISetDelayed(QuotientOfLinearsQ(u_,x_Symbol),
    If(ListQ(u),Catch(CompoundExpression(Scan(Function(If(Not(QuotientOfLinearsQ(Slot1,x)),Throw(False))),u),True)),And(QuotientOfLinearsP(u,x),$(Function(And(NonzeroQ(Part(Slot1,C2)),NonzeroQ(Part(Slot1,C4)))),QuotientOfLinearsParts(u,x))))),
ISetDelayed(QuotientOfLinearsP(Times(a_,u_),x_),
    Condition(QuotientOfLinearsP(u,x),FreeQ(a,x))),
ISetDelayed(QuotientOfLinearsP(Plus(a_,u_),x_),
    Condition(QuotientOfLinearsP(u,x),FreeQ(a,x))),
ISetDelayed(QuotientOfLinearsP(Power(u_,-1),x_),
    QuotientOfLinearsP(u,x)),
ISetDelayed(QuotientOfLinearsP(u_,x_),
    Condition(True,LinearQ(u,x))),
ISetDelayed(QuotientOfLinearsP(Times(u_,Power(v_,-1)),x_),
    Condition(True,And(LinearQ(u,x),LinearQ(v,x)))),
ISetDelayed(QuotientOfLinearsP(u_,x_),
    Or(SameQ(u,x),FreeQ(u,x))),
ISetDelayed(QuotientOfLinearsParts(Times(a_,u_),x_),
    Condition(Apply(Function(List(Times(a,Slot1),Times(a,Slot2),Slot(C3),Slot(C4))),QuotientOfLinearsParts(u,x)),FreeQ(a,x))),
ISetDelayed(QuotientOfLinearsParts(Plus(a_,u_),x_),
    Condition(Apply(Function(List(Plus(Slot1,Times(a,Slot(C3))),Plus(Slot2,Times(a,Slot(C4))),Slot(C3),Slot(C4))),QuotientOfLinearsParts(u,x)),FreeQ(a,x))),
ISetDelayed(QuotientOfLinearsParts(Power(u_,-1),x_),
    Apply(Function(List(Slot(C3),Slot(C4),Slot1,Slot2)),QuotientOfLinearsParts(u,x))),
ISetDelayed(QuotientOfLinearsParts(u_,x_),
    Condition(List(Coefficient(u,x,C0),Coefficient(u,x,C1),C1,C0),LinearQ(u,x))),
ISetDelayed(QuotientOfLinearsParts(Times(u_,Power(v_,-1)),x_),
    Condition(List(Coefficient(u,x,C0),Coefficient(u,x,C1),Coefficient(v,x,C0),Coefficient(v,x,C1)),And(LinearQ(u,x),LinearQ(v,x)))),
ISetDelayed(QuotientOfLinearsParts(u_,x_),
    If(SameQ(u,x),List(C0,C1,C1,C0),If(FreeQ(u,x),List(u,C0,C1,C0),CompoundExpression(Print($str("QuotientOfLinearsParts error!")),List(u,C0,C1,C0))))),
ISetDelayed(SubstForFractionalPowerOfQuotientOfLinears(u_,x_Symbol),
    Module(List(Set($s("lst"),FractionalPowerOfQuotientOfLinears(u,C1,False,x)),n,a,b,c,d,$s("tmp")),If(Or(FalseQ($s("lst")),FalseQ(Part($s("lst"),C2))),False,CompoundExpression(CompoundExpression(CompoundExpression(CompoundExpression(CompoundExpression(CompoundExpression(CompoundExpression(Set(n,Part($s("lst"),C1)),Set($s("tmp"),Part($s("lst"),C2))),Set($s("lst"),QuotientOfLinearsParts($s("tmp"),x))),Set(a,Part($s("lst"),C1))),Set(b,Part($s("lst"),C2))),Set(c,Part($s("lst"),C3))),Set(d,Part($s("lst"),C4))),If(ZeroQ(d),False,CompoundExpression(CompoundExpression(Set($s("lst"),Times(Power(x,Plus(n,Negate(C1))),SubstForFractionalPower(u,$s("tmp"),n,Times(Plus(Negate(a),Times(c,Power(x,n))),Power(Plus(b,Times(CN1,d,Power(x,n))),-1)),x),Power(Plus(b,Times(CN1,d,Power(x,n))),-2))),Set($s("lst"),SplitFreeFactors(Simplify($s("lst")),x))),List(Part($s("lst"),C2),n,$s("tmp"),Times(Part($s("lst"),C1),Plus(Times(b,c),Times(CN1,a,d)))))))))),
ISetDelayed(SubstForFractionalPowerQ(u_,v_,x_Symbol),
    If(Or(AtomQ(u),FreeQ(u,x)),True,If(FractionalPowerQ(u),SubstForFractionalPowerAuxQ(u,v,x),Catch(CompoundExpression(Scan(Function(If(Not(SubstForFractionalPowerQ(Slot1,v,x)),Throw(False))),u),True))))),
ISetDelayed(SubstForFractionalPowerAuxQ(u_,v_,x_),
    If(AtomQ(u),False,If(And(FractionalPowerQ(u),ZeroQ(Plus(Part(u,C1),Negate(v)))),True,Catch(CompoundExpression(Scan(Function(If(SubstForFractionalPowerAuxQ(Slot1,v,x),Throw(True))),u),False))))),
ISetDelayed(FractionalPowerOfQuotientOfLinears(u_,n_,v_,x_),
    If(Or(AtomQ(u),FreeQ(u,x)),List(n,v),If(CalculusQ(u),False,If(And(And(And(FractionalPowerQ(u),QuotientOfLinearsQ(Part(u,C1),x)),Not(LinearQ(Part(u,C1),x))),Or(FalseQ(v),ZeroQ(Plus(Part(u,C1),Negate(v))))),List(LCM(Denominator(Part(u,C2)),n),Part(u,C1)),Catch(Module(List(Set($s("lst"),List(n,v))),CompoundExpression(Scan(Function(If(FalseQ(Set($s("lst"),FractionalPowerOfQuotientOfLinears(Slot1,Part($s("lst"),C1),Part($s("lst"),C2),x))),Throw(False))),u),$s("lst")))))))),
ISetDelayed(SubstForInverseFunctionOfQuotientOfLinears(u_,x_Symbol),
    Module(List(Set($s("tmp"),InverseFunctionOfQuotientOfLinears(u,x)),h,a,b,c,d,$s("lst")),If(FalseQ($s("tmp")),False,CompoundExpression(CompoundExpression(CompoundExpression(CompoundExpression(CompoundExpression(CompoundExpression(Set(h,InverseFunction(Head($s("tmp")))),Set($s("lst"),QuotientOfLinearsParts(Part($s("tmp"),C1),x))),Set(a,Part($s("lst"),C1))),Set(b,Part($s("lst"),C2))),Set(c,Part($s("lst"),C3))),Set(d,Part($s("lst"),C4))),List(Times(SubstForInverseFunction(u,$s("tmp"),Times(Plus(Negate(a),Times(c,$(h,x))),Power(Plus(b,Times(CN1,d,$(h,x))),-1)),x),D($(h,x),x),Power(Plus(b,Times(CN1,d,$(h,x))),-2)),$s("tmp"),Plus(Times(b,c),Times(CN1,a,d))))))),
ISetDelayed(InverseFunctionOfQuotientOfLinears(u_,x_Symbol),
    If(Or(Or(AtomQ(u),CalculusQ(u)),FreeQ(u,x)),False,If(And(InverseFunctionQ(u),QuotientOfLinearsQ(Part(u,C1),x)),u,Module(List($s("tmp")),Catch(CompoundExpression(Scan(Function(If(NotFalseQ(Set($s("tmp"),InverseFunctionOfQuotientOfLinears(Slot1,x))),Throw($s("tmp")))),u),False)))))),
ISetDelayed(SubstForFractionalPower(u_,v_,n_,w_,x_Symbol),
    If(AtomQ(u),If(SameQ(u,x),w,u),If(And(FractionalPowerQ(u),ZeroQ(Plus(Part(u,C1),Negate(v)))),Power(x,Times(n,Part(u,C2))),Map(Function(SubstForFractionalPower(Slot1,v,n,w,x)),u)))),
ISetDelayed(SubstForInverseFunction(u_,v_,x_Symbol),
    SubstForInverseFunction(u,v,Times(Plus(Negate(Coefficient(Part(v,C1),x,C0)),$(InverseFunction(Head(v)),x)),Power(Coefficient(Part(v,C1),x,C1),-1)),x)),
ISetDelayed(SubstForInverseFunction(u_,v_,w_,x_Symbol),
    If(AtomQ(u),If(SameQ(u,x),w,u),If(And(SameQ(Head(u),Head(v)),ZeroQ(Plus(Part(u,C1),Negate(Part(v,C1))))),x,Map(Function(SubstForInverseFunction(Slot1,v,w,x)),u)))),
ISetDelayed(Gcd(m_,n_),
    Condition(Module(List(Set($s("denr"),LCM(Denominator(m),Denominator(n)))),Times(Sign(n),GCD(Times(m,$s("denr")),Times(n,$s("denr"))),Power($s("denr"),-1))),RationalQ(m,n))),
ISetDelayed(Gcd($ps("args")),
    Block(List(Set($s("lst"),List($s("args")))),If(Equal(Length($s("lst")),C1),Part($s("lst"),C1),Apply($s("Integrate::Gcd"),Prepend(Drop($s("lst"),C2),Gcd(Part($s("lst"),C1),Part($s("lst"),C2))))))),
ISetDelayed(CommonNumericFactors($p("lst")),
    Module(List(Set($s("num"),Apply($s("GCD"),Map($s("Integrate::NumericFactor"),$s("lst"))))),Prepend(Map(Function(Times(Slot1,Power($s("num"),-1))),$s("lst")),$s("num")))),
ISetDelayed(NumericFactor(u_),
    If(NumberQ(u),If(ZeroQ(Im(u)),u,If(ZeroQ(Re(u)),Im(u),C1)),If(PowerQ(u),If(And(RationalQ(Part(u,C1)),FractionQ(Part(u,C2))),If(Greater(Part(u,C2),C0),Power(Denominator(Part(u,C1)),-1),Power(Denominator(Power(Part(u,C1),-1)),-1)),C1),If(ProductQ(u),Map($s("Integrate::NumericFactor"),u),If(SumQ(u),If(Less(LeafCount(u),ZZ(50L)),$(Function(If(SumQ(Slot1),C1,NumericFactor(Slot1))),ContentFactor(u)),Apply($s("Integrate::Gcd"),Map($s("Integrate::NumericFactor"),Apply($s("List"),u)))),C1)))))
  );
}
