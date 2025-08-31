import java.util.Scanner;

public class BasicCalculator {
    public static double add(double a, double b) { return a + b; }
    public static double subtract(double a, double b) { return a - b; }
    public static double multiply(double a, double b) { return a * b; }
    public static double divide(double a, double b) { return a / b; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.print("Choose operation (+, -, *, /): ");
        char op = sc.next().charAt(0);

        double result = 0;
        switch (op) {
            case '+': result = add(a, b); break;
            case '-': result = subtract(a, b); break;
            case '*': result = multiply(a, b); break;
            case '/': 
                if (b != 0) result = divide(a, b);
                else { System.out.println("Cannot divide by zero!"); sc.close(); return; }
                break;
            default: System.out.println("Invalid operation!"); sc.close(); return;
        }
        System.out.println("Result = " + result);
        sc.close();
    }
}
