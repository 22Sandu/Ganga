package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Criteria;
import hibpck.UserType;
import hibpck.poolmanager;

public final class Register_005fproducts_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<center>\n");
      out.write("    <h3>Register Your Products Here!!</h3>   <br><br>\n");
      out.write("    <table border=\"1\">\n");
      out.write("        <thead>\n");
      out.write("            <tr>\n");
      out.write("                <th>Product Name</th>\n");
      out.write("                <th>Quantity</th>\n");
      out.write("                <th>Unit Price</th>\n");
      out.write("                <th>Images</th>\n");
      out.write("            </tr>\n");
      out.write("        </thead>\n");
      out.write("        <tbody id=\"tb\">\n");
      out.write("\n");
      out.write("        </tbody>\n");
      out.write("    </table>\n");
      out.write("    <input type=\"submit\" value=\"Save\" onclick=\"registerProducts()\"/>\n");
      out.write("    <hr>\n");
      out.write("    <form method=\"POST\" id=\"testform\" onsubmit=\"validateProducts(this);\n");
      out.write("            return false;\" action=\"\" enctype=\"multipart/form-data\">\n");
      out.write("        <table border=\"0\">                              \n");
      out.write("            <tr>\n");
      out.write("                <td>Product Name</td>\n");
      out.write("                <td>:</td>\n");
      out.write("                <td><input type=\"text\" name=\"pname\" value=\"\" id=\"pname\" style=\"width: 200px; border-color: lightgray\" /></td>\n");
      out.write("                <td id=\"msg_pname\" style=\"color: red; font-size: 10px \"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td></td> \n");
      out.write("            </tr>                \n");
      out.write("            <tr>\n");
      out.write("                <td>Quantity</td>\n");
      out.write("                <td>:</td>\n");
      out.write("                <td><input type=\"text\" name=\"qty\" value=\"\" id=\"qty\" style=\"width: 200px;\" /></td>\n");
      out.write("                <td id=\"msg_qty\" style=\"color: red; font-size: 10px \"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Unit Price</td>\n");
      out.write("                <td>:</td>\n");
      out.write("                <td><input type=\"text\" name=\"price\" value=\"\" id=\"price\" style=\"width: 200px;\" /></td>\n");
      out.write("                <td id=\"msg_price\" style=\"color: red; font-size: 10px \"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td></td>\n");
      out.write("            </tr>               \n");
      out.write("            <tr>\n");
      out.write("                <td colspan=\"3\" align=\"center\"><input type=\"submit\" value=\"Add\" name=\"add\" style=\"background-color: burlywood; font: bold;color: brown\" /></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td></td>\n");
      out.write("            </tr>               \n");
      out.write("            <tr>\n");
      out.write("                <td colspan=\"3\" align=\"center\" id=\"msg\" style=\"color: red; font-size: 10px \"></td>\n");
      out.write("            </tr>               \n");
      out.write("        </table>\n");
      out.write("    </form>\n");
      out.write("</center>\n");
      out.write("</body>");
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
