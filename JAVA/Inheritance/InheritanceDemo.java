// inheritance demo by shape class and circle class
// there is no multiple inheritance in java


// super class (parent class)
class Shape {
    private String color;
    private boolean isFilled;

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.isFilled;
    }

    public void setIsFilled(boolean isFilled) {
        this.isFilled = isFilled;
    }
}

// child class (sub class)
class Circle extends Shape {
    private int radius;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return this.radius;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }

    public double getCircumference() {
        return 2 * 3.14 * radius;
    }
}

// main class
public class InheritanceDemo {
    public static void main(String[] args) {

        Shape s1 = new Shape();
        s1.setColor("RED");
        s1.setIsFilled(true);

        System.out.println("Shape color: " + s1.getColor());
        System.out.println("Shape is filled: " + s1.isFilled());

        Circle c1 = new Circle();
        c1.setRadius(5);   // ✅ using setter
        c1.setColor("BLUE");
        c1.setIsFilled(true);

        System.out.println("Circle area: " + c1.getArea());
        System.out.println("Circle circumference: " + c1.getCircumference());
        System.out.println("Circle color: " + c1.getColor());
        System.out.println("Circle is filled: " + c1.isFilled());
    }
}