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
public class IntRules82 {

	public static void initialize() {
		Initializer.init();
	}

	private static class Initializer  {

		private static void init() {
			IIntegrate(4101,Int(Times(Plus(A_DEFAULT,Times(Sqr($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),C_DEFAULT)),Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),n_),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_)),x_Symbol),
					Condition(Plus(Simp(Times(Plus(Times(ASymbol,Sqr(b)),Times(Sqr(a),C)),Cot(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(d,Csc(Plus(e,Times(f,x)))),n),Power(Times(a,f,Plus(m,C1),Subtract(Sqr(a),Sqr(b))),CN1)),x),Dist(Power(Times(a,Plus(m,C1),Subtract(Sqr(a),Sqr(b))),CN1),Int(Times(Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(d,Csc(Plus(e,Times(f,x)))),n),Simp(Plus(Times(Sqr(a),Plus(ASymbol,C),Plus(m,C1)),Times(CN1,Plus(Times(ASymbol,Sqr(b)),Times(Sqr(a),C)),Plus(m,n,C1)),Times(CN1,a,b,Plus(ASymbol,C),Plus(m,C1),Csc(Plus(e,Times(f,x)))),Times(Plus(Times(ASymbol,Sqr(b)),Times(Sqr(a),C)),Plus(m,n,C2),Sqr(Csc(Plus(e,Times(f,x)))))),x)),x),x)),And(FreeQ(List(a,b,d,e,f,ASymbol,C,n),x),NeQ(Subtract(Sqr(a),Sqr(b)),C0),LtQ(m,CN1),Not(And(ILtQ(Plus(m,C1D2),C0),ILtQ(n,C0))))));
			IIntegrate(4102,Int(Times(Plus(A_DEFAULT,Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),B_DEFAULT),Times(Sqr($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),C_DEFAULT)),Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),n_),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_)),x_Symbol),
					Condition(Plus(Negate(Simp(Times(C,d,Cot(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(d,Csc(Plus(e,Times(f,x)))),Subtract(n,C1)),Power(Times(b,f,Plus(m,n,C1)),CN1)),x)),Dist(Times(d,Power(Times(b,Plus(m,n,C1)),CN1)),Int(Times(Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),m),Power(Times(d,Csc(Plus(e,Times(f,x)))),Subtract(n,C1)),Simp(Plus(Times(a,C,Subtract(n,C1)),Times(Plus(Times(ASymbol,b,Plus(m,n,C1)),Times(b,C,Plus(m,n))),Csc(Plus(e,Times(f,x)))),Times(Subtract(Times(b,BSymbol,Plus(m,n,C1)),Times(a,C,n)),Sqr(Csc(Plus(e,Times(f,x)))))),x)),x),x)),And(FreeQ(List(a,b,d,e,f,ASymbol,BSymbol,C,m),x),NeQ(Subtract(Sqr(a),Sqr(b)),C0),GtQ(n,C0))));
			IIntegrate(4103,Int(Times(Plus(A_DEFAULT,Times(Sqr($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),C_DEFAULT)),Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),n_),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_)),x_Symbol),
					Condition(Plus(Negate(Simp(Times(C,d,Cot(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(d,Csc(Plus(e,Times(f,x)))),Subtract(n,C1)),Power(Times(b,f,Plus(m,n,C1)),CN1)),x)),Dist(Times(d,Power(Times(b,Plus(m,n,C1)),CN1)),Int(Times(Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),m),Power(Times(d,Csc(Plus(e,Times(f,x)))),Subtract(n,C1)),Simp(Subtract(Plus(Times(a,C,Subtract(n,C1)),Times(Plus(Times(ASymbol,b,Plus(m,n,C1)),Times(b,C,Plus(m,n))),Csc(Plus(e,Times(f,x))))),Times(a,C,n,Sqr(Csc(Plus(e,Times(f,x)))))),x)),x),x)),And(FreeQ(List(a,b,d,e,f,ASymbol,C,m),x),NeQ(Subtract(Sqr(a),Sqr(b)),C0),GtQ(n,C0))));
			IIntegrate(4104,Int(Times(Plus(A_DEFAULT,Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),B_DEFAULT),Times(Sqr($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),C_DEFAULT)),Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),n_),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_)),x_Symbol),
					Condition(Plus(Simp(Times(ASymbol,Cot(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(d,Csc(Plus(e,Times(f,x)))),n),Power(Times(a,f,n),CN1)),x),Dist(Power(Times(a,d,n),CN1),Int(Times(Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),m),Power(Times(d,Csc(Plus(e,Times(f,x)))),Plus(n,C1)),Simp(Plus(Times(a,BSymbol,n),Times(CN1,ASymbol,b,Plus(m,n,C1)),Times(a,Plus(ASymbol,Times(ASymbol,n),Times(C,n)),Csc(Plus(e,Times(f,x)))),Times(ASymbol,b,Plus(m,n,C2),Sqr(Csc(Plus(e,Times(f,x)))))),x)),x),x)),And(FreeQ(List(a,b,d,e,f,ASymbol,BSymbol,C,m),x),NeQ(Subtract(Sqr(a),Sqr(b)),C0),LeQ(n,CN1))));
			IIntegrate(4105,Int(Times(Plus(A_DEFAULT,Times(Sqr($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),C_DEFAULT)),Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),n_),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_)),x_Symbol),
					Condition(Plus(Simp(Times(ASymbol,Cot(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(d,Csc(Plus(e,Times(f,x)))),n),Power(Times(a,f,n),CN1)),x),Dist(Power(Times(a,d,n),CN1),Int(Times(Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),m),Power(Times(d,Csc(Plus(e,Times(f,x)))),Plus(n,C1)),Simp(Plus(Times(CN1,ASymbol,b,Plus(m,n,C1)),Times(a,Plus(ASymbol,Times(ASymbol,n),Times(C,n)),Csc(Plus(e,Times(f,x)))),Times(ASymbol,b,Plus(m,n,C2),Sqr(Csc(Plus(e,Times(f,x)))))),x)),x),x)),And(FreeQ(List(a,b,d,e,f,ASymbol,C,m),x),NeQ(Subtract(Sqr(a),Sqr(b)),C0),LeQ(n,CN1))));
			IIntegrate(4106,Int(Times(Plus(A_DEFAULT,Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),B_DEFAULT),Times(Sqr($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),C_DEFAULT)),Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),CN1D2),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),CN1)),x_Symbol),
					Condition(Plus(Dist(Times(Plus(Times(ASymbol,Sqr(b)),Times(CN1,a,b,BSymbol),Times(Sqr(a),C)),Power(Times(Sqr(a),Sqr(d)),CN1)),Int(Times(Power(Times(d,Csc(Plus(e,Times(f,x)))),QQ(3L,2L)),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),CN1)),x),x),Dist(Power(a,CN2),Int(Times(Subtract(Times(a,ASymbol),Times(Subtract(Times(ASymbol,b),Times(a,BSymbol)),Csc(Plus(e,Times(f,x))))),Power(Times(d,Csc(Plus(e,Times(f,x)))),CN1D2)),x),x)),And(FreeQ(List(a,b,d,e,f,ASymbol,BSymbol,C),x),NeQ(Subtract(Sqr(a),Sqr(b)),C0))));
			IIntegrate(4107,Int(Times(Plus(A_DEFAULT,Times(Sqr($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),C_DEFAULT)),Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),CN1D2),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),CN1)),x_Symbol),
					Condition(Plus(Dist(Times(Plus(Times(ASymbol,Sqr(b)),Times(Sqr(a),C)),Power(Times(Sqr(a),Sqr(d)),CN1)),Int(Times(Power(Times(d,Csc(Plus(e,Times(f,x)))),QQ(3L,2L)),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),CN1)),x),x),Dist(Power(a,CN2),Int(Times(Subtract(Times(a,ASymbol),Times(ASymbol,b,Csc(Plus(e,Times(f,x))))),Power(Times(d,Csc(Plus(e,Times(f,x)))),CN1D2)),x),x)),And(FreeQ(List(a,b,d,e,f,ASymbol,C),x),NeQ(Subtract(Sqr(a),Sqr(b)),C0))));
			IIntegrate(4108,Int(Times(Plus(A_DEFAULT,Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),B_DEFAULT),Times(Sqr($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),C_DEFAULT)),Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),CN1D2),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),CN1D2)),x_Symbol),
					Condition(Plus(Dist(Times(C,Power(d,CN2)),Int(Times(Power(Times(d,Csc(Plus(e,Times(f,x)))),QQ(3L,2L)),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),CN1D2)),x),x),Int(Times(Plus(ASymbol,Times(BSymbol,Csc(Plus(e,Times(f,x))))),Power(Times(Sqrt(Times(d,Csc(Plus(e,Times(f,x))))),Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))))),CN1)),x)),And(FreeQ(List(a,b,d,e,f,ASymbol,BSymbol,C),x),NeQ(Subtract(Sqr(a),Sqr(b)),C0))));
			IIntegrate(4109,Int(Times(Plus(A_DEFAULT,Times(Sqr($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),C_DEFAULT)),Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),CN1D2),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),CN1D2)),x_Symbol),
					Condition(Plus(Dist(Times(C,Power(d,CN2)),Int(Times(Power(Times(d,Csc(Plus(e,Times(f,x)))),QQ(3L,2L)),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),CN1D2)),x),x),Dist(ASymbol,Int(Power(Times(Sqrt(Times(d,Csc(Plus(e,Times(f,x))))),Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))))),CN1),x),x)),And(FreeQ(List(a,b,d,e,f,ASymbol,C),x),NeQ(Subtract(Sqr(a),Sqr(b)),C0))));
			IIntegrate(4110,Int(Times(Plus(A_DEFAULT,Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),B_DEFAULT),Times(Sqr($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),C_DEFAULT)),Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),n_DEFAULT),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_DEFAULT)),x_Symbol),
					Condition(Unintegrable(Times(Power(Times(d,Csc(Plus(e,Times(f,x)))),n),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),m),Plus(ASymbol,Times(BSymbol,Csc(Plus(e,Times(f,x)))),Times(C,Sqr(Csc(Plus(e,Times(f,x))))))),x),FreeQ(List(a,b,d,e,f,ASymbol,BSymbol,C,m,n),x)));
			IIntegrate(4111,Int(Times(Plus(A_DEFAULT,Times(Sqr($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),C_DEFAULT)),Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),n_DEFAULT),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_DEFAULT)),x_Symbol),
					Condition(Unintegrable(Times(Power(Times(d,Csc(Plus(e,Times(f,x)))),n),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),m),Plus(ASymbol,Times(C,Sqr(Csc(Plus(e,Times(f,x))))))),x),FreeQ(List(a,b,d,e,f,ASymbol,C,m,n),x)));
			IIntegrate(4112,Int(Times(Power(Times($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),n_),Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT),Plus(A_DEFAULT,Times(B_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),Times(C_DEFAULT,Sqr($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),x_Symbol),
					Condition(Dist(Power(d,Plus(m,C2)),Int(Times(Power(Plus(b,Times(a,Cos(Plus(e,Times(f,x))))),m),Power(Times(d,Cos(Plus(e,Times(f,x)))),Subtract(Subtract(n,m),C2)),Plus(C,Times(BSymbol,Cos(Plus(e,Times(f,x)))),Times(ASymbol,Sqr(Cos(Plus(e,Times(f,x))))))),x),x),And(FreeQ(List(a,b,d,e,f,ASymbol,BSymbol,C,n),x),Not(IntegerQ(n)),IntegerQ(m))));
			IIntegrate(4113,Int(Times(Plus(A_DEFAULT,Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),B_DEFAULT),Times(Sqr($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),C_DEFAULT)),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_DEFAULT),Power(Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
					Condition(Dist(Power(d,Plus(m,C2)),Int(Times(Power(Plus(b,Times(a,Sin(Plus(e,Times(f,x))))),m),Power(Times(d,Sin(Plus(e,Times(f,x)))),Subtract(Subtract(n,m),C2)),Plus(C,Times(BSymbol,Sin(Plus(e,Times(f,x)))),Times(ASymbol,Sqr(Sin(Plus(e,Times(f,x))))))),x),x),And(FreeQ(List(a,b,d,e,f,ASymbol,BSymbol,C,n),x),Not(IntegerQ(n)),IntegerQ(m))));
			IIntegrate(4114,Int(Times(Power(Times($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),n_),Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT),Plus(A_DEFAULT,Times(C_DEFAULT,Sqr($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),x_Symbol),
					Condition(Dist(Power(d,Plus(m,C2)),Int(Times(Power(Plus(b,Times(a,Cos(Plus(e,Times(f,x))))),m),Power(Times(d,Cos(Plus(e,Times(f,x)))),Subtract(Subtract(n,m),C2)),Plus(C,Times(ASymbol,Sqr(Cos(Plus(e,Times(f,x))))))),x),x),And(FreeQ(List(a,b,d,e,f,ASymbol,C,n),x),Not(IntegerQ(n)),IntegerQ(m))));
			IIntegrate(4115,Int(Times(Plus(A_DEFAULT,Times(Sqr($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),C_DEFAULT)),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_DEFAULT),Power(Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
					Condition(Dist(Power(d,Plus(m,C2)),Int(Times(Power(Plus(b,Times(a,Sin(Plus(e,Times(f,x))))),m),Power(Times(d,Sin(Plus(e,Times(f,x)))),Subtract(Subtract(n,m),C2)),Plus(C,Times(ASymbol,Sqr(Sin(Plus(e,Times(f,x))))))),x),x),And(FreeQ(List(a,b,d,e,f,ASymbol,C,n),x),Not(IntegerQ(n)),IntegerQ(m))));
			IIntegrate(4116,Int(Times(Power(Times(c_DEFAULT,Power(Times(d_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),p_)),n_),Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT),Plus(A_DEFAULT,Times(B_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),Times(C_DEFAULT,Sqr($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),x_Symbol),
					Condition(Dist(Times(Power(c,IntPart(n)),Power(Times(c,Power(Times(d,Sec(Plus(e,Times(f,x)))),p)),FracPart(n)),Power(Power(Times(d,Sec(Plus(e,Times(f,x)))),Times(p,FracPart(n))),CN1)),Int(Times(Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),m),Power(Times(d,Sec(Plus(e,Times(f,x)))),Times(n,p)),Plus(ASymbol,Times(BSymbol,Sec(Plus(e,Times(f,x)))),Times(C,Sqr(Sec(Plus(e,Times(f,x))))))),x),x),And(FreeQ(List(a,b,c,d,e,f,ASymbol,BSymbol,C,m,n,p),x),Not(IntegerQ(n)))));
			IIntegrate(4117,Int(Times(Plus(A_DEFAULT,Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),B_DEFAULT),Times(Sqr($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),C_DEFAULT)),Power(Times(c_DEFAULT,Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),p_)),n_),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_DEFAULT)),x_Symbol),
					Condition(Dist(Times(Power(c,IntPart(n)),Power(Times(c,Power(Times(d,Csc(Plus(e,Times(f,x)))),p)),FracPart(n)),Power(Power(Times(d,Csc(Plus(e,Times(f,x)))),Times(p,FracPart(n))),CN1)),Int(Times(Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),m),Power(Times(d,Csc(Plus(e,Times(f,x)))),Times(n,p)),Plus(ASymbol,Times(BSymbol,Csc(Plus(e,Times(f,x)))),Times(C,Sqr(Csc(Plus(e,Times(f,x))))))),x),x),And(FreeQ(List(a,b,c,d,e,f,ASymbol,BSymbol,C,m,n,p),x),Not(IntegerQ(n)))));
			IIntegrate(4118,Int(Times(Power(Times(c_DEFAULT,Power(Times(d_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),p_)),n_),Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT),Plus(A_DEFAULT,Times(C_DEFAULT,Sqr($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),x_Symbol),
					Condition(Dist(Times(Power(c,IntPart(n)),Power(Times(c,Power(Times(d,Sec(Plus(e,Times(f,x)))),p)),FracPart(n)),Power(Power(Times(d,Sec(Plus(e,Times(f,x)))),Times(p,FracPart(n))),CN1)),Int(Times(Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),m),Power(Times(d,Sec(Plus(e,Times(f,x)))),Times(n,p)),Plus(ASymbol,Times(C,Sqr(Sec(Plus(e,Times(f,x))))))),x),x),And(FreeQ(List(a,b,c,d,e,f,ASymbol,C,m,n,p),x),Not(IntegerQ(n)))));
			IIntegrate(4119,Int(Times(Plus(A_DEFAULT,Times(Sqr($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),C_DEFAULT)),Power(Times(c_DEFAULT,Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),p_)),n_),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_DEFAULT)),x_Symbol),
					Condition(Dist(Times(Power(c,IntPart(n)),Power(Times(c,Power(Times(d,Csc(Plus(e,Times(f,x)))),p)),FracPart(n)),Power(Power(Times(d,Csc(Plus(e,Times(f,x)))),Times(p,FracPart(n))),CN1)),Int(Times(Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),m),Power(Times(d,Csc(Plus(e,Times(f,x)))),Times(n,p)),Plus(ASymbol,Times(C,Sqr(Csc(Plus(e,Times(f,x))))))),x),x),And(FreeQ(List(a,b,c,d,e,f,ASymbol,C,m,n,p),x),Not(IntegerQ(n)))));
			IIntegrate(4120,Int(Times(u_DEFAULT,Power(Plus(a_,Times(b_DEFAULT,Sqr($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),p_)),x_Symbol),
					Condition(Dist(Power(b,p),Int(ActivateTrig(Times(u,Power($($s("§tan"),Plus(e,Times(f,x))),Times(C2,p)))),x),x),And(FreeQ(List(a,b,e,f,p),x),EqQ(Plus(a,b),C0),IntegerQ(p))));
			IIntegrate(4121,Int(Times(u_DEFAULT,Power(Plus(a_,Times(b_DEFAULT,Sqr($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),p_)),x_Symbol),
					Condition(Int(ActivateTrig(Times(u,Power(Times(b,Sqr($($s("§tan"),Plus(e,Times(f,x))))),p))),x),And(FreeQ(List(a,b,e,f,p),x),EqQ(Plus(a,b),C0))));
			IIntegrate(4122,Int(Power(Times(b_DEFAULT,Sqr($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),p_),x_Symbol),
					Condition(With(List(Set($s("ff"),FreeFactors(Tan(Plus(e,Times(f,x))),x))),Dist(Times(b,$s("ff"),Power(f,CN1)),Subst(Int(Power(Plus(b,Times(b,Sqr($s("ff")),Sqr(x))),Subtract(p,C1)),x),x,Times(Tan(Plus(e,Times(f,x))),Power($s("ff"),CN1))),x)),And(FreeQ(List(b,e,f,p),x),Not(IntegerQ(p)))));
			IIntegrate(4123,Int(Power(Times(b_DEFAULT,Power(Times(c_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),p_),x_Symbol),
					Condition(Dist(Times(Power(b,IntPart(p)),Power(Times(b,Power(Times(c,Sec(Plus(e,Times(f,x)))),n)),FracPart(p)),Power(Power(Times(c,Sec(Plus(e,Times(f,x)))),Times(n,FracPart(p))),CN1)),Int(Power(Times(c,Sec(Plus(e,Times(f,x)))),Times(n,p)),x),x),And(FreeQ(List(b,c,e,f,n,p),x),Not(IntegerQ(p)))));
			IIntegrate(4124,Int(Times(Power(Times(b_DEFAULT,Sqr($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),p_DEFAULT),Power($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),m_DEFAULT)),x_Symbol),
					Condition(Dist(Times(b,Power(Times(C2,f),CN1)),Subst(Int(Times(Power(Plus(CN1,x),Times(C1D2,Subtract(m,C1))),Power(Times(b,x),Subtract(p,C1))),x),x,Sqr(Sec(Plus(e,Times(f,x))))),x),And(FreeQ(List(b,e,f,p),x),Not(IntegerQ(p)),IntegerQ(Times(C1D2,Subtract(m,C1))))));
			IIntegrate(4125,Int(Times(u_DEFAULT,Power(Times(b_DEFAULT,Power($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),n_)),p_)),x_Symbol),
					Condition(With(List(Set($s("ff"),FreeFactors(Sec(Plus(e,Times(f,x))),x))),Dist(Times(Power(Times(b,Power($s("ff"),n)),IntPart(p)),Power(Times(b,Power(Sec(Plus(e,Times(f,x))),n)),FracPart(p)),Power(Power(Times(Sec(Plus(e,Times(f,x))),Power($s("ff"),CN1)),Times(n,FracPart(p))),CN1)),Int(Times(ActivateTrig(u),Power(Times(Sec(Plus(e,Times(f,x))),Power($s("ff"),CN1)),Times(n,p))),x),x)),And(FreeQ(List(b,e,f,n,p),x),Not(IntegerQ(p)),IntegerQ(n),Or(EqQ(u,C1),MatchQ(u,Condition(Power(Times(d_DEFAULT,$($p("§trig"),Plus(e,Times(f,x)))),m_DEFAULT),And(FreeQ(List(d,m),x),MemberQ(List($s("§sin"),$s("§cos"),$s("§tan"),$s("§cot"),$s("§sec"),$s("§csc")),$s("§trig")))))))));
			IIntegrate(4126,Int(Times(u_DEFAULT,Power(Times(b_DEFAULT,Power(Times(c_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),p_)),x_Symbol),
					Condition(Dist(Times(Power(b,IntPart(p)),Power(Times(b,Power(Times(c,Sec(Plus(e,Times(f,x)))),n)),FracPart(p)),Power(Power(Times(c,Sec(Plus(e,Times(f,x)))),Times(n,FracPart(p))),CN1)),Int(Times(ActivateTrig(u),Power(Times(c,Sec(Plus(e,Times(f,x)))),Times(n,p))),x),x),And(FreeQ(List(b,c,e,f,n,p),x),Not(IntegerQ(p)),Not(IntegerQ(n)),Or(EqQ(u,C1),MatchQ(u,Condition(Power(Times(d_DEFAULT,$($p("§trig"),Plus(e,Times(f,x)))),m_DEFAULT),And(FreeQ(List(d,m),x),MemberQ(List($s("§sin"),$s("§cos"),$s("§tan"),$s("§cot"),$s("§sec"),$s("§csc")),$s("§trig")))))))));
			IIntegrate(4127,Int(Power(Plus(a_,Times(b_DEFAULT,Sqr($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),CN1),x_Symbol),
					Condition(Subtract(Simp(Times(x,Power(a,CN1)),x),Dist(Times(b,Power(a,CN1)),Int(Power(Plus(b,Times(a,Sqr(Cos(Plus(e,Times(f,x)))))),CN1),x),x)),And(FreeQ(List(a,b,e,f),x),NeQ(Plus(a,b),C0))));
			IIntegrate(4128,Int(Power(Plus(a_,Times(b_DEFAULT,Sqr($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),p_),x_Symbol),
					Condition(With(List(Set($s("ff"),FreeFactors(Tan(Plus(e,Times(f,x))),x))),Dist(Times($s("ff"),Power(f,CN1)),Subst(Int(Times(Power(Plus(a,b,Times(b,Sqr($s("ff")),Sqr(x))),p),Power(Plus(C1,Times(Sqr($s("ff")),Sqr(x))),CN1)),x),x,Times(Tan(Plus(e,Times(f,x))),Power($s("ff"),CN1))),x)),And(FreeQ(List(a,b,e,f,p),x),NeQ(Plus(a,b),C0),NeQ(p,CN1))));
			IIntegrate(4129,Int(Power(Plus(a_,Times(b_DEFAULT,Power($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),C4))),p_),x_Symbol),
					Condition(With(List(Set($s("ff"),FreeFactors(Tan(Plus(e,Times(f,x))),x))),Dist(Times($s("ff"),Power(f,CN1)),Subst(Int(Times(Power(Plus(a,b,Times(C2,b,Sqr($s("ff")),Sqr(x)),Times(b,Power($s("ff"),C4),Power(x,C4))),p),Power(Plus(C1,Times(Sqr($s("ff")),Sqr(x))),CN1)),x),x,Times(Tan(Plus(e,Times(f,x))),Power($s("ff"),CN1))),x)),And(FreeQ(List(a,b,e,f,p),x),IntegerQ(Times(C2,p)))));
			IIntegrate(4130,Int(Power(Plus(a_,Times(b_DEFAULT,Power($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),n_))),p_),x_Symbol),
					Condition(With(List(Set($s("ff"),FreeFactors(Tan(Plus(e,Times(f,x))),x))),Dist(Times($s("ff"),Power(f,CN1)),Subst(Int(Times(Power(Plus(a,Times(b,Power(Plus(C1,Times(Sqr($s("ff")),Sqr(x))),Times(C1D2,n)))),p),Power(Plus(C1,Times(Sqr($s("ff")),Sqr(x))),CN1)),x),x,Times(Tan(Plus(e,Times(f,x))),Power($s("ff"),CN1))),x)),And(FreeQ(List(a,b,e,f,p),x),IntegerQ(Times(C1D2,n)),IGtQ(p,CN2))));
			IIntegrate(4131,Int(Power(Plus(a_,Times(b_DEFAULT,Power(Times(c_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_))),p_),x_Symbol),
					Condition(Unintegrable(Power(Plus(a,Times(b,Power(Times(c,Sec(Plus(e,Times(f,x)))),n))),p),x),FreeQ(List(a,b,c,e,f,n,p),x)));
			IIntegrate(4132,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),n_))),p_DEFAULT),Power($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),m_)),x_Symbol),
					Condition(With(List(Set($s("ff"),FreeFactors(Tan(Plus(e,Times(f,x))),x))),Dist(Times(Power($s("ff"),Plus(m,C1)),Power(f,CN1)),Subst(Int(Times(Power(x,m),Power(ExpandToSum(Plus(a,Times(b,Power(Plus(C1,Times(Sqr($s("ff")),Sqr(x))),Times(C1D2,n)))),x),p),Power(Power(Plus(C1,Times(Sqr($s("ff")),Sqr(x))),Plus(Times(C1D2,m),C1)),CN1)),x),x,Times(Tan(Plus(e,Times(f,x))),Power($s("ff"),CN1))),x)),And(FreeQ(List(a,b,e,f,p),x),IntegerQ(Times(C1D2,m)),IntegerQ(Times(C1D2,n)))));
			IIntegrate(4133,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),n_))),p_DEFAULT),Power($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),m_DEFAULT)),x_Symbol),
					Condition(With(List(Set($s("ff"),FreeFactors(Cos(Plus(e,Times(f,x))),x))),Negate(Dist(Times($s("ff"),Power(f,CN1)),Subst(Int(Times(Power(Subtract(C1,Times(Sqr($s("ff")),Sqr(x))),Times(C1D2,Subtract(m,C1))),Power(Plus(b,Times(a,Power(Times($s("ff"),x),n))),p),Power(Power(Times($s("ff"),x),Times(n,p)),CN1)),x),x,Times(Cos(Plus(e,Times(f,x))),Power($s("ff"),CN1))),x))),And(FreeQ(List(a,b,e,f),x),IntegerQ(Times(C1D2,Subtract(m,C1))),IntegerQ(n),IntegerQ(p))));
			IIntegrate(4134,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(Times(c_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_))),p_DEFAULT),Power($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),m_DEFAULT)),x_Symbol),
					Condition(With(List(Set($s("ff"),FreeFactors(Cos(Plus(e,Times(f,x))),x))),Dist(Power(Times(f,Power($s("ff"),m)),CN1),Subst(Int(Times(Power(Plus(CN1,Times(Sqr($s("ff")),Sqr(x))),Times(C1D2,Subtract(m,C1))),Power(Plus(a,Times(b,Power(Times(c,$s("ff"),x),n))),p),Power(Power(x,Plus(m,C1)),CN1)),x),x,Times(Sec(Plus(e,Times(f,x))),Power($s("ff"),CN1))),x)),And(FreeQ(List(a,b,c,e,f,n,p),x),IntegerQ(Times(C1D2,Subtract(m,C1))),Or(GtQ(m,C0),EqQ(n,C2),EqQ(n,C4)))));
			IIntegrate(4135,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(Times(c_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_))),p_DEFAULT),Power(Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_DEFAULT)),x_Symbol),
					Condition(Unintegrable(Times(Power(Plus(a,Times(b,Power(Times(c,Sec(Plus(e,Times(f,x)))),n))),p),Power(Times(d,Sin(Plus(e,Times(f,x)))),m)),x),FreeQ(List(a,b,c,d,e,f,m,n,p),x)));
			IIntegrate(4136,Int(Times(Power(Times($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),m_),Power(Plus(a_,Times(b_DEFAULT,Power($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),n_DEFAULT))),p_DEFAULT)),x_Symbol),
					Condition(Dist(Power(d,Times(n,p)),Int(Times(Power(Times(d,Cos(Plus(e,Times(f,x)))),Subtract(m,Times(n,p))),Power(Plus(b,Times(a,Power(Cos(Plus(e,Times(f,x))),n))),p)),x),x),And(FreeQ(List(a,b,d,e,f,m,n,p),x),Not(IntegerQ(m)),IntegersQ(n,p))));
			IIntegrate(4137,Int(Times(Power(Times($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),m_),Power(Plus(a_,Times(b_DEFAULT,Power(Times(c_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_))),p_)),x_Symbol),
					Condition(Dist(Times(Power(Times(d,Cos(Plus(e,Times(f,x)))),FracPart(m)),Power(Times(Sec(Plus(e,Times(f,x))),Power(d,CN1)),FracPart(m))),Int(Times(Power(Plus(a,Times(b,Power(Times(c,Sec(Plus(e,Times(f,x)))),n))),p),Power(Power(Times(Sec(Plus(e,Times(f,x))),Power(d,CN1)),m),CN1)),x),x),And(FreeQ(List(a,b,c,d,e,f,m,n,p),x),Not(IntegerQ(m)))));
			IIntegrate(4138,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),n_))),p_DEFAULT),Power($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),m_DEFAULT)),x_Symbol),
					Condition(Module(List(Set($s("ff"),FreeFactors(Cos(Plus(e,Times(f,x))),x))),Negate(Dist(Power(Times(f,Power($s("ff"),Subtract(Plus(m,Times(n,p)),C1))),CN1),Subst(Int(Times(Power(Subtract(C1,Times(Sqr($s("ff")),Sqr(x))),Times(C1D2,Subtract(m,C1))),Power(Plus(b,Times(a,Power(Times($s("ff"),x),n))),p),Power(Power(x,Plus(m,Times(n,p))),CN1)),x),x,Times(Cos(Plus(e,Times(f,x))),Power($s("ff"),CN1))),x))),And(FreeQ(List(a,b,e,f,n),x),IntegerQ(Times(C1D2,Subtract(m,C1))),IntegerQ(n),IntegerQ(p))));
			IIntegrate(4139,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(Times(c_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_))),p_DEFAULT),Power($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),m_DEFAULT)),x_Symbol),
					Condition(With(List(Set($s("ff"),FreeFactors(Sec(Plus(e,Times(f,x))),x))),Dist(Power(f,CN1),Subst(Int(Times(Power(Plus(CN1,Times(Sqr($s("ff")),Sqr(x))),Times(C1D2,Subtract(m,C1))),Power(Plus(a,Times(b,Power(Times(c,$s("ff"),x),n))),p),Power(x,CN1)),x),x,Times(Sec(Plus(e,Times(f,x))),Power($s("ff"),CN1))),x)),And(FreeQ(List(a,b,c,e,f,n,p),x),IntegerQ(Times(C1D2,Subtract(m,C1))),Or(GtQ(m,C0),EqQ(n,C2),EqQ(n,C4),IGtQ(p,C0),IntegersQ(Times(C2,n),p)))));
			IIntegrate(4140,Int(Times(Power(Times(b_DEFAULT,Sqr($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),p_DEFAULT),Power(Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_)),x_Symbol),
					Condition(With(List(Set($s("ff"),FreeFactors(Tan(Plus(e,Times(f,x))),x))),Dist(Times(b,$s("ff"),Power(f,CN1)),Subst(Int(Times(Power(Times(d,$s("ff"),x),m),Power(Plus(b,Times(b,Sqr($s("ff")),Sqr(x))),Subtract(p,C1))),x),x,Times(Tan(Plus(e,Times(f,x))),Power($s("ff"),CN1))),x)),FreeQ(List(b,d,e,f,m,p),x)));
			IIntegrate(4141,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),n_))),p_DEFAULT),Power(Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_)),x_Symbol),
					Condition(With(List(Set($s("ff"),FreeFactors(Tan(Plus(e,Times(f,x))),x))),Dist(Times($s("ff"),Power(f,CN1)),Subst(Int(Times(Power(Times(d,$s("ff"),x),m),Power(Plus(a,Times(b,Power(Plus(C1,Times(Sqr($s("ff")),Sqr(x))),Times(C1D2,n)))),p),Power(Plus(C1,Times(Sqr($s("ff")),Sqr(x))),CN1)),x),x,Times(Tan(Plus(e,Times(f,x))),Power($s("ff"),CN1))),x)),And(FreeQ(List(a,b,d,e,f,m,p),x),IntegerQ(Times(C1D2,n)),Or(IntegerQ(Times(C1D2,m)),EqQ(n,C2)))));
			IIntegrate(4142,Int(Times(Power(Times(b_DEFAULT,Power(Times(c_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),p_DEFAULT),Power(Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_)),x_Symbol),
					Condition(Subtract(Simp(Times(d,Power(Times(d,Tan(Plus(e,Times(f,x)))),Subtract(m,C1)),Power(Times(b,Power(Times(c,Sec(Plus(e,Times(f,x)))),n)),p),Power(Times(f,Subtract(Plus(Times(p,n),m),C1)),CN1)),x),Dist(Times(Sqr(d),Subtract(m,C1),Power(Subtract(Plus(Times(p,n),m),C1),CN1)),Int(Times(Power(Times(d,Tan(Plus(e,Times(f,x)))),Subtract(m,C2)),Power(Times(b,Power(Times(c,Sec(Plus(e,Times(f,x)))),n)),p)),x),x)),And(FreeQ(List(b,c,d,e,f,p,n),x),GtQ(m,C1),NeQ(Subtract(Plus(Times(p,n),m),C1),C0),IntegersQ(Times(C2,p,n),Times(C2,m)))));
			IIntegrate(4143,Int(Times(Power(Times(b_DEFAULT,Power(Times(c_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),p_DEFAULT),Power(Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_)),x_Symbol),
					Condition(Subtract(Simp(Times(Power(Times(d,Tan(Plus(e,Times(f,x)))),Plus(m,C1)),Power(Times(b,Power(Times(c,Sec(Plus(e,Times(f,x)))),n)),p),Power(Times(d,f,Plus(m,C1)),CN1)),x),Dist(Times(Plus(Times(p,n),m,C1),Power(Times(Sqr(d),Plus(m,C1)),CN1)),Int(Times(Power(Times(d,Tan(Plus(e,Times(f,x)))),Plus(m,C2)),Power(Times(b,Power(Times(c,Sec(Plus(e,Times(f,x)))),n)),p)),x),x)),And(FreeQ(List(b,c,d,e,f,p,n),x),LtQ(m,CN1),NeQ(Plus(Times(p,n),m,C1),C0),IntegersQ(Times(C2,p,n),Times(C2,m)))));
			IIntegrate(4144,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(Times(c_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_))),p_DEFAULT),Power(Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_DEFAULT)),x_Symbol),
					Condition(Unintegrable(Times(Power(Plus(a,Times(b,Power(Times(c,Sec(Plus(e,Times(f,x)))),n))),p),Power(Times(d,Tan(Plus(e,Times(f,x)))),m)),x),FreeQ(List(a,b,c,d,e,f,m,n,p),x)));
			IIntegrate(4145,Int(Times(Power(Times($($s("§cot"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),m_),Power(Plus(a_,Times(b_DEFAULT,Power(Times(c_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_))),p_)),x_Symbol),
					Condition(Dist(Times(Power(Times(d,Cot(Plus(e,Times(f,x)))),FracPart(m)),Power(Times(Tan(Plus(e,Times(f,x))),Power(d,CN1)),FracPart(m))),Int(Times(Power(Plus(a,Times(b,Power(Times(c,Sec(Plus(e,Times(f,x)))),n))),p),Power(Power(Times(Tan(Plus(e,Times(f,x))),Power(d,CN1)),m),CN1)),x),x),And(FreeQ(List(a,b,c,d,e,f,m,n,p),x),Not(IntegerQ(m)))));
			IIntegrate(4146,Int(Times(Power($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),m_),Power(Plus(a_,Times(b_DEFAULT,Power($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),n_))),p_)),x_Symbol),
					Condition(With(List(Set($s("ff"),FreeFactors(Tan(Plus(e,Times(f,x))),x))),Dist(Times($s("ff"),Power(f,CN1)),Subst(Int(Times(Power(Plus(C1,Times(Sqr($s("ff")),Sqr(x))),Subtract(Times(C1D2,m),C1)),Power(ExpandToSum(Plus(a,Times(b,Power(Plus(C1,Times(Sqr($s("ff")),Sqr(x))),Times(C1D2,n)))),x),p)),x),x,Times(Tan(Plus(e,Times(f,x))),Power($s("ff"),CN1))),x)),And(FreeQ(List(a,b,e,f,p),x),IntegerQ(Times(C1D2,m)),IntegerQ(Times(C1D2,n)))));
			IIntegrate(4147,Int(Times(Power($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),n_))),p_)),x_Symbol),
					Condition(With(List(Set($s("ff"),FreeFactors(Sin(Plus(e,Times(f,x))),x))),Dist(Times($s("ff"),Power(f,CN1)),Subst(Int(Times(Power(ExpandToSum(Plus(b,Times(a,Power(Subtract(C1,Times(Sqr($s("ff")),Sqr(x))),Times(C1D2,n)))),x),p),Power(Power(Subtract(C1,Times(Sqr($s("ff")),Sqr(x))),Times(C1D2,Plus(m,Times(n,p),C1))),CN1)),x),x,Times(Sin(Plus(e,Times(f,x))),Power($s("ff"),CN1))),x)),And(FreeQ(List(a,b,e,f),x),IntegerQ(Times(C1D2,Subtract(m,C1))),IntegerQ(Times(C1D2,n)),IntegerQ(p))));
			IIntegrate(4148,Int(Times(Power($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),n_))),p_)),x_Symbol),
					Condition(With(List(Set($s("ff"),FreeFactors(Sin(Plus(e,Times(f,x))),x))),Dist(Times($s("ff"),Power(f,CN1)),Subst(Int(Times(Power(Plus(a,Times(b,Power(Power(Subtract(C1,Times(Sqr($s("ff")),Sqr(x))),Times(C1D2,n)),CN1))),p),Power(Power(Subtract(C1,Times(Sqr($s("ff")),Sqr(x))),Times(C1D2,Plus(m,C1))),CN1)),x),x,Times(Sin(Plus(e,Times(f,x))),Power($s("ff"),CN1))),x)),And(FreeQ(List(a,b,e,f,p),x),IntegerQ(Times(C1D2,Subtract(m,C1))),IntegerQ(Times(C1D2,n)),Not(IntegerQ(p)))));
			IIntegrate(4149,Int(Times(Power($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),n_))),p_)),x_Symbol),
					Condition(Int(ExpandTrig(Times(Power($($s("§sec"),Plus(e,Times(f,x))),m),Power(Plus(a,Times(b,Power($($s("§sec"),Plus(e,Times(f,x))),n))),p)),x),x),And(FreeQ(List(a,b,e,f),x),IntegersQ(m,n,p))));
			IIntegrate(4150,Int(Times(Power(Times(d_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(Times(c_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_))),p_DEFAULT)),x_Symbol),
					Condition(Unintegrable(Times(Power(Times(d,Sec(Plus(e,Times(f,x)))),m),Power(Plus(a,Times(b,Power(Times(c,Sec(Plus(e,Times(f,x)))),n))),p)),x),FreeQ(List(a,b,c,d,e,f,m,n,p),x)));
		}
	}
}
