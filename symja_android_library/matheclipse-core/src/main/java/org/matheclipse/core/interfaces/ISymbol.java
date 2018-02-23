package org.matheclipse.core.interfaces;

import com.duy.lambda.DoubleFunction;
import com.duy.lambda.Function;

import org.matheclipse.core.eval.EvalEngine;
import org.matheclipse.core.eval.exception.WrongArgumentType;
import org.matheclipse.core.expression.Context;
import org.matheclipse.core.patternmatching.IPatternMatcher;
import org.matheclipse.core.patternmatching.PatternMap;
import org.matheclipse.core.patternmatching.PatternMatcherAndInvoker;
import org.matheclipse.core.patternmatching.RulesData;

import java.io.IOException;
import java.util.List;

import javax.annotation.Nonnull;

/**
 * An expression representing a symbol (i.e. variable- constant- or function-name)
 */
public interface ISymbol extends IExpr { // Variable<IExpr>

    /**
     * ISymbol attribute to indicate that a symbols evaluation should be printed to Console with System.out.println();
     */
    int CONSOLE_OUTPUT = 0x1000;
    /**
     * ISymbol attribute to indicate that a symbol has a constant value
     */
    int CONSTANT = 0x0002;
    /**
     * ISymbol attribute for an associative function transformation. The evaluation of the function will flatten the
     * arguments list
     */
    int FLAT = 0x0008;
    /**
     * ISymbol attribute for a function, where the first argument should not be evaluated
     */
    int HOLDFIRST = 0x0020;
    /**
     * ISymbol attribute for a function, where only the first argument should be evaluated
     */
    int HOLDREST = 0x0040;
    /**
     * ISymbol attribute for a function, where no argument should be evaluated
     */
    int HOLDALL = HOLDFIRST | HOLDREST;
    /**
     * ISymbol attribute for a function with lists as arguments
     */
    int LISTABLE = 0x0080;
    /**
     * ISymbol attribute for a function, where the first argument should not be evaluated numerically
     */
    int NHOLDFIRST = 0x2000;
    /**
     * ISymbol attribute for a function, where the rest of the arguments should not be evaluated numerically.
     */
    int NHOLDREST = 0x4000;
    /**
     * ISymbol attribute for a function, which should not be evaluated numerically
     */
    int NHOLDALL = NHOLDFIRST | NHOLDREST;
    /**
     * ISymbol attribute which means that no attribute is set.
     */
    int NOATTRIBUTE = 0x0000;
    /**
     * ISymbol attribute for a numeric function
     */
    int NUMERICFUNCTION = 0x0400;
    /**
     * ISymbol flag for a symbol which has already loaded it's package definition
     */
    int PACKAGE_LOADED = 0x0800;
    /**
     * ISymbol attribute for a function transformation: f(x) ==> x
     */
    int ONEIDENTITY = 0x0001;
    /**
     * ISymbol attribute for a commutative function transformation. The evaluation of the function will sort the
     * arguments.
     */
    int ORDERLESS = 0x0004;
    /**
     * ISymbol attribute combination (ISymbol.FLAT and ISymbol.ORDERLESS)
     */
    int FLATORDERLESS = FLAT | ORDERLESS;
    /**
     * ISymbol attribute to indicate that a symbols evaluation should be printed to Console with System.out.println();
     */
    int DELAYED_RULE_EVALUATION = 0x00010000;

    /**
     * Add the attributes to the existing attributes bit-set.
     *
     * @param attributes
     */
    void addAttributes(final int attributes);

    /**
     * Clear the associated rules for this symbol
     *
     * @param engine the evaluation engine
     */
    void clear(EvalEngine engine);

    /**
     * Clear all associated rules and attributes for this symbol.
     *
     * @param engine the evaluation engine
     */
    void clearAll(EvalEngine engine);

    /**
     * Remove the attributes from the existing attributes bit-set.
     *
     * @param attributes
     */
    void clearAttributes(final int attributes);

    /**
     * Check if ths symbol contains a "DownRule" or "UpRule"
     *
     * @return <code>true</code> if this symbol contains a "DownRule" or "UpRule"
     */
    boolean containsRules();

    /**
     * Create internal rules data structure with precalculated sizes
     * <p>
     * <ul>
     * <li>index 0 - number of equal rules in <code>RULES</code></li>
     * </ul>
     *
     * @param sizes
     */
    void createRulesData(@Nonnull int[] sizes);

    /**
     * Return a list of the rules associated to this symbol
     *
     * @return
     */
    List<IAST> definition();

