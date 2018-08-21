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
public class IntRules46 { 
  public static IAST RULES = List( 
IIntegrate(2301,Int(Times(Power(x_,-1),Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT)))))),x_Symbol),
    Condition(Simp(Times(Sqr(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Power(Times(C2,b,n),-1)),x),FreeQ(List(a,b,c,n),x))),
IIntegrate(2302,Int(Times(Power(x_,-1),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Times(b,n),-1),Subst(Int(Power(x,p),x),x,Plus(a,Times(b,Log(Times(c,Power(x,n)))))),x),FreeQ(List(a,b,c,n,p),x))),
IIntegrate(2303,Int(Times(Power(Times(d_DEFAULT,x_),m_DEFAULT),Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT)))))),x_Symbol),
    Condition(Simp(Times(b,Power(Times(d,x),Plus(m,C1)),Log(Times(c,Power(x,n))),Power(Times(d,Plus(m,C1)),-1)),x),And(FreeQ(List(a,b,c,d,m,n),x),NeQ(m,CN1),EqQ(Plus(Times(a,Plus(m,C1)),Times(CN1,b,n)),C0)))),
IIntegrate(2304,Int(Times(Power(Times(d_DEFAULT,x_),m_DEFAULT),Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT)))))),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(d,x),Plus(m,C1)),Plus(a,Times(b,Log(Times(c,Power(x,n))))),Power(Times(d,Plus(m,C1)),-1)),x),Negate(Simp(Times(b,n,Power(Times(d,x),Plus(m,C1)),Power(Times(d,Sqr(Plus(m,C1))),-1)),x))),And(FreeQ(List(a,b,c,d,m,n),x),NeQ(m,CN1)))),
IIntegrate(2305,Int(Times(Power(Times(d_DEFAULT,x_),m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(d,x),Plus(m,C1)),Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p),Power(Times(d,Plus(m,C1)),-1)),x),Negate(Dist(Times(b,n,p,Power(Plus(m,C1),-1)),Int(Times(Power(Times(d,x),m),Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),Plus(p,Negate(C1)))),x),x))),And(FreeQ(List(a,b,c,d,m,n),x),NeQ(m,CN1),GtQ(p,C0)))),
IIntegrate(2306,Int(Times(Power(Times(d_DEFAULT,x_),m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(d,x),Plus(m,C1)),Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),Plus(p,C1)),Power(Times(b,d,n,Plus(p,C1)),-1)),x),Negate(Dist(Times(Plus(m,C1),Power(Times(b,n,Plus(p,C1)),-1)),Int(Times(Power(Times(d,x),m),Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),Plus(p,C1))),x),x))),And(FreeQ(List(a,b,c,d,m,n),x),NeQ(m,CN1),LtQ(p,CN1)))),
IIntegrate(2307,Int(Times(Power(x_,m_DEFAULT),Power(Log(Times(c_DEFAULT,Power(x_,n_))),-1)),x_Symbol),
    Condition(Dist(Power(n,-1),Subst(Int(Power(Log(Times(c,x)),-1),x),x,Power(x,n)),x),And(FreeQ(List(c,m,n),x),EqQ(m,Plus(n,Negate(C1)))))),
IIntegrate(2308,Int(Times(Power(Times(d_,x_),m_DEFAULT),Power(Log(Times(c_DEFAULT,Power(x_,n_))),-1)),x_Symbol),
    Condition(Dist(Times(Power(Times(d,x),m),Power(Power(x,m),-1)),Int(Times(Power(x,m),Power(Log(Times(c,Power(x,n))),-1)),x),x),And(FreeQ(List(c,d,m,n),x),EqQ(m,Plus(n,Negate(C1)))))),
IIntegrate(2309,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,x_)))),p_)),x_Symbol),
    Condition(Dist(Power(Power(c,Plus(m,C1)),-1),Subst(Int(Times(Exp(Times(Plus(m,C1),x)),Power(Plus(a,Times(b,x)),p)),x),x,Log(Times(c,x))),x),And(FreeQ(List(a,b,c,p),x),IntegerQ(m)))),
