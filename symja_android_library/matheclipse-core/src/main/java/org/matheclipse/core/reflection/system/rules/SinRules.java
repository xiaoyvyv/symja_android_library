package org.matheclipse.core.reflection.system.rules;

import org.matheclipse.core.interfaces.IAST;

import static org.matheclipse.core.expression.F.ArcCos;
import static org.matheclipse.core.expression.F.ArcCot;
import static org.matheclipse.core.expression.F.ArcCsc;
import static org.matheclipse.core.expression.F.ArcSec;
import static org.matheclipse.core.expression.F.ArcSin;
import static org.matheclipse.core.expression.F.ArcTan;
import static org.matheclipse.core.expression.F.C0;
import static org.matheclipse.core.expression.F.C1;
import static org.matheclipse.core.expression.F.C1D2;
import static org.matheclipse.core.expression.F.C1D3;
import static org.matheclipse.core.expression.F.C1D4;
import static org.matheclipse.core.expression.F.C1DSqrt2;
import static org.matheclipse.core.expression.F.C2;
import static org.matheclipse.core.expression.F.C2Pi;
import static org.matheclipse.core.expression.F.C5;
import static org.matheclipse.core.expression.F.CComplexInfinity;
import static org.matheclipse.core.expression.F.CI;
import static org.matheclipse.core.expression.F.CN1;
import static org.matheclipse.core.expression.F.CN1D2;
import static org.matheclipse.core.expression.F.CN2;
import static org.matheclipse.core.expression.F.CNI;
import static org.matheclipse.core.expression.F.CPiHalf;
import static org.matheclipse.core.expression.F.CSqrt2;
import static org.matheclipse.core.expression.F.CSqrt3;
import static org.matheclipse.core.expression.F.CSqrt5;
import static org.matheclipse.core.expression.F.Condition;
import static org.matheclipse.core.expression.F.DirectedInfinity;
import static org.matheclipse.core.expression.F.GreaterEqual;
import static org.matheclipse.core.expression.F.IInit;
import static org.matheclipse.core.expression.F.ISet;
import static org.matheclipse.core.expression.F.ISetDelayed;
import static org.matheclipse.core.expression.F.If;
import static org.matheclipse.core.expression.F.Indeterminate;
import static org.matheclipse.core.expression.F.IntegerPart;
import static org.matheclipse.core.expression.F.Interval;
import static org.matheclipse.core.expression.F.Less;
import static org.matheclipse.core.expression.F.List;
import static org.matheclipse.core.expression.F.Negate;
import static org.matheclipse.core.expression.F.Noo;
import static org.matheclipse.core.expression.F.NumberQ;
import static org.matheclipse.core.expression.F.PatternTest;
import static org.matheclipse.core.expression.F.Pi;
import static org.matheclipse.core.expression.F.Plus;
import static org.matheclipse.core.expression.F.Power;
import static org.matheclipse.core.expression.F.QQ;
import static org.matheclipse.core.expression.F.Quotient;
import static org.matheclipse.core.expression.F.Sin;
import static org.matheclipse.core.expression.F.Sinh;
import static org.matheclipse.core.expression.F.Sqr;
import static org.matheclipse.core.expression.F.Sqrt;
import static org.matheclipse.core.expression.F.Subtract;
import static org.matheclipse.core.expression.F.Times;
import static org.matheclipse.core.expression.F.oo;
import static org.matheclipse.core.expression.F.x;
import static org.matheclipse.core.expression.F.x_;

/**
 * <p>Generated by <code>org.matheclipse.core.preprocessor.RulePreprocessor</code>.</p>
 * <p>See GIT repository at: <a href="https://github.com/axkr/symja_android_library">github.com/axkr/symja_android_library under the tools directory</a>.</p>
 */
public interface SinRules {
  /**
   * <ul>
   * <li>index 0 - number of equal rules in <code>RULES</code></li>
	 * </ul>
	 */
  final public static int[] SIZES = { 55, 11 };

