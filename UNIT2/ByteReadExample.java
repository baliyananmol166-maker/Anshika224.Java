import java.io.FileInputStream;
import java.io.IOException;

public class ByteReadExample {

    public static void main(String[] args) {

        try (FileInputStream fis = new FileInputStream("bytefile.txt")) {

            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

        