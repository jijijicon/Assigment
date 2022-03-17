<%-- 
    Document   : list
    Created on : Feb 22, 2022, 10:04:00 PM
    Author     : ASUS
--%>

<%@page import="model.account.TeacherAccount"%>
<%@page import="model.account.ParentAccount"%>
<%@page import="model.entity.Mark"%>
<%@page import="model.entity.Student"%>
<%@page import="model.entity.Subject"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">


        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

        <link href='https://unpkg.com/boxicons@2.1.1/css/boxicons.min.css' rel='stylesheet'>
        <script src="../view/mark/listmark.js" type="text/javascript" ></script>
        <link href="../view/mark/list.css" rel="stylesheet" type="text/css"/>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.9.4/Chart.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.9.4/Chart.js"></script>
        <%
            ArrayList<Student> students = (ArrayList<Student>) request.getAttribute("students");
            ArrayList<Subject> subjects = (ArrayList<Subject>) request.getAttribute("subjects");
            String classid= (String) request.getAttribute("classid");
            String admin = (String) request.getSession().getAttribute("admin");
            
        %>    




    </head>
    <body>
        <script>
            var ch1=0;
            var xs1 =0;
            var ht1 = 0;
            var h1 = 0;
            var k1 = 0;
            
            
            var ch2=0;
            var xs2 =0;
            var ht2 = 0;
            var h2 = 0;
            var k2 = 0;
        </script>
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
                                <a class="nav-link active" aria-current="page" href="../home">tin chính</a>
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
                             <form id="search" class="d-flex nav-item item" action="../student/searchname" method="GET" >
                                <input class="form-control me-2" type="text" name="name" placeholder="tra cứu học sinh" aria-label="Search">
                                <button class="btn btn-primary" type="submit" value="add" name="add">search</button>

                            </form>

                            <%}%>
                            <li class="nav-item dropdown">
                                <a class="nav-link dropdown-toggle" class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                    <i class='bx bxs-user'> </i><%= admin.equals("1") ? "  giáo viên" : "  phụ huynh"%></a>
                                <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                                    <li><a class="dropdown-item" href="../login/changepass">đổi mật khẩu</a></li>

                                    <li> <% if (admin.equals("0")) {
                                        ParentAccount pacc = (ParentAccount) request.getSession().getAttribute("account");%> <a class="dropdown-item" href="../student/infor?studentid=<%= pacc.getStudentID().getStudentID() %>">thông tin</a> <%} 
                                        else if (admin.equals("1")) {
                                    TeacherAccount tacc = (TeacherAccount) request.getSession().getAttribute("account");%><a class="dropdown-item" href="../teacher/infor?id=<%= tacc.getTeacherid().getTeacherID() %>">thông tin</a><%}%></li>
                                    <li><a class="dropdown-item" href="../logout">đăng xuất</a></li>

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
                <h2><%= classid %></h2>
                <table class="table table-bordered">
                    <thead>
                        <tr>
                            <th></th>
                            <th scope="col" colspan="4"> học kì 1 </th>
                            <th scope="col" colspan="4"> học kì 2 </th>

                        </tr>
                        <tr>
                            <th scope="col"> tên </th>
                                <% for (Subject sj : subjects) {%>
                            <th scope="col"><%= sj.getSubjectName()%></th>
                                <%}
                                %>
                            <th scope="col" > xếp loại </th>
                                <% for (Subject sj : subjects) {%>
                            <th scope="col"><%= sj.getSubjectName()%></th>
                                <%}
                                %>
                            <th scope="col" > xếp loại </th>
                        </tr>
                    </thead>
                    <tbody>

                        <% for (Student st : students) {%>
                        <tr>
                            <th scope="row" ><a class="name" href="../mark/detail?studentid=<%= st.getStudentID() %>"><%= st.getLastname() + " " + st.getFirstname()%></a></th>

                            <%for (int j = 0; j < st.getMarks().size(); j++) {%>
                            <td><%if (st.getMarks().get(j).getFinalltest1() == -1) {%><%} else {%><%= st.getMarks().get(j).getFinalltest1()%><%}%></td>

                            <%}%>
                            <td>
                                <script>
                                    var arr = [];
                                    <%for (int j = 0; j < st.getMarks().size(); j++) {%>
                                    arr.push(<%= st.getMarks().get(j).getFinalltest1()%>);
                                    <%}%>
                                    function xet(m) {
                                        var hk1 = '';
                                        for ( let i = 0; i < m.length ; i++) {
                                            if (m[i] === -1) {
                                                hk1 += '1';
                                            }
                                            if (m[i] < 5) {
                                                hk1 += '2';
                                            }
                                            if (m[i] >= 5 && m[i] < 7) {
                                                hk1 += '3';
                                            }
                                            if (m[i] >= 7 && m[i] < 9) {
                                                hk1 += '4';
                                            }
                                            if (m[i] >= 9 && m[i] <= 10) {
                                                hk1 += '5';
                                            }

                                        }
                                        if (hk1.includes('1')) {
                                            k1++;
                                            return '';
                                        } else if ( hk1.includes('2')) {
                                            ch1++;
                                            return 'chưa hoàn thành';
                                        } else if (hk1.includes('3')) {
                                             h1++ ;
                                            return 'hoàn thành';
                                        } else if (hk1.includes('4')) {
                                             ht1++ ; 
                                            return 'hoàn thành tốt';
                                        } else if (hk1.includes('5')) {
                                             xs1++ ;
                                            return 'hoàn thành thành xuất sắc';
                                        }
                                        return '';
                                    }
                                    var x = xet(arr);
                                    document.write(x);
                                </script>
                            <%for (int j = 0; j < st.getMarks().size(); j++) {%>
                            <td><%if (st.getMarks().get(j).getFinalltest2() == -1) {%><%} else {%><%= st.getMarks().get(j).getFinalltest2()%><%}%></td> 
                            <%}%>
                            <td>
                                <script>
                                    var arr = [];
                                    <%for (int j = 0; j < st.getMarks().size(); j++) {%>
                                    arr.push(<%= st.getMarks().get(j).getFinalltest2()%>);
                                    <%}%>
                                    function xet(m) {
                                        var hk2 = '';
                                        for ( let i = 0; i < m.length ; i++) {
                                            if (m[i] === -1) {
                                                hk2 += '1';
                                            }
                                            if (m[i] < 5) {
                                                hk2 += '2';
                                            }
                                            if (m[i] >= 5 && m[i] < 7) {
                                                hk2 += '3';
                                            }
                                            if (m[i] >= 7 && m[i] < 9) {
                                                hk2 += '4';
                                            }
                                            if (m[i] >= 9 && m[i] <= 10) {
                                                hk2 += '5';
                                            }

                                        }
                                        if (hk2.includes('1')) {
                                            k2++;
                                            return '';
                                        } else if ( hk2.includes('2')) {
                                            ch2++;
                                        return 'chưa hoàn thành';
                                            
                                        } else if (hk2.includes('3')) {
                                            h2++;
                                            return 'hoàn thành';
                                        } else if (hk2.includes('4')) {
                                            ht2++;
                                            return 'hoàn thành tốt';
                                        } else if (hk2.includes('5')) {
                                            xs2++;
                                            return 'hoàn thành suất sắc';
                                        }
                                        return '';
                                    }
                                    var x = xet(arr);
                                    document.write(x);
                                </script>
                            </td>
                        </tr>
                        <%}%>
                    </tbody>
                </table>
                    <div class="row">
                        <div class="col-sm-6">
                            <canvas id="myChart1" style="width:100%;max-width:600px"></canvas>
                        </div>
                        <div class="col-sm-6">
                            <canvas id="myChart2" style="width:100%;max-width:600px"></canvas>
                        </div>
                    </div>
                <div class="foo">
                    <p>trường tiểu học ABC</p>
                </div>
            </div>

                    
        </div>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
        <script>
            
        
            xeploai("myChart1",k1, ch1, h1,ht1,xs1,'học kì 1');
            xeploai("myChart2",k2, ch2, h2,ht2,xs2,'học kì 2');
        </script>
    </body>
</html>