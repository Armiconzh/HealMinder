/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public abstract class DaftarModel implements signable {
    Database database = new Database();
    
    public void daftar(String email, String username, String password) {
        String sqlstring = "INSERT INTO USER (email, username, password) values (?, ?, ?)";
        try (PreparedStatement preparedStatement = database.getConnection().prepareStatement(sqlstring)) {
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, username);
            preparedStatement.setString(3, password);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(); // Atau lakukan penanganan eksepsi yang sesuai
        }
    }

}
