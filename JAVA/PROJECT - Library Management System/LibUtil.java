import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import java.io.IOException;
import java.sql.SQLException;

public class LibUtil {
    public static Connection getConnection() {
        Connection conn = null;
        try {
            Properties prop = new Properties();
            FileInputStream in = new FileInputStream("DBProperties.txt");
            prop.load(in);

            String driverName = prop.getProperty("DBRriver");
            Class.forName(driverName);

            String dbName, user, password;
            dbName = prop.getProperty("DBName");
            user = prop.getProperty("User");
            password = prop.getProperty("Password");

            conn = DriverManager.getConnection(dbName, user, password);
            return conn;

        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("SQL Error: " + e.getMessage());
        }
        return conn;
    }
}