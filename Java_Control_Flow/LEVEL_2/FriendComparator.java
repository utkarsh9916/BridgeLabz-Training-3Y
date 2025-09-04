package Assignment.ControlFlow_Practises.Level2;

import java.util.Scanner;

/*
 * Create a program to find the youngest friends among 3 Amar, Akbar, and
 * Anthony based on their ages and the tallest among the friends based on their
 * heights.
 */
class FriendComparator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Amar's age: ");
        int amarAge = input.nextInt();
        System.out.print("Enter Amar's height (in cm): ");
        double amarHeight = input.nextDouble();

        System.out.print("Enter Akbar's age: ");
        int akbarAge = input.nextInt();
        System.out.print("Enter Akbar's height (in cm): ");
        double akbarHeight = input.nextDouble();

        System.out.print("Enter Anthony's age: ");
        int anthonyAge = input.nextInt();
        System.out.print("Enter Anthony's height (in cm): ");
        double anthonyHeight = input.nextDouble();

        String youngest = "Amar";
        int minAge = amarAge;
        if (akbarAge < minAge) {
            minAge = akbarAge;
            youngest = "Akbar";
        }
        if (anthonyAge < minAge) {
            youngest = "Anthony";
        }

        String tallest = "Amar";
        double maxHeight = amarHeight;
        if (akbarHeight > maxHeight) {
            maxHeight = akbarHeight;
            tallest = "Akbar";
        }
        if (anthonyHeight > maxHeight) {
            tallest = "Anthony";
        }

        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);

        input.close();
    }
}
