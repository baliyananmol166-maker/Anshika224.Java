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
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        }
    }
}

public class CombineDemo {

    public static void main(String[] args) {

        // Arithmetic Exception Example
        try {
            int x = 10 / 0;
        } catch (Exception e) {
            System.out.println("Error");
        }

        // Custom Exception Example
        BankAccount account = new BankAccount();
        try {
            account.withdraw(7000);   // Correct method call
        } catch (Exception e) {
            System.out.println("Custom error: " + e.getMessage());
        }

        System.out.println("Successful");
    }
}