IIntegrate(2310,Int(Times(Power(Times(d_DEFAULT,x_),m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))))),p_)),x_Symbol),
    Condition(Dist(Times(Power(Times(d,x),Plus(m,C1)),Power(Times(d,n,Power(Times(c,Power(x,n)),Times(Plus(m,C1),Power(n,-1)))),-1)),Subst(Int(Times(Exp(Times(Plus(m,C1),x,Power(n,-1))),Power(Plus(a,Times(b,x)),p)),x),x,Log(Times(c,Power(x,n)))),x),FreeQ(List(a,b,c,d,m,n,p),x))),
IIntegrate(2311,Int(Times(Power(Times(d_DEFAULT,Power(x_,q_)),m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(Times(d,Power(x,q)),m),Power(Power(x,Times(m,q)),-1)),Int(Times(Power(x,Times(m,q)),Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p)),x),x),FreeQ(List(a,b,c,d,m,n,p,q),x))),
IIntegrate(2312,Int(Times(Power(Times($p("d1",true),Power(x_,$p("q1"))),$p("m1")),Power(Times($p("d2",true),Power(x_,$p("q2"))),$p("m2")),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(Times($s("d1"),Power(x,$s("q1"))),$s("m1")),Power(Times($s("d2"),Power(x,$s("q2"))),$s("m2")),Power(Power(x,Plus(Times($s("m1"),$s("q1")),Times($s("m2"),$s("q2")))),-1)),Int(Times(Power(x,Plus(Times($s("m1"),$s("q1")),Times($s("m2"),$s("q2")))),Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p)),x),x),FreeQ(List(a,b,c,$s("d1"),$s("d2"),$s("m1"),$s("m2"),n,p,$s("q1"),$s("q2")),x))),
IIntegrate(2313,Int(Times(Power(Plus(d_,Times(e_DEFAULT,Power(x_,r_DEFAULT))),q_DEFAULT),Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT)))))),x_Symbol),
    Condition(With(List(Set(u,IntHide(Power(Plus(d,Times(e,Power(x,r))),q),x))),Plus(Simp(Times(u,Plus(a,Times(b,Log(Times(c,Power(x,n)))))),x),Negate(Dist(Times(b,n),Int(SimplifyIntegrand(Times(u,Power(x,-1)),x),x),x)))),And(FreeQ(List(a,b,c,d,e,n,r),x),IGtQ(q,C0)))),
IIntegrate(2314,Int(Times(Power(Plus(d_,Times(e_DEFAULT,Power(x_,r_DEFAULT))),q_),Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT)))))),x_Symbol),
    Condition(Plus(Simp(Times(x,Power(Plus(d,Times(e,Power(x,r))),Plus(q,C1)),Plus(a,Times(b,Log(Times(c,Power(x,n))))),Power(d,-1)),x),Negate(Dist(Times(b,n,Power(d,-1)),Int(Power(Plus(d,Times(e,Power(x,r))),Plus(q,C1)),x),x))),And(FreeQ(List(a,b,c,d,e,n,q,r),x),EqQ(Plus(Times(r,Plus(q,C1)),C1),C0)))),
IIntegrate(2315,Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),-1),Log(Times(c_DEFAULT,x_))),x_Symbol),
    Condition(Negate(Simp(Times(PolyLog(C2,Plus(C1,Times(CN1,c,x))),Power(e,-1)),x)),And(FreeQ(List(c,d,e),x),EqQ(Plus(e,Times(c,d)),C0)))),
IIntegrate(2316,Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),-1),Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,x_))))),x_Symbol),
    Condition(Plus(Simp(Times(Plus(a,Times(b,Log(Times(CN1,c,d,Power(e,-1))))),Log(Plus(d,Times(e,x))),Power(e,-1)),x),Dist(b,Int(Times(Log(Times(CN1,e,x,Power(d,-1))),Power(Plus(d,Times(e,x)),-1)),x),x)),And(FreeQ(List(a,b,c,d,e),x),GtQ(Times(CN1,c,d,Power(e,-1)),C0)))),
