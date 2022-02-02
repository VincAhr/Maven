package de.neuefische.task;

import static org.junit.jupiter.api.Assertions.*;

class Exercise1Test {

    NumberCheckerTest {

        @Test
        void shouldBeDividableByTwo() {
    \\given
            var number = 4;
    \\when
            boolean result = NumberChecker.check(number);
    \\then
            Assertions.assertTrue(result);
        }

[… andere Fälle …]

    }

    Für den Code:

    public class NumberChecker {

        public static boolean check(double number) {
            return number%2 == 0;
        }
    }


}