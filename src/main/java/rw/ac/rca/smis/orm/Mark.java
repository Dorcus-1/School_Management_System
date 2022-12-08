package rw.ac.rca.smis.orm;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "mark")
public class Mark {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    private Course course;
   private double scoredMarks;
   @OneToMany
   private Set<Student>  students;

   public  Mark(double scoredMarks){

   }

    public Mark() {

    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public double getScoredMarks() {
        return scoredMarks;
    }

    public void setScoredMarks(double scoredMarks) {
        this.scoredMarks = scoredMarks;
    }

}
