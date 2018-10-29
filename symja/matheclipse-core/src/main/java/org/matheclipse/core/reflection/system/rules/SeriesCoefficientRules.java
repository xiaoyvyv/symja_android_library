package org.matheclipse.core.reflection.system.rules;

import org.matheclipse.core.interfaces.IAST;

import static org.matheclipse.core.expression.F.$p;
import static org.matheclipse.core.expression.F.And;
import static org.matheclipse.core.expression.F.ArcCos;
import static org.matheclipse.core.expression.F.ArcCosh;
import static org.matheclipse.core.expression.F.ArcCot;
import static org.matheclipse.core.expression.F.ArcCoth;
import static org.matheclipse.core.expression.F.ArcCsc;
import static org.matheclipse.core.expression.F.ArcSec;
import static org.matheclipse.core.expression.F.ArcSin;
import static org.matheclipse.core.expression.F.ArcSinh;
import static org.matheclipse.core.expression.F.ArcTan;
import static org.matheclipse.core.expression.F.ArcTanh;
import static org.matheclipse.core.expression.F.BernoulliB;
import static org.matheclipse.core.expression.F.C0;
import static org.matheclipse.core.expression.F.C1;
import static org.matheclipse.core.expression.F.C1D2;
import static org.matheclipse.core.expression.F.C2;
import static org.matheclipse.core.expression.F.C3;
import static org.matheclipse.core.expression.F.CI;
import static org.matheclipse.core.expression.F.CN1;
import static org.matheclipse.core.expression.F.CN1D2;
import static org.matheclipse.core.expression.F.CNI;
import static org.matheclipse.core.expression.F.ChebyshevT;
import static org.matheclipse.core.expression.F.ChebyshevU;
import static org.matheclipse.core.expression.F.Condition;
import static org.matheclipse.core.expression.F.Cos;
import static org.matheclipse.core.expression.F.Cosh;
import static org.matheclipse.core.expression.F.Cot;
import static org.matheclipse.core.expression.F.Coth;
import static org.matheclipse.core.expression.F.Csc;
import static org.matheclipse.core.expression.F.Csch;
import static org.matheclipse.core.expression.F.Equal;
import static org.matheclipse.core.expression.F.EulerE;
import static org.matheclipse.core.expression.F.Factorial;
import static org.matheclipse.core.expression.F.FreeQ;
import static org.matheclipse.core.expression.F.Gamma;
import static org.matheclipse.core.expression.F.Greater;
import static org.matheclipse.core.expression.F.GreaterEqual;
import static org.matheclipse.core.expression.F.IInit;
import static org.matheclipse.core.expression.F.ISetDelayed;
import static org.matheclipse.core.expression.F.IntegerQ;
import static org.matheclipse.core.expression.F.List;
import static org.matheclipse.core.expression.F.Log;
import static org.matheclipse.core.expression.F.Mod;
import static org.matheclipse.core.expression.F.Negate;
import static org.matheclipse.core.expression.F.NotListQ;
import static org.matheclipse.core.expression.F.Pi;
import static org.matheclipse.core.expression.F.Piecewise;
import static org.matheclipse.core.expression.F.Plus;
import static org.matheclipse.core.expression.F.Pochhammer;
import static org.matheclipse.core.expression.F.PolyLog;
import static org.matheclipse.core.expression.F.Power;
import static org.matheclipse.core.expression.F.ProductLog;
import static org.matheclipse.core.expression.F.QQ;
import static org.matheclipse.core.expression.F.Sec;
import static org.matheclipse.core.expression.F.Sech;
import static org.matheclipse.core.expression.F.SeriesCoefficient;
import static org.matheclipse.core.expression.F.Sin;
import static org.matheclipse.core.expression.F.Sinh;
import static org.matheclipse.core.expression.F.Sqr;
import static org.matheclipse.core.expression.F.Sqrt;
import static org.matheclipse.core.expression.F.Tan;
import static org.matheclipse.core.expression.F.Tanh;
import static org.matheclipse.core.expression.F.Times;
import static org.matheclipse.core.expression.F.Unequal;
import static org.matheclipse.core.expression.F.a;
import static org.matheclipse.core.expression.F.a_;
import static org.matheclipse.core.expression.F.b;
import static org.matheclipse.core.expression.F.b_;
import static org.matheclipse.core.expression.F.k;
import static org.matheclipse.core.expression.F.k_;
import static org.matheclipse.core.expression.F.n;
import static org.matheclipse.core.expression.F.x;
import static org.matheclipse.core.expression.F.x_;
import static org.matheclipse.core.expression.F.x_Symbol;

