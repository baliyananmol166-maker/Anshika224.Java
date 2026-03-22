// how to handle multiple Exception in java..
import java.net.*;
import java.io.*;

public class MultipleExceptionDemo {
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String urlString = br.readLine();
            URL url = new URL(urlString);
            br = new BufferedReader(new InputStreamReader(url.openStream()));
            System.out.println(br.readLine());
        } 
        //for try block you have to  give "https://www.google.com", then it will print the first line of the google home page.
        //if we give wrong url then it will reach exception block.

        catch (MalformedURLException e) {
            System.out.println("Invalid URL format!"); //for this you have to enter "htt://google.com" invalid url
        } 
        
        catch (IOException e) {
            System.out.println("Error accessing the URL!");// for this you have to enter "https://www.google.com:0101" wrong port number
        } 

        finally {
            System.out.println("We are present in finally block, it will always execute whether exception is handled or not.");
        }
    }
}