  final public static IAST RULES = List(
    IInit(Sin, SIZES),
    // Sin(0)=0
    ISet(Sin(C0),
      C0),
    // Sin(Pi/12)=(-1+Sqrt(3))/(2*Sqrt(2))
    ISet(Sin(Times(QQ(1L,12L),Pi)),
      Times(C1D2,C1DSqrt2,Plus(CN1,CSqrt3))),
    // Sin(Pi/10)=1/4*(-1+Sqrt(5))
    ISet(Sin(Times(QQ(1L,10L),Pi)),
      Times(C1D4,Plus(CN1,CSqrt5))),
    // Sin(Pi/8)=Sqrt(2-Sqrt(2))/2
    ISet(Sin(Times(QQ(1L,8L),Pi)),
      Times(C1D2,Sqrt(Subtract(C2,CSqrt2)))),
    // Sin(Pi/6)=1/2
    ISet(Sin(Times(QQ(1L,6L),Pi)),
      C1D2),
    // Sin(Pi/5)=Sqrt(1/2*(5-Sqrt(5)))/2
    ISet(Sin(Times(QQ(1L,5L),Pi)),
      Times(C1D2,Sqrt(Times(C1D2,Subtract(C5,CSqrt5))))),
    // Sin(Pi/4)=Sqrt(2)/2
    ISet(Sin(Times(C1D4,Pi)),
      C1DSqrt2),
    // Sin(3/10*Pi)=1/4*(Sqrt(5)+1)
    ISet(Sin(Times(QQ(3L,10L),Pi)),
      Times(C1D4,Plus(C1,CSqrt5))),
    // Sin(Pi/3)=Sqrt(3)/2
    ISet(Sin(Times(C1D3,Pi)),
      Times(C1D2,CSqrt3)),
    // Sin(3/8*Pi)=Sqrt(2+Sqrt(2))/2
    ISet(Sin(Times(QQ(3L,8L),Pi)),
      Times(C1D2,Sqrt(Plus(C2,CSqrt2)))),
    // Sin(2/5*Pi)=Sqrt(1/2*(5+Sqrt(5)))/2
    ISet(Sin(Times(QQ(2L,5L),Pi)),
      Times(C1D2,Sqrt(Times(C1D2,Plus(C5,CSqrt5))))),
    // Sin(5/12*Pi)=(1+Sqrt(3))/(2*Sqrt(2))
    ISet(Sin(Times(QQ(5L,12L),Pi)),
      Times(C1D2,C1DSqrt2,Plus(C1,CSqrt3))),
    // Sin(Pi/2)=1
    ISet(Sin(CPiHalf),
      C1),
    // Sin(7/12*Pi)=(1+Sqrt(3))/(2*Sqrt(2))
    ISet(Sin(Times(QQ(7L,12L),Pi)),
      Times(C1D2,C1DSqrt2,Plus(C1,CSqrt3))),
    // Sin(3/5*Pi)=Sqrt(1/2*(5+Sqrt(5)))/2
    ISet(Sin(Times(QQ(3L,5L),Pi)),
      Times(C1D2,Sqrt(Times(C1D2,Plus(C5,CSqrt5))))),
    // Sin(5/8*Pi)=Sqrt(2+Sqrt(2))/2
    ISet(Sin(Times(QQ(5L,8L),Pi)),
      Times(C1D2,Sqrt(Plus(C2,CSqrt2)))),
    // Sin(2/3*Pi)=Sqrt(3)/2
    ISet(Sin(Times(QQ(2L,3L),Pi)),
      Times(C1D2,CSqrt3)),
    // Sin(7/10*Pi)=1/4*(Sqrt(5)+1)
    ISet(Sin(Times(QQ(7L,10L),Pi)),
      Times(C1D4,Plus(C1,CSqrt5))),
    // Sin(3/4*Pi)=Sqrt(2)/2
    ISet(Sin(Times(QQ(3L,4L),Pi)),
      C1DSqrt2),
    // Sin(4/5*Pi)=Sqrt(1/2*(5-Sqrt(5)))/2
    ISet(Sin(Times(QQ(4L,5L),Pi)),
      Times(C1D2,Sqrt(Times(C1D2,Subtract(C5,CSqrt5))))),
    // Sin(5/6*Pi)=1/2
    ISet(Sin(Times(QQ(5L,6L),Pi)),
      C1D2),
    // Sin(7/8*Pi)=Sqrt(2-Sqrt(2))/2
    ISet(Sin(Times(QQ(7L,8L),Pi)),
      Times(C1D2,Sqrt(Subtract(C2,CSqrt2)))),
    // Sin(9/10*Pi)=1/4*(-1+Sqrt(5))
    ISet(Sin(Times(QQ(9L,10L),Pi)),
      Times(C1D4,Plus(CN1,CSqrt5))),
    // Sin(11/12*Pi)=(-1+Sqrt(3))/(2*Sqrt(2))
    ISet(Sin(Times(QQ(11L,12L),Pi)),
      Times(C1D2,C1DSqrt2,Plus(CN1,CSqrt3))),
    // Sin(Pi)=0
    ISet(Sin(Pi),
      C0),
    // Sin(13/12*Pi)=-(-1+Sqrt(3))/(2*Sqrt(2))
    ISet(Sin(Times(QQ(13L,12L),Pi)),
      Times(C1D2,C1DSqrt2,Subtract(C1,CSqrt3))),
    // Sin(11/10*Pi)=-(-1+Sqrt(5))/4
    ISet(Sin(Times(QQ(11L,10L),Pi)),
      Times(C1D4,Subtract(C1,CSqrt5))),
    // Sin(9/8*Pi)=-Sqrt(2-Sqrt(2))/2
    ISet(Sin(Times(QQ(9L,8L),Pi)),
      Times(CN1D2,Sqrt(Subtract(C2,CSqrt2)))),
    // Sin(7/6*Pi)=-1/2
    ISet(Sin(Times(QQ(7L,6L),Pi)),
      CN1D2),
    // Sin(6/5*Pi)=-Sqrt(1/2*(5-Sqrt(5)))/2
    ISet(Sin(Times(QQ(6L,5L),Pi)),
      Times(CN1D2,Sqrt(Times(C1D2,Subtract(C5,CSqrt5))))),
    // Sin(5/4*Pi)=(-1)*1/2*Sqrt(2)
    ISet(Sin(Times(QQ(5L,4L),Pi)),
      Negate(C1DSqrt2)),
    // Sin(13/10*Pi)=-(Sqrt(5)+1)/4
    ISet(Sin(Times(QQ(13L,10L),Pi)),
      Times(C1D4,Subtract(CN1,CSqrt5))),
    // Sin(4/3*Pi)=(-1)*1/2*Sqrt(3)
    ISet(Sin(Times(QQ(4L,3L),Pi)),
      Times(CN1D2,CSqrt3)),
    // Sin(11/8*Pi)=-Sqrt(2+Sqrt(2))/2
    ISet(Sin(Times(QQ(11L,8L),Pi)),
      Times(CN1D2,Sqrt(Plus(C2,CSqrt2)))),
    // Sin(7/5*Pi)=-Sqrt(1/2*(5+Sqrt(5)))/2
    ISet(Sin(Times(QQ(7L,5L),Pi)),
      Times(CN1D2,Sqrt(Times(C1D2,Plus(C5,CSqrt5))))),
    // Sin(17/12*Pi)=-(1+Sqrt(3))/(2*Sqrt(2))
    ISet(Sin(Times(QQ(17L,12L),Pi)),
      Times(C1D2,C1DSqrt2,Subtract(CN1,CSqrt3))),
    // Sin(3/2*Pi)=-1
    ISet(Sin(Times(QQ(3L,2L),Pi)),
      CN1),
    // Sin(19/12*Pi)=-(1+Sqrt(3))/(2*Sqrt(2))
    ISet(Sin(Times(QQ(19L,12L),Pi)),
      Times(C1D2,C1DSqrt2,Subtract(CN1,CSqrt3))),
    // Sin(8/5*Pi)=-Sqrt(1/2*(5+Sqrt(5)))/2
    ISet(Sin(Times(QQ(8L,5L),Pi)),
      Times(CN1D2,Sqrt(Times(C1D2,Plus(C5,CSqrt5))))),
    // Sin(13/8*Pi)=-Sqrt(2+Sqrt(2))/2
    ISet(Sin(Times(QQ(13L,8L),Pi)),
      Times(CN1D2,Sqrt(Plus(C2,CSqrt2)))),
    // Sin(5/3*Pi)=(-1)*1/2*Sqrt(3)
    ISet(Sin(Times(QQ(5L,3L),Pi)),
      Times(CN1D2,CSqrt3)),
    // Sin(17/10*Pi)=-(Sqrt(5)+1)/4
    ISet(Sin(Times(QQ(17L,10L),Pi)),
      Times(C1D4,Subtract(CN1,CSqrt5))),
    // Sin(7/4*Pi)=(-1)*1/2*Sqrt(2)
    ISet(Sin(Times(QQ(7L,4L),Pi)),
      Negate(C1DSqrt2)),
    // Sin(9/5*Pi)=-Sqrt(1/2*(5-Sqrt(5)))/2
    ISet(Sin(Times(QQ(9L,5L),Pi)),
      Times(CN1D2,Sqrt(Times(C1D2,Subtract(C5,CSqrt5))))),
    // Sin(11/6*Pi)=-1/2
    ISet(Sin(Times(QQ(11L,6L),Pi)),
      CN1D2),
    // Sin(15/8*Pi)=-Sqrt(2-Sqrt(2))/2
    ISet(Sin(Times(QQ(15L,8L),Pi)),
      Times(CN1D2,Sqrt(Subtract(C2,CSqrt2)))),
    // Sin(19/10*Pi)=-(-1+Sqrt(5))/4
    ISet(Sin(Times(QQ(19L,10L),Pi)),
      Times(C1D4,Subtract(C1,CSqrt5))),
    // Sin(23/12*Pi)=-(-1+Sqrt(3))/(2*Sqrt(2))
    ISet(Sin(Times(QQ(23L,12L),Pi)),
      Times(C1D2,C1DSqrt2,Subtract(C1,CSqrt3))),
    // Sin(2*Pi)=0
    ISet(Sin(C2Pi),
      C0),
    // Sin(I)=I*Sinh(1)
    ISet(Sin(CI),
      Times(CI,Sinh(C1))),
    // Sin(x_?NumberQ*Pi):=If(x<1,Sin((1-x)*Pi),If(x<2,-Sin((2-x)*Pi),Sin((x-2*Quotient(IntegerPart(x),2))*Pi)))/;x>=1/2
    ISetDelayed(Sin(Times(Pi,PatternTest(x_,NumberQ))),
      Condition(If(Less(x,C1),Sin(Times(Subtract(C1,x),Pi)),If(Less(x,C2),Negate(Sin(Times(Subtract(C2,x),Pi))),Sin(Times(Plus(x,Times(CN2,Quotient(IntegerPart(x),C2))),Pi)))),GreaterEqual(x,C1D2))),
    // Sin(ArcSin(x_)):=x
    ISetDelayed(Sin(ArcSin(x_)),
      x),
    // Sin(2*ArcSin(x_)):=2*x*Sqrt(1-x)*Sqrt(1+x)
    ISetDelayed(Sin(Times(C2,ArcSin(x_))),
      Times(C2,x,Sqrt(Subtract(C1,x)),Sqrt(Plus(C1,x)))),
    // Sin(ArcCos(x_)):=Sqrt(1-x^2)
    ISetDelayed(Sin(ArcCos(x_)),
      Sqrt(Subtract(C1,Sqr(x)))),
    // Sin(2*ArcCos(x_)):=2*x*Sqrt(1-x)*Sqrt(1+x)
    ISetDelayed(Sin(Times(C2,ArcCos(x_))),
      Times(C2,x,Sqrt(Subtract(C1,x)),Sqrt(Plus(C1,x)))),
    // Sin(ArcTan(x_)):=x/Sqrt(1+x^2)
    ISetDelayed(Sin(ArcTan(x_)),
      Times(x,Power(Plus(C1,Sqr(x)),CN1D2))),
    // Sin(2*ArcTan(x_)):=(2*x)/(1+x^2)
    ISetDelayed(Sin(Times(C2,ArcTan(x_))),
      Times(C2,x,Power(Plus(C1,Sqr(x)),CN1))),
    // Sin(ArcCot(x_)):=1/Sqrt(1+x^2)
    ISetDelayed(Sin(ArcCot(x_)),
      Power(Plus(C1,Sqr(x)),CN1D2)),
    // Sin(2*ArcCot(x_)):=(2*x)/(1+x^2)
    ISetDelayed(Sin(Times(C2,ArcCot(x_))),
      Times(C2,x,Power(Plus(C1,Sqr(x)),CN1))),
    // Sin(ArcCsc(x_)):=1/x
    ISetDelayed(Sin(ArcCsc(x_)),
      Power(x,CN1)),
    // Sin(ArcSec(x_)):=Sqrt(1-1/x^2)
    ISetDelayed(Sin(ArcSec(x_)),
      Sqrt(Subtract(C1,Power(x,CN2)))),
    // Sin(I*Infinity)=I*Infinity
    ISet(Sin(DirectedInfinity(CI)),
      DirectedInfinity(CI)),
    // Sin(-I*Infinity)=-I*Infinity
    ISet(Sin(DirectedInfinity(CNI)),
      DirectedInfinity(CNI)),
    // Sin(ComplexInfinity)=Indeterminate
    ISet(Sin(CComplexInfinity),
      Indeterminate),
    // Sin(Infinity)=Interval({-1,1})
    ISet(Sin(oo),
      Interval(List(CN1,C1))),
    // Sin(-Infinity)=Interval({-1,1})
    ISet(Sin(Noo),
      Interval(List(CN1,C1)))
  );
}
