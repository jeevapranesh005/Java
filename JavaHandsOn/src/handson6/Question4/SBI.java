package handson6.Question4;

/**
 * SBI bank rules.
 */
public class SBI extends RBI {
    @Override
    public double getMinimumInterestRate() {
        return 6.0;
    }

    @Override
    public double getWithdrawalLimit() {
        return 40000.0;
    }

    @Override
    public double getMinimumBalance() {
        return 1500.0;
    }
}
