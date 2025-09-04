package Assignment.ControlFlow_Practises.Level1;

// CountdownWhile.java
// Question:
// Write a program to count down the number from the user input value to 1 using a while loop for a rocket launch.

import java.util.Scanner;

public class CountdownWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter countdown start number: ");
        int counter = sc.nextInt();

        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
        System.out.println("Launch!");
        sc.close();
    }
}


