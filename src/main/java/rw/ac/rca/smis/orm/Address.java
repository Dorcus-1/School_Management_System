package rw.ac.rca.smis.orm;
import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String streetAddress;
    @OneToMany(cascade = CascadeType.ALL , mappedBy = "address")
    private Set<Instructor> instructors;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "address")
    private Set<Student> students;

    public Address() {

    }


//    public  Address(){}


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }



    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    public Set<Instructor> getInstructors() {
        return instructors;
    }

    public void setInstructors(Set<Instructor> instructors) {
        this.instructors = instructors;
    }

    public Address(String name,String streetAddress) {

        this.name=name;
        this.streetAddress=streetAddress;

    }
}
