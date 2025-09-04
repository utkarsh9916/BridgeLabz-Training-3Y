package Assignment.ControlFlow_Practises.Level3;

import java.util.Scanner;

/**
 * Question 6: Create a program to count the number of digits in an integer.
 * Hint =>
 * a. Get an integer input for the number variable.
 * b. Create an integer variable count with value 0.
 * c. Use a loop to iterate until number is not equal to 0.
 * d. Remove the last digit from number in each iteration.
 * e. Increase count by 1 in each iteration.
 * f. Finally display the count to show the number of digits.
 */
class DigitCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer to count its digits: ");
        int number = input.nextInt();


        int originalNumber = number;

        int count = 0;

        if (number == 0) {
            count = 1;
        } else {
            int tempNumber = Math.abs(number);

            while (tempNumber != 0) {
                tempNumber = tempNumber / 10;

                count++;
            }
        }

        System.out.println("The number of digits in " + originalNumber + " is: " + count);

        input.close();
    }
}
