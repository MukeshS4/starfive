package in.startfive.services;

public class OrderService {
	private SMSService sMSService;
	private EmailService emailService;
	
	public OrderService(SMSService sMSService, EmailService emailService) {
		this.sMSService = sMSService;
		this.emailService = emailService;
	}

	public int placeOrder() {
		System.out.println("order placed..");
		sMSService.sendSMS();
		emailService.sendEmail();
		return 1;

	}
}
