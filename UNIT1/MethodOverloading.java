//Anshika
//2400320100224

public class MethodOverloading {
    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a+b+c;
    }
    public static void main(String[] args) {
        MethodOverloading m = new MethodOverloading();
        System.out.println("Sum is: " + m.add(10, 20));
        System.out.println("Sum is: " + m.add(10, 20, 30));
    }
}