//generic method is a method that can work with different data types.
import java.util.LinkedList;

public class GenericMethodDemo {
    public static void main(String[] args) {
        classDemo();
    }
    static void classDemo() {
        myQueue<String> strQ = new myQueue<>();
        strQ.enqueue("C");
        strQ.enqueue("C++");
        strQ.enqueue("Java");
        strQ.enqueue("Python");
        System.out.println("str queue is:" + strQ.l);
        
        String str = strQ.dequeue();  // it remove first element of the queue and return it.
        System.out.println("After updation str queue is:" +strQ.l);
    }
}
class myQueue<T> {
    LinkedList<T> l = new LinkedList<>();
    public void enqueue(T obj) {
        l.addLast(obj);

    }
    public T dequeue() {
        return l.removeFirst();
        
    }
}

