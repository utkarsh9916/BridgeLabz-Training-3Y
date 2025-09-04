package Assignment.ControlFlow_Practises.Level2;
import java.util.Scanner;

/*
 * Rewrite the above program 7 to find the factors of a number using the while loop.
 */
class NumberFactorsWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer to find its factors: ");
        int number = input.nextInt();

        if (number > 0) {
            System.out.print("The factors of " + number + " are: ");
            int counter = 1;
            while (counter <= number) {
                if (number % counter == 0) {
                    System.out.print(counter + " ");
                }
                counter++;
            }
            System.out.println();
        } else {
            System.out.println("Please enter a positive integer.");
        }

        input.close();
    }
}
