package DBConnection;

import static com.swak.OS.java;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseConnection {

    public static Connection connectDB() {
        String mysqlUrl = "jdbc:mysql://localhost:3306/attendancedb";
        String user = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(mysqlUrl, user, password);
            System.out.println("Connected to MySQL database!");
            return conn;
        } catch (SQLException e) {
            System.out.println("MySQL connection failed! Trying MS Access...");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }
}
