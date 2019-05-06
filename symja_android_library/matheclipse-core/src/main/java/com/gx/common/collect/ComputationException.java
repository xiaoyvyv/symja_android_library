/*
 * Copyright (C) 2009 The Guava Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.gx.common.collect;

import com.gx.common.annotations.GwtCompatible;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/**
 * Wraps an exception that occurred during a computation.
 *
 * @author Bob Lee
 * @since 2.0
 */
@GwtCompatible
public class ComputationException extends RuntimeException {
    private static final long serialVersionUID = 0;

    /**
     * Creates a new instance with the given cause.
     */
    public ComputationException(@NullableDecl Throwable cause) {
        super(cause);
    }
}