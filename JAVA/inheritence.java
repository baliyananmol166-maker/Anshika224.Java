//super class
class Person{
    String name;
    int age;
    void displayPerson(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
//sub class
class Student extends Person{
    int rollno;
    void displayStudent(){
        System.out.println("Roll No: " + rollno);

    }

}

public class inheritence {
     public static void main(String[] args){
         Student s=new Student();
         s.name="abc";
         s.age=28;

         s.rollno=101;

         s.displayPerson();
         s.displayStudent();

     }
}