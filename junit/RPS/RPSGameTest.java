package RPS;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import RPS.RPSGame;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;


class RPSGameTest {
    private final InputStream originalIn = System.in;
    private final PrintStream originalOut = System.out;
    private ByteArrayOutputStream outputStream;
    @BeforeEach
    public void setUp() {
        // Capture System.out
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }
    @AfterEach
    public void tearDown() {
        // Restore original System.in and System.out
        System.setIn(originalIn);
        System.setOut(originalOut);
    }
    @Test
    public void testExitOption() {
        // Simulate user entering "5" (Exit)
        String input = "5\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        RPSGame.main(new String[]{});
        String output = outputStream.toString();
        assertTrue(output.contains("Goodbye!"), "Should display Goodbye message");
    }
    @Test
    public void testInvalidInputHandling() {
        // Simulate invalid input "abc" then exit "5"
        String input = "abc\n5\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        RPSGame.main(new String[]{});
        String output = outputStream.toString();
        assertTrue(output.contains("Invalid input"), "Should display invalid input error");
        assertTrue(output.contains("Goodbye!"), "Should eventually exit");
    }
    @Test
    public void testEmptyInputHandling() {
        // Simulate empty input then exit
        String input = "\n5\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        RPSGame.main(new String[]{});
        String output = outputStream.toString();
        assertTrue(output.contains("Input cannot be empty"), "Should display empty input error");
    }
    @Test
    public void testOutOfRangeInput() {
        // Simulate out of range input "6" then exit "5"
        String input = "6\n5\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        RPSGame.main(new String[]{});
        String output = outputStream.toString();
        assertTrue(output.contains("between 1 and 5"), "Should display out of range error");
    }
    @Test
    public void testValidGamePlay() {
        // Simulate playing rock (1) then exit (5)
        String input = "1\n5\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        RPSGame.main(new String[]{});
        String output = outputStream.toString();
        assertTrue(output.contains("Enter values to play"), "Should display menu");
        assertTrue(output.contains("Goodbye!"), "Should exit properly");
    }
    @Test
    public void testMultipleRounds() {
        // Play rock, paper, scissors, then exit
        String input = "1\n2\n3\n5\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        RPSGame.main(new String[]{});
        String output = outputStream.toString();
        // Check that menu appeared multiple times
        int menuCount = output.split("Enter values to play").length - 1;
        assertTrue(menuCount >= 3, "Should display menu at least 3 times");
    }
    @Test
    public void testExportOption() {
        // Test export (4) then exit (5)
        String input = "4\n5\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        RPSGame.main(new String[]{});
        String output = outputStream.toString();
        // Verify export was called (depends on your implementation)
        assertTrue(output.contains("Enter values to play"), "Should continue after export");
        assertTrue(output.contains("Goodbye!"), "Should exit after export");
    }
    @Test
    public void testMixedValidAndInvalidInputs() {
        // Mix of valid and invalid inputs
        String input = "abc\n0\n6\n2\n5\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        RPSGame.main(new String[]{});
        String output = outputStream.toString();
        assertTrue(output.contains("Invalid input"), "Should handle text input");
        assertTrue(output.contains("between 1 and 5"), "Should handle out of range");
        assertTrue(output.contains("Goodbye!"), "Should eventually exit");
    }
}