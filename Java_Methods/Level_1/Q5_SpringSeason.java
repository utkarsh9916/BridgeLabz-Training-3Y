package Assignment.Methods_Practise.Level1;

import java.util.Scanner;

// Write a program SpringSeason that takes two int values month and day from the command line
// and prints “Its a Spring Season” otherwise prints “Not a Spring Season”.
class Q5_SpringSeason {

    public boolean isSpringSeason(int month, int day) {
        if (month == 3 && day >= 20 && day <= 31) {
            return true;
        }
        if (month == 4 && day >= 1 && day <= 30) {
            return true;
        }
        if (month == 5 && day >= 1 && day <= 31) {
            return true;
        }
        if (month == 6 && day >= 1 && day <= 20) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the month (1-12): ");
        int inputMonth = scanner.nextInt();
        System.out.print("Enter the day (1-31): ");
        int inputDay = scanner.nextInt();

        Q5_SpringSeason checker = new Q5_SpringSeason();
        boolean isSpring = checker.isSpringSeason(inputMonth, inputDay);

        if (isSpring) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }
        scanner.close();
    }
}
