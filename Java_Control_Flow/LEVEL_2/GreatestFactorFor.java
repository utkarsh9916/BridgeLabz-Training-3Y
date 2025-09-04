package Assignment.ControlFlow_Practises.Level2;
import java.util.Scanner;

/*
 * Create a program to print the greatest factor of a number beside itself
 * using a loop.
 */
class GreatestFactorFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer greater than 1: ");
        int number = input.nextInt();
        int greatestFactor = 1;

        if (number > 1) {
            for (int i = number / 2; i >= 1; i--) {
                if (number % i == 0) {
                    greatestFactor = i;
                    break;
                }
            }
            System.out.println("The greatest factor of " + number + " besides itself is: " + greatestFactor);
        } else {
            System.out.println("Please enter an integer greater than 1.");
        }

        input.close();
    }
}
