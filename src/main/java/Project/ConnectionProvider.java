package Project;
import java.sql.*;

public class ConnectionProvider {
    public static Connection getCon() {
        try {
            // This loads the driver you added in pom.xml
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // This connects to your 'bbms' database with username 'root' and no password
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bbms", "root", "");
            return con;
        } catch (Exception e) {
            return null;
        }
    }
}