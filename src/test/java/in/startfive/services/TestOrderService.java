package in.startfive.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class TestOrderService {

	private SMSService sMSService = mock(SMSService.class);
	
	//if any of the method not stubbed wil call real method
	private EmailService emailService = mock(EmailService.class);

//	private EmailService emailService = new EmailService();

	private OrderService orderService;

	@Test
	public void testplaceorder() {
		orderService = new  OrderService(sMSService, emailService);
		when(emailService.sendEmail()).thenReturn(true);
		when(sMSService.sendSMS()).thenReturn(true);
		
		assertEquals(1, orderService.placeOrder());
		verify(sMSService, times(1)).sendSMS();

	}

}
