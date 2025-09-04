package Assignment.ControlFlow_Practises.Level3;

import java.util.Scanner;

/**
 * Question 1: Write a LeapYear program that takes a year as input and outputs
 * the Year is a Leap Year or not a Leap Year.
 * Hint =>
 * a. The LeapYear program only works for year >= 1582, corresponding to a year
 * in the Gregorian calendar. So ensure to check for the same.
 * b. Further, the Leap Year is a Year divisible by 4 and not 100 unless it is
 * divisible by 400. E.g. 1800 is not a Leap Year and 2000 is a Leap Year.
 * c. Write code having multiple if else statements based on conditions
 * provided above.
 */
class LeapYearChecker {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year (e.g., 2024): ");
        int year = input.nextInt();


        boolean isLeapYear = false;

        if (year >= 1582) {

            if (year % 4 == 0) {

                if (year % 100 == 0) {

                    if (year % 400 == 0) {
                        isLeapYear = true;
                    } else {
                        isLeapYear = false;
                    }
                } else {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = false;
            }


            if (isLeapYear) {
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

