package org.matheclipse.core.reflection.system.rules;

import org.matheclipse.core.interfaces.IAST;

import static org.matheclipse.core.expression.F.$p;
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
import static org.matheclipse.core.expression.F.C1DSqrt3;
import static org.matheclipse.core.expression.F.C1DSqrt5;
import static org.matheclipse.core.expression.F.C2;
import static org.matheclipse.core.expression.F.C5;
import static org.matheclipse.core.expression.F.CComplexInfinity;
import static org.matheclipse.core.expression.F.CI;
import static org.matheclipse.core.expression.F.CN1;
import static org.matheclipse.core.expression.F.CN1D2;
import static org.matheclipse.core.expression.F.CN2;
import static org.matheclipse.core.expression.F.CNI;
import static org.matheclipse.core.expression.F.CSqrt2;
import static org.matheclipse.core.expression.F.CSqrt3;
import static org.matheclipse.core.expression.F.CSqrt5;
import static org.matheclipse.core.expression.F.Condition;
import static org.matheclipse.core.expression.F.DirectedInfinity;
import static org.matheclipse.core.expression.F.Greater;
import static org.matheclipse.core.expression.F.IInit;
import static org.matheclipse.core.expression.F.ISet;
import static org.matheclipse.core.expression.F.ISetDelayed;
import static org.matheclipse.core.expression.F.If;
import static org.matheclipse.core.expression.F.Indeterminate;
import static org.matheclipse.core.expression.F.IntegerPart;
import static org.matheclipse.core.expression.F.Less;
import static org.matheclipse.core.expression.F.List;
import static org.matheclipse.core.expression.F.Negate;
import static org.matheclipse.core.expression.F.NumberQ;
import static org.matheclipse.core.expression.F.Pi;
import static org.matheclipse.core.expression.F.Plus;
import static org.matheclipse.core.expression.F.Power;
import static org.matheclipse.core.expression.F.QQ;
import static org.matheclipse.core.expression.F.Quotient;
import static org.matheclipse.core.expression.F.Sqr;
import static org.matheclipse.core.expression.F.Sqrt;
import static org.matheclipse.core.expression.F.Tan;
import static org.matheclipse.core.expression.F.Tanh;
import static org.matheclipse.core.expression.F.Times;
import static org.matheclipse.core.expression.F.x;
import static org.matheclipse.core.expression.F.x_;

/**
 * <p>Generated by <code>org.matheclipse.core.preprocessor.RulePreprocessor</code>.</p>
 * <p>See GIT repository at: <a href="https://github.com/axkr/symja_android_library">github.com/axkr/symja_android_library under the tools directory</a>.</p>
 */
public interface TanRules {
  /**
   * <ul>
   * <li>index 0 - number of equal rules in <code>RULES</code></li>
	 * </ul>
	 */
  final public static int[] SIZES = { 29, 7 };

