// string buffer class in java..
public class Program41 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("This is the program of java language.");
        System.out.println("The string buffer is: " + sb);

        //append method in string buffer class...
        sb.append("It is very useful for string manipulation.");
        System.out.println("After appending the string: " + sb);

        //insert method in string buffer class..
        sb.insert(5, "code ");
        System.out.println("After inserting the string: " + sb);

        //replace method in string buffer class..
        sb.replace(0, 4, "This is a");
        System.out.println("After replacing the string: " + sb);

        //delete method in string buffer class..
        sb.delete(0, 4);
        System.out.println("After deleting the string: " + sb);

        //reverse method in string buffer class..
        sb.reverse();
        System.out.println("After reversing the string: " + sb);
    }
}