IIntegrate(2317,Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),-1),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Log(Plus(C1,Times(e,x,Power(d,-1)))),Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p),Power(e,-1)),x),Negate(Dist(Times(b,n,p,Power(e,-1)),Int(Times(Log(Plus(C1,Times(e,x,Power(d,-1)))),Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),Plus(p,Negate(C1))),Power(x,-1)),x),x))),And(FreeQ(List(a,b,c,d,e,n),x),IGtQ(p,C0)))),
IIntegrate(2318,Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),-2),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(x,Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p),Power(Times(d,Plus(d,Times(e,x))),-1)),x),Negate(Dist(Times(b,n,p,Power(d,-1)),Int(Times(Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),Plus(p,Negate(C1))),Power(Plus(d,Times(e,x)),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,n,p),x),GtQ(p,C0)))),
IIntegrate(2319,Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),q_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(d,Times(e,x)),Plus(q,C1)),Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p),Power(Times(e,Plus(q,C1)),-1)),x),Negate(Dist(Times(b,n,p,Power(Times(e,Plus(q,C1)),-1)),Int(Times(Power(Plus(d,Times(e,x)),Plus(q,C1)),Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),Plus(p,Negate(C1))),Power(x,-1)),x),x))),And(FreeQ(List(a,b,c,d,e,n,p,q),x),GtQ(p,C0),NeQ(q,CN1),Or(EqQ(p,C1),And(IntegersQ(Times(C2,p),Times(C2,q)),Not(IGtQ(q,C0))),And(EqQ(p,C2),NeQ(q,C1)))))),
IIntegrate(2320,Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),q_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(x,Power(Plus(d,Times(e,x)),q),Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),Plus(p,C1)),Power(Times(b,n,Plus(p,C1)),-1)),x),Negate(Dist(Times(Plus(q,C1),Power(Times(b,n,Plus(p,C1)),-1)),Int(Times(Power(Plus(d,Times(e,x)),q),Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),Plus(p,C1))),x),x)),Dist(Times(d,q,Power(Times(b,n,Plus(p,C1)),-1)),Int(Times(Power(Plus(d,Times(e,x)),Plus(q,Negate(C1))),Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),Plus(p,C1))),x),x)),And(FreeQ(List(a,b,c,d,e,n),x),LtQ(p,CN1),GtQ(q,C0)))),
IIntegrate(2321,Int(Times(Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_DEFAULT),Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT)))))),x_Symbol),
    Condition(Plus(Simp(Times(x,Power(Plus(d,Times(e,Sqr(x))),q),Plus(a,Times(b,Log(Times(c,Power(x,n))))),Power(Plus(Times(C2,q),C1),-1)),x),Negate(Dist(Times(b,n,Power(Plus(Times(C2,q),C1),-1)),Int(Power(Plus(d,Times(e,Sqr(x))),q),x),x)),Dist(Times(C2,d,q,Power(Plus(Times(C2,q),C1),-1)),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(q,Negate(C1))),Plus(a,Times(b,Log(Times(c,Power(x,n)))))),x),x)),And(FreeQ(List(a,b,c,d,e,n),x),GtQ(q,C0)))),
IIntegrate(2322,Int(Times(Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),QQ(-3L,2L)),Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT)))))),x_Symbol),
    Condition(Plus(Simp(Times(x,Plus(a,Times(b,Log(Times(c,Power(x,n))))),Power(Times(d,Sqrt(Plus(d,Times(e,Sqr(x))))),-1)),x),Negate(Dist(Times(b,n,Power(d,-1)),Int(Power(Plus(d,Times(e,Sqr(x))),CN1D2),x),x))),FreeQ(List(a,b,c,d,e,n),x))),
IIntegrate(2323,Int(Times(Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_),Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT)))))),x_Symbol),
    Condition(Plus(Negate(Simp(Times(x,Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Plus(a,Times(b,Log(Times(c,Power(x,n))))),Power(Times(C2,d,Plus(q,C1)),-1)),x)),Dist(Times(Plus(Times(C2,q),C3),Power(Times(C2,d,Plus(q,C1)),-1)),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Plus(a,Times(b,Log(Times(c,Power(x,n)))))),x),x),Dist(Times(b,n,Power(Times(C2,d,Plus(q,C1)),-1)),Int(Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),x),x)),And(FreeQ(List(a,b,c,d,e,n),x),LtQ(q,CN1)))),
IIntegrate(2324,Int(Times(Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),-1),Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT)))))),x_Symbol),
    Condition(With(List(Set(u,IntHide(Power(Plus(d,Times(e,Sqr(x))),-1),x))),Plus(Simp(Times(u,Plus(a,Times(b,Log(Times(c,Power(x,n)))))),x),Negate(Dist(Times(b,n),Int(Times(u,Power(x,-1)),x),x)))),FreeQ(List(a,b,c,d,e,n),x))),
