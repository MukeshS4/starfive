package in.startfive.annotation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class TestX {
	
	@Mock
	private List lst;	
	@Test
	public void demo() {
		
		when(lst.size()).thenReturn(10);
		assertEquals(lst.size(), 10);
		
		
		
	}
}
