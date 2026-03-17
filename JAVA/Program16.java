//create a class in java...
public class Program16 {
    String name;
    String getsName() {
        return name;
    }
    public static void main(String[] args) {
        //now create an object of the class
        Program16 obj = new Program16();
        System.out.println(obj.getsName());  // gives null 
        obj.name = "Java Programming";
        System.out.println(obj.getsName());  // gives Java Programming

        //create another object of the class
        Program16 obj2 = new Program16();
        obj2.name = "Python Programming";
        System.out.println(obj2.getsName());
    }
}