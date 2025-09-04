package Assignment.Methods_Practise.Level1;
import java.util.Scanner;

// Write a program to check whether a number is positive, negative, or zero.
class Q4_NumberChecker {

    public int checkNumberSign(int number) {
        if (number > 0) {
            return 1;
        } else if (number < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer to check: ");
        int userInput = scanner.nextInt();

        Q4_NumberChecker checker = new Q4_NumberChecker();
        int result = checker.checkNumberSign(userInput);

        if (result == 1) {
            System.out.println("The number " + userInput + " is Positive.");
        } else if (result == -1) {
            System.out.println("The number " + userInput + " is Negative.");
        } else {
            System.out.println("The number is Zero.");
        }

        scanner.close();
    }
}
