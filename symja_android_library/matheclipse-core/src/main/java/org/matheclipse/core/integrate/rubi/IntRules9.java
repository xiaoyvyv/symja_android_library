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
public class IntRules9 { 
  public static IAST RULES = List( 
IIntegrate(4547,Int(Times(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),Power(Times(e_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(c,Power(Times(e,x),Plus(m,C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Times(a,e,Plus(m,C1)),-1)),x),Dist(Times(d,Power(Power(e,n),-1)),Int(Times(Power(Times(e,x),Plus(m,n)),Power(Plus(a,Times(b,Power(x,n))),p)),x),x)),And(FreeQ(List(a,b,c,d,e,m,n,p),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),EqQ(Plus(m,Times(n,Plus(p,C1)),C1),C0),Or(IntegerQ(n),GtQ(e,C0)),Or(And(GtQ(n,C0),LtQ(m,CN1)),And(LtQ(n,C0),GtQ(Plus(m,n),CN1)))))),
IIntegrate(4548,Int(Times(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),Power(Times(e_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Plus(Times(b,c),Times(CN1,a,d)),Power(Times(e,x),Plus(m,C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Times(a,b,e,Plus(m,C1)),-1)),x),Dist(Times(d,Power(b,-1)),Int(Times(Power(Times(e,x),m),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1))),x),x)),And(FreeQ(List(a,b,c,d,e,m,n,p),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),EqQ(Plus(m,Times(n,Plus(p,C1)),C1),C0),NeQ(m,CN1)))),
IIntegrate(4549,Int(Times(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),Power(Times(e_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(c,Power(Times(e,x),Plus(m,C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Times(a,e,Plus(m,C1)),-1)),x),Dist(Times(Plus(Times(a,d,Plus(m,C1)),Times(CN1,b,c,Plus(m,Times(n,Plus(p,C1)),C1))),Power(Times(a,Power(e,n),Plus(m,C1)),-1)),Int(Times(Power(Times(e,x),Plus(m,n)),Power(Plus(a,Times(b,Power(x,n))),p)),x),x)),And(FreeQ(List(a,b,c,d,e,p),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),Or(IntegerQ(n),GtQ(e,C0)),Or(And(GtQ(n,C0),LtQ(m,CN1)),And(LtQ(n,C0),GtQ(Plus(m,n),CN1))),Not(ILtQ(p,CN1))))),
IIntegrate(4550,Int(Times(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),Power(Times(e_DEFAULT,x_),m_DEFAULT),Power(Plus($p("a1"),Times($p("b1",true),Power(x_,$p("non2",true)))),p_DEFAULT),Power(Plus($p("a2"),Times($p("b2",true),Power(x_,$p("non2",true)))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(c,Power(Times(e,x),Plus(m,C1)),Power(Plus($s("a1"),Times($s("b1"),Power(x,Times(C1D2,n)))),Plus(p,C1)),Power(Plus($s("a2"),Times($s("b2"),Power(x,Times(C1D2,n)))),Plus(p,C1)),Power(Times($s("a1"),$s("a2"),e,Plus(m,C1)),-1)),x),Dist(Times(Plus(Times($s("a1"),$s("a2"),d,Plus(m,C1)),Times(CN1,$s("b1"),$s("b2"),c,Plus(m,Times(n,Plus(p,C1)),C1))),Power(Times($s("a1"),$s("a2"),Power(e,n),Plus(m,C1)),-1)),Int(Times(Power(Times(e,x),Plus(m,n)),Power(Plus($s("a1"),Times($s("b1"),Power(x,Times(C1D2,n)))),p),Power(Plus($s("a2"),Times($s("b2"),Power(x,Times(C1D2,n)))),p)),x),x)),And(FreeQ(List($s("a1"),$s("b1"),$s("a2"),$s("b2"),c,d,e,p),x),EqQ($s("non2"),Times(C1D2,n)),EqQ(Plus(Times($s("a2"),$s("b1")),Times($s("a1"),$s("b2"))),C0),Or(IntegerQ(n),GtQ(e,C0)),Or(And(GtQ(n,C0),LtQ(m,CN1)),And(LtQ(n,C0),GtQ(Plus(m,n),CN1))),Not(ILtQ(p,CN1))))),
IIntegrate(4551,Int(Times(Plus(c_,Times(d_DEFAULT,Sqr(x_))),Power(x_,m_),Power(Plus(a_,Times(b_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Negate(a),Plus(Times(C1D2,m),Negate(C1))),Plus(Times(b,c),Times(CN1,a,d)),x,Power(Plus(a,Times(b,Sqr(x))),Plus(p,C1)),Power(Times(C2,Power(b,Plus(Times(C1D2,m),C1)),Plus(p,C1)),-1)),x),Dist(Power(Times(C2,Power(b,Plus(Times(C1D2,m),C1)),Plus(p,C1)),-1),Int(Times(Power(Plus(a,Times(b,Sqr(x))),Plus(p,C1)),ExpandToSum(Plus(Times(C2,b,Plus(p,C1),Sqr(x),Together(Times(Plus(Times(Power(b,Times(C1D2,m)),Power(x,Plus(m,Negate(C2))),Plus(c,Times(d,Sqr(x)))),Times(CN1,Power(Negate(a),Plus(Times(C1D2,m),Negate(C1))),Plus(Times(b,c),Times(CN1,a,d)))),Power(Plus(a,Times(b,Sqr(x))),-1)))),Times(CN1,Power(Negate(a),Plus(Times(C1D2,m),Negate(C1))),Plus(Times(b,c),Times(CN1,a,d)))),x)),x),x)),And(FreeQ(List(a,b,c,d),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),LtQ(p,CN1),IGtQ(Times(C1D2,m),C0),Or(IntegerQ(p),EqQ(Plus(m,Times(C2,p),C1),C0))))),
IIntegrate(4552,Int(Times(Plus(c_,Times(d_DEFAULT,Sqr(x_))),Power(x_,m_),Power(Plus(a_,Times(b_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Negate(a),Plus(Times(C1D2,m),Negate(C1))),Plus(Times(b,c),Times(CN1,a,d)),x,Power(Plus(a,Times(b,Sqr(x))),Plus(p,C1)),Power(Times(C2,Power(b,Plus(Times(C1D2,m),C1)),Plus(p,C1)),-1)),x),Dist(Power(Times(C2,Power(b,Plus(Times(C1D2,m),C1)),Plus(p,C1)),-1),Int(Times(Power(x,m),Power(Plus(a,Times(b,Sqr(x))),Plus(p,C1)),ExpandToSum(Plus(Times(C2,b,Plus(p,C1),Together(Times(Plus(Times(Power(b,Times(C1D2,m)),Plus(c,Times(d,Sqr(x)))),Times(CN1,Power(Negate(a),Plus(Times(C1D2,m),Negate(C1))),Plus(Times(b,c),Times(CN1,a,d)),Power(x,Plus(Negate(m),C2)))),Power(Plus(a,Times(b,Sqr(x))),-1)))),Times(CN1,Power(Negate(a),Plus(Times(C1D2,m),Negate(C1))),Plus(Times(b,c),Times(CN1,a,d)),Power(Power(x,m),-1))),x)),x),x)),And(FreeQ(List(a,b,c,d),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),LtQ(p,CN1),ILtQ(Times(C1D2,m),C0),Or(IntegerQ(p),EqQ(Plus(m,Times(C2,p),C1),C0))))),
IIntegrate(4553,Int(Times(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),Power(Times(e_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Plus(Times(b,c),Times(CN1,a,d)),Power(Times(e,x),Plus(m,C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Times(a,b,e,n,Plus(p,C1)),-1)),x)),Negate(Dist(Times(Plus(Times(a,d,Plus(m,C1)),Times(CN1,b,c,Plus(m,Times(n,Plus(p,C1)),C1))),Power(Times(a,b,n,Plus(p,C1)),-1)),Int(Times(Power(Times(e,x),m),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1))),x),x))),And(FreeQ(List(a,b,c,d,e,m,n),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),LtQ(p,CN1),Or(And(Not(IntegerQ(Plus(p,C1D2))),NeQ(p,QQ(-5L,4L))),Not(RationalQ(m)),And(IGtQ(n,C0),ILtQ(Plus(p,C1D2),C0),LeQ(CN1,m,Times(CN1,n,Plus(p,C1)))))))),
IIntegrate(4554,Int(Times(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),Power(Times(e_DEFAULT,x_),m_DEFAULT),Power(Plus($p("a1"),Times($p("b1",true),Power(x_,$p("non2",true)))),p_DEFAULT),Power(Plus($p("a2"),Times($p("b2",true),Power(x_,$p("non2",true)))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Plus(Times($s("b1"),$s("b2"),c),Times(CN1,$s("a1"),$s("a2"),d)),Power(Times(e,x),Plus(m,C1)),Power(Plus($s("a1"),Times($s("b1"),Power(x,Times(C1D2,n)))),Plus(p,C1)),Power(Plus($s("a2"),Times($s("b2"),Power(x,Times(C1D2,n)))),Plus(p,C1)),Power(Times($s("a1"),$s("a2"),$s("b1"),$s("b2"),e,n,Plus(p,C1)),-1)),x)),Negate(Dist(Times(Plus(Times($s("a1"),$s("a2"),d,Plus(m,C1)),Times(CN1,$s("b1"),$s("b2"),c,Plus(m,Times(n,Plus(p,C1)),C1))),Power(Times($s("a1"),$s("a2"),$s("b1"),$s("b2"),n,Plus(p,C1)),-1)),Int(Times(Power(Times(e,x),m),Power(Plus($s("a1"),Times($s("b1"),Power(x,Times(C1D2,n)))),Plus(p,C1)),Power(Plus($s("a2"),Times($s("b2"),Power(x,Times(C1D2,n)))),Plus(p,C1))),x),x))),And(FreeQ(List($s("a1"),$s("b1"),$s("a2"),$s("b2"),c,d,e,m,n),x),EqQ($s("non2"),Times(C1D2,n)),EqQ(Plus(Times($s("a2"),$s("b1")),Times($s("a1"),$s("b2"))),C0),LtQ(p,CN1),Or(And(Not(IntegerQ(Plus(p,C1D2))),NeQ(p,QQ(-5L,4L))),Not(RationalQ(m)),And(IGtQ(n,C0),ILtQ(Plus(p,C1D2),C0),LeQ(CN1,m,Times(CN1,n,Plus(p,C1)))))))),
IIntegrate(4555,Int(Times(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),Power(Times(e_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(d,Power(Times(e,x),Plus(m,C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Times(b,e,Plus(m,Times(n,Plus(p,C1)),C1)),-1)),x),Negate(Dist(Times(Plus(Times(a,d,Plus(m,C1)),Times(CN1,b,c,Plus(m,Times(n,Plus(p,C1)),C1))),Power(Times(b,Plus(m,Times(n,Plus(p,C1)),C1)),-1)),Int(Times(Power(Times(e,x),m),Power(Plus(a,Times(b,Power(x,n))),p)),x),x))),And(FreeQ(List(a,b,c,d,e,m,n,p),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),NeQ(Plus(m,Times(n,Plus(p,C1)),C1),C0)))),
IIntegrate(4556,Int(Times(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),Power(Times(e_DEFAULT,x_),m_DEFAULT),Power(Plus($p("a1"),Times($p("b1",true),Power(x_,$p("non2",true)))),p_DEFAULT),Power(Plus($p("a2"),Times($p("b2",true),Power(x_,$p("non2",true)))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(d,Power(Times(e,x),Plus(m,C1)),Power(Plus($s("a1"),Times($s("b1"),Power(x,Times(C1D2,n)))),Plus(p,C1)),Power(Plus($s("a2"),Times($s("b2"),Power(x,Times(C1D2,n)))),Plus(p,C1)),Power(Times($s("b1"),$s("b2"),e,Plus(m,Times(n,Plus(p,C1)),C1)),-1)),x),Negate(Dist(Times(Plus(Times($s("a1"),$s("a2"),d,Plus(m,C1)),Times(CN1,$s("b1"),$s("b2"),c,Plus(m,Times(n,Plus(p,C1)),C1))),Power(Times($s("b1"),$s("b2"),Plus(m,Times(n,Plus(p,C1)),C1)),-1)),Int(Times(Power(Times(e,x),m),Power(Plus($s("a1"),Times($s("b1"),Power(x,Times(C1D2,n)))),p),Power(Plus($s("a2"),Times($s("b2"),Power(x,Times(C1D2,n)))),p)),x),x))),And(FreeQ(List($s("a1"),$s("b1"),$s("a2"),$s("b2"),c,d,e,m,n,p),x),EqQ($s("non2"),Times(C1D2,n)),EqQ(Plus(Times($s("a2"),$s("b1")),Times($s("a1"),$s("b2"))),C0),NeQ(Plus(m,Times(n,Plus(p,C1)),C1),C0)))),
IIntegrate(4557,Int(Times(Power(Times(e_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),-1)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Times(e,x),m),Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),-1)),x),x),And(FreeQ(List(a,b,c,d,e,m),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),IGtQ(n,C0),IGtQ(p,C0),Or(IntegerQ(m),IGtQ(Times(C2,Plus(m,C1)),C0),Not(RationalQ(m)))))),
IIntegrate(4558,Int(Times(Power(Times(e_DEFAULT,x_),m_),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Sqr(Plus(c_,Times(d_DEFAULT,Power(x_,n_))))),x_Symbol),
    Condition(Plus(Simp(Times(Sqr(c),Power(Times(e,x),Plus(m,C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Times(a,e,Plus(m,C1)),-1)),x),Negate(Dist(Power(Times(a,Power(e,n),Plus(m,C1)),-1),Int(Times(Power(Times(e,x),Plus(m,n)),Power(Plus(a,Times(b,Power(x,n))),p),Simp(Plus(Times(b,Sqr(c),n,Plus(p,C1)),Times(c,Plus(Times(b,c),Times(CN1,C2,a,d)),Plus(m,C1)),Times(CN1,a,Plus(m,C1),Sqr(d),Power(x,n))),x)),x),x))),And(FreeQ(List(a,b,c,d,e,p),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),IGtQ(n,C0),LtQ(m,CN1),GtQ(n,C0)))),
IIntegrate(4559,Int(Times(Power(Times(e_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Sqr(Plus(c_,Times(d_DEFAULT,Power(x_,n_))))),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Sqr(Plus(Times(b,c),Times(CN1,a,d))),Power(Times(e,x),Plus(m,C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Times(a,Sqr(b),e,n,Plus(p,C1)),-1)),x)),Dist(Power(Times(a,Sqr(b),n,Plus(p,C1)),-1),Int(Times(Power(Times(e,x),m),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Simp(Plus(Times(Sqr(Plus(Times(b,c),Times(CN1,a,d))),Plus(m,C1)),Times(Sqr(b),Sqr(c),n,Plus(p,C1)),Times(a,b,Sqr(d),n,Plus(p,C1),Power(x,n))),x)),x),x)),And(FreeQ(List(a,b,c,d,e,m,n),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),IGtQ(n,C0),LtQ(p,CN1)))),
IIntegrate(4560,Int(Times(Power(Times(e_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Sqr(Plus(c_,Times(d_DEFAULT,Power(x_,n_))))),x_Symbol),
    Condition(Plus(Simp(Times(Sqr(d),Power(Times(e,x),Plus(m,n,C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Times(b,Power(e,Plus(n,C1)),Plus(m,Times(n,Plus(p,C2)),C1)),-1)),x),Dist(Power(Times(b,Plus(m,Times(n,Plus(p,C2)),C1)),-1),Int(Times(Power(Times(e,x),m),Power(Plus(a,Times(b,Power(x,n))),p),Simp(Plus(Times(b,Sqr(c),Plus(m,Times(n,Plus(p,C2)),C1)),Times(d,Plus(Times(Plus(Times(C2,b,c),Times(CN1,a,d)),Plus(m,n,C1)),Times(C2,b,c,n,Plus(p,C1))),Power(x,n))),x)),x),x)),And(FreeQ(List(a,b,c,d,e,m,n,p),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),IGtQ(n,C0),NeQ(Plus(m,Times(n,Plus(p,C2)),C1),C0)))),
IIntegrate(4561,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_)),x_Symbol),
    Condition(With(List(Set(k,GCD(Plus(m,C1),n))),Condition(Dist(Power(k,-1),Subst(Int(Times(Power(x,Plus(Times(Plus(m,C1),Power(k,-1)),Negate(C1))),Power(Plus(a,Times(b,Power(x,Times(n,Power(k,-1))))),p),Power(Plus(c,Times(d,Power(x,Times(n,Power(k,-1))))),q)),x),x,Power(x,k)),x),Unequal(k,C1))),And(FreeQ(List(a,b,c,d,p,q),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),IGtQ(n,C0),IntegerQ(m)))),
