<%-- 
    Document   : Login
    Created on : Sep 26, 2013, 8:47:04 PM
    Author     : Sandu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sri Lanka Fruits and Vegetables Producers and Exporters</title>
        <script type="text/javascript">
            function signIn(frm) {
                var a;
                var email = frm["email"].value;
                var password = frm["password"].value;

                if (window.XMLHttpRequest) {
                    a = new XMLHttpRequest();
                } else if (window.ActiveXObject) {
                    a = new ActiveXObject("Microsoft.XMLHTTP");
                } else {
                    alert("The browser doesn't support.");
                }

                if (a !== null) {
                    a.onreadystatechange = function() {
                        if (a.readyState === 4) {
                            var res = a.responseText;

                            if (res === "email") {
                                document.getElementById("msg_email").innerHTML = "Invalid Email Address";
                                document.getElementById('email').style.border = '1px solid lime';
                            } else if (res === "password") {
                                document.getElementById("msg_password").innerHTML = "Invalid Password";
                                document.getElementById('password').style.border = '1px solid lime';
                            } else if (res === "suspended") {
                                document.getElementById("msg").innerHTML = "Your Account has been Suspended. Please contact the Administrator";
                            } else
                            if (res === "oka") {
                                frm["email"].value = "";
                                frm["password"].value = "";
                                window.location = "Homea.jsp";
                            } else if (res === "okb") {
                                frm["email"].value = "";
                                frm["password"].value = "";
                                window.location = "Home.jsp";
                            } else {
                                alert("Error");
                            }

                        }
                    }

                    a.open("Post", "Signin", true);
                    a.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
                    a.send("email=" + email + "&password=" + password + "");
                }
            }


            function validateSignIn(myform) {
                var email = myform["email"].value;
                var password = myform["password"].value;

                var my_boolean = new Boolean();

                my_boolean = true;

                if (email == "") {
                    my_boolean = false;
                    document.getElementById("msg_email").innerHTML = "Please insert Email";
                    document.getElementById('email').style.border = '1px solid red';
                } else {
                    document.getElementById("msg_email").innerHTML = "";
                    document.getElementById('email').style.border = '';
                }

                if (password == "") {
                    my_boolean = false;
                    document.getElementById("msg_password").innerHTML = "Please insert Password";
                    document.getElementById('password').style.border = '1px solid red';
                } else {
                    document.getElementById("msg_password").innerHTML = "";
                    document.getElementById('password').style.border = '';
                }

                if (my_boolean == true) {
                    signIn(myform);
                }

            }
        </script>
    </head>
    <body>        
    <center>
        <h1>Sign In Here</h1>   
        <hr>
        <form method="POST" id="testform" onsubmit="validateSignIn(this);
                return false;" action="">
            <table border="0">
                <tr>
                    <td>Email</td>
                    <td>:</td>
                    <td><input type="text" name="email" value="" id="email" style="width: 200px;" /></td>
                    <td id="msg_email" style="color: red; font-size: 10px "></td>
                </tr>
                <tr>
                    <td></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td>:</td>
                    <td><input type="password" name="password" value="" id="password" style="width: 200px;" /></td>
                    <td id="msg_password" style="color: red; font-size: 10px "></td>
                </tr>
                <tr>
                    <td></td>
                </tr>     
                <tr>
                    <td colspan="3" align="center"><input type="submit" value="Sign In" name="signin" style="font: bold;" /></td>
                </tr>
                <tr>
                    <td></td>
                </tr>               
                <tr>
                    <td colspan="3" align="center" id="msg" style="color: red; "></td>
                </tr>
            </table>
            <div style="color: red"><% 
            if(request.getParameter("er") != null){
                out.write(request.getParameter("er"));
            } %></div>
        </form>
    </center>
</body>
</html>
