//Anshika
//2400320100224
import java.io.*;
import java.util.Scanner;
public class InputDemo {
    public static void main(String[] args) throws IOException {
        if (args.length > 0) {
            System.out.println("Command Line Argument: " + args[0]);
        } else {
            System.out.println("No Command Line Argument provided.");
        }
        DataInputStream dis = new DataInputStream(System.in);
        System.out.print("Enter input using DataInputStream: ");
        String disInput = dis.readLine(); 
        System.out.println("DataInputStream Input: " + disInput);
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter input using BufferedReader: ");
            String brInput = br.readLine();
            System.out.println("BufferedReader Input: " + brInput);
            System.out.print("Enter input using Scanner: ");
            String scInput = sc.nextLine();
            System.out.println("Scanner Input: " + scInput);
        }
        Console c = System.console();
        if (c != null) {
            String consoleInput = c.readLine("Enter input using Console: ");
            System.out.println("Console Input: " + consoleInput);
        } else {
            System.out.println("Console not available (works only in terminal).");
        }
    }
}