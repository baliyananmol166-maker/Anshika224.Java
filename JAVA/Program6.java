// different types of primitive data types in JAVA...
public class Program6 {
    public static void main(String[] args) {
        
        byte byteVar = 20;   //used for only 8 bit integer values
        System.out.println("Value of byteVar:" + byteVar);
        //byteVar = 128; (This will cause a compile-time error.)

        short shortVar = 256; //used for only 16 bit integer values
        System.out.println("Value of shortVar:" + shortVar);
        // shortVar = 32768; (This will cause a compile-time error.)

        int intVar = 1000; //used for only 32 bit integer values
        System.out.println("Value of intVar:" + intVar);
        // intVar = 2147483648; (This will cause a compile-time error

        long longVar = 100000L; //used for only 64 bit integer values
        System.out.println("Value of longVar:" + longVar);
        // longVar = 9223372036854775808L; (This will cause a compile-time error.)

        float floatVar = 3.14f; //used for only 32 bit floating-point values
        System.out.println("Value of floatVar:" + floatVar);
        // floatVar = 3.4028235E38f; (This will cause a compile-time error.)

        double doubleVar = 3.141592653589793; //used for only 64 bit floating-point values
        System.out.println("Value of doubleVar:" + doubleVar);
        // doubleVar = 1.7976931348623157E308; (This will cause a compile-time error.)

        boolean boolVar = true; //used for only boolean values (true or false)
        System.out.println("Value of boolVar:" + boolVar);

        char charVar = 'A'; //used for only single character values
        System.out.println("Value of charVar:" + charVar);

        char charVar2 = (char)232; //can be assigned using Unicode values
        System.out.println("Value of charVar2:" + charVar2);
        

    }
}