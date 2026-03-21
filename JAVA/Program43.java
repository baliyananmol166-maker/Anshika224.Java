// different ways to initialize 2-D arrays in java...
public class Program43 {
    public static void main(String[] args) {

        // First way to initialize 2-D array
        int[][] arr1 = new int[3][4];

        System.out.println("The array arr1 is:");
        for (int[] row : arr1) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        // Second way (already correct)
        int[][] arr2 = new int[2][];
        arr2[0] = new int[]{1, 2, 3};
        arr2[1] = new int[]{4, 5};

        System.out.println("The array arr2 is:");
        for (int[] row : arr2) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}