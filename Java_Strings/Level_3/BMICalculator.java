package Assignment.String_Practise.Level3;

// Program 2: Find the BMI of 10 persons and display height, weight, BMI, and status
// BMI = weight / (height * height) where height is in meters

import java.util.Scanner;

class BMICalculator {

    // Method to compute BMI and Status
    public static String[] computeBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        double bmi = weight / (heightM * heightM);
        String status;

        if (bmi < 18.5) status = "Underweight";
        else if (bmi < 24.9) status = "Normal";
        else if (bmi < 29.9) status = "Overweight";
        else status = "Obese";

        return new String[] {String.format("%.2f", bmi), status};
    }

    // Method to process 2D input array
    public static String[][] processBMI(double[][] data) {
        String[][] results = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double height = data[i][1];
            String[] bmiResult = computeBMI(weight, height);

            results[i][0] = String.valueOf(weight);
            results[i][1] = String.valueOf(height);
            results[i][2] = bmiResult[0];
            results[i][3] = bmiResult[1];
        }
        return results;
    }

    // Method to display data
    public static void display(String[][] results) {
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Weight", "Height", "BMI", "Status");
        for (String[] row : results) {
            System.out.printf("%-10s %-10s %-10s %-15s%n", row[0], row[1], row[2], row[3]);
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double[][] data = new double[10][2];

            System.out.println("Enter weight(kg) and height(cm) for 10 persons:");
            for (int i = 0; i < 10; i++) {
                System.out.print("Person " + (i + 1) + " Weight (kg): ");
                data[i][0] = sc.nextDouble();
                System.out.print("Person " + (i + 1) + " Height (cm): ");
                data[i][1] = sc.nextDouble();
            }

            String[][] results = processBMI(data);
            display(results);
        } catch (Exception e) {
            System.out.println("Error: Invalid input. " + e.getMessage());
        }
    }
}
