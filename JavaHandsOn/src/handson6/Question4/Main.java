package handson6.Question4;

/**
 * Main class for Question 4.
 */
public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Rahul", "ACC1001");
        Account account = new Account(customer, 2500.0);

        RBI sbi = new SBI();
        RBI icici = new ICICI();
        RBI pnb = new PNB();

        System.out.println("Customer: " + account.getCustomer().getCustomerName());
        System.out.println("Account Number: " + account.getCustomer().getAccountNumber());
        System.out.println("Current Balance: " + account.getBalance());
        System.out.println();

        sbi.displayBankDetails("SBI");
        System.out.println();
        icici.displayBankDetails("ICICI");
        System.out.println();
        pnb.displayBankDetails("PNB");
    }
}
