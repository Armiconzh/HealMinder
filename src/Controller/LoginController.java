/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.LoginModel;
import Model.User;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class LoginController {
    LoginModel loginModel = new LoginModel() {
        @Override
        public void daftar(String email, String username, String password) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };
    
    public User login(String username, String password) throws SQLException{
        return loginModel.login(username, password);
    }
}
