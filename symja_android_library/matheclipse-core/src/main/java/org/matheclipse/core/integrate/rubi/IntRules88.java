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
public class IntRules88 { 
  public static IAST RULES = List( 
IIntegrate(8383,Int(u_,x_Symbol),
    Condition(With(List(Set(v,ExpandTrig(u,x))),Condition(Int(v,x),SumQ(v))),Not(InertTrigFreeQ(u)))),
IIntegrate(8384,Int(u_,x_Symbol),
    Condition(With(List(Set(w,Block(List(Set($s("§$showsteps"),False),Set($s("§$stepcounter"),Null)),Int(SubstFor(Power(Plus(C1,Times(Sqr(FreeFactors(Tan(Times(C1D2,FunctionOfTrig(u,x))),x)),Sqr(x))),-1),Times(Tan(Times(C1D2,FunctionOfTrig(u,x))),Power(FreeFactors(Tan(Times(C1D2,FunctionOfTrig(u,x))),x),-1)),u,x),x)))),Condition(Module(List(Set(v,FunctionOfTrig(u,x)),d),Simp(CompoundExpression(Set(d,FreeFactors(Tan(Times(C1D2,v)),x)),Dist(Times(C2,d,Power(Coefficient(v,x,C1),-1)),Subst(Int(SubstFor(Power(Plus(C1,Times(Sqr(d),Sqr(x))),-1),Times(Tan(Times(C1D2,v)),Power(d,-1)),u,x),x),x,Times(Tan(Times(C1D2,v)),Power(d,-1))),x)),x)),CalculusFreeQ(w,x))),And(InverseFunctionFreeQ(u,x),Not(FalseQ(FunctionOfTrig(u,x)))))),
IIntegrate(8385,Int(u_,x_Symbol),
    Condition(With(List(Set(v,ActivateTrig(u))),CannotIntegrate(v,x)),Not(InertTrigFreeQ(u)))),
IIntegrate(8386,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Cos(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),Power(Sin(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(c,Times(d,x)),m),Power(Sin(Plus(a,Times(b,x))),Plus(n,C1)),Power(Times(b,Plus(n,C1)),-1)),x),Negate(Dist(Times(d,m,Power(Times(b,Plus(n,C1)),-1)),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,Negate(C1))),Power(Sin(Plus(a,Times(b,x))),Plus(n,C1))),x),x))),And(FreeQ(List(a,b,c,d,n),x),IGtQ(m,C0),NeQ(n,CN1)))),
IIntegrate(8387,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Power(Cos(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_DEFAULT),Sin(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Plus(c,Times(d,x)),m),Power(Cos(Plus(a,Times(b,x))),Plus(n,C1)),Power(Times(b,Plus(n,C1)),-1)),x)),Dist(Times(d,m,Power(Times(b,Plus(n,C1)),-1)),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,Negate(C1))),Power(Cos(Plus(a,Times(b,x))),Plus(n,C1))),x),x)),And(FreeQ(List(a,b,c,d,n),x),IGtQ(m,C0),NeQ(n,CN1)))),
IIntegrate(8388,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Power(Cos(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),p_DEFAULT),Power(Sin(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_DEFAULT)),x_Symbol),
    Condition(Int(ExpandTrigReduce(Power(Plus(c,Times(d,x)),m),Times(Power(Sin(Plus(a,Times(b,x))),n),Power(Cos(Plus(a,Times(b,x))),p)),x),x),And(FreeQ(List(a,b,c,d,m),x),IGtQ(n,C0),IGtQ(p,C0)))),
