package de.neuefische.tasks.week1;

import de.neuefische.tasks.week1.Arraytest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraytestTest {

    @Test
    void isstudentnameright() {
        //given
        String[] result = Arraytest.test(4);
        //when
        assertArrayEquals(new String[]{"Student 0", "Student 1", "Student 2", "Student 3"}, result);

        //then


    }


}