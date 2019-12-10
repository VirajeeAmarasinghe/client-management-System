/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import Business.Client;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author icbt
 */
public class ClientDB {

    /*
     This method is for inserting new client data to the database
     First it checks whether the entered client id is already available in the db or not
     If it is not avaiable, then only new data is added to the db.
    */
    public static int addClient(Client c) throws SQLException {
        int result = 0;
        Connection con = DataConnect.getConnection();
        String selectQuery = "select * from Client where client_id=?";
        PreparedStatement pr = con.prepareStatement(selectQuery);
        pr.setInt(1, c.getClientID());
        ResultSet r = pr.executeQuery();
        //check whether the entered id is already available or not
        if (r.next()) {
            return 2;
        } else {
            String query = "insert into Client(client_id,client_name,add_no,add_street,add_city,nic,tele,email)Values(?,?,?,?,?,?,?,?)";
            PreparedStatement p = con.prepareStatement(query);
            p.setInt(1, c.getClientID());
            p.setString(2, c.getClientName());
            p.setString(3, c.getAddNo());
            p.setString(4, c.getAddStreet());
            p.setString(5, c.getAddCity());
            p.setString(6, c.getNic());
            p.setString(7, c.getTele());
            p.setString(8, c.getEmail());
            result = p.executeUpdate();
            p.close();
        }
        pr.close();
        con.close();
        return result;
    }

    public static Client getClient(int clientID) throws SQLException {
        Client c = null;
        String selectSt = "select * from Client where client_id=?";
        Connection con = DataConnect.getConnection();
        PreparedStatement ps = con.prepareStatement(selectSt);
        ps.setInt(1, clientID);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            int clID = rs.getInt("client_id");
            String cName = rs.getString("client_name");
            String addNo = rs.getString("add_no");
            String addStreet = rs.getString("add_street");
            String addCity = rs.getString("add_city");
            String nic = rs.getString("nic");
            String tele = rs.getString("tele");
            String email = rs.getString("email");
            c = new Client(clID, cName, addNo, addStreet, addCity, nic, tele, email);
        }
        rs.close();
        ps.close();
        return c;
    }
    
    public static ArrayList<Client> getAllClients() throws SQLException {
        ArrayList<Client> clientList = new ArrayList<>();
        Connection con = DataConnect.getConnection();
        String query = "select * from Client";
        PreparedStatement ps = con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            int clID = rs.getInt("client_id");
            String cName = rs.getString("client_name");
            String addNo = rs.getString("add_no");
            String addStreet = rs.getString("add_street");
            String addCity = rs.getString("add_city");
            String nic = rs.getString("nic");
            String tele = rs.getString("tele");
            String email = rs.getString("email");
            Client c = new Client(clID, cName, addNo, addStreet, addCity, nic, tele, email);
            clientList.add(c);
        }
        rs.close();
        ps.close();
        return clientList;
    }
    
    
}
