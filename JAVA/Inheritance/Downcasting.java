// type casting - downcasting(manual explicit), assign a object reference variable to a child class variable.
// coverting a parent class reference variable into a child class reference variable is called downcasting.

class Animal {
    void sound() {
        System.out.println("Animal make a sound.");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}
public class Downcasting {
    public static void main(String[] args) {
        Animal a = new Dog(); // upcasting
        Dog d = (Dog) a; // downcasting - animal reference variable is assigned to dog reference variable

        d.sound(); // works
        d.bark(); // works
    }
}
