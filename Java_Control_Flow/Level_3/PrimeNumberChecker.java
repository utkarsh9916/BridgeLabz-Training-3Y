package Assignment.ControlFlow_Practises.Level3;

import java.util.Scanner;

/**
 * Question 4: Write a Program to check if the given number is a prime number
 * or not.
 * Hint =>
 * a. A number that can be divided exactly only by itself and 1 are Prime
 * Numbers.
 * b. Prime Numbers checks are done for numbers greater than 1.
 * c. Loop through all the numbers from 2 to the user input number and check if
 * the remainder is zero. If the remainder is zero break out from the loop as
 * the number is divisible by some other number and is not a prime number.
 * d. Use the isPrime boolean variable to store the result.
 */
class PrimeNumberChecker {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Enter a positive integer to check if it's prime: ");
        int number = input.nextInt();

        boolean isPrime = true;


        if (number <= 1) {
            isPrime = false;
        } else {

            for (int i = 2; i <= Math.sqrt(number); i++) {

                if (number % i == 0) {

                    isPrime = false;

                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }


        input.close();
    }
}
