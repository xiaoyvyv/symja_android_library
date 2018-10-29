package org.matheclipse.core.integrate.rubi;


import org.matheclipse.core.interfaces.IAST;

import static org.matheclipse.core.expression.F.$;
import static org.matheclipse.core.expression.F.$s;
import static org.matheclipse.core.expression.F.And;
import static org.matheclipse.core.expression.F.ArcSin;
import static org.matheclipse.core.expression.F.C0;
import static org.matheclipse.core.expression.F.C1;
import static org.matheclipse.core.expression.F.C1D2;
import static org.matheclipse.core.expression.F.C2;
import static org.matheclipse.core.expression.F.CN1;
import static org.matheclipse.core.expression.F.CN1D2;
import static org.matheclipse.core.expression.F.CN2;
import static org.matheclipse.core.expression.F.CN4;
import static org.matheclipse.core.expression.F.CN8;
import static org.matheclipse.core.expression.F.Condition;
import static org.matheclipse.core.expression.F.Cos;
import static org.matheclipse.core.expression.F.Cot;
import static org.matheclipse.core.expression.F.Csc;
import static org.matheclipse.core.expression.F.EllipticPi;
import static org.matheclipse.core.expression.F.FreeQ;
import static org.matheclipse.core.expression.F.IIntegrate;
import static org.matheclipse.core.expression.F.IntegerQ;
import static org.matheclipse.core.expression.F.List;
import static org.matheclipse.core.expression.F.Negate;
import static org.matheclipse.core.expression.F.Not;
import static org.matheclipse.core.expression.F.Or;
import static org.matheclipse.core.expression.F.Plus;
import static org.matheclipse.core.expression.F.Power;
import static org.matheclipse.core.expression.F.QQ;
import static org.matheclipse.core.expression.F.Sec;
import static org.matheclipse.core.expression.F.Simplify;
import static org.matheclipse.core.expression.F.Sin;
import static org.matheclipse.core.expression.F.Sqr;
import static org.matheclipse.core.expression.F.Sqrt;
import static org.matheclipse.core.expression.F.Tan;
import static org.matheclipse.core.expression.F.Times;
import static org.matheclipse.core.expression.F.a;
import static org.matheclipse.core.expression.F.a_;
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
import static org.matheclipse.core.expression.F.m_;
import static org.matheclipse.core.expression.F.m_DEFAULT;
import static org.matheclipse.core.expression.F.n;
import static org.matheclipse.core.expression.F.n_;
import static org.matheclipse.core.expression.F.n_DEFAULT;
import static org.matheclipse.core.expression.F.p;
import static org.matheclipse.core.expression.F.p_;
import static org.matheclipse.core.expression.F.x;
import static org.matheclipse.core.expression.F.x_;
import static org.matheclipse.core.expression.F.x_Symbol;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Dist;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.EqQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.ExpandTrig;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.FracPart;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.GtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.IGtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.ILtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Int;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.IntPart;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.LeQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.LtQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.NeQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.RationalQ;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Rt;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Simp;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Subst;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.Unintegrable;

