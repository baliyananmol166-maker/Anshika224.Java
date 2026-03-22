// classification of exception
// 1. checked exception: it is checked at compile time, if we are not handling it with try-catch block then it will give compile time error.
// 2. unchecked exception: it is not checked at compile time, if we are not handling it with try-catch block then it will throw an exception and terminate the program.
import java.io.*;

public class ClassExceptionDemo {
    public static void main(String[] args) {
        int input = readData();
        System.out.println("Getting the input: " + input);
        printDiv(input);
    }
  // for ouput you have to enter 10 or -5 or 0 0r 25
  // abc or 12abc or 12.5 or 12.0 it will give "Invalid number entered!" because it is not a valid integer
  // for empty input it will give "Invalid number entered!" because it is not a valid integer
    public static void printDiv(int in) {
        try {
            for (int i = 1; i <= 25; i++) {
                if (in % i == 0) {
                    System.out.println(in + " is divisible by " + i);
                }
            }
        } catch (Exception e) {
            System.out.println("Some exception occurred and we are in exception block.");
        }
    }

    public static int readData() {
        int retVal = 0;  

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String numberStr = br.readLine();
            retVal = Integer.parseInt(numberStr);
        } 
        catch (IOException e) {
            System.out.println("Inside IOException catch block");
        } 
        catch (NumberFormatException e) {
            System.out.println("Invalid number entered!");
        }

        return retVal;  
    }
}