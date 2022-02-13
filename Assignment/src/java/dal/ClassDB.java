/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class ClassDB extends DBContext {

    public ArrayList<Class> getListClass(int gradeID) {
        String sql = "select classID, teacherID, Grade.GradeID\n"
                + "from Class inner join Grade on Class.GradeID = Grade.GradeID \n"
                + "where Grade.GradeID = ? ";
        PreparedStatement stm = new 
    }

}
