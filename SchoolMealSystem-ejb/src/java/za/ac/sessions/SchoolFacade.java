/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.sessions;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import za.ac.models.School;

/**
 *
 * @author ADMIN
 */
@Stateless
public class SchoolFacade extends AbstractFacade<School> implements SchoolFacadeLocal {

    @PersistenceContext(unitName = "SchoolMealSystem-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SchoolFacade() {
        super(School.class);
    }
    
}
