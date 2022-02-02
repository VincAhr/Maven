package de.neuefische.task;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise1Test {


    @Test
    void shouldBePositive() {


        //given
        int number1 = 2;
        int number2 = 4;

        //when
        int result = Exercise1.add(number1, number2);


        // then
        Assertions.assertEquals(5, result);


    }


}