IIntegrate(2325,Int(Times(Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2),Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT)))))),x_Symbol),
    Condition(Plus(Simp(Times(ArcSinh(Times(Rt(e,C2),x,Power(d,CN1D2))),Plus(a,Times(b,Log(Times(c,Power(x,n))))),Power(Rt(e,C2),-1)),x),Negate(Dist(Times(b,n,Power(Rt(e,C2),-1)),Int(Times(ArcSinh(Times(Rt(e,C2),x,Power(d,CN1D2))),Power(x,-1)),x),x))),And(FreeQ(List(a,b,c,d,e,n),x),GtQ(d,C0),PosQ(e)))),
IIntegrate(2326,Int(Times(Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2),Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT)))))),x_Symbol),
    Condition(Plus(Simp(Times(ArcSin(Times(Rt(Negate(e),C2),x,Power(d,CN1D2))),Plus(a,Times(b,Log(Times(c,Power(x,n))))),Power(Rt(Negate(e),C2),-1)),x),Negate(Dist(Times(b,n,Power(Rt(Negate(e),C2),-1)),Int(Times(ArcSin(Times(Rt(Negate(e),C2),x,Power(d,CN1D2))),Power(x,-1)),x),x))),And(FreeQ(List(a,b,c,d,e,n),x),GtQ(d,C0),NegQ(e)))),
IIntegrate(2327,Int(Times(Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2),Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT)))))),x_Symbol),
    Condition(Dist(Times(Sqrt(Plus(C1,Times(e,Sqr(x),Power(d,-1)))),Power(Plus(d,Times(e,Sqr(x))),CN1D2)),Int(Times(Plus(a,Times(b,Log(Times(c,Power(x,n))))),Power(Plus(C1,Times(e,Sqr(x),Power(d,-1))),CN1D2)),x),x),And(FreeQ(List(a,b,c,d,e,n),x),Not(GtQ(d,C0))))),
IIntegrate(2328,Int(Times(Power(Plus($p("d1"),Times($p("e1",true),x_)),CN1D2),Power(Plus($p("d2"),Times($p("e2",true),x_)),CN1D2),Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT)))))),x_Symbol),
    Condition(Dist(Times(Sqrt(Plus(C1,Times($s("e1"),$s("e2"),Sqr(x),Power(Times($s("d1"),$s("d2")),-1)))),Power(Times(Sqrt(Plus($s("d1"),Times($s("e1"),x))),Sqrt(Plus($s("d2"),Times($s("e2"),x)))),-1)),Int(Times(Plus(a,Times(b,Log(Times(c,Power(x,n))))),Power(Plus(C1,Times($s("e1"),$s("e2"),Sqr(x),Power(Times($s("d1"),$s("d2")),-1))),CN1D2)),x),x),And(FreeQ(List(a,b,c,$s("d1"),$s("e1"),$s("d2"),$s("e2"),n),x),EqQ(Plus(Times($s("d2"),$s("e1")),Times($s("d1"),$s("e2"))),C0)))),
IIntegrate(2329,Int(Times(Power(Plus(d_,Times(e_DEFAULT,Power(x_,r_DEFAULT))),q_DEFAULT),Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT)))))),x_Symbol),
    Condition(With(List(Set(u,IntHide(Power(Plus(d,Times(e,Power(x,r))),q),x))),Condition(Plus(Dist(Plus(a,Times(b,Log(Times(c,Power(x,n))))),u,x),Negate(Dist(Times(b,n),Int(SimplifyIntegrand(Times(u,Power(x,-1)),x),x),x))),Or(And(EqQ(r,C1),IntegerQ(Plus(q,Negate(C1D2)))),And(EqQ(r,C2),EqQ(q,CN1)),InverseFunctionFreeQ(u,x)))),And(FreeQ(List(a,b,c,d,e,n,q,r),x),IntegerQ(Times(C2,q)),IntegerQ(r)))),
