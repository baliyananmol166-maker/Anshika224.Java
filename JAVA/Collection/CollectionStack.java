//stack is a method of collection framework which is used to store the data in last in first out manner.
//it is a class that extends vector class and provides the functionality of stack data structure.
import java.util.Stack;
public class CollectionStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Anshika");
        stack.push("Rohit");
        stack.push("Pooja");
        stack.push("Satyam");
        System.out.println("The value of stack is: " +stack);
        //print the top element of stack
        System.out.println("The top element of stack is: " +stack.peek());
        //print the size of stack
        System.out.println("The size of stack is: " +stack.size());
        //remove the top element of stack
        stack.pop();
        System.out.println("The value of stack after removing the top element is: " +stack);
        //add an element to stack
        stack.push("Rahul");
        System.out.println("The value of stack after adding an element is: " +stack);
        //clear the stack
        stack.clear();
        System.out.println("The value of stack after clearing is: " +stack);
        System.out.println("The size of stack after clearing is: " +stack.size());
    }
}