//use this keyword in java....
class Student {
    String name;
    int age;

    // Constructor
    Student(String name, int age) {
        this.name = name;   // this.name → instance variable
        this.age = age;     // age → parameter
    }

    void display() {
        System.out.println(name + " " + age);
    }
}

public class Program23 {
    public static void main(String[] args) {
        Student s1 = new Student("Anshika", 20);
        s1.display();
    }
}