package handson6.Question4;

/**
 * PNB bank rules.
 */
public class PNB extends RBI {
    @Override
    public double getMinimumInterestRate() {
        return 5.0;
    }

    @Override
    public double getWithdrawalLimit() {
        return 35000.0;
    }

    @Override
    public double getMinimumBalance() {
        return 1000.0;
    }
}
