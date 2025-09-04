package Assignment.String_Practise.Level1;

// Q9: Convert text to uppercase using charAt() and compare with toUpperCase()

import java.util.Scanner;

public class Q9_ToUpperCase {
    public static String customToUpperCase(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z') {
                result += (char) (c - 32);
            } else {
                result += c;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String input = sc.nextLine();
        String custom = customToUpperCase(input);
        String builtin = input.toUpperCase();
        System.out.println("Custom: " + custom);
        System.out.println("Built-in: " + builtin);
        System.out.println("Equal? " + custom.equals(builtin));
    }
}

