//initialization in java...
public class Program30 {
    boolean booleanUnitializedVar; boolean booleanVar = true;
    int intUninitializedVar; int intVar = 10;
    float floatUninitializedVar; float floatVar = 10.5f;
    //Circle circleUninitializedVar; Circle circleVar = new Circle(5);

    public static void main(String[] args) {
      Program30 p = new Program30();
      System.out.println("Uninitailized boolean variable is: " +p.booleanUnitializedVar);
      System.out.println("Initialized boolean variable is: " +p.booleanVar);

      System.out.println("Uninitailized int variable is: " +p.intUninitializedVar);
      System.out.println("Initialized int variable is: " +p.intVar);

      System.out.println("Uninitailized float variable is: " +p.floatUninitializedVar);
      System.out.println("Initialized float variable is: " +p.floatVar);

      //System.out.println("Uninitailized Circle variable is: " +p.circleUninitializedVar.radius);
      //System.out.println("Initialized Circle variable is: " +p.circleVar.radius);
    }
}