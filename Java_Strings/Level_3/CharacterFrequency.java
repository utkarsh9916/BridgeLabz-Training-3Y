package Assignment.String_Practise.Level3;

// Program 5: Frequency of characters using charAt()

import java.util.Scanner;

class CharacterFrequency {

    public static String[][] findFrequency(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) freq[text.charAt(i)]++;

        int count = 0;
        for (int i = 0; i < 256; i++) if (freq[i] > 0) count++;

        String[][] result = new String[count][2];
        int idx = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[idx][0] = Character.toString((char) i);
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
