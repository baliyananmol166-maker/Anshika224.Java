//different type of identifiers uses in java..
public class Program4 {
    public static void main(String[] args) {
        int var = 19;   //identifier can start with a letter.
        String _var = "Hello"; //identifier can start with an underscore.
        double $var = 3.14; //identifier can start with a dollar sign.
        int var2 = 20; //identifier can contain letters and digits.
        
        /* We cannot use reserved keywords as identifiers, such as 'int', 'class', 'public', etc.
        We cannot use spaces in identifiers. For example, 'my variable' is not a valid identifier.*/
        
        System.out.println("Value of var: " + var);
        System.out.println("Value of _var: " + _var);
        System.out.println("Value of $var: " + $var);
        System.out.println("Value of var2: " + var2);
            
        }
}