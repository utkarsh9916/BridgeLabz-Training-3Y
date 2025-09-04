package Assignment.String_Practise.Level2;

// Q2: Write a program to split the text into words, compare the result with the split() method and display the result.
import java.util.Scanner;

public class Q12_SplitCompare {

    // Custom length method
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

    // Split without using split()
    public static String[] customSplit(String str) {
        int len = getLength(str);
        int spaces = 0;

        // Count words
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

    // Compare arrays
    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String input = sc.nextLine();

        String[] custom = customSplit(input);
        String[] builtIn = input.split(" ");

        System.out.println("Custom Split:");
        for (String w : custom) System.out.println(w);

        System.out.println("\nBuilt-in Split:");
        for (String w : builtIn) System.out.println(w);

        System.out.println("\nArrays are equal? " + compareArrays(custom, builtIn));
        sc.close();
    }
}