IIntegrate(4562,Int(Times(Power(Times(e_DEFAULT,x_),m_),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_)),x_Symbol),
    Condition(With(List(Set(k,Denominator(m))),Dist(Times(k,Power(e,-1)),Subst(Int(Times(Power(x,Plus(Times(k,Plus(m,C1)),Negate(C1))),Power(Plus(a,Times(b,Power(x,Times(k,n)),Power(Power(e,n),-1))),p),Power(Plus(c,Times(d,Power(x,Times(k,n)),Power(Power(e,n),-1))),q)),x),x,Power(Times(e,x),Power(k,-1))),x)),And(FreeQ(List(a,b,c,d,e,p,q),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),IGtQ(n,C0),FractionQ(m),IntegerQ(p)))),
IIntegrate(4563,Int(Times(Power(Times(e_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(e,Plus(n,Negate(C1))),Power(Times(e,x),Plus(m,Negate(n),C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),q),Power(Times(b,n,Plus(p,C1)),-1)),x),Negate(Dist(Times(Power(e,n),Power(Times(b,n,Plus(p,C1)),-1)),Int(Times(Power(Times(e,x),Plus(m,Negate(n))),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),Plus(q,Negate(C1))),Simp(Plus(Times(c,Plus(m,Negate(n),C1)),Times(d,Plus(m,Times(n,Plus(q,Negate(C1))),C1),Power(x,n))),x)),x),x))),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),IGtQ(n,C0),LtQ(p,CN1),GtQ(q,C0),GtQ(Plus(m,Negate(n),C1),C0),IntBinomialQ(a,b,c,d,e,m,n,p,q,x)))),
IIntegrate(4564,Int(Times(Power(Times(e_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Plus(Times(c,b),Times(CN1,a,d)),Power(Times(e,x),Plus(m,C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),Plus(q,Negate(C1))),Power(Times(a,b,e,n,Plus(p,C1)),-1)),x)),Dist(Power(Times(a,b,n,Plus(p,C1)),-1),Int(Times(Power(Times(e,x),m),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),Plus(q,Negate(C2))),Simp(Plus(Times(c,Plus(Times(c,b,n,Plus(p,C1)),Times(Plus(Times(c,b),Times(CN1,a,d)),Plus(m,C1)))),Times(d,Plus(Times(c,b,n,Plus(p,C1)),Times(Plus(Times(c,b),Times(CN1,a,d)),Plus(m,Times(n,Plus(q,Negate(C1))),C1))),Power(x,n))),x)),x),x)),And(FreeQ(List(a,b,c,d,e,m),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),IGtQ(n,C0),LtQ(p,CN1),GtQ(q,C1),IntBinomialQ(a,b,c,d,e,m,n,p,q,x)))),
IIntegrate(4565,Int(Times(Power(Times(e_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Times(e,x),Plus(m,C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),q),Power(Times(a,e,n,Plus(p,C1)),-1)),x)),Dist(Power(Times(a,n,Plus(p,C1)),-1),Int(Times(Power(Times(e,x),m),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),Plus(q,Negate(C1))),Simp(Plus(Times(c,Plus(m,Times(n,Plus(p,C1)),C1)),Times(d,Plus(m,Times(n,Plus(p,q,C1)),C1),Power(x,n))),x)),x),x)),And(FreeQ(List(a,b,c,d,e,m),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),IGtQ(n,C0),LtQ(p,CN1),LtQ(C0,q,C1),IntBinomialQ(a,b,c,d,e,m,n,p,q,x)))),
IIntegrate(4566,Int(Times(Power(Times(e_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(a,Power(e,Plus(Times(C2,n),Negate(C1))),Power(Times(e,x),Plus(m,Times(CN1,C2,n),C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),Plus(q,C1)),Power(Times(b,n,Plus(Times(b,c),Times(CN1,a,d)),Plus(p,C1)),-1)),x)),Dist(Times(Power(e,Times(C2,n)),Power(Times(b,n,Plus(Times(b,c),Times(CN1,a,d)),Plus(p,C1)),-1)),Int(Times(Power(Times(e,x),Plus(m,Times(CN1,C2,n))),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),q),Simp(Plus(Times(a,c,Plus(m,Times(CN1,C2,n),C1)),Times(Plus(Times(a,d,Plus(m,Negate(n),Times(n,q),C1)),Times(b,c,n,Plus(p,C1))),Power(x,n))),x)),x),x)),And(FreeQ(List(a,b,c,d,e,q),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),IGtQ(n,C0),LtQ(p,CN1),GtQ(Plus(m,Negate(n),C1),n),IntBinomialQ(a,b,c,d,e,m,n,p,q,x)))),
IIntegrate(4567,Int(Times(Power(Times(e_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(e,Plus(n,Negate(C1))),Power(Times(e,x),Plus(m,Negate(n),C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),Plus(q,C1)),Power(Times(n,Plus(Times(b,c),Times(CN1,a,d)),Plus(p,C1)),-1)),x),Negate(Dist(Times(Power(e,n),Power(Times(n,Plus(Times(b,c),Times(CN1,a,d)),Plus(p,C1)),-1)),Int(Times(Power(Times(e,x),Plus(m,Negate(n))),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),q),Simp(Plus(Times(c,Plus(m,Negate(n),C1)),Times(d,Plus(m,Times(n,Plus(p,q,C1)),C1),Power(x,n))),x)),x),x))),And(FreeQ(List(a,b,c,d,e,q),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),IGtQ(n,C0),LtQ(p,CN1),GeQ(n,Plus(m,Negate(n),C1)),GtQ(Plus(m,Negate(n),C1),C0),IntBinomialQ(a,b,c,d,e,m,n,p,q,x)))),
IIntegrate(4568,Int(Times(Power(Times(e_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,Power(Times(e,x),Plus(m,C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),Plus(q,C1)),Power(Times(a,e,n,Plus(Times(b,c),Times(CN1,a,d)),Plus(p,C1)),-1)),x)),Dist(Power(Times(a,n,Plus(Times(b,c),Times(CN1,a,d)),Plus(p,C1)),-1),Int(Times(Power(Times(e,x),m),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),q),Simp(Plus(Times(c,b,Plus(m,C1)),Times(n,Plus(Times(b,c),Times(CN1,a,d)),Plus(p,C1)),Times(d,b,Plus(m,Times(n,Plus(p,q,C2)),C1),Power(x,n))),x)),x),x)),And(FreeQ(List(a,b,c,d,e,m,q),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),IGtQ(n,C0),LtQ(p,CN1),IntBinomialQ(a,b,c,d,e,m,n,p,q,x)))),
IIntegrate(4569,Int(Times(Power(Times(e_DEFAULT,x_),m_),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(e,x),Plus(m,C1)),Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),q),Power(Times(e,Plus(m,C1)),-1)),x),Negate(Dist(Times(n,Power(Times(Power(e,n),Plus(m,C1)),-1)),Int(Times(Power(Times(e,x),Plus(m,n)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,Negate(C1))),Power(Plus(c,Times(d,Power(x,n))),Plus(q,Negate(C1))),Simp(Plus(Times(b,c,p),Times(a,d,q),Times(b,d,Plus(p,q),Power(x,n))),x)),x),x))),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),IGtQ(n,C0),GtQ(q,C0),LtQ(m,CN1),GtQ(p,C0),IntBinomialQ(a,b,c,d,e,m,n,p,q,x)))),
IIntegrate(4570,Int(Times(Power(Times(e_DEFAULT,x_),m_),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_)),x_Symbol),
    Condition(Plus(Simp(Times(c,Power(Times(e,x),Plus(m,C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),Plus(q,Negate(C1))),Power(Times(a,e,Plus(m,C1)),-1)),x),Negate(Dist(Power(Times(a,Power(e,n),Plus(m,C1)),-1),Int(Times(Power(Times(e,x),Plus(m,n)),Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),Plus(q,Negate(C2))),Simp(Plus(Times(c,Plus(Times(c,b),Times(CN1,a,d)),Plus(m,C1)),Times(c,n,Plus(Times(b,c,Plus(p,C1)),Times(a,d,Plus(q,Negate(C1))))),Times(d,Plus(Times(Plus(Times(c,b),Times(CN1,a,d)),Plus(m,C1)),Times(c,b,n,Plus(p,q))),Power(x,n))),x)),x),x))),And(FreeQ(List(a,b,c,d,e,p),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),IGtQ(n,C0),GtQ(q,C1),LtQ(m,CN1),IntBinomialQ(a,b,c,d,e,m,n,p,q,x)))),
