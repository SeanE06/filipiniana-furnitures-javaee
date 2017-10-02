/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sessions;

import entities.TblfabricPattern;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Publico
 */
@Local
public interface TblfabricPatternFacadeLocal {

    void create(TblfabricPattern tblfabricPattern);

    void edit(TblfabricPattern tblfabricPattern);

    void remove(TblfabricPattern tblfabricPattern);

    TblfabricPattern find(Object id);

    List<TblfabricPattern> findAll();

}
