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
import static org.matheclipse.core.expression.F.CN1D2;
import static org.matheclipse.core.expression.F.CN2;
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
import static org.matheclipse.core.expression.F.QQ;
import static org.matheclipse.core.expression.F.Sec;
import static org.matheclipse.core.expression.F.Set;
import static org.matheclipse.core.expression.F.Sin;
import static org.matheclipse.core.expression.F.Sqr;
import static org.matheclipse.core.expression.F.Sqrt;
import static org.matheclipse.core.expression.F.Tan;
import static org.matheclipse.core.expression.F.Times;
import static org.matheclipse.core.expression.F.With;
import static org.matheclipse.core.expression.F.a;
import static org.matheclipse.core.expression.F.a_;
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
import static org.matheclipse.core.expression.F.m;
import static org.matheclipse.core.expression.F.m_;
import static org.matheclipse.core.expression.F.m_DEFAULT;
import static org.matheclipse.core.expression.F.n;
import static org.matheclipse.core.expression.F.n_;
import static org.matheclipse.core.expression.F.n_DEFAULT;
import static org.matheclipse.core.expression.F.p;
import static org.matheclipse.core.expression.F.p_;
import static org.matheclipse.core.expression.F.p_DEFAULT;
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
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Simp;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Subst;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Unintegrable;

