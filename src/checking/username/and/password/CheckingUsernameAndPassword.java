/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checking.username.and.password;

import javax.swing.JOptionPane;

/**
 *
 * @author default
 */
public class CheckingUsernameAndPassword {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        boolean UsernameisCorrect = false;
        
        String username = null;
        
        while ( !UsernameisCorrect ){
             username = 
                JOptionPane.showInputDialog("Username");
        
        if (username.length() < 3) {
            JOptionPane.showMessageDialog
                    (null, "Username must be at least 3 characters.");
        }
        else
            UsernameisCorrect = true;
            
        }
            
       
        
        
        String password = 
                JOptionPane.showInputDialog("Password");
        
        if (
                username != null &&
                password != null &&
                (
                    (username.equals("bburd") &&
                    password.equals("swordfish")) ||
                    (username.equals("hritter") &&
                     password.equals("preakston"))
                    )
        )
        {
            JOptionPane.showMessageDialog(null, "You're In.");
        }
        
        
        else
        {
                JOptionPane.showMessageDialog
                        (null, "You're suspicious.");
                }
    }
    
}
