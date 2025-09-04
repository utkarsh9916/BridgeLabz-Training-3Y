package Assignment.ControlFlow_Practises.Level3;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking weight input in kilograms
        System.out.print("Enter your weight in kg: ");
        double weight = sc.nextDouble();

        // Taking height input in centimeters
        System.out.print("Enter your height in cm: ");
        double heightCm = sc.nextDouble();

        // Convert height from cm to meters
        double heightM = heightCm / 100;

        // Calculate BMI
        double bmi = weight / (heightM * heightM);

        // Display BMI
        System.out.printf("Your BMI is: %.2f\n", bmi);

        // Determine weight status
        if (bmi < 18.5) {
            System.out.println("You are Underweight.");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("You have Normal weight.");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("You are Overweight.");
        } else {
            System.out.println("You are Obese.");
        }

        sc.close();
    }
}

