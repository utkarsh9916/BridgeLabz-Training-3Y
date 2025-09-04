package Assignment.Methods_Practise.Level1;

import java.util.Scanner;

// Write a program calculate the wind chill temperature given the temperature and wind speed
class Q10_WindChillCalculator {

    public double calculateWindChill(double temperature, double windSpeed) {
        double windChill;
        windChill = 35.74 + (0.6215 * temperature) + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
        return windChill;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit (must be <= 50): ");
        double tempF = scanner.nextDouble();
        System.out.print("Enter the wind speed in miles per hour (must be >= 3): ");
        double windMph = scanner.nextDouble();

        Q10_WindChillCalculator calculator = new Q10_WindChillCalculator();

        if (tempF > 50 || windMph < 3) {
            System.out.println("The formula is not valid for the entered values. Please use temp <= 50 F and wind speed >= 3 mph.");
        } else {
            double windChillResult = calculator.calculateWindChill(tempF, windMph);
            System.out.printf("The wind chill temperature is: %.2f degrees Fahrenheit.\n", windChillResult);
        }

        scanner.close();
    }
}
