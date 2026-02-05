//Multiple Inheritance using interface
interface A {
    void showA();
}

interface B {
    void showB();
}

class C implements A, B {

    @Override
    public void showA() {
        int age = 10;
        System.out.println("Age: " + age);
    }

    @Override
    public void showB() {
        int num = 40;
        System.out.println("Num: " + num);
    }
}

public class interfacein {
    public static void main(String[] args) {

        C obj = new C();
        obj.showA();
        obj.showB();
    }
}
