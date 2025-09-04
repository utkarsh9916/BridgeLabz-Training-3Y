package Assignment.String_Practise.Level1;

// Q1: Write a program to compare two strings using the charAt() method
// and check the result with the built-in String equals() method

import java.util.Scanner;

public class Q1_StringCompare {
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings to compare:");
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println("Custom Compare: " + compareStrings(s1, s2));
        System.out.println("Built-in Compare: " + s1.equals(s2));
    }
}

