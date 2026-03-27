//method is used to get the methods of a class.

import java.lang.reflect.Method;

public class MethodDemo {
    public void method1() {
        System.out.println("This is method 1");
    }

    public void method2() {
        System.out.println("This is method 2");
    }

    public static void main(String[] args) {
        MethodDemo d = new MethodDemo();
        Method[] m = d.getClass().getMethods();
        for (Method m1 : m) {
            System.out.println("Method name: " + m1.getName());
            System.out.println("Method return type: " + m1.getReturnType());
        }
    }
}