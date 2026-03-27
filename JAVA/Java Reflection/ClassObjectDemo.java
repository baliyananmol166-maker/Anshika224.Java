//jvm creates a class object for all the objects of that class.


public class ClassObjectDemo {
    public static void main (String[] args) {
        try {
            ClassObjectDemo obj = new ClassObjectDemo();
            System.out.println("Obj's class is a ::" +obj.getClass());
            Class testClass = Class.forName("ClassObjectDemo");
            System.out.println("TestClass is a ::" +testClass);
        }
         catch (ClassNotFoundException e) {
            System.out.println("Class not found exception is caught");
        }
    }
}