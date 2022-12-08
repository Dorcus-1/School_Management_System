package rw.ac.rca.smis.orm;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "student")

public class Student extends Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;



    @ManyToOne
    private Mark mark;
    @OneToMany
    private Set<Course> courses;

    public Student(String name, String location, int marks) {
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

    public Student() {

    }



    public Mark getMark() {
        return mark;
    }

    public void setMark(Mark mark) {
        this.mark = mark;
    }


    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

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

}
