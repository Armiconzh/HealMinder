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
public class LoginModel {
    Database database = new Database();
            
    public User login(String username, String password) throws SQLException {
        System.out.println("USERNAME: " + username);
        String sqlstring = "SELECT * FROM USER ";
//        Statement statement;
//        ResultSet otherResult = statement.executeQuery(sqlstring);

        User user = new User();

        ResultSet rs = database.getData(sqlstring);
        while(rs.next()) {
            user.setEmail(rs.getString(1));
            user.setUsername(rs.getString(2));
            user.setPassword(rs.getString(3));
            return user;
        }
        
        return null;
//        PreparedStatement stmt;
//        stmt = database.conn.prepareStatement(sqlstring);
//        stmt.setString(1, username);
//        stmt.setString(2, password);
//        stmt.executeUpdate();
}
}