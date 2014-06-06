package org.matheclipse.core.reflection.system.rules;

import static org.matheclipse.core.expression.F.*;
import org.matheclipse.core.interfaces.IAST;

/**
 * Generated by <code>org.matheclipse.core.preprocessor.RulePreprocessor</code>.<br />
 * See GIT repository at: <a href="https://bitbucket.org/axelclk/symjaunittests">https://bitbucket.org/axelclk/symjaunittests</a>.
 */
public interface ArcCosRules {
  final public static IAST RULES = List(
    Set(ArcCos(Times(C1D2,Sqrt(C2))),
      Times(C1D4,Pi)),
    Set(ArcCos(Times(C1D2,Sqrt(C3))),
      Times(QQ(1L,6L),Pi)),
    Set(ArcCos(Times(C1D2,Sqrt(Plus(C2,Sqrt(C2))))),
      Times(QQ(1L,8L),Pi)),
    Set(ArcCos(Times(C1D2,Sqrt(Plus(C2,Times(CN1,Sqrt(C2)))))),
      Times(QQ(3L,8L),Pi)),
    Set(ArcCos(Times(C1D4,Plus(C1,Times(C1D3,Sqrt(C3))),Sqrt(ZZ(6L)))),
      Times(QQ(1L,12L),Pi)),
    Set(ArcCos(Times(C1D4,Plus(C1,Times(CN1D3,Sqrt(C3))),Sqrt(ZZ(6L)))),
      Times(QQ(5L,12L),Pi)),
    Set(ArcCos(Plus(CN1D4,Times(C1D4,Sqrt(C5)))),
      Times(QQ(2L,5L),Pi)),
    Set(ArcCos(C1),
      C0),
    Set(ArcCos(C0),
      Times(C1D2,Pi)),
    Set(ArcCos(C1D2),
      Times(C1D3,Pi)),
    Set(ArcCos(CI),
      Plus(Times(C1D2,Pi),Times(CNI,ArcSinh(C1)))),
    Set(ArcCos(CInfinity),
      Times(CI,CInfinity)),
    Set(ArcCos(Times(C1D4,Sqrt(C2),Sqrt(Plus(C5,Sqrt(C5))))),
      Times(QQ(1L,10L),Pi)),
    Set(ArcCos(Times(C1D4,Sqrt(C2),Sqrt(Plus(C5,Times(CN1,Sqrt(C5)))))),
      Times(QQ(3L,10L),Pi)),
    Set(ArcCos(Cosh(C1)),
      CI),
    Set(ArcCos(Plus(C1D4,Times(C1D4,Sqrt(C5)))),
      Times(QQ(1L,5L),Pi))
  );
}