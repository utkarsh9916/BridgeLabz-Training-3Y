package Assignment.OOPs_01.Level2;

// Program 3: Program to Check Palindrome String
// Problem Statement: Create a PalindromeChecker class with an attribute text. Add
// methods to:
// ● Check if the text is a palindrome.
// ● Display the result.

class PalindromeChecker {
    String text;

    PalindromeChecker(String text) {
        this.text = text;
    }

    boolean isPalindrome() {
        String clean = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int i = 0, j = clean.length() - 1;
        while (i < j) {
            if (clean.charAt(i) != clean.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    void displayResult() {
        if (isPalindrome())
            System.out.println("\"" + text + "\" is a Palindrome.");
        else
            System.out.println("\"" + text + "\" is not a Palindrome.");
    }

    public static void main(String[] args) {
        PalindromeChecker p1 = new PalindromeChecker("madam");
        p1.displayResult();

        PalindromeChecker p2 = new PalindromeChecker("Hello");
        p2.displayResult();
    }
}

