//object demo
public class Program31 {
    int val = 1;
    String info = ". This is the object demo example.";

    public static void main(String[] args) {
       Program31 a = new Program31();
       System.out.println("Value of a is: " + a.val  + a.info);

       Program31 b = new Program31();
       System.out.println("Comparison of a and b: " + a.equals(b) );
    }

    public boolean equals(Program31 obj) {
        if (obj == null) return false;

        return (this.val == obj.val) && (this.info.equals(obj.info));
    }
}