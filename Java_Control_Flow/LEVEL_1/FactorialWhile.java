package Assignment.ControlFlow_Practises.Level1;

// FactorialWhile.java
// Question:
// Write a Program to find the factorial of an integer entered by the user using while loop.

import java.util.Scanner;

public class FactorialWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Not a positive integer");
        } else {
            long fact = 1;
            int i = 1;
            while (i <= n) {
                fact *= i;
                i++;
            }
            System.out.println("Factorial: " + fact);
        }
        sc.close();
    }
}

