package Assignment.Methods_Practise.Level2;

import java.util.Scanner;

// Write a program to take 2 numbers and print their quotient and reminder
class Q8_QuotientRemainder {

    public int[] findRemainderAndQuotient(int dividend, int divisor) {
        if (divisor == 0) {
            return null;
        }
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the dividend (the number to be divided): ");
        int numberToDivide = scanner.nextInt();
        System.out.print("Enter the divisor (the number to divide by): ");
        int divisorNumber = scanner.nextInt();

        Q8_QuotientRemainder calculator = new Q8_QuotientRemainder();

        if (divisorNumber == 0) {
            System.out.println("Error: Cannot divide by zero.");
        } else {
            int[] results = calculator.findRemainderAndQuotient(numberToDivide, divisorNumber);
            int quotientResult = results[0];
            int remainderResult = results[1];
            System.out.println("When " + numberToDivide + " is divided by " + divisorNumber + ":");
            System.out.println("The Quotient is: " + quotientResult);
            System.out.println("The Remainder is: " + remainderResult);
        }
        scanner.close();
    }
}
