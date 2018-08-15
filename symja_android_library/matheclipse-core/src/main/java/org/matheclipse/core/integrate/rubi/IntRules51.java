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
public class IntRules51 { 
  public static IAST RULES = List( 
ISetDelayed(6592,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),m_DEFAULT),Log(u_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(a,Times(b,x)),Plus(m,C1)),Log(u),Power(Times(b,Plus(m,C1)),-1)),x),Negate(Dist(Power(Times(b,Plus(m,C1)),-1),Int(SimplifyIntegrand(Times(Power(Plus(a,Times(b,x)),Plus(m,C1)),D(u,x),Power(u,-1)),x),x),x))),And(FreeQ(List(a,b,m),x),InverseFunctionFreeQ(u,x),NeQ(m,CN1)))),
ISetDelayed(6593,Int(Times(Power($p("§qx"),-1),Log(u_)),x_Symbol),
    Condition(With(List(Set(v,IntHide(Power($s("§qx"),-1),x))),Plus(Simp(Times(v,Log(u)),x),Negate(Int(SimplifyIntegrand(Times(v,D(u,x),Power(u,-1)),x),x)))),And(QuadraticQ($s("§qx"),x),InverseFunctionFreeQ(u,x)))),
ISetDelayed(6594,Int(Times(Power(u_,Times(a_DEFAULT,x_)),Log(u_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(u,Times(a,x)),Power(a,-1)),x),Negate(Int(SimplifyIntegrand(Times(x,Power(u,Plus(Times(a,x),Negate(C1))),D(u,x)),x),x))),And(FreeQ(a,x),InverseFunctionFreeQ(u,x)))),
ISetDelayed(6595,Int(Times(v_,Log(u_)),x_Symbol),
    Condition(With(List(Set(w,IntHide(v,x))),Condition(Plus(Dist(Log(u),w,x),Negate(Int(SimplifyIntegrand(Times(w,D(u,x),Power(u,-1)),x),x))),InverseFunctionFreeQ(w,x))),InverseFunctionFreeQ(u,x))),
ISetDelayed(6596,Int(Times(v_,Log(u_)),x_Symbol),
    Condition(With(List(Set(w,IntHide(v,x))),Condition(Plus(Dist(Log(u),w,x),Negate(Int(SimplifyIntegrand(Times(w,Simplify(Times(D(u,x),Power(u,-1)))),x),x))),InverseFunctionFreeQ(w,x))),ProductQ(u))),
ISetDelayed(6597,Int(Times(Log(v_),Log(w_)),x_Symbol),
    Condition(Plus(Simp(Times(x,Log(v),Log(w)),x),Negate(Int(SimplifyIntegrand(Times(x,Log(w),D(v,x),Power(v,-1)),x),x)),Negate(Int(SimplifyIntegrand(Times(x,Log(v),D(w,x),Power(w,-1)),x),x))),And(InverseFunctionFreeQ(v,x),InverseFunctionFreeQ(w,x)))),
ISetDelayed(6598,Int(Times(u_,Log(v_),Log(w_)),x_Symbol),
    Condition(With(List(Set(z,IntHide(u,x))),Condition(Plus(Dist(Times(Log(v),Log(w)),z,x),Negate(Int(SimplifyIntegrand(Times(z,Log(w),D(v,x),Power(v,-1)),x),x)),Negate(Int(SimplifyIntegrand(Times(z,Log(v),D(w,x),Power(w,-1)),x),x))),InverseFunctionFreeQ(z,x))),And(InverseFunctionFreeQ(v,x),InverseFunctionFreeQ(w,x)))),
ISetDelayed(6599,Int(Power(f_,Times(a_DEFAULT,Log(u_))),x_Symbol),
    Condition(Int(Power(u,Times(a,Log(f))),x),FreeQ(List(a,f),x))),
ISetDelayed(6600,Int(u_,x_Symbol),
    Condition(With(List(Set($s("lst"),FunctionOfLog(Cancel(Times(x,u)),x))),Condition(Dist(Power(Part($s("lst"),C3),-1),Subst(Int(Part($s("lst"),C1),x),x,Log(Part($s("lst"),C2))),x),Not(FalseQ($s("lst"))))),NonsumQ(u))),
ISetDelayed(6601,Int(Times(u_DEFAULT,Log(Gamma(v_))),x_Symbol),
    Plus(Dist(Plus(Log(Gamma(v)),Negate(LogGamma(v))),Int(u,x),x),Int(Times(u,LogGamma(v)),x))),
