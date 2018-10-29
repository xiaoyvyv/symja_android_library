package org.matheclipse.core.integrate.rubi;


import org.matheclipse.core.interfaces.IAST;

import static org.matheclipse.core.expression.F.$p;
import static org.matheclipse.core.expression.F.$s;
import static org.matheclipse.core.expression.F.And;
import static org.matheclipse.core.expression.F.C0;
import static org.matheclipse.core.expression.F.C1;
import static org.matheclipse.core.expression.F.C1D2;
import static org.matheclipse.core.expression.F.C2;
import static org.matheclipse.core.expression.F.C3;
import static org.matheclipse.core.expression.F.C4;
import static org.matheclipse.core.expression.F.CN1;
import static org.matheclipse.core.expression.F.Coefficient;
import static org.matheclipse.core.expression.F.Condition;
import static org.matheclipse.core.expression.F.Denominator;
import static org.matheclipse.core.expression.F.FreeQ;
import static org.matheclipse.core.expression.F.GCD;
import static org.matheclipse.core.expression.F.IIntegrate;
import static org.matheclipse.core.expression.F.IntegerQ;
import static org.matheclipse.core.expression.F.List;
import static org.matheclipse.core.expression.F.Negate;
import static org.matheclipse.core.expression.F.Not;
import static org.matheclipse.core.expression.F.Plus;
import static org.matheclipse.core.expression.F.Power;
import static org.matheclipse.core.expression.F.Set;
import static org.matheclipse.core.expression.F.Simplify;
import static org.matheclipse.core.expression.F.Sqr;
import static org.matheclipse.core.expression.F.Sqrt;
import static org.matheclipse.core.expression.F.Times;
import static org.matheclipse.core.expression.F.Unequal;
import static org.matheclipse.core.expression.F.With;
import static org.matheclipse.core.expression.F.a;
import static org.matheclipse.core.expression.F.a_;
import static org.matheclipse.core.expression.F.a_DEFAULT;
import static org.matheclipse.core.expression.F.b;
import static org.matheclipse.core.expression.F.b_DEFAULT;
import static org.matheclipse.core.expression.F.c;
import static org.matheclipse.core.expression.F.c_DEFAULT;
import static org.matheclipse.core.expression.F.d;
import static org.matheclipse.core.expression.F.d_;
import static org.matheclipse.core.expression.F.d_DEFAULT;
import static org.matheclipse.core.expression.F.e;
import static org.matheclipse.core.expression.F.e_DEFAULT;
import static org.matheclipse.core.expression.F.g;
import static org.matheclipse.core.expression.F.k;
import static org.matheclipse.core.expression.F.m;
import static org.matheclipse.core.expression.F.m_;
import static org.matheclipse.core.expression.F.m_DEFAULT;
import static org.matheclipse.core.expression.F.n;
import static org.matheclipse.core.expression.F.n_;
import static org.matheclipse.core.expression.F.n_DEFAULT;
import static org.matheclipse.core.expression.F.p;
import static org.matheclipse.core.expression.F.p_;
import static org.matheclipse.core.expression.F.p_DEFAULT;
import static org.matheclipse.core.expression.F.q;
import static org.matheclipse.core.expression.F.q_DEFAULT;
import static org.matheclipse.core.expression.F.r;
import static org.matheclipse.core.expression.F.u;
import static org.matheclipse.core.expression.F.u_;
import static org.matheclipse.core.expression.F.v;
import static org.matheclipse.core.expression.F.v_;
import static org.matheclipse.core.expression.F.x;
import static org.matheclipse.core.expression.F.x_;
import static org.matheclipse.core.expression.F.x_Symbol;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Dist;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.EqQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.ExpandIntegrand;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.FracPart;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.FractionQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.GeQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.GtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.IGtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.ILtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Int;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.IntPart;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.IntegersQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.LeQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.LinearPairQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.LinearQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.LtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.NeQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.NegQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.PolynomialDivide;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.PosQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.RationalQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Rt;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Simp;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.SimplifyIntegrand;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Subst;

