package handsOn5;

import java.util.Scanner;

public class PaymentSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Select payment method");
		System.out.println("1. Credit card");
		System.out.println("2. UPI payment");
		System.out.println("3. Net Banking");
		int n=s.nextInt();
		if(n==1) {
			System.out.println("You selected the credit card payment");
			System.out.println("Enter the user details");
			System.out.println("Enter the transaction id ");
			String transactionid=s.next();
			System.out.println("ENter the amt");
			double amt=s.nextDouble();
			System.out.println("Enter the name ");
			String name=s.next();
			System.out.println("Enter the status");
			String status=s.next();
			System.out.println("Enter the card nymber");
			String cardnumber=s.next();
			System.out.println("Enter the cvv number");
			String cvv=s.next();
			System.out.println("Enter the expity date");
			String expirydate=s.next();
			Payment p=new CreditCardPayment(transactionid, amt, name, status, cardnumber, cvv, expirydate);
			p.executetransaction();
		}else if(n==2) {
			System.out.println("You selected the UPI payment");
			System.out.println("Enter the user details");
			System.out.println("Enter the transaction id ");
			String transactionid=s.next();
			System.out.println("ENter the amt");
			double amt=s.nextDouble();
			System.out.println("Enter the name ");
			String name=s.next();
			System.out.println("Enter the status");
			String status=s.next();
			System.out.println("Enter the UPI id");
			String UPIID=s.next();
			System.out.println("Enter the PIN");
			String pin=s.next();
			Payment p1=new UPIPayment(transactionid, amt, name, status, pin, UPIID);
			p1.executetransaction();
		}else if(n==3) {
			System.out.println("You selected the Net banking payment");
			System.out.println("Enter the user details");
			System.out.println("Enter the transaction id ");
			String transactionid=s.next();
			System.out.println("ENter the amt");
			double amt=s.nextDouble();
			System.out.println("Enter the name ");
			String name=s.next();
			System.out.println("Enter the status");
			String status=s.next();
			System.out.println("Enter the bank name");
			String bankname=s.next();
			System.out.println("ENter the ifsc code");
			String ifsc=s.next();
			s.nextLine();
			System.out.println("Enter the account number");
			String acc=s.next();
			Payment p2=new NetBankingPayment(transactionid, amt, name, status, ifsc, acc, bankname);
			p2.executetransaction();
		}
	}

}
