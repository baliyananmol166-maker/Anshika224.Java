// type casting - upcasting(automatic implicit) means assign an object to a super class variable.
//converting a child class object into a parent class reference is called upcasting.

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
public class Upcasting {
    public static void main(String[] args) {
        Animal a = new Dog(); // upcasting  - dog object is assigned to animal reference variable
        a.sound(); // calling method of parent class - works fine
        // a.bark(); // error - cannot call method of child class using parent class reference variable
    }
}