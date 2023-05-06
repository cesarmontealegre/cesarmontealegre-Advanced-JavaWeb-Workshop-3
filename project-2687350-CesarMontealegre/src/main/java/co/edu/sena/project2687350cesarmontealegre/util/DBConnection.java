package co.edu.sena.project2687350cesarmontealegre.util;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.*;

public class DBConnection {
    private static final String URL =
            "jdbc:mysql://localhost:3306/db_Myapp?serverTimezone=America/Bogota";
    private static final String USER =
            "adminCesar";
    private  static final String PASS =
            "gA1MxIFC#%A1M7SX53Bw!$&KpWC";
    private static BasicDataSource pool;
    public static BasicDataSource getInstance() throws SQLException {
        if (pool == null) {
            pool = new BasicDataSource();
            pool.setUrl(URL);
            pool.setUsername(USER);
            pool.setPassword(PASS);

            pool.setInitialSize(3);
            pool.setMinIdle(3);
            pool.setMaxIdle(8);
            pool.setMaxTotal(8);
        }
        return pool;
    }// getConnectionToDatabase
    public static Connection getConnection() throws  SQLException {
        return  getInstance().getConnection();
    }
}
