import java.util.HashMap;
import java.util.*;

public class mapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        //put() method is used to add key-value pairs to the map
        //get() method is used to retrieve the value associated with a specific key
        //remove() method is used to remove a key-value pair from the map
        //containsKey() method is used to check if a specific key is present in the map
        //containsValue() method is used to check if a specific value is present in the map
        //keySet() method is used to get a set of all the keys in the map
        //values() method is used to get a collection of all the values in the map
        //entrySet() method is used to get a set of all the key-value pairs in the map
        //size() method is used to get the number of key-value pairs in the map
        //clear() method is used to remove all the key-value pairs from the map
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        System.out.println("The value of map is: " +map);
        System.out.println("The value associated with key 2 is: " +map.get(2));
        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("B"));
        System.out.println(map.size());

        //entry set
        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
        

    }
}