IIntegrate(8389,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Power(Sin(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_DEFAULT),Power(Tan(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Negate(Int(Times(Power(Plus(c,Times(d,x)),m),Power(Sin(Plus(a,Times(b,x))),n),Power(Tan(Plus(a,Times(b,x))),Plus(p,Negate(C2)))),x)),Int(Times(Power(Plus(c,Times(d,x)),m),Power(Sin(Plus(a,Times(b,x))),Plus(n,Negate(C2))),Power(Tan(Plus(a,Times(b,x))),p)),x)),And(FreeQ(List(a,b,c,d,m),x),IGtQ(n,C0),IGtQ(p,C0)))),
IIntegrate(8390,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Power(Cos(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_DEFAULT),Power(Cot(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Negate(Int(Times(Power(Plus(c,Times(d,x)),m),Power(Cos(Plus(a,Times(b,x))),n),Power(Cot(Plus(a,Times(b,x))),Plus(p,Negate(C2)))),x)),Int(Times(Power(Plus(c,Times(d,x)),m),Power(Cos(Plus(a,Times(b,x))),Plus(n,Negate(C2))),Power(Cot(Plus(a,Times(b,x))),p)),x)),And(FreeQ(List(a,b,c,d,m),x),IGtQ(n,C0),IGtQ(p,C0)))),
IIntegrate(8391,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Power(Sec(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_DEFAULT),Power(Tan(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(c,Times(d,x)),m),Power(Sec(Plus(a,Times(b,x))),n),Power(Times(b,n),-1)),x),Negate(Dist(Times(d,m,Power(Times(b,n),-1)),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,Negate(C1))),Power(Sec(Plus(a,Times(b,x))),n)),x),x))),And(FreeQ(List(a,b,c,d,n),x),EqQ(p,C1),GtQ(m,C0)))),
IIntegrate(8392,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Power(Cot(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),p_DEFAULT),Power(Csc(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_DEFAULT)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Plus(c,Times(d,x)),m),Power(Csc(Plus(a,Times(b,x))),n),Power(Times(b,n),-1)),x)),Dist(Times(d,m,Power(Times(b,n),-1)),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,Negate(C1))),Power(Csc(Plus(a,Times(b,x))),n)),x),x)),And(FreeQ(List(a,b,c,d,n),x),EqQ(p,C1),GtQ(m,C0)))),
IIntegrate(8393,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Sqr(Sec(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Tan(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(c,Times(d,x)),m),Power(Tan(Plus(a,Times(b,x))),Plus(n,C1)),Power(Times(b,Plus(n,C1)),-1)),x),Negate(Dist(Times(d,m,Power(Times(b,Plus(n,C1)),-1)),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,Negate(C1))),Power(Tan(Plus(a,Times(b,x))),Plus(n,C1))),x),x))),And(FreeQ(List(a,b,c,d,n),x),IGtQ(m,C0),NeQ(n,CN1)))),
IIntegrate(8394,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Power(Cot(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_DEFAULT),Sqr(Csc(Plus(a_DEFAULT,Times(b_DEFAULT,x_))))),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Plus(c,Times(d,x)),m),Power(Cot(Plus(a,Times(b,x))),Plus(n,C1)),Power(Times(b,Plus(n,C1)),-1)),x)),Dist(Times(d,m,Power(Times(b,Plus(n,C1)),-1)),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,Negate(C1))),Power(Cot(Plus(a,Times(b,x))),Plus(n,C1))),x),x)),And(FreeQ(List(a,b,c,d,n),x),IGtQ(m,C0),NeQ(n,CN1)))),
IIntegrate(8395,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Sec(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),Power(Tan(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),p_)),x_Symbol),
    Condition(Plus(Negate(Int(Times(Power(Plus(c,Times(d,x)),m),Sec(Plus(a,Times(b,x))),Power(Tan(Plus(a,Times(b,x))),Plus(p,Negate(C2)))),x)),Int(Times(Power(Plus(c,Times(d,x)),m),Power(Sec(Plus(a,Times(b,x))),3),Power(Tan(Plus(a,Times(b,x))),Plus(p,Negate(C2)))),x)),And(FreeQ(List(a,b,c,d,m),x),IGtQ(Times(C1D2,p),C0)))),
IIntegrate(8396,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Power(Sec(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_DEFAULT),Power(Tan(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),p_)),x_Symbol),
    Condition(Plus(Negate(Int(Times(Power(Plus(c,Times(d,x)),m),Power(Sec(Plus(a,Times(b,x))),n),Power(Tan(Plus(a,Times(b,x))),Plus(p,Negate(C2)))),x)),Int(Times(Power(Plus(c,Times(d,x)),m),Power(Sec(Plus(a,Times(b,x))),Plus(n,C2)),Power(Tan(Plus(a,Times(b,x))),Plus(p,Negate(C2)))),x)),And(FreeQ(List(a,b,c,d,m,n),x),IGtQ(Times(C1D2,p),C0)))),
IIntegrate(8397,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Power(Cot(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),p_),Csc(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Negate(Int(Times(Power(Plus(c,Times(d,x)),m),Csc(Plus(a,Times(b,x))),Power(Cot(Plus(a,Times(b,x))),Plus(p,Negate(C2)))),x)),Int(Times(Power(Plus(c,Times(d,x)),m),Power(Csc(Plus(a,Times(b,x))),3),Power(Cot(Plus(a,Times(b,x))),Plus(p,Negate(C2)))),x)),And(FreeQ(List(a,b,c,d,m),x),IGtQ(Times(C1D2,p),C0)))),
IIntegrate(8398,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Power(Cot(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),p_),Power(Csc(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_DEFAULT)),x_Symbol),
    Condition(Plus(Negate(Int(Times(Power(Plus(c,Times(d,x)),m),Power(Csc(Plus(a,Times(b,x))),n),Power(Cot(Plus(a,Times(b,x))),Plus(p,Negate(C2)))),x)),Int(Times(Power(Plus(c,Times(d,x)),m),Power(Csc(Plus(a,Times(b,x))),Plus(n,C2)),Power(Cot(Plus(a,Times(b,x))),Plus(p,Negate(C2)))),x)),And(FreeQ(List(a,b,c,d,m,n),x),IGtQ(Times(C1D2,p),C0)))),
