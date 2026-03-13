public class DoWhileExample {
    public static void main(String[] args) {
        int i=10;
        do{
            System.out.println("The value of i is: " +i);
            i++;
        }
        //Condition is false but it gives the output i=10.
        //in do-while loop code run first then condition check after.
        while(i<5);

    }
}