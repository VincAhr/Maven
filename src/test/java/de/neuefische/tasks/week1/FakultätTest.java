package de.neuefische.tasks.week1;
import de.neuefische.tasks.week1.Fakultät;
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