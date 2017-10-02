/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sessions;

import entities.TblfabricTexture;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Publico
 */
@Local
public interface TblfabricTextureFacadeLocal {

    void create(TblfabricTexture tblfabricTexture);

    void edit(TblfabricTexture tblfabricTexture);

    void remove(TblfabricTexture tblfabricTexture);

    TblfabricTexture find(Object id);

    List<TblfabricTexture> findAll();

}
