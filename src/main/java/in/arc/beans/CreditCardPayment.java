package in.arc.beans;

public class CreditCardPayment implements IPayment {

	public boolean processPayment(double billAmount) {

		System.out.println("CreditCardPayment.processPayment() paid "+billAmount+" successful..!!");
		return true;
	}

	public CreditCardPayment() {
		System.out.println("CONSTRUCTOR :: CreditCardPayment.CreditCardPayment()");
	}
}