    /**
     * Return the rules associated to this symbol in <code>String</code> representation
     *
     * @return the <code>String</code> representation of the symbol definition
     * @throws IOException
     */
    String definitionToString() throws IOException;

    /**
     * Evaluate the given expression for the &quot;down value&quot; rules associated with this symbol
     *
     * @param engine
     * @param expression
     * @return <code>F.NIL</code> if no evaluation was possible
     */
    IExpr evalDownRule(EvalEngine engine, IExpr expression);

    /**
     * Evaluate the given expression for the &quot;up value&quot; rules associated with this symbol
     *
     * @param engine
     * @param expression
     * @return <code>F.NIL</code> if no evaluation was possible
     */
    IExpr evalUpRule(EvalEngine engine, IExpr expression);

    /**
     * Get the topmost value from the local variable stack
     *
     * @return <code>null</code> if no local variable is defined
     */
    IExpr get();

    /**
     * Get the value which is assigned to the symbol or <code>null</code>, if no value is assigned.
     *
     * @return <code>null</code>, if no value is assigned.
     */
    IExpr getAssignedValue();

    /**
     * Get the Attributes of this symbol (i.e. LISTABLE, FLAT, ORDERLESS,...)
     *
     * @return
     * @see IBuiltInSymbol#FLAT
     */
    int getAttributes();

    /**
     * Set the Attributes of this symbol (i.e. LISTABLE, FLAT, ORDERLESS,...)
     *
     * @param attributes the Attributes of this symbol
     */
    void setAttributes(int attributes);

    /**
     * Get the context this symbol is assigned to.
     *
     * @return
     */
    Context getContext();

    /**
     * Get the <i>general default value</i> for this symbol (i.e. <code>1</code> is the default value for
     * <code>Times</code>, <code>0</code> is the default value for <code>Plus</code>). The general default value is used
     * in pattern-matching for expressions like <code>a_. * b_. + c_</code>
     *
     * @return the default value or <code>null</code> if undefined.
     */
    IExpr getDefaultValue();

    /**
     * Set the <i>general default value</i> for this symbol (i.e. <code>1</code> is the default value for
     * <code>Times</code>, <code>0</code> is the default value for <code>Plus</code>). The general default value is used
     * in pattern-matching for expressions like <code>a_. * b_. + c_</code>
     *
     * @param expr the general default value
     * @see IBuiltInSymbol#getDefaultValue()
     */
    void setDefaultValue(IExpr expr);

    /**
     * Get the <i>default value</i> at the arguments position for this symbol (i.e. <code>1</code> is the default value
     * for <code>Power</code> at <code>position</code> <code>2</code>). The default value is used in pattern-matching
     * for expressions like <code>a ^ b_.</code>
     *
     * @param position the position for the default value
     * @return the default value or <code>null</code> if undefined.
     */
    IExpr getDefaultValue(int position);

    /**
     * @return <code>null</code> if no rules are defined
     */
    RulesData getRulesData();

    /**
     * Get the pure symbol name string
     *
     * @return
     */
    String getSymbolName();

    /**
     * Is a (local or global) value assigned for this symbol?
     *
     * @return <code>true</code> if this symbol has an assigned value.
     */
    boolean hasAssignedSymbolValue();

    /**
     * Does this symbols attribute set contains the <code>Flat</code> attribute?
     *
     * @return <code>true</code> if this symbols attribute set contains the <code>Flat</code> attribute.
     */
    boolean hasFlatAttribute();

    /**
     * Is a local variable stack created for this symbol ?
     *
     * @return <code>true</code> if this symbol has a local variable stack
     */
    boolean hasLocalVariableStack();

    /**
     * Does this symbols attribute set contains the <code>OneIdentity</code> attribute?
     *
     * @return <code>true</code> if this symbols attribute set contains the <code>OneIdentity</code> attribute.
     */
    boolean hasOneIdentityAttribute();

    /**
     * Does this symbols attribute set contains the <code>Orderless</code> attribute?
     *
     * @return <code>true</code> if this symbols attribute set contains the <code>Orderless</code> attribute.
     */
    boolean hasOrderlessAttribute();

    /**
     * Does this symbols attribute set contains the <code>Flat</code> and <code>Orderless</code> attribute?
     *
     * @return <code>true</code> if this symbols attribute set contains the <code>Flat</code> and the
     * <code>Orderless</code> attribute.
     */
    boolean hasOrderlessFlatAttribute();

