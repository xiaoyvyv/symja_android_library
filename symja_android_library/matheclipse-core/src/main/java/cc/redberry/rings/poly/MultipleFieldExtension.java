package cc.redberry.rings.poly;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import com.duy.lambda.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import cc.redberry.rings.ImageRing;
import cc.redberry.rings.Rings;
import cc.redberry.rings.bigint.BigInteger;
import cc.redberry.rings.io.Coder;
import cc.redberry.rings.io.IStringifier;
import cc.redberry.rings.poly.multivar.AMonomial;
import cc.redberry.rings.poly.multivar.AMultivariatePolynomial;
import cc.redberry.rings.poly.multivar.Monomial;
import cc.redberry.rings.poly.multivar.MonomialZp64;
import cc.redberry.rings.poly.multivar.MultivariatePolynomial;
import cc.redberry.rings.poly.multivar.MultivariatePolynomialZp64;
import cc.redberry.rings.poly.multivar.MultivariateResultants;
import cc.redberry.rings.poly.univar.IUnivariatePolynomial;
import cc.redberry.rings.poly.univar.UnivariateDivision;
import cc.redberry.rings.poly.univar.UnivariateFactorization;
import cc.redberry.rings.poly.univar.UnivariateGCD;
import cc.redberry.rings.poly.univar.UnivariatePolynomial;
import cc.redberry.rings.poly.univar.UnivariatePolynomialZp64;
import cc.redberry.rings.poly.univar.UnivariateSquareFreeFactorization;
import cc.redberry.rings.util.ArraysUtil;

/**
 * Multiple field extension {@code F(α_1, α_2, ..., α_N)}. Elements are represented as multivariate polynomials over
 * {@code (α_1, α_2, ..., α_N)}; internally all arithmetic operations are performed by switching to appropriate simple
 * field extension {@code F(γ)} (accessible via {@link #getSimpleExtension()} method) where {@code γ} is some primitive
 * element (accessible via {@link #getPrimitiveElement()} method) computed automatically. Representation of generating
 * algebraic elements {@code α_i} as elements of this simple extension can be obtained via {@link #getGeneratorRep(int)}
 * method. Originally, generators are represented by their minimal polynomials over {@code F(α_1, α_2, ..., α_i)}
 * ("tower" representation). To construct multiple field extensions one should use {@link #mkMultipleExtension(...)} and
 * {@link #joinAlgebraicElement(UnivariatePolynomial)}.
 *
 * @see #mkMultipleExtension(IUnivariatePolynomial)
 * @see #mkMultipleExtension(IUnivariatePolynomial...)
 * @see #mkSplittingField(IUnivariatePolynomial)
 * @see cc.redberry.rings.Rings#MultipleFieldExtension(IUnivariatePolynomial[])
 * @see cc.redberry.rings.Rings#SplittingField(IUnivariatePolynomial)
 * @since 2.5
 */
