package aud3.bank_system;

import java.util.Arrays;

public class Bank {

    private Account[] accounts;
    private int totalAccounts;
    private int maxAccounts;

    public Bank(int maxAccounts) {
        this.maxAccounts = maxAccounts;
        this.accounts=new Account[maxAccounts];
        this.totalAccounts=0;
    }
    public void addAccount(Account account){
        if(totalAccounts==maxAccounts)
        {
           accounts = Arrays.copyOf(accounts,maxAccounts * 2);
           maxAccounts *= 2;
        }
        accounts[totalAccounts++]=account;


    }
    public double totalAssets(){
    double total=0;
    for(Account account: accounts)
    {
        total+=account.getCurrentAmount();
    }
    return total;
    }

    public void addInterestToAllAccounts(){
    for(Account account:accounts){
        if(account.getAccountType().equals(AccountType.INTEREST)){
            //prethodno vo if delot napisan if(//account instanceof InterestBearingAccount) , ama ne e dobro
            //objasneto e PODOLU
            //instanceof ke vi kaze dali nekoj e instanca soodvetno so primer ovoj interfejst InterestBearingAccount
            //sto znaci za site deca klasi na toj interfejst koj sto go implementiraat ako e instanca ova kje raboti
            //ako bese instanceoff a znaci objektot a ili od site koj sto go nasleduvaat a , a ako recam proveri dali
            //get class i equals  od nekoja klasa znaci proveri dali get klasata sto kje zemam kazi mi koja e klasata
            //equals so nekoja druga klasa tocno proveruvam dali klasata e klasata koja sto ja baram .

            InterestBearingAccount interestBearingAccount = (InterestBearingAccount) account;//kastiranje
            interestBearingAccount.addInterest();
            //VO GLAVNO instanceof e bad practice bidejki ne e najdobro resenie  i ovoa moze da se resi na drug nacin

        }
    }
    }
    }