/** 
 * IndefiniteIntegrationRules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class IntRules82 { 
  public static IAST RULES = List( 
IIntegrate(4101,Int(Times(Plus(A_DEFAULT,Times(Sqr($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),C_DEFAULT)),Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),n_),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_)),x_Symbol),
    Condition(Plus(Simp(Times(Plus(Times(ASymbol,Sqr(b)),Times(Sqr(a),CSymbol)),Cot(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(d,Csc(Plus(e,Times(f,x)))),n),Power(Times(a,f,Plus(m,C1),Plus(Sqr(a),Negate(Sqr(b)))),-1)),x),Dist(Power(Times(a,Plus(m,C1),Plus(Sqr(a),Negate(Sqr(b)))),-1),Int(Times(Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(d,Csc(Plus(e,Times(f,x)))),n),Simp(Plus(Times(Sqr(a),Plus(ASymbol,CSymbol),Plus(m,C1)),Times(CN1,Plus(Times(ASymbol,Sqr(b)),Times(Sqr(a),CSymbol)),Plus(m,n,C1)),Times(CN1,a,b,Plus(ASymbol,CSymbol),Plus(m,C1),Csc(Plus(e,Times(f,x)))),Times(Plus(Times(ASymbol,Sqr(b)),Times(Sqr(a),CSymbol)),Plus(m,n,C2),Sqr(Csc(Plus(e,Times(f,x)))))),x)),x),x)),And(FreeQ(List(a,b,d,e,f,ASymbol,CSymbol,n),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),LtQ(m,CN1),Not(And(ILtQ(Plus(m,C1D2),C0),ILtQ(n,C0)))))),
IIntegrate(4102,Int(Times(Plus(A_DEFAULT,Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),B_DEFAULT),Times(Sqr($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),C_DEFAULT)),Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),n_),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(CSymbol,d,Cot(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(d,Csc(Plus(e,Times(f,x)))),Plus(n,Negate(C1))),Power(Times(b,f,Plus(m,n,C1)),-1)),x)),Dist(Times(d,Power(Times(b,Plus(m,n,C1)),-1)),Int(Times(Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),m),Power(Times(d,Csc(Plus(e,Times(f,x)))),Plus(n,Negate(C1))),Simp(Plus(Times(a,CSymbol,Plus(n,Negate(C1))),Times(Plus(Times(ASymbol,b,Plus(m,n,C1)),Times(b,CSymbol,Plus(m,n))),Csc(Plus(e,Times(f,x)))),Times(Plus(Times(b,BSymbol,Plus(m,n,C1)),Times(CN1,a,CSymbol,n)),Sqr(Csc(Plus(e,Times(f,x)))))),x)),x),x)),And(FreeQ(List(a,b,d,e,f,ASymbol,BSymbol,CSymbol,m),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),GtQ(n,C0)))),
IIntegrate(4103,Int(Times(Plus(A_DEFAULT,Times(Sqr($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),C_DEFAULT)),Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),n_),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(CSymbol,d,Cot(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(d,Csc(Plus(e,Times(f,x)))),Plus(n,Negate(C1))),Power(Times(b,f,Plus(m,n,C1)),-1)),x)),Dist(Times(d,Power(Times(b,Plus(m,n,C1)),-1)),Int(Times(Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),m),Power(Times(d,Csc(Plus(e,Times(f,x)))),Plus(n,Negate(C1))),Simp(Plus(Times(a,CSymbol,Plus(n,Negate(C1))),Times(Plus(Times(ASymbol,b,Plus(m,n,C1)),Times(b,CSymbol,Plus(m,n))),Csc(Plus(e,Times(f,x)))),Times(CN1,a,CSymbol,n,Sqr(Csc(Plus(e,Times(f,x)))))),x)),x),x)),And(FreeQ(List(a,b,d,e,f,ASymbol,CSymbol,m),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),GtQ(n,C0)))),
IIntegrate(4104,Int(Times(Plus(A_DEFAULT,Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),B_DEFAULT),Times(Sqr($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),C_DEFAULT)),Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),n_),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_)),x_Symbol),
    Condition(Plus(Simp(Times(ASymbol,Cot(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(d,Csc(Plus(e,Times(f,x)))),n),Power(Times(a,f,n),-1)),x),Dist(Power(Times(a,d,n),-1),Int(Times(Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),m),Power(Times(d,Csc(Plus(e,Times(f,x)))),Plus(n,C1)),Simp(Plus(Times(a,BSymbol,n),Times(CN1,ASymbol,b,Plus(m,n,C1)),Times(a,Plus(ASymbol,Times(ASymbol,n),Times(CSymbol,n)),Csc(Plus(e,Times(f,x)))),Times(ASymbol,b,Plus(m,n,C2),Sqr(Csc(Plus(e,Times(f,x)))))),x)),x),x)),And(FreeQ(List(a,b,d,e,f,ASymbol,BSymbol,CSymbol,m),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),LeQ(n,CN1)))),
IIntegrate(4105,Int(Times(Plus(A_DEFAULT,Times(Sqr($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),C_DEFAULT)),Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),n_),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_)),x_Symbol),
    Condition(Plus(Simp(Times(ASymbol,Cot(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(d,Csc(Plus(e,Times(f,x)))),n),Power(Times(a,f,n),-1)),x),Dist(Power(Times(a,d,n),-1),Int(Times(Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),m),Power(Times(d,Csc(Plus(e,Times(f,x)))),Plus(n,C1)),Simp(Plus(Times(CN1,ASymbol,b,Plus(m,n,C1)),Times(a,Plus(ASymbol,Times(ASymbol,n),Times(CSymbol,n)),Csc(Plus(e,Times(f,x)))),Times(ASymbol,b,Plus(m,n,C2),Sqr(Csc(Plus(e,Times(f,x)))))),x)),x),x)),And(FreeQ(List(a,b,d,e,f,ASymbol,CSymbol,m),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),LeQ(n,CN1)))),
IIntegrate(4106,Int(Times(Plus(A_DEFAULT,Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),B_DEFAULT),Times(Sqr($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),C_DEFAULT)),Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),CN1D2),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),-1)),x_Symbol),
    Condition(Plus(Dist(Times(Plus(Times(ASymbol,Sqr(b)),Times(CN1,a,b,BSymbol),Times(Sqr(a),CSymbol)),Power(Times(Sqr(a),Sqr(d)),-1)),Int(Times(Power(Times(d,Csc(Plus(e,Times(f,x)))),QQ(3L,2L)),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),-1)),x),x),Dist(Power(a,-2),Int(Times(Plus(Times(a,ASymbol),Times(CN1,Plus(Times(ASymbol,b),Times(CN1,a,BSymbol)),Csc(Plus(e,Times(f,x))))),Power(Times(d,Csc(Plus(e,Times(f,x)))),CN1D2)),x),x)),And(FreeQ(List(a,b,d,e,f,ASymbol,BSymbol,CSymbol),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0)))),
IIntegrate(4107,Int(Times(Plus(A_DEFAULT,Times(Sqr($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),C_DEFAULT)),Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),CN1D2),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),-1)),x_Symbol),
    Condition(Plus(Dist(Times(Plus(Times(ASymbol,Sqr(b)),Times(Sqr(a),CSymbol)),Power(Times(Sqr(a),Sqr(d)),-1)),Int(Times(Power(Times(d,Csc(Plus(e,Times(f,x)))),QQ(3L,2L)),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),-1)),x),x),Dist(Power(a,-2),Int(Times(Plus(Times(a,ASymbol),Times(CN1,ASymbol,b,Csc(Plus(e,Times(f,x))))),Power(Times(d,Csc(Plus(e,Times(f,x)))),CN1D2)),x),x)),And(FreeQ(List(a,b,d,e,f,ASymbol,CSymbol),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0)))),
IIntegrate(4108,Int(Times(Plus(A_DEFAULT,Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),B_DEFAULT),Times(Sqr($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),C_DEFAULT)),Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),CN1D2),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),CN1D2)),x_Symbol),
    Condition(Plus(Dist(Times(CSymbol,Power(d,-2)),Int(Times(Power(Times(d,Csc(Plus(e,Times(f,x)))),QQ(3L,2L)),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),CN1D2)),x),x),Int(Times(Plus(ASymbol,Times(BSymbol,Csc(Plus(e,Times(f,x))))),Power(Times(Sqrt(Times(d,Csc(Plus(e,Times(f,x))))),Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))))),-1)),x)),And(FreeQ(List(a,b,d,e,f,ASymbol,BSymbol,CSymbol),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0)))),
IIntegrate(4109,Int(Times(Plus(A_DEFAULT,Times(Sqr($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),C_DEFAULT)),Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),CN1D2),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),CN1D2)),x_Symbol),
    Condition(Plus(Dist(Times(CSymbol,Power(d,-2)),Int(Times(Power(Times(d,Csc(Plus(e,Times(f,x)))),QQ(3L,2L)),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),CN1D2)),x),x),Dist(ASymbol,Int(Power(Times(Sqrt(Times(d,Csc(Plus(e,Times(f,x))))),Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))))),-1),x),x)),And(FreeQ(List(a,b,d,e,f,ASymbol,CSymbol),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0)))),
IIntegrate(4110,Int(Times(Plus(A_DEFAULT,Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),B_DEFAULT),Times(Sqr($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),C_DEFAULT)),Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),n_DEFAULT),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_DEFAULT)),x_Symbol),
    Condition(Unintegrable(Times(Power(Times(d,Csc(Plus(e,Times(f,x)))),n),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),m),Plus(ASymbol,Times(BSymbol,Csc(Plus(e,Times(f,x)))),Times(CSymbol,Sqr(Csc(Plus(e,Times(f,x))))))),x),FreeQ(List(a,b,d,e,f,ASymbol,BSymbol,CSymbol,m,n),x))),
IIntegrate(4111,Int(Times(Plus(A_DEFAULT,Times(Sqr($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),C_DEFAULT)),Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),n_DEFAULT),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_DEFAULT)),x_Symbol),
    Condition(Unintegrable(Times(Power(Times(d,Csc(Plus(e,Times(f,x)))),n),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),m),Plus(ASymbol,Times(CSymbol,Sqr(Csc(Plus(e,Times(f,x))))))),x),FreeQ(List(a,b,d,e,f,ASymbol,CSymbol,m,n),x))),
IIntegrate(4112,Int(Times(Power(Times($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),n_),Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT),Plus(A_DEFAULT,Times(B_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),Times(C_DEFAULT,Sqr($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),x_Symbol),
    Condition(Dist(Power(d,Plus(m,C2)),Int(Times(Power(Plus(b,Times(a,Cos(Plus(e,Times(f,x))))),m),Power(Times(d,Cos(Plus(e,Times(f,x)))),Plus(n,Negate(m),Negate(C2))),Plus(CSymbol,Times(BSymbol,Cos(Plus(e,Times(f,x)))),Times(ASymbol,Sqr(Cos(Plus(e,Times(f,x))))))),x),x),And(FreeQ(List(a,b,d,e,f,ASymbol,BSymbol,CSymbol,n),x),Not(IntegerQ(n)),IntegerQ(m)))),
IIntegrate(4113,Int(Times(Plus(A_DEFAULT,Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),B_DEFAULT),Times(Sqr($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),C_DEFAULT)),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_DEFAULT),Power(Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Dist(Power(d,Plus(m,C2)),Int(Times(Power(Plus(b,Times(a,Sin(Plus(e,Times(f,x))))),m),Power(Times(d,Sin(Plus(e,Times(f,x)))),Plus(n,Negate(m),Negate(C2))),Plus(CSymbol,Times(BSymbol,Sin(Plus(e,Times(f,x)))),Times(ASymbol,Sqr(Sin(Plus(e,Times(f,x))))))),x),x),And(FreeQ(List(a,b,d,e,f,ASymbol,BSymbol,CSymbol,n),x),Not(IntegerQ(n)),IntegerQ(m)))),
IIntegrate(4114,Int(Times(Power(Times($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),n_),Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT),Plus(A_DEFAULT,Times(C_DEFAULT,Sqr($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),x_Symbol),
    Condition(Dist(Power(d,Plus(m,C2)),Int(Times(Power(Plus(b,Times(a,Cos(Plus(e,Times(f,x))))),m),Power(Times(d,Cos(Plus(e,Times(f,x)))),Plus(n,Negate(m),Negate(C2))),Plus(CSymbol,Times(ASymbol,Sqr(Cos(Plus(e,Times(f,x))))))),x),x),And(FreeQ(List(a,b,d,e,f,ASymbol,CSymbol,n),x),Not(IntegerQ(n)),IntegerQ(m)))),
IIntegrate(4115,Int(Times(Plus(A_DEFAULT,Times(Sqr($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),C_DEFAULT)),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_DEFAULT),Power(Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Dist(Power(d,Plus(m,C2)),Int(Times(Power(Plus(b,Times(a,Sin(Plus(e,Times(f,x))))),m),Power(Times(d,Sin(Plus(e,Times(f,x)))),Plus(n,Negate(m),Negate(C2))),Plus(CSymbol,Times(ASymbol,Sqr(Sin(Plus(e,Times(f,x))))))),x),x),And(FreeQ(List(a,b,d,e,f,ASymbol,CSymbol,n),x),Not(IntegerQ(n)),IntegerQ(m)))),
IIntegrate(4116,Int(Times(Power(Times(c_DEFAULT,Power(Times(d_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),p_)),n_),Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT),Plus(A_DEFAULT,Times(B_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),Times(C_DEFAULT,Sqr($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),x_Symbol),
    Condition(Dist(Times(Power(c,IntPart(n)),Power(Times(c,Power(Times(d,Sec(Plus(e,Times(f,x)))),p)),FracPart(n)),Power(Power(Times(d,Sec(Plus(e,Times(f,x)))),Times(p,FracPart(n))),-1)),Int(Times(Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),m),Power(Times(d,Sec(Plus(e,Times(f,x)))),Times(n,p)),Plus(ASymbol,Times(BSymbol,Sec(Plus(e,Times(f,x)))),Times(CSymbol,Sqr(Sec(Plus(e,Times(f,x))))))),x),x),And(FreeQ(List(a,b,c,d,e,f,ASymbol,BSymbol,CSymbol,m,n,p),x),Not(IntegerQ(n))))),
IIntegrate(4117,Int(Times(Plus(A_DEFAULT,Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),B_DEFAULT),Times(Sqr($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),C_DEFAULT)),Power(Times(c_DEFAULT,Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),p_)),n_),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(c,IntPart(n)),Power(Times(c,Power(Times(d,Csc(Plus(e,Times(f,x)))),p)),FracPart(n)),Power(Power(Times(d,Csc(Plus(e,Times(f,x)))),Times(p,FracPart(n))),-1)),Int(Times(Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),m),Power(Times(d,Csc(Plus(e,Times(f,x)))),Times(n,p)),Plus(ASymbol,Times(BSymbol,Csc(Plus(e,Times(f,x)))),Times(CSymbol,Sqr(Csc(Plus(e,Times(f,x))))))),x),x),And(FreeQ(List(a,b,c,d,e,f,ASymbol,BSymbol,CSymbol,m,n,p),x),Not(IntegerQ(n))))),
IIntegrate(4118,Int(Times(Power(Times(c_DEFAULT,Power(Times(d_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),p_)),n_),Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT),Plus(A_DEFAULT,Times(C_DEFAULT,Sqr($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),x_Symbol),
    Condition(Dist(Times(Power(c,IntPart(n)),Power(Times(c,Power(Times(d,Sec(Plus(e,Times(f,x)))),p)),FracPart(n)),Power(Power(Times(d,Sec(Plus(e,Times(f,x)))),Times(p,FracPart(n))),-1)),Int(Times(Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),m),Power(Times(d,Sec(Plus(e,Times(f,x)))),Times(n,p)),Plus(ASymbol,Times(CSymbol,Sqr(Sec(Plus(e,Times(f,x))))))),x),x),And(FreeQ(List(a,b,c,d,e,f,ASymbol,CSymbol,m,n,p),x),Not(IntegerQ(n))))),
IIntegrate(4119,Int(Times(Plus(A_DEFAULT,Times(Sqr($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),C_DEFAULT)),Power(Times(c_DEFAULT,Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),p_)),n_),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(c,IntPart(n)),Power(Times(c,Power(Times(d,Csc(Plus(e,Times(f,x)))),p)),FracPart(n)),Power(Power(Times(d,Csc(Plus(e,Times(f,x)))),Times(p,FracPart(n))),-1)),Int(Times(Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),m),Power(Times(d,Csc(Plus(e,Times(f,x)))),Times(n,p)),Plus(ASymbol,Times(CSymbol,Sqr(Csc(Plus(e,Times(f,x))))))),x),x),And(FreeQ(List(a,b,c,d,e,f,ASymbol,CSymbol,m,n,p),x),Not(IntegerQ(n))))),
IIntegrate(4120,Int(Times(u_DEFAULT,Power(Plus(a_,Times(b_DEFAULT,Sqr($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),p_)),x_Symbol),
    Condition(Dist(Power(b,p),Int(ActivateTrig(Times(u,Power($($s("§tan"),Plus(e,Times(f,x))),Times(C2,p)))),x),x),And(FreeQ(List(a,b,e,f,p),x),EqQ(Plus(a,b),C0),IntegerQ(p)))),
IIntegrate(4121,Int(Times(u_DEFAULT,Power(Plus(a_,Times(b_DEFAULT,Sqr($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),p_)),x_Symbol),
    Condition(Int(ActivateTrig(Times(u,Power(Times(b,Sqr($($s("§tan"),Plus(e,Times(f,x))))),p))),x),And(FreeQ(List(a,b,e,f,p),x),EqQ(Plus(a,b),C0)))),
IIntegrate(4122,Int(Power(Times(b_DEFAULT,Sqr($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),p_),x_Symbol),
    Condition(With(List(Set($s("ff"),FreeFactors(Tan(Plus(e,Times(f,x))),x))),Dist(Times(b,$s("ff"),Power(f,-1)),Subst(Int(Power(Plus(b,Times(b,Sqr($s("ff")),Sqr(x))),Plus(p,Negate(C1))),x),x,Times(Tan(Plus(e,Times(f,x))),Power($s("ff"),-1))),x)),And(FreeQ(List(b,e,f,p),x),Not(IntegerQ(p))))),
IIntegrate(4123,Int(Power(Times(b_DEFAULT,Power(Times(c_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),p_),x_Symbol),
    Condition(Dist(Times(Power(b,IntPart(p)),Power(Times(b,Power(Times(c,Sec(Plus(e,Times(f,x)))),n)),FracPart(p)),Power(Power(Times(c,Sec(Plus(e,Times(f,x)))),Times(n,FracPart(p))),-1)),Int(Power(Times(c,Sec(Plus(e,Times(f,x)))),Times(n,p)),x),x),And(FreeQ(List(b,c,e,f,n,p),x),Not(IntegerQ(p))))),
IIntegrate(4124,Int(Times(Power(Times(b_DEFAULT,Sqr($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),p_DEFAULT),Power($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),m_DEFAULT)),x_Symbol),
    Condition(Dist(Times(b,Power(Times(C2,f),-1)),Subst(Int(Times(Power(Plus(CN1,x),Times(C1D2,Plus(m,Negate(C1)))),Power(Times(b,x),Plus(p,Negate(C1)))),x),x,Sqr(Sec(Plus(e,Times(f,x))))),x),And(FreeQ(List(b,e,f,p),x),Not(IntegerQ(p)),IntegerQ(Times(C1D2,Plus(m,Negate(C1))))))),
IIntegrate(4125,Int(Times(u_DEFAULT,Power(Times(b_DEFAULT,Power($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),n_)),p_)),x_Symbol),
    Condition(With(List(Set($s("ff"),FreeFactors(Sec(Plus(e,Times(f,x))),x))),Dist(Times(Power(Times(b,Power($s("ff"),n)),IntPart(p)),Power(Times(b,Power(Sec(Plus(e,Times(f,x))),n)),FracPart(p)),Power(Power(Times(Sec(Plus(e,Times(f,x))),Power($s("ff"),-1)),Times(n,FracPart(p))),-1)),Int(Times(ActivateTrig(u),Power(Times(Sec(Plus(e,Times(f,x))),Power($s("ff"),-1)),Times(n,p))),x),x)),And(FreeQ(List(b,e,f,n,p),x),Not(IntegerQ(p)),IntegerQ(n),Or(EqQ(u,C1),MatchQ(u,Condition(Power(Times(d_DEFAULT,$($p("§trig"),Plus(e,Times(f,x)))),m_DEFAULT),And(FreeQ(List(d,m),x),MemberQ(List($s("§sin"),$s("§cos"),$s("§tan"),$s("§cot"),$s("§sec"),$s("§csc")),$s("§trig"))))))))),
IIntegrate(4126,Int(Times(u_DEFAULT,Power(Times(b_DEFAULT,Power(Times(c_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),p_)),x_Symbol),
    Condition(Dist(Times(Power(b,IntPart(p)),Power(Times(b,Power(Times(c,Sec(Plus(e,Times(f,x)))),n)),FracPart(p)),Power(Power(Times(c,Sec(Plus(e,Times(f,x)))),Times(n,FracPart(p))),-1)),Int(Times(ActivateTrig(u),Power(Times(c,Sec(Plus(e,Times(f,x)))),Times(n,p))),x),x),And(FreeQ(List(b,c,e,f,n,p),x),Not(IntegerQ(p)),Not(IntegerQ(n)),Or(EqQ(u,C1),MatchQ(u,Condition(Power(Times(d_DEFAULT,$($p("§trig"),Plus(e,Times(f,x)))),m_DEFAULT),And(FreeQ(List(d,m),x),MemberQ(List($s("§sin"),$s("§cos"),$s("§tan"),$s("§cot"),$s("§sec"),$s("§csc")),$s("§trig"))))))))),
IIntegrate(4127,Int(Power(Plus(a_,Times(b_DEFAULT,Sqr($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),-1),x_Symbol),
    Condition(Plus(Simp(Times(x,Power(a,-1)),x),Negate(Dist(Times(b,Power(a,-1)),Int(Power(Plus(b,Times(a,Sqr(Cos(Plus(e,Times(f,x)))))),-1),x),x))),And(FreeQ(List(a,b,e,f),x),NeQ(Plus(a,b),C0)))),
IIntegrate(4128,Int(Power(Plus(a_,Times(b_DEFAULT,Sqr($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),p_),x_Symbol),
    Condition(With(List(Set($s("ff"),FreeFactors(Tan(Plus(e,Times(f,x))),x))),Dist(Times($s("ff"),Power(f,-1)),Subst(Int(Times(Power(Plus(a,b,Times(b,Sqr($s("ff")),Sqr(x))),p),Power(Plus(C1,Times(Sqr($s("ff")),Sqr(x))),-1)),x),x,Times(Tan(Plus(e,Times(f,x))),Power($s("ff"),-1))),x)),And(FreeQ(List(a,b,e,f,p),x),NeQ(Plus(a,b),C0),NeQ(p,CN1)))),
IIntegrate(4129,Int(Power(Plus(a_,Times(b_DEFAULT,Power($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),4))),p_),x_Symbol),
    Condition(With(List(Set($s("ff"),FreeFactors(Tan(Plus(e,Times(f,x))),x))),Dist(Times($s("ff"),Power(f,-1)),Subst(Int(Times(Power(Plus(a,b,Times(C2,b,Sqr($s("ff")),Sqr(x)),Times(b,Power($s("ff"),4),Power(x,4))),p),Power(Plus(C1,Times(Sqr($s("ff")),Sqr(x))),-1)),x),x,Times(Tan(Plus(e,Times(f,x))),Power($s("ff"),-1))),x)),And(FreeQ(List(a,b,e,f,p),x),IntegerQ(Times(C2,p))))),
IIntegrate(4130,Int(Power(Plus(a_,Times(b_DEFAULT,Power($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),n_))),p_),x_Symbol),
    Condition(With(List(Set($s("ff"),FreeFactors(Tan(Plus(e,Times(f,x))),x))),Dist(Times($s("ff"),Power(f,-1)),Subst(Int(Times(Power(Plus(a,Times(b,Power(Plus(C1,Times(Sqr($s("ff")),Sqr(x))),Times(C1D2,n)))),p),Power(Plus(C1,Times(Sqr($s("ff")),Sqr(x))),-1)),x),x,Times(Tan(Plus(e,Times(f,x))),Power($s("ff"),-1))),x)),And(FreeQ(List(a,b,e,f,p),x),IntegerQ(Times(C1D2,n)),IGtQ(p,CN2)))),
IIntegrate(4131,Int(Power(Plus(a_,Times(b_DEFAULT,Power(Times(c_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_))),p_),x_Symbol),
    Condition(Unintegrable(Power(Plus(a,Times(b,Power(Times(c,Sec(Plus(e,Times(f,x)))),n))),p),x),FreeQ(List(a,b,c,e,f,n,p),x))),
IIntegrate(4132,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),n_))),p_DEFAULT),Power($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),m_)),x_Symbol),
    Condition(With(List(Set($s("ff"),FreeFactors(Tan(Plus(e,Times(f,x))),x))),Dist(Times(Power($s("ff"),Plus(m,C1)),Power(f,-1)),Subst(Int(Times(Power(x,m),Power(ExpandToSum(Plus(a,Times(b,Power(Plus(C1,Times(Sqr($s("ff")),Sqr(x))),Times(C1D2,n)))),x),p),Power(Power(Plus(C1,Times(Sqr($s("ff")),Sqr(x))),Plus(Times(C1D2,m),C1)),-1)),x),x,Times(Tan(Plus(e,Times(f,x))),Power($s("ff"),-1))),x)),And(FreeQ(List(a,b,e,f,p),x),IntegerQ(Times(C1D2,m)),IntegerQ(Times(C1D2,n))))),
IIntegrate(4133,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),n_))),p_DEFAULT),Power($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),m_DEFAULT)),x_Symbol),
    Condition(With(List(Set($s("ff"),FreeFactors(Cos(Plus(e,Times(f,x))),x))),Negate(Dist(Times($s("ff"),Power(f,-1)),Subst(Int(Times(Power(Plus(C1,Times(CN1,Sqr($s("ff")),Sqr(x))),Times(C1D2,Plus(m,Negate(C1)))),Power(Plus(b,Times(a,Power(Times($s("ff"),x),n))),p),Power(Power(Times($s("ff"),x),Times(n,p)),-1)),x),x,Times(Cos(Plus(e,Times(f,x))),Power($s("ff"),-1))),x))),And(FreeQ(List(a,b,e,f),x),IntegerQ(Times(C1D2,Plus(m,Negate(C1)))),IntegerQ(n),IntegerQ(p)))),
IIntegrate(4134,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(Times(c_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_))),p_DEFAULT),Power($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),m_DEFAULT)),x_Symbol),
    Condition(With(List(Set($s("ff"),FreeFactors(Cos(Plus(e,Times(f,x))),x))),Dist(Power(Times(f,Power($s("ff"),m)),-1),Subst(Int(Times(Power(Plus(CN1,Times(Sqr($s("ff")),Sqr(x))),Times(C1D2,Plus(m,Negate(C1)))),Power(Plus(a,Times(b,Power(Times(c,$s("ff"),x),n))),p),Power(Power(x,Plus(m,C1)),-1)),x),x,Times(Sec(Plus(e,Times(f,x))),Power($s("ff"),-1))),x)),And(FreeQ(List(a,b,c,e,f,n,p),x),IntegerQ(Times(C1D2,Plus(m,Negate(C1)))),Or(GtQ(m,C0),EqQ(n,C2),EqQ(n,C4))))),
IIntegrate(4135,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(Times(c_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_))),p_DEFAULT),Power(Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_DEFAULT)),x_Symbol),
    Condition(Unintegrable(Times(Power(Plus(a,Times(b,Power(Times(c,Sec(Plus(e,Times(f,x)))),n))),p),Power(Times(d,Sin(Plus(e,Times(f,x)))),m)),x),FreeQ(List(a,b,c,d,e,f,m,n,p),x))),
IIntegrate(4136,Int(Times(Power(Times($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),m_),Power(Plus(a_,Times(b_DEFAULT,Power($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),n_DEFAULT))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Power(d,Times(n,p)),Int(Times(Power(Times(d,Cos(Plus(e,Times(f,x)))),Plus(m,Times(CN1,n,p))),Power(Plus(b,Times(a,Power(Cos(Plus(e,Times(f,x))),n))),p)),x),x),And(FreeQ(List(a,b,d,e,f,m,n,p),x),Not(IntegerQ(m)),IntegersQ(n,p)))),
IIntegrate(4137,Int(Times(Power(Times($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),m_),Power(Plus(a_,Times(b_DEFAULT,Power(Times(c_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_))),p_)),x_Symbol),
    Condition(Dist(Times(Power(Times(d,Cos(Plus(e,Times(f,x)))),FracPart(m)),Power(Times(Sec(Plus(e,Times(f,x))),Power(d,-1)),FracPart(m))),Int(Times(Power(Plus(a,Times(b,Power(Times(c,Sec(Plus(e,Times(f,x)))),n))),p),Power(Power(Times(Sec(Plus(e,Times(f,x))),Power(d,-1)),m),-1)),x),x),And(FreeQ(List(a,b,c,d,e,f,m,n,p),x),Not(IntegerQ(m))))),
IIntegrate(4138,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),n_))),p_DEFAULT),Power($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),m_DEFAULT)),x_Symbol),
    Condition(Module(List(Set($s("ff"),FreeFactors(Cos(Plus(e,Times(f,x))),x))),Negate(Dist(Power(Times(f,Power($s("ff"),Plus(m,Times(n,p),Negate(C1)))),-1),Subst(Int(Times(Power(Plus(C1,Times(CN1,Sqr($s("ff")),Sqr(x))),Times(C1D2,Plus(m,Negate(C1)))),Power(Plus(b,Times(a,Power(Times($s("ff"),x),n))),p),Power(Power(x,Plus(m,Times(n,p))),-1)),x),x,Times(Cos(Plus(e,Times(f,x))),Power($s("ff"),-1))),x))),And(FreeQ(List(a,b,e,f,n),x),IntegerQ(Times(C1D2,Plus(m,Negate(C1)))),IntegerQ(n),IntegerQ(p)))),
IIntegrate(4139,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(Times(c_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_))),p_DEFAULT),Power($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),m_DEFAULT)),x_Symbol),
    Condition(With(List(Set($s("ff"),FreeFactors(Sec(Plus(e,Times(f,x))),x))),Dist(Power(f,-1),Subst(Int(Times(Power(Plus(CN1,Times(Sqr($s("ff")),Sqr(x))),Times(C1D2,Plus(m,Negate(C1)))),Power(Plus(a,Times(b,Power(Times(c,$s("ff"),x),n))),p),Power(x,-1)),x),x,Times(Sec(Plus(e,Times(f,x))),Power($s("ff"),-1))),x)),And(FreeQ(List(a,b,c,e,f,n,p),x),IntegerQ(Times(C1D2,Plus(m,Negate(C1)))),Or(GtQ(m,C0),EqQ(n,C2),EqQ(n,C4),IGtQ(p,C0),IntegersQ(Times(C2,n),p))))),
IIntegrate(4140,Int(Times(Power(Times(b_DEFAULT,Sqr($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),p_DEFAULT),Power(Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_)),x_Symbol),
    Condition(With(List(Set($s("ff"),FreeFactors(Tan(Plus(e,Times(f,x))),x))),Dist(Times(b,$s("ff"),Power(f,-1)),Subst(Int(Times(Power(Times(d,$s("ff"),x),m),Power(Plus(b,Times(b,Sqr($s("ff")),Sqr(x))),Plus(p,Negate(C1)))),x),x,Times(Tan(Plus(e,Times(f,x))),Power($s("ff"),-1))),x)),FreeQ(List(b,d,e,f,m,p),x))),
IIntegrate(4141,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),n_))),p_DEFAULT),Power(Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_)),x_Symbol),
    Condition(With(List(Set($s("ff"),FreeFactors(Tan(Plus(e,Times(f,x))),x))),Dist(Times($s("ff"),Power(f,-1)),Subst(Int(Times(Power(Times(d,$s("ff"),x),m),Power(Plus(a,Times(b,Power(Plus(C1,Times(Sqr($s("ff")),Sqr(x))),Times(C1D2,n)))),p),Power(Plus(C1,Times(Sqr($s("ff")),Sqr(x))),-1)),x),x,Times(Tan(Plus(e,Times(f,x))),Power($s("ff"),-1))),x)),And(FreeQ(List(a,b,d,e,f,m,p),x),IntegerQ(Times(C1D2,n)),Or(IntegerQ(Times(C1D2,m)),EqQ(n,C2))))),
IIntegrate(4142,Int(Times(Power(Times(b_DEFAULT,Power(Times(c_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),p_DEFAULT),Power(Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_)),x_Symbol),
    Condition(Plus(Simp(Times(d,Power(Times(d,Tan(Plus(e,Times(f,x)))),Plus(m,Negate(C1))),Power(Times(b,Power(Times(c,Sec(Plus(e,Times(f,x)))),n)),p),Power(Times(f,Plus(Times(p,n),m,Negate(C1))),-1)),x),Negate(Dist(Times(Sqr(d),Plus(m,Negate(C1)),Power(Plus(Times(p,n),m,Negate(C1)),-1)),Int(Times(Power(Times(d,Tan(Plus(e,Times(f,x)))),Plus(m,Negate(C2))),Power(Times(b,Power(Times(c,Sec(Plus(e,Times(f,x)))),n)),p)),x),x))),And(FreeQ(List(b,c,d,e,f,p,n),x),GtQ(m,C1),NeQ(Plus(Times(p,n),m,Negate(C1)),C0),IntegersQ(Times(C2,p,n),Times(C2,m))))),
IIntegrate(4143,Int(Times(Power(Times(b_DEFAULT,Power(Times(c_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),p_DEFAULT),Power(Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(d,Tan(Plus(e,Times(f,x)))),Plus(m,C1)),Power(Times(b,Power(Times(c,Sec(Plus(e,Times(f,x)))),n)),p),Power(Times(d,f,Plus(m,C1)),-1)),x),Negate(Dist(Times(Plus(Times(p,n),m,C1),Power(Times(Sqr(d),Plus(m,C1)),-1)),Int(Times(Power(Times(d,Tan(Plus(e,Times(f,x)))),Plus(m,C2)),Power(Times(b,Power(Times(c,Sec(Plus(e,Times(f,x)))),n)),p)),x),x))),And(FreeQ(List(b,c,d,e,f,p,n),x),LtQ(m,CN1),NeQ(Plus(Times(p,n),m,C1),C0),IntegersQ(Times(C2,p,n),Times(C2,m))))),
IIntegrate(4144,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(Times(c_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_))),p_DEFAULT),Power(Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_DEFAULT)),x_Symbol),
    Condition(Unintegrable(Times(Power(Plus(a,Times(b,Power(Times(c,Sec(Plus(e,Times(f,x)))),n))),p),Power(Times(d,Tan(Plus(e,Times(f,x)))),m)),x),FreeQ(List(a,b,c,d,e,f,m,n,p),x))),
IIntegrate(4145,Int(Times(Power(Times($($s("§cot"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),m_),Power(Plus(a_,Times(b_DEFAULT,Power(Times(c_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_))),p_)),x_Symbol),
    Condition(Dist(Times(Power(Times(d,Cot(Plus(e,Times(f,x)))),FracPart(m)),Power(Times(Tan(Plus(e,Times(f,x))),Power(d,-1)),FracPart(m))),Int(Times(Power(Plus(a,Times(b,Power(Times(c,Sec(Plus(e,Times(f,x)))),n))),p),Power(Power(Times(Tan(Plus(e,Times(f,x))),Power(d,-1)),m),-1)),x),x),And(FreeQ(List(a,b,c,d,e,f,m,n,p),x),Not(IntegerQ(m))))),
IIntegrate(4146,Int(Times(Power($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),m_),Power(Plus(a_,Times(b_DEFAULT,Power($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),n_))),p_)),x_Symbol),
    Condition(With(List(Set($s("ff"),FreeFactors(Tan(Plus(e,Times(f,x))),x))),Dist(Times($s("ff"),Power(f,-1)),Subst(Int(Times(Power(Plus(C1,Times(Sqr($s("ff")),Sqr(x))),Plus(Times(C1D2,m),Negate(C1))),Power(ExpandToSum(Plus(a,Times(b,Power(Plus(C1,Times(Sqr($s("ff")),Sqr(x))),Times(C1D2,n)))),x),p)),x),x,Times(Tan(Plus(e,Times(f,x))),Power($s("ff"),-1))),x)),And(FreeQ(List(a,b,e,f,p),x),IntegerQ(Times(C1D2,m)),IntegerQ(Times(C1D2,n))))),
IIntegrate(4147,Int(Times(Power($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),n_))),p_)),x_Symbol),
    Condition(With(List(Set($s("ff"),FreeFactors(Sin(Plus(e,Times(f,x))),x))),Dist(Times($s("ff"),Power(f,-1)),Subst(Int(Times(Power(ExpandToSum(Plus(b,Times(a,Power(Plus(C1,Times(CN1,Sqr($s("ff")),Sqr(x))),Times(C1D2,n)))),x),p),Power(Power(Plus(C1,Times(CN1,Sqr($s("ff")),Sqr(x))),Times(C1D2,Plus(m,Times(n,p),C1))),-1)),x),x,Times(Sin(Plus(e,Times(f,x))),Power($s("ff"),-1))),x)),And(FreeQ(List(a,b,e,f),x),IntegerQ(Times(C1D2,Plus(m,Negate(C1)))),IntegerQ(Times(C1D2,n)),IntegerQ(p)))),
IIntegrate(4148,Int(Times(Power($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),n_))),p_)),x_Symbol),
    Condition(With(List(Set($s("ff"),FreeFactors(Sin(Plus(e,Times(f,x))),x))),Dist(Times($s("ff"),Power(f,-1)),Subst(Int(Times(Power(Plus(a,Times(b,Power(Power(Plus(C1,Times(CN1,Sqr($s("ff")),Sqr(x))),Times(C1D2,n)),-1))),p),Power(Power(Plus(C1,Times(CN1,Sqr($s("ff")),Sqr(x))),Times(C1D2,Plus(m,C1))),-1)),x),x,Times(Sin(Plus(e,Times(f,x))),Power($s("ff"),-1))),x)),And(FreeQ(List(a,b,e,f,p),x),IntegerQ(Times(C1D2,Plus(m,Negate(C1)))),IntegerQ(Times(C1D2,n)),Not(IntegerQ(p))))),
IIntegrate(4149,Int(Times(Power($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),n_))),p_)),x_Symbol),
    Condition(Int(ExpandTrig(Times(Power($($s("§sec"),Plus(e,Times(f,x))),m),Power(Plus(a,Times(b,Power($($s("§sec"),Plus(e,Times(f,x))),n))),p)),x),x),And(FreeQ(List(a,b,e,f),x),IntegersQ(m,n,p)))),
IIntegrate(4150,Int(Times(Power(Times(d_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(Times(c_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_))),p_DEFAULT)),x_Symbol),
    Condition(Unintegrable(Times(Power(Times(d,Sec(Plus(e,Times(f,x)))),m),Power(Plus(a,Times(b,Power(Times(c,Sec(Plus(e,Times(f,x)))),n))),p)),x),FreeQ(List(a,b,c,d,e,f,m,n,p),x)))
  );
}
