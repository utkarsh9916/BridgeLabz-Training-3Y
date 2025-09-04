package Assignment.String_Practise.Level2;

// Q18: Write a program for Rock-Paper-Scissors game.
import java.util.Scanner;
import java.util.Random;

public class Q19_RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String[] options = {"rock", "paper", "scissors"};

        System.out.print("Enter rock, paper or scissors: ");
        String user = sc.next().toLowerCase();
        String computer = options[rand.nextInt(3)];

        System.out.println("Computer chose: " + computer);

        if (user.equals(computer)) {
            System.out.println("It's a tie!");
        } else if ((user.equals("rock") && computer.equals("scissors")) ||
                (user.equals("paper") && computer.equals("rock")) ||
                (user.equals("scissors") && computer.equals("paper"))) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }
    }
}

