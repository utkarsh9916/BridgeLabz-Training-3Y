package Assignment.Methods_Practise.Level1;

import java.util.Scanner;

// An athlete runs in a triangular park with sides provided as input by the user in meters.
// If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete
class Q3_AthleteRun {

    public double computeRoundsFor5km(double side1, double side2, double side3) {
        double perimeterInMeters = side1 + side2 + side3;
        double targetDistanceInMeters = 5000.0;
        double requiredRounds = targetDistanceInMeters / perimeterInMeters;
        return requiredRounds;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the lengths of the three sides of the triangular park (in meters):");
        System.out.print("Enter length of side 1: ");
        double sideA = scanner.nextDouble();
        System.out.print("Enter length of side 2: ");
        double sideB = scanner.nextDouble();
        System.out.print("Enter length of side 3: ");
        double sideC = scanner.nextDouble();

        Q3_AthleteRun runCalculator = new Q3_AthleteRun();
        double numberOfRounds = runCalculator.computeRoundsFor5km(sideA, sideB, sideC);

        System.out.printf("To complete a 5 km run, the athlete must complete approximately %.2f rounds of the park.\n", numberOfRounds);

        scanner.close();
    }
}
