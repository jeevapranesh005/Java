package handsOn5;

public class NetBankingPayment extends Payment{

	String ifscCode;
	String accountNumber;
	String bankName;
	public NetBankingPayment(String transactionId, double amount, String customerName, String paymentStatus,
			String ifscCode, String accountNumber, String bankName) {
		super(transactionId, amount, customerName, paymentStatus);
		this.ifscCode = ifscCode;
		this.accountNumber = accountNumber;
		this.bankName = bankName;
	}
	
	public boolean processPayment() {
		if(validPayment()) {
			return true;
		}else
			return false;
	}
	@Override
	public boolean validPayment() {
		// TODO Auto-generated method stub
		if(accountNumber.length()==10&&ifscCode.length()==6) {
			return true;
		}else 
			return false;
	}
}
