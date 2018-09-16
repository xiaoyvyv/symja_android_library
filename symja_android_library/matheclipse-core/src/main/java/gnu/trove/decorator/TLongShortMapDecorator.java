///////////////////////////////////////////////////////////////////////////////
// Copyright (c) 2002, Eric D. Friedman All Rights Reserved.
// Copyright (c) 2009, Robert D. Eden All Rights Reserved.
// Copyright (c) 2009, Jeff Randall All Rights Reserved.
//
// This library is free software; you can redistribute it and/or
// modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either
// version 2.1 of the License, or (at your option) any later version.
//
// This library is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public
// License along with this program; if not, write to the Free Software
// Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
///////////////////////////////////////////////////////////////////////////////

package gnu.trove.decorator;

import gnu.trove.map.TLongShortMap;
import gnu.trove.iterator.TLongShortIterator;

import java.io.*;
import java.util.*;


//////////////////////////////////////////////////
// THIS IS A GENERATED CLASS. DO NOT HAND EDIT! //
//////////////////////////////////////////////////


/**
 * Wrapper class to make a TLongShortMap conform to the <tt>java.util.Map</tt> API.
 * This class simply decorates an underlying TLongShortMap and translates the Object-based
 * APIs into their Trove primitive analogs.
 * <p/>
 * Note that wrapping and unwrapping primitive values is extremely inefficient.  If
 * possible, users of this class should override the appropriate methods in this class
 * and use a table of canonical values.
 * <p/>
 * Created: Mon Sep 23 22:07:40 PDT 2002
 *
 * @author Eric D. Friedman
 * @author Robert D. Eden
 * @author Jeff Randall
 */
