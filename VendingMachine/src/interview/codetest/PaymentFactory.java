package interview.codetest;

public class PaymentFactory {
	
	public Payment getPayment(PaymentType paymentType) {
		Payment payment = null;
		switch(paymentType)
		{
			case CREDIT_CARD : payment = new CreditCardPayment();
			case CASH : payment = new CashPayment();
			case E_PAY : payment = new EPayment();
		}		
		return payment;
	}

}
