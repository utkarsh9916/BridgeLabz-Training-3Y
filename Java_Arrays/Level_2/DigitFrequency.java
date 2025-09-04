package Assignment.Arrays_Practise.Level2;

/*
Create a program to take a number as input find the frequency of each digit in the number using an array and display the frequency of each digit

Hint =>
Take the input for a number
Find the count of digits in the number
Find the digits in the number and save them in an array
Find the frequency of each digit in the number. For this define a frequency array of size 10,
Loop through the digits array, and increase the frequency of each digit
Display the frequency of each digit in the number
*/

import java.util.*;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long num = sc.nextLong();

        List<Integer> digits = new ArrayList<>();
        while (num > 0) {
            digits.add((int)(num % 10));
            num /= 10;
        }

        int[] frequency = new int[10];
        for (int d : digits) {
            frequency[d]++;
        }

        System.out.println("\n--- Digit Frequency ---");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }
    }
}

