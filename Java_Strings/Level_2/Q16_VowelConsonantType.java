package Assignment.String_Practise.Level2;

import java.util.Scanner;

public class Q16_VowelConsonantType {

    // Method to check character type
    public static String checkCharType(char c) {
        if (c >= 'A' && c <= 'Z') {
            c = (char)(c + 32); // convert uppercase to lowercase using ASCII
        }
        if (c >= 'a' && c <= 'z') {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    // Method to build 2D array of character and type
    public static String[][] buildCharTable(String str) {
        String[][] table = new String[str.length()][2];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            table[i][0] = String.valueOf(c);
            table[i][1] = checkCharType(c);
        }
        return table;
    }

    // Method to display table
    public static void displayTable(String[][] table) {
        System.out.printf("%-10s %-15s%n", "Character", "Type");
        System.out.println("-------------------------");
        for (String[] row : table) {
            System.out.printf("%-10s %-15s%n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] resultTable = buildCharTable(input);
        displayTable(resultTable);

        sc.close();
    }
}

