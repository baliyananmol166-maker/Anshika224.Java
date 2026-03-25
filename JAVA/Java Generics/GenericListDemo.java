//Generics list is a collection of objects of a specific type.
//it provide type safety and eliminates the need for type casting.
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;


public class GenericListDemo {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(20);
        intList.add(30);
        intList.add(40);
        System.out.println("Integer List: " + intList);

        //for adding string to the list.
        List<String> StringList = new ArrayList<>();
        StringList.add("Apple");
        StringList.add("Banana");
        StringList.add("Cherry");
        StringList.add("Graphes");
        System.out.println("String List: " + StringList);

        //use of iterator.
        Integer i;
        Iterator<Integer> iterator = intList.iterator();
        while (iterator.hasNext()) {
            i = iterator.next();
            System.out.println("The value is : " + i);
        }
    }
}