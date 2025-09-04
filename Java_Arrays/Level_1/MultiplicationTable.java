package Assignment.Arrays_Practise.Level1;

// Question:
// Create a program to print a multiplication table of a number.
// Hint => Get an integer input and store it in the number variable.
// Run a loop from 1 to 10 and store the results in the multiplication table array.
// Finally, display the result in the format number * i = ___

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] table = new int[10];
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }

        for (int i = 0; i < table.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + table[i]);
        }
    }
}