/** 
 * IndefiniteIntegrationRules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class IntRules27 { 
  public static IAST RULES = List( 
IIntegrate(1351,Int(Power(Plus(a_,Times(c_DEFAULT,Power(x_,n_DEFAULT)),Times(b_DEFAULT,Power(x_,$p("mn")))),p_),x_Symbol),
    Condition(Dist(Times(Power(x,Times(n,FracPart(p))),Power(Plus(a,Times(b,Power(Power(x,n),-1)),Times(c,Power(x,n))),FracPart(p)),Power(Power(Plus(b,Times(a,Power(x,n)),Times(c,Power(x,Times(C2,n)))),FracPart(p)),-1)),Int(Times(Power(Plus(b,Times(a,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p),Power(Power(x,Times(n,p)),-1)),x),x),And(FreeQ(List(a,b,c,n,p),x),EqQ($s("mn"),Negate(n)),Not(IntegerQ(p)),PosQ(n)))),
IIntegrate(1352,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Power(n,-1),Subst(Int(Power(Plus(a,Times(b,x),Times(c,Sqr(x))),p),x),x,Power(x,n)),x),And(FreeQ(List(a,b,c,m,n,p),x),EqQ($s("n2"),Times(C2,n)),EqQ(Simplify(Plus(m,Negate(n),C1)),C0)))),
IIntegrate(1353,Int(Times(Power(Times(d_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Times(d,x),m),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p)),x),x),And(FreeQ(List(a,b,c,d,m,n),x),EqQ($s("n2"),Times(C2,n)),IGtQ(p,C0),Not(IntegerQ(Simplify(Times(Plus(m,C1),Power(n,-1)))))))),
IIntegrate(1354,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(Int(Times(Power(x,Plus(m,Times(C2,n,p))),Power(Plus(c,Times(b,Power(Power(x,n),-1)),Times(a,Power(Power(x,Times(C2,n)),-1))),p)),x),And(FreeQ(List(a,b,c,m,n),x),EqQ($s("n2"),Times(C2,n)),ILtQ(p,C0),NegQ(n)))),
IIntegrate(1355,Int(Times(Power(Times(d_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_DEFAULT)),Times(c_DEFAULT,Power(x_,$p("n2",true)))),p_)),x_Symbol),
    Condition(Dist(Times(Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),FracPart(p)),Power(Times(Power(c,IntPart(p)),Power(Plus(Times(C1D2,b),Times(c,Power(x,n))),Times(C2,FracPart(p)))),-1)),Int(Times(Power(Times(d,x),m),Power(Plus(Times(C1D2,b),Times(c,Power(x,n))),Times(C2,p))),x),x),And(FreeQ(List(a,b,c,d,m,n,p),x),EqQ($s("n2"),Times(C2,n)),EqQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),IntegerQ(Plus(p,Negate(C1D2)))))),
IIntegrate(1356,Int(Times(Power(Times(d_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_DEFAULT)),Times(c_DEFAULT,Power(x_,$p("n2",true)))),p_)),x_Symbol),
    Condition(Dist(Times(Power(a,IntPart(p)),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),FracPart(p)),Power(Power(Plus(C1,Times(C2,c,Power(x,n),Power(b,-1))),Times(C2,FracPart(p))),-1)),Int(Times(Power(Times(d,x),m),Power(Plus(C1,Times(C2,c,Power(x,n),Power(b,-1))),Times(C2,p))),x),x),And(FreeQ(List(a,b,c,d,m,n,p),x),EqQ($s("n2"),Times(C2,n)),EqQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),Not(IntegerQ(Times(C2,p)))))),
IIntegrate(1357,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Power(n,-1),Subst(Int(Times(Power(x,Plus(Simplify(Times(Plus(m,C1),Power(n,-1))),Negate(C1))),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),p)),x),x,Power(x,n)),x),And(FreeQ(List(a,b,c,m,n,p),x),EqQ($s("n2"),Times(C2,n)),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),IntegerQ(Simplify(Times(Plus(m,C1),Power(n,-1))))))),
IIntegrate(1358,Int(Times(Power(Times(d_,x_),m_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(d,IntPart(m)),Power(Times(d,x),FracPart(m)),Power(Power(x,FracPart(m)),-1)),Int(Times(Power(x,m),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p)),x),x),And(FreeQ(List(a,b,c,d,m,n,p),x),EqQ($s("n2"),Times(C2,n)),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),IntegerQ(Simplify(Times(Plus(m,C1),Power(n,-1))))))),
IIntegrate(1359,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(With(List(Set(k,GCD(Plus(m,C1),n))),Condition(Dist(Power(k,-1),Subst(Int(Times(Power(x,Plus(Times(Plus(m,C1),Power(k,-1)),Negate(C1))),Power(Plus(a,Times(b,Power(x,Times(n,Power(k,-1)))),Times(c,Power(x,Times(C2,n,Power(k,-1))))),p)),x),x,Power(x,k)),x),Unequal(k,C1))),And(FreeQ(List(a,b,c,p),x),EqQ($s("n2"),Times(C2,n)),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),IGtQ(n,C0),IntegerQ(m)))),
IIntegrate(1360,Int(Times(Power(Times(d_DEFAULT,x_),m_),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(With(List(Set(k,Denominator(m))),Dist(Times(k,Power(d,-1)),Subst(Int(Times(Power(x,Plus(Times(k,Plus(m,C1)),Negate(C1))),Power(Plus(a,Times(b,Power(x,Times(k,n)),Power(Power(d,n),-1)),Times(c,Power(x,Times(C2,k,n)),Power(Power(d,Times(C2,n)),-1))),p)),x),x,Power(Times(d,x),Power(k,-1))),x)),And(FreeQ(List(a,b,c,d,p),x),EqQ($s("n2"),Times(C2,n)),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),IGtQ(n,C0),FractionQ(m),IntegerQ(p)))),
IIntegrate(1361,Int(Times(Power(Times(d_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(d,Plus(n,Negate(C1))),Power(Times(d,x),Plus(m,Negate(n),C1)),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p),Plus(Times(b,n,p),Times(c,Plus(m,Times(n,Plus(Times(C2,p),Negate(C1))),C1),Power(x,n))),Power(Times(c,Plus(m,Times(C2,n,p),C1),Plus(m,Times(n,Plus(Times(C2,p),Negate(C1))),C1)),-1)),x),Negate(Dist(Times(n,p,Power(d,n),Power(Times(c,Plus(m,Times(C2,n,p),C1),Plus(m,Times(n,Plus(Times(C2,p),Negate(C1))),C1)),-1)),Int(Times(Power(Times(d,x),Plus(m,Negate(n))),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,Negate(C1))),Simp(Plus(Times(a,b,Plus(m,Negate(n),C1)),Times(CN1,Plus(Times(C2,a,c,Plus(m,Times(n,Plus(Times(C2,p),Negate(C1))),C1)),Times(CN1,Sqr(b),Plus(m,Times(n,Plus(p,Negate(C1))),C1))),Power(x,n))),x)),x),x))),And(FreeQ(List(a,b,c,d),x),EqQ($s("n2"),Times(C2,n)),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),IGtQ(n,C0),IGtQ(p,C0),GtQ(m,Plus(n,Negate(C1))),NeQ(Plus(m,Times(C2,n,p),C1),C0),NeQ(Plus(m,Times(n,Plus(Times(C2,p),Negate(C1))),C1),C0)))),
IIntegrate(1362,Int(Times(Power(Times(d_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(d,x),Plus(m,C1)),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p),Power(Times(d,Plus(m,C1)),-1)),x),Negate(Dist(Times(n,p,Power(Times(Power(d,n),Plus(m,C1)),-1)),Int(Times(Power(Times(d,x),Plus(m,n)),Plus(b,Times(C2,c,Power(x,n))),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,Negate(C1)))),x),x))),And(FreeQ(List(a,b,c,d),x),EqQ($s("n2"),Times(C2,n)),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),IGtQ(n,C0),IGtQ(p,C0),LtQ(m,CN1)))),
IIntegrate(1363,Int(Times(Power(Times(d_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(d,x),Plus(m,C1)),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p),Power(Times(d,Plus(m,Times(C2,n,p),C1)),-1)),x),Dist(Times(n,p,Power(Plus(m,Times(C2,n,p),C1),-1)),Int(Times(Power(Times(d,x),m),Plus(Times(C2,a),Times(b,Power(x,n))),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,Negate(C1)))),x),x)),And(FreeQ(List(a,b,c,d,m),x),EqQ($s("n2"),Times(C2,n)),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),IGtQ(n,C0),IGtQ(p,C0),NeQ(Plus(m,Times(C2,n,p),C1),C0)))),
IIntegrate(1364,Int(Times(Power(Times(d_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(d,Plus(n,Negate(C1))),Power(Times(d,x),Plus(m,Negate(n),C1)),Plus(b,Times(C2,c,Power(x,n))),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1)),Power(Times(n,Plus(p,C1),Plus(Sqr(b),Times(CN1,C4,a,c))),-1)),x),Negate(Dist(Times(Power(d,n),Power(Times(n,Plus(p,C1),Plus(Sqr(b),Times(CN1,C4,a,c))),-1)),Int(Times(Power(Times(d,x),Plus(m,Negate(n))),Plus(Times(b,Plus(m,Negate(n),C1)),Times(C2,c,Plus(m,Times(C2,n,Plus(p,C1)),C1),Power(x,n))),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1))),x),x))),And(FreeQ(List(a,b,c,d),x),EqQ($s("n2"),Times(C2,n)),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),IGtQ(n,C0),ILtQ(p,CN1),GtQ(m,Plus(n,Negate(C1))),LeQ(m,Plus(Times(C2,n),Negate(C1)))))),
IIntegrate(1365,Int(Times(Power(Times(d_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(d,Plus(Times(C2,n),Negate(C1))),Power(Times(d,x),Plus(m,Times(CN1,C2,n),C1)),Plus(Times(C2,a),Times(b,Power(x,n))),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1)),Power(Times(n,Plus(p,C1),Plus(Sqr(b),Times(CN1,C4,a,c))),-1)),x)),Dist(Times(Power(d,Times(C2,n)),Power(Times(n,Plus(p,C1),Plus(Sqr(b),Times(CN1,C4,a,c))),-1)),Int(Times(Power(Times(d,x),Plus(m,Times(CN1,C2,n))),Plus(Times(C2,a,Plus(m,Times(CN1,C2,n),C1)),Times(b,Plus(m,Times(n,Plus(Times(C2,p),C1)),C1),Power(x,n))),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1))),x),x)),And(FreeQ(List(a,b,c,d),x),EqQ($s("n2"),Times(C2,n)),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),IGtQ(n,C0),ILtQ(p,CN1),GtQ(m,Plus(Times(C2,n),Negate(C1)))))),
IIntegrate(1366,Int(Times(Power(Times(d_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Times(d,x),Plus(m,C1)),Plus(Sqr(b),Times(CN1,C2,a,c),Times(b,c,Power(x,n))),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1)),Power(Times(a,d,n,Plus(p,C1),Plus(Sqr(b),Times(CN1,C4,a,c))),-1)),x)),Dist(Power(Times(a,n,Plus(p,C1),Plus(Sqr(b),Times(CN1,C4,a,c))),-1),Int(Times(Power(Times(d,x),m),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1)),Simp(Plus(Times(Sqr(b),Plus(m,Times(n,Plus(p,C1)),C1)),Times(CN1,C2,a,c,Plus(m,Times(C2,n,Plus(p,C1)),C1)),Times(b,c,Plus(m,Times(n,Plus(Times(C2,p),C3)),C1),Power(x,n))),x)),x),x)),And(FreeQ(List(a,b,c,d,m),x),EqQ($s("n2"),Times(C2,n)),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),IGtQ(n,C0),ILtQ(p,CN1)))),
IIntegrate(1367,Int(Times(Power(Times(d_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(d,Plus(Times(C2,n),Negate(C1))),Power(Times(d,x),Plus(m,Times(CN1,C2,n),C1)),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1)),Power(Times(c,Plus(m,Times(C2,n,p),C1)),-1)),x),Negate(Dist(Times(Power(d,Times(C2,n)),Power(Times(c,Plus(m,Times(C2,n,p),C1)),-1)),Int(Times(Power(Times(d,x),Plus(m,Times(CN1,C2,n))),Simp(Plus(Times(a,Plus(m,Times(CN1,C2,n),C1)),Times(b,Plus(m,Times(n,Plus(p,Negate(C1))),C1),Power(x,n))),x),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p)),x),x))),And(FreeQ(List(a,b,c,d,p),x),EqQ($s("n2"),Times(C2,n)),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),IGtQ(n,C0),GtQ(m,Plus(Times(C2,n),Negate(C1))),NeQ(Plus(m,Times(C2,n,p),C1),C0),IntegerQ(p)))),
IIntegrate(1368,Int(Times(Power(Times(d_DEFAULT,x_),m_),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(d,x),Plus(m,C1)),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1)),Power(Times(a,d,Plus(m,C1)),-1)),x),Negate(Dist(Power(Times(a,Power(d,n),Plus(m,C1)),-1),Int(Times(Power(Times(d,x),Plus(m,n)),Plus(Times(b,Plus(m,Times(n,Plus(p,C1)),C1)),Times(c,Plus(m,Times(C2,n,Plus(p,C1)),C1),Power(x,n))),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p)),x),x))),And(FreeQ(List(a,b,c,d,p),x),EqQ($s("n2"),Times(C2,n)),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),IGtQ(n,C0),LtQ(m,CN1),IntegerQ(p)))),
IIntegrate(1369,Int(Times(Power(Times(d_DEFAULT,x_),m_),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),-1)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(d,x),Plus(m,C1)),Power(Times(a,d,Plus(m,C1)),-1)),x),Negate(Dist(Power(Times(a,Power(d,n)),-1),Int(Times(Power(Times(d,x),Plus(m,n)),Plus(b,Times(c,Power(x,n))),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),-1)),x),x))),And(FreeQ(List(a,b,c,d),x),EqQ($s("n2"),Times(C2,n)),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),IGtQ(n,C0),LtQ(m,CN1)))),
IIntegrate(1370,Int(Times(Power(x_,m_),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),-1)),x_Symbol),
    Condition(Int(PolynomialDivide(Power(x,m),Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),x),x),And(FreeQ(List(a,b,c),x),EqQ($s("n2"),Times(C2,n)),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),IGtQ(n,C0),IGtQ(m,Plus(Times(C3,n),Negate(C1)))))),
IIntegrate(1371,Int(Times(Power(Times(d_DEFAULT,x_),m_),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),-1)),x_Symbol),
    Condition(Plus(Simp(Times(Power(d,Plus(Times(C2,n),Negate(C1))),Power(Times(d,x),Plus(m,Times(CN1,C2,n),C1)),Power(Times(c,Plus(m,Times(CN1,C2,n),C1)),-1)),x),Negate(Dist(Times(Power(d,Times(C2,n)),Power(c,-1)),Int(Times(Power(Times(d,x),Plus(m,Times(CN1,C2,n))),Plus(a,Times(b,Power(x,n))),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),-1)),x),x))),And(FreeQ(List(a,b,c,d),x),EqQ($s("n2"),Times(C2,n)),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),IGtQ(n,C0),GtQ(m,Plus(Times(C2,n),Negate(C1)))))),
IIntegrate(1372,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),-1)),x_Symbol),
    Condition(With(List(Set(q,Rt(Times(a,Power(c,-1)),C2))),With(List(Set(r,Rt(Plus(Times(C2,q),Times(CN1,b,Power(c,-1))),C2))),Plus(Negate(Dist(Power(Times(C2,c,r),-1),Int(Times(Power(x,Plus(m,Times(CN1,C3,C1D2,n))),Plus(q,Times(CN1,r,Power(x,Times(C1D2,n)))),Power(Plus(q,Times(CN1,r,Power(x,Times(C1D2,n))),Power(x,n)),-1)),x),x)),Dist(Power(Times(C2,c,r),-1),Int(Times(Power(x,Plus(m,Times(CN1,C3,C1D2,n))),Plus(q,Times(r,Power(x,Times(C1D2,n)))),Power(Plus(q,Times(r,Power(x,Times(C1D2,n))),Power(x,n)),-1)),x),x)))),And(FreeQ(List(a,b,c),x),EqQ($s("n2"),Times(C2,n)),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),IGtQ(Times(C1D2,n),C0),IGtQ(m,C0),GeQ(m,Times(C1D2,C3,n)),LtQ(m,Times(C2,n)),NegQ(Plus(Sqr(b),Times(CN1,C4,a,c)))))),
IIntegrate(1373,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),-1)),x_Symbol),
    Condition(With(List(Set(q,Rt(Times(a,Power(c,-1)),C2))),With(List(Set(r,Rt(Plus(Times(C2,q),Times(CN1,b,Power(c,-1))),C2))),Plus(Dist(Power(Times(C2,c,r),-1),Int(Times(Power(x,Plus(m,Times(CN1,C1D2,n))),Power(Plus(q,Times(CN1,r,Power(x,Times(C1D2,n))),Power(x,n)),-1)),x),x),Negate(Dist(Power(Times(C2,c,r),-1),Int(Times(Power(x,Plus(m,Times(CN1,C1D2,n))),Power(Plus(q,Times(r,Power(x,Times(C1D2,n))),Power(x,n)),-1)),x),x))))),And(FreeQ(List(a,b,c),x),EqQ($s("n2"),Times(C2,n)),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),IGtQ(Times(C1D2,n),C0),IGtQ(m,C0),GeQ(m,Times(C1D2,n)),LtQ(m,Times(C1D2,C3,n)),NegQ(Plus(Sqr(b),Times(CN1,C4,a,c)))))),
IIntegrate(1374,Int(Times(Power(Times(d_DEFAULT,x_),m_),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),-1)),x_Symbol),
    Condition(With(List(Set(q,Rt(Plus(Sqr(b),Times(CN1,C4,a,c)),C2))),Plus(Dist(Times(C1D2,Power(d,n),Plus(Times(b,Power(q,-1)),C1)),Int(Times(Power(Times(d,x),Plus(m,Negate(n))),Power(Plus(Times(C1D2,b),Times(C1D2,q),Times(c,Power(x,n))),-1)),x),x),Negate(Dist(Times(C1D2,Power(d,n),Plus(Times(b,Power(q,-1)),Negate(C1))),Int(Times(Power(Times(d,x),Plus(m,Negate(n))),Power(Plus(Times(C1D2,b),Times(CN1,C1D2,q),Times(c,Power(x,n))),-1)),x),x)))),And(FreeQ(List(a,b,c,d),x),EqQ($s("n2"),Times(C2,n)),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),IGtQ(n,C0),GeQ(m,n)))),
IIntegrate(1375,Int(Times(Power(Times(d_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),-1)),x_Symbol),
    Condition(With(List(Set(q,Rt(Plus(Sqr(b),Times(CN1,C4,a,c)),C2))),Plus(Dist(Times(c,Power(q,-1)),Int(Times(Power(Times(d,x),m),Power(Plus(Times(C1D2,b),Times(CN1,C1D2,q),Times(c,Power(x,n))),-1)),x),x),Negate(Dist(Times(c,Power(q,-1)),Int(Times(Power(Times(d,x),m),Power(Plus(Times(C1D2,b),Times(C1D2,q),Times(c,Power(x,n))),-1)),x),x)))),And(FreeQ(List(a,b,c,d,m),x),EqQ($s("n2"),Times(C2,n)),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),IGtQ(n,C0)))),
IIntegrate(1376,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(Negate(Subst(Int(Times(Power(Plus(a,Times(b,Power(Power(x,n),-1)),Times(c,Power(Power(x,Times(C2,n)),-1))),p),Power(Power(x,Plus(m,C2)),-1)),x),x,Power(x,-1))),And(FreeQ(List(a,b,c,p),x),EqQ($s("n2"),Times(C2,n)),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),ILtQ(n,C0),IntegerQ(m)))),
IIntegrate(1377,Int(Times(Power(Times(d_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(With(List(Set(k,Denominator(m))),Negate(Dist(Times(k,Power(d,-1)),Subst(Int(Times(Power(Plus(a,Times(b,Power(Times(Power(d,n),Power(x,Times(k,n))),-1)),Times(c,Power(Times(Power(d,Times(C2,n)),Power(x,Times(C2,k,n))),-1))),p),Power(Power(x,Plus(Times(k,Plus(m,C1)),C1)),-1)),x),x,Power(Power(Times(d,x),Power(k,-1)),-1)),x))),And(FreeQ(List(a,b,c,d,p),x),EqQ($s("n2"),Times(C2,n)),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),ILtQ(n,C0),FractionQ(m)))),
IIntegrate(1378,Int(Times(Power(Times(d_DEFAULT,x_),m_),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(Negate(Dist(Times(Power(d,IntPart(m)),Power(Times(d,x),FracPart(m)),Power(Power(x,-1),FracPart(m))),Subst(Int(Times(Power(Plus(a,Times(b,Power(Power(x,n),-1)),Times(c,Power(Power(x,Times(C2,n)),-1))),p),Power(Power(x,Plus(m,C2)),-1)),x),x,Power(x,-1)),x)),And(FreeQ(List(a,b,c,d,m,p),x),EqQ($s("n2"),Times(C2,n)),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),ILtQ(n,C0),Not(RationalQ(m))))),
IIntegrate(1379,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(With(List(Set(k,Denominator(n))),Dist(k,Subst(Int(Times(Power(x,Plus(Times(k,Plus(m,C1)),Negate(C1))),Power(Plus(a,Times(b,Power(x,Times(k,n))),Times(c,Power(x,Times(C2,k,n)))),p)),x),x,Power(x,Power(k,-1))),x)),And(FreeQ(List(a,b,c,m,p),x),EqQ($s("n2"),Times(C2,n)),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),FractionQ(n)))),
IIntegrate(1380,Int(Times(Power(Times(d_,x_),m_),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(Dist(Times(Power(d,IntPart(m)),Power(Times(d,x),FracPart(m)),Power(Power(x,FracPart(m)),-1)),Int(Times(Power(x,m),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p)),x),x),And(FreeQ(List(a,b,c,d,m,p),x),EqQ($s("n2"),Times(C2,n)),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),FractionQ(n)))),
IIntegrate(1381,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(Dist(Power(Plus(m,C1),-1),Subst(Int(Power(Plus(a,Times(b,Power(x,Simplify(Times(n,Power(Plus(m,C1),-1))))),Times(c,Power(x,Simplify(Times(C2,n,Power(Plus(m,C1),-1)))))),p),x),x,Power(x,Plus(m,C1))),x),And(FreeQ(List(a,b,c,m,n,p),x),EqQ($s("n2"),Times(C2,n)),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),IntegerQ(Simplify(Times(n,Power(Plus(m,C1),-1)))),Not(IntegerQ(n))))),
IIntegrate(1382,Int(Times(Power(Times(d_,x_),m_),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(Dist(Times(Power(d,IntPart(m)),Power(Times(d,x),FracPart(m)),Power(Power(x,FracPart(m)),-1)),Int(Times(Power(x,m),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p)),x),x),And(FreeQ(List(a,b,c,d,m,n,p),x),EqQ($s("n2"),Times(C2,n)),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),IntegerQ(Simplify(Times(n,Power(Plus(m,C1),-1)))),Not(IntegerQ(n))))),
IIntegrate(1383,Int(Times(Power(Times(d_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),-1)),x_Symbol),
    Condition(With(List(Set(q,Rt(Plus(Sqr(b),Times(CN1,C4,a,c)),C2))),Plus(Dist(Times(C2,c,Power(q,-1)),Int(Times(Power(Times(d,x),m),Power(Plus(b,Negate(q),Times(C2,c,Power(x,n))),-1)),x),x),Negate(Dist(Times(C2,c,Power(q,-1)),Int(Times(Power(Times(d,x),m),Power(Plus(b,q,Times(C2,c,Power(x,n))),-1)),x),x)))),And(FreeQ(List(a,b,c,d,m,n),x),EqQ($s("n2"),Times(C2,n)),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0)))),
IIntegrate(1384,Int(Times(Power(Times(d_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Times(d,x),Plus(m,C1)),Plus(Sqr(b),Times(CN1,C2,a,c),Times(b,c,Power(x,n))),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1)),Power(Times(a,d,n,Plus(p,C1),Plus(Sqr(b),Times(CN1,C4,a,c))),-1)),x)),Dist(Power(Times(a,n,Plus(p,C1),Plus(Sqr(b),Times(CN1,C4,a,c))),-1),Int(Times(Power(Times(d,x),m),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1)),Simp(Plus(Times(Sqr(b),Plus(Times(n,Plus(p,C1)),m,C1)),Times(CN1,C2,a,c,Plus(m,Times(C2,n,Plus(p,C1)),C1)),Times(b,c,Plus(Times(C2,n,p),Times(C3,n),m,C1),Power(x,n))),x)),x),x)),And(FreeQ(List(a,b,c,d,m,n),x),EqQ($s("n2"),Times(C2,n)),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),ILtQ(Plus(p,C1),C0)))),
IIntegrate(1385,Int(Times(Power(Times(d_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(Dist(Times(Power(a,IntPart(p)),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),FracPart(p)),Power(Times(Power(Plus(C1,Times(C2,c,Power(x,n),Power(Plus(b,Rt(Plus(Sqr(b),Times(CN1,C4,a,c)),C2)),-1))),FracPart(p)),Power(Plus(C1,Times(C2,c,Power(x,n),Power(Plus(b,Negate(Rt(Plus(Sqr(b),Times(CN1,C4,a,c)),C2))),-1))),FracPart(p))),-1)),Int(Times(Power(Times(d,x),m),Power(Plus(C1,Times(C2,c,Power(x,n),Power(Plus(b,Sqrt(Plus(Sqr(b),Times(CN1,C4,a,c)))),-1))),p),Power(Plus(C1,Times(C2,c,Power(x,n),Power(Plus(b,Negate(Sqrt(Plus(Sqr(b),Times(CN1,C4,a,c))))),-1))),p)),x),x),And(FreeQ(List(a,b,c,d,m,n,p),x),EqQ($s("n2"),Times(C2,n))))),
IIntegrate(1386,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Power(x_,n_DEFAULT)),Times(b_DEFAULT,Power(x_,$p("mn")))),p_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(x,Plus(m,Times(CN1,n,p))),Power(Plus(b,Times(a,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p)),x),And(FreeQ(List(a,b,c,m,n),x),EqQ($s("mn"),Negate(n)),IntegerQ(p),PosQ(n)))),
IIntegrate(1387,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Power(x_,n_DEFAULT)),Times(b_DEFAULT,Power(x_,$p("mn")))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(x,Times(n,FracPart(p))),Power(Plus(a,Times(b,Power(Power(x,n),-1)),Times(c,Power(x,n))),FracPart(p)),Power(Power(Plus(b,Times(a,Power(x,n)),Times(c,Power(x,Times(C2,n)))),FracPart(p)),-1)),Int(Times(Power(x,Plus(m,Times(CN1,n,p))),Power(Plus(b,Times(a,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p)),x),x),And(FreeQ(List(a,b,c,m,n,p),x),EqQ($s("mn"),Negate(n)),Not(IntegerQ(p)),PosQ(n)))),
IIntegrate(1388,Int(Times(Power(Times(d_,x_),m_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Power(x_,n_DEFAULT)),Times(b_DEFAULT,Power(x_,$p("mn")))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(d,IntPart(m)),Power(Times(d,x),FracPart(m)),Power(Power(x,FracPart(m)),-1)),Int(Times(Power(x,m),Power(Plus(a,Times(b,Power(Power(x,n),-1)),Times(c,Power(x,n))),p)),x),x),And(FreeQ(List(a,b,c,d,m,n,p),x),EqQ($s("mn"),Negate(n))))),
IIntegrate(1389,Int(Times(Power(Plus(a_DEFAULT,Times(c_DEFAULT,Power(v_,$p("n2",true))),Times(b_DEFAULT,Power(v_,n_))),p_DEFAULT),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Power(Coefficient(v,x,C1),Plus(m,C1)),-1),Subst(Int(SimplifyIntegrand(Times(Power(Plus(x,Negate(Coefficient(v,x,C0))),m),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p)),x),x),x,v),x),And(FreeQ(List(a,b,c,n,p),x),EqQ($s("n2"),Times(C2,n)),LinearQ(v,x),IntegerQ(m),NeQ(v,x)))),
IIntegrate(1390,Int(Times(Power(u_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(c_DEFAULT,Power(v_,$p("n2",true))),Times(b_DEFAULT,Power(v_,n_))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(u,m),Power(Times(Coefficient(v,x,C1),Power(v,m)),-1)),Subst(Int(Times(Power(x,m),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p)),x),x,v),x),And(FreeQ(List(a,b,c,m,n,p),x),EqQ($s("n2"),Times(C2,n)),LinearPairQ(u,v,x)))),
IIntegrate(1391,Int(Times(Power(Plus(d_,Times(e_DEFAULT,Power(x_,n_DEFAULT))),q_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_DEFAULT)),Times(c_DEFAULT,Power(x_,$p("n2",true)))),p_)),x_Symbol),
    Condition(Dist(Times(Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p),Power(Power(Plus(d,Times(e,Power(x,n))),Times(C2,p)),-1)),Int(Power(Plus(d,Times(e,Power(x,n))),Plus(q,Times(C2,p))),x),x),And(FreeQ(List(a,b,c,d,e,n,p,q),x),EqQ($s("n2"),Times(C2,n)),EqQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),Not(IntegerQ(p)),EqQ(Plus(Times(C2,c,d),Times(CN1,b,e)),C0)))),
IIntegrate(1392,Int(Times(Power(Plus(d_,Times(e_DEFAULT,Power(x_,n_DEFAULT))),q_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_DEFAULT)),Times(c_DEFAULT,Power(x_,$p("n2",true)))),p_)),x_Symbol),
    Condition(Dist(Times(Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),FracPart(p)),Power(Times(Power(c,IntPart(p)),Power(Plus(Times(C1D2,b),Times(c,Power(x,n))),Times(C2,FracPart(p)))),-1)),Int(Times(Power(Plus(d,Times(e,Power(x,n))),q),Power(Plus(Times(C1D2,b),Times(c,Power(x,n))),Times(C2,p))),x),x),And(FreeQ(List(a,b,c,d,e,n,p,q),x),EqQ($s("n2"),Times(C2,n)),EqQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),Not(IntegerQ(p))))),
IIntegrate(1393,Int(Times(Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),q_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(x,Times(n,Plus(Times(C2,p),q))),Power(Plus(e,Times(d,Power(Power(x,n),-1))),q),Power(Plus(c,Times(b,Power(Power(x,n),-1)),Times(a,Power(Power(x,Times(C2,n)),-1))),p)),x),And(FreeQ(List(a,b,c,d,e,n),x),EqQ($s("n2"),Times(C2,n)),IntegersQ(p,q),NegQ(n)))),
IIntegrate(1394,Int(Times(Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true)))),p_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),q_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(x,Times(n,Plus(Times(C2,p),q))),Power(Plus(e,Times(d,Power(Power(x,n),-1))),q),Power(Plus(c,Times(a,Power(Power(x,Times(C2,n)),-1))),p)),x),And(FreeQ(List(a,c,d,e,n),x),EqQ($s("n2"),Times(C2,n)),IntegersQ(p,q),NegQ(n)))),
IIntegrate(1395,Int(Times(Power(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),q_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_)),Times(c_DEFAULT,Power(x_,$p("n2")))),p_)),x_Symbol),
    Condition(Negate(Subst(Int(Times(Power(Plus(d,Times(e,Power(Power(x,n),-1))),q),Power(Plus(a,Times(b,Power(Power(x,n),-1)),Times(c,Power(Power(x,Times(C2,n)),-1))),p),Power(x,-2)),x),x,Power(x,-1))),And(FreeQ(List(a,b,c,d,e,p,q),x),EqQ($s("n2"),Times(C2,n)),ILtQ(n,C0)))),
IIntegrate(1396,Int(Times(Power(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),q_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2")))),p_)),x_Symbol),
    Condition(Negate(Subst(Int(Times(Power(Plus(d,Times(e,Power(Power(x,n),-1))),q),Power(Plus(a,Times(c,Power(Power(x,Times(C2,n)),-1))),p),Power(x,-2)),x),x,Power(x,-1))),And(FreeQ(List(a,c,d,e,p,q),x),EqQ($s("n2"),Times(C2,n)),ILtQ(n,C0)))),
IIntegrate(1397,Int(Times(Power(Plus(a_DEFAULT,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),q_DEFAULT)),x_Symbol),
    Condition(With(List(Set(g,Denominator(n))),Dist(g,Subst(Int(Times(Power(x,Plus(g,Negate(C1))),Power(Plus(d,Times(e,Power(x,Times(g,n)))),q),Power(Plus(a,Times(b,Power(x,Times(g,n))),Times(c,Power(x,Times(C2,g,n)))),p)),x),x,Power(x,Power(g,-1))),x)),And(FreeQ(List(a,b,c,d,e,p,q),x),EqQ($s("n2"),Times(C2,n)),FractionQ(n)))),
IIntegrate(1398,Int(Times(Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true)))),p_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),q_DEFAULT)),x_Symbol),
    Condition(With(List(Set(g,Denominator(n))),Dist(g,Subst(Int(Times(Power(x,Plus(g,Negate(C1))),Power(Plus(d,Times(e,Power(x,Times(g,n)))),q),Power(Plus(a,Times(c,Power(x,Times(C2,g,n)))),p)),x),x,Power(x,Power(g,-1))),x)),And(FreeQ(List(a,c,d,e,p,q),x),EqQ($s("n2"),Times(C2,n)),FractionQ(n)))),
IIntegrate(1399,Int(Times(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),Power(Plus(Times(b_DEFAULT,Power(x_,n_)),Times(c_DEFAULT,Power(x_,$p("n2")))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Plus(Times(b,e),Times(CN1,d,c)),Power(Plus(Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1)),Power(Times(b,c,n,Plus(p,C1),Power(x,Times(C2,n,Plus(p,C1)))),-1)),x),Dist(Times(e,Power(c,-1)),Int(Times(Power(Plus(Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1)),Power(Power(x,n),-1)),x),x)),And(FreeQ(List(b,c,d,e,n,p),x),EqQ($s("n2"),Times(C2,n)),Not(IntegerQ(p)),EqQ(Plus(Times(n,Plus(Times(C2,p),C1)),C1),C0)))),
IIntegrate(1400,Int(Times(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),Power(Plus(Times(b_DEFAULT,Power(x_,n_)),Times(c_DEFAULT,Power(x_,$p("n2")))),p_)),x_Symbol),
    Condition(Simp(Times(e,Power(x,Plus(Negate(n),C1)),Power(Plus(Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1)),Power(Times(c,Plus(Times(n,Plus(Times(C2,p),C1)),C1)),-1)),x),And(FreeQ(List(b,c,d,e,n,p),x),EqQ($s("n2"),Times(C2,n)),Not(IntegerQ(p)),NeQ(Plus(Times(n,Plus(Times(C2,p),C1)),C1),C0),EqQ(Plus(Times(b,e,Plus(Times(n,p),C1)),Times(CN1,c,d,Plus(Times(n,Plus(Times(C2,p),C1)),C1))),C0))))
  );
}
