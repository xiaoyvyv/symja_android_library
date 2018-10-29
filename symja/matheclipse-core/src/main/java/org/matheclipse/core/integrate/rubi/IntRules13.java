package org.matheclipse.core.integrate.rubi;


import org.matheclipse.core.interfaces.IAST;

import static org.matheclipse.core.expression.F.And;
import static org.matheclipse.core.expression.F.ArcTan;
import static org.matheclipse.core.expression.F.C0;
import static org.matheclipse.core.expression.F.C1;
import static org.matheclipse.core.expression.F.C1D2;
import static org.matheclipse.core.expression.F.C1D4;
import static org.matheclipse.core.expression.F.C2;
import static org.matheclipse.core.expression.F.C3;
import static org.matheclipse.core.expression.F.C4;
import static org.matheclipse.core.expression.F.CN1;
import static org.matheclipse.core.expression.F.CN1D2;
import static org.matheclipse.core.expression.F.CN1D4;
import static org.matheclipse.core.expression.F.CN2;
import static org.matheclipse.core.expression.F.CN4;
import static org.matheclipse.core.expression.F.Condition;
import static org.matheclipse.core.expression.F.FreeQ;
import static org.matheclipse.core.expression.F.IIntegrate;
import static org.matheclipse.core.expression.F.IntegerQ;
import static org.matheclipse.core.expression.F.List;
import static org.matheclipse.core.expression.F.Log;
import static org.matheclipse.core.expression.F.Negate;
import static org.matheclipse.core.expression.F.Not;
import static org.matheclipse.core.expression.F.OddQ;
import static org.matheclipse.core.expression.F.Or;
import static org.matheclipse.core.expression.F.Plus;
import static org.matheclipse.core.expression.F.Power;
import static org.matheclipse.core.expression.F.Simplify;
import static org.matheclipse.core.expression.F.Sqr;
import static org.matheclipse.core.expression.F.Sqrt;
import static org.matheclipse.core.expression.F.Times;
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
import static org.matheclipse.core.expression.F.m;
import static org.matheclipse.core.expression.F.m_;
import static org.matheclipse.core.expression.F.p;
import static org.matheclipse.core.expression.F.p_;
import static org.matheclipse.core.expression.F.p_DEFAULT;
import static org.matheclipse.core.expression.F.x;
import static org.matheclipse.core.expression.F.x_;
import static org.matheclipse.core.expression.F.x_Symbol;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Dist;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.EqQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.ExpandIntegrand;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.FracPart;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.GtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.IGtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.ILtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Int;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.IntPart;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.LeQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.LtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.NeQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.RationalQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Simp;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Subst;

