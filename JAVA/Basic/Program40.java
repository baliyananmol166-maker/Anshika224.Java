//string builder class in java...
public class Program40 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("This is the program of java language.");
        System.out.println("The string builder is: " + sb);

        //append method in string builder class...
        sb.append(" It is very useful for string manipulation.");
        System.out.println("After appending the string: " + sb);

        //insert method in string builder class...
        sb.insert(5, "code ");
        System.out.println("After inserting the string: " + sb);

        //replace method in string builder class...
        sb.replace(0, 4, "This is a");
        System.out.println("After replacing the string: " + sb);

        //delete method in string builder class...
        sb.delete(0, 4);
        System.out.println("After deleting the string: " + sb);

        //reverse method in string builder class...
        sb.reverse();
        System.out.println("After reversing the string: " + sb);
    }
}