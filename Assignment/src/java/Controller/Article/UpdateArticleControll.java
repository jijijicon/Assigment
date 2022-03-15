/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Article;

import dal.ArticleDB;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.entity.Article;

/**
 *
 * @author ASUS
 */
public class UpdateArticleControll extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        
        
        
        int id = Integer.parseInt(request.getParameter("aid"));
        ArticleDB db = new ArticleDB();
        Article art = db.getArticleById(id);

        request.setAttribute("art", art);
        request.getRequestDispatcher("../view/article/update.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        int id = Integer.parseInt(request.getParameter("aid"));

        String title = request.getParameter("title");
        String content = request.getParameter("content");
        String photo = request.getParameter("photo");

        if (photo == null || photo.trim().length() == 0) {
            photo = "0";
        }

        Article art = new Article();
        art.setId(id);
        art.setTitle(title);
        art.setContent(content);
        art.setImage(photo);

        ArticleDB db = new ArticleDB();

        db.update(art);

        response.sendRedirect("detail?aid=" + art.getId());
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
