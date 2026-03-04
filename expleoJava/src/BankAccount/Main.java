package BankAccount;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account A1 = new Account("A01","Jeeva");
		String account1 =A1.getId();
		System.out.println(account1);
		A1.setbalance(100);
		
		Account A2 = new Account("A02","ram",100);
		
		int transfer = A1.transferto(A2, 50);
		System.out.println(transfer);
		int balance1=A1.getbalance();
		System.out.println(balance1);
		
		String detail =A1.toString();
		System.out.println(detail);

	}

}