IIntegrate(4571,Int(Times(Power(Times(e_DEFAULT,x_),m_),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(e,x),Plus(m,C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),q),Power(Times(a,e,Plus(m,C1)),-1)),x),Negate(Dist(Power(Times(a,Power(e,n),Plus(m,C1)),-1),Int(Times(Power(Times(e,x),Plus(m,n)),Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),Plus(q,Negate(C1))),Simp(Plus(Times(c,b,Plus(m,C1)),Times(n,Plus(Times(b,c,Plus(p,C1)),Times(a,d,q))),Times(d,Plus(Times(b,Plus(m,C1)),Times(b,n,Plus(p,q,C1))),Power(x,n))),x)),x),x))),And(FreeQ(List(a,b,c,d,e,p),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),IGtQ(n,C0),LtQ(C0,q,C1),LtQ(m,CN1),IntBinomialQ(a,b,c,d,e,m,n,p,q,x)))),
IIntegrate(4572,Int(Times(Power(Times(e_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(e,x),Plus(m,C1)),Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),q),Power(Times(e,Plus(m,Times(n,Plus(p,q)),C1)),-1)),x),Dist(Times(n,Power(Plus(m,Times(n,Plus(p,q)),C1),-1)),Int(Times(Power(Times(e,x),m),Power(Plus(a,Times(b,Power(x,n))),Plus(p,Negate(C1))),Power(Plus(c,Times(d,Power(x,n))),Plus(q,Negate(C1))),Simp(Plus(Times(a,c,Plus(p,q)),Times(Plus(Times(q,Plus(Times(b,c),Times(CN1,a,d))),Times(a,d,Plus(p,q))),Power(x,n))),x)),x),x)),And(FreeQ(List(a,b,c,d,e,m),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),IGtQ(n,C0),GtQ(q,C0),GtQ(p,C0),IntBinomialQ(a,b,c,d,e,m,n,p,q,x)))),
IIntegrate(4573,Int(Times(Power(Times(e_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_)),x_Symbol),
    Condition(Plus(Simp(Times(d,Power(Times(e,x),Plus(m,C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),Plus(q,Negate(C1))),Power(Times(b,e,Plus(m,Times(n,Plus(p,q)),C1)),-1)),x),Dist(Power(Times(b,Plus(m,Times(n,Plus(p,q)),C1)),-1),Int(Times(Power(Times(e,x),m),Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),Plus(q,Negate(C2))),Simp(Plus(Times(c,Plus(Times(Plus(Times(c,b),Times(CN1,a,d)),Plus(m,C1)),Times(c,b,n,Plus(p,q)))),Times(Plus(Times(d,Plus(Times(c,b),Times(CN1,a,d)),Plus(m,C1)),Times(d,n,Plus(q,Negate(C1)),Plus(Times(b,c),Times(CN1,a,d))),Times(c,b,d,n,Plus(p,q))),Power(x,n))),x)),x),x)),And(FreeQ(List(a,b,c,d,e,m,p),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),IGtQ(n,C0),GtQ(q,C1),IntBinomialQ(a,b,c,d,e,m,n,p,q,x)))),
