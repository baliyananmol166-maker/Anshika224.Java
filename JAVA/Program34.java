//system class in java...
public class Program34 {
    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.print("Hello world2");
        System.out.println("Hello world3");

        System.err.println("Error message");

        try {
            char c = (char)System.in.read();         // For this we have to enter a character and then press enter key to execute the program.
            System.out.println("The value of c is: " + c);
        } 
        catch (Exception e)  {}

    }
}