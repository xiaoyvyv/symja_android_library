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
public class IntRules43 { 
  public static IAST RULES = List( 
IIntegrate(6223,Int(Times(Plus(e_,Times(f_DEFAULT,x_)),Power(Times(Plus(c_,Times(d_DEFAULT,x_)),Power(Plus(a_,Times(b_DEFAULT,Power(x_,3))),C1D3)),-1)),x_Symbol),
    Condition(Plus(Simp(Times(CSqrt3,f,ArcTan(Times(Plus(C1,Times(C2,Rt(b,C3),Plus(Times(C2,c),Times(d,x)),Power(Times(d,Power(Plus(a,Times(b,Power(x,3))),C1D3)),-1))),C1DSqrt3)),Power(Times(Rt(b,C3),d),-1)),x),Simp(Times(f,Log(Plus(c,Times(d,x))),Power(Times(Rt(b,C3),d),-1)),x),Negate(Simp(Times(C3,f,Log(Plus(Times(Rt(b,C3),Plus(Times(C2,c),Times(d,x))),Times(CN1,d,Power(Plus(a,Times(b,Power(x,3))),C1D3)))),Power(Times(C2,Rt(b,C3),d),-1)),x))),And(FreeQ(List(a,b,c,d,e,f),x),EqQ(Plus(Times(d,e),Times(c,f)),C0),EqQ(Plus(Times(C2,b,Power(c,3)),Times(CN1,a,Power(d,3))),C0)))),
IIntegrate(6224,Int(Times(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),Power(Times(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),Power(Plus(a_,Times(b_DEFAULT,Power(x_,3))),C1D3)),-1)),x_Symbol),
    Condition(Plus(Dist(Times(f,Power(d,-1)),Int(Power(Plus(a,Times(b,Power(x,3))),CN1D3),x),x),Dist(Times(Plus(Times(d,e),Times(CN1,c,f)),Power(d,-1)),Int(Power(Times(Plus(c,Times(d,x)),Power(Plus(a,Times(b,Power(x,3))),C1D3)),-1),x),x)),FreeQ(List(a,b,c,d,e,f),x))),
IIntegrate(6225,Int(Times(Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_DEFAULT))),q_),Power(Plus(a_,Times(b_DEFAULT,Power(x_,$p("nn",true)))),p_)),x_Symbol),
    Condition(Int(ExpandIntegrand(Power(Plus(a,Times(b,Power(x,$s("nn")))),p),Power(Plus(Times(c,Power(Plus(Sqr(c),Times(CN1,Sqr(d),Power(x,Times(C2,n)))),-1)),Times(CN1,d,Power(x,n),Power(Plus(Sqr(c),Times(CN1,Sqr(d),Power(x,Times(C2,n)))),-1))),Negate(q)),x),x),And(FreeQ(List(a,b,c,d,n,$s("nn"),p),x),Not(IntegerQ(p)),ILtQ(q,C0),IGtQ(Log(C2,Times($s("nn"),Power(n,-1))),C0)))),
IIntegrate(6226,Int(Times(Power(Times(e_DEFAULT,x_),m_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_DEFAULT))),q_),Power(Plus(a_,Times(b_DEFAULT,Power(x_,$p("nn",true)))),p_)),x_Symbol),
    Condition(Dist(Times(Power(Times(e,x),m),Power(Power(x,m),-1)),Int(ExpandIntegrand(Times(Power(x,m),Power(Plus(a,Times(b,Power(x,$s("nn")))),p)),Power(Plus(Times(c,Power(Plus(Sqr(c),Times(CN1,Sqr(d),Power(x,Times(C2,n)))),-1)),Times(CN1,d,Power(x,n),Power(Plus(Sqr(c),Times(CN1,Sqr(d),Power(x,Times(C2,n)))),-1))),Negate(q)),x),x),x),And(FreeQ(List(a,b,c,d,e,m,n,$s("nn"),p),x),Not(IntegerQ(p)),ILtQ(q,C0),IGtQ(Log(C2,Times($s("nn"),Power(n,-1))),C0)))),
IIntegrate(6227,Int(Times(Power(x_,m_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_)),Times(e_DEFAULT,Sqrt(Plus(a_,Times(b_DEFAULT,Power(x_,n_)))))),-1)),x_Symbol),
    Condition(Dist(Power(n,-1),Subst(Int(Times(Power(x,Plus(Times(Plus(m,C1),Power(n,-1)),Negate(C1))),Power(Plus(c,Times(d,x),Times(e,Sqrt(Plus(a,Times(b,x))))),-1)),x),x,Power(x,n)),x),And(FreeQ(List(a,b,c,d,e,m,n),x),EqQ(Plus(Times(b,c),Times(CN1,a,d)),C0),IntegerQ(Times(Plus(m,C1),Power(n,-1)))))),
