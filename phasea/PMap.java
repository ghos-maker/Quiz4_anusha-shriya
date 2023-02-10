/*
 * Phase A <studentA EID><studentB EID>
 * Phase B <studentB EID><studentA EID>
 */

package pmap.phasea;

import java.awt.RenderingHints.Key;
import java.awt.im.InputMethodHighlight;
import java.util.zip.ZipEntry;

/**
 * PMap stands for Paired Map. A map is a collection of key-value
 * pairs, e.g., (1, 2) (2, 3) (3, 4) are all pairs with an integer key
 * and an integer value. See the
 * <a href="https://docs.oracle.com/javase/8/docs/api/java/util/Map.html">
 * java.util.Map documentation</a> for how these methods are supposed
 * to work.
 */
public class PMap {

    /**
     * Returns the number of key-value mappings in this map.
     *
     * @return the number of key-value mappings in this map
     */
    public Integer size() {
    	
        return PMap.size();
    }

    /**
     * Returns <tt>true</tt> if this map contains no key-value
     * mappings.
     *
     * @return <tt>true</tt> if this map contains no key-value
     *         mappings
     */
    public boolean isEmpty() {
        if(PMap.size() == 0) {
        	return true;
        }
    	// TODO
        return false;
    }

    /**
     * Returns <tt>true</tt> if this map contains a mapping for the
     * specified key.
     *
     * @param key key whose presence in this map is to be tested
     * @return <tt>true</tt> if this map contains a mapping for the
     *         specified key
     */
    public boolean containsKey(Integer key) {
        for(int i:pMap.entrySet()) {
        	if(PMap.getKey() == key) {
        		return true;
        	}
        }
    	// TODO
        return false;
    }

    /**
     * Returns <tt>true</tt> if this map maps one or more keys to the
     * specified value.
     *
     * @param value value whose presence in this map is to be tested
     * @return <tt>true</tt> if this map maps one or more keys to the
     *         specified value
     */
    public boolean containsValue(Integer value) {
    	for(int i:pMap.entrySet()) {
    		if(pMap.getValue() == value) {
    			return true;
    		}
    	}
        // TODO
        return false;
    }

    /**
     * Returns the value to which the specified key is mapped, or
     * {@code null} if this map contains no mapping for the key.
     *
     * @param key the key whose associated value is to be returned
     * @return the value to which the specified key is mapped, or
     *         {@code null} if this map contains no mapping for the
     *         key
     */
    public Integer get(Integer key) {
    	for(int i:pMap.entrySet()) {
    		if (pMap.getKey() == key) {
    			return pMap.getValue();
    		}
    	}
        // TODO
        return null;
    }

    /**
     * Associates the specified value with the specified key in this
     * map (optional operation).  If the map previously contained a
     * mapping for the key, the old value is replaced by the specified
     * value.
     *
     * @param key key with which the specified value is to be
     *        associated
     * @param value value to be associated with the specified key
     * @return the previous value associated with <tt>key</tt>, or
     *         <tt>null</tt> if there was no mapping for <tt>key</tt>.
     */
    public Integer put(Integer key, Integer value) {
    	for(int i:pMap.entrySet()) {
    		if(pMap.getKey() == key) {
    			pMap.setValue(value);
    		}
    	}
        // TODO
        return null;
    }

    /**
     * Removes the mapping for a key from this map if it is present
     * (optional operation).
     *
     * <p>Returns the value to which this map previously associated
     * the key, or <tt>null</tt> if the map contained no mapping for
     * the key.
     *
     * <p>The map will not contain a mapping for the specified key
     * once the call returns.
     *
     * @param key key whose mapping is to be removed from the map
     * @return the previous value associated with <tt>key</tt>, or
     *         <tt>null</tt> if there was no mapping for <tt>key</tt>.
     */
    public Integer remove(Integer key) {
    	Integer temp = null;
    	for(int i:PMap.entrySet()) {
    		if(PMap.getKey() == key) {
    			temp = pMap.getValue();
    			pMap.remove(Integer key);
    		}
    	}
    	return temp;
        // TODO
        
    }

    /**
     * Put all of the mappings from a pair of arrays to this map. Each
     * pair of elements sharing the same index in <tt>keys</tt> and
     * <tt>values</tt> composes a mapping to be stored the map.
     *
     * @param keys the array of keys to be stored in this map
     * @param values the array of values to be stored in this map
     */
    public void putAll(Integer[] keys, Integer[] values) {

    	for(int i; i<keys.size(); i++) {
    		
    		PEntry(keys[i], values[i]);
    	}
        // TODO
    }

    /**
     * Removes all of the mappings from this map. The map will be
     * empty after this call returns.
     */
    public void clear() {
    	PMap.clear();
        // TODO
    }

    /**
     * Returns an array of the keys contained in this map.
     *
     * @return an array of the keys contained in this map
     */
    public Integer[] keySet() {
    	Integer[] keysArrayIntegers = new Integer[PMap.size()];
    	for(int i:PMap.entrySet()) {
    		keysArrayIntegers[i]= PMap.getKey(); 
    	}
        // TODO
        return keysArrayIntegers;
    }

    /**
     * Returns an array of the values contained in this map.
     *
     * @return an array of the values contained in this map
     */
    public Integer[] values() {
    	Integer[] valuesArrayIntegers = new Integer[PMap.size()];
    	for(int i:PMap.entrySet()) {
    		valuesArrayIntegers[i]= PMap.getValue(); 
    	}
        // TODO
        return valuesArrayIntegers;
    }

    /**
     * Returns an array of the mappings contained in this map.
     *
     * @return an array of the mappings contained in this map
     */
    public PEntry[] entrySet() {
    	PEntry[] mappingArray = new PEntry[PMap.size()];
    	for(int i:PMap.entrySet()) {
    		PEntry temp = (PEntry)PMap.getKey();
    		mappingArray[i]= temp;
    	}
        // TODO
        return mappingArray;
    }
}
