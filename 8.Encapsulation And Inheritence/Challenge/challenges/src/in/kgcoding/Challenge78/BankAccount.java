package in.kgcoding.Challenge78;

public class BankAccount {
    private final String accNumber;
    private final String accHolderName;
    private double balance;


    public BankAccount(String accNumber, String accHolderName) {
        this.accNumber = accNumber;
        this.accHolderName = accHolderName;
    }

    public void depositMoney(double money ){
        if(money <= 0){
            System.out.println("Invalid Deposit");
        } else {
            balance += money;
        }
    }

    public double withdrawMoney(double money ){
        if(money <= 0){
            System.out.println("Invalid Withdrawal");
        } else if(balance >= money){
            balance -= money;
        }  else {
            money = balance;
            balance = 0;
        }

        return money;
    }


}
