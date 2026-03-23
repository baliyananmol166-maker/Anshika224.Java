// this proram is to show how to create thread by extending Thread class.
public class ThreadDemo2 {
    public static void main(String[] args) {
      ThreadExtendClass t1 = new ThreadExtendClass();
      t1.setName("First thread");
      t1.start();

      ThreadExtendClass t2 = new ThreadExtendClass();
      t2.setName("Second thread");
      t2.start();

      ThreadExtendClass t3 = new ThreadExtendClass();
      t3.setName("Third thread");
      t3.start();
      
    }
}
class ThreadExtendClass extends Thread {
    @Override
    public void run() {
        //if we want to run this thread five times then we can use for loop.
        for(int i=0; i<=5; i++){
            System.out.println("For iteration i :: " + i + " :: Thread extends example and thread name is: " + Thread.currentThread().getName());
        }
        
    }
} 
