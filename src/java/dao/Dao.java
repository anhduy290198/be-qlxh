package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dao {

    private static final String HOSTNAME = "127.0.0.1";
    private static final String DBNAME = "quanlyxuathang";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "1234";
    public static Connection con;

    public Dao() {
        if (con == null) {
            String dbUrl = "jdbc:mysql://" + HOSTNAME + ":3306/" + DBNAME + "?autoReconnect=true&useSSL=false";
            String dbClass = "com.mysql.jdbc.Driver";

            try {
                Class.forName(dbClass);
                con = DriverManager.getConnection(dbUrl, USERNAME, PASSWORD);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
