public class multiply{
    int multiply(int a, int b){
        return a*b;
    }
    int multiply(int a, int b, int c){
        return a*b*c;
    }

    public static void main(String[] args){
        multiply m1=new multiply();//object creation
        System.out.println(m1.multiply(50,25));//calling first multiply method
        System.out.println(m1.multiply(25,10,8));//calling second multiply method
    }

}