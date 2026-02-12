//Anshika
//2400320100224

public class studentc {
    int id;
    String name;

    // constructor
    studentc() {
        id = 10;
        name = "Anshika";
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        studentc s1 = new studentc();
        s1.display();
    }
}