  final public static IAST RULES = List(
    IInit(Tan, SIZES),
    // Tan(0)=0
    ISet(Tan(C0),
      C0),
    // Tan(Pi/12)=2-Sqrt(3)
    ISet(Tan(Times(QQ(1L,12L),Pi)),
      Plus(C2,Negate(CSqrt3))),
    // Tan(Pi/10)=Sqrt(1-2/Sqrt(5))
    ISet(Tan(Times(QQ(1L,10L),Pi)),
      Sqrt(Plus(C1,Times(CN2,C1DSqrt5)))),
    // Tan(Pi/8)=-1+Sqrt(2)
    ISet(Tan(Times(QQ(1L,8L),Pi)),
      Plus(CN1,CSqrt2)),
    // Tan(Pi/6)=1/Sqrt(3)
    ISet(Tan(Times(QQ(1L,6L),Pi)),
      C1DSqrt3),
    // Tan(Pi/5)=Sqrt(5-2*Sqrt(5))
    ISet(Tan(Times(QQ(1L,5L),Pi)),
      Sqrt(Plus(C5,Times(CN2,CSqrt5)))),
    // Tan(Pi/4)=1
    ISet(Tan(Times(C1D4,Pi)),
      C1),
    // Tan(3/10*Pi)=Sqrt(1+2/Sqrt(5))
    ISet(Tan(Times(QQ(3L,10L),Pi)),
      Sqrt(Plus(C1,Times(C2,C1DSqrt5)))),
    // Tan(Pi/3)=Sqrt(3)
    ISet(Tan(Times(C1D3,Pi)),
      CSqrt3),
    // Tan(3/8*Pi)=1+Sqrt(2)
    ISet(Tan(Times(QQ(3L,8L),Pi)),
      Plus(C1,CSqrt2)),
    // Tan(2/5*Pi)=Sqrt(5+2*Sqrt(5))
    ISet(Tan(Times(QQ(2L,5L),Pi)),
      Sqrt(Plus(C5,Times(C2,CSqrt5)))),
    // Tan(5/12*Pi)=2+Sqrt(3)
    ISet(Tan(Times(QQ(5L,12L),Pi)),
      Plus(C2,CSqrt3)),
    // Tan(Pi/2)=ComplexInfinity
    ISet(Tan(Times(C1D2,Pi)),
      CComplexInfinity),
    // Tan(7/12*Pi)=-2-Sqrt(3)
    ISet(Tan(Times(QQ(7L,12L),Pi)),
      Plus(CN2,Negate(CSqrt3))),
    // Tan(3/5*Pi)=-Sqrt(5+2*Sqrt(5))
    ISet(Tan(Times(QQ(3L,5L),Pi)),
      Negate(Sqrt(Plus(C5,Times(C2,CSqrt5))))),
    // Tan(5/8*Pi)=-1-Sqrt(2)
    ISet(Tan(Times(QQ(5L,8L),Pi)),
      Plus(CN1,Negate(CSqrt2))),
    // Tan(2/3*Pi)=-Sqrt(3)
    ISet(Tan(Times(QQ(2L,3L),Pi)),
      Negate(CSqrt3)),
    // Tan(7/10*Pi)=-Sqrt(1+2/Sqrt(5))
    ISet(Tan(Times(QQ(7L,10L),Pi)),
      Negate(Sqrt(Plus(C1,Times(C2,C1DSqrt5))))),
    // Tan(3/4*Pi)=-1
    ISet(Tan(Times(QQ(3L,4L),Pi)),
      CN1),
    // Tan(4/5*Pi)=-Sqrt(5-2*Sqrt(5))
    ISet(Tan(Times(QQ(4L,5L),Pi)),
      Negate(Sqrt(Plus(C5,Times(CN2,CSqrt5))))),
    // Tan(5/6*Pi)=-1/Sqrt(3)
    ISet(Tan(Times(QQ(5L,6L),Pi)),
      Negate(C1DSqrt3)),
    // Tan(7/8*Pi)=1-Sqrt(2)
    ISet(Tan(Times(QQ(7L,8L),Pi)),
      Plus(C1,Negate(CSqrt2))),
    // Tan(9/10*Pi)=-Sqrt(1-2/Sqrt(5))
    ISet(Tan(Times(QQ(9L,10L),Pi)),
      Negate(Sqrt(Plus(C1,Times(CN2,C1DSqrt5))))),
    // Tan(11/12*Pi)=-2+Sqrt(3)
    ISet(Tan(Times(QQ(11L,12L),Pi)),
      Plus(CN2,CSqrt3)),
    // Tan(Pi)=0
    ISet(Tan(Pi),
      C0),
    // Tan(I)=I*Tanh(1)
    ISet(Tan(CI),
      Times(CI,Tanh(C1))),
    // Tan(Pi*x_NumberQ):=If(x<1,-Tan((1-x)*Pi),If(x<2,Tan((-1+x)*Pi),Tan((x-2*Quotient(IntegerPart(x),2))*Pi)))/;x>1/2
    ISetDelayed(Tan(Times(Pi,$p(x,NumberQ))),
      Condition(If(Less(x,C1),Negate(Tan(Times(Plus(C1,Negate(x)),Pi))),If(Less(x,C2),Tan(Times(Plus(CN1,x),Pi)),Tan(Times(Plus(x,Times(CN2,Quotient(IntegerPart(x),C2))),Pi)))),Greater(x,C1D2))),
    // Tan(ArcSin(x_)):=x/Sqrt(1-x^2)
    ISetDelayed(Tan(ArcSin(x_)),
      Times(x,Power(Plus(C1,Negate(Sqr(x))),CN1D2))),
    // Tan(ArcCos(x_)):=Sqrt(1-x^2)/x
    ISetDelayed(Tan(ArcCos(x_)),
      Times(Power(x,-1),Sqrt(Plus(C1,Negate(Sqr(x)))))),
    // Tan(ArcTan(x_)):=x
    ISetDelayed(Tan(ArcTan(x_)),
      x),
    // Tan(ArcCot(x_)):=1/x
    ISetDelayed(Tan(ArcCot(x_)),
      Power(x,-1)),
    // Tan(ArcCsc(x_)):=1/(Sqrt(1-1/x^2)*x)
    ISetDelayed(Tan(ArcCsc(x_)),
      Times(Power(Plus(C1,Negate(Power(x,-2))),CN1D2),Power(x,-1))),
    // Tan(ArcSec(x_)):=Sqrt(1-1/x^2)*x
    ISetDelayed(Tan(ArcSec(x_)),
      Times(Sqrt(Plus(C1,Negate(Power(x,-2)))),x)),
    // Tan(I*Infinity)=I
    ISet(Tan(DirectedInfinity(CI)),
      CI),
    // Tan(-I*Infinity)=-I
    ISet(Tan(DirectedInfinity(CNI)),
      CNI),
    // Tan(ComplexInfinity)=Indeterminate
    ISet(Tan(CComplexInfinity),
      Indeterminate)
  );
}
