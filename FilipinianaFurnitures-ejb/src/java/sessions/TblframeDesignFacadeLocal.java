/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sessions;

import entities.TblframeDesign;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Publico
 */
@Local
public interface TblframeDesignFacadeLocal {

    void create(TblframeDesign tblframeDesign);

    void edit(TblframeDesign tblframeDesign);

    void remove(TblframeDesign tblframeDesign);

    TblframeDesign find(Object id);

    List<TblframeDesign> findAll();

}
