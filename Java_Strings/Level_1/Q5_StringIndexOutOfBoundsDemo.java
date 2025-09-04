package Assignment.String_Practise.Level1;

// Q5: Demonstrate StringIndexOutOfBoundsException

public class Q5_StringIndexOutOfBoundsDemo {
    public static void handleError(String text) {
        try {
            System.out.println(text.charAt(text.length() + 1));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Handled Exception: " + e);
        }
    }

    public static void main(String[] args) {
        handleError("Hello");
    }
}

