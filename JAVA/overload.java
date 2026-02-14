public class overload {

    // method with two int parameters
    public int add(int a, int b) {
        return a + b;
    }

    // overloaded method with three int parameters
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // overloaded method with double parameters
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        overload obj = new overload();

        System.out.println("Add 2 ints: " + obj.add(10, 20));
        System.out.println("Add 3 ints: " + obj.add(10, 20, 30));
        System.out.println("Add 2 doubles: " + obj.add(5.5, 4.5));
    }
}
