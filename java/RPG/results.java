package RPS;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class results {

    static ArrayList<String[]> history = new ArrayList<>();
    static int count = 0;
    static int machine_count = 0;
    static int user_count = 0;

    public static void instants(int machine_val, int user_val) {

        String machine_input = Values.mp.get(machine_val);
        String user_input = Values.mp.get(user_val);

        count++;

        String result;
        int userval = 0;
        int macval = 0;

        if (machine_input.equalsIgnoreCase(user_input)) {
            result = "DRAW";
        }
        else if (
                (user_input.equalsIgnoreCase("Rock") && machine_input.equalsIgnoreCase("Scissors")) ||
                (user_input.equalsIgnoreCase("Paper") && machine_input.equalsIgnoreCase("Rock")) ||
                (user_input.equalsIgnoreCase("Scissors") && machine_input.equalsIgnoreCase("Paper"))
        ) {

            result = "YOU WON";
            userval = 1;
            user_count++;

        } else {

            result = "YOU LOST";
            macval = 1;
            machine_count++;
        }

        history.add(new String[]{
                String.valueOf(count),
                machine_input,
                user_input,
                result,
                String.valueOf(userval),
                String.valueOf(macval)
        });

        GameUi.showInput(user_val, machine_val, result, user_count, machine_count);
    }

    public void exportResults() {

        if (history.isEmpty()) {
            System.out.println("No games played yet.");
            return;
        }

        String desktopPath = System.getProperty("user.home") + "\\Desktop\\results.txt";

        try (FileWriter writer = new FileWriter(desktopPath)) {

            writer.write(String.format(
                    "%-8s %-15s %-15s %-15s %-15s %-15s%n",
                    "Round",
                    "User Input",
                    "Machine Input",
                    "Result",
                    "User Points",
                    "Machine Points"));

            writer.write("--------------------------------------------------------------------------\n");

            for (String[] row : history) {

                writer.write(String.format(
                        "%-8s %-15s %-15s %-15s %-15s %-15s%n",
                        row[0],
                        row[2],
                        row[1], 
                        row[3],
                        row[4],
                        row[5]
                ));
            }

            System.out.println("Results exported successfully.");
            System.out.println("File saved to: " + desktopPath);

        } catch (IOException e) {

            System.out.println("Unable to export results.");
        }
    }
}