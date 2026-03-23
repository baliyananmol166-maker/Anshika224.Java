//this program demonstrates the use of the join() method to wait for a thread to finish before proceeding with the main thread.
public class ThreadJoinDemo extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Child thread is running: " + i);
        }
    }

    public static void main(String[] args) {
        ThreadJoinDemo t1 = new ThreadJoinDemo();
        t1.start();

        try {
            t1.join(); // Wait for the child thread to finish
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted while waiting for child thread to finish.");
        }

        System.out.println("Main thread is running after child thread has finished.");
    }
}