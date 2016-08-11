package servltpck;

import hibpck.Container;
import hibpck.ContainerType;
import hibpck.LoginSession;
import hibpck.ProductInContainer;
import hibpck.SessionActivities;
import hibpck.User;
import hibpck.poolmanager;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class Remove_from_watchlist extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        int lsize;
        try {
            Session s = poolmanager.getSessionFactory().openSession();
            Transaction t = s.beginTransaction();

            if (request.getParameter("idpc") == null) {
                Criteria c3 = s.createCriteria(ProductInContainer.class);
                List<ProductInContainer> l = c3.list();
                lsize = l.get(l.size() - 1).getIdpc();
            } else {
                lsize = Integer.parseInt(request.getParameter("idpc"));
            }


            Date d = (Date) request.getSession().getAttribute("sessiondate");

            Criteria c4 = s.createCriteria(LoginSession.class);
            c4.add(Restrictions.eq("inTime", d));
            LoginSession ls = (LoginSession) c4.uniqueResult();

            User u = (User) request.getSession().getAttribute("user");

            ProductInContainer pic = (ProductInContainer) s.load(ProductInContainer.class, lsize);

            SessionActivities sa = new SessionActivities();

            sa.setActivity(pic.getProducts().getProductName() + " item is deleted from the Watch List by " + u.getFirstName() + " " + u.getLastName() + " (" + u.getIduser() + ") from the container " + pic.getContainer().getIdcontainer());
            sa.setLoginSession(ls);

            s.save(sa);

            Container cn = (Container) pic.getContainer();

            cn.setTotalAmount(cn.getTotalAmount() - pic.getAmount());
            cn.setTotalProducts(cn.getTotalProducts() - 1.0);

            s.update(cn);

            s.delete(pic);

            t.commit();
            out.write("deleted");

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
