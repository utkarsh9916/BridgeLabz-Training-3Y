package Assignment.Arrays_Practise.Level1;

// Question:
// Write a program to take user input for 5 numbers and check whether a number is positive, negative, or zero.
// Further for positive numbers check if the number is even or odd.
// Finally compare the first and last elements of the array and display if they equal, greater or less.

import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        for (int num : nums) {
            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println(num + " is Positive and Even");
                } else {
                    System.out.println(num + " is Positive and Odd");
                }
            } else if (num < 0) {
                System.out.println(num + " is Negative");
            } else {
                System.out.println(num + " is Zero");
            }
        }

        if (nums[0] == nums[nums.length - 1]) {
            System.out.println("First and last numbers are Equal");
        } else if (nums[0] > nums[nums.length - 1]) {
            System.out.println("First number is Greater than last number");
        } else {
            System.out.println("First number is Less than last number");
        }
    }
}

