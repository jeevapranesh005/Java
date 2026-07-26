package handsOn5;

public class CreditCardPayment extends Payment{
	String cardNumber;
	String cvv;
	String expiryDate;
	public CreditCardPayment(String transactionId, double amount, String customerName, String paymentStatus,
			String cardNumber, String cvv, String expiryDate) {
		super(transactionId, amount, customerName, paymentStatus);
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.expiryDate = expiryDate;
	}
	public boolean validPayment() {
		if(cardNumber.length()==16 && cvv.length()==3) {
			return true;
		}else 
			return false;
	}
	public boolean processPayment() {
		return true;
	}
}
