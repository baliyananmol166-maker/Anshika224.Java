
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;


public class LibFunctions {

    public static void callIssueMenu() {
        System.out.println("Reached inside issue book menu");

        Scanner sc = new Scanner(System.in);
        int addStatus = 0;

        while (addStatus == 0) {
            try {
                Member m = new Member();
                Book b = new Book();

                System.out.print("Enter the member id: ");
                m.setMemberId(Integer.parseInt(sc.nextLine()));

                System.out.print("Enter the isbn code: ");
                b.setIsbnCode(sc.nextLine());

                issueBook(m, b);
                addStatus = 1;

            }
            catch (NumberFormatException e) {
                System.out.println("Invalid input. Enter numeric member ID.");
            }
        }
    }

    public static void issueBook(Member m, Book b) {
        Connection conn = null;

        try {
            conn = LibUtil.getConnection();
            conn.setAutoCommit(false); 

            // Check if already issued
            String checkQuery = "SELECT rec_id FROM member_book_record WHERE member_id=? AND isbn_code=? AND dor IS NULL";

            PreparedStatement checkStmt = conn.prepareStatement(checkQuery);
            checkStmt.setInt(1, m.getMemberId());
            checkStmt.setString(2, b.getIsbnCode());

            ResultSet rs = checkStmt.executeQuery();

            if (rs.next()) {
                System.out.println("The book is already issued.");
            } else {

                // Insert record
                String insertQuery = "INSERT INTO member_book_record VALUES (lib_seq.nextval, ?, ?, SYSDATE, NULL)";
                PreparedStatement insertStmt = conn.prepareStatement(insertQuery);

                insertStmt.setInt(1, m.getMemberId());
                insertStmt.setString(2, b.getIsbnCode());

                int k = insertStmt.executeUpdate();

                if (k > 0) {
                    // Update book count
                    String updateQuery = "UPDATE books SET units_available = units_available - 1 WHERE isbn_code = ?";
                    PreparedStatement updateStmt = conn.prepareStatement(updateQuery);
                    updateStmt.setString(1, b.getIsbnCode());

                    updateStmt.executeUpdate();

                    conn.commit();
                    System.out.println("The book is issued successfully");
                } else {
                    conn.rollback();
                }
            }

            conn.close();

        } catch (Exception e) {
            try {
                if (conn != null) conn.rollback();
            } catch (Exception ex) {
                System.out.println("An error occurred during rollback.");
            }
            System.out.println("An error occurred. Please try again.");
        }
    }

    public static void callReturnMenu() {
        System.out.println("Reached inside return book menu");

        Scanner sc = new Scanner(System.in);
        int addStatus = 0;

        while (addStatus == 0) {
            try {
                Member m = new Member();
                Book b = new Book();

                System.out.print("Enter the member id: ");
                m.setMemberId(Integer.parseInt(sc.nextLine()));

                System.out.print("Enter the isbn code: ");
                b.setIsbnCode(sc.nextLine());

                returnBook(m, b);
                addStatus = 1;

            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Enter numeric member ID.");
            } catch (Exception e) {
                System.out.println("An error occurred. Please try again.");
            }
        }
    }

    public static void returnBook(Member m, Book b) {
        Connection conn = null;

        try {
            conn = LibUtil.getConnection();
            conn.setAutoCommit(false); 

            // Check issued record
            String checkQuery = "SELECT rec_id FROM member_book_record WHERE member_id=? AND isbn_code=? AND dor IS NULL";

            PreparedStatement checkStmt = conn.prepareStatement(checkQuery);
            checkStmt.setInt(1, m.getMemberId());
            checkStmt.setString(2, b.getIsbnCode());

            ResultSet rs = checkStmt.executeQuery();

            if (rs.next()) {
                int recId = rs.getInt("rec_id");

                // Increase book count
                String updateBook = "UPDATE books SET units_available = units_available + 1 WHERE isbn_code = ?";
                PreparedStatement bookStmt = conn.prepareStatement(updateBook);
                bookStmt.setString(1, b.getIsbnCode());
                bookStmt.executeUpdate();

                // Update return date
                String updateRecord = "UPDATE member_book_record SET dor = SYSDATE WHERE rec_id = ?";
                PreparedStatement recStmt = conn.prepareStatement(updateRecord);
                recStmt.setInt(1, recId);
                recStmt.executeUpdate();

                conn.commit();
                System.out.println("The book is returned successfully");

            } else {
                System.out.println("This book is not issued for the user");
            }

            conn.close();

        } catch (Exception e) {
            try {
                if (conn != null) conn.rollback();
            } catch (Exception ex) {
                System.out.println("An error occurred during rollback.");
            }
            System.out.println("An error occurred. Please try again.");
        }
    
    }
}