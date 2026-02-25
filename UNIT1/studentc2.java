public class studentc2 {
    int id;
    String name;

    // parameterized constructor
    studentc2(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        studentc2 s1 = new studentc2(100, "anshika");
        s1.display();
    }
}

