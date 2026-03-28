import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class LibUtil {
    public static Connection getConnection() {
        Connection conn = null;

        try (FileInputStream in = new FileInputStream("DBProperties.txt")) {
            Properties prop = new Properties();
            prop.load(in);

            String driverName = prop.getProperty("DBDriver");
            String dbName = prop.getProperty("DBName");
            String user = prop.getProperty("User");
            String password = prop.getProperty("Password");

            if (driverName == null || dbName == null || user == null || password == null) {
                throw new RuntimeException("One or more DB properties are missing!");
            }

            Class.forName(driverName);
            conn = DriverManager.getConnection(dbName, user, password);
            System.out.println("Database connected successfully!");

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