public class TLongShortMapDecorator extends AbstractMap<Long, Short>
	implements Map<Long, Short>, Externalizable, Cloneable {

	static final long serialVersionUID = 1L;

    /** the wrapped primitive map */
    protected TLongShortMap _map;


    /**
     * FOR EXTERNALIZATION ONLY!!
     */
    public TLongShortMapDecorator() {}


    /**
     * Creates a wrapper that decorates the specified primitive map.
     *
     * @param map the <tt>TLongShortMap</tt> to wrap.
     */
    public TLongShortMapDecorator( TLongShortMap map ) {
        super();
        this._map = map;
    }


    /**
     * Returns a reference to the map wrapped by this decorator.
     *
     * @return the wrapped <tt>TLongShortMap</tt> instance.
     */
    public TLongShortMap getMap() {
        return _map;
    }


    /**
     * Inserts a key/value pair into the map.
     *
     * @param key   an <code>Object</code> value
     * @param value an <code>Object</code> value
     * @return the previous value associated with <tt>key</tt>,
     *         or Short(0) if none was found.
     */
    @Override
    public Short put( Long key, Short value ) {
        long k = unwrapKey( key );
        short v = unwrapValue( value );
        if ( _map.containsKey( k ) ) {
            short retval = _map.put( k, v );
            return wrapValue( retval);
        }
        _map.put( k, v );
        return null;
    }


    /**
     * Retrieves the value for <tt>key</tt>
     *
     * @param key an <code>Object</code> value
     * @return the value of <tt>key</tt> or null if no such mapping exists.
     */
    @Override
    public Short get( Object key ) {
        if (! ( key instanceof Long ) ) {
            return null;
        }
        long k = unwrapKey( key );
        short v = _map.get( k );
        if (v == _map.getNoEntryValue() && !_map.containsKey( k ) ) {
            return null;
        }
        return wrapValue( v );
    }


    /**
     * Empties the map.
     */
    @Override
    public void clear() {
        this._map.clear();
    }


    /**
     * Deletes a key/value pair from the map.
     *
     * @param key an <code>Object</code> value
     * @return the removed value, or null if it was not found in the map
     */
    @Override
    public Short remove( Object key ) {
        if (! (key instanceof Long ) ) {
            return null;
        }
        long k = unwrapKey( key );
        if ( _map.containsKey( k ) ) {
            short v = _map.remove( k );
            return wrapValue( v );
        }
        return null;
    }


    /**
     * Returns a Set view on the entries of the map.
     *
     * @return a <code>Set</code> value
     */
    @Override
    public Set<Entry<Long,Short>> entrySet() {
        return new AbstractSet<Entry<Long,Short>>() {
            @Override
            public int size() {
                return _map.size();
            }

            @Override
            public boolean isEmpty() {
                return TLongShortMapDecorator.this.isEmpty();
            }

            @Override
            public boolean contains( Object o ) {
                if (o instanceof Map.Entry) {
                    Object k = ( ( Entry ) o ).getKey();
                    Object v = ( ( Entry ) o ).getValue();
                    return TLongShortMapDecorator.this.containsKey(k)
                            && TLongShortMapDecorator.this.get(k).equals(v);
                } else {
                    return false;
                }
            }

            @Override
            public Iterator<Entry<Long,Short>> iterator() {
                return new Iterator<Entry<Long,Short>>() {
                    private final TLongShortIterator it = _map.iterator();

                    @Override
                    public Entry<Long,Short> next() {
                        it.advance();
                        long ik = it.key();
                        final Long key =  wrapKey( ik );
                        short iv = it.value();
                        final Short v = wrapValue( iv );
                        return new Entry<Long,Short>() {
                            private Short val = v;

                            @Override
                            public boolean equals( Object o ) {
                                return o instanceof Map.Entry
                                        && ( ( Entry ) o ).getKey().equals(key)
                                        && ( ( Entry ) o ).getValue().equals(val);
                            }

                            @Override
                            public Long getKey() {
                                return key;
                            }

                            @Override
                            public Short getValue() {
                                return val;
                            }

                            @Override
                            public int hashCode() {
                                return key.hashCode() + val.hashCode();
                            }

                            @Override
                            public Short setValue( Short value ) {
                                val = value;
                                return put( key, value );
                            }
                        };
                    }

                    @Override
                    public boolean hasNext() {
                        return it.hasNext();
                    }

                    @Override
                    public void remove() {
                        it.remove();
                    }
                };
            }

            @Override
            public boolean add( Entry<Long,Short> o ) {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean remove( Object o ) {
                boolean modified = false;
                if ( contains( o ) ) {
                    //noinspection unchecked
                    Long key = ( ( Entry<Long,Short> ) o ).getKey();
                    _map.remove( unwrapKey( key ) );
                    modified = true;
                }
                return modified;
            }

            @Override
            public boolean addAll( Collection<? extends Entry<Long, Short>> c ) {
                throw new UnsupportedOperationException();
            }

            @Override
            public void clear() {
                TLongShortMapDecorator.this.clear();
            }
        };
    }


    /**
     * Checks for the presence of <tt>val</tt> in the values of the map.
     *
     * @param val an <code>Object</code> value
     * @return a <code>boolean</code> value
     */
    @Override
    public boolean containsValue( Object val ) {
        return val instanceof Short && _map.containsValue( unwrapValue( val ) );
    }


    /**
     * Checks for the present of <tt>key</tt> in the keys of the map.
     *
     * @param key an <code>Object</code> value
     * @return a <code>boolean</code> value
     */
    @Override
    public boolean containsKey( Object key ) {
        if ( key == null ) return _map.containsKey( _map.getNoEntryKey() );
        return key instanceof Long && _map.containsKey( unwrapKey( key ) );
    }


    /**
     * Returns the number of entries in the map.
     *
     * @return the map's size.
     */
    @Override
    public int size() {
        return this._map.size();
    }


    /**
     * Indicates whether map has any entries.
     *
     * @return true if the map is empty
     */
    @Override
    public boolean isEmpty() {
        return size() == 0;
    }


    /**
     * Copies the key/value mappings in <tt>map</tt> into this map.
     * Note that this will be a <b>deep</b> copy, as storage is by
     * primitive value.
     *
     * @param map a <code>Map</code> value
     */
    @Override
    public void putAll( Map<? extends Long, ? extends Short> map ) {
        Iterator<? extends Entry<? extends Long,? extends Short>> it =
            map.entrySet().iterator();
        for ( int i = map.size(); i-- > 0; ) {
            Entry<? extends Long,? extends Short> e = it.next();
            this.put( e.getKey(), e.getValue() );
        }
    }


    /**
     * Wraps a key
     *
     * @param k key in the underlying map
     * @return an Object representation of the key
     */
    protected Long wrapKey( long k ) {
        return Long.valueOf( k );
    }


    /**
     * Unwraps a key
     *
     * @param key wrapped key
     * @return an unwrapped representation of the key
     */
    protected long unwrapKey( Object key ) {
        return ( ( Long ) key ).longValue();
    }


    /**
     * Wraps a value
     *
     * @param k value in the underlying map
     * @return an Object representation of the value
     */
    protected Short wrapValue( short k ) {
        return Short.valueOf( k );
    }


    /**
     * Unwraps a value
     *
     * @param value wrapped value
     * @return an unwrapped representation of the value
     */
    protected short unwrapValue( Object value ) {
        return ( ( Short ) value ).shortValue();
    }


    // Implements Externalizable
    @Override
    public void readExternal( ObjectInput in )
        throws IOException, ClassNotFoundException {

        // VERSION
        in.readByte();

        // MAP
        _map = ( TLongShortMap ) in.readObject();
    }


    // Implements Externalizable
    @Override
    public void writeExternal( ObjectOutput out ) throws IOException {
        // VERSION
        out.writeByte(0);

        // MAP
        out.writeObject( _map );
    }

} // TLongShortHashMapDecorator
