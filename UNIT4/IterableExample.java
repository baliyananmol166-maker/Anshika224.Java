import java.util.*;
public class IterableExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("ABC");
        names.add("DEF");
        names.add("HIJ");

        Iterator<String> it = names.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}