IIntegrate(4574,Int(Times(Power(Times(e_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(e,Plus(n,Negate(C1))),Power(Times(e,x),Plus(m,Negate(n),C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),q),Power(Times(b,Plus(m,Times(n,Plus(p,q)),C1)),-1)),x),Negate(Dist(Times(Power(e,n),Power(Times(b,Plus(m,Times(n,Plus(p,q)),C1)),-1)),Int(Times(Power(Times(e,x),Plus(m,Negate(n))),Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),Plus(q,Negate(C1))),Simp(Plus(Times(a,c,Plus(m,Negate(n),C1)),Times(Plus(Times(a,d,Plus(m,Negate(n),C1)),Times(CN1,n,q,Plus(Times(b,c),Times(CN1,a,d)))),Power(x,n))),x)),x),x))),And(FreeQ(List(a,b,c,d,e,p),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),IGtQ(n,C0),GtQ(q,C0),GtQ(Plus(m,Negate(n),C1),C0),IntBinomialQ(a,b,c,d,e,m,n,p,q,x)))),
IIntegrate(4575,Int(Times(Power(Times(e_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(e,Plus(Times(C2,n),Negate(C1))),Power(Times(e,x),Plus(m,Times(CN1,C2,n),C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),Plus(q,C1)),Power(Times(b,d,Plus(m,Times(n,Plus(p,q)),C1)),-1)),x),Negate(Dist(Times(Power(e,Times(C2,n)),Power(Times(b,d,Plus(m,Times(n,Plus(p,q)),C1)),-1)),Int(Times(Power(Times(e,x),Plus(m,Times(CN1,C2,n))),Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),q),Simp(Plus(Times(a,c,Plus(m,Times(CN1,C2,n),C1)),Times(Plus(Times(a,d,Plus(m,Times(n,Plus(q,Negate(C1))),C1)),Times(b,c,Plus(m,Times(n,Plus(p,Negate(C1))),C1))),Power(x,n))),x)),x),x))),And(FreeQ(List(a,b,c,d,e,p,q),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),IGtQ(n,C0),GtQ(Plus(m,Negate(n),C1),n),IntBinomialQ(a,b,c,d,e,m,n,p,q,x)))),
IIntegrate(4576,Int(Times(Power(Times(e_DEFAULT,x_),m_),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(e,x),Plus(m,C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),Plus(q,C1)),Power(Times(a,c,e,Plus(m,C1)),-1)),x),Negate(Dist(Power(Times(a,c,Power(e,n),Plus(m,C1)),-1),Int(Times(Power(Times(e,x),Plus(m,n)),Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),q),Simp(Plus(Times(Plus(Times(b,c),Times(a,d)),Plus(m,n,C1)),Times(n,Plus(Times(b,c,p),Times(a,d,q))),Times(b,d,Plus(m,Times(n,Plus(p,q,C2)),C1),Power(x,n))),x)),x),x))),And(FreeQ(List(a,b,c,d,e,p,q),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),IGtQ(n,C0),LtQ(m,CN1),IntBinomialQ(a,b,c,d,e,m,n,p,q,x)))),
IIntegrate(4577,Int(Times(Power(Times(e_DEFAULT,x_),m_DEFAULT),Power(Times(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),Plus(c_,Times(d_DEFAULT,Power(x_,n_)))),-1)),x_Symbol),
    Condition(Plus(Negate(Dist(Times(a,Power(e,n),Power(Plus(Times(b,c),Times(CN1,a,d)),-1)),Int(Times(Power(Times(e,x),Plus(m,Negate(n))),Power(Plus(a,Times(b,Power(x,n))),-1)),x),x)),Dist(Times(c,Power(e,n),Power(Plus(Times(b,c),Times(CN1,a,d)),-1)),Int(Times(Power(Times(e,x),Plus(m,Negate(n))),Power(Plus(c,Times(d,Power(x,n))),-1)),x),x)),And(FreeQ(List(a,b,c,d,e,m),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),IGtQ(n,C0),LeQ(n,m,Plus(Times(C2,n),Negate(C1)))))),
