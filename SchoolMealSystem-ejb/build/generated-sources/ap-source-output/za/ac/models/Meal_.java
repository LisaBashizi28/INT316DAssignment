package za.ac.models;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import za.ac.enums.MealType;
import za.ac.models.OrderItem;
import za.ac.models.School;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2025-05-02T11:32:59")
@StaticMetamodel(Meal.class)
public class Meal_ { 

    public static volatile SingularAttribute<Meal, School> school;
    public static volatile SingularAttribute<Meal, Double> price;
    public static volatile SingularAttribute<Meal, String> name;
    public static volatile SingularAttribute<Meal, String> description;
    public static volatile SingularAttribute<Meal, Long> id;
    public static volatile SingularAttribute<Meal, MealType> type;
    public static volatile ListAttribute<Meal, OrderItem> orderItems;

}