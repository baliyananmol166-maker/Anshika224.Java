//map contains the objects as key-value pairs.
//the key are unique but the value can be duplicate. it does not maintain the order of the elements.
import java.util.HashMap;
import java.util.Map;
public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C++");
        map.put(1, "JavaScript"); // Duplicate key, will overwrite the previous value

        System.out.println("Map contains: " + map);
        // remove an element
        map.remove(2);
        System.out.println("Map after removing key 2: " + map);
        //check the size of the map
        System.out.println("Size of the map: " + map.size());
        //check if the map contains a key
        System.out.println("Map contains key 1: " + map.containsKey(1));
        //check if the map contains a value
        System.out.println("Map contains value Java: " + map.containsValue("Java"));
    }
}