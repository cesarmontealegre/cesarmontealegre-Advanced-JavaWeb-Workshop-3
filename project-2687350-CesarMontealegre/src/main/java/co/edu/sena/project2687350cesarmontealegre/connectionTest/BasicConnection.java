package co.edu.sena.project2687350cesarmontealegre.connectionTest;

import java.sql.*;

public class BasicConnection {

    public static void main(String[] args)
    {
        String url = "jdbc:mysql://localhost:3306/db_Myapp?serverTimezone=America/Bogota";

        String username = "adminCesar";
        String password = "gA1MxIFC#%A1M7SX53Bw!$&KpWC";
        String sql = null;
        Connection conn = null;
        Statement stm = null;
        ResultSet rs = null;
        try {
            sql = "SELECT * FROM db_myapp.users_tbl";
            conn = DriverManager.getConnection(url, username, password);
            stm = conn.createStatement();
            rs = stm.executeQuery(sql);

            while (rs.next()) {

                System.out.print(rs.getString("user_firstname"));
                System.out.print(" | ");
                System.out.println(rs.getString("user_lastname"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                stm.close();
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }// end try-catch
    } // main
} // BasicConnection