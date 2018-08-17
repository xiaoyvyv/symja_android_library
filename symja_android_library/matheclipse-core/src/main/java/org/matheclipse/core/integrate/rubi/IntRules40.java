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
public class IntRules40 { 
  public static IAST RULES = List( 
IIntegrate(6074,Int(Power(Plus(Times(a_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),Plus(p,C1)),Power(Times(a,Plus(n,Negate(j)),Plus(p,C1),Power(x,Plus(j,Negate(C1)))),-1)),x)),Dist(Times(Plus(Times(n,p),n,Negate(j),C1),Power(Times(a,Plus(n,Negate(j)),Plus(p,C1)),-1)),Int(Times(Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),Plus(p,C1)),Power(Power(x,j),-1)),x),x)),And(FreeQ(List(a,b,j,n),x),Not(IntegerQ(p)),NeQ(n,j),ILtQ(Simplify(Times(Plus(Times(n,p),n,Negate(j),C1),Power(Plus(n,Negate(j)),-1))),C0),LtQ(p,CN1)))),
IIntegrate(6075,Int(Power(Plus(Times(a_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),Plus(p,C1)),Power(Times(a,Plus(Times(j,p),C1),Power(x,Plus(j,Negate(C1)))),-1)),x),Negate(Dist(Times(b,Plus(Times(n,p),n,Negate(j),C1),Power(Times(a,Plus(Times(j,p),C1)),-1)),Int(Times(Power(x,Plus(n,Negate(j))),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),p)),x),x))),And(FreeQ(List(a,b,j,n,p),x),Not(IntegerQ(p)),NeQ(n,j),ILtQ(Simplify(Times(Plus(Times(n,p),n,Negate(j),C1),Power(Plus(n,Negate(j)),-1))),C0),NeQ(Plus(Times(j,p),C1),C0)))),
IIntegrate(6076,Int(Power(Plus(Times(a_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_),x_Symbol),
    Condition(Plus(Simp(Times(x,Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),p),Power(Plus(Times(j,p),C1),-1)),x),Negate(Dist(Times(b,Plus(n,Negate(j)),p,Power(Plus(Times(j,p),C1),-1)),Int(Times(Power(x,n),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),Plus(p,Negate(C1)))),x),x))),And(FreeQ(List(a,b),x),Not(IntegerQ(p)),LtQ(C0,j,n),GtQ(p,C0),LtQ(Plus(Times(j,p),C1),C0)))),
IIntegrate(6077,Int(Power(Plus(Times(a_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_),x_Symbol),
    Condition(Plus(Simp(Times(x,Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),p),Power(Plus(Times(n,p),C1),-1)),x),Dist(Times(a,Plus(n,Negate(j)),p,Power(Plus(Times(n,p),C1),-1)),Int(Times(Power(x,j),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),Plus(p,Negate(C1)))),x),x)),And(FreeQ(List(a,b),x),Not(IntegerQ(p)),LtQ(C0,j,n),GtQ(p,C0),NeQ(Plus(Times(n,p),C1),C0)))),
IIntegrate(6078,Int(Power(Plus(Times(a_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),Plus(p,C1)),Power(Times(b,Plus(n,Negate(j)),Plus(p,C1),Power(x,Plus(n,Negate(C1)))),-1)),x),Negate(Dist(Times(Plus(Times(j,p),Negate(n),j,C1),Power(Times(b,Plus(n,Negate(j)),Plus(p,C1)),-1)),Int(Times(Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),Plus(p,C1)),Power(Power(x,n),-1)),x),x))),And(FreeQ(List(a,b),x),Not(IntegerQ(p)),LtQ(C0,j,n),LtQ(p,CN1),GtQ(Plus(Times(j,p),C1),Plus(n,Negate(j)))))),
IIntegrate(6079,Int(Power(Plus(Times(a_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),Plus(p,C1)),Power(Times(a,Plus(n,Negate(j)),Plus(p,C1),Power(x,Plus(j,Negate(C1)))),-1)),x)),Dist(Times(Plus(Times(n,p),n,Negate(j),C1),Power(Times(a,Plus(n,Negate(j)),Plus(p,C1)),-1)),Int(Times(Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),Plus(p,C1)),Power(Power(x,j),-1)),x),x)),And(FreeQ(List(a,b),x),Not(IntegerQ(p)),LtQ(C0,j,n),LtQ(p,CN1)))),
IIntegrate(6080,Int(Power(Plus(Times(a_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_),x_Symbol),
    Condition(Plus(Simp(Times(x,Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),p),Power(Times(p,Plus(n,Negate(j))),-1)),x),Dist(a,Int(Times(Power(x,j),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),Plus(p,Negate(C1)))),x),x)),And(FreeQ(List(a,b,j,n),x),IGtQ(Plus(p,C1D2),C0),NeQ(n,j),EqQ(Simplify(Plus(Times(j,p),C1)),C0)))),
IIntegrate(6081,Int(Power(Plus(Times(a_DEFAULT,Sqr(x_)),Times(b_DEFAULT,Power(x_,n_DEFAULT))),CN1D2),x_Symbol),
    Condition(Dist(Times(C2,Power(Plus(C2,Negate(n)),-1)),Subst(Int(Power(Plus(C1,Times(CN1,a,Sqr(x))),-1),x),x,Times(x,Power(Plus(Times(a,Sqr(x)),Times(b,Power(x,n))),CN1D2))),x),And(FreeQ(List(a,b,n),x),NeQ(n,C2)))),
