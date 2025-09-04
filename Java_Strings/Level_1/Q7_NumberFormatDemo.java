package Assignment.String_Practise.Level1;

// Q7: Demonstrate NumberFormatException

public class Q7_NumberFormatDemo {
    public static void handleError(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Handled Exception: " + e);
        }
    }

    public static void main(String[] args) {
        handleError("abc123");
    }
}

