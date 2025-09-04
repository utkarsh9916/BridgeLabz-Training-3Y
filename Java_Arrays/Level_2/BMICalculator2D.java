package Assignment.Arrays_Practise.Level2;

/*
Rewrite the above program using multi-dimensional array to store height, weight, and BMI in 2D array for all the persons

Hint =>
Take input for a number of persons
Create a multi-dimensional array to store weight, height and BMI. Also create an array to store the weight status of the persons
double[][] personData = new double[number][3];
String[] weightStatus = new String[number];
Take input for weight and height of the persons and for negative values, ask the user to enter positive values
Calculate BMI of all the persons and store them in the personData array and also find the weight status and put them in the weightStatus array
Display the height, weight, BMI and status of each person
*/

import java.util.*;

public class BMICalculator2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[][] personData = new double[n][3]; // 0 -> weight, 1 -> height, 2 -> BMI
        String[] weightStatus = new String[n];

        for (int i = 0; i < n; i++) {
            double w, h;
            do {
                System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
                w = sc.nextDouble();
            } while (w <= 0);

            do {
                System.out.print("Enter height (m) of person " + (i + 1) + ": ");
                h = sc.nextDouble();
            } while (h <= 0);

            double bmi = w / (h * h);

            personData[i][0] = w;
            personData[i][1] = h;
            personData[i][2] = bmi;

            if (bmi < 18.5) weightStatus[i] = "Underweight";
            else if (bmi < 25) weightStatus[i] = "Normal";
            else if (bmi < 30) weightStatus[i] = "Overweight";
            else weightStatus[i] = "Obese";
        }

        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < n; i++) {
            System.out.printf("Person %d -> Height: %.2f m, Weight: %.2f kg, BMI: %.2f, Status: %s%n",
                    i + 1, personData[i][1], personData[i][0], personData[i][2], weightStatus[i]);
        }
    }
}

