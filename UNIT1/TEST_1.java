import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TEST_1 {
    public static void main(String[] args) {
        
        try {
            FileReader file = new FileReader("abc.txt");
            System.out.println("File opened successfully.");
            file.close();   
        } 
        catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } 
        catch (IOException e) {
            System.out.println("Error while closing the file.");
        }
    }
}
