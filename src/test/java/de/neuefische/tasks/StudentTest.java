package de.neuefische.tasks;

import de.neuefische.tasks.week2.interfaces.InformatikStudent;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {


    @Test
    void testFirstName() {

        InformatikStudent student = new InformatikStudent();
        student.setFirstName("Hans");
        student.equals(student);
        assertEquals("Hans", student.getFirstName());
    }

    @Test
    void Konstruktor(){


        var student = new InformatikStudent("Vincent", "Ahrens", 5, 1);
        var student2 = new InformatikStudent(student);
        assertEquals("Vincent", student.getFirstName());
        assertEquals("Ahrens", student.getLastName());
        assertEquals(5, student.getSemester());
        assertEquals(1, student.getId());


    }



}