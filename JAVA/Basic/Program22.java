// create an encapsulated class of account in java..
public class Program22 {

    static class Account {
        private String accountNumber;
        private String accountType;
        private long account;

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

        // Setters
        public void setAccountNumber(String actNum) {
            accountNumber = actNum;
        }

        public void setAccountType(String actType) {
            accountType = actType;
        }

        public void setAccount(long acc) {
            account = acc;
        }

        // Getters
        public String getAccountNumber() {
            return accountNumber;
        }

        public String getAccountType() {
            return accountType;
        }

        public long getAccount() {
            return account;
        }
    }

    public static void main(String[] args) {
        Account obj = new Account();

        // Using setters instead of direct access
        obj.setAccountNumber("SB_101");
        obj.setAccountType("Saving Account");
        obj.setAccount(100);

        System.out.println("Initial values: " + obj.getAccountNumber() + " :: " + obj.getAccountType() + " :: " + obj.getAccount());

        obj.depositAmount(100);
        System.out.println("After deposit: " + obj.getAccountNumber() + " :: " + obj.getAccountType() + " :: " + obj.getAccount());

        obj.withdrawAmount(50);
        System.out.println("After first withdraw: " + obj.getAccountNumber() + " :: " + obj.getAccountType() + " :: " + obj.getAccount());

        obj.withdrawAmount(1000);
        System.out.println("After second withdraw: " + obj.getAccountNumber() + " :: " + obj.getAccountType() + " :: " + obj.getAccount());
    }
}