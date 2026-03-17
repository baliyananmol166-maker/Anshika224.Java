import java.util.*;

public class CollectionInterface {
    public static void main(String[] args) {
        Collection<String> fruits = new ArrayList<>();

        fruits.add("a");
        fruits.add("b");
        fruits.add("c");
        fruits.add("d");

        System.out.println("Fruits: " + fruits);

        System.out.println("Size of collection: " + fruits.size());
    }
}