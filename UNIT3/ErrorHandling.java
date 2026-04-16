//Anshika 
//2400320100224

public class ErrorHandling {

    public static void main(String[] args) {
        double amount = -100;

        try {
            if (amount < 0) {
                throw new Exception("Negative amount entered!");
            }
            System.out.println("Amount deposited : " + amount);
        } catch (Exception e) {
            System.out.println("Exception : " + e.getMessage());
        }
    }
}