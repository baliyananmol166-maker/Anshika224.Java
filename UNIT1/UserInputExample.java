import java.util.Scanner;

public class UserInputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();  //input interger value

        System.out.print("Enter a float value: ");
        float price = sc.nextFloat();  //input decimal value

        System.out.print("Enter true or false: ");
        boolean value = sc.nextBoolean();  //input true or false value

        //sc.nextLine();  clear buffer

        System.out.print("Enter a single word: ");
        String word = sc.next();  //input single word (up to first whitespace)

        //sc.nextLine();  clear buffer

        System.out.print("Enter a full sentence: ");
        String sentence = sc.nextLine(); //input full line of text (including spaces)

        System.out.println("\n--- Output ---");
        System.out.println("Integer: " + number);
        System.out.println("Float: " + price);
        System.out.println("Boolean: " + value);
        System.out.println("Word: " + word);
        System.out.println("Sentence: " + sentence);
    }
}