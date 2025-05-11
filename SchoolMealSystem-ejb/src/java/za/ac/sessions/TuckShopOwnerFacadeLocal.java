/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.sessions;

import java.util.List;
import javax.ejb.Local;
import za.ac.models.TuckShopOwner;

/**
 *
 * @author ADMIN
 */
@Local
public interface TuckShopOwnerFacadeLocal {

    void create(TuckShopOwner tuckShopOwner);

    void edit(TuckShopOwner tuckShopOwner);

    void remove(TuckShopOwner tuckShopOwner);

    TuckShopOwner find(Object id);

    List<TuckShopOwner> findAll();

    List<TuckShopOwner> findRange(int[] range);

    int count();
    
}
