package za.ac.models;

import java.util.List;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@DiscriminatorValue("STUDENT")
public class Student extends User {
    @ManyToOne
    private School school;
    
    @NotNull(message = "Student number cannot be null")
    @Size(min = 3, max = 10, message = "Student number must be between 3 and 10 characters")
    private String studentId;
    
    private Double accountBalance = 0.0;
    
    @OneToMany(mappedBy = "student")
    private List<Order> orders;

    // Getters and setters
    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public Double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}