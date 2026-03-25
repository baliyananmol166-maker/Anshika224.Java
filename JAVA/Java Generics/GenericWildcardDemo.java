//generic wildcard is a type of generic that can work with any data type.


import java.util.List;
import java.util.ArrayList;

public class GenericWildcardDemo {

    public static void main(String[] args) {

        // Integer list
        List<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(20);
        intList.add(30);

        // String list
        List<String> strList = new ArrayList<>();
        strList.add("A");
        strList.add("B");
        strList.add("C");

        // Calling wildcard method
        wildCardDemo(intList);
        wildCardDemo(strList);
    }

    // Wildcard method
    static void wildCardDemo(List<?> list) {
        for (Object obj : list) {
            System.out.println("The item is: " + obj);
        }
    }
}