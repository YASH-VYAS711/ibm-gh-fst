package RPS;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import RPS.ExceptionHandler;

class ExceptionHandlerTest {

    @Test
    void validInputTest() {
        assertEquals(0, ExceptionHandler.validateInput("0"));
        assertEquals(1, ExceptionHandler.validateInput("1"));
        assertEquals(4, ExceptionHandler.validateInput("4"));
    }

    @Test
    void emptyInputTest() {
        assertThrows(IllegalArgumentException.class,
                () -> ExceptionHandler.validateInput(""));
    }

    @Test
    void nullInputTest() {
        assertThrows(IllegalArgumentException.class,
                () -> ExceptionHandler.validateInput(null));
    }

    @Test
    void alphabetInputTest() {
        assertThrows(IllegalArgumentException.class,
                () -> ExceptionHandler.validateInput("abc"));
    }

    @Test
    void outOfRangeTest() {
        assertThrows(IllegalArgumentException.class,
                () -> ExceptionHandler.validateInput("5"));
    }
}