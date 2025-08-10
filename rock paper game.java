import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String[] choices = {"rock", "paper", "scissors"};

        while (true) {
            System.out.print("\nEnter your move (rock, paper, scissors or exit): ");
            String userMove = sc.nextLine().toLowerCase();

            if (userMove.equals("exit")) {
                System.out.println("Thanks for playing!");
                break;
            }
            if (!Arrays.asList(choices).contains(userMove)) {
                System.out.println("Invalid move! Try again.");
                continue;
            }

            String computerMove = choices[rand.nextInt(3)];
            System.out.println("Computer chose: " + computerMove);

            if (userMove.equals(computerMove)) {
                System.out.println("It's a tie!");
            } else if (
                (userMove.equals("rock") && computerMove.equals("scissors")) ||
                (userMove.equals("paper") && computerMove.equals("rock")) ||
                (userMove.equals("scissors") && computerMove.equals("paper"))
            ) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }
        }
        sc.close();
    }
}
