package Assignment.ControlFlow_Practises.Level1;

// SumUntilZeroOrNegative.java
// Question:
// Rewrite the program to find the sum until the user enters 0 or a negative number using while loop and break statement.

import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;

        System.out.println("Enter numbers (0 or negative to stop):");
        while (true) {
            double input = sc.nextDouble();
            if (input <= 0) break;
            total += input;
        }
        System.out.println("Total sum: " + total);
        sc.close();
    }
}

