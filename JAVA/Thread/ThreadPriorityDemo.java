//this code show the use of thread priority 
public class ThreadPriorityDemo extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running with priority: " + Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        ThreadPriorityDemo thread1 = new ThreadPriorityDemo();
        ThreadPriorityDemo thread2 = new ThreadPriorityDemo();
        ThreadPriorityDemo thread3 = new ThreadPriorityDemo();

        // Setting different priorities for the threads
        thread1.setPriority(Thread.MIN_PRIORITY); // Priority 1
        thread2.setPriority(Thread.NORM_PRIORITY); // Priority 5
        thread3.setPriority(Thread.MAX_PRIORITY); // Priority 10

        // Starting the threads
        thread1.start();
        thread2.start();
        thread3.start();
    }
}