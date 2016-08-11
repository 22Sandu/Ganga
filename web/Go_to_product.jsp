
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.Criteria"%>
<%@page import="org.hibernate.criterion.Restrictions"%>
<%@page import="hibpck.Products"%>
<%@page import="hibpck.poolmanager"%>
<%@page import="hibpck.poolmanager"%>
<div id="head"></div>
<%
    Session s = poolmanager.getSessionFactory().openSession();
    Criteria c = s.createCriteria(Products.class);
    c.add(Restrictions.eq("idproducts", Integer.parseInt(request.getParameter("pid"))));

    Products p = (Products) c.uniqueResult();
%>
<table border="0">
    <tr>
        <td id="bnrid"></td>
    </tr>
    <tr>
        <td><%=p.getProductName()%></td>
    </tr>
    <tr>
        <td><%=p.getQty()%></td>
    </tr>
    <tr>
        <td><%=p.getUnitPrice()%></td>
    </tr>
    <tr>
        <td><%=p.getProductType().getTypeName()%></td>
    </tr>
    <tr>
        <td><input type="submit" value="Add To Watch List" onclick="watchlist(<%=p.getIdproducts()%>)" /></td>
    </tr>
    <tr>
        <td id="erid"></td>
    </tr>
</table>