    /**
     * Gives <code>true</code> if the system is in server mode and cannot be modified
     *
     * @return
     */
    boolean isLocked();

    /**
     * Gives <code>true</code> if the system is in server mode and cannot be modified
     *
     * @return
     */
    boolean isLocked(boolean packageMode);

    /**
     * Tests if this symbols name equals the given string
     *
     * @param symbolName
     * @return
     */
    boolean isString(String symbolName);

    /**
     * Returns <code>true</code>, if this symbol has the given name. The comparison of the symbols name with the given
     * name is done according to the <code>Config.PARSER_USE_LOWERCASE_SYMBOLS</code> setting.
     *
     * @param name the symbol name
     * @return
     */
    boolean isSymbolName(String name);

    /**
     * If this symbol has attribute <code>ISymbol.CONSTANT</code> and the symbol's evaluator is of instance
     * <code>INumericConstant</code>, then apply the constants double value to the given function and return the result,
     * otherwise return <code>F.NIL</code>.
     *
     * @param function applys the function to a <code>double</code> value, resulting in an object of type {@code IExpr}.
     * @return the resulting expression from the function or <code>F.NIL</code>.
     * @see org.matheclipse.core.builtin.Arithmetic.Abs
     * @see org.matheclipse.core.builtin.IntegerFunctions.Ceiling
     * @see org.matheclipse.core.builtin.IntegerFunctions.Floor
     */
    IExpr mapConstantDouble(DoubleFunction<IExpr> function);

    /**
	 * Evaluate this symbol for the arguments as function <code>symbol(arg1, arg2, .... ,argN)</code>.
	 * 
	 * @param engine
	 *            the current evaluation engine
	 * @param args
	 *            the arguments for which this function symbol should be evaluated
	 * @return
	 */
	public IExpr of(EvalEngine engine, IExpr... args);

	/**
	 * Evaluate this symbol for the arguments as function <code>symbol(arg1, arg2, .... ,argN)</code> to a boolean value.
	 * If the result isn't a boolean value return <code>false</code>.
	 * 
	 * @param engine
	 *            the current evaluation engine
	 * @param args
	 *            the arguments for which this function symbol should be evaluated
	 * @return if the result isn't a boolean value return <code>false</code>.
	 */
	public boolean ofQ(EvalEngine engine, IExpr... args);
	
	
	/**
	 * Evaluate this symbol for the arguments as function <code>symbol(arg1, arg2, .... ,argN)</code>.
	 * 
	 * @param args
	 *            the arguments for which this function symbol should be evaluated
	 * @return
	 */
	public IExpr of(IExpr... args);
	
    /**
     * Delete the topmost placeholder from the local variable stack
     */
    void popLocalVariable();

    /**
     * Create a new variable placeholder on the symbols variable stack
     */
    void pushLocalVariable();

    /**
     * Create a new variable placeholder on the symbols variable stack and set the local value
     *
     * @param localValue
     */
    void pushLocalVariable(IExpr localValue);

    /**
     * Associate a new rule, which invokes a method, to this symbol.
     *
     * @param pmEvaluator
     * @return
     */
    IPatternMatcher putDownRule(final PatternMatcherAndInvoker pmEvaluator);

    /**
     * Associate a new &quot;down value&quot; rule with default priority to this symbol.
     *
     * @param setSymbol     which of the symbols <code>Set, SetDelayed, UpSet, UpSetDelayed</code> was used for defining this rule
     * @param equalRule     <code>true</code> if the leftHandSide could be matched with equality
     * @param leftHandSide
     * @param rightHandSide
     * @param packageMode   <code>true</code> if we are on &quot;package mode&quot;
     * @return
     * @see PatternMap#DEFAULT_RULE_PRIORITY
     */
    IPatternMatcher putDownRule(final RuleType setSymbol, boolean equalRule, IExpr leftHandSide,
                                IExpr rightHandSide, boolean packageMode);

    /**
     * Associate a new rule with the given priority to this symbol.<br/>
     * Rules with lower numbers have higher priorities.
     *
     * @param setSymbol     which of the symbols <code>Set, SetDelayed, UpSet, UpSetDelayed</code> was used for defining this rule
     * @param equalRule     <code>true</code> if the leftHandSide could be matched with equality
     * @param leftHandSide
     * @param rightHandSide
     * @param priority      the priority of the rule
     * @param packageMode   <code>true</code> if we are on &quot;package mode&quot;
     * @return
     * @see PatternMap#DEFAULT_RULE_PRIORITY
     */
    IPatternMatcher putDownRule(final RuleType setSymbol, boolean equalRule, IExpr leftHandSide,
                                IExpr rightHandSide, int priority, boolean packageMode);

