/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DB;

import Business.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Virajee
 */
public class LoginDB {
    public static Login getLoginInfo(String userName) throws SQLException {
        Login login =null;
        String selectSt = "select user_id,password,user_level from Login where user_id=?";
        Connection con = DataConnect.getConnection();
        PreparedStatement ps = con.prepareStatement(selectSt);
        ps.setString(1,userName);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            String username = rs.getString("user_id");
            String password=rs.getString("password");
            String userLevel=rs.getString("user_level");
            login=new Login(username, password, userLevel);
        }
        rs.close();
        ps.close();
        return login;
    }
}
