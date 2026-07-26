package handsOn5;

public class UPIPayment extends Payment {
	String upiPin;
	String upiId;
	public UPIPayment(String transactionId, double amount, String customerName, String paymentStatus, String upiPin,
			String upiId) {
		super(transactionId, amount, customerName, paymentStatus);
		this.upiPin = upiPin;
		this.upiId = upiId;
	}
	
	public boolean processPayment() {
		return true;
	}
	@Override
	public boolean validPayment() {
		// TODO Auto-generated method stub
		if(upiPin.length()==4&&upiId.contains("@"))
			return true;
		else
			return false;
	}
}
