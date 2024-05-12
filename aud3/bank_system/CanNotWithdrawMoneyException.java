package aud3.bank_system;

public class CanNotWithdrawMoneyException extends Exception {//moze i RunTimeException ama sea za sea samo Exception ke se koriste


    public CanNotWithdrawMoneyException(double currentAmount, double amount) {
        super(String.format("Your current amount is : %f. , and you can not withdraw this amount : %.2f",
                currentAmount,amount));
    }
}
