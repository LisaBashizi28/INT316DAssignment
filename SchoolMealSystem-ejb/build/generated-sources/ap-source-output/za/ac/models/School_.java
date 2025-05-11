package za.ac.models;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import za.ac.models.Meal;
import za.ac.models.Student;
import za.ac.models.TuckShopOwner;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2025-05-02T11:32:59")
@StaticMetamodel(School.class)
public class School_ { 

    public static volatile SingularAttribute<School, String> address;
    public static volatile SingularAttribute<School, String> name;
    public static volatile ListAttribute<School, Student> students;
    public static volatile SingularAttribute<School, Long> id;
    public static volatile ListAttribute<School, TuckShopOwner> tuckshopOwners;
    public static volatile ListAttribute<School, Meal> meals;

}