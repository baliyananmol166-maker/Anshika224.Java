//a new object could be created using these constructors.
//a constructor is a special method that is used to initialize objects.
public class ConstructorDemo {
    int id;
    String name;

    //creating a parameterized constructor
    ConstructorDemo(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        //creating an object of the class by invoking the parameterized constructor
        ConstructorDemo obj = new ConstructorDemo(1, "Anshika");
        obj.display();
    }
}