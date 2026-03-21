//for statement in java...
public class Program12 {
    public static void main(String[] args) {
       for(int i=0; i<5; i++) {
        System.out.println("The value of i is:" +i);       
       } 
       int a = 10;
        for( ; ; ){
            System.out.println("The value of a is:" +a);
            a++;
            if(a > 20) {
                break;
            }
        }
        for (int A=0 ; A<5; ) {
            System.out.println("The value of A is:" +A);
            A++;
        }
       
    }
}