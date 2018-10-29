package org.matheclipse.core.integrate.rubi;


import org.matheclipse.core.interfaces.IAST;

import static org.matheclipse.core.expression.F.$;
import static org.matheclipse.core.expression.F.And;
import static org.matheclipse.core.expression.F.C0;
import static org.matheclipse.core.expression.F.C1;
import static org.matheclipse.core.expression.F.C2;
import static org.matheclipse.core.expression.F.CN1;
import static org.matheclipse.core.expression.F.Condition;
import static org.matheclipse.core.expression.F.Cosh;
import static org.matheclipse.core.expression.F.Coth;
import static org.matheclipse.core.expression.F.Csch;
import static org.matheclipse.core.expression.F.Exp;
import static org.matheclipse.core.expression.F.FSymbol;
import static org.matheclipse.core.expression.F.F_;
import static org.matheclipse.core.expression.F.FreeQ;
import static org.matheclipse.core.expression.F.GSymbol;
import static org.matheclipse.core.expression.F.G_;
import static org.matheclipse.core.expression.F.IIntegrate;
import static org.matheclipse.core.expression.F.IntegerQ;
import static org.matheclipse.core.expression.F.List;
import static org.matheclipse.core.expression.F.Log;
import static org.matheclipse.core.expression.F.Negate;
import static org.matheclipse.core.expression.F.Not;
import static org.matheclipse.core.expression.F.Or;
import static org.matheclipse.core.expression.F.Plus;
import static org.matheclipse.core.expression.F.Power;
import static org.matheclipse.core.expression.F.Sech;
import static org.matheclipse.core.expression.F.Sinh;
import static org.matheclipse.core.expression.F.Sqr;
import static org.matheclipse.core.expression.F.Tanh;
import static org.matheclipse.core.expression.F.Times;
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
import static org.matheclipse.core.expression.F.m;
import static org.matheclipse.core.expression.F.m_DEFAULT;
import static org.matheclipse.core.expression.F.n;
import static org.matheclipse.core.expression.F.n_;
import static org.matheclipse.core.expression.F.n_DEFAULT;
import static org.matheclipse.core.expression.F.p;
import static org.matheclipse.core.expression.F.p_DEFAULT;
import static org.matheclipse.core.expression.F.q;
import static org.matheclipse.core.expression.F.q_DEFAULT;
import static org.matheclipse.core.expression.F.x;
import static org.matheclipse.core.expression.F.x_;
import static org.matheclipse.core.expression.F.x_Symbol;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Dist;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.EqQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.ExpandIntegrand;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.F;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.G;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.HyperbolicQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.IGtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Int;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.IntegersQ;
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
public class IntRules111 { 
  public static IAST RULES = List( 
IIntegrate(5551,Int(Times(Power(Times(e_DEFAULT,x_),m_DEFAULT),Power(Sech(Times(Plus(a_DEFAULT,Times(Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))),b_DEFAULT)),d_DEFAULT)),p_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(Times(e,x),Plus(m,C1)),Power(Times(e,n,Power(Times(c,Power(x,n)),Times(Plus(m,C1),Power(n,-1)))),-1)),Subst(Int(Times(Power(x,Plus(Times(Plus(m,C1),Power(n,-1)),Negate(C1))),Power(Sech(Times(d,Plus(a,Times(b,Log(x))))),p)),x),x,Times(c,Power(x,n))),x),And(FreeQ(List(a,b,c,d,e,m,n,p),x),Or(NeQ(c,C1),NeQ(n,C1))))),
IIntegrate(5552,Int(Times(Power(Csch(Times(Plus(a_DEFAULT,Times(Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))),b_DEFAULT)),d_DEFAULT)),p_DEFAULT),Power(Times(e_DEFAULT,x_),m_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(Times(e,x),Plus(m,C1)),Power(Times(e,n,Power(Times(c,Power(x,n)),Times(Plus(m,C1),Power(n,-1)))),-1)),Subst(Int(Times(Power(x,Plus(Times(Plus(m,C1),Power(n,-1)),Negate(C1))),Power(Csch(Times(d,Plus(a,Times(b,Log(x))))),p)),x),x,Times(c,Power(x,n))),x),And(FreeQ(List(a,b,c,d,e,m,n,p),x),Or(NeQ(c,C1),NeQ(n,C1))))),
IIntegrate(5553,Int(Times(Log(Times(b_DEFAULT,x_)),Sinh(Times(Log(Times(b_DEFAULT,x_)),a_DEFAULT,x_))),x_Symbol),
    Condition(Plus(Simp(Times(Cosh(Times(a,x,Log(Times(b,x)))),Power(a,-1)),x),Negate(Int(Sinh(Times(a,x,Log(Times(b,x)))),x))),FreeQ(List(a,b),x))),
