// also print the total and free memory after finishing the program...
public class Program37 {
    public static void main(String[] args) {
        String s1 = "Hello world";
        String s2 = "Hello world";
    
        Runtime r = Runtime.getRuntime();
        System.gc(); // requesting JVM to run Garbage Collector
        System.out.println("Total memory before starting is :" + (r.totalMemory()/(1024*1024)));
        System.out.println("Free memory before starting is :" + (r.freeMemory()/(1024*1024)));
        System.out.println("Used memory before starting is :" + (r.totalMemory() - r.freeMemory())/(1024*1024));


        for (int i=0; i<50000; i++) {
            s1 = s1 + s2;
        }

        System.out.println("Total memory after finishing is :" + (r.totalMemory()/(1024*1024)));
        System.out.println("Free memory after finishing is :" + (r.freeMemory()/(1024*1024)));
        System.out.println("Used memory after finishing is :" + (r.totalMemory() - r.freeMemory())/(1024*1024));
        System.gc();

    }
}