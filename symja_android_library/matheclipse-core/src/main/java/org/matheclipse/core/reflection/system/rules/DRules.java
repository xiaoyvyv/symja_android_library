package org.matheclipse.core.reflection.system.rules;

import static org.matheclipse.core.expression.F.*;
import org.matheclipse.core.interfaces.IAST;

/**
 * <p>Generated by <code>org.matheclipse.core.preprocessor.RulePreprocessor</code>.</p>
 * <p>See GIT repository at: <a href="https://github.com/axkr/symja_android_library">github.com/axkr/symja_android_library under the tools directory</a>.</p>
 */
public interface DRules {
  /**
   * <ul>
   * <li>index 0 - number of equal rules in <code>RULES</code></li>
	 * </ul>
	 */
  final public static int[] SIZES = { 0, 82 };

  final public static IAST RULES = List(
    IInit(D, SIZES),
    // D(Abs(f_),x_?NotListQ):=D(f,x)*x/Abs(x)/;Element(x,Reals)
    ISetDelayed(D(Abs(f_),PatternTest(x_,NotListQ)),
      Condition(Times(D(f,x),x,Power(Abs(x),CN1)),Element(x,Reals))),
    // D(ArcCos(f_),x_?NotListQ):=(D(f,x)*(-1))/Sqrt(1-f^2)
    ISetDelayed(D(ArcCos(f_),PatternTest(x_,NotListQ)),
      Times(D(f,x),CN1,Power(Subtract(C1,Sqr(f)),CN1D2))),
    // D(ArcCosh(f_),x_?NotListQ):=D(f,x)/Sqrt(-1+f^2)
    ISetDelayed(D(ArcCosh(f_),PatternTest(x_,NotListQ)),
      Times(D(f,x),Power(Plus(CN1,Sqr(f)),CN1D2))),
    // D(ArcCot(f_),x_?NotListQ):=(D(f,x)*(-1))/(1+f^2)
    ISetDelayed(D(ArcCot(f_),PatternTest(x_,NotListQ)),
      Times(D(f,x),CN1,Power(Plus(C1,Sqr(f)),CN1))),
    // D(ArcCoth(f_),x_?NotListQ):=D(f,x)/(1-f^2)
    ISetDelayed(D(ArcCoth(f_),PatternTest(x_,NotListQ)),
      Times(D(f,x),Power(Subtract(C1,Sqr(f)),CN1))),
    // D(ArcCsc(f_),x_?NotListQ):=(-D(f,x)*1)/(f^2*Sqrt(1-1/x^2))
    ISetDelayed(D(ArcCsc(f_),PatternTest(x_,NotListQ)),
      Times(CN1,D(f,x),C1,Power(f,CN2),Power(Subtract(C1,Power(x,CN2)),CN1D2))),
    // D(ArcCsch(f_),x_?NotListQ):=(D(f,x)*(-1))/(Abs(f)*Sqrt(1+f^2))
    ISetDelayed(D(ArcCsch(f_),PatternTest(x_,NotListQ)),
      Times(D(f,x),CN1,Power(Abs(f),CN1),Power(Plus(C1,Sqr(f)),CN1D2))),
    // D(ArcSin(f_),x_?NotListQ):=D(f,x)/Sqrt(1-f^2)
    ISetDelayed(D(ArcSin(f_),PatternTest(x_,NotListQ)),
      Times(D(f,x),Power(Subtract(C1,Sqr(f)),CN1D2))),
    // D(ArcSinh(f_),x_?NotListQ):=D(f,x)/Sqrt(1+f^2)
    ISetDelayed(D(ArcSinh(f_),PatternTest(x_,NotListQ)),
      Times(D(f,x),Power(Plus(C1,Sqr(f)),CN1D2))),
    // D(ArcTan(f_),x_?NotListQ):=D(f,x)/(1+f^2)
    ISetDelayed(D(ArcTan(f_),PatternTest(x_,NotListQ)),
      Times(D(f,x),Power(Plus(C1,Sqr(f)),CN1))),
    // D(ArcTanh(f_),x_?NotListQ):=D(f,x)/(1-f^2)
    ISetDelayed(D(ArcTanh(f_),PatternTest(x_,NotListQ)),
      Times(D(f,x),Power(Subtract(C1,Sqr(f)),CN1))),
    // D(ArcSec(f_),x_?NotListQ):=D(f,x)/(x^2*Sqrt(1-1/f^2))
    ISetDelayed(D(ArcSec(f_),PatternTest(x_,NotListQ)),
      Times(D(f,x),Power(x,CN2),Power(Subtract(C1,Power(f,CN2)),CN1D2))),
    // D(ArcSech(f_),x_?NotListQ):=(D(f,x)*(-1))/(f*Sqrt(1-f^2))
    ISetDelayed(D(ArcSech(f_),PatternTest(x_,NotListQ)),
      Times(D(f,x),CN1,Power(f,CN1),Power(Subtract(C1,Sqr(f)),CN1D2))),
    // D(Ceiling(f_),x_?NotListQ):=D(f,x)*Piecewise({{0,f<Ceiling(f)}},Indeterminate)
    ISetDelayed(D(Ceiling(f_),PatternTest(x_,NotListQ)),
      Times(D(f,x),Piecewise(List(List(C0,Less(f,Ceiling(f)))),Indeterminate))),
    // D(Erf(f_),x_?NotListQ):=D(f,x)*2*1/(E^f^2*Sqrt(Pi))
    ISetDelayed(D(Erf(f_),PatternTest(x_,NotListQ)),
      Times(D(f,x),C2,Exp(Negate(Sqr(f))),Power(Pi,CN1D2))),
    // D(Erfc(f_),x_?NotListQ):=D(f,x)*-2*1/(E^f^2*Sqrt(Pi))
    ISetDelayed(D(Erfc(f_),PatternTest(x_,NotListQ)),
      Times(D(f,x),CN2,Exp(Negate(Sqr(f))),Power(Pi,CN1D2))),
    // D(Erfi(f_),x_?NotListQ):=D(f,x)*2*E^f^2/Sqrt(Pi)
    ISetDelayed(D(Erfi(f_),PatternTest(x_,NotListQ)),
      Times(D(f,x),C2,Exp(Sqr(f)),Power(Pi,CN1D2))),
    // D(ExpIntegralEi(f_),x_?NotListQ):=D(f,x)*E^f/f
    ISetDelayed(D(ExpIntegralEi(f_),PatternTest(x_,NotListQ)),
      Times(D(f,x),Exp(f),Power(f,CN1))),
    // D(Floor(f_),x_?NotListQ):=D(f,x)*Piecewise({{0,f>Floor(f)}},Indeterminate)
    ISetDelayed(D(Floor(f_),PatternTest(x_,NotListQ)),
      Times(D(f,x),Piecewise(List(List(C0,Greater(f,Floor(f)))),Indeterminate))),
    // D(FractionalPart(f_),x_?NotListQ):=D(f,x)*1
    ISetDelayed(D(FractionalPart(f_),PatternTest(x_,NotListQ)),
      Times(D(f,x),C1)),
    // D(FresnelC(f_),x_?NotListQ):=D(f,x)*Cos(1/2*f^2*Pi)
    ISetDelayed(D(FresnelC(f_),PatternTest(x_,NotListQ)),
      Times(D(f,x),Cos(Times(C1D2,Sqr(f),Pi)))),
    // D(FresnelS(f_),x_?NotListQ):=D(f,x)*Sin(1/2*f^2*Pi)
    ISetDelayed(D(FresnelS(f_),PatternTest(x_,NotListQ)),
      Times(D(f,x),Sin(Times(C1D2,Sqr(f),Pi)))),
    // D(Gamma(f_),x_?NotListQ):=D(f,x)*Gamma(f)*PolyGamma(f)
    ISetDelayed(D(Gamma(f_),PatternTest(x_,NotListQ)),
      Times(D(f,x),Gamma(f),PolyGamma(f))),
    // D(HarmonicNumber(f_),x_?NotListQ):=D(f,x)*(Pi^2/6-HarmonicNumber(f,2))
    ISetDelayed(D(HarmonicNumber(f_),PatternTest(x_,NotListQ)),
      Times(D(f,x),Subtract(Times(QQ(1L,6L),Sqr(Pi)),HarmonicNumber(f,C2)))),
    // D(HeavisideTheta(f_),x_?NotListQ):=D(f,x)*DiracDelta(f)
    ISetDelayed(D(HeavisideTheta(f_),PatternTest(x_,NotListQ)),
      Times(D(f,x),DiracDelta(f))),
    // D(IntegerPart(f_),x_?NotListQ):=0
    ISetDelayed(D(IntegerPart(f_),PatternTest(x_,NotListQ)),
      C0),
    // D(InverseErf(f_),x_?NotListQ):=D(f,x)*1/2*Sqrt(Pi)*E^InverseErf(f)^2
    ISetDelayed(D(InverseErf(f_),PatternTest(x_,NotListQ)),
      Times(D(f,x),C1D2,Sqrt(Pi),Exp(Sqr(InverseErf(f))))),
    // D(InverseErfc(f_),x_?NotListQ):=D(f,x)*(-1/2)*E^InverseErfc(f)^2*Sqrt(Pi)
    ISetDelayed(D(InverseErfc(f_),PatternTest(x_,NotListQ)),
      Times(D(f,x),CN1D2,Exp(Sqr(InverseErfc(f))),Sqrt(Pi))),
    // D(Log(f_),x_?NotListQ):=D(f,x)/f
    ISetDelayed(D(Log(f_),PatternTest(x_,NotListQ)),
      Times(D(f,x),Power(f,CN1))),
    // D(LogGamma(f_),x_?NotListQ):=D(f,x)*PolyGamma(0,f)
    ISetDelayed(D(LogGamma(f_),PatternTest(x_,NotListQ)),
      Times(D(f,x),PolyGamma(C0,f))),
    // D(LogisticSigmoid(f_),x_?NotListQ):=D(f,x)*LogisticSigmoid(f)*(1-LogisticSigmoid(f))
    ISetDelayed(D(LogisticSigmoid(f_),PatternTest(x_,NotListQ)),
      Times(D(f,x),LogisticSigmoid(f),Subtract(C1,LogisticSigmoid(f)))),
    // D(PolyGamma(f_),x_?NotListQ):=D(f,x)*PolyGamma(1,f)
    ISetDelayed(D(PolyGamma(f_),PatternTest(x_,NotListQ)),
      Times(D(f,x),PolyGamma(C1,f))),
    // D(Cot(f_),x_?NotListQ):=D(f,x)*(-1)*Csc(f)^2
    ISetDelayed(D(Cot(f_),PatternTest(x_,NotListQ)),
      Times(D(f,x),CN1,Sqr(Csc(f)))),
    // D(Coth(f_),x_?NotListQ):=(D(f,x)*(-1))/Sinh(f)^2
    ISetDelayed(D(Coth(f_),PatternTest(x_,NotListQ)),
      Times(D(f,x),CN1,Power(Sinh(f),CN2))),
    // D(Cos(f_),x_?NotListQ):=D(f,x)*(-1)*Sin(f)
    ISetDelayed(D(Cos(f_),PatternTest(x_,NotListQ)),
      Times(D(f,x),CN1,Sin(f))),
    // D(Cosh(f_),x_?NotListQ):=D(f,x)*Sinh(f)
    ISetDelayed(D(Cosh(f_),PatternTest(x_,NotListQ)),
      Times(D(f,x),Sinh(f))),
    // D(Csc(f_),x_?NotListQ):=D(f,x)*(-1)*Cot(f)*Csc(f)
    ISetDelayed(D(Csc(f_),PatternTest(x_,NotListQ)),
      Times(D(f,x),CN1,Cot(f),Csc(f))),
    // D(Csch(f_),x_?NotListQ):=D(f,x)*(-1)*Coth(f)*Csch(f)
    ISetDelayed(D(Csch(f_),PatternTest(x_,NotListQ)),
      Times(D(f,x),CN1,Coth(f),Csch(f))),
    // D(Round(f_),x_?NotListQ):=D(f,x)*Piecewise({{0,NotElement(-1/2+Re(f),Integers)&&NotElement(-1/2+Im(f),Integers)}},Indeterminate)
    ISetDelayed(D(Round(f_),PatternTest(x_,NotListQ)),
      Times(D(f,x),Piecewise(List(List(C0,And(NotElement(Plus(CN1D2,Re(f)),Integers),NotElement(Plus(CN1D2,Im(f)),Integers)))),Indeterminate))),
    // D(Sin(f_),x_?NotListQ):=D(f,x)*Cos(f)
    ISetDelayed(D(Sin(f_),PatternTest(x_,NotListQ)),
      Times(D(f,x),Cos(f))),
    // D(Sinc(f_),x_?NotListQ):=D(f,x)*(Cos(f)/f-Sin(f)/f^2)
    ISetDelayed(D(Sinc(f_),PatternTest(x_,NotListQ)),
      Times(D(f,x),Plus(Times(Power(f,CN1),Cos(f)),Times(CN1,Power(f,CN2),Sin(f))))),
    // D(Sinh(f_),x_?NotListQ):=D(f,x)*Cosh(f)
    ISetDelayed(D(Sinh(f_),PatternTest(x_,NotListQ)),
      Times(D(f,x),Cosh(f))),
    // D(Tan(f_),x_?NotListQ):=D(f,x)*Sec(f)^2
    ISetDelayed(D(Tan(f_),PatternTest(x_,NotListQ)),
      Times(D(f,x),Sqr(Sec(f)))),
    // D(Tanh(f_),x_?NotListQ):=D(f,x)*Sech(f)^2
    ISetDelayed(D(Tanh(f_),PatternTest(x_,NotListQ)),
      Times(D(f,x),Sqr(Sech(f)))),
    // D(Sec(f_),x_?NotListQ):=D(f,x)*Sec(f)*Tan(f)
    ISetDelayed(D(Sec(f_),PatternTest(x_,NotListQ)),
      Times(D(f,x),Sec(f),Tan(f))),
    // D(Sech(f_),x_?NotListQ):=D(f,x)*(-1)*Tanh(f)*Sech(f)
    ISetDelayed(D(Sech(f_),PatternTest(x_,NotListQ)),
      Times(D(f,x),CN1,Tanh(f),Sech(f))),
    // D(CosIntegral(f_),x_?NotListQ):=D(f,x)*Cos(f)/f
    ISetDelayed(D(CosIntegral(f_),PatternTest(x_,NotListQ)),
      Times(D(f,x),Power(f,CN1),Cos(f))),
    // D(CoshIntegral(f_),x_?NotListQ):=D(f,x)*Cosh(f)/f
    ISetDelayed(D(CoshIntegral(f_),PatternTest(x_,NotListQ)),
      Times(D(f,x),Power(f,CN1),Cosh(f))),
    // D(SinIntegral(f_),x_?NotListQ):=D(f,x)*Sinc(f)
    ISetDelayed(D(SinIntegral(f_),PatternTest(x_,NotListQ)),
      Times(D(f,x),Sinc(f))),
    // D(SinhIntegral(f_),x_?NotListQ):=D(f,x)*Sinh(f)/f
    ISetDelayed(D(SinhIntegral(f_),PatternTest(x_,NotListQ)),
      Times(D(f,x),Power(f,CN1),Sinh(f))),
    // D(InverseFunction(f_)[x_],x_):=1/f'(InverseFunction(f)[x])/;FreeQ(f,x)
    ISetDelayed(D($(InverseFunction(f_),x_),x_),
      Condition(Power($($(Derivative(C1),f),$(InverseFunction(f),x)),CN1),FreeQ(f,x))),
    // D(ArcCos(x_),{x_,2}):=-x/(1-x^2)^(3/2)
    ISetDelayed(D(ArcCos(x_),List(x_,C2)),
      Times(CN1,x,Power(Subtract(C1,Sqr(x)),QQ(-3L,2L)))),
    // D(ArcCot(x_),{x_,2}):=(2*x)/(1+x^2)^2
    ISetDelayed(D(ArcCot(x_),List(x_,C2)),
      Times(C2,x,Power(Plus(C1,Sqr(x)),CN2))),
    // D(ArcSin(x_),{x_,2}):=x/(1-x^2)^(3/2)
    ISetDelayed(D(ArcSin(x_),List(x_,C2)),
      Times(x,Power(Subtract(C1,Sqr(x)),QQ(-3L,2L)))),
    // D(ArcTan(x_),{x_,2}):=((-1)*2*x)/(1+x^2)^2
    ISetDelayed(D(ArcTan(x_),List(x_,C2)),
      Times(CN1,C2,x,Power(Plus(C1,Sqr(x)),CN2))),
    // D(ArcCosh(x_),{x_,2}):=-x/((-1+x)^(3/2)*(1+x)^(3/2))
    ISetDelayed(D(ArcCosh(x_),List(x_,C2)),
      Times(CN1,x,Power(Times(Power(Plus(CN1,x),QQ(3L,2L)),Power(Plus(C1,x),QQ(3L,2L))),CN1))),
    // D(ArcCoth(x_),{x_,2}):=(2*x)/(1-x^2)^2
    ISetDelayed(D(ArcCoth(x_),List(x_,C2)),
      Times(C2,x,Power(Subtract(C1,Sqr(x)),CN2))),
    // D(ArcSinh(x_),{x_,2}):=-x/(1+x^2)^(3/2)
    ISetDelayed(D(ArcSinh(x_),List(x_,C2)),
      Times(CN1,x,Power(Plus(C1,Sqr(x)),QQ(-3L,2L)))),
    // D(ArcTanh(x_),{x_,2}):=(2*x)/(1-x^2)^2
    ISetDelayed(D(ArcTanh(x_),List(x_,C2)),
      Times(C2,x,Power(Subtract(C1,Sqr(x)),CN2))),
    // D(ArcCsc(x_),{x_,2}):=(-1+2*x^2)/(Sqrt(1-1/x^2)*x^3*(-1+x^2))
    ISetDelayed(D(ArcCsc(x_),List(x_,C2)),
      Times(Plus(CN1,Times(C2,Sqr(x))),Power(Times(Sqrt(Subtract(C1,Power(x,CN2))),Power(x,C3),Plus(CN1,Sqr(x))),CN1))),
    // D(ArcSec(x_),{x_,2}):=(1-2*x^2)/(Sqrt(1-1/x^2)*x^3*(-1+x^2))
    ISetDelayed(D(ArcSec(x_),List(x_,C2)),
      Times(Plus(C1,Times(CN2,Sqr(x))),Power(Times(Sqrt(Subtract(C1,Power(x,CN2))),Power(x,C3),Plus(CN1,Sqr(x))),CN1))),
    // D(Cos(x_),{x_,2}):=-Cos(x)
    ISetDelayed(D(Cos(x_),List(x_,C2)),
      Negate(Cos(x))),
    // D(Cot(x_),{x_,2}):=2*Cot(x)*Csc(x)^2
    ISetDelayed(D(Cot(x_),List(x_,C2)),
      Times(C2,Cot(x),Sqr(Csc(x)))),
    // D(Sin(x_),{x_,2}):=-Sin(x)
    ISetDelayed(D(Sin(x_),List(x_,C2)),
      Negate(Sin(x))),
    // D(Tan(x_),{x_,2}):=2*Sec(x)^2*Tan(x)
    ISetDelayed(D(Tan(x_),List(x_,C2)),
      Times(C2,Sqr(Sec(x)),Tan(x))),
    // D(Csc(x_),{x_,2}):=Csc(x)^3+Csc(x)*Cot(x)^2
    ISetDelayed(D(Csc(x_),List(x_,C2)),
      Plus(Power(Csc(x),C3),Times(Csc(x),Sqr(Cot(x))))),
    // D(Sec(x_),{x_,2}):=Sec(x)^3+Sec(x)*Tan(x)^2
    ISetDelayed(D(Sec(x_),List(x_,C2)),
      Plus(Power(Sec(x),C3),Times(Sec(x),Sqr(Tan(x))))),
    // D(x_^a_,{x_,n_Integer}):=Pochhammer(a-n+1,n)*x^(a-n)/;n>=0&&FreeQ(a,x)
    ISetDelayed(D(Power(x_,a_),List(x_,$p(n, Integer))),
      Condition(Times(Pochhammer(Plus(a,Negate(n),C1),n),Power(x,Subtract(a,n))),And(GreaterEqual(n,C0),FreeQ(a,x)))),
    // D(a_^x_,{x_,n_Integer}):=a^x*Log(x)^n/;n>=0&&FreeQ(a,x)
    ISetDelayed(D(Power(a_,x_),List(x_,$p(n, Integer))),
      Condition(Times(Power(a,x),Power(Log(x),n)),And(GreaterEqual(n,C0),FreeQ(a,x)))),
    // D(ArcCos(x_),{x_,n_Integer}):=KroneckerDelta(n)*ArcCos(x)-1/((-1)^(1-n)*(1-x^2)^(-1/2+n))*Sum((Pochhammer(1-n,k)*Pochhammer(1/2,k)*2^(1+2*k-n)*x^(1+2*k-n)*(-1+x^2)^(-1-k+n))/(2*k-n+1)!,{k,0,-1+n})/;n>=0
    ISetDelayed(D(ArcCos(x_),List(x_,$p(n, Integer))),
      Condition(Plus(Times(KroneckerDelta(n),ArcCos(x)),Times(CN1,Power(CN1,Plus(CN1,n)),Power(Power(Subtract(C1,Sqr(x)),Plus(CN1D2,n)),CN1),Sum(Times(Power(Factorial(Plus(Times(C2,k),Negate(n),C1)),CN1),Pochhammer(Subtract(C1,n),k),Pochhammer(C1D2,k),Power(C2,Plus(C1,Times(C2,k),Negate(n))),Power(x,Plus(C1,Times(C2,k),Negate(n))),Power(Plus(CN1,Sqr(x)),Plus(CN1,Negate(k),n))),List(k,C0,Plus(CN1,n))))),GreaterEqual(n,C0))),
    // D(ArcCot(x_),{x_,n_Integer}):=KroneckerDelta(n)*ArcCot(x)-Sum(((-1)^k*1/((-1-k+n)!/(2*x)^(1+2*k-n))*k!*Pochhammer(2*k-n+2,-2+2*(-k+n)))/(1+x^2)^(1+k),{k,0,-1+n})/;n>=0
    ISetDelayed(D(ArcCot(x_),List(x_,$p(n, Integer))),
      Condition(Subtract(Times(KroneckerDelta(n),ArcCot(x)),Sum(Times(Power(CN1,k),Power(Times(Factorial(Plus(CN1,Negate(k),n)),Power(Times(C2,x),Plus(CN1,Times(CN2,k),n))),CN1),Factorial(k),Pochhammer(Plus(Times(C2,k),Negate(n),C2),Plus(CN2,Times(C2,Plus(Negate(k),n)))),Power(Plus(C1,Sqr(x)),Subtract(CN1,k))),List(k,C0,Plus(CN1,n)))),GreaterEqual(n,C0))),
    // D(ArcSin(x_),{x_,n_Integer}):=KroneckerDelta(n)*ArcSin(x)+1/((-1)^(1-n)*(1-x^2)^(-1/2+n))*Sum((2^(1+2*k-n)*x^(1+2*k-n)*Pochhammer(1/2,k)*Pochhammer(1-n,k))/((-1+x^2)^(1+k-n)*(2*k-n+1)!),{k,0,-1+n})/;n>=0
    ISetDelayed(D(ArcSin(x_),List(x_,$p(n, Integer))),
      Condition(Plus(Times(KroneckerDelta(n),ArcSin(x)),Times(Power(CN1,Plus(CN1,n)),Power(Power(Subtract(C1,Sqr(x)),Plus(CN1D2,n)),CN1),Sum(Times(Power(C2,Plus(C1,Times(C2,k),Negate(n))),Power(x,Plus(C1,Times(C2,k),Negate(n))),Power(Plus(CN1,Sqr(x)),Plus(CN1,Negate(k),n)),Power(Factorial(Plus(Times(C2,k),Negate(n),C1)),CN1),Pochhammer(C1D2,k),Pochhammer(Subtract(C1,n),k)),List(k,C0,Plus(CN1,n))))),GreaterEqual(n,C0))),
    // D(ArcTan(x_),{x_,n_Integer}):=KroneckerDelta(n)*ArcTan(x)+Sum(((-1)^k*1/((-1-k+n)!/(2*x)^(1+2*k-n))*k!*Pochhammer(2*k-n+2,-2+2*(-k+n)))/(1+x^2)^(1+k),{k,0,-1+n})/;n>=0
    ISetDelayed(D(ArcTan(x_),List(x_,$p(n, Integer))),
      Condition(Plus(Times(KroneckerDelta(n),ArcTan(x)),Sum(Times(Power(CN1,k),Power(Times(Factorial(Plus(CN1,Negate(k),n)),Power(Times(C2,x),Plus(CN1,Times(CN2,k),n))),CN1),Factorial(k),Pochhammer(Plus(Times(C2,k),Negate(n),C2),Plus(CN2,Times(C2,Plus(Negate(k),n)))),Power(Plus(C1,Sqr(x)),Subtract(CN1,k))),List(k,C0,Plus(CN1,n)))),GreaterEqual(n,C0))),
    // D(Cos(x_),{x_,n_Integer}):=Cos(x+1/2*n*Pi)/;n>=0
    ISetDelayed(D(Cos(x_),List(x_,$p(n, Integer))),
      Condition(Cos(Plus(x,Times(C1D2,n,Pi))),GreaterEqual(n,C0))),
    // D(Cot(x_),{x_,n_Integer}):=-Csc(x)^2*KroneckerDelta(-1+n)+Cot(x)*KroneckerDelta(n)-n*Sum((((-1)^j*Binomial(-1+n,k))/(k+1)*Binomial(2*k,j)*Sin(1/2*n*Pi+2*(-j+k)*x))/(Sin(x)^(2+2*k)*2^(2*k-n)*(-j+k)^(1-n)),{k,0,-1+n},{j,0,-1+k})/;n>=0
    ISetDelayed(D(Cot(x_),List(x_,$p(n, Integer))),
      Condition(Plus(Times(CN1,Sqr(Csc(x)),KroneckerDelta(Plus(CN1,n))),Times(Cot(x),KroneckerDelta(n)),Times(CN1,n,Sum(Times(Power(CN1,j),Power(Plus(k,C1),CN1),Binomial(Plus(CN1,n),k),Power(Sin(x),Plus(CN2,Times(CN2,k))),Power(C2,Plus(Times(CN2,k),n)),Binomial(Times(C2,k),j),Power(Plus(Negate(j),k),Plus(CN1,n)),Sin(Plus(Times(C1D2,n,Pi),Times(C2,Plus(Negate(j),k),x)))),List(k,C0,Plus(CN1,n)),List(j,C0,Plus(CN1,k))))),GreaterEqual(n,C0))),
    // D(Sin(x_),{x_,n_Integer}):=Sin(x+1/2*n*Pi)/;n>=0
    ISetDelayed(D(Sin(x_),List(x_,$p(n, Integer))),
      Condition(Sin(Plus(x,Times(C1D2,n,Pi))),GreaterEqual(n,C0))),
    // D(Tan(x_),{x_,n_Integer}):=Tan(x)*KroneckerDelta(n)+Sec(x)^2*KroneckerDelta(-1+n)+n*Sum((((-1)^k*Binomial(-1+n,k))/(k+1)*Binomial(2*k,j)*Sin(1/2*n*Pi+2*(-j+k)*x))/(Cos(x)^(2+2*k)*2^(2*k-n)*(-j+k)^(1-n)),{k,0,-1+n},{j,0,-1+k})/;n>=0
    ISetDelayed(D(Tan(x_),List(x_,$p(n, Integer))),
      Condition(Plus(Times(Tan(x),KroneckerDelta(n)),Times(Sqr(Sec(x)),KroneckerDelta(Plus(CN1,n))),Times(n,Sum(Times(Power(CN1,k),Power(Plus(k,C1),CN1),Binomial(Plus(CN1,n),k),Power(Cos(x),Plus(CN2,Times(CN2,k))),Power(C2,Plus(Times(CN2,k),n)),Binomial(Times(C2,k),j),Power(Plus(Negate(j),k),Plus(CN1,n)),Sin(Plus(Times(C1D2,n,Pi),Times(C2,Plus(Negate(j),k),x)))),List(k,C0,Plus(CN1,n)),List(j,C0,Plus(CN1,k))))),GreaterEqual(n,C0))),
    // D(Log(x_),{x_,n_Integer}):=(-1+n)!/((-1)^(1-n)*x^n)/;n>=0
    ISetDelayed(D(Log(x_),List(x_,$p(n, Integer))),
      Condition(Times(Power(CN1,Plus(CN1,n)),Power(Power(x,n),CN1),Factorial(Plus(CN1,n))),GreaterEqual(n,C0))),
    // D(ArcTan(f_,g_),x_?NotListQ):=With({d=(-g*D(f,x)+f*D(g,x))/(f^2+g^2)},If(PossibleZeroQ(d),0,d))
    ISetDelayed(D(ArcTan(f_,g_),PatternTest(x_,NotListQ)),
      With(List(Set(d,Times(Power(Plus(Sqr(f),Sqr(g)),CN1),Plus(Times(CN1,g,D(f,x)),Times(f,D(g,x)))))),If(PossibleZeroQ(d),C0,d))),
    // D(BesselJ(f_,g_),x_?NotListQ):=1/2*(BesselJ(-1+f,g)-BesselJ(1+f,g))*D(g,x)+D(f,x)*Derivative(1,0)[BesselJ][f,g]
    ISetDelayed(D(BesselJ(f_,g_),PatternTest(x_,NotListQ)),
      Plus(Times(C1D2,Subtract(BesselJ(Plus(CN1,f),g),BesselJ(Plus(C1,f),g)),D(g,x)),Times(D(f,x),$($(Derivative(C1,C0),BesselJ),f,g)))),
    // D(PolyLog(f_,g_),x_?NotListQ):=(D(g,x)*PolyLog(-1+f,g))/g+D(f,x)*Derivative(1,0)[PolyLog][f,g]
    ISetDelayed(D(PolyLog(f_,g_),PatternTest(x_,NotListQ)),
      Plus(Times(Power(g,CN1),D(g,x),PolyLog(Plus(CN1,f),g)),Times(D(f,x),$($(Derivative(C1,C0),PolyLog),f,g)))),
    // D(ProductLog(f_),x_?NotListQ):=(D(f,x)*ProductLog(f))/(f*(1+ProductLog(f)))
    ISetDelayed(D(ProductLog(f_),PatternTest(x_,NotListQ)),
      Times(D(f,x),ProductLog(f),Power(Times(f,Plus(C1,ProductLog(f))),CN1))),
    // D(ProductLog(f_,g_),x_?NotListQ):=ProductLog(f,g)*D(g,x)/(g*(1+ProductLog(f,g)))+D(f,x)*Derivative(1,0)[ProductLog][f,g]
    ISetDelayed(D(ProductLog(f_,g_),PatternTest(x_,NotListQ)),
      Plus(Times(ProductLog(f,g),D(g,x),Power(Times(g,Plus(C1,ProductLog(f,g))),CN1)),Times(D(f,x),$($(Derivative(C1,C0),ProductLog),f,g))))
  );
}