IIntegrate(5554,Int(Times(Cosh(Times(Log(Times(b_DEFAULT,x_)),a_DEFAULT,x_)),Log(Times(b_DEFAULT,x_))),x_Symbol),
    Condition(Plus(Simp(Times(Sinh(Times(a,x,Log(Times(b,x)))),Power(a,-1)),x),Negate(Int(Cosh(Times(a,x,Log(Times(b,x)))),x))),FreeQ(List(a,b),x))),
IIntegrate(5555,Int(Times(Log(Times(b_DEFAULT,x_)),Power(x_,m_DEFAULT),Sinh(Times(Log(Times(b_DEFAULT,x_)),a_DEFAULT,Power(x_,n_DEFAULT)))),x_Symbol),
    Condition(Plus(Simp(Times(Cosh(Times(a,Power(x,n),Log(Times(b,x)))),Power(Times(a,n),-1)),x),Negate(Dist(Power(n,-1),Int(Times(Power(x,m),Sinh(Times(a,Power(x,n),Log(Times(b,x))))),x),x))),And(FreeQ(List(a,b,m,n),x),EqQ(m,Plus(n,Negate(C1)))))),
IIntegrate(5556,Int(Times(Cosh(Times(Log(Times(b_DEFAULT,x_)),a_DEFAULT,Power(x_,n_DEFAULT))),Log(Times(b_DEFAULT,x_)),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Sinh(Times(a,Power(x,n),Log(Times(b,x)))),Power(Times(a,n),-1)),x),Negate(Dist(Power(n,-1),Int(Times(Power(x,m),Cosh(Times(a,Power(x,n),Log(Times(b,x))))),x),x))),And(FreeQ(List(a,b,m,n),x),EqQ(m,Plus(n,Negate(C1)))))),
IIntegrate(5557,Int(Times(Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power(Sinh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),n_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Sinh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),-1)),x_Symbol),
    Condition(Plus(Dist(Power(b,-1),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Sinh(Plus(c,Times(d,x))),Plus(n,Negate(C1)))),x),x),Negate(Dist(Times(a,Power(b,-1)),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Sinh(Plus(c,Times(d,x))),Plus(n,Negate(C1))),Power(Plus(a,Times(b,Sinh(Plus(c,Times(d,x))))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(m,C0),IGtQ(n,C0)))),
IIntegrate(5558,Int(Times(Power(Cosh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),n_DEFAULT),Power(Plus(Times(Cosh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),b_DEFAULT),a_),-1),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Dist(Power(b,-1),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Cosh(Plus(c,Times(d,x))),Plus(n,Negate(C1)))),x),x),Negate(Dist(Times(a,Power(b,-1)),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Cosh(Plus(c,Times(d,x))),Plus(n,Negate(C1))),Power(Plus(a,Times(b,Cosh(Plus(c,Times(d,x))))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(m,C0),IGtQ(n,C0)))),
IIntegrate(5559,Int(Times(Cosh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Sinh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),-1)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Power(Times(b,f,Plus(m,C1)),-1)),x)),Dist(C2,Int(Times(Power(Plus(e,Times(f,x)),m),Exp(Plus(c,Times(d,x))),Power(Plus(a,Times(b,Exp(Plus(c,Times(d,x))))),-1)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(m,C0),EqQ(Plus(Sqr(a),Sqr(b)),C0)))),
IIntegrate(5560,Int(Times(Power(Plus(Times(Cosh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),b_DEFAULT),a_),-1),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Sinh(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Power(Times(b,f,Plus(m,C1)),-1)),x)),Dist(C2,Int(Times(Power(Plus(e,Times(f,x)),m),Exp(Plus(c,Times(d,x))),Power(Plus(a,Times(b,Exp(Plus(c,Times(d,x))))),-1)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(m,C0),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0)))),
IIntegrate(5561,Int(Times(Cosh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Sinh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),-1)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Power(Times(b,f,Plus(m,C1)),-1)),x)),Int(Times(Power(Plus(e,Times(f,x)),m),Exp(Plus(c,Times(d,x))),Power(Plus(a,Negate(Rt(Plus(Sqr(a),Sqr(b)),C2)),Times(b,Exp(Plus(c,Times(d,x))))),-1)),x),Int(Times(Power(Plus(e,Times(f,x)),m),Exp(Plus(c,Times(d,x))),Power(Plus(a,Rt(Plus(Sqr(a),Sqr(b)),C2),Times(b,Exp(Plus(c,Times(d,x))))),-1)),x)),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(m,C0),NeQ(Plus(Sqr(a),Sqr(b)),C0)))),
IIntegrate(5562,Int(Times(Power(Plus(Times(Cosh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),b_DEFAULT),a_),-1),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Sinh(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Power(Times(b,f,Plus(m,C1)),-1)),x)),Int(Times(Power(Plus(e,Times(f,x)),m),Exp(Plus(c,Times(d,x))),Power(Plus(a,Negate(Rt(Plus(Sqr(a),Negate(Sqr(b))),C2)),Times(b,Exp(Plus(c,Times(d,x))))),-1)),x),Int(Times(Power(Plus(e,Times(f,x)),m),Exp(Plus(c,Times(d,x))),Power(Plus(a,Rt(Plus(Sqr(a),Negate(Sqr(b))),C2),Times(b,Exp(Plus(c,Times(d,x))))),-1)),x)),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(m,C0),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0)))),
IIntegrate(5563,Int(Times(Power(Cosh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),n_),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Sinh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),-1)),x_Symbol),
    Condition(Plus(Dist(Power(a,-1),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Cosh(Plus(c,Times(d,x))),Plus(n,Negate(C2)))),x),x),Dist(Power(b,-1),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Cosh(Plus(c,Times(d,x))),Plus(n,Negate(C2))),Sinh(Plus(c,Times(d,x)))),x),x)),And(FreeQ(List(a,b,c,d,e,f,m),x),IGtQ(n,C1),EqQ(Plus(Sqr(a),Sqr(b)),C0)))),
