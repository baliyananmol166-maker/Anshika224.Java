// Accessiblity demo by rectangle class and square class
//within a package, a subclass an access all non-private members of super class.
import java.util.*;
//super class (parent class)
class Rectangle {
    private int length;
    private int breadth;
    //if we do not private it then it will give null
    public int getArea() {
        return this.length * this.breadth;
    }
    
}
//sub class (child class) is the square class which is inheriting the rectangle class
public class Square extends Rectangle {
    public static void main(String[] args) {
        Square s1 = new Square();
        System.out.println(s1.getArea());
    }
}
    