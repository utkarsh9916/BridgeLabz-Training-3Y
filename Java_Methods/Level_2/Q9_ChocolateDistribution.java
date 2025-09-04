package Assignment.Methods_Practise.Level2;

import java.util.Scanner;

// Create a program to divide N number of chocolates among M children.
// Print the number of chocolates each child will get and also the remaining chocolates
class Q9_ChocolateDistribution {

    public int[] findDistributionAndRemainder(int numberOfChocolates, int numberOfChildren) {
        if (numberOfChildren == 0) {
            return null;
        }
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;
        return new int[]{chocolatesPerChild, remainingChocolates};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total number of chocolates: ");
        int totalChocolates = scanner.nextInt();
        System.out.print("Enter the total number of children: ");
        int totalChildren = scanner.nextInt();

        Q9_ChocolateDistribution distributor = new Q9_ChocolateDistribution();

        if (totalChildren <= 0) {
            System.out.println("Error: Number of children must be a positive number.");
        } else {
            int[] results = distributor.findDistributionAndRemainder(totalChocolates, totalChildren);
            int eachChildGets = results[0];
            int remaining = results[1];

            System.out.println("Each child will get " + eachChildGets + " chocolate(s).");
            System.out.println("There will be " + remaining + " chocolate(s) remaining.");
        }
        scanner.close();
    }
}
