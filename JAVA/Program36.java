// another example of string demo in java...
public class Program36 {
    public static void main(String[] args) {
        String s1 = "Hello world";
        String s2 = "Hello world";
        
        s1 = s1 + s2;
        Runtime r = Runtime.getRuntime();
        System.gc(); // requesting JVM to run Garbage Collector
        System.out.println("Total memory before starting is :" + (r.totalMemory()/(1024*1024)));
        System.out.println("Free memory before starting is :" + (r.freeMemory()/(1024*1024)));

        System.out.println("The new value of s1 is :" + s1);
        

    }
}