/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.sessions;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import za.ac.models.TuckShopOwner;

/**
 *
 * @author ADMIN
 */
@Stateless
public class TuckShopOwnerFacade extends AbstractFacade<TuckShopOwner> implements TuckShopOwnerFacadeLocal {

    @PersistenceContext(unitName = "SchoolMealSystem-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TuckShopOwnerFacade() {
        super(TuckShopOwner.class);
    }
    
}