IIntegrate(6082,Int(Power(Plus(Times(a_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),Plus(p,C1)),Power(Times(a,Plus(n,Negate(j)),Plus(p,C1),Power(x,Plus(j,Negate(C1)))),-1)),x)),Dist(Times(Plus(Times(n,p),n,Negate(j),C1),Power(Times(a,Plus(n,Negate(j)),Plus(p,C1)),-1)),Int(Times(Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),Plus(p,C1)),Power(Power(x,j),-1)),x),x)),And(FreeQ(List(a,b,j,n),x),ILtQ(Plus(p,C1D2),C0),NeQ(n,j),EqQ(Simplify(Plus(Times(j,p),C1)),C0)))),
IIntegrate(6083,Int(Power(Plus(Times(a_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,n_DEFAULT))),CN1D2),x_Symbol),
    Condition(Plus(Simp(Times(CN2,Sqrt(Plus(Times(a,Power(x,j)),Times(b,Power(x,n)))),Power(Times(b,Plus(n,Negate(C2)),Power(x,Plus(n,Negate(C1)))),-1)),x),Negate(Dist(Times(a,Plus(Times(C2,n),Negate(j),Negate(C2)),Power(Times(b,Plus(n,Negate(C2))),-1)),Int(Power(Times(Power(x,Plus(n,Negate(j))),Sqrt(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))))),-1),x),x))),And(FreeQ(List(a,b),x),LtQ(Times(C2,Plus(n,Negate(C1))),j,n)))),
IIntegrate(6084,Int(Power(Plus(Times(a_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_),x_Symbol),
    Condition(Dist(Times(Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),FracPart(p)),Power(Times(Power(x,Times(j,FracPart(p))),Power(Plus(a,Times(b,Power(x,Plus(n,Negate(j))))),FracPart(p))),-1)),Int(Times(Power(x,Times(j,p)),Power(Plus(a,Times(b,Power(x,Plus(n,Negate(j))))),p)),x),x),And(FreeQ(List(a,b,j,n,p),x),Not(IntegerQ(p)),NeQ(n,j),PosQ(Plus(n,Negate(j)))))),
IIntegrate(6085,Int(Power(Plus(Times(a_DEFAULT,Power(u_,j_DEFAULT)),Times(b_DEFAULT,Power(u_,n_DEFAULT))),p_),x_Symbol),
    Condition(Dist(Power(Coefficient(u,x,C1),-1),Subst(Int(Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),p),x),x,u),x),And(FreeQ(List(a,b,j,n,p),x),LinearQ(u,x),NeQ(u,x)))),
IIntegrate(6086,Int(Times(Power(x_,m_DEFAULT),Power(Plus(Times(a_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(Dist(Power(n,-1),Subst(Int(Power(Plus(Times(a,Power(x,Simplify(Times(j,Power(n,-1))))),Times(b,x)),p),x),x,Power(x,n)),x),And(FreeQ(List(a,b,j,m,n,p),x),Not(IntegerQ(p)),NeQ(n,j),IntegerQ(Simplify(Times(j,Power(n,-1)))),EqQ(Simplify(Plus(m,Negate(n),C1)),C0)))),
IIntegrate(6087,Int(Times(Power(Times(c_DEFAULT,x_),m_DEFAULT),Power(Plus(Times(a_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_)),x_Symbol),
    Condition(Negate(Simp(Times(Power(c,Plus(j,Negate(C1))),Power(Times(c,x),Plus(m,Negate(j),C1)),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),Plus(p,C1)),Power(Times(a,Plus(n,Negate(j)),Plus(p,C1)),-1)),x)),And(FreeQ(List(a,b,c,j,m,n,p),x),Not(IntegerQ(p)),NeQ(n,j),EqQ(Plus(m,Times(n,p),n,Negate(j),C1),C0),Or(IntegerQ(j),GtQ(c,C0))))),
IIntegrate(6088,Int(Times(Power(Times(c_DEFAULT,x_),m_DEFAULT),Power(Plus(Times(a_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(c,Plus(j,Negate(C1))),Power(Times(c,x),Plus(m,Negate(j),C1)),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),Plus(p,C1)),Power(Times(a,Plus(n,Negate(j)),Plus(p,C1)),-1)),x)),Dist(Times(Power(c,j),Plus(m,Times(n,p),n,Negate(j),C1),Power(Times(a,Plus(n,Negate(j)),Plus(p,C1)),-1)),Int(Times(Power(Times(c,x),Plus(m,Negate(j))),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),Plus(p,C1))),x),x)),And(FreeQ(List(a,b,c,j,m,n),x),Not(IntegerQ(p)),NeQ(n,j),ILtQ(Simplify(Times(Plus(m,Times(n,p),n,Negate(j),C1),Power(Plus(n,Negate(j)),-1))),C0),LtQ(p,CN1),Or(IntegerQ(j),GtQ(c,C0))))),
IIntegrate(6089,Int(Times(Power(Times(c_DEFAULT,x_),m_DEFAULT),Power(Plus(Times(a_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(c,Plus(j,Negate(C1))),Power(Times(c,x),Plus(m,Negate(j),C1)),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),Plus(p,C1)),Power(Times(a,Plus(m,Times(j,p),C1)),-1)),x),Negate(Dist(Times(b,Plus(m,Times(n,p),n,Negate(j),C1),Power(Times(a,Power(c,Plus(n,Negate(j))),Plus(m,Times(j,p),C1)),-1)),Int(Times(Power(Times(c,x),Plus(m,n,Negate(j))),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),p)),x),x))),And(FreeQ(List(a,b,c,j,m,n,p),x),Not(IntegerQ(p)),NeQ(n,j),ILtQ(Simplify(Times(Plus(m,Times(n,p),n,Negate(j),C1),Power(Plus(n,Negate(j)),-1))),C0),NeQ(Plus(m,Times(j,p),C1),C0),Or(IntegersQ(j,n),GtQ(c,C0))))),
IIntegrate(6090,Int(Times(Power(Times(c_,x_),m_DEFAULT),Power(Plus(Times(a_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_)),x_Symbol),
    Condition(Dist(Times(Power(c,IntPart(m)),Power(Times(c,x),FracPart(m)),Power(Power(x,FracPart(m)),-1)),Int(Times(Power(x,m),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),p)),x),x),And(FreeQ(List(a,b,c,j,m,n,p),x),Not(IntegerQ(p)),NeQ(n,j),ILtQ(Simplify(Times(Plus(m,Times(n,p),n,Negate(j),C1),Power(Plus(n,Negate(j)),-1))),C0)))),
