package in.arc.beans;

public class PaymentService {

	private IPayment payment;
	public PaymentService() {
		System.out.println("CONSTRUCTOR 0param :: PaymentService.PaymentService()");
	}
	public PaymentService(IPayment iPayment) {
		System.out.println("CONSTRUCTOR 1param :: PaymentService.PaymentService()");
		this.payment=iPayment;
	}
	
	public void setPayment(IPayment payment) {
		System.out.println("Setter 1param :: PaymentService.setPayment()");
		this.payment=payment;
	}
	
	public void doPayment(double billAmount) {
		
		boolean status = payment.processPayment(billAmount);
		
		if(status) {
			System.out.println("Receipt Processing ..");
		}else {
			System.out.println("Payment method declined .!!.");
		}
		
	}
	
}
