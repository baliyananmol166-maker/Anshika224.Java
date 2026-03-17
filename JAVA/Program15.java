//switch statement in java...
public class Program15 {
    public static void main(String[] args) {
        int i = 4;
        //first method
        switch(i) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        };
        //second method
        int j = 5;
        switch(j) {
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("February");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("June");
            case 7 -> System.out.println("July");
            case 8 -> System.out.println("August");
            case 9 -> System.out.println("September");
            case 10 -> System.out.println("October");
            case 11 -> System.out.println("November");
            case 12 -> System.out.println("December");
            default -> System.out.println("Invalid month");
        };
        //Third method
        int k = 4 ;
        String result = switch(k) {
            case 1 -> "Red";
            case 2 -> "Green";
            case 3 -> "Blue";
            case 4 -> "Yellow";
            case 5 -> "Orange";
            default -> "Invalid color";
        };
        System.out.println(result);
    }
}