package Assignment.Arrays_Practise.Level2;

// Question:
// Create a program to take a number as input and reverse the number.
// To do this, store the digits of the number in an array and display the array in reverse order.

import java.util.Scanner;

public class ReverseNumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int temp = number, count = 0;
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];
        for (int i = 0; i < count; i++) {
            digits[i] = number % 10;
            number /= 10;
        }

        System.out.print("Reversed number: ");
        for (int d : digits) {
            System.out.print(d);
        }
    }
}

