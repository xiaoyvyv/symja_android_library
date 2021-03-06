/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * This is not the original file distributed by the Apache Software Foundation
 * It has been modified by the Hipparchus project
 */
package org.hipparchus.util;

import org.hipparchus.Field;
import org.hipparchus.FieldElement;

import java.io.Serializable;

/**
 * The field of double precision floating-point numbers.
 *
 * @see Decimal64
 */
public class Decimal64Field implements Field<Decimal64>, Serializable {

    /**
     * Serializable version identifier
     */
    private static final long serialVersionUID = 20161219L;

    /**
     * Default constructor.
     */
    private Decimal64Field() {
        // Do nothing
    }

    /**
     * Returns the unique instance of this class.
     *
     * @return the unique instance of this class
     */
    public static final Decimal64Field getInstance() {
        return LazyHolder.INSTANCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Decimal64 getZero() {
        return Decimal64.ZERO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Decimal64 getOne() {
        return Decimal64.ONE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Class<? extends FieldElement<Decimal64>> getRuntimeClass() {
        return Decimal64.class;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(final Object other) {
        return this == other;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        return 0x0a04d2bf;
    }

    // CHECKSTYLE: stop HideUtilityClassConstructor

    /**
     * Handle deserialization of the singleton.
     *
     * @return the singleton instance
     */
    private Object readResolve() {
        // return the singleton instance
        return LazyHolder.INSTANCE;
    }
    // CHECKSTYLE: resume HideUtilityClassConstructor

    /**
     * Holder for the instance.
     * <p>We use here the Initialization On Demand Holder Idiom.</p>
     */
    private static class LazyHolder {
        /**
         * Cached field instance.
         */
        private static final Decimal64Field INSTANCE = new Decimal64Field();
    }

}
