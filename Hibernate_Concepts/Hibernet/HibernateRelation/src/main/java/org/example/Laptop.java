package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Laptop {
    @Id
    private int lId;
    private String lName;

    //For Student OneToMany and for Laptop its ManyToOne
    @ManyToOne
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }


    @ManyToMany
    private List<Student> students = new ArrayList<>();
    public int getlId() {
        return lId;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }



    public void setlId(int lId) {
        this.lId = lId;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "lId=" + lId +
                ", lName='" + lName + '\'' +
                ", student=" + student +
                ", students=" + students +
                '}';
    }
}