IIntegrate(5564,Int(Times(Power(Plus(Times(Cosh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),b_DEFAULT),a_),-1),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power(Sinh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),n_)),x_Symbol),
    Condition(Plus(Negate(Dist(Power(a,-1),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Sinh(Plus(c,Times(d,x))),Plus(n,Negate(C2)))),x),x)),Dist(Power(b,-1),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Sinh(Plus(c,Times(d,x))),Plus(n,Negate(C2))),Cosh(Plus(c,Times(d,x)))),x),x)),And(FreeQ(List(a,b,c,d,e,f,m),x),IGtQ(n,C1),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0)))),
IIntegrate(5565,Int(Times(Power(Cosh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),n_),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Sinh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),-1)),x_Symbol),
    Condition(Plus(Negate(Dist(Times(a,Power(b,-2)),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Cosh(Plus(c,Times(d,x))),Plus(n,Negate(C2)))),x),x)),Dist(Power(b,-1),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Cosh(Plus(c,Times(d,x))),Plus(n,Negate(C2))),Sinh(Plus(c,Times(d,x)))),x),x),Dist(Times(Plus(Sqr(a),Sqr(b)),Power(b,-2)),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Cosh(Plus(c,Times(d,x))),Plus(n,Negate(C2))),Power(Plus(a,Times(b,Sinh(Plus(c,Times(d,x))))),-1)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(n,C1),NeQ(Plus(Sqr(a),Sqr(b)),C0),IGtQ(m,C0)))),
IIntegrate(5566,Int(Times(Power(Plus(Times(Cosh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),b_DEFAULT),a_),-1),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power(Sinh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),n_)),x_Symbol),
    Condition(Plus(Negate(Dist(Times(a,Power(b,-2)),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Sinh(Plus(c,Times(d,x))),Plus(n,Negate(C2)))),x),x)),Dist(Power(b,-1),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Sinh(Plus(c,Times(d,x))),Plus(n,Negate(C2))),Cosh(Plus(c,Times(d,x)))),x),x),Dist(Times(Plus(Sqr(a),Negate(Sqr(b))),Power(b,-2)),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Sinh(Plus(c,Times(d,x))),Plus(n,Negate(C2))),Power(Plus(a,Times(b,Cosh(Plus(c,Times(d,x))))),-1)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(n,C1),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),IGtQ(m,C0)))),
