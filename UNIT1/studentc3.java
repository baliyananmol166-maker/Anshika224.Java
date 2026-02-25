public class studentc3 {
    int id;
    String name;

    // default constructor
    studentc3() {
        id = 0;
        name = "abc";
    }

    // parameterized constructor
    studentc3(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        studentc3 s1 = new studentc3(100, "anshika");
        s1.display();

        studentc3 s2 = new studentc3();
        s2.display();
    }
}
