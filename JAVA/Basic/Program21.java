//in this we see which value of program19 we can print in sub=class.
public class Program21 extends Program19 {
    
    public static void main(String[] args) {
        Program19 obj = new Program19();
        System.out.println("Public int value: " + obj.publicInt);
       // System.out.println("Private int value: " + obj.privateInt);  in this also we can not print the value of private int.
        System.out.println("Protected int value: " + obj.protectedInt);
        System.out.println("Default int value: " + obj.defaultInt);
        //but if it sub-class from another package then only public and protected int value will be printed.
    }
}