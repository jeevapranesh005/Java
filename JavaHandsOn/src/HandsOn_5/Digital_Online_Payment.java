package HandsOn_5;

import java.util.Scanner;

abstract class payment {
	protected String transactionId;
	protected double amount;
	protected String customerName;
	protected String paymentStatus;

	public payment(String transactionId, double amount, String customerName) {

		this.transactionId = transactionId;
		this.amount = amount;
		this.customerName = customerName;
	}

	abstract boolean validatePayment();

	abstract boolean processPayment();

	public void executeTransaction() {
		if (validatePayment()) {
			if (processPayment()) {
				setPaymentStatus("Success");
			} else {
				setPaymentStatus("Failed");
			}
		} else {
			setPaymentStatus("Validation Failed");
		}
		generateReceipt();

	}

	public void generateReceipt() {
		System.out.println("transactionId : " + transactionId);
		System.out.println("amount : " + amount);
		System.out.println("customerName : " + customerName);
		System.out.println("paymentStatus : " + paymentStatus);
	}

	public String getTransactionId() {
		return transactionId;
	}

	public double getAmount() {
		return amount;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String status) {
		paymentStatus = status;
	}

}

class CreditCardPayment extends payment {
	String cardNumber;
	String cvv;
	String expiryDate;

	public CreditCardPayment(String transactionId, double amount, String customerName, String cardNumber, String cvv,
			String expiryDate) {
		super(transactionId, amount, customerName);
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.expiryDate = expiryDate;
	}

	// validatePayment for CreditCardPayment
	public boolean validatePayment() {
		int CNlen = cardNumber.length();
		int CVlen = cvv.length();
		int EDlen = expiryDate.length();

		if (CNlen == 16 && CVlen == 3) {
			return true;
		} else {
			return false;
		}
	}

	// processPayment for CreditCardPayment
	public boolean processPayment() {
		if (validatePayment()) {
			return true;
		} else {
			return false;
		}
	}
}

class UPIPayment extends payment {
	String upiId;
	String upiPin;

	public UPIPayment(String transactionId, double amount, String customerName, String upiId, String upiPin) {
		super(transactionId, amount, customerName);
		this.upiId = upiId;
		this.upiPin = upiPin;
	}

	// validatePayment for UPI
	public boolean validatePayment() {
		if (upiId.contains("@") && upiPin.length() == 4) {
			return true;
		} else {
			return false;
		}
	}

	// processPayment for UPI
	public boolean processPayment() {
		if (validatePayment()) {
			return true;
		} else {
			return false;
		}
	}
}

class NetBankingPayment extends payment {
	String bankName;
	String accountNumber;
	String ifscCode;

// constructor
	public NetBankingPayment(String transactionId, double amount, String customerName, String bankName,
			String accountNumber, String ifscCode) {
		super(transactionId, amount, customerName);
		this.bankName = bankName;
		this.accountNumber = accountNumber;
		this.ifscCode = ifscCode;
	}

	// validatePayment for netBanking
	public boolean validatePayment() {
		if (accountNumber.length() == 16 && ifscCode.length() == 11) {
			return true;
		} else {
			return false;
		}
	}

	public boolean processPayment() {
		if (validatePayment()) {
			return true;
		} else {
			return false;
		}
	}

}

public class Digital_Online_Payment {

	public static void main(String[] args) {

//		CreditCardPayment cc = new CreditCardPayment("001", 2000, "John", "6573456790134674", "666", "210222");
//		cc.executeTransaction();
//
//		System.out.println("------------------------------");
//		System.out.println();
//
//		UPIPayment up = new UPIPayment("002", 3000, "Jeeva", "jp2005", "8888");
//		up.executeTransaction();
//
//		System.out.println("------------------------------");

		Scanner x = new Scanner(System.in);

		System.out.println("Enter the payment option");
		System.out.println("1.CreditCardPayment");
		System.out.println("2.UPIPayment");
		System.out.println("3.NetBankingPayment");

		System.out.print("Enter any one number (1 or 2 or 3) : ");
		int val = x.nextInt();
		System.out.println();
		System.out.println();
		switch (val) {
		case 1: {
			System.out.println();
			System.out.println("------CreditCardPayment------");
			System.out.println();
			System.out.print("Enter the transactionId : ");
			String id = x.next();

			System.out.print("Enter the amount : ");
			double amount = x.nextDouble();
			x.nextLine();
			System.out.print("Enter the customerName : ");
			String name = x.nextLine();
			System.out.print("Enther the 16 digit cardNumber : ");
			String cardnum = x.nextLine();
			System.out.print("Enter the cvv : ");
			String cvv = x.nextLine();
			System.out.print("Enter the expiryDate : ");
			String exp = x.nextLine();

			CreditCardPayment cc = new CreditCardPayment(id, amount, name, cardnum, cvv, exp);
			System.out.println();
			System.out.println("--result--");
			cc.executeTransaction();
			break;

		}

		case 2: {
			System.out.println();
			System.out.println("------UPIPayment------");
			System.out.println();
			System.out.print("Enter the transactionId : ");
			String id = x.next();

			System.out.print("Enter the amount : ");
			double amount = x.nextDouble();
			x.nextLine();
			System.out.print("Enter the customerName : ");
			String name = x.nextLine();
			System.out.println("Enter the UPI ID : ");
			String upiid = x.nextLine();
			System.out.print("Enter the UPI PIN : ");
			String upipin = x.nextLine();

			UPIPayment up = new UPIPayment(id, amount, name, upiid, upipin);

			System.out.println();
			System.out.println("--result--");
			up.executeTransaction();
			break;

		}

		case 3: {
			System.out.println();
			System.out.println("------NetBankingPayment------");
			System.out.println();
			System.out.print("Enter the transactionId : ");
			String id = x.next();

			System.out.print("Enter the amount : ");
			double amount = x.nextDouble();
			x.nextLine();
			System.out.print("Enter the customerName : ");
			String name = x.nextLine();
			System.out.print("Enter the bankNmae : ");
			String bank = x.nextLine();
			System.out.print("Enter the accountNumber : ");
			String ac = x.nextLine();
			System.out.print("Enter the ifscCode : ");
			String ifc = x.nextLine();

			NetBankingPayment net = new NetBankingPayment(id, amount, name, bank, ac, ifc);
			System.out.println();
			System.out.println("--result--");
			net.executeTransaction();
			break;

		}
		}

	}

}
