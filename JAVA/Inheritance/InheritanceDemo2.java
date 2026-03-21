//another demo of inheritance with the help of student and person class
import java.util.*;
//super class (parent class)
    class Student {
        String name;
        int age;

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }
        public int getAge() {
            return this.age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
    //sub class (child class)
    class Person extends Student {
        String city;
        public String getCity() {
            return this.city;
        }
        public void setCity(String city) {
            this.city = city;
        }
    }
    // main method for testing the inheritance
    public class InheritanceDemo2 {
        public static void main(String[] args) {
            Person p1 = new Person();
            p1.setName("Anshika");
            p1.setAge(19);
            p1.setCity("Ghaziabad");

            System.out.println("Name is: " + p1.getName());
            System.out.println("Age is: " + p1.getAge());
            System.out.println("City name is: " + p1.getCity());
        }
    }