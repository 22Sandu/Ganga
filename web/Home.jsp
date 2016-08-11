<%-- 
    Document   : Home
    Created on : Oct 5, 2013, 2:16:10 PM
    Author     : Sandu
--%>

<%@page import="hibpck.User"%>
<%@page import="hibpck.ProductType"%>
<%@page import="java.util.List"%>
<%@page import="hibpck.UserType"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.Criteria"%>
<%@page import="hibpck.poolmanager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    if (request.getSession().getAttribute("user") != null) {
%>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="html.css">
        <link rel="stylesheet" type="text/css" href="layout.css">
        <link rel="stylesheet" type="text/css" href="print.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sri Lanka Fruits and Vegetables Producers and Exporters</title>
        <script type="text/javascript">
            function search() {
                var a;
                var pname = document.getElementById('pname').value;
                var category = document.getElementById('combo').value;

                if (window.XMLHttpRequest) {
                    a = new XMLHttpRequest();
                } else if (window.ActiveXObject) {
                    a = new ActiveXObject("Microsoft.XMLHTTP");
                } else {
                    alert("The Browser doesn't Support");
                }

                if (a != null) {
                    a.onreadystatechange = function() {
                        if (a.readyState == 4) {
                            var res = a.responseText;
                            document.getElementById('divid').innerHTML = res;
                        }
                    }
                }
                a.open("POST", "Search_results.jsp", true);
                a.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
                a.send("pname=" + pname + "&category=" + category + "");
            }

            function goToProduct(pid) {
                var a;

                if (window.XMLHttpRequest) {
                    a = new XMLHttpRequest();
                } else if (window.ActiveXObject) {
                    a = new ActiveXObject("Microsoft.XMLHTTP");
                } else {
                    alert("The Browser doesn't Support");
                }

                if (a != null) {
                    a.onreadystatechange = function() {
                        if (a.readyState == 4) {
                            var res = a.responseText;
                            document.getElementById('divid').innerHTML = res;
                        }
                    }
                }
                a.open("POST", "Go_to_product.jsp", true);
                a.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
                a.send("pid=" + pid + "");
            }

            function viewCart() {
                var a;

                if (window.XMLHttpRequest) {
                    a = new XMLHttpRequest();
                } else if (window.ActiveXObject) {
                    a = new ActiveXObject("Microsoft.XMLHTTP");
                } else {
                    alert("The Browser doesn't Support");
                }

                if (a != null) {
                    a.onreadystatechange = function() {
                        if (a.readyState == 4) {
                            var res = a.responseText;
                            document.getElementById('divid').innerHTML = res;
                        }
                    }
                }
                a.open("POST", "View_cart.jsp", true);
                a.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
                a.send("pid=" + pid + "");
            }

            function watchlist(pid) {
                var a;
                document.getElementById('erid').innerHTML = "";
                document.getElementById('bnrid').innerHTML = "";

                if (window.XMLHttpRequest) {
                    a = new XMLHttpRequest();
                } else if (window.ActiveXObject) {
                    a = new ActiveXObject("Microsoft.XMLHTTP");
                } else {
                    alert("The Browser doesn't Support");
                }

                if (a !== null) {
                    a.onreadystatechange = function() {
                        if (a.readyState === 4) {
                            var res = a.responseText;
                            if (res === "exist") {
                                document.getElementById('erid').innerHTML = "This Product is already addes to your Watch List";
                            } else if (res === "added")
                                document.getElementById('bnrid').innerHTML = 'Added to your Watch List | <a href="#" onclick="removef()" >Remove</a>';
                        }
                    }
                }
                a.open("POST", "Add_to_watchlist", true);
                a.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
                a.send("pid=" + pid + "");
            }

            function removef() {
                var a;
                document.getElementById('erid').innerHTML = "";
                document.getElementById('bnrid').innerHTML = "";

                if (window.XMLHttpRequest) {
                    a = new XMLHttpRequest();
                } else if (window.ActiveXObject) {
                    a = new ActiveXObject("Microsoft.XMLHTTP");
                } else {
                    alert("The Browser doesn't Support");
                }

                if (a !== null) {
                    a.onreadystatechange = function() {
                        if (a.readyState === 4) {
                            var res = a.responseText;
                            if (res === "deleted") {
                                document.getElementById('bnrid').innerHTML = "Removed Successfully.";
                            } else {
                                document.getElementById('bnrid').innerHTML = "Cannot be removed."
                            }
                        }
                    }
                }
                a.open("POST", "Remove_from_watchlist", true);
                a.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
                a.send();
            }

            function handleSelect(elm){
                window.location = "My_account.jsp?elm="+elm.value+"";
            }
        </script>
    </head>
    <body>
        <%
            User u = (User) request.getSession().getAttribute("user");
            if (u != null) {
                if (u.getUserType().getTypeName().equals("Buyer")) {
        %>
        <table border="0">
            <tr>
                <td>Hi <%=u.getFirstName() + " " + u.getLastName()%>,</td>
                <td></td>
                <td><a href="">Sign In</a> or <a href="">Register</a></td>
                <td></td>
                <td></td>
                <td><select name="my_account" title="My Account" onchange="javascript:handleSelect(this)">
                        <option value="viewAccount">My Account</option>
                        <option value="viewSummary">Summary</option>
                        <option value="viewWatchlist">Watch List</option>
                        <option value="viewWishlist">Wishlist</option>
                        <option value="viewPurchaseHistory">Purchase History</option>
                    </select></td>
                <td></td>
                <td><a href="#" onclick="viewCart()">Cart</a></td>
            </tr>
        </table>
        <hr>
        <% } else if (u.getUserType().getTypeName().equals("Admin")) {%>
        <table border="0">
            <tr>
                <td>Hi <%=u.getFirstName() + " " + u.getLastName()%>,</td>
                <td></td>
                <td></td>
                <td></td>
                <td>Products</td>
                <td></td>
                <td>Users</td>
            </tr>
        </table>
        <hr>
        <% }
        } else {%>
        <table border="0">
            <tr>
                <td>Hi User,</td>
                <td></td>
                <td><a href="">Sign In</a> or <a href="">Register</a></td>
                <td></td>
                <td></td>
                <td>My Account</td>
                <td></td>
                <td><a href="Login.jsp">Cart</a></td>
            </tr>
        </table>
        <hr>
        <% }%>
    <center>
        <br><br>
        <input type="text" name="search" value="" style="font-size: 20px;" id="pname" />
        <select name="" style="border: activeborder;" id="combo">
            <option id="all">All Categories</option>
            <%
                Session s = poolmanager.getSessionFactory().openSession();
                Criteria c = s.createCriteria(ProductType.class);
                List<ProductType> l = c.list();
                for (ProductType pt : l) {
            %>
            <option id="<%=pt.getIdproductType()%>"><%=pt.getTypeName()%></option>
            <% }%> 
            <input type="submit" value="Search" name="search" style="font-size: 20px" onclick="search()" />
        </select>
        <div id="divid">

        </div>
    </center>
</body>
</html>
<% } else {
        response.sendRedirect("Login.jsp?er=Please Login and Try Again");
    }%>