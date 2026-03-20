//overloading in java...
public class Program27 {
    int height;
    int base;
    int s1;
    int s2;
    int s3;

    public Program27(int height, int base) {
        this.height = height;
        this.base = base;
    }

    public Program27(int s1, int s2, int s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    public double returnAreaofTriangle(int height, int base)  {
        System.out.println("Area of triangle using height and base is: ");
        return 0.5 * base * height;
    }

    public double returnAreaofTriangle(int s1, int s2, int s3) {
        System.out.println("Area of triangle using three sides is: ");
        double s = (s1 + s2 + s3) / 2.0;
        return Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
     }

     public static void main(String[] args) {
        Program27 t1 = new Program27(10, 5);
        Program27 t2 = new Program27(3, 4, 5);

        System.out.println(t1.returnAreaofTriangle(t1.height, t1.base));
        System.out.println(t2.returnAreaofTriangle(t2.s1, t2.s2, t2.s3));
    }
}