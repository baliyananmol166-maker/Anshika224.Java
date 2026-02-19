import java.io.FileOutputStream;
import java.io.IOException;

public class ByteWriteExample {

    public static void main(String[] args) {

        try (FileOutputStream fos = new FileOutputStream("bytefile.txt")) {

            String data = "HELLO JAVA BYTE STREAM!";
            byte[] byteData = data.getBytes();

            fos.write(byteData);

            System.out.println("Data written to file successfully.");
        }
        catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
