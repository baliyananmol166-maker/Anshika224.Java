//in this we also use it with interface
public class AnonymousClass {
    public static void main(String[] args) {
       AbsClass a = new AbsClass() {
        @Override
        void printStr() {
            System.out.println("Hello Abstract");
        }
       };
       a.printStr(); 

       InterDemo i = new InterDemo() {
        @Override
        public void printInterStr() {
            System.out.println("Hello interface");
        }
       };
       i.printInterStr();
    }   
 }
abstract class AbsClass {
    abstract void printStr();

}
interface InterDemo {
    void printInterStr();
}