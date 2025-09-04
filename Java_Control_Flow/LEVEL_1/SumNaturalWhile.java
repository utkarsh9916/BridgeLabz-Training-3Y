package Assignment.ControlFlow_Practises.Level1;

// SumNaturalWhile.java
// Question:
// Write a program to find the sum of n natural numbers using while loop compare the result with the formula n*(n+1)/2.

import java.util.Scanner;

public class SumNaturalWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Not a natural number");
        } else {
            int sum = 0, i = 1;
            while (i <= n) {
                sum += i;
                i++;
            }
            int formula = n * (n + 1) / 2;
            System.out.println("Sum using while loop: " + sum);
            System.out.println("Sum using formula: " + formula);
        }
        sc.close();
    }
}

