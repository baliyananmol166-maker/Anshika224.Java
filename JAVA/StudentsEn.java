//Anshika
//2400320100224
public class StudentsEn {
    private int rollno;
    private String name;
    private int marks;
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks. Marks should be between 0 and 100.");
      }
    }
    public int getRollno() {
        return rollno;
    }
    public String getName() {
        return name;
    }
    public int getMarks() {
        return marks;
    }
    public static void main(String[] args) {
        StudentsEn s = new StudentsEn();
        s.setRollno(5);
        s.setName("Anshika");
        s.setMarks(93);
        System.out.println("Roll No: " + s.getRollno());
        System.out.println("Name: " + s.getName());
        System.out.println("Marks: " + s.getMarks());
    }
}
