/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DaftarModel;
import Model.User;
import View.Dashboard;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author HP
 */
public class DaftarController {

    DaftarModel daftarModel = new DaftarModel() {
        @Override
        public User login(String username, String password) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };
    public boolean isDaftarValid(String email, String username, String password) {                                    
        // Check if any of the fields is empty
        return (email.isEmpty() || username.isEmpty() || password.isEmpty());
    }
    
    public void daftar(String email, String username, String password) throws SQLException {
        daftarModel.daftar(email, username, password);
    }
}
