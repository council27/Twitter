package service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class EJB
 */
@Stateless
@LocalBean
public class EJB {

   @PersistenceContext
   private EntityManager em;
    public EJB() {
        // TODO Auto-generated constructor stub
    }

}
