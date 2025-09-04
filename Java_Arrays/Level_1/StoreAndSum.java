package Assignment.Arrays_Practise.Level1;

// Question:
// Write a program to store multiple values in an array up to a maximum of 10 or until the user enters a 0 or a negative number.
// Show all the numbers as well as the sum of all numbers.
// Hint => Use while(true), break when input is 0/negative or array is full.

import java.util.Scanner;

public class StoreAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double num = sc.nextDouble();

            if (num <= 0 || index == 10) {
                break;
            }

            numbers[index] = num;
            index++;
        }

        System.out.println("Numbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
            total += numbers[i];
        }
        System.out.println("\nTotal sum = " + total);
    }
}
