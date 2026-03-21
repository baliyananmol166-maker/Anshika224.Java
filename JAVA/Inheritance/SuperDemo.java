//calling the superclass's constructor and hidden member
// Parent class
class Student {
    String name = "Parent Name";

    // Constructor
    Student() {
        System.out.println("Student constructor called");
    }

    Student(String name) {
        this.name = name;
        System.out.println("Student parameterized constructor called");
    }

    void display() {
        System.out.println("Student name: " + name);
    }
}

// Child class
class Person extends Student {
    String name = "Child Name";

    // Constructor
    Person() {
        super();  // calls parent default constructor
        System.out.println("Person constructor called");
    }

    Person(String name) {
        super(name);  // calls parent parameterized constructor
        System.out.println("Person parameterized constructor called");
    }

    void show() {
        System.out.println("Child name: " + name);          // child variable
        System.out.println("Parent name: " + super.name);   // hidden parent variable
    }
}

// Main class
public class SuperDemo {
    public static void main(String[] args) {

        Person p1 = new Person("Anshika");

        p1.show();
    }
}