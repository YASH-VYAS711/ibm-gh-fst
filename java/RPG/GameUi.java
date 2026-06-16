package RPS;

public class GameUi {

    public static void showInput(int userChoice, int machineChoice,
                                 String result, int user_wins, int machine_wins) {

        String[] User_Input;
        String[] Machine_Input;

        switch (userChoice) {

            case 0:
                User_Input = AsciiArt.UserRock;
                break;

            case 1:
                User_Input = AsciiArt.UserPaper;
                break;

            case 2:
                User_Input = AsciiArt.UserScissors;
                break;

            default:
                throw new IllegalArgumentException("Invalid user choice.");
        }

        switch (machineChoice) {

            case 0:
                Machine_Input = AsciiArt.MachineRock;
                break;

            case 1:
                Machine_Input = AsciiArt.MachinePaper;
                break;

            case 2:
                Machine_Input = AsciiArt.MachineScissors;
                break;

            default:
                throw new IllegalArgumentException("Invalid machine choice.");
        }

        int lines = Math.min(User_Input.length, Machine_Input.length);
        System.out.println("\n");
        
        for (int i = 0; i < lines; i++) {
            System.out.print(User_Input[i] + Machine_Input[i]);
        }

        System.out.println(result + "\n");

        System.out.println("    YOU    |  MACHINE");
        System.out.println("----------------------");
        System.out.println("     " + user_wins + "     |     " + machine_wins);
        System.out.println();
    }
}