package za.ac.models;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import za.ac.models.Order;
import za.ac.models.School;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2025-05-02T11:32:59")
@StaticMetamodel(Student.class)
public class Student_ extends User_ {

    public static volatile SingularAttribute<Student, String> studentId;
    public static volatile SingularAttribute<Student, School> school;
    public static volatile ListAttribute<Student, Order> orders;
    public static volatile SingularAttribute<Student, Double> accountBalance;

}