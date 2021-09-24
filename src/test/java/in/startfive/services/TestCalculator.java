package in.startfive.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

public class TestCalculator {

	private CalcAPI calcAPI = mock(CalcAPI.class);
	private Calculator cal = new Calculator(calcAPI);
	
	@Test
	public void addTest() {
		when(calcAPI.add(10, 5)).thenReturn(15);
			
		ArgumentCaptor<Integer> ac = ArgumentCaptor.forClass(Integer.class);
		
		assertEquals(15, cal.add(10,5));
		
		verify(calcAPI).add(ac.capture(), ac.capture());
		
		ac.getAllValues().stream().forEach(System.out::println);
		
		assertEquals(ac.getAllValues().get(0), 10);
		assertEquals(ac.getAllValues().get(1), 5);
		
	}
}
