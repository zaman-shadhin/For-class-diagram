package ATM;

public class Deposit extends Transaction {
    private double amount;

    public Deposit(int accountNumber, BankDatabase bankDatabase, double amount) {
        super(accountNumber, bankDatabase);
        this.amount = amount;
    }

    public void execute() {
        bankDatabase.credit(accountNumber, amount);
        System.out.println("Deposited: " + amount);
    }
}