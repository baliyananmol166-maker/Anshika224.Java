// varargs is a feature in java that allows a method to accept a variable number of arguments.
public class Program46 {
    public static void main(String[] args) {
        // varargs method to calculate the sum of numbers
        int s1 = sum(1,2,3);
        int s2 =sum(4,5,6,6);
        int s3 = sum(6,7,8,9,1,2);

        System.out.println("Sum of s1: " + s1);
        System.out.println("Sum of s2: " + s2);
        System.out.println("Sum of s3: " + s3);
    }

    // varargs method
    public static int sum(int... numbers) {
        int total = 0;
        for (int n : numbers) {
            total += n;
        }
        return total;
    }
    
}