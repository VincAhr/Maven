package de.neuefische.task;

import de.neuefische.tasks.Ifelse;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

class IfelseTest {


    @Test
    void betweenzeroandthirty() {

        int m = 29;

        String result = Ifelse.quantity(m, "gelb");

        Assertions.assertEquals("Maximale Personenzahl nicht überschritten", result);
    }

    @Test
    void overthirty() {

        int m = 31;

        String result = Ifelse.quantity(m, "rot");

        Assertions.assertEquals("Zu viele Personen", result);
    }
}