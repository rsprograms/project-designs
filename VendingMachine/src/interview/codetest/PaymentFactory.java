package interview.codetest;

public class PaymentFactory {
	
	public Payment getPayment(PaymentType paymentType) {
		Payment payment = null;
		if (paymentType.equals(PaymentType.CREDIT_CARD)) {
			payment = new CreditCardPayment();
		}
		return payment;
	}

}
