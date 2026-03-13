public class TypeCastingExample {
    public static void main(String[] args){
        //implicit casting(widening)
        int a=10;
        double b=a;
        System.out.println("The value of b is: " + b);

        //explicit casting(narrowing)
        double c=10.5;
        int d=(int) c;
        System.out.println("The value of d is: " + d);
    }
}