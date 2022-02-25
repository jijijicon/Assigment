<%-- 
    Document   : detail
    Created on : Feb 23, 2022, 5:59:36 PM
    Author     : ASUS
--%>

<%@page import="model.entity.Mark"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.entity.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%
            Student st = (Student) request.getAttribute("student");
            ArrayList<Mark> marks = (ArrayList<Mark>) request.getAttribute("marks");
        %>
    </head>
    <body>
        <table>
            <tr>
                <td>mon</td>
                <td>1</td>
                <td>2</td>
                <td>3</td>
                <td>4</td>
                <td>5</td>
                <td>6</td>
            </tr>

            <% for (int i = 0; i < marks.size(); i++) {%>
            <tr>
                <td><%= marks.get(i).getSubjectid().getSubjectName() %></td>
                <td><%= marks.get(i).getSmalltest1() %></td>
                <td><%= marks.get(i).getBigltest1() %></td>
                <td><%= marks.get(i).getBigltest1() %></td>
                <td><%= marks.get(i).getBigtest2() %></td>
                <td><%= marks.get(i).getFinalltest2() %></td>
            </tr>
            <%}
            %>
        </table>
    </body>
</html>
