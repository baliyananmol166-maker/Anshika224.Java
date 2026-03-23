//another example of thread priority
public class ThreadPriorityDemo2 {
    public static void main(String[] args) {
        ThreadPriorityClass t1 = new ThreadPriorityClass(1);//it means minimum priority
        t1.setName("First thread");
        t1.start();

        ThreadPriorityClass t2 = new ThreadPriorityClass(5);//it means normal priority
        t2.setName("Second thread");
        t2.start();

        ThreadPriorityClass t3 = new ThreadPriorityClass(10);//it means maximum priority
        t3.setName("Third thread");
        t3.start();
    }
}
class ThreadPriorityClass extends Thread {
    final int priority;

    public ThreadPriorityClass(int priority) {
        this.priority = priority;
    }

    @Override
    public void run() {
        Thread.currentThread().setPriority(priority);
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running with priority: " + Thread.currentThread().getPriority());
        }
    }
}