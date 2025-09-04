package Assignment.ControlFlow_Practises.Level1;

// CountdownFor.java
// Question:
// Rewrite program to do the countdown using the for-loop.

import java.util.Scanner;

public class CountdownFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter countdown start number: ");
        int num = sc.nextInt();

        for (int i = num; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Launch!");
        sc.close();
    }
}

