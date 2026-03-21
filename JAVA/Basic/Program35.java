//string demo in java...
public class Program35 {
    public static void main(String[] args) {
        String s1 = "Hello world";
        //String s2 = "Hello world";
        String s3 = new String("Hello world");
        // we can also use s1==s3
        if (s1 .equals (s3)) {
            System.out.println("String points to same object");
        }
        else {
            System.out.println("String do not points to same object");
        }
    }
}