package org.matheclipse.core.integrate.rubi;


import static org.matheclipse.core.expression.F.*;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.*;
import static org.matheclipse.core.integrate.rubi.UtilityFunctions.*;
import org.matheclipse.core.interfaces.IAST;

/** 
 * IndefiniteIntegrationRules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class IntRules107 { 
  public static IAST RULES = List( 
IIntegrate(9299,Int(Times(Power(Times(e_DEFAULT,x_),m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Cosh(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_)))))),p_DEFAULT)),x_Symbol),
    Condition(Negate(Dist(Times(Power(Times(e,x),m),Power(Power(x,-1),m)),Subst(Int(Times(Power(Plus(a,Times(b,Cosh(Plus(c,Times(d,Power(Power(x,n),-1)))))),p),Power(Power(x,Plus(m,C2)),-1)),x),x,Power(x,-1)),x)),And(FreeQ(List(a,b,c,d,e,m),x),IntegerQ(p),ILtQ(n,C0),Not(RationalQ(m))))),
IIntegrate(9300,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sinh(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_)))))),p_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(k,Denominator(n))),Dist(k,Subst(Int(Times(Power(x,Plus(Times(k,Plus(m,C1)),Negate(C1))),Power(Plus(a,Times(b,Sinh(Plus(c,Times(d,Power(x,Times(k,n))))))),p)),x),x,Power(x,Power(k,-1))),x)),And(FreeQ(List(a,b,c,d,m),x),IntegerQ(p),FractionQ(n)))),
IIntegrate(9301,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Cosh(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_)))))),p_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(k,Denominator(n))),Dist(k,Subst(Int(Times(Power(x,Plus(Times(k,Plus(m,C1)),Negate(C1))),Power(Plus(a,Times(b,Cosh(Plus(c,Times(d,Power(x,Times(k,n))))))),p)),x),x,Power(x,Power(k,-1))),x)),And(FreeQ(List(a,b,c,d,m),x),IntegerQ(p),FractionQ(n)))),
IIntegrate(9302,Int(Times(Power(Times(e_,x_),m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sinh(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_)))))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(e,IntPart(m)),Power(Times(e,x),FracPart(m)),Power(Power(x,FracPart(m)),-1)),Int(Times(Power(x,m),Power(Plus(a,Times(b,Sinh(Plus(c,Times(d,Power(x,n)))))),p)),x),x),And(FreeQ(List(a,b,c,d,e,m),x),IntegerQ(p),FractionQ(n)))),
IIntegrate(9303,Int(Times(Power(Times(e_,x_),m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Cosh(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_)))))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(e,IntPart(m)),Power(Times(e,x),FracPart(m)),Power(Power(x,FracPart(m)),-1)),Int(Times(Power(x,m),Power(Plus(a,Times(b,Cosh(Plus(c,Times(d,Power(x,n)))))),p)),x),x),And(FreeQ(List(a,b,c,d,e,m),x),IntegerQ(p),FractionQ(n)))),
IIntegrate(9304,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sinh(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_)))))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Plus(m,C1),-1),Subst(Int(Power(Plus(a,Times(b,Sinh(Plus(c,Times(d,Power(x,Simplify(Times(n,Power(Plus(m,C1),-1))))))))),p),x),x,Power(x,Plus(m,C1))),x),And(FreeQ(List(a,b,c,d,m,n),x),IntegerQ(p),NeQ(m,CN1),IGtQ(Simplify(Times(n,Power(Plus(m,C1),-1))),C0),Not(IntegerQ(n))))),
IIntegrate(9305,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Cosh(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_)))))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Plus(m,C1),-1),Subst(Int(Power(Plus(a,Times(b,Cosh(Plus(c,Times(d,Power(x,Simplify(Times(n,Power(Plus(m,C1),-1))))))))),p),x),x,Power(x,Plus(m,C1))),x),And(FreeQ(List(a,b,c,d,m,n),x),IntegerQ(p),NeQ(m,CN1),IGtQ(Simplify(Times(n,Power(Plus(m,C1),-1))),C0),Not(IntegerQ(n))))),
IIntegrate(9306,Int(Times(Power(Times(e_,x_),m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sinh(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_)))))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(e,IntPart(m)),Power(Times(e,x),FracPart(m)),Power(Power(x,FracPart(m)),-1)),Int(Times(Power(x,m),Power(Plus(a,Times(b,Sinh(Plus(c,Times(d,Power(x,n)))))),p)),x),x),And(FreeQ(List(a,b,c,d,e,m,n),x),IntegerQ(p),NeQ(m,CN1),IGtQ(Simplify(Times(n,Power(Plus(m,C1),-1))),C0),Not(IntegerQ(n))))),
IIntegrate(9307,Int(Times(Power(Times(e_,x_),m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Cosh(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_)))))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(e,IntPart(m)),Power(Times(e,x),FracPart(m)),Power(Power(x,FracPart(m)),-1)),Int(Times(Power(x,m),Power(Plus(a,Times(b,Cosh(Plus(c,Times(d,Power(x,n)))))),p)),x),x),And(FreeQ(List(a,b,c,d,e,m,n),x),IntegerQ(p),NeQ(m,CN1),IGtQ(Simplify(Times(n,Power(Plus(m,C1),-1))),C0),Not(IntegerQ(n))))),
IIntegrate(9308,Int(Times(Power(Times(e_DEFAULT,x_),m_DEFAULT),Sinh(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_))))),x_Symbol),
    Condition(Plus(Dist(C1D2,Int(Times(Power(Times(e,x),m),Exp(Plus(c,Times(d,Power(x,n))))),x),x),Negate(Dist(C1D2,Int(Times(Power(Times(e,x),m),Exp(Plus(Negate(c),Times(CN1,d,Power(x,n))))),x),x))),FreeQ(List(c,d,e,m,n),x))),
IIntegrate(9309,Int(Times(Power(Times(e_DEFAULT,x_),m_DEFAULT),Cosh(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_))))),x_Symbol),
    Condition(Plus(Dist(C1D2,Int(Times(Power(Times(e,x),m),Exp(Plus(c,Times(d,Power(x,n))))),x),x),Dist(C1D2,Int(Times(Power(Times(e,x),m),Exp(Plus(Negate(c),Times(CN1,d,Power(x,n))))),x),x)),FreeQ(List(c,d,e,m,n),x))),
IIntegrate(9310,Int(Times(Power(Times(e_DEFAULT,x_),m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sinh(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_)))))),p_)),x_Symbol),
    Condition(Int(ExpandTrigReduce(Power(Times(e,x),m),Power(Plus(a,Times(b,Sinh(Plus(c,Times(d,Power(x,n)))))),p),x),x),And(FreeQ(List(a,b,c,d,e,m,n),x),IGtQ(p,C0)))),
IIntegrate(9311,Int(Times(Power(Times(e_DEFAULT,x_),m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Cosh(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_)))))),p_)),x_Symbol),
    Condition(Int(ExpandTrigReduce(Power(Times(e,x),m),Power(Plus(a,Times(b,Cosh(Plus(c,Times(d,Power(x,n)))))),p),x),x),And(FreeQ(List(a,b,c,d,e,m,n),x),IGtQ(p,C0)))),
IIntegrate(9312,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sinh(Plus(c_DEFAULT,Times(d_DEFAULT,Power(u_,n_)))))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Power(Coefficient(u,x,C1),Plus(m,C1)),-1),Subst(Int(Times(Power(Plus(x,Negate(Coefficient(u,x,C0))),m),Power(Plus(a,Times(b,Sinh(Plus(c,Times(d,Power(x,n)))))),p)),x),x,u),x),And(FreeQ(List(a,b,c,d,n,p),x),LinearQ(u,x),NeQ(u,x),IntegerQ(m)))),
IIntegrate(9313,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Cosh(Plus(c_DEFAULT,Times(d_DEFAULT,Power(u_,n_)))))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Power(Coefficient(u,x,C1),Plus(m,C1)),-1),Subst(Int(Times(Power(Plus(x,Negate(Coefficient(u,x,C0))),m),Power(Plus(a,Times(b,Cosh(Plus(c,Times(d,Power(x,n)))))),p)),x),x,u),x),And(FreeQ(List(a,b,c,d,n,p),x),LinearQ(u,x),NeQ(u,x),IntegerQ(m)))),
IIntegrate(9314,Int(Times(Power(Times(e_,x_),m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sinh(u_))),p_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(Times(e,x),m),Power(Plus(a,Times(b,Sinh(ExpandToSum(u,x)))),p)),x),And(FreeQ(List(a,b,e,m,p),x),BinomialQ(u,x),Not(BinomialMatchQ(u,x))))),
IIntegrate(9315,Int(Times(Power(Times(e_,x_),m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Cosh(u_))),p_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(Times(e,x),m),Power(Plus(a,Times(b,Cosh(ExpandToSum(u,x)))),p)),x),And(FreeQ(List(a,b,e,m,p),x),BinomialQ(u,x),Not(BinomialMatchQ(u,x))))),
IIntegrate(9316,Int(Times(Power(x_,m_DEFAULT),Cosh(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_DEFAULT)))),Power(Sinh(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_)))),p_DEFAULT)),x_Symbol),
    Condition(Simp(Times(Power(Sinh(Plus(a,Times(b,Power(x,n)))),Plus(p,C1)),Power(Times(b,n,Plus(p,C1)),-1)),x),And(FreeQ(List(a,b,m,n,p),x),EqQ(m,Plus(n,Negate(C1))),NeQ(p,CN1)))),
IIntegrate(9317,Int(Times(Power(x_,m_DEFAULT),Power(Cosh(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_)))),p_DEFAULT),Sinh(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_DEFAULT))))),x_Symbol),
    Condition(Simp(Times(Power(Cosh(Plus(a,Times(b,Power(x,n)))),Plus(p,C1)),Power(Times(b,n,Plus(p,C1)),-1)),x),And(FreeQ(List(a,b,m,n,p),x),EqQ(m,Plus(n,Negate(C1))),NeQ(p,CN1)))),
IIntegrate(9318,Int(Times(Power(x_,m_DEFAULT),Cosh(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_DEFAULT)))),Power(Sinh(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_DEFAULT)))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(x,Plus(m,Negate(n),C1)),Power(Sinh(Plus(a,Times(b,Power(x,n)))),Plus(p,C1)),Power(Times(b,n,Plus(p,C1)),-1)),x),Negate(Dist(Times(Plus(m,Negate(n),C1),Power(Times(b,n,Plus(p,C1)),-1)),Int(Times(Power(x,Plus(m,Negate(n))),Power(Sinh(Plus(a,Times(b,Power(x,n)))),Plus(p,C1))),x),x))),And(FreeQ(List(a,b,p),x),LtQ(C0,n,Plus(m,C1)),NeQ(p,CN1)))),
IIntegrate(9319,Int(Times(Power(x_,m_DEFAULT),Power(Cosh(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_DEFAULT)))),p_DEFAULT),Sinh(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_DEFAULT))))),x_Symbol),
    Condition(Plus(Simp(Times(Power(x,Plus(m,Negate(n),C1)),Power(Cosh(Plus(a,Times(b,Power(x,n)))),Plus(p,C1)),Power(Times(b,n,Plus(p,C1)),-1)),x),Negate(Dist(Times(Plus(m,Negate(n),C1),Power(Times(b,n,Plus(p,C1)),-1)),Int(Times(Power(x,Plus(m,Negate(n))),Power(Cosh(Plus(a,Times(b,Power(x,n)))),Plus(p,C1))),x),x))),And(FreeQ(List(a,b,p),x),LtQ(C0,n,Plus(m,C1)),NeQ(p,CN1)))),
IIntegrate(9320,Int(Sinh(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_)))),x_Symbol),
    Condition(Plus(Dist(C1D2,Int(Exp(Plus(a,Times(b,x),Times(c,Sqr(x)))),x),x),Negate(Dist(C1D2,Int(Exp(Plus(Negate(a),Times(CN1,b,x),Times(CN1,c,Sqr(x)))),x),x))),FreeQ(List(a,b,c),x))),
IIntegrate(9321,Int(Cosh(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_)))),x_Symbol),
    Condition(Plus(Dist(C1D2,Int(Exp(Plus(a,Times(b,x),Times(c,Sqr(x)))),x),x),Dist(C1D2,Int(Exp(Plus(Negate(a),Times(CN1,b,x),Times(CN1,c,Sqr(x)))),x),x)),FreeQ(List(a,b,c),x))),
IIntegrate(9322,Int(Power(Sinh(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_)))),n_),x_Symbol),
    Condition(Int(ExpandTrigReduce(Power(Sinh(Plus(a,Times(b,x),Times(c,Sqr(x)))),n),x),x),And(FreeQ(List(a,b,c),x),IGtQ(n,C1)))),
IIntegrate(9323,Int(Power(Cosh(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_)))),n_),x_Symbol),
    Condition(Int(ExpandTrigReduce(Power(Cosh(Plus(a,Times(b,x),Times(c,Sqr(x)))),n),x),x),And(FreeQ(List(a,b,c),x),IGtQ(n,C1)))),
IIntegrate(9324,Int(Power(Sinh(v_),n_DEFAULT),x_Symbol),
    Condition(Int(Power(Sinh(ExpandToSum(v,x)),n),x),And(IGtQ(n,C0),QuadraticQ(v,x),Not(QuadraticMatchQ(v,x))))),
IIntegrate(9325,Int(Power(Cosh(v_),n_DEFAULT),x_Symbol),
    Condition(Int(Power(Cosh(ExpandToSum(v,x)),n),x),And(IGtQ(n,C0),QuadraticQ(v,x),Not(QuadraticMatchQ(v,x))))),
IIntegrate(9326,Int(Times(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),Sinh(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))))),x_Symbol),
    Condition(Simp(Times(e,Cosh(Plus(a,Times(b,x),Times(c,Sqr(x)))),Power(Times(C2,c),-1)),x),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(b,e),Times(CN1,C2,c,d)),C0)))),
IIntegrate(9327,Int(Times(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),Cosh(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))))),x_Symbol),
    Condition(Simp(Times(e,Sinh(Plus(a,Times(b,x),Times(c,Sqr(x)))),Power(Times(C2,c),-1)),x),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(b,e),Times(CN1,C2,c,d)),C0)))),
IIntegrate(9328,Int(Times(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),Sinh(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))))),x_Symbol),
    Condition(Plus(Simp(Times(e,Cosh(Plus(a,Times(b,x),Times(c,Sqr(x)))),Power(Times(C2,c),-1)),x),Negate(Dist(Times(Plus(Times(b,e),Times(CN1,C2,c,d)),Power(Times(C2,c),-1)),Int(Sinh(Plus(a,Times(b,x),Times(c,Sqr(x)))),x),x))),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Times(b,e),Times(CN1,C2,c,d)),C0)))),
IIntegrate(9329,Int(Times(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),Cosh(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))))),x_Symbol),
    Condition(Plus(Simp(Times(e,Sinh(Plus(a,Times(b,x),Times(c,Sqr(x)))),Power(Times(C2,c),-1)),x),Negate(Dist(Times(Plus(Times(b,e),Times(CN1,C2,c,d)),Power(Times(C2,c),-1)),Int(Cosh(Plus(a,Times(b,x),Times(c,Sqr(x)))),x),x))),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Times(b,e),Times(CN1,C2,c,d)),C0)))),
IIntegrate(9330,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_),Sinh(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))))),x_Symbol),
    Condition(Plus(Simp(Times(e,Power(Plus(d,Times(e,x)),Plus(m,Negate(C1))),Cosh(Plus(a,Times(b,x),Times(c,Sqr(x)))),Power(Times(C2,c),-1)),x),Negate(Dist(Times(Sqr(e),Plus(m,Negate(C1)),Power(Times(C2,c),-1)),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,Negate(C2))),Cosh(Plus(a,Times(b,x),Times(c,Sqr(x))))),x),x))),And(FreeQ(List(a,b,c,d,e),x),GtQ(m,C1),EqQ(Plus(Times(b,e),Times(CN1,C2,c,d)),C0)))),
IIntegrate(9331,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_),Cosh(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))))),x_Symbol),
    Condition(Plus(Simp(Times(e,Power(Plus(d,Times(e,x)),Plus(m,Negate(C1))),Sinh(Plus(a,Times(b,x),Times(c,Sqr(x)))),Power(Times(C2,c),-1)),x),Negate(Dist(Times(Sqr(e),Plus(m,Negate(C1)),Power(Times(C2,c),-1)),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,Negate(C2))),Sinh(Plus(a,Times(b,x),Times(c,Sqr(x))))),x),x))),And(FreeQ(List(a,b,c,d,e),x),GtQ(m,C1),EqQ(Plus(Times(b,e),Times(CN1,C2,c,d)),C0)))),
IIntegrate(9332,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_),Sinh(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))))),x_Symbol),
    Condition(Plus(Simp(Times(e,Power(Plus(d,Times(e,x)),Plus(m,Negate(C1))),Cosh(Plus(a,Times(b,x),Times(c,Sqr(x)))),Power(Times(C2,c),-1)),x),Negate(Dist(Times(Sqr(e),Plus(m,Negate(C1)),Power(Times(C2,c),-1)),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,Negate(C2))),Cosh(Plus(a,Times(b,x),Times(c,Sqr(x))))),x),x)),Negate(Dist(Times(Plus(Times(b,e),Times(CN1,C2,c,d)),Power(Times(C2,c),-1)),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,Negate(C1))),Sinh(Plus(a,Times(b,x),Times(c,Sqr(x))))),x),x))),And(FreeQ(List(a,b,c,d,e),x),GtQ(m,C1),NeQ(Plus(Times(b,e),Times(CN1,C2,c,d)),C0)))),
IIntegrate(9333,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_),Cosh(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))))),x_Symbol),
    Condition(Plus(Simp(Times(e,Power(Plus(d,Times(e,x)),Plus(m,Negate(C1))),Sinh(Plus(a,Times(b,x),Times(c,Sqr(x)))),Power(Times(C2,c),-1)),x),Negate(Dist(Times(Sqr(e),Plus(m,Negate(C1)),Power(Times(C2,c),-1)),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,Negate(C2))),Sinh(Plus(a,Times(b,x),Times(c,Sqr(x))))),x),x)),Negate(Dist(Times(Plus(Times(b,e),Times(CN1,C2,c,d)),Power(Times(C2,c),-1)),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,Negate(C1))),Cosh(Plus(a,Times(b,x),Times(c,Sqr(x))))),x),x))),And(FreeQ(List(a,b,c,d,e),x),GtQ(m,C1),NeQ(Plus(Times(b,e),Times(CN1,C2,c,d)),C0)))),
IIntegrate(9334,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_),Sinh(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))))),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Sinh(Plus(a,Times(b,x),Times(c,Sqr(x)))),Power(Times(e,Plus(m,C1)),-1)),x),Negate(Dist(Times(C2,c,Power(Times(Sqr(e),Plus(m,C1)),-1)),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,C2)),Cosh(Plus(a,Times(b,x),Times(c,Sqr(x))))),x),x))),And(FreeQ(List(a,b,c,d,e),x),LtQ(m,CN1),EqQ(Plus(Times(b,e),Times(CN1,C2,c,d)),C0)))),
IIntegrate(9335,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_),Cosh(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))))),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Cosh(Plus(a,Times(b,x),Times(c,Sqr(x)))),Power(Times(e,Plus(m,C1)),-1)),x),Negate(Dist(Times(C2,c,Power(Times(Sqr(e),Plus(m,C1)),-1)),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,C2)),Sinh(Plus(a,Times(b,x),Times(c,Sqr(x))))),x),x))),And(FreeQ(List(a,b,c,d,e),x),LtQ(m,CN1),EqQ(Plus(Times(b,e),Times(CN1,C2,c,d)),C0)))),
IIntegrate(9336,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_),Sinh(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))))),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Sinh(Plus(a,Times(b,x),Times(c,Sqr(x)))),Power(Times(e,Plus(m,C1)),-1)),x),Negate(Dist(Times(C2,c,Power(Times(Sqr(e),Plus(m,C1)),-1)),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,C2)),Cosh(Plus(a,Times(b,x),Times(c,Sqr(x))))),x),x)),Negate(Dist(Times(Plus(Times(b,e),Times(CN1,C2,c,d)),Power(Times(Sqr(e),Plus(m,C1)),-1)),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Cosh(Plus(a,Times(b,x),Times(c,Sqr(x))))),x),x))),And(FreeQ(List(a,b,c,d,e),x),LtQ(m,CN1),NeQ(Plus(Times(b,e),Times(CN1,C2,c,d)),C0)))),
IIntegrate(9337,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_),Cosh(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))))),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Cosh(Plus(a,Times(b,x),Times(c,Sqr(x)))),Power(Times(e,Plus(m,C1)),-1)),x),Negate(Dist(Times(C2,c,Power(Times(Sqr(e),Plus(m,C1)),-1)),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,C2)),Sinh(Plus(a,Times(b,x),Times(c,Sqr(x))))),x),x)),Negate(Dist(Times(Plus(Times(b,e),Times(CN1,C2,c,d)),Power(Times(Sqr(e),Plus(m,C1)),-1)),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Sinh(Plus(a,Times(b,x),Times(c,Sqr(x))))),x),x))),And(FreeQ(List(a,b,c,d,e),x),LtQ(m,CN1),NeQ(Plus(Times(b,e),Times(CN1,C2,c,d)),C0)))),
IIntegrate(9338,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_DEFAULT),Power(Sinh(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_)))),n_)),x_Symbol),
    Condition(Int(ExpandTrigReduce(Power(Plus(d,Times(e,x)),m),Power(Sinh(Plus(a,Times(b,x),Times(c,Sqr(x)))),n),x),x),And(FreeQ(List(a,b,c,d,e,m),x),IGtQ(n,C1)))),
IIntegrate(9339,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_DEFAULT),Power(Cosh(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_)))),n_)),x_Symbol),
    Condition(Int(ExpandTrigReduce(Power(Plus(d,Times(e,x)),m),Power(Cosh(Plus(a,Times(b,x),Times(c,Sqr(x)))),n),x),x),And(FreeQ(List(a,b,c,d,e,m),x),IGtQ(n,C1)))),
IIntegrate(9340,Int(Times(Power(u_,m_DEFAULT),Power(Sinh(v_),n_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(ExpandToSum(u,x),m),Power(Sinh(ExpandToSum(v,x)),n)),x),And(FreeQ(m,x),IGtQ(n,C0),LinearQ(u,x),QuadraticQ(v,x),Not(And(LinearMatchQ(u,x),QuadraticMatchQ(v,x)))))),
IIntegrate(9341,Int(Times(Power(u_,m_DEFAULT),Power(Cosh(v_),n_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(ExpandToSum(u,x),m),Power(Cosh(ExpandToSum(v,x)),n)),x),And(FreeQ(m,x),IGtQ(n,C0),LinearQ(u,x),QuadraticQ(v,x),Not(And(LinearMatchQ(u,x),QuadraticMatchQ(v,x)))))),
IIntegrate(9342,Int(Times(Power(u_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Tanh(v_))),n_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(ExpandToSum(u,x),m),Power(Plus(a,Times(b,Tanh(ExpandToSum(v,x)))),n)),x),And(FreeQ(List(a,b,m,n),x),LinearQ(List(u,v),x),Not(LinearMatchQ(List(u,v),x))))),
IIntegrate(9343,Int(Times(Power(u_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Coth(v_))),n_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(ExpandToSum(u,x),m),Power(Plus(a,Times(b,Coth(ExpandToSum(v,x)))),n)),x),And(FreeQ(List(a,b,m,n),x),LinearQ(List(u,v),x),Not(LinearMatchQ(List(u,v),x))))),
IIntegrate(9344,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Tanh(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_)))))),p_DEFAULT),x_Symbol),
    Condition(Dist(Power(n,-1),Subst(Int(Times(Power(x,Plus(Power(n,-1),Negate(C1))),Power(Plus(a,Times(b,Tanh(Plus(c,Times(d,x))))),p)),x),x,Power(x,n)),x),And(FreeQ(List(a,b,c,d,p),x),IGtQ(Power(n,-1),C0),IntegerQ(p))))
  );
}
