package Assignment.ControlFlow_Practises.Level1;

// MultiplicationTable.java
// Question:
// Create a program to find the multiplication table of a number entered by the user from 6 to 9.

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        for (int i = 6; i <= 9; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
        sc.close();
    }
}

