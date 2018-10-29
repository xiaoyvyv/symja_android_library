package org.matheclipse.core.integrate.rubi;


import org.matheclipse.core.interfaces.IAST;

import static org.matheclipse.core.expression.F.$;
import static org.matheclipse.core.expression.F.$p;
import static org.matheclipse.core.expression.F.$s;
import static org.matheclipse.core.expression.F.And;
import static org.matheclipse.core.expression.F.Apart;
import static org.matheclipse.core.expression.F.C0;
import static org.matheclipse.core.expression.F.C1;
import static org.matheclipse.core.expression.F.C1D2;
import static org.matheclipse.core.expression.F.C2;
import static org.matheclipse.core.expression.F.C4;
import static org.matheclipse.core.expression.F.CN1;
import static org.matheclipse.core.expression.F.Condition;
import static org.matheclipse.core.expression.F.Cos;
import static org.matheclipse.core.expression.F.Cot;
import static org.matheclipse.core.expression.F.Csc;
import static org.matheclipse.core.expression.F.Expand;
import static org.matheclipse.core.expression.F.FreeQ;
import static org.matheclipse.core.expression.F.IIntegrate;
import static org.matheclipse.core.expression.F.IntegerQ;
import static org.matheclipse.core.expression.F.List;
import static org.matheclipse.core.expression.F.MatchQ;
import static org.matheclipse.core.expression.F.MemberQ;
import static org.matheclipse.core.expression.F.Module;
import static org.matheclipse.core.expression.F.Negate;
import static org.matheclipse.core.expression.F.Not;
import static org.matheclipse.core.expression.F.Or;
import static org.matheclipse.core.expression.F.Plus;
import static org.matheclipse.core.expression.F.Power;
import static org.matheclipse.core.expression.F.Sec;
import static org.matheclipse.core.expression.F.Set;
import static org.matheclipse.core.expression.F.Sin;
import static org.matheclipse.core.expression.F.Sqr;
import static org.matheclipse.core.expression.F.Sqrt;
import static org.matheclipse.core.expression.F.Sum;
import static org.matheclipse.core.expression.F.Tan;
import static org.matheclipse.core.expression.F.Times;
import static org.matheclipse.core.expression.F.With;
import static org.matheclipse.core.expression.F.a;
import static org.matheclipse.core.expression.F.a_;
import static org.matheclipse.core.expression.F.a_DEFAULT;
import static org.matheclipse.core.expression.F.b;
import static org.matheclipse.core.expression.F.b_DEFAULT;
import static org.matheclipse.core.expression.F.c;
import static org.matheclipse.core.expression.F.c_DEFAULT;
import static org.matheclipse.core.expression.F.d;
import static org.matheclipse.core.expression.F.d_DEFAULT;
import static org.matheclipse.core.expression.F.e;
import static org.matheclipse.core.expression.F.e_DEFAULT;
import static org.matheclipse.core.expression.F.f;
import static org.matheclipse.core.expression.F.f_DEFAULT;
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
import static org.matheclipse.core.expression.F.q_;
import static org.matheclipse.core.expression.F.u;
import static org.matheclipse.core.expression.F.u_DEFAULT;
import static org.matheclipse.core.expression.F.x;
import static org.matheclipse.core.expression.F.x_;
import static org.matheclipse.core.expression.F.x_Symbol;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.ActivateTrig;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Dist;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.EqQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.ExpandToSum;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.ExpandTrig;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.FracPart;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.FreeFactors;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.GtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.IGtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.ILtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Int;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.IntPart;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.IntegersQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.LeQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.LtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.NeQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Rt;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Simp;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Subst;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Unintegrable;

