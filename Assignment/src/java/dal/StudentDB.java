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
import model.entity.Student;

/**
 *
 * @author ASUS
 */
public class StudentDB extends DBContext {

    public ArrayList<Student> getListStudent(String classID) {
        ArrayList<Student> students = new ArrayList<>();
        try {
            String sql = " select studentID, firstName, lastName , gender , dob, photo, Class.classID, teacherID, GradeID\n" +
"                    from Student inner join Class on Student.classID = Class.classID\n" +
"                    where class.classID = ?\n" +
"					order by firstName";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, classID);
            ResultSet rs = stm .executeQuery();
            while (rs.next()){
                Student st = new Student();
                st.setStudentID(rs.getString(1));
                st.setFirstname(rs.getNString(2));
                st.setLastname(rs.getNString(3));
                st.setGender(rs.getBoolean(4));
                st.setDob(rs.getDate(5));
                st.setPhoto(rs.getString(6));
                
                
                ClassStudent c  = new ClassStudent();
                c.setClassID(rs.getString(7));
                c.setTeacherID(rs.getString(8));
                
                Grade d = new Grade(rs.getInt(9));
                c.setGradeID(d);
                
                st.setClassID(c);
                
                students.add(st);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return students;
    }
}
