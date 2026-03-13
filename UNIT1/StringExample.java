public class StringExample {
    public static void main (String[] args) {
        String a = "Hello World";
        System.out.println("The length of the string is: " + a.length());
        System.out.println("The uppercase version of the string is: " + a.toUpperCase());
        System.out.println("The lowercase version of the string is: " + a.toLowerCase());

    // find the location of the any letter.
        System.out.println("The index of thhe letter 'o' is: " + a.indexOf('o'));
        System.out.println("The index of the letter 'l' is: " + a.charAt(4));

        String b = "  Hello World  ";
        //remove the space from the starting and ending of the string.
        System.out.println("String without spaces: " + b.trim());

        //check if two string is equal or not.
        System.out.println(a.equals(b));
       
    }
}