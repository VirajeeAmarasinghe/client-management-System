package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login</title>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            body {\n");
      out.write("                background-color:#cccccc;\n");
      out.write("                color: black;\n");
      out.write("                margin-top: 5em;\n");
      out.write("            }\n");
      out.write("            #main_section{\n");
      out.write("                margin-left: 25em;               \n");
      out.write("                border: solid 0.15em #ffffff;\n");
      out.write("                padding-left: 1.5em;\n");
      out.write("                padding-bottom: 1.5em;\n");
      out.write("                margin-right: 30em;\n");
      out.write("                margin-top:10em;\n");
      out.write("            }            \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"main_section\">\n");
      out.write("        <h1>Login</h1>\n");
      out.write("        <h3>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3>\n");
      out.write("        <form action=\"getLoginData\" method=\"get\">\n");
      out.write("            <table border=\"0\" cellspacing=\"10\">\n");
      out.write("               <tr>\n");
      out.write("                    <td>Username:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"txtUserName\"></td>\n");
      out.write("                </tr> \n");
      out.write("                <tr>\n");
      out.write("                    <td>Password:</td>\n");
      out.write("                    <td><input type=\"password\" name=\"txtPass\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td><input type=\"submit\" value=\"Log\" name=\"btnLog\"></td>\n");
      out.write("                </tr>                \n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