IIntegrate(5567,Int(Times(Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Sinh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),-1),Power(Tanh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),n_DEFAULT)),x_Symbol),
    Condition(Plus(Dist(Power(b,-1),Int(Times(Power(Plus(e,Times(f,x)),m),Sech(Plus(c,Times(d,x))),Power(Tanh(Plus(c,Times(d,x))),Plus(n,Negate(C1)))),x),x),Negate(Dist(Times(a,Power(b,-1)),Int(Times(Power(Plus(e,Times(f,x)),m),Sech(Plus(c,Times(d,x))),Power(Tanh(Plus(c,Times(d,x))),Plus(n,Negate(C1))),Power(Plus(a,Times(b,Sinh(Plus(c,Times(d,x))))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(m,C0),IGtQ(n,C0)))),
IIntegrate(5568,Int(Times(Power(Coth(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),n_DEFAULT),Power(Plus(Times(Cosh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),b_DEFAULT),a_),-1),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Dist(Power(b,-1),Int(Times(Power(Plus(e,Times(f,x)),m),Csch(Plus(c,Times(d,x))),Power(Coth(Plus(c,Times(d,x))),Plus(n,Negate(C1)))),x),x),Negate(Dist(Times(a,Power(b,-1)),Int(Times(Power(Plus(e,Times(f,x)),m),Csch(Plus(c,Times(d,x))),Power(Coth(Plus(c,Times(d,x))),Plus(n,Negate(C1))),Power(Plus(a,Times(b,Cosh(Plus(c,Times(d,x))))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(m,C0),IGtQ(n,C0)))),
IIntegrate(5569,Int(Times(Power(Coth(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),n_DEFAULT),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Sinh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),-1)),x_Symbol),
    Condition(Plus(Dist(Power(a,-1),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Coth(Plus(c,Times(d,x))),n)),x),x),Negate(Dist(Times(b,Power(a,-1)),Int(Times(Power(Plus(e,Times(f,x)),m),Cosh(Plus(c,Times(d,x))),Power(Coth(Plus(c,Times(d,x))),Plus(n,Negate(C1))),Power(Plus(a,Times(b,Sinh(Plus(c,Times(d,x))))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(m,C0),IGtQ(n,C0)))),
IIntegrate(5570,Int(Times(Power(Plus(Times(Cosh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),b_DEFAULT),a_),-1),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power(Tanh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),n_DEFAULT)),x_Symbol),
    Condition(Plus(Dist(Power(a,-1),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Tanh(Plus(c,Times(d,x))),n)),x),x),Negate(Dist(Times(b,Power(a,-1)),Int(Times(Power(Plus(e,Times(f,x)),m),Sinh(Plus(c,Times(d,x))),Power(Tanh(Plus(c,Times(d,x))),Plus(n,Negate(C1))),Power(Plus(a,Times(b,Cosh(Plus(c,Times(d,x))))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(m,C0),IGtQ(n,C0)))),
IIntegrate(5571,Int(Times(Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power(Sech(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),n_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Sinh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),-1)),x_Symbol),
    Condition(Plus(Dist(Power(a,-1),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Sech(Plus(c,Times(d,x))),Plus(n,C2))),x),x),Dist(Power(b,-1),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Sech(Plus(c,Times(d,x))),Plus(n,C1)),Tanh(Plus(c,Times(d,x)))),x),x)),And(FreeQ(List(a,b,c,d,e,f,n),x),IGtQ(m,C0),EqQ(Plus(Sqr(a),Sqr(b)),C0)))),
IIntegrate(5572,Int(Times(Power(Csch(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),n_DEFAULT),Power(Plus(Times(Cosh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),b_DEFAULT),a_),-1),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Negate(Dist(Power(a,-1),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Csch(Plus(c,Times(d,x))),Plus(n,C2))),x),x)),Dist(Power(b,-1),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Csch(Plus(c,Times(d,x))),Plus(n,C1)),Coth(Plus(c,Times(d,x)))),x),x)),And(FreeQ(List(a,b,c,d,e,f,n),x),IGtQ(m,C0),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0)))),
IIntegrate(5573,Int(Times(Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power(Sech(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),n_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Sinh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),-1)),x_Symbol),
    Condition(Plus(Dist(Times(Sqr(b),Power(Plus(Sqr(a),Sqr(b)),-1)),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Sech(Plus(c,Times(d,x))),Plus(n,Negate(C2))),Power(Plus(a,Times(b,Sinh(Plus(c,Times(d,x))))),-1)),x),x),Dist(Power(Plus(Sqr(a),Sqr(b)),-1),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Sech(Plus(c,Times(d,x))),n),Plus(a,Times(CN1,b,Sinh(Plus(c,Times(d,x)))))),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(m,C0),NeQ(Plus(Sqr(a),Sqr(b)),C0),IGtQ(n,C0)))),
