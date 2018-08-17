package org.matheclipse.core.integrate.rubi;


import org.matheclipse.core.interfaces.IAST;

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
import static org.matheclipse.core.expression.F.C1D4;
import static org.matheclipse.core.expression.F.C2;
import static org.matheclipse.core.expression.F.C3;
import static org.matheclipse.core.expression.F.C4;
import static org.matheclipse.core.expression.F.C5;
import static org.matheclipse.core.expression.F.C7;
import static org.matheclipse.core.expression.F.C9;
import static org.matheclipse.core.expression.F.CN1;
import static org.matheclipse.core.expression.F.CN1D2;
import static org.matheclipse.core.expression.F.CN2;
import static org.matheclipse.core.expression.F.CN4;
import static org.matheclipse.core.expression.F.CSymbol;
import static org.matheclipse.core.expression.F.C_DEFAULT;
import static org.matheclipse.core.expression.F.Cancel;
import static org.matheclipse.core.expression.F.Coefficient;
import static org.matheclipse.core.expression.F.Complex;
import static org.matheclipse.core.expression.F.Condition;
import static org.matheclipse.core.expression.F.FreeQ;
import static org.matheclipse.core.expression.F.ISetDelayed;
import static org.matheclipse.core.expression.F.Identity;
import static org.matheclipse.core.expression.F.IntegerQ;
import static org.matheclipse.core.expression.F.List;
import static org.matheclipse.core.expression.F.Log;
import static org.matheclipse.core.expression.F.MatchQ;
import static org.matheclipse.core.expression.F.Negate;
import static org.matheclipse.core.expression.F.Not;
import static org.matheclipse.core.expression.F.Or;
import static org.matheclipse.core.expression.F.Plus;
import static org.matheclipse.core.expression.F.Power;
import static org.matheclipse.core.expression.F.QQ;
import static org.matheclipse.core.expression.F.Simplify;
import static org.matheclipse.core.expression.F.Sqr;
import static org.matheclipse.core.expression.F.Sqrt;
import static org.matheclipse.core.expression.F.Times;
import static org.matheclipse.core.expression.F.a;
import static org.matheclipse.core.expression.F.a_;
import static org.matheclipse.core.expression.F.a_DEFAULT;
import static org.matheclipse.core.expression.F.b;
import static org.matheclipse.core.expression.F.b_;
import static org.matheclipse.core.expression.F.b_DEFAULT;
import static org.matheclipse.core.expression.F.c;
import static org.matheclipse.core.expression.F.c_;
import static org.matheclipse.core.expression.F.c_DEFAULT;
import static org.matheclipse.core.expression.F.d;
import static org.matheclipse.core.expression.F.d_DEFAULT;
import static org.matheclipse.core.expression.F.j;
import static org.matheclipse.core.expression.F.j_;
import static org.matheclipse.core.expression.F.j_DEFAULT;
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
import static org.matheclipse.core.expression.F.u;
import static org.matheclipse.core.expression.F.u_;
import static org.matheclipse.core.expression.F.u_DEFAULT;
import static org.matheclipse.core.expression.F.v;
import static org.matheclipse.core.expression.F.v_;
import static org.matheclipse.core.expression.F.w;
import static org.matheclipse.core.expression.F.w_DEFAULT;
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
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.ILeQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.ILtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Int;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.IntLinearQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.IntPart;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.IntSum;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.InverseFunctionQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.LeQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.LinearQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.LtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.NeQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.NegQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.PolyQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.RationalQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.RemoveContent;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Simp;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.SimplerQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Subst;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.SumQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.SumSimplerQ;

