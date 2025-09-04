package Assignment.ControlFlow_Practises.Level2;

/*
 Question:
 Create a program to find all the multiples of a number taken as user input below 100.
 Hint =>
 Get the input value for a variable named number. Check the number is a positive integer and less than 100.
 Run a for loop backward: from i = 100 to i = 1.
 Inside the loop, check if i perfectly divides the number. If true, print the number and continue the loop.
*/

import java.util.Scanner;

public class MultiplesForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer less than 100: ");
        int number = sc.nextInt();

        if (number > 0 && number < 100) {
            System.out.println("Multiples of " + number + " below 100 are:");
            for (int i = 100; i >= 1; i--) {
                if (i % number == 0) {
                    System.out.print(i + " ");
                }
            }
        } else {
            System.out.println("Please enter a valid positive integer less than 100.");
        }

        sc.close();
    }
}

