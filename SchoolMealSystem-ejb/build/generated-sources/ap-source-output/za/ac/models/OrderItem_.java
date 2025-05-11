package za.ac.models;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import za.ac.models.Meal;
import za.ac.models.Order;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2025-05-02T11:32:59")
@StaticMetamodel(OrderItem.class)
public class OrderItem_ { 

    public static volatile SingularAttribute<OrderItem, Meal> meal;
    public static volatile SingularAttribute<OrderItem, Integer> quantity;
    public static volatile SingularAttribute<OrderItem, Double> subtotal;
    public static volatile SingularAttribute<OrderItem, Long> id;
    public static volatile SingularAttribute<OrderItem, Order> order;

}