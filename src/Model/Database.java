/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author armic
 */
public class Database {
//    static final String DB_URL = "jdbc:mysql://4.193.154.78:3306/healminder";
    static final String DB_URL = "jdbc:mysql://4.193.154.78:3306/healminder";
    static final String DB_USER = "root";
    static final String DB_PASS = "9&#!^bhbsa*dbahju^^hj1@";
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;

    public Database() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            stmt = conn.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "" + e.getMessage(), "Connection Error", JOptionPane.WARNING_MESSAGE);
        }
    }

    public ResultSet getData(String SQLString) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            stmt = conn.createStatement();
            System.out.println("SQlSTRING: " + SQLString);
            rs = stmt.executeQuery(SQLString);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error :" + e.getMessage(), "Communication Error", JOptionPane.WARNING_MESSAGE);
        }
        return rs;
    }

    public void query(String SQLString) {
        try {
            stmt.executeUpdate(SQLString);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error :" + e.getMessage(), "Communication Error", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void close() {
        try {
            if (rs != null) {
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Ganti ini dengan penanganan kesalahan yang sesuai untuk aplikasi Anda
        }
    }

    public Connection getConnection() {
        return conn;
    }
}
