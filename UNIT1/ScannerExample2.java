import java.util.Scanner;

public class ScannerExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word:");
        if(sc.hasNext()) {
            String word = sc.next();
            System.out.println("You entered: " + word);
        }
        else {
            System.out.println("No input provided.");
        }
    }
}   