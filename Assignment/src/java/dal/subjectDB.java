/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.entity.Subject;

/**
 *
 * @author ASUS
 */
public class subjectDB extends DBContext{
    public ArrayList<Subject> listSubject(){
        ArrayList<Subject> subjects = new ArrayList<>();
        try {
            String sql = "select * from Subject";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                Subject sub = new Subject();
                sub.setSubjectID(rs.getString(1));
                sub.setSubjectName(rs.getNString(2));
                subjects.add(sub);
            }
        } catch (SQLException ex) {
            Logger.getLogger(subjectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return subjects;
    }
}
