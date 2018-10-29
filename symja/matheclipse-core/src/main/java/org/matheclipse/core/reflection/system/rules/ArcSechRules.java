package org.matheclipse.core.reflection.system.rules;

import org.matheclipse.core.interfaces.IAST;

import static org.matheclipse.core.expression.F.ArcSech;
import static org.matheclipse.core.expression.F.C0;
import static org.matheclipse.core.expression.F.C1;
import static org.matheclipse.core.expression.F.C1DSqrt3;
import static org.matheclipse.core.expression.F.C2;
import static org.matheclipse.core.expression.F.CC;
import static org.matheclipse.core.expression.F.CComplexInfinity;
import static org.matheclipse.core.expression.F.CI;
import static org.matheclipse.core.expression.F.CN1;
import static org.matheclipse.core.expression.F.CN2;
import static org.matheclipse.core.expression.F.CNI;
import static org.matheclipse.core.expression.F.CSqrt2;
import static org.matheclipse.core.expression.F.CSqrt5;
import static org.matheclipse.core.expression.F.DirectedInfinity;
import static org.matheclipse.core.expression.F.IInit;
import static org.matheclipse.core.expression.F.ISet;
import static org.matheclipse.core.expression.F.Indeterminate;
import static org.matheclipse.core.expression.F.List;
import static org.matheclipse.core.expression.F.Log;
import static org.matheclipse.core.expression.F.Negate;
import static org.matheclipse.core.expression.F.Noo;
import static org.matheclipse.core.expression.F.Pi;
import static org.matheclipse.core.expression.F.Plus;
import static org.matheclipse.core.expression.F.Times;
import static org.matheclipse.core.expression.F.oo;

/**
 * <p>Generated by <code>org.matheclipse.core.preprocessor.RulePreprocessor</code>.</p>
 * <p>See GIT repository at: <a href="https://github.com/axkr/symja_android_library">github.com/axkr/symja_android_library under the tools directory</a>.</p>
 */
public interface ArcSechRules {
  /**
   * <ul>
   * <li>index 0 - number of equal rules in <code>RULES</code></li>
	 * </ul>
	 */
  final public static int[] SIZES = { 20, 0 };

  final public static IAST RULES = List(
    IInit(ArcSech, SIZES),
    // ArcSech(0)=Infinity
    ISet(ArcSech(C0),
      oo),
    // ArcSech(1)=0
    ISet(ArcSech(C1),
      C0),
    // ArcSech(-1)=I*Pi
    ISet(ArcSech(CN1),
      Times(CI,Pi)),
    // ArcSech(2/Sqrt(3))=1/6*Pi*I
    ISet(ArcSech(Times(C2,C1DSqrt3)),
      Times(CC(0L,1L,1L,6L),Pi)),
    // ArcSech(-2/Sqrt(3))=5/6*Pi*I
    ISet(ArcSech(Times(CN2,C1DSqrt3)),
      Times(CC(0L,1L,5L,6L),Pi)),
    // ArcSech(-1+Sqrt(5))=1/5*Pi*I
    ISet(ArcSech(Plus(CN1,CSqrt5)),
      Times(CC(0L,1L,1L,5L),Pi)),
    // ArcSech(1-Sqrt(5))=4/5*Pi*I
    ISet(ArcSech(Plus(C1,Negate(CSqrt5))),
      Times(CC(0L,1L,4L,5L),Pi)),
    // ArcSech(Sqrt(2))=1/4*Pi*I
    ISet(ArcSech(CSqrt2),
      Times(CC(0L,1L,1L,4L),Pi)),
    // ArcSech(-Sqrt(2))=3/4*Pi*I
    ISet(ArcSech(Negate(CSqrt2)),
      Times(CC(0L,1L,3L,4L),Pi)),
    // ArcSech(2)=1/3*Pi*I
    ISet(ArcSech(C2),
      Times(CC(0L,1L,1L,3L),Pi)),
    // ArcSech(-2)=2/3*Pi*I
    ISet(ArcSech(CN2),
      Times(CC(0L,1L,2L,3L),Pi)),
    // ArcSech(1+Sqrt(5))=2/5*Pi*I
    ISet(ArcSech(Plus(C1,CSqrt5)),
      Times(CC(0L,1L,2L,5L),Pi)),
    // ArcSech(-1-Sqrt(5))=3/5*Pi*I
    ISet(ArcSech(Plus(CN1,Negate(CSqrt5))),
      Times(CC(0L,1L,3L,5L),Pi)),
    // ArcSech(I)=-1/2*Pi*I+Log(Sqrt(2)+1)
    ISet(ArcSech(CI),
      Plus(Times(CC(0L,1L,-1L,2L),Pi),Log(Plus(C1,CSqrt2)))),
    // ArcSech(-I)=1/2*Pi*I+Log(Sqrt(2)+1)
    ISet(ArcSech(CNI),
      Plus(Times(CC(0L,1L,1L,2L),Pi),Log(Plus(C1,CSqrt2)))),
    // ArcSech(Infinity)=1/2*Pi*I
    ISet(ArcSech(oo),
      Times(CC(0L,1L,1L,2L),Pi)),
    // ArcSech(-Infinity)=1/2*Pi*I
    ISet(ArcSech(Noo),
      Times(CC(0L,1L,1L,2L),Pi)),
    // ArcSech(I*Infinity)=-1/2*Pi*I
    ISet(ArcSech(DirectedInfinity(CI)),
      Times(CC(0L,1L,-1L,2L),Pi)),
    // ArcSech(-I*Infinity)=1/2*Pi*I
    ISet(ArcSech(DirectedInfinity(CNI)),
      Times(CC(0L,1L,1L,2L),Pi)),
    // ArcSech(ComplexInfinity)=Indeterminate
    ISet(ArcSech(CComplexInfinity),
      Indeterminate)
  );
}
