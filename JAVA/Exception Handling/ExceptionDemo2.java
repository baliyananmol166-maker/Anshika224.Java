// not handle it with try-catch block, it will throw an exception and terminate the program

public class ExceptionDemo2 {
    public static void main(String[] args) {
        int num = 25;
        try {
            for(int i = 25; i>=0; i--) {
                if(num%i == 0 ) {
                    System.out.println(num + " is divisible by " + i);
                }
            }
        }
        catch(ArithmeticException e) {
            //System.out.println("Some exception occured and we are present in exception block handler.");
            System.out.println("Exception message: " + e.getMessage());
        }
        finally {
            System.out.println("We are present in finally block, it will always execute whether exception is handled or not.");
        }
    }
}