/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sessions;

import entities.TblframeMaterial;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Publico
 */
@Local
public interface TblframeMaterialFacadeLocal {

    void create(TblframeMaterial tblframeMaterial);

    void edit(TblframeMaterial tblframeMaterial);

    void remove(TblframeMaterial tblframeMaterial);

    TblframeMaterial find(Object id);

    List<TblframeMaterial> findAll();

}
