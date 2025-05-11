package za.ac.models;

import java.time.LocalDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import za.ac.enums.OrderStatus;
import za.ac.models.OrderItem;
import za.ac.models.Student;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2025-05-02T11:32:59")
@StaticMetamodel(Order.class)
public class Order_ { 

    public static volatile SingularAttribute<Order, Double> totalAmount;
    public static volatile SingularAttribute<Order, Student> student;
    public static volatile SingularAttribute<Order, Long> id;
    public static volatile SingularAttribute<Order, LocalDateTime> orderDate;
    public static volatile ListAttribute<Order, OrderItem> items;
    public static volatile SingularAttribute<Order, OrderStatus> status;

}