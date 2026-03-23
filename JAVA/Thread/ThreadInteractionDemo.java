// this program demonstrates the use of interaction between threads using wait and notify methods.
public class ThreadInteractionDemo {
    private final Object lock = new Object();
    private boolean isDataReady = false;

    public void produceData() {
        synchronized (lock) {
            try {
                // Simulate data production
                Thread.sleep(2000);
                isDataReady = true;
                System.out.println("Data produced, notifying consumer...");
                lock.notify(); // Notify the waiting consumer thread
            } catch (InterruptedException e) {
                System.out.println("Producer thread interrupted: " + e.getMessage());
            }
        }
    }

    public void consumeData() {
        synchronized (lock) {
            while (!isDataReady) {
                try {
                    System.out.println("Consumer is waiting for data...");
                    lock.wait(); // Wait until data is produced
                } catch (InterruptedException e) {
                    System.out.println("Consumer thread interrupted: " + e.getMessage());
                }
            }
            System.out.println("Data consumed!");
        }
    }

    public static void main(String[] args) {
        ThreadInteractionDemo interaction = new ThreadInteractionDemo();

        Thread producerThread = new Thread(interaction::produceData);
        Thread consumerThread = new Thread(interaction::consumeData);

        producerThread.start();
        consumerThread.start();
    }
}