import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ROCK = "Rock";
        String PAPER = "Paper";
        String SCISSORS = "Scissors";

        System.out.print("Choose [r]ock, [p]aper or [s]cissors: ");

        String playersMove = scanner.nextLine();

        if (playersMove.equals("r") || playersMove.equals("rock")) {
            playersMove = ROCK;
        } else if (playersMove.equals("p") || playersMove.equals("paper")) {
            playersMove = PAPER;
        } else if (playersMove.equals("s") || playersMove.equals("scissors")) {
            playersMove = SCISSORS;
        } else {
            System.out.println("Invalid input. Try again...");
            return;
        }
        Random random = new Random();
        int computerRandomNumber = random.nextInt(4);
        String computerMove = "";

        switch (computerRandomNumber) {
            case 1:
                computerMove = "Rock";
                break;
            case 2:
                computerMove = "Paper";
                break;
            case 3:
                computerMove = "Scissors";
                break;

        }
        System.out.println("The computer chose " + computerMove + ".");

        if(playersMove.equals(ROCK) && computerMove.equals(SCISSORS)
                ||playersMove.equals(PAPER) && computerMove.equals(ROCK)
                ||playersMove.equals(SCISSORS)&& computerMove.equals(PAPER)) {
            System.out.println("You win.");
        } else if (playersMove.equals(ROCK) && computerMove.equals(PAPER)
                ||playersMove.equals(PAPER) && computerMove.equals(SCISSORS)
                ||playersMove.equals(SCISSORS)&& computerMove.equals(ROCK)) {
            System.out.println("You lose.");
        }else {
            System.out.println("This game was a draw.");
        }
    }
}

