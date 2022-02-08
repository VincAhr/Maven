package de.neuefische.tasks;

import de.neuefische.tasks.week2.interfaces.InformatikStudent;
import de.neuefische.tasks.week2.interfaces.StudentDB;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentDBTest {



        @Test
        void testTest(){

                InformatikStudent s1 = new InformatikStudent("Vincent", "Ahrens", 5, 1);
                InformatikStudent[] students = {s1};
                StudentDB studentDB = new StudentDB(students);
                System.out.println(studentDB.toString());

        }




}