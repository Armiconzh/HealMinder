/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author armic
 */
public interface signable {
    public void daftar(String email, String username, String password);
    public User login(String username, String password);
    
}
