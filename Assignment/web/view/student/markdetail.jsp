<%-- 
    Document   : markdetail
    Created on : Feb 19, 2022, 3:34:02 PM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script>
             function deleteStudent(id)
            {
                var result = confirm("Are you sure?");
                if(result)
                {
                    window.location.href = 'delete?id='+ id;
                }
            }
        </script>
    </head>
    <body>
        <h1>Hello World!</h1>
        <a href="#" onclick="deleteStudent(a)" >lala</a>
    </body>
</html>
