//generic map is a method to store key value pair.

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class GenericMapDemo {
    public static void main(String[] args) {
        mapDemo();
    }
     static void mapDemo() {
            Map<Integer, String> m = new HashMap<>();
            m.put(1, "One");
            m.put(2, "Two");
            m.put(3, "Three");
            m.put(4, "Four");
            System.out.println("Map is:" + m);
            
            //use of iterator
            Iterator<Integer> keyIt = m.keySet().iterator();
            while (keyIt.hasNext()) {
                System.out.println("Map has " + m.get(keyIt.next()).toUpperCase());
            }
     }
}
