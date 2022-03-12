<%-- 
    Document   : detail
    Created on : Feb 23, 2022, 5:59:36 PM
    Author     : ASUS
--%>

<%@page import="model.entity.Comment"%>
<%@page import="model.account.TeacherAccount"%>
<%@page import="model.account.ParentAccount"%>
<%@page import="model.entity.Mark"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.entity.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>

        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">


        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <link href="../view/mark/detail.css" rel="stylesheet" type="text/css"/>
        <link href='https://unpkg.com/boxicons@2.1.1/css/boxicons.min.css' rel='stylesheet'>
        <%
            Student st = (Student) request.getAttribute("student");
            ArrayList<Mark> marks = (ArrayList<Mark>) request.getAttribute("marks");
            String hk1 = (String) request.getAttribute("hk1");
            String hk2 = (String) request.getAttribute("hk2");
            String admin = (String) request.getSession().getAttribute("admin");
            if (admin.equals("0")) {
                ParentAccount pacc = (ParentAccount) request.getSession().getAttribute("account");
            } else if (admin.equals("1")) {
                TeacherAccount tacc = (TeacherAccount) request.getSession().getAttribute("account");
            }

            ArrayList<Comment> cmts = (ArrayList<Comment>) request.getAttribute("cmts");
        %>

    </head>
    <body>
        <div class="container">
            <nav id="nav" class="navbar navbar-expand-lg navbar-light bg-light">
                <div class="container-fluid">
                    <a class="navbar-brand" href="#">            
                        <img id="iconhome" src="../image/42496-school-icon (1).png" alt=""/> </a>
                    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse" id="navbarSupportedContent">
                        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                            <li class="nav-item item">
                                <a class="nav-link active" aria-current="page" href="#">tin chính</a>
                            </li>

                            <li class="nav-item item">
                                <a class="nav-link active" aria-current="page" href="../student/search">danh sach</a>
                            </li>
                            <li class="nav-item dropdown">
                                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                    Điểm
                                </a>
                                <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                                    <li><a class="dropdown-item" href="../mark/list?classid=1A">1A</a></li>
                                    <li><a class="dropdown-item" href="../mark/list?classid=1B">1B</a></li>
                                    <li><a class="dropdown-item" href="../mark/list?classid=2A">2A</a></li>
                                    <li><a class="dropdown-item" href="../mark/list?classid=2B">2B</a></li>
                                    <li><a class="dropdown-item" href="../mark/list?classid=3A">3A</a></li>
                                    <li><a class="dropdown-item" href="../mark/list?classid=3B">3B</a></li>
                                    <li><a class="dropdown-item" href="../mark/list?classid=4A">4A</a></li>
                                    <li><a class="dropdown-item" href="../mark/list?classid=4B">4B</a></li>
                                    <li><a class="dropdown-item" href="../mark/list?classid=5A">5A</a></li>
                                    <li><a class="dropdown-item" href="../mark/list?classid=5B">5B</a></li>

                                </ul>
                            </li>

                            <% if (admin.equals("1")) {%>
                            <li class="nav-item item">
                                <a class="nav-link active" aria-current="page" href="../teacher/list">ds giáo viên</a>
                            </li>
                            <form id="search" class="d-flex nav-item item" action="../student/infor" >
                                <input class="form-control me-2" type="text" name="studentid" placeholder="tra cứ thông tin học sinh" aria-label="Search">
                                <button class="btn btn-primary" type="submit" value="add" name="add">search</button>

                            </form>
                            
                            <%}%>
                            <li class="nav-item dropdown">
                                <a class="nav-link dropdown-toggle" class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                    <i class='bx bxs-user'> </i><%= admin.equals("1") ? "  giáo viên" : "  phụ huynh"%></a>
                                <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                                    <li><a class="dropdown-item" href="../mark/list?classid=1A">đổi mật khẩu</a></li>

                                    <li><a class="dropdown-item" href="../mark/list?classid=2A">thông tin</a></li>
                                    <li><a class="dropdown-item" href="../mark/list?classid=1B">đăng xuất</a></li>

                                </ul>
                            </li>
                        </ul>

                    </div>
                </div>
            </nav>
            <div id="carouselExampleIndicators" class="carousel slide" data-bs-ride="carousel">
                <div class="carousel-indicators">
                    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
                    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1" aria-label="Slide 2"></button>
                    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2" aria-label="Slide 3"></button>
                </div>
                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <img src="../image/caro2.jpg" class="d-block w-100" alt="...">
                    </div>
                    <div class="carousel-item">
                        <img src="../image/caro2.jpg" class="d-block w-100" alt="...">
                    </div>
                    <div class="carousel-item">
                        <img src="../image/caro2.jpg" class="d-block w-100" alt="...">
                    </div>
                </div>
                <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                    <span class="visually-hidden">Previous</span>
                </button>
                <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                    <span class="visually-hidden">Next</span>
                </button>
            </div>
            <div class="content">
                <h2><%= st.getLastname()%> <%=st.getFirstname()%></h2>
                <h6>lớp <%= st.getClassID().getClassID()%></h6>
                <div class="hk1">
                    <h5>Học kì 1</h5>
                    <table class="table table-bordered">
                        <thead>
                            <tr>
                                <th scope="col">môn học</th>
                                <th scope="col">kiểm tra</th>
                                <th scope="col">thi giữa kì 1</th>
                                <th scope="col">thi cuối kì 1</th>

                            </tr>
                        </thead>
                        <tbody>

                            <% for (int i = 0; i < marks.size(); i++) {%>
                            <tr>
                                <th scope="row"><%= marks.get(i).getSubjectid().getSubjectName()%></td>
                                <td><% if (marks.get(i).getSmalltest1() == -1) {%>
                                    chưa có
                                    <%} else {%> <%= marks.get(i).getSmalltest1()%> <%}%> </td>
                                <td><% if (marks.get(i).getBigtest1() == -1) {%>
                                    chưa có
                                    <%} else {%> <%= marks.get(i).getBigtest1()%> <%}%> </td>
                                <td><% if (marks.get(i).getFinalltest1() == -1) {%>
                                    chưa có
                                    <%} else {%> <%= marks.get(i).getFinalltest1()%> <%}%> </td>
                            </tr>

                            <%}
                            %>
                            <tr>
                                <th scope="row"> xếp loại </th>
                                <td colspan="3">
                                    <%= hk1%>

                                </td>

                            </tr>
                        </tbody>
                    </table>
                </div>
                <div class="hk2">
                    <h5>Học kì 2</h5>
                    <table class="table table-bordered">
                        <thead>
                            <tr>
                                <th scope="col">môn học</th>
                                <th scope="col">kiểm tra</th>
                                <th scope="col">thi giữa kì 2</th>
                                <th scope="col">thi cuối kì 2</th>

                            </tr>
                        </thead>
                        <tbody>

                            <% for (int i = 0; i < marks.size(); i++) {%>
                            <tr>
                                <th scope="row"><%= marks.get(i).getSubjectid().getSubjectName()%></td>
                                <td><% if (marks.get(i).getSmalltest2() == -1) {%>
                                    chưa có
                                    <%} else {%> <%= marks.get(i).getSmalltest2()%> <%}%> </td>
                                <td><% if (marks.get(i).getBigtest2() == -1) {%>
                                    chưa có
                                    <%} else {%> <%= marks.get(i).getBigtest2()%> <%}%> </td>
                                <td><% if (marks.get(i).getFinalltest2() == -1) {%>
                                    chưa có
                                    <%} else {%> <%= marks.get(i).getFinalltest2()%> <%}%> </td>
                            </tr>

                            <%}
                            %>
                            <tr>
                                <th scope="row"> xếp loại </th>
                                <td colspan="3">
                                    <%= hk2%>

                                </td>

                            </tr>

                        </tbody>
                    </table>
                    <hr>

                    <div class="alert alert-primary" role="alert">
                        Tổng kêt: xếp loại <%= hk2%>
                    </div>

                    <div id="comment">

                        <form action="../mark/detail" method="POST">
                            <input type="hidden" name="id" value="<%= st.getStudentID()%>">
                            <input type="hidden" name="per" value="<%= admin%>">
                            <input type="text" name="content" placeholder="nhận xét"><br>

                            <button type="submit">add </button>

                        </form>
                    </div>

                </div>

                <% for (Comment cmt : cmts) {%>
                <div  <%= cmt.isTeacher() ? "class=\"teacher-cmt\"" : "class=\"parent-cmt\""%>  >
                   
                    <%= cmt.isTeacher() ? "<h5>nhà trường</h5>" : "<h5>phụ huynh</h5>"%>
                     <i class="date"><%= cmt.getDate()%> </i>
                     <p class="cmt"><%= cmt.getContent()%></p>
                </div>
                <%}
                %>

            </div>

            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    </body>
</html>
