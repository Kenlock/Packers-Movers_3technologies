/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package statelesspack;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author dell
 */
@Local
public interface RegisterusersFacadeLocal {

    void create(Registerusers registerusers);

    void edit(Registerusers registerusers);

    void remove(Registerusers registerusers);

    Registerusers find(Object id);

    List<Registerusers> findAll();

    List<Registerusers> findRange(int[] range);

    int count();

    String insertion(String name, String mobile, String email, String user, String pass);
    
}
