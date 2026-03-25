//lower bound wildcard is a method that can accept a list of any type that is a superclass of a specified class.

import java.util.List;
import java.util.ArrayList;

public class SuperWildcardDemo {

    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<>();
        List<Number> numList = new ArrayList<>();
        List<Object> objList = new ArrayList<>();

        addNumbers(intList);
        addNumbers(numList);
        addNumbers(objList);

        System.out.println(intList);
        System.out.println(numList);
        System.out.println(objList);
    }

    // Lower bounded wildcard
    static void addNumbers(List<? super Integer> list) {
        list.add(10);
        list.add(20);
        list.add(30);
    }
}