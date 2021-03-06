/*
 * Copyright (C) 2012 The Guava Authors
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
import com.gx.common.collect.ImmutableMap.IteratorBasedImmutableMap;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

import java.io.Serializable;
import java.util.EnumMap;

import static com.gx.common.base.Preconditions.checkArgument;

/**
 * Implementation of {@link ImmutableMap} backed by a non-empty {@link EnumMap}.
 *
 * @author Louis Wasserman
 */
@GwtCompatible(serializable = true, emulated = true)
@SuppressWarnings("serial") // we're overriding default serialization
final class ImmutableEnumMap<K extends Enum<K>, V> extends IteratorBasedImmutableMap<K, V> {
    private final transient EnumMap<K, V> delegate;

    private ImmutableEnumMap(EnumMap<K, V> delegate) {
        this.delegate = delegate;
        checkArgument(!delegate.isEmpty());
    }

    static <K extends Enum<K>, V> ImmutableMap<K, V> asImmutable(EnumMap<K, V> map) {
        switch (map.size()) {
            case 0:
                return ImmutableMap.of();
            case 1:
                Entry<K, V> entry = Iterables.getOnlyElement(map.entrySet());
                return ImmutableMap.of(entry.getKey(), entry.getValue());
            default:
                return new ImmutableEnumMap<>(map);
        }
    }

    @Override
    UnmodifiableIterator<K> keyIterator() {
        return Iterators.unmodifiableIterator(delegate.keySet().iterator());
    }

    @Override
    public int size() {
        return delegate.size();
    }

    @Override
    public boolean containsKey(@NullableDecl Object key) {
        return delegate.containsKey(key);
    }

    @Override
    public V get(Object key) {
        return delegate.get(key);
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof ImmutableEnumMap) {
            object = ((ImmutableEnumMap<?, ?>) object).delegate;
        }
        return delegate.equals(object);
    }

    @Override
    UnmodifiableIterator<Entry<K, V>> entryIterator() {
        return Maps.unmodifiableEntryIterator(delegate.entrySet().iterator());
    }

    @Override
    boolean isPartialView() {
        return false;
    }

    // All callers of the constructor are restricted to <K extends Enum<K>>.
    @Override
    Object writeReplace() {
        return new EnumSerializedForm<>(delegate);
    }

    /*
     * This class is used to serialize ImmutableEnumMap instances.
     */
    private static class EnumSerializedForm<K extends Enum<K>, V> implements Serializable {
        private static final long serialVersionUID = 0;
        final EnumMap<K, V> delegate;

        EnumSerializedForm(EnumMap<K, V> delegate) {
            this.delegate = delegate;
        }

        Object readResolve() {
            return new ImmutableEnumMap<>(delegate);
        }
    }
}
