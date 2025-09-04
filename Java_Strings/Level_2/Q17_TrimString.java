package Assignment.String_Practise.Level2;

// Q17: Write a program to remove all spaces from a given string.
public class Q17_TrimString {
    public static void main(String[] args) {
        String str = "   Hello   World   ";
        String trimmed = str.replaceAll("\\s+", "");
        System.out.println("Original: [" + str + "]");
        System.out.println("Without spaces: [" + trimmed + "]");
    }
}

