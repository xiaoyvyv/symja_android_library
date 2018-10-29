package org.matheclipse.core.integrate.rubi;


import org.matheclipse.core.interfaces.IAST;

import static org.matheclipse.core.expression.F.And;
import static org.matheclipse.core.expression.F.ArcCos;
import static org.matheclipse.core.expression.F.ArcCot;
import static org.matheclipse.core.expression.F.ArcCsc;
import static org.matheclipse.core.expression.F.ArcSec;
import static org.matheclipse.core.expression.F.ArcSin;
import static org.matheclipse.core.expression.F.ArcTan;
import static org.matheclipse.core.expression.F.C0;
import static org.matheclipse.core.expression.F.C1;
import static org.matheclipse.core.expression.F.C1D2;
import static org.matheclipse.core.expression.F.C2;
import static org.matheclipse.core.expression.F.C3;
import static org.matheclipse.core.expression.F.CI;
import static org.matheclipse.core.expression.F.CN1;
import static org.matheclipse.core.expression.F.CN1D2;
import static org.matheclipse.core.expression.F.Condition;
import static org.matheclipse.core.expression.F.Cot;
import static org.matheclipse.core.expression.F.Coth;
import static org.matheclipse.core.expression.F.Csc;
import static org.matheclipse.core.expression.F.D;
import static org.matheclipse.core.expression.F.Exp;
import static org.matheclipse.core.expression.F.FreeQ;
import static org.matheclipse.core.expression.F.IIntegrate;
import static org.matheclipse.core.expression.F.IntegerQ;
import static org.matheclipse.core.expression.F.List;
import static org.matheclipse.core.expression.F.Log;
import static org.matheclipse.core.expression.F.MatchQ;
import static org.matheclipse.core.expression.F.Negate;
import static org.matheclipse.core.expression.F.Not;
import static org.matheclipse.core.expression.F.Or;
import static org.matheclipse.core.expression.F.Plus;
import static org.matheclipse.core.expression.F.Power;
import static org.matheclipse.core.expression.F.Sec;
import static org.matheclipse.core.expression.F.Set;
import static org.matheclipse.core.expression.F.Simplify;
import static org.matheclipse.core.expression.F.Sqr;
import static org.matheclipse.core.expression.F.Sqrt;
import static org.matheclipse.core.expression.F.Tan;
import static org.matheclipse.core.expression.F.Times;
import static org.matheclipse.core.expression.F.With;
import static org.matheclipse.core.expression.F.a;
import static org.matheclipse.core.expression.F.a_DEFAULT;
import static org.matheclipse.core.expression.F.b;
import static org.matheclipse.core.expression.F.b_DEFAULT;
import static org.matheclipse.core.expression.F.c;
import static org.matheclipse.core.expression.F.c_;
import static org.matheclipse.core.expression.F.c_DEFAULT;
import static org.matheclipse.core.expression.F.d;
import static org.matheclipse.core.expression.F.d_DEFAULT;
import static org.matheclipse.core.expression.F.e;
import static org.matheclipse.core.expression.F.e_DEFAULT;
import static org.matheclipse.core.expression.F.f;
import static org.matheclipse.core.expression.F.f_DEFAULT;
import static org.matheclipse.core.expression.F.m;
import static org.matheclipse.core.expression.F.m_DEFAULT;
import static org.matheclipse.core.expression.F.n;
import static org.matheclipse.core.expression.F.n_;
import static org.matheclipse.core.expression.F.n_DEFAULT;
import static org.matheclipse.core.expression.F.p;
import static org.matheclipse.core.expression.F.p_;
import static org.matheclipse.core.expression.F.p_DEFAULT;
import static org.matheclipse.core.expression.F.u;
import static org.matheclipse.core.expression.F.u_;
import static org.matheclipse.core.expression.F.u_DEFAULT;
import static org.matheclipse.core.expression.F.v;
import static org.matheclipse.core.expression.F.v_;
import static org.matheclipse.core.expression.F.w;
import static org.matheclipse.core.expression.F.w_;
import static org.matheclipse.core.expression.F.x;
import static org.matheclipse.core.expression.F.x_;
import static org.matheclipse.core.expression.F.x_Symbol;
import static org.matheclipse.core.expression.F.z;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Dist;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.EqQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.FalseQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.FunctionOfLinear;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.FunctionOfQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.GtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.IGtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.ILtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Int;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.IntHide;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.InverseFunctionFreeQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.LinearQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.LtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.NeQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.PowerVariableExpn;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Simp;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.SimplifyIntegrand;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Subst;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Unintegrable;

