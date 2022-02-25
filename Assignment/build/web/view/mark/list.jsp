<%-- 
    Document   : list
    Created on : Feb 22, 2022, 10:04:00 PM
    Author     : ASUS
--%>

<%@page import="model.entity.Mark"%>
<%@page import="model.entity.Student"%>
<%@page import="model.entity.Subject"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%
            ArrayList<Student> students = (ArrayList<Student>) request.getAttribute("students");
            ArrayList<Subject> subjects = (ArrayList<Subject>) request.getAttribute("subjects");
            ArrayList<Mark> marks = (ArrayList<Mark>) request.getAttribute("marks");
        %>
    </head>
    <body>
        <% 
                for (int j = 0; j < students.size(); j++) {
        %>
        <h1> <%= students.get(j).getMarks().get(1).getSubjectid().getSubjectID() %> </h1>
        <%
                }
        %>
    </body>
</html>
