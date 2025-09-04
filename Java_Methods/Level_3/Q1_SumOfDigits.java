package Assignment.Methods_Practise.Level3;

/*
Question 1: Create a program to find the sum of all the digits of a number
given by a user using an array and display the sum.
Use Math.random() and get a 4-digit random integer number.
Write a method to count digits in the number.
*/

import java.util.*;

public class Q1_SumOfDigits {
    // Method to count digits
    public static int countDigits(int number) {
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    // Method to find sum of digits
    public static int sumOfDigits(int number) {
        int digits = countDigits(number);
        int[] arr = new int[digits];
        int index = digits - 1;
        int sum = 0;

        while (number > 0) {
            arr[index] = number % 10;
            sum += arr[index];
            number /= 10;
            index--;
        }
        return sum;
    }

    public static void main(String[] args) {
        // generate 4-digit random number
        int randomNum = 1000 + (int)(Math.random() * 9000);
        System.out.println("Random 4-digit number: " + randomNum);

        int result = sumOfDigits(randomNum);
        System.out.println("Sum of digits: " + result);
    }
}
