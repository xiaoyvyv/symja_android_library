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
public class IntRules144 { 

	public static void initialize() {
		Initializer.init();
	}

	private static class Initializer  {

		private static void init() {
IIntegrate(3601,Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Plus(A_DEFAULT,Times(B_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_)),x_Symbol),
    Condition(Subtract(Dist(Times(Plus(Times(ASymbol,b),Times(a,BSymbol)),Power(b,CN1)),Int(Times(Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),m),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),n)),x),x),Dist(Times(BSymbol,Power(b,CN1)),Int(Times(Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),m),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),n),Subtract(a,Times(b,Tan(Plus(e,Times(f,x)))))),x),x)),And(FreeQ(List(a,b,c,d,e,f,ASymbol,BSymbol,m,n),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),EqQ(Plus(Sqr(a),Sqr(b)),C0),NeQ(Plus(Times(ASymbol,b),Times(a,BSymbol)),C0))));
IIntegrate(3602,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Plus(A_,Times(B_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_)),x_Symbol),
    Condition(Dist(Times(Sqr(ASymbol),Power(f,CN1)),Subst(Int(Times(Power(Plus(a,Times(b,x)),m),Power(Plus(c,Times(d,x)),n),Power(Subtract(ASymbol,Times(BSymbol,x)),CN1)),x),x,Tan(Plus(e,Times(f,x)))),x),And(FreeQ(List(a,b,c,d,e,f,ASymbol,BSymbol,m,n),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),NeQ(Plus(Sqr(a),Sqr(b)),C0),Not(IntegerQ(m)),Not(IntegerQ(n)),Not(IntegersQ(Times(C2,m),Times(C2,n))),EqQ(Plus(Sqr(ASymbol),Sqr(BSymbol)),C0))));
IIntegrate(3603,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Plus(A_DEFAULT,Times(B_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_)),x_Symbol),
    Condition(Plus(Dist(Times(C1D2,Plus(ASymbol,Times(CI,BSymbol))),Int(Times(Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),m),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),n),Subtract(C1,Times(CI,Tan(Plus(e,Times(f,x)))))),x),x),Dist(Times(C1D2,Subtract(ASymbol,Times(CI,BSymbol))),Int(Times(Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),m),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),n),Plus(C1,Times(CI,Tan(Plus(e,Times(f,x)))))),x),x)),And(FreeQ(List(a,b,c,d,e,f,ASymbol,BSymbol,m,n),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),NeQ(Plus(Sqr(a),Sqr(b)),C0),Not(IntegerQ(m)),Not(IntegerQ(n)),Not(IntegersQ(Times(C2,m),Times(C2,n))),NeQ(Plus(Sqr(ASymbol),Sqr(BSymbol)),C0))));