IIntegrate(5574,Int(Times(Power(Csch(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),n_DEFAULT),Power(Plus(Times(Cosh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),b_DEFAULT),a_),-1),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Dist(Times(Sqr(b),Power(Plus(Sqr(a),Negate(Sqr(b))),-1)),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Csch(Plus(c,Times(d,x))),Plus(n,Negate(C2))),Power(Plus(a,Times(b,Cosh(Plus(c,Times(d,x))))),-1)),x),x),Dist(Power(Plus(Sqr(a),Negate(Sqr(b))),-1),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Csch(Plus(c,Times(d,x))),n),Plus(a,Times(CN1,b,Cosh(Plus(c,Times(d,x)))))),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(m,C0),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),IGtQ(n,C0)))),
IIntegrate(5575,Int(Times(Power(Csch(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),n_DEFAULT),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Sinh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),-1)),x_Symbol),
    Condition(Plus(Dist(Power(a,-1),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Csch(Plus(c,Times(d,x))),n)),x),x),Negate(Dist(Times(b,Power(a,-1)),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Csch(Plus(c,Times(d,x))),Plus(n,Negate(C1))),Power(Plus(a,Times(b,Sinh(Plus(c,Times(d,x))))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(m,C0),IGtQ(n,C0)))),
IIntegrate(5576,Int(Times(Power(Plus(Times(Cosh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),b_DEFAULT),a_),-1),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power(Sech(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),n_DEFAULT)),x_Symbol),
    Condition(Plus(Dist(Power(a,-1),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Sech(Plus(c,Times(d,x))),n)),x),x),Negate(Dist(Times(b,Power(a,-1)),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Sech(Plus(c,Times(d,x))),Plus(n,Negate(C1))),Power(Plus(a,Times(b,Cosh(Plus(c,Times(d,x))))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(m,C0),IGtQ(n,C0)))),
IIntegrate(5577,Int(Times(Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Sinh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),-1),Power($(F_,Plus(c_DEFAULT,Times(d_DEFAULT,x_))),n_DEFAULT)),x_Symbol),
    Condition(Unintegrable(Times(Power(Plus(e,Times(f,x)),m),Power(F(Plus(c,Times(d,x))),n),Power(Plus(a,Times(b,Sinh(Plus(c,Times(d,x))))),-1)),x),And(FreeQ(List(a,b,c,d,e,f,m,n),x),HyperbolicQ(FSymbol)))),
IIntegrate(5578,Int(Times(Power(Plus(Times(Cosh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),b_DEFAULT),a_),-1),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power($(F_,Plus(c_DEFAULT,Times(d_DEFAULT,x_))),n_DEFAULT)),x_Symbol),
    Condition(Unintegrable(Times(Power(Plus(e,Times(f,x)),m),Power(F(Plus(c,Times(d,x))),n),Power(Plus(a,Times(b,Cosh(Plus(c,Times(d,x))))),-1)),x),And(FreeQ(List(a,b,c,d,e,f,m,n),x),HyperbolicQ(FSymbol)))),
IIntegrate(5579,Int(Times(Power(Cosh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),p_DEFAULT),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power(Sinh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),n_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Sinh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),-1)),x_Symbol),
    Condition(Plus(Dist(Power(b,-1),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Cosh(Plus(c,Times(d,x))),p),Power(Sinh(Plus(c,Times(d,x))),Plus(n,Negate(C1)))),x),x),Negate(Dist(Times(a,Power(b,-1)),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Cosh(Plus(c,Times(d,x))),p),Power(Sinh(Plus(c,Times(d,x))),Plus(n,Negate(C1))),Power(Plus(a,Times(b,Sinh(Plus(c,Times(d,x))))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(m,C0),IGtQ(n,C0),IGtQ(p,C0)))),
IIntegrate(5580,Int(Times(Power(Cosh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),n_DEFAULT),Power(Plus(Times(Cosh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),b_DEFAULT),a_),-1),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power(Sinh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Dist(Power(b,-1),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Sinh(Plus(c,Times(d,x))),p),Power(Cosh(Plus(c,Times(d,x))),Plus(n,Negate(C1)))),x),x),Negate(Dist(Times(a,Power(b,-1)),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Sinh(Plus(c,Times(d,x))),p),Power(Cosh(Plus(c,Times(d,x))),Plus(n,Negate(C1))),Power(Plus(a,Times(b,Cosh(Plus(c,Times(d,x))))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(m,C0),IGtQ(n,C0),IGtQ(p,C0)))),
IIntegrate(5581,Int(Times(Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power(Sinh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),p_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Sinh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),-1),Power(Tanh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),n_DEFAULT)),x_Symbol),
    Condition(Plus(Dist(Power(b,-1),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Sinh(Plus(c,Times(d,x))),Plus(p,Negate(C1))),Power(Tanh(Plus(c,Times(d,x))),n)),x),x),Negate(Dist(Times(a,Power(b,-1)),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Sinh(Plus(c,Times(d,x))),Plus(p,Negate(C1))),Power(Tanh(Plus(c,Times(d,x))),n),Power(Plus(a,Times(b,Sinh(Plus(c,Times(d,x))))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(m,C0),IGtQ(n,C0),IGtQ(p,C0)))),
