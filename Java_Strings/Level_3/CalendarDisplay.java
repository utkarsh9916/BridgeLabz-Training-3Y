package Assignment.String_Practise.Level3;

// Program 10: Display calendar for given month and year

import java.util.Scanner;

class CalendarDisplay {

    static String[] months = {
            "", "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
    };

    static int[] daysInMonth = {
            0, 31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
    };

    // Leap year check
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    // First day of month (Zeller's congruence)
    public static int firstDayOfMonth(int month, int year) {
        int d = 1;
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        return (d + x + (31 * m0) / 12) % 7;
    }

    // Display calendar
    public static void displayCalendar(int month, int year) {
        if (month == 2 && isLeapYear(year)) daysInMonth[2] = 29;
        else daysInMonth[2] = 28;

        System.out.println("   " + months[month] + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");

        int firstDay = firstDayOfMonth(month, year);
        for (int i = 0; i < firstDay; i++) System.out.print("   ");

        for (int day = 1; day <= daysInMonth[month]; day++) {
            System.out.printf("%2d ", day);
            if ((day + firstDay) % 7 == 0) System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        displayCalendar(month, year);
    }
}
