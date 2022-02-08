package de.neuefische.tasks.week2.interfaces;

import java.util.Objects;

public class BiologyStudent implements Student {

    private String firstName;
    private String lastName;
    private int semester;
    private int id;
    private int course;


    BiologyStudent(String firstName, String lastName, int semester, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.semester = semester;
        this.id = id;
    }

    BiologyStudent(String firstName, String lastName) {
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
        BiologyStudent student = (BiologyStudent) o;
        return semester == student.semester && Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, semester);
    }


    public BiologyStudent(BiologyStudent student) {
    }

    public BiologyStudent() {
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;

    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String LastName) {
    this.lastName = lastName;
    }

    @Override
    public int getSemester() {
        return semester;
    }


    @Override
    public void setSemester(int Semester) {
        this.semester = semester;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int Id) {
        this.id = id;
    }
}

