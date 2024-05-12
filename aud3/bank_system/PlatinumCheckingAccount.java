package aud3.bank_system;

public class PlatinumCheckingAccount extends InterestCheckingAccount{
    public PlatinumCheckingAccount(String accountOwner, double currentAmount) {
        super(accountOwner, currentAmount);
    }

    @Override
    public void addInterest() {
        addAmount(getCurrentAmount()*INTEREST_RATE*2);
    }
}
