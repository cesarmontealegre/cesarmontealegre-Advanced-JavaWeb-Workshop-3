package co.edu.sena.project2687350cesarmontealegre.connectionTest;

import org.apache.commons.dbcp2.BasicDataSource;
import java.sql.*;

public class ConnectionPool {
    private static String url = "jdbc:mysql://localhost:3306/db_Myapp?serverTimezone=America/Bogota";
    private static String user = "adminCesar";
    private static String pass = "gA1MxIFC#%A1M7SX53Bw!$&KpWC";
    private static BasicDataSource pool;
    public static BasicDataSource
    getInstance() throws SQLException {
        if (pool == null) {
            pool = new BasicDataSource();
            pool.setUrl(url);
            pool.setUsername(user);
            pool.setPassword(pass);
            pool.setInitialSize(5);
            pool.setMinIdle(5);
            pool.setMaxIdle(10);
            pool.setMaxTotal(10);
        }
        return pool;
    }
    public static Connection getConnection()
            throws SQLException{
        return getInstance().getConnection();
    }
} // ConnectionPool