//person->student
//person->teacher

// Super class
class Person {
    String name;
    int age;

    void displayPerson() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}

// Sub class
class Student extends Person {
    String rollNo;

    void displayStudent() {
        System.out.println("Roll No : " + rollNo);
    }
}

// Sub class
class Teacher extends Person {
    String idNo;

    void displayTeacher() {
        System.out.println("ID No : " + idNo);
    }
}

// Main class
public class HierarchicalIn {
    public static void main(String[] args) {

        Student s = new Student();
        Teacher t = new Teacher();

        s.name = "abc";
        s.age = 20;
        s.rollNo = "12345";

        t.name = "xyz";
        t.age = 30;
        t.idNo = "T001";

        System.out.println("Student Details:");
        s.displayPerson();
        s.displayStudent();

        System.out.println("\nTeacher Details:");
        t.displayPerson();
        t.displayTeacher();
    }
}
