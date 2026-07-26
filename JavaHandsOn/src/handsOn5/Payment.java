package handsOn5;

public abstract class Payment {
	protected String transactionId;
	protected double amount;
	protected String customerName;
	protected String paymentStatus;
	
	public Payment(String transactionId, double amount, String customerName, String paymentStatus) {
		this.transactionId = transactionId;
		this.amount = amount;
		this.customerName = customerName;
		this.paymentStatus = paymentStatus;
	}
	public abstract boolean validPayment();
	public abstract boolean processPayment();
	public void generateReceipt() {
		System.out.println("Transaction ID : "+transactionId);
		System.out.println("Amount : "+amount);
		System.out.println("Customer Name : "+customerName);
		System.out.println("Payment Status : "+paymentStatus);
	}
	public String getTransactionId() {
		return transactionId;
	}
	public double getAmount() {
		return amount;
	}
	public String getCustomerName() {
		return customerName;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public void executetransaction() {
		if(validPayment()) {
			if(processPayment()) {
				setPaymentStatus("Sucess");
			}
		}else {
			setPaymentStatus("Failed");
		}
		generateReceipt();
	}
}
