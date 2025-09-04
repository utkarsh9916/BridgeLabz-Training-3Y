package Assignment.ControlFlow_Practises.Level3;

import java.util.Scanner;

/**
 * Question 2: Rewrite program 1 to determine Leap Year with a single if
 * condition using logical && and || operators.
 */
class LeapYearCheckerSingleIf {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Enter a year (e.g., 2000): ");


        int year = input.nextInt();


        if (year >= 1582) {

            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        } else {

            System.out.println("Please enter a year of 1582 or later.");
        }


        input.close();
    }
}
