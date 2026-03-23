//local inner class are the ones that are defined inside a method or a scope block.
public class LocalClassDemo {
    public static void main(String[] args) {
        test();
    }

    static void test() {
        class localInner {
            private String str = "Local Inner String";
            void printStr() {
                System.out.println("The value of local inner str is: " + str);
            }
        }

        localInner i = new localInner();
        i.printStr();
    }
}