IIntegrate(8399,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Power(Sec(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_DEFAULT),Power(Tan(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),p_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(u,IntHide(Times(Power(Sec(Plus(a,Times(b,x))),n),Power(Tan(Plus(a,Times(b,x))),p)),x))),Plus(Dist(Power(Plus(c,Times(d,x)),m),u,x),Negate(Dist(Times(d,m),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,Negate(C1))),u),x),x)))),And(FreeQ(List(a,b,c,d,n,p),x),IGtQ(m,C0),Or(IntegerQ(Times(C1D2,n)),IntegerQ(Times(C1D2,Plus(p,Negate(C1)))))))),
IIntegrate(8400,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Power(Cot(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),p_DEFAULT),Power(Csc(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(u,IntHide(Times(Power(Csc(Plus(a,Times(b,x))),n),Power(Cot(Plus(a,Times(b,x))),p)),x))),Plus(Dist(Power(Plus(c,Times(d,x)),m),u,x),Negate(Dist(Times(d,m),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,Negate(C1))),u),x),x)))),And(FreeQ(List(a,b,c,d,n,p),x),IGtQ(m,C0),Or(IntegerQ(Times(C1D2,n)),IntegerQ(Times(C1D2,Plus(p,Negate(C1)))))))),
IIntegrate(8401,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Power(Csc(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_DEFAULT),Power(Sec(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_DEFAULT)),x_Symbol),
    Condition(Dist(Power(C2,n),Int(Times(Power(Plus(c,Times(d,x)),m),Power(Csc(Plus(Times(C2,a),Times(C2,b,x))),n)),x),x),And(FreeQ(List(a,b,c,d,m),x),IntegerQ(n),RationalQ(m)))),
IIntegrate(8402,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Power(Csc(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_DEFAULT),Power(Sec(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),p_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(u,IntHide(Times(Power(Csc(Plus(a,Times(b,x))),n),Power(Sec(Plus(a,Times(b,x))),p)),x))),Plus(Dist(Power(Plus(c,Times(d,x)),m),u,x),Negate(Dist(Times(d,m),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,Negate(C1))),u),x),x)))),And(FreeQ(List(a,b,c,d),x),IntegersQ(n,p),GtQ(m,C0),NeQ(n,p)))),
IIntegrate(8403,Int(Times(Power(u_,m_DEFAULT),Power($(F_,v_),n_DEFAULT),Power($(G_,w_),p_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(ExpandToSum(u,x),m),Power(F(ExpandToSum(v,x)),n),Power(G(ExpandToSum(v,x)),p)),x),And(FreeQ(List(m,n,p),x),TrigQ(FSymbol),TrigQ(GSymbol),EqQ(v,w),LinearQ(List(u,v,w),x),Not(LinearMatchQ(List(u,v,w),x))))),
IIntegrate(8404,Int(Times(Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Cos(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),Power(Plus(a_,Times(b_DEFAULT,Sin(Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),n_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(e,Times(f,x)),m),Power(Plus(a,Times(b,Sin(Plus(c,Times(d,x))))),Plus(n,C1)),Power(Times(b,d,Plus(n,C1)),-1)),x),Negate(Dist(Times(f,m,Power(Times(b,d,Plus(n,C1)),-1)),Int(Times(Power(Plus(e,Times(f,x)),Plus(m,Negate(C1))),Power(Plus(a,Times(b,Sin(Plus(c,Times(d,x))))),Plus(n,C1))),x),x))),And(FreeQ(List(a,b,c,d,e,f,n),x),IGtQ(m,C0),NeQ(n,CN1)))),
IIntegrate(8405,Int(Times(Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Cos(Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),n_DEFAULT),Sin(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Plus(e,Times(f,x)),m),Power(Plus(a,Times(b,Cos(Plus(c,Times(d,x))))),Plus(n,C1)),Power(Times(b,d,Plus(n,C1)),-1)),x)),Dist(Times(f,m,Power(Times(b,d,Plus(n,C1)),-1)),Int(Times(Power(Plus(e,Times(f,x)),Plus(m,Negate(C1))),Power(Plus(a,Times(b,Cos(Plus(c,Times(d,x))))),Plus(n,C1))),x),x)),And(FreeQ(List(a,b,c,d,e,f,n),x),IGtQ(m,C0),NeQ(n,CN1)))),
IIntegrate(8406,Int(Times(Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Sqr(Sec(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),Power(Plus(a_,Times(b_DEFAULT,Tan(Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),n_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(e,Times(f,x)),m),Power(Plus(a,Times(b,Tan(Plus(c,Times(d,x))))),Plus(n,C1)),Power(Times(b,d,Plus(n,C1)),-1)),x),Negate(Dist(Times(f,m,Power(Times(b,d,Plus(n,C1)),-1)),Int(Times(Power(Plus(e,Times(f,x)),Plus(m,Negate(C1))),Power(Plus(a,Times(b,Tan(Plus(c,Times(d,x))))),Plus(n,C1))),x),x))),And(FreeQ(List(a,b,c,d,e,f,n),x),IGtQ(m,C0),NeQ(n,CN1)))),
IIntegrate(8407,Int(Times(Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Cot(Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),n_DEFAULT),Sqr(Csc(Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Plus(e,Times(f,x)),m),Power(Plus(a,Times(b,Cot(Plus(c,Times(d,x))))),Plus(n,C1)),Power(Times(b,d,Plus(n,C1)),-1)),x)),Dist(Times(f,m,Power(Times(b,d,Plus(n,C1)),-1)),Int(Times(Power(Plus(e,Times(f,x)),Plus(m,Negate(C1))),Power(Plus(a,Times(b,Cot(Plus(c,Times(d,x))))),Plus(n,C1))),x),x)),And(FreeQ(List(a,b,c,d,e,f,n),x),IGtQ(m,C0),NeQ(n,CN1)))),
IIntegrate(8408,Int(Times(Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Sec(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),Power(Plus(a_,Times(b_DEFAULT,Sec(Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),n_DEFAULT),Tan(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(e,Times(f,x)),m),Power(Plus(a,Times(b,Sec(Plus(c,Times(d,x))))),Plus(n,C1)),Power(Times(b,d,Plus(n,C1)),-1)),x),Negate(Dist(Times(f,m,Power(Times(b,d,Plus(n,C1)),-1)),Int(Times(Power(Plus(e,Times(f,x)),Plus(m,Negate(C1))),Power(Plus(a,Times(b,Sec(Plus(c,Times(d,x))))),Plus(n,C1))),x),x))),And(FreeQ(List(a,b,c,d,e,f,n),x),IGtQ(m,C0),NeQ(n,CN1)))),
IIntegrate(8409,Int(Times(Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Cot(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),Csc(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),Power(Plus(a_,Times(b_DEFAULT,Csc(Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),n_DEFAULT)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Plus(e,Times(f,x)),m),Power(Plus(a,Times(b,Csc(Plus(c,Times(d,x))))),Plus(n,C1)),Power(Times(b,d,Plus(n,C1)),-1)),x)),Dist(Times(f,m,Power(Times(b,d,Plus(n,C1)),-1)),Int(Times(Power(Plus(e,Times(f,x)),Plus(m,Negate(C1))),Power(Plus(a,Times(b,Csc(Plus(c,Times(d,x))))),Plus(n,C1))),x),x)),And(FreeQ(List(a,b,c,d,e,f,n),x),IGtQ(m,C0),NeQ(n,CN1)))),
IIntegrate(8410,Int(Times(Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power(Sin(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),p_DEFAULT),Power(Sin(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),q_DEFAULT)),x_Symbol),
    Condition(Int(ExpandTrigReduce(Power(Plus(e,Times(f,x)),m),Times(Power(Sin(Plus(a,Times(b,x))),p),Power(Sin(Plus(c,Times(d,x))),q)),x),x),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(p,C0),IGtQ(q,C0),IntegerQ(m)))),
