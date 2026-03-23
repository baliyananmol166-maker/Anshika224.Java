//nested class is a class which is declared inside another class.
//outer class is called as enclosing class and inner class is called as nested class.

public class NestedClassDemo {
    class NestedClass {
        void printInnerMethod() {
            System.out.println("Reaches in the nested class");
        }
    }
    public static void main(String[] args) {
      NestedClassDemo.NestedClass n = new NestedClassDemo().new NestedClass();
      n.printInnerMethod();   
    }
}
