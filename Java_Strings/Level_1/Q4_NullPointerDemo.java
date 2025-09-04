package Assignment.String_Practise.Level1;

// Q4: Demonstrate NullPointerException

public class Q4_NullPointerDemo {
    public static void handleNullPointer() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Handled NullPointerException: " + e);
        }
    }

    public static void main(String[] args) {
        handleNullPointer();
    }
}

