package dz3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberInIntervalTest {
    private NumberInInterval numberInInterval = new NumberInInterval();
    @Test
    void testNumberInInterval_numberInInterval() {
        int number = 30;
        boolean result = numberInInterval.numberInInterval(number);
        assertTrue(result);
    }

    @Test
    void testNumberInInterval_numberOutOfInterval() {
        int number = 150;
        boolean result = numberInInterval.numberInInterval(number);
        assertFalse(result);
    }
}
