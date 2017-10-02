/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sessions;

import entities.TblframeDesign;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Publico
 */
@Stateless
public class TblframeDesignFacade implements TblframeDesignFacadeLocal {
    @PersistenceContext
    private EntityManager em;

    public void create(TblframeDesign tblframeDesign) {
        em.persist(tblframeDesign);
    }

    public void edit(TblframeDesign tblframeDesign) {
        em.merge(tblframeDesign);
    }

    public void remove(TblframeDesign tblframeDesign) {
        em.remove(em.merge(tblframeDesign));
    }

    public TblframeDesign find(Object id) {
        return em.find(TblframeDesign.class, id);
    }

    public List<TblframeDesign> findAll() {
        return em.createQuery("select object(o) from TblframeDesign as o").getResultList();
    }

}
