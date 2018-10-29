package org.matheclipse.core.integrate.rubi;


import org.matheclipse.core.interfaces.IAST;

import static org.matheclipse.core.expression.F.$p;
import static org.matheclipse.core.expression.F.$s;
import static org.matheclipse.core.expression.F.And;
import static org.matheclipse.core.expression.F.ArcTan;
import static org.matheclipse.core.expression.F.ArcTanh;
import static org.matheclipse.core.expression.F.C0;
import static org.matheclipse.core.expression.F.C1;
import static org.matheclipse.core.expression.F.C1D2;
import static org.matheclipse.core.expression.F.C2;
import static org.matheclipse.core.expression.F.C3;
import static org.matheclipse.core.expression.F.C4;
import static org.matheclipse.core.expression.F.CN1;
import static org.matheclipse.core.expression.F.CN1D2;
import static org.matheclipse.core.expression.F.Coefficient;
import static org.matheclipse.core.expression.F.Condition;
import static org.matheclipse.core.expression.F.Denominator;
import static org.matheclipse.core.expression.F.Floor;
import static org.matheclipse.core.expression.F.FreeQ;
import static org.matheclipse.core.expression.F.GCD;
import static org.matheclipse.core.expression.F.IIntegrate;
import static org.matheclipse.core.expression.F.IntegerQ;
import static org.matheclipse.core.expression.F.List;
import static org.matheclipse.core.expression.F.Log;
import static org.matheclipse.core.expression.F.MatchQ;
import static org.matheclipse.core.expression.F.Module;
import static org.matheclipse.core.expression.F.Negate;
import static org.matheclipse.core.expression.F.Not;
import static org.matheclipse.core.expression.F.Or;
import static org.matheclipse.core.expression.F.Plus;
import static org.matheclipse.core.expression.F.PolynomialQuotient;
import static org.matheclipse.core.expression.F.PolynomialRemainder;
import static org.matheclipse.core.expression.F.Power;
import static org.matheclipse.core.expression.F.QQ;
import static org.matheclipse.core.expression.F.QSymbol;
import static org.matheclipse.core.expression.F.ReplaceAll;
import static org.matheclipse.core.expression.F.Rule;
import static org.matheclipse.core.expression.F.Set;
import static org.matheclipse.core.expression.F.Simplify;
import static org.matheclipse.core.expression.F.Sqr;
import static org.matheclipse.core.expression.F.Sqrt;
import static org.matheclipse.core.expression.F.Sum;
import static org.matheclipse.core.expression.F.Times;
import static org.matheclipse.core.expression.F.With;
import static org.matheclipse.core.expression.F.a;
import static org.matheclipse.core.expression.F.a_;
import static org.matheclipse.core.expression.F.b;
import static org.matheclipse.core.expression.F.b_DEFAULT;
import static org.matheclipse.core.expression.F.c;
import static org.matheclipse.core.expression.F.c_DEFAULT;
import static org.matheclipse.core.expression.F.d;
import static org.matheclipse.core.expression.F.d_;
import static org.matheclipse.core.expression.F.d_DEFAULT;
import static org.matheclipse.core.expression.F.e;
import static org.matheclipse.core.expression.F.e_;
import static org.matheclipse.core.expression.F.e_DEFAULT;
import static org.matheclipse.core.expression.F.f;
import static org.matheclipse.core.expression.F.f_DEFAULT;
import static org.matheclipse.core.expression.F.g;
import static org.matheclipse.core.expression.F.g_DEFAULT;
import static org.matheclipse.core.expression.F.h;
import static org.matheclipse.core.expression.F.h_DEFAULT;
import static org.matheclipse.core.expression.F.i;
import static org.matheclipse.core.expression.F.j;
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
import static org.matheclipse.core.expression.F.r_DEFAULT;
import static org.matheclipse.core.expression.F.s;
import static org.matheclipse.core.expression.F.s_DEFAULT;
import static org.matheclipse.core.expression.F.u;
import static org.matheclipse.core.expression.F.u_;
import static org.matheclipse.core.expression.F.u_DEFAULT;
import static org.matheclipse.core.expression.F.v;
import static org.matheclipse.core.expression.F.v_;
import static org.matheclipse.core.expression.F.x;
import static org.matheclipse.core.expression.F.x_;
import static org.matheclipse.core.expression.F.x_Symbol;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Coeff;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Dist;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.EqQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.ExpandIntegrand;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.ExpandToSum;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Expon;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.FracPart;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.FractionQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.GeQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.IGtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.ILtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Int;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.IntPart;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.LinearPairQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.LinearQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.LtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.NeQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.NegQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.NiceSqrtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.PolyQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.PosQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.RationalFunctionExpand;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.RationalQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Rt;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Simp;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Subst;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.SubstFor;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Unintegrable;

