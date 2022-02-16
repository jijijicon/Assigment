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
import model.entity.ClassStudent;
import model.entity.Grade;

/**
 *
 * @author ASUS
 */
public class ClassDB extends DBContext {

    public ArrayList<ClassStudent> getListClass(int gradeID) {
        ArrayList<ClassStudent> classes = new ArrayList<>();
        try {
            String sql = "select classID, teacherID, Grade.GradeID\n"
                    + "from Class inner join Grade on Class.GradeID = Grade.GradeID \n";

            if (gradeID > -1) {
                sql += " where Grade.GradeID = ? ";
            }
            PreparedStatement stm = connection.prepareStatement(sql);
            if (gradeID > -1) {
                stm.setInt(1, gradeID);
            }
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                ClassStudent c = new ClassStudent();
                c.setClassID(rs.getString("classID"));
                c.setTeacherID(rs.getString("teacherID"));
                Grade gr = new Grade(rs.getInt("GradeID"));
                c.setGradeID(gr);
                classes.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClassDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return classes;
    }
    
    
}
