package handson6.Question4;

/**
 * ICICI bank rules.
 */
public class ICICI extends RBI {
    @Override
    public double getMinimumInterestRate() {
        return 5.5;
    }

    @Override
    public double getWithdrawalLimit() {
        return 45000.0;
    }

    @Override
    public double getMinimumBalance() {
        return 1200.0;
    }
}
