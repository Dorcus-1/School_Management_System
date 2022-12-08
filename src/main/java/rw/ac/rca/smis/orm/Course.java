package rw.ac.rca.smis.orm;

import javax.persistence.*;
import java.util.Set;


    @Entity
    @Table(name = "course")
    public class Course {

    private String name;

    private int period;
    private double maxMark;
    @ManyToOne
    @JoinTable(name = "student_course",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id"))
    private Student students;

    @OneToMany
    private Set<Mark> marks;
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;

        public Course(String course, String instructor, String student) {
        }

        public Course() {

        }

        @Column(name = "mark_id")

    public Set<Mark> getMarks() {
        return marks;
    }

    public void setMarks(Set<Mark> marks) {
        this.marks = marks;
    }

    public Student getStudents() {
        return students;
    }

    public void setStudents(Student students) {
        this.students = students;
    }




     public String getName() {
      return name;
     }

     public void setName(String name) {
      this.name = name;
     }


     public int getPeriod() {
      return period;
     }

     public void setPeriod(int period) {
      this.period = period;
     }

     public double getMarxMark() {
      return maxMark;
     }

     public void setMarxMark(double marxMark) {
      this.maxMark = marxMark;
     }

        public void setId(Long id) {
            this.id = id;
        }

        public Long getId() {
            return id;
        }
    }