IIntegrate(3604,Int(Times(Sqr(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Plus(A_DEFAULT,Times(B_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Subtract(Times(BSymbol,c),Times(ASymbol,d)),Sqr(Subtract(Times(b,c),Times(a,d))),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),Plus(n,C1)),Power(Times(f,Sqr(d),Plus(n,C1),Plus(Sqr(c),Sqr(d))),CN1)),x)),Dist(Power(Times(d,Plus(Sqr(c),Sqr(d))),CN1),Int(Times(Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),Plus(n,C1)),Simp(Plus(Times(BSymbol,Sqr(Subtract(Times(b,c),Times(a,d)))),Times(ASymbol,d,Plus(Times(Sqr(a),c),Times(CN1,Sqr(b),c),Times(C2,a,b,d))),Times(d,Plus(Times(BSymbol,Plus(Times(Sqr(a),c),Times(CN1,Sqr(b),c),Times(C2,a,b,d))),Times(ASymbol,Plus(Times(C2,a,b,c),Times(CN1,Sqr(a),d),Times(Sqr(b),d)))),Tan(Plus(e,Times(f,x)))),Times(Sqr(b),BSymbol,Plus(Sqr(c),Sqr(d)),Sqr(Tan(Plus(e,Times(f,x)))))),x)),x),x)),And(FreeQ(List(a,b,c,d,e,f,ASymbol,BSymbol),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),NeQ(Plus(Sqr(a),Sqr(b)),C0),NeQ(Plus(Sqr(c),Sqr(d)),C0),LtQ(n,CN1))));
IIntegrate(3605,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Plus(A_DEFAULT,Times(B_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_)),x_Symbol),
    Condition(Subtract(Simp(Times(Subtract(Times(b,c),Times(a,d)),Subtract(Times(BSymbol,c),Times(ASymbol,d)),Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Subtract(m,C1)),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),Plus(n,C1)),Power(Times(d,f,Plus(n,C1),Plus(Sqr(c),Sqr(d))),CN1)),x),Dist(Power(Times(d,Plus(n,C1),Plus(Sqr(c),Sqr(d))),CN1),Int(Times(Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Subtract(m,C2)),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),Plus(n,C1)),Simp(Subtract(Subtract(Plus(Times(a,ASymbol,d,Subtract(Times(b,d,Subtract(m,C1)),Times(a,c,Plus(n,C1)))),Times(Subtract(Times(b,BSymbol,c),Times(Plus(Times(ASymbol,b),Times(a,BSymbol)),d)),Plus(Times(b,c,Subtract(m,C1)),Times(a,d,Plus(n,C1))))),Times(d,Plus(Times(Subtract(Times(a,ASymbol),Times(b,BSymbol)),Subtract(Times(b,c),Times(a,d))),Times(Plus(Times(ASymbol,b),Times(a,BSymbol)),Plus(Times(a,c),Times(b,d)))),Plus(n,C1),Tan(Plus(e,Times(f,x))))),Times(b,Subtract(Times(d,Subtract(Plus(Times(ASymbol,b,c),Times(a,BSymbol,c)),Times(a,ASymbol,d)),Plus(m,n)),Times(b,BSymbol,Subtract(Times(Sqr(c),Subtract(m,C1)),Times(Sqr(d),Plus(n,C1))))),Sqr(Tan(Plus(e,Times(f,x)))))),x)),x),x)),And(FreeQ(List(a,b,c,d,e,f,ASymbol,BSymbol),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),NeQ(Plus(Sqr(a),Sqr(b)),C0),NeQ(Plus(Sqr(c),Sqr(d)),C0),GtQ(m,C1),LtQ(n,CN1),Or(IntegerQ(m),IntegersQ(Times(C2,m),Times(C2,n))))));
IIntegrate(3606,Int(Times(Sqr(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Plus(A_DEFAULT,Times(B_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1)),x_Symbol),
    Condition(Plus(Simp(Times(Sqr(b),BSymbol,Tan(Plus(e,Times(f,x))),Power(Times(d,f),CN1)),x),Dist(Power(d,CN1),Int(Times(Plus(Times(Sqr(a),ASymbol,d),Times(CN1,Sqr(b),BSymbol,c),Times(Plus(Times(C2,a,ASymbol,b),Times(BSymbol,Subtract(Sqr(a),Sqr(b)))),d,Tan(Plus(e,Times(f,x)))),Times(Subtract(Times(ASymbol,Sqr(b),d),Times(b,BSymbol,Subtract(Times(b,c),Times(C2,a,d)))),Sqr(Tan(Plus(e,Times(f,x)))))),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e,f,ASymbol,BSymbol),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),NeQ(Plus(Sqr(a),Sqr(b)),C0),NeQ(Plus(Sqr(c),Sqr(d)),C0))));
IIntegrate(3607,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Plus(A_DEFAULT,Times(B_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_)),x_Symbol),
    Condition(Plus(Simp(Times(b,BSymbol,Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Subtract(m,C1)),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),Plus(n,C1)),Power(Times(d,f,Plus(m,n)),CN1)),x),Dist(Power(Times(d,Plus(m,n)),CN1),Int(Times(Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Subtract(m,C2)),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),n),Simp(Subtract(Plus(Times(Sqr(a),ASymbol,d,Plus(m,n)),Times(CN1,b,BSymbol,Plus(Times(b,c,Subtract(m,C1)),Times(a,d,Plus(n,C1)))),Times(d,Plus(m,n),Plus(Times(C2,a,ASymbol,b),Times(BSymbol,Subtract(Sqr(a),Sqr(b)))),Tan(Plus(e,Times(f,x))))),Times(Subtract(Times(b,BSymbol,Subtract(Times(b,c),Times(a,d)),Subtract(m,C1)),Times(b,Plus(Times(ASymbol,b),Times(a,BSymbol)),d,Plus(m,n))),Sqr(Tan(Plus(e,Times(f,x)))))),x)),x),x)),And(FreeQ(List(a,b,c,d,e,f,ASymbol,BSymbol,n),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),NeQ(Plus(Sqr(a),Sqr(b)),C0),NeQ(Plus(Sqr(c),Sqr(d)),C0),GtQ(m,C1),Or(IntegerQ(m),IntegersQ(Times(C2,m),Times(C2,n))),Not(And(IGtQ(n,C1),Or(Not(IntegerQ(m)),And(EqQ(c,C0),NeQ(a,C0))))))));
