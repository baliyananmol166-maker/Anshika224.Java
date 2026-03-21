//another example of static member in java..
public class Program26{
    static double pi;

    int radius;
     
     static {
        System.out.println("Static block is executed.");
        pi = 3.14;
     }

     public Program26(int radius){
        this.radius = radius;
        System.out.println("Constructor is executed.");
     }

     public double returnAreaFormula() {
        return pi * radius * radius;
     }
      public static void main(String[] args) {
        Program26 c1 = new Program26(5);
        Program26 c2 = new Program26(5);

        System.out.println("The value of pi is: " + pi);
        System.out.println("The area of circle with radius 5 is: " + c1.returnAreaFormula());
        System.out.println("The area of circle with radius 5 is: " + c2.returnAreaFormula());

      //comparing object
        System.out.println("Comparing c1 and c2 return values: " + (c1.returnAreaFormula() == c2.returnAreaFormula()) );
        System.out.println("Comparing c1 and c2 objects: "+ (c1==c2) );
     }
}