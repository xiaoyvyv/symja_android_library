package org.matheclipse.core.integrate.rubi;


import org.matheclipse.core.interfaces.IAST;

import static org.matheclipse.core.expression.F.$;
import static org.matheclipse.core.expression.F.$p;
import static org.matheclipse.core.expression.F.$s;
import static org.matheclipse.core.expression.F.ASymbol;
import static org.matheclipse.core.expression.F.A_DEFAULT;
import static org.matheclipse.core.expression.F.And;
import static org.matheclipse.core.expression.F.BSymbol;
import static org.matheclipse.core.expression.F.B_DEFAULT;
import static org.matheclipse.core.expression.F.C0;
import static org.matheclipse.core.expression.F.C1;
import static org.matheclipse.core.expression.F.C1D2;
import static org.matheclipse.core.expression.F.C2;
import static org.matheclipse.core.expression.F.C4;
import static org.matheclipse.core.expression.F.CN1;
import static org.matheclipse.core.expression.F.CSymbol;
import static org.matheclipse.core.expression.F.C_DEFAULT;
import static org.matheclipse.core.expression.F.Condition;
import static org.matheclipse.core.expression.F.Cos;
import static org.matheclipse.core.expression.F.Cot;
import static org.matheclipse.core.expression.F.Csc;
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
import static org.matheclipse.core.expression.F.Tan;
import static org.matheclipse.core.expression.F.Times;
import static org.matheclipse.core.expression.F.With;
import static org.matheclipse.core.expression.F.ZZ;
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
import static org.matheclipse.core.expression.F.g;
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
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Int;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.IntPart;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.IntegersQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.LeQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.NeQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.RationalQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Rt;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Simp;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Subst;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Unintegrable;

