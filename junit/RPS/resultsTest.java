package RPS;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import RPS.results;

class resultsTest {

    @BeforeEach
    void reset() {

        results.history.clear();
        results.count = 0;
        results.user_count = 0;
        results.machine_count = 0;
    }

    @Test
    void userWinTest() {

        // machine scissors, user rock
        results.instants(2,0);

        assertEquals(1, results.user_count);
        assertEquals(0, results.machine_count);
    }

    @Test
    void machineWinTest() {

        // machine rock, user scissors
        results.instants(0,2);

        assertEquals(0, results.user_count);
        assertEquals(1, results.machine_count);
    }

    @Test
    void drawTest() {

        results.instants(1,1);

        assertEquals(0, results.user_count);
        assertEquals(0, results.machine_count);
    }

    @Test
    void historyInsertionTest() {

        results.instants(0,0);

        assertEquals(1, results.history.size());
    }
}

class ExportTest {

    @BeforeEach
    void setup() {

        results.history.clear();
        results.count = 0;
        results.user_count = 0;
        results.machine_count = 0;
    }

    @Test
    void exportFileCreatedTest() {

        results.instants(0,0);

        results r = new results();

        r.exportResults();

        File file = new File("test.txt");

        assertTrue(file.exists());

        file.delete();
    }
}