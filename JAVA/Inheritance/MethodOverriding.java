//method overriding , in this sub class changes the behaviour of a method of its parent class is called method overriding.
import java.util.*;
//super class (parent class)
class Student {
    String name;
    
    public void display() {
        System.out.println("Name is: " + this.name);
        System.out.println("This is student class");
    }
}
//sub class (child class)
class Person extends Student {
   //overriding method
   @Override
   public void display() {
       System.out.println("Name is: " + this.name);
       System.out.println("This is person class");
   }
}
// main method for testing the method overriding
public class MethodOverriding {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();

        Person p1 = new Person();
        p1.display();

        //parent reference , child object
        Student ref = new Person();
        ref.display();
    }
}