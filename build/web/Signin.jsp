<%-- 
    Document   : Signin
    Created on : Oct 16, 2013, 4:56:02 PM
    Author     : Sandu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib uri="/struts-tags" prefix="s" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sri Lanka Fruits and Vegetables Producers and Exporters</title>
        <link rel="stylesheet" type="text/css" href="Style_format.css">
    </head>
    <body>
    <center>
        <h1>Sign In Here</h1>
        <hr>
        <s:form action="signin">
            <s:textfield name="ul.email" label="Email"/>
            <s:password name="ul.password" label="Password"/>
            <s:submit value="Sign In"/>
        </s:form>
    </center>
    </body>
</html>