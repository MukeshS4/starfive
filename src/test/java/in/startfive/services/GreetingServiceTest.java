package in.startfive.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.atMost;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class GreetingServiceTest {

	private GreetingService gs = mock(GreetingService.class);

	@Test
	public void testgreet() {
		when(gs.greet()).thenReturn("Hello World!!");
		assertEquals("Hello World!!", gs.greet());
		assertEquals("Hello World!!", gs.greet());
		assertEquals("Hello World!!", gs.greet());
		
		// verify(gs,times(1)).greet();
		// verify(gs,atLeastOnce()).greet();
		verify(gs, atMost(3)).greet();

	}

}
