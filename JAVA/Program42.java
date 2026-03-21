//different ways to initialize an array in java...
public class Program42 {
    public static void main(String[] args) {
        //first way to initialize an array in java..
        int[] arr1 = new int[5];
        arr1[0] = 2;
        arr1[1] = 4;
        arr1[2] = 6;
        arr1[3] = 8;
        arr1[4] = 10;
        System.out.println("The array arr1: " + arr1[0] + ", " + arr1[1] + ", " + arr1[2] + ", " + arr1[3] + ", " + arr1[4]);

        //second way to initialize an array in java..
        int[] arr2 = {5, 7, 9 , 23, 34, 45};
        System.out.println("The array arr2: " + arr2[0] + ", " + arr2[1] + ", " + arr2[2] + ", " + arr2[3] + ", " + arr2[4] + ", " + arr2[5]);

        //third way to initialize an array in java..
        int[] arr3 = new int[]{1,3,5,7,9};
        System.out.println("The array arr3: " + arr3[0] + ", " + arr3[1] + ", " + arr3[2] + ", " + arr3[3] + ", " + arr3[4]);

        //fourth way to initialize an array in java...
        int[] arr4 = new int[5];
        for (int i=0; i<=4; i++) {
            arr4[i] = i * 4;
            System.out.println("The array arr4: " + arr4[i]);
        }
    }
}