package CONNECTOR;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnect {
    
    // Static method to establish a database connection
    public static Connection connect() {
        // Path to the SQLite database file
        String url = "jdbc:sqlite:C:\\Users\\User\\Desktop\\ECommerce\\Admin"; // update path if it's elsewhere

        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
            System.out.println("Connection to SQLite has been established.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    // Main method to test the connection
    public static void main(String[] args) {
        connect(); // Test the connection
    }

}