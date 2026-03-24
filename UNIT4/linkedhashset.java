//linked hash set is a set implements which store unique element and maintain insertion order.
//no duplication allow.
import java.util.LinkedHashSet;

public class linkedhashset {
    public static void main(String[] args) {
       LinkedHashSet<Integer> set = new LinkedHashSet<>();
       //add method
       set.add(50);
       set.add(20);
       set.add(30);
       System.out.println("LinkedHashSet: " + set);
       //to array() -> convert set to array
       //.clone() -> create a copy of the set

       //remove method
       set.remove(20);
       System.out.println("After removing 20: " + set);

       //contains method
       boolean contains30 = set.contains(30);
        System.out.println("Contains 30: " + contains30);
    }

}