package Assignment.Methods_Practise.Level1;
import java.util.Scanner;

// Write a program to find the sum of n natural numbers using loop
class Q6_NaturalNumberSumLoop {

    public long findSumUsingLoop(int n) {
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number (n): ");
        int numberN = scanner.nextInt();

        if (numberN <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            Q6_NaturalNumberSumLoop calculator = new Q6_NaturalNumberSumLoop();
            long totalSum = calculator.findSumUsingLoop(numberN);
            System.out.println("The sum of the first " + numberN + " natural numbers is " + totalSum + ".");
        }
        scanner.close();
    }
}
