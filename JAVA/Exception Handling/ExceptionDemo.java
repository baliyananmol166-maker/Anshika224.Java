// Exception Handling in java
// it is a mechanism to handle runtime errors, so that the normal flow of the application can be maintained.

public class ExceptionDemo {
    public static void main(String[] args) {
        int num = 25;
        for(int i = 25; i >= 0; i--) {
            if(num % i == 0) {
                System.out.println(num + " is divisible by " + i);   // i can be 0, which will throw Arithmetic Exception
                // to handle this exception, we can use try-catch block with final(optional) block
            }
        }
    }
}