IIntegrate(3608,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Plus(A_DEFAULT,Times(B_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_)),x_Symbol),
    Condition(Plus(Simp(Times(Subtract(Times(ASymbol,b),Times(a,BSymbol)),Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),n),Power(Times(f,Plus(m,C1),Plus(Sqr(a),Sqr(b))),CN1)),x),Dist(Power(Times(b,Plus(m,C1),Plus(Sqr(a),Sqr(b))),CN1),Int(Times(Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),Subtract(n,C1)),Simp(Subtract(Subtract(Plus(Times(b,BSymbol,Plus(Times(b,c,Plus(m,C1)),Times(a,d,n))),Times(ASymbol,b,Subtract(Times(a,c,Plus(m,C1)),Times(b,d,n)))),Times(b,Subtract(Times(ASymbol,Subtract(Times(b,c),Times(a,d))),Times(BSymbol,Plus(Times(a,c),Times(b,d)))),Plus(m,C1),Tan(Plus(e,Times(f,x))))),Times(b,d,Subtract(Times(ASymbol,b),Times(a,BSymbol)),Plus(m,n,C1),Sqr(Tan(Plus(e,Times(f,x)))))),x)),x),x)),And(FreeQ(List(a,b,c,d,e,f,ASymbol,BSymbol),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),NeQ(Plus(Sqr(a),Sqr(b)),C0),NeQ(Plus(Sqr(c),Sqr(d)),C0),LtQ(m,CN1),LtQ(C0,n,C1),Or(IntegerQ(m),IntegersQ(Times(C2,m),Times(C2,n))))));
IIntegrate(3609,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Plus(A_DEFAULT,Times(B_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_)),x_Symbol),
    Condition(Plus(Simp(Times(b,Subtract(Times(ASymbol,b),Times(a,BSymbol)),Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),Plus(n,C1)),Power(Times(f,Plus(m,C1),Subtract(Times(b,c),Times(a,d)),Plus(Sqr(a),Sqr(b))),CN1)),x),Dist(Power(Times(Plus(m,C1),Subtract(Times(b,c),Times(a,d)),Plus(Sqr(a),Sqr(b))),CN1),Int(Times(Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),n),Simp(Subtract(Subtract(Plus(Times(b,BSymbol,Plus(Times(b,c,Plus(m,C1)),Times(a,d,Plus(n,C1)))),Times(ASymbol,Subtract(Times(a,Subtract(Times(b,c),Times(a,d)),Plus(m,C1)),Times(Sqr(b),d,Plus(m,n,C2))))),Times(Subtract(Times(ASymbol,b),Times(a,BSymbol)),Subtract(Times(b,c),Times(a,d)),Plus(m,C1),Tan(Plus(e,Times(f,x))))),Times(b,d,Subtract(Times(ASymbol,b),Times(a,BSymbol)),Plus(m,n,C2),Sqr(Tan(Plus(e,Times(f,x)))))),x)),x),x)),And(FreeQ(List(a,b,c,d,e,f,ASymbol,BSymbol,n),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),NeQ(Plus(Sqr(a),Sqr(b)),C0),NeQ(Plus(Sqr(c),Sqr(d)),C0),LtQ(m,CN1),Or(IntegerQ(m),IntegersQ(Times(C2,m),Times(C2,n))),Not(And(ILtQ(n,CN1),Or(Not(IntegerQ(m)),And(EqQ(c,C0),NeQ(a,C0))))))));
