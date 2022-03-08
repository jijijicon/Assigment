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
import model.entity.Article;

/**
 *
 * @author ASUS
 */
public class ArticleDB extends DBContext {

    public ArrayList<Article> getArticles() {
        ArrayList<Article> arts = new ArrayList<>();
        try {
            String sql = "	SELECT [articleID]\n"
                    + "		  ,[title]\n"
                    + "		  ,[image]\n"
                    + "		  ,[content]\n"
                    + "		  ,[date]\n"
                    + "	  FROM [dbo].[Article]\n"
                    + "	  order by [articleID] desc";

            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Article a = new Article();
                a.setId(rs.getInt(1));
                a.setTitle(rs.getNString(2));
                a.setImage(rs.getString(3));
                a.setContent(rs.getNString(sql));
            }

        } catch (SQLException ex) {
            Logger.getLogger(ArticleDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arts;
    }

    public void insertArticle(Article art) {

        String sql = "INSERT INTO [Article]\n"
                + "           ([title]\n"
                + "           ,[image]\n"
                + "           ,[content]\n"
                + "           ,[date])\n"
                + "     VALUES\n"
                + "           (?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,GETDATE())";
        PreparedStatement stm = null;
        try {
            stm = connection.prepareStatement(sql);
            stm.setNString(1, art.getTitle());
            stm.setString(2, art.getImage());
            stm.setNString(3, art.getContent());

            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ArticleDB.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (stm != null) {
                try {
                    stm.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ArticleDB.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ArticleDB.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public Article getArticleById(int aid) {
        try {
            String sql = "SELECT [articleID]\n"
                    + "      ,[title]\n"
                    + "      ,[image]\n"
                    + "      ,[content]\n"
                    + "      ,[date]\n"
                    + "  FROM [dbo].[Article]\n"
                    + "  where articleID = ?";
            
            
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, aid);
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                Article art = new Article();
                art.setId(rs.getInt(1));
                art.setTitle(rs.getNString(2));
                art.setImage(rs.getString(3));
                art.setContent(rs.getNString(4));
                art.setDate(rs.getDate(5));
                return art;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ArticleDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
