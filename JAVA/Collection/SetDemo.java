//set is a collection of unique objects and it does not allow duplicate.
import java.util.HashSet;
import java.util.Set;
public class SetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("Java"); // Duplicate entry, will not be added

        System.out.println("Set contains: " + set);
        // remove an element
        set.remove("Python");
        System.out.println("Set after removing Python: " + set);
        //check the size of the set
        System.out.println("Size of the set: " + set.size());
        //check if the set contains an element
        System.out.println("Set contains Java: " + set.contains("Java"));
    }
}