
<%@page import="hibpck.ProductType"%>
<%@page import="javax.sound.midi.Soundbank"%>
<%@page import="org.hibernate.Criteria"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.criterion.Restrictions"%>
<%@page import="java.util.List"%>
<%@page import="hibpck.Products"%>
<%@page import="hibpck.Products"%>
<%@page import="hibpck.poolmanager"%>
<%@page import="hibpck.poolmanager"%>


<%
    Session s = poolmanager.getSessionFactory().openSession();

    Criteria c1 = s.createCriteria(ProductType.class);
    c1.add(Restrictions.eq("typeName", request.getParameter("category")));
    ProductType pt = (ProductType) c1.uniqueResult();

    if (pt != null) {

        Criteria c = s.createCriteria(Products.class);
        c.add(Restrictions.like("productName", "%" + request.getParameter("pname") + "%"));
        c.add(Restrictions.eq("productType", pt));

        List<Products> l = c.list();
        if (l.size() != 0) {
%>

<table border="0">
    <th>name</th>
    <th>qty</th>
    <th>price</th>

    <%
            for (Products p : l) {
    %>
    <tr>
        <td><a href="#" onclick="goToProduct(<%=p.getIdproducts() %>)"><%=p.getProductName()%></a></td>
        <td><%=p.getQty()%></td>               
        <td><%=p.getUnitPrice()%></td>
        <td><%=l.size()%></td>
    </tr>
    <%     }%>    
</table>
<%   } else {%>
<div>No results</div>
<% }
  } else {
    Criteria c2 = s.createCriteria(Products.class);
    c2.add(Restrictions.like("productName", "%" + request.getParameter("pname") + "%"));

    List<Products> l1 = c2.list();
    if (l1.size() != 0) {
%> 
<table border="0">
    <th>name</th>
    <th>qty</th>
    <th>price</th>

    <%
        for (Products p2 : l1) {
    %>
    <tr>
        <td><a href="#" onclick="goToProduct(<%=p2.getIdproducts() %>)"><%=p2.getProductName()%></a></td>
        <td><%=p2.getQty()%></td>               
        <td><%=p2.getUnitPrice()%></td>
        <td><%=l1.size()%></td>
    </tr>
    <% }%>    
</table>
<% } else {%>
<div>No results</div>
<% } }%>