IIntegrate(6228,Int(Times(u_DEFAULT,Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_)),Times(e_DEFAULT,Sqrt(Plus(a_,Times(b_DEFAULT,Power(x_,n_)))))),-1)),x_Symbol),
    Condition(Plus(Dist(c,Int(Times(u,Power(Plus(Sqr(c),Times(CN1,a,Sqr(e)),Times(c,d,Power(x,n))),-1)),x),x),Negate(Dist(Times(a,e),Int(Times(u,Power(Times(Plus(Sqr(c),Times(CN1,a,Sqr(e)),Times(c,d,Power(x,n))),Sqrt(Plus(a,Times(b,Power(x,n))))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,n),x),EqQ(Plus(Times(b,c),Times(CN1,a,d)),C0)))),
IIntegrate(6229,Int(Power(u_,m_DEFAULT),x_Symbol),
    Condition(With(List(Set(c,Simplify(D(u,x)))),Dist(Power(c,-1),Subst(Int(Power(x,m),x),x,u),x)),And(FreeQ(m,x),PiecewiseLinearQ(u,x)))),
IIntegrate(6230,Int(Times(Power(u_,-1),v_),x_Symbol),
    Condition(With(List(Set(a,Simplify(D(u,x))),Set(b,Simplify(D(v,x)))),Condition(Plus(Simp(Times(b,x,Power(a,-1)),x),Negate(Dist(Times(Plus(Times(b,u),Times(CN1,a,v)),Power(a,-1)),Int(Power(u,-1),x),x))),NeQ(Plus(Times(b,u),Times(CN1,a,v)),C0))),PiecewiseLinearQ(u,v,x))),
IIntegrate(6231,Int(Times(Power(u_,-1),Power(v_,n_)),x_Symbol),
    Condition(With(List(Set(a,Simplify(D(u,x))),Set(b,Simplify(D(v,x)))),Condition(Plus(Simp(Times(Power(v,n),Power(Times(a,n),-1)),x),Negate(Dist(Times(Plus(Times(b,u),Times(CN1,a,v)),Power(a,-1)),Int(Times(Power(v,Plus(n,Negate(C1))),Power(u,-1)),x),x))),NeQ(Plus(Times(b,u),Times(CN1,a,v)),C0))),And(PiecewiseLinearQ(u,v,x),GtQ(n,C0),NeQ(n,C1)))),
IIntegrate(6232,Int(Power(Times(u_,v_),-1),x_Symbol),
    Condition(With(List(Set(a,Simplify(D(u,x))),Set(b,Simplify(D(v,x)))),Condition(Plus(Dist(Times(b,Power(Plus(Times(b,u),Times(CN1,a,v)),-1)),Int(Power(v,-1),x),x),Negate(Dist(Times(a,Power(Plus(Times(b,u),Times(CN1,a,v)),-1)),Int(Power(u,-1),x),x))),NeQ(Plus(Times(b,u),Times(CN1,a,v)),C0))),PiecewiseLinearQ(u,v,x))),
IIntegrate(6233,Int(Power(Times(u_,Sqrt(v_)),-1),x_Symbol),
    Condition(With(List(Set(a,Simplify(D(u,x))),Set(b,Simplify(D(v,x)))),Condition(Simp(Times(C2,ArcTan(Times(Sqrt(v),Power(Rt(Times(Plus(Times(b,u),Times(CN1,a,v)),Power(a,-1)),C2),-1))),Power(Times(a,Rt(Times(Plus(Times(b,u),Times(CN1,a,v)),Power(a,-1)),C2)),-1)),x),And(NeQ(Plus(Times(b,u),Times(CN1,a,v)),C0),PosQ(Times(Plus(Times(b,u),Times(CN1,a,v)),Power(a,-1)))))),PiecewiseLinearQ(u,v,x))),
IIntegrate(6234,Int(Power(Times(u_,Sqrt(v_)),-1),x_Symbol),
    Condition(With(List(Set(a,Simplify(D(u,x))),Set(b,Simplify(D(v,x)))),Condition(Simp(Times(CN2,ArcTanh(Times(Sqrt(v),Power(Rt(Times(CN1,Plus(Times(b,u),Times(CN1,a,v)),Power(a,-1)),C2),-1))),Power(Times(a,Rt(Times(CN1,Plus(Times(b,u),Times(CN1,a,v)),Power(a,-1)),C2)),-1)),x),And(NeQ(Plus(Times(b,u),Times(CN1,a,v)),C0),NegQ(Times(Plus(Times(b,u),Times(CN1,a,v)),Power(a,-1)))))),PiecewiseLinearQ(u,v,x))),
IIntegrate(6235,Int(Times(Power(u_,-1),Power(v_,n_)),x_Symbol),
    Condition(With(List(Set(a,Simplify(D(u,x))),Set(b,Simplify(D(v,x)))),Condition(Plus(Simp(Times(Power(v,Plus(n,C1)),Power(Times(Plus(n,C1),Plus(Times(b,u),Times(CN1,a,v))),-1)),x),Negate(Dist(Times(a,Plus(n,C1),Power(Times(Plus(n,C1),Plus(Times(b,u),Times(CN1,a,v))),-1)),Int(Times(Power(v,Plus(n,C1)),Power(u,-1)),x),x))),NeQ(Plus(Times(b,u),Times(CN1,a,v)),C0))),And(PiecewiseLinearQ(u,v,x),LtQ(n,CN1)))),
IIntegrate(6236,Int(Times(Power(u_,-1),Power(v_,n_)),x_Symbol),
    Condition(With(List(Set(a,Simplify(D(u,x))),Set(b,Simplify(D(v,x)))),Condition(Simp(Times(Power(v,Plus(n,C1)),Hypergeometric2F1(C1,Plus(n,C1),Plus(n,C2),Times(CN1,a,v,Power(Plus(Times(b,u),Times(CN1,a,v)),-1))),Power(Times(Plus(n,C1),Plus(Times(b,u),Times(CN1,a,v))),-1)),x),NeQ(Plus(Times(b,u),Times(CN1,a,v)),C0))),And(PiecewiseLinearQ(u,v,x),Not(IntegerQ(n))))),
IIntegrate(6237,Int(Power(Times(Sqrt(u_),Sqrt(v_)),-1),x_Symbol),
    Condition(With(List(Set(a,Simplify(D(u,x))),Set(b,Simplify(D(v,x)))),Condition(Simp(Times(C2,ArcTanh(Times(Rt(Times(a,b),C2),Sqrt(u),Power(Times(a,Sqrt(v)),-1))),Power(Rt(Times(a,b),C2),-1)),x),And(NeQ(Plus(Times(b,u),Times(CN1,a,v)),C0),PosQ(Times(a,b))))),PiecewiseLinearQ(u,v,x))),
IIntegrate(6238,Int(Power(Times(Sqrt(u_),Sqrt(v_)),-1),x_Symbol),
    Condition(With(List(Set(a,Simplify(D(u,x))),Set(b,Simplify(D(v,x)))),Condition(Simp(Times(C2,ArcTan(Times(Rt(Times(CN1,a,b),C2),Sqrt(u),Power(Times(a,Sqrt(v)),-1))),Power(Rt(Times(CN1,a,b),C2),-1)),x),And(NeQ(Plus(Times(b,u),Times(CN1,a,v)),C0),NegQ(Times(a,b))))),PiecewiseLinearQ(u,v,x))),
IIntegrate(6239,Int(Times(Power(u_,m_),Power(v_,n_)),x_Symbol),
    Condition(With(List(Set(a,Simplify(D(u,x))),Set(b,Simplify(D(v,x)))),Condition(Negate(Simp(Times(Power(u,Plus(m,C1)),Power(v,Plus(n,C1)),Power(Times(Plus(m,C1),Plus(Times(b,u),Times(CN1,a,v))),-1)),x)),NeQ(Plus(Times(b,u),Times(CN1,a,v)),C0))),And(FreeQ(List(m,n),x),PiecewiseLinearQ(u,v,x),EqQ(Plus(m,n,C2),C0),NeQ(m,CN1)))),
IIntegrate(6240,Int(Times(Power(u_,m_),Power(v_,n_DEFAULT)),x_Symbol),
    Condition(With(List(Set(a,Simplify(D(u,x))),Set(b,Simplify(D(v,x)))),Condition(Plus(Simp(Times(Power(u,Plus(m,C1)),Power(v,n),Power(Times(a,Plus(m,C1)),-1)),x),Negate(Dist(Times(b,n,Power(Times(a,Plus(m,C1)),-1)),Int(Times(Power(u,Plus(m,C1)),Power(v,Plus(n,Negate(C1)))),x),x))),NeQ(Plus(Times(b,u),Times(CN1,a,v)),C0))),And(FreeQ(List(m,n),x),PiecewiseLinearQ(u,v,x),NeQ(m,CN1),Or(And(LtQ(m,CN1),GtQ(n,C0),Not(And(ILtQ(Plus(m,n),CN2),Or(FractionQ(m),GeQ(Plus(Times(C2,n),m,C1),C0))))),And(IGtQ(n,C0),IGtQ(m,C0),LeQ(n,m)),And(IGtQ(n,C0),Not(IntegerQ(m))),And(ILtQ(m,C0),Not(IntegerQ(n))))))),
IIntegrate(6241,Int(Times(Power(u_,m_),Power(v_,n_DEFAULT)),x_Symbol),
    Condition(With(List(Set(a,Simplify(D(u,x))),Set(b,Simplify(D(v,x)))),Condition(Plus(Simp(Times(Power(u,Plus(m,C1)),Power(v,n),Power(Times(a,Plus(m,n,C1)),-1)),x),Negate(Dist(Times(n,Plus(Times(b,u),Times(CN1,a,v)),Power(Times(a,Plus(m,n,C1)),-1)),Int(Times(Power(u,m),Power(v,Plus(n,Negate(C1)))),x),x))),NeQ(Plus(Times(b,u),Times(CN1,a,v)),C0))),And(PiecewiseLinearQ(u,v,x),NeQ(Plus(m,n,C2),C0),GtQ(n,C0),NeQ(Plus(m,n,C1),C0),Not(And(IGtQ(m,C0),Or(Not(IntegerQ(n)),LtQ(C0,m,n)))),Not(ILtQ(Plus(m,n),CN2))))),
IIntegrate(6242,Int(Times(Power(u_,m_),Power(v_,n_)),x_Symbol),
    Condition(With(List(Set(a,Simplify(D(u,x))),Set(b,Simplify(D(v,x)))),Condition(Plus(Simp(Times(Power(u,Plus(m,C1)),Power(v,n),Power(Times(a,Plus(m,n,C1)),-1)),x),Negate(Dist(Times(n,Plus(Times(b,u),Times(CN1,a,v)),Power(Times(a,Plus(m,n,C1)),-1)),Int(Times(Power(u,m),Power(v,Simplify(Plus(n,Negate(C1))))),x),x))),NeQ(Plus(Times(b,u),Times(CN1,a,v)),C0))),And(PiecewiseLinearQ(u,v,x),NeQ(Plus(m,n,C1),C0),Not(RationalQ(n)),SumSimplerQ(n,CN1)))),
IIntegrate(6243,Int(Times(Power(u_,m_),Power(v_,n_)),x_Symbol),
    Condition(With(List(Set(a,Simplify(D(u,x))),Set(b,Simplify(D(v,x)))),Condition(Plus(Negate(Simp(Times(Power(u,Plus(m,C1)),Power(v,Plus(n,C1)),Power(Times(Plus(m,C1),Plus(Times(b,u),Times(CN1,a,v))),-1)),x)),Dist(Times(b,Plus(m,n,C2),Power(Times(Plus(m,C1),Plus(Times(b,u),Times(CN1,a,v))),-1)),Int(Times(Power(u,Plus(m,C1)),Power(v,n)),x),x)),NeQ(Plus(Times(b,u),Times(CN1,a,v)),C0))),And(PiecewiseLinearQ(u,v,x),NeQ(Plus(m,n,C2),C0),LtQ(m,CN1)))),
IIntegrate(6244,Int(Times(Power(u_,m_),Power(v_,n_)),x_Symbol),
    Condition(With(List(Set(a,Simplify(D(u,x))),Set(b,Simplify(D(v,x)))),Condition(Plus(Negate(Simp(Times(Power(u,Plus(m,C1)),Power(v,Plus(n,C1)),Power(Times(Plus(m,C1),Plus(Times(b,u),Times(CN1,a,v))),-1)),x)),Dist(Times(b,Plus(m,n,C2),Power(Times(Plus(m,C1),Plus(Times(b,u),Times(CN1,a,v))),-1)),Int(Times(Power(u,Simplify(Plus(m,C1))),Power(v,n)),x),x)),NeQ(Plus(Times(b,u),Times(CN1,a,v)),C0))),And(PiecewiseLinearQ(u,v,x),Not(RationalQ(m)),SumSimplerQ(m,C1)))),
IIntegrate(6245,Int(Times(Power(u_,m_),Power(v_,n_)),x_Symbol),
    Condition(With(List(Set(a,Simplify(D(u,x))),Set(b,Simplify(D(v,x)))),Condition(Simp(Times(Power(u,m),Power(v,Plus(n,C1)),Hypergeometric2F1(Negate(m),Plus(n,C1),Plus(n,C2),Times(CN1,a,v,Power(Plus(Times(b,u),Times(CN1,a,v)),-1))),Power(Times(b,Plus(n,C1),Power(Times(b,u,Power(Plus(Times(b,u),Times(CN1,a,v)),-1)),m)),-1)),x),NeQ(Plus(Times(b,u),Times(CN1,a,v)),C0))),And(PiecewiseLinearQ(u,v,x),Not(IntegerQ(m)),Not(IntegerQ(n))))),
IIntegrate(6246,Int(Times(Power(u_,n_DEFAULT),Log(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(With(List(Set(c,Simplify(D(u,x)))),Plus(Simp(Times(Power(u,n),Plus(a,Times(b,x)),Log(Plus(a,Times(b,x))),Power(b,-1)),x),Negate(Dist(Times(c,n,Power(b,-1)),Int(Times(Power(u,Plus(n,Negate(C1))),Plus(a,Times(b,x)),Log(Plus(a,Times(b,x)))),x),x)),Negate(Int(Power(u,n),x)))),And(FreeQ(List(a,b),x),PiecewiseLinearQ(u,x),Not(LinearQ(u,x)),GtQ(n,C0)))),
IIntegrate(6247,Int(Times(Power(u_,n_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),m_DEFAULT),Log(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(With(List(Set(c,Simplify(D(u,x)))),Plus(Simp(Times(Power(u,n),Power(Plus(a,Times(b,x)),Plus(m,C1)),Log(Plus(a,Times(b,x))),Power(Times(b,Plus(m,C1)),-1)),x),Negate(Dist(Power(Plus(m,C1),-1),Int(Times(Power(u,n),Power(Plus(a,Times(b,x)),m)),x),x)),Negate(Dist(Times(c,n,Power(Times(b,Plus(m,C1)),-1)),Int(Times(Power(u,Plus(n,Negate(C1))),Power(Plus(a,Times(b,x)),Plus(m,C1)),Log(Plus(a,Times(b,x)))),x),x)))),And(FreeQ(List(a,b,m),x),PiecewiseLinearQ(u,x),Not(LinearQ(u,x)),GtQ(n,C0),NeQ(m,CN1)))),
IIntegrate(6248,Int(Times(Power(Times(b_DEFAULT,Power(F_,Times(g_DEFAULT,Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(c,Times(d,x)),m),Power(Times(b,Power(FSymbol,Times(g,Plus(e,Times(f,x))))),n),Power(Times(f,g,n,Log(FSymbol)),-1)),x),Negate(Dist(Times(d,m,Power(Times(f,g,n,Log(FSymbol)),-1)),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,Negate(C1))),Power(Times(b,Power(FSymbol,Times(g,Plus(e,Times(f,x))))),n)),x),x))),And(FreeQ(List(FSymbol,b,c,d,e,f,g,n),x),GtQ(m,C0),IntegerQ(Times(C2,m)),Not(SameQ(False,True))))),
IIntegrate(6249,Int(Times(Power(Times(b_DEFAULT,Power(F_,Times(g_DEFAULT,Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(c,Times(d,x)),Plus(m,C1)),Power(Times(b,Power(FSymbol,Times(g,Plus(e,Times(f,x))))),n),Power(Times(d,Plus(m,C1)),-1)),x),Negate(Dist(Times(f,g,n,Log(FSymbol),Power(Times(d,Plus(m,C1)),-1)),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,C1)),Power(Times(b,Power(FSymbol,Times(g,Plus(e,Times(f,x))))),n)),x),x))),And(FreeQ(List(FSymbol,b,c,d,e,f,g,n),x),LtQ(m,CN1),IntegerQ(Times(C2,m)),Not(SameQ(False,True))))),
IIntegrate(6250,Int(Times(Power(F_,Times(g_DEFAULT,Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),-1)),x_Symbol),
    Condition(Simp(Times(Power(FSymbol,Times(g,Plus(e,Times(CN1,c,f,Power(d,-1))))),ExpIntegralEi(Times(f,g,Plus(c,Times(d,x)),Log(FSymbol),Power(d,-1))),Power(d,-1)),x),And(FreeQ(List(FSymbol,c,d,e,f,g),x),Not(SameQ(False,True))))),
IIntegrate(6251,Int(Times(Power(F_,Times(g_DEFAULT,Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Simp(Times(Power(Negate(d),m),Power(FSymbol,Times(g,Plus(e,Times(CN1,c,f,Power(d,-1))))),Gamma(Plus(m,C1),Times(CN1,f,g,Log(FSymbol),Plus(c,Times(d,x)),Power(d,-1))),Power(Times(Power(f,Plus(m,C1)),Power(g,Plus(m,C1)),Power(Log(FSymbol),Plus(m,C1))),-1)),x),And(FreeQ(List(FSymbol,c,d,e,f,g),x),IntegerQ(m)))),
IIntegrate(6252,Int(Times(Power(F_,Times(g_DEFAULT,Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),CN1D2)),x_Symbol),
    Condition(Dist(Times(C2,Power(d,-1)),Subst(Int(Power(FSymbol,Plus(Times(g,Plus(e,Times(CN1,c,f,Power(d,-1)))),Times(f,g,Sqr(x),Power(d,-1)))),x),x,Sqrt(Plus(c,Times(d,x)))),x),And(FreeQ(List(FSymbol,c,d,e,f,g),x),Not(SameQ(False,True))))),
IIntegrate(6253,Int(Times(Power(F_,Times(g_DEFAULT,Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_)),x_Symbol),
    Condition(Negate(Simp(Times(Power(FSymbol,Times(g,Plus(e,Times(CN1,c,f,Power(d,-1))))),Power(Plus(c,Times(d,x)),FracPart(m)),Gamma(Plus(m,C1),Times(CN1,f,g,Log(FSymbol),Power(d,-1),Plus(c,Times(d,x)))),Power(Times(d,Power(Times(CN1,f,g,Log(FSymbol),Power(d,-1)),Plus(IntPart(m),C1)),Power(Times(CN1,f,g,Log(FSymbol),Plus(c,Times(d,x)),Power(d,-1)),FracPart(m))),-1)),x)),And(FreeQ(List(FSymbol,c,d,e,f,g,m),x),Not(IntegerQ(m))))),
IIntegrate(6254,Int(Times(Power(Times(b_DEFAULT,Power(F_,Times(g_DEFAULT,Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(Times(b,Power(FSymbol,Times(g,Plus(e,Times(f,x))))),n),Power(Power(FSymbol,Times(g,n,Plus(e,Times(f,x)))),-1)),Int(Times(Power(Plus(c,Times(d,x)),m),Power(FSymbol,Times(g,n,Plus(e,Times(f,x))))),x),x),FreeQ(List(FSymbol,b,c,d,e,f,g,m,n),x))),
IIntegrate(6255,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(Power(F_,Times(g_DEFAULT,Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_DEFAULT))),p_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Power(Plus(c,Times(d,x)),m),Power(Plus(a,Times(b,Power(Power(FSymbol,Times(g,Plus(e,Times(f,x)))),n))),p),x),x),And(FreeQ(List(FSymbol,a,b,c,d,e,f,g,m,n),x),IGtQ(p,C0)))),
IIntegrate(6256,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(Power(F_,Times(g_DEFAULT,Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_DEFAULT))),-1),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(c,Times(d,x)),Plus(m,C1)),Power(Times(a,d,Plus(m,C1)),-1)),x),Negate(Dist(Times(b,Power(a,-1)),Int(Times(Power(Plus(c,Times(d,x)),m),Power(Power(FSymbol,Times(g,Plus(e,Times(f,x)))),n),Power(Plus(a,Times(b,Power(Power(FSymbol,Times(g,Plus(e,Times(f,x)))),n))),-1)),x),x))),And(FreeQ(List(FSymbol,a,b,c,d,e,f,g,n),x),IGtQ(m,C0)))),
IIntegrate(6257,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(Power(F_,Times(g_DEFAULT,Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_DEFAULT))),p_),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Dist(Power(a,-1),Int(Times(Power(Plus(c,Times(d,x)),m),Power(Plus(a,Times(b,Power(Power(FSymbol,Times(g,Plus(e,Times(f,x)))),n))),Plus(p,C1))),x),x),Negate(Dist(Times(b,Power(a,-1)),Int(Times(Power(Plus(c,Times(d,x)),m),Power(Power(FSymbol,Times(g,Plus(e,Times(f,x)))),n),Power(Plus(a,Times(b,Power(Power(FSymbol,Times(g,Plus(e,Times(f,x)))),n))),p)),x),x))),And(FreeQ(List(FSymbol,a,b,c,d,e,f,g,n),x),ILtQ(p,C0),IGtQ(m,C0)))),
IIntegrate(6258,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(Power(F_,Times(g_DEFAULT,Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_DEFAULT))),p_),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Power(Plus(a,Times(b,Power(Power(FSymbol,Times(g,Plus(e,Times(f,x)))),n))),p),x))),Plus(Dist(Power(Plus(c,Times(d,x)),m),u,x),Negate(Dist(Times(d,m),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,Negate(C1))),u),x),x)))),And(FreeQ(List(FSymbol,a,b,c,d,e,f,g,n),x),IGtQ(m,C0),LtQ(p,CN1)))),
IIntegrate(6259,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(Power(F_,Times(g_DEFAULT,v_)),n_DEFAULT))),p_DEFAULT),Power(u_,m_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(NormalizePowerOfLinear(u,x),m),Power(Plus(a,Times(b,Power(Power(FSymbol,Times(g,ExpandToSum(v,x))),n))),p)),x),And(FreeQ(List(FSymbol,a,b,g,n,p),x),LinearQ(v,x),PowerOfLinearQ(u,x),Not(And(LinearMatchQ(v,x),PowerOfLinearMatchQ(u,x))),IntegerQ(m)))),
IIntegrate(6260,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(Power(F_,Times(g_DEFAULT,v_)),n_DEFAULT))),p_DEFAULT),Power(u_,m_DEFAULT)),x_Symbol),
    Condition(Module(List(Set($s("uu"),NormalizePowerOfLinear(u,x)),z),Simp(CompoundExpression(Set(z,If(And(PowerQ($s("uu")),FreeQ(Part($s("uu"),C2),x)),Power(Part($s("uu"),C1),Times(m,Part($s("uu"),C2))),Power($s("uu"),m))),Times(Power($s("uu"),m),Int(Times(z,Power(Plus(a,Times(b,Power(Power(FSymbol,Times(g,ExpandToSum(v,x))),n))),p)),x),Power(z,-1))),x)),And(FreeQ(List(FSymbol,a,b,g,m,n,p),x),LinearQ(v,x),PowerOfLinearQ(u,x),Not(And(LinearMatchQ(v,x),PowerOfLinearMatchQ(u,x))),Not(IntegerQ(m))))),
