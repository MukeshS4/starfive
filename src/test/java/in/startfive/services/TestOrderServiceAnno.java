package in.startfive.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class TestOrderServiceAnno {

	@Mock
	private SMSService sMSService;

	@Spy
	private EmailService emailService ;

	@InjectMocks
	private OrderService orderService;


	@Test
	public void testplaceorder() {
        // eq to line # 27,28
		//orderService = new  OrderService(sMSService, emailService);
		
		doReturn(true).when(emailService).sendEmail();
		when(sMSService.sendSMS()).thenReturn(true);
		
		assertEquals(1, orderService.placeOrder());
		verify(sMSService, times(1)).sendSMS();

	}

}