/** 
 * IndefiniteIntegrationRules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class IntRules35 { 
  public static IAST RULES = List( 
IIntegrate(1751,Int(Times($p("§pq"),Power(Times(d_,x_),m_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(Dist(Times(Power(Times(d,x),m),Power(Power(x,m),-1)),Int(Times(Power(x,m),$s("§pq"),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p)),x),x),And(FreeQ(List(a,b,c,d,m,n,p),x),EqQ($s("n2"),Times(C2,n)),PolyQ($s("§pq"),Power(x,n)),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),IntegerQ(Simplify(Times(Plus(m,C1),Power(n,-1))))))),
IIntegrate(1752,Int(Times($p("§pq"),Power(Times(d_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_DEFAULT)),Times(c_DEFAULT,Power(x_,$p("n2",true)))),p_)),x_Symbol),
    Condition(Dist(Power(d,-1),Int(Times(Power(Times(d,x),Plus(m,C1)),PolynomialQuotient($s("§pq"),x,x),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p)),x),x),And(FreeQ(List(a,b,c,d,m,n,p),x),EqQ($s("n2"),Times(C2,n)),PolyQ($s("§pq"),x),EqQ(Coeff($s("§pq"),x,C0),C0)))),
IIntegrate(1753,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_DEFAULT)),Times(c_DEFAULT,Power(x_,$p("n2",true)))),QQ(-3L,2L)),Plus(e_,Times(f_DEFAULT,Power(x_,q_DEFAULT)),Times(g_DEFAULT,Power(x_,r_DEFAULT)),Times(h_DEFAULT,Power(x_,s_DEFAULT)))),x_Symbol),
    Condition(Negate(Simp(Times(Plus(Times(C2,c,Plus(Times(b,f),Times(CN1,C2,a,g))),Times(C2,h,Plus(Sqr(b),Times(CN1,C4,a,c)),Power(x,Times(C1D2,n))),Times(C2,c,Plus(Times(C2,c,f),Times(CN1,b,g)),Power(x,n))),Power(Times(c,n,Plus(Sqr(b),Times(CN1,C4,a,c)),Sqrt(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))))),-1)),x)),And(FreeQ(List(a,b,c,e,f,g,h,m,n),x),EqQ($s("n2"),Times(C2,n)),EqQ(q,Times(C1D2,n)),EqQ(r,Times(C1D2,C3,n)),EqQ(s,Times(C2,n)),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),EqQ(Plus(Times(C2,m),Negate(n),C2),C0),EqQ(Plus(Times(c,e),Times(a,h)),C0)))),
IIntegrate(1754,Int(Times(Power(Times(d_,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_DEFAULT)),Times(c_DEFAULT,Power(x_,$p("n2",true)))),QQ(-3L,2L)),Plus(e_,Times(f_DEFAULT,Power(x_,q_DEFAULT)),Times(g_DEFAULT,Power(x_,r_DEFAULT)),Times(h_DEFAULT,Power(x_,s_DEFAULT)))),x_Symbol),
    Condition(Dist(Times(Power(Times(d,x),m),Power(Power(x,m),-1)),Int(Times(Power(x,m),Plus(e,Times(f,Power(x,Times(C1D2,n))),Times(g,Power(x,Times(C1D2,C3,n))),Times(h,Power(x,Times(C2,n)))),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),QQ(-3L,2L))),x),x),And(FreeQ(List(a,b,c,d,e,f,g,h,m,n),x),EqQ($s("n2"),Times(C2,n)),EqQ(q,Times(C1D2,n)),EqQ(r,Times(C1D2,C3,n)),EqQ(s,Times(C2,n)),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),EqQ(Plus(Times(C2,m),Negate(n),C2),C0),EqQ(Plus(Times(c,e),Times(a,h)),C0)))),
IIntegrate(1755,Int(Times($p("§pq"),Power(x_,m_),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_)),Times(c_DEFAULT,Power(x_,$p("n2")))),p_)),x_Symbol),
    Condition(Module(List(Set(q,Expon($s("§pq"),x))),Condition(Module(List(Set(QSymbol,PolynomialQuotient(Times(a,Power(Times(b,c),Plus(Floor(Times(Plus(q,Negate(C1)),Power(n,-1))),C1)),Power(x,m),$s("§pq")),Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),x)),Set($s("R"),PolynomialRemainder(Times(a,Power(Times(b,c),Plus(Floor(Times(Plus(q,Negate(C1)),Power(n,-1))),C1)),Power(x,m),$s("§pq")),Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),x)),i),Plus(Dist(Power(Times(a,n,Plus(p,C1),Plus(Sqr(b),Times(CN1,C4,a,c)),Power(Times(b,c),Plus(Floor(Times(Plus(q,Negate(C1)),Power(n,-1))),C1))),-1),Int(Times(Power(x,m),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1)),ExpandToSum(Plus(Times(n,Plus(p,C1),Plus(Sqr(b),Times(CN1,C4,a,c)),QSymbol,Power(Power(x,m),-1)),Sum(Plus(Times(Plus(Times(Plus(Times(Sqr(b),Plus(Times(n,Plus(p,C1)),i,C1),Power(a,-1)),Times(CN1,C2,c,Plus(Times(C2,n,Plus(p,C1)),i,C1))),Coeff($s("R"),x,i)),Times(CN1,b,Plus(i,C1),Coeff($s("R"),x,Plus(n,i)))),Power(x,Plus(i,Negate(m)))),Times(c,Plus(Times(n,Plus(Times(C2,p),C3)),i,C1),Plus(Times(b,Coeff($s("R"),x,i),Power(a,-1)),Times(CN1,C2,Coeff($s("R"),x,Plus(n,i)))),Power(x,Plus(n,i,Negate(m))))),List(i,C0,Plus(n,Negate(C1))))),x)),x),x),Negate(Simp(Times(x,Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1)),Sum(Plus(Times(Plus(Times(Plus(Sqr(b),Times(CN1,C2,a,c)),Coeff($s("R"),x,i)),Times(CN1,a,b,Coeff($s("R"),x,Plus(n,i)))),Power(x,i)),Times(c,Plus(Times(b,Coeff($s("R"),x,i)),Times(CN1,C2,a,Coeff($s("R"),x,Plus(n,i)))),Power(x,Plus(n,i)))),List(i,C0,Plus(n,Negate(C1)))),Power(Times(Sqr(a),n,Plus(p,C1),Plus(Sqr(b),Times(CN1,C4,a,c)),Power(Times(b,c),Plus(Floor(Times(Plus(q,Negate(C1)),Power(n,-1))),C1))),-1)),x)))),GeQ(q,Times(C2,n)))),And(FreeQ(List(a,b,c),x),EqQ($s("n2"),Times(C2,n)),PolyQ($s("§pq"),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),IGtQ(n,C0),LtQ(p,CN1),ILtQ(m,C0)))),
IIntegrate(1756,Int(Times($p("§pq"),Power(x_,m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_)),Times(c_DEFAULT,Power(x_,$p("n2")))),p_)),x_Symbol),
    Condition(With(List(Set(g,GCD(Plus(m,C1),n))),Condition(Dist(Power(g,-1),Subst(Int(Times(Power(x,Plus(Times(Plus(m,C1),Power(g,-1)),Negate(C1))),ReplaceAll($s("§pq"),Rule(x,Power(x,Power(g,-1)))),Power(Plus(a,Times(b,Power(x,Times(n,Power(g,-1)))),Times(c,Power(x,Times(C2,n,Power(g,-1))))),p)),x),x,Power(x,g)),x),NeQ(g,C1))),And(FreeQ(List(a,b,c,p),x),EqQ($s("n2"),Times(C2,n)),PolyQ($s("§pq"),Power(x,n)),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),IGtQ(n,C0),IntegerQ(m)))),
IIntegrate(1757,Int(Times($p("§pq"),Power(Times(d_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_DEFAULT)),Times(c_DEFAULT,Power(x_,$p("n2")))),-1)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Times(d,x),m),$s("§pq"),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),-1)),x),x),And(FreeQ(List(a,b,c,d,m),x),EqQ($s("n2"),Times(C2,n)),PolyQ($s("§pq"),Power(x,n)),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),IGtQ(n,C0),NiceSqrtQ(Plus(Sqr(b),Times(CN1,C4,a,c)))))),
IIntegrate(1758,Int(Times($p("§pq"),Power(Times(d_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_DEFAULT)),Times(c_DEFAULT,Power(x_,$p("n2")))),p_)),x_Symbol),
    Condition(With(List(Set(q,Expon($s("§pq"),x))),Condition(With(List(Set($s("§pqq"),Coeff($s("§pq"),x,q))),Plus(Int(Times(Power(Times(d,x),m),ExpandToSum(Plus($s("§pq"),Times(CN1,$s("§pqq"),Power(x,q)),Times(CN1,$s("§pqq"),Plus(Times(a,Plus(m,q,Times(CN1,C2,n),C1),Power(x,Plus(q,Times(CN1,C2,n)))),Times(b,Plus(m,q,Times(n,Plus(p,Negate(C1))),C1),Power(x,Plus(q,Negate(n))))),Power(Times(c,Plus(m,q,Times(C2,n,p),C1)),-1))),x),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p)),x),Simp(Times($s("§pqq"),Power(Times(d,x),Plus(m,q,Times(CN1,C2,n),C1)),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1)),Power(Times(c,Power(d,Plus(q,Times(CN1,C2,n),C1)),Plus(m,q,Times(C2,n,p),C1)),-1)),x))),And(GeQ(q,Times(C2,n)),NeQ(Plus(m,q,Times(C2,n,p),C1),C0),Or(IntegerQ(Times(C2,p)),And(EqQ(n,C1),IntegerQ(Times(C4,p))),IntegerQ(Plus(p,Times(Plus(q,C1),Power(Times(C2,n),-1)))))))),And(FreeQ(List(a,b,c,d,m,p),x),EqQ($s("n2"),Times(C2,n)),PolyQ($s("§pq"),Power(x,n)),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),IGtQ(n,C0)))),
IIntegrate(1759,Int(Times($p("§pq"),Power(Times(d_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_)),Times(c_DEFAULT,Power(x_,$p("n2")))),p_)),x_Symbol),
    Condition(Module(List(Set(q,Expon($s("§pq"),x)),j,k),Int(Sum(Times(C1,Power(Times(d,x),Plus(m,j)),Sum(Times(Coeff($s("§pq"),x,Plus(j,Times(k,n))),Power(x,Times(k,n))),List(k,C0,Plus(Times(Plus(q,Negate(j)),Power(n,-1)),C1))),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p),Power(Power(d,j),-1)),List(j,C0,Plus(n,Negate(C1)))),x)),And(FreeQ(List(a,b,c,d,m,p),x),EqQ($s("n2"),Times(C2,n)),PolyQ($s("§pq"),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),IGtQ(n,C0),Not(PolyQ($s("§pq"),Power(x,n)))))),
IIntegrate(1760,Int(Times($p("§pq"),Power(Times(d_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_DEFAULT)),Times(c_DEFAULT,Power(x_,$p("n2",true)))),-1)),x_Symbol),
    Condition(Int(RationalFunctionExpand(Times(Power(Times(d,x),m),$s("§pq"),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),-1)),x),x),And(FreeQ(List(a,b,c,d,m),x),EqQ($s("n2"),Times(C2,n)),PolyQ($s("§pq"),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),IGtQ(n,C0)))),
IIntegrate(1761,Int(Times($p("§pq"),Power(x_,m_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(With(List(Set(q,Expon($s("§pq"),x))),Negate(Subst(Int(Times(ExpandToSum(Times(Power(x,q),ReplaceAll($s("§pq"),Rule(x,Power(x,-1)))),x),Power(Plus(a,Times(b,Power(Power(x,n),-1)),Times(c,Power(Power(x,Times(C2,n)),-1))),p),Power(Power(x,Plus(m,q,C2)),-1)),x),x,Power(x,-1)))),And(FreeQ(List(a,b,c,p),x),EqQ($s("n2"),Times(C2,n)),PolyQ($s("§pq"),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),ILtQ(n,C0),IntegerQ(m)))),
IIntegrate(1762,Int(Times($p("§pq"),Power(Times(d_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(With(List(Set(g,Denominator(m)),Set(q,Expon($s("§pq"),x))),Negate(Dist(Times(g,Power(d,-1)),Subst(Int(Times(ExpandToSum(Times(Power(x,Times(g,q)),ReplaceAll($s("§pq"),Rule(x,Power(Times(d,Power(x,g)),-1)))),x),Power(Plus(a,Times(b,Power(Times(Power(d,n),Power(x,Times(g,n))),-1)),Times(c,Power(Times(Power(d,Times(C2,n)),Power(x,Times(C2,g,n))),-1))),p),Power(Power(x,Plus(Times(g,Plus(m,q,C1)),C1)),-1)),x),x,Power(Power(Times(d,x),Power(g,-1)),-1)),x))),And(FreeQ(List(a,b,c,d,p),x),EqQ($s("n2"),Times(C2,n)),PolyQ($s("§pq"),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),ILtQ(n,C0),FractionQ(m)))),
IIntegrate(1763,Int(Times($p("§pq"),Power(Times(d_DEFAULT,x_),m_),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(With(List(Set(q,Expon($s("§pq"),x))),Negate(Dist(Times(Power(Times(d,x),m),Power(Power(x,-1),m)),Subst(Int(Times(ExpandToSum(Times(Power(x,q),ReplaceAll($s("§pq"),Rule(x,Power(x,-1)))),x),Power(Plus(a,Times(b,Power(Power(x,n),-1)),Times(c,Power(Power(x,Times(C2,n)),-1))),p),Power(Power(x,Plus(m,q,C2)),-1)),x),x,Power(x,-1)),x))),And(FreeQ(List(a,b,c,d,m,p),x),EqQ($s("n2"),Times(C2,n)),PolyQ($s("§pq"),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),ILtQ(n,C0),Not(RationalQ(m))))),
IIntegrate(1764,Int(Times($p("§pq"),Power(x_,m_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(With(List(Set(g,Denominator(n))),Dist(g,Subst(Int(Times(Power(x,Plus(Times(g,Plus(m,C1)),Negate(C1))),ReplaceAll($s("§pq"),Rule(x,Power(x,g))),Power(Plus(a,Times(b,Power(x,Times(g,n))),Times(c,Power(x,Times(C2,g,n)))),p)),x),x,Power(x,Power(g,-1))),x)),And(FreeQ(List(a,b,c,m,p),x),EqQ($s("n2"),Times(C2,n)),PolyQ($s("§pq"),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),FractionQ(n)))),
IIntegrate(1765,Int(Times($p("§pq"),Power(Times(d_,x_),m_),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(Dist(Times(Power(d,Plus(m,Negate(C1D2))),Sqrt(Times(d,x)),Power(x,CN1D2)),Int(Times(Power(x,m),$s("§pq"),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p)),x),x),And(FreeQ(List(a,b,c,d,p),x),EqQ($s("n2"),Times(C2,n)),PolyQ($s("§pq"),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),FractionQ(n),IGtQ(Plus(m,C1D2),C0)))),
IIntegrate(1766,Int(Times($p("§pq"),Power(Times(d_,x_),m_),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(Dist(Times(Power(d,Plus(m,C1D2)),Sqrt(x),Power(Times(d,x),CN1D2)),Int(Times(Power(x,m),$s("§pq"),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p)),x),x),And(FreeQ(List(a,b,c,d,p),x),EqQ($s("n2"),Times(C2,n)),PolyQ($s("§pq"),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),FractionQ(n),ILtQ(Plus(m,Negate(C1D2)),C0)))),
IIntegrate(1767,Int(Times($p("§pq"),Power(Times(d_,x_),m_),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(Dist(Times(Power(Times(d,x),m),Power(Power(x,m),-1)),Int(Times(Power(x,m),$s("§pq"),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p)),x),x),And(FreeQ(List(a,b,c,d,m,p),x),EqQ($s("n2"),Times(C2,n)),PolyQ($s("§pq"),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),FractionQ(n)))),
IIntegrate(1768,Int(Times($p("§pq"),Power(x_,m_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(Dist(Power(Plus(m,C1),-1),Subst(Int(Times(ReplaceAll(SubstFor(Power(x,n),$s("§pq"),x),Rule(x,Power(x,Simplify(Times(n,Power(Plus(m,C1),-1)))))),Power(Plus(a,Times(b,Power(x,Simplify(Times(n,Power(Plus(m,C1),-1))))),Times(c,Power(x,Simplify(Times(C2,n,Power(Plus(m,C1),-1)))))),p)),x),x,Power(x,Plus(m,C1))),x),And(FreeQ(List(a,b,c,m,n,p),x),EqQ($s("n2"),Times(C2,n)),PolyQ($s("§pq"),Power(x,n)),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),IntegerQ(Simplify(Times(n,Power(Plus(m,C1),-1)))),Not(IntegerQ(n))))),
IIntegrate(1769,Int(Times($p("§pq"),Power(Times(d_,x_),m_),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(Dist(Times(Power(Times(d,x),m),Power(Power(x,m),-1)),Int(Times(Power(x,m),$s("§pq"),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p)),x),x),And(FreeQ(List(a,b,c,d,m,p),x),EqQ($s("n2"),Times(C2,n)),PolyQ($s("§pq"),Power(x,n)),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),IntegerQ(Simplify(Times(n,Power(Plus(m,C1),-1)))),Not(IntegerQ(n))))),
IIntegrate(1770,Int(Times($p("§pq"),Power(Times(d_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_DEFAULT)),Times(c_DEFAULT,Power(x_,$p("n2",true)))),-1)),x_Symbol),
    Condition(With(List(Set(q,Rt(Plus(Sqr(b),Times(CN1,C4,a,c)),C2))),Plus(Dist(Times(C2,c,Power(q,-1)),Int(Times(Power(Times(d,x),m),$s("§pq"),Power(Plus(b,Negate(q),Times(C2,c,Power(x,n))),-1)),x),x),Negate(Dist(Times(C2,c,Power(q,-1)),Int(Times(Power(Times(d,x),m),$s("§pq"),Power(Plus(b,q,Times(C2,c,Power(x,n))),-1)),x),x)))),And(FreeQ(List(a,b,c,d,m,n),x),EqQ($s("n2"),Times(C2,n)),PolyQ($s("§pq"),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0)))),
IIntegrate(1771,Int(Times($p("§pq"),Power(Times(d_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_DEFAULT)),Times(c_DEFAULT,Power(x_,$p("n2",true)))),p_)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Times(d,x),m),$s("§pq"),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p)),x),x),And(FreeQ(List(a,b,c,d,m,n),x),EqQ($s("n2"),Times(C2,n)),PolyQ($s("§pq"),x),ILtQ(Plus(p,C1),C0)))),
IIntegrate(1772,Int(Times($p("§pq"),Power(Times(d_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_DEFAULT)),Times(c_DEFAULT,Power(x_,$p("n2",true)))),p_DEFAULT)),x_Symbol),
    Condition(Unintegrable(Times($s("§pq"),Power(Times(d,x),m),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p)),x),And(FreeQ(List(a,b,c,d,m,n,p),x),EqQ($s("n2"),Times(C2,n)),Or(PolyQ($s("§pq"),x),PolyQ($s("§pq"),Power(x,n)))))),
IIntegrate(1773,Int(Times($p("§pq"),Power(u_,m_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Power(v_,$p("n2",true))),Times(b_DEFAULT,Power(v_,n_))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(u,m),Power(Times(Coefficient(v,x,C1),Power(v,m)),-1)),Subst(Int(Times(Power(x,m),SubstFor(v,$s("§pq"),x),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p)),x),x,v),x),And(FreeQ(List(a,b,c,m,n,p),x),EqQ($s("n2"),Times(C2,n)),LinearPairQ(u,v,x),PolyQ($s("§pq"),Power(v,n))))),
IIntegrate(1774,Int(Times($p("§pq"),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_DEFAULT)),Times(c_DEFAULT,Power(x_,$p("n2",true)))),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times($s("§pq"),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p)),x),x),And(FreeQ(List(a,b,c,n),x),EqQ($s("n2"),Times(C2,n)),PolyQ($s("§pq"),x),IGtQ(p,C0)))),
IIntegrate(1775,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_DEFAULT)),Times(c_DEFAULT,Power(x_,$p("n2",true)))),p_DEFAULT),Plus(d_,Times(e_DEFAULT,Power(x_,n_DEFAULT)),Times(f_DEFAULT,Power(x_,$p("n2",true))))),x_Symbol),
    Condition(Simp(Times(d,x,Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1)),Power(a,-1)),x),And(FreeQ(List(a,b,c,d,e,f,n,p),x),EqQ($s("n2"),Times(C2,n)),EqQ(Plus(Times(a,e),Times(CN1,b,d,Plus(Times(n,Plus(p,C1)),C1))),C0),EqQ(Plus(Times(a,f),Times(CN1,c,d,Plus(Times(C2,n,Plus(p,C1)),C1))),C0)))),
IIntegrate(1776,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_DEFAULT)),Times(c_DEFAULT,Power(x_,$p("n2",true)))),p_DEFAULT),Plus(d_,Times(f_DEFAULT,Power(x_,$p("n2",true))))),x_Symbol),
    Condition(Simp(Times(d,x,Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1)),Power(a,-1)),x),And(FreeQ(List(a,b,c,d,f,n,p),x),EqQ($s("n2"),Times(C2,n)),EqQ(Plus(Times(n,Plus(p,C1)),C1),C0),EqQ(Plus(Times(c,d),Times(a,f)),C0)))),
IIntegrate(1777,Int(Times($p("§pq"),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_DEFAULT)),Times(c_DEFAULT,Power(x_,$p("n2",true)))),p_)),x_Symbol),
    Condition(Dist(Times(Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),FracPart(p)),Power(Times(Power(Times(C4,c),IntPart(p)),Power(Plus(b,Times(C2,c,Power(x,n))),Times(C2,FracPart(p)))),-1)),Int(Times($s("§pq"),Power(Plus(b,Times(C2,c,Power(x,n))),Times(C2,p))),x),x),And(FreeQ(List(a,b,c,n,p),x),EqQ($s("n2"),Times(C2,n)),PolyQ($s("§pq"),x),EqQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),Not(IntegerQ(Times(C2,p)))))),
IIntegrate(1778,Int(Times($p("§pq"),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_DEFAULT)),Times(c_DEFAULT,Power(x_,$p("n2",true)))),p_)),x_Symbol),
    Condition(Int(Times(x,PolynomialQuotient($s("§pq"),x,x),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p)),x),And(FreeQ(List(a,b,c,n,p),x),EqQ($s("n2"),Times(C2,n)),PolyQ($s("§pq"),x),EqQ(Coeff($s("§pq"),x,C0),C0),Not(MatchQ($s("§pq"),Condition(Times(Power(x,m_DEFAULT),u_DEFAULT),IntegerQ(m))))))),
IIntegrate(1779,Int(Times(Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT),Plus(d_,Times(f_DEFAULT,Power(x_,$p("n2",true))),Times(g_DEFAULT,Power(x_,$p("n3",true))),Times(e_DEFAULT,Power(x_,n_)))),x_Symbol),
    Condition(Simp(Times(x,Plus(Times(a,d,Plus(n,C1)),Times(Plus(Times(a,e),Times(CN1,b,d,Plus(Times(n,Plus(p,C1)),C1))),Power(x,n))),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1)),Power(Times(Sqr(a),Plus(n,C1)),-1)),x),And(FreeQ(List(a,b,c,d,e,f,g,n,p),x),EqQ($s("n2"),Times(C2,n)),EqQ($s("n3"),Times(C3,n)),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),EqQ(Plus(Times(Sqr(a),g,Plus(n,C1)),Times(CN1,c,Plus(Times(n,Plus(Times(C2,p),C3)),C1),Plus(Times(a,e),Times(CN1,b,d,Plus(Times(n,Plus(p,C1)),C1))))),C0),EqQ(Plus(Times(Sqr(a),f,Plus(n,C1)),Times(CN1,a,c,d,Plus(n,C1),Plus(Times(C2,n,Plus(p,C1)),C1)),Times(CN1,b,Plus(Times(n,Plus(p,C2)),C1),Plus(Times(a,e),Times(CN1,b,d,Plus(Times(n,Plus(p,C1)),C1))))),C0)))),
IIntegrate(1780,Int(Times(Plus(d_,Times(f_DEFAULT,Power(x_,$p("n2",true))),Times(g_DEFAULT,Power(x_,$p("n3",true)))),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT)),x_Symbol),
    Condition(Simp(Times(d,x,Plus(Times(a,Plus(n,C1)),Times(CN1,b,Plus(Times(n,Plus(p,C1)),C1),Power(x,n))),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1)),Power(Times(Sqr(a),Plus(n,C1)),-1)),x),And(FreeQ(List(a,b,c,d,f,g,n,p),x),EqQ($s("n2"),Times(C2,n)),EqQ($s("n3"),Times(C3,n)),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),EqQ(Plus(Times(Sqr(a),g,Plus(n,C1)),Times(c,b,d,Plus(Times(n,Plus(Times(C2,p),C3)),C1),Plus(Times(n,Plus(p,C1)),C1))),C0),EqQ(Plus(Times(Sqr(a),f,Plus(n,C1)),Times(CN1,a,c,d,Plus(n,C1),Plus(Times(C2,n,Plus(p,C1)),C1)),Times(Sqr(b),d,Plus(Times(n,Plus(p,C2)),C1),Plus(Times(n,Plus(p,C1)),C1))),C0)))),
IIntegrate(1781,Int(Times(Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT),Plus(d_,Times(g_DEFAULT,Power(x_,$p("n3",true))),Times(e_DEFAULT,Power(x_,n_)))),x_Symbol),
    Condition(Simp(Times(x,Plus(Times(a,d,Plus(n,C1)),Times(Plus(Times(a,e),Times(CN1,b,d,Plus(Times(n,Plus(p,C1)),C1))),Power(x,n))),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1)),Power(Times(Sqr(a),Plus(n,C1)),-1)),x),And(FreeQ(List(a,b,c,d,e,g,n,p),x),EqQ($s("n2"),Times(C2,n)),EqQ($s("n3"),Times(C3,n)),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),EqQ(Plus(Times(Sqr(a),g,Plus(n,C1)),Times(CN1,c,Plus(Times(n,Plus(Times(C2,p),C3)),C1),Plus(Times(a,e),Times(CN1,b,d,Plus(Times(n,Plus(p,C1)),C1))))),C0),EqQ(Plus(Times(a,c,d,Plus(n,C1),Plus(Times(C2,n,Plus(p,C1)),C1)),Times(b,Plus(Times(n,Plus(p,C2)),C1),Plus(Times(a,e),Times(CN1,b,d,Plus(Times(n,Plus(p,C1)),C1))))),C0)))),
IIntegrate(1782,Int(Times(Plus(d_,Times(g_DEFAULT,Power(x_,$p("n3",true)))),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT)),x_Symbol),
    Condition(Simp(Times(d,x,Plus(Times(a,Plus(n,C1)),Times(CN1,b,Plus(Times(n,Plus(p,C1)),C1),Power(x,n))),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1)),Power(Times(Sqr(a),Plus(n,C1)),-1)),x),And(FreeQ(List(a,b,c,d,g,n,p),x),EqQ($s("n2"),Times(C2,n)),EqQ($s("n3"),Times(C3,n)),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),EqQ(Plus(Times(Sqr(a),g,Plus(n,C1)),Times(c,b,d,Plus(Times(n,Plus(Times(C2,p),C3)),C1),Plus(Times(n,Plus(p,C1)),C1))),C0),EqQ(Plus(Times(a,c,d,Plus(n,C1),Plus(Times(C2,n,Plus(p,C1)),C1)),Times(CN1,Sqr(b),d,Plus(Times(n,Plus(p,C2)),C1),Plus(Times(n,Plus(p,C1)),C1))),C0)))),
IIntegrate(1783,Int(Times($p("§pq"),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_)),Times(c_DEFAULT,Power(x_,$p("n2")))),p_)),x_Symbol),
    Condition(Module(List(Set(q,Expon($s("§pq"),x)),i),Condition(Plus(Negate(Simp(Times(x,Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1)),Sum(Plus(Times(Plus(Times(Plus(Sqr(b),Times(CN1,C2,a,c)),Coeff($s("§pq"),x,i)),Times(CN1,a,b,Coeff($s("§pq"),x,Plus(n,i)))),Power(x,i)),Times(c,Plus(Times(b,Coeff($s("§pq"),x,i)),Times(CN1,C2,a,Coeff($s("§pq"),x,Plus(n,i)))),Power(x,Plus(n,i)))),List(i,C0,Plus(n,Negate(C1)))),Power(Times(a,n,Plus(p,C1),Plus(Sqr(b),Times(CN1,C4,a,c))),-1)),x)),Dist(Power(Times(a,n,Plus(p,C1),Plus(Sqr(b),Times(CN1,C4,a,c))),-1),Int(Times(Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1)),Sum(Plus(Times(Plus(Times(Plus(Times(Sqr(b),Plus(Times(n,Plus(p,C1)),i,C1)),Times(CN1,C2,a,c,Plus(Times(C2,n,Plus(p,C1)),i,C1))),Coeff($s("§pq"),x,i)),Times(CN1,a,b,Plus(i,C1),Coeff($s("§pq"),x,Plus(n,i)))),Power(x,i)),Times(c,Plus(Times(n,Plus(Times(C2,p),C3)),i,C1),Plus(Times(b,Coeff($s("§pq"),x,i)),Times(CN1,C2,a,Coeff($s("§pq"),x,Plus(n,i)))),Power(x,Plus(n,i)))),List(i,C0,Plus(n,Negate(C1))))),x),x)),LtQ(q,Times(C2,n)))),And(FreeQ(List(a,b,c),x),EqQ($s("n2"),Times(C2,n)),PolyQ($s("§pq"),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),IGtQ(n,C0),LtQ(p,CN1)))),
IIntegrate(1784,Int(Times($p("§pq"),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_)),Times(c_DEFAULT,Power(x_,$p("n2")))),p_)),x_Symbol),
    Condition(With(List(Set(q,Expon($s("§pq"),x))),Condition(Module(List(Set(QSymbol,PolynomialQuotient(Times(Power(Times(b,c),Plus(Floor(Times(Plus(q,Negate(C1)),Power(n,-1))),C1)),$s("§pq")),Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),x)),Set($s("R"),PolynomialRemainder(Times(Power(Times(b,c),Plus(Floor(Times(Plus(q,Negate(C1)),Power(n,-1))),C1)),$s("§pq")),Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),x)),i),Plus(Dist(Power(Times(a,n,Plus(p,C1),Plus(Sqr(b),Times(CN1,C4,a,c)),Power(Times(b,c),Plus(Floor(Times(Plus(q,Negate(C1)),Power(n,-1))),C1))),-1),Int(Times(Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1)),ExpandToSum(Plus(Times(a,n,Plus(p,C1),Plus(Sqr(b),Times(CN1,C4,a,c)),QSymbol),Sum(Plus(Times(Plus(Times(Plus(Times(Sqr(b),Plus(Times(n,Plus(p,C1)),i,C1)),Times(CN1,C2,a,c,Plus(Times(C2,n,Plus(p,C1)),i,C1))),Coeff($s("R"),x,i)),Times(CN1,a,b,Plus(i,C1),Coeff($s("R"),x,Plus(n,i)))),Power(x,i)),Times(c,Plus(Times(n,Plus(Times(C2,p),C3)),i,C1),Plus(Times(b,Coeff($s("R"),x,i)),Times(CN1,C2,a,Coeff($s("R"),x,Plus(n,i)))),Power(x,Plus(n,i)))),List(i,C0,Plus(n,Negate(C1))))),x)),x),x),Negate(Simp(Times(x,Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1)),Sum(Plus(Times(Plus(Times(Plus(Sqr(b),Times(CN1,C2,a,c)),Coeff($s("R"),x,i)),Times(CN1,a,b,Coeff($s("R"),x,Plus(n,i)))),Power(x,i)),Times(c,Plus(Times(b,Coeff($s("R"),x,i)),Times(CN1,C2,a,Coeff($s("R"),x,Plus(n,i)))),Power(x,Plus(n,i)))),List(i,C0,Plus(n,Negate(C1)))),Power(Times(a,n,Plus(p,C1),Plus(Sqr(b),Times(CN1,C4,a,c)),Power(Times(b,c),Plus(Floor(Times(Plus(q,Negate(C1)),Power(n,-1))),C1))),-1)),x)))),GeQ(q,Times(C2,n)))),And(FreeQ(List(a,b,c),x),EqQ($s("n2"),Times(C2,n)),PolyQ($s("§pq"),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),IGtQ(n,C0),LtQ(p,CN1)))),
IIntegrate(1785,Int(Times($p("§pq"),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_DEFAULT)),Times(c_DEFAULT,Power(x_,$p("n2")))),-1)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times($s("§pq"),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),-1)),x),x),And(FreeQ(List(a,b,c),x),EqQ($s("n2"),Times(C2,n)),PolyQ($s("§pq"),Power(x,n)),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),IGtQ(n,C0),Or(NiceSqrtQ(Plus(Sqr(b),Times(CN1,C4,a,c))),LtQ(Expon($s("§pq"),x),n))))),
IIntegrate(1786,Int(Times($p("§pq"),Power(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(With(List(Set(q,Expon($s("§pq"),x))),Condition(With(List(Set($s("§pqq"),Coeff($s("§pq"),x,q))),Plus(Dist(C1D2,Int(Times(ExpandToSum(Plus(Times(C2,$s("§pq")),Times(CN1,Power(c,p),$s("§pqq"),Plus(b,Times(C2,c,x)),Power(Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,C1)),-1))),x),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),p)),x),x),Simp(Times(C1D2,Power(c,p),$s("§pqq"),Log(Plus(a,Times(b,x),Times(c,Sqr(x))))),x))),EqQ(Plus(q,Times(C2,p),C1),C0))),And(FreeQ(List(a,b,c),x),PolyQ($s("§pq"),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),ILtQ(p,C0)))),
IIntegrate(1787,Int(Times($p("§pq"),Power(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(With(List(Set(q,Expon($s("§pq"),x))),Condition(With(List(Set($s("§pqq"),Coeff($s("§pq"),x,q))),Plus(Int(Times(ExpandToSum(Plus($s("§pq"),Times(CN1,Power(c,Plus(p,C1D2)),$s("§pqq"),Power(Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,C1D2)),-1))),x),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),p)),x),Simp(Times(Power(c,p),$s("§pqq"),ArcTanh(Times(Plus(b,Times(C2,c,x)),Power(Times(C2,Rt(c,C2),Sqrt(Plus(a,Times(b,x),Times(c,Sqr(x))))),-1)))),x))),EqQ(Plus(q,Times(C2,p),C1),C0))),And(FreeQ(List(a,b,c),x),PolyQ($s("§pq"),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),ILtQ(Plus(p,C1D2),C0),PosQ(c)))),
IIntegrate(1788,Int(Times($p("§pq"),Power(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(With(List(Set(q,Expon($s("§pq"),x))),Condition(With(List(Set($s("§pqq"),Coeff($s("§pq"),x,q))),Plus(Int(Times(ExpandToSum(Plus($s("§pq"),Times(CN1,Power(Negate(c),Plus(p,C1D2)),$s("§pqq"),Power(Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,C1D2)),-1))),x),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),p)),x),Negate(Simp(Times(Power(Negate(c),p),$s("§pqq"),ArcTan(Times(Plus(b,Times(C2,c,x)),Power(Times(C2,Rt(Negate(c),C2),Sqrt(Plus(a,Times(b,x),Times(c,Sqr(x))))),-1)))),x)))),EqQ(Plus(q,Times(C2,p),C1),C0))),And(FreeQ(List(a,b,c),x),PolyQ($s("§pq"),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),ILtQ(Plus(p,C1D2),C0),NegQ(c)))),
IIntegrate(1789,Int(Times($p("§pq"),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_DEFAULT)),Times(c_DEFAULT,Power(x_,$p("n2")))),p_)),x_Symbol),
    Condition(With(List(Set(q,Expon($s("§pq"),x))),Condition(With(List(Set($s("§pqq"),Coeff($s("§pq"),x,q))),Plus(Int(Times(ExpandToSum(Plus($s("§pq"),Times(CN1,$s("§pqq"),Power(x,q)),Times(CN1,$s("§pqq"),Plus(Times(a,Plus(q,Times(CN1,C2,n),C1),Power(x,Plus(q,Times(CN1,C2,n)))),Times(b,Plus(q,Times(n,Plus(p,Negate(C1))),C1),Power(x,Plus(q,Negate(n))))),Power(Times(c,Plus(q,Times(C2,n,p),C1)),-1))),x),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p)),x),Simp(Times($s("§pqq"),Power(x,Plus(q,Times(CN1,C2,n),C1)),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1)),Power(Times(c,Plus(q,Times(C2,n,p),C1)),-1)),x))),And(GeQ(q,Times(C2,n)),NeQ(Plus(q,Times(C2,n,p),C1),C0),Or(IntegerQ(Times(C2,p)),And(EqQ(n,C1),IntegerQ(Times(C4,p))),IntegerQ(Plus(p,Times(Plus(q,C1),Power(Times(C2,n),-1)))))))),And(FreeQ(List(a,b,c,p),x),EqQ($s("n2"),Times(C2,n)),PolyQ($s("§pq"),Power(x,n)),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),IGtQ(n,C0)))),
IIntegrate(1790,Int(Times($p("§pq"),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_)),Times(c_DEFAULT,Power(x_,$p("n2")))),p_)),x_Symbol),
    Condition(Module(List(Set(q,Expon($s("§pq"),x)),j,k),Int(Sum(Times(Power(x,j),Sum(Times(Coeff($s("§pq"),x,Plus(j,Times(k,n))),Power(x,Times(k,n))),List(k,C0,Plus(Times(Plus(q,Negate(j)),Power(n,-1)),C1))),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p)),List(j,C0,Plus(n,Negate(C1)))),x)),And(FreeQ(List(a,b,c,p),x),EqQ($s("n2"),Times(C2,n)),PolyQ($s("§pq"),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),IGtQ(n,C0),Not(PolyQ($s("§pq"),Power(x,n)))))),
IIntegrate(1791,Int(Times($p("§pq"),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_DEFAULT)),Times(c_DEFAULT,Power(x_,$p("n2",true)))),-1)),x_Symbol),
    Condition(Int(RationalFunctionExpand(Times($s("§pq"),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),-1)),x),x),And(FreeQ(List(a,b,c),x),EqQ($s("n2"),Times(C2,n)),PolyQ($s("§pq"),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),IGtQ(n,C0)))),
IIntegrate(1792,Int(Times($p("§pq"),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(With(List(Set(g,Denominator(n))),Dist(g,Subst(Int(Times(Power(x,Plus(g,Negate(C1))),ReplaceAll($s("§pq"),Rule(x,Power(x,g))),Power(Plus(a,Times(b,Power(x,Times(g,n))),Times(c,Power(x,Times(C2,g,n)))),p)),x),x,Power(x,Power(g,-1))),x)),And(FreeQ(List(a,b,c,p),x),EqQ($s("n2"),Times(C2,n)),PolyQ($s("§pq"),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),FractionQ(n)))),
IIntegrate(1793,Int(Times($p("§pq"),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_DEFAULT)),Times(c_DEFAULT,Power(x_,$p("n2",true)))),-1)),x_Symbol),
    Condition(With(List(Set(q,Rt(Plus(Sqr(b),Times(CN1,C4,a,c)),C2))),Plus(Dist(Times(C2,c,Power(q,-1)),Int(Times($s("§pq"),Power(Plus(b,Negate(q),Times(C2,c,Power(x,n))),-1)),x),x),Negate(Dist(Times(C2,c,Power(q,-1)),Int(Times($s("§pq"),Power(Plus(b,q,Times(C2,c,Power(x,n))),-1)),x),x)))),And(FreeQ(List(a,b,c,n),x),EqQ($s("n2"),Times(C2,n)),PolyQ($s("§pq"),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0)))),
IIntegrate(1794,Int(Times($p("§p3"),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_)),Times(c_DEFAULT,Power(x_,$p("n2")))),p_)),x_Symbol),
    Condition(With(List(Set(d,Coeff($s("§p3"),Power(x,n),C0)),Set(e,Coeff($s("§p3"),Power(x,n),C1)),Set(f,Coeff($s("§p3"),Power(x,n),C2)),Set(g,Coeff($s("§p3"),Power(x,n),C3))),Plus(Negate(Simp(Times(x,Plus(Times(Sqr(b),c,d),Times(CN1,C2,a,c,Plus(Times(c,d),Times(CN1,a,f))),Times(CN1,a,b,Plus(Times(c,e),Times(a,g))),Times(Plus(Times(b,c,Plus(Times(c,d),Times(a,f))),Times(CN1,a,Sqr(b),g),Times(CN1,C2,a,c,Plus(Times(c,e),Times(CN1,a,g)))),Power(x,n))),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1)),Power(Times(a,c,n,Plus(p,C1),Plus(Sqr(b),Times(CN1,C4,a,c))),-1)),x)),Negate(Dist(Power(Times(a,c,n,Plus(p,C1),Plus(Sqr(b),Times(CN1,C4,a,c))),-1),Int(Times(Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1)),Simp(Plus(Times(a,b,Plus(Times(c,e),Times(a,g))),Times(CN1,Sqr(b),c,d,Plus(n,Times(n,p),C1)),Times(CN1,C2,a,c,Plus(Times(a,f),Times(CN1,c,d,Plus(Times(C2,n,Plus(p,C1)),C1)))),Times(Plus(Times(a,Sqr(b),g,Plus(Times(n,Plus(p,C2)),C1)),Times(CN1,b,c,Plus(Times(c,d),Times(a,f)),Plus(Times(n,Plus(Times(C2,p),C3)),C1)),Times(CN1,C2,a,c,Plus(Times(a,g,Plus(n,C1)),Times(CN1,c,e,Plus(Times(n,Plus(Times(C2,p),C3)),C1))))),Power(x,n))),x)),x),x)))),And(FreeQ(List(a,b,c,n),x),EqQ($s("n2"),Times(C2,n)),PolyQ($s("§p3"),Power(x,n),C3),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),ILtQ(p,CN1)))),
IIntegrate(1795,Int(Times($p("§p2"),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_)),Times(c_DEFAULT,Power(x_,$p("n2")))),p_)),x_Symbol),
    Condition(With(List(Set(d,Coeff($s("§p2"),Power(x,n),C0)),Set(e,Coeff($s("§p2"),Power(x,n),C1)),Set(f,Coeff($s("§p2"),Power(x,n),C2))),Plus(Negate(Simp(Times(x,Plus(Times(Sqr(b),d),Times(CN1,C2,a,Plus(Times(c,d),Times(CN1,a,f))),Times(CN1,a,b,e),Times(Plus(Times(b,Plus(Times(c,d),Times(a,f))),Times(CN1,C2,a,c,e)),Power(x,n))),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1)),Power(Times(a,n,Plus(p,C1),Plus(Sqr(b),Times(CN1,C4,a,c))),-1)),x)),Negate(Dist(Power(Times(a,n,Plus(p,C1),Plus(Sqr(b),Times(CN1,C4,a,c))),-1),Int(Times(Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1)),Simp(Plus(Times(a,b,e),Times(CN1,Sqr(b),d,Plus(n,Times(n,p),C1)),Times(CN1,C2,a,Plus(Times(a,f),Times(CN1,c,d,Plus(Times(C2,n,Plus(p,C1)),C1)))),Times(CN1,Plus(Times(b,Plus(Times(c,d),Times(a,f)),Plus(Times(n,Plus(Times(C2,p),C3)),C1)),Times(CN1,C2,a,c,e,Plus(Times(n,Plus(Times(C2,p),C3)),C1))),Power(x,n))),x)),x),x)))),And(FreeQ(List(a,b,c,n),x),EqQ($s("n2"),Times(C2,n)),PolyQ($s("§p2"),Power(x,n),C2),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),ILtQ(p,CN1)))),
IIntegrate(1796,Int(Times($p("§pq"),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_DEFAULT)),Times(c_DEFAULT,Power(x_,$p("n2",true)))),p_)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times($s("§pq"),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p)),x),x),And(FreeQ(List(a,b,c,n),x),EqQ($s("n2"),Times(C2,n)),PolyQ($s("§pq"),x),ILtQ(p,CN1)))),
IIntegrate(1797,Int(Times($p("§pq"),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_DEFAULT)),Times(c_DEFAULT,Power(x_,$p("n2",true)))),p_DEFAULT)),x_Symbol),
    Condition(Unintegrable(Times($s("§pq"),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p)),x),And(FreeQ(List(a,b,c,n,p),x),EqQ($s("n2"),Times(C2,n)),Or(PolyQ($s("§pq"),x),PolyQ($s("§pq"),Power(x,n)))))),
IIntegrate(1798,Int(Times($p("§pq"),Power(Plus(a_,Times(c_DEFAULT,Power(v_,$p("n2",true))),Times(b_DEFAULT,Power(v_,n_))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Coefficient(v,x,C1),-1),Subst(Int(Times(SubstFor(v,$s("§pq"),x),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p)),x),x,v),x),And(FreeQ(List(a,b,c,n,p),x),EqQ($s("n2"),Times(C2,n)),LinearQ(v,x),PolyQ($s("§pq"),Power(v,n))))),
IIntegrate(1799,Int(Times($p("§pq"),Power(x_,m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Dist(C1D2,Subst(Int(Times(Power(x,Times(C1D2,Plus(m,Negate(C1)))),SubstFor(Sqr(x),$s("§pq"),x),Power(Plus(a,Times(b,x)),p)),x),x,Sqr(x)),x),And(FreeQ(List(a,b,p),x),PolyQ($s("§pq"),Sqr(x)),IntegerQ(Times(C1D2,Plus(m,Negate(C1))))))),
IIntegrate(1800,Int(Times($p("§pq"),Power(Times(c_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Power(c,-1),Int(Times(Power(Times(c,x),Plus(m,C1)),PolynomialQuotient($s("§pq"),x,x),Power(Plus(a,Times(b,Sqr(x))),p)),x),x),And(FreeQ(List(a,b,c,m,p),x),PolyQ($s("§pq"),x),EqQ(Coeff($s("§pq"),x,C0),C0))))
  );
}
