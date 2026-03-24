//this program show the example of tree set.
//tree set is a set which store unique element and maintain natural order.
//no duplication allow.
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<>();
        t.add(40);
        t.add(10);
        t.add(20);
        t.add(30);
        System.out.println("TreeSet: " + t);
        //print first element 
        System.out.println("First element:" + t.first());
        //print last element
        System.out.println("Last element:" + t.last());
        //headSet() -> return a view of the portion of this set whose elements are strictly less than toElement.
        System.out.println("HeadSet (less than 30): " + t.headSet(30));
        //tailSet() -> return a view of the portion of this set whose elements are greater
        //than or equal to fromElement.
        System.out.println("TailSet (greater than or equal to 30): " + t.tailSet(30));
        //remove method
        t.remove(30);
        System.out.println("TreeSet after removing 30: " + t);
        //higher method
        System.out.println("Higher than 20: " + t.higher(20));
        //lower method
        System.out.println("Lower than 20: " + t.lower(20));


    }
}