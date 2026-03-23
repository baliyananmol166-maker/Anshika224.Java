//another example of thread interaction using wait and notify methods.
import java.util.LinkedList;

public class ThreadInteractionDemo2 {
    public static void main(String args[]) {
        LinkedList<Integer> sharedResource = new LinkedList<>();

        Producer p = new Producer(sharedResource);
        Consumer c = new Consumer(sharedResource, "c");
        Consumer c2 = new Consumer(sharedResource, "c2");

        p.start();
        c.start();
        c2.start();
    }
}

class Producer extends Thread {
    private final LinkedList<Integer> sharedResource;

    Producer(LinkedList<Integer> sharedResource) {
        super("Producer");
        this.sharedResource = sharedResource;
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            synchronized (sharedResource) {

                while (!sharedResource.isEmpty()) {
                    try {
                        System.out.println("Producer waiting (list not empty)");
                        sharedResource.wait();
                    } catch (InterruptedException ioe) {
                        System.err.println("Exception in producer");
                    }
                }

                System.out.println("Producer adding " + i + " and " + (i + 1));
                sharedResource.add(i);
                sharedResource.add(i + 1);

                sharedResource.notifyAll();
            }
        }
    }
}

class Consumer extends Thread {
    private final LinkedList<Integer> sharedResource;

    Consumer(LinkedList<Integer> sharedResource, String name) {
        super("Consumer " + name);
        this.sharedResource = sharedResource;
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            synchronized (sharedResource) {

                while (sharedResource.isEmpty()) {
                    try {
                        System.out.println(getName() + " waiting (list empty)");
                        sharedResource.wait();
                    } catch (InterruptedException ioe) {
                        System.err.println("Exception in consumer");
                    }
                }

                sharedResource.remove();
                System.out.println("Removed by " + getName());

                try {
                    Thread.sleep(200); 
                } catch (InterruptedException ioe) {
                    System.err.println("Exception in sleep");
                }

                sharedResource.notifyAll(); // safer than notify()
            }
        }
    }
}