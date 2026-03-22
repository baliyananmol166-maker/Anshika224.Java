// multiple interface , a class can implement more than one interface.

//first interface
interface Printer {
    void print();
}
//second interface
interface Scanner {
    void scan();
}
// one class use two interface
class MultiFunctionMachine implements Printer, Scanner {
    @Override 
    public void print() {
        System.out.println("Printing...");
    }
    @Override
    public void scan() {
        System.out.println("Scanning...");
    }
}
//Main class
public class MultipleInterface {
    public static void main(String[] args) {
        MultiFunctionMachine machine = new MultiFunctionMachine();
        machine.print();
        machine.scan();
    }
}