package Assignment.String_Practise.Level3;

// Program 6: Find frequency of characters in a string using unique characters

import java.util.Scanner;

class FrequencyWithUniqueChars {

    // Method to find unique characters
    public static char[] findUniqueCharacters(String text) {
        char[] temp = new char[text.length()];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == c) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) temp[index++] = c;
        }

        char[] unique = new char[index];
        System.arraycopy(temp, 0, unique, 0, index);
        return unique;
    }

    // Method to find frequency
    public static String[][] findFrequency(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) freq[text.charAt(i)]++;

        char[] unique = findUniqueCharacters(text);
        String[][] result = new String[unique.length][2];

        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(freq[unique[i]]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[][] freq = findFrequency(text);
        System.out.println("Character | Frequency");
        for (String[] row : freq) {
            System.out.println(row[0] + " -> " + row[1]);
        }
    }
}
