package handsOn4;
import java.util.*;
public class Account {
	String id;
	String name;
	int balance=0;
	public Account(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int credit(int amt) {
		balance+=amt;
		return balance;
	}
	public int debit(int amt) {
		if (amt <= balance) {
            balance -= amt;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
     
	}
	 public int transfer(Account a2, int amt) {
	        if (amt <= balance) {
	            balance -= amt;
	            a2.balance += amt;
	        } else {
	            System.out.println("Amount exceeded balance");
	        }
	        return balance;
	    }
	 void display() {
		 System.out.println("Account dispaly");
		 System.out.println("ID : "+id);
		 System.out.println("Name : "+name);
		 System.out.println("Balance : "+balance);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		Account a1=new Account("A12","Tamil");
		Account a2=new Account("A22","Soundar");
		a1.credit(5000);
		a1.debit(2000);
		a1.transfer(a2, 2000);
		a1.display();
		a2.display();
		
	}

}
