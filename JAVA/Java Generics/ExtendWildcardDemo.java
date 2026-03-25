//upper bounded wildcard is a method that can accept a list of any type that is a subclass of a specified class.

import java.util.List;
import java.util.Arrays;

public class ExtendWildcardDemo {

    public static void main(String[] args) {

        // Integer list
        List<Integer> intList = Arrays.asList(10, 20, 30);

        // Double list
        List<Double> doubleList = Arrays.asList(1.5, 2.5, 3.5);

        // Calling method
        printNumbers(intList);
        printNumbers(doubleList);
    }

    // Upper bounded wildcard
    static void printNumbers(List<? extends Number> list) {
        for (Number num : list) {
            System.out.println("Value: " + num);
        }
    }
}