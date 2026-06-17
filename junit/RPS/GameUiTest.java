package RPS;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import RPS.GameUi;

class GameUiTest {

    @Test
    void invalidUserChoiceTest() {

        assertThrows(IllegalArgumentException.class,
                () -> GameUi.showInput(5,0,"DRAW",0,0));
    }

    @Test
    void invalidMachineChoiceTest() {

        assertThrows(IllegalArgumentException.class,
                () -> GameUi.showInput(0,5,"DRAW",0,0));
    }
}