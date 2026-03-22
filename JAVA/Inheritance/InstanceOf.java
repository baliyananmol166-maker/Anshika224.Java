// instance of keyword is used to check whether an object is an instance of a specific class or interface.

//super class
class Animal {
}

// sub class
class Dog extends Animal {
}

//main class
public class InstanceOf {
    public static void main(String[] args) {
      //Dog d = new Dog();
      Animal a = new Dog(); // upcasting

      System.out.println(a instanceof Dog);
      System.out.println(a instanceof Animal);  
    }
}