IIntegrate(4578,Int(Times(Power(Times(e_DEFAULT,x_),m_DEFAULT),Power(Times(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),Plus(c_,Times(d_DEFAULT,Power(x_,n_)))),-1)),x_Symbol),
    Condition(Plus(Dist(Times(b,Power(Plus(Times(b,c),Times(CN1,a,d)),-1)),Int(Times(Power(Times(e,x),m),Power(Plus(a,Times(b,Power(x,n))),-1)),x),x),Negate(Dist(Times(d,Power(Plus(Times(b,c),Times(CN1,a,d)),-1)),Int(Times(Power(Times(e,x),m),Power(Plus(c,Times(d,Power(x,n))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,m),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),IGtQ(n,C0)))),
IIntegrate(4579,Int(Times(Power(Times(e_DEFAULT,x_),m_),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),-1),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_DEFAULT)),x_Symbol),
    Condition(Plus(Dist(Times(Power(e,n),Power(b,-1)),Int(Times(Power(Times(e,x),Plus(m,Negate(n))),Power(Plus(c,Times(d,Power(x,n))),q)),x),x),Negate(Dist(Times(a,Power(e,n),Power(b,-1)),Int(Times(Power(Times(e,x),Plus(m,Negate(n))),Power(Plus(c,Times(d,Power(x,n))),q),Power(Plus(a,Times(b,Power(x,n))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,m,q),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),IGtQ(n,C0),LeQ(n,m,Plus(Times(C2,n),Negate(C1))),IntBinomialQ(a,b,c,d,e,m,n,CN1,q,x)))),
IIntegrate(4580,Int(Times(x_,Power(Times(Plus(a_,Times(b_DEFAULT,Power(x_,3))),Sqrt(Plus(c_,Times(d_DEFAULT,Power(x_,3))))),-1)),x_Symbol),
    Condition(With(List(Set(q,Rt(Times(d,Power(c,-1)),C3))),Plus(Simp(Times(q,ArcTanh(Times(Sqrt(Plus(c,Times(d,Power(x,3)))),Power(Rt(c,C2),-1))),Power(Times(C9,Power(C2,QQ(2L,3L)),b,Rt(c,C2)),-1)),x),Negate(Simp(Times(q,ArcTanh(Times(Rt(c,C2),Plus(C1,Times(CN1,Power(C2,C1D3),q,x)),Power(Plus(c,Times(d,Power(x,3))),CN1D2))),Power(Times(C3,Power(C2,QQ(2L,3L)),b,Rt(c,C2)),-1)),x)),Simp(Times(q,ArcTan(Times(Sqrt(Plus(c,Times(d,Power(x,3)))),Power(Times(CSqrt3,Rt(c,C2)),-1))),Power(Times(C3,Power(C2,QQ(2L,3L)),CSqrt3,b,Rt(c,C2)),-1)),x),Negate(Simp(Times(q,ArcTan(Times(CSqrt3,Rt(c,C2),Plus(C1,Times(Power(C2,C1D3),q,x)),Power(Plus(c,Times(d,Power(x,3))),CN1D2))),Power(Times(C3,Power(C2,QQ(2L,3L)),CSqrt3,b,Rt(c,C2)),-1)),x)))),And(FreeQ(List(a,b,c,d),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),EqQ(Plus(Times(C4,b,c),Times(CN1,a,d)),C0),PosQ(c)))),
IIntegrate(4581,Int(Times(x_,Power(Times(Plus(a_,Times(b_DEFAULT,Power(x_,3))),Sqrt(Plus(c_,Times(d_DEFAULT,Power(x_,3))))),-1)),x_Symbol),
    Condition(With(List(Set(q,Rt(Times(d,Power(c,-1)),C3))),Plus(Negate(Simp(Times(q,ArcTan(Times(Sqrt(Plus(c,Times(d,Power(x,3)))),Power(Rt(Negate(c),C2),-1))),Power(Times(C9,Power(C2,QQ(2L,3L)),b,Rt(Negate(c),C2)),-1)),x)),Negate(Simp(Times(q,ArcTan(Times(Rt(Negate(c),C2),Plus(C1,Times(CN1,Power(C2,C1D3),q,x)),Power(Plus(c,Times(d,Power(x,3))),CN1D2))),Power(Times(C3,Power(C2,QQ(2L,3L)),b,Rt(Negate(c),C2)),-1)),x)),Negate(Simp(Times(q,ArcTanh(Times(Sqrt(Plus(c,Times(d,Power(x,3)))),Power(Times(CSqrt3,Rt(Negate(c),C2)),-1))),Power(Times(C3,Power(C2,QQ(2L,3L)),CSqrt3,b,Rt(Negate(c),C2)),-1)),x)),Negate(Simp(Times(q,ArcTanh(Times(CSqrt3,Rt(Negate(c),C2),Plus(C1,Times(Power(C2,C1D3),q,x)),Power(Plus(c,Times(d,Power(x,3))),CN1D2))),Power(Times(C3,Power(C2,QQ(2L,3L)),CSqrt3,b,Rt(Negate(c),C2)),-1)),x)))),And(FreeQ(List(a,b,c,d),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),EqQ(Plus(Times(C4,b,c),Times(CN1,a,d)),C0),NegQ(c)))),
IIntegrate(4582,Int(Times(x_,Power(Times(Plus(a_,Times(b_DEFAULT,Power(x_,3))),Sqrt(Plus(c_,Times(d_DEFAULT,Power(x_,3))))),-1)),x_Symbol),
    Condition(With(List(Set(q,Rt(Times(d,Power(c,-1)),C3))),Plus(Dist(Times(d,q,Power(Times(C4,b),-1)),Int(Times(Sqr(x),Power(Times(Plus(Times(C8,c),Times(CN1,d,Power(x,3))),Sqrt(Plus(c,Times(d,Power(x,3))))),-1)),x),x),Negate(Dist(Times(Sqr(q),Power(Times(ZZ(12L),b),-1)),Int(Times(Plus(C1,Times(q,x)),Power(Times(Plus(C2,Times(CN1,q,x)),Sqrt(Plus(c,Times(d,Power(x,3))))),-1)),x),x)),Dist(Power(Times(ZZ(12L),b,c),-1),Int(Times(Plus(Times(C2,c,Sqr(q)),Times(CN1,C2,d,x),Times(CN1,d,q,Sqr(x))),Power(Times(Plus(C4,Times(C2,q,x),Times(Sqr(q),Sqr(x))),Sqrt(Plus(c,Times(d,Power(x,3))))),-1)),x),x))),And(FreeQ(List(a,b,c,d),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),EqQ(Plus(Times(C8,b,c),Times(a,d)),C0)))),
IIntegrate(4583,Int(Times(x_,Power(Times(Plus(c_,Times(d_DEFAULT,Power(x_,3))),Sqrt(Plus(a_,Times(b_DEFAULT,Power(x_,3))))),-1)),x_Symbol),
    Condition(With(List(Set(q,Rt(Times(b,Power(a,-1)),C3)),Set(r,Simplify(Times(Plus(Times(b,c),Times(CN1,C10,a,d)),Power(Times(C6,a,d),-1))))),Plus(Negate(Simp(Times(q,Plus(C2,Negate(r)),ArcTan(Times(Plus(C1,Negate(r)),Sqrt(Plus(a,Times(b,Power(x,3)))),Power(Times(CSqrt2,Rt(a,C2),Power(r,QQ(3L,2L))),-1))),Power(Times(C3,CSqrt2,Rt(a,C2),d,Power(r,QQ(3L,2L))),-1)),x)),Negate(Simp(Times(q,Plus(C2,Negate(r)),ArcTan(Times(Rt(a,C2),Sqrt(r),Plus(C1,r),Plus(C1,Times(q,x)),Power(Times(CSqrt2,Sqrt(Plus(a,Times(b,Power(x,3))))),-1))),Power(Times(C2,CSqrt2,Rt(a,C2),d,Power(r,QQ(3L,2L))),-1)),x)),Negate(Simp(Times(q,Plus(C2,Negate(r)),ArcTanh(Times(Rt(a,C2),Sqrt(r),Plus(C1,r,Times(CN1,C2,q,x)),Power(Times(CSqrt2,Sqrt(Plus(a,Times(b,Power(x,3))))),-1))),Power(Times(C3,CSqrt2,Rt(a,C2),d,Sqrt(r)),-1)),x)),Negate(Simp(Times(q,Plus(C2,Negate(r)),ArcTanh(Times(Rt(a,C2),Plus(C1,Negate(r)),Sqrt(r),Plus(C1,Times(q,x)),Power(Times(CSqrt2,Sqrt(Plus(a,Times(b,Power(x,3))))),-1))),Power(Times(C6,CSqrt2,Rt(a,C2),d,Sqrt(r)),-1)),x)))),And(FreeQ(List(a,b,c,d),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),EqQ(Plus(Times(Sqr(b),Sqr(c)),Times(CN1,ZZ(20L),a,b,c,d),Times(CN1,C8,Sqr(a),Sqr(d))),C0),PosQ(a)))),
IIntegrate(4584,Int(Times(x_,Power(Times(Plus(c_,Times(d_DEFAULT,Power(x_,3))),Sqrt(Plus(a_,Times(b_DEFAULT,Power(x_,3))))),-1)),x_Symbol),
    Condition(With(List(Set(q,Rt(Times(b,Power(a,-1)),C3)),Set(r,Simplify(Times(Plus(Times(b,c),Times(CN1,C10,a,d)),Power(Times(C6,a,d),-1))))),Plus(Simp(Times(q,Plus(C2,Negate(r)),ArcTanh(Times(Plus(C1,Negate(r)),Sqrt(Plus(a,Times(b,Power(x,3)))),Power(Times(CSqrt2,Rt(Negate(a),C2),Power(r,QQ(3L,2L))),-1))),Power(Times(C3,CSqrt2,Rt(Negate(a),C2),d,Power(r,QQ(3L,2L))),-1)),x),Negate(Simp(Times(q,Plus(C2,Negate(r)),ArcTanh(Times(Rt(Negate(a),C2),Sqrt(r),Plus(C1,r),Plus(C1,Times(q,x)),Power(Times(CSqrt2,Sqrt(Plus(a,Times(b,Power(x,3))))),-1))),Power(Times(C2,CSqrt2,Rt(Negate(a),C2),d,Power(r,QQ(3L,2L))),-1)),x)),Negate(Simp(Times(q,Plus(C2,Negate(r)),ArcTan(Times(Rt(Negate(a),C2),Sqrt(r),Plus(C1,r,Times(CN1,C2,q,x)),Power(Times(CSqrt2,Sqrt(Plus(a,Times(b,Power(x,3))))),-1))),Power(Times(C3,CSqrt2,Rt(Negate(a),C2),d,Sqrt(r)),-1)),x)),Negate(Simp(Times(q,Plus(C2,Negate(r)),ArcTan(Times(Rt(Negate(a),C2),Plus(C1,Negate(r)),Sqrt(r),Plus(C1,Times(q,x)),Power(Times(CSqrt2,Sqrt(Plus(a,Times(b,Power(x,3))))),-1))),Power(Times(C6,CSqrt2,Rt(Negate(a),C2),d,Sqrt(r)),-1)),x)))),And(FreeQ(List(a,b,c,d),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),EqQ(Plus(Times(Sqr(b),Sqr(c)),Times(CN1,ZZ(20L),a,b,c,d),Times(CN1,C8,Sqr(a),Sqr(d))),C0),NegQ(a)))),
IIntegrate(4585,Int(Times(x_,Sqrt(Plus(a_,Times(b_DEFAULT,Power(x_,3)))),Power(Plus(c_,Times(d_DEFAULT,Power(x_,3))),-1)),x_Symbol),
    Condition(Plus(Dist(Times(b,Power(d,-1)),Int(Times(x,Power(Plus(a,Times(b,Power(x,3))),CN1D2)),x),x),Negate(Dist(Times(Plus(Times(b,c),Times(CN1,a,d)),Power(d,-1)),Int(Times(x,Power(Times(Plus(c,Times(d,Power(x,3))),Sqrt(Plus(a,Times(b,Power(x,3))))),-1)),x),x))),And(FreeQ(List(c,d,a,b),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),Or(EqQ(Plus(Times(b,c),Times(CN1,C4,a,d)),C0),EqQ(Plus(Times(b,c),Times(C8,a,d)),C0),EqQ(Plus(Times(Sqr(b),Sqr(c)),Times(CN1,ZZ(20L),a,b,c,d),Times(CN1,C8,Sqr(a),Sqr(d))),C0))))),
IIntegrate(4586,Int(Times(Sqr(x_),Power(Times(Plus(a_,Times(b_DEFAULT,Power(x_,4))),Sqrt(Plus(c_,Times(d_DEFAULT,Power(x_,4))))),-1)),x_Symbol),
    Condition(With(List(Set(r,Numerator(Rt(Times(CN1,a,Power(b,-1)),C2))),Set(s,Denominator(Rt(Times(CN1,a,Power(b,-1)),C2)))),Plus(Dist(Times(s,Power(Times(C2,b),-1)),Int(Power(Times(Plus(r,Times(s,Sqr(x))),Sqrt(Plus(c,Times(d,Power(x,4))))),-1),x),x),Negate(Dist(Times(s,Power(Times(C2,b),-1)),Int(Power(Times(Plus(r,Times(CN1,s,Sqr(x))),Sqrt(Plus(c,Times(d,Power(x,4))))),-1),x),x)))),And(FreeQ(List(a,b,c,d),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0)))),
IIntegrate(4587,Int(Times(Sqr(x_),Power(Plus(a_,Times(b_DEFAULT,Power(x_,4))),-1),Sqrt(Plus(c_,Times(d_DEFAULT,Power(x_,4))))),x_Symbol),
    Condition(Plus(Dist(Times(d,Power(b,-1)),Int(Times(Sqr(x),Power(Plus(c,Times(d,Power(x,4))),CN1D2)),x),x),Dist(Times(Plus(Times(b,c),Times(CN1,a,d)),Power(b,-1)),Int(Times(Sqr(x),Power(Times(Plus(a,Times(b,Power(x,4))),Sqrt(Plus(c,Times(d,Power(x,4))))),-1)),x),x)),And(FreeQ(List(a,b,c,d),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0)))),
IIntegrate(4588,Int(Times(Sqr(x_),Power(Times(Sqrt(Plus(a_,Times(b_DEFAULT,Sqr(x_)))),Sqrt(Plus(c_,Times(d_DEFAULT,Sqr(x_))))),-1)),x_Symbol),
    Condition(Plus(Simp(Times(x,Sqrt(Plus(a,Times(b,Sqr(x)))),Power(Times(b,Sqrt(Plus(c,Times(d,Sqr(x))))),-1)),x),Negate(Dist(Times(c,Power(b,-1)),Int(Times(Sqrt(Plus(a,Times(b,Sqr(x)))),Power(Plus(c,Times(d,Sqr(x))),QQ(-3L,2L))),x),x))),And(FreeQ(List(a,b,c,d),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),PosQ(Times(b,Power(a,-1))),PosQ(Times(d,Power(c,-1))),Not(SimplerSqrtQ(Times(b,Power(a,-1)),Times(d,Power(c,-1))))))),
IIntegrate(4589,Int(Times(Power(x_,n_),Power(Times(Sqrt(Plus(a_,Times(b_DEFAULT,Power(x_,n_)))),Sqrt(Plus(c_,Times(d_DEFAULT,Power(x_,n_))))),-1)),x_Symbol),
    Condition(Plus(Dist(Power(b,-1),Int(Times(Sqrt(Plus(a,Times(b,Power(x,n)))),Power(Plus(c,Times(d,Power(x,n))),CN1D2)),x),x),Negate(Dist(Times(a,Power(b,-1)),Int(Power(Times(Sqrt(Plus(a,Times(b,Power(x,n)))),Sqrt(Plus(c,Times(d,Power(x,n))))),-1),x),x))),And(FreeQ(List(a,b,c,d),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),Or(EqQ(n,C2),EqQ(n,C4)),Not(And(EqQ(n,C2),SimplerSqrtQ(Times(CN1,b,Power(a,-1)),Times(CN1,d,Power(c,-1)))))))),
IIntegrate(4590,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_DEFAULT)),x_Symbol),
    Condition(With(List(Set(k,Denominator(p))),Dist(Times(k,Power(a,Plus(p,Times(Plus(m,C1),Power(n,-1)))),Power(n,-1)),Subst(Int(Times(Power(x,Plus(Times(k,Plus(m,C1),Power(n,-1)),Negate(C1))),Power(Plus(c,Times(CN1,Plus(Times(b,c),Times(CN1,a,d)),Power(x,k))),q),Power(Power(Plus(C1,Times(CN1,b,Power(x,k))),Plus(p,q,Times(Plus(m,C1),Power(n,-1)),C1)),-1)),x),x,Times(Power(x,Times(n,Power(k,-1))),Power(Power(Plus(a,Times(b,Power(x,n))),Power(k,-1)),-1))),x)),And(FreeQ(List(a,b,c,d),x),IGtQ(n,C0),RationalQ(m,p),IntegersQ(Plus(p,Times(Plus(m,C1),Power(n,-1))),q),LtQ(CN1,p,C0)))),
IIntegrate(4591,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_)),x_Symbol),
    Condition(Negate(Subst(Int(Times(Power(Plus(a,Times(b,Power(Power(x,n),-1))),p),Power(Plus(c,Times(d,Power(Power(x,n),-1))),q),Power(Power(x,Plus(m,C2)),-1)),x),x,Power(x,-1))),And(FreeQ(List(a,b,c,d,p,q),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),ILtQ(n,C0),IntegerQ(m)))),
