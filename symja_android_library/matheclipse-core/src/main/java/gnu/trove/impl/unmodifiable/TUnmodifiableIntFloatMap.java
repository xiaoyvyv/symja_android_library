///////////////////////////////////////////////////////////////////////////////
// Copyright (c) 2008, Robert D. Eden All Rights Reserved.
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

package gnu.trove.impl.unmodifiable;


//////////////////////////////////////////////////
// THIS IS A GENERATED CLASS. DO NOT HAND EDIT! //
//////////////////////////////////////////////////

////////////////////////////////////////////////////////////
// THIS IS AN IMPLEMENTATION CLASS. DO NOT USE DIRECTLY!  //
// Access to these methods should be through TCollections //
////////////////////////////////////////////////////////////


import gnu.trove.iterator.*;
import gnu.trove.procedure.*;
import gnu.trove.set.*;
import gnu.trove.list.*;
import gnu.trove.function.*;
import gnu.trove.map.*;
import gnu.trove.*;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Random;
import java.io.Serializable;
import java.io.ObjectOutputStream;
import java.io.IOException;


public class TUnmodifiableIntFloatMap implements TIntFloatMap, Serializable {
	private static final long serialVersionUID = -1034234728574286014L;

	private final TIntFloatMap m;

	public TUnmodifiableIntFloatMap( TIntFloatMap m ) {
		if ( m == null )
			throw new NullPointerException();
		this.m = m;
	}

    @Override
	public int size()                       { return m.size(); }
    @Override
	public boolean isEmpty()                { return m.isEmpty(); }
    @Override
	public boolean containsKey( int key )   { return m.containsKey( key ); }
    @Override
	public boolean containsValue( float val ) { return m.containsValue( val ); }
    @Override
	public float get( int key)                { return m.get( key ); }

    @Override
	public float put( int key, float value ) { throw new UnsupportedOperationException(); }
    @Override
	public float remove( int key ) { throw new UnsupportedOperationException(); }
    @Override
	public void putAll( TIntFloatMap m ) { throw new UnsupportedOperationException(); }
    @Override
	public void putAll( Map<? extends Integer, ? extends Float> map ) { throw new UnsupportedOperationException(); }
    @Override
	public void clear() { throw new UnsupportedOperationException(); }

	private transient TIntSet keySet = null;
	private transient TFloatCollection values = null;

    @Override
	public TIntSet keySet() {
		if ( keySet == null )
			keySet = TCollections.unmodifiableSet( m.keySet() );
		return keySet;
	}
    @Override
	public int[] keys() { return m.keys(); }
    @Override
	public int[] keys( int[] array ) { return m.keys( array ); }

    @Override
	public TFloatCollection valueCollection() {
		if ( values == null )
			values = TCollections.unmodifiableCollection( m.valueCollection() );
		return values;
	}
    @Override
	public float[] values() { return m.values(); }
    @Override
	public float[] values( float[] array ) { return m.values( array ); }

    @Override
	public boolean equals(Object o) { return o == this || m.equals(o); }
    @Override
	public int hashCode()           { return m.hashCode(); }
    @Override
	public String toString()        { return m.toString(); }
    @Override
	public int getNoEntryKey()      { return m.getNoEntryKey(); }
    @Override
	public float getNoEntryValue()    { return m.getNoEntryValue(); }

    @Override
	public boolean forEachKey( TIntProcedure procedure ) {
		return m.forEachKey( procedure );
	}
    @Override
	public boolean forEachValue( TFloatProcedure procedure ) {
		return m.forEachValue( procedure );
	}
    @Override
	public boolean forEachEntry( TIntFloatProcedure procedure ) {
		return m.forEachEntry( procedure );
	}

    @Override
	public TIntFloatIterator iterator() {
		return new TIntFloatIterator() {
			TIntFloatIterator iter = m.iterator();

            @Override
			public int key() { return iter.key(); }
            @Override
			public float value() { return iter.value(); }
            @Override
			public void advance() { iter.advance(); }
            @Override
			public boolean hasNext() { return iter.hasNext(); }
            @Override
			public float setValue( float val ) { throw new UnsupportedOperationException(); }
            @Override
			public void remove() { throw new UnsupportedOperationException(); }
		};
	}

    @Override
	public float putIfAbsent( int key, float value ) { throw new UnsupportedOperationException(); }
    @Override
	public void transformValues( TFloatFunction function ) { throw new UnsupportedOperationException(); }
    @Override
	public boolean retainEntries( TIntFloatProcedure procedure ) { throw new UnsupportedOperationException(); }
    @Override
	public boolean increment( int key ) { throw new UnsupportedOperationException(); }
    @Override
	public boolean adjustValue( int key, float amount ) { throw new UnsupportedOperationException(); }
    @Override
	public float adjustOrPutValue( int key, float adjust_amount, float put_amount ) { throw new UnsupportedOperationException(); }
}
