package de.neuefische.tasks.week2.interfaces;

import org.junit.jupiter.api.Test;

class StudentDBTest {



        @Test
        void Arraytest(){

                InformatikStudent s1 = new InformatikStudent("Vincent", "Ahrens", 5, 1);
                InformatikStudent[] students = {s1};
                StudentDB studentDB = new StudentDB(students);
                System.out.println(studentDB.toString());

        }




}