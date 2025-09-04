package Assignment.String_Practise.Level3;

// Program 3: Find unique characters in a string using charAt()

import java.util.Scanner;

class UniqueCharactersFinder {

    // Method to calculate length without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }

    // Method to find unique characters
    public static char[] findUniqueCharacters(String text) {
        int length = findLength(text);
        char[] result = new char[length];
        int index = 0;

        for (int i = 0; i < length; i++) {
            char c = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == c) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) result[index++] = c;
        }

        char[] unique = new char[index];
        System.arraycopy(result, 0, unique, 0, index);
        return unique;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String text = sc.nextLine();

            char[] unique = findUniqueCharacters(text);
            System.out.print("Unique characters: ");
            for (char c : unique) System.out.print(c + " ");
        }
    }
}
