class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    double balance = 5000;

    void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException(
                "Insufficient balance. Available balance: " + balance
            );
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: ");
        }
    }
}

public class Combine {

    public static void main(String[] args) {

        try {
            int x=10/0;
            System.out.println(x);

        } catch (ArithmeticException e) {
            System.out.println("Error");
        }

        BankAccount account = new BankAccount();

        try {
            account.withdraw(7000);
        } catch (InsufficientBalanceException e) {
            System.out.println("Custom error: " + e.getMessage());
        }

        System.out.println("Successful");
    }
}
