package Assignment.ControlFlow_Practises.Level2;
import java.util.Scanner;

/*
 * Create a program to find the multiplication table of a number entered by the
 * user from 6 to 9.
 */
class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        System.out.println("Multiplication table for " + number + " from 6 to 9:");
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }

        input.close();
    }
}