/** 
 * IndefiniteIntegrationRules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class IntRules64 { 
  public static IAST RULES = List( 
IIntegrate(3201,Int(Times(Power($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),m_),Power(Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Sqr($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),p_DEFAULT)),x_Symbol),
    Condition(With(List(Set($s("ff"),FreeFactors(Sin(Plus(e,Times(f,x))),x))),Dist(Times($s("ff"),Sqrt(Sqr(Cos(Plus(e,Times(f,x))))),Power(Times(f,Cos(Plus(e,Times(f,x)))),-1)),Subst(Int(Times(Power(Times(d,$s("ff"),x),n),Power(Plus(C1,Times(CN1,Sqr($s("ff")),Sqr(x))),Times(C1D2,Plus(m,Negate(C1)))),Power(Plus(a,Times(b,Sqr($s("ff")),Sqr(x))),p)),x),x,Times(Sin(Plus(e,Times(f,x))),Power($s("ff"),-1))),x)),And(FreeQ(List(a,b,d,e,f,n,p),x),IntegerQ(Times(C1D2,m))))),
IIntegrate(3202,Int(Times(Power(Times($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),c_DEFAULT),m_),Power(Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Sqr($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),p_DEFAULT)),x_Symbol),
    Condition(With(List(Set($s("ff"),FreeFactors(Sin(Plus(e,Times(f,x))),x))),Dist(Times($s("ff"),Power(c,Plus(Times(C2,IntPart(Times(C1D2,Plus(m,Negate(C1))))),C1)),Power(Times(c,Cos(Plus(e,Times(f,x)))),Times(C2,FracPart(Times(C1D2,Plus(m,Negate(C1)))))),Power(Times(f,Power(Sqr(Cos(Plus(e,Times(f,x)))),FracPart(Times(C1D2,Plus(m,Negate(C1)))))),-1)),Subst(Int(Times(Power(Times(d,$s("ff"),x),n),Power(Plus(C1,Times(CN1,Sqr($s("ff")),Sqr(x))),Times(C1D2,Plus(m,Negate(C1)))),Power(Plus(a,Times(b,Sqr($s("ff")),Sqr(x))),p)),x),x,Times(Sin(Plus(e,Times(f,x))),Power($s("ff"),-1))),x)),And(FreeQ(List(a,b,c,d,e,f,m,n,p),x),Not(IntegerQ(m))))),
IIntegrate(3203,Int(Power(Times(b_DEFAULT,Sqr($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),p_),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Cot(Plus(e,Times(f,x))),Power(Times(b,Sqr(Sin(Plus(e,Times(f,x))))),p),Power(Times(C2,f,p),-1)),x)),Dist(Times(b,Plus(Times(C2,p),Negate(C1)),Power(Times(C2,p),-1)),Int(Power(Times(b,Sqr(Sin(Plus(e,Times(f,x))))),Plus(p,Negate(C1))),x),x)),And(FreeQ(List(b,e,f),x),Not(IntegerQ(p)),GtQ(p,C1)))),
IIntegrate(3204,Int(Power(Times(b_DEFAULT,Sqr($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),p_),x_Symbol),
    Condition(Plus(Simp(Times(Cot(Plus(e,Times(f,x))),Power(Times(b,Sqr(Sin(Plus(e,Times(f,x))))),Plus(p,C1)),Power(Times(b,f,Plus(Times(C2,p),C1)),-1)),x),Dist(Times(C2,Plus(p,C1),Power(Times(b,Plus(Times(C2,p),C1)),-1)),Int(Power(Times(b,Sqr(Sin(Plus(e,Times(f,x))))),Plus(p,C1)),x),x)),And(FreeQ(List(b,e,f),x),Not(IntegerQ(p)),LtQ(p,CN1)))),
IIntegrate(3205,Int(Times(Power(Times(b_DEFAULT,Power($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),n_)),p_DEFAULT),Power($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),m_DEFAULT)),x_Symbol),
    Condition(With(List(Set($s("ff"),FreeFactors(Sqr(Sin(Plus(e,Times(f,x)))),x))),Dist(Times(Power($s("ff"),Times(C1D2,Plus(m,C1))),Power(Times(C2,f),-1)),Subst(Int(Times(Power(x,Times(C1D2,Plus(m,Negate(C1)))),Power(Times(b,Power($s("ff"),Times(C1D2,n)),Power(x,Times(C1D2,n))),p),Power(Power(Plus(C1,Times(CN1,$s("ff"),x)),Times(C1D2,Plus(m,C1))),-1)),x),x,Times(Sqr(Sin(Plus(e,Times(f,x)))),Power($s("ff"),-1))),x)),And(FreeQ(List(b,e,f,p),x),IntegerQ(Times(C1D2,Plus(m,Negate(C1)))),IntegerQ(Times(C1D2,n))))),
IIntegrate(3206,Int(Times(Power(Times(b_DEFAULT,Power(Times(c_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),p_DEFAULT),Power($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),m_DEFAULT)),x_Symbol),
    Condition(With(List(Set($s("ff"),FreeFactors(Sin(Plus(e,Times(f,x))),x))),Dist(Times(Power($s("ff"),Plus(m,C1)),Power(f,-1)),Subst(Int(Times(Power(x,m),Power(Times(b,Power(Times(c,$s("ff"),x),n)),p),Power(Power(Plus(C1,Times(CN1,Sqr($s("ff")),Sqr(x))),Times(C1D2,Plus(m,C1))),-1)),x),x,Times(Sin(Plus(e,Times(f,x))),Power($s("ff"),-1))),x)),And(FreeQ(List(b,c,e,f,n,p),x),ILtQ(Times(C1D2,Plus(m,Negate(C1))),C0)))),
IIntegrate(3207,Int(Times(u_DEFAULT,Power(Times(b_DEFAULT,Power($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),n_)),p_)),x_Symbol),
    Condition(With(List(Set($s("ff"),FreeFactors(Sin(Plus(e,Times(f,x))),x))),Dist(Times(Power(Times(b,Power($s("ff"),n)),IntPart(p)),Power(Times(b,Power(Sin(Plus(e,Times(f,x))),n)),FracPart(p)),Power(Power(Times(Sin(Plus(e,Times(f,x))),Power($s("ff"),-1)),Times(n,FracPart(p))),-1)),Int(Times(ActivateTrig(u),Power(Times(Sin(Plus(e,Times(f,x))),Power($s("ff"),-1)),Times(n,p))),x),x)),And(FreeQ(List(b,e,f,n,p),x),Not(IntegerQ(p)),IntegerQ(n),Or(EqQ(u,C1),MatchQ(u,Condition(Power(Times(d_DEFAULT,$($p("§trig"),Plus(e,Times(f,x)))),m_DEFAULT),And(FreeQ(List(d,m),x),MemberQ(List($s("§sin"),$s("§cos"),$s("§tan"),$s("§cot"),$s("§sec"),$s("§csc")),$s("§trig"))))))))),
IIntegrate(3208,Int(Times(u_DEFAULT,Power(Times(b_DEFAULT,Power(Times(c_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),p_)),x_Symbol),
    Condition(Dist(Times(Power(b,IntPart(p)),Power(Times(b,Power(Times(c,Sin(Plus(e,Times(f,x)))),n)),FracPart(p)),Power(Power(Times(c,Sin(Plus(e,Times(f,x)))),Times(n,FracPart(p))),-1)),Int(Times(ActivateTrig(u),Power(Times(c,Sin(Plus(e,Times(f,x)))),Times(n,p))),x),x),And(FreeQ(List(b,c,e,f,n,p),x),Not(IntegerQ(p)),Not(IntegerQ(n)),Or(EqQ(u,C1),MatchQ(u,Condition(Power(Times(d_DEFAULT,$($p("§trig"),Plus(e,Times(f,x)))),m_DEFAULT),And(FreeQ(List(d,m),x),MemberQ(List($s("§sin"),$s("§cos"),$s("§tan"),$s("§cot"),$s("§sec"),$s("§csc")),$s("§trig"))))))))),
IIntegrate(3209,Int(Power(Plus(a_,Times(b_DEFAULT,Power($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),4))),p_DEFAULT),x_Symbol),
    Condition(With(List(Set($s("ff"),FreeFactors(Tan(Plus(e,Times(f,x))),x))),Dist(Times($s("ff"),Power(f,-1)),Subst(Int(Times(Power(Plus(a,Times(C2,a,Sqr($s("ff")),Sqr(x)),Times(Plus(a,b),Power($s("ff"),4),Power(x,4))),p),Power(Power(Plus(C1,Times(Sqr($s("ff")),Sqr(x))),Plus(Times(C2,p),C1)),-1)),x),x,Times(Tan(Plus(e,Times(f,x))),Power($s("ff"),-1))),x)),And(FreeQ(List(a,b,e,f),x),IntegerQ(p)))),
IIntegrate(3210,Int(Power(Plus(a_,Times(b_DEFAULT,Power($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),4))),p_),x_Symbol),
    Condition(With(List(Set($s("ff"),FreeFactors(Tan(Plus(e,Times(f,x))),x))),Dist(Times($s("ff"),Power(Plus(a,Times(b,Power(Sin(Plus(e,Times(f,x))),4))),p),Power(Sqr(Sec(Plus(e,Times(f,x)))),Times(C2,p)),Power(Times(f,Power(Plus(a,Times(C2,a,Sqr(Tan(Plus(e,Times(f,x))))),Times(Plus(a,b),Power(Tan(Plus(e,Times(f,x))),4))),p)),-1)),Subst(Int(Times(Power(Plus(a,Times(C2,a,Sqr($s("ff")),Sqr(x)),Times(Plus(a,b),Power($s("ff"),4),Power(x,4))),p),Power(Power(Plus(C1,Times(Sqr($s("ff")),Sqr(x))),Plus(Times(C2,p),C1)),-1)),x),x,Times(Tan(Plus(e,Times(f,x))),Power($s("ff"),-1))),x)),And(FreeQ(List(a,b,e,f,p),x),IntegerQ(Plus(p,Negate(C1D2)))))),
IIntegrate(3211,Int(Power(Plus(a_,Times(b_DEFAULT,Power($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),n_))),-1),x_Symbol),
    Condition(Module(List(k),Dist(Times(C2,Power(Times(a,n),-1)),Sum(Int(Power(Plus(C1,Times(CN1,Sqr(Sin(Plus(e,Times(f,x)))),Power(Times(Power(CN1,Times(C4,k,Power(n,-1))),Rt(Times(CN1,a,Power(b,-1)),Times(C1D2,n))),-1))),-1),x),List(k,C1,Times(C1D2,n))),x)),And(FreeQ(List(a,b,e,f),x),IntegerQ(Times(C1D2,n))))),
IIntegrate(3212,Int(Power(Plus(a_,Times(b_DEFAULT,Power($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),n_))),p_),x_Symbol),
    Condition(With(List(Set($s("ff"),FreeFactors(Tan(Plus(e,Times(f,x))),x))),Dist(Times($s("ff"),Power(f,-1)),Subst(Int(Times(Power(Plus(Times(b,Power($s("ff"),n),Power(x,n)),Times(a,Power(Plus(C1,Times(Sqr($s("ff")),Sqr(x))),Times(C1D2,n)))),p),Power(Power(Plus(C1,Times(Sqr($s("ff")),Sqr(x))),Plus(Times(C1D2,n,p),C1)),-1)),x),x,Times(Tan(Plus(e,Times(f,x))),Power($s("ff"),-1))),x)),And(FreeQ(List(a,b,e,f),x),IntegerQ(Times(C1D2,n)),IGtQ(p,C0)))),
IIntegrate(3213,Int(Power(Plus(a_,Times(b_DEFAULT,Power(Times(c_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_))),p_),x_Symbol),
    Condition(Int(ExpandTrig(Power(Plus(a,Times(b,Power(Times(c,$($s("§sin"),Plus(e,Times(f,x)))),n))),p),x),x),And(FreeQ(List(a,b,c,e,f,n),x),Or(IGtQ(p,C0),And(EqQ(p,CN1),IntegerQ(n)))))),
IIntegrate(3214,Int(Power(Plus(a_,Times(b_DEFAULT,Power(Times(c_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_))),p_),x_Symbol),
    Condition(Unintegrable(Power(Plus(a,Times(b,Power(Times(c,Sin(Plus(e,Times(f,x)))),n))),p),x),FreeQ(List(a,b,c,e,f,n,p),x))),
IIntegrate(3215,Int(Times(Power($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),4))),p_DEFAULT)),x_Symbol),
    Condition(With(List(Set($s("ff"),FreeFactors(Cos(Plus(e,Times(f,x))),x))),Negate(Dist(Times($s("ff"),Power(f,-1)),Subst(Int(Times(Power(Plus(C1,Times(CN1,Sqr($s("ff")),Sqr(x))),Times(C1D2,Plus(m,Negate(C1)))),Power(Plus(a,b,Times(CN1,C2,b,Sqr($s("ff")),Sqr(x)),Times(b,Power($s("ff"),4),Power(x,4))),p)),x),x,Times(Cos(Plus(e,Times(f,x))),Power($s("ff"),-1))),x))),And(FreeQ(List(a,b,e,f,p),x),IntegerQ(Times(C1D2,Plus(m,Negate(C1))))))),
IIntegrate(3216,Int(Times(Power($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),n_))),p_DEFAULT)),x_Symbol),
    Condition(With(List(Set($s("ff"),FreeFactors(Cos(Plus(e,Times(f,x))),x))),Negate(Dist(Times($s("ff"),Power(f,-1)),Subst(Int(Times(Power(Plus(C1,Times(CN1,Sqr($s("ff")),Sqr(x))),Times(C1D2,Plus(m,Negate(C1)))),Power(Plus(a,Times(b,Power(Plus(C1,Times(CN1,Sqr($s("ff")),Sqr(x))),Times(C1D2,n)))),p)),x),x,Times(Cos(Plus(e,Times(f,x))),Power($s("ff"),-1))),x))),And(FreeQ(List(a,b,e,f,p),x),IntegerQ(Times(C1D2,Plus(m,Negate(C1)))),IntegerQ(Times(C1D2,n))))),
IIntegrate(3217,Int(Times(Power($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),m_),Power(Plus(a_,Times(b_DEFAULT,Power($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),4))),p_DEFAULT)),x_Symbol),
    Condition(With(List(Set($s("ff"),FreeFactors(Tan(Plus(e,Times(f,x))),x))),Dist(Times(Power($s("ff"),Plus(m,C1)),Power(f,-1)),Subst(Int(Times(Power(x,m),Power(Plus(a,Times(C2,a,Sqr($s("ff")),Sqr(x)),Times(Plus(a,b),Power($s("ff"),4),Power(x,4))),p),Power(Power(Plus(C1,Times(Sqr($s("ff")),Sqr(x))),Plus(Times(C1D2,m),Times(C2,p),C1)),-1)),x),x,Times(Tan(Plus(e,Times(f,x))),Power($s("ff"),-1))),x)),And(FreeQ(List(a,b,e,f),x),IntegerQ(Times(C1D2,m)),IntegerQ(p)))),
IIntegrate(3218,Int(Times(Power($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),m_),Power(Plus(a_,Times(b_DEFAULT,Power($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),n_))),p_DEFAULT)),x_Symbol),
    Condition(With(List(Set($s("ff"),FreeFactors(Tan(Plus(e,Times(f,x))),x))),Dist(Times(Power($s("ff"),Plus(m,C1)),Power(f,-1)),Subst(Int(Times(Power(x,m),Power(Plus(Times(a,Power(Plus(C1,Times(Sqr($s("ff")),Sqr(x))),Times(C1D2,n))),Times(b,Power($s("ff"),n),Power(x,n))),p),Power(Power(Plus(C1,Times(Sqr($s("ff")),Sqr(x))),Plus(Times(C1D2,m),Times(C1D2,n,p),C1)),-1)),x),x,Times(Tan(Plus(e,Times(f,x))),Power($s("ff"),-1))),x)),And(FreeQ(List(a,b,e,f),x),IntegerQ(Times(C1D2,m)),IntegerQ(Times(C1D2,n)),IntegerQ(p)))),
IIntegrate(3219,Int(Times(Power($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),m_),Power(Plus(a_,Times(b_DEFAULT,Power($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),4))),p_)),x_Symbol),
    Condition(With(List(Set($s("ff"),FreeFactors(Tan(Plus(e,Times(f,x))),x))),Dist(Times(Power($s("ff"),Plus(m,C1)),Power(Plus(a,Times(b,Power(Sin(Plus(e,Times(f,x))),4))),p),Power(Sqr(Sec(Plus(e,Times(f,x)))),Times(C2,p)),Power(Times(f,Power(Apart(Plus(Times(a,Sqr(Plus(C1,Sqr(Tan(Plus(e,Times(f,x))))))),Times(b,Power(Tan(Plus(e,Times(f,x))),4)))),p)),-1)),Subst(Int(Times(Power(x,m),Power(ExpandToSum(Plus(Times(a,Sqr(Plus(C1,Times(Sqr($s("ff")),Sqr(x))))),Times(b,Power($s("ff"),4),Power(x,4))),x),p),Power(Power(Plus(C1,Times(Sqr($s("ff")),Sqr(x))),Plus(Times(C1D2,m),Times(C2,p),C1)),-1)),x),x,Times(Tan(Plus(e,Times(f,x))),Power($s("ff"),-1))),x)),And(FreeQ(List(a,b,e,f,p),x),IntegerQ(Times(C1D2,m)),IntegerQ(Plus(p,Negate(C1D2)))))),
IIntegrate(3220,Int(Times(Power($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),n_))),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandTrig(Times(Power($($s("§sin"),Plus(e,Times(f,x))),m),Power(Plus(a,Times(b,Power($($s("§sin"),Plus(e,Times(f,x))),n))),p)),x),x),And(FreeQ(List(a,b,e,f),x),IntegersQ(m,p),Or(EqQ(n,C4),GtQ(p,C0),And(EqQ(p,CN1),IntegerQ(n)))))),
IIntegrate(3221,Int(Times(Power(Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(Times(c_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_))),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandTrig(Times(Power(Times(d,$($s("§sin"),Plus(e,Times(f,x)))),m),Power(Plus(a,Times(b,Power(Times(c,$($s("§sin"),Plus(e,Times(f,x)))),n))),p)),x),x),And(FreeQ(List(a,b,c,d,e,f,m,n),x),IGtQ(p,C0)))),
IIntegrate(3222,Int(Times(Power(Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(Times(c_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_))),p_DEFAULT)),x_Symbol),
    Condition(Unintegrable(Times(Power(Times(d,Sin(Plus(e,Times(f,x)))),m),Power(Plus(a,Times(b,Power(Times(c,Sin(Plus(e,Times(f,x)))),n))),p)),x),FreeQ(List(a,b,c,d,e,f,m,n,p),x))),
IIntegrate(3223,Int(Times(Power($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(Times(c_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_))),p_DEFAULT)),x_Symbol),
    Condition(With(List(Set($s("ff"),FreeFactors(Sin(Plus(e,Times(f,x))),x))),Dist(Times($s("ff"),Power(f,-1)),Subst(Int(Times(Power(Plus(C1,Times(CN1,Sqr($s("ff")),Sqr(x))),Times(C1D2,Plus(m,Negate(C1)))),Power(Plus(a,Times(b,Power(Times(c,$s("ff"),x),n))),p)),x),x,Times(Sin(Plus(e,Times(f,x))),Power($s("ff"),-1))),x)),And(FreeQ(List(a,b,c,e,f,n,p),x),IntegerQ(Times(C1D2,Plus(m,Negate(C1)))),Or(EqQ(n,C4),GtQ(m,C0),IGtQ(p,C0),IntegersQ(m,p))))),
IIntegrate(3224,Int(Times(Power($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),m_),Power(Plus(a_,Times(b_DEFAULT,Power($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),4))),p_DEFAULT)),x_Symbol),
    Condition(With(List(Set($s("ff"),FreeFactors(Tan(Plus(e,Times(f,x))),x))),Dist(Times($s("ff"),Power(f,-1)),Subst(Int(Times(Power(Plus(a,Times(C2,a,Sqr($s("ff")),Sqr(x)),Times(Plus(a,b),Power($s("ff"),4),Power(x,4))),p),Power(Power(Plus(C1,Times(Sqr($s("ff")),Sqr(x))),Plus(Times(C1D2,m),Times(C2,p),C1)),-1)),x),x,Times(Tan(Plus(e,Times(f,x))),Power($s("ff"),-1))),x)),And(FreeQ(List(a,b,e,f),x),IntegerQ(Times(C1D2,m)),IntegerQ(p)))),
IIntegrate(3225,Int(Times(Power($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),m_),Power(Plus(a_,Times(b_DEFAULT,Power($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),n_))),p_DEFAULT)),x_Symbol),
    Condition(With(List(Set($s("ff"),FreeFactors(Tan(Plus(e,Times(f,x))),x))),Dist(Times($s("ff"),Power(f,-1)),Subst(Int(Times(Power(Plus(Times(b,Power($s("ff"),n),Power(x,n)),Times(a,Power(Plus(C1,Times(Sqr($s("ff")),Sqr(x))),Times(C1D2,n)))),p),Power(Power(Plus(C1,Times(Sqr($s("ff")),Sqr(x))),Plus(Times(C1D2,m),Times(C1D2,n,p),C1)),-1)),x),x,Times(Tan(Plus(e,Times(f,x))),Power($s("ff"),-1))),x)),And(FreeQ(List(a,b,e,f),x),IntegerQ(Times(C1D2,m)),IntegerQ(Times(C1D2,n)),IntegerQ(p)))),
IIntegrate(3226,Int(Times(Power($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),m_),Power(Plus(a_,Times(b_DEFAULT,Power($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),n_))),-1)),x_Symbol),
    Condition(Int(Expand(Times(Power(Plus(C1,Negate(Sqr(Sin(Plus(e,Times(f,x)))))),Times(C1D2,m)),Power(Plus(a,Times(b,Power(Sin(Plus(e,Times(f,x))),n))),-1)),x),x),And(FreeQ(List(a,b,e,f),x),IGtQ(Times(C1D2,m),C0),IntegerQ(Times(C1D2,Plus(n,Negate(C1))))))),
IIntegrate(3227,Int(Times(Power(Times($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(Times(c_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_))),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandTrig(Times(Power(Times(d,$($s("§cos"),Plus(e,Times(f,x)))),m),Power(Plus(a,Times(b,Power(Times(c,$($s("§sin"),Plus(e,Times(f,x)))),n))),p)),x),x),And(FreeQ(List(a,b,c,d,e,f,m,n),x),IGtQ(p,C0)))),
IIntegrate(3228,Int(Times(Power(Times($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(Times(c_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_))),p_DEFAULT)),x_Symbol),
    Condition(Unintegrable(Times(Power(Times(d,Cos(Plus(e,Times(f,x)))),m),Power(Plus(a,Times(b,Power(Times(c,Sin(Plus(e,Times(f,x)))),n))),p)),x),FreeQ(List(a,b,c,d,e,f,m,n,p),x))),
IIntegrate(3229,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),n_))),p_DEFAULT),Power($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),m_DEFAULT)),x_Symbol),
    Condition(With(List(Set($s("ff"),FreeFactors(Sqr(Sin(Plus(e,Times(f,x)))),x))),Dist(Times(Power($s("ff"),Times(C1D2,Plus(m,C1))),Power(Times(C2,f),-1)),Subst(Int(Times(Power(x,Times(C1D2,Plus(m,Negate(C1)))),Power(Plus(a,Times(b,Power($s("ff"),Times(C1D2,n)),Power(x,Times(C1D2,n)))),p),Power(Power(Plus(C1,Times(CN1,$s("ff"),x)),Times(C1D2,Plus(m,C1))),-1)),x),x,Times(Sqr(Sin(Plus(e,Times(f,x)))),Power($s("ff"),-1))),x)),And(FreeQ(List(a,b,e,f,p),x),IntegerQ(Times(C1D2,Plus(m,Negate(C1)))),IntegerQ(Times(C1D2,n))))),
IIntegrate(3230,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(Times(c_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_))),p_DEFAULT),Power($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),m_DEFAULT)),x_Symbol),
    Condition(With(List(Set($s("ff"),FreeFactors(Sin(Plus(e,Times(f,x))),x))),Dist(Times(Power($s("ff"),Plus(m,C1)),Power(f,-1)),Subst(Int(Times(Power(x,m),Power(Plus(a,Times(b,Power(Times(c,$s("ff"),x),n))),p),Power(Power(Plus(C1,Times(CN1,Sqr($s("ff")),Sqr(x))),Times(C1D2,Plus(m,C1))),-1)),x),x,Times(Sin(Plus(e,Times(f,x))),Power($s("ff"),-1))),x)),And(FreeQ(List(a,b,c,e,f,n,p),x),ILtQ(Times(C1D2,Plus(m,Negate(C1))),C0)))),
IIntegrate(3231,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),4))),p_DEFAULT),Power(Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_)),x_Symbol),
    Condition(With(List(Set($s("ff"),FreeFactors(Tan(Plus(e,Times(f,x))),x))),Dist(Times($s("ff"),Power(f,-1)),Subst(Int(Times(Power(Times(d,$s("ff"),x),m),Power(ExpandToSum(Plus(Times(a,Sqr(Plus(C1,Times(Sqr($s("ff")),Sqr(x))))),Times(b,Power($s("ff"),4),Power(x,4))),x),p),Power(Power(Plus(C1,Times(Sqr($s("ff")),Sqr(x))),Plus(Times(C2,p),C1)),-1)),x),x,Times(Tan(Plus(e,Times(f,x))),Power($s("ff"),-1))),x)),And(FreeQ(List(a,b,d,e,f,m),x),IntegerQ(p)))),
IIntegrate(3232,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),4))),p_),Power(Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_)),x_Symbol),
    Condition(With(List(Set($s("ff"),FreeFactors(Tan(Plus(e,Times(f,x))),x))),Dist(Times($s("ff"),Power(Plus(a,Times(b,Power(Sin(Plus(e,Times(f,x))),4))),p),Power(Sqr(Sec(Plus(e,Times(f,x)))),Times(C2,p)),Power(Times(f,Power(Apart(Plus(Times(a,Sqr(Plus(C1,Sqr(Tan(Plus(e,Times(f,x))))))),Times(b,Power(Tan(Plus(e,Times(f,x))),4)))),p)),-1)),Subst(Int(Times(Power(Times(d,$s("ff"),x),m),Power(ExpandToSum(Plus(Times(a,Sqr(Plus(C1,Times(Sqr($s("ff")),Sqr(x))))),Times(b,Power($s("ff"),4),Power(x,4))),x),p),Power(Power(Plus(C1,Times(Sqr($s("ff")),Sqr(x))),Plus(Times(C2,p),C1)),-1)),x),x,Times(Tan(Plus(e,Times(f,x))),Power($s("ff"),-1))),x)),And(FreeQ(List(a,b,d,e,f,m),x),IntegerQ(Plus(p,Negate(C1D2)))))),
IIntegrate(3233,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),n_))),p_DEFAULT),Power(Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_)),x_Symbol),
    Condition(With(List(Set($s("ff"),FreeFactors(Tan(Plus(e,Times(f,x))),x))),Dist(Times(Power($s("ff"),Plus(m,C1)),Power(f,-1)),Subst(Int(Times(Power(Times(d,x),m),Power(Plus(Times(b,Power($s("ff"),n),Power(x,n)),Times(a,Power(Plus(C1,Times(Sqr($s("ff")),Sqr(x))),Times(C1D2,n)))),p),Power(Power(Plus(C1,Times(Sqr($s("ff")),Sqr(x))),Plus(Times(C1D2,n,p),C1)),-1)),x),x,Times(Tan(Plus(e,Times(f,x))),Power($s("ff"),-1))),x)),And(FreeQ(List(a,b,d,e,f,m),x),IntegerQ(Times(C1D2,n)),IGtQ(p,C0)))),
IIntegrate(3234,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(Times(c_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_))),p_DEFAULT),Power(Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_DEFAULT)),x_Symbol),
    Condition(Int(ExpandTrig(Times(Power(Times(d,$($s("§tan"),Plus(e,Times(f,x)))),m),Power(Plus(a,Times(b,Power(Times(c,$($s("§sin"),Plus(e,Times(f,x)))),n))),p)),x),x),And(FreeQ(List(a,b,c,d,e,f,m,n),x),IGtQ(p,C0)))),
IIntegrate(3235,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(Times(c_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_))),p_DEFAULT),Power(Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_DEFAULT)),x_Symbol),
    Condition(Unintegrable(Times(Power(Plus(a,Times(b,Power(Times(c,Sin(Plus(e,Times(f,x)))),n))),p),Power(Times(d,Tan(Plus(e,Times(f,x)))),m)),x),FreeQ(List(a,b,c,d,e,f,m,n,p),x))),
IIntegrate(3236,Int(Times(Power(Times($($s("§cot"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),m_),Power(Plus(a_,Times(b_DEFAULT,Power(Times(c_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_))),p_)),x_Symbol),
    Condition(Dist(Times(Power(Times(d,Cot(Plus(e,Times(f,x)))),FracPart(m)),Power(Times(Tan(Plus(e,Times(f,x))),Power(d,-1)),FracPart(m))),Int(Times(Power(Plus(a,Times(b,Power(Times(c,Sin(Plus(e,Times(f,x)))),n))),p),Power(Power(Times(Tan(Plus(e,Times(f,x))),Power(d,-1)),m),-1)),x),x),And(FreeQ(List(a,b,c,d,e,f,m,n,p),x),Not(IntegerQ(m))))),
IIntegrate(3237,Int(Times(Power(Times(d_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_),Power(Plus(a_,Times(b_DEFAULT,Power(Times(c_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_))),p_)),x_Symbol),
    Condition(Dist(Times(Power(Times(d,Sec(Plus(e,Times(f,x)))),FracPart(m)),Power(Times(Cos(Plus(e,Times(f,x))),Power(d,-1)),FracPart(m))),Int(Times(Power(Plus(a,Times(b,Power(Times(c,Sin(Plus(e,Times(f,x)))),n))),p),Power(Power(Times(Cos(Plus(e,Times(f,x))),Power(d,-1)),m),-1)),x),x),And(FreeQ(List(a,b,c,d,e,f,m,n,p),x),Not(IntegerQ(m))))),
IIntegrate(3238,Int(Times(Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),m_),Power(Plus(a_,Times(b_DEFAULT,Power($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),n_DEFAULT))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Power(d,Times(n,p)),Int(Times(Power(Times(d,Csc(Plus(e,Times(f,x)))),Plus(m,Times(CN1,n,p))),Power(Plus(b,Times(a,Power(Csc(Plus(e,Times(f,x))),n))),p)),x),x),And(FreeQ(List(a,b,d,e,f,m,n,p),x),Not(IntegerQ(m)),IntegersQ(n,p)))),
IIntegrate(3239,Int(Times(Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),m_),Power(Plus(a_,Times(b_DEFAULT,Power(Times(c_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_))),p_)),x_Symbol),
    Condition(Dist(Times(Power(Times(d,Csc(Plus(e,Times(f,x)))),FracPart(m)),Power(Times(Sin(Plus(e,Times(f,x))),Power(d,-1)),FracPart(m))),Int(Times(Power(Plus(a,Times(b,Power(Times(c,Sin(Plus(e,Times(f,x)))),n))),p),Power(Power(Times(Sin(Plus(e,Times(f,x))),Power(d,-1)),m),-1)),x),x),And(FreeQ(List(a,b,c,d,e,f,m,n,p),x),Not(IntegerQ(m))))),
IIntegrate(3240,Int(Times(Power($($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_),Power(Plus(Times(Power($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),p_),b_DEFAULT),a_,Times(c_DEFAULT,Power($($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),q_))),n_)),x_Symbol),
    Condition(Module(List(Set(f,FreeFactors(Cot(Plus(d,Times(e,x))),x))),Negate(Dist(Times(f,Power(e,-1)),Subst(Int(Times(Power(ExpandToSum(Plus(c,Times(b,Power(Plus(C1,Times(Sqr(f),Sqr(x))),Plus(Times(C1D2,q),Times(CN1,C1D2,p)))),Times(a,Power(Plus(C1,Times(Sqr(f),Sqr(x))),Times(C1D2,q)))),x),n),Power(Power(Plus(C1,Times(Sqr(f),Sqr(x))),Plus(Times(C1D2,m),Times(C1D2,n,q),C1)),-1)),x),x,Times(Cot(Plus(d,Times(e,x))),Power(f,-1))),x))),And(FreeQ(List(a,b,c,d,e),x),IntegerQ(Times(C1D2,m)),IntegerQ(Times(C1D2,p)),IntegerQ(Times(C1D2,q)),IntegerQ(n),GtQ(p,C0),LeQ(p,q)))),
IIntegrate(3241,Int(Times(Power($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_),Power(Plus(Times(Power($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),q_),c_DEFAULT),a_,Times(b_DEFAULT,Power($($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),p_))),n_)),x_Symbol),
    Condition(Module(List(Set(f,FreeFactors(Tan(Plus(d,Times(e,x))),x))),Dist(Times(f,Power(e,-1)),Subst(Int(Times(Power(ExpandToSum(Plus(c,Times(b,Power(Plus(C1,Times(Sqr(f),Sqr(x))),Plus(Times(C1D2,q),Times(CN1,C1D2,p)))),Times(a,Power(Plus(C1,Times(Sqr(f),Sqr(x))),Times(C1D2,q)))),x),n),Power(Power(Plus(C1,Times(Sqr(f),Sqr(x))),Plus(Times(C1D2,m),Times(C1D2,n,q),C1)),-1)),x),x,Times(Tan(Plus(d,Times(e,x))),Power(f,-1))),x)),And(FreeQ(List(a,b,c,d,e),x),IntegerQ(Times(C1D2,m)),IntegerQ(Times(C1D2,p)),IntegerQ(Times(C1D2,q)),IntegerQ(n),GtQ(p,C0),LeQ(p,q)))),
IIntegrate(3242,Int(Times(Power($($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_),Power(Plus(Times(Power($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),p_),b_DEFAULT),a_,Times(c_DEFAULT,Power($($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),q_))),n_)),x_Symbol),
    Condition(Module(List(Set(f,FreeFactors(Cot(Plus(d,Times(e,x))),x))),Negate(Dist(Times(f,Power(e,-1)),Subst(Int(Times(Power(ExpandToSum(Plus(Times(a,Power(Plus(C1,Times(Sqr(f),Sqr(x))),Times(C1D2,p))),Times(b,Power(f,p),Power(x,p)),Times(c,Power(Plus(C1,Times(Sqr(f),Sqr(x))),Plus(Times(C1D2,p),Times(CN1,C1D2,q))))),x),n),Power(Power(Plus(C1,Times(Sqr(f),Sqr(x))),Plus(Times(C1D2,m),Times(C1D2,n,p),C1)),-1)),x),x,Times(Cot(Plus(d,Times(e,x))),Power(f,-1))),x))),And(FreeQ(List(a,b,c,d,e),x),IntegerQ(Times(C1D2,m)),IntegerQ(Times(C1D2,p)),IntegerQ(Times(C1D2,q)),IntegerQ(n),LtQ(C0,q,p)))),
IIntegrate(3243,Int(Times(Power($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_),Power(Plus(Times(Power($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),q_),c_DEFAULT),a_,Times(b_DEFAULT,Power($($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),p_))),n_)),x_Symbol),
    Condition(Module(List(Set(f,FreeFactors(Tan(Plus(d,Times(e,x))),x))),Dist(Times(f,Power(e,-1)),Subst(Int(Times(Power(ExpandToSum(Plus(Times(a,Power(Plus(C1,Times(Sqr(f),Sqr(x))),Times(C1D2,p))),Times(b,Power(f,p),Power(x,p)),Times(c,Power(Plus(C1,Times(Sqr(f),Sqr(x))),Plus(Times(C1D2,p),Times(CN1,C1D2,q))))),x),n),Power(Power(Plus(C1,Times(Sqr(f),Sqr(x))),Plus(Times(C1D2,m),Times(C1D2,n,p),C1)),-1)),x),x,Times(Tan(Plus(d,Times(e,x))),Power(f,-1))),x)),And(FreeQ(List(a,b,c,d,e),x),IntegerQ(Times(C1D2,m)),IntegerQ(Times(C1D2,p)),IntegerQ(Times(C1D2,q)),IntegerQ(n),LtQ(C0,q,p)))),
IIntegrate(3244,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power($($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT)),Times(c_DEFAULT,Power($($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2",true)))),p_DEFAULT),x_Symbol),
    Condition(Dist(Power(Times(Power(C4,p),Power(c,p)),-1),Int(Power(Plus(b,Times(C2,c,Power(Sin(Plus(d,Times(e,x))),n))),Times(C2,p)),x),x),And(FreeQ(List(a,b,c,d,e,n),x),EqQ($s("n2"),Times(C2,n)),EqQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),IntegerQ(p)))),
IIntegrate(3245,Int(Power(Plus(a_DEFAULT,Times(Power($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT),b_DEFAULT),Times(Power($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2",true)),c_DEFAULT)),p_DEFAULT),x_Symbol),
    Condition(Dist(Power(Times(Power(C4,p),Power(c,p)),-1),Int(Power(Plus(b,Times(C2,c,Power(Cos(Plus(d,Times(e,x))),n))),Times(C2,p)),x),x),And(FreeQ(List(a,b,c,d,e,n),x),EqQ($s("n2"),Times(C2,n)),EqQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),IntegerQ(p)))),
IIntegrate(3246,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power($($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT)),Times(c_DEFAULT,Power($($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2",true)))),p_),x_Symbol),
    Condition(Dist(Times(Power(Plus(a,Times(b,Power(Sin(Plus(d,Times(e,x))),n)),Times(c,Power(Sin(Plus(d,Times(e,x))),Times(C2,n)))),p),Power(Power(Plus(b,Times(C2,c,Power(Sin(Plus(d,Times(e,x))),n))),Times(C2,p)),-1)),Int(Times(u,Power(Plus(b,Times(C2,c,Power(Sin(Plus(d,Times(e,x))),n))),Times(C2,p))),x),x),And(FreeQ(List(a,b,c,d,e,n,p),x),EqQ($s("n2"),Times(C2,n)),EqQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),Not(IntegerQ(p))))),
IIntegrate(3247,Int(Power(Plus(a_DEFAULT,Times(Power($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT),b_DEFAULT),Times(Power($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2",true)),c_DEFAULT)),p_),x_Symbol),
    Condition(Dist(Times(Power(Plus(a,Times(b,Power(Cos(Plus(d,Times(e,x))),n)),Times(c,Power(Cos(Plus(d,Times(e,x))),Times(C2,n)))),p),Power(Power(Plus(b,Times(C2,c,Power(Cos(Plus(d,Times(e,x))),n))),Times(C2,p)),-1)),Int(Times(u,Power(Plus(b,Times(C2,c,Power(Cos(Plus(d,Times(e,x))),n))),Times(C2,p))),x),x),And(FreeQ(List(a,b,c,d,e,n,p),x),EqQ($s("n2"),Times(C2,n)),EqQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),Not(IntegerQ(p))))),
IIntegrate(3248,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power($($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT)),Times(c_DEFAULT,Power($($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2",true)))),-1),x_Symbol),
    Condition(Module(List(Set(q,Rt(Plus(Sqr(b),Times(CN1,C4,a,c)),C2))),Plus(Dist(Times(C2,c,Power(q,-1)),Int(Power(Plus(b,Negate(q),Times(C2,c,Power(Sin(Plus(d,Times(e,x))),n))),-1),x),x),Negate(Dist(Times(C2,c,Power(q,-1)),Int(Power(Plus(b,q,Times(C2,c,Power(Sin(Plus(d,Times(e,x))),n))),-1),x),x)))),And(FreeQ(List(a,b,c,d,e,n),x),EqQ($s("n2"),Times(C2,n)),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0)))),
IIntegrate(3249,Int(Power(Plus(a_DEFAULT,Times(Power($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT),b_DEFAULT),Times(Power($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2",true)),c_DEFAULT)),-1),x_Symbol),
    Condition(Module(List(Set(q,Rt(Plus(Sqr(b),Times(CN1,C4,a,c)),C2))),Plus(Dist(Times(C2,c,Power(q,-1)),Int(Power(Plus(b,Negate(q),Times(C2,c,Power(Cos(Plus(d,Times(e,x))),n))),-1),x),x),Negate(Dist(Times(C2,c,Power(q,-1)),Int(Power(Plus(b,q,Times(C2,c,Power(Cos(Plus(d,Times(e,x))),n))),-1),x),x)))),And(FreeQ(List(a,b,c,d,e,n),x),EqQ($s("n2"),Times(C2,n)),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0)))),
IIntegrate(3250,Int(Times(Power($($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power($($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT)),Times(c_DEFAULT,Power($($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2",true)))),p_)),x_Symbol),
    Condition(Dist(Power(Times(Power(C4,p),Power(c,p)),-1),Int(Times(Power(Sin(Plus(d,Times(e,x))),m),Power(Plus(b,Times(C2,c,Power(Sin(Plus(d,Times(e,x))),n))),Times(C2,p))),x),x),And(FreeQ(List(a,b,c,d,e,m,n),x),EqQ($s("n2"),Times(C2,n)),EqQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),IntegerQ(p))))
  );
}
