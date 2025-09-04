package Assignment.ControlFlow_Practises.Level3;

import java.util.Scanner;

/**
 * Question 9: Create a program to check if a number is an Abundant Number.
 * Hint =>
 * a. An abundant number is an integer in which the sum of all the divisors of
 * the number is greater than the number itself. For example, Divisor of 12:
 * 1, 2, 3, 4, 6. Sum of divisor: 1 + 2 + 3 + 4 + 6 = 16 > 12.
 * b. Get an integer input for the number variable.
 * c. Create an integer variable sum with initial value 0.
 * d. Run a for loop from i = 1 to i < number.
 * e. Inside the loop, check if number is divisible by i.
 * f. If true, add i to sum.
 * g. Outside the loop Check if sum is greater than number.
 * h. If the sum is greater than the number, print Abundant Number. Otherwise,
 * print Not an Abundant Number.
 */
class AbundantNumberChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter a positive integer to check if it's an Abundant number: ");
        int number = input.nextInt();


        int sumOfDivisors = 0;


        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sumOfDivisors += i;
            }
        }

        if (sumOfDivisors > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is not an Abundant Number.");
        }

        input.close();
    }
}

