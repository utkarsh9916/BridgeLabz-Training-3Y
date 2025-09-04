package Assignment.String_Practise.Level2;

// Q3: Write a program to split the text into words and return the words along with their lengths in a 2D array.
import java.util.Scanner;

public class Q13_SplitWithLengths {

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

    // Split method
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

    // Create 2D array of words and lengths
    public static String[][] wordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String input = sc.nextLine();

        String[] words = customSplit(input);
        String[][] table = wordsWithLengths(words);

        System.out.println("Word\tLength");
        for (String[] row : table) {
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
        }
        sc.close();
    }
}

