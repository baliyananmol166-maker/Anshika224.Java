//thread is a lightweight process, it is a separarte path of execution, it is a unit of process, it is a part of process.
public class ThreadDemo {
    public static void main(String[] args) {
      ThreadExtendClass t = new ThreadExtendClass();
      t.start();

      ThreadImplementsRunnableClass r = new ThreadImplementsRunnableClass();
      Thread t2 = new Thread(r);
      t2.start();
      
    }
}
class ThreadExtendClass extends Thread {
    @Override
    public void run() {
        System.out.println("Thread extends example");
    }
} 
class ThreadImplementsRunnableClass implements  Runnable {
    @Override
    public void run() {
        System.out.println("Thread implements example");
    }
}