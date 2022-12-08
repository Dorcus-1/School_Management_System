package rw.ac.rca.smis.orm;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "instructor")
public class Instructor extends Person{

     private String name;
     private Date dateOfBirth;
     private char gender;

     @ManyToOne
     @JoinColumn(name = "address_id")
     private Address address;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Instructor(int i, String name, Date dateOfBirth,char gender) {

    }

    public Instructor() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


}


