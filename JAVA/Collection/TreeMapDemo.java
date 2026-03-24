// TreeMap is a sorted map that uses a red-black tree for storing the key-value pairs.
// It does not allow duplicate keys and it maintains the natural ordering of the keys.
import java.util.Map;
import java.util.TreeMap;
public class TreeMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "ALPHA");
        treeMap.put(1, "BETTA");
        treeMap.put(2, "GAMMA");
        treeMap.put(1, "PHI"); // Duplicate key, will overwrite the previous value

        System.out.println("TreeMap contains: " + treeMap);
        // remove an element
        treeMap.remove(2);
        System.out.println("TreeMap after removing key 2: " + treeMap);
        //check the size of the map
        System.out.println("Size of the TreeMap: " + treeMap.size());
        //check if the map contains a key
        System.out.println("TreeMap contains key 1: " + treeMap.containsKey(1));
        //check if the map contains a value
        System.out.println("TreeMap contains value Java: " + treeMap.containsValue("BETTA"));
    }
}