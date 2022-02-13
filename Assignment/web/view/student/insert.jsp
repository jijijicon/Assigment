<%-- 
    Document   : insert
    Created on : Feb 12, 2022, 11:02:03 PM
    Author     : ASUS
--%>

<%@page import="model.entity.Grade"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%
            ArrayList<Grade> gras = (ArrayList<Grade>) request.getAttribute("grades");
        %>
    </head>
    <body>
        <form action="insert" method="POST">
            Name: <input type="text" name="stname"><br>
            Gender: <input  type="radio" checked="checked" name="gender" value="boy">boy
            <input type="radio" name="gender" value="girl">girl<br>
            Dob: <input type="date" name="dob" ><br>
            department: <select name="did">
                <%for ( Grade d : gras ) {%>
                <option value="<%= d.getGradeID() %>"><%= d.getGradeID() %></option>   
                    <%}
                %>
            </select>
            <hr>
            <input type="submit" value="send">
        </form>
    </body>
</html>
