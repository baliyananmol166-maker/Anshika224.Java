//sorted set is a set which store unique element and maintain natural order.
//no duplication allow.

import java.util.SortedSet;
import java.util.TreeSet;

public class sortedset {
    public static void main(String[] args) {
        SortedSet<Integer> s = new TreeSet<>();
        s.add(40);
        s.add(10);
        s.add(20);
        s.add(30);

        System.out.println("SortedSet: " + s);
        //print first element
        System.out.println("First element: " + s.first());
        //print last element
        System.out.println("Last element:" + s.last());
        //headSet() -> return a view of the portion of this set whose elements are strictly less than toElement.
        System.out.println("HeadSet (less than 30): " + s.headSet(30));
        //tailSet() -> return a view of the portion of this set whose elements are greater than or equal to fromElement.
        System.out.println("TailSet (greater than or equal to 20): " + s.tailSet(30));
    }
}