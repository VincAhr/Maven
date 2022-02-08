package de.neuefische.tasks.week2.interfaces;

import java.util.Arrays;

public class StudentDB {

    private InformatikStudent[] students;

    public StudentDB(InformatikStudent[] arr) {
        this.students = arr;
    }


    public InformatikStudent[] list() {
        return students;
    }


    @Override
    public String toString() {
        return "StudentDB{" +
                "students=" + Arrays.toString(students) +
                '}';
    }

    public InformatikStudent[] getStudents() {
        return students;
    }

    public void setStudents(InformatikStudent[] students) {
        this.students = students;
    }
}
