package Assignment.ControlFlow_Practises.Level2;

/*
 Question:
 Rewrite the above program to find the power of a number using a while loop.
 Hint =>
 Get integer input for two variables named number and power.
 Create a result variable with an initial value of 1.
 Create a temp variable counter and initialize to zero. Use the while loop till counter == power.
 In each iteration of the loop, multiply the result by the number and assign the value to the result. Also, increment the counter.
 Finally, print the result.
*/

import java.util.Scanner;

public class PowerWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer (base number): ");
        int number = sc.nextInt();

        System.out.print("Enter a positive integer (power): ");
        int power = sc.nextInt();

        if (number >= 0 && power >= 0) {
            int result = 1;
            int counter = 0;

            while (counter < power) {
                result *= number;
                counter++;
            }

            System.out.println(number + " raised to the power " + power + " is: " + result);
        } else {
            System.out.println("Please enter non-negative integers only.");
        }

        sc.close();
    }
}

