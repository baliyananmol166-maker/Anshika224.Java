public class SwitchCase2 {
    public static void main (String[] args) {
        int day=1;
        String result=switch(day) {
            case 1:
                yield "one";
            case 2:
                yield "two";
            default:
                yield "other";
        };
        System.out.println(result);
    }
}