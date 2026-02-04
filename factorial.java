public class factorial{

    static int factorialrecursive(int n){
        if(n==0 || n==1){
            return 1;           
        }

        return n* factorialrecursive(n-1);
    }
    static int factorialiterative(int n){
        int result = 1;
        for(int i=1; i<=n; i++){
            result=result*i;
        }
        return result;
    }

    public static void main(String[] args){
        int numbers = 3;

        System.out.println("Factorial of " + numbers + "=" + factorialrecursive(numbers)); 
        System.out.println("Factorial of " + numbers + "=" + factorialiterative(numbers)); 

    }
}