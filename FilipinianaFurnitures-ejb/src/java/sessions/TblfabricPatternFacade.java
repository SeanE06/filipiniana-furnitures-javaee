/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sessions;

import entities.TblfabricPattern;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Publico
 */
@Stateless
public class TblfabricPatternFacade implements TblfabricPatternFacadeLocal {
    @PersistenceContext
    private EntityManager em;

    public void create(TblfabricPattern tblfabricPattern) {
        em.persist(tblfabricPattern);
    }

    public void edit(TblfabricPattern tblfabricPattern) {
        em.merge(tblfabricPattern);
    }

    public void remove(TblfabricPattern tblfabricPattern) {
        em.remove(em.merge(tblfabricPattern));
    }

    public TblfabricPattern find(Object id) {
        return em.find(TblfabricPattern.class, id);
    }

    public List<TblfabricPattern> findAll() {
        return em.createQuery("select object(o) from TblfabricPattern as o").getResultList();
    }

}
