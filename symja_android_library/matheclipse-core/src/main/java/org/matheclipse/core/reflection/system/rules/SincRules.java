package org.matheclipse.core.reflection.system.rules;

import static org.matheclipse.core.expression.F.*;
import org.matheclipse.core.interfaces.IAST;

/**
 * <p>Generated by <code>org.matheclipse.core.preprocessor.RulePreprocessor</code>.</p>
 * <p>See GIT repository at: <a href="https://github.com/axkr/symja_android_library">github.com/axkr/symja_android_library under the tools directory</a>.</p>
 */
public interface SincRules {
  /**
   * <ul>
   * <li>index 0 - number of equal rules in <code>RULES</code></li>
	 * </ul>
	 */
  final public static int[] SIZES = { 15, 3 };

  final public static IAST RULES = List(
    IInit(Sinc, SIZES),
    // Sinc(0)=1
    ISet(Sinc(C0),
      C1),
    // Sinc(Pi/6)=Pi/3
    ISet(Sinc(Times(QQ(1L,6L),Pi)),
      Times(C1D3,Pi)),
    // Sinc(Pi/4)=2/Pi*Sqrt(2)
    ISet(Sinc(Times(C1D4,Pi)),
      Times(C2,CSqrt2,Power(Pi,-1))),
    // Sinc(Pi/3)=3/(2*Pi)*Sqrt(3)
    ISet(Sinc(Times(C1D3,Pi)),
      Times(QQ(3L,2L),CSqrt3,Power(Pi,-1))),
    // Sinc(Pi/2)=2/Pi
    ISet(Sinc(Times(C1D2,Pi)),
      Times(C2,Power(Pi,-1))),
    // Sinc(Pi)=0
    ISet(Sinc(Pi),
      C0),
    // Sinc(5/12*Pi)=(3*Sqrt(2)*(1+Sqrt(3)))/(5*Pi)
    ISet(Sinc(Times(QQ(5L,12L),Pi)),
      Times(QQ(3L,5L),CSqrt2,Plus(C1,CSqrt3),Power(Pi,-1))),
    // Sinc(Pi/5)=(5*Sqrt(5/8-Sqrt(5)/8))/Pi
    ISet(Sinc(Times(QQ(1L,5L),Pi)),
      Times(C5,Sqrt(Plus(QQ(5L,8L),Times(QQ(-1L,8L),CSqrt5))),Power(Pi,-1))),
    // Sinc(Pi/12)=(3*Sqrt(2)*(-1+Sqrt(3)))/Pi
    ISet(Sinc(Times(QQ(1L,12L),Pi)),
      Times(C3,CSqrt2,Plus(CN1,CSqrt3),Power(Pi,-1))),
    // Sinc(Pi/10)=(5*(-1+Sqrt(5)))/(2*Pi)
    ISet(Sinc(Times(QQ(1L,10L),Pi)),
      Times(QQ(5L,2L),Plus(CN1,CSqrt5),Power(Pi,-1))),
    // Sinc(2/5*Pi)=(5*Sqrt(5/8+Sqrt(5)/8))/(2*Pi)
    ISet(Sinc(Times(QQ(2L,5L),Pi)),
      Times(QQ(5L,2L),Sqrt(Plus(QQ(5L,8L),Times(QQ(1L,8L),CSqrt5))),Power(Pi,-1))),
    // Sinc(3/10*Pi)=(5*(1+Sqrt(5)))/(6*Pi)
    ISet(Sinc(Times(QQ(3L,10L),Pi)),
      Times(QQ(5L,6L),Plus(C1,CSqrt5),Power(Pi,-1))),
    // Sinc(I)=Sinh(1)
    ISet(Sinc(CI),
      Sinh(C1)),
    // Sinc(ArcSin(x_)):=x/ArcSin(x)
    ISetDelayed(Sinc(ArcSin(x_)),
      Times(x,Power(ArcSin(x),-1))),
    // Sinc(ArcCos(x_)):=Sqrt(1-x^2)/ArcCos(x)
    ISetDelayed(Sinc(ArcCos(x_)),
      Times(Sqrt(Plus(C1,Negate(Sqr(x)))),Power(ArcCos(x),-1))),
    // Sinc(ArcTan(x_)):=x/(Sqrt(1+x^2)*ArcTan(x))
    ISetDelayed(Sinc(ArcTan(x_)),
      Times(x,Power(Plus(C1,Sqr(x)),CN1D2),Power(ArcTan(x),-1))),
    // Sinc(I*Infinity)=Infinity
    ISet(Sinc(DirectedInfinity(CI)),
      oo),
    // Sinc(ComplexInfinity)=Indeterminate
    ISet(Sinc(CComplexInfinity),
      Indeterminate)
  );
}
