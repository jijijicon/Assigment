<%-- 
    Document   : insert
    Created on : Feb 12, 2022, 11:02:03 PM
    Author     : ASUS
--%>

<%@page import="model.entity.Student"%>
<%@page import="model.entity.Grade"%>
<%@page import="model.entity.ClassStudent"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%
            ArrayList<Grade> gras = (ArrayList<Grade>) request.getAttribute("grades");
            ArrayList<ClassStudent> classes = (ArrayList<ClassStudent>) request.getAttribute("classes");
            int gradeID = (Integer) request.getAttribute("gradeID");
            String classID = (String) request.getAttribute("classID");
            ArrayList<Student> students = (ArrayList<Student>) request.getAttribute("students");
        %>
        <script>
            function submitGrade() {
                document.getElementById("searchByGrade").submit();
            }

        </script>
    </head>
    <body>

        <form action="search" method="GET" id="searchByGrade" onchange="submitGrade();">

            Khối<select name="gradeID">
                <option value="-1" >chọn khối</option>
                <%for (Grade d : gras) {%>
                <option <% if (d.getGradeID() == gradeID) {%> selected="selected" <%}%>
                                                              value="<%= d.getGradeID()%>"><%= d.getGradeID()%></option>   
                <%}
                %>
            </select>
            <hr>

            <form  action="search" method="GET"  >
                <select name="classID">
                    <option value="no" >chọn khối</option>
                    <% for (ClassStudent c : classes) {%>
                    <option <% if (c.getClassID().equals(classID)) { %> selected="selected"<%}%>
                                                                        value="<%= c.getClassID()%>"><%= c.getClassID()%></option>
                    <%   }
                    %>
                </select>
                <input type="submit" value="search">
            </form>
        </form>


        <table>
            <tr>
                <th>id</th>
                <th>tên</th>
                <th>giới tính</th>
                <th>ngày sinh</th>
                <th>lớp</th>
            </tr>
            <% for (Student st : students) {%>
            <tr>
                <td><%= st.getStudentID()%></td>
                <td><%= st.getFirstname()%></td>
                <td><%= st.getLastname()%></td>
                <td><% if (st.isGender()) { %>nam<%} else { %>nữ<%}%></td>
                <td><%= st.getDob()%></td>
                <td><%= st.getClassID().getClassID()%></td>
            </tr>
            <%}
            %>
        </table>
    </body>
</html>
