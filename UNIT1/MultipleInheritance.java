// super class
class Person {
    String name;
    int age;

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// sub class
class Student extends Person {
    int rollno;

    void displayStudent() {
        System.out.println("Roll No: " + rollno);
    }
}

// sub class
class Teacher extends Person {
    int idno;

    void displayTeacher() {
        System.out.println("ID No: " + idno);
    }
}

// main class
public class MultipleInheritance {
    public static void main(String[] args) {

        Student s = new Student();
        s.name = "abc";
        s.age = 28;
        s.rollno = 101;

        s.displayPerson();
        s.displayStudent();

        Teacher t = new Teacher();
        t.name = "xyz";
        t.age = 45;
        t.idno = 202;

        t.displayPerson();
        t.displayTeacher();
    }
}
