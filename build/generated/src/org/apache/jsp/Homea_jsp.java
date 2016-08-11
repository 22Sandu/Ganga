package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Homea_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function validateProducts(myform) {\n");
      out.write("                var pname = myform[\"pname\"].value;\n");
      out.write("                var qty = myform[\"qty\"].value;\n");
      out.write("                var price = myform[\"price\"].value;\n");
      out.write("\n");
      out.write("                var my_boolean = new Boolean();\n");
      out.write("\n");
      out.write("                my_boolean = true;\n");
      out.write("\n");
      out.write("                if (pname == \"\") {\n");
      out.write("                    my_boolean = false;\n");
      out.write("                    document.getElementById(\"msg_pname\").innerHTML = \"Please insert Product Name\";\n");
      out.write("                    document.getElementById('pname').style.border = '1px solid red';\n");
      out.write("                } else {\n");
      out.write("                    document.getElementById(\"msg_pname\").innerHTML = \"\";\n");
      out.write("                    document.getElementById('pname').style.border = '';\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                if (price == \"\") {\n");
      out.write("                    my_boolean = false;\n");
      out.write("                    document.getElementById(\"msg_price\").innerHTML = \"Please insert Unit Price\";\n");
      out.write("                    document.getElementById('price').style.border = '1px solid red';\n");
      out.write("                } else if (isNaN(price)) {\n");
      out.write("                    my_boolean = false;\n");
      out.write("                    document.getElementById(\"msg_price\").innerHTML = \"Invalid Unit Price\";\n");
      out.write("                    document.getElementById('price').style.border = '1px solid red';\n");
      out.write("                } else {\n");
      out.write("                    document.getElementById(\"msg_price\").innerHTML = \"\";\n");
      out.write("                    document.getElementById('price').style.border = '';\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                if (qty == \"\") {\n");
      out.write("                    my_boolean = false;\n");
      out.write("                    document.getElementById(\"msg_qty\").innerHTML = \"Please insert Quantity\";\n");
      out.write("                    document.getElementById('qty').style.border = '1px solid red';\n");
      out.write("                } else if (isNaN(qty)) {\n");
      out.write("                    my_boolean = false;\n");
      out.write("                    document.getElementById(\"msg_qty\").innerHTML = \"Invalid Quantity\";\n");
      out.write("                    document.getElementById('qty').style.border = '1px solid red';\n");
      out.write("                } else {\n");
      out.write("                    document.getElementById(\"msg_qty\").innerHTML = \"\";\n");
      out.write("                    document.getElementById('qty').style.border = '';\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                if (my_boolean == true) {\n");
      out.write("                    add(myform);\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function add(frm1) {\n");
      out.write("\n");
      out.write("                var a;\n");
      out.write("\n");
      out.write("                if (window.XMLHttpRequest) {\n");
      out.write("                    a = new XMLHttpRequest();\n");
      out.write("                } else if (window.ActiveXObject) {\n");
      out.write("                    a = new ActiveXObject(\"Microsoft.XMLHTTP\");\n");
      out.write("                } else {\n");
      out.write("                    alert(\"The browser doesn't support.\");\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                if (a != null) {\n");
      out.write("                    a.onreadystatechange = function() {\n");
      out.write("                        if (a.readyState == 4) {\n");
      out.write("                            var res = a.responseText;\n");
      out.write("\n");
      out.write("                            var pname = frm1[\"pname\"].value;\n");
      out.write("                            var qty = frm1[\"qty\"].value;\n");
      out.write("                            var price = frm1[\"price\"].value;\n");
      out.write("\n");
      out.write("                            var table = document.getElementById('tb');\n");
      out.write("\n");
      out.write("                            var row = table.insertRow(0);\n");
      out.write("\n");
      out.write("                            var td1 = row.insertCell(0);\n");
      out.write("                            var td2 = row.insertCell(1);\n");
      out.write("                            var td3 = row.insertCell(2);\n");
      out.write("                            var td4 = row.insertCell(3);\n");
      out.write("\n");
      out.write("                            td1.id = \"a\" + table.rows.length;\n");
      out.write("                            td2.id = \"b\" + table.rows.length;\n");
      out.write("                            td3.id = \"c\" + table.rows.length;\n");
      out.write("\n");
      out.write("                            td1.innerHTML = pname;\n");
      out.write("                            td2.innerHTML = qty;\n");
      out.write("                            td3.innerHTML = price;\n");
      out.write("                            td4.innerHTML = res;\n");
      out.write("\n");
      out.write("                            frm1[\"pname\"].value = \"\";\n");
      out.write("                            frm1[\"qty\"].value = \"\";\n");
      out.write("                            frm1[\"price\"].value = \"\";\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                a.open(\"Post\", \"Button.jsp\", true);\n");
      out.write("                a.setRequestHeader(\"Content-Type\", \"application/x-www-form-urlencoded\");\n");
      out.write("                a.send();\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function registerProducts() {\n");
      out.write("\n");
      out.write("                var tbody = document.getElementById('tb');\n");
      out.write("                var row_count = tbody.rows.length;\n");
      out.write("                var b;\n");
      out.write("                var i;\n");
      out.write("                var pl = \"\";\n");
      out.write("\n");
      out.write("                for (i = 1; i <= row_count; i++) {\n");
      out.write("                    pl += \"a\" + i + \"=\" + document.getElementById(\"a\" + i).innerHTML + \"&\";\n");
      out.write("                    pl += \"b\" + i + \"=\" + document.getElementById(\"b\" + i).innerHTML + \"&\";\n");
      out.write("                    pl += \"c\" + i + \"=\" + document.getElementById(\"c\" + i).innerHTML + \"&\";\n");
      out.write("                }\n");
      out.write("                pl += \"count=\" + row_count;\n");
      out.write("\n");
      out.write("                if (window.XMLHttpRequest) {\n");
      out.write("                    b = new XMLHttpRequest();\n");
      out.write("                } else if (window.ActiveXObject) {\n");
      out.write("                    b = new ActiveXObject(\"Microsoft.XMLHTTP\");\n");
      out.write("                } else {\n");
      out.write("                    alert(\"The browser doesn't support.\");\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                if (b != null) {\n");
      out.write("                    b.onreadystatechange = function() {\n");
      out.write("                        if (b.readyState == 4) {\n");
      out.write("                            var res = b.responseText;\n");
      out.write("                            if (res == \"ok\") {\n");
      out.write("                                alert(\"Saved Successfully.\");\n");
      out.write("                                document.getElementById('tb').innerHTML = \"\";\n");
      out.write("                            } else {\n");
      out.write("                                alert(\"Not Saved Successfully.\");\n");
      out.write("\n");
      out.write("                            }\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                b.open(\"Post\", \"Register_products\", true);\n");
      out.write("                b.setRequestHeader(\"Content-Type\", \"application/x-www-form-urlencoded\");\n");
      out.write("                b.send(pl);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function addProducts() {\n");
      out.write("                var a;\n");
      out.write("\n");
      out.write("                if (window.XMLHttpRequest) {\n");
      out.write("                    a = new XMLHttpRequest();\n");
      out.write("                } else if (window.ActiveXObject) {\n");
      out.write("                    a = new ActiveXObject(\"Microsoft.XMLHTTP\");\n");
      out.write("                } else {\n");
      out.write("                    alert(\"The browser doesn't support.\");\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                if (a != null) {\n");
      out.write("                    a.onreadystatechange = function() {\n");
      out.write("                        if (a.readyState == 4) {\n");
      out.write("                            var res = a.responseText;\n");
      out.write("                            document.getElementById('did').innerHTML = res;\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                a.open(\"Post\", \"Register_products.jsp\", true);\n");
      out.write("                a.setRequestHeader(\"Content-Type\", \"application/x-www-form-urlencoded\");\n");
      out.write("                a.send();\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function addImages(input) {\n");
      out.write("\n");
      out.write("                for (x = 0; x < 5; x++) {\n");
      out.write("\n");
      out.write("                    if (input.files && input.files[x]) {\n");
      out.write("\n");
      out.write("                        var reader = new FileReader();\n");
      out.write("                        reader.onload = function(e) {\n");
      out.write("                            $(\"#gallery\").prepend('<img id=\"img' + x + '\" src=\"\" width=\"100\" height=\"auto\"/>')\n");
      out.write("                            $('#img' + x).attr('src', e.target.result);\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                    reader.readAsDataURL(input.files[x]);\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1></h1>\n");
      out.write("        <a href=\"#\" onclick=\"addProducts()\" style=\"color: crimson; font-style: normal\">Add Products</a>\n");
      out.write("        <hr>\n");
      out.write("        <div id=\"did\">\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
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
