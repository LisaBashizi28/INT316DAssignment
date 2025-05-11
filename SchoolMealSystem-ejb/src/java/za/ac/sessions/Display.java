/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.sessions;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.ejb.Stateful;
import za.ac.models.Student;
import za.ac.models.TuckShopOwner;

/**
 *
 * @author ADMIN
 */
 
@Stateless
@LocalBean
public class Display {

 
   private List <Student> stud ;
    private List <TuckShopOwner> tuck ;

    public List<TuckShopOwner> getTuck() {
        return tuck;
    }

    public void setTuck(List<TuckShopOwner> tuck) {
        this.tuck = tuck;
    }
    
    public List<Student> getStud() {
        return stud;
    }

    public void setStud(List<Student> stud) {
        this.stud = stud;
    }

 
    public List<Student> getItems() {
        return stud;
    }
        
        
}