IIntegrate(6091,Int(Times(Power(x_,m_DEFAULT),Power(Plus(Times(a_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(Dist(Power(n,-1),Subst(Int(Times(Power(x,Plus(Simplify(Times(Plus(m,C1),Power(n,-1))),Negate(C1))),Power(Plus(Times(a,Power(x,Simplify(Times(j,Power(n,-1))))),Times(b,x)),p)),x),x,Power(x,n)),x),And(FreeQ(List(a,b,j,m,n,p),x),Not(IntegerQ(p)),NeQ(n,j),IntegerQ(Simplify(Times(j,Power(n,-1)))),IntegerQ(Simplify(Times(Plus(m,C1),Power(n,-1)))),NeQ(Sqr(n),C1)))),
IIntegrate(6092,Int(Times(Power(Times(c_,x_),m_DEFAULT),Power(Plus(Times(a_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(Dist(Times(Power(c,IntPart(m)),Power(Times(c,x),FracPart(m)),Power(Power(x,FracPart(m)),-1)),Int(Times(Power(x,m),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),p)),x),x),And(FreeQ(List(a,b,c,j,m,n,p),x),Not(IntegerQ(p)),NeQ(n,j),IntegerQ(Simplify(Times(j,Power(n,-1)))),IntegerQ(Simplify(Times(Plus(m,C1),Power(n,-1)))),NeQ(Sqr(n),C1)))),
IIntegrate(6093,Int(Times(Power(Times(c_DEFAULT,x_),m_),Power(Plus(Times(a_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(c,x),Plus(m,C1)),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),p),Power(Times(c,Plus(m,Times(j,p),C1)),-1)),x),Negate(Dist(Times(b,p,Plus(n,Negate(j)),Power(Times(Power(c,n),Plus(m,Times(j,p),C1)),-1)),Int(Times(Power(Times(c,x),Plus(m,n)),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),Plus(p,Negate(C1)))),x),x))),And(FreeQ(List(a,b,c),x),Not(IntegerQ(p)),LtQ(C0,j,n),Or(IntegersQ(j,n),GtQ(c,C0)),GtQ(p,C0),LtQ(Plus(m,Times(j,p),C1),C0)))),
IIntegrate(6094,Int(Times(Power(Times(c_DEFAULT,x_),m_DEFAULT),Power(Plus(Times(a_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(c,x),Plus(m,C1)),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),p),Power(Times(c,Plus(m,Times(n,p),C1)),-1)),x),Dist(Times(a,Plus(n,Negate(j)),p,Power(Times(Power(c,j),Plus(m,Times(n,p),C1)),-1)),Int(Times(Power(Times(c,x),Plus(m,j)),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),Plus(p,Negate(C1)))),x),x)),And(FreeQ(List(a,b,c,m),x),Not(IntegerQ(p)),LtQ(C0,j,n),Or(IntegersQ(j,n),GtQ(c,C0)),GtQ(p,C0),NeQ(Plus(m,Times(n,p),C1),C0)))),
IIntegrate(6095,Int(Times(Power(Times(c_DEFAULT,x_),m_DEFAULT),Power(Plus(Times(a_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(c,Plus(n,Negate(C1))),Power(Times(c,x),Plus(m,Negate(n),C1)),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),Plus(p,C1)),Power(Times(b,Plus(n,Negate(j)),Plus(p,C1)),-1)),x),Negate(Dist(Times(Power(c,n),Plus(m,Times(j,p),Negate(n),j,C1),Power(Times(b,Plus(n,Negate(j)),Plus(p,C1)),-1)),Int(Times(Power(Times(c,x),Plus(m,Negate(n))),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),Plus(p,C1))),x),x))),And(FreeQ(List(a,b,c),x),Not(IntegerQ(p)),LtQ(C0,j,n),Or(IntegersQ(j,n),GtQ(c,C0)),LtQ(p,CN1),GtQ(Plus(m,Times(j,p),C1),Plus(n,Negate(j)))))),
IIntegrate(6096,Int(Times(Power(Times(c_DEFAULT,x_),m_DEFAULT),Power(Plus(Times(a_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(c,Plus(j,Negate(C1))),Power(Times(c,x),Plus(m,Negate(j),C1)),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),Plus(p,C1)),Power(Times(a,Plus(n,Negate(j)),Plus(p,C1)),-1)),x)),Dist(Times(Power(c,j),Plus(m,Times(n,p),n,Negate(j),C1),Power(Times(a,Plus(n,Negate(j)),Plus(p,C1)),-1)),Int(Times(Power(Times(c,x),Plus(m,Negate(j))),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),Plus(p,C1))),x),x)),And(FreeQ(List(a,b,c,m),x),Not(IntegerQ(p)),LtQ(C0,j,n),Or(IntegersQ(j,n),GtQ(c,C0)),LtQ(p,CN1)))),
IIntegrate(6097,Int(Times(Power(Times(c_DEFAULT,x_),m_DEFAULT),Power(Plus(Times(a_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(c,Plus(n,Negate(C1))),Power(Times(c,x),Plus(m,Negate(n),C1)),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),Plus(p,C1)),Power(Times(b,Plus(m,Times(n,p),C1)),-1)),x),Negate(Dist(Times(a,Power(c,Plus(n,Negate(j))),Plus(m,Times(j,p),Negate(n),j,C1),Power(Times(b,Plus(m,Times(n,p),C1)),-1)),Int(Times(Power(Times(c,x),Plus(m,Negate(Plus(n,Negate(j))))),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),p)),x),x))),And(FreeQ(List(a,b,c,m,p),x),Not(IntegerQ(p)),LtQ(C0,j,n),Or(IntegersQ(j,n),GtQ(c,C0)),GtQ(Plus(m,Times(j,p),C1,Negate(n),j),C0),NeQ(Plus(m,Times(n,p),C1),C0)))),
IIntegrate(6098,Int(Times(Power(Times(c_DEFAULT,x_),m_DEFAULT),Power(Plus(Times(a_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(c,Plus(j,Negate(C1))),Power(Times(c,x),Plus(m,Negate(j),C1)),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),Plus(p,C1)),Power(Times(a,Plus(m,Times(j,p),C1)),-1)),x),Negate(Dist(Times(b,Plus(m,Times(n,p),n,Negate(j),C1),Power(Times(a,Power(c,Plus(n,Negate(j))),Plus(m,Times(j,p),C1)),-1)),Int(Times(Power(Times(c,x),Plus(m,n,Negate(j))),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),p)),x),x))),And(FreeQ(List(a,b,c,m,p),x),Not(IntegerQ(p)),LtQ(C0,j,n),Or(IntegersQ(j,n),GtQ(c,C0)),LtQ(Plus(m,Times(j,p),C1),C0)))),
IIntegrate(6099,Int(Times(Power(x_,m_DEFAULT),Power(Plus(Times(a_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(Dist(Power(Plus(m,C1),-1),Subst(Int(Power(Plus(Times(a,Power(x,Simplify(Times(j,Power(Plus(m,C1),-1))))),Times(b,Power(x,Simplify(Times(n,Power(Plus(m,C1),-1)))))),p),x),x,Power(x,Plus(m,C1))),x),And(FreeQ(List(a,b,j,m,n,p),x),Not(IntegerQ(p)),NeQ(n,j),IntegerQ(Simplify(Times(j,Power(n,-1)))),NeQ(m,CN1),IntegerQ(Simplify(Times(n,Power(Plus(m,C1),-1)))),Not(IntegerQ(n))))),
IIntegrate(6100,Int(Times(Power(Times(c_,x_),m_DEFAULT),Power(Plus(Times(a_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(Dist(Times(Power(c,IntPart(m)),Power(Times(c,x),FracPart(m)),Power(Power(x,FracPart(m)),-1)),Int(Times(Power(x,m),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),p)),x),x),And(FreeQ(List(a,b,c,j,m,n,p),x),Not(IntegerQ(p)),NeQ(n,j),IntegerQ(Simplify(Times(j,Power(n,-1)))),NeQ(m,CN1),IntegerQ(Simplify(Times(n,Power(Plus(m,C1),-1)))),Not(IntegerQ(n))))),
IIntegrate(6101,Int(Times(Power(Times(c_DEFAULT,x_),m_DEFAULT),Power(Plus(Times(a_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(c,x),Plus(m,C1)),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),p),Power(Times(c,p,Plus(n,Negate(j))),-1)),x),Dist(Times(a,Power(Power(c,j),-1)),Int(Times(Power(Times(c,x),Plus(m,j)),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),Plus(p,Negate(C1)))),x),x)),And(FreeQ(List(a,b,c,j,m,n),x),IGtQ(Plus(p,C1D2),C0),NeQ(n,j),EqQ(Simplify(Plus(m,Times(j,p),C1)),C0),Or(IntegerQ(j),GtQ(c,C0))))),
IIntegrate(6102,Int(Times(Power(x_,m_DEFAULT),Power(Plus(Times(a_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,n_DEFAULT))),CN1D2)),x_Symbol),
    Condition(Dist(Times(CN2,Power(Plus(n,Negate(j)),-1)),Subst(Int(Power(Plus(C1,Times(CN1,a,Sqr(x))),-1),x),x,Times(Power(x,Times(C1D2,j)),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),CN1D2))),x),And(FreeQ(List(a,b,j,n),x),EqQ(m,Plus(Times(C1D2,j),Negate(C1))),NeQ(n,j)))),
IIntegrate(6103,Int(Times(Power(Times(c_DEFAULT,x_),m_DEFAULT),Power(Plus(Times(a_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(c,Plus(j,Negate(C1))),Power(Times(c,x),Plus(m,Negate(j),C1)),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),Plus(p,C1)),Power(Times(a,Plus(n,Negate(j)),Plus(p,C1)),-1)),x)),Dist(Times(Power(c,j),Plus(m,Times(n,p),n,Negate(j),C1),Power(Times(a,Plus(n,Negate(j)),Plus(p,C1)),-1)),Int(Times(Power(Times(c,x),Plus(m,Negate(j))),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),Plus(p,C1))),x),x)),And(FreeQ(List(a,b,c,j,m,n),x),ILtQ(Plus(p,C1D2),C0),NeQ(n,j),EqQ(Simplify(Plus(m,Times(j,p),C1)),C0),Or(IntegerQ(j),GtQ(c,C0))))),
IIntegrate(6104,Int(Times(Power(Times(c_,x_),m_DEFAULT),Power(Plus(Times(a_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(Dist(Times(Power(c,IntPart(m)),Power(Times(c,x),FracPart(m)),Power(Power(x,FracPart(m)),-1)),Int(Times(Power(x,m),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),p)),x),x),And(FreeQ(List(a,b,c,j,m,n,p),x),IntegerQ(Plus(p,C1D2)),NeQ(n,j),EqQ(Simplify(Plus(m,Times(j,p),C1)),C0)))),
IIntegrate(6105,Int(Times(Power(Times(c_DEFAULT,x_),m_DEFAULT),Power(Plus(Times(a_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_)),x_Symbol),
    Condition(Dist(Times(Power(c,IntPart(m)),Power(Times(c,x),FracPart(m)),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),FracPart(p)),Power(Times(Power(x,Plus(FracPart(m),Times(j,FracPart(p)))),Power(Plus(a,Times(b,Power(x,Plus(n,Negate(j))))),FracPart(p))),-1)),Int(Times(Power(x,Plus(m,Times(j,p))),Power(Plus(a,Times(b,Power(x,Plus(n,Negate(j))))),p)),x),x),And(FreeQ(List(a,b,c,j,m,n,p),x),Not(IntegerQ(p)),NeQ(n,j),PosQ(Plus(n,Negate(j)))))),
IIntegrate(6106,Int(Times(Power(u_,m_DEFAULT),Power(Plus(Times(a_DEFAULT,Power(v_,j_DEFAULT)),Times(b_DEFAULT,Power(v_,n_DEFAULT))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(u,m),Power(Times(Coefficient(v,x,C1),Power(v,m)),-1)),Subst(Int(Times(Power(x,m),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),p)),x),x,v),x),And(FreeQ(List(a,b,j,m,n,p),x),LinearPairQ(u,v,x)))),
IIntegrate(6107,Int(Times(Power(x_,m_DEFAULT),Power(Plus(Times(a_DEFAULT,Power(x_,j_)),Times(b_DEFAULT,Power(x_,k_DEFAULT))),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),q_DEFAULT)),x_Symbol),
    Condition(Dist(Power(n,-1),Subst(Int(Times(Power(x,Plus(Simplify(Times(Plus(m,C1),Power(n,-1))),Negate(C1))),Power(Plus(Times(a,Power(x,Simplify(Times(j,Power(n,-1))))),Times(b,Power(x,Simplify(Times(k,Power(n,-1)))))),p),Power(Plus(c,Times(d,x)),q)),x),x,Power(x,n)),x),And(FreeQ(List(a,b,c,d,j,k,m,n,p,q),x),Not(IntegerQ(p)),NeQ(k,j),IntegerQ(Simplify(Times(j,Power(n,-1)))),IntegerQ(Simplify(Times(k,Power(n,-1)))),IntegerQ(Simplify(Times(Plus(m,C1),Power(n,-1)))),NeQ(Sqr(n),C1)))),
IIntegrate(6108,Int(Times(Power(Times(e_,x_),m_DEFAULT),Power(Plus(Times(a_DEFAULT,Power(x_,j_)),Times(b_DEFAULT,Power(x_,k_DEFAULT))),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_DEFAULT))),q_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(e,IntPart(m)),Power(Times(e,x),FracPart(m)),Power(Power(x,FracPart(m)),-1)),Int(Times(Power(x,m),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,k))),p),Power(Plus(c,Times(d,Power(x,n))),q)),x),x),And(FreeQ(List(a,b,c,d,e,j,k,m,n,p,q),x),Not(IntegerQ(p)),NeQ(k,j),IntegerQ(Simplify(Times(j,Power(n,-1)))),IntegerQ(Simplify(Times(k,Power(n,-1)))),IntegerQ(Simplify(Times(Plus(m,C1),Power(n,-1)))),NeQ(Sqr(n),C1)))),
IIntegrate(6109,Int(Times(Plus(c_,Times(d_DEFAULT,Power(x_,n_DEFAULT))),Power(Times(e_DEFAULT,x_),m_DEFAULT),Power(Plus(Times(a_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,$p("jn",true)))),p_)),x_Symbol),
    Condition(Simp(Times(c,Power(e,Plus(j,Negate(C1))),Power(Times(e,x),Plus(m,Negate(j),C1)),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,Plus(j,n)))),Plus(p,C1)),Power(Times(a,Plus(m,Times(j,p),C1)),-1)),x),And(FreeQ(List(a,b,c,d,e,j,m,n,p),x),EqQ($s("jn"),Plus(j,n)),Not(IntegerQ(p)),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),EqQ(Plus(Times(a,d,Plus(m,Times(j,p),C1)),Times(CN1,b,c,Plus(m,n,Times(p,Plus(j,n)),C1))),C0),Or(GtQ(e,C0),IntegersQ(j)),NeQ(Plus(m,Times(j,p),C1),C0)))),
