//variable and constants in java...
public class Program5{
    public static void main(String[] args) {
        //First Method: Varible declaration and initialization in different line.

        int var;
        String str;

        var = 10;
        str = "Hello";
        System.out.println("Value of var: " + var);
        System.out.println("Value of str: " + str);

        //Second Method: Variable declaration and initialization in the same line.

        int var2 = 20;
        String str2 = "World";
        System.out.println("Value of var2: " + var2);
        System.out.println("Value of str2: " + str2);

        //Create constant with final keyword in java...
        final int constVar = 100;
        //constVar = 200; (This will cause a compile-time error because constVar is a constant and cannot be reassigned.)
        System.out.println("Value of constVar:" + constVar);
    }
}