IIntegrate(8411,Int(Times(Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power(Cos(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),p_DEFAULT),Power(Cos(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),q_DEFAULT)),x_Symbol),
    Condition(Int(ExpandTrigReduce(Power(Plus(e,Times(f,x)),m),Times(Power(Cos(Plus(a,Times(b,x))),p),Power(Cos(Plus(c,Times(d,x))),q)),x),x),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(p,C0),IGtQ(q,C0),IntegerQ(m)))),
IIntegrate(8412,Int(Times(Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power(Cos(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),q_DEFAULT),Power(Sin(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandTrigReduce(Power(Plus(e,Times(f,x)),m),Times(Power(Sin(Plus(a,Times(b,x))),p),Power(Cos(Plus(c,Times(d,x))),q)),x),x),And(FreeQ(List(a,b,c,d,e,f,m),x),IGtQ(p,C0),IGtQ(q,C0)))),
IIntegrate(8413,Int(Times(Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power($(F_,Plus(a_DEFAULT,Times(b_DEFAULT,x_))),p_DEFAULT),Power($(G_,Plus(c_DEFAULT,Times(d_DEFAULT,x_))),q_DEFAULT)),x_Symbol),
    Condition(Int(ExpandTrigExpand(Times(Power(Plus(e,Times(f,x)),m),Power(G(Plus(c,Times(d,x))),q)),FSymbol,Plus(c,Times(d,x)),p,Times(b,Power(d,-1)),x),x),And(FreeQ(List(a,b,c,d,e,f,m),x),MemberQ(List($s("Sin"),$s("Cos")),FSymbol),MemberQ(List($s("Sec"),$s("Csc")),GSymbol),IGtQ(p,C0),IGtQ(q,C0),EqQ(Plus(Times(b,c),Times(CN1,a,d)),C0),IGtQ(Times(b,Power(d,-1)),C1)))),
IIntegrate(8414,Int(Times(Power(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Sin(Plus(d_DEFAULT,Times(e_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Simp(Times(b,c,Log(FSymbol),Power(FSymbol,Times(c,Plus(a,Times(b,x)))),Sin(Plus(d,Times(e,x))),Power(Plus(Sqr(e),Times(Sqr(b),Sqr(c),Sqr(Log(FSymbol)))),-1)),x),Negate(Simp(Times(e,Power(FSymbol,Times(c,Plus(a,Times(b,x)))),Cos(Plus(d,Times(e,x))),Power(Plus(Sqr(e),Times(Sqr(b),Sqr(c),Sqr(Log(FSymbol)))),-1)),x))),And(FreeQ(List(FSymbol,a,b,c,d,e),x),NeQ(Plus(Sqr(e),Times(Sqr(b),Sqr(c),Sqr(Log(FSymbol)))),C0)))),
IIntegrate(8415,Int(Times(Power(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Cos(Plus(d_DEFAULT,Times(e_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Simp(Times(b,c,Log(FSymbol),Power(FSymbol,Times(c,Plus(a,Times(b,x)))),Cos(Plus(d,Times(e,x))),Power(Plus(Sqr(e),Times(Sqr(b),Sqr(c),Sqr(Log(FSymbol)))),-1)),x),Simp(Times(e,Power(FSymbol,Times(c,Plus(a,Times(b,x)))),Sin(Plus(d,Times(e,x))),Power(Plus(Sqr(e),Times(Sqr(b),Sqr(c),Sqr(Log(FSymbol)))),-1)),x)),And(FreeQ(List(FSymbol,a,b,c,d,e),x),NeQ(Plus(Sqr(e),Times(Sqr(b),Sqr(c),Sqr(Log(FSymbol)))),C0)))),
IIntegrate(8416,Int(Times(Power(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Sin(Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_)),x_Symbol),
    Condition(Plus(Simp(Times(b,c,Log(FSymbol),Power(FSymbol,Times(c,Plus(a,Times(b,x)))),Power(Sin(Plus(d,Times(e,x))),n),Power(Plus(Times(Sqr(e),Sqr(n)),Times(Sqr(b),Sqr(c),Sqr(Log(FSymbol)))),-1)),x),Dist(Times(n,Plus(n,Negate(C1)),Sqr(e),Power(Plus(Times(Sqr(e),Sqr(n)),Times(Sqr(b),Sqr(c),Sqr(Log(FSymbol)))),-1)),Int(Times(Power(FSymbol,Times(c,Plus(a,Times(b,x)))),Power(Sin(Plus(d,Times(e,x))),Plus(n,Negate(C2)))),x),x),Negate(Simp(Times(e,n,Power(FSymbol,Times(c,Plus(a,Times(b,x)))),Cos(Plus(d,Times(e,x))),Power(Sin(Plus(d,Times(e,x))),Plus(n,Negate(C1))),Power(Plus(Times(Sqr(e),Sqr(n)),Times(Sqr(b),Sqr(c),Sqr(Log(FSymbol)))),-1)),x))),And(FreeQ(List(FSymbol,a,b,c,d,e),x),NeQ(Plus(Times(Sqr(e),Sqr(n)),Times(Sqr(b),Sqr(c),Sqr(Log(FSymbol)))),C0),GtQ(n,C1)))),
IIntegrate(8417,Int(Times(Power(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Cos(Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_)),x_Symbol),
    Condition(Plus(Simp(Times(b,c,Log(FSymbol),Power(FSymbol,Times(c,Plus(a,Times(b,x)))),Power(Cos(Plus(d,Times(e,x))),m),Power(Plus(Times(Sqr(e),Sqr(m)),Times(Sqr(b),Sqr(c),Sqr(Log(FSymbol)))),-1)),x),Dist(Times(m,Plus(m,Negate(C1)),Sqr(e),Power(Plus(Times(Sqr(e),Sqr(m)),Times(Sqr(b),Sqr(c),Sqr(Log(FSymbol)))),-1)),Int(Times(Power(FSymbol,Times(c,Plus(a,Times(b,x)))),Power(Cos(Plus(d,Times(e,x))),Plus(m,Negate(C2)))),x),x),Simp(Times(e,m,Power(FSymbol,Times(c,Plus(a,Times(b,x)))),Sin(Plus(d,Times(e,x))),Power(Cos(Plus(d,Times(e,x))),Plus(m,Negate(C1))),Power(Plus(Times(Sqr(e),Sqr(m)),Times(Sqr(b),Sqr(c),Sqr(Log(FSymbol)))),-1)),x)),And(FreeQ(List(FSymbol,a,b,c,d,e),x),NeQ(Plus(Times(Sqr(e),Sqr(m)),Times(Sqr(b),Sqr(c),Sqr(Log(FSymbol)))),C0),GtQ(m,C1)))),
IIntegrate(8418,Int(Times(Power(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Sin(Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,c,Log(FSymbol),Power(FSymbol,Times(c,Plus(a,Times(b,x)))),Power(Sin(Plus(d,Times(e,x))),Plus(n,C2)),Power(Times(Sqr(e),Plus(n,C1),Plus(n,C2)),-1)),x)),Simp(Times(Power(FSymbol,Times(c,Plus(a,Times(b,x)))),Cos(Plus(d,Times(e,x))),Power(Sin(Plus(d,Times(e,x))),Plus(n,C1)),Power(Times(e,Plus(n,C1)),-1)),x)),And(FreeQ(List(FSymbol,a,b,c,d,e,n),x),EqQ(Plus(Times(Sqr(e),Sqr(Plus(n,C2))),Times(Sqr(b),Sqr(c),Sqr(Log(FSymbol)))),C0),NeQ(n,CN1),NeQ(n,CN2)))),
IIntegrate(8419,Int(Times(Power(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Cos(Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,c,Log(FSymbol),Power(FSymbol,Times(c,Plus(a,Times(b,x)))),Power(Cos(Plus(d,Times(e,x))),Plus(n,C2)),Power(Times(Sqr(e),Plus(n,C1),Plus(n,C2)),-1)),x)),Negate(Simp(Times(Power(FSymbol,Times(c,Plus(a,Times(b,x)))),Sin(Plus(d,Times(e,x))),Power(Cos(Plus(d,Times(e,x))),Plus(n,C1)),Power(Times(e,Plus(n,C1)),-1)),x))),And(FreeQ(List(FSymbol,a,b,c,d,e,n),x),EqQ(Plus(Times(Sqr(e),Sqr(Plus(n,C2))),Times(Sqr(b),Sqr(c),Sqr(Log(FSymbol)))),C0),NeQ(n,CN1),NeQ(n,CN2)))),
IIntegrate(8420,Int(Times(Power(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Sin(Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,c,Log(FSymbol),Power(FSymbol,Times(c,Plus(a,Times(b,x)))),Power(Sin(Plus(d,Times(e,x))),Plus(n,C2)),Power(Times(Sqr(e),Plus(n,C1),Plus(n,C2)),-1)),x)),Dist(Times(Plus(Times(Sqr(e),Sqr(Plus(n,C2))),Times(Sqr(b),Sqr(c),Sqr(Log(FSymbol)))),Power(Times(Sqr(e),Plus(n,C1),Plus(n,C2)),-1)),Int(Times(Power(FSymbol,Times(c,Plus(a,Times(b,x)))),Power(Sin(Plus(d,Times(e,x))),Plus(n,C2))),x),x),Simp(Times(Power(FSymbol,Times(c,Plus(a,Times(b,x)))),Cos(Plus(d,Times(e,x))),Power(Sin(Plus(d,Times(e,x))),Plus(n,C1)),Power(Times(e,Plus(n,C1)),-1)),x)),And(FreeQ(List(FSymbol,a,b,c,d,e),x),NeQ(Plus(Times(Sqr(e),Sqr(Plus(n,C2))),Times(Sqr(b),Sqr(c),Sqr(Log(FSymbol)))),C0),LtQ(n,CN1),NeQ(n,CN2)))),
IIntegrate(8421,Int(Times(Power(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Cos(Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,c,Log(FSymbol),Power(FSymbol,Times(c,Plus(a,Times(b,x)))),Power(Cos(Plus(d,Times(e,x))),Plus(n,C2)),Power(Times(Sqr(e),Plus(n,C1),Plus(n,C2)),-1)),x)),Dist(Times(Plus(Times(Sqr(e),Sqr(Plus(n,C2))),Times(Sqr(b),Sqr(c),Sqr(Log(FSymbol)))),Power(Times(Sqr(e),Plus(n,C1),Plus(n,C2)),-1)),Int(Times(Power(FSymbol,Times(c,Plus(a,Times(b,x)))),Power(Cos(Plus(d,Times(e,x))),Plus(n,C2))),x),x),Negate(Simp(Times(Power(FSymbol,Times(c,Plus(a,Times(b,x)))),Sin(Plus(d,Times(e,x))),Power(Cos(Plus(d,Times(e,x))),Plus(n,C1)),Power(Times(e,Plus(n,C1)),-1)),x))),And(FreeQ(List(FSymbol,a,b,c,d,e),x),NeQ(Plus(Times(Sqr(e),Sqr(Plus(n,C2))),Times(Sqr(b),Sqr(c),Sqr(Log(FSymbol)))),C0),LtQ(n,CN1),NeQ(n,CN2)))),
IIntegrate(8422,Int(Times(Power(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Sin(Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_)),x_Symbol),
    Condition(Dist(Times(Exp(Times(CI,n,Plus(d,Times(e,x)))),Power(Sin(Plus(d,Times(e,x))),n),Power(Power(Plus(CN1,Exp(Times(C2,CI,Plus(d,Times(e,x))))),n),-1)),Int(Times(Power(FSymbol,Times(c,Plus(a,Times(b,x)))),Power(Plus(CN1,Exp(Times(C2,CI,Plus(d,Times(e,x))))),n),Power(Exp(Times(CI,n,Plus(d,Times(e,x)))),-1)),x),x),And(FreeQ(List(FSymbol,a,b,c,d,e,n),x),Not(IntegerQ(n))))),
IIntegrate(8423,Int(Times(Power(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Cos(Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_)),x_Symbol),
    Condition(Dist(Times(Exp(Times(CI,n,Plus(d,Times(e,x)))),Power(Cos(Plus(d,Times(e,x))),n),Power(Power(Plus(C1,Exp(Times(C2,CI,Plus(d,Times(e,x))))),n),-1)),Int(Times(Power(FSymbol,Times(c,Plus(a,Times(b,x)))),Power(Plus(C1,Exp(Times(C2,CI,Plus(d,Times(e,x))))),n),Power(Exp(Times(CI,n,Plus(d,Times(e,x)))),-1)),x),x),And(FreeQ(List(FSymbol,a,b,c,d,e,n),x),Not(IntegerQ(n))))),
IIntegrate(8424,Int(Times(Power(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Tan(Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT)),x_Symbol),
    Condition(Dist(Power(CI,n),Int(ExpandIntegrand(Times(Power(FSymbol,Times(c,Plus(a,Times(b,x)))),Power(Plus(C1,Negate(Exp(Times(C2,CI,Plus(d,Times(e,x)))))),n),Power(Power(Plus(C1,Exp(Times(C2,CI,Plus(d,Times(e,x))))),n),-1)),x),x),x),And(FreeQ(List(FSymbol,a,b,c,d,e),x),IntegerQ(n)))),
IIntegrate(8425,Int(Times(Power(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Cot(Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Negate(CI),n),Int(ExpandIntegrand(Times(Power(FSymbol,Times(c,Plus(a,Times(b,x)))),Power(Plus(C1,Exp(Times(C2,CI,Plus(d,Times(e,x))))),n),Power(Power(Plus(C1,Negate(Exp(Times(C2,CI,Plus(d,Times(e,x)))))),n),-1)),x),x),x),And(FreeQ(List(FSymbol,a,b,c,d,e),x),IntegerQ(n)))),
IIntegrate(8426,Int(Times(Power(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Sec(Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_)),x_Symbol),
    Condition(Plus(Simp(Times(b,c,Log(FSymbol),Power(FSymbol,Times(c,Plus(a,Times(b,x)))),Power(Sec(Plus(d,Times(e,x))),n),Power(Plus(Times(Sqr(e),Sqr(n)),Times(Sqr(b),Sqr(c),Sqr(Log(FSymbol)))),-1)),x),Dist(Times(Sqr(e),n,Plus(n,C1),Power(Plus(Times(Sqr(e),Sqr(n)),Times(Sqr(b),Sqr(c),Sqr(Log(FSymbol)))),-1)),Int(Times(Power(FSymbol,Times(c,Plus(a,Times(b,x)))),Power(Sec(Plus(d,Times(e,x))),Plus(n,C2))),x),x),Negate(Simp(Times(e,n,Power(FSymbol,Times(c,Plus(a,Times(b,x)))),Power(Sec(Plus(d,Times(e,x))),Plus(n,C1)),Sin(Plus(d,Times(e,x))),Power(Plus(Times(Sqr(e),Sqr(n)),Times(Sqr(b),Sqr(c),Sqr(Log(FSymbol)))),-1)),x))),And(FreeQ(List(FSymbol,a,b,c,d,e),x),NeQ(Plus(Times(Sqr(e),Sqr(n)),Times(Sqr(b),Sqr(c),Sqr(Log(FSymbol)))),C0),LtQ(n,CN1)))),
IIntegrate(8427,Int(Times(Power(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Csc(Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_)),x_Symbol),
    Condition(Plus(Simp(Times(b,c,Log(FSymbol),Power(FSymbol,Times(c,Plus(a,Times(b,x)))),Power(Csc(Plus(d,Times(e,x))),n),Power(Plus(Times(Sqr(e),Sqr(n)),Times(Sqr(b),Sqr(c),Sqr(Log(FSymbol)))),-1)),x),Dist(Times(Sqr(e),n,Plus(n,C1),Power(Plus(Times(Sqr(e),Sqr(n)),Times(Sqr(b),Sqr(c),Sqr(Log(FSymbol)))),-1)),Int(Times(Power(FSymbol,Times(c,Plus(a,Times(b,x)))),Power(Csc(Plus(d,Times(e,x))),Plus(n,C2))),x),x),Simp(Times(e,n,Power(FSymbol,Times(c,Plus(a,Times(b,x)))),Power(Csc(Plus(d,Times(e,x))),Plus(n,C1)),Cos(Plus(d,Times(e,x))),Power(Plus(Times(Sqr(e),Sqr(n)),Times(Sqr(b),Sqr(c),Sqr(Log(FSymbol)))),-1)),x)),And(FreeQ(List(FSymbol,a,b,c,d,e),x),NeQ(Plus(Times(Sqr(e),Sqr(n)),Times(Sqr(b),Sqr(c),Sqr(Log(FSymbol)))),C0),LtQ(n,CN1)))),
IIntegrate(8428,Int(Times(Power(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Sec(Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,c,Log(FSymbol),Power(FSymbol,Times(c,Plus(a,Times(b,x)))),Power(Sec(Plus(d,Times(e,x))),Plus(n,Negate(C2))),Power(Times(Sqr(e),Plus(n,Negate(C1)),Plus(n,Negate(C2))),-1)),x)),Simp(Times(Power(FSymbol,Times(c,Plus(a,Times(b,x)))),Power(Sec(Plus(d,Times(e,x))),Plus(n,Negate(C1))),Sin(Plus(d,Times(e,x))),Power(Times(e,Plus(n,Negate(C1))),-1)),x)),And(FreeQ(List(FSymbol,a,b,c,d,e,n),x),EqQ(Plus(Times(Sqr(b),Sqr(c),Sqr(Log(FSymbol))),Times(Sqr(e),Sqr(Plus(n,Negate(C2))))),C0),NeQ(n,C1),NeQ(n,C2)))),
IIntegrate(8429,Int(Times(Power(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Csc(Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,c,Log(FSymbol),Power(FSymbol,Times(c,Plus(a,Times(b,x)))),Power(Csc(Plus(d,Times(e,x))),Plus(n,Negate(C2))),Power(Times(Sqr(e),Plus(n,Negate(C1)),Plus(n,Negate(C2))),-1)),x)),Simp(Times(Power(FSymbol,Times(c,Plus(a,Times(b,x)))),Power(Csc(Plus(d,Times(e,x))),Plus(n,Negate(C1))),Cos(Plus(d,Times(e,x))),Power(Times(e,Plus(n,Negate(C1))),-1)),x)),And(FreeQ(List(FSymbol,a,b,c,d,e,n),x),EqQ(Plus(Times(Sqr(b),Sqr(c),Sqr(Log(FSymbol))),Times(Sqr(e),Sqr(Plus(n,Negate(C2))))),C0),NeQ(n,C1),NeQ(n,C2)))),
IIntegrate(8430,Int(Times(Power(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Sec(Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,c,Log(FSymbol),Power(FSymbol,Times(c,Plus(a,Times(b,x)))),Power(Sec(Plus(d,Times(e,x))),Plus(n,Negate(C2))),Power(Times(Sqr(e),Plus(n,Negate(C1)),Plus(n,Negate(C2))),-1)),x)),Dist(Times(Plus(Times(Sqr(e),Sqr(Plus(n,Negate(C2)))),Times(Sqr(b),Sqr(c),Sqr(Log(FSymbol)))),Power(Times(Sqr(e),Plus(n,Negate(C1)),Plus(n,Negate(C2))),-1)),Int(Times(Power(FSymbol,Times(c,Plus(a,Times(b,x)))),Power(Sec(Plus(d,Times(e,x))),Plus(n,Negate(C2)))),x),x),Simp(Times(Power(FSymbol,Times(c,Plus(a,Times(b,x)))),Power(Sec(Plus(d,Times(e,x))),Plus(n,Negate(C1))),Sin(Plus(d,Times(e,x))),Power(Times(e,Plus(n,Negate(C1))),-1)),x)),And(FreeQ(List(FSymbol,a,b,c,d,e),x),NeQ(Plus(Times(Sqr(b),Sqr(c),Sqr(Log(FSymbol))),Times(Sqr(e),Sqr(Plus(n,Negate(C2))))),C0),GtQ(n,C1),NeQ(n,C2)))),
IIntegrate(8431,Int(Times(Power(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Csc(Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,c,Log(FSymbol),Power(FSymbol,Times(c,Plus(a,Times(b,x)))),Power(Csc(Plus(d,Times(e,x))),Plus(n,Negate(C2))),Power(Times(Sqr(e),Plus(n,Negate(C1)),Plus(n,Negate(C2))),-1)),x)),Dist(Times(Plus(Times(Sqr(e),Sqr(Plus(n,Negate(C2)))),Times(Sqr(b),Sqr(c),Sqr(Log(FSymbol)))),Power(Times(Sqr(e),Plus(n,Negate(C1)),Plus(n,Negate(C2))),-1)),Int(Times(Power(FSymbol,Times(c,Plus(a,Times(b,x)))),Power(Csc(Plus(d,Times(e,x))),Plus(n,Negate(C2)))),x),x),Negate(Simp(Times(Power(FSymbol,Times(c,Plus(a,Times(b,x)))),Power(Csc(Plus(d,Times(e,x))),Plus(n,Negate(C1))),Cos(Plus(d,Times(e,x))),Power(Times(e,Plus(n,Negate(C1))),-1)),x))),And(FreeQ(List(FSymbol,a,b,c,d,e),x),NeQ(Plus(Times(Sqr(b),Sqr(c),Sqr(Log(FSymbol))),Times(Sqr(e),Sqr(Plus(n,Negate(C2))))),C0),GtQ(n,C1),NeQ(n,C2)))),
IIntegrate(8432,Int(Times(Power(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Sec(Plus(d_DEFAULT,Times(Pi,k_DEFAULT),Times(e_DEFAULT,x_))),n_DEFAULT)),x_Symbol),
    Condition(Simp(Times(Power(C2,n),Exp(Times(CI,k,n,Pi)),Exp(Times(CI,n,Plus(d,Times(e,x)))),Power(FSymbol,Times(c,Plus(a,Times(b,x)))),Hypergeometric2F1(n,Plus(Times(C1D2,n),Times(CN1,CI,b,c,Log(FSymbol),Power(Times(C2,e),-1))),Plus(C1,Times(C1D2,n),Times(CN1,CI,b,c,Log(FSymbol),Power(Times(C2,e),-1))),Times(CN1,Exp(Times(C2,CI,k,Pi)),Exp(Times(C2,CI,Plus(d,Times(e,x)))))),Power(Plus(Times(CI,e,n),Times(b,c,Log(FSymbol))),-1)),x),And(FreeQ(List(FSymbol,a,b,c,d,e),x),IntegerQ(Times(C4,k)),IntegerQ(n))))
  );
}