IIntegrate(6110,Int(Times(Plus(c_,Times(d_DEFAULT,Power(x_,n_DEFAULT))),Power(Times(e_DEFAULT,x_),m_DEFAULT),Power(Plus(Times(a_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,$p("jn",true)))),p_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(e,Plus(j,Negate(C1))),Plus(Times(b,c),Times(CN1,a,d)),Power(Times(e,x),Plus(m,Negate(j),C1)),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,Plus(j,n)))),Plus(p,C1)),Power(Times(a,b,n,Plus(p,C1)),-1)),x)),Negate(Dist(Times(Power(e,j),Plus(Times(a,d,Plus(m,Times(j,p),C1)),Times(CN1,b,c,Plus(m,n,Times(p,Plus(j,n)),C1))),Power(Times(a,b,n,Plus(p,C1)),-1)),Int(Times(Power(Times(e,x),Plus(m,Negate(j))),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,Plus(j,n)))),Plus(p,C1))),x),x))),And(FreeQ(List(a,b,c,d,e,j,m,n),x),EqQ($s("jn"),Plus(j,n)),Not(IntegerQ(p)),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),LtQ(p,CN1),GtQ(j,C0),LeQ(j,m),Or(GtQ(e,C0),IntegerQ(j))))),
IIntegrate(6111,Int(Times(Plus(c_,Times(d_DEFAULT,Power(x_,n_DEFAULT))),Power(Times(e_DEFAULT,x_),m_DEFAULT),Power(Plus(Times(a_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,$p("jn",true)))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(c,Power(e,Plus(j,Negate(C1))),Power(Times(e,x),Plus(m,Negate(j),C1)),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,Plus(j,n)))),Plus(p,C1)),Power(Times(a,Plus(m,Times(j,p),C1)),-1)),x),Dist(Times(Plus(Times(a,d,Plus(m,Times(j,p),C1)),Times(CN1,b,c,Plus(m,n,Times(p,Plus(j,n)),C1))),Power(Times(a,Power(e,n),Plus(m,Times(j,p),C1)),-1)),Int(Times(Power(Times(e,x),Plus(m,n)),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,Plus(j,n)))),p)),x),x)),And(FreeQ(List(a,b,c,d,e,j,p),x),EqQ($s("jn"),Plus(j,n)),Not(IntegerQ(p)),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),GtQ(n,C0),Or(LtQ(Plus(m,Times(j,p)),CN1),And(IntegersQ(Plus(m,Negate(C1D2)),Plus(p,Negate(C1D2))),LtQ(p,C0),LtQ(m,Plus(Times(CN1,n,p),Negate(C1))))),Or(GtQ(e,C0),IntegersQ(j,n)),NeQ(Plus(m,Times(j,p),C1),C0),NeQ(Plus(m,Negate(n),Times(j,p),C1),C0)))),
IIntegrate(6112,Int(Times(Plus(c_,Times(d_DEFAULT,Power(x_,n_DEFAULT))),Power(Times(e_DEFAULT,x_),m_DEFAULT),Power(Plus(Times(a_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,$p("jn",true)))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(d,Power(e,Plus(j,Negate(C1))),Power(Times(e,x),Plus(m,Negate(j),C1)),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,Plus(j,n)))),Plus(p,C1)),Power(Times(b,Plus(m,n,Times(p,Plus(j,n)),C1)),-1)),x),Negate(Dist(Times(Plus(Times(a,d,Plus(m,Times(j,p),C1)),Times(CN1,b,c,Plus(m,n,Times(p,Plus(j,n)),C1))),Power(Times(b,Plus(m,n,Times(p,Plus(j,n)),C1)),-1)),Int(Times(Power(Times(e,x),m),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,Plus(j,n)))),p)),x),x))),And(FreeQ(List(a,b,c,d,e,j,m,n,p),x),EqQ($s("jn"),Plus(j,n)),Not(IntegerQ(p)),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),NeQ(Plus(m,n,Times(p,Plus(j,n)),C1),C0),Or(GtQ(e,C0),IntegerQ(j))))),
IIntegrate(6113,Int(Times(Power(x_,m_DEFAULT),Power(Plus(Times(a_DEFAULT,Power(x_,j_)),Times(b_DEFAULT,Power(x_,k_DEFAULT))),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_DEFAULT))),q_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Plus(m,C1),-1),Subst(Int(Times(Power(Plus(Times(a,Power(x,Simplify(Times(j,Power(Plus(m,C1),-1))))),Times(b,Power(x,Simplify(Times(k,Power(Plus(m,C1),-1)))))),p),Power(Plus(c,Times(d,Power(x,Simplify(Times(n,Power(Plus(m,C1),-1)))))),q)),x),x,Power(x,Plus(m,C1))),x),And(FreeQ(List(a,b,c,d,j,k,m,n,p,q),x),Not(IntegerQ(p)),NeQ(k,j),IntegerQ(Simplify(Times(j,Power(n,-1)))),IntegerQ(Simplify(Times(k,Power(n,-1)))),NeQ(m,CN1),IntegerQ(Simplify(Times(n,Power(Plus(m,C1),-1)))),Not(IntegerQ(n))))),
IIntegrate(6114,Int(Times(Power(Times(e_,x_),m_DEFAULT),Power(Plus(Times(a_DEFAULT,Power(x_,j_)),Times(b_DEFAULT,Power(x_,k_DEFAULT))),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_DEFAULT))),q_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(e,IntPart(m)),Power(Times(e,x),FracPart(m)),Power(Power(x,FracPart(m)),-1)),Int(Times(Power(x,m),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,k))),p),Power(Plus(c,Times(d,Power(x,n))),q)),x),x),And(FreeQ(List(a,b,c,d,e,j,k,m,n,p,q),x),Not(IntegerQ(p)),NeQ(k,j),IntegerQ(Simplify(Times(j,Power(n,-1)))),IntegerQ(Simplify(Times(k,Power(n,-1)))),NeQ(m,CN1),IntegerQ(Simplify(Times(n,Power(Plus(m,C1),-1)))),Not(IntegerQ(n))))),
IIntegrate(6115,Int(Times(Power(Times(e_DEFAULT,x_),m_DEFAULT),Power(Plus(Times(a_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,$p("jn",true)))),p_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_DEFAULT))),q_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(e,IntPart(m)),Power(Times(e,x),FracPart(m)),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,Plus(j,n)))),FracPart(p)),Power(Times(Power(x,Plus(FracPart(m),Times(j,FracPart(p)))),Power(Plus(a,Times(b,Power(x,n))),FracPart(p))),-1)),Int(Times(Power(x,Plus(m,Times(j,p))),Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),q)),x),x),And(FreeQ(List(a,b,c,d,e,j,m,n,p,q),x),EqQ($s("jn"),Plus(j,n)),Not(IntegerQ(p)),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),Not(And(EqQ(n,C1),EqQ(j,C1)))))),
IIntegrate(6116,Int(Times($p("§pq"),Power(Plus(Times(a_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(With(List(Set(d,Denominator(n))),Dist(d,Subst(Int(Times(Power(x,Plus(d,Negate(C1))),ReplaceAll(SubstFor(Power(x,n),$s("§pq"),x),Rule(x,Power(x,Times(d,n)))),Power(Plus(Times(a,Power(x,Times(d,j))),Times(b,Power(x,Times(d,n)))),p)),x),x,Power(x,Power(d,-1))),x)),And(FreeQ(List(a,b,j,n,p),x),PolyQ($s("§pq"),Power(x,n)),Not(IntegerQ(p)),NeQ(n,j),RationalQ(j,n),IntegerQ(Times(j,Power(n,-1))),LtQ(CN1,n,C1)))),
IIntegrate(6117,Int(Times($p("§pq"),Power(x_,m_DEFAULT),Power(Plus(Times(a_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(Dist(Power(n,-1),Subst(Int(Times(Power(x,Plus(Simplify(Times(Plus(m,C1),Power(n,-1))),Negate(C1))),SubstFor(Power(x,n),$s("§pq"),x),Power(Plus(Times(a,Power(x,Simplify(Times(j,Power(n,-1))))),Times(b,x)),p)),x),x,Power(x,n)),x),And(FreeQ(List(a,b,j,m,n,p),x),PolyQ($s("§pq"),Power(x,n)),Not(IntegerQ(p)),NeQ(n,j),IntegerQ(Simplify(Times(j,Power(n,-1)))),IntegerQ(Simplify(Times(Plus(m,C1),Power(n,-1))))))),
IIntegrate(6118,Int(Times($p("§pq"),Power(Times(c_,x_),m_DEFAULT),Power(Plus(Times(a_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(Dist(Times(Power(c,Times(Sign(m),Quotient(m,Sign(m)))),Power(Times(c,x),Mod(m,Sign(m))),Power(Power(x,Mod(m,Sign(m))),-1)),Int(Times(Power(x,m),$s("§pq"),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),p)),x),x),And(FreeQ(List(a,b,c,j,n,p),x),PolyQ($s("§pq"),Power(x,n)),Not(IntegerQ(p)),NeQ(n,j),IntegerQ(Simplify(Times(j,Power(n,-1)))),IntegerQ(Simplify(Times(Plus(m,C1),Power(n,-1)))),RationalQ(m),GtQ(Sqr(m),C1)))),
IIntegrate(6119,Int(Times($p("§pq"),Power(Times(c_,x_),m_DEFAULT),Power(Plus(Times(a_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(Dist(Times(Power(Times(c,x),m),Power(Power(x,m),-1)),Int(Times(Power(x,m),$s("§pq"),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),p)),x),x),And(FreeQ(List(a,b,c,j,m,n,p),x),PolyQ($s("§pq"),Power(x,n)),Not(IntegerQ(p)),NeQ(n,j),IntegerQ(Simplify(Times(j,Power(n,-1)))),IntegerQ(Simplify(Times(Plus(m,C1),Power(n,-1))))))),
IIntegrate(6120,Int(Times($p("§pq"),Power(x_,m_DEFAULT),Power(Plus(Times(a_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(With(List(Set(g,GCD(Plus(m,C1),n))),Condition(Dist(Power(g,-1),Subst(Int(Times(Power(x,Plus(Times(Plus(m,C1),Power(g,-1)),Negate(C1))),ReplaceAll($s("§pq"),Rule(x,Power(x,Power(g,-1)))),Power(Plus(Times(a,Power(x,Times(j,Power(g,-1)))),Times(b,Power(x,Times(n,Power(g,-1))))),p)),x),x,Power(x,g)),x),NeQ(g,C1))),And(FreeQ(List(a,b,p),x),PolyQ($s("§pq"),Power(x,n)),Not(IntegerQ(p)),IGtQ(j,C0),IGtQ(n,C0),IGtQ(Times(j,Power(n,-1)),C0),IntegerQ(m)))),
IIntegrate(6121,Int(Times($p("§pq"),Power(Times(c_DEFAULT,x_),m_DEFAULT),Power(Plus(Times(a_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(With(List(Set(q,Expon($s("§pq"),x))),Condition(With(List(Set($s("§pqq"),Coeff($s("§pq"),x,q))),Plus(Int(Times(Power(Times(c,x),m),ExpandToSum(Plus($s("§pq"),Times(CN1,$s("§pqq"),Power(x,q)),Times(CN1,a,$s("§pqq"),Plus(m,q,Negate(n),C1),Power(x,Plus(q,Negate(n))),Power(Times(b,Plus(m,q,Times(n,p),C1)),-1))),x),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),p)),x),Simp(Times($s("§pqq"),Power(Times(c,x),Plus(m,q,Negate(n),C1)),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),Plus(p,C1)),Power(Times(b,Power(c,Plus(q,Negate(n),C1)),Plus(m,q,Times(n,p),C1)),-1)),x))),And(GtQ(q,Plus(n,Negate(C1))),NeQ(Plus(m,q,Times(n,p),C1),C0),Or(IntegerQ(Times(C2,p)),IntegerQ(Plus(p,Times(Plus(q,C1),Power(Times(C2,n),-1)))))))),And(FreeQ(List(a,b,c,m,p),x),PolyQ($s("§pq"),x),Not(IntegerQ(p)),IGtQ(j,C0),IGtQ(n,C0),LtQ(j,n)))),
IIntegrate(6122,Int(Times($p("§pq"),Power(x_,m_DEFAULT),Power(Plus(Times(a_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(Dist(Power(Plus(m,C1),-1),Subst(Int(Times(ReplaceAll(SubstFor(Power(x,n),$s("§pq"),x),Rule(x,Power(x,Simplify(Times(n,Power(Plus(m,C1),-1)))))),Power(Plus(Times(a,Power(x,Simplify(Times(j,Power(Plus(m,C1),-1))))),Times(b,Power(x,Simplify(Times(n,Power(Plus(m,C1),-1)))))),p)),x),x,Power(x,Plus(m,C1))),x),And(FreeQ(List(a,b,j,m,n,p),x),PolyQ($s("§pq"),Power(x,n)),Not(IntegerQ(p)),NeQ(n,j),IntegerQ(Simplify(Times(j,Power(n,-1)))),IntegerQ(Simplify(Times(n,Power(Plus(m,C1),-1)))),Not(IntegerQ(n))))),
IIntegrate(6123,Int(Times($p("§pq"),Power(Times(c_,x_),m_),Power(Plus(Times(a_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(Dist(Times(Power(c,Times(Sign(m),Quotient(m,Sign(m)))),Power(Times(c,x),Mod(m,Sign(m))),Power(Power(x,Mod(m,Sign(m))),-1)),Int(Times(Power(x,m),$s("§pq"),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),p)),x),x),And(FreeQ(List(a,b,c,j,n,p),x),PolyQ($s("§pq"),Power(x,n)),Not(IntegerQ(p)),NeQ(n,j),IntegerQ(Simplify(Times(j,Power(n,-1)))),IntegerQ(Simplify(Times(n,Power(Plus(m,C1),-1)))),Not(IntegerQ(n)),GtQ(Sqr(m),C1))))
  );
}