public class MultipleFieldExtension<
        Term extends AMonomial<Term>,
        mPoly extends AMultivariatePolynomial<Term, mPoly>,
        sPoly extends IUnivariatePolynomial<sPoly>
        > extends ImageRing<sPoly, mPoly> implements IPolynomialRing<mPoly> {
    /**
     * multivariate polynomial factory
     */
    final mPoly mFactory;
    /**
     * univariate polynomial factory
     */
    final sPoly sFactory;
    /**
     * A tower of field extensions
     */
    final MultipleFieldExtension<Term, mPoly, sPoly>[] tower;
    /**
     * A tower of generators of multiple field extension given by their minimal polynomials
     */
    final UnivariatePolynomial<mPoly>[] minimalPolynomialsOfGenerators;
    /**
     * Primitive element that generates equivalent simple extension
     */
    final mPoly primitiveElement;
    /**
     * Simple field extension generated by primitive element
     */
    final SimpleFieldExtension<sPoly> simpleExtension;
    /**
     * Generators represented as elements of simple field extension
     */
    final sPoly[] generatorsReps;

    public MultipleFieldExtension(MultipleFieldExtension<Term, mPoly, sPoly>[] tower,
                                  UnivariatePolynomial<mPoly>[] minimalPolynomialsOfGenerators,
                                  mPoly primitiveElement,
                                  sPoly[] generatorsReps,
                                  SimpleFieldExtension<sPoly> simpleExtension) {
        super(simpleExtension,
                new MultipleToSimple<>(primitiveElement, simpleExtension, generatorsReps),
                new SimpleToMultiple<>(primitiveElement, simpleExtension, generatorsReps, tower, minimalPolynomialsOfGenerators));
        this.tower = tower;
        this.minimalPolynomialsOfGenerators = minimalPolynomialsOfGenerators;
        this.primitiveElement = primitiveElement;
        this.simpleExtension = simpleExtension;
        this.generatorsReps = generatorsReps;
        this.mFactory = primitiveElement.createOne();
        this.sFactory = simpleExtension.factory().createOne();
    }

    @SuppressWarnings("unchecked")
    public static <
            Term extends AMonomial<Term>,
            mPoly extends AMultivariatePolynomial<Term, mPoly>,
            sPoly extends IUnivariatePolynomial<sPoly>
            > MultipleFieldExtension<Term, mPoly, sPoly>
    mkMultipleExtension(sPoly a) {
        return mkMultipleExtension(Rings.SimpleFieldExtension(a));
    }

    @SuppressWarnings("unchecked")
    public static <
            Term extends AMonomial<Term>,
            mPoly extends AMultivariatePolynomial<Term, mPoly>,
            sPoly extends IUnivariatePolynomial<sPoly>
            > MultipleFieldExtension<Term, mPoly, sPoly>
    mkMultipleExtension(SimpleFieldExtension<sPoly> ext) {
        sPoly m = ext.getMinimalPolynomial();
        return new MultipleFieldExtension<>(new MultipleFieldExtension[0],
                new UnivariatePolynomial[]{m.mapCoefficientsAsPolys(Rings.MultivariateRing((mPoly) m.asMultivariate()), cf -> (mPoly) cf.asMultivariate())},
                (mPoly) m.asMultivariate().createMonomial(0, 1),
                m.createArray(m.createMonomial(1)),
                ext);
    }

    /**
     * Creates multiple field extension {@code F(α_1, α_2)} where {@code α_1} and {@code α_2} are specified by their
     * minimal polynomials over F.
     * <p>
     * <p>NOTE: it is not tested that specified minimal polynomials are irreducible
     *
     * @param a minimal polynomial of the first algebraic number
     * @param b minimal polynomial of the second algebraic number
     */
    @SuppressWarnings("unchecked")
    private static <
            Term extends AMonomial<Term>,
            mPoly extends AMultivariatePolynomial<Term, mPoly>,
            sPoly extends IUnivariatePolynomial<sPoly>
            > MultipleFieldExtension<Term, mPoly, sPoly>
    mkMultipleExtension0(sPoly a, UnivariatePolynomial<sPoly> b) {
        if (a instanceof UnivariatePolynomial)
            return (MultipleFieldExtension<Term, mPoly, sPoly>) mkMultipleExtensionE((UnivariatePolynomial) a, (UnivariatePolynomial) b);
        else
            return (MultipleFieldExtension<Term, mPoly, sPoly>) mkMultipleExtensionZp64((UnivariatePolynomialZp64) a, (UnivariatePolynomial) b);
    }

    /**
     * Creates multiple field extension {@code F(α_1, α_2)} where {@code α_1} and {@code α_2} are specified by their
     * minimal polynomials over F.
     * <p>
     * <p>NOTE: it is not tested that specified minimal polynomials are irreducible
     *
     * @param a minimal polynomial of the first algebraic number
     * @param b minimal polynomial of the second algebraic number
     */
    @SuppressWarnings("unchecked")
    private static <E> MultipleFieldExtension<Monomial<E>, MultivariatePolynomial<E>, UnivariatePolynomial<E>>
    mkMultipleExtensionE(UnivariatePolynomial<E> a, UnivariatePolynomial<UnivariatePolynomial<E>> b) {
        MultivariatePolynomial<E> ma = a.asMultivariate().insertVariable(0), factory = ma.createOne();
        for (int s = 0; ; ++s) {
            // prepare a(x) and b(x, alpha) to compute resultant
            MultivariatePolynomial<E> mb = asBivariate(b);
            // compute b(x - s*alpha, alpha)
            if (s != 0)
                mb = mb.composition(0,
                        factory.createMonomial(0, 1)
                                .subtract(factory.createMonomial(1, 1).multiply(s)));

            // compute h(x) = Res(a(x), b(x - s*alpha, alpha), alpha)
            UnivariatePolynomial<E> primitiveElement = MultivariateResultants.Resultant(ma, mb, 1).asUnivariate();
            if (!UnivariateSquareFreeFactorization.isSquareFree(primitiveElement))
                continue;

            // h(x) is the minimal polynomial of primitive element
            SimpleFieldExtension<UnivariatePolynomial<E>> extension = Rings.SimpleFieldExtension(primitiveElement);

            // compute gcd( a(X), b(gamma - s*X, X) )
            UnivariatePolynomial<UnivariatePolynomial<E>>
                    aE = a.mapCoefficientsAsPolys(extension, extension::valueOf),
                    bE = mb.mapCoefficients(extension, extension.factory::createConstant)
                            .composition(
                                    aE.createConstant(extension.generator()),
                                    aE.createMonomial(1)),
                    gcd = UnivariateGCD.PolynomialGCD(aE, bE).monic();
            assert gcd.degree() == 1;

            // representations
            UnivariatePolynomial<E> aRep = extension.negate(gcd.cc());
            UnivariatePolynomial<E> bRep = extension.subtract(extension.generator(), aRep.clone().multiply(s));

            // second extension
            MultipleFieldExtension<Monomial<E>, MultivariatePolynomial<E>, UnivariatePolynomial<E>>
                    result = new MultipleFieldExtension<>(
                    null, null,
                    factory.createMonomial(1, 1).add(factory.createMonomial(0, 1).multiply(s)),
                    a.createArray(aRep, bRep), extension);

            return result;
        }
    }

    /**
     * Creates multiple field extension {@code F(α_1, α_2)} where {@code α_1} and {@code α_2} are specified by their
     * minimal polynomials over F.
     * <p>
     * <p>NOTE: it is not tested that specified minimal polynomials are irreducible
     *
     * @param a minimal polynomial of the first algebraic number
     * @param b minimal polynomial of the second algebraic number
     */
    @SuppressWarnings("unchecked")
    private static MultipleFieldExtension<MonomialZp64, MultivariatePolynomialZp64, UnivariatePolynomialZp64>
    mkMultipleExtensionZp64(UnivariatePolynomialZp64 a, UnivariatePolynomial<UnivariatePolynomialZp64> b) {
        MultivariatePolynomialZp64 ma = a.asMultivariate().insertVariable(0), factory = ma.createOne();
        for (int s = 0; ; ++s) {
            // prepare a(x) and b(x, alpha) to compute resultant
            MultivariatePolynomialZp64 mb = asBivariate(b);
            // compute b(x - s*alpha, alpha)
            if (s != 0)
                mb = mb.composition(0,
                        factory.createMonomial(0, 1)
                                .subtract(factory.createMonomial(1, 1).multiply(s)));

            // compute h(x) = Res(a(x), b(x - s*alpha, alpha), alpha)
            UnivariatePolynomialZp64 primitiveElement = MultivariateResultants.Resultant(ma, mb, 1).asUnivariate();
            if (!UnivariateSquareFreeFactorization.isSquareFree(primitiveElement))
                continue;

            // h(x) is the minimal polynomial of primitive element
            SimpleFieldExtension<UnivariatePolynomialZp64> extension = Rings.SimpleFieldExtension(primitiveElement);

            // compute gcd( a(X), b(gamma - s*X, X) )
            UnivariatePolynomial<UnivariatePolynomialZp64>
                    aE = a.mapCoefficientsAsPolys(extension, extension::valueOf),
                    bE = mb.mapCoefficients(extension, extension.factory::createConstant)
                            .composition(
                                    aE.createConstant(extension.generator()),
                                    aE.createMonomial(1)),
                    gcd = UnivariateGCD.PolynomialGCD(aE, bE).monic();
            assert gcd.degree() == 1;

            // representations
            UnivariatePolynomialZp64 aRep = extension.negate(gcd.cc());
            UnivariatePolynomialZp64 bRep = extension.subtract(extension.generator(), aRep.clone().multiply(s));

            MultipleFieldExtension<MonomialZp64, MultivariatePolynomialZp64, UnivariatePolynomialZp64>
                    result = new MultipleFieldExtension<>(
                    null, null,
                    factory.createMonomial(0, 1).add(factory.createMonomial(1, 1).multiply(s)),
                    a.createArray(aRep, bRep), extension);
            return result;
        }
    }

    @SuppressWarnings("unchecked")
    private static <
            Term extends AMonomial<Term>,
            mPoly extends AMultivariatePolynomial<Term, mPoly>,
            sPoly extends IUnivariatePolynomial<sPoly>
            > mPoly asBivariate(UnivariatePolynomial<sPoly> b) {
        if (b.lc() instanceof UnivariatePolynomialZp64)
            return (mPoly) asBivariateZp64((UnivariatePolynomial) b);
        else
            return (mPoly) asBivariateE((UnivariatePolynomial) b);
    }

    @SuppressWarnings("unchecked")
    private static <
            Term extends AMonomial<Term>,
            mPoly extends AMultivariatePolynomial<Term, mPoly>
            > mPoly asBivariateZp64(UnivariatePolynomial<UnivariatePolynomialZp64> b) {
        return (mPoly) MultivariatePolynomialZp64.asNormalMultivariate(b.asMultivariate(), 1);
    }

    @SuppressWarnings("unchecked")
    private static <
            Term extends AMonomial<Term>,
            mPoly extends AMultivariatePolynomial<Term, mPoly>,
            E> mPoly asBivariateE(UnivariatePolynomial<UnivariatePolynomial<E>> b) {
        return (mPoly) MultivariatePolynomial.asNormalMultivariate(b.asMultivariate(), 1);
    }

    /**
     * Creates multiple field extension {@code F(α_1, α_2, ..., α_i)} where {@code α_i} are specified by their minimal
     * polynomials over F.
     * <p>
     * <p>NOTE: it is not tested that specified minimal polynomials are irreducible
     *
     * @param minimalPolynomials minimal polynomials of algebraic elements
     */
    @SuppressWarnings("unchecked")
    public static <
            Term extends AMonomial<Term>,
            mPoly extends AMultivariatePolynomial<Term, mPoly>,
            sPoly extends IUnivariatePolynomial<sPoly>
            > MultipleFieldExtension<Term, mPoly, sPoly>
    mkMultipleExtension(sPoly... minimalPolynomials) {
        MultipleFieldExtension<Term, mPoly, sPoly> ext = mkMultipleExtension(minimalPolynomials[0]);
        for (int i = 1; i < minimalPolynomials.length; ++i)
            ext = ext.joinAlgebraicElement(minimalPolynomials[i]);
        return ext;
    }

    /**
     * Constructs splitting field for a given polynomial.
     */
    @SuppressWarnings("unchecked")
    public static <
            Term extends AMonomial<Term>,
            mPoly extends AMultivariatePolynomial<Term, mPoly>,
            sPoly extends IUnivariatePolynomial<sPoly>
            > MultipleFieldExtension<Term, mPoly, sPoly>
    mkSplittingField(sPoly poly) {
        // basic extension
        MultipleFieldExtension<Term, mPoly, sPoly> extension = mkMultipleExtension(poly);
        List<UnivariatePolynomial<mPoly>> nonLinearFactors = new ArrayList<>();
        nonLinearFactors.add(poly.mapCoefficientsAsPolys(extension, extension::image));

        boolean first = true;
        while (!nonLinearFactors.isEmpty()) {
            UnivariatePolynomial<mPoly> factor = nonLinearFactors.remove(nonLinearFactors.size() - 1);
            MultipleFieldExtension<Term, mPoly, sPoly> nextExt;
            if (first) {
                nextExt = extension;
                first = false;
            } else {
                nextExt = extension.joinAlgebraicElement(factor);
                MultipleFieldExtension<Term, mPoly, sPoly> _nextExt = nextExt;
                nonLinearFactors.replaceAll(f -> f.mapCoefficients(_nextExt, AMultivariatePolynomial::joinNewVariable));
                factor = factor.mapCoefficients(nextExt, AMultivariatePolynomial::joinNewVariable);
            }

            factor = UnivariateDivision.divideExact(factor,
                    UnivariatePolynomial.create(nextExt, nextExt.negate(nextExt.variable(nextExt.nVariables() - 1)), nextExt.getOne()),
                    false);
            List<UnivariatePolynomial<mPoly>> factors = UnivariateFactorization.Factor(factor).factors;
            for (int i = 0; i < factors.size(); i++) {
                UnivariatePolynomial<mPoly> f = factors.get(i);
                if (f.degree() > 1)
                    nonLinearFactors.add(f);
                else {
                    nextExt = nextExt.joinRedundantElement(nextExt.negate(nextExt.divideExact(f.cc(), f.lc())));
                    for (int j = i + 1; j < factors.size(); ++j)
                        factors.set(j, factors.get(j).mapCoefficients(nextExt, AMultivariatePolynomial::joinNewVariable));
                }
            }

            extension = nextExt;
        }
        return extension;
    }

    @Override
    public int nVariables() {
        return mFactory.nVariables;
    }

    @Override
    public mPoly factory() {
        return mFactory;
    }

    @Override
    public mPoly variable(int variable) {
        return mFactory.createMonomial(variable, 1);
    }

    public sPoly getUnivariateFactory() {
        return sFactory;
    }

    /**
     * Returns the primitive element of this multiple field extension
     */
    public mPoly getPrimitiveElement() {
        return primitiveElement.clone();
    }

    /**
     * Returns the degree of this filed extension (that is the degree of primitive element)
     */
    public int degree() {
        return simpleExtension.degree();
    }

//    @Override
//    public mPoly valueOf(mPoly val) {
//        return val;
//    }

    /**
     * Returns the isomorphic simple field extension generated by {@link #getPrimitiveElement()}
     */
    public SimpleFieldExtension<sPoly> getSimpleExtension() {
        return simpleExtension;
    }

    /**
     * Returns minimal polynomial corresponding to i-th generator.
     */
    public UnivariatePolynomial<mPoly> getGeneratorMinimalPoly(int iGenerator) {
        return minimalPolynomialsOfGenerators[iGenerator].clone();
    }

//    @Override
//    public mPoly addMutable(mPoly a, mPoly b) {
//        return a.add(b);
//    }
//
//    @Override
//    public mPoly subtractMutable(mPoly a, mPoly b) {
//        return a.subtract(b);
//    }
//
//    @Override
//    public mPoly negateMutable(mPoly element) {
//        return element.negate();
//    }
//
//    @Override
//    public mPoly add(mPoly a, mPoly b) {
//        return a.clone().add(b);
//    }
//
//    @Override
//    public mPoly subtract(mPoly a, mPoly b) {
//        return a.clone().subtract(b);
//    }
//
//    @Override
//    public mPoly negate(mPoly element) {
//        return element.clone().negate();
//    }
//
//    @Override
//    public mPoly increment(mPoly element) {
//        return element.clone().increment();
//    }
//
//    @Override
//    public mPoly decrement(mPoly element) {
//        return element.clone().decrement();
//    }
//
//    @Override
//    public mPoly add(mPoly... elements) {
//        return getZero().add(elements);
//    }

    /**
     * Returns the i-th extension from the tower
     */
    public MultipleFieldExtension<Term, mPoly, sPoly> getSubExtension(int i) {
        return tower[i];
    }

    /**
     * Returns representation of i-th generator as element of simple field extension generated by primitive element
     * {@link #getPrimitiveElement()}
     */
    public sPoly getGeneratorRep(int iGenerator) {
        return generatorsReps[iGenerator].clone();
    }

    /**
     * Returns representation of generators as elements of simple field extension generated by primitive element {@link
     * #getPrimitiveElement()}
     */
    public sPoly[] getGeneratorReps() {
        return generatorsReps.clone();
    }

    /**
     * Adds algebraic element given by its minimal polynomial (not checked that it is irreducible) to this.
     */
    public MultipleFieldExtension<Term, mPoly, sPoly> joinAlgebraicElement(UnivariatePolynomial<mPoly> algebraicElement) {
        UnivariatePolynomial<sPoly> minimalPoly = algebraicElement.mapCoefficients(simpleExtension, this::inverse);
        MultipleFieldExtension<Term, mPoly, sPoly> ext = mkMultipleExtension0(simpleExtension.minimalPoly, minimalPoly);

        MultipleFieldExtension<Term, mPoly, sPoly>[] tower = ArraysUtil.addAll(this.tower, this);
        UnivariatePolynomial<mPoly>[] minPolys = ArraysUtil.addAll(this.minimalPolynomialsOfGenerators, algebraicElement);
        mPoly primitiveElement = ext.primitiveElement
                .insertVariable(1, nVariables() - 1)
                .composition(0, this.primitiveElement.joinNewVariable());
        SimpleFieldExtension<sPoly> simpleExtension = ext.simpleExtension;
        sPoly[] generatorsReps = Stream.concat(
                Arrays.stream(this.generatorsReps).map(rep -> rep.composition(simpleExtension, ext.generatorsReps[0])),
                Stream.of(ext.generatorsReps[1])).toArray(sFactory::createArray);

        return new MultipleFieldExtension<>(tower, minPolys, primitiveElement, generatorsReps, simpleExtension);
    }

    /**
     * Adds algebraic element given by its minimal polynomial (not checked that it is irreducible) to this.
     */
    public MultipleFieldExtension<Term, mPoly, sPoly> joinAlgebraicElement(sPoly minimalPoly) {
        return joinAlgebraicElement(minimalPoly.mapCoefficientsAsPolys(this, this::image));
    }

    /**
     * Adds algebraic element given by its minimal polynomial (not checked that it is irreducible) to this.
     */
    public MultipleFieldExtension<Term, mPoly, sPoly> joinRedundantElement(mPoly element) {
        @SuppressWarnings("unchecked")
        UnivariatePolynomial<mPoly> minimalPoly = UnivariatePolynomial.create(this, negate(element), getOne());
        MultipleFieldExtension<Term, mPoly, sPoly>[] tower = ArraysUtil.addAll(this.tower, this);
        UnivariatePolynomial<mPoly>[] minPolys = ArraysUtil.addAll(this.minimalPolynomialsOfGenerators, minimalPoly);

        mPoly primitiveElement = this.primitiveElement.joinNewVariable();
        SimpleFieldExtension<sPoly> simpleExtension = this.simpleExtension;
        sPoly[] generatorsReps = ArraysUtil.addAll(this.generatorsReps, inverse(element));
        return new MultipleFieldExtension<>(tower, minPolys, primitiveElement, generatorsReps, simpleExtension);
    }

    @Override
    public mPoly valueOf(long val) {
        return mFactory.createConstant(val);
    }

    @Override
    public mPoly valueOfBigInteger(BigInteger val) {
        return mFactory.createOne().multiplyByBigInteger(val);
    }

    @Override
    public mPoly getZero() {
        return mFactory.createZero();
    }

    @Override
    public mPoly getOne() {
        return mFactory.createOne();
    }

    @Override
    public mPoly copy(mPoly element) {
        return element.clone();
    }

    @Override
    public boolean isZero(mPoly element) {
        return element.isZero();
    }

    @Override
    public boolean isOne(mPoly element) {
        return element.isOne();
    }

    @Override
    public boolean isUnit(mPoly element) {
        return isField()
                ? !isZero(element)
                : (isOne(element) || isMinusOne(element));
    }

    @Override
    public mPoly gcd(mPoly a, mPoly b) {
        return isField() ? a.clone() : getOne();
    }

    @Override
    public mPoly[] extendedGCD(mPoly a, mPoly b) {
        return super.extendedGCD(a, b);
    }

    @Override
    public mPoly lcm(mPoly a, mPoly b) {
        return super.lcm(a, b);
    }

    @Override
    public mPoly gcd(mPoly... elements) {
        return super.gcd(elements);
    }

    @Override
    public mPoly gcd(Iterable<mPoly> elements) {
        return super.gcd(elements);
    }

    @Override
    public int signum(mPoly element) {
        return element.signumOfLC();
    }

    @Override
    public mPoly factorial(long num) {
        return super.factorial(num);
    }

//    /**
//     * Creates multiple field extension {@code F(α_1, α_2)} where {@code α_1} and {@code α_2} are specified by their
//     * minimal polynomials over F.
//     *
//     * <p>NOTE: it is not tested that specified minimal polynomials are irreducible
//     *
//     * @param a minimal polynomial of the first algebraic number
//     * @param b minimal polynomial of the second algebraic number
//     */
//    @SuppressWarnings("unchecked")
//    public static <
//            Term extends AMonomial<Term>,
//            mPoly extends AMultivariatePolynomial<Term, mPoly>,
//            sPoly extends IUnivariatePolynomial<sPoly>
//            > MultipleFieldExtension<Term, mPoly, sPoly>
//    mkMultipleExtension(sPoly a, sPoly b) {
//        for (int s = 0; ; ++s) {
//            // prepare a(x - s*y) and b(y) to compute resultant
//            mPoly
//                    ma = (mPoly) a.asMultivariate().setNVariables(2),
//                    mb = (mPoly) b.asMultivariate().insertVariable(0),
//                    factory = ma.createOne();
//            if (s != 0)
//                ma = ma.composition(0,
//                        factory.createMonomial(0, 1)
//                                .subtract(factory.createMonomial(1, 1).multiply(s)));
//
//            sPoly primitiveElement = (sPoly) MultivariateResultants.Resultant(ma, mb, 1).asUnivariate();
//            if (!UnivariateSquareFreeFactorization.isSquareFree(primitiveElement))
//                continue;
//
//            SimpleFieldExtension<sPoly> extension = Rings.SimpleFieldExtension(primitiveElement);
//            UnivariatePolynomial<sPoly>
//                    aE = a.mapCoefficientsAsPolys(extension, extension::valueOf),
//                    bE = b.mapCoefficientsAsPolys(extension, extension::valueOf);
//            aE = aE.composition(aE.createConstant(extension.generator()).subtract(aE.createMonomial(1).multiply(s)));
//
//            UnivariatePolynomial<sPoly> gcd = UnivariateGCD.PolynomialGCD(aE, bE).monic();
//            assert gcd.degree() == 1;
//
//            sPoly bRep = extension.negate(gcd.cc());
//            sPoly aRep = extension.subtract(extension.generator(), bRep.clone().multiply(s));
//
//            return new MultipleFieldExtension<>(a.createArray(a, b),
//                    factory.createMonomial(0, 1).add(factory.createMonomial(1, 1).multiply(s)),
//                    a.createArray(aRep, bRep), extension);
//        }
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MultipleFieldExtension<?, ?, ?> that = (MultipleFieldExtension<?, ?, ?>) o;
        return Arrays.equals(minimalPolynomialsOfGenerators, that.minimalPolynomialsOfGenerators);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Arrays.hashCode(minimalPolynomialsOfGenerators);
        return result;
    }

    @Override
    public String toString(IStringifier stringifier) {
        String cfrStr = sFactory.coefficientRingToString(stringifier);
        String varStr = IntStream.range(0, nVariables()).mapToObj(i -> stringifier.getBinding(variable(i))).collect(Collectors.joining(", "));
        String irrStr = IntStream.range(0, nVariables())
                .mapToObj(i -> {
                    IUnivariatePolynomial p = minimalPolynomialsOfGenerators[i];
                    String pString;
                    if (stringifier instanceof Coder) {
                        Map bindings = stringifier.getBindings();
                        IUnivariatePolynomial v = p.createMonomial(1);
                        Object old = bindings.put(v, stringifier.getBinding(variable(i)));
                        pString = p.toString(stringifier);
                        if (old == null)
                            bindings.remove(v);
                        else
                            bindings.put(v, old);
                    } else
                        pString = p.toString(stringifier);
                    return pString + " = 0";
                })
                .collect(Collectors.joining(", "));
        return "(" + cfrStr + ")[" + varStr + "]/<" + irrStr + ">";
    }

    public String toString(String... variables) {
        return toString(IStringifier.mkPolyStringifier(mFactory, variables));
    }

    @Override
    public String toString() {
        return toString(IStringifier.defaultVars(nVariables()));
    }

    static class MappingFunc<
            Term extends AMonomial<Term>,
            mPoly extends AMultivariatePolynomial<Term, mPoly>,
            sPoly extends IUnivariatePolynomial<sPoly>
            > implements Serializable {
        /**
         * Primitive element that generates equivalent simple extension
         */
        final mPoly primitiveElement;
        /**
         * Simple field extension generated by primitive element
         */
        final SimpleFieldExtension<sPoly> simpleExtension;
        /**
         * Generators represented as elements of simple field extension
         */
        final sPoly[] generatorsReps;

        MappingFunc(mPoly primitiveElement, SimpleFieldExtension<sPoly> simpleExtension, sPoly[] generatorsReps) {
            this.primitiveElement = primitiveElement;
            this.simpleExtension = simpleExtension;
            this.generatorsReps = generatorsReps;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            MappingFunc<?, ?, ?> that = (MappingFunc<?, ?, ?>) o;
            return Objects.equals(primitiveElement, that.primitiveElement) &&
                    Arrays.equals(generatorsReps, that.generatorsReps);
        }

        @Override
        public int hashCode() {
            int result = Objects.hash(primitiveElement);
            result = 31 * result + Arrays.hashCode(generatorsReps);
            return result;
        }
    }

    static final class SimpleToMultiple<
            Term extends AMonomial<Term>,
            mPoly extends AMultivariatePolynomial<Term, mPoly>,
            sPoly extends IUnivariatePolynomial<sPoly>
            > extends MappingFunc<Term, mPoly, sPoly> implements Function<sPoly, mPoly> {
        final MultipleFieldExtension<Term, mPoly, sPoly>[] tower;
        final UnivariatePolynomial<mPoly>[] minimalPolynomials;

        public SimpleToMultiple(mPoly primitiveElement,
                                SimpleFieldExtension<sPoly> simpleExtension,
                                sPoly[] generatorsReps,
                                MultipleFieldExtension<Term, mPoly, sPoly>[] tower,
                                UnivariatePolynomial<mPoly>[] minimalPolynomials) {
            super(primitiveElement, simpleExtension, generatorsReps);
            this.tower = tower;
            this.minimalPolynomials = minimalPolynomials;
        }

        @Override
        @SuppressWarnings("unchecked")
        public mPoly apply(sPoly sPoly) {
            mPoly r = (mPoly) sPoly.composition(primitiveElement);
            if (r.nVariables > 1) {
                MultipleFieldExtension<Term, mPoly, sPoly> prevExt = tower[tower.length - 1];
                int variable = r.nVariables - 1;
                r = AMultivariatePolynomial.asMultivariate(
                        UnivariateDivision.remainder(
                                r.asUnivariateEliminate(variable).setRingUnsafe(prevExt),
                                minimalPolynomials[variable],
                                false), variable, true);
            }

//            for (int i = minimalPolynomials.length - 1; i >= 0; --i) {
//                MonomialOrder.EliminationOrder order = new MonomialOrder.EliminationOrder(MonomialOrder.LEX, i);
//                mPoly gen = i == 0
//                        ? AMultivariatePolynomial.asMultivariate(minimalPolynomials[i], i + 1, true).dropVariable(0).joinNewVariables(minimalPolynomials.length - i - 1)
//                        : AMultivariatePolynomial.asMultivariate(minimalPolynomials[i], i, true).joinNewVariables(minimalPolynomials.length - i - 1);
//                r = r.setOrdering(order);
//                gen = gen.setOrdering(order);
//                r = MultivariateDivision.remainder(r, gen);
//            }
            return r;
        }
    }

    static final class MultipleToSimple<
            Term extends AMonomial<Term>,
            mPoly extends AMultivariatePolynomial<Term, mPoly>,
            sPoly extends IUnivariatePolynomial<sPoly>
            > extends MappingFunc<Term, mPoly, sPoly> implements Function<mPoly, sPoly> {
        MultipleToSimple(mPoly primitiveElement, SimpleFieldExtension<sPoly> simpleExtension, sPoly[] generatorsReps) {
            super(primitiveElement, simpleExtension, generatorsReps);
        }

        @Override
        public sPoly apply(mPoly mPoly) {
            return mPoly.composition(simpleExtension, generatorsReps);
        }
    }
}
