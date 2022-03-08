/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Login.BaseAuthController;
import dal.ClassDB;
import dal.FeatureDB;
import dal.GradeDB;
import dal.AccountDB;
import dal.StudentDB;
import dal.subjectDB;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.account.Feature;
import model.account.ParentAccount;
import model.account.ParentFeature;
import model.entity.Grade;
import model.entity.ClassStudent;
import model.entity.Mark;
import model.entity.Student;
import model.entity.Subject;

/**
 *
 * @author ASUS
 */
public class InsertStudentControll extends BaseAuthController {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void processGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        ClassDB cdb = new ClassDB();
        ArrayList<ClassStudent> classes = cdb.getListClass(-1);

        request.setAttribute("classes", classes);

        request.getRequestDispatcher("../view/student/insert.jsp").forward(request, response);
    }

    @Override
    protected void processPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        Student st = new Student();

        boolean gender = request.getParameter("gender").equals("boy");
        st.setStudentID(request.getParameter("studentid"));
        st.setFirstname(request.getParameter("firstname"));
        st.setLastname(request.getParameter("lastname"));
        st.setGender(gender);
        st.setDob(Date.valueOf(request.getParameter("dob")));
        st.setAdress(request.getParameter("adress"));

        ClassStudent cl = new ClassStudent();
        cl.setClassID(request.getParameter("classid"));

        st.setClassID(cl);

        st.setPhoto(request.getParameter("photo"));
        StudentDB stdb = new StudentDB();

        subjectDB sjdb = new subjectDB();
        ArrayList<Subject> subjects = sjdb.listSubjectInClass(st.getClassID().getClassID());

        for (Subject sj : subjects) {
            Mark m = new Mark();
            m.setSubjectid(sj);
            m.setStudentid(st);
            st.getMarks().add(m);
           
        }
        
//        for (int i=0;i<st.getMarks().size();i++){
//            System.out.println(st.getMarks().get(i).getSubjectid().getSubjectName());
//        }
        
        
        
        ParentAccount pa = new ParentAccount();
        pa.setUsername(st.getStudentID());
        pa.setStudentID(st);
        pa.setPassword("123a123a");
        
        FeatureDB fdb = new FeatureDB();
        ArrayList<Feature> features = fdb.getFeatures();
        for (Feature f : features) {
            ParentFeature pf = new ParentFeature();
            pf.setUsername(pa);
            pf.setFid(f);
            pa.getFeatures().add(pf);
        }
        
        AccountDB  padb = new AccountDB();
        stdb.insertStudent(st);
        padb.insertAccountParent(pa);
        
        response.sendRedirect("../student/search");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
