
<%@page import="java.util.List"%>
<%@page import="hibpck.ContainerType"%>
<%@page import="hibpck.ContainerType"%>
<%@page import="hibpck.User"%>
<%@page import="hibpck.Container"%>
<%@page import="org.hibernate.criterion.Restrictions"%>
<%@page import="hibpck.ProductInContainer"%>
<%@page import="org.hibernate.Criteria"%>
<%@page import="org.hibernate.Session"%>
<%@page import="hibpck.poolmanager"%>
<div id="bnr2"></div>
<table border="0">
    <thead>
        <tr>
            <th>Product Type</th>
            <th>Product Name</th>
            <th>Price</th>
            <th>Added Date</th> 
            <th>Remove</th>
            <th>Wishlist</th>
            <th>Cart</th>
        </tr>
    </thead>
    <tbody>
        <%
            User u = (User) request.getSession().getAttribute("user");
            
            Session s = poolmanager.getSessionFactory().openSession();
            
            Criteria cc = s.createCriteria(ContainerType.class);
            cc.add(Restrictions.eq("typeName", "Watchlist"));
            ContainerType ct = (ContainerType) cc.uniqueResult();
            
            Criteria c = s.createCriteria(Container.class);
            c.add(Restrictions.and(Restrictions.eq("user", u), Restrictions.eq("containerType", ct)));
            Container cn = (Container) c.uniqueResult();
            
            Criteria ca = s.createCriteria(ProductInContainer.class);
            ca.add(Restrictions.eq("container", cn));
            List<ProductInContainer> l = ca.list();
            
            for(ProductInContainer p: l){
        %>
        <tr>
            <td><%=p.getProducts().getProductType().getTypeName() %></td>
            <td><%=p.getProducts().getProductName() %></td>
            <td><%=p.getAmount() %></td>
            <td><%=p.getAddedDate() %></td>
            <td><input type="button" value="Delete" onclick="removef(<%=p.getIdpc() %>)"/></td>
            <td><input type="button" value="Add To Wishlist" /></td>
            <td><input type="button" value="Add To Cart" /></td>
        </tr>
        <% } %>
    </tbody>
</table>
