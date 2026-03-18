//Access control modifiers of encapsulation in java...
public class Program19 {
    public int publicInt = 29;
    private int privateInt = 90;
    protected int protectedInt =67 ;
    int defaultInt=45;

    public static void main(String[] args) {
        Program19 obj = new Program19();
        System.out.println("Public int value: " + obj.publicInt);
        System.out.println("Private int value: " + obj.privateInt);
        System.out.println("Protected int value: " + obj.protectedInt);
        System.out.println("Default int value: " + obj.defaultInt);
    }
}