IIntegrate(4592,Int(Times(Power(Times(e_DEFAULT,x_),m_),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_)),x_Symbol),
    Condition(With(List(Set(g,Denominator(m))),Negate(Dist(Times(g,Power(e,-1)),Subst(Int(Times(Power(Plus(a,Times(b,Power(Times(Power(e,n),Power(x,Times(g,n))),-1))),p),Power(Plus(c,Times(d,Power(Times(Power(e,n),Power(x,Times(g,n))),-1))),q),Power(Power(x,Plus(Times(g,Plus(m,C1)),C1)),-1)),x),x,Power(Power(Times(e,x),Power(g,-1)),-1)),x))),And(FreeQ(List(a,b,c,d,e,p,q),x),ILtQ(n,C0),FractionQ(m)))),
IIntegrate(4593,Int(Times(Power(Times(e_DEFAULT,x_),m_),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_)),x_Symbol),
    Condition(Negate(Dist(Times(Power(Times(e,x),m),Power(Power(x,-1),m)),Subst(Int(Times(Power(Plus(a,Times(b,Power(Power(x,n),-1))),p),Power(Plus(c,Times(d,Power(Power(x,n),-1))),q),Power(Power(x,Plus(m,C2)),-1)),x),x,Power(x,-1)),x)),And(FreeQ(List(a,b,c,d,e,m,p,q),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),ILtQ(n,C0),Not(RationalQ(m))))),
