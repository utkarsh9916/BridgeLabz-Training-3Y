package Assignment.ControlFlow_Practises.Level1;

// SumNaturalFor.java
// Question:
// Rewrite the program with the for loop instead of a while loop to find the sum of n Natural Numbers.

import java.util.Scanner;

public class SumNaturalFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Not a natural number");
        } else {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            int formula = n * (n + 1) / 2;
            System.out.println("Sum using for loop: " + sum);
            System.out.println("Sum using formula: " + formula);
        }
        sc.close();
    }
}