IIntegrate(3610,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Plus(A_DEFAULT,Times(B_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_)),x_Symbol),
    Condition(Plus(Simp(Times(BSymbol,Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),m),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),n),Power(Times(f,Plus(m,n)),CN1)),x),Dist(Power(Plus(m,n),CN1),Int(Times(Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Subtract(m,C1)),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),Subtract(n,C1)),Simp(Plus(Times(a,ASymbol,c,Plus(m,n)),Times(CN1,BSymbol,Plus(Times(b,c,m),Times(a,d,n))),Times(Subtract(Plus(Times(ASymbol,b,c),Times(a,BSymbol,c),Times(a,ASymbol,d)),Times(b,BSymbol,d)),Plus(m,n),Tan(Plus(e,Times(f,x)))),Times(Plus(Times(ASymbol,b,d,Plus(m,n)),Times(BSymbol,Plus(Times(a,d,m),Times(b,c,n)))),Sqr(Tan(Plus(e,Times(f,x)))))),x)),x),x)),And(FreeQ(List(a,b,c,d,e,f,ASymbol,BSymbol),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),NeQ(Plus(Sqr(a),Sqr(b)),C0),NeQ(Plus(Sqr(c),Sqr(d)),C0),LtQ(C0,m,C1),LtQ(C0,n,C1))));
IIntegrate(3611,Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1),Plus(A_DEFAULT,Times(B_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1)),x_Symbol),
    Condition(Plus(Simp(Times(Plus(Times(BSymbol,Plus(Times(b,c),Times(a,d))),Times(ASymbol,Subtract(Times(a,c),Times(b,d)))),x,Power(Times(Plus(Sqr(a),Sqr(b)),Plus(Sqr(c),Sqr(d))),CN1)),x),Dist(Times(b,Subtract(Times(ASymbol,b),Times(a,BSymbol)),Power(Times(Subtract(Times(b,c),Times(a,d)),Plus(Sqr(a),Sqr(b))),CN1)),Int(Times(Subtract(b,Times(a,Tan(Plus(e,Times(f,x))))),Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),CN1)),x),x),Dist(Times(d,Subtract(Times(BSymbol,c),Times(ASymbol,d)),Power(Times(Subtract(Times(b,c),Times(a,d)),Plus(Sqr(c),Sqr(d))),CN1)),Int(Times(Subtract(d,Times(c,Tan(Plus(e,Times(f,x))))),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e,f,ASymbol,BSymbol),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),NeQ(Plus(Sqr(a),Sqr(b)),C0),NeQ(Plus(Sqr(c),Sqr(d)),C0))));
IIntegrate(3612,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1),Plus(A_DEFAULT,Times(B_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),Sqrt(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),x_Symbol),
    Condition(Subtract(Dist(Power(Plus(Sqr(a),Sqr(b)),CN1),Int(Times(Simp(Subtract(Plus(Times(ASymbol,Plus(Times(a,c),Times(b,d))),Times(BSymbol,Subtract(Times(b,c),Times(a,d)))),Times(Subtract(Times(ASymbol,Subtract(Times(b,c),Times(a,d))),Times(BSymbol,Plus(Times(a,c),Times(b,d)))),Tan(Plus(e,Times(f,x))))),x),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),CN1D2)),x),x),Dist(Times(Subtract(Times(b,c),Times(a,d)),Subtract(Times(BSymbol,a),Times(ASymbol,b)),Power(Plus(Sqr(a),Sqr(b)),CN1)),Int(Times(Plus(C1,Sqr(Tan(Plus(e,Times(f,x))))),Power(Times(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Sqrt(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e,f,ASymbol,BSymbol),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),NeQ(Plus(Sqr(a),Sqr(b)),C0),NeQ(Plus(Sqr(c),Sqr(d)),C0))));
IIntegrate(3613,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1),Plus(A_DEFAULT,Times(B_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_)),x_Symbol),
    Condition(Plus(Dist(Power(Plus(Sqr(a),Sqr(b)),CN1),Int(Times(Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),n),Simp(Subtract(Plus(Times(a,ASymbol),Times(b,BSymbol)),Times(Subtract(Times(ASymbol,b),Times(a,BSymbol)),Tan(Plus(e,Times(f,x))))),x)),x),x),Dist(Times(b,Subtract(Times(ASymbol,b),Times(a,BSymbol)),Power(Plus(Sqr(a),Sqr(b)),CN1)),Int(Times(Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),n),Plus(C1,Sqr(Tan(Plus(e,Times(f,x))))),Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e,f,ASymbol,BSymbol,n),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),NeQ(Plus(Sqr(a),Sqr(b)),C0),NeQ(Plus(Sqr(c),Sqr(d)),C0))));
