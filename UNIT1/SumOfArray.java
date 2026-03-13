public class SumOfArray {
    public static void main(String[] args){
        int [] array = {1,2,3,4,5};
        int sum = calculateSum(array);
        System.out.println("The sum of the elements of the array is: " +sum);

    }

    public static int calculateSum(int[] arr){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
}