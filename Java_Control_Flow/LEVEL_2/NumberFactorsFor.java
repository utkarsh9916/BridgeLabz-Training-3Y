package Assignment.ControlFlow_Practises.Level2;
import java.util.Scanner;

/*
 * Create a program to find the factors of a number taken as user input.
 */
class NumberFactorsFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer to find its factors: ");
        int number = input.nextInt();

        if (number > 0) {
            System.out.print("The factors of " + number + " are: ");
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        } else {
            System.out.println("Please enter a positive integer.");
        }

        input.close();
    }
}
