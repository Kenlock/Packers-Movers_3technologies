/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package statelesspack;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author dell
 */
@Stateless
public class RegisterusersFacade extends AbstractFacade<Registerusers> implements RegisterusersFacadeLocal {
    @PersistenceContext(unitName = "MadhuCPM-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RegisterusersFacade() {
        super(Registerusers.class);
    }

    @Override
    public String insertion(String name, String mobile, String email, String user, String pass) {
        String msg = null;
        try 
        {
            Registerusers addnew = new Registerusers();
            addnew.setName(name);
            addnew.setMobileno(mobile);
            addnew.setEmailid(email);
            addnew.setUsername(user);
            addnew.setPassword(pass);
            em.persist(addnew);
            msg="true";
        }
        catch(Exception e)
        {
          msg=e.getMessage(); 
           
           
        }
        return msg;
    
                
    }
    
}
