import java.util.Base64;

public class Base64Example {
    public static void main(String[] args) {

        String a = "Hello Java";

        // Encode
        String e = Base64.getEncoder().encodeToString(a.getBytes());
        System.out.println("Encoded: " + e);

        // Decode
        byte[] decodedBytes = Base64.getDecoder().decode(e);
        String d = new String(decodedBytes);
        System.out.println("Decoded: " + d);
    }
}