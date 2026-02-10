class Parent {

    void show() {
        System.out.println("This is the Parent class method");
    }
}

class Child extends Parent {

    // overriding the parent method
    @Override
    void show() {
        System.out.println("This is the Child class method");
    }
}

public class override {

    public static void main(String[] args) {

        Parent obj = new Child();   // runtime polymorphism
        obj.show();
    }
}