IIntegrate(5582,Int(Times(Power(Cosh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),p_DEFAULT),Power(Coth(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),n_DEFAULT),Power(Plus(Times(Cosh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),b_DEFAULT),a_),-1),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Dist(Power(b,-1),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Cosh(Plus(c,Times(d,x))),Plus(p,Negate(C1))),Power(Coth(Plus(c,Times(d,x))),n)),x),x),Negate(Dist(Times(a,Power(b,-1)),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Cosh(Plus(c,Times(d,x))),Plus(p,Negate(C1))),Power(Coth(Plus(c,Times(d,x))),n),Power(Plus(a,Times(b,Cosh(Plus(c,Times(d,x))))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(m,C0),IGtQ(n,C0),IGtQ(p,C0)))),
IIntegrate(5583,Int(Times(Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power(Sech(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),p_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Sinh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),-1),Power(Tanh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),n_DEFAULT)),x_Symbol),
    Condition(Plus(Dist(Power(b,-1),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Sech(Plus(c,Times(d,x))),Plus(p,C1)),Power(Tanh(Plus(c,Times(d,x))),Plus(n,Negate(C1)))),x),x),Negate(Dist(Times(a,Power(b,-1)),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Sech(Plus(c,Times(d,x))),Plus(p,C1)),Power(Tanh(Plus(c,Times(d,x))),Plus(n,Negate(C1))),Power(Plus(a,Times(b,Sinh(Plus(c,Times(d,x))))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(m,C0),IGtQ(n,C0),IGtQ(p,C0)))),
IIntegrate(5584,Int(Times(Power(Coth(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),n_DEFAULT),Power(Csch(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),p_DEFAULT),Power(Plus(Times(Cosh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),b_DEFAULT),a_),-1),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Dist(Power(b,-1),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Csch(Plus(c,Times(d,x))),Plus(p,C1)),Power(Coth(Plus(c,Times(d,x))),Plus(n,Negate(C1)))),x),x),Negate(Dist(Times(a,Power(b,-1)),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Csch(Plus(c,Times(d,x))),Plus(p,C1)),Power(Coth(Plus(c,Times(d,x))),Plus(n,Negate(C1))),Power(Plus(a,Times(b,Cosh(Plus(c,Times(d,x))))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(m,C0),IGtQ(n,C0),IGtQ(p,C0)))),
IIntegrate(5585,Int(Times(Power(Cosh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),p_DEFAULT),Power(Coth(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),n_DEFAULT),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Sinh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),-1)),x_Symbol),
    Condition(Plus(Dist(Power(a,-1),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Cosh(Plus(c,Times(d,x))),p),Power(Coth(Plus(c,Times(d,x))),n)),x),x),Negate(Dist(Times(b,Power(a,-1)),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Cosh(Plus(c,Times(d,x))),Plus(p,C1)),Power(Coth(Plus(c,Times(d,x))),Plus(n,Negate(C1))),Power(Plus(a,Times(b,Sinh(Plus(c,Times(d,x))))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(m,C0),IGtQ(n,C0),IGtQ(p,C0)))),
IIntegrate(5586,Int(Times(Power(Plus(Times(Cosh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),b_DEFAULT),a_),-1),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power(Sinh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),p_DEFAULT),Power(Tanh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),n_DEFAULT)),x_Symbol),
    Condition(Plus(Dist(Power(a,-1),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Sinh(Plus(c,Times(d,x))),p),Power(Tanh(Plus(c,Times(d,x))),n)),x),x),Negate(Dist(Times(b,Power(a,-1)),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Sinh(Plus(c,Times(d,x))),Plus(p,C1)),Power(Tanh(Plus(c,Times(d,x))),Plus(n,Negate(C1))),Power(Plus(a,Times(b,Cosh(Plus(c,Times(d,x))))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(m,C0),IGtQ(n,C0),IGtQ(p,C0)))),
IIntegrate(5587,Int(Times(Power(Coth(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),n_DEFAULT),Power(Csch(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),p_DEFAULT),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Sinh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),-1)),x_Symbol),
    Condition(Plus(Dist(Power(a,-1),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Csch(Plus(c,Times(d,x))),p),Power(Coth(Plus(c,Times(d,x))),n)),x),x),Negate(Dist(Times(b,Power(a,-1)),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Csch(Plus(c,Times(d,x))),Plus(p,Negate(C1))),Power(Coth(Plus(c,Times(d,x))),n),Power(Plus(a,Times(b,Sinh(Plus(c,Times(d,x))))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(m,C0),IGtQ(n,C0),IGtQ(p,C0)))),
