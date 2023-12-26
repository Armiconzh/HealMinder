/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import Model.Database;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class DaftarModel {
    Database database = new Database();
    
    String sqlstring = "INSERT INTO user values (?,?,?)";
        
    public void daftar(String email, String username, String password) throws SQLException {
//        ResultSet rs = database.getData(sqlstring);
//        System.out.println(rs);
        
        PreparedStatement stmt;
        stmt = database.conn.prepareStatement(sqlstring);
        stmt.setString(1, email);
        stmt.setString(2, username);
        stmt.setString(3, password);
        stmt.executeUpdate();

    }
}
