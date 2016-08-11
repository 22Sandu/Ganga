<%-- 
    Document   : Homea
    Created on : Oct 14, 2013, 10:33:42 AM
    Author     : Sandu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
        <script type="text/javascript">
            function validateProducts(myform) {
                var pname = myform["pname"].value;
                var qty = myform["qty"].value;
                var price = myform["price"].value;

                var my_boolean = new Boolean();

                my_boolean = true;

                if (pname == "") {
                    my_boolean = false;
                    document.getElementById("msg_pname").innerHTML = "Please insert Product Name";
                    document.getElementById('pname').style.border = '1px solid red';
                } else {
                    document.getElementById("msg_pname").innerHTML = "";
                    document.getElementById('pname').style.border = '';
                }

                if (price == "") {
                    my_boolean = false;
                    document.getElementById("msg_price").innerHTML = "Please insert Unit Price";
                    document.getElementById('price').style.border = '1px solid red';
                } else if (isNaN(price)) {
                    my_boolean = false;
                    document.getElementById("msg_price").innerHTML = "Invalid Unit Price";
                    document.getElementById('price').style.border = '1px solid red';
                } else {
                    document.getElementById("msg_price").innerHTML = "";
                    document.getElementById('price').style.border = '';
                }

                if (qty == "") {
                    my_boolean = false;
                    document.getElementById("msg_qty").innerHTML = "Please insert Quantity";
                    document.getElementById('qty').style.border = '1px solid red';
                } else if (isNaN(qty)) {
                    my_boolean = false;
                    document.getElementById("msg_qty").innerHTML = "Invalid Quantity";
                    document.getElementById('qty').style.border = '1px solid red';
                } else {
                    document.getElementById("msg_qty").innerHTML = "";
                    document.getElementById('qty').style.border = '';
                }

                if (my_boolean == true) {
                    add(myform);
                }
            }

            function add(frm1) {

                var a;

                if (window.XMLHttpRequest) {
                    a = new XMLHttpRequest();
                } else if (window.ActiveXObject) {
                    a = new ActiveXObject("Microsoft.XMLHTTP");
                } else {
                    alert("The browser doesn't support.");
                }

                if (a != null) {
                    a.onreadystatechange = function() {
                        if (a.readyState == 4) {
                            var res = a.responseText;

                            var pname = frm1["pname"].value;
                            var qty = frm1["qty"].value;
                            var price = frm1["price"].value;

                            var table = document.getElementById('tb');

                            var row = table.insertRow(0);

                            var td1 = row.insertCell(0);
                            var td2 = row.insertCell(1);
                            var td3 = row.insertCell(2);
                            var td4 = row.insertCell(3);

                            td1.id = "a" + table.rows.length;
                            td2.id = "b" + table.rows.length;
                            td3.id = "c" + table.rows.length;

                            td1.innerHTML = pname;
                            td2.innerHTML = qty;
                            td3.innerHTML = price;
                            td4.innerHTML = res;

                            frm1["pname"].value = "";
                            frm1["qty"].value = "";
                            frm1["price"].value = "";
                        }
                    }
                }

                a.open("Post", "Button.jsp", true);
                a.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
                a.send();
            }

            function registerProducts() {

                var tbody = document.getElementById('tb');
                var row_count = tbody.rows.length;
                var b;
                var i;
                var pl = "";

                for (i = 1; i <= row_count; i++) {
                    pl += "a" + i + "=" + document.getElementById("a" + i).innerHTML + "&";
                    pl += "b" + i + "=" + document.getElementById("b" + i).innerHTML + "&";
                    pl += "c" + i + "=" + document.getElementById("c" + i).innerHTML + "&";
                }
                pl += "count=" + row_count;

                if (window.XMLHttpRequest) {
                    b = new XMLHttpRequest();
                } else if (window.ActiveXObject) {
                    b = new ActiveXObject("Microsoft.XMLHTTP");
                } else {
                    alert("The browser doesn't support.");
                }

                if (b != null) {
                    b.onreadystatechange = function() {
                        if (b.readyState == 4) {
                            var res = b.responseText;
                            if (res == "ok") {
                                alert("Saved Successfully.");
                                document.getElementById('tb').innerHTML = "";
                            } else {
                                alert("Not Saved Successfully.");

                            }
                        }
                    }
                }

                b.open("Post", "Register_products", true);
                b.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
                b.send(pl);
            }

            function addProducts() {
                var a;

                if (window.XMLHttpRequest) {
                    a = new XMLHttpRequest();
                } else if (window.ActiveXObject) {
                    a = new ActiveXObject("Microsoft.XMLHTTP");
                } else {
                    alert("The browser doesn't support.");
                }

                if (a != null) {
                    a.onreadystatechange = function() {
                        if (a.readyState == 4) {
                            var res = a.responseText;
                            document.getElementById('did').innerHTML = res;
                        }
                    }
                }

                a.open("Post", "Register_products.jsp", true);
                a.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
                a.send();
            }

            function addImages(input) {

                for (x = 0; x < 5; x++) {

                    if (input.files && input.files[x]) {

                        var reader = new FileReader();
                        reader.onload = function(e) {
                            $("#gallery").prepend('<img id="img' + x + '" src="" width="100" height="auto"/>')
                            $('#img' + x).attr('src', e.target.result);
                        }
                    }
                    reader.readAsDataURL(input.files[x]);
                }
            }
        </script>
    </head>
    <body>
        <h1></h1>
        <a href="#" onclick="addProducts()" style="color: crimson; font-style: normal">Add Products</a>
        <hr>
        <div id="did">

        </div>

    </body>
</html>
