//Variable reference in java...
public class Program28{
 
   public static void changeVariableValue(int num) {
       num = num + 10;
       System.out.println("Value of num inside method: " + num);
   }

    public static void main(String[] args) {
        int num = 5;
        System.out.println("Value of num before method call: " + num);
        changeVariableValue(num);
        System.out.println("Value of num after method call: " + num);
    }
}