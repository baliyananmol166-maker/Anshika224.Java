//This program is to show how to use yield method in thread class.
public class ThreadYieldDemo {
    public static void main(String[] args) {
        ThreadYieldClass t1 = new ThreadYieldClass();
        t1.setName("First thread");
        t1.start();

        ThreadYieldClass t2 = new ThreadYieldClass();
        t2.setName("Second thread");
        t2.start();

        ThreadYieldClass t3 = new ThreadYieldClass();
        t3.setName("Third thread");
        t3.start();
    }
}
class ThreadYieldClass extends Thread {
    @Override
    public void run() {
        for(int i=0; i<5; i++){
            System.out.println("For iteration i :: " + i + " :: Thread yield example and thread name is: " + Thread.currentThread().getName());
            Thread.yield(); // it will yield the current thread to other thread.
        } 
    }
}