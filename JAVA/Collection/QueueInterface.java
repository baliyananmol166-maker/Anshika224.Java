//queue interface keeps the elements in the FIFO order.
//it does not allow duplicate elements and it maintains the order of the elements.
import java.util.Queue;
import java.util.LinkedList;
public class QueueInterface {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("APPLE");
        queue.add("BANANA");
        queue.add("ORANGE");
        queue.add("GRAPE"); // Duplicate entry, will be added

        System.out.println("Queue contains: " + queue);
        // remove an element
        queue.remove();
        System.out.println("Queue after removing an element: " + queue);
        //check the size of the queue
        System.out.println("Size of the queue: " + queue.size());
        //check if the queue contains an element
        System.out.println("Queue contains APPLE: " + queue.contains("APPLE"));
        //peak() method is used to retrieve the head of the queue without removing it
        System.out.println("Head of the queue: " + queue.peek());
        //poll() method is used to retrieve and remove the head of the queue
        System.out.println("Head of the queue: " + queue.poll());
    }
}