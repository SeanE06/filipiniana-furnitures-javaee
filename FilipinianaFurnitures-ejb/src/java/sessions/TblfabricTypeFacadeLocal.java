/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sessions;

import entities.TblfabricType;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Publico
 */
@Local
public interface TblfabricTypeFacadeLocal {

    void create(TblfabricType tblfabricType);

    void edit(TblfabricType tblfabricType);

    void remove(TblfabricType tblfabricType);

    TblfabricType find(Object id);

    List<TblfabricType> findAll();

}