    /**
     * Associate a new &quot;up value&quot; rule with default priority to this symbol.
     *
     * @param setSymbol     which of the symbols <code>Set, SetDelayed, UpSet, UpSetDelayed</code> was used for defining this rule
     * @param equalRule     <code>true</code> if the leftHandSide could be matched with equality
     * @param leftHandSide
     * @param rightHandSide
     * @return
     * @see PatternMap#DEFAULT_RULE_PRIORITY
     */
    IPatternMatcher putUpRule(final RuleType setSymbol, boolean equalRule, IAST leftHandSide,
                              IExpr rightHandSide);

    /**
     * Associate a new &quot;up value&quot; rule with the given priority to this symbol.<br/>
     * Rules with lower numbers have higher priorities.
     *
     * @param setSymbol     which of the symbols <code>Set, SetDelayed, UpSet, UpSetDelayed</code> was used for defining this rule
     * @param equalRule     <code>true</code> if the leftHandSide could be matched with equality
     * @param leftHandSide
     * @param rightHandSide
     * @param priority      the priority of the rule
     * @return
     * @see PatternMap#DEFAULT_RULE_PRIORITY
     */
    IPatternMatcher putUpRule(final RuleType setSymbol, final boolean equalRule, final IAST leftHandSide,
                              final IExpr rightHandSide, final int priority);

    /**
     * Deserialize the rules associated to this object
     *
     * @param stream
     * @throws java.io.IOException
     */
    void readRules(java.io.ObjectInputStream stream) throws IOException, ClassNotFoundException;

    /**
     * Apply the function to the currently assigned value of the symbol and reassign the result value to the symbol.
     * Used for functions like AppendTo, Decrement, Increment,...
     *
     * @param function       the function which should be applied
     * @param functionSymbol if this method throws a WrongArgumentType exception the symbol will be displayed in the exceptions
     *                       message
     * @param engine         the evaluation engine
     * @return an array with the currently assigned value of the symbol and the new calculated value of the symbol or
     * <code>null</code> if the reassignment isn't possible.
     * @see WrongArgumentType
     */
    IExpr[] reassignSymbolValue(Function<IExpr, IExpr> function, ISymbol functionSymbol, EvalEngine engine);

    /**
     * Apply the ast to the currently assigned value of the symbol and reassign the result value to the symbol. Used for
     * functions like AppendTo, Decrement, Increment,...
     *
     * @param ast
     * @param ast            the ast which should be evaluated by replacing the first argument with the current value of the symbol
     * @param functionSymbol if this method throws a WrongArgumentType exception the symbol will be displayed in the exceptions
     *                       message
     * @param engine         the evaluation engine
     * @return an array with the currently assigned value of the symbol and the new calculated value of the symbol or
     * <code>null</code> if the reassignment isn't possible.
     */
    IExpr[] reassignSymbolValue(IASTMutable ast, ISymbol functionSymbol, EvalEngine engine);

    /**
     * Remove the rules associate with this symbol, which equals the given <code>leftHandSide</code> expression.
     *
     * @param setSymbol
     * @param equalRule
     * @param leftHandSide
     * @param packageMode
     * @return <code>true</code> if a rule could be removed, <code>false</code> otherwise
     */
    boolean removeRule(final IBuiltInSymbol.RuleType setSymbol, final boolean equalRule,
                       final IExpr leftHandSide, boolean packageMode);

    /**
     * Set the value of the local variable on top of the local variable stack
     */
    void set(IExpr value);

    /**
     * Set the <i>default value</i> at the arguments position for this symbol (i.e. <code>1</code> is the default value
     * for <code>Power</code> at <code>position</code> <code>2</code>). The default value is used in pattern-matching
     * for expressions like <code>a ^ b_.</code>
     *
     * @param position the position for the default value
     * @param expr     the default value for the given position
     * @see IBuiltInSymbol#getDefaultValue(int)
     */
    void setDefaultValue(int position, IExpr expr);

    /**
     * Serialize the rule definitions associated to this symbol
     *
     * @param stream
     * @return <code>false</code> if the symbol contains no rule definion.
     * @throws java.io.IOException
     */
    boolean writeRules(java.io.ObjectOutputStream stream) throws java.io.IOException;

    enum RuleType {
        SET, SET_DELAYED, UPSET, UPSET_DELAYED
    }

}
