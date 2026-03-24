//this is an example of collection framework in java
//list is an interface in java that extends collection interface and provides a way to store ordered collection of objects.
//It allows duplicate elements and maintains the insertion order.

import java.util.ArrayList;
import java.util.Collections;
public class CollectionList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //add elements to the list
        list.add("Anshika");
        list.add("Rohit");
        list.add("Pooja");
        list.add("Satyam");
        System.out.println("The value of list is: " +list);
        //sort the list
        Collections.sort(list);
        System.out.println("The value of list is: " +list);
        //reverse the list
        Collections.reverse(list);
        System.out.println("The reversed list is: " +list);
        //remove the element from the list
        list.remove("Pooja");
        System.out.println("List after removing element is:" +list);
        //check if the list contains an element
        boolean isPresent = list.contains("Rohit");
        System.out.println("Is Rohit present in the list? " +isPresent);
        //get the size of the list
        int size = list.size();
        System.out.println("The size of the list is: " +size);
        //clear the list
        list.clear();
        System.out.println("List after clearing: " +list);


    }
}