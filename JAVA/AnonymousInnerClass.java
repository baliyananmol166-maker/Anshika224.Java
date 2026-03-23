//anonymous inner class is defined without any name.
//it is used to override the method of class or interface.
public class AnonymousInnerClass {
    public static void main(String[] args) {
       AbsClass a = new AbsClass() {
        @Override
        void printStr() {
            System.out.println("This is an anonymous inner class.");
        }
       };
       a.printStr(); 
    }   
 }
abstract class AbsClass {
    abstract void printStr();

}