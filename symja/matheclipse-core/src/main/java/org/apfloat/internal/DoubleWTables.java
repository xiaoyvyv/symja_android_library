package org.apfloat.internal;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

import static org.apfloat.internal.DoubleModConstants.MODULUS;
import static org.apfloat.internal.DoubleModConstants.PRIMITIVE_ROOT;

/**
 * Helper class for generating and caching tables of powers of the n:th root of unity.
 *
 * @author Mikko Tommila
 * @version 1.7.0
 * @since 1.7.0
 */

public class DoubleWTables
        extends DoubleModMath {
    // With inverses, three moduli and lengths being powers of two, the theoretical maximum map size is 2 * 3 * 30 = 180 entries
    private static ConcurrentMap<List<Integer>, double[]> cache = new ConcurrentSoftHashMap<List<Integer>, double[]>();

    private DoubleWTables() {
        // Default constructor
    }

    /**
     * Get a table of powers of n:th root of unity.
     *
     * @param modulus The index of the modulus to be used.
     * @param length  The length of the table to be returned, i.e. n.
     * @return The table of powers of the n:th root of unity.
     */

    public static double[] getWTable(int modulus, int length) {
        return getWTable(modulus, length, false);
    }

    /**
     * Get a table of inverses of powers of n:th root of unity.
     *
     * @param modulus The index of the modulus to be used.
     * @param length  The length of the table to be returned, i.e. n.
     * @return The table of inverses of powers of the n:th root of unity.
     */

    public static double[] getInverseWTable(int modulus, int length) {
        return getWTable(modulus, length, true);
    }

    private static double[] getWTable(int modulus, int length, boolean isInverse) {
        List<Integer> key = Arrays.asList(isInverse ? 1 : 0, modulus, length);
        double[] wTable = DoubleWTables.cache.get(key);
        // Do not synchronize, multiple threads may do this at the same time, but only one gets to put the value in the cache
        if (wTable == null) {
            DoubleModMath instance = getInstance(modulus);
            double w = (isInverse ?
                    instance.getInverseNthRoot(PRIMITIVE_ROOT[modulus], length) :  // Inverse n:th root
                    instance.getForwardNthRoot(PRIMITIVE_ROOT[modulus], length));  // Forward n:th root
            wTable = instance.createWTable(w, length);
            // Check if another thread already put the wTable in the cache; if so then use it
            double[] value = DoubleWTables.cache.putIfAbsent(key, wTable);
            if (value != null) {
                // Another thread did put the value in the cache so use it
                wTable = value;
            }
        }
        return wTable;
    }

    private static DoubleModMath getInstance(int modulus) {
        DoubleModMath instance = new DoubleModMath();
        instance.setModulus(MODULUS[modulus]);
        return instance;
    }
}
