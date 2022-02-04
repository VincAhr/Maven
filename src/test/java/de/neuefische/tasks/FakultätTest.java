package de.neuefische.tasks;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


class FakultätTest {


    @Test
    void shouldbegreaterzero() {
        // given
        int a = 5;
        //when
        int result = Fakultät.loop2(a);
        //then
        Assertions.assertEquals(120, result);
    }

}