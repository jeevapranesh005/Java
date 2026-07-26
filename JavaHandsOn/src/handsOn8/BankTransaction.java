package handsOn8;
import java.util.Scanner;

class PayOutOfBoundsException extends Exception {
    public PayOutOfBoundsException(String message) {
        super(message);
    }
}

class AccountManagement {
    private double balance = 80000;

    public void checkForDebit(double amount) throws PayOutOfBoundsException {
        if (amount <= 0) {
            throw new PayOutOfBoundsException("Amount should be greater than zero.");
        }
        if (amount > 30000) {
            throw new PayOutOfBoundsException("Transaction amount exceeds the maximum limit of 30000.");
        }
        if (amount > balance) {
            throw new PayOutOfBoundsException("Insufficient balance for this transaction.");
        }
    }

    public void withdrawAmount(double amount) throws PayOutOfBoundsException {
        checkForDebit(amount);
        balance -= amount;
        System.out.println("Withdrawal successful.");
        System.out.println("Current balance: " + balance);
    }
}

public class BankTransaction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AccountManagement account = new AccountManagement();

        try {
            System.out.print("Enter transaction amount: ");
            double amount = scanner.nextDouble();
            account.withdrawAmount(amount);
        } catch (PayOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
