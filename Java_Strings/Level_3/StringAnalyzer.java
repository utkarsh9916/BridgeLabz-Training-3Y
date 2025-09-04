package Assignment.String_Practise.Level3;

// Program 1: Find all the occurrences of a character in a string using charAt()
// Take user input for the String and the character
// Use method to find and return indexes of occurrences

import java.util.Scanner;

class StringAnalyzer {

    // Method to find all the indexes of a character in a string using charAt()
    public static int[] findAllIndexes(String text, char ch) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ch) {
                count++;
            }
        }

        int[] indexes = new int[count];
        int j = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ch) {
                indexes[j++] = i;
            }
        }
        return indexes;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a text: ");
            String text = sc.nextLine();

            System.out.print("Enter a character to find: ");
            char ch = sc.next().charAt(0);

            int[] indexes = findAllIndexes(text, ch);

            if (indexes.length == 0) {
                System.out.println("Character '" + ch + "' not found in text.");
            } else {
                System.out.println("Indexes of character '" + ch + "': ");
                for (int index : indexes) {
                    System.out.print(index + " ");
                }
            }
        } catch (Exception e) {
            System.out.println("Error: Invalid Input. " + e.getMessage());
        }
    }
}
