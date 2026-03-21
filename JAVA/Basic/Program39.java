//print the substring of string from any index using substring() method in java...
public class Program39 {
    public static void main(String[] args) {
        String s1 = "This is the program of java language.";
        System.out.println("The substring of string s1 :" + s1.substring(5));
        System.out.println("The another substring of strinng s1 : " + s1.substring(0, 19));

        //use split method for splitting the string into words...
        String[] s = s1.split (" ");
        for (String str : s) {
            System.out.println("str is: " + str);
        }

    }
}