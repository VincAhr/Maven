package de.neuefische.tasks.week2.arraylist;

import java.util.ArrayList;
import java.util.List;

public class AppMain {



    public static void main(String[] args) {
        Student student1 = new Student("Marie", 1);
        Student student2 = new Student("Vincent", 2);
        List<Student> students= new ArrayList<>();
        students.add(student1);
        students.add(student2);

        StudentDB studentdb = new StudentDB(students);
        System.out.println(studentdb);
        System.out.println(studentdb.randomStudent());




    }

}
