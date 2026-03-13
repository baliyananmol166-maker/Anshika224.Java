class Student {                         //creating class
    int id;
    String name;

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

public class Student1 {
    public static void main(String[] args) {
        Student s1 = new Student();   // creating object

        s1.id = 101;                  // assigning values
        s1.name = "Anshika";

        s1.display();                 // calling method
    }
}