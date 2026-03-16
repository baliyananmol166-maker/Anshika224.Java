//Operators in java.......
public class Program8 {
   public static void main(String[] args) {
      unaryDemo();
      conditionalDemo(); 
      shiftDemo(); 
   }

   public static void unaryDemo() {

      //Increement and decreement operator
      System.out.println("-----Increement and Decreement Operator-----");
      int a = 10;

      System.out.println("Current value of a:" + a);
      System.out.println("Value become after post-increement (a++):" + (a++));
      System.out.println("Now value of a:" + a);
      System.out.println("Value become after pre-increement (++a):" + (++a));
      System.out.println("Now value of a:" + a);
      System.out.println("Value become after post-decreement (a--):" + (a--));
      System.out.println("Now value of a:" + a);
      System.out.println("Value become after pre-decreement (--a):" + (--a));
      System.out.println("Now value of a:" + a);

      //Logical operators for boolean values
      System.out.println("-----Logical Operators for boolean values-----");
      boolean x = false;
      System.out.println("x's value of now is:" + !x);
   }

   public static void conditionalDemo() {

      boolean y = true;
      boolean z = false;
      int p = 10;

      System.out.println("-----Conditional Operators-----");
      System.out.println("true && true is:" + (y && y));   //logical AND operator
      System.out.println("true && false is:" + (y && z));

      System.out.println("true || false:" + (y || z));    //logical OR operator
      System.out.println("false || false:" + (z || z));
      System.out.println("true || true:" + (y || y));

      // expression ? expression1 : expression2 (ternary operator)
      System.out.println("ternary demo; " + (p==10 ? p:0)); //true condition, so it will return p
      System.out.println("ternary demo; " + (p<10 ? p:0));  //false condition, so it will return 0
      System.out.println("ternary demo; " + (p>10 ? p:0));  //false condition, so it will return 0
   }

   public static void shiftDemo() {

      byte i = 31; 
      System.out.println("-----Shift Operators-----");
      //i<<s = i*2^s (left shift operator)
      //i>>s = i/2^s (right shift operator)
      System.out.println("left shift of i result in :" + (i<<2)); //left shift operator (i will be shifted to left by 2 bits)
      System.out.println("right shift of i result in :" + (i>>2)); //right shift operator (i will be shifted to right by 2 bits)  

   }
}