package Assignment.Methods_Practise.Level1;

import java.util.Scanner;
import java.util.Arrays;

// Write a program to find the smallest and the largest of the 3 numbers.
class Q7_MinMaxFinder {

    public int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest = Math.min(Math.min(number1, number2), number3);
        int largest = Math.max(Math.max(number1, number2), number3);
        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three integers:");
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        Q7_MinMaxFinder finder = new Q7_MinMaxFinder();
        int[] results = finder.findSmallestAndLargest(num1, num2, num3);

        int smallestNumber = results[0];
        int largestNumber = results[1];

        System.out.println("Among the numbers " + num1 + ", " + num2 + ", and " + num3 + ":");
        System.out.println("The smallest number is: " + smallestNumber);
        System.out.println("The largest number is: " + largestNumber);

        scanner.close();
    }
}
