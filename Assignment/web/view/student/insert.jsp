<%-- 
    Document   : insert
    Created on : Feb 19, 2022, 4:39:02 PM
    Author     : ASUS
--%>

<%@page import="model.entity.ClassStudent"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.awt.Desktop.Action"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <link rel="stylesheet"
              href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
        <script
        src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script
        src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>


        <title>JSP Page</title>
        <%
            ArrayList<ClassStudent> classlist = (ArrayList<ClassStudent>) request.getAttribute("classes");
        %>
    </head>
    <body>
        <div class="container" style="margin-top: 10px;">
            <div class="row"
                 style="border: 1px darkgrey solid; border-radius: 10px; width: 50%; margin: 0 auto; padding: 20px;">
                <div class="col-sm-12">

                    <h2 class="myclass">thêm học sinh</h2>
                    <form action="../student/insert" method="post" >
                        <div class="form-group">
                            <label>ID</label> 
                            <input type="text" 
                                   class="form-control" name="studentid" placeholder="Enter id">
                        </div>
                        <div class="form-group">
                            <label> họ </label> 
                            <input type="text" 
                                   class="form-control" name="firstname" placeholder="Enter firstname">
                        </div>
                        <div class="form-group">
                            <label> tên </label> 
                            <input type="text" 
                                   class="form-control" name="lastname" placeholder="Enter lastname">
                        </div>
                        <div class="form-group">
                            giới tính: 
                            <input  type="radio" name="gender"  value="boy">boy
                            <input type="radio" name="gender" value="girl">girl<br>
                        </div>
                        <div class="form-group">
                            <label> ngày sinh </label> 
                            <input type="date" 
                                   class="form-control" name="dob">
                        </div>
                        <div class="form-group">
                            <label> lớp  </label> 
                            <select name="classid">

                                <%for (ClassStudent cl : classlist) {%>
                                <option value="<%= cl.getClassID() %>"><%= cl.getClassID()  %></option>   
                                <%}
                                %>
                            </select>
                        </div>
                             <div class="form-group">
                            <label> địa chỉ </label> 
                            <input type="text" 
                                   class="form-control" name="adress">
                        </div>
                        <div class="form-group">
                            <label>Photo</label> <br/>

                            <input type="file" 
                                   class="form-control" name="photo" placeholder="Enter photo">
                        </div>

                        <button type="submit" class="btn btn-primary">Save</button>
                        <button type="reset" class="btn btn-primary">Cancel</button>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>