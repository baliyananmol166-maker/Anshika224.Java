import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println("ArrayList:" + numbers);
        //print size of arrayList
        System.out.println("Size of ArrayList before updation: " + numbers.size());
        //access element at index 1
        System.out.println("Element at index 1: " + numbers.get(1));
        numbers.set(1,100);
        System.out.println("Updated ArrayList: " + numbers);
        //remove element at index 0
        numbers.remove(0);
        System.out.println("ArrayList after removal: " + numbers);
        System.out.println("Size of ArrayList: " + numbers.size());
    }
}