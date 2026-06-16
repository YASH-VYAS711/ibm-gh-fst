package RPS;

public class ExceptionHandler {

    public static int validateInput(String input) {

        if (input == null || input.trim().isEmpty()) {
            throw new IllegalArgumentException("Input cannot be empty.");
        }

        int choice;

        try {
            choice = Integer.parseInt(input.trim());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input.");
        }

        if (choice < 1 || choice > 5) {
            throw new IllegalArgumentException("Please select a number between 1 and 5.");
        }

        return choice;
    }
}