IIntegrate(2330,Int(Times(Power(Plus(d_,Times(e_DEFAULT,Power(x_,r_DEFAULT))),q_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))))),p_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,ExpandIntegrand(Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p),Power(Plus(d,Times(e,Power(x,r))),q),x))),Condition(Int(u,x),SumQ(u))),And(FreeQ(List(a,b,c,d,e,n,p,q,r),x),IntegerQ(q),Or(GtQ(q,C0),And(IGtQ(p,C0),IntegerQ(r)))))),
IIntegrate(2331,Int(Times(Power(Plus(d_,Times(e_DEFAULT,Power(x_,r_DEFAULT))),q_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))))),p_DEFAULT)),x_Symbol),
    Condition(Unintegrable(Times(Power(Plus(d,Times(e,Power(x,r))),q),Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p)),x),FreeQ(List(a,b,c,d,e,n,p,q,r),x))),
IIntegrate(2332,Int(Times(Power(u_,q_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))))),p_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(ExpandToSum(u,x),q),Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p)),x),And(FreeQ(List(a,b,c,n,p,q),x),BinomialQ(u,x),Not(BinomialMatchQ(u,x))))),
IIntegrate(2333,Int(Times(Power(Plus(d_,Times(e_DEFAULT,Power(x_,-1))),q_DEFAULT),Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))))),p_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(Plus(e,Times(d,x)),q),Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p)),x),And(FreeQ(List(a,b,c,d,e,m,n,p),x),EqQ(m,q),IntegerQ(q)))),
IIntegrate(2334,Int(Times(Power(x_,m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Power(x_,r_DEFAULT))),q_DEFAULT),Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT)))))),x_Symbol),
    Condition(With(List(Set(u,IntHide(Times(Power(x,m),Power(Plus(d,Times(e,Power(x,r))),q)),x))),Plus(Simp(Times(u,Plus(a,Times(b,Log(Times(c,Power(x,n)))))),x),Negate(Dist(Times(b,n),Int(SimplifyIntegrand(Times(u,Power(x,-1)),x),x),x)))),And(FreeQ(List(a,b,c,d,e,n,r),x),IGtQ(q,C0),IntegerQ(m),Not(And(EqQ(q,C1),EqQ(m,CN1)))))),
IIntegrate(2335,Int(Times(Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Power(x_,r_DEFAULT))),q_),Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT)))))),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(f,x),Plus(m,C1)),Power(Plus(d,Times(e,Power(x,r))),Plus(q,C1)),Plus(a,Times(b,Log(Times(c,Power(x,n))))),Power(Times(d,f,Plus(m,C1)),-1)),x),Negate(Dist(Times(b,n,Power(Times(d,Plus(m,C1)),-1)),Int(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Power(x,r))),Plus(q,C1))),x),x))),And(FreeQ(List(a,b,c,d,e,f,m,n,q,r),x),EqQ(Plus(m,Times(r,Plus(q,C1)),C1),C0),NeQ(m,CN1)))),
IIntegrate(2336,Int(Times(Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Power(x_,r_))),q_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_))))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(f,m),Power(n,-1)),Subst(Int(Times(Power(Plus(d,Times(e,x)),q),Power(Plus(a,Times(b,Log(Times(c,x)))),p)),x),x,Power(x,n)),x),And(FreeQ(List(a,b,c,d,e,f,m,n,q,r),x),EqQ(m,Plus(r,Negate(C1))),IGtQ(p,C0),Or(IntegerQ(m),GtQ(f,C0)),EqQ(r,n)))),
IIntegrate(2337,Int(Times(Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Power(x_,r_))),-1),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(f,m),Log(Plus(C1,Times(e,Power(x,r),Power(d,-1)))),Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p),Power(Times(e,r),-1)),x),Negate(Dist(Times(b,Power(f,m),n,p,Power(Times(e,r),-1)),Int(Times(Log(Plus(C1,Times(e,Power(x,r),Power(d,-1)))),Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),Plus(p,Negate(C1))),Power(x,-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f,m,n,r),x),EqQ(m,Plus(r,Negate(C1))),IGtQ(p,C0),Or(IntegerQ(m),GtQ(f,C0)),NeQ(r,n)))),
IIntegrate(2338,Int(Times(Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Power(x_,r_))),q_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(f,m),Power(Plus(d,Times(e,Power(x,r))),Plus(q,C1)),Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p),Power(Times(e,r,Plus(q,C1)),-1)),x),Negate(Dist(Times(b,Power(f,m),n,p,Power(Times(e,r,Plus(q,C1)),-1)),Int(Times(Power(Plus(d,Times(e,Power(x,r))),Plus(q,C1)),Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),Plus(p,Negate(C1))),Power(x,-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f,m,n,q,r),x),EqQ(m,Plus(r,Negate(C1))),IGtQ(p,C0),Or(IntegerQ(m),GtQ(f,C0)),NeQ(r,n),NeQ(q,CN1)))),
IIntegrate(2339,Int(Times(Power(Times(f_,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Power(x_,r_))),q_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(Times(f,x),m),Power(Power(x,m),-1)),Int(Times(Power(x,m),Power(Plus(d,Times(e,Power(x,r))),q),Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p)),x),x),And(FreeQ(List(a,b,c,d,e,f,m,n,q,r),x),EqQ(m,Plus(r,Negate(C1))),IGtQ(p,C0),Not(Or(IntegerQ(m),GtQ(f,C0)))))),
IIntegrate(2340,Int(Times(Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_DEFAULT),Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT)))))),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Times(f,x),Plus(m,C1)),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Plus(a,Times(b,Log(Times(c,Power(x,n))))),Power(Times(C2,d,f,Plus(q,C1)),-1)),x)),Dist(Power(Times(C2,d,Plus(q,C1)),-1),Int(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Plus(Times(a,Plus(m,Times(C2,q),C3)),Times(b,n),Times(b,Plus(m,Times(C2,q),C3),Log(Times(c,Power(x,n)))))),x),x)),And(FreeQ(List(a,b,c,d,e,f,m,n),x),ILtQ(q,CN1),ILtQ(m,C0)))),
IIntegrate(2341,Int(Times(Power(x_,m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_),Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT)))))),x_Symbol),
    Condition(Dist(Times(Power(d,IntPart(q)),Power(Plus(d,Times(e,Sqr(x))),FracPart(q)),Power(Power(Plus(C1,Times(e,Sqr(x),Power(d,-1))),FracPart(q)),-1)),Int(Times(Power(x,m),Power(Plus(C1,Times(e,Sqr(x),Power(d,-1))),q),Plus(a,Times(b,Log(Times(c,Power(x,n)))))),x),x),And(FreeQ(List(a,b,c,d,e,n),x),IntegerQ(Times(C1D2,m)),IntegerQ(Plus(q,Negate(C1D2))),Not(Or(LtQ(Plus(m,Times(C2,q)),CN2),GtQ(d,C0)))))),
