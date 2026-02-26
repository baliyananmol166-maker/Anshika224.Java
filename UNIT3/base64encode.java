import java.util.Base64;

public class base64encode {

   public static void main(String[] args){
    String original="anshika244";

    String encoded=Base64.getEncoder().encodeToString(original.getBytes());
    System.out.println("Encoded String: "+encoded);

    byte[] decodebyte=Base64.getDecoder().decode(encoded);

    String decoded=new String(decodebyte);
    System.out.println("Decoded String: "+decoded);
   }
}