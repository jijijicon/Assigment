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
import model.entity.Comment;
import model.entity.Student;

/**
 *
 * @author ASUS
 */
public class CommentDB extends DBContext {

    public void insertComment(Comment cmt) {
        String sql = "INSERT INTO [dbo].[Comment]\n"
                + "           ([studentID]\n"
                + "           ,[comment]\n"
                + "           ,[teacher]\n"
                + "           ,[date])\n"
                + "     VALUES\n"
                + "           (?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,GETDATE()) ";
        PreparedStatement stm = null;
        try {
            stm = connection.prepareStatement(sql);
            stm.setString(1, cmt.getStudentid().getStudentID());
            stm.setString(2, cmt.getContent());
            stm.setBoolean(3, cmt.isTeacher());

            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CommentDB.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (stm != null) {
                try {
                    stm.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CommentDB.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CommentDB.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public ArrayList<Comment> getComment(String sid) {
        ArrayList<Comment> cmts = new ArrayList<>();
        try {
            String sql = "SELECT [cid]\n"
                    + "      ,[studentID]\n"
                    + "      ,[comment]\n"
                    + "      ,[teacher]\n"
                    + "      ,[date]\n"
                    + "  FROM [Comment] where [studentID] = ?  order by cid desc";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, sid);
            
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                Comment cmt = new Comment();
                
                cmt.setCid(rs.getInt(1));
                
                Student s = new Student();
                s.setStudentID(rs.getString(2));
                
                cmt.setStudentid(s);
                cmt.setContent(rs.getNString(3));
                cmt.setTeacher(rs.getBoolean(4));
                cmt.setDate(rs.getDate(5));
                cmts.add(cmt);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CommentDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cmts;
    }
}
