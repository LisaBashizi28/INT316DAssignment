package za.ac.models;

import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull(message = "School name cannot be null")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
    private String name;
    
    @NotNull(message = "Address cannot be null")
    @Size(min = 3, max = 100, message = "Address must be between 3 and 100 characters")
    private String address;
    
    @OneToMany(mappedBy = "school")
    private List<TuckShopOwner> tuckshopOwners;
    
    @OneToMany(mappedBy = "school")
    private List<Student> students;
    
    @OneToMany(mappedBy = "school")
    private List<Meal> meals;

    // Constructors
    public School() {
    }

    public School(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<TuckShopOwner> getTuckshopOwners() {
        return tuckshopOwners;
    }

    public void setTuckshopOwners(List<TuckShopOwner> tuckshopOwners) {
        this.tuckshopOwners = tuckshopOwners;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Meal> getMeals() {
        return meals;
    }

    public void setMeals(List<Meal> meals) {
        this.meals = meals;
    }

    // equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return Objects.equals(id, school.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "School{" + "id=" + id + ", name='" + name + '\'' + '}';
    }
}