/** 
 * IndefiniteIntegrationRules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class IntRules104 { 
  public static IAST RULES = List( 
IIntegrate(5201,Int(Times(ArcTan(Plus(c_DEFAULT,Times(Coth(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),d_DEFAULT))),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),ArcTan(Plus(c,Times(d,Coth(Plus(a,Times(b,x)))))),Power(Times(f,Plus(m,C1)),-1)),x),Negate(Dist(Times(CI,b,Plus(CI,Negate(c),Negate(d)),Power(Times(f,Plus(m,C1)),-1)),Int(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Exp(Plus(Times(C2,a),Times(C2,b,x))),Power(Plus(CI,Negate(c),d,Times(CN1,Plus(CI,Negate(c),Negate(d)),Exp(Plus(Times(C2,a),Times(C2,b,x))))),-1)),x),x)),Dist(Times(CI,b,Plus(CI,c,d),Power(Times(f,Plus(m,C1)),-1)),Int(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Exp(Plus(Times(C2,a),Times(C2,b,x))),Power(Plus(CI,c,Negate(d),Times(CN1,Plus(CI,c,d),Exp(Plus(Times(C2,a),Times(C2,b,x))))),-1)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(m,C0),NeQ(Sqr(Plus(c,Negate(d))),CN1)))),
IIntegrate(5202,Int(Times(ArcCot(Plus(c_DEFAULT,Times(Coth(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),d_DEFAULT))),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),ArcCot(Plus(c,Times(d,Coth(Plus(a,Times(b,x)))))),Power(Times(f,Plus(m,C1)),-1)),x),Dist(Times(CI,b,Plus(CI,Negate(c),Negate(d)),Power(Times(f,Plus(m,C1)),-1)),Int(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Exp(Plus(Times(C2,a),Times(C2,b,x))),Power(Plus(CI,Negate(c),d,Times(CN1,Plus(CI,Negate(c),Negate(d)),Exp(Plus(Times(C2,a),Times(C2,b,x))))),-1)),x),x),Negate(Dist(Times(CI,b,Plus(CI,c,d),Power(Times(f,Plus(m,C1)),-1)),Int(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Exp(Plus(Times(C2,a),Times(C2,b,x))),Power(Plus(CI,c,Negate(d),Times(CN1,Plus(CI,c,d),Exp(Plus(Times(C2,a),Times(C2,b,x))))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(m,C0),NeQ(Sqr(Plus(c,Negate(d))),CN1)))),
IIntegrate(5203,Int(ArcTan(u_),x_Symbol),
    Condition(Plus(Simp(Times(x,ArcTan(u)),x),Negate(Int(SimplifyIntegrand(Times(x,D(u,x),Power(Plus(C1,Sqr(u)),-1)),x),x))),InverseFunctionFreeQ(u,x))),
IIntegrate(5204,Int(ArcCot(u_),x_Symbol),
    Condition(Plus(Simp(Times(x,ArcCot(u)),x),Int(SimplifyIntegrand(Times(x,D(u,x),Power(Plus(C1,Sqr(u)),-1)),x),x)),InverseFunctionFreeQ(u,x))),
IIntegrate(5205,Int(Times(Plus(a_DEFAULT,Times(ArcTan(u_),b_DEFAULT)),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(c,Times(d,x)),Plus(m,C1)),Plus(a,Times(b,ArcTan(u))),Power(Times(d,Plus(m,C1)),-1)),x),Negate(Dist(Times(b,Power(Times(d,Plus(m,C1)),-1)),Int(SimplifyIntegrand(Times(Power(Plus(c,Times(d,x)),Plus(m,C1)),D(u,x),Power(Plus(C1,Sqr(u)),-1)),x),x),x))),And(FreeQ(List(a,b,c,d,m),x),NeQ(m,CN1),InverseFunctionFreeQ(u,x),Not(FunctionOfQ(Power(Plus(c,Times(d,x)),Plus(m,C1)),u,x)),FalseQ(PowerVariableExpn(u,Plus(m,C1),x))))),
IIntegrate(5206,Int(Times(Plus(a_DEFAULT,Times(ArcCot(u_),b_DEFAULT)),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(c,Times(d,x)),Plus(m,C1)),Plus(a,Times(b,ArcCot(u))),Power(Times(d,Plus(m,C1)),-1)),x),Dist(Times(b,Power(Times(d,Plus(m,C1)),-1)),Int(SimplifyIntegrand(Times(Power(Plus(c,Times(d,x)),Plus(m,C1)),D(u,x),Power(Plus(C1,Sqr(u)),-1)),x),x),x)),And(FreeQ(List(a,b,c,d,m),x),NeQ(m,CN1),InverseFunctionFreeQ(u,x),Not(FunctionOfQ(Power(Plus(c,Times(d,x)),Plus(m,C1)),u,x)),FalseQ(PowerVariableExpn(u,Plus(m,C1),x))))),
IIntegrate(5207,Int(Times(Plus(a_DEFAULT,Times(ArcTan(u_),b_DEFAULT)),v_),x_Symbol),
    Condition(With(List(Set(w,IntHide(v,x))),Condition(Plus(Dist(Plus(a,Times(b,ArcTan(u))),w,x),Negate(Dist(b,Int(SimplifyIntegrand(Times(w,D(u,x),Power(Plus(C1,Sqr(u)),-1)),x),x),x))),InverseFunctionFreeQ(w,x))),And(FreeQ(List(a,b),x),InverseFunctionFreeQ(u,x),Not(MatchQ(v,Condition(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x)),m_DEFAULT),FreeQ(List(c,d,m),x)))),FalseQ(FunctionOfLinear(Times(v,Plus(a,Times(b,ArcTan(u)))),x))))),
IIntegrate(5208,Int(Times(Plus(a_DEFAULT,Times(ArcCot(u_),b_DEFAULT)),v_),x_Symbol),
    Condition(With(List(Set(w,IntHide(v,x))),Condition(Plus(Dist(Plus(a,Times(b,ArcCot(u))),w,x),Dist(b,Int(SimplifyIntegrand(Times(w,D(u,x),Power(Plus(C1,Sqr(u)),-1)),x),x),x)),InverseFunctionFreeQ(w,x))),And(FreeQ(List(a,b),x),InverseFunctionFreeQ(u,x),Not(MatchQ(v,Condition(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x)),m_DEFAULT),FreeQ(List(c,d,m),x)))),FalseQ(FunctionOfLinear(Times(v,Plus(a,Times(b,ArcCot(u)))),x))))),
IIntegrate(5209,Int(Times(ArcTan(v_),Log(w_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),-1)),x_Symbol),
    Condition(Plus(Dist(Times(C1D2,CI),Int(Times(Log(Plus(C1,Times(CN1,CI,v))),Log(w),Power(Plus(a,Times(b,x)),-1)),x),x),Negate(Dist(Times(C1D2,CI),Int(Times(Log(Plus(C1,Times(CI,v))),Log(w),Power(Plus(a,Times(b,x)),-1)),x),x))),And(FreeQ(List(a,b),x),LinearQ(v,x),LinearQ(w,x),EqQ(Simplify(D(Times(v,Power(Plus(a,Times(b,x)),-1)),x)),C0),EqQ(Simplify(D(Times(w,Power(Plus(a,Times(b,x)),-1)),x)),C0)))),
IIntegrate(5210,Int(Times(ArcTan(v_),Log(w_)),x_Symbol),
    Condition(Plus(Simp(Times(x,ArcTan(v),Log(w)),x),Negate(Int(SimplifyIntegrand(Times(x,Log(w),D(v,x),Power(Plus(C1,Sqr(v)),-1)),x),x)),Negate(Int(SimplifyIntegrand(Times(x,ArcTan(v),D(w,x),Power(w,-1)),x),x))),And(InverseFunctionFreeQ(v,x),InverseFunctionFreeQ(w,x)))),
IIntegrate(5211,Int(Times(ArcCot(v_),Log(w_)),x_Symbol),
    Condition(Plus(Simp(Times(x,ArcCot(v),Log(w)),x),Int(SimplifyIntegrand(Times(x,Log(w),D(v,x),Power(Plus(C1,Sqr(v)),-1)),x),x),Negate(Int(SimplifyIntegrand(Times(x,ArcCot(v),D(w,x),Power(w,-1)),x),x))),And(InverseFunctionFreeQ(v,x),InverseFunctionFreeQ(w,x)))),
IIntegrate(5212,Int(Times(ArcTan(v_),Log(w_),u_),x_Symbol),
    Condition(With(List(Set(z,IntHide(u,x))),Condition(Plus(Dist(Times(ArcTan(v),Log(w)),z,x),Negate(Int(SimplifyIntegrand(Times(z,Log(w),D(v,x),Power(Plus(C1,Sqr(v)),-1)),x),x)),Negate(Int(SimplifyIntegrand(Times(z,ArcTan(v),D(w,x),Power(w,-1)),x),x))),InverseFunctionFreeQ(z,x))),And(InverseFunctionFreeQ(v,x),InverseFunctionFreeQ(w,x)))),
IIntegrate(5213,Int(Times(ArcCot(v_),Log(w_),u_),x_Symbol),
    Condition(With(List(Set(z,IntHide(u,x))),Condition(Plus(Dist(Times(ArcCot(v),Log(w)),z,x),Int(SimplifyIntegrand(Times(z,Log(w),D(v,x),Power(Plus(C1,Sqr(v)),-1)),x),x),Negate(Int(SimplifyIntegrand(Times(z,ArcCot(v),D(w,x),Power(w,-1)),x),x))),InverseFunctionFreeQ(z,x))),And(InverseFunctionFreeQ(v,x),InverseFunctionFreeQ(w,x)))),
IIntegrate(5214,Int(ArcSec(Times(c_DEFAULT,x_)),x_Symbol),
    Condition(Plus(Simp(Times(x,ArcSec(Times(c,x))),x),Negate(Dist(Power(c,-1),Int(Power(Times(x,Sqrt(Plus(C1,Negate(Power(Times(Sqr(c),Sqr(x)),-1))))),-1),x),x))),FreeQ(c,x))),
IIntegrate(5215,Int(ArcCsc(Times(c_DEFAULT,x_)),x_Symbol),
    Condition(Plus(Simp(Times(x,ArcCsc(Times(c,x))),x),Dist(Power(c,-1),Int(Power(Times(x,Sqrt(Plus(C1,Negate(Power(Times(Sqr(c),Sqr(x)),-1))))),-1),x),x)),FreeQ(c,x))),
IIntegrate(5216,Int(Power(Plus(a_DEFAULT,Times(ArcSec(Times(c_DEFAULT,x_)),b_DEFAULT)),n_),x_Symbol),
    Condition(Dist(Power(c,-1),Subst(Int(Times(Power(Plus(a,Times(b,x)),n),Sec(x),Tan(x)),x),x,ArcSec(Times(c,x))),x),And(FreeQ(List(a,b,c,n),x),IGtQ(n,C0)))),
IIntegrate(5217,Int(Power(Plus(a_DEFAULT,Times(ArcCsc(Times(c_DEFAULT,x_)),b_DEFAULT)),n_),x_Symbol),
    Condition(Negate(Dist(Power(c,-1),Subst(Int(Times(Power(Plus(a,Times(b,x)),n),Csc(x),Cot(x)),x),x,ArcCsc(Times(c,x))),x)),And(FreeQ(List(a,b,c,n),x),IGtQ(n,C0)))),
IIntegrate(5218,Int(Times(Plus(a_DEFAULT,Times(ArcSec(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(x_,-1)),x_Symbol),
    Condition(Negate(Subst(Int(Times(Plus(a,Times(b,ArcCos(Times(x,Power(c,-1))))),Power(x,-1)),x),x,Power(x,-1))),FreeQ(List(a,b,c),x))),
IIntegrate(5219,Int(Times(Plus(a_DEFAULT,Times(ArcCsc(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(x_,-1)),x_Symbol),
    Condition(Negate(Subst(Int(Times(Plus(a,Times(b,ArcSin(Times(x,Power(c,-1))))),Power(x,-1)),x),x,Power(x,-1))),FreeQ(List(a,b,c),x))),
IIntegrate(5220,Int(Times(Plus(a_DEFAULT,Times(ArcSec(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Times(d_DEFAULT,x_),m_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(d,x),Plus(m,C1)),Plus(a,Times(b,ArcSec(Times(c,x)))),Power(Times(d,Plus(m,C1)),-1)),x),Negate(Dist(Times(b,d,Power(Times(c,Plus(m,C1)),-1)),Int(Times(Power(Times(d,x),Plus(m,Negate(C1))),Power(Plus(C1,Negate(Power(Times(Sqr(c),Sqr(x)),-1))),CN1D2)),x),x))),And(FreeQ(List(a,b,c,d,m),x),NeQ(m,CN1)))),
IIntegrate(5221,Int(Times(Plus(a_DEFAULT,Times(ArcCsc(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Times(d_DEFAULT,x_),m_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(d,x),Plus(m,C1)),Plus(a,Times(b,ArcCsc(Times(c,x)))),Power(Times(d,Plus(m,C1)),-1)),x),Dist(Times(b,d,Power(Times(c,Plus(m,C1)),-1)),Int(Times(Power(Times(d,x),Plus(m,Negate(C1))),Power(Plus(C1,Negate(Power(Times(Sqr(c),Sqr(x)),-1))),CN1D2)),x),x)),And(FreeQ(List(a,b,c,d,m),x),NeQ(m,CN1)))),
IIntegrate(5222,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSec(Times(c_DEFAULT,x_)),b_DEFAULT)),n_),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Power(c,Plus(m,C1)),-1),Subst(Int(Times(Power(Plus(a,Times(b,x)),n),Power(Sec(x),Plus(m,C1)),Tan(x)),x),x,ArcSec(Times(c,x))),x),And(FreeQ(List(a,b,c),x),IntegerQ(n),IntegerQ(m),Or(GtQ(n,C0),LtQ(m,CN1))))),
IIntegrate(5223,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCsc(Times(c_DEFAULT,x_)),b_DEFAULT)),n_),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Negate(Dist(Power(Power(c,Plus(m,C1)),-1),Subst(Int(Times(Power(Plus(a,Times(b,x)),n),Power(Csc(x),Plus(m,C1)),Cot(x)),x),x,ArcCsc(Times(c,x))),x)),And(FreeQ(List(a,b,c),x),IntegerQ(n),IntegerQ(m),Or(GtQ(n,C0),LtQ(m,CN1))))),
IIntegrate(5224,Int(Times(Plus(a_DEFAULT,Times(ArcSec(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),-1)),x_Symbol),
    Condition(Plus(Simp(Times(Plus(a,Times(b,ArcSec(Times(c,x)))),Log(Plus(C1,Times(Plus(e,Negate(Sqrt(Plus(Times(CN1,Sqr(c),Sqr(d)),Sqr(e))))),Exp(Times(CI,ArcSec(Times(c,x)))),Power(Times(c,d),-1)))),Power(e,-1)),x),Negate(Dist(Times(b,Power(Times(c,e),-1)),Int(Times(Log(Plus(C1,Times(Plus(e,Negate(Sqrt(Plus(Times(CN1,Sqr(c),Sqr(d)),Sqr(e))))),Exp(Times(CI,ArcSec(Times(c,x)))),Power(Times(c,d),-1)))),Power(Times(Sqr(x),Sqrt(Plus(C1,Negate(Power(Times(Sqr(c),Sqr(x)),-1))))),-1)),x),x)),Negate(Dist(Times(b,Power(Times(c,e),-1)),Int(Times(Log(Plus(C1,Times(Plus(e,Sqrt(Plus(Times(CN1,Sqr(c),Sqr(d)),Sqr(e)))),Exp(Times(CI,ArcSec(Times(c,x)))),Power(Times(c,d),-1)))),Power(Times(Sqr(x),Sqrt(Plus(C1,Negate(Power(Times(Sqr(c),Sqr(x)),-1))))),-1)),x),x)),Dist(Times(b,Power(Times(c,e),-1)),Int(Times(Log(Plus(C1,Exp(Times(C2,CI,ArcSec(Times(c,x)))))),Power(Times(Sqr(x),Sqrt(Plus(C1,Negate(Power(Times(Sqr(c),Sqr(x)),-1))))),-1)),x),x),Simp(Times(Plus(a,Times(b,ArcSec(Times(c,x)))),Log(Plus(C1,Times(Plus(e,Sqrt(Plus(Times(CN1,Sqr(c),Sqr(d)),Sqr(e)))),Exp(Times(CI,ArcSec(Times(c,x)))),Power(Times(c,d),-1)))),Power(e,-1)),x),Negate(Simp(Times(Plus(a,Times(b,ArcSec(Times(c,x)))),Log(Plus(C1,Exp(Times(C2,CI,ArcSec(Times(c,x)))))),Power(e,-1)),x))),FreeQ(List(a,b,c,d,e),x))),
IIntegrate(5225,Int(Times(Plus(a_DEFAULT,Times(ArcCsc(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),-1)),x_Symbol),
    Condition(Plus(Simp(Times(Plus(a,Times(b,ArcCsc(Times(c,x)))),Log(Plus(C1,Times(CN1,CI,Plus(e,Negate(Sqrt(Plus(Times(CN1,Sqr(c),Sqr(d)),Sqr(e))))),Exp(Times(CI,ArcCsc(Times(c,x)))),Power(Times(c,d),-1)))),Power(e,-1)),x),Dist(Times(b,Power(Times(c,e),-1)),Int(Times(Log(Plus(C1,Times(CN1,CI,Plus(e,Negate(Sqrt(Plus(Times(CN1,Sqr(c),Sqr(d)),Sqr(e))))),Exp(Times(CI,ArcCsc(Times(c,x)))),Power(Times(c,d),-1)))),Power(Times(Sqr(x),Sqrt(Plus(C1,Negate(Power(Times(Sqr(c),Sqr(x)),-1))))),-1)),x),x),Dist(Times(b,Power(Times(c,e),-1)),Int(Times(Log(Plus(C1,Times(CN1,CI,Plus(e,Sqrt(Plus(Times(CN1,Sqr(c),Sqr(d)),Sqr(e)))),Exp(Times(CI,ArcCsc(Times(c,x)))),Power(Times(c,d),-1)))),Power(Times(Sqr(x),Sqrt(Plus(C1,Negate(Power(Times(Sqr(c),Sqr(x)),-1))))),-1)),x),x),Negate(Dist(Times(b,Power(Times(c,e),-1)),Int(Times(Log(Plus(C1,Negate(Exp(Times(C2,CI,ArcCsc(Times(c,x))))))),Power(Times(Sqr(x),Sqrt(Plus(C1,Negate(Power(Times(Sqr(c),Sqr(x)),-1))))),-1)),x),x)),Simp(Times(Plus(a,Times(b,ArcCsc(Times(c,x)))),Log(Plus(C1,Times(CN1,CI,Plus(e,Sqrt(Plus(Times(CN1,Sqr(c),Sqr(d)),Sqr(e)))),Exp(Times(CI,ArcCsc(Times(c,x)))),Power(Times(c,d),-1)))),Power(e,-1)),x),Negate(Simp(Times(Plus(a,Times(b,ArcCsc(Times(c,x)))),Log(Plus(C1,Negate(Exp(Times(C2,CI,ArcCsc(Times(c,x))))))),Power(e,-1)),x))),FreeQ(List(a,b,c,d,e),x))),
IIntegrate(5226,Int(Times(Plus(a_DEFAULT,Times(ArcSec(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Plus(a,Times(b,ArcSec(Times(c,x)))),Power(Times(e,Plus(m,C1)),-1)),x),Negate(Dist(Times(b,Power(Times(c,e,Plus(m,C1)),-1)),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Power(Times(Sqr(x),Sqrt(Plus(C1,Negate(Power(Times(Sqr(c),Sqr(x)),-1))))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,m),x),NeQ(m,CN1)))),
IIntegrate(5227,Int(Times(Plus(a_DEFAULT,Times(ArcCsc(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Plus(a,Times(b,ArcCsc(Times(c,x)))),Power(Times(e,Plus(m,C1)),-1)),x),Dist(Times(b,Power(Times(c,e,Plus(m,C1)),-1)),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Power(Times(Sqr(x),Sqrt(Plus(C1,Negate(Power(Times(Sqr(c),Sqr(x)),-1))))),-1)),x),x)),And(FreeQ(List(a,b,c,d,e,m),x),NeQ(m,CN1)))),
IIntegrate(5228,Int(Times(Plus(a_DEFAULT,Times(ArcSec(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Power(Plus(d,Times(e,Sqr(x))),p),x))),Plus(Dist(Plus(a,Times(b,ArcSec(Times(c,x)))),u,x),Negate(Dist(Times(b,c,x,Power(Times(Sqr(c),Sqr(x)),CN1D2)),Int(SimplifyIntegrand(Times(u,Power(Times(x,Sqrt(Plus(Times(Sqr(c),Sqr(x)),Negate(C1)))),-1)),x),x),x)))),And(FreeQ(List(a,b,c,d,e),x),Or(IGtQ(p,C0),ILtQ(Plus(p,C1D2),C0))))),
IIntegrate(5229,Int(Times(Plus(a_DEFAULT,Times(ArcCsc(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Power(Plus(d,Times(e,Sqr(x))),p),x))),Plus(Dist(Plus(a,Times(b,ArcCsc(Times(c,x)))),u,x),Dist(Times(b,c,x,Power(Times(Sqr(c),Sqr(x)),CN1D2)),Int(SimplifyIntegrand(Times(u,Power(Times(x,Sqrt(Plus(Times(Sqr(c),Sqr(x)),Negate(C1)))),-1)),x),x),x))),And(FreeQ(List(a,b,c,d,e),x),Or(IGtQ(p,C0),ILtQ(Plus(p,C1D2),C0))))),
IIntegrate(5230,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSec(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Negate(Subst(Int(Times(Power(Plus(e,Times(d,Sqr(x))),p),Power(Plus(a,Times(b,ArcCos(Times(x,Power(c,-1))))),n),Power(Power(x,Times(C2,Plus(p,C1))),-1)),x),x,Power(x,-1))),And(FreeQ(List(a,b,c,d,e,n),x),IGtQ(n,C0),IntegerQ(p)))),
IIntegrate(5231,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCsc(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Negate(Subst(Int(Times(Power(Plus(e,Times(d,Sqr(x))),p),Power(Plus(a,Times(b,ArcSin(Times(x,Power(c,-1))))),n),Power(Power(x,Times(C2,Plus(p,C1))),-1)),x),x,Power(x,-1))),And(FreeQ(List(a,b,c,d,e,n),x),IGtQ(n,C0),IntegerQ(p)))),
IIntegrate(5232,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSec(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Negate(Dist(Times(Sqrt(Sqr(x)),Power(x,-1)),Subst(Int(Times(Power(Plus(e,Times(d,Sqr(x))),p),Power(Plus(a,Times(b,ArcCos(Times(x,Power(c,-1))))),n),Power(Power(x,Times(C2,Plus(p,C1))),-1)),x),x,Power(x,-1)),x)),And(FreeQ(List(a,b,c,d,e,n),x),IGtQ(n,C0),EqQ(Plus(Times(Sqr(c),d),e),C0),IntegerQ(Plus(p,C1D2)),GtQ(e,C0),LtQ(d,C0)))),
IIntegrate(5233,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCsc(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Negate(Dist(Times(Sqrt(Sqr(x)),Power(x,-1)),Subst(Int(Times(Power(Plus(e,Times(d,Sqr(x))),p),Power(Plus(a,Times(b,ArcSin(Times(x,Power(c,-1))))),n),Power(Power(x,Times(C2,Plus(p,C1))),-1)),x),x,Power(x,-1)),x)),And(FreeQ(List(a,b,c,d,e,n),x),IGtQ(n,C0),EqQ(Plus(Times(Sqr(c),d),e),C0),IntegerQ(Plus(p,C1D2)),GtQ(e,C0),LtQ(d,C0)))),
IIntegrate(5234,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSec(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Negate(Dist(Times(Sqrt(Plus(d,Times(e,Sqr(x)))),Power(Times(x,Sqrt(Plus(e,Times(d,Power(x,-2))))),-1)),Subst(Int(Times(Power(Plus(e,Times(d,Sqr(x))),p),Power(Plus(a,Times(b,ArcCos(Times(x,Power(c,-1))))),n),Power(Power(x,Times(C2,Plus(p,C1))),-1)),x),x,Power(x,-1)),x)),And(FreeQ(List(a,b,c,d,e,n),x),IGtQ(n,C0),EqQ(Plus(Times(Sqr(c),d),e),C0),IntegerQ(Plus(p,C1D2)),Not(And(GtQ(e,C0),LtQ(d,C0)))))),
IIntegrate(5235,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCsc(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Negate(Dist(Times(Sqrt(Plus(d,Times(e,Sqr(x)))),Power(Times(x,Sqrt(Plus(e,Times(d,Power(x,-2))))),-1)),Subst(Int(Times(Power(Plus(e,Times(d,Sqr(x))),p),Power(Plus(a,Times(b,ArcSin(Times(x,Power(c,-1))))),n),Power(Power(x,Times(C2,Plus(p,C1))),-1)),x),x,Power(x,-1)),x)),And(FreeQ(List(a,b,c,d,e,n),x),IGtQ(n,C0),EqQ(Plus(Times(Sqr(c),d),e),C0),IntegerQ(Plus(p,C1D2)),Not(And(GtQ(e,C0),LtQ(d,C0)))))),
IIntegrate(5236,Int(Times(Plus(a_DEFAULT,Times(ArcSec(Times(c_DEFAULT,x_)),b_DEFAULT)),x_,Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Plus(a,Times(b,ArcSec(Times(c,x)))),Power(Times(C2,e,Plus(p,C1)),-1)),x),Negate(Dist(Times(b,c,x,Power(Times(C2,e,Plus(p,C1),Sqrt(Times(Sqr(c),Sqr(x)))),-1)),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Power(Times(x,Sqrt(Plus(Times(Sqr(c),Sqr(x)),Negate(C1)))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,p),x),NeQ(p,CN1)))),
IIntegrate(5237,Int(Times(Plus(a_DEFAULT,Times(ArcCsc(Times(c_DEFAULT,x_)),b_DEFAULT)),x_,Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Plus(a,Times(b,ArcCsc(Times(c,x)))),Power(Times(C2,e,Plus(p,C1)),-1)),x),Dist(Times(b,c,x,Power(Times(C2,e,Plus(p,C1),Sqrt(Times(Sqr(c),Sqr(x)))),-1)),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Power(Times(x,Sqrt(Plus(Times(Sqr(c),Sqr(x)),Negate(C1)))),-1)),x),x)),And(FreeQ(List(a,b,c,d,e,p),x),NeQ(p,CN1)))),
IIntegrate(5238,Int(Times(Plus(a_DEFAULT,Times(ArcSec(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),p)),x))),Plus(Dist(Plus(a,Times(b,ArcSec(Times(c,x)))),u,x),Negate(Dist(Times(b,c,x,Power(Times(Sqr(c),Sqr(x)),CN1D2)),Int(SimplifyIntegrand(Times(u,Power(Times(x,Sqrt(Plus(Times(Sqr(c),Sqr(x)),Negate(C1)))),-1)),x),x),x)))),And(FreeQ(List(a,b,c,d,e,f,m,p),x),Or(And(IGtQ(p,C0),Not(And(ILtQ(Times(C1D2,Plus(m,Negate(C1))),C0),GtQ(Plus(m,Times(C2,p),C3),C0)))),And(IGtQ(Times(C1D2,Plus(m,C1)),C0),Not(And(ILtQ(p,C0),GtQ(Plus(m,Times(C2,p),C3),C0)))),And(ILtQ(Times(C1D2,Plus(m,Times(C2,p),C1)),C0),Not(ILtQ(Times(C1D2,Plus(m,Negate(C1))),C0))))))),
IIntegrate(5239,Int(Times(Plus(a_DEFAULT,Times(ArcCsc(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),p)),x))),Plus(Dist(Plus(a,Times(b,ArcCsc(Times(c,x)))),u,x),Dist(Times(b,c,x,Power(Times(Sqr(c),Sqr(x)),CN1D2)),Int(SimplifyIntegrand(Times(u,Power(Times(x,Sqrt(Plus(Times(Sqr(c),Sqr(x)),Negate(C1)))),-1)),x),x),x))),And(FreeQ(List(a,b,c,d,e,f,m,p),x),Or(And(IGtQ(p,C0),Not(And(ILtQ(Times(C1D2,Plus(m,Negate(C1))),C0),GtQ(Plus(m,Times(C2,p),C3),C0)))),And(IGtQ(Times(C1D2,Plus(m,C1)),C0),Not(And(ILtQ(p,C0),GtQ(Plus(m,Times(C2,p),C3),C0)))),And(ILtQ(Times(C1D2,Plus(m,Times(C2,p),C1)),C0),Not(ILtQ(Times(C1D2,Plus(m,Negate(C1))),C0))))))),
IIntegrate(5240,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSec(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(x_,m_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Negate(Subst(Int(Times(Power(Plus(e,Times(d,Sqr(x))),p),Power(Plus(a,Times(b,ArcCos(Times(x,Power(c,-1))))),n),Power(Power(x,Plus(m,Times(C2,Plus(p,C1)))),-1)),x),x,Power(x,-1))),And(FreeQ(List(a,b,c,d,e,n),x),IGtQ(n,C0),IntegerQ(m),IntegerQ(p)))),
IIntegrate(5241,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCsc(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(x_,m_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Negate(Subst(Int(Times(Power(Plus(e,Times(d,Sqr(x))),p),Power(Plus(a,Times(b,ArcSin(Times(x,Power(c,-1))))),n),Power(Power(x,Plus(m,Times(C2,Plus(p,C1)))),-1)),x),x,Power(x,-1))),And(FreeQ(List(a,b,c,d,e,n),x),IGtQ(n,C0),IntegerQ(m),IntegerQ(p)))),
IIntegrate(5242,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSec(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(x_,m_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Negate(Dist(Times(Sqrt(Sqr(x)),Power(x,-1)),Subst(Int(Times(Power(Plus(e,Times(d,Sqr(x))),p),Power(Plus(a,Times(b,ArcCos(Times(x,Power(c,-1))))),n),Power(Power(x,Plus(m,Times(C2,Plus(p,C1)))),-1)),x),x,Power(x,-1)),x)),And(FreeQ(List(a,b,c,d,e,n),x),IGtQ(n,C0),EqQ(Plus(Times(Sqr(c),d),e),C0),IntegerQ(m),IntegerQ(Plus(p,C1D2)),GtQ(e,C0),LtQ(d,C0)))),
IIntegrate(5243,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCsc(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(x_,m_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Negate(Dist(Times(Sqrt(Sqr(x)),Power(x,-1)),Subst(Int(Times(Power(Plus(e,Times(d,Sqr(x))),p),Power(Plus(a,Times(b,ArcSin(Times(x,Power(c,-1))))),n),Power(Power(x,Plus(m,Times(C2,Plus(p,C1)))),-1)),x),x,Power(x,-1)),x)),And(FreeQ(List(a,b,c,d,e,n),x),IGtQ(n,C0),EqQ(Plus(Times(Sqr(c),d),e),C0),IntegerQ(m),IntegerQ(Plus(p,C1D2)),GtQ(e,C0),LtQ(d,C0)))),
IIntegrate(5244,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSec(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(x_,m_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Negate(Dist(Times(Sqrt(Plus(d,Times(e,Sqr(x)))),Power(Times(x,Sqrt(Plus(e,Times(d,Power(x,-2))))),-1)),Subst(Int(Times(Power(Plus(e,Times(d,Sqr(x))),p),Power(Plus(a,Times(b,ArcCos(Times(x,Power(c,-1))))),n),Power(Power(x,Plus(m,Times(C2,Plus(p,C1)))),-1)),x),x,Power(x,-1)),x)),And(FreeQ(List(a,b,c,d,e,n),x),IGtQ(n,C0),EqQ(Plus(Times(Sqr(c),d),e),C0),IntegerQ(m),IntegerQ(Plus(p,C1D2)),Not(And(GtQ(e,C0),LtQ(d,C0)))))),
IIntegrate(5245,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCsc(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(x_,m_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Negate(Dist(Times(Sqrt(Plus(d,Times(e,Sqr(x)))),Power(Times(x,Sqrt(Plus(e,Times(d,Power(x,-2))))),-1)),Subst(Int(Times(Power(Plus(e,Times(d,Sqr(x))),p),Power(Plus(a,Times(b,ArcSin(Times(x,Power(c,-1))))),n),Power(Power(x,Plus(m,Times(C2,Plus(p,C1)))),-1)),x),x,Power(x,-1)),x)),And(FreeQ(List(a,b,c,d,e,n),x),IGtQ(n,C0),EqQ(Plus(Times(Sqr(c),d),e),C0),IntegerQ(m),IntegerQ(Plus(p,C1D2)),Not(And(GtQ(e,C0),LtQ(d,C0)))))),
IIntegrate(5246,Int(Times(Plus(a_DEFAULT,Times(ArcSec(Times(c_DEFAULT,x_)),b_DEFAULT)),u_),x_Symbol),
    Condition(With(List(Set(v,IntHide(u,x))),Condition(Plus(Dist(Plus(a,Times(b,ArcSec(Times(c,x)))),v,x),Negate(Dist(Times(b,Power(c,-1)),Int(SimplifyIntegrand(Times(v,Power(Times(Sqr(x),Sqrt(Plus(C1,Negate(Power(Times(Sqr(c),Sqr(x)),-1))))),-1)),x),x),x))),InverseFunctionFreeQ(v,x))),FreeQ(List(a,b,c),x))),
IIntegrate(5247,Int(Times(Plus(a_DEFAULT,Times(ArcCsc(Times(c_DEFAULT,x_)),b_DEFAULT)),u_),x_Symbol),
    Condition(With(List(Set(v,IntHide(u,x))),Condition(Plus(Dist(Plus(a,Times(b,ArcCsc(Times(c,x)))),v,x),Dist(Times(b,Power(c,-1)),Int(SimplifyIntegrand(Times(v,Power(Times(Sqr(x),Sqrt(Plus(C1,Negate(Power(Times(Sqr(c),Sqr(x)),-1))))),-1)),x),x),x)),InverseFunctionFreeQ(v,x))),FreeQ(List(a,b,c),x))),
IIntegrate(5248,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSec(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),u_DEFAULT),x_Symbol),
    Condition(Unintegrable(Times(u,Power(Plus(a,Times(b,ArcSec(Times(c,x)))),n)),x),FreeQ(List(a,b,c,n),x))),
IIntegrate(5249,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCsc(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),u_DEFAULT),x_Symbol),
    Condition(Unintegrable(Times(u,Power(Plus(a,Times(b,ArcCsc(Times(c,x)))),n)),x),FreeQ(List(a,b,c,n),x))),
IIntegrate(5250,Int(ArcSec(Plus(c_,Times(d_DEFAULT,x_))),x_Symbol),
    Condition(Plus(Simp(Times(Plus(c,Times(d,x)),ArcSec(Plus(c,Times(d,x))),Power(d,-1)),x),Negate(Int(Power(Times(Plus(c,Times(d,x)),Sqrt(Plus(C1,Negate(Power(Plus(c,Times(d,x)),-2))))),-1),x))),FreeQ(List(c,d),x)))
  );
}
