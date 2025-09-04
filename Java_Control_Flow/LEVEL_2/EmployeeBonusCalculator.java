package Assignment.ControlFlow_Practises.Level2;

import java.util.Scanner;

/*
 * Create a program to find the bonuses of employees based on their years of service.
 * Zara decided to give a bonus of 5% to employees whose year of service is more
 * than 5 years. Take salary and year of service in the year as input.
 * Print the bonus amount.
 */
class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter employee's salary: ");
        double salary = input.nextDouble();

        System.out.print("Enter employee's years of service: ");
        int yearsOfService = input.nextInt();

        if (yearsOfService > 5) {
            double bonusAmount = 0.05 * salary;
            System.out.println("The bonus amount is: " + bonusAmount);
        } else {
            System.out.println("No bonus is awarded for less than or equal to 5 years of service.");
        }

        input.close();
    }
}
