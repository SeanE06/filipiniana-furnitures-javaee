/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sessions;

import entities.TblframeMaterial;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Publico
 */
@Stateless
public class TblframeMaterialFacade implements TblframeMaterialFacadeLocal {
    @PersistenceContext
    private EntityManager em;

    public void create(TblframeMaterial tblframeMaterial) {
        em.persist(tblframeMaterial);
    }

    public void edit(TblframeMaterial tblframeMaterial) {
        em.merge(tblframeMaterial);
    }

    public void remove(TblframeMaterial tblframeMaterial) {
        em.remove(em.merge(tblframeMaterial));
    }

    public TblframeMaterial find(Object id) {
        return em.find(TblframeMaterial.class, id);
    }

    public List<TblframeMaterial> findAll() {
        return em.createQuery("select object(o) from TblframeMaterial as o").getResultList();
    }

}
