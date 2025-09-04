package Assignment.Methods_Practise.Level2;

import java.util.Scanner;

// Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.
class Q1_SimpleInterestCalculator {

    public double calculateSimpleInterest(double principal, double rate, double time) {
        double simpleInterest;
        simpleInterest = (principal * rate * time) / 100.0;
        return simpleInterest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Principal amount: ");
        double principalAmount = scanner.nextDouble();

        System.out.print("Enter the annual Rate of Interest (in %): ");
        double interestRate = scanner.nextDouble();

        System.out.print("Enter the Time period (in years): ");
        double timePeriod = scanner.nextDouble();

        Q1_SimpleInterestCalculator calculator = new Q1_SimpleInterestCalculator();
        double calculatedInterest = calculator.calculateSimpleInterest(principalAmount, interestRate, timePeriod);

        System.out.printf("The Simple Interest is %.2f for Principal %.2f, Rate of Interest %.2f%% and Time %.2f years.\n",
                calculatedInterest, principalAmount, interestRate, timePeriod);

        scanner.close();
    }
}
