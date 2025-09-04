package Assignment.String_Practise.Level2;

// Q1: Write a program to find and return the length of a string without using the length() method.
// Hint: Use infinite loop with charAt() until runtime exception occurs.
import java.util.Scanner;

public class Q11_StringLength {

    // Method to calculate length without using length()
    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // Exception occurs when index is out of bounds
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();

        int myLength = getLength(input);
        int builtInLength = input.length();

        System.out.println("Length (user-defined method): " + myLength);
        System.out.println("Length (built-in method): " + builtInLength);
        sc.close();
    }
}

