//Anshika
//2400320100224
import java.util.*;
public class TestMatrix {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of rows: ");
            int rows = sc.nextInt();
            System.out.print("Enter number of columns: ");
            int cols = sc.nextInt();
            int[][] A = new int[rows][cols];
            int[][] B = new int[rows][cols];
            System.out.println("Enter elements of Matrix A:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    A[i][j] = sc.nextInt();
                }
            }
            System.out.println("Enter elements of Matrix B:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    B[i][j] = sc.nextInt();
                }
            }
            System.out.println("\nMatrix A:");
            Matrix.printMatrix(A);
            System.out.println("\nMatrix B:");
            Matrix.printMatrix(B);
            System.out.println("\nAddition of Matrices:");
            int[][] sum = Matrix.addMatrix(A, B);
            Matrix.printMatrix(sum);
            System.out.println("\nSubtraction of Matrices:");
            int[][] diff = Matrix.subtractMatrix(A, B);
            Matrix.printMatrix(diff);
        }
    }
}