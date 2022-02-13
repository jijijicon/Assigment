/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.account.ParentAccount;

/**
 *
 * @author ASUS
 */
public class ParentAccountDB extends DBContext {

    public ParentAccount getPA(String username, String password) {
        try {
            String sql = "SELECT [username]\n"
                    + "      ,[password]\n"
                    + "      ,[studentID]\n"
                    + "      ,[email]\n"
                    + "  FROM [dbo].[ParentAccount]\n"
                    + "  where username = ? and password = ? ";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, username);
            stm.setString(2, password);
            ResultSet rs = stm.executeQuery();
            
            if(rs.next()){
                ParentAccount acc  = new ParentAccount();
                acc.setUsername(rs.getString(1));
               acc.setPassword(rs.getString(2));
               acc.setStudentID(rs.getString(3));
               acc.setEmail(rs.getString(4));
               return acc;
               
            }
        } catch (SQLException ex) {
            Logger.getLogger(ParentAccountDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
