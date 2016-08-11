/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servltpck;

import hibpck.ProductInContainer;
import hibpck.poolmanager;
import java.util.List;
import javax.servlet.ServletException;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Sandu
 */
public class NewClass {
    public static void main(String[] args) {
        try {
            Session s = poolmanager.getSessionFactory().openSession();
            Transaction t = s.beginTransaction();
            
            Criteria c3 = s.createCriteria(ProductInContainer.class);
            List<ProductInContainer> ls = c3.list();
            System.out.println(ls.size());
            System.out.println(ls.get(35-1).getIdpc());
            


        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
