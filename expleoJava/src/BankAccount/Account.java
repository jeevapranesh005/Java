package BankAccount;

public class Account {
	private String Id;
	private String name;
	private int balance;
	
	//setters getters
	public void setid(String Id) {
		this.Id=Id;
	}
	public String getid() {
		return Id;
	}
	
	public void setname(String name) {
		this.name = name;
	}
	public String getname() {
		return name;
	}
	public void setbalance(int balance) {
		this.balance=balance;
	}
	public int getbalance () {
		return balance;
	}
	
	//constructor
	public Account(String Id,String name) {
		this.Id= Id;
		this.name= name;
		this.balance=0;
	}
	public Account(String Id,String name,int balance) {
		this.Id= Id;
		this.name= name;
		this.balance = balance;
	}
	
	//methods
	
	
	//getId
	public String getId() {
		return Id;
	}
	
	//getname
	public String getName() {
		return name;
	}
	public int getBalance() {
		return balance;
	}
	public int credit(int amount) {
		return (balance+amount);
	}
	public int debit(int amount) {
		if(amount<=balance) {
			System.out.println("amount is debited");
			balance = balance-amount;
			return amount;
		}
		else {
			System.out.println("Amount exceeded balance");
			return balance;
		}
	}
	
	public int transferto(Account A1,int amount) {
		if(amount<=balance) {
			A1.balance = balance+amount;
			balance = balance-amount;
			System.out.println("amount is transfered");
			return amount;
		}
		else {
			System.out.println("Amount exceeded balance");
			return balance;
		}
	}
	
	public String toString() {
		return("Id "+Id+"\nName "+name+"\nBalance "+balance);
	}
	
}
