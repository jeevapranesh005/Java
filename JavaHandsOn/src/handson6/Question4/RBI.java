package handson6.Question4;

/**
 * Base class for banking rules.
 */
public class RBI {
    public double getMinimumInterestRate() {
        return 4.0;
    }

    public double getWithdrawalLimit() {
        return 50000.0;
    }

    public double getMinimumBalance() {
        return 1000.0;
    }

    public void displayBankDetails(String bankName) {
        System.out.println(bankName + " details:");
        System.out.println("Minimum Interest Rate: " + getMinimumInterestRate() + "%");
        System.out.println("Withdrawal Limit: " + getWithdrawalLimit());
        System.out.println("Minimum Balance: " + getMinimumBalance());
    }
}
