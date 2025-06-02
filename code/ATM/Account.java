package ATM;


public class Account {
    private int accountNumber;
    private int pin;
    private double balance;

    public Account(int accountNumber, int pin, double balance) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
    }

    public boolean validatePIN(int inputPIN) {
        return this.pin == inputPIN;
    }

    public double getBalance() {
        return balance;
    }

    public void credit(double amount) {
        balance += amount;
    }

    public void debit(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}