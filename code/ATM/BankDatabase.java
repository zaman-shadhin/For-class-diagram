package ATM;
import java.util.HashMap;

public class BankDatabase {
    private HashMap<Integer, Account> accounts = new HashMap<>();

    public void addAccount(Account acc) {
        accounts.put(acc.getAccountNumber(), acc);
    }

    public boolean authenticateUser(int accNo, int pin) {
        Account acc = accounts.get(accNo);
        return acc != null && acc.validatePIN(pin);
    }

    public double getBalance(int accNo) {
        return accounts.get(accNo).getBalance();
    }

    public void credit(int accNo, double amount) {
        accounts.get(accNo).credit(amount);
    }

    public void debit(int accNo, double amount) {
        accounts.get(accNo).debit(amount);
    }
}