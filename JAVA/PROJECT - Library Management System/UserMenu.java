
import java.util.Scanner;

public class UserMenu {
    public static void main(String[] args) {
        String input = "";
        Scanner sc = new Scanner(System.in);

        while(!input.equals("5")) {
            System.out.println("--------------------------------------------------------------");
            System.out.println("--------------------------------------------------------------");
            System.out.println("--------------------------------------------------------------");

            System.out.println("Select from the following options:");
            System.out.println("Enter 1 for adding a book.");
            System.out.println("Enter 2 for adding a member.");
            System.out.println("Enter 3 for issuing a book.");
            System.out.println("Enter 4 for returning a book.");
            System.out.println("Enter 5 for exit.");
            input = processUserInput(sc.nextLine());

        }
    }
    public static String processUserInput(String in) {
    return switch (in) {
        case "1" -> {
            System.out.println("--------------------------------------------------------------");
            AddBookMenu.addBookMenu();
            System.out.println("You have selected option 1 to add a book.");
            yield "1";
        }
        case "2" -> {
            System.out.println("--------------------------------------------------------------");
            System.out.println("You have selected option 2 to add a member.");
            yield "2";
        }
        case "3" -> {
            System.out.println("--------------------------------------------------------------");
            System.out.println("You have selected option 3 to issue a book.");
            yield "3";
        }
        case "4" -> {
            System.out.println("--------------------------------------------------------------");
            System.out.println("You have selected option 4 to return a book.");
            yield "4";
        }
        case "5" -> {
            System.out.println("--------------------------------------------------------------");       
            System.out.println("Thanks for working with us. Goodbye!");
            yield "5";
        }
        default -> {  
            System.out.println("--------------------------------------------------------------");    
            System.out.println("Invalid input. Try again.");
            yield "0";
        }
    };
}
}