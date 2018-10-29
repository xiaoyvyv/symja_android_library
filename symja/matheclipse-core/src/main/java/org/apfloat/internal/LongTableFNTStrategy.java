package org.apfloat.internal;

import org.apfloat.ApfloatRuntimeException;
import org.apfloat.spi.ArrayAccess;
import org.apfloat.spi.DataStorage;
import org.apfloat.spi.NTTStrategy;
import org.apfloat.spi.Util;

import static org.apfloat.internal.LongModConstants.MAX_TRANSFORM_LENGTH;
import static org.apfloat.internal.LongModConstants.MODULUS;

/**
 * Fast Number Theoretic Transform strategy that uses lookup tables
 * for powers of n:th root of unity and permutation indexes.<p>
 * <p>
 * All access to this class must be externally synchronized.
 *
 * @author Mikko Tommila
 * @version 1.7.0
 */

public class LongTableFNTStrategy
        extends LongTableFNT
        implements NTTStrategy {
    /**
     * Default constructor.
     */

    public LongTableFNTStrategy() {
    }

    public void transform(DataStorage dataStorage, int modulus)
            throws ApfloatRuntimeException {
        long length = dataStorage.getSize();            // Transform length n

        if (length > MAX_TRANSFORM_LENGTH) {
            throw new TransformLengthExceededException("Maximum transform length exceeded: " + length + " > " + MAX_TRANSFORM_LENGTH);
        } else if (length > Integer.MAX_VALUE) {
            throw new ApfloatInternalException("Maximum array length exceeded: " + length);
        }

        setModulus(MODULUS[modulus]);                                       // Modulus
        long[] wTable = LongWTables.getWTable(modulus, (int) length);

        ArrayAccess arrayAccess = dataStorage.getArray(DataStorage.READ_WRITE, 0, (int) length);

        tableFNT(arrayAccess, wTable, null);

        arrayAccess.close();
    }

    public void inverseTransform(DataStorage dataStorage, int modulus, long totalTransformLength)
            throws ApfloatRuntimeException {
        long length = dataStorage.getSize();            // Transform length n

        if (Math.max(length, totalTransformLength) > MAX_TRANSFORM_LENGTH) {
            throw new TransformLengthExceededException("Maximum transform length exceeded: " + Math.max(length, totalTransformLength) + " > " + MAX_TRANSFORM_LENGTH);
        } else if (length > Integer.MAX_VALUE) {
            throw new ApfloatInternalException("Maximum array length exceeded: " + length);
        }

        setModulus(MODULUS[modulus]);                                       // Modulus
        long[] wTable = LongWTables.getInverseWTable(modulus, (int) length);

        ArrayAccess arrayAccess = dataStorage.getArray(DataStorage.READ_WRITE, 0, (int) length);

        inverseTableFNT(arrayAccess, wTable, null);

        divideElements(arrayAccess, (long) totalTransformLength);

        arrayAccess.close();
    }

    public long getTransformLength(long size) {
        return Util.round2up(size);
    }

    private void divideElements(ArrayAccess arrayAccess, long divisor)
            throws ApfloatRuntimeException {
        long inverseFactor = modDivide((long) 1, divisor);
        long[] data = arrayAccess.getLongData();
        int length = arrayAccess.getLength(),
                offset = arrayAccess.getOffset();

        for (int i = 0; i < length; i++) {
            data[i + offset] = modMultiply(data[i + offset], inverseFactor);
        }
    }
}