/** 
 * IndefiniteIntegrationRules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class IntRules73 { 
  public static IAST RULES = List( 
IIntegrate(3651,Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),-1),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),-1),Plus(A_DEFAULT,Times(B_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),Times(C_DEFAULT,Sqr($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),x_Symbol),
    Condition(Plus(Simp(Times(Plus(Times(a,Plus(Times(ASymbol,c),Times(CN1,c,CSymbol),Times(BSymbol,d))),Times(b,Plus(Times(BSymbol,c),Times(CN1,ASymbol,d),Times(CSymbol,d)))),x,Power(Times(Plus(Sqr(a),Sqr(b)),Plus(Sqr(c),Sqr(d))),-1)),x),Dist(Times(Plus(Times(ASymbol,Sqr(b)),Times(CN1,a,b,BSymbol),Times(Sqr(a),CSymbol)),Power(Times(Plus(Times(b,c),Times(CN1,a,d)),Plus(Sqr(a),Sqr(b))),-1)),Int(Times(Plus(b,Times(CN1,a,Tan(Plus(e,Times(f,x))))),Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),-1)),x),x),Negate(Dist(Times(Plus(Times(Sqr(c),CSymbol),Times(CN1,BSymbol,c,d),Times(ASymbol,Sqr(d))),Power(Times(Plus(Times(b,c),Times(CN1,a,d)),Plus(Sqr(c),Sqr(d))),-1)),Int(Times(Plus(d,Times(CN1,c,Tan(Plus(e,Times(f,x))))),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f,ASymbol,BSymbol,CSymbol),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),NeQ(Plus(Sqr(a),Sqr(b)),C0),NeQ(Plus(Sqr(c),Sqr(d)),C0)))),
IIntegrate(3652,Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),-1),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),-1),Plus(A_DEFAULT,Times(C_DEFAULT,Sqr($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),x_Symbol),
    Condition(Plus(Simp(Times(Plus(Times(a,Plus(Times(ASymbol,c),Times(CN1,c,CSymbol))),Times(CN1,b,Plus(Times(ASymbol,d),Times(CN1,CSymbol,d)))),x,Power(Times(Plus(Sqr(a),Sqr(b)),Plus(Sqr(c),Sqr(d))),-1)),x),Dist(Times(Plus(Times(ASymbol,Sqr(b)),Times(Sqr(a),CSymbol)),Power(Times(Plus(Times(b,c),Times(CN1,a,d)),Plus(Sqr(a),Sqr(b))),-1)),Int(Times(Plus(b,Times(CN1,a,Tan(Plus(e,Times(f,x))))),Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),-1)),x),x),Negate(Dist(Times(Plus(Times(Sqr(c),CSymbol),Times(ASymbol,Sqr(d))),Power(Times(Plus(Times(b,c),Times(CN1,a,d)),Plus(Sqr(c),Sqr(d))),-1)),Int(Times(Plus(d,Times(CN1,c,Tan(Plus(e,Times(f,x))))),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f,ASymbol,CSymbol),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),NeQ(Plus(Sqr(a),Sqr(b)),C0),NeQ(Plus(Sqr(c),Sqr(d)),C0)))),
IIntegrate(3653,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),-1),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_),Plus(A_DEFAULT,Times(B_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),Times(C_DEFAULT,Sqr($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),x_Symbol),
    Condition(Plus(Dist(Power(Plus(Sqr(a),Sqr(b)),-1),Int(Times(Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),n),Simp(Plus(Times(b,BSymbol),Times(a,Plus(ASymbol,Negate(CSymbol))),Times(Plus(Times(a,BSymbol),Times(CN1,b,Plus(ASymbol,Negate(CSymbol)))),Tan(Plus(e,Times(f,x))))),x)),x),x),Dist(Times(Plus(Times(ASymbol,Sqr(b)),Times(CN1,a,b,BSymbol),Times(Sqr(a),CSymbol)),Power(Plus(Sqr(a),Sqr(b)),-1)),Int(Times(Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),n),Plus(C1,Sqr(Tan(Plus(e,Times(f,x))))),Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),-1)),x),x)),And(FreeQ(List(a,b,c,d,e,f,ASymbol,BSymbol,CSymbol,n),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),NeQ(Plus(Sqr(a),Sqr(b)),C0),NeQ(Plus(Sqr(c),Sqr(d)),C0),Not(GtQ(n,C0)),Not(LeQ(n,CN1))))),
IIntegrate(3654,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),-1),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_),Plus(A_DEFAULT,Times(C_DEFAULT,Sqr($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),x_Symbol),
    Condition(Plus(Dist(Power(Plus(Sqr(a),Sqr(b)),-1),Int(Times(Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),n),Simp(Plus(Times(a,Plus(ASymbol,Negate(CSymbol))),Times(CN1,Plus(Times(ASymbol,b),Times(CN1,b,CSymbol)),Tan(Plus(e,Times(f,x))))),x)),x),x),Dist(Times(Plus(Times(ASymbol,Sqr(b)),Times(Sqr(a),CSymbol)),Power(Plus(Sqr(a),Sqr(b)),-1)),Int(Times(Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),n),Plus(C1,Sqr(Tan(Plus(e,Times(f,x))))),Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),-1)),x),x)),And(FreeQ(List(a,b,c,d,e,f,ASymbol,CSymbol,n),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),NeQ(Plus(Sqr(a),Sqr(b)),C0),NeQ(Plus(Sqr(c),Sqr(d)),C0),Not(GtQ(n,C0)),Not(LeQ(n,CN1))))),
IIntegrate(3655,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_),Plus(A_DEFAULT,Times(B_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),Times(C_DEFAULT,Sqr($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),x_Symbol),
    Condition(With(List(Set($s("ff"),FreeFactors(Tan(Plus(e,Times(f,x))),x))),Dist(Times($s("ff"),Power(f,-1)),Subst(Int(Times(Power(Plus(a,Times(b,$s("ff"),x)),m),Power(Plus(c,Times(d,$s("ff"),x)),n),Plus(ASymbol,Times(BSymbol,$s("ff"),x),Times(CSymbol,Sqr($s("ff")),Sqr(x))),Power(Plus(C1,Times(Sqr($s("ff")),Sqr(x))),-1)),x),x,Times(Tan(Plus(e,Times(f,x))),Power($s("ff"),-1))),x)),And(FreeQ(List(a,b,c,d,e,f,ASymbol,BSymbol,CSymbol,m,n),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),NeQ(Plus(Sqr(a),Sqr(b)),C0),NeQ(Plus(Sqr(c),Sqr(d)),C0)))),
IIntegrate(3656,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_),Plus(A_DEFAULT,Times(C_DEFAULT,Sqr($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),x_Symbol),
    Condition(With(List(Set($s("ff"),FreeFactors(Tan(Plus(e,Times(f,x))),x))),Dist(Times($s("ff"),Power(f,-1)),Subst(Int(Times(Power(Plus(a,Times(b,$s("ff"),x)),m),Power(Plus(c,Times(d,$s("ff"),x)),n),Plus(ASymbol,Times(CSymbol,Sqr($s("ff")),Sqr(x))),Power(Plus(C1,Times(Sqr($s("ff")),Sqr(x))),-1)),x),x,Times(Tan(Plus(e,Times(f,x))),Power($s("ff"),-1))),x)),And(FreeQ(List(a,b,c,d,e,f,ASymbol,CSymbol,m,n),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),NeQ(Plus(Sqr(a),Sqr(b)),C0),NeQ(Plus(Sqr(c),Sqr(d)),C0)))),
IIntegrate(3657,Int(Times(u_DEFAULT,Power(Plus(a_,Times(b_DEFAULT,Sqr($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),p_)),x_Symbol),
    Condition(Int(ActivateTrig(Times(u,Power(Times(a,Sqr($($s("§sec"),Plus(e,Times(f,x))))),p))),x),And(FreeQ(List(a,b,e,f,p),x),EqQ(a,b)))),
IIntegrate(3658,Int(Times(u_DEFAULT,Power(Times(b_DEFAULT,Power($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),n_)),p_)),x_Symbol),
    Condition(With(List(Set($s("ff"),FreeFactors(Tan(Plus(e,Times(f,x))),x))),Dist(Times(Power(Times(b,Power($s("ff"),n)),IntPart(p)),Power(Times(b,Power(Tan(Plus(e,Times(f,x))),n)),FracPart(p)),Power(Power(Times(Tan(Plus(e,Times(f,x))),Power($s("ff"),-1)),Times(n,FracPart(p))),-1)),Int(Times(ActivateTrig(u),Power(Times(Tan(Plus(e,Times(f,x))),Power($s("ff"),-1)),Times(n,p))),x),x)),And(FreeQ(List(b,e,f,n,p),x),Not(IntegerQ(p)),IntegerQ(n),Or(EqQ(u,C1),MatchQ(u,Condition(Power(Times(d_DEFAULT,$($p("§trig"),Plus(e,Times(f,x)))),m_DEFAULT),And(FreeQ(List(d,m),x),MemberQ(List($s("§sin"),$s("§cos"),$s("§tan"),$s("§cot"),$s("§sec"),$s("§csc")),$s("§trig"))))))))),
IIntegrate(3659,Int(Times(u_DEFAULT,Power(Times(b_DEFAULT,Power(Times(c_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),p_)),x_Symbol),
    Condition(Dist(Times(Power(b,IntPart(p)),Power(Times(b,Power(Times(c,Tan(Plus(e,Times(f,x)))),n)),FracPart(p)),Power(Power(Times(c,Tan(Plus(e,Times(f,x)))),Times(n,FracPart(p))),-1)),Int(Times(ActivateTrig(u),Power(Times(c,Tan(Plus(e,Times(f,x)))),Times(n,p))),x),x),And(FreeQ(List(b,c,e,f,n,p),x),Not(IntegerQ(p)),Not(IntegerQ(n)),Or(EqQ(u,C1),MatchQ(u,Condition(Power(Times(d_DEFAULT,$($p("§trig"),Plus(e,Times(f,x)))),m_DEFAULT),And(FreeQ(List(d,m),x),MemberQ(List($s("§sin"),$s("§cos"),$s("§tan"),$s("§cot"),$s("§sec"),$s("§csc")),$s("§trig"))))))))),
IIntegrate(3660,Int(Power(Plus(a_,Times(b_DEFAULT,Sqr($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),-1),x_Symbol),
    Condition(Plus(Simp(Times(x,Power(Plus(a,Negate(b)),-1)),x),Negate(Dist(Times(b,Power(Plus(a,Negate(b)),-1)),Int(Times(Sqr(Sec(Plus(e,Times(f,x)))),Power(Plus(a,Times(b,Sqr(Tan(Plus(e,Times(f,x)))))),-1)),x),x))),And(FreeQ(List(a,b,e,f),x),NeQ(a,b)))),
IIntegrate(3661,Int(Power(Plus(a_,Times(b_DEFAULT,Power(Times(c_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_))),p_),x_Symbol),
    Condition(With(List(Set($s("ff"),FreeFactors(Tan(Plus(e,Times(f,x))),x))),Dist(Times(c,$s("ff"),Power(f,-1)),Subst(Int(Times(Power(Plus(a,Times(b,Power(Times($s("ff"),x),n))),p),Power(Plus(Sqr(c),Times(Sqr($s("ff")),Sqr(x))),-1)),x),x,Times(c,Tan(Plus(e,Times(f,x))),Power($s("ff"),-1))),x)),And(FreeQ(List(a,b,c,e,f,n,p),x),Or(IntegersQ(n,p),IGtQ(p,C0),EqQ(Sqr(n),C4),EqQ(Sqr(n),ZZ(16L)))))),
IIntegrate(3662,Int(Power(Plus(a_,Times(b_DEFAULT,Power(Times(c_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_))),p_DEFAULT),x_Symbol),
    Condition(Unintegrable(Power(Plus(a,Times(b,Power(Times(c,Tan(Plus(e,Times(f,x)))),n))),p),x),FreeQ(List(a,b,c,e,f,n,p),x))),
IIntegrate(3663,Int(Times(Power($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),m_),Power(Plus(a_,Times(b_DEFAULT,Power(Times(c_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_))),p_DEFAULT)),x_Symbol),
    Condition(With(List(Set($s("ff"),FreeFactors(Tan(Plus(e,Times(f,x))),x))),Dist(Times(c,Power($s("ff"),Plus(m,C1)),Power(f,-1)),Subst(Int(Times(Power(x,m),Power(Plus(a,Times(b,Power(Times($s("ff"),x),n))),p),Power(Power(Plus(Sqr(c),Times(Sqr($s("ff")),Sqr(x))),Plus(Times(C1D2,m),C1)),-1)),x),x,Times(c,Tan(Plus(e,Times(f,x))),Power($s("ff"),-1))),x)),And(FreeQ(List(a,b,c,e,f,n,p),x),IntegerQ(Times(C1D2,m))))),
IIntegrate(3664,Int(Times(Power($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Sqr($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),p_DEFAULT)),x_Symbol),
    Condition(With(List(Set($s("ff"),FreeFactors(Sec(Plus(e,Times(f,x))),x))),Dist(Power(Times(f,Power($s("ff"),m)),-1),Subst(Int(Times(Power(Plus(CN1,Times(Sqr($s("ff")),Sqr(x))),Times(C1D2,Plus(m,Negate(C1)))),Power(Plus(a,Negate(b),Times(b,Sqr($s("ff")),Sqr(x))),p),Power(Power(x,Plus(m,C1)),-1)),x),x,Times(Sec(Plus(e,Times(f,x))),Power($s("ff"),-1))),x)),And(FreeQ(List(a,b,e,f,p),x),IntegerQ(Times(C1D2,Plus(m,Negate(C1))))))),
IIntegrate(3665,Int(Times(Power($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),n_))),p_DEFAULT)),x_Symbol),
    Condition(With(List(Set($s("ff"),FreeFactors(Sec(Plus(e,Times(f,x))),x))),Dist(Power(Times(f,Power($s("ff"),m)),-1),Subst(Int(Times(Power(Plus(CN1,Times(Sqr($s("ff")),Sqr(x))),Times(C1D2,Plus(m,Negate(C1)))),Power(Plus(a,Times(b,Power(Plus(CN1,Times(Sqr($s("ff")),Sqr(x))),Times(C1D2,n)))),p),Power(Power(x,Plus(m,C1)),-1)),x),x,Times(Sec(Plus(e,Times(f,x))),Power($s("ff"),-1))),x)),And(FreeQ(List(a,b,e,f,p),x),IntegerQ(Times(C1D2,Plus(m,Negate(C1)))),IntegerQ(Times(C1D2,n))))),
IIntegrate(3666,Int(Times(Power(Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(Times(c_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_))),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandTrig(Times(Power(Times(d,$($s("§sin"),Plus(e,Times(f,x)))),m),Power(Plus(a,Times(b,Power(Times(c,$($s("§tan"),Plus(e,Times(f,x)))),n))),p)),x),x),And(FreeQ(List(a,b,c,d,e,f,m,n),x),IGtQ(p,C0)))),
IIntegrate(3667,Int(Times(Power(Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_),Power(Plus(a_,Times(b_DEFAULT,Sqr($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),p_)),x_Symbol),
    Condition(With(List(Set($s("ff"),FreeFactors(Tan(Plus(e,Times(f,x))),x))),Dist(Times($s("ff"),Power(Times(d,Sin(Plus(e,Times(f,x)))),m),Power(Sqr(Sec(Plus(e,Times(f,x)))),Times(C1D2,m)),Power(Times(f,Power(Tan(Plus(e,Times(f,x))),m)),-1)),Subst(Int(Times(Power(Times($s("ff"),x),m),Power(Plus(a,Times(b,Sqr($s("ff")),Sqr(x))),p),Power(Power(Plus(C1,Times(Sqr($s("ff")),Sqr(x))),Plus(Times(C1D2,m),C1)),-1)),x),x,Times(Tan(Plus(e,Times(f,x))),Power($s("ff"),-1))),x)),And(FreeQ(List(a,b,d,e,f,m,p),x),Not(IntegerQ(m))))),
IIntegrate(3668,Int(Times(Power(Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(Times(c_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_))),p_DEFAULT)),x_Symbol),
    Condition(Unintegrable(Times(Power(Times(d,Sin(Plus(e,Times(f,x)))),m),Power(Plus(a,Times(b,Power(Times(c,Tan(Plus(e,Times(f,x)))),n))),p)),x),FreeQ(List(a,b,c,d,e,f,m,n,p),x))),
IIntegrate(3669,Int(Times(Power(Times($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),m_),Power(Plus(a_,Times(b_DEFAULT,Power(Times(c_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_))),p_)),x_Symbol),
    Condition(Dist(Times(Power(Times(d,Cos(Plus(e,Times(f,x)))),FracPart(m)),Power(Times(Sec(Plus(e,Times(f,x))),Power(d,-1)),FracPart(m))),Int(Times(Power(Plus(a,Times(b,Power(Times(c,Tan(Plus(e,Times(f,x)))),n))),p),Power(Power(Times(Sec(Plus(e,Times(f,x))),Power(d,-1)),m),-1)),x),x),And(FreeQ(List(a,b,c,d,e,f,m,n,p),x),Not(IntegerQ(m))))),
IIntegrate(3670,Int(Times(Power(Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(Times(c_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_))),p_DEFAULT)),x_Symbol),
    Condition(With(List(Set($s("ff"),FreeFactors(Tan(Plus(e,Times(f,x))),x))),Dist(Times(c,$s("ff"),Power(f,-1)),Subst(Int(Times(Power(Times(d,$s("ff"),x,Power(c,-1)),m),Power(Plus(a,Times(b,Power(Times($s("ff"),x),n))),p),Power(Plus(Sqr(c),Times(Sqr($s("ff")),Sqr(x))),-1)),x),x,Times(c,Tan(Plus(e,Times(f,x))),Power($s("ff"),-1))),x)),And(FreeQ(List(a,b,c,d,e,f,m,n,p),x),Or(IGtQ(p,C0),EqQ(n,C2),EqQ(n,C4),And(IntegerQ(p),RationalQ(n)))))),
IIntegrate(3671,Int(Times(Power(Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(Times(c_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_))),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandTrig(Times(Power(Times(d,$($s("§tan"),Plus(e,Times(f,x)))),m),Power(Plus(a,Times(b,Power(Times(c,$($s("§tan"),Plus(e,Times(f,x)))),n))),p)),x),x),And(FreeQ(List(a,b,c,d,e,f,m,n),x),IGtQ(p,C0)))),
IIntegrate(3672,Int(Times(Power(Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(Times(c_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_))),p_DEFAULT)),x_Symbol),
    Condition(Unintegrable(Times(Power(Times(d,Tan(Plus(e,Times(f,x)))),m),Power(Plus(a,Times(b,Power(Times(c,Tan(Plus(e,Times(f,x)))),n))),p)),x),FreeQ(List(a,b,c,d,e,f,m,n,p),x))),
IIntegrate(3673,Int(Times(Power(Times($($s("§cot"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),m_),Power(Plus(a_,Times(b_DEFAULT,Power($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),n_DEFAULT))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Power(d,Times(n,p)),Int(Times(Power(Times(d,Cot(Plus(e,Times(f,x)))),Plus(m,Times(CN1,n,p))),Power(Plus(b,Times(a,Power(Cot(Plus(e,Times(f,x))),n))),p)),x),x),And(FreeQ(List(a,b,d,e,f,m,n,p),x),Not(IntegerQ(m)),IntegersQ(n,p)))),
IIntegrate(3674,Int(Times(Power(Times($($s("§cot"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),m_),Power(Plus(a_,Times(b_DEFAULT,Power(Times(c_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_))),p_)),x_Symbol),
    Condition(Dist(Times(Power(Times(d,Cot(Plus(e,Times(f,x)))),FracPart(m)),Power(Times(Tan(Plus(e,Times(f,x))),Power(d,-1)),FracPart(m))),Int(Times(Power(Plus(a,Times(b,Power(Times(c,Tan(Plus(e,Times(f,x)))),n))),p),Power(Power(Times(Tan(Plus(e,Times(f,x))),Power(d,-1)),m),-1)),x),x),And(FreeQ(List(a,b,c,d,e,f,m,n,p),x),Not(IntegerQ(m))))),
IIntegrate(3675,Int(Times(Power($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),m_),Power(Plus(a_,Times(b_DEFAULT,Power(Times(c_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_))),p_DEFAULT)),x_Symbol),
    Condition(With(List(Set($s("ff"),FreeFactors(Tan(Plus(e,Times(f,x))),x))),Dist(Times($s("ff"),Power(Times(Power(c,Plus(m,Negate(C1))),f),-1)),Subst(Int(Times(Power(Plus(Sqr(c),Times(Sqr($s("ff")),Sqr(x))),Plus(Times(C1D2,m),Negate(C1))),Power(Plus(a,Times(b,Power(Times($s("ff"),x),n))),p)),x),x,Times(c,Tan(Plus(e,Times(f,x))),Power($s("ff"),-1))),x)),And(FreeQ(List(a,b,c,e,f,n,p),x),IntegerQ(Times(C1D2,m)),Or(IntegersQ(n,p),IGtQ(m,C0),IGtQ(p,C0),EqQ(Sqr(n),C4),EqQ(Sqr(n),ZZ(16L)))))),
IIntegrate(3676,Int(Times(Power($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),n_))),p_DEFAULT)),x_Symbol),
    Condition(With(List(Set($s("ff"),FreeFactors(Sin(Plus(e,Times(f,x))),x))),Dist(Times($s("ff"),Power(f,-1)),Subst(Int(Times(Power(ExpandToSum(Plus(Times(b,Power(Times($s("ff"),x),n)),Times(a,Power(Plus(C1,Times(CN1,Sqr($s("ff")),Sqr(x))),Times(C1D2,n)))),x),p),Power(Power(Plus(C1,Times(CN1,Sqr($s("ff")),Sqr(x))),Times(C1D2,Plus(m,Times(n,p),C1))),-1)),x),x,Times(Sin(Plus(e,Times(f,x))),Power($s("ff"),-1))),x)),And(FreeQ(List(a,b,e,f),x),IntegerQ(Times(C1D2,Plus(m,Negate(C1)))),IntegerQ(Times(C1D2,n)),IntegerQ(p)))),
IIntegrate(3677,Int(Times(Power($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),n_))),p_DEFAULT)),x_Symbol),
    Condition(With(List(Set($s("ff"),FreeFactors(Sin(Plus(e,Times(f,x))),x))),Dist(Times($s("ff"),Power(f,-1)),Subst(Int(Times(C1,Power(Times(Plus(Times(b,Power(Times($s("ff"),x),n)),Times(a,Power(Plus(C1,Times(CN1,Sqr($s("ff")),Sqr(x))),Times(C1D2,n)))),Power(Power(Plus(C1,Times(CN1,Sqr($s("ff")),Sqr(x))),Times(C1D2,n)),-1)),p),Power(Power(Plus(C1,Times(CN1,Sqr($s("ff")),Sqr(x))),Times(C1D2,Plus(m,C1))),-1)),x),x,Times(Sin(Plus(e,Times(f,x))),Power($s("ff"),-1))),x)),And(FreeQ(List(a,b,e,f,p),x),IntegerQ(Times(C1D2,Plus(m,Negate(C1)))),IntegerQ(Times(C1D2,n)),Not(IntegerQ(p))))),
IIntegrate(3678,Int(Times(Power(Times(d_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(Times(c_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_))),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandTrig(Times(Power(Times(d,$($s("§sec"),Plus(e,Times(f,x)))),m),Power(Plus(a,Times(b,Power(Times(c,$($s("§tan"),Plus(e,Times(f,x)))),n))),p)),x),x),And(FreeQ(List(a,b,c,d,e,f,m,n),x),IGtQ(p,C0)))),
IIntegrate(3679,Int(Times(Power(Times(d_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_),Power(Plus(a_,Times(b_DEFAULT,Sqr($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),p_)),x_Symbol),
    Condition(With(List(Set($s("ff"),FreeFactors(Tan(Plus(e,Times(f,x))),x))),Dist(Times($s("ff"),Power(Times(d,Sec(Plus(e,Times(f,x)))),m),Power(Times(f,Power(Sqr(Sec(Plus(e,Times(f,x)))),Times(C1D2,m))),-1)),Subst(Int(Times(Power(Plus(C1,Times(Sqr($s("ff")),Sqr(x))),Plus(Times(C1D2,m),Negate(C1))),Power(Plus(a,Times(b,Sqr($s("ff")),Sqr(x))),p)),x),x,Times(Tan(Plus(e,Times(f,x))),Power($s("ff"),-1))),x)),And(FreeQ(List(a,b,d,e,f,m,p),x),Not(IntegerQ(m))))),
IIntegrate(3680,Int(Times(Power(Times(d_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(Times(c_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_))),p_DEFAULT)),x_Symbol),
    Condition(Unintegrable(Times(Power(Times(d,Sec(Plus(e,Times(f,x)))),m),Power(Plus(a,Times(b,Power(Times(c,Tan(Plus(e,Times(f,x)))),n))),p)),x),FreeQ(List(a,b,c,d,e,f,m,n,p),x))),
IIntegrate(3681,Int(Times(Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),m_),Power(Plus(a_,Times(b_DEFAULT,Power(Times(c_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_))),p_)),x_Symbol),
    Condition(Dist(Times(Power(Times(d,Csc(Plus(e,Times(f,x)))),FracPart(m)),Power(Times(Sin(Plus(e,Times(f,x))),Power(d,-1)),FracPart(m))),Int(Times(Power(Plus(a,Times(b,Power(Times(c,Tan(Plus(e,Times(f,x)))),n))),p),Power(Power(Times(Sin(Plus(e,Times(f,x))),Power(d,-1)),m),-1)),x),x),And(FreeQ(List(a,b,c,d,e,f,m,n,p),x),Not(IntegerQ(m))))),
IIntegrate(3682,Int(Power(Plus(a_,Times(b_DEFAULT,Power($($s("§tan"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT)),Times(c_DEFAULT,Power($($s("§tan"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2",true)))),p_DEFAULT),x_Symbol),
    Condition(Dist(Power(Times(Power(C4,p),Power(c,p)),-1),Int(Power(Plus(b,Times(C2,c,Power(Tan(Plus(d,Times(e,x))),n))),Times(C2,p)),x),x),And(FreeQ(List(a,b,c,d,e,n),x),EqQ($s("n2"),Times(C2,n)),EqQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),IntegerQ(p)))),
IIntegrate(3683,Int(Power(Plus(Times(Power($($s("§cot"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT),b_DEFAULT),Times(Power($($s("§cot"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2",true)),c_DEFAULT),a_),p_DEFAULT),x_Symbol),
    Condition(Dist(Power(Times(Power(C4,p),Power(c,p)),-1),Int(Power(Plus(b,Times(C2,c,Power(Cot(Plus(d,Times(e,x))),n))),Times(C2,p)),x),x),And(FreeQ(List(a,b,c,d,e,n),x),EqQ($s("n2"),Times(C2,n)),EqQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),IntegerQ(p)))),
IIntegrate(3684,Int(Power(Plus(a_,Times(b_DEFAULT,Power($($s("§tan"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT)),Times(c_DEFAULT,Power($($s("§tan"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2",true)))),p_),x_Symbol),
    Condition(Dist(Times(Power(Plus(a,Times(b,Power(Tan(Plus(d,Times(e,x))),n)),Times(c,Power(Tan(Plus(d,Times(e,x))),Times(C2,n)))),p),Power(Power(Plus(b,Times(C2,c,Power(Tan(Plus(d,Times(e,x))),n))),Times(C2,p)),-1)),Int(Power(Plus(b,Times(C2,c,Power(Tan(Plus(d,Times(e,x))),n))),Times(C2,p)),x),x),And(FreeQ(List(a,b,c,d,e,n),x),EqQ($s("n2"),Times(C2,n)),EqQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),Not(IntegerQ(p))))),
IIntegrate(3685,Int(Power(Plus(Times(Power($($s("§cot"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT),b_DEFAULT),Times(Power($($s("§cot"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2",true)),c_DEFAULT),a_),p_),x_Symbol),
    Condition(Dist(Times(Power(Plus(a,Times(b,Power(Cot(Plus(d,Times(e,x))),n)),Times(c,Power(Cot(Plus(d,Times(e,x))),Times(C2,n)))),p),Power(Power(Plus(b,Times(C2,c,Power(Cot(Plus(d,Times(e,x))),n))),Times(C2,p)),-1)),Int(Power(Plus(b,Times(C2,c,Power(Cot(Plus(d,Times(e,x))),n))),Times(C2,p)),x),x),And(FreeQ(List(a,b,c,d,e,n),x),EqQ($s("n2"),Times(C2,n)),EqQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),Not(IntegerQ(p))))),
IIntegrate(3686,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power($($s("§tan"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT)),Times(c_DEFAULT,Power($($s("§tan"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2",true)))),-1),x_Symbol),
    Condition(Module(List(Set(q,Rt(Plus(Sqr(b),Times(CN1,C4,a,c)),C2))),Plus(Dist(Times(C2,c,Power(q,-1)),Int(Power(Plus(b,Negate(q),Times(C2,c,Power(Tan(Plus(d,Times(e,x))),n))),-1),x),x),Negate(Dist(Times(C2,c,Power(q,-1)),Int(Power(Plus(b,q,Times(C2,c,Power(Tan(Plus(d,Times(e,x))),n))),-1),x),x)))),And(FreeQ(List(a,b,c,d,e,n),x),EqQ($s("n2"),Times(C2,n)),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0)))),
IIntegrate(3687,Int(Power(Plus(a_DEFAULT,Times(Power($($s("§cot"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT),b_DEFAULT),Times(Power($($s("§cot"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2",true)),c_DEFAULT)),-1),x_Symbol),
    Condition(Module(List(Set(q,Rt(Plus(Sqr(b),Times(CN1,C4,a,c)),C2))),Plus(Dist(Times(C2,c,Power(q,-1)),Int(Power(Plus(b,Negate(q),Times(C2,c,Power(Cot(Plus(d,Times(e,x))),n))),-1),x),x),Negate(Dist(Times(C2,c,Power(q,-1)),Int(Power(Plus(b,q,Times(C2,c,Power(Cot(Plus(d,Times(e,x))),n))),-1),x),x)))),And(FreeQ(List(a,b,c,d,e,n),x),EqQ($s("n2"),Times(C2,n)),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0)))),
IIntegrate(3688,Int(Times(Power($($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(Times(f_DEFAULT,$($s("§tan"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))),n_DEFAULT)),Times(c_DEFAULT,Power(Times(f_DEFAULT,$($s("§tan"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))),$p("n2",true)))),p_)),x_Symbol),
    Condition(Dist(Times(f,Power(e,-1)),Subst(Int(Times(Power(x,m),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p),Power(Power(Plus(Sqr(f),Sqr(x)),Plus(Times(C1D2,m),C1)),-1)),x),x,Times(f,Tan(Plus(d,Times(e,x))))),x),And(FreeQ(List(a,b,c,d,e,f,n,p),x),EqQ($s("n2"),Times(C2,n)),IntegerQ(Times(C1D2,m))))),
IIntegrate(3689,Int(Times(Power($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(Times($($s("§cot"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),f_DEFAULT),n_DEFAULT)),Times(c_DEFAULT,Power(Times($($s("§cot"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),f_DEFAULT),$p("n2",true)))),p_)),x_Symbol),
    Condition(Negate(Dist(Times(f,Power(e,-1)),Subst(Int(Times(Power(x,m),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p),Power(Power(Plus(Sqr(f),Sqr(x)),Plus(Times(C1D2,m),C1)),-1)),x),x,Times(f,Cot(Plus(d,Times(e,x))))),x)),And(FreeQ(List(a,b,c,d,e,f,n,p),x),EqQ($s("n2"),Times(C2,n)),IntegerQ(Times(C1D2,m))))),
IIntegrate(3690,Int(Times(Power($($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power($($s("§tan"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT)),Times(c_DEFAULT,Power($($s("§tan"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2",true)))),p_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(g,FreeFactors(Cos(Plus(d,Times(e,x))),x))),Negate(Dist(Times(g,Power(e,-1)),Subst(Int(Times(Power(Plus(C1,Times(CN1,Sqr(g),Sqr(x))),Times(C1D2,Plus(m,Negate(C1)))),Power(ExpandToSum(Plus(Times(a,Power(Times(g,x),Times(C2,n))),Times(b,Power(Times(g,x),n),Power(Plus(C1,Times(CN1,Sqr(g),Sqr(x))),Times(C1D2,n))),Times(c,Power(Plus(C1,Times(CN1,Sqr(g),Sqr(x))),n))),x),p),Power(Power(Times(g,x),Times(C2,n,p)),-1)),x),x,Times(Cos(Plus(d,Times(e,x))),Power(g,-1))),x))),And(FreeQ(List(a,b,c,d,e),x),EqQ($s("n2"),Times(C2,n)),IntegerQ(Times(C1D2,Plus(m,Negate(C1)))),IntegerQ(Times(C1D2,n)),IntegerQ(p)))),
IIntegrate(3691,Int(Times(Power($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_DEFAULT),Power(Plus(a_DEFAULT,Times(Power($($s("§cot"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT),b_DEFAULT),Times(c_DEFAULT,Power($($s("§tan"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2",true)))),p_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(g,FreeFactors(Sin(Plus(d,Times(e,x))),x))),Dist(Times(g,Power(e,-1)),Subst(Int(Times(Power(Plus(C1,Times(CN1,Sqr(g),Sqr(x))),Times(C1D2,Plus(m,Negate(C1)))),Power(ExpandToSum(Plus(Times(a,Power(Times(g,x),Times(C2,n))),Times(b,Power(Times(g,x),n),Power(Plus(C1,Times(CN1,Sqr(g),Sqr(x))),Times(C1D2,n))),Times(c,Power(Plus(C1,Times(CN1,Sqr(g),Sqr(x))),n))),x),p),Power(Power(Times(g,x),Times(C2,n,p)),-1)),x),x,Times(Sin(Plus(d,Times(e,x))),Power(g,-1))),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ($s("n2"),Times(C2,n)),IntegerQ(Times(C1D2,Plus(m,Negate(C1)))),IntegerQ(Times(C1D2,n)),IntegerQ(p)))),
IIntegrate(3692,Int(Times(Power($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(Times(f_DEFAULT,$($s("§tan"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))),n_DEFAULT)),Times(c_DEFAULT,Power(Times(f_DEFAULT,$($s("§tan"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))),$p("n2",true)))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(f,Plus(m,C1)),Power(e,-1)),Subst(Int(Times(Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p),Power(Power(Plus(Sqr(f),Sqr(x)),Plus(Times(C1D2,m),C1)),-1)),x),x,Times(f,Tan(Plus(d,Times(e,x))))),x),And(FreeQ(List(a,b,c,d,e,f,n,p),x),EqQ($s("n2"),Times(C2,n)),IntegerQ(Times(C1D2,m))))),
IIntegrate(3693,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(Times($($s("§cot"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),f_DEFAULT),n_DEFAULT)),Times(c_DEFAULT,Power(Times($($s("§cot"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),f_DEFAULT),$p("n2",true)))),p_DEFAULT),Power($($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_)),x_Symbol),
    Condition(Negate(Dist(Times(Power(f,Plus(m,C1)),Power(e,-1)),Subst(Int(Times(Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p),Power(Power(Plus(Sqr(f),Sqr(x)),Plus(Times(C1D2,m),C1)),-1)),x),x,Times(f,Cot(Plus(d,Times(e,x))))),x)),And(FreeQ(List(a,b,c,d,e,f,n,p),x),EqQ($s("n2"),Times(C2,n)),IntegerQ(Times(C1D2,m))))),
IIntegrate(3694,Int(Times(Power($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power($($s("§tan"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT)),Times(c_DEFAULT,Power($($s("§tan"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2",true)))),p_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(g,FreeFactors(Sin(Plus(d,Times(e,x))),x))),Dist(Times(g,Power(e,-1)),Subst(Int(Times(Power(Plus(C1,Times(CN1,Sqr(g),Sqr(x))),Times(C1D2,Plus(m,Times(CN1,C2,n,p),Negate(C1)))),Power(ExpandToSum(Plus(Times(c,Power(x,Times(C2,n))),Times(b,Power(x,n),Power(Plus(C1,Negate(Sqr(x))),Times(C1D2,n))),Times(a,Power(Plus(C1,Negate(Sqr(x))),n))),x),p)),x),x,Times(Sin(Plus(d,Times(e,x))),Power(g,-1))),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ($s("n2"),Times(C2,n)),IntegerQ(Times(C1D2,Plus(m,Negate(C1)))),IntegerQ(Times(C1D2,n)),IntegerQ(p)))),
IIntegrate(3695,Int(Times(Power(Plus(a_DEFAULT,Times(Power($($s("§cot"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT),b_DEFAULT),Times(Power($($s("§cot"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2",true)),c_DEFAULT)),p_DEFAULT),Power($($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_)),x_Symbol),
    Condition(Module(List(Set(g,FreeFactors(Cos(Plus(d,Times(e,x))),x))),Negate(Dist(Times(g,Power(e,-1)),Subst(Int(Times(Power(Plus(C1,Times(CN1,Sqr(g),Sqr(x))),Times(C1D2,Plus(m,Times(CN1,C2,n,p),Negate(C1)))),Power(ExpandToSum(Plus(Times(c,Power(x,Times(C2,n))),Times(b,Power(x,n),Power(Plus(C1,Negate(Sqr(x))),Times(C1D2,n))),Times(a,Power(Plus(C1,Negate(Sqr(x))),n))),x),p)),x),x,Times(Cos(Plus(d,Times(e,x))),Power(g,-1))),x))),And(FreeQ(List(a,b,c,d,e),x),EqQ($s("n2"),Times(C2,n)),IntegerQ(Times(C1D2,Plus(m,Negate(C1)))),IntegerQ(Times(C1D2,n)),IntegerQ(p)))),
IIntegrate(3696,Int(Times(Power($($s("§tan"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power($($s("§tan"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT)),Times(c_DEFAULT,Power($($s("§tan"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2",true)))),p_)),x_Symbol),
    Condition(Dist(Power(Times(Power(C4,p),Power(c,p)),-1),Int(Times(Power(Tan(Plus(d,Times(e,x))),m),Power(Plus(b,Times(C2,c,Power(Tan(Plus(d,Times(e,x))),n))),Times(C2,p))),x),x),And(FreeQ(List(a,b,c,d,e,m,n),x),EqQ($s("n2"),Times(C2,n)),EqQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),IntegerQ(p)))),
IIntegrate(3697,Int(Times(Power($($s("§cot"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_DEFAULT),Power(Plus(a_DEFAULT,Times(Power($($s("§cot"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT),b_DEFAULT),Times(Power($($s("§cot"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2",true)),c_DEFAULT)),p_)),x_Symbol),
    Condition(Dist(Power(Times(Power(C4,p),Power(c,p)),-1),Int(Times(Power(Cot(Plus(d,Times(e,x))),m),Power(Plus(b,Times(C2,c,Power(Cot(Plus(d,Times(e,x))),n))),Times(C2,p))),x),x),And(FreeQ(List(a,b,c,d,e,m,n),x),EqQ($s("n2"),Times(C2,n)),EqQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),IntegerQ(p)))),
IIntegrate(3698,Int(Times(Power($($s("§tan"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power($($s("§tan"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT)),Times(c_DEFAULT,Power($($s("§tan"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2",true)))),p_)),x_Symbol),
    Condition(Dist(Times(Power(Plus(a,Times(b,Power(Tan(Plus(d,Times(e,x))),n)),Times(c,Power(Tan(Plus(d,Times(e,x))),Times(C2,n)))),p),Power(Power(Plus(b,Times(C2,c,Power(Tan(Plus(d,Times(e,x))),n))),Times(C2,p)),-1)),Int(Times(Power(Tan(Plus(d,Times(e,x))),m),Power(Plus(b,Times(C2,c,Power(Tan(Plus(d,Times(e,x))),n))),Times(C2,p))),x),x),And(FreeQ(List(a,b,c,d,e,m,n,p),x),EqQ($s("n2"),Times(C2,n)),EqQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),Not(IntegerQ(p))))),
IIntegrate(3699,Int(Times(Power($($s("§cot"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_DEFAULT),Power(Plus(a_DEFAULT,Times(Power($($s("§cot"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT),b_DEFAULT),Times(Power($($s("§cot"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2",true)),c_DEFAULT)),p_)),x_Symbol),
    Condition(Dist(Times(Power(Plus(a,Times(b,Power(Cot(Plus(d,Times(e,x))),n)),Times(c,Power(Cot(Plus(d,Times(e,x))),Times(C2,n)))),p),Power(Power(Plus(b,Times(C2,c,Power(Cot(Plus(d,Times(e,x))),n))),Times(C2,p)),-1)),Int(Times(Power(Cot(Plus(d,Times(e,x))),m),Power(Plus(b,Times(C2,c,Power(Cot(Plus(d,Times(e,x))),n))),Times(C2,p))),x),x),And(FreeQ(List(a,b,c,d,e,m,n,p),x),EqQ($s("n2"),Times(C2,n)),EqQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),Not(IntegerQ(p))))),
IIntegrate(3700,Int(Times(Power($($s("§tan"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(Times(f_DEFAULT,$($s("§tan"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))),n_DEFAULT)),Times(c_DEFAULT,Power(Times(f_DEFAULT,$($s("§tan"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))),$p("n2",true)))),p_)),x_Symbol),
    Condition(Dist(Times(f,Power(e,-1)),Subst(Int(Times(Power(Times(x,Power(f,-1)),m),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p),Power(Plus(Sqr(f),Sqr(x)),-1)),x),x,Times(f,Tan(Plus(d,Times(e,x))))),x),And(FreeQ(List(a,b,c,d,e,f,m,n,p),x),EqQ($s("n2"),Times(C2,n)),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0))))
  );
}
