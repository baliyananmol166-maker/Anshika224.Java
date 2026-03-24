// Tree set is a sorted set that uses a red-black tree for storing the elements. 
// It does not allow duplicate elements and it maintains the natural ordering of the elements.
import java.util.Set;
import java.util.TreeSet;
public class TreeSetDemo {
    public static void main(String[] args) {
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Java");
        treeSet.add("Python");
        treeSet.add("C++");
        treeSet.add("Java"); // Duplicate entry, will not be added

        System.out.println("TreeSet contains: " + treeSet);
        // remove an element
        treeSet.remove("Python");
        System.out.println("TreeSet after removing Python: " + treeSet);
        //check the size of the set
        System.out.println("Size of the TreeSet: " + treeSet.size());
        //check if the set contains an element
        System.out.println("TreeSet contains Java: " + treeSet.contains("Java"));
    }
}