<%-- 
    Document   : infor
    Created on : Feb 20, 2022, 1:14:24 PM
    Author     : ASUS
--%>

<%@page import="model.entity.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <link href="../view/student/infor.css" rel="stylesheet" type="text/css"/>
        <link href='https://unpkg.com/boxicons@2.1.1/css/boxicons.min.css' rel='stylesheet'>

        <script>
            function deleteStudent(id)
            {
                var result = confirm("Are you sure?");
                if (result)
                {
                    window.location.href = '../student/delete?id=' + id;
                }
            }

        </script>

        <%
            Student st = (Student) request.getAttribute("st");
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
                                <a class="nav-link active" aria-current="page" href="#">danh sach</a>
                            </li>
                            <li class="nav-item item">
                                <a class="nav-link active" aria-current="page" href="#">xem điểm</a>
                            </li>

                            <form id="search" class="d-flex nav-item item">
                                <input class="form-control me-2" type="search" placeholder="tra tin" aria-label="Search">
                                <input id="button" type="button" value="search">
                            </form>
                            <li class="nav-item item">
                                <a class="nav-link active" aria-current="page" href="#"><i class='bx bxs-user'></i> tài khoản</a>
                            </li>
                        </ul>

                    </div>
                </div>
            </nav>
            <div class="information">
                <div class="row"
                     style="border: 1px darkgrey solid; border-radius: 10px; width: 50%; margin: 0 auto; padding: 20px;">
                    <div class="col-sm-3">
                        <img>
                    </div>
                    <div class="col-sm-9">

                        <h2 class="myclass"> <%= st.getLastname()%> <%= st.getFirstname()%></h2>

                        <div class="form-group row">
                            <div class="col-sm-6">
                                <p>ID: <%= st.getStudentID()%></p> 
                            </div>
                            <div class="col-sm-6">

                                <p>lớp <%= st.getClassID().getClassID()%></p>
                            </div>

                        </div>
                        <div class="form-group row">
                            <div class="col-sm-6">
                                <label> giới tính: </label> 
                                <p><% if (st.isGender()) { %>nam<%} else { %>nữ<%}%></p>
                            </div>
                            <div class="col-sm-6">
                                <label> ngày sinh </label> 
                                <p><%= st.getDob()%></p>
                            </div>
                        </div>


                        <div class="form-group">
                            <label> dia chi </label> 
                            <p><%= st.getAdress()%></p>
                        </div>



                        <a class="btn btn-danger" href="#" onclick="deleteStudent('<%= st.getStudentID()%>')">dell</a>
                        <button  class="btn btn-primary">Cancel</button>


                    </div>
                </div>
            </div>

        </div>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    </body>
</html>