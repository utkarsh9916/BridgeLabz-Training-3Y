package Assignment.String_Practise.Level1;

// Q2: Create a substring using charAt() and compare with built-in substring()

import java.util.Scanner;

public class Q2_Substring {
    public static String customSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = sc.next();
        System.out.println("Enter start and end index:");
        int start = sc.nextInt();
        int end = sc.nextInt();

        String custom = customSubstring(text, start, end);
        String builtin = text.substring(start, end);

        System.out.println("Custom Substring: " + custom);
        System.out.println("Built-in Substring: " + builtin);
        System.out.println("Check Equal:" + custom.equals(builtin));
    }
}

