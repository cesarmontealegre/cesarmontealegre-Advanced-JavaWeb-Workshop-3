package co.edu.sena.project2687350cesarmontealegre.connectionTest;

import java.sql.*;

public class BasicConnectionSingleton {

    private static String url = "jdbc:mysql://localhost:3306/db_Myapp?serverTimezone=America/Bogota";
    private static String user = "adminCesar";
    private static String pass = "gA1MxIFC#%A1M7SX53Bw!$&KpWC";
    private static Connection conn;
    public static Connection getInstance()
            throws SQLException {
        if (conn == null) {
            conn = DriverManager.getConnection(url, user, pass);
        }
        return conn;
    }
} // BasicConnectionSingleton