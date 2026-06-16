package RPS;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Values {

    static Map<Integer, String> mp = new HashMap<>();

    static {
        mp.put(0, "Rock");
        mp.put(1, "Paper");
        mp.put(2, "Scissors");
    }

    private static final Random randomno = new Random();

    public static int GenerateRandom() {
        return randomno.nextInt(3);
    }
}