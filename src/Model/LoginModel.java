/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author HP
 */
public abstract class LoginModel implements signable {
    Database database = new Database();
            
    @Override
    public User login(String username, String password) {
    try {
        System.out.println("USERNAME: " + username);
        String sqlstring = "SELECT * FROM USER WHERE username = '" + username + "'";

        User user = new User();

        ResultSet rs = database.getData(sqlstring);
        while (rs.next()) {
            user.setEmail(rs.getString(1));
            user.setUsername(rs.getString(2));
            user.setPassword(rs.getString(3));
            return user;
        }

        return null;
    } catch (SQLException e) {
        // Handle any SQLException that might occur during database operations
        e.printStackTrace(); // You can replace this with logging or other error handling mechanisms
        return null; // Or throw a custom exception, log the error, or handle it as needed
    }
}

}