/**
 * <p>Generated by <code>org.matheclipse.core.preprocessor.RulePreprocessor</code>.</p>
 * <p>See GIT repository at: <a href="https://github.com/axkr/symja_android_library">github.com/axkr/symja_android_library under the tools directory</a>.</p>
 */
public interface SeriesCoefficientRules {
  /**
   * <ul>
   * <li>index 0 - number of equal rules in <code>RULES</code></li>
	 * </ul>
	 */
  final public static int[] SIZES = { 0, 44 };

  final public static IAST RULES = List(
    IInit(SeriesCoefficient, SIZES),
    // SeriesCoefficient(Cos(x_),{x_Symbol,0,n_NotListQ}):=Piecewise({{((1+(-1)^n)*I^n)/(2*n!),n>=0}},0)/;FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(Cos(x_),List(x_Symbol,C0,$p(n,NotListQ))),
      Condition(Piecewise(List(List(Times(Plus(C1,Power(CN1,n)),Power(CI,n),Power(Times(C2,Factorial(n)),-1)),GreaterEqual(n,C0))),C0),FreeQ(n,x))),
    // SeriesCoefficient(Cos(x_),{x_Symbol,Pi/2,n_NotListQ}):=Piecewise({{((-1)*I*(-1+(-1)^n)*I^n)/(2*n!),n>=0}},0)/;FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(Cos(x_),List(x_Symbol,Times(C1D2,Pi),$p(n,NotListQ))),
      Condition(Piecewise(List(List(Times(CN1,CI,Plus(CN1,Power(CN1,n)),Power(CI,n),Power(Times(C2,Factorial(n)),-1)),GreaterEqual(n,C0))),C0),FreeQ(n,x))),
    // SeriesCoefficient(Sin(x_),{x_Symbol,0,n_NotListQ}):=Piecewise({{(I*(-1+(-1)^n)*I^n)/(2*n!),n>=0}},0)/;FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(Sin(x_),List(x_Symbol,C0,$p(n,NotListQ))),
      Condition(Piecewise(List(List(Times(CI,Plus(CN1,Power(CN1,n)),Power(CI,n),Power(Times(C2,Factorial(n)),-1)),GreaterEqual(n,C0))),C0),FreeQ(n,x))),
    // SeriesCoefficient(Sin(x_),{x_Symbol,Pi/2,n_NotListQ}):=Piecewise({{((1+(-1)^n)*I^n)/(2*n!),n>=0}},0)/;FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(Sin(x_),List(x_Symbol,Times(C1D2,Pi),$p(n,NotListQ))),
      Condition(Piecewise(List(List(Times(Plus(C1,Power(CN1,n)),Power(CI,n),Power(Times(C2,Factorial(n)),-1)),GreaterEqual(n,C0))),C0),FreeQ(n,x))),
    // SeriesCoefficient(Tan(x_),{x_Symbol,0,n_NotListQ}):=Piecewise({{((-1+(-1)^n)*2^n*(-1+2^(1+n))*I^(1+n)*BernoulliB(1+n))/(1+n)!,n>=1}},0)/;FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(Tan(x_),List(x_Symbol,C0,$p(n,NotListQ))),
      Condition(Piecewise(List(List(Times(Plus(CN1,Power(CN1,n)),Power(C2,n),Plus(CN1,Power(C2,Plus(C1,n))),Power(CI,Plus(C1,n)),BernoulliB(Plus(C1,n)),Power(Factorial(Plus(C1,n)),-1)),GreaterEqual(n,C1))),C0),FreeQ(n,x))),
    // SeriesCoefficient(Tan(x_),{x_Symbol,Pi/2,n_NotListQ}):=Piecewise({{-1,n==-1},{((-1+(-1)^n)*2^n*I^(1+n)*BernoulliB(1+n))/(1+n)!,n>=0}},0)/;FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(Tan(x_),List(x_Symbol,Times(C1D2,Pi),$p(n,NotListQ))),
      Condition(Piecewise(List(List(CN1,Equal(n,CN1)),List(Times(Plus(CN1,Power(CN1,n)),Power(C2,n),Power(CI,Plus(C1,n)),BernoulliB(Plus(C1,n)),Power(Factorial(Plus(C1,n)),-1)),GreaterEqual(n,C0))),C0),FreeQ(n,x))),
    // SeriesCoefficient(Cot(x_),{x_Symbol,0,n_NotListQ}):=Piecewise({{1,n==-1},{((-1)*I*(-1+(-1)^n)*(2*I)^n*BernoulliB(1+n))/(1+n)!,n>=0}},0)/;FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(Cot(x_),List(x_Symbol,C0,$p(n,NotListQ))),
      Condition(Piecewise(List(List(C1,Equal(n,CN1)),List(Times(CN1,CI,Plus(CN1,Power(CN1,n)),Power(Times(C2,CI),n),BernoulliB(Plus(C1,n)),Power(Factorial(Plus(C1,n)),-1)),GreaterEqual(n,C0))),C0),FreeQ(n,x))),
    // SeriesCoefficient(Cot(x_),{x_Symbol,Pi/2,n_NotListQ}):=Piecewise({{((-1)*I*(-1+(-1)^n)*(-1+2^(1+n))*(2*I)^n*BernoulliB(1+n))/(1+n)!,n>=1}},0)/;FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(Cot(x_),List(x_Symbol,Times(C1D2,Pi),$p(n,NotListQ))),
      Condition(Piecewise(List(List(Times(CN1,CI,Plus(CN1,Power(CN1,n)),Plus(CN1,Power(C2,Plus(C1,n))),Power(Times(C2,CI),n),BernoulliB(Plus(C1,n)),Power(Factorial(Plus(C1,n)),-1)),GreaterEqual(n,C1))),C0),FreeQ(n,x))),
    // SeriesCoefficient(Cosh(x_),{x_Symbol,0,n_NotListQ}):=Piecewise({{1/n!,Mod(n,2)==0&&n>=0}},0)/;FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(Cosh(x_),List(x_Symbol,C0,$p(n,NotListQ))),
      Condition(Piecewise(List(List(Power(Factorial(n),-1),And(Equal(Mod(n,C2),C0),GreaterEqual(n,C0)))),C0),FreeQ(n,x))),
    // SeriesCoefficient(Coth(x_),{x_Symbol,0,n_NotListQ}):=Piecewise({{1,n==-1},{(2^(1+n)*BernoulliB(1+n))/(1+n)!,n>=0&&Mod(n,2)==1}},0)/;FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(Coth(x_),List(x_Symbol,C0,$p(n,NotListQ))),
      Condition(Piecewise(List(List(C1,Equal(n,CN1)),List(Times(Power(C2,Plus(C1,n)),BernoulliB(Plus(C1,n)),Power(Factorial(Plus(C1,n)),-1)),And(GreaterEqual(n,C0),Equal(Mod(n,C2),C1)))),C0),FreeQ(n,x))),
    // SeriesCoefficient(Sinh(x_),{x_Symbol,0,n_NotListQ}):=Piecewise({{1/n!,Mod(n,2)==1&&n>=0}},0)/;FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(Sinh(x_),List(x_Symbol,C0,$p(n,NotListQ))),
      Condition(Piecewise(List(List(Power(Factorial(n),-1),And(Equal(Mod(n,C2),C1),GreaterEqual(n,C0)))),C0),FreeQ(n,x))),
    // SeriesCoefficient(Tanh(x_),{x_Symbol,0,n_NotListQ}):=Piecewise({{((-1+2^(1+n))*2^(1+n)*BernoulliB(1+n))/(1+n)!,Mod(n,2)==1&&n>=1}},0)/;FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(Tanh(x_),List(x_Symbol,C0,$p(n,NotListQ))),
      Condition(Piecewise(List(List(Times(Plus(CN1,Power(C2,Plus(C1,n))),Power(C2,Plus(C1,n)),BernoulliB(Plus(C1,n)),Power(Factorial(Plus(C1,n)),-1)),And(Equal(Mod(n,C2),C1),GreaterEqual(n,C1)))),C0),FreeQ(n,x))),
    // SeriesCoefficient(ArcCos(x_),{x_Symbol,0,n_NotListQ}):=Piecewise({{Pi/2,n==0},{-Pochhammer(1/2,1/2*(-1+n))/(n*(1/2*(-1+n))!),n>0&&Mod(n,2)==1}},0)/;FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(ArcCos(x_),List(x_Symbol,C0,$p(n,NotListQ))),
      Condition(Piecewise(List(List(Times(C1D2,Pi),Equal(n,C0)),List(Times(CN1,Power(Times(n,Factorial(Times(C1D2,Plus(CN1,n)))),-1),Pochhammer(C1D2,Times(C1D2,Plus(CN1,n)))),And(Greater(n,C0),Equal(Mod(n,C2),C1)))),C0),FreeQ(n,x))),
    // SeriesCoefficient(ArcCot(x_),{x_Symbol,0,n_NotListQ}):=Piecewise({{I^(1+n)/n,n>0&&Mod(n,2)==1},{Pi/2,n==0}},0)/;FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(ArcCot(x_),List(x_Symbol,C0,$p(n,NotListQ))),
      Condition(Piecewise(List(List(Times(Power(CI,Plus(C1,n)),Power(n,-1)),And(Greater(n,C0),Equal(Mod(n,C2),C1))),List(Times(C1D2,Pi),Equal(n,C0))),C0),FreeQ(n,x))),
    // SeriesCoefficient(ArcSin(x_),{x_Symbol,0,n_NotListQ}):=Piecewise({{Pochhammer(1/2,1/2*(-1+n))/(n*(1/2*(-1+n))!),Mod(n,2)==1&&n>=0}},0)/;FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(ArcSin(x_),List(x_Symbol,C0,$p(n,NotListQ))),
      Condition(Piecewise(List(List(Times(Power(Times(n,Factorial(Times(C1D2,Plus(CN1,n)))),-1),Pochhammer(C1D2,Times(C1D2,Plus(CN1,n)))),And(Equal(Mod(n,C2),C1),GreaterEqual(n,C0)))),C0),FreeQ(n,x))),
    // SeriesCoefficient(ArcTan(x_),{x_Symbol,0,n_NotListQ}):=Piecewise({{1/(I^(1-n)*n),Mod(n,2)==1&&n>=0}},0)/;FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(ArcTan(x_),List(x_Symbol,C0,$p(n,NotListQ))),
      Condition(Piecewise(List(List(Times(Power(CI,Plus(CN1,n)),Power(n,-1)),And(Equal(Mod(n,C2),C1),GreaterEqual(n,C0)))),C0),FreeQ(n,x))),
    // SeriesCoefficient(ArcCosh(x_),{x_Symbol,0,n_NotListQ}):=Piecewise({{1/2*I*Pi,n==0},{((-1)*I*Pochhammer(1/2,1/2*(-1+n)))/(n*(1/2*(-1+n))!),n>=1&&Mod(n,2)==1}},0)/;FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(ArcCosh(x_),List(x_Symbol,C0,$p(n,NotListQ))),
      Condition(Piecewise(List(List(Times(C1D2,CI,Pi),Equal(n,C0)),List(Times(CN1,CI,Power(Times(n,Factorial(Times(C1D2,Plus(CN1,n)))),-1),Pochhammer(C1D2,Times(C1D2,Plus(CN1,n)))),And(GreaterEqual(n,C1),Equal(Mod(n,C2),C1)))),C0),FreeQ(n,x))),
    // SeriesCoefficient(ArcSinh(x_),{x_Symbol,0,n_NotListQ}):=Piecewise({{Pochhammer(1/2,1/2*(-1+n))/(I^(1-n)*n*(1/2*(-1+n))!),Mod(n,2)==1&&n>=0}},0)/;FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(ArcSinh(x_),List(x_Symbol,C0,$p(n,NotListQ))),
      Condition(Piecewise(List(List(Times(Power(CI,Plus(CN1,n)),Power(Times(n,Factorial(Times(C1D2,Plus(CN1,n)))),-1),Pochhammer(C1D2,Times(C1D2,Plus(CN1,n)))),And(Equal(Mod(n,C2),C1),GreaterEqual(n,C0)))),C0),FreeQ(n,x))),
    // SeriesCoefficient(ArcTanh(x_),{x_Symbol,0,n_NotListQ}):=Piecewise({{1/n,Mod(n,2)==1&&n>=0}},0)/;FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(ArcTanh(x_),List(x_Symbol,C0,$p(n,NotListQ))),
      Condition(Piecewise(List(List(Power(n,-1),And(Equal(Mod(n,C2),C1),GreaterEqual(n,C0)))),C0),FreeQ(n,x))),
    // SeriesCoefficient(Csc(x_),{x_Symbol,0,n_NotListQ}):=Piecewise({{1,n==-1},{((-1)*2*I*(-1+2^n)*I^n*BernoulliB(1+n))/(1+n)!,n>=0&&Mod(n,2)==1}},0)/;FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(Csc(x_),List(x_Symbol,C0,$p(n,NotListQ))),
      Condition(Piecewise(List(List(C1,Equal(n,CN1)),List(Times(CN1,C2,CI,Plus(CN1,Power(C2,n)),Power(CI,n),BernoulliB(Plus(C1,n)),Power(Factorial(Plus(C1,n)),-1)),And(GreaterEqual(n,C0),Equal(Mod(n,C2),C1)))),C0),FreeQ(n,x))),
    // SeriesCoefficient(Sec(x_),{x_Symbol,0,n_NotListQ}):=Piecewise({{(I^n*EulerE(n))/n!,Mod(n,2)==0&&n>=0}},0)/;FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(Sec(x_),List(x_Symbol,C0,$p(n,NotListQ))),
      Condition(Piecewise(List(List(Times(Power(CI,n),EulerE(n),Power(Factorial(n),-1)),And(Equal(Mod(n,C2),C0),GreaterEqual(n,C0)))),C0),FreeQ(n,x))),
    // SeriesCoefficient(Csch(x_),{x_Symbol,0,n_NotListQ}):=Piecewise({{1,n==-1},{((-1)*2*(-1+2^n)*BernoulliB(1+n))/(1+n)!,n>=0&&Mod(n,2)==1}},0)/;FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(Csch(x_),List(x_Symbol,C0,$p(n,NotListQ))),
      Condition(Piecewise(List(List(C1,Equal(n,CN1)),List(Times(CN1,C2,Plus(CN1,Power(C2,n)),BernoulliB(Plus(C1,n)),Power(Factorial(Plus(C1,n)),-1)),And(GreaterEqual(n,C0),Equal(Mod(n,C2),C1)))),C0),FreeQ(n,x))),
    // SeriesCoefficient(Sech(x_),{x_Symbol,0,n_NotListQ}):=Piecewise({{EulerE(n)/n!,n>=0}},0)/;FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(Sech(x_),List(x_Symbol,C0,$p(n,NotListQ))),
      Condition(Piecewise(List(List(Times(EulerE(n),Power(Factorial(n),-1)),GreaterEqual(n,C0))),C0),FreeQ(n,x))),
    // SeriesCoefficient(Cos(x_),{x_Symbol,a_,n_NotListQ}):=Piecewise({{Cos(a+1/2*n*Pi)/n!,n>=0}},0)/;FreeQ(a,x)&&FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(Cos(x_),List(x_Symbol,a_,$p(n,NotListQ))),
      Condition(Piecewise(List(List(Times(Cos(Plus(a,Times(C1D2,n,Pi))),Power(Factorial(n),-1)),GreaterEqual(n,C0))),C0),And(FreeQ(a,x),FreeQ(n,x)))),
    // SeriesCoefficient(Sin(x_),{x_Symbol,a_,n_NotListQ}):=Piecewise({{Sin(a+1/2*n*Pi)/n!,n>=0}},0)/;FreeQ(a,x)&&FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(Sin(x_),List(x_Symbol,a_,$p(n,NotListQ))),
      Condition(Piecewise(List(List(Times(Power(Factorial(n),-1),Sin(Plus(a,Times(C1D2,n,Pi)))),GreaterEqual(n,C0))),C0),And(FreeQ(a,x),FreeQ(n,x)))),
    // SeriesCoefficient(Cosh(x_),{x_Symbol,a_,n_NotListQ}):=Piecewise({{Cosh(a)/n!,Mod(n,2)==0&&n>=0},{Sinh(a)/n!,Mod(n,2)==1&&n>=0}},0)/;FreeQ(a,x)&&FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(Cosh(x_),List(x_Symbol,a_,$p(n,NotListQ))),
      Condition(Piecewise(List(List(Times(Cosh(a),Power(Factorial(n),-1)),And(Equal(Mod(n,C2),C0),GreaterEqual(n,C0))),List(Times(Power(Factorial(n),-1),Sinh(a)),And(Equal(Mod(n,C2),C1),GreaterEqual(n,C0)))),C0),And(FreeQ(a,x),FreeQ(n,x)))),
    // SeriesCoefficient(Sinh(x_),{x_Symbol,a_,n_NotListQ}):=Piecewise({{Cosh(a)/n!,Mod(n,2)==1&&n>=0},{Sinh(a)/n!,Mod(n,2)==0&&n>=0}},0)/;FreeQ(a,x)&&FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(Sinh(x_),List(x_Symbol,a_,$p(n,NotListQ))),
      Condition(Piecewise(List(List(Times(Cosh(a),Power(Factorial(n),-1)),And(Equal(Mod(n,C2),C1),GreaterEqual(n,C0))),List(Times(Power(Factorial(n),-1),Sinh(a)),And(Equal(Mod(n,C2),C0),GreaterEqual(n,C0)))),C0),And(FreeQ(a,x),FreeQ(n,x)))),
    // SeriesCoefficient(ArcCot(x_),{x_Symbol,a_,n_NotListQ}):=Piecewise({{(I*((-I-a)^(-n)-1/(I-a)^n))/(2*n),n>0},{1/2*I*(Log((-I+a)/a)-Log((I+a)/a)),n==0}},0)/;FreeQ(a,x)&&FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(ArcCot(x_),List(x_Symbol,a_,$p(n,NotListQ))),
      Condition(Piecewise(List(List(Times(CI,Plus(Power(Plus(CNI,Negate(a)),Negate(n)),Negate(Power(Plus(CI,Negate(a)),Negate(n)))),Power(Times(C2,n),-1)),Greater(n,C0)),List(Times(C1D2,CI,Plus(Log(Times(Power(a,-1),Plus(CNI,a))),Negate(Log(Times(Power(a,-1),Plus(CI,a)))))),Equal(n,C0))),C0),And(FreeQ(a,x),FreeQ(n,x)))),
    // SeriesCoefficient(ArcTan(x_),{x_Symbol,a_,n_NotListQ}):=Piecewise({{((-1)*I*((-I-a)^(-n)-1/(I-a)^n))/(2*n),n>0},{1/2*I*(Log(1-I*a)-Log(1+I*a)),n==0}},0)/;FreeQ(a,x)&&FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(ArcTan(x_),List(x_Symbol,a_,$p(n,NotListQ))),
      Condition(Piecewise(List(List(Times(CN1,CI,Plus(Power(Plus(CNI,Negate(a)),Negate(n)),Negate(Power(Plus(CI,Negate(a)),Negate(n)))),Power(Times(C2,n),-1)),Greater(n,C0)),List(Times(C1D2,CI,Plus(Log(Plus(C1,Times(CNI,a))),Negate(Log(Plus(C1,Times(CI,a)))))),Equal(n,C0))),C0),And(FreeQ(a,x),FreeQ(n,x)))),
    // SeriesCoefficient(ArcCoth(x_),{x_Symbol,a_,n_NotListQ}):=Piecewise({{(-1/(-1-a)^n+(1-a)^(-n))/(2*n),n>0},{1/2*(Log(1+1/a)-Log((-1+a)/a)),n==0}},0)/;FreeQ(a,x)&&FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(ArcCoth(x_),List(x_Symbol,a_,$p(n,NotListQ))),
      Condition(Piecewise(List(List(Times(Plus(Negate(Power(Plus(CN1,Negate(a)),Negate(n))),Power(Plus(C1,Negate(a)),Negate(n))),Power(Times(C2,n),-1)),Greater(n,C0)),List(Times(C1D2,Plus(Log(Plus(C1,Power(a,-1))),Negate(Log(Times(Power(a,-1),Plus(CN1,a)))))),Equal(n,C0))),C0),And(FreeQ(a,x),FreeQ(n,x)))),
    // SeriesCoefficient(ArcTanh(x_),{x_Symbol,a_,n_NotListQ}):=Piecewise({{((-1)^n*((-1+a)^(-n)-1/(1+a)^n))/(2*n),n>=1},{1/2*(-Log(1-a)+Log(1+a)),n==0}},0)/;FreeQ(a,x)&&FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(ArcTanh(x_),List(x_Symbol,a_,$p(n,NotListQ))),
      Condition(Piecewise(List(List(Times(Power(CN1,n),Plus(Power(Plus(CN1,a),Negate(n)),Negate(Power(Plus(C1,a),Negate(n)))),Power(Times(C2,n),-1)),GreaterEqual(n,C1)),List(Times(C1D2,Plus(Negate(Log(Plus(C1,Negate(a)))),Log(Plus(C1,a)))),Equal(n,C0))),C0),And(FreeQ(a,x),FreeQ(n,x)))),
    // SeriesCoefficient(ArcCos(x_),{x_Symbol,a_,1}):=-1/Sqrt(1-a^2)/;FreeQ(a,x)
    ISetDelayed(SeriesCoefficient(ArcCos(x_),List(x_Symbol,a_,C1)),
      Condition(Negate(Power(Plus(C1,Negate(Sqr(a))),CN1D2)),FreeQ(a,x))),
    // SeriesCoefficient(ArcCot(x_),{x_Symbol,a_,1}):=1/(-1-a^2)/;FreeQ(a,x)
    ISetDelayed(SeriesCoefficient(ArcCot(x_),List(x_Symbol,a_,C1)),
      Condition(Negate(Power(Plus(C1,Sqr(a)),-1)),FreeQ(a,x))),
    // SeriesCoefficient(ArcSin(x_),{x_Symbol,a_,1}):=1/Sqrt(1-a^2)/;FreeQ(a,x)
    ISetDelayed(SeriesCoefficient(ArcSin(x_),List(x_Symbol,a_,C1)),
      Condition(Power(Plus(C1,Negate(Sqr(a))),CN1D2),FreeQ(a,x))),
    // SeriesCoefficient(ArcTan(x_),{x_Symbol,a_,1}):=1/(1+a^2)/;FreeQ(a,x)
    ISetDelayed(SeriesCoefficient(ArcTan(x_),List(x_Symbol,a_,C1)),
      Condition(Power(Plus(C1,Sqr(a)),-1),FreeQ(a,x))),
    // SeriesCoefficient(ArcCsc(x_),{x_Symbol,a_,1}):=-1/(Sqrt(1-1/a^2)*a^2)/;FreeQ(a,x)
    ISetDelayed(SeriesCoefficient(ArcCsc(x_),List(x_Symbol,a_,C1)),
      Condition(Negate(Power(Times(Sqrt(Plus(C1,Negate(Power(a,-2)))),Sqr(a)),-1)),FreeQ(a,x))),
    // SeriesCoefficient(ArcSec(x_),{x_Symbol,a_,1}):=1/(Sqrt(1-1/a^2)*a^2)/;FreeQ(a,x)
    ISetDelayed(SeriesCoefficient(ArcSec(x_),List(x_Symbol,a_,C1)),
      Condition(Power(Times(Sqrt(Plus(C1,Negate(Power(a,-2)))),Sqr(a)),-1),FreeQ(a,x))),
    // SeriesCoefficient(Log(x_),{x_Symbol,a_,n_NotListQ}):=Piecewise({{(-1)^(1+n)/(a^n*n),n>=1},{Log(a),n==0}},0)/;FreeQ(a,x)&&a!=0&&FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(Log(x_),List(x_Symbol,a_,$p(n,NotListQ))),
      Condition(Piecewise(List(List(Times(Power(CN1,Plus(C1,n)),Power(Times(Power(a,n),n),-1)),GreaterEqual(n,C1)),List(Log(a),Equal(n,C0))),C0),And(FreeQ(a,x),Unequal(a,C0),FreeQ(n,x)))),
    // SeriesCoefficient(b_^x_,{x_Symbol,a_,n_NotListQ}):=Piecewise({{(b^a*Log(b)^n)/n!,n>=0}},0)/;FreeQ(b,x)&&FreeQ(a,x)&&FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(Power(b_,x_),List(x_Symbol,a_,$p(n,NotListQ))),
      Condition(Piecewise(List(List(Times(Power(b,a),Power(Factorial(n),-1),Power(Log(b),n)),GreaterEqual(n,C0))),C0),And(FreeQ(b,x),FreeQ(a,x),FreeQ(n,x)))),
    // SeriesCoefficient(x_^x_,{x_Symbol,0,n_IntegerQ}):=Log(x)^n/n!
    ISetDelayed(SeriesCoefficient(Power(x_,x_),List(x_Symbol,C0,$p(n,IntegerQ))),
      Times(Power(Factorial(n),-1),Power(Log(x),n))),
    // SeriesCoefficient(ProductLog(x_),{x_Symbol,0,n_NotListQ}):=Piecewise({{1/((-n)^(1-n)*n!),n>=1}},0)/;FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(ProductLog(x_),List(x_Symbol,C0,$p(n,NotListQ))),
      Condition(Piecewise(List(List(Times(Power(Negate(n),Plus(CN1,n)),Power(Factorial(n),-1)),GreaterEqual(n,C1))),C0),FreeQ(n,x))),
    // SeriesCoefficient(PolyLog(k_,x_),{x_Symbol,0,n_NotListQ}):=Piecewise({{n^(-k),n>=1}},0)/;FreeQ(k,x)&&FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(PolyLog(k_,x_),List(x_Symbol,C0,$p(n,NotListQ))),
      Condition(Piecewise(List(List(Power(n,Negate(k)),GreaterEqual(n,C1))),C0),And(FreeQ(k,x),FreeQ(n,x)))),
    // SeriesCoefficient(ChebyshevT(k_,x_),{x_Symbol,0,n_NotListQ}):=Piecewise({{((-1/2)^n*Sqrt(Pi)*Gamma(1/2+n)*Pochhammer(-k,n)*Pochhammer(k,n))/(n!*Gamma(1/2*(1-k+n))*Gamma(1/2*(1+k+n))*Pochhammer(1/2,n)),n>=0}},0)/;FreeQ(k,x)&&FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(ChebyshevT(k_,x_),List(x_Symbol,C0,$p(n,NotListQ))),
      Condition(Piecewise(List(List(Times(Power(CN1D2,n),Sqrt(Pi),Gamma(Plus(C1D2,n)),Power(Times(Factorial(n),Gamma(Times(C1D2,Plus(C1,Negate(k),n))),Gamma(Times(C1D2,Plus(C1,k,n))),Pochhammer(C1D2,n)),-1),Pochhammer(Negate(k),n),Pochhammer(k,n)),GreaterEqual(n,C0))),C0),And(FreeQ(k,x),FreeQ(n,x)))),
    // SeriesCoefficient(ChebyshevU(k_,x_),{x_Symbol,0,n_NotListQ}):=Piecewise({{((-1/2)^n*Sqrt(Pi)*Gamma(3/2+n)*Pochhammer(-k,n)*Pochhammer(2+k,n))/(n!*Gamma(1/2*(1-k+n))*Gamma(1/2*(3+k+n))*Pochhammer(3/2,n)),n>=0}},0)/;FreeQ(k,x)&&FreeQ(n,x)
    ISetDelayed(SeriesCoefficient(ChebyshevU(k_,x_),List(x_Symbol,C0,$p(n,NotListQ))),
      Condition(Piecewise(List(List(Times(Power(CN1D2,n),Sqrt(Pi),Gamma(Plus(QQ(3L,2L),n)),Power(Times(Factorial(n),Gamma(Times(C1D2,Plus(C1,Negate(k),n))),Gamma(Times(C1D2,Plus(C3,k,n))),Pochhammer(QQ(3L,2L),n)),-1),Pochhammer(Negate(k),n),Pochhammer(Plus(C2,k),n)),GreaterEqual(n,C0))),C0),And(FreeQ(k,x),FreeQ(n,x))))
  );
}