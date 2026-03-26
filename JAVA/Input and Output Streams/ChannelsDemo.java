//java channels are similar to streams but they are more efficient and provide better performance.
//we can both read and write data using channels. Channels are used in conjunction with buffers to read and write data.

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelsDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("file.txt");
            FileOutputStream fos = new FileOutputStream("file2.txt");

            FileChannel in = fis.getChannel();
            FileChannel out = fos.getChannel();

            int bufferSize = 2048;
            ByteBuffer buffer = ByteBuffer.allocate(bufferSize);
            long start = System.nanoTime();
            while (in.read(buffer) > 0) {
                buffer.flip();
                out.write(buffer);
                buffer.clear();
            }
            System.out.println("Time taken to copy file using channels in milliseconds: " + (System.nanoTime() - start) / 1000000 + " ms");
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}