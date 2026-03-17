// create a constructor in java..
public class Program18 {
    public Program18() {
        System.out.println("This is a constructor of Account class...");
    }
    static class Account {
        String accountNumber;
        String accountType;
        long account;

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
        Account obj = new Account();
        obj.accountNumber = "SB_101";
        obj.accountType = "Saving Account";
        obj.account = 100;

        System.out.println("My obj's initial values: " + obj.accountNumber + " :: " + obj.accountType + " :: " + obj.account);

        obj.depositAmount(100);
        System.out.println("My obj's values after deposit: " + obj.accountNumber + " :: " + obj.accountType + " :: " + obj.account);

        obj.withdrawAmount(50);
        System.out.println("My obj's values after first withdraw: " + obj.accountNumber + " :: " + obj.accountType + " :: " + obj.account);

        obj.withdrawAmount(1000);
        System.out.println("My obj's values after second withdraw: " + obj.accountNumber + " :: " + obj.accountType + " :: " + obj.account);
    }
}