package in.kgcoding.Challenge78;

public class Customer {
    public static void main(String[] args) {
        System.out.println("Customer Input");
        BankAccount account = new BankAccount("001", "Prashanth Jain");
        account.depositMoney(100);
        System.out.printf("Withdraw: %f\n", account.withdrawMoney(200));
        account.depositMoney(-40);
        account.withdrawMoney(0);

    }
}
