package aud3.bank_system;

public abstract class Account {
    private String accountOwner;
    private int id;
    private static int idSeed=10000;
    private double currentAmount;

    private AccountType accountType;

    public Account(String accountOwner, double currentAmount) {
        this.accountOwner = accountOwner;
        this.currentAmount = currentAmount;
        this.id=idSeed;

        idSeed++;
        //ovie dve linii pogore moze i vaka this.id=idSeed++; istoto e
    }

    public double getCurrentAmount() {
        return currentAmount;
    }

    public void addAmount(double amount){
    currentAmount+=amount;
    }
    public void withdrawAmount(double amount) throws CanNotWithdrawMoneyException{
        if(currentAmount<amount)
            //tuka bi trebalo da frleme nekoj isklucok primer ako nemame dovolno pari na smetkata
            throw new CanNotWithdrawMoneyException(currentAmount,amount);
    currentAmount-=amount;


    }
    public abstract AccountType getAccountType();

    @Override
    public String toString() {
        return String.format("%d: %.2f",id,currentAmount);
    }
}
