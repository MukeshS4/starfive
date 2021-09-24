package in.startfive.misc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class TestSimple {

	@Test
	public void testx() {
		// mock
		List lst = mock(ArrayList.class);
		// stubbing
		when(lst.get(0)).thenReturn("hello");
		when(lst.size()).thenReturn(1);
		assertEquals("hello",lst.get(0));
		assertEquals(1,lst.size());
	}
	
	@Test
	public void testIter() {
		Iterator i = mock(Iterator.class);
		when(i.next()).thenReturn("Munich").thenReturn("Berlin");
		assertEquals("Munich", i.next());
		assertEquals("Berlin", i.next());
	
	}
}
