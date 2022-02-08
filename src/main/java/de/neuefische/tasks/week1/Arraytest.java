package de.neuefische.tasks.week1;

public class Arraytest {


    public static String[] test(int n) {


        String[] students = new String[n];

        for (int i = 0; i < students.length; i++) {

            students[i] = "Student " + i;
            System.out.println(students[i]);
        }
        return students;


    }


}



