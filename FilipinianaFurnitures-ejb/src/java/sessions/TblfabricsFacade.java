/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sessions;

import entities.Tblfabrics;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Publico
 */
@Stateless
public class TblfabricsFacade implements TblfabricsFacadeLocal {
    @PersistenceContext
    private EntityManager em;

    public void create(Tblfabrics tblfabrics) {
        em.persist(tblfabrics);
    }

    public void edit(Tblfabrics tblfabrics) {
        em.merge(tblfabrics);
    }

    public void remove(Tblfabrics tblfabrics) {
        em.remove(em.merge(tblfabrics));
    }

    public Tblfabrics find(Object id) {
        return em.find(Tblfabrics.class, id);
    }

    public List<Tblfabrics> findAll() {
        return em.createQuery("select object(o) from Tblfabrics as o").getResultList();
    }

}
