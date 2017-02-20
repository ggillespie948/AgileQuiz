/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agilequiz.stores;

/**
 *
 * @author gary-
 */
public class LoggedIn {
    boolean loggedIn = false;
    String username = null;
    
    public void LoggedIn(){
        
    }
    
    public void setLoggedIn(){
        this.loggedIn = true;
    }
    
    public void setLoggedOut(){
        this.loggedIn = false;
    }
    
}
