package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import hibpck.User;
import hibpck.ProductType;
import java.util.List;
import hibpck.UserType;
import org.hibernate.Session;
import org.hibernate.Criteria;
import hibpck.poolmanager;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");

    if (request.getSession().getAttribute("user") != null) {

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"html.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"layout.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"print.css\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Sri Lanka Fruits and Vegetables Producers and Exporters</title>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function search() {\n");
      out.write("                var a;\n");
      out.write("                var pname = document.getElementById('pname').value;\n");
      out.write("                var category = document.getElementById('combo').value;\n");
      out.write("\n");
      out.write("                if (window.XMLHttpRequest) {\n");
      out.write("                    a = new XMLHttpRequest();\n");
      out.write("                } else if (window.ActiveXObject) {\n");
      out.write("                    a = new ActiveXObject(\"Microsoft.XMLHTTP\");\n");
      out.write("                } else {\n");
      out.write("                    alert(\"The Browser doesn't Support\");\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                if (a != null) {\n");
      out.write("                    a.onreadystatechange = function() {\n");
      out.write("                        if (a.readyState == 4) {\n");
      out.write("                            var res = a.responseText;\n");
      out.write("                            document.getElementById('divid').innerHTML = res;\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("                a.open(\"POST\", \"Search_results.jsp\", true);\n");
      out.write("                a.setRequestHeader(\"Content-Type\", \"application/x-www-form-urlencoded\");\n");
      out.write("                a.send(\"pname=\" + pname + \"&category=\" + category + \"\");\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function goToProduct(pid) {\n");
      out.write("                var a;\n");
      out.write("\n");
      out.write("                if (window.XMLHttpRequest) {\n");
      out.write("                    a = new XMLHttpRequest();\n");
      out.write("                } else if (window.ActiveXObject) {\n");
      out.write("                    a = new ActiveXObject(\"Microsoft.XMLHTTP\");\n");
      out.write("                } else {\n");
      out.write("                    alert(\"The Browser doesn't Support\");\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                if (a != null) {\n");
      out.write("                    a.onreadystatechange = function() {\n");
      out.write("                        if (a.readyState == 4) {\n");
      out.write("                            var res = a.responseText;\n");
      out.write("                            document.getElementById('divid').innerHTML = res;\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("                a.open(\"POST\", \"Go_to_product.jsp\", true);\n");
      out.write("                a.setRequestHeader(\"Content-Type\", \"application/x-www-form-urlencoded\");\n");
      out.write("                a.send(\"pid=\" + pid + \"\");\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function viewCart() {\n");
      out.write("                var a;\n");
      out.write("\n");
      out.write("                if (window.XMLHttpRequest) {\n");
      out.write("                    a = new XMLHttpRequest();\n");
      out.write("                } else if (window.ActiveXObject) {\n");
      out.write("                    a = new ActiveXObject(\"Microsoft.XMLHTTP\");\n");
      out.write("                } else {\n");
      out.write("                    alert(\"The Browser doesn't Support\");\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                if (a != null) {\n");
      out.write("                    a.onreadystatechange = function() {\n");
      out.write("                        if (a.readyState == 4) {\n");
      out.write("                            var res = a.responseText;\n");
      out.write("                            document.getElementById('divid').innerHTML = res;\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("                a.open(\"POST\", \"View_cart.jsp\", true);\n");
      out.write("                a.setRequestHeader(\"Content-Type\", \"application/x-www-form-urlencoded\");\n");
      out.write("                a.send(\"pid=\" + pid + \"\");\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function watchlist(pid) {\n");
      out.write("                var a;\n");
      out.write("                document.getElementById('erid').innerHTML = \"\";\n");
      out.write("                document.getElementById('bnrid').innerHTML = \"\";\n");
      out.write("\n");
      out.write("                if (window.XMLHttpRequest) {\n");
      out.write("                    a = new XMLHttpRequest();\n");
      out.write("                } else if (window.ActiveXObject) {\n");
      out.write("                    a = new ActiveXObject(\"Microsoft.XMLHTTP\");\n");
      out.write("                } else {\n");
      out.write("                    alert(\"The Browser doesn't Support\");\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                if (a !== null) {\n");
      out.write("                    a.onreadystatechange = function() {\n");
      out.write("                        if (a.readyState === 4) {\n");
      out.write("                            var res = a.responseText;\n");
      out.write("                            if (res === \"exist\") {\n");
      out.write("                                document.getElementById('erid').innerHTML = \"This Product is already addes to your Watch List\";\n");
      out.write("                            } else if (res === \"added\")\n");
      out.write("                                document.getElementById('bnrid').innerHTML = 'Added to your Watch List | <a href=\"#\" onclick=\"removef()\" >Remove</a>';\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("                a.open(\"POST\", \"Add_to_watchlist\", true);\n");
      out.write("                a.setRequestHeader(\"Content-Type\", \"application/x-www-form-urlencoded\");\n");
      out.write("                a.send(\"pid=\" + pid + \"\");\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function removef() {\n");
      out.write("                var a;\n");
      out.write("                document.getElementById('erid').innerHTML = \"\";\n");
      out.write("                document.getElementById('bnrid').innerHTML = \"\";\n");
      out.write("\n");
      out.write("                if (window.XMLHttpRequest) {\n");
      out.write("                    a = new XMLHttpRequest();\n");
      out.write("                } else if (window.ActiveXObject) {\n");
      out.write("                    a = new ActiveXObject(\"Microsoft.XMLHTTP\");\n");
      out.write("                } else {\n");
      out.write("                    alert(\"The Browser doesn't Support\");\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                if (a !== null) {\n");
      out.write("                    a.onreadystatechange = function() {\n");
      out.write("                        if (a.readyState === 4) {\n");
      out.write("                            var res = a.responseText;\n");
      out.write("                            if (res === \"deleted\") {\n");
      out.write("                                document.getElementById('bnrid').innerHTML = \"Removed Successfully.\";\n");
      out.write("                            } else {\n");
      out.write("                                document.getElementById('bnrid').innerHTML = \"Cannot be removed.\"\n");
      out.write("                            }\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("                a.open(\"POST\", \"Remove_from_watchlist\", true);\n");
      out.write("                a.setRequestHeader(\"Content-Type\", \"application/x-www-form-urlencoded\");\n");
      out.write("                a.send();\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function handleSelect(elm){\n");
      out.write("                window.location = \"My_account.jsp?elm=\"+elm.value+\"\";\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            User u = (User) request.getSession().getAttribute("user");
            if (u != null) {
                if (u.getUserType().getTypeName().equals("Buyer")) {
        
      out.write("\n");
      out.write("        <table border=\"0\">\n");
      out.write("            <tr>\n");
      out.write("                <td>Hi ");
      out.print(u.getFirstName() + " " + u.getLastName());
      out.write(",</td>\n");
      out.write("                <td></td>\n");
      out.write("                <td><a href=\"\">Sign In</a> or <a href=\"\">Register</a></td>\n");
      out.write("                <td></td>\n");
      out.write("                <td></td>\n");
      out.write("                <td><select name=\"my_account\" title=\"My Account\" onchange=\"javascript:handleSelect(this)\">\n");
      out.write("                        <option value=\"viewAccount\">My Account</option>\n");
      out.write("                        <option value=\"viewSummary\">Summary</option>\n");
      out.write("                        <option value=\"viewWatchlist\">Watch List</option>\n");
      out.write("                        <option value=\"viewWishlist\">Wishlist</option>\n");
      out.write("                        <option value=\"viewPurchaseHistory\">Purchase History</option>\n");
      out.write("                    </select></td>\n");
      out.write("                <td></td>\n");
      out.write("                <td><a href=\"#\" onclick=\"viewCart()\">Cart</a></td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        <hr>\n");
      out.write("        ");
 } else if (u.getUserType().getTypeName().equals("Admin")) {
      out.write("\n");
      out.write("        <table border=\"0\">\n");
      out.write("            <tr>\n");
      out.write("                <td>Hi ");
      out.print(u.getFirstName() + " " + u.getLastName());
      out.write(",</td>\n");
      out.write("                <td></td>\n");
      out.write("                <td></td>\n");
      out.write("                <td></td>\n");
      out.write("                <td>Products</td>\n");
      out.write("                <td></td>\n");
      out.write("                <td>Users</td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        <hr>\n");
      out.write("        ");
 }
        } else {
      out.write("\n");
      out.write("        <table border=\"0\">\n");
      out.write("            <tr>\n");
      out.write("                <td>Hi User,</td>\n");
      out.write("                <td></td>\n");
      out.write("                <td><a href=\"\">Sign In</a> or <a href=\"\">Register</a></td>\n");
      out.write("                <td></td>\n");
      out.write("                <td></td>\n");
      out.write("                <td>My Account</td>\n");
      out.write("                <td></td>\n");
      out.write("                <td><a href=\"Login.jsp\">Cart</a></td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        <hr>\n");
      out.write("        ");
 }
      out.write("\n");
      out.write("    <center>\n");
      out.write("        <br><br>\n");
      out.write("        <input type=\"text\" name=\"search\" value=\"\" style=\"font-size: 20px;\" id=\"pname\" />\n");
      out.write("        <select name=\"\" style=\"border: activeborder;\" id=\"combo\">\n");
      out.write("            <option id=\"all\">All Categories</option>\n");
      out.write("            ");

                Session s = poolmanager.getSessionFactory().openSession();
                Criteria c = s.createCriteria(ProductType.class);
                List<ProductType> l = c.list();
                for (ProductType pt : l) {
            
      out.write("\n");
      out.write("            <option id=\"");
      out.print(pt.getIdproductType());
      out.write('"');
      out.write('>');
      out.print(pt.getTypeName());
      out.write("</option>\n");
      out.write("            ");
 }
      out.write(" \n");
      out.write("            <input type=\"submit\" value=\"Search\" name=\"search\" style=\"font-size: 20px\" onclick=\"search()\" />\n");
      out.write("        </select>\n");
      out.write("        <div id=\"divid\">\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </center>\n");
      out.write("</body>\n");
      out.write("</html>\n");
 } else {
        response.sendRedirect("Login.jsp?er=Please Login and Try Again");
    }
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
