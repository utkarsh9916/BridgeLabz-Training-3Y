package Assignment.String_Practise.Level2;

// Q4: Write a program to split the text into words and find the shortest and longest strings in a given text.
import java.util.Scanner;

public class Q14_ShortestLongestWord {

    // Method to get string length
    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {}
        return count;
    }

    // Split into words
    public static String[] customSplit(String str) {
        int len = getLength(str);
        int spaces = 0;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') spaces++;
        }

        String[] words = new String[spaces + 1];
        int wordIndex = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            if (c == ' ') {
                words[wordIndex++] = sb.toString();
                sb.setLength(0);
            } else {
                sb.append(c);
            }
        }
        words[wordIndex] = sb.toString();
        return words;
    }

    // Create 2D array (word + length)
    public static String[][] wordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }

    // Find shortest and longest word indexes
    public static int[] findMinMax(String[][] arr) {
        int minIndex = 0, maxIndex = 0;
        int minLen = Integer.parseInt(arr[0][1]);
        int maxLen = Integer.parseInt(arr[0][1]);

        for (int i = 1; i < arr.length; i++) {
            int len = Integer.parseInt(arr[i][1]);
            if (len < minLen) {
                minLen = len;
                minIndex = i;
            }
            if (len > maxLen) {
                maxLen = len;
                maxIndex = i;
            }
        }
        return new int[]{minIndex, maxIndex};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String input = sc.nextLine();

        String[] words = customSplit(input);
        String[][] table = wordsWithLengths(words);
        int[] minMax = findMinMax(table);

        System.out.println("Shortest word: " + table[minMax[0]][0] + " (Length " + table[minMax[0]][1] + ")");
        System.out.println("Longest word: " + table[minMax[1]][0] + " (Length " + table[minMax[1]][1] + ")");
        sc.close();
    }
}

