// class demo
public class Program33 {
    public static void main(String[] args){
        String infor = "Hello world";

        Class<?> testClass = infor.getClass();
        System.out.println("Class name: " + testClass.getName());

        try {
            Class<?> testClass2 = Class.forName("Program31");
            System.out.println("Class name: " + testClass2.getName());

            Program31 obj1 = (Program31) testClass2
                    .getDeclaredConstructor()
                    .newInstance();

            System.out.println("Value of obj1: " + obj1.val + obj1.info);

        } catch (ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (InstantiationException | IllegalAccessException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (NoSuchMethodException | java.lang.reflect.InvocationTargetException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}