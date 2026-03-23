// this program is to show how to use sleep method in thread.
public class ThreadSleepDemo {
    public static void main(String[] args) {
        ThreadSleepClass t1 = new ThreadSleepClass();
        t1.setName("First thread");
        t1.start();

        ThreadSleepClass t2 = new ThreadSleepClass();
        t2.setName("Second thread");
        t2.start();

        ThreadSleepClass t3 = new ThreadSleepClass();
        t3.setName("Third thread");
        t3.start();
    }
}
class ThreadSleepClass extends Thread {
    @Override
    public void run() {
        try {
           for(int i=0; i<5; i++){
            System.out.println("For iteration i :: " + i + " :: Thread sleep example and thread name is: " + Thread.currentThread().getName());
            Thread.sleep(1000); // it will sleep for 1 second.
           } 
        } 
        catch (InterruptedException e) {
            System.err.println("Thread is interrupted");
        }
    }
}