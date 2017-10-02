/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sessions;

import entities.Tblframeworks;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Publico
 */
@Local
public interface TblframeworksFacadeLocal {

    void create(Tblframeworks tblframeworks);

    void edit(Tblframeworks tblframeworks);

    void remove(Tblframeworks tblframeworks);

    Tblframeworks find(Object id);

    List<Tblframeworks> findAll();

}
