package in.arc.beans;

public class DebitCardPayment implements IPayment {

	public boolean processPayment(double billAmount) {

		System.out.println("DebitCardPayment.processPayment() paid "+billAmount+" successful..!!");		
		return true;
	}
	public DebitCardPayment() {
		System.out.println("CONSTRUCTOR :: DebitCardPayment.DebitCardPayment()");
	}

}