ISetDelayed(6602,Int(Times(u_DEFAULT,Power(Plus(Times(a_DEFAULT,Power(x_,m_DEFAULT)),Times(b_DEFAULT,Power(x_,r_DEFAULT),Power(Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))),q_DEFAULT))),p_DEFAULT)),x_Symbol),
    Condition(Int(Times(u,Power(x,Times(p,r)),Power(Plus(Times(a,Power(x,Plus(m,Negate(r)))),Times(b,Power(Log(Times(c,Power(x,n))),q))),p)),x),And(FreeQ(List(a,b,c,m,n,p,q,r),x),IntegerQ(p)))),
ISetDelayed(6603,Int(u_,x_Symbol),
    Condition(Int(DeactivateTrig(u,x),x),FunctionOfTrigOfLinearQ(u,x))),
ISetDelayed(6604,Int(Times(Power(Times(b_DEFAULT,$($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_DEFAULT),Power(Times(a_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_DEFAULT)),x_Symbol),
    Condition(Simp(Times(Power(Times(a,Sin(Plus(e,Times(f,x)))),Plus(m,C1)),Power(Times(b,Cos(Plus(e,Times(f,x)))),Plus(n,C1)),Power(Times(a,b,f,Plus(m,C1)),-1)),x),And(FreeQ(List(a,b,e,f,m,n),x),EqQ(Plus(m,n,C2),C0),NeQ(m,CN1)))),
ISetDelayed(6605,Int(Times(Power($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),n_DEFAULT),Power(Times(a_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Times(a,f),-1),Subst(Int(Times(Power(x,m),Power(Plus(C1,Times(CN1,Sqr(x),Power(a,-2))),Times(C1D2,Plus(n,Negate(C1))))),x),x,Times(a,Sin(Plus(e,Times(f,x))))),x),And(FreeQ(List(a,e,f,m),x),IntegerQ(Times(C1D2,Plus(n,Negate(C1)))),Not(And(IntegerQ(Times(C1D2,Plus(m,Negate(C1)))),LtQ(C0,m,n)))))),
ISetDelayed(6606,Int(Times(Power(Times(a_DEFAULT,$($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_DEFAULT),Power($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),n_DEFAULT)),x_Symbol),
    Condition(Negate(Dist(Power(Times(a,f),-1),Subst(Int(Times(Power(x,m),Power(Plus(C1,Times(CN1,Sqr(x),Power(a,-2))),Times(C1D2,Plus(n,Negate(C1))))),x),x,Times(a,Cos(Plus(e,Times(f,x))))),x)),And(FreeQ(List(a,e,f,m),x),IntegerQ(Times(C1D2,Plus(n,Negate(C1)))),Not(And(IntegerQ(Times(C1D2,Plus(m,Negate(C1)))),GtQ(m,C0),LeQ(m,n)))))),
ISetDelayed(6607,Int(Times(Power(Times(b_DEFAULT,$($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_),Power(Times(a_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(a,Power(Times(a,Sin(Plus(e,Times(f,x)))),Plus(m,Negate(C1))),Power(Times(b,Cos(Plus(e,Times(f,x)))),Plus(n,C1)),Power(Times(b,f,Plus(n,C1)),-1)),x)),Dist(Times(Sqr(a),Plus(m,Negate(C1)),Power(Times(Sqr(b),Plus(n,C1)),-1)),Int(Times(Power(Times(a,Sin(Plus(e,Times(f,x)))),Plus(m,Negate(C2))),Power(Times(b,Cos(Plus(e,Times(f,x)))),Plus(n,C2))),x),x)),And(FreeQ(List(a,b,e,f),x),GtQ(m,C1),LtQ(n,CN1),Or(IntegersQ(Times(C2,m),Times(C2,n)),EqQ(Plus(m,n),C0))))),
ISetDelayed(6608,Int(Times(Power(Times(a_DEFAULT,$($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_),Power(Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Plus(Simp(Times(a,Power(Times(a,Cos(Plus(e,Times(f,x)))),Plus(m,Negate(C1))),Power(Times(b,Sin(Plus(e,Times(f,x)))),Plus(n,C1)),Power(Times(b,f,Plus(n,C1)),-1)),x),Dist(Times(Sqr(a),Plus(m,Negate(C1)),Power(Times(Sqr(b),Plus(n,C1)),-1)),Int(Times(Power(Times(a,Cos(Plus(e,Times(f,x)))),Plus(m,Negate(C2))),Power(Times(b,Sin(Plus(e,Times(f,x)))),Plus(n,C2))),x),x)),And(FreeQ(List(a,b,e,f),x),GtQ(m,C1),LtQ(n,CN1),Or(IntegersQ(Times(C2,m),Times(C2,n)),EqQ(Plus(m,n),C0))))),
ISetDelayed(6609,Int(Times(Power(Times(b_DEFAULT,$($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_),Power(Times(a_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(a,Power(Times(b,Cos(Plus(e,Times(f,x)))),Plus(n,C1)),Power(Times(a,Sin(Plus(e,Times(f,x)))),Plus(m,Negate(C1))),Power(Times(b,f,Plus(m,n)),-1)),x)),Dist(Times(Sqr(a),Plus(m,Negate(C1)),Power(Plus(m,n),-1)),Int(Times(Power(Times(b,Cos(Plus(e,Times(f,x)))),n),Power(Times(a,Sin(Plus(e,Times(f,x)))),Plus(m,Negate(C2)))),x),x)),And(FreeQ(List(a,b,e,f,n),x),GtQ(m,C1),NeQ(Plus(m,n),C0),IntegersQ(Times(C2,m),Times(C2,n))))),
ISetDelayed(6610,Int(Times(Power(Times(a_DEFAULT,$($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_),Power(Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Plus(Simp(Times(a,Power(Times(b,Sin(Plus(e,Times(f,x)))),Plus(n,C1)),Power(Times(a,Cos(Plus(e,Times(f,x)))),Plus(m,Negate(C1))),Power(Times(b,f,Plus(m,n)),-1)),x),Dist(Times(Sqr(a),Plus(m,Negate(C1)),Power(Plus(m,n),-1)),Int(Times(Power(Times(b,Sin(Plus(e,Times(f,x)))),n),Power(Times(a,Cos(Plus(e,Times(f,x)))),Plus(m,Negate(C2)))),x),x)),And(FreeQ(List(a,b,e,f,n),x),GtQ(m,C1),NeQ(Plus(m,n),C0),IntegersQ(Times(C2,m),Times(C2,n))))),
ISetDelayed(6611,Int(Times(Power(Times(b_DEFAULT,$($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_),Power(Times(a_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(b,Cos(Plus(e,Times(f,x)))),Plus(n,C1)),Power(Times(a,Sin(Plus(e,Times(f,x)))),Plus(m,C1)),Power(Times(a,b,f,Plus(m,C1)),-1)),x),Dist(Times(Plus(m,n,C2),Power(Times(Sqr(a),Plus(m,C1)),-1)),Int(Times(Power(Times(b,Cos(Plus(e,Times(f,x)))),n),Power(Times(a,Sin(Plus(e,Times(f,x)))),Plus(m,C2))),x),x)),And(FreeQ(List(a,b,e,f,n),x),LtQ(m,CN1),IntegersQ(Times(C2,m),Times(C2,n))))),
ISetDelayed(6612,Int(Times(Power(Times(a_DEFAULT,$($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_),Power(Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Times(b,Sin(Plus(e,Times(f,x)))),Plus(n,C1)),Power(Times(a,Cos(Plus(e,Times(f,x)))),Plus(m,C1)),Power(Times(a,b,f,Plus(m,C1)),-1)),x)),Dist(Times(Plus(m,n,C2),Power(Times(Sqr(a),Plus(m,C1)),-1)),Int(Times(Power(Times(b,Sin(Plus(e,Times(f,x)))),n),Power(Times(a,Cos(Plus(e,Times(f,x)))),Plus(m,C2))),x),x)),And(FreeQ(List(a,b,e,f,n),x),LtQ(m,CN1),IntegersQ(Times(C2,m),Times(C2,n))))),
ISetDelayed(6613,Int(Times(Sqrt(Times(b_DEFAULT,$($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),Sqrt(Times(a_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),x_Symbol),
    Condition(Dist(Times(Sqrt(Times(a,Sin(Plus(e,Times(f,x))))),Sqrt(Times(b,Cos(Plus(e,Times(f,x))))),Power(Sin(Plus(Times(C2,e),Times(C2,f,x))),CN1D2)),Int(Sqrt(Sin(Plus(Times(C2,e),Times(C2,f,x)))),x),x),FreeQ(List(a,b,e,f),x))),
ISetDelayed(6614,Int(Power(Times(Sqrt(Times(b_DEFAULT,$($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),Sqrt(Times(a_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),-1),x_Symbol),
    Condition(Dist(Times(Sqrt(Sin(Plus(Times(C2,e),Times(C2,f,x)))),Power(Times(Sqrt(Times(a,Sin(Plus(e,Times(f,x))))),Sqrt(Times(b,Cos(Plus(e,Times(f,x)))))),-1)),Int(Power(Sin(Plus(Times(C2,e),Times(C2,f,x))),CN1D2),x),x),FreeQ(List(a,b,e,f),x))),
ISetDelayed(6615,Int(Times(Power(Times(b_DEFAULT,$($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_),Power(Times(a_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_)),x_Symbol),
    Condition(With(List(Set(k,Denominator(m))),Dist(Times(k,a,b,Power(f,-1)),Subst(Int(Times(Power(x,Plus(Times(k,Plus(m,C1)),Negate(C1))),Power(Plus(Sqr(a),Times(Sqr(b),Power(x,Times(C2,k)))),-1)),x),x,Times(Power(Times(a,Sin(Plus(e,Times(f,x)))),Power(k,-1)),Power(Power(Times(b,Cos(Plus(e,Times(f,x)))),Power(k,-1)),-1))),x)),And(FreeQ(List(a,b,e,f),x),EqQ(Plus(m,n),C0),GtQ(m,C0),LtQ(m,C1)))),
ISetDelayed(6616,Int(Times(Power(Times(a_DEFAULT,$($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_),Power(Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(With(List(Set(k,Denominator(m))),Negate(Dist(Times(k,a,b,Power(f,-1)),Subst(Int(Times(Power(x,Plus(Times(k,Plus(m,C1)),Negate(C1))),Power(Plus(Sqr(a),Times(Sqr(b),Power(x,Times(C2,k)))),-1)),x),x,Times(Power(Times(a,Cos(Plus(e,Times(f,x)))),Power(k,-1)),Power(Power(Times(b,Sin(Plus(e,Times(f,x)))),Power(k,-1)),-1))),x))),And(FreeQ(List(a,b,e,f),x),EqQ(Plus(m,n),C0),GtQ(m,C0),LtQ(m,C1)))),
ISetDelayed(6617,Int(Times(Power(Times(a_DEFAULT,$($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_),Power(Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Negate(Simp(Times(Power(b,Plus(Times(C2,IntPart(Times(C1D2,Plus(n,Negate(C1))))),C1)),Power(Times(b,Sin(Plus(e,Times(f,x)))),Times(C2,FracPart(Times(C1D2,Plus(n,Negate(C1)))))),Power(Times(a,Cos(Plus(e,Times(f,x)))),Plus(m,C1)),Hypergeometric2F1(Times(C1D2,Plus(C1,m)),Times(C1D2,Plus(C1,Negate(n))),Times(C1D2,Plus(C3,m)),Sqr(Cos(Plus(e,Times(f,x))))),Power(Times(a,f,Plus(m,C1),Power(Sqr(Sin(Plus(e,Times(f,x)))),FracPart(Times(C1D2,Plus(n,Negate(C1)))))),-1)),x)),And(FreeQ(List(a,b,e,f,m,n),x),SimplerQ(n,m)))),
ISetDelayed(6618,Int(Times(Power(Times(b_DEFAULT,$($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_),Power(Times(a_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_)),x_Symbol),
    Condition(Simp(Times(Power(b,Plus(Times(C2,IntPart(Times(C1D2,Plus(n,Negate(C1))))),C1)),Power(Times(b,Cos(Plus(e,Times(f,x)))),Times(C2,FracPart(Times(C1D2,Plus(n,Negate(C1)))))),Power(Times(a,Sin(Plus(e,Times(f,x)))),Plus(m,C1)),Hypergeometric2F1(Times(C1D2,Plus(C1,m)),Times(C1D2,Plus(C1,Negate(n))),Times(C1D2,Plus(C3,m)),Sqr(Sin(Plus(e,Times(f,x))))),Power(Times(a,f,Plus(m,C1),Power(Sqr(Cos(Plus(e,Times(f,x)))),FracPart(Times(C1D2,Plus(n,Negate(C1)))))),-1)),x),FreeQ(List(a,b,e,f,m,n),x))),
ISetDelayed(6619,Int(Times(Power(Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_DEFAULT),Power(Times(a_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_DEFAULT)),x_Symbol),
    Condition(Simp(Times(b,Power(Times(a,Sin(Plus(e,Times(f,x)))),Plus(m,C1)),Power(Times(b,Sec(Plus(e,Times(f,x)))),Plus(n,Negate(C1))),Power(Times(a,f,Plus(m,C1)),-1)),x),And(FreeQ(List(a,b,e,f,m,n),x),EqQ(Plus(m,Negate(n),C2),C0),NeQ(m,CN1)))),
ISetDelayed(6620,Int(Times(Power(Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_),Power(Times(a_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_)),x_Symbol),
    Condition(Plus(Simp(Times(a,b,Power(Times(a,Sin(Plus(e,Times(f,x)))),Plus(m,Negate(C1))),Power(Times(b,Sec(Plus(e,Times(f,x)))),Plus(n,Negate(C1))),Power(Times(f,Plus(n,Negate(C1))),-1)),x),Negate(Dist(Times(Sqr(a),Sqr(b),Plus(m,Negate(C1)),Power(Plus(n,Negate(C1)),-1)),Int(Times(Power(Times(a,Sin(Plus(e,Times(f,x)))),Plus(m,Negate(C2))),Power(Times(b,Sec(Plus(e,Times(f,x)))),Plus(n,Negate(C2)))),x),x))),And(FreeQ(List(a,b,e,f),x),GtQ(n,C1),GtQ(m,C1),IntegersQ(Times(C2,m),Times(C2,n))))),
ISetDelayed(6621,Int(Times(Power(Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_),Power(Times(a_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(a,Sin(Plus(e,Times(f,x)))),Plus(m,C1)),Power(Times(b,Sec(Plus(e,Times(f,x)))),Plus(n,C1)),Power(Times(a,b,f,Plus(m,Negate(n))),-1)),x),Negate(Dist(Times(Plus(n,C1),Power(Times(Sqr(b),Plus(m,Negate(n))),-1)),Int(Times(Power(Times(a,Sin(Plus(e,Times(f,x)))),m),Power(Times(b,Sec(Plus(e,Times(f,x)))),Plus(n,C2))),x),x))),And(FreeQ(List(a,b,e,f,m),x),GtQ(n,C1),IntegersQ(Times(C2,m),Times(C2,n))))),
ISetDelayed(6622,Int(Times(Power(Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_),Power(Times(a_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(a,Sin(Plus(e,Times(f,x)))),Plus(m,C1)),Power(Times(b,Sec(Plus(e,Times(f,x)))),Plus(n,C1)),Power(Times(a,b,f,Plus(m,C1)),-1)),x),Negate(Dist(Times(Plus(n,C1),Power(Times(Sqr(a),Sqr(b),Plus(m,C1)),-1)),Int(Times(Power(Times(a,Sin(Plus(e,Times(f,x)))),Plus(m,C2)),Power(Times(b,Sec(Plus(e,Times(f,x)))),Plus(n,C2))),x),x))),And(FreeQ(List(a,b,e,f),x),LtQ(n,CN1),LtQ(m,CN1),IntegersQ(Times(C2,m),Times(C2,n))))),
ISetDelayed(6623,Int(Times(Power(Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_),Power(Times(a_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(a,Sin(Plus(e,Times(f,x)))),Plus(m,C1)),Power(Times(b,Sec(Plus(e,Times(f,x)))),Plus(n,C1)),Power(Times(a,b,f,Plus(m,Negate(n))),-1)),x),Negate(Dist(Times(Plus(n,C1),Power(Times(Sqr(b),Plus(m,Negate(n))),-1)),Int(Times(Power(Times(a,Sin(Plus(e,Times(f,x)))),m),Power(Times(b,Sec(Plus(e,Times(f,x)))),Plus(n,C2))),x),x))),And(FreeQ(List(a,b,e,f,m),x),LtQ(n,CN1),NeQ(Plus(m,Negate(n)),C0),IntegersQ(Times(C2,m),Times(C2,n))))),
ISetDelayed(6624,Int(Times(Power(Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_),Power(Times(a_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(a,b,Power(Times(a,Sin(Plus(e,Times(f,x)))),Plus(m,Negate(C1))),Power(Times(b,Sec(Plus(e,Times(f,x)))),Plus(n,Negate(C1))),Power(Times(f,Plus(m,Negate(n))),-1)),x)),Dist(Times(Sqr(a),Plus(m,Negate(C1)),Power(Plus(m,Negate(n)),-1)),Int(Times(Power(Times(a,Sin(Plus(e,Times(f,x)))),Plus(m,Negate(C2))),Power(Times(b,Sec(Plus(e,Times(f,x)))),n)),x),x)),And(FreeQ(List(a,b,e,f,n),x),GtQ(m,C1),NeQ(Plus(m,Negate(n)),C0),IntegersQ(Times(C2,m),Times(C2,n))))),
ISetDelayed(6625,Int(Times(Power(Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_),Power(Times(a_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_)),x_Symbol),
    Condition(Plus(Simp(Times(b,Power(Times(a,Sin(Plus(e,Times(f,x)))),Plus(m,C1)),Power(Times(b,Sec(Plus(e,Times(f,x)))),Plus(n,Negate(C1))),Power(Times(a,f,Plus(m,C1)),-1)),x),Dist(Times(Plus(m,Negate(n),C2),Power(Times(Sqr(a),Plus(m,C1)),-1)),Int(Times(Power(Times(a,Sin(Plus(e,Times(f,x)))),Plus(m,C2)),Power(Times(b,Sec(Plus(e,Times(f,x)))),n)),x),x)),And(FreeQ(List(a,b,e,f,n),x),LtQ(m,CN1),IntegersQ(Times(C2,m),Times(C2,n))))),
ISetDelayed(6626,Int(Times(Power(Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_),Power(Times(a_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_)),x_Symbol),
    Condition(Dist(Times(Power(Times(b,Cos(Plus(e,Times(f,x)))),n),Power(Times(b,Sec(Plus(e,Times(f,x)))),n)),Int(Times(Power(Times(a,Sin(Plus(e,Times(f,x)))),m),Power(Power(Times(b,Cos(Plus(e,Times(f,x)))),n),-1)),x),x),And(FreeQ(List(a,b,e,f,m,n),x),IntegerQ(Plus(m,Negate(C1D2))),IntegerQ(Plus(n,Negate(C1D2)))))),
ISetDelayed(6627,Int(Times(Power(Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_),Power(Times(a_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_)),x_Symbol),
    Condition(Dist(Times(C1,Power(Times(b,Cos(Plus(e,Times(f,x)))),Plus(n,C1)),Power(Times(b,Sec(Plus(e,Times(f,x)))),Plus(n,C1)),Power(b,-2)),Int(Times(Power(Times(a,Sin(Plus(e,Times(f,x)))),m),Power(Power(Times(b,Cos(Plus(e,Times(f,x)))),n),-1)),x),x),And(FreeQ(List(a,b,e,f,m,n),x),Not(IntegerQ(m)),Not(IntegerQ(n)),LtQ(n,C1)))),
ISetDelayed(6628,Int(Times(Power(Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_),Power(Times(a_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_)),x_Symbol),
    Condition(Dist(Times(Sqr(b),Power(Times(b,Cos(Plus(e,Times(f,x)))),Plus(n,Negate(C1))),Power(Times(b,Sec(Plus(e,Times(f,x)))),Plus(n,Negate(C1)))),Int(Times(Power(Times(a,Sin(Plus(e,Times(f,x)))),m),Power(Power(Times(b,Cos(Plus(e,Times(f,x)))),n),-1)),x),x),And(FreeQ(List(a,b,e,f,m,n),x),Not(IntegerQ(m)),Not(IntegerQ(n))))),
ISetDelayed(6629,Int(Times(Power(Times(b_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_),Power(Times(a_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(Times(a,b),IntPart(n)),Power(Times(a,Sin(Plus(e,Times(f,x)))),FracPart(n)),Power(Times(b,Csc(Plus(e,Times(f,x)))),FracPart(n))),Int(Power(Times(a,Sin(Plus(e,Times(f,x)))),Plus(m,Negate(n))),x),x),And(FreeQ(List(a,b,e,f,m,n),x),Not(IntegerQ(m)),Not(IntegerQ(n))))),
ISetDelayed(6630,Int(Times(Power(Times(a_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_),Power(Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Negate(Simp(Times(b,Power(Times(a,Sin(Plus(e,Times(f,x)))),m),Power(Times(b,Tan(Plus(e,Times(f,x)))),Plus(n,Negate(C1))),Power(Times(f,m),-1)),x)),And(FreeQ(List(a,b,e,f,m,n),x),EqQ(Plus(m,n,Negate(C1)),C0)))),
ISetDelayed(6631,Int(Times(Power($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),m_DEFAULT),Power($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),n_DEFAULT)),x_Symbol),
    Condition(Negate(Dist(Power(f,-1),Subst(Int(Times(Power(Plus(C1,Negate(Sqr(x))),Times(C1D2,Plus(m,n,Negate(C1)))),Power(Power(x,n),-1)),x),x,Cos(Plus(e,Times(f,x)))),x)),And(FreeQ(List(e,f),x),IntegersQ(m,n,Times(C1D2,Plus(m,n,Negate(C1))))))),
ISetDelayed(6632,Int(Times(Power($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),m_),Power(Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(With(List(Set($s("ff"),FreeFactors(Tan(Plus(e,Times(f,x))),x))),Dist(Times(b,$s("ff"),Power(f,-1)),Subst(Int(Times(Power(Times($s("ff"),x),Plus(m,n)),Power(Power(Plus(Sqr(b),Times(Sqr($s("ff")),Sqr(x))),Plus(Times(C1D2,m),C1)),-1)),x),x,Times(b,Tan(Plus(e,Times(f,x))),Power($s("ff"),-1))),x)),And(FreeQ(List(b,e,f,n),x),IntegerQ(Times(C1D2,m))))),
ISetDelayed(6633,Int(Times(Power(Times(a_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_DEFAULT),Power($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),n_DEFAULT)),x_Symbol),
    Condition(With(List(Set($s("ff"),FreeFactors(Sin(Plus(e,Times(f,x))),x))),Dist(Times($s("ff"),Power(f,-1)),Subst(Int(Times(Power(Times($s("ff"),x),Plus(m,n)),Power(Power(Plus(Sqr(a),Times(CN1,Sqr($s("ff")),Sqr(x))),Times(C1D2,Plus(n,C1))),-1)),x),x,Times(a,Sin(Plus(e,Times(f,x))),Power($s("ff"),-1))),x)),And(FreeQ(List(a,e,f,m),x),IntegerQ(Times(C1D2,Plus(n,C1)))))),
ISetDelayed(6634,Int(Times(Power(Times(a_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_),Power(Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Plus(Simp(Times(b,Power(Times(a,Sin(Plus(e,Times(f,x)))),Plus(m,C2)),Power(Times(b,Tan(Plus(e,Times(f,x)))),Plus(n,Negate(C1))),Power(Times(Sqr(a),f,Plus(n,Negate(C1))),-1)),x),Negate(Dist(Times(Sqr(b),Plus(m,C2),Power(Times(Sqr(a),Plus(n,Negate(C1))),-1)),Int(Times(Power(Times(a,Sin(Plus(e,Times(f,x)))),Plus(m,C2)),Power(Times(b,Tan(Plus(e,Times(f,x)))),Plus(n,Negate(C2)))),x),x))),And(FreeQ(List(a,b,e,f),x),GtQ(n,C1),Or(LtQ(m,CN1),And(EqQ(m,CN1),EqQ(n,QQ(3L,2L)))),IntegersQ(Times(C2,m),Times(C2,n))))),
ISetDelayed(6635,Int(Times(Power(Times(a_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_DEFAULT),Power(Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Plus(Simp(Times(b,Power(Times(a,Sin(Plus(e,Times(f,x)))),m),Power(Times(b,Tan(Plus(e,Times(f,x)))),Plus(n,Negate(C1))),Power(Times(f,Plus(n,Negate(C1))),-1)),x),Negate(Dist(Times(Sqr(b),Plus(m,n,Negate(C1)),Power(Plus(n,Negate(C1)),-1)),Int(Times(Power(Times(a,Sin(Plus(e,Times(f,x)))),m),Power(Times(b,Tan(Plus(e,Times(f,x)))),Plus(n,Negate(C2)))),x),x))),And(FreeQ(List(a,b,e,f,m),x),GtQ(n,C1),IntegersQ(Times(C2,m),Times(C2,n)),Not(And(GtQ(m,C1),Not(IntegerQ(Times(C1D2,Plus(m,Negate(C1)))))))))),
ISetDelayed(6636,Int(Times(Sqrt(Times(a_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),Power(Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),QQ(-3L,2L))),x_Symbol),
    Condition(Plus(Simp(Times(C2,Sqrt(Times(a,Sin(Plus(e,Times(f,x))))),Power(Times(b,f,Sqrt(Times(b,Tan(Plus(e,Times(f,x)))))),-1)),x),Dist(Times(Sqr(a),Power(b,-2)),Int(Times(Sqrt(Times(b,Tan(Plus(e,Times(f,x))))),Power(Times(a,Sin(Plus(e,Times(f,x)))),QQ(-3L,2L))),x),x)),FreeQ(List(a,b,e,f),x))),
ISetDelayed(6637,Int(Times(Power(Times(a_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_),Power(Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(a,Sin(Plus(e,Times(f,x)))),m),Power(Times(b,Tan(Plus(e,Times(f,x)))),Plus(n,C1)),Power(Times(b,f,m),-1)),x),Negate(Dist(Times(Sqr(a),Plus(n,C1),Power(Times(Sqr(b),m),-1)),Int(Times(Power(Times(a,Sin(Plus(e,Times(f,x)))),Plus(m,Negate(C2))),Power(Times(b,Tan(Plus(e,Times(f,x)))),Plus(n,C2))),x),x))),And(FreeQ(List(a,b,e,f),x),LtQ(n,CN1),GtQ(m,C1),IntegersQ(Times(C2,m),Times(C2,n))))),
ISetDelayed(6638,Int(Times(Power(Times(a_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_DEFAULT),Power(Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(a,Sin(Plus(e,Times(f,x)))),m),Power(Times(b,Tan(Plus(e,Times(f,x)))),Plus(n,C1)),Power(Times(b,f,Plus(m,n,C1)),-1)),x),Negate(Dist(Times(Plus(n,C1),Power(Times(Sqr(b),Plus(m,n,C1)),-1)),Int(Times(Power(Times(a,Sin(Plus(e,Times(f,x)))),m),Power(Times(b,Tan(Plus(e,Times(f,x)))),Plus(n,C2))),x),x))),And(FreeQ(List(a,b,e,f,m),x),LtQ(n,CN1),NeQ(Plus(m,n,C1),C0),IntegersQ(Times(C2,m),Times(C2,n)),Not(And(EqQ(n,QQ(-3L,2L)),EqQ(m,C1)))))),
ISetDelayed(6639,Int(Times(Power(Times(a_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_DEFAULT),Power(Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,Power(Times(a,Sin(Plus(e,Times(f,x)))),m),Power(Times(b,Tan(Plus(e,Times(f,x)))),Plus(n,Negate(C1))),Power(Times(f,m),-1)),x)),Dist(Times(Sqr(a),Plus(m,n,Negate(C1)),Power(m,-1)),Int(Times(Power(Times(a,Sin(Plus(e,Times(f,x)))),Plus(m,Negate(C2))),Power(Times(b,Tan(Plus(e,Times(f,x)))),n)),x),x)),And(FreeQ(List(a,b,e,f,n),x),Or(GtQ(m,C1),And(EqQ(m,C1),EqQ(n,C1D2))),IntegersQ(Times(C2,m),Times(C2,n))))),
ISetDelayed(6640,Int(Times(Power(Times(a_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_),Power(Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(b,Power(Times(a,Sin(Plus(e,Times(f,x)))),Plus(m,C2)),Power(Times(b,Tan(Plus(e,Times(f,x)))),Plus(n,Negate(C1))),Power(Times(Sqr(a),f,Plus(m,n,C1)),-1)),x),Dist(Times(Plus(m,C2),Power(Times(Sqr(a),Plus(m,n,C1)),-1)),Int(Times(Power(Times(a,Sin(Plus(e,Times(f,x)))),Plus(m,C2)),Power(Times(b,Tan(Plus(e,Times(f,x)))),n)),x),x)),And(FreeQ(List(a,b,e,f,n),x),LtQ(m,CN1),NeQ(Plus(m,n,C1),C0),IntegersQ(Times(C2,m),Times(C2,n))))),
ISetDelayed(6641,Int(Times(Power(Times(a_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_),Power($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),n_)),x_Symbol),
    Condition(Dist(Power(Power(a,n),-1),Int(Times(Power(Times(a,Sin(Plus(e,Times(f,x)))),Plus(m,n)),Power(Power(Cos(Plus(e,Times(f,x))),n),-1)),x),x),And(FreeQ(List(a,e,f,m),x),IntegerQ(n),Not(IntegerQ(m)))))
  );
}
