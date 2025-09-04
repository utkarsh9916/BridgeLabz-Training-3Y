package Assignment.String_Practise.Level1;

// Q6: Demonstrate IllegalArgumentException

public class Q6_IllegalArgumentDemo {
    public static void handleError(String text) {
        try {
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Handled Exception: " + e);
        }
    }

    public static void main(String[] args) {
        handleError("HelloWorld");
    }
}
