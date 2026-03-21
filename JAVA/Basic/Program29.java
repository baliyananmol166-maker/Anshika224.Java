//another example of variable reference in java...
public class Program29 {

    public static class testRefVar {
        int val;
    }

    public static void changeVariableValue(testRefVar a){
        a.val = 19;
        System.out.println("Value of a inside method: " + a.val);
    }

    public static void main(String[] args){
        testRefVar refVar = new testRefVar();
        refVar.val = 5;

        System.out.println("Value of refVar before method call: " + refVar.val);

        changeVariableValue(refVar);

        System.out.println("Value of refVar after method call: " + refVar.val);
    }
}