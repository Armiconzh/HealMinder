/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import javax.swing.DefaultListModel;

/**
 *
 * @author Raffy
 */
public interface AlarmController {
    
    DefaultListModel<String> getListModel() throws Exception;
    
}
