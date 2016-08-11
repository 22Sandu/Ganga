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
      out.write("        <title>Sri Lanka Fruits and Vegetables Producers and Exporters</title>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function signIn(frm) {\n");
      out.write("                var a;\n");
      out.write("                var email = frm[\"email\"].value;\n");
      out.write("                var password = frm[\"password\"].value;\n");
      out.write("\n");
      out.write("                if (window.XMLHttpRequest) {\n");
      out.write("                    a = new XMLHttpRequest();\n");
      out.write("                } else if (window.ActiveXObject) {\n");
      out.write("                    a = new ActiveXObject(\"Microsoft.XMLHTTP\");\n");
      out.write("                } else {\n");
      out.write("                    alert(\"The browser doesn't support.\");\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                if (a !== null) {\n");
      out.write("                    a.onreadystatechange = function() {\n");
      out.write("                        if (a.readyState === 4) {\n");
      out.write("                            var res = a.responseText;\n");
      out.write("\n");
      out.write("                            if (res === \"email\") {\n");
      out.write("                                document.getElementById(\"msg_email\").innerHTML = \"Invalid Email Address\";\n");
      out.write("                                document.getElementById('email').style.border = '1px solid lime';\n");
      out.write("                            } else if (res === \"password\") {\n");
      out.write("                                document.getElementById(\"msg_password\").innerHTML = \"Invalid Password\";\n");
      out.write("                                document.getElementById('password').style.border = '1px solid lime';\n");
      out.write("                            } else if (res === \"suspended\") {\n");
      out.write("                                document.getElementById(\"msg\").innerHTML = \"Your Account has been Suspended. Please contact the Administrator\";\n");
      out.write("                            } else\n");
      out.write("                            if (res === \"oka\") {\n");
      out.write("                                frm[\"email\"].value = \"\";\n");
      out.write("                                frm[\"password\"].value = \"\";\n");
      out.write("                                window.location = \"Homea.jsp\";\n");
      out.write("                            } else if (res === \"okb\") {\n");
      out.write("                                frm[\"email\"].value = \"\";\n");
      out.write("                                frm[\"password\"].value = \"\";\n");
      out.write("                                window.location = \"Home.jsp\";\n");
      out.write("                            } else {\n");
      out.write("                                alert(\"Error\");\n");
      out.write("                            }\n");
      out.write("\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    a.open(\"Post\", \"Signin\", true);\n");
      out.write("                    a.setRequestHeader(\"Content-Type\", \"application/x-www-form-urlencoded\");\n");
      out.write("                    a.send(\"email=\" + email + \"&password=\" + password + \"\");\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            function validateSignIn(myform) {\n");
      out.write("                var email = myform[\"email\"].value;\n");
      out.write("                var password = myform[\"password\"].value;\n");
      out.write("\n");
      out.write("                var my_boolean = new Boolean();\n");
      out.write("\n");
      out.write("                my_boolean = true;\n");
      out.write("\n");
      out.write("                if (email == \"\") {\n");
      out.write("                    my_boolean = false;\n");
      out.write("                    document.getElementById(\"msg_email\").innerHTML = \"Please insert Email\";\n");
      out.write("                    document.getElementById('email').style.border = '1px solid red';\n");
      out.write("                } else {\n");
      out.write("                    document.getElementById(\"msg_email\").innerHTML = \"\";\n");
      out.write("                    document.getElementById('email').style.border = '';\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                if (password == \"\") {\n");
      out.write("                    my_boolean = false;\n");
      out.write("                    document.getElementById(\"msg_password\").innerHTML = \"Please insert Password\";\n");
      out.write("                    document.getElementById('password').style.border = '1px solid red';\n");
      out.write("                } else {\n");
      out.write("                    document.getElementById(\"msg_password\").innerHTML = \"\";\n");
      out.write("                    document.getElementById('password').style.border = '';\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                if (my_boolean == true) {\n");
      out.write("                    signIn(myform);\n");
      out.write("                }\n");
      out.write("\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>        \n");
      out.write("    <center>\n");
      out.write("        <h1>Sign In Here</h1>   \n");
      out.write("        <hr>\n");
      out.write("        <form method=\"POST\" id=\"testform\" onsubmit=\"validateSignIn(this);\n");
      out.write("                return false;\" action=\"\">\n");
      out.write("            <table border=\"0\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>Email</td>\n");
      out.write("                    <td>:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"email\" value=\"\" id=\"email\" style=\"width: 200px;\" /></td>\n");
      out.write("                    <td id=\"msg_email\" style=\"color: red; font-size: 10px \"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Password</td>\n");
      out.write("                    <td>:</td>\n");
      out.write("                    <td><input type=\"password\" name=\"password\" value=\"\" id=\"password\" style=\"width: 200px;\" /></td>\n");
      out.write("                    <td id=\"msg_password\" style=\"color: red; font-size: 10px \"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td></td>\n");
      out.write("                </tr>     \n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"3\" align=\"center\"><input type=\"submit\" value=\"Sign In\" name=\"signin\" style=\"font: bold;\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td></td>\n");
      out.write("                </tr>               \n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"3\" align=\"center\" id=\"msg\" style=\"color: red; \"></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            <div style=\"color: red\">");
 
            if(request.getParameter("er") != null){
                out.write(request.getParameter("er"));
            } 
      out.write("</div>\n");
      out.write("        </form>\n");
      out.write("    </center>\n");
      out.write("</body>\n");
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
