/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sessions;

import entities.TblfabricType;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Publico
 */
@Stateless
public class TblfabricTypeFacade implements TblfabricTypeFacadeLocal {
    @PersistenceContext
    private EntityManager em;

    public void create(TblfabricType tblfabricType) {
        em.persist(tblfabricType);
    }

    public void edit(TblfabricType tblfabricType) {
        em.merge(tblfabricType);
    }

    public void remove(TblfabricType tblfabricType) {
        em.remove(em.merge(tblfabricType));
    }

    public TblfabricType find(Object id) {
        return em.find(TblfabricType.class, id);
    }

    public List<TblfabricType> findAll() {
        return em.createQuery("select object(o) from TblfabricType as o").getResultList();
    }

}
