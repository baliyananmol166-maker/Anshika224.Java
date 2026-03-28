import java.util.Scanner;
import java.sql.Connection;
import java.sql.Statement;


public class AddBookMenu {
    public static void addBookMenu() {
        System.out.println("Reached add book menu.");
        Book b = new Book();
        Scanner sc = new Scanner(System.in);
        int addStatus = 0;

        while (addStatus == 0) {
          try {
            System.out.println("Enter the ISBN code of the book:");
            b.setIsbnCode(sc.nextLine());
            System.out.println("Enter the name of the book:");
            b.setBookName(sc.nextLine());
            System.out.println("Enter the description of the book:");
            b.setBookDesc(sc.nextLine());
            System.out.println("Enter the name of the author:");
            b.setAuthorName(sc.nextLine());
            System.out.println("Enter the subject name of the book:");
            b.setSubjectName(sc.nextLine());
            System.out.println("Enter the number of units available:");
            b.setUnitsAvailable(sc.nextInt());
            sc.nextLine();
          
            addBook(b);
            addStatus = 1;
           } 
           catch (NumberFormatException e) {
           System.out.println("Invalid input for number of units. Please enter a valid integer.");
           addStatus = 0;
           }
        }
    }
    public static void addBook(Book b) {
        System.out.println("Reached inside addBook for book" + b.getIsbnCode());
        Connection conn = LibUtil.getConnection();
        try {
            Statement stmt = conn.createStatement();
            int k = stmt.executeUpdate("insert int book values ('" + b.getIsbnCode() + "','" + b.getBookName() + "','" + b.getBookDesc() + "','" + b.getAuthorName() + "','" + b.getSubjectName() + "'," + b.getUnitsAvailable() + ")");
            if(k >0) {
                System.out.println("Added Book successfully");
                conn.commit();
            }else {
                conn.rollback();
            }
            conn.close();
        } 
        catch (java.sql.SQLException | NullPointerException e) {
            System.out.println("Error while adding book: " + e.getMessage());
        }
        
    }
}
