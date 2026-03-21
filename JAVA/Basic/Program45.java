//wrapper demo in java...
//wrapper class is used to covert primitive data types into objects and vice versa.
public class Program45 {
    public static void main(String[] args) {

        // Primitive values
        int i = 5;
        boolean b = true;

        // Autoboxing  i.e. java automatically converts primitve data type into wrapper class object. 
        Integer I = i;       // int → Integer   here, int is primitive data type and Integer is wrapper class.
        Boolean B = b;       // boolean → Boolean   here, boolean is primitive data type and Boolean is wrapper class.

        System.out.println("Integer value: " + I);
        System.out.println("Primitive int value: " + i);
        System.out.println("Boolean value: " + B);
        System.out.println("Primitive boolean value: " + b);

        // manual boxing i.e. java does not automatically converts but we can manually convert.
        Integer I2 = Integer.valueOf(6);  // int → Integer
        Boolean B2 = Boolean.valueOf(false);  // boolean → Boolean

        System.out.println("Manual Integer value: " + I2);
        System.out.println("Manual Boolean value: " + B2);

        // unboxing i.e. java automatically converts wrapper class object into primitve data type.
        int i2 = I;   // Integer → int
        boolean b2 = B; // Boolean → boolean

        System.out.println("Unboxed int value: " + i2);
        System.out.println("Unboxed boolean value: " + b2);

    }
}