IIntegrate(2342,Int(Times(Power(x_,m_DEFAULT),Power(Plus($p("d1"),Times($p("e1",true),x_)),q_),Power(Plus($p("d2"),Times($p("e2",true),x_)),q_),Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT)))))),x_Symbol),
    Condition(Dist(Times(Power(Plus($s("d1"),Times($s("e1"),x)),q),Power(Plus($s("d2"),Times($s("e2"),x)),q),Power(Power(Plus(C1,Times($s("e1"),$s("e2"),Sqr(x),Power(Times($s("d1"),$s("d2")),-1))),q),-1)),Int(Times(Power(x,m),Power(Plus(C1,Times($s("e1"),$s("e2"),Sqr(x),Power(Times($s("d1"),$s("d2")),-1))),q),Plus(a,Times(b,Log(Times(c,Power(x,n)))))),x),x),And(FreeQ(List(a,b,c,$s("d1"),$s("e1"),$s("d2"),$s("e2"),n),x),EqQ(Plus(Times($s("d2"),$s("e1")),Times($s("d1"),$s("e2"))),C0),IntegerQ(m),IntegerQ(Plus(q,Negate(C1D2)))))),
IIntegrate(2343,Int(Times(Power(x_,-1),Power(Plus(d_,Times(e_DEFAULT,Power(x_,r_DEFAULT))),-1),Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_)))))),x_Symbol),
    Condition(Dist(Power(n,-1),Subst(Int(Times(Plus(a,Times(b,Log(Times(c,x)))),Power(Times(x,Plus(d,Times(e,Power(x,Times(r,Power(n,-1)))))),-1)),x),x,Power(x,n)),x),And(FreeQ(List(a,b,c,d,e,n,r),x),IntegerQ(Times(r,Power(n,-1)))))),