/** 
 * IndefiniteIntegrationRules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class IntRules0 { 
  public static IAST RULES = List( 
IIntegrate(4097,Int(Times(u_DEFAULT,Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_DEFAULT)),x_Symbol),
    Condition(Int(Times(u,Power(Times(b,Power(x,n)),p)),x),And(FreeQ(List(a,b,n,p),x),EqQ(a,C0)))),
IIntegrate(4098,Int(Times(u_DEFAULT,Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_DEFAULT)),x_Symbol),
    Condition(Int(Times(u,Power(a,p)),x),And(FreeQ(List(a,b,n,p),x),EqQ(b,C0)))),
IIntegrate(4099,Int(Times(u_DEFAULT,Power(Plus(a_,Times(c_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_DEFAULT)),x_Symbol),
    Condition(Int(Times(u,Power(Plus(Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p)),x),And(FreeQ(List(a,b,c,n,p),x),EqQ(j,Times(C2,n)),EqQ(a,C0)))),
IIntegrate(4100,Int(Times(u_DEFAULT,Power(Plus(a_DEFAULT,Times(c_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_DEFAULT)),x_Symbol),
    Condition(Int(Times(u,Power(Plus(a,Times(c,Power(x,Times(C2,n)))),p)),x),And(FreeQ(List(a,b,c,n,p),x),EqQ(j,Times(C2,n)),EqQ(b,C0)))),
IIntegrate(4101,Int(Times(u_DEFAULT,Power(Plus(a_DEFAULT,Times(c_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_DEFAULT)),x_Symbol),
    Condition(Int(Times(u,Power(Plus(a,Times(b,Power(x,n))),p)),x),And(FreeQ(List(a,b,c,n,p),x),EqQ(j,Times(C2,n)),EqQ(c,C0)))),
IIntegrate(4102,Int(Times(u_DEFAULT,Power(Plus(Times(a_DEFAULT,v_),Times(b_DEFAULT,v_),w_DEFAULT),p_DEFAULT)),x_Symbol),
    Condition(Int(Times(u,Power(Plus(Times(Plus(a,b),v),w),p)),x),And(FreeQ(List(a,b),x),Not(FreeQ(v,x))))),
IIntegrate(4103,Int(Times(Power($p("§px"),p_),u_DEFAULT),x_Symbol),
    Condition(Int(Times(u,Power($s("§px"),Simplify(p))),x),And(PolyQ($s("§px"),x),Not(RationalQ(p)),FreeQ(p,x),RationalQ(Simplify(p))))),
IIntegrate(4104,Int(a_,x_Symbol),
    Condition(Simp(Times(a,x),x),FreeQ(a,x))),
IIntegrate(4105,Int(Times(a_,Plus(b_,Times(c_DEFAULT,x_))),x_Symbol),
    Condition(Simp(Times(a,Sqr(Plus(b,Times(c,x))),Power(Times(C2,c),-1)),x),FreeQ(List(a,b,c),x))),
IIntegrate(4106,Int(Negate(u_),x_Symbol),
    Dist(Identity(CN1),Int(u,x),x)),
IIntegrate(4107,Int(Times(u_,Complex(C0,a_)),x_Symbol),
    Condition(Dist(Complex(Identity(C0),a),Int(u,x),x),And(FreeQ(a,x),EqQ(Sqr(a),C1)))),
IIntegrate(4108,Int(Times(a_,u_),x_Symbol),
    Condition(Dist(a,Int(u,x),x),And(FreeQ(a,x),Not(MatchQ(u,Condition(Times(b_,v_),FreeQ(b,x))))))),
IIntegrate(4109,Int(u_,x_Symbol),
    Condition(Simp(IntSum(u,x),x),SumQ(u))),
IIntegrate(4110,Int(Times(u_,Power(Times(c_DEFAULT,x_),m_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Times(c,x),m),u),x),x),And(FreeQ(List(c,m),x),SumQ(u),Not(LinearQ(u,x)),Not(MatchQ(u,Condition(Plus(a_,Times(b_DEFAULT,v_)),And(FreeQ(List(a,b),x),InverseFunctionQ(v)))))))),
IIntegrate(4111,Int(Times(u_DEFAULT,Power(Times(a_DEFAULT,Power(x_,n_)),m_)),x_Symbol),
    Condition(Dist(Times(Power(a,IntPart(m)),Power(Times(a,Power(x,n)),FracPart(m)),Power(Power(x,Times(n,FracPart(m))),-1)),Int(Times(u,Power(x,Times(m,n))),x),x),And(FreeQ(List(a,m,n),x),Not(IntegerQ(m))))),
IIntegrate(4112,Int(Times(u_DEFAULT,Power(v_,m_DEFAULT),Power(Times(b_,v_),n_)),x_Symbol),
    Condition(Dist(Power(Power(b,m),-1),Int(Times(u,Power(Times(b,v),Plus(m,n))),x),x),And(FreeQ(List(b,n),x),IntegerQ(m)))),
IIntegrate(4113,Int(Times(u_DEFAULT,Power(Times(a_DEFAULT,v_),m_),Power(Times(b_DEFAULT,v_),n_)),x_Symbol),
    Condition(Dist(Times(Power(a,Plus(m,C1D2)),Power(b,Plus(n,Negate(C1D2))),Sqrt(Times(b,v)),Power(Times(a,v),CN1D2)),Int(Times(u,Power(v,Plus(m,n))),x),x),And(FreeQ(List(a,b,m),x),Not(IntegerQ(m)),IGtQ(Plus(n,C1D2),C0),IntegerQ(Plus(m,n))))),
IIntegrate(4114,Int(Times(u_DEFAULT,Power(Times(a_DEFAULT,v_),m_),Power(Times(b_DEFAULT,v_),n_)),x_Symbol),
    Condition(Dist(Times(Power(a,Plus(m,Negate(C1D2))),Power(b,Plus(n,C1D2)),Sqrt(Times(a,v)),Power(Times(b,v),CN1D2)),Int(Times(u,Power(v,Plus(m,n))),x),x),And(FreeQ(List(a,b,m),x),Not(IntegerQ(m)),ILtQ(Plus(n,Negate(C1D2)),C0),IntegerQ(Plus(m,n))))),
IIntegrate(4115,Int(Times(u_DEFAULT,Power(Times(a_DEFAULT,v_),m_),Power(Times(b_DEFAULT,v_),n_)),x_Symbol),
    Condition(Dist(Times(Power(a,Plus(m,n)),Power(Times(b,v),n),Power(Power(Times(a,v),n),-1)),Int(Times(u,Power(v,Plus(m,n))),x),x),And(FreeQ(List(a,b,m,n),x),Not(IntegerQ(m)),Not(IntegerQ(n)),IntegerQ(Plus(m,n))))),
IIntegrate(4116,Int(Times(u_DEFAULT,Power(Times(a_DEFAULT,v_),m_),Power(Times(b_DEFAULT,v_),n_)),x_Symbol),
    Condition(Dist(Times(Power(b,IntPart(n)),Power(Times(b,v),FracPart(n)),Power(Times(Power(a,IntPart(n)),Power(Times(a,v),FracPart(n))),-1)),Int(Times(u,Power(Times(a,v),Plus(m,n))),x),x),And(FreeQ(List(a,b,m,n),x),Not(IntegerQ(m)),Not(IntegerQ(n)),Not(IntegerQ(Plus(m,n)))))),
IIntegrate(4117,Int(Times(u_DEFAULT,Power(Plus(a_,Times(b_DEFAULT,v_)),m_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,v_)),n_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Times(b,Power(d,-1)),m),Int(Times(u,Power(Plus(c,Times(d,v)),Plus(m,n))),x),x),And(FreeQ(List(a,b,c,d,n),x),EqQ(Plus(Times(b,c),Times(CN1,a,d)),C0),IntegerQ(m),Or(Not(IntegerQ(n)),SimplerQ(Plus(c,Times(d,x)),Plus(a,Times(b,x))))))),
IIntegrate(4118,Int(Times(u_DEFAULT,Power(Plus(a_,Times(b_DEFAULT,v_)),m_),Power(Plus(c_,Times(d_DEFAULT,v_)),n_)),x_Symbol),
    Condition(Dist(Power(Times(b,Power(d,-1)),m),Int(Times(u,Power(Plus(c,Times(d,v)),Plus(m,n))),x),x),And(FreeQ(List(a,b,c,d,m,n),x),EqQ(Plus(Times(b,c),Times(CN1,a,d)),C0),GtQ(Times(b,Power(d,-1)),C0),Not(Or(IntegerQ(m),IntegerQ(n)))))),
IIntegrate(4119,Int(Times(u_DEFAULT,Power(Plus(a_,Times(b_DEFAULT,v_)),m_),Power(Plus(c_,Times(d_DEFAULT,v_)),n_)),x_Symbol),
    Condition(Dist(Times(Power(Plus(a,Times(b,v)),m),Power(Power(Plus(c,Times(d,v)),m),-1)),Int(Times(u,Power(Plus(c,Times(d,v)),Plus(m,n))),x),x),And(FreeQ(List(a,b,c,d,m,n),x),EqQ(Plus(Times(b,c),Times(CN1,a,d)),C0),Not(Or(IntegerQ(m),IntegerQ(n),GtQ(Times(b,Power(d,-1)),C0)))))),
IIntegrate(4120,Int(Times(u_DEFAULT,Plus(A_DEFAULT,Times(B_DEFAULT,v_),Times(C_DEFAULT,Sqr(v_))),Power(Plus(a_,Times(b_DEFAULT,v_)),m_)),x_Symbol),
    Condition(Dist(Power(b,-2),Int(Times(u,Power(Plus(a,Times(b,v)),Plus(m,C1)),Simp(Plus(Times(b,BSymbol),Times(CN1,a,CSymbol),Times(b,CSymbol,v)),x)),x),x),And(FreeQ(List(a,b,ASymbol,BSymbol,CSymbol),x),EqQ(Plus(Times(ASymbol,Sqr(b)),Times(CN1,a,b,BSymbol),Times(Sqr(a),CSymbol)),C0),LeQ(m,CN1)))),
IIntegrate(4121,Int(Times(u_DEFAULT,Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_DEFAULT))),m_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,Power(x_,q_DEFAULT))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Times(d,Power(a,-1)),p),Int(Times(u,Power(Plus(a,Times(b,Power(x,n))),Plus(m,p)),Power(Power(x,Times(n,p)),-1)),x),x),And(FreeQ(List(a,b,c,d,m,n),x),EqQ(q,Negate(n)),IntegerQ(p),EqQ(Plus(Times(a,c),Times(CN1,b,d)),C0),Not(And(IntegerQ(m),NegQ(n)))))),
IIntegrate(4122,Int(Times(u_DEFAULT,Power(Plus(c_,Times(d_DEFAULT,Power(x_,j_))),p_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_DEFAULT))),m_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Times(CN1,Sqr(b),Power(d,-1)),m),Int(Times(u,Power(Power(Plus(a,Times(CN1,b,Power(x,n))),m),-1)),x),x),And(FreeQ(List(a,b,c,d,m,n,p),x),EqQ(j,Times(C2,n)),EqQ(p,Negate(m)),EqQ(Plus(Times(Sqr(b),c),Times(Sqr(a),d)),C0),GtQ(a,C0),LtQ(d,C0)))),
IIntegrate(4123,Int(Times(u_DEFAULT,Power(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Int(Times(u,Cancel(Times(Power(Plus(Times(C1D2,b),Times(c,x)),Times(C2,p)),Power(Power(c,p),-1)))),x),And(FreeQ(List(a,b,c),x),EqQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),IntegerQ(p)))),
IIntegrate(4124,Int(Times(u_DEFAULT,Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_)),Times(c_DEFAULT,Power(x_,$p("n2",true)))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Power(c,p),-1),Int(Times(u,Power(Plus(Times(C1D2,b),Times(c,Power(x,n))),Times(C2,p))),x),x),And(FreeQ(List(a,b,c,n),x),EqQ($s("n2"),Times(C2,n)),EqQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),IntegerQ(p)))),
IIntegrate(4125,Int(Power(x_,-1),x_Symbol),
    Simp(Log(x),x)),
IIntegrate(4126,Int(Power(x_,m_DEFAULT),x_Symbol),
    Condition(Simp(Times(Power(x,Plus(m,C1)),Power(Plus(m,C1),-1)),x),And(FreeQ(m,x),NeQ(m,CN1)))),
IIntegrate(4127,Int(Power(Plus(a_,Times(b_DEFAULT,x_)),-1),x_Symbol),
    Condition(Simp(Times(Log(RemoveContent(Plus(a,Times(b,x)),x)),Power(b,-1)),x),FreeQ(List(a,b),x))),
IIntegrate(4128,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),m_),x_Symbol),
    Condition(Simp(Times(Power(Plus(a,Times(b,x)),Plus(m,C1)),Power(Times(b,Plus(m,C1)),-1)),x),And(FreeQ(List(a,b,m),x),NeQ(m,CN1)))),
IIntegrate(4129,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,u_)),m_),x_Symbol),
    Condition(Dist(Power(Coefficient(u,x,C1),-1),Subst(Int(Power(Plus(a,Times(b,x)),m),x),x,u),x),And(FreeQ(List(a,b,m),x),LinearQ(u,x),NeQ(u,x)))),
IIntegrate(4130,Int(Times(Plus(c_,Times(d_DEFAULT,x_)),Power(Plus(a_,Times(b_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Simp(Times(d,x,Power(Plus(a,Times(b,x)),Plus(m,C1)),Power(Times(b,Plus(m,C2)),-1)),x),And(FreeQ(List(a,b,c,d,m),x),EqQ(Plus(Times(a,d),Times(CN1,b,c,Plus(m,C2))),C0)))),
IIntegrate(4131,Int(Power(Times(Plus(a_,Times(b_DEFAULT,x_)),Plus(c_,Times(d_DEFAULT,x_))),-1),x_Symbol),
    Condition(Int(Power(Plus(Times(a,c),Times(b,d,Sqr(x))),-1),x),And(FreeQ(List(a,b,c,d),x),EqQ(Plus(Times(b,c),Times(a,d)),C0)))),
IIntegrate(4132,Int(Power(Times(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),-1),x_Symbol),
    Condition(Plus(Dist(Times(b,Power(Plus(Times(b,c),Times(CN1,a,d)),-1)),Int(Power(Plus(a,Times(b,x)),-1),x),x),Negate(Dist(Times(d,Power(Plus(Times(b,c),Times(CN1,a,d)),-1)),Int(Power(Plus(c,Times(d,x)),-1),x),x))),And(FreeQ(List(a,b,c,d),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0)))),
IIntegrate(4133,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),m_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),n_)),x_Symbol),
    Condition(Simp(Times(Power(Plus(a,Times(b,x)),Plus(m,C1)),Power(Plus(c,Times(d,x)),Plus(n,C1)),Power(Times(Plus(Times(b,c),Times(CN1,a,d)),Plus(m,C1)),-1)),x),And(FreeQ(List(a,b,c,d,m,n),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),EqQ(Plus(m,n,C2),C0),NeQ(m,CN1)))),
IIntegrate(4134,Int(Times(Power(Plus(a_,Times(b_DEFAULT,x_)),m_),Power(Plus(c_,Times(d_DEFAULT,x_)),m_)),x_Symbol),
    Condition(Plus(Simp(Times(x,Power(Plus(a,Times(b,x)),m),Power(Plus(c,Times(d,x)),m),Power(Plus(Times(C2,m),C1),-1)),x),Dist(Times(C2,a,c,m,Power(Plus(Times(C2,m),C1),-1)),Int(Times(Power(Plus(a,Times(b,x)),Plus(m,Negate(C1))),Power(Plus(c,Times(d,x)),Plus(m,Negate(C1)))),x),x)),And(FreeQ(List(a,b,c,d),x),EqQ(Plus(Times(b,c),Times(a,d)),C0),IGtQ(Plus(m,C1D2),C0)))),
IIntegrate(4135,Int(Power(Times(Power(Plus(a_,Times(b_DEFAULT,x_)),QQ(3L,2L)),Power(Plus(c_,Times(d_DEFAULT,x_)),QQ(3L,2L))),-1),x_Symbol),
    Condition(Simp(Times(x,Power(Times(a,c,Sqrt(Plus(a,Times(b,x))),Sqrt(Plus(c,Times(d,x)))),-1)),x),And(FreeQ(List(a,b,c,d),x),EqQ(Plus(Times(b,c),Times(a,d)),C0)))),
IIntegrate(4136,Int(Times(Power(Plus(a_,Times(b_DEFAULT,x_)),m_),Power(Plus(c_,Times(d_DEFAULT,x_)),m_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(x,Power(Plus(a,Times(b,x)),Plus(m,C1)),Power(Plus(c,Times(d,x)),Plus(m,C1)),Power(Times(C2,a,c,Plus(m,C1)),-1)),x)),Dist(Times(Plus(Times(C2,m),C3),Power(Times(C2,a,c,Plus(m,C1)),-1)),Int(Times(Power(Plus(a,Times(b,x)),Plus(m,C1)),Power(Plus(c,Times(d,x)),Plus(m,C1))),x),x)),And(FreeQ(List(a,b,c,d),x),EqQ(Plus(Times(b,c),Times(a,d)),C0),ILtQ(Plus(m,QQ(3L,2L)),C0)))),
IIntegrate(4137,Int(Times(Power(Plus(a_,Times(b_DEFAULT,x_)),m_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Int(Power(Plus(Times(a,c),Times(b,d,Sqr(x))),m),x),And(FreeQ(List(a,b,c,d,m),x),EqQ(Plus(Times(b,c),Times(a,d)),C0),Or(IntegerQ(m),And(GtQ(a,C0),GtQ(c,C0)))))),
IIntegrate(4138,Int(Times(Power(Plus(a_,Times(b_DEFAULT,x_)),m_),Power(Plus(c_,Times(d_DEFAULT,x_)),m_)),x_Symbol),
    Condition(Dist(Times(Power(Plus(a,Times(b,x)),FracPart(m)),Power(Plus(c,Times(d,x)),FracPart(m)),Power(Power(Plus(Times(a,c),Times(b,d,Sqr(x))),FracPart(m)),-1)),Int(Power(Plus(Times(a,c),Times(b,d,Sqr(x))),m),x),x),And(FreeQ(List(a,b,c,d,m),x),EqQ(Plus(Times(b,c),Times(a,d)),C0),Not(IntegerQ(Times(C2,m)))))),
IIntegrate(4139,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),m_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),n_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(a,Times(b,x)),m),Power(Plus(c,Times(d,x)),n)),x),x),And(FreeQ(List(a,b,c,d,n),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),IGtQ(m,C0),Or(Not(IntegerQ(n)),And(EqQ(c,C0),LeQ(Plus(Times(C7,m),Times(C4,n),C4),C0)),LtQ(Plus(Times(C9,m),Times(C5,Plus(n,C1))),C0),GtQ(Plus(m,n,C2),C0))))),
IIntegrate(4140,Int(Times(Power(Plus(a_,Times(b_DEFAULT,x_)),m_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),n_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(a,Times(b,x)),m),Power(Plus(c,Times(d,x)),n)),x),x),And(FreeQ(List(a,b,c,d),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),ILtQ(m,C0),IntegerQ(n),Not(And(IGtQ(n,C0),LtQ(Plus(m,n,C2),C0)))))),
IIntegrate(4141,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),m_),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),n_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(a,Times(b,x)),Plus(m,C1)),Power(Plus(c,Times(d,x)),Plus(n,C1)),Power(Times(Plus(Times(b,c),Times(CN1,a,d)),Plus(m,C1)),-1)),x),Negate(Dist(Times(d,Simplify(Plus(m,n,C2)),Power(Times(Plus(Times(b,c),Times(CN1,a,d)),Plus(m,C1)),-1)),Int(Times(Power(Plus(a,Times(b,x)),Simplify(Plus(m,C1))),Power(Plus(c,Times(d,x)),n)),x),x))),And(FreeQ(List(a,b,c,d,m,n),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),ILtQ(Simplify(Plus(m,n,C2)),C0),NeQ(m,CN1),Not(And(LtQ(m,CN1),LtQ(n,CN1),Or(EqQ(a,C0),And(NeQ(c,C0),LtQ(Plus(m,Negate(n)),C0),IntegerQ(n))))),Or(SumSimplerQ(m,C1),Not(SumSimplerQ(n,C1)))))),
IIntegrate(4142,Int(Power(Times(Power(Plus(a_,Times(b_DEFAULT,x_)),QQ(9L,4L)),Power(Plus(c_,Times(d_DEFAULT,x_)),C1D4)),-1),x_Symbol),
    Condition(Plus(Simp(Times(CN4,Power(Times(C5,b,Power(Plus(a,Times(b,x)),QQ(5L,4L)),Power(Plus(c,Times(d,x)),C1D4)),-1)),x),Negate(Dist(Times(d,Power(Times(C5,b),-1)),Int(Power(Times(Power(Plus(a,Times(b,x)),QQ(5L,4L)),Power(Plus(c,Times(d,x)),QQ(5L,4L))),-1),x),x))),And(FreeQ(List(a,b,c,d),x),EqQ(Plus(Times(b,c),Times(a,d)),C0),NegQ(Times(Sqr(a),Sqr(b)))))),
IIntegrate(4143,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),m_),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),n_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(a,Times(b,x)),Plus(m,C1)),Power(Plus(c,Times(d,x)),n),Power(Times(b,Plus(m,C1)),-1)),x),Negate(Dist(Times(d,n,Power(Times(b,Plus(m,C1)),-1)),Int(Times(Power(Plus(a,Times(b,x)),Plus(m,C1)),Power(Plus(c,Times(d,x)),Plus(n,Negate(C1)))),x),x))),And(FreeQ(List(a,b,c,d),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),GtQ(n,C0),LtQ(m,CN1),Not(And(IntegerQ(n),Not(IntegerQ(m)))),Not(And(ILeQ(Plus(m,n,C2),C0),Or(FractionQ(m),GeQ(Plus(Times(C2,n),m,C1),C0)))),IntLinearQ(a,b,c,d,m,n,x)))),
IIntegrate(4144,Int(Power(Times(Power(Plus(a_,Times(b_DEFAULT,x_)),QQ(5L,4L)),Power(Plus(c_,Times(d_DEFAULT,x_)),C1D4)),-1),x_Symbol),
    Condition(Plus(Simp(Times(CN2,Power(Times(b,Power(Plus(a,Times(b,x)),C1D4),Power(Plus(c,Times(d,x)),C1D4)),-1)),x),Dist(c,Int(Power(Times(Power(Plus(a,Times(b,x)),QQ(5L,4L)),Power(Plus(c,Times(d,x)),QQ(5L,4L))),-1),x),x)),And(FreeQ(List(a,b,c,d),x),EqQ(Plus(Times(b,c),Times(a,d)),C0),NegQ(Times(Sqr(a),Sqr(b)))))),
IIntegrate(4145,Int(Times(Power(Plus(a_,Times(b_DEFAULT,x_)),m_),Power(Plus(c_,Times(d_DEFAULT,x_)),n_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(a,Times(b,x)),Plus(m,C1)),Power(Plus(c,Times(d,x)),n),Power(Times(b,Plus(m,n,C1)),-1)),x),Dist(Times(C2,c,n,Power(Plus(m,n,C1),-1)),Int(Times(Power(Plus(a,Times(b,x)),m),Power(Plus(c,Times(d,x)),Plus(n,Negate(C1)))),x),x)),And(FreeQ(List(a,b,c,d),x),EqQ(Plus(Times(b,c),Times(a,d)),C0),IGtQ(Plus(m,C1D2),C0),IGtQ(Plus(n,C1D2),C0),LtQ(m,n)))),
IIntegrate(4146,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),m_),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),n_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(a,Times(b,x)),Plus(m,C1)),Power(Plus(c,Times(d,x)),n),Power(Times(b,Plus(m,n,C1)),-1)),x),Dist(Times(n,Plus(Times(b,c),Times(CN1,a,d)),Power(Times(b,Plus(m,n,C1)),-1)),Int(Times(Power(Plus(a,Times(b,x)),m),Power(Plus(c,Times(d,x)),Plus(n,Negate(C1)))),x),x)),And(FreeQ(List(a,b,c,d),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),GtQ(n,C0),NeQ(Plus(m,n,C1),C0),Not(And(IGtQ(m,C0),Or(Not(IntegerQ(n)),And(GtQ(m,C0),LtQ(Plus(m,Negate(n)),C0))))),Not(ILtQ(Plus(m,n,C2),C0)),IntLinearQ(a,b,c,d,m,n,x))))
  );
}
