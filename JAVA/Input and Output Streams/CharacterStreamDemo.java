//reader and writer classes and their subclasses are used for dealing with the characters.
//reader class is used for reading data in terms of characters and writer class is used for writing data in terms of characters.

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class CharacterStreamDemo {
    public static void main(String[] args) {
        try  {
            char[] charArr = new char[256];
            FileReader fin = new FileReader("file.txt");
            PrintWriter pw = new PrintWriter(System.out);

            int i;     
            while((i = fin.read(charArr)) != -1) {
                pw.write(charArr, 0, i);
            }
            System.out.println("File read successfully");
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}