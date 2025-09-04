package Assignment.ControlFlow_Practises.Level3;

import java.util.Scanner;

/**
 * Question 10: Write a program to create a calculator using switch...case.
 * Hint =>
 * a. Create two double variables named first and second and a String variable
 * named op.
 * b. Get input values for all variables.
 * c. The input for the operator can only be one of the four values: "+", "-",
 * "*", or "/".
 * d. Based on the input value of the op, perform specific operations using the
 * switch...case statement and print the result.
 * e. If op is +, perform addition between first and second; if it is -, perform
 * subtraction and so on.
 * f. If op is neither of those 4 values, print Invalid Operator.
 */
class SimpleCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Enter the first number: ");
        double firstNumber = input.nextDouble();


        System.out.print("Enter an operator (+, -, *, /): ");
        String operator = input.next();


        System.out.print("Enter the second number: ");
        double secondNumber = input.nextDouble();


        double result = 0.0;

        switch (operator) {
            case "+":
                result = firstNumber + secondNumber;
                System.out.printf("%.2f + %.2f = %.2f\n", firstNumber, secondNumber, result);
                break;

            case "-":
                result = firstNumber - secondNumber;
                System.out.printf("%.2f - %.2f = %.2f\n", firstNumber, secondNumber, result);
                break;

            case "*":
                result = firstNumber * secondNumber;
                System.out.printf("%.2f * %.2f = %.2f\n", firstNumber, secondNumber, result);
                break;

            case "/":

                if (secondNumber != 0) {
                    result = firstNumber / secondNumber;
                    System.out.printf("%.2f / %.2f = %.2f\n", firstNumber, secondNumber, result);
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                }
                break;


            default:
                System.out.println("Error: Invalid operator entered. Please use +, -, *, or /.");
                break;
        }


        input.close();
    }
}