IIntegrate(4594,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_)),x_Symbol),
    Condition(With(List(Set(g,Denominator(n))),Dist(g,Subst(Int(Times(Power(x,Plus(Times(g,Plus(m,C1)),Negate(C1))),Power(Plus(a,Times(b,Power(x,Times(g,n)))),p),Power(Plus(c,Times(d,Power(x,Times(g,n)))),q)),x),x,Power(x,Power(g,-1))),x)),And(FreeQ(List(a,b,c,d,m,p,q),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),FractionQ(n)))),
IIntegrate(4595,Int(Times(Power(Times(e_,x_),m_),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_)),x_Symbol),
    Condition(Dist(Times(Power(e,IntPart(m)),Power(Times(e,x),FracPart(m)),Power(Power(x,FracPart(m)),-1)),Int(Times(Power(x,m),Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),q)),x),x),And(FreeQ(List(a,b,c,d,e,m,p,q),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),FractionQ(n)))),
IIntegrate(4596,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_)),x_Symbol),
    Condition(Dist(Power(Plus(m,C1),-1),Subst(Int(Times(Power(Plus(a,Times(b,Power(x,Simplify(Times(n,Power(Plus(m,C1),-1)))))),p),Power(Plus(c,Times(d,Power(x,Simplify(Times(n,Power(Plus(m,C1),-1)))))),q)),x),x,Power(x,Plus(m,C1))),x),And(FreeQ(List(a,b,c,d,m,n,p,q),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),IntegerQ(Simplify(Times(n,Power(Plus(m,C1),-1)))),Not(IntegerQ(n)))))
  );
}
