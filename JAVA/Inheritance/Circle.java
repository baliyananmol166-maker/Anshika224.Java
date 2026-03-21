// calling the superclass' constructor and hidden member 
import java.util.*;
// super class (parent class)
class Rectangle {
    public Rectangle() {
        System.out.println("This is rectangle class constructor");
    }
    public int length = 5;
    public int breadth = 10;
    public int getArea() {
        return length * breadth;
    }
}
// sub class (child class)
public class Circle extends Rectangle {
    public Circle() {
        super(); // calling the constructor of the parent class
        System.out.println("This is circle class constructor");
    }
    public static void main(String[] args) {
        Circle c1 = new Circle();
    }
}