IIntegrate(6261,Int(Times(Power(Power(F_,Times(g_DEFAULT,Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(Power(F_,Times(g_DEFAULT,Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_DEFAULT))),-1),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(c,Times(d,x)),m),Log(Plus(C1,Times(b,Power(Power(FSymbol,Times(g,Plus(e,Times(f,x)))),n),Power(a,-1)))),Power(Times(b,f,g,n,Log(FSymbol)),-1)),x),Negate(Dist(Times(d,m,Power(Times(b,f,g,n,Log(FSymbol)),-1)),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,Negate(C1))),Log(Plus(C1,Times(b,Power(Power(FSymbol,Times(g,Plus(e,Times(f,x)))),n),Power(a,-1))))),x),x))),And(FreeQ(List(FSymbol,a,b,c,d,e,f,g,n),x),IGtQ(m,C0)))),
IIntegrate(6262,Int(Times(Power(Power(F_,Times(g_DEFAULT,Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(Power(F_,Times(g_DEFAULT,Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_DEFAULT))),p_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(c,Times(d,x)),m),Power(Plus(a,Times(b,Power(Power(FSymbol,Times(g,Plus(e,Times(f,x)))),n))),Plus(p,C1)),Power(Times(b,f,g,n,Plus(p,C1),Log(FSymbol)),-1)),x),Negate(Dist(Times(d,m,Power(Times(b,f,g,n,Plus(p,C1),Log(FSymbol)),-1)),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,Negate(C1))),Power(Plus(a,Times(b,Power(Power(FSymbol,Times(g,Plus(e,Times(f,x)))),n))),Plus(p,C1))),x),x))),And(FreeQ(List(FSymbol,a,b,c,d,e,f,g,m,n,p),x),NeQ(p,CN1)))),
IIntegrate(6263,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(Power(F_,Times(g_DEFAULT,Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_DEFAULT))),p_DEFAULT),Power(Times(Power(G_,Times(j_DEFAULT,Plus(h_DEFAULT,Times(i_DEFAULT,x_)))),k_DEFAULT),q_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(Times(k,Power(GSymbol,Times(j,Plus(h,Times(i,x))))),q),Power(Power(Power(FSymbol,Times(g,Plus(e,Times(f,x)))),n),-1)),Int(Times(Power(Plus(c,Times(d,x)),m),Power(Power(FSymbol,Times(g,Plus(e,Times(f,x)))),n),Power(Plus(a,Times(b,Power(Power(FSymbol,Times(g,Plus(e,Times(f,x)))),n))),p)),x),x),And(FreeQ(List(FSymbol,a,b,c,d,e,f,g,h,i,j,k,m,n,p,q),x),EqQ(Plus(Times(f,g,n,Log(FSymbol)),Times(CN1,i,j,q,Log(GSymbol))),C0),NeQ(Plus(Power(Times(k,Power(GSymbol,Times(j,Plus(h,Times(i,x))))),q),Negate(Power(Power(FSymbol,Times(g,Plus(e,Times(f,x)))),n))),C0)))),
IIntegrate(6264,Int(Power(Power(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_DEFAULT),x_Symbol),
    Condition(Simp(Times(Power(Power(FSymbol,Times(c,Plus(a,Times(b,x)))),n),Power(Times(b,c,n,Log(FSymbol)),-1)),x),FreeQ(List(FSymbol,a,b,c,n),x))),
IIntegrate(6265,Int(Times(Power(F_,Times(c_DEFAULT,v_)),u_),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(u,Power(FSymbol,Times(c,ExpandToSum(v,x)))),x),x),And(FreeQ(List(FSymbol,c),x),PolynomialQ(u,x),LinearQ(v,x),SameQ(False,True)))),
IIntegrate(6266,Int(Times(Power(F_,Times(c_DEFAULT,v_)),u_),x_Symbol),
    Condition(Int(ExpandIntegrand(Power(FSymbol,Times(c,ExpandToSum(v,x))),u,x),x),And(FreeQ(List(FSymbol,c),x),PolynomialQ(u,x),LinearQ(v,x),Not(SameQ(False,True))))),
