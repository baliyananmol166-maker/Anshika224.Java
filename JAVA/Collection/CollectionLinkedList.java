//linked list is a dynamic  data structure that stores a collection of elements in a linear order.
//It is a collection of nodes where each node contains a data and a reference to the next node in the list.
import java.util.LinkedList;


public class CollectionLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Anshika");
        list.add("Rohit");
        list.add("Pooja");
        list.add("Satyam");
        System.out.println("The value of linked list is: " +list);
        //print first element of linked list
        System.out.println("The first element of linked list is: " +list.getFirst());
        //print last element of linked list
        System.out.println("The last element of linked list is: " +list.getLast());
        //print the size of linked list
        System.out.println("The size of linked list is: " +list.size());
        //remove an element from linked list
        list.remove("Pooja");
        System.out.println("The value of linked list after removing an element is: " +list);
        //add an element to linked list
        list.add("Rahul");
        System.out.println("The value of linked list after adding an element is: " +list);
        //clear the linked list
        list.clear();
        System.out.println("The value of linked list after clearing is: " +list);
        System.out.println("The size of linked list after clearing is: " +list.size());
    }
}