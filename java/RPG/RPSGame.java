package RPS;

import java.util.Scanner;

public class RPSGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        results resultObj = new results();

        while (true) {

            try {

            	System.out.println("Enter values to play Rock-Paper-Scissors\n"
            	        + "1 : Rock\n"
            	        + "2 : Paper\n"
            	        + "3 : Scissors\n"
            	        + "4 : Export\n"
            	        + "5 : Exit\n");

                int userChoice =
                        ExceptionHandler.validateInput(sc.nextLine());
                userChoice--;
                if (userChoice == 3) {

                    resultObj.exportResults();
                    continue;
                }

                if (userChoice == 4) {

                    System.out.println("Goodbye!");
                    break;
                }

                int machineChoice = Values.GenerateRandom();

                results.instants(machineChoice, userChoice);

            }

            catch (IllegalArgumentException e) {

                System.out.println(e.getMessage());
            }
            finally {
            	System.out.println("\n");
            	System.out.println(".......................................");
            	System.out.println("\n");
            }
        }

        sc.close();
    }
}