// create a constructor in java..
public class Program18 {

    static class Account {
        String accountNumber;
        String accountType;
        long account;

        // Constructor
        public Account(String accountNumber, String accountType, long account) {
            this.accountNumber = accountNumber;
            this.accountType = accountType;
            this.account = account;
        }

        public boolean withdrawAmount(long amt) {
            if (amt > account)
                return false;
            else {
                account -= amt;
                return true;
            }
        }

        public boolean depositAmount(long amt) {
            if (amt <= 0)
                return false;
            else {
                account += amt;
                return true;
            }
        }
    }

    public static void main(String[] args) {

        // Using constructor
        Account obj = new Account("SB_101", "Saving Account", 100);

        System.out.println("Initial values: " + obj.accountNumber + " :: " + obj.accountType + " :: " + obj.account);

        obj.depositAmount(100);
        System.out.println("After deposit: " + obj.accountNumber + " :: " + obj.accountType + " :: " + obj.account);

        obj.withdrawAmount(50);
        System.out.println("After first withdraw: " + obj.accountNumber + " :: " + obj.accountType + " :: " + obj.account);

        obj.withdrawAmount(1000);
        System.out.println("After second withdraw: " + obj.accountNumber + " :: " + obj.accountType + " :: " + obj.account);
    }
}