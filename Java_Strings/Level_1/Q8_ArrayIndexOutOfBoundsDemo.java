package Assignment.String_Practise.Level1;

// Q8: Demonstrate ArrayIndexOutOfBoundsException

public class Q8_ArrayIndexOutOfBoundsDemo {
    public static void handleError(String[] arr) {
        try {
            System.out.println(arr[arr.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled Exception: " + e);
        }
    }

    public static void main(String[] args) {
        String[] arr = {"A", "B", "C"};
        handleError(arr);
    }
}

