<%@page import="java.util.List"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.Criteria"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.Criteria"%>
<%@page import="hibpck.UserType"%>
<%@page import="hibpck.poolmanager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<body>
<center>
    <h3>Register Your Products Here!!</h3>   <br><br>
    <table border="1">
        <thead>
            <tr>
                <th>Product Name</th>
                <th>Quantity</th>
                <th>Unit Price</th>
                <th>Images</th>
            </tr>
        </thead>
        <tbody id="tb">

        </tbody>
    </table>
    <input type="submit" value="Save" onclick="registerProducts()"/>
    <hr>
    <form method="POST" id="testform" onsubmit="validateProducts(this);
            return false;" action="" enctype="multipart/form-data">
        <table border="0">                              
            <tr>
                <td>Product Name</td>
                <td>:</td>
                <td><input type="text" name="pname" value="" id="pname" style="width: 200px; border-color: lightgray" /></td>
                <td id="msg_pname" style="color: red; font-size: 10px "></td>
            </tr>
            <tr>
                <td></td> 
            </tr>                
            <tr>
                <td>Quantity</td>
                <td>:</td>
                <td><input type="text" name="qty" value="" id="qty" style="width: 200px;" /></td>
                <td id="msg_qty" style="color: red; font-size: 10px "></td>
            </tr>
            <tr>
                <td></td>
            </tr>
            <tr>
                <td>Unit Price</td>
                <td>:</td>
                <td><input type="text" name="price" value="" id="price" style="width: 200px;" /></td>
                <td id="msg_price" style="color: red; font-size: 10px "></td>
            </tr>
            <tr>
                <td></td>
            </tr>               
            <tr>
                <td colspan="3" align="center"><input type="submit" value="Add" name="add" style="background-color: burlywood; font: bold;color: brown" /></td>
            </tr>
            <tr>
                <td></td>
            </tr>               
            <tr>
                <td colspan="3" align="center" id="msg" style="color: red; font-size: 10px "></td>
            </tr>               
        </table>
    </form>
</center>
</body>