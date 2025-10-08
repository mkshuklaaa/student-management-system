package com.student;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    static Connection con;

    public static Connection getConnection() {
        try {
            if (con == null) {
                String url = "jdbc:mysql://localhost:3306/studentdb";
                String user = "root"; // change if needed
                String pass = "0583"; // change to your MySQL password
                con = DriverManager.getConnection(url, user, pass);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
