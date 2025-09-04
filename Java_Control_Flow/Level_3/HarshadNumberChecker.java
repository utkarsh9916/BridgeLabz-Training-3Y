package Assignment.ControlFlow_Practises.Level3;

import java.util.Scanner;

/**
 * Question 8: Create a program to check if a number taken from the user is a
 * Harshad Number.
 * Hint =>
 * a. A Harshad number is an integer which is perfectly divisible by the sum of
 * its digits. For example, 21 is perfectly divided by 3 (sum of digits: 2 + 1).
 * b. Get an integer input for the number variable.
 * c. Create an integer variable sum with initial value 0.
 * d. Create a while loop to access each digit of the number.
 * e. Inside the loop, add each digit of the number to sum.
 * f. Check if the number is perfectly divisible by the sum.
 * g. If the number is divisible by the sum, print Harshad Number. Otherwise,
 * print Not a Harshad Number.
 */
class HarshadNumberChecker {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Enter a positive integer to check if it's a Harshad number: ");
        int number = input.nextInt();


        int originalNumber = number;


        int sumOfDigits = 0;


        int tempNumber = number;


        while (tempNumber != 0) {

            int digit = tempNumber % 10;

            sumOfDigits += digit;

            tempNumber /= 10;
        }


        if (sumOfDigits != 0 && originalNumber % sumOfDigits == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is not a Harshad Number.");
        }


        input.close();
    }
}
