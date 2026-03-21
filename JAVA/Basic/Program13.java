//for loop with continue and break statement...
public class Program13 {
    public static void main(String[] args) {
        for(int i=0; i<10; i++){
            if(i==6){
                continue;    //skip the value of i when it is 6 and continue with the next iteration
            }
            System.out.println("The value of i is:" +i);
        }
        for(int j=0; j<10; j++){
            if(j==6){
                break;      //stop the loop when j is 6 and exit the loop
            }
            System.out.println("The value of j is:" +j);
        }
    }
}