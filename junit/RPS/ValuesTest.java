package RPS;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import RPS.Values;

class ValuesTest {

    @Test
    void randomValueRangeTest() {

        for(int i=0;i<100;i++) {

            int value = Values.GenerateRandom();

            assertTrue(value >= 0);
            assertTrue(value <= 2);
        }
    }

    @Test
    void mapInitializationTest() {

        assertEquals("Rock", Values.mp.get(0));
        assertEquals("Paper", Values.mp.get(1));
        assertEquals("Scissors", Values.mp.get(2));
    }
}