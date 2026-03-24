//in this program we will see array and array list in java
//array is a data structure that stores a fixed number of values of the same type. 
//It is a collection of elements that are stored in contiguous memory locations and can be accessed using an index.
//ArrayList is a resizable array implementation of the List interface in Java.

import java.util.ArrayList;

public class CollectionArray {
    public static void main(String[] args) {
        //array example
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        System.out.println("The value of array is: ");
        for(int i = 0; i<arr.length; i++) {
            System.out.println(arr[i]);
        
        //print first element of array
        System.out.println("The first element of array is: " +arr[0]);
        //print last element of array
        System.out.println("The last element of array is: " +arr[arr.length-1]);
        //print the length of array
        System.out.println("The length of array is: " +arr.length);
        
        }
        //array list example
        ArrayList<String> list = new ArrayList<>();
        list.add("Anshika");
        list.add("Rohit");
        list.add("Pooja");
        list.add("Satyam");
        System.out.println("The value of array list is: " +list);
        //print first element of array list
        System.out.println("The first element of array list is: " +list.get(0));
        //print last element of array list
        System.out.println("The last element of array list is: " +list.get(list.size()-1));
        //print the size of array list
        System.out.println("The size of array list is: " +list.size());
        //remove an element from array list
        list.remove("Pooja");
        System.out.println("The value of array list after removing an element is: " +list);
        //add an element to array list
        list.add("Rahul");
        System.out.println("The value of array list after adding an element is: " +list);
        //clear the array list
        list.clear();
        System.out.println("The value of array list after clearing is: " +list);
        System.out.println("The size of array list after clearing is: " +list.size());
        
    }
}