//another example of static member...
public class Program25 {
    static double pie = 3.14; // static variable
    int radius; // instance variable

    
    public Program25(int radius){
        this.radius = radius;
    }

    public  double returnAreaFormula() {
        return pie * radius * radius;
    }

    public static void main(String[] args) {
        Program25 c1 = new Program25(5);
        Program25 c2 = new Program25(10);

        System.out.println("The value of pie is: " + pie);
        System.out.println("The area of circle with radius 5 is: " + c1.returnAreaFormula());
        System.out.println("The area of circle with radius 10 is: " + c2.returnAreaFormula()); 
    }
}