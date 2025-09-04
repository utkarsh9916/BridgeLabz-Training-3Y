package Assignment.String_Practise.Level3;

// Program 7: Find frequency of characters using nested loops

import java.util.Scanner;

class FrequencyWithNestedLoops {

    public static String[][] findFrequency(String text) {
        char[] chars = text.toCharArray();
        int[] freq = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0') continue;
            freq[i] = 1;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0';
                }
            }
        }

        int count = 0;
        for (int f : freq) if (f > 0) count++;

        String[][] result = new String[count][2];
        int idx = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[idx][0] = String.valueOf(chars[i]);
                result[idx][1] = String.valueOf(freq[i]);
                idx++;
            }
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
