// creating your own exception class in java...
public class UserDefinedExceptionClass {
    public static void main(String[] args) {
        int[] sugarData = new int[] {80, 90, 67, 130, 110, 132,180, 177, 50, 60 , 140};
        for(int i : sugarData) {
        try {
            testSugar(i);
            System.out.println("Sugar level is normal for value: " + i);
        }
        catch(LowSugarException e) {
            System.out.println("Caught LowSugarException: " + e.getMessage());
        }
        catch(HighSugarException e) {
            System.out.println("Caught HighSugarException: " + e.getMessage());
        }
        catch(Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
    public static void testSugar(int val) throws LowSugarException, HighSugarException {
        if(val<70) {
            throw new LowSugarException("Sugar level is too low, please take some sugar.");
        } else if(val>=70 && val<=130){
            System.out.println("Sugar level is normal.");
        }else {
            throw new HighSugarException("Sugar level is too high, please consult a doctor.");
        }

    }
}

class LowSugarException extends Exception {
    public LowSugarException(String message) {
        super(message);
    }
}

class HighSugarException extends Exception {
    public HighSugarException(String message) {
        super(message);
    }
}