IIntegrate(3614,Int(Times(Sqrt(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Plus(A_DEFAULT,Times(B_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1D2)),x_Symbol),
    Condition(Plus(Int(Times(Simp(Plus(Times(a,ASymbol),Times(CN1,b,BSymbol),Times(Plus(Times(ASymbol,b),Times(a,BSymbol)),Tan(Plus(e,Times(f,x))))),x),Power(Times(Sqrt(Plus(a,Times(b,Tan(Plus(e,Times(f,x)))))),Sqrt(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))))),CN1)),x),Dist(Times(b,BSymbol),Int(Times(Plus(C1,Sqr(Tan(Plus(e,Times(f,x))))),Power(Times(Sqrt(Plus(a,Times(b,Tan(Plus(e,Times(f,x)))))),Sqrt(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e,f,ASymbol,BSymbol),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),NeQ(Plus(Sqr(a),Sqr(b)),C0),NeQ(Plus(Sqr(c),Sqr(d)),C0))));
IIntegrate(3615,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Plus(A_DEFAULT,Times(B_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_)),x_Symbol),
    Condition(Dist(Times(Sqr(ASymbol),Power(f,CN1)),Subst(Int(Times(Power(Plus(a,Times(b,x)),m),Power(Plus(c,Times(d,x)),n),Power(Subtract(ASymbol,Times(BSymbol,x)),CN1)),x),x,Tan(Plus(e,Times(f,x)))),x),And(FreeQ(List(a,b,c,d,e,f,ASymbol,BSymbol,m,n),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),NeQ(Plus(Sqr(a),Sqr(b)),C0),EqQ(Plus(Sqr(ASymbol),Sqr(BSymbol)),C0))));
IIntegrate(3616,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Plus(A_DEFAULT,Times(B_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_)),x_Symbol),
    Condition(Plus(Dist(Times(C1D2,Plus(ASymbol,Times(CI,BSymbol))),Int(Times(Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),m),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),n),Subtract(C1,Times(CI,Tan(Plus(e,Times(f,x)))))),x),x),Dist(Times(C1D2,Subtract(ASymbol,Times(CI,BSymbol))),Int(Times(Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),m),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),n),Plus(C1,Times(CI,Tan(Plus(e,Times(f,x)))))),x),x)),And(FreeQ(List(a,b,c,d,e,f,ASymbol,BSymbol,m,n),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),NeQ(Plus(Sqr(a),Sqr(b)),C0),NeQ(Plus(Sqr(ASymbol),Sqr(BSymbol)),C0))));
IIntegrate(3617,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT),Plus(A_,Times(C_DEFAULT,Sqr($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),x_Symbol),
    Condition(Dist(Times(ASymbol,Power(Times(b,f),CN1)),Subst(Int(Power(Plus(a,x),m),x),x,Times(b,Tan(Plus(e,Times(f,x))))),x),And(FreeQ(List(a,b,e,f,ASymbol,C,m),x),EqQ(ASymbol,C))));
