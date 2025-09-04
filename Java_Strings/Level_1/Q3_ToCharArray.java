package Assignment.String_Practise.Level1;

// Q3: Return characters using custom method and compare with toCharArray()

import java.util.Scanner;

public class Q3_ToCharArray {
    public static char[] customToCharArray(String text) {
        char[] arr = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            arr[i] = text.charAt(i);
        }
        return arr;
    }

    public static boolean compareCharArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = sc.next();
        char[] customArr = customToCharArray(text);
        char[] builtinArr = text.toCharArray();
        System.out.println("Arrays equal? " + compareCharArrays(customArr, builtinArr));
    }
}

