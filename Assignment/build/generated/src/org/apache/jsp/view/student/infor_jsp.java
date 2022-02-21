package org.apache.jsp.view.student;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.entity.Student;

public final class infor_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"../view/student/infor.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href='https://unpkg.com/boxicons@2.1.1/css/boxicons.min.css' rel='stylesheet'>\n");
      out.write("        ");

            Student st = (Student) request.getAttribute("st");
        
      out.write("\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            \n");
      out.write("            function deleteStudent(id)\n");
      out.write("            {\n");
      out.write("                var result = confirm(\"Are you sure?\");\n");
      out.write("                if (result)\n");
      out.write("                {\n");
      out.write("                    window.location.href = \"../student/delete?id=\"+id;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <nav id=\"nav\" class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\">            \n");
      out.write("                        <img id=\"iconhome\" src=\"../image/42496-school-icon (1).png\" alt=\"\"/> </a>\n");
      out.write("                    <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                        <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\n");
      out.write("                            <li class=\"nav-item item\">\n");
      out.write("                                <a class=\"nav-link active\" aria-current=\"page\" href=\"#\">tin chính</a>\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("                            <li class=\"nav-item item\">\n");
      out.write("                                <a class=\"nav-link active\" aria-current=\"page\" href=\"#\">danh sach</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item item\">\n");
      out.write("                                <a class=\"nav-link active\" aria-current=\"page\" href=\"#\">xem điểm</a>\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("                            <form id=\"search\" class=\"d-flex nav-item item\">\n");
      out.write("                                <input class=\"form-control me-2\" type=\"search\" placeholder=\"tra tin\" aria-label=\"Search\">\n");
      out.write("                                <input id=\"button\" type=\"button\" value=\"search\">\n");
      out.write("                            </form>\n");
      out.write("                            <li class=\"nav-item item\">\n");
      out.write("                                <a class=\"nav-link active\" aria-current=\"page\" href=\"#\"><i class='bx bxs-user'></i> tài khoản</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("            <div class=\"information\">\n");
      out.write("                <div class=\"row\"\n");
      out.write("                     style=\"border: 1px darkgrey solid; border-radius: 10px; width: 50%; margin: 0 auto; padding: 20px;\">\n");
      out.write("                    <div class=\"col-sm-3\">\n");
      out.write("                        <img>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-9\">\n");
      out.write("\n");
      out.write("                        <h2 class=\"myclass\"> ");
      out.print( st.getLastname());
      out.write(' ');
      out.print( st.getFirstname());
      out.write("</h2>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group row\">\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <p>ID: ");
      out.print( st.getStudentID());
      out.write("</p> \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("\n");
      out.write("                                <p>lớp ");
      out.print( st.getClassID().getClassID());
      out.write("</p>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group row\">\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <label> giới tính: </label> \n");
      out.write("                                <p>");
 if (st.isGender()) { 
      out.write("nam");
} else { 
      out.write('n');
      out.write('ữ');
}
      out.write("</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <label> ngày sinh </label> \n");
      out.write("                                <p>");
      out.print( st.getDob());
      out.write("</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label> dia chi </label> \n");
      out.write("                            <p>");
      out.print( st.getAdress());
      out.write("</p>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <a class=\"btn btn-danger\" href=\"#\" onclick=\"deleteStudent(");
      out.print( st.getStudentID() );
      out.write(")\"   >dell   </a>\n");
      out.write("                        <button  class=\"btn btn-primary\">Cancel</button>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
