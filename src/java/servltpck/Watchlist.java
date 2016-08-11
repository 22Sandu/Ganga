package servltpck;

import hibpck.Container;
import hibpck.ContainerType;
import hibpck.ProductInContainer;
import hibpck.Products;
import hibpck.SystemStatus;
import hibpck.User;
import hibpck.poolmanager;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class Watchlist extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        try {
            Session s = poolmanager.getSessionFactory().openSession();
            Transaction t = s.beginTransaction();

            User u = (User) request.getSession().getAttribute("user");

            Criteria cc = s.createCriteria(ContainerType.class);
            cc.add(Restrictions.eq("typeName", "Watchlist"));
            ContainerType ct = (ContainerType) cc.uniqueResult();

            Criteria c2 = s.createCriteria(SystemStatus.class);
            c2.add(Restrictions.eq("statusName", "Watched"));
            SystemStatus ss = (SystemStatus) c2.uniqueResult();

            Criteria c = s.createCriteria(Container.class);
            c.add(Restrictions.eq("user", u));
            c.add(Restrictions.eq("containerType", ct));
            Container cn = (Container) c.uniqueResult();

            Criteria c1 = s.createCriteria(Products.class);
            c1.add(Restrictions.eq("idproducts", Integer.parseInt(request.getParameter("pid"))));

            Products p = (Products) c1.uniqueResult();

            ProductInContainer pc = new ProductInContainer();

            pc.setProducts(p);
            pc.setQty(1.0);
            pc.setAmount(p.getUnitPrice() * 1.0);
            pc.setAddedDate(new Date());
            pc.setContainer(cn);
            pc.setSystemStatus(ss);

            s.save(pc);
            t.commit();

        } catch (Exception e) {
            throw new ServletException(e);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