IIntegrate(5588,Int(Times(Power(Plus(Times(Cosh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),b_DEFAULT),a_),-1),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power(Sech(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),p_DEFAULT),Power(Tanh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),n_DEFAULT)),x_Symbol),
    Condition(Plus(Dist(Power(a,-1),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Sech(Plus(c,Times(d,x))),p),Power(Tanh(Plus(c,Times(d,x))),n)),x),x),Negate(Dist(Times(b,Power(a,-1)),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Sech(Plus(c,Times(d,x))),Plus(p,Negate(C1))),Power(Tanh(Plus(c,Times(d,x))),n),Power(Plus(a,Times(b,Cosh(Plus(c,Times(d,x))))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(m,C0),IGtQ(n,C0),IGtQ(p,C0)))),
IIntegrate(5589,Int(Times(Power(Csch(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),n_DEFAULT),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power(Sech(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),p_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Sinh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),-1)),x_Symbol),
    Condition(Plus(Dist(Power(a,-1),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Sech(Plus(c,Times(d,x))),p),Power(Csch(Plus(c,Times(d,x))),n)),x),x),Negate(Dist(Times(b,Power(a,-1)),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Sech(Plus(c,Times(d,x))),p),Power(Csch(Plus(c,Times(d,x))),Plus(n,Negate(C1))),Power(Plus(a,Times(b,Sinh(Plus(c,Times(d,x))))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(m,C0),IGtQ(n,C0),IGtQ(p,C0)))),
IIntegrate(5590,Int(Times(Power(Csch(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),p_DEFAULT),Power(Plus(Times(Cosh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),b_DEFAULT),a_),-1),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power(Sech(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),n_DEFAULT)),x_Symbol),
    Condition(Plus(Dist(Power(a,-1),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Csch(Plus(c,Times(d,x))),p),Power(Sech(Plus(c,Times(d,x))),n)),x),x),Negate(Dist(Times(b,Power(a,-1)),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Csch(Plus(c,Times(d,x))),p),Power(Sech(Plus(c,Times(d,x))),Plus(n,Negate(C1))),Power(Plus(a,Times(b,Cosh(Plus(c,Times(d,x))))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(m,C0),IGtQ(n,C0),IGtQ(p,C0)))),
IIntegrate(5591,Int(Times(Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Sinh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),-1),Power($(F_,Plus(c_DEFAULT,Times(d_DEFAULT,x_))),n_DEFAULT),Power($(G_,Plus(c_DEFAULT,Times(d_DEFAULT,x_))),p_DEFAULT)),x_Symbol),
    Condition(Unintegrable(Times(Power(Plus(e,Times(f,x)),m),Power(F(Plus(c,Times(d,x))),n),Power(G(Plus(c,Times(d,x))),p),Power(Plus(a,Times(b,Sinh(Plus(c,Times(d,x))))),-1)),x),And(FreeQ(List(a,b,c,d,e,f,m,n,p),x),HyperbolicQ(FSymbol),HyperbolicQ(GSymbol)))),
IIntegrate(5592,Int(Times(Power(Plus(Times(Cosh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),b_DEFAULT),a_),-1),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power($(F_,Plus(c_DEFAULT,Times(d_DEFAULT,x_))),n_DEFAULT),Power($(G_,Plus(c_DEFAULT,Times(d_DEFAULT,x_))),p_DEFAULT)),x_Symbol),
    Condition(Unintegrable(Times(Power(Plus(e,Times(f,x)),m),Power(F(Plus(c,Times(d,x))),n),Power(G(Plus(c,Times(d,x))),p),Power(Plus(a,Times(b,Cosh(Plus(c,Times(d,x))))),-1)),x),And(FreeQ(List(a,b,c,d,e,f,m,n,p),x),HyperbolicQ(FSymbol),HyperbolicQ(GSymbol)))),
