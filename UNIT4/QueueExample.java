import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
       //poll method retrieves and removes the head of the queue, or returns null if the queue is empty.
       //peek method retrieves, but does not remove, the head of the queue, or returns null if the queue is empty.
       //offer method adds the specified element to the queue.
       //add method adds the specified element to the queue, throwing an exception if the queue is full.
       //remove method retrieves and removes the head of the queue, throwing an exception if the queue

       Queue<String> queue = new LinkedList<>();
         queue.offer("Java");
         queue.offer("Python");
         queue.offer("C++");
         System.out.println("Queue: " + queue);
         System.out.println("Size of Queue: " + queue.size()); 
         System.out.println("Head of Queue: " + queue.peek());
         System.out.println("Removed from Queue: " + queue.poll());
         System.out.println("Queue after removal: " + queue);
         System.out.println("Size of Queue after removal: " + queue.size());
         queue.add("C");
         System.out.println("Queue after adding C: " + queue);
         queue.remove();
         System.out.println("Queue after removing head: " + queue);
         System.out.println("Size of Queue after removing head: " + queue.size()); 
               
    }
}