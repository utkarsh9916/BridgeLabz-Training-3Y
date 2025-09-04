package Assignment.ControlFlow_Practises.Level1;

// FactorialFor.java
// Question:
// Rewrite program using for loop to find factorial.

import java.util.Scanner;

public class FactorialFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Not a positive integer");
        } else {
            long fact = 1;
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            System.out.println("Factorial: " + fact);
        }
        sc.close();
    }
}

