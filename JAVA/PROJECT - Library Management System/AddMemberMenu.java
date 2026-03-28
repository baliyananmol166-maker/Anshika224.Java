import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class AddMemberMenu {

    public static void addMemberMenu() {
        System.out.println("Reached the add member menu");

        Scanner sc = new Scanner(System.in);
        int addStatus = 0;

        while (addStatus == 0) {
            try {
                Member m = new Member();

                System.out.print("Enter the member id: ");
                m.setMemberId(Integer.parseInt(sc.nextLine()));

                System.out.print("Enter the member name: ");
                m.setMemberName(sc.nextLine());

                addMember(m);
                addStatus = 1;

            } catch (NumberFormatException e) {
                System.out.println("Invalid ID. Please enter a number.");
            } catch (Exception e) {
                System.out.println("An error occurred while adding the member. Please try again.");
            }
        }
    }

    public static void addMember(Member m) {
        System.out.println("Reached inside add member for member " + m.getMemberId());

        try (Connection conn = LibUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(
                     "INSERT INTO members (member_id, member_name, join_date) VALUES (?, ?, SYSDATE)")) {

            pstmt.setInt(1, m.getMemberId());
            pstmt.setString(2, m.getMemberName());

            int k = pstmt.executeUpdate();

            if (k > 0) {
                System.out.println("Added Member successfully");
                conn.commit();
            } else {
                conn.rollback();
            }

        } catch (Exception e) {
           System.out.println("An error occurred while adding the member: " + e.getMessage());
        }
    }
}