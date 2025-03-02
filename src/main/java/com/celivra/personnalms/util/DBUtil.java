package com.celivra.personnalms.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    public static Connection getConnection() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String url = "jdbc:mysql://localhost:3306/PMS?allowPublicKeyRetrieval=true&useSSL=false";
        String user = "root";
        String password = "940727";
        Connection connection = null;
        try{
            connection = DriverManager.getConnection(url, user, password);
        }catch (SQLException e){
            e.printStackTrace();
        }
        return connection;
    }
}
