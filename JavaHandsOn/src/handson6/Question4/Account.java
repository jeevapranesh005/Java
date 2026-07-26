package handson6.Question4;

/**
 * Account class holds account balance and customer information.
 */
public class Account {
    private Customer customer;
    private double balance;

    public Account() {
    }

    public Account(Customer customer, double balance) {
        this.customer = customer;
        this.balance = balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
