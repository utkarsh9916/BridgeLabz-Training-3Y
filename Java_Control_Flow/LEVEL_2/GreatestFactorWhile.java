package Assignment.ControlFlow_Practises.Level2;
import java.util.Scanner;

/*
 * Rewrite the above program to print the greatest factor of a number beside
 * itself using a while loop.
 */
class GreatestFactorWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer greater than 1: ");
        int number = input.nextInt();
        int greatestFactor = 1;

        if (number > 1) {
            int counter = number / 2;
            while (counter >= 1) {
                if (number % counter == 0) {
                    greatestFactor = counter;
                    break;
                }
                counter--;
            }
            System.out.println("The greatest factor of " + number + " besides itself is: " + greatestFactor);
        } else {
            System.out.println("Please enter an integer greater than 1.");
        }

        input.close();
    }
}
