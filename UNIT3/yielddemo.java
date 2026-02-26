public class yielddemo {
    public static void main(String[] args){
        int day=1;
        String result=switch(day){
            case 1->{
                System.out.println("Running");
                yield "Monday";

            } default -> "Invalid day";
        };
        System.out.println(result);
    }
}