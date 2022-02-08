package de.neuefische.tasks.week2.uebung;

import java.util.Arrays;

public class StudentDB {

    private Student[] students;

    public StudentDB (Student[] students){
        this.students = students;
    }

    public Student[] list (Student[] students){
    return students;
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "students=" + Arrays.toString(students) +
                '}';


    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

}


