package Assignment.Methods_Practise.Level1;

import java.util.Scanner;

// Create a program to find the maximum number of handshakes among students.
class Q2_HandshakeCalculator {

    public int calculateHandshakes(int numberOfStudents) {
        int totalHandshakes;
        if (numberOfStudents < 2) {
            totalHandshakes = 0;
        } else {
            totalHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        }
        return totalHandshakes;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int studentCount = scanner.nextInt();

        Q2_HandshakeCalculator calculator = new Q2_HandshakeCalculator();
        int possibleHandshakes = calculator.calculateHandshakes(studentCount);

        System.out.println("The maximum number of possible handshakes among " + studentCount + " students is " + possibleHandshakes + ".");

        scanner.close();
    }
}
