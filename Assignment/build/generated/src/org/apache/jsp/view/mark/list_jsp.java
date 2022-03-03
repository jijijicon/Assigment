package org.apache.jsp.view.mark;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.entity.Mark;
import model.entity.Student;
import model.entity.Subject;
import java.util.ArrayList;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("        <link href='https://unpkg.com/boxicons@2.1.1/css/boxicons.min.css' rel='stylesheet'>\n");
      out.write("        <script src=\"../js/pagger.js\" type=\"text/javascript\" ></script>\n");
      out.write("        <link href=\"../view/student/search.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("        ");

            ArrayList<Student> students = (ArrayList<Student>) request.getAttribute("students");
            ArrayList<Subject> subjects = (ArrayList<Subject>) request.getAttribute("subjects");

        
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
      out.write("                                <a class=\"nav-link active\" aria-current=\"page\" href=\"../student/search\">danh sach</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item dropdown\">\n");
      out.write("                                <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("                                    Điểm\n");
      out.write("                                </a>\n");
      out.write("                                <ul class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                                    <li><a class=\"dropdown-item\" href=\"../mark/list?classid=1A\">1A</a></li>\n");
      out.write("                                    <li><a class=\"dropdown-item\" href=\"../mark/list?classid=1B\">1B</a></li>\n");
      out.write("                                    <li><a class=\"dropdown-item\" href=\"../mark/list?classid=2A\">2A</a></li>\n");
      out.write("                                    <li><a class=\"dropdown-item\" href=\"../mark/list?classid=2B\">2B</a></li>\n");
      out.write("                                    <li><a class=\"dropdown-item\" href=\"../mark/list?classid=3A\">3A</a></li>\n");
      out.write("                                    <li><a class=\"dropdown-item\" href=\"../mark/list?classid=3B\">3B</a></li>\n");
      out.write("                                    <li><a class=\"dropdown-item\" href=\"../mark/list?classid=4A\">4A</a></li>\n");
      out.write("                                    <li><a class=\"dropdown-item\" href=\"../mark/list?classid=4B\">4B</a></li>\n");
      out.write("                                    <li><a class=\"dropdown-item\" href=\"../mark/list?classid=5A\">5A</a></li>\n");
      out.write("                                    <li><a class=\"dropdown-item\" href=\"../mark/list?classid=5B\">5B</a></li>\n");
      out.write("\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("                            <form id=\"search\" class=\"d-flex nav-item item\">\n");
      out.write("                                <input class=\"form-control me-2\" type=\"search\" placeholder=\"tra tin\" aria-label=\"Search\">\n");
      out.write("                                <button class=\"btn btn-primary\" type=\"submit\" value=\"add\" name=\"add\">save</button>\n");
      out.write("                            </form>\n");
      out.write("                            <li class=\"nav-item item\">\n");
      out.write("                                <a class=\"nav-link active\" aria-current=\"page\" href=\"#\"><i class='bx bxs-user'></i> tài khoản</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("            <div id=\"carouselExampleIndicators\" class=\"carousel slide\" data-bs-ride=\"carousel\">\n");
      out.write("                <div class=\"carousel-indicators\">\n");
      out.write("                    <button type=\"button\" data-bs-target=\"#carouselExampleIndicators\" data-bs-slide-to=\"0\" class=\"active\" aria-current=\"true\" aria-label=\"Slide 1\"></button>\n");
      out.write("                    <button type=\"button\" data-bs-target=\"#carouselExampleIndicators\" data-bs-slide-to=\"1\" aria-label=\"Slide 2\"></button>\n");
      out.write("                    <button type=\"button\" data-bs-target=\"#carouselExampleIndicators\" data-bs-slide-to=\"2\" aria-label=\"Slide 3\"></button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"carousel-inner\">\n");
      out.write("                    <div class=\"carousel-item active\">\n");
      out.write("                        <img src=\"../image/caro2.jpg\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"carousel-item\">\n");
      out.write("                        <img src=\"../image/caro2.jpg\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"carousel-item\">\n");
      out.write("                        <img src=\"../image/caro2.jpg\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <button class=\"carousel-control-prev\" type=\"button\" data-bs-target=\"#carouselExampleIndicators\" data-bs-slide=\"prev\">\n");
      out.write("                    <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                    <span class=\"visually-hidden\">Previous</span>\n");
      out.write("                </button>\n");
      out.write("                <button class=\"carousel-control-next\" type=\"button\" data-bs-target=\"#carouselExampleIndicators\" data-bs-slide=\"next\">\n");
      out.write("                    <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                    <span class=\"visually-hidden\">Next</span>\n");
      out.write("                </button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"content\">\n");
      out.write("\n");
      out.write("                <table class=\"table table-bordered\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th></th>\n");
      out.write("                            <th scope=\"col\" colspan=\"4\"> học kì 1 </th>\n");
      out.write("                            <th scope=\"col\" colspan=\"4\"> học kì 2 </th>\n");
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <th scope=\"col\"> tên </th>\n");
      out.write("                                ");
 for (Subject sj : subjects) {
      out.write("\n");
      out.write("                            <th scope=\"col\">");
      out.print( sj.getSubjectName());
      out.write("</th>\n");
      out.write("                                ");
}
                                
      out.write("\n");
      out.write("                            <th scope=\"col\" > xếp loại </th>\n");
      out.write("                            ");
 for (Subject sj : subjects) {
      out.write("\n");
      out.write("                            <th scope=\"col\">");
      out.print( sj.getSubjectName());
      out.write("</th>\n");
      out.write("                                ");
}
                                
      out.write("\n");
      out.write("                            <th scope=\"col\" > xếp loại </th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        \n");
      out.write("                        ");
 for (Student st : students) {
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <th scope=\"row\" >");
      out.print( st.getLastname()+" "+st.getFirstname() );
      out.write("</th>\n");
      out.write("                            \n");
      out.write("                            ");
for (int j = 0; j < st.getMarks().size(); j++) {
      out.write("\n");
      out.write("                            <td>");
if(st.getMarks().get(j).getFinalltest1()==-1){
}
                            else{
      out.print( st.getMarks().get(j).getFinalltest1()  );
}
      out.write("</td>\n");
      out.write("                            \n");
      out.write("                            ");
}
      out.write("\n");
      out.write("                            <td></td>\n");
      out.write("                            ");
for (int j = 0; j < st.getMarks().size(); j++) {
      out.write("\n");
      out.write("                            <td>");
if(st.getMarks().get(j).getFinalltest2()==-1){
}
                            else{
      out.print( st.getMarks().get(j).getFinalltest2()  );
}
      out.write("</td> \n");
      out.write("                            ");
}
      out.write("\n");
      out.write("                            <td>\n");
      out.write("                            ");
for (int j = 0; j < st.getMarks().size(); j++) {
      out.write("\n");
      out.write("                            \n");
      out.write("                            ");
}
      out.write("\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("\n");
      out.write("                <div class=\"foo\">\n");
      out.write("                    <p>trường tiểu học ABC</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script>\n");
      out.write("            \n");
      out.write("        </script>\n");
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
