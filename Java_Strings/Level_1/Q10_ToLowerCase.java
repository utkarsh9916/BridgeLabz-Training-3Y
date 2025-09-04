package Assignment.String_Practise.Level1;

// Q10: Convert text to lowercase using charAt() and compare with toLowerCase()

import java.util.Scanner;

public class Q10_ToLowerCase {
    public static String customToLowerCase(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                result += (char) (c + 32);
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
        String custom = customToLowerCase(input);
        String builtin = input.toLowerCase();
        System.out.println("Custom: " + custom);
        System.out.println("Built-in: " + builtin);
        System.out.println("Equal? " + custom.equals(builtin));
    }
}

