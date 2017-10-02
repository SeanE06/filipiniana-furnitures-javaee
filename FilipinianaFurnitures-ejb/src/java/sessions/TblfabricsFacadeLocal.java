/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sessions;

import entities.Tblfabrics;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Publico
 */
@Local
public interface TblfabricsFacadeLocal {

    void create(Tblfabrics tblfabrics);

    void edit(Tblfabrics tblfabrics);

    void remove(Tblfabrics tblfabrics);

    Tblfabrics find(Object id);

    List<Tblfabrics> findAll();

}
