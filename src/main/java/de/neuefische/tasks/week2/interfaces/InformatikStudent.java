package de.neuefische.tasks.week2.interfaces;

import java.util.Objects;

public class InformatikStudent implements Student {


    private String firstName;
    private String lastName;
    private int semester;
    private int id;
    private int course;


    public InformatikStudent(String firstName, String lastName, int semester, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.semester = semester;
        this.id = id;
    }

    InformatikStudent(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        semester = 1;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Mein Student heißt:'" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", semester=" + semester +
                '}';

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InformatikStudent student = (InformatikStudent) o;
        return semester == student.semester && Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, semester);
    }



    public InformatikStudent(InformatikStudent student) {
    }

    public InformatikStudent() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    //    Student(Student toCopy) {
//        this.firstName = toCopy.getFirstName();
//        this.lastName = toCopy.getLastName();
//        this.semester = toCopy.getSemester();
//    }

}
