package servltpck;

import hibpck.LoginSession;
import hibpck.SystemStatus;
import hibpck.UserLogin;
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

public class Signin extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        try {
            Session s = poolmanager.getSessionFactory().openSession();
            Transaction t = s.beginTransaction();

            Criteria c = s.createCriteria(UserLogin.class);
            c.add(Restrictions.eq("email", request.getParameter("email")));
            UserLogin ul = (UserLogin) c.uniqueResult();

            Criteria c2 = s.createCriteria(SystemStatus.class);
            c2.add(Restrictions.eq("statusName", "Suspended"));
            SystemStatus ss = (SystemStatus) c2.uniqueResult();

            if (ul == null) {
                out.write("email");
            } else if (!Security.decrypt(ul.getPassword()).equals(request.getParameter("password"))) {
                int count = 0;

                if (request.getSession().getAttribute("login_count") == null) {
                    request.getSession().setAttribute("login_count", 1);
                    count = 1;
                } else {
                    count = Integer.parseInt(request.getSession().getAttribute("login_count").toString());
                    count++;
                    request.getSession().setAttribute("login_count", count);
                }

                if (count == 3) {
                    ul.getUser().setSystemStatus(ss);
                    ul.setSystemStatus(ss);
                    s.update(ul);
                    out.write("suspended");
                } else {
                    out.write("password");
                }


            } else {
                if (ul.getSystemStatus().getStatusName().equals("Active")) {
                    request.getSession().invalidate();
                    request.getSession().setAttribute("user", ul.getUser());
                    if (ul.getUser().getUserType().getIduserType() == 1) {
                        LoginSession l = new LoginSession();

                        Date d = new Date();
                        
                        l.setInTime(d);
                        l.setOutTime(d);
                        l.setIpAddress(request.getRemoteAddr());
                        l.setUserLogin(ul);

                        s.save(l);
                        
                        request.getSession().setAttribute("sessiondate", d);

                        out.write("oka");
                    } else if (ul.getUser().getUserType().getIduserType() == 2) {
                        LoginSession l = new LoginSession();

                        Date d = new Date();
                        
                        l.setInTime(d);
                        l.setOutTime(d);
                        l.setIpAddress(request.getRemoteAddr());
                        l.setUserLogin(ul);

                        s.save(l);
                        
                        request.getSession().setAttribute("sessiondate", d);

                        out.write("okb");
                    } else {
                        out.write("eror");
                    }

                } else {
                    out.write("suspended");
                }
            }
            t.commit();

        } catch (Exception e) {
            throw new ServletException(e);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
