/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business;

/**
 *
 * @author Virajee
 */
public class Login {
    private String username;
    private String password;
    private String userLevel;

    public Login() {
    }   

    public Login(String username, String password, String userLevel) {
        this.username = username;
        this.password = password;
        this.userLevel = userLevel;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserLevel(String userLevel) {
        this.userLevel = userLevel;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getUserLevel() {
        return userLevel;
    }    
    
}
