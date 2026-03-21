// in this we print the value of program19 but we can not print the value of private int because it is private.

public class Program20 {


    public static void main(String[] args) {
        Program19 obj = new Program19();
        System.out.println("Public int value: " + obj.publicInt);  //if we use another package then only public int value will be printed.
        //System.out.println("Private int value: " + obj.privateInt);
        System.out.println("Protected int value: " + obj.protectedInt);
        System.out.println("Default int value: " + obj.defaultInt);
    }
}