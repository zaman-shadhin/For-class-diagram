package ATM;

public class BalanceInquiry extends Transaction {
    public BalanceInquiry(int accountNumber, BankDatabase bankDatabase) {
        super(accountNumber, bankDatabase);
    }

    public void execute() {
        System.out.println("Your balance is: " + bankDatabase.getBalance(accountNumber));
    }
}