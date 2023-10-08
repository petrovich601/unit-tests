package dz3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenOddNumberTest {

    private EvenOddNumber evenOddNumber = new EvenOddNumber();

    @Test
    void EvenOddNumber_oddNamber() {
        int namber = 10;
        boolean result = EvenOddNumber.evenOddNumber(namber);
        assertTrue(result);
    }

    @Test
    void EvenOddNumber_evenNamber() {
        int namber = 15;
        boolean result = EvenOddNumber.evenOddNumber(namber);
        assertFalse(result);
    }
}