IIntegrate(3618,Int(Times(Power(Plus(a_DEFAULT,Times($($s("§cot"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT)),m_DEFAULT),Plus(Times(Sqr($($s("§cot"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),C_DEFAULT),A_)),x_Symbol),
    Condition(Negate(Dist(Times(ASymbol,Power(Times(b,f),CN1)),Subst(Int(Power(Plus(a,x),m),x),x,Times(b,Cot(Plus(e,Times(f,x))))),x)),And(FreeQ(List(a,b,e,f,ASymbol,C,m),x),EqQ(ASymbol,C))));
IIntegrate(3619,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT),Plus(A_DEFAULT,Times(B_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),Times(C_DEFAULT,Sqr($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),x_Symbol),
    Condition(Dist(Power(b,CN2),Int(Times(Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Plus(m,C1)),Simp(Plus(Times(b,BSymbol),Times(CN1,a,C),Times(b,C,Tan(Plus(e,Times(f,x))))),x)),x),x),And(FreeQ(List(a,b,e,f,ASymbol,BSymbol,C,m),x),EqQ(Plus(Times(ASymbol,Sqr(b)),Times(CN1,a,b,BSymbol),Times(Sqr(a),C)),C0))));
IIntegrate(3620,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT),Plus(A_DEFAULT,Times(C_DEFAULT,Sqr($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),x_Symbol),
    Condition(Negate(Dist(Times(C,Power(b,CN2)),Int(Times(Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Plus(m,C1)),Subtract(a,Times(b,Tan(Plus(e,Times(f,x)))))),x),x)),And(FreeQ(List(a,b,e,f,ASymbol,C,m),x),EqQ(Plus(Times(ASymbol,Sqr(b)),Times(Sqr(a),C)),C0))));
IIntegrate(3621,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT),Plus(A_DEFAULT,Times(B_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),Times(C_DEFAULT,Sqr($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Subtract(Plus(Times(a,ASymbol),Times(b,BSymbol)),Times(a,C)),Tan(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),m),Power(Times(C2,a,f,m),CN1)),x)),Dist(Power(Times(C2,Sqr(a),m),CN1),Int(Times(Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Plus(m,C1)),Simp(Subtract(Plus(Times(b,BSymbol),Times(CN1,a,C),Times(a,ASymbol,Plus(Times(C2,m),C1))),Times(Plus(Times(b,C,Subtract(m,C1)),Times(Subtract(Times(ASymbol,b),Times(a,BSymbol)),Plus(m,C1))),Tan(Plus(e,Times(f,x))))),x)),x),x)),And(FreeQ(List(a,b,e,f,ASymbol,BSymbol,C),x),NeQ(Plus(Times(ASymbol,Sqr(b)),Times(CN1,a,b,BSymbol),Times(Sqr(a),C)),C0),LeQ(m,CN1),EqQ(Plus(Sqr(a),Sqr(b)),C0))));
IIntegrate(3622,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT),Plus(A_DEFAULT,Times(C_DEFAULT,Sqr($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Subtract(Times(a,ASymbol),Times(a,C)),Tan(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),m),Power(Times(C2,a,f,m),CN1)),x)),Dist(Power(Times(C2,Sqr(a),m),CN1),Int(Times(Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Plus(m,C1)),Simp(Subtract(Plus(Times(CN1,a,C),Times(a,ASymbol,Plus(Times(C2,m),C1))),Times(Plus(Times(b,C,Subtract(m,C1)),Times(ASymbol,b,Plus(m,C1))),Tan(Plus(e,Times(f,x))))),x)),x),x)),And(FreeQ(List(a,b,e,f,ASymbol,C),x),NeQ(Plus(Times(ASymbol,Sqr(b)),Times(Sqr(a),C)),C0),LeQ(m,CN1),EqQ(Plus(Sqr(a),Sqr(b)),C0))));
IIntegrate(3623,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1),Plus(A_,Times(B_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),Times(C_DEFAULT,Sqr($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),x_Symbol),
    Condition(Plus(Simp(Times(Subtract(Plus(Times(a,ASymbol),Times(b,BSymbol)),Times(a,C)),x,Power(Plus(Sqr(a),Sqr(b)),CN1)),x),Dist(Times(Plus(Times(ASymbol,Sqr(b)),Times(CN1,a,b,BSymbol),Times(Sqr(a),C)),Power(Plus(Sqr(a),Sqr(b)),CN1)),Int(Times(Plus(C1,Sqr(Tan(Plus(e,Times(f,x))))),Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),CN1)),x),x)),And(FreeQ(List(a,b,e,f,ASymbol,BSymbol,C),x),NeQ(Plus(Sqr(a),Sqr(b)),C0),EqQ(Subtract(Subtract(Times(ASymbol,b),Times(a,BSymbol)),Times(b,C)),C0))));
IIntegrate(3624,Int(Times(Power($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),CN1),Plus(A_,Times(B_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),Times(C_DEFAULT,Sqr($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),x_Symbol),
    Condition(Plus(Simp(Times(BSymbol,x),x),Dist(ASymbol,Int(Power(Tan(Plus(e,Times(f,x))),CN1),x),x),Dist(C,Int(Tan(Plus(e,Times(f,x))),x),x)),And(FreeQ(List(e,f,ASymbol,BSymbol,C),x),NeQ(ASymbol,C))));
IIntegrate(3625,Int(Times(Power($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),CN1),Plus(A_,Times(C_DEFAULT,Sqr($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),x_Symbol),
    Condition(Plus(Dist(ASymbol,Int(Power(Tan(Plus(e,Times(f,x))),CN1),x),x),Dist(C,Int(Tan(Plus(e,Times(f,x))),x),x)),And(FreeQ(List(e,f,ASymbol,C),x),NeQ(ASymbol,C))));
  }
}
}