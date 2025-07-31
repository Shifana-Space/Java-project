import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Game options
        String[] options = {"rock", "paper", "scissors"};

        System.out.println("Welcome to Rock-Paper-Scissors Game!");
        System.out.print("Enter your choice (rock, paper, or scissors): ");
        String userChoice = scanner.next().toLowerCase();

        // Validate input
        if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
            System.out.println("Invalid input! Please enter rock, paper, or scissors.");
            return;
        }

        // Computer randomly picks a choice
        String computerChoice = options[random.nextInt(3)];
        System.out.println("Computer chose: " + computerChoice);

        // Determine winner
        if (userChoice.equals(computerChoice)) {
            System.out.println("It's a tie!");
        } else if (
            (userChoice.equals("rock") && computerChoice.equals("scissors")) ||
            (userChoice.equals("scissors") && computerChoice.equals("paper")) ||
            (userChoice.equals("paper") && computerChoice.equals("rock"))
        ) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }
    }
}
