record Student(String name, int age) {}

public class RecordExample {
    public static void main(String[] args) {
        Student s = new Student("Anshika", 20);
        System.out.println("Name: " + s.name());
        System.out.println("Age: " + s.age());

    }
}