<%-- 
    Document   : My_account
    Created on : Oct 20, 2013, 6:46:50 PM
    Author     : Sandu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sri Lanka Fruits and Vegetables Producers and Exporters</title>
        <script type="text/javascript">
            function loadPage(elm) {
                var a;
                alert(elm)

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
                            document.getElementById('acnt').innerHTML = res;
                        }
                    }
                }
                a.open("POST", "" + elm + ".jsp", true);
                a.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
                a.send();
            }
            
            function removef(idpc) {
                var a;

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
                                document.getElementById('bnr2').innerHTML = "Item Deleted Successfully.";
                                loadPage('viewWatchlist');
                            } else {
                                document.getElementById('bnr2').innerHTML = "Cannot be Deleted."
                            }
                        }
                    }
                }
                a.open("POST", "Remove_from_watchlist", true);
                a.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
                a.send("idpc="+idpc+"");
            }
        </script>
    </head>
    <body onload="loadPage('<%=request.getParameter("elm")%>')">
    <center>
        <h2>My Account</h2>
        <hr>
        <div id="acnt"></div>
    </center>
</body>
</html>
