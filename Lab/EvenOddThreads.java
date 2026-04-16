//Anshika
//2400320100224
class EvenThread extends Thread {
    @Override
    public void run() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println("Even: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
class OddThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 19; i += 2) {
            System.out.println("Odd: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
public class EvenOddThreads {
    public static void main(String[] args) {
        EvenThread even = new EvenThread();
        OddThread odd = new OddThread();
        even.start();
        odd.start();
    }
}