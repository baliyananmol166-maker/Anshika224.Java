//Anshika
//2400320100224

class StudentConstructor {
    int id;
    String name;

    // Parameterized constructor
    StudentConstructor(int i, String n) {
        id = i;
        name = n;
    }
    void display() {
        System.out.println("Id : " + id );
        System.out.println("Name : " + name);
    }
    public static void main(String[] args) {

        StudentConstructor s1 = new StudentConstructor(100, "Anshika");
        s1.display();
    }
}