/** 
 * IndefiniteIntegrationRules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class IntRules78 { 
  public static IAST RULES = List( 
IIntegrate(3901,Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),n_DEFAULT),Power(Times(e_DEFAULT,Power($($s("§tan"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),p_)),m_)),x_Symbol),
    Condition(Dist(Times(Power(Times(e,Power(Tan(Plus(c,Times(d,x))),p)),m),Power(Power(Times(e,Tan(Plus(c,Times(d,x)))),Times(m,p)),-1)),Int(Times(Power(Times(e,Tan(Plus(c,Times(d,x)))),Times(m,p)),Power(Plus(a,Times(b,Sec(Plus(c,Times(d,x))))),n)),x),x),And(FreeQ(List(a,b,c,d,e,m,n,p),x),Not(IntegerQ(m))))),
IIntegrate(3902,Int(Times(Power(Times(Power($($s("§cot"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),p_),e_DEFAULT),m_),Power(Plus(Times($($s("§csc"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),b_DEFAULT),a_),n_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(Times(e,Power(Cot(Plus(c,Times(d,x))),p)),m),Power(Power(Times(e,Cot(Plus(c,Times(d,x)))),Times(m,p)),-1)),Int(Times(Power(Times(e,Cot(Plus(c,Times(d,x)))),Times(m,p)),Power(Plus(a,Times(b,Csc(Plus(c,Times(d,x))))),n)),x),x),And(FreeQ(List(a,b,c,d,e,m,n,p),x),Not(IntegerQ(m))))),
IIntegrate(3903,Int(Times(Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_DEFAULT),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),c_),n_)),x_Symbol),
    Condition(Dist(Power(c,n),Int(ExpandTrig(Power(Plus(C1,Times(d,$($s("§csc"),Plus(e,Times(f,x))),Power(c,-1))),n),Power(Plus(a,Times(b,$($s("§csc"),Plus(e,Times(f,x))))),m),x),x),x),And(FreeQ(List(a,b,c,d,e,f,n),x),EqQ(Plus(Times(b,c),Times(a,d)),C0),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),IGtQ(m,C0),ILtQ(n,C0),LtQ(Plus(m,n),C2)))),
IIntegrate(3904,Int(Times(Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_DEFAULT),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),c_),n_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Times(CN1,a,c),m),Int(Times(Power(Cot(Plus(e,Times(f,x))),Times(C2,m)),Power(Plus(c,Times(d,Csc(Plus(e,Times(f,x))))),Plus(n,Negate(m)))),x),x),And(FreeQ(List(a,b,c,d,e,f,n),x),EqQ(Plus(Times(b,c),Times(a,d)),C0),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),IntegerQ(m),RationalQ(n),Not(And(IntegerQ(n),GtQ(Plus(m,Negate(n)),C0)))))),
IIntegrate(3905,Int(Times(Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),c_),m_)),x_Symbol),
    Condition(Dist(Times(Power(Times(CN1,a,c),Plus(m,C1D2)),Cot(Plus(e,Times(f,x))),Power(Times(Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Sqrt(Plus(c,Times(d,Csc(Plus(e,Times(f,x))))))),-1)),Int(Power(Cot(Plus(e,Times(f,x))),Times(C2,m)),x),x),And(FreeQ(List(a,b,c,d,e,f,m),x),EqQ(Plus(Times(b,c),Times(a,d)),C0),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),IntegerQ(Plus(m,C1D2))))),
IIntegrate(3906,Int(Times(Sqrt(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_)),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),c_),n_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(C2,a,c,Cot(Plus(e,Times(f,x))),Power(Plus(c,Times(d,Csc(Plus(e,Times(f,x))))),Plus(n,Negate(C1))),Power(Times(f,Plus(Times(C2,n),Negate(C1)),Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))))),-1)),x),Dist(c,Int(Times(Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Power(Plus(c,Times(d,Csc(Plus(e,Times(f,x))))),Plus(n,Negate(C1)))),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),EqQ(Plus(Times(b,c),Times(a,d)),C0),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),GtQ(n,C1D2)))),
IIntegrate(3907,Int(Times(Sqrt(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_)),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),c_),n_)),x_Symbol),
    Condition(Plus(Simp(Times(CN2,a,Cot(Plus(e,Times(f,x))),Power(Plus(c,Times(d,Csc(Plus(e,Times(f,x))))),n),Power(Times(f,Plus(Times(C2,n),C1),Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))))),-1)),x),Dist(Power(c,-1),Int(Times(Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Power(Plus(c,Times(d,Csc(Plus(e,Times(f,x))))),Plus(n,C1))),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),EqQ(Plus(Times(b,c),Times(a,d)),C0),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),LtQ(n,Negate(Power(C2,-1)))))),
IIntegrate(3908,Int(Times(Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),QQ(3L,2L)),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),c_),n_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(CN4,Sqr(a),Cot(Plus(e,Times(f,x))),Power(Plus(c,Times(d,Csc(Plus(e,Times(f,x))))),n),Power(Times(f,Plus(Times(C2,n),C1),Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))))),-1)),x),Dist(Times(a,Power(c,-1)),Int(Times(Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Power(Plus(c,Times(d,Csc(Plus(e,Times(f,x))))),Plus(n,C1))),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),EqQ(Plus(Times(b,c),Times(a,d)),C0),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),LtQ(n,Negate(Power(C2,-1)))))),
IIntegrate(3909,Int(Times(Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),QQ(3L,2L)),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),c_),n_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(CN2,Sqr(a),Cot(Plus(e,Times(f,x))),Power(Plus(c,Times(d,Csc(Plus(e,Times(f,x))))),n),Power(Times(f,Plus(Times(C2,n),C1),Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))))),-1)),x),Dist(a,Int(Times(Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Power(Plus(c,Times(d,Csc(Plus(e,Times(f,x))))),n)),x),x)),And(FreeQ(List(a,b,c,d,e,f,n),x),EqQ(Plus(Times(b,c),Times(a,d)),C0),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),Not(LeQ(n,Negate(Power(C2,-1))))))),
IIntegrate(3910,Int(Times(Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),QQ(5L,2L)),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),c_),n_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(CN8,Power(a,3),Cot(Plus(e,Times(f,x))),Power(Plus(c,Times(d,Csc(Plus(e,Times(f,x))))),n),Power(Times(f,Plus(Times(C2,n),C1),Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))))),-1)),x),Dist(Times(Sqr(a),Power(c,-2)),Int(Times(Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Power(Plus(c,Times(d,Csc(Plus(e,Times(f,x))))),Plus(n,C2))),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),EqQ(Plus(Times(b,c),Times(a,d)),C0),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),LtQ(n,Negate(Power(C2,-1)))))),
IIntegrate(3911,Int(Times(Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),c_),n_)),x_Symbol),
    Condition(Negate(Dist(Times(a,c,Cot(Plus(e,Times(f,x))),Power(Times(f,Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Sqrt(Plus(c,Times(d,Csc(Plus(e,Times(f,x))))))),-1)),Subst(Int(Times(Power(Plus(b,Times(a,x)),Plus(m,Negate(C1D2))),Power(Plus(d,Times(c,x)),Plus(n,Negate(C1D2))),Power(Power(x,Plus(m,n)),-1)),x),x,Sin(Plus(e,Times(f,x)))),x)),And(FreeQ(List(a,b,c,d,e,f),x),EqQ(Plus(Times(b,c),Times(a,d)),C0),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),IntegerQ(Plus(m,Negate(C1D2))),EqQ(Plus(m,n),C0)))),
IIntegrate(3912,Int(Times(Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_DEFAULT),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),c_),n_DEFAULT)),x_Symbol),
    Condition(Dist(Times(a,c,Cot(Plus(e,Times(f,x))),Power(Times(f,Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Sqrt(Plus(c,Times(d,Csc(Plus(e,Times(f,x))))))),-1)),Subst(Int(Times(Power(Plus(a,Times(b,x)),Plus(m,Negate(C1D2))),Power(Plus(c,Times(d,x)),Plus(n,Negate(C1D2))),Power(x,-1)),x),x,Csc(Plus(e,Times(f,x)))),x),And(FreeQ(List(a,b,c,d,e,f,m,n),x),EqQ(Plus(Times(b,c),Times(a,d)),C0),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0)))),
IIntegrate(3913,Int(Times(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),c_)),x_Symbol),
    Condition(Plus(Simp(Times(a,c,x),x),Dist(Times(b,d),Int(Sqr(Csc(Plus(e,Times(f,x)))),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),EqQ(Plus(Times(b,c),Times(a,d)),C0)))),
IIntegrate(3914,Int(Times(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),c_)),x_Symbol),
    Condition(Plus(Simp(Times(a,c,x),x),Dist(Times(b,d),Int(Sqr(Csc(Plus(e,Times(f,x)))),x),x),Dist(Plus(Times(b,c),Times(a,d)),Int(Csc(Plus(e,Times(f,x))),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),NeQ(Plus(Times(b,c),Times(a,d)),C0)))),
IIntegrate(3915,Int(Times(Sqrt(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_)),Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),c_)),x_Symbol),
    Condition(Plus(Dist(c,Int(Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),x),x),Dist(d,Int(Times(Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Csc(Plus(e,Times(f,x)))),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0)))),
IIntegrate(3916,Int(Times(Sqrt(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_)),Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),c_)),x_Symbol),
    Condition(Plus(Dist(Times(a,c),Int(Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),CN1D2),x),x),Int(Times(Csc(Plus(e,Times(f,x))),Plus(Times(b,c),Times(a,d),Times(b,d,Csc(Plus(e,Times(f,x))))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),CN1D2)),x)),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0)))),
IIntegrate(3917,Int(Times(Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_),Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),c_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,d,Cot(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,Negate(C1))),Power(Times(f,m),-1)),x)),Dist(Power(m,-1),Int(Times(Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,Negate(C1))),Simp(Plus(Times(a,c,m),Times(Plus(Times(b,c,m),Times(a,d,Plus(Times(C2,m),Negate(C1)))),Csc(Plus(e,Times(f,x))))),x)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),GtQ(m,C1),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),IntegerQ(Times(C2,m))))),
IIntegrate(3918,Int(Times(Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_),Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),c_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,d,Cot(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,Negate(C1))),Power(Times(f,m),-1)),x)),Dist(Power(m,-1),Int(Times(Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,Negate(C2))),Simp(Plus(Times(Sqr(a),c,m),Times(Plus(Times(Sqr(b),d,Plus(m,Negate(C1))),Times(C2,a,b,c,m),Times(Sqr(a),d,m)),Csc(Plus(e,Times(f,x)))),Times(b,Plus(Times(b,c,m),Times(a,d,Plus(Times(C2,m),Negate(C1)))),Sqr(Csc(Plus(e,Times(f,x)))))),x)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),GtQ(m,C1),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),IntegerQ(Times(C2,m))))),
IIntegrate(3919,Int(Times(Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),-1),Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),c_)),x_Symbol),
    Condition(Plus(Simp(Times(c,x,Power(a,-1)),x),Negate(Dist(Times(Plus(Times(b,c),Times(CN1,a,d)),Power(a,-1)),Int(Times(Csc(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0)))),
IIntegrate(3920,Int(Times(Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),CN1D2),Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),c_)),x_Symbol),
    Condition(Plus(Dist(Times(c,Power(a,-1)),Int(Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),x),x),Negate(Dist(Times(Plus(Times(b,c),Times(CN1,a,d)),Power(a,-1)),Int(Times(Csc(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),CN1D2)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0)))),
IIntegrate(3921,Int(Times(Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),CN1D2),Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),c_)),x_Symbol),
    Condition(Plus(Dist(c,Int(Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),CN1D2),x),x),Dist(d,Int(Times(Csc(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),CN1D2)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0)))),
IIntegrate(3922,Int(Times(Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_),Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),c_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Plus(Times(b,c),Times(CN1,a,d)),Cot(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),m),Power(Times(b,f,Plus(Times(C2,m),C1)),-1)),x)),Dist(Power(Times(Sqr(a),Plus(Times(C2,m),C1)),-1),Int(Times(Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,C1)),Simp(Plus(Times(a,c,Plus(Times(C2,m),C1)),Times(CN1,Plus(Times(b,c),Times(CN1,a,d)),Plus(m,C1),Csc(Plus(e,Times(f,x))))),x)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),LtQ(m,CN1),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),IntegerQ(Times(C2,m))))),
IIntegrate(3923,Int(Times(Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_),Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),c_)),x_Symbol),
    Condition(Plus(Simp(Times(b,Plus(Times(b,c),Times(CN1,a,d)),Cot(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(a,f,Plus(m,C1),Plus(Sqr(a),Negate(Sqr(b)))),-1)),x),Dist(Power(Times(a,Plus(m,C1),Plus(Sqr(a),Negate(Sqr(b)))),-1),Int(Times(Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,C1)),Simp(Plus(Times(c,Plus(Sqr(a),Negate(Sqr(b))),Plus(m,C1)),Times(CN1,a,Plus(Times(b,c),Times(CN1,a,d)),Plus(m,C1),Csc(Plus(e,Times(f,x)))),Times(b,Plus(Times(b,c),Times(CN1,a,d)),Plus(m,C2),Sqr(Csc(Plus(e,Times(f,x)))))),x)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),LtQ(m,CN1),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),IntegerQ(Times(C2,m))))),
IIntegrate(3924,Int(Times(Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_),Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),c_)),x_Symbol),
    Condition(Plus(Dist(c,Int(Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),m),x),x),Dist(d,Int(Times(Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),m),Csc(Plus(e,Times(f,x)))),x),x)),And(FreeQ(List(a,b,c,d,e,f,m),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),Not(IntegerQ(Times(C2,m)))))),
IIntegrate(3925,Int(Times(Sqrt(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_)),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),c_),-1)),x_Symbol),
    Condition(Plus(Dist(Power(c,-1),Int(Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),x),x),Negate(Dist(Times(d,Power(c,-1)),Int(Times(Csc(Plus(e,Times(f,x))),Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Power(Plus(c,Times(d,Csc(Plus(e,Times(f,x))))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),Or(EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),EqQ(Plus(Sqr(c),Negate(Sqr(d))),C0))))),
IIntegrate(3926,Int(Times(Sqrt(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_)),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),c_),-1)),x_Symbol),
    Condition(Plus(Dist(Times(a,Power(c,-1)),Int(Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),CN1D2),x),x),Dist(Times(Plus(Times(b,c),Times(CN1,a,d)),Power(c,-1)),Int(Times(Csc(Plus(e,Times(f,x))),Power(Times(Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Plus(c,Times(d,Csc(Plus(e,Times(f,x)))))),-1)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),NeQ(Plus(Sqr(c),Negate(Sqr(d))),C0)))),
IIntegrate(3927,Int(Times(Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),QQ(3L,2L)),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),c_),-1)),x_Symbol),
    Condition(Plus(Dist(Times(a,Power(c,-1)),Int(Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),x),x),Dist(Times(Plus(Times(b,c),Times(CN1,a,d)),Power(c,-1)),Int(Times(Csc(Plus(e,Times(f,x))),Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Power(Plus(c,Times(d,Csc(Plus(e,Times(f,x))))),-1)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),Or(EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),EqQ(Plus(Sqr(c),Negate(Sqr(d))),C0))))),
IIntegrate(3928,Int(Times(Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),QQ(3L,2L)),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),c_),-1)),x_Symbol),
    Condition(Plus(Dist(Power(Times(c,d),-1),Int(Times(Plus(Times(Sqr(a),d),Times(Sqr(b),c,Csc(Plus(e,Times(f,x))))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),CN1D2)),x),x),Negate(Dist(Times(Sqr(Plus(Times(b,c),Times(CN1,a,d))),Power(Times(c,d),-1)),Int(Times(Csc(Plus(e,Times(f,x))),Power(Times(Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Plus(c,Times(d,Csc(Plus(e,Times(f,x)))))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),NeQ(Plus(Sqr(c),Negate(Sqr(d))),C0)))),
IIntegrate(3929,Int(Times(Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),CN1D2),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),c_),-1)),x_Symbol),
    Condition(Plus(Dist(Power(Times(c,Plus(Times(b,c),Times(CN1,a,d))),-1),Int(Times(Plus(Times(b,c),Times(CN1,a,d),Times(CN1,b,d,Csc(Plus(e,Times(f,x))))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),CN1D2)),x),x),Dist(Times(Sqr(d),Power(Times(c,Plus(Times(b,c),Times(CN1,a,d))),-1)),Int(Times(Csc(Plus(e,Times(f,x))),Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Power(Plus(c,Times(d,Csc(Plus(e,Times(f,x))))),-1)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),Or(EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),EqQ(Plus(Sqr(c),Negate(Sqr(d))),C0))))),
IIntegrate(3930,Int(Times(Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),CN1D2),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),c_),-1)),x_Symbol),
    Condition(Plus(Dist(Power(c,-1),Int(Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),CN1D2),x),x),Negate(Dist(Times(d,Power(c,-1)),Int(Times(Csc(Plus(e,Times(f,x))),Power(Times(Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Plus(c,Times(d,Csc(Plus(e,Times(f,x)))))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0)))),
IIntegrate(3931,Int(Times(Sqrt(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_)),Sqrt(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),c_))),x_Symbol),
    Condition(Dist(Times(Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Sqrt(Plus(c,Times(d,Csc(Plus(e,Times(f,x)))))),Power(Cot(Plus(e,Times(f,x))),-1)),Int(Cot(Plus(e,Times(f,x))),x),x),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),EqQ(Plus(Sqr(c),Negate(Sqr(d))),C0)))),
IIntegrate(3932,Int(Times(Sqrt(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_)),Sqrt(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),c_))),x_Symbol),
    Condition(Plus(Dist(c,Int(Times(Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Power(Plus(c,Times(d,Csc(Plus(e,Times(f,x))))),CN1D2)),x),x),Dist(d,Int(Times(Csc(Plus(e,Times(f,x))),Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Power(Plus(c,Times(d,Csc(Plus(e,Times(f,x))))),CN1D2)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0)))),
IIntegrate(3933,Int(Times(Sqrt(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_)),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),c_),CN1D2)),x_Symbol),
    Condition(Plus(Dist(Power(c,-1),Int(Times(Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Sqrt(Plus(c,Times(d,Csc(Plus(e,Times(f,x))))))),x),x),Negate(Dist(Times(d,Power(c,-1)),Int(Times(Csc(Plus(e,Times(f,x))),Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Power(Plus(c,Times(d,Csc(Plus(e,Times(f,x))))),CN1D2)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),EqQ(Plus(Sqr(c),Negate(Sqr(d))),C0)))),
IIntegrate(3934,Int(Times(Sqrt(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_)),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),c_),CN1D2)),x_Symbol),
    Condition(Dist(Times(CN2,a,Power(f,-1)),Subst(Int(Power(Plus(C1,Times(a,c,Sqr(x))),-1),x),x,Times(Cot(Plus(e,Times(f,x))),Power(Times(Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Sqrt(Plus(c,Times(d,Csc(Plus(e,Times(f,x))))))),-1))),x),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),NeQ(Plus(Sqr(c),Negate(Sqr(d))),C0)))),
IIntegrate(3935,Int(Times(Sqrt(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_)),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),c_),CN1D2)),x_Symbol),
    Condition(Plus(Dist(Times(a,Power(c,-1)),Int(Times(Sqrt(Plus(c,Times(d,Csc(Plus(e,Times(f,x)))))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),CN1D2)),x),x),Dist(Times(Plus(Times(b,c),Times(CN1,a,d)),Power(c,-1)),Int(Times(Csc(Plus(e,Times(f,x))),Power(Times(Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Sqrt(Plus(c,Times(d,Csc(Plus(e,Times(f,x))))))),-1)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),EqQ(Plus(Sqr(c),Negate(Sqr(d))),C0)))),
IIntegrate(3936,Int(Times(Sqrt(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_)),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),c_),CN1D2)),x_Symbol),
    Condition(Simp(Times(C2,Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Sqrt(Times(Plus(Times(b,c),Times(CN1,a,d)),Plus(C1,Csc(Plus(e,Times(f,x)))),Power(Times(Plus(c,Negate(d)),Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),-1))),Sqrt(Times(CN1,Plus(Times(b,c),Times(CN1,a,d)),Plus(C1,Negate(Csc(Plus(e,Times(f,x))))),Power(Times(Plus(c,d),Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),-1))),EllipticPi(Times(a,Plus(c,d),Power(Times(c,Plus(a,b)),-1)),ArcSin(Times(Rt(Times(Plus(a,b),Power(Plus(c,d),-1)),C2),Sqrt(Plus(c,Times(d,Csc(Plus(e,Times(f,x)))))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),CN1D2))),Times(Plus(a,Negate(b)),Plus(c,d),Power(Times(Plus(a,b),Plus(c,Negate(d))),-1))),Power(Times(c,f,Rt(Times(Plus(a,b),Power(Plus(c,d),-1)),C2),Cot(Plus(e,Times(f,x)))),-1)),x),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),NeQ(Plus(Sqr(c),Negate(Sqr(d))),C0)))),
IIntegrate(3937,Int(Times(Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),CN1D2),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),c_),CN1D2)),x_Symbol),
    Condition(Dist(Times(Cot(Plus(e,Times(f,x))),Power(Times(Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Sqrt(Plus(c,Times(d,Csc(Plus(e,Times(f,x))))))),-1)),Int(Power(Cot(Plus(e,Times(f,x))),-1),x),x),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),EqQ(Plus(Sqr(c),Negate(Sqr(d))),C0)))),
IIntegrate(3938,Int(Times(Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),CN1D2),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),c_),CN1D2)),x_Symbol),
    Condition(Plus(Dist(Power(a,-1),Int(Times(Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Power(Plus(c,Times(d,Csc(Plus(e,Times(f,x))))),CN1D2)),x),x),Negate(Dist(Times(b,Power(a,-1)),Int(Times(Csc(Plus(e,Times(f,x))),Power(Times(Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Sqrt(Plus(c,Times(d,Csc(Plus(e,Times(f,x))))))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0)))),
IIntegrate(3939,Int(Times(Sqrt(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_)),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),c_),QQ(-3L,2L))),x_Symbol),
    Condition(Plus(Dist(Power(c,-1),Int(Times(Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Power(Plus(c,Times(d,Csc(Plus(e,Times(f,x))))),CN1D2)),x),x),Negate(Dist(Times(d,Power(c,-1)),Int(Times(Csc(Plus(e,Times(f,x))),Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Power(Plus(c,Times(d,Csc(Plus(e,Times(f,x))))),QQ(-3L,2L))),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),NeQ(Plus(Sqr(c),Negate(Sqr(d))),C0)))),
IIntegrate(3940,Int(Times(Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_DEFAULT),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),c_),n_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Sqr(a),Cot(Plus(e,Times(f,x))),Power(Times(f,Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Sqrt(Plus(a,Times(CN1,b,Csc(Plus(e,Times(f,x))))))),-1)),Subst(Int(Times(Power(Plus(a,Times(b,x)),Plus(m,Negate(C1D2))),Power(Plus(c,Times(d,x)),n),Power(Times(x,Sqrt(Plus(a,Times(CN1,b,x)))),-1)),x),x,Csc(Plus(e,Times(f,x)))),x),And(FreeQ(List(a,b,c,d,e,f,m,n),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),NeQ(Plus(Sqr(c),Negate(Sqr(d))),C0),IntegerQ(Plus(m,Negate(C1D2)))))),
IIntegrate(3941,Int(Times(Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),c_),n_)),x_Symbol),
    Condition(Int(Times(Power(Plus(b,Times(a,Sin(Plus(e,Times(f,x))))),m),Power(Plus(d,Times(c,Sin(Plus(e,Times(f,x))))),n),Power(Power(Sin(Plus(e,Times(f,x))),Plus(m,n)),-1)),x),And(FreeQ(List(a,b,c,d,e,f,m,n),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),IntegerQ(m),IntegerQ(n),LeQ(CN2,Plus(m,n),C0)))),
IIntegrate(3942,Int(Times(Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),c_),n_)),x_Symbol),
    Condition(Dist(Times(Sqrt(Plus(d,Times(c,Sin(Plus(e,Times(f,x)))))),Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Power(Times(Sqrt(Plus(b,Times(a,Sin(Plus(e,Times(f,x)))))),Sqrt(Plus(c,Times(d,Csc(Plus(e,Times(f,x))))))),-1)),Int(Times(Power(Plus(b,Times(a,Sin(Plus(e,Times(f,x))))),m),Power(Plus(d,Times(c,Sin(Plus(e,Times(f,x))))),n),Power(Power(Sin(Plus(e,Times(f,x))),Plus(m,n)),-1)),x),x),And(FreeQ(List(a,b,c,d,e,f,m,n),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),IntegerQ(Plus(m,C1D2)),IntegerQ(Plus(n,C1D2)),LeQ(CN2,Plus(m,n),C0)))),
IIntegrate(3943,Int(Times(Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),c_),n_)),x_Symbol),
    Condition(Dist(Times(Power(Sin(Plus(e,Times(f,x))),Plus(m,n)),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),m),Power(Plus(c,Times(d,Csc(Plus(e,Times(f,x))))),n),Power(Times(Power(Plus(b,Times(a,Sin(Plus(e,Times(f,x))))),m),Power(Plus(d,Times(c,Sin(Plus(e,Times(f,x))))),n)),-1)),Int(Times(Power(Plus(b,Times(a,Sin(Plus(e,Times(f,x))))),m),Power(Plus(d,Times(c,Sin(Plus(e,Times(f,x))))),n),Power(Power(Sin(Plus(e,Times(f,x))),Simplify(Plus(m,n))),-1)),x),x),And(FreeQ(List(a,b,c,d,e,f,m,n),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),EqQ(Plus(m,n),C0),Not(IntegerQ(Times(C2,m)))))),
IIntegrate(3944,Int(Times(Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),c_),n_)),x_Symbol),
    Condition(Int(ExpandTrig(Power(Plus(a,Times(b,$($s("§csc"),Plus(e,Times(f,x))))),m),Power(Plus(c,Times(d,$($s("§csc"),Plus(e,Times(f,x))))),n),x),x),And(FreeQ(List(a,b,c,d,e,f,m,n),x),IGtQ(n,C0)))),
IIntegrate(3945,Int(Times(Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_DEFAULT),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),c_),n_DEFAULT)),x_Symbol),
    Condition(Unintegrable(Times(Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),m),Power(Plus(c,Times(d,Csc(Plus(e,Times(f,x))))),n)),x),FreeQ(List(a,b,c,d,e,f,m,n),x))),
IIntegrate(3946,Int(Times(Power(Times(d_DEFAULT,Power($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),-1)),n_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT)),x_Symbol),
    Condition(Dist(Power(d,m),Int(Times(Power(Plus(b,Times(a,Cos(Plus(e,Times(f,x))))),m),Power(Times(d,Cos(Plus(e,Times(f,x)))),Plus(n,Negate(m)))),x),x),And(FreeQ(List(a,b,d,e,f,n),x),Not(IntegerQ(n)),IntegerQ(m)))),
IIntegrate(3947,Int(Times(Power(Plus(a_DEFAULT,Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT)),m_DEFAULT),Power(Times(Power($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),-1),d_DEFAULT),n_)),x_Symbol),
    Condition(Dist(Power(d,m),Int(Times(Power(Plus(b,Times(a,Sin(Plus(e,Times(f,x))))),m),Power(Times(d,Sin(Plus(e,Times(f,x)))),Plus(n,Negate(m)))),x),x),And(FreeQ(List(a,b,d,e,f,n),x),Not(IntegerQ(n)),IntegerQ(m)))),
IIntegrate(3948,Int(Times(Power(Times(c_DEFAULT,Power(Times(d_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),p_)),n_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(c,IntPart(n)),Power(Times(c,Power(Times(d,Sec(Plus(e,Times(f,x)))),p)),FracPart(n)),Power(Power(Times(d,Sec(Plus(e,Times(f,x)))),Times(p,FracPart(n))),-1)),Int(Times(Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),m),Power(Times(d,Sec(Plus(e,Times(f,x)))),Times(n,p))),x),x),And(FreeQ(List(a,b,c,d,e,f,m,n,p),x),Not(IntegerQ(n))))),
IIntegrate(3949,Int(Times(Power(Plus(a_DEFAULT,Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT)),m_DEFAULT),Power(Times(c_DEFAULT,Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),p_)),n_)),x_Symbol),
    Condition(Dist(Times(Power(c,IntPart(n)),Power(Times(c,Power(Times(d,Csc(Plus(e,Times(f,x)))),p)),FracPart(n)),Power(Power(Times(d,Csc(Plus(e,Times(f,x)))),Times(p,FracPart(n))),-1)),Int(Times(Power(Plus(a,Times(b,Cos(Plus(e,Times(f,x))))),m),Power(Times(d,Cos(Plus(e,Times(f,x)))),Times(n,p))),x),x),And(FreeQ(List(a,b,c,d,e,f,m,n,p),x),Not(IntegerQ(n))))),
IIntegrate(3950,Int(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),c_),n_DEFAULT)),x_Symbol),
    Condition(Simp(Times(b,Cot(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),m),Power(Plus(c,Times(d,Csc(Plus(e,Times(f,x))))),n),Power(Times(a,f,Plus(Times(C2,m),C1)),-1)),x),And(FreeQ(List(a,b,c,d,e,f,m,n),x),EqQ(Plus(Times(b,c),Times(a,d)),C0),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),EqQ(Plus(m,n,C1),C0),NeQ(Plus(Times(C2,m),C1),C0))))
  );
}
