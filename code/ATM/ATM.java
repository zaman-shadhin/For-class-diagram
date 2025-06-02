package ATM;

import java.util.Scanner;

public class ATM {
    private BankDatabase bankDatabase = new BankDatabase();
    private Scanner scanner = new Scanner(System.in);

    public ATM() {
        bankDatabase.addAccount(new Account(1111, 1234, 1000));
    }

    public void start() {
        System.out.print("Enter account number: ");
        int acc = scanner.nextInt();
        System.out.print("Enter PIN: ");
        int pin = scanner.nextInt();

        if (!bankDatabase.authenticateUser(acc, pin)) {
            System.out.println("Authentication Failed.");
            return;
        }

        while (true) {
            System.out.println("1. Balance\n2. Withdraw\n3. Deposit\n4. Exit");
            int choice = scanner.nextInt();

            Transaction transaction = null;

            switch (choice) {
                case 1:
                    transaction = new BalanceInquiry(acc, bankDatabase);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double wAmt = scanner.nextDouble();
                    transaction = new Withdrawal(acc, bankDatabase, wAmt);
                    break;
                case 3:
                    System.out.print("Enter amount to deposit: ");
                    double dAmt = scanner.nextDouble();
                    transaction = new Deposit(acc, bankDatabase, dAmt);
                    break;
                case 4:
                    System.out.println("Thank you!");
                    return;
            }

            if (transaction != null) {
                transaction.execute();
            }
        }
    }

    public static void main(String[] args) {
        new ATM().start();
    }
}