/** 
 * IndefiniteIntegrationRules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class IntRules13 { 
  public static IAST RULES = List( 
IIntegrate(651,Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Simp(Times(e,Power(Plus(d,Times(e,x)),m),Power(Plus(a,Times(c,Sqr(x))),Plus(p,C1)),Power(Times(C2,c,d,Plus(p,C1)),-1)),x),And(FreeQ(List(a,c,d,e,m,p),x),EqQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),Not(IntegerQ(p)),EqQ(Plus(m,Times(C2,p),C2),C0)))),
IIntegrate(652,Int(Times(Sqr(Plus(d_DEFAULT,Times(e_DEFAULT,x_))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(e,Plus(d,Times(e,x)),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,C1)),Power(Times(c,Plus(p,C1)),-1)),x),Negate(Dist(Times(Sqr(e),Plus(p,C2),Power(Times(c,Plus(p,C1)),-1)),Int(Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,C1)),x),x))),And(FreeQ(List(a,b,c,d,e,p),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),EqQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),Not(IntegerQ(p)),LtQ(p,CN1)))),
IIntegrate(653,Int(Times(Sqr(Plus(d_,Times(e_DEFAULT,x_))),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(e,Plus(d,Times(e,x)),Power(Plus(a,Times(c,Sqr(x))),Plus(p,C1)),Power(Times(c,Plus(p,C1)),-1)),x),Negate(Dist(Times(Sqr(e),Plus(p,C2),Power(Times(c,Plus(p,C1)),-1)),Int(Power(Plus(a,Times(c,Sqr(x))),Plus(p,C1)),x),x))),And(FreeQ(List(a,c,d,e,p),x),EqQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),Not(IntegerQ(p)),LtQ(p,CN1)))),
IIntegrate(654,Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Int(Times(Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(m,p)),Power(Power(Plus(Times(a,Power(d,-1)),Times(c,x,Power(e,-1))),m),-1)),x),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),EqQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),Not(IntegerQ(p)),IntegerQ(m),RationalQ(p),Or(LtQ(C0,Negate(m),p),LtQ(p,Negate(m),C0)),NeQ(m,C2),NeQ(m,CN1)))),
IIntegrate(655,Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Dist(Times(Power(d,Times(C2,m)),Power(Power(a,m),-1)),Int(Times(Power(Plus(a,Times(c,Sqr(x))),Plus(m,p)),Power(Power(Plus(d,Times(CN1,e,x)),m),-1)),x),x),And(FreeQ(List(a,c,d,e,m,p),x),EqQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),Not(IntegerQ(p)),IntegerQ(m),RationalQ(p),Or(LtQ(C0,Negate(m),p),LtQ(p,Negate(m),C0)),NeQ(m,C2),NeQ(m,CN1)))),
IIntegrate(656,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(e,Power(Plus(d,Times(e,x)),Plus(m,Negate(C1))),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,C1)),Power(Times(c,Plus(m,Times(C2,p),C1)),-1)),x),Dist(Times(Simplify(Plus(m,p)),Plus(Times(C2,c,d),Times(CN1,b,e)),Power(Times(c,Plus(m,Times(C2,p),C1)),-1)),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,Negate(C1))),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),p)),x),x)),And(FreeQ(List(a,b,c,d,e,m,p),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),EqQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),Not(IntegerQ(p)),IGtQ(Simplify(Plus(m,p)),C0)))),
IIntegrate(657,Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(e,Power(Plus(d,Times(e,x)),Plus(m,Negate(C1))),Power(Plus(a,Times(c,Sqr(x))),Plus(p,C1)),Power(Times(c,Plus(m,Times(C2,p),C1)),-1)),x),Dist(Times(C2,c,d,Simplify(Plus(m,p)),Power(Times(c,Plus(m,Times(C2,p),C1)),-1)),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,Negate(C1))),Power(Plus(a,Times(c,Sqr(x))),p)),x),x)),And(FreeQ(List(a,c,d,e,m,p),x),EqQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),Not(IntegerQ(p)),IGtQ(Simplify(Plus(m,p)),C0)))),
IIntegrate(658,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(e,Power(Plus(d,Times(e,x)),m),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,C1)),Power(Times(Plus(m,p,C1),Plus(Times(C2,c,d),Times(CN1,b,e))),-1)),x)),Dist(Times(c,Simplify(Plus(m,Times(C2,p),C2)),Power(Times(Plus(m,p,C1),Plus(Times(C2,c,d),Times(CN1,b,e))),-1)),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),p)),x),x)),And(FreeQ(List(a,b,c,d,e,m,p),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),EqQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),Not(IntegerQ(p)),ILtQ(Simplify(Plus(m,Times(C2,p),C2)),C0)))),
IIntegrate(659,Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(e,Power(Plus(d,Times(e,x)),m),Power(Plus(a,Times(c,Sqr(x))),Plus(p,C1)),Power(Times(C2,c,d,Plus(m,p,C1)),-1)),x)),Dist(Times(Simplify(Plus(m,Times(C2,p),C2)),Power(Times(C2,d,Plus(m,p,C1)),-1)),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Power(Plus(a,Times(c,Sqr(x))),p)),x),x)),And(FreeQ(List(a,c,d,e,m,p),x),EqQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),Not(IntegerQ(p)),ILtQ(Simplify(Plus(m,Times(C2,p),C2)),C0)))),
IIntegrate(660,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),CN1D2),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Dist(Times(C2,e),Subst(Int(Power(Plus(Times(C2,c,d),Times(CN1,b,e),Times(Sqr(e),Sqr(x))),-1),x),x,Times(Sqrt(Plus(a,Times(b,x),Times(c,Sqr(x)))),Power(Plus(d,Times(e,x)),CN1D2))),x),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),EqQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0)))),
IIntegrate(661,Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),CN1D2),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Dist(Times(C2,e),Subst(Int(Power(Plus(Times(C2,c,d),Times(Sqr(e),Sqr(x))),-1),x),x,Times(Sqrt(Plus(a,Times(c,Sqr(x)))),Power(Plus(d,Times(e,x)),CN1D2))),x),And(FreeQ(List(a,c,d,e),x),EqQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0)))),
IIntegrate(662,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),p),Power(Times(e,Plus(m,p,C1)),-1)),x),Negate(Dist(Times(c,p,Power(Times(Sqr(e),Plus(m,p,C1)),-1)),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,C2)),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,Negate(C1)))),x),x))),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),EqQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),GtQ(p,C0),Or(LtQ(m,CN2),EqQ(Plus(m,Times(C2,p),C1),C0)),NeQ(Plus(m,p,C1),C0),IntegerQ(Times(C2,p))))),
IIntegrate(663,Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Power(Plus(a,Times(c,Sqr(x))),p),Power(Times(e,Plus(m,p,C1)),-1)),x),Negate(Dist(Times(c,p,Power(Times(Sqr(e),Plus(m,p,C1)),-1)),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,C2)),Power(Plus(a,Times(c,Sqr(x))),Plus(p,Negate(C1)))),x),x))),And(FreeQ(List(a,c,d,e),x),EqQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),GtQ(p,C0),Or(LtQ(m,CN2),EqQ(Plus(m,Times(C2,p),C1),C0)),NeQ(Plus(m,p,C1),C0),IntegerQ(Times(C2,p))))),
IIntegrate(664,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),p),Power(Times(e,Plus(m,Times(C2,p),C1)),-1)),x),Negate(Dist(Times(p,Plus(Times(C2,c,d),Times(CN1,b,e)),Power(Times(Sqr(e),Plus(m,Times(C2,p),C1)),-1)),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,Negate(C1)))),x),x))),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),EqQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),GtQ(p,C0),Or(LeQ(CN2,m,C0),EqQ(Plus(m,p,C1),C0)),NeQ(Plus(m,Times(C2,p),C1),C0),IntegerQ(Times(C2,p))))),
IIntegrate(665,Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Power(Plus(a,Times(c,Sqr(x))),p),Power(Times(e,Plus(m,Times(C2,p),C1)),-1)),x),Negate(Dist(Times(C2,c,d,p,Power(Times(Sqr(e),Plus(m,Times(C2,p),C1)),-1)),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Power(Plus(a,Times(c,Sqr(x))),Plus(p,Negate(C1)))),x),x))),And(FreeQ(List(a,c,d,e),x),EqQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),GtQ(p,C0),Or(LeQ(CN2,m,C0),EqQ(Plus(m,p,C1),C0)),NeQ(Plus(m,Times(C2,p),C1),C0),IntegerQ(Times(C2,p))))),
IIntegrate(666,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Plus(Times(C2,c,d),Times(CN1,b,e)),Power(Plus(d,Times(e,x)),m),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,C1)),Power(Times(e,Plus(p,C1),Plus(Sqr(b),Times(CN1,C4,a,c))),-1)),x),Negate(Dist(Times(Plus(Times(C2,c,d),Times(CN1,b,e)),Plus(m,Times(C2,p),C2),Power(Times(Plus(p,C1),Plus(Sqr(b),Times(CN1,C4,a,c))),-1)),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,Negate(C1))),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,C1))),x),x))),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),EqQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),LtQ(p,CN1),LtQ(C0,m,C1),IntegerQ(Times(C2,p))))),
IIntegrate(667,Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(d,Power(Plus(d,Times(e,x)),m),Power(Plus(a,Times(c,Sqr(x))),Plus(p,C1)),Power(Times(C2,a,e,Plus(p,C1)),-1)),x)),Dist(Times(d,Plus(m,Times(C2,p),C2),Power(Times(C2,a,Plus(p,C1)),-1)),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,Negate(C1))),Power(Plus(a,Times(c,Sqr(x))),Plus(p,C1))),x),x)),And(FreeQ(List(a,c,d,e),x),EqQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),LtQ(p,CN1),LtQ(C0,m,C1),IntegerQ(Times(C2,p))))),
IIntegrate(668,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(e,Power(Plus(d,Times(e,x)),Plus(m,Negate(C1))),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,C1)),Power(Times(c,Plus(p,C1)),-1)),x),Negate(Dist(Times(Sqr(e),Plus(m,p),Power(Times(c,Plus(p,C1)),-1)),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,Negate(C2))),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,C1))),x),x))),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),EqQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),LtQ(p,CN1),GtQ(m,C1),IntegerQ(Times(C2,p))))),
IIntegrate(669,Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(e,Power(Plus(d,Times(e,x)),Plus(m,Negate(C1))),Power(Plus(a,Times(c,Sqr(x))),Plus(p,C1)),Power(Times(c,Plus(p,C1)),-1)),x),Negate(Dist(Times(Sqr(e),Plus(m,p),Power(Times(c,Plus(p,C1)),-1)),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,Negate(C2))),Power(Plus(a,Times(c,Sqr(x))),Plus(p,C1))),x),x))),And(FreeQ(List(a,c,d,e),x),EqQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),LtQ(p,CN1),GtQ(m,C1),IntegerQ(Times(C2,p))))),
IIntegrate(670,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(e,Power(Plus(d,Times(e,x)),Plus(m,Negate(C1))),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,C1)),Power(Times(c,Plus(m,Times(C2,p),C1)),-1)),x),Dist(Times(Plus(m,p),Plus(Times(C2,c,d),Times(CN1,b,e)),Power(Times(c,Plus(m,Times(C2,p),C1)),-1)),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,Negate(C1))),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),p)),x),x)),And(FreeQ(List(a,b,c,d,e,p),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),EqQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),GtQ(m,C1),NeQ(Plus(m,Times(C2,p),C1),C0),IntegerQ(Times(C2,p))))),
IIntegrate(671,Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(e,Power(Plus(d,Times(e,x)),Plus(m,Negate(C1))),Power(Plus(a,Times(c,Sqr(x))),Plus(p,C1)),Power(Times(c,Plus(m,Times(C2,p),C1)),-1)),x),Dist(Times(C2,c,d,Plus(m,p),Power(Times(c,Plus(m,Times(C2,p),C1)),-1)),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,Negate(C1))),Power(Plus(a,Times(c,Sqr(x))),p)),x),x)),And(FreeQ(List(a,c,d,e,p),x),EqQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),GtQ(m,C1),NeQ(Plus(m,Times(C2,p),C1),C0),IntegerQ(Times(C2,p))))),
IIntegrate(672,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(e,Power(Plus(d,Times(e,x)),m),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,C1)),Power(Times(Plus(m,p,C1),Plus(Times(C2,c,d),Times(CN1,b,e))),-1)),x)),Dist(Times(c,Plus(m,Times(C2,p),C2),Power(Times(Plus(m,p,C1),Plus(Times(C2,c,d),Times(CN1,b,e))),-1)),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),p)),x),x)),And(FreeQ(List(a,b,c,d,e,p),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),EqQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),LtQ(m,C0),NeQ(Plus(m,p,C1),C0),IntegerQ(Times(C2,p))))),
IIntegrate(673,Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(e,Power(Plus(d,Times(e,x)),m),Power(Plus(a,Times(c,Sqr(x))),Plus(p,C1)),Power(Times(C2,c,d,Plus(m,p,C1)),-1)),x)),Dist(Times(Plus(m,Times(C2,p),C2),Power(Times(C2,d,Plus(m,p,C1)),-1)),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Power(Plus(a,Times(c,Sqr(x))),p)),x),x)),And(FreeQ(List(a,c,d,e,p),x),EqQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),LtQ(m,C0),NeQ(Plus(m,p,C1),C0),IntegerQ(Times(C2,p))))),
IIntegrate(674,Int(Times(Power(Times(e_DEFAULT,x_),m_),Power(Plus(Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Dist(Times(Power(Times(e,x),m),Power(Plus(Times(b,x),Times(c,Sqr(x))),p),Power(Times(Power(x,Plus(m,p)),Power(Plus(b,Times(c,x)),p)),-1)),Int(Times(Power(x,Plus(m,p)),Power(Plus(b,Times(c,x)),p)),x),x),And(FreeQ(List(b,c,e,m),x),Not(IntegerQ(p))))),
IIntegrate(675,Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Int(Times(Power(Plus(d,Times(e,x)),Plus(m,p)),Power(Plus(Times(a,Power(d,-1)),Times(c,x,Power(e,-1))),p)),x),And(FreeQ(List(a,c,d,e,m,p),x),EqQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),Not(IntegerQ(p)),GtQ(a,C0),GtQ(d,C0),Not(IGtQ(m,C0))))),
IIntegrate(676,Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Dist(Times(Power(a,Plus(p,C1)),Power(d,Plus(m,Negate(C1))),Power(Times(Plus(d,Times(CN1,e,x)),Power(d,-1)),Plus(p,C1)),Power(Power(Plus(Times(a,Power(d,-1)),Times(c,x,Power(e,-1))),Plus(p,C1)),-1)),Int(Times(Power(Plus(C1,Times(e,x,Power(d,-1))),Plus(m,p)),Power(Plus(Times(a,Power(d,-1)),Times(c,x,Power(e,-1))),p)),x),x),And(FreeQ(List(a,c,d,e,m),x),EqQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),Not(IntegerQ(p)),Or(IntegerQ(m),GtQ(d,C0)),GtQ(a,C0),Not(And(IGtQ(m,C0),Or(IntegerQ(Times(C3,p)),IntegerQ(Times(C4,p)))))))),
IIntegrate(677,Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Dist(Times(Power(d,m),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),FracPart(p)),Power(Times(Power(Plus(C1,Times(e,x,Power(d,-1))),FracPart(p)),Power(Plus(Times(a,Power(d,-1)),Times(c,x,Power(e,-1))),FracPart(p))),-1)),Int(Times(Power(Plus(C1,Times(e,x,Power(d,-1))),Plus(m,p)),Power(Plus(Times(a,Power(d,-1)),Times(c,x,Power(e,-1))),p)),x),x),And(FreeQ(List(a,b,c,d,e,m),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),EqQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),Not(IntegerQ(p)),Or(IntegerQ(m),GtQ(d,C0)),Not(And(IGtQ(m,C0),Or(IntegerQ(Times(C3,p)),IntegerQ(Times(C4,p)))))))),
IIntegrate(678,Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Dist(Times(Power(d,Plus(m,Negate(C1))),Power(Plus(a,Times(c,Sqr(x))),Plus(p,C1)),Power(Times(Power(Plus(C1,Times(e,x,Power(d,-1))),Plus(p,C1)),Power(Plus(Times(a,Power(d,-1)),Times(c,x,Power(e,-1))),Plus(p,C1))),-1)),Int(Times(Power(Plus(C1,Times(e,x,Power(d,-1))),Plus(m,p)),Power(Plus(Times(a,Power(d,-1)),Times(c,x,Power(e,-1))),p)),x),x),And(FreeQ(List(a,c,d,e,m),x),EqQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),Not(IntegerQ(p)),Or(IntegerQ(m),GtQ(d,C0)),Not(And(IGtQ(m,C0),Or(IntegerQ(Times(C3,p)),IntegerQ(Times(C4,p)))))))),
IIntegrate(679,Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Dist(Times(Power(d,IntPart(m)),Power(Plus(d,Times(e,x)),FracPart(m)),Power(Power(Plus(C1,Times(e,x,Power(d,-1))),FracPart(m)),-1)),Int(Times(Power(Plus(C1,Times(e,x,Power(d,-1))),m),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),p)),x),x),And(FreeQ(List(a,b,c,d,e,m),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),EqQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),Not(IntegerQ(p)),Not(Or(IntegerQ(m),GtQ(d,C0)))))),
IIntegrate(680,Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Dist(Times(Power(d,IntPart(m)),Power(Plus(d,Times(e,x)),FracPart(m)),Power(Power(Plus(C1,Times(e,x,Power(d,-1))),FracPart(m)),-1)),Int(Times(Power(Plus(C1,Times(e,x,Power(d,-1))),m),Power(Plus(a,Times(c,Sqr(x))),p)),x),x),And(FreeQ(List(a,c,d,e,m),x),EqQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),Not(IntegerQ(p)),Not(Or(IntegerQ(m),GtQ(d,C0)))))),
IIntegrate(681,Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),-1),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),-1)),x_Symbol),
    Condition(Plus(Dist(Times(CN4,b,c,Power(Times(d,Plus(Sqr(b),Times(CN1,C4,a,c))),-1)),Int(Power(Plus(b,Times(C2,c,x)),-1),x),x),Dist(Times(Sqr(b),Power(Times(Sqr(d),Plus(Sqr(b),Times(CN1,C4,a,c))),-1)),Int(Times(Plus(d,Times(e,x)),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),-1)),x),x)),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),EqQ(Plus(Times(C2,c,d),Times(CN1,b,e)),C0)))),
IIntegrate(682,Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Simp(Times(C2,c,Power(Plus(d,Times(e,x)),Plus(m,C1)),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,C1)),Power(Times(e,Plus(p,C1),Plus(Sqr(b),Times(CN1,C4,a,c))),-1)),x),And(FreeQ(List(a,b,c,d,e,m,p),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),EqQ(Plus(Times(C2,c,d),Times(CN1,b,e)),C0),EqQ(Plus(m,Times(C2,p),C3),C0),NeQ(p,CN1)))),
IIntegrate(683,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(d,Times(e,x)),m),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),p)),x),x),And(FreeQ(List(a,b,c,d,e,m),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),EqQ(Plus(Times(C2,c,d),Times(CN1,b,e)),C0),IGtQ(p,C0),Not(And(EqQ(m,C3),NeQ(p,C1)))))),
IIntegrate(684,Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),p),Power(Times(e,Plus(m,C1)),-1)),x),Negate(Dist(Times(b,p,Power(Times(d,e,Plus(m,C1)),-1)),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,C2)),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,Negate(C1)))),x),x))),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),EqQ(Plus(Times(C2,c,d),Times(CN1,b,e)),C0),NeQ(Plus(m,Times(C2,p),C3),C0),GtQ(p,C0),LtQ(m,CN1),Not(And(IntegerQ(Times(C1D2,m)),LtQ(Plus(m,Times(C2,p),C3),C0))),IntegerQ(Times(C2,p))))),
IIntegrate(685,Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),p),Power(Times(e,Plus(m,Times(C2,p),C1)),-1)),x),Negate(Dist(Times(d,p,Plus(Sqr(b),Times(CN1,C4,a,c)),Power(Times(b,e,Plus(m,Times(C2,p),C1)),-1)),Int(Times(Power(Plus(d,Times(e,x)),m),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,Negate(C1)))),x),x))),And(FreeQ(List(a,b,c,d,e,m),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),EqQ(Plus(Times(C2,c,d),Times(CN1,b,e)),C0),NeQ(Plus(m,Times(C2,p),C3),C0),GtQ(p,C0),Not(LtQ(m,CN1)),Not(And(IGtQ(Times(C1D2,Plus(m,Negate(C1))),C0),Or(Not(IntegerQ(p)),LtQ(m,Times(C2,p))))),RationalQ(m),IntegerQ(Times(C2,p))))),
IIntegrate(686,Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(d,Power(Plus(d,Times(e,x)),Plus(m,Negate(C1))),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,C1)),Power(Times(b,Plus(p,C1)),-1)),x),Negate(Dist(Times(d,e,Plus(m,Negate(C1)),Power(Times(b,Plus(p,C1)),-1)),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,Negate(C2))),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,C1))),x),x))),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),EqQ(Plus(Times(C2,c,d),Times(CN1,b,e)),C0),NeQ(Plus(m,Times(C2,p),C3),C0),LtQ(p,CN1),GtQ(m,C1),IntegerQ(Times(C2,p))))),
IIntegrate(687,Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(C2,c,Power(Plus(d,Times(e,x)),Plus(m,C1)),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,C1)),Power(Times(e,Plus(p,C1),Plus(Sqr(b),Times(CN1,C4,a,c))),-1)),x),Negate(Dist(Times(C2,c,e,Plus(m,Times(C2,p),C3),Power(Times(e,Plus(p,C1),Plus(Sqr(b),Times(CN1,C4,a,c))),-1)),Int(Times(Power(Plus(d,Times(e,x)),m),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,C1))),x),x))),And(FreeQ(List(a,b,c,d,e,m),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),EqQ(Plus(Times(C2,c,d),Times(CN1,b,e)),C0),NeQ(Plus(m,Times(C2,p),C3),C0),LtQ(p,CN1),Not(GtQ(m,C1)),RationalQ(m),IntegerQ(Times(C2,p))))),
IIntegrate(688,Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),-1),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Dist(Times(C4,c),Subst(Int(Power(Plus(Times(Sqr(b),e),Times(CN1,C4,a,c,e),Times(C4,c,e,Sqr(x))),-1),x),x,Sqrt(Plus(a,Times(b,x),Times(c,Sqr(x))))),x),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),EqQ(Plus(Times(C2,c,d),Times(CN1,b,e)),C0)))),
IIntegrate(689,Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),CN1D2),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Dist(Times(C4,Sqrt(Times(CN1,c,Power(Plus(Sqr(b),Times(CN1,C4,a,c)),-1))),Power(e,-1)),Subst(Int(Power(Simp(Plus(C1,Times(CN1,Sqr(b),Power(x,4),Power(Times(Sqr(d),Plus(Sqr(b),Times(CN1,C4,a,c))),-1))),x),CN1D2),x),x,Sqrt(Plus(d,Times(e,x)))),x),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),EqQ(Plus(Times(C2,c,d),Times(CN1,b,e)),C0),LtQ(Times(c,Power(Plus(Sqr(b),Times(CN1,C4,a,c)),-1)),C0)))),
IIntegrate(690,Int(Times(Sqrt(Plus(d_,Times(e_DEFAULT,x_))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Dist(Times(C4,Sqrt(Times(CN1,c,Power(Plus(Sqr(b),Times(CN1,C4,a,c)),-1))),Power(e,-1)),Subst(Int(Times(Sqr(x),Power(Simp(Plus(C1,Times(CN1,Sqr(b),Power(x,4),Power(Times(Sqr(d),Plus(Sqr(b),Times(CN1,C4,a,c))),-1))),x),CN1D2)),x),x,Sqrt(Plus(d,Times(e,x)))),x),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),EqQ(Plus(Times(C2,c,d),Times(CN1,b,e)),C0),LtQ(Times(c,Power(Plus(Sqr(b),Times(CN1,C4,a,c)),-1)),C0)))),
IIntegrate(691,Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Dist(Times(Sqrt(Times(CN1,c,Plus(a,Times(b,x),Times(c,Sqr(x))),Power(Plus(Sqr(b),Times(CN1,C4,a,c)),-1))),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),CN1D2)),Int(Times(Power(Plus(d,Times(e,x)),m),Power(Plus(Times(CN1,a,c,Power(Plus(Sqr(b),Times(CN1,C4,a,c)),-1)),Times(CN1,b,c,x,Power(Plus(Sqr(b),Times(CN1,C4,a,c)),-1)),Times(CN1,Sqr(c),Sqr(x),Power(Plus(Sqr(b),Times(CN1,C4,a,c)),-1))),CN1D2)),x),x),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),EqQ(Plus(Times(C2,c,d),Times(CN1,b,e)),C0),EqQ(Sqr(m),C1D4)))),
IIntegrate(692,Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(C2,d,Power(Plus(d,Times(e,x)),Plus(m,Negate(C1))),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,C1)),Power(Times(b,Plus(m,Times(C2,p),C1)),-1)),x),Dist(Times(Sqr(d),Plus(m,Negate(C1)),Plus(Sqr(b),Times(CN1,C4,a,c)),Power(Times(Sqr(b),Plus(m,Times(C2,p),C1)),-1)),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,Negate(C2))),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),p)),x),x)),And(FreeQ(List(a,b,c,d,e,p),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),EqQ(Plus(Times(C2,c,d),Times(CN1,b,e)),C0),NeQ(Plus(m,Times(C2,p),C3),C0),GtQ(m,C1),NeQ(Plus(m,Times(C2,p),C1),C0),Or(IntegerQ(Times(C2,p)),And(IntegerQ(m),RationalQ(p)),OddQ(m))))),
IIntegrate(693,Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(CN2,b,d,Power(Plus(d,Times(e,x)),Plus(m,C1)),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,C1)),Power(Times(Sqr(d),Plus(m,C1),Plus(Sqr(b),Times(CN1,C4,a,c))),-1)),x),Dist(Times(Sqr(b),Plus(m,Times(C2,p),C3),Power(Times(Sqr(d),Plus(m,C1),Plus(Sqr(b),Times(CN1,C4,a,c))),-1)),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,C2)),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),p)),x),x)),And(FreeQ(List(a,b,c,d,e,p),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),EqQ(Plus(Times(C2,c,d),Times(CN1,b,e)),C0),NeQ(Plus(m,Times(C2,p),C3),C0),LtQ(m,CN1),Or(IntegerQ(Times(C2,p)),And(IntegerQ(m),RationalQ(p)),IntegerQ(Times(C1D2,Plus(m,Times(C2,p),C3))))))),
IIntegrate(694,Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Power(e,-1),Subst(Int(Times(Power(x,m),Power(Plus(a,Times(CN1,Sqr(b),Power(Times(C4,c),-1)),Times(c,Sqr(x),Power(e,-2))),p)),x),x,Plus(d,Times(e,x))),x),And(FreeQ(List(a,b,c,d,e,m,p),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),EqQ(Plus(Times(C2,c,d),Times(CN1,b,e)),C0)))),
IIntegrate(695,Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),-1),Power(Plus(a_DEFAULT,Times(c_DEFAULT,Sqr(x_))),CN1D4)),x_Symbol),
    Condition(Plus(Simp(Times(C1,ArcTan(Times(Power(Plus(CN1,Times(CN1,c,Sqr(x),Power(a,-1))),C1D4),Power(Plus(C1,Times(CN1,c,d,x,Power(Times(C2,a,e),-1)),Negate(Sqrt(Plus(CN1,Times(CN1,c,Sqr(x),Power(a,-1)))))),-1))),Power(Times(C2,Power(Negate(a),C1D4),e),-1)),x),Simp(Times(C1,Log(Times(Plus(C1,Times(CN1,c,d,x,Power(Times(C2,a,e),-1)),Sqrt(Plus(CN1,Times(CN1,c,Sqr(x),Power(a,-1)))),Negate(Power(Plus(CN1,Times(CN1,c,Sqr(x),Power(a,-1))),C1D4))),Power(Plus(C1,Times(CN1,c,d,x,Power(Times(C2,a,e),-1)),Sqrt(Plus(CN1,Times(CN1,c,Sqr(x),Power(a,-1)))),Power(Plus(CN1,Times(CN1,c,Sqr(x),Power(a,-1))),C1D4)),-1))),Power(Times(C4,Power(Negate(a),C1D4),e),-1)),x)),And(FreeQ(List(a,c,d,e),x),EqQ(Plus(Times(c,Sqr(d)),Times(C2,a,Sqr(e))),C0),LtQ(a,C0)))),
IIntegrate(696,Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(e,m,Power(d,Plus(m,Negate(C1))),Power(Plus(a,Times(c,Sqr(x))),Plus(p,C1)),Power(Times(C2,c,Plus(p,C1)),-1)),x),Int(Times(Plus(Power(Plus(d,Times(e,x)),m),Times(CN1,e,m,Power(d,Plus(m,Negate(C1))),x)),Power(Plus(a,Times(c,Sqr(x))),p)),x)),And(FreeQ(List(a,c,d,e),x),NeQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),IGtQ(p,C1),IGtQ(m,C0),LeQ(m,p)))),
IIntegrate(697,Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(d,Times(e,x)),m),Power(Plus(a,Times(c,Sqr(x))),p)),x),x),And(FreeQ(List(a,c,d,e,m),x),NeQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),IGtQ(p,C0)))),
IIntegrate(698,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(d,Times(e,x)),m),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),p)),x),x),And(FreeQ(List(a,b,c,d,e,m),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),NeQ(Plus(Times(C2,c,d),Times(CN1,b,e)),C0),IntegerQ(p),Or(GtQ(p,C0),And(EqQ(a,C0),IntegerQ(m)))))),
IIntegrate(699,Int(Times(Sqrt(Plus(d_DEFAULT,Times(e_DEFAULT,x_))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),-1)),x_Symbol),
    Condition(Dist(Times(C2,e),Subst(Int(Times(Sqr(x),Power(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e)),Times(CN1,Plus(Times(C2,c,d),Times(CN1,b,e)),Sqr(x)),Times(c,Power(x,4))),-1)),x),x,Sqrt(Plus(d,Times(e,x)))),x),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),NeQ(Plus(Times(C2,c,d),Times(CN1,b,e)),C0)))),
IIntegrate(700,Int(Times(Sqrt(Plus(d_,Times(e_DEFAULT,x_))),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),-1)),x_Symbol),
    Condition(Dist(Times(C2,e),Subst(Int(Times(Sqr(x),Power(Plus(Times(c,Sqr(d)),Times(a,Sqr(e)),Times(CN1,C2,c,d,Sqr(x)),Times(c,Power(x,4))),-1)),x),x,Sqrt(Plus(d,Times(e,x)))),x),And(FreeQ(List(a,c,d,e),x),NeQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0))))
  );
}