IIntegrate(5593,Int(Times(Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Sech(Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),-1),Power($(F_,Plus(c_DEFAULT,Times(d_DEFAULT,x_))),n_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(Plus(e,Times(f,x)),m),Cosh(Plus(c,Times(d,x))),Power(F(Plus(c,Times(d,x))),n),Power(Plus(b,Times(a,Cosh(Plus(c,Times(d,x))))),-1)),x),And(FreeQ(List(a,b,c,d,e,f),x),HyperbolicQ(FSymbol),IntegersQ(m,n)))),
IIntegrate(5594,Int(Times(Power(Plus(Times(Csch(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),b_DEFAULT),a_),-1),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power($(F_,Plus(c_DEFAULT,Times(d_DEFAULT,x_))),n_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(Plus(e,Times(f,x)),m),Sinh(Plus(c,Times(d,x))),Power(F(Plus(c,Times(d,x))),n),Power(Plus(b,Times(a,Sinh(Plus(c,Times(d,x))))),-1)),x),And(FreeQ(List(a,b,c,d,e,f),x),HyperbolicQ(FSymbol),IntegersQ(m,n)))),
IIntegrate(5595,Int(Times(Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Sech(Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),-1),Power($(F_,Plus(c_DEFAULT,Times(d_DEFAULT,x_))),n_DEFAULT),Power($(G_,Plus(c_DEFAULT,Times(d_DEFAULT,x_))),p_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(Plus(e,Times(f,x)),m),Cosh(Plus(c,Times(d,x))),Power(F(Plus(c,Times(d,x))),n),Power(G(Plus(c,Times(d,x))),p),Power(Plus(b,Times(a,Cosh(Plus(c,Times(d,x))))),-1)),x),And(FreeQ(List(a,b,c,d,e,f),x),HyperbolicQ(FSymbol),HyperbolicQ(GSymbol),IntegersQ(m,n,p)))),
IIntegrate(5596,Int(Times(Power(Plus(Times(Csch(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),b_DEFAULT),a_),-1),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power($(F_,Plus(c_DEFAULT,Times(d_DEFAULT,x_))),n_DEFAULT),Power($(G_,Plus(c_DEFAULT,Times(d_DEFAULT,x_))),p_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(Plus(e,Times(f,x)),m),Sinh(Plus(c,Times(d,x))),Power(F(Plus(c,Times(d,x))),n),Power(G(Plus(c,Times(d,x))),p),Power(Plus(b,Times(a,Sinh(Plus(c,Times(d,x))))),-1)),x),And(FreeQ(List(a,b,c,d,e,f),x),HyperbolicQ(FSymbol),HyperbolicQ(GSymbol),IntegersQ(m,n,p)))),
IIntegrate(5597,Int(Times(Power(Sinh(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),p_DEFAULT),Power(Sinh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),q_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Power(C2,Plus(p,q)),-1),Int(ExpandIntegrand(Power(Plus(Negate(Exp(Plus(Negate(c),Times(CN1,d,x)))),Exp(Plus(c,Times(d,x)))),q),Power(Plus(Negate(Exp(Plus(Negate(a),Times(CN1,b,x)))),Exp(Plus(a,Times(b,x)))),p),x),x),x),And(FreeQ(List(a,b,c,d,q),x),IGtQ(p,C0),Not(IntegerQ(q))))),
IIntegrate(5598,Int(Times(Power(Cosh(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),p_DEFAULT),Power(Cosh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),q_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Power(C2,Plus(p,q)),-1),Int(ExpandIntegrand(Power(Plus(Exp(Plus(Negate(c),Times(CN1,d,x))),Exp(Plus(c,Times(d,x)))),q),Power(Plus(Exp(Plus(Negate(a),Times(CN1,b,x))),Exp(Plus(a,Times(b,x)))),p),x),x),x),And(FreeQ(List(a,b,c,d,q),x),IGtQ(p,C0),Not(IntegerQ(q))))),
IIntegrate(5599,Int(Times(Power(Cosh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),q_DEFAULT),Power(Sinh(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Power(C2,Plus(p,q)),-1),Int(ExpandIntegrand(Power(Plus(Exp(Plus(Negate(c),Times(CN1,d,x))),Exp(Plus(c,Times(d,x)))),q),Power(Plus(Negate(Exp(Plus(Negate(a),Times(CN1,b,x)))),Exp(Plus(a,Times(b,x)))),p),x),x),x),And(FreeQ(List(a,b,c,d,q),x),IGtQ(p,C0),Not(IntegerQ(q))))),
IIntegrate(5600,Int(Times(Power(Cosh(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),p_DEFAULT),Power(Sinh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),q_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Power(C2,Plus(p,q)),-1),Int(ExpandIntegrand(Power(Plus(Negate(Exp(Plus(Negate(c),Times(CN1,d,x)))),Exp(Plus(c,Times(d,x)))),q),Power(Plus(Exp(Plus(Negate(a),Times(CN1,b,x))),Exp(Plus(a,Times(b,x)))),p),x),x),x),And(FreeQ(List(a,b,c,d,q),x),IGtQ(p,C0),Not(IntegerQ(q)))))
  );
}
