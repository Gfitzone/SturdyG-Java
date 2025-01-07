import java.util.Scanner;
import java.util.Random;

public class RockPaperScissorsGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println(
                "Welcome to Rock,Paper,Scissor Game\n Rules\n 1.Rock beats Scissors.\n 2.Paper beats Rock.\n 3.Scissors beats Paper. ");
        System.out.println();
        System.out.println("Enter your choice: rock,paper or scissors (or type exit to quit): ");
        while (true) {
            System.out.println("\n Your choice: ");
            String choice = sc.nextLine().toLowerCase();
            if (choice.equals("exit")) {
                System.out.println("Thanks for playing! \n @Garima Thapa");
                break;
            }
            // validating users input
            if (!choice.equals("rock") && !choice.equals("paper") && !choice.equals("scissors")) {
                System.out.println("Invalid choice.please enter rock,paper or scissors to continue the game ");
                continue;
            }
            // generating computers choice
            String[] choices = { "rock", "paper", "scissors" };
            String cchoice = choices[random.nextInt(3)];
            System.out.println("computer chose:" + cchoice.toLowerCase());
            // determining the winner
            if (choice.equals(cchoice)) {
                System.out.println("It's a tie.");
            } else if ((choice.equals("rock") && cchoice.equals("scissors"))
                    || (choice.equals("paper") && cchoice.equals("rock"))
                    || (choice.equals("scissors") && cchoice.equals("paper"))) {
                System.out.println("You won!");
            } else {
                System.out.println("Computer wins!");
            }

        }

    }

}