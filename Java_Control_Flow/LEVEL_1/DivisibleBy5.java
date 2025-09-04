package Assignment.ControlFlow_Practises.Level1;

/*
 Question:
 Write a program to check if a number is divisible by 5
 I/P => number
 O/P => Is the number ___ divisible by 5? ___
*/

import java.util.Scanner;

public class DivisibleBy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        boolean divisible = (number % 5 == 0);
        System.out.println("Is the number " + number + " divisible by 5? " + divisible);

        sc.close();
    }
}

