//buffered// BufferedReader and BufferedWriter provide buffering for faster I/O operations

import java.io.*;


public class BufferedDemo {

    // Byte Stream Example
    static void callByteStreamDemo() {
        int size = 0;
        byte[] arr = new byte[256];

        try (InputStream in = new FileInputStream("inputFile.txt");
             OutputStream out = new FileOutputStream("inputFile2.txt")) {

            int i;
            while ((i = in.read(arr)) != -1) {
                size += i;
                out.write(arr, 0, i);
            }

            System.out.println("Size of the file is: " + size + " bytes");

        } catch (IOException e) {
            System.out.println(e);
        }
    }

    // Character Stream Example
    static void callCharacterStreamDemo() {
        char[] charArr = new char[256];

        try (FileReader fin = new FileReader("file.txt");
             PrintWriter pw = new PrintWriter(System.out)) {

            int i;
            while ((i = fin.read(charArr)) != -1) {
                pw.write(charArr, 0, i);
            }

            System.out.println("\nFile read successfully");

        } catch (IOException e) {
            System.out.println(e);
        }
    }

    // Buffered Reader & Writer Example
    public static void main(String[] args) {
    callByteStreamDemo();
    callCharacterStreamDemo();

    try (BufferedReader br = new BufferedReader(new FileReader("inputFile.txt"));
         BufferedWriter bw = new BufferedWriter(new FileWriter("inputFile2.txt"))) {

        String str;

        while ((str = br.readLine()) != null) {
            bw.write(str);
            bw.newLine();
        }

        System.out.println("File copied successfully using Buffered Streams");

    } catch (IOException e) {
        System.out.println(e);
    }
}
}
