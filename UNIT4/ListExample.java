import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("C");
        System.out.println("List: " + list);
        //print size of list
        System.out.println("Size of List: " + list.size());
        //access element at index 1
        System.out.println("Element at index 1: " + list.get(1));
        //update element at index 2
        list.set(2, "JavaScript");
        System.out.println("Updated List: " + list);
        //remove element at index 0
        list.remove(0);
        System.out.println("List after removal: " + list);
        System.out.println("Size of List: " + list.size());
    }
}