// this program demonstrates the use of synchronization to control access to a shared resource.
//it prevent more than one thread from accessing critical section of code at the same time.
public class SynchronizationDemo {
    private int count = 0;

    // synchronized method to increment the count variable
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }

    public static void main(String[] args) {
        SynchronizationDemo demo = new SynchronizationDemo();

        // create multiple threads that will increment the count variable
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                demo.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                demo.increment();
            }
        });

        // start the threads
        thread1.start();
        thread2.start();

        // wait for the threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }

        // print the final count value
        System.out.println("Final count: " + demo.getCount());
    }
}