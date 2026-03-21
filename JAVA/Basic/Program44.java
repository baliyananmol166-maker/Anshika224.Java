//different method of array in java..
import java.util.Arrays;

public class Program44 {
    public static void main(String[] args) {
        int[] intArrays = new int[]{1,4,6,6,7};
        // Third way to initialize 2-D array
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("The array arr is:");
        for (int[] row : arr) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        //used copy of array method to copy the array..
        intArrays = Arrays.copyOf(intArrays , 5);
        for(int j : intArrays){
            System.out.println("Values after copying: " + j);
        }
    }
}