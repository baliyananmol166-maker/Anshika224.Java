//Anshika
//2400320100224
import java.io.Console;
public class LoginDemo {
    public static void main(String[] args) {
        Console c = System.console();       
        if (c == null) {
            System.out.println("Console not available. Run in terminal/command prompt.");
            return;
        }
        String username = c.readLine("Enter Username: ");
        char[] passwordChars = c.readPassword("Enter Password: ");     
        String password = new String(passwordChars);
        System.out.println("\nEntered Username: " + username);
        System.out.println("Entered Password: " + password);
    }
}