IIntegrate(2344,Int(Times(Power(x_,-1),Power(Plus(d_,Times(e_DEFAULT,x_)),-1),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Dist(Power(d,-1),Int(Times(Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p),Power(x,-1)),x),x),Negate(Dist(Times(e,Power(d,-1)),Int(Times(Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p),Power(Plus(d,Times(e,x)),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,n),x),IGtQ(p,C0)))),
IIntegrate(2345,Int(Times(Power(x_,-1),Power(Plus(d_,Times(e_DEFAULT,Power(x_,r_DEFAULT))),-1),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Log(Plus(C1,Times(d,Power(Times(e,Power(x,r)),-1)))),Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p),Power(Times(d,r),-1)),x)),Dist(Times(b,n,p,Power(Times(d,r),-1)),Int(Times(Log(Plus(C1,Times(d,Power(Times(e,Power(x,r)),-1)))),Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),Plus(p,Negate(C1))),Power(x,-1)),x),x)),And(FreeQ(List(a,b,c,d,e,n,r),x),IGtQ(p,C0)))),
IIntegrate(2346,Int(Times(Power(x_,-1),Power(Plus(d_,Times(e_DEFAULT,x_)),q_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Dist(d,Int(Times(Power(Plus(d,Times(e,x)),Plus(q,Negate(C1))),Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p),Power(x,-1)),x),x),Dist(e,Int(Times(Power(Plus(d,Times(e,x)),Plus(q,Negate(C1))),Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p)),x),x)),And(FreeQ(List(a,b,c,d,e,n),x),IGtQ(p,C0),GtQ(q,C0),IntegerQ(Times(C2,q))))),
IIntegrate(2347,Int(Times(Power(x_,-1),Power(Plus(d_,Times(e_DEFAULT,x_)),q_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Dist(Power(d,-1),Int(Times(Power(Plus(d,Times(e,x)),Plus(q,C1)),Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p),Power(x,-1)),x),x),Negate(Dist(Times(e,Power(d,-1)),Int(Times(Power(Plus(d,Times(e,x)),q),Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p)),x),x))),And(FreeQ(List(a,b,c,d,e,n),x),IGtQ(p,C0),LtQ(q,CN1),IntegerQ(Times(C2,q))))),
IIntegrate(2348,Int(Times(Power(x_,-1),Power(Plus(d_,Times(e_DEFAULT,Power(x_,r_DEFAULT))),q_DEFAULT),Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT)))))),x_Symbol),
    Condition(With(List(Set(u,IntHide(Times(Power(Plus(d,Times(e,Power(x,r))),q),Power(x,-1)),x))),Plus(Simp(Times(u,Plus(a,Times(b,Log(Times(c,Power(x,n)))))),x),Negate(Dist(Times(b,n),Int(Dist(Power(x,-1),u,x),x),x)))),And(FreeQ(List(a,b,c,d,e,n,r),x),IntegerQ(Plus(q,Negate(C1D2)))))),
IIntegrate(2349,Int(Times(Power(x_,-1),Power(Plus(d_,Times(e_DEFAULT,Power(x_,r_DEFAULT))),q_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Dist(Power(d,-1),Int(Times(Power(Plus(d,Times(e,Power(x,r))),Plus(q,C1)),Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p),Power(x,-1)),x),x),Negate(Dist(Times(e,Power(d,-1)),Int(Times(Power(x,Plus(r,Negate(C1))),Power(Plus(d,Times(e,Power(x,r))),q),Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p)),x),x))),And(FreeQ(List(a,b,c,d,e,n,r),x),IGtQ(p,C0),ILtQ(q,CN1)))),
IIntegrate(2350,Int(Times(Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Power(x_,r_DEFAULT))),q_DEFAULT),Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT)))))),x_Symbol),
    Condition(With(List(Set(u,IntHide(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Power(x,r))),q)),x))),Condition(Plus(Dist(Plus(a,Times(b,Log(Times(c,Power(x,n))))),u,x),Negate(Dist(Times(b,n),Int(SimplifyIntegrand(Times(u,Power(x,-1)),x),x),x))),Or(And(Or(EqQ(r,C1),EqQ(r,C2)),IntegerQ(m),IntegerQ(Plus(q,Negate(C1D2)))),InverseFunctionFreeQ(u,x)))),And(FreeQ(List(a,b,c,d,e,f,m,n,q,r),x),IntegerQ(Times(C2,q)),Or(And(IntegerQ(m),IntegerQ(r)),IGtQ(q,C0)))))
  );
}
