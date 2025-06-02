package ATM;
public class Withdrawal extends Transaction {
    private double amount;

    public Withdrawal(int accountNumber, BankDatabase bankDatabase, double amount) {
        super(accountNumber, bankDatabase);
        this.amount = amount;
    }

    public void execute() {
        bankDatabase.debit(accountNumber, amount);
        System.out.println("Withdrawn: " + amount);
    }
}