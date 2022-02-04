package de.neuefische.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddandprintsumTest {


    @Test
    void shouldBePositive() {


        //given
        int number1 = 2;
        int number2 = 4;

        //when
        int result = Addandprintsum.add(number1, number2);


        // then
        Assertions.assertEquals(6, result);


    }

}