// input stream class is used for reading data in terms of bytes.
//output straem class is used for writing data in terms of bytes.

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteStreamDemo {
    public static void main(String[] args) {
        try {
            int size = 0;
            byte[] arr = new byte[256];

            InputStream in = new FileInputStream("inputFile.txt");
            OutputStream out = new FileOutputStream("inputFile2.txt");
            //it will create a new file if it does not exist and if it exist then it will overwrite the existing file.

            int i;
            while((i = in.read(arr)) != -1) {
                size += i;
                out.write(arr, 0, i);
            }

            System.out.println("Size of the file is: " + size + " bytes");
        }
        catch (IOException e) {
            System.out.println(e);
        }
        
    }
}
