/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sessions;

import entities.Tblframeworks;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Publico
 */
@Stateless
public class TblframeworksFacade implements TblframeworksFacadeLocal {
    @PersistenceContext
    private EntityManager em;

    public void create(Tblframeworks tblframeworks) {
        em.persist(tblframeworks);
    }

    public void edit(Tblframeworks tblframeworks) {
        em.merge(tblframeworks);
    }

    public void remove(Tblframeworks tblframeworks) {
        em.remove(em.merge(tblframeworks));
    }

    public Tblframeworks find(Object id) {
        return em.find(Tblframeworks.class, id);
    }

    public List<Tblframeworks> findAll() {
        return em.createQuery("select object(o) from Tblframeworks as o").getResultList();
    }

}