IIntegrate(6267,Int(Times(Power(F_,Times(c_DEFAULT,v_)),Power(u_,m_DEFAULT),w_),x_Symbol),
    Condition(With(List(Set(b,Coefficient(v,x,C1)),Set(d,Coefficient(u,x,C0)),Set(e,Coefficient(u,x,C1)),Set(f,Coefficient(w,x,C0)),Set(g,Coefficient(w,x,C1))),Condition(Simp(Times(g,Power(u,Plus(m,C1)),Power(FSymbol,Times(c,v)),Power(Times(b,c,e,Log(FSymbol)),-1)),x),EqQ(Plus(Times(e,g,Plus(m,C1)),Times(CN1,b,c,Plus(Times(e,f),Times(CN1,d,g)),Log(FSymbol))),C0))),And(FreeQ(List(FSymbol,c,m),x),LinearQ(List(u,v,w),x)))),
IIntegrate(6268,Int(Times(Power(F_,Times(c_DEFAULT,v_)),Power(u_,m_DEFAULT),w_),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(w,Power(NormalizePowerOfLinear(u,x),m),Power(FSymbol,Times(c,ExpandToSum(v,x)))),x),x),And(FreeQ(List(FSymbol,c),x),PolynomialQ(w,x),LinearQ(v,x),PowerOfLinearQ(u,x),IntegerQ(m),SameQ(False,True)))),
IIntegrate(6269,Int(Times(Power(F_,Times(c_DEFAULT,v_)),Power(u_,m_DEFAULT),w_),x_Symbol),
    Condition(Int(ExpandIntegrand(Power(FSymbol,Times(c,ExpandToSum(v,x))),Times(w,Power(NormalizePowerOfLinear(u,x),m)),x),x),And(FreeQ(List(FSymbol,c),x),PolynomialQ(w,x),LinearQ(v,x),PowerOfLinearQ(u,x),IntegerQ(m),Not(SameQ(False,True))))),
IIntegrate(6270,Int(Times(Power(F_,Times(c_DEFAULT,v_)),Power(u_,m_DEFAULT),w_),x_Symbol),
    Condition(Module(List(Set($s("uu"),NormalizePowerOfLinear(u,x)),z),Simp(CompoundExpression(Set(z,If(And(PowerQ($s("uu")),FreeQ(Part($s("uu"),C2),x)),Power(Part($s("uu"),C1),Times(m,Part($s("uu"),C2))),Power($s("uu"),m))),Times(Power($s("uu"),m),Int(ExpandIntegrand(Times(w,z,Power(FSymbol,Times(c,ExpandToSum(v,x)))),x),x),Power(z,-1))),x)),And(FreeQ(List(FSymbol,c,m),x),PolynomialQ(w,x),LinearQ(v,x),PowerOfLinearQ(u,x),Not(IntegerQ(m)))))
  );
}
