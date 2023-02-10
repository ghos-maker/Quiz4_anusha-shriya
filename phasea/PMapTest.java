/*
 * Phase A <studentA EID><studentB EID>
 * Phase B <studentB EID><studentA EID>
 */

package pmap.phasea;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.net.DatagramSocket;

public class PMapTest {
	
	@Test
	public void testSize() {
		PMap m = new PMap();
		assertEquals(0, m.size());
		m.put(0, 1);
		assertEquals(1, m.size());
		m.put(1, 2);
		assertEquals(2, m.size());
	}
	
	@Test
	public void testIsEmpty() {
		PMap m = new PMap();
		assertTrue(m.isEmpty());
		m.put(0, 1);
		assertEquals(false, m.isEmpty());
	}
	
	@Test
	public void testContainsKey() {
		PMap m = new PMap();
		assertEquals(false, m.containsKey(0));
		m.put(0, 1);
		assertEquals(true, m.containsKey(0));
		assertEquals(false, m.containsKey(1));
	}
	
	@Test
	public void testContainsVal() {
		PMap m = new PMap();
		assertEquals(false, m.containsValue(0));
		m.put(0, 1);
		assertEquals(true, m.containsValue(1));
		assertEquals(false, m.containsValue(2));
	}
    @Test
    public void testPut() {
        PMap m = new PMap();
        assertTrue(m.isEmpty());
        assertEquals(null, m.put(1, 2));
        assertEquals(1, m.size().intValue());
        assertEquals(2, m.put(1, 3).intValue());
        assertEquals(1, m.size().intValue());
    }

    @Test
    public void testGet() {
        PMap m = new PMap();
        m.put(1, 2);
        assertEquals(2, m.get(1).intValue());
        assertEquals(null, m.get(2));
    }

    // TODO add more test cases to test all implemented methods
}
