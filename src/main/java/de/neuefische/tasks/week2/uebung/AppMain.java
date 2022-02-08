package de.neuefische.tasks.week2.uebung;

public class AppMain {



    public static void main(String[] args) {
        Student student1 = new Student("Marie", 1);
        Student student2 = new Student("Vincent", 2);
        Student[] students= new Student[2];
        students[0] = student1;
        students[1] = student2;

        StudentDB studentdb = new StudentDB(students);
        System.out.println(studentdb);


    }

}
