import java.io.FileWriter;
import java.io.IOException;

public class CharWriteExample {

    public static void main(String[] args) {

        try (FileWriter fw = new FileWriter("charfile.txt")) {

            fw.write("HELLO JAVA CHARACTER STREAM!");
            System.out.println("Data written to file successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
