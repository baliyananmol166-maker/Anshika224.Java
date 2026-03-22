//if exception is come in first line of the program then what happened..
public class ExceptionDemo3 {
    public static void main(String[] args) {
        int num = 25;
        try {
            for(int i = 0; i<25; i++) {
                if(num%i == 0 ) {
                    System.out.println(num + " is divisible by " + i);
                }
            }
        }
        catch(ArithmeticException e) {
            System.out.println("Exception message: " + e.getMessage());  // then catch block will handle the exception
        }
        finally {
            System.out.println("We are present in finally block, it will always execute whether exception is handled or not.");
        }
    }
}