package Assignment.ControlFlow_Practises.Level1;

// OddEvenNumbers.java
// Question:
// Create a program to print odd and even numbers between 1 to the number entered by the user.

import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Not a natural number");
        } else {
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is Even");
                } else {
                    System.out.println(i + " is Odd");
                }
            }
        }
        sc.close();
    }
}

