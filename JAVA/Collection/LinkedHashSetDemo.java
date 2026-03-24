// LinkedHashSet is a subclass of HashSet that maintains a doubly-linked list of entries.
//it implementation uses linked list for maintaining the order of elements and hash table for storing the elements.

import java.util.Set;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Java");
        linkedHashSet.add("Python");
        linkedHashSet.add("C++");
        linkedHashSet.add("Java"); // Duplicate entry, will not be added

        System.out.println("LinkedHashSet contains: " + linkedHashSet);
        // remove an element
        linkedHashSet.remove("Python");
        System.out.println("LinkedHashSet after removing Python: " + linkedHashSet);
        //check the size of the set
        System.out.println("Size of the LinkedHashSet: " + linkedHashSet.size());
        //check if the set contains an element
        System.out.println("LinkedHashSet contains Java: " + linkedHashSet.contains("CSS"));
    }
}