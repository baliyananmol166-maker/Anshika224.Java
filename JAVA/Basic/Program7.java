//Primitive conversions (widening and narrowing) in java....
public class Program7 {
    public static void main(String[] args) {

     //Widening conversion(Implicit conversion)
     int intVar = 10;
     double doubleVar = intVar; // int can be implicitly converted to double
     float floatVar1 = intVar; // int can be implicitly converted to float
        System.out.println("Value of intVar: " + intVar);   
        System.out.println("Value of doubleVar: " + doubleVar);
        System.out.println("Value of floatVar1: " + floatVar1);   

     //Narrowing conversion(Explicit conversion)
      float floatVar2 = 100.5f; 
      int intVar2 = (int) floatVar2; // float can be explicitly converted to int
        System.out.println("Value of floatVar2: " + floatVar2);   
        System.out.println("Value of intVar2: " + intVar2);
    }
}