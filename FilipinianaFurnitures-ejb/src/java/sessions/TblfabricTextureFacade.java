/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sessions;

import entities.TblfabricTexture;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Publico
 */
@Stateless
public class TblfabricTextureFacade implements TblfabricTextureFacadeLocal {
    @PersistenceContext
    private EntityManager em;

    public void create(TblfabricTexture tblfabricTexture) {
        em.persist(tblfabricTexture);
    }

    public void edit(TblfabricTexture tblfabricTexture) {
        em.merge(tblfabricTexture);
    }

    public void remove(TblfabricTexture tblfabricTexture) {
        em.remove(em.merge(tblfabricTexture));
    }

    public TblfabricTexture find(Object id) {
        return em.find(TblfabricTexture.class, id);
    }

    public List<TblfabricTexture> findAll() {
        return em.createQuery("select object(o) from TblfabricTexture as o").getResultList();
    }

}
