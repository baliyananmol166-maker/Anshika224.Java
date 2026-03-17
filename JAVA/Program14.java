//use of continue and break statement in multi for loop...
public class Program14 {
    public static void main(String[] args) {
        for(int i=0; i<5; i++) {
            for(int j=0; j<5; j++) {
                if(j==2) {
                    continue;
                }
                System.out.println("The value of j is:" +j);
            }
        System.out.println("The value of i is:" +i); 
        }
    }
}