package Assignment.ControlFlow_Practises.Level3;

import java.util.Scanner;

/**
 * Question 3: Write a program to input marks and 3 subjects physics, chemistry
 * and maths. Compute the percentage and then calculate the grade as per the
 * following guidelines.
 * Grade A: 80% and above
 * Grade B: 70-79%
 * Grade C: 60-69%
 * Grade D: 50-59%
 * Grade E: 40-49%
 * Grade R: 39% and below
 * Hint => Ensure the Output clearly shows the Average Mark as well as the
 * Grade and Remarks.
 */
class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter marks for Physics: ");
        int physicsMarks = input.nextInt();

        System.out.print("Enter marks for Chemistry: ");
        int chemistryMarks = input.nextInt();

        System.out.print("Enter marks for Maths: ");
        int mathsMarks = input.nextInt();


        int totalMarks = physicsMarks + chemistryMarks + mathsMarks;


        double averagePercentage = (double) totalMarks / 3;


        char grade;
        String remarks;


        if (averagePercentage >= 80) {
            grade = 'A';
            remarks = "(Level 4, above agency-normalized standards)";
        } else if (averagePercentage >= 70) {
            grade = 'B';
            remarks = "(Level 3, at agency-normalized standards)";
        } else if (averagePercentage >= 60) {
            grade = 'C';
            remarks = "(Level 2, below, but approaching agency-normalized standards)";
        } else if (averagePercentage >= 50) {
            grade = 'D';
            remarks = "(Level 1, well below agency-normalized standards)";
        } else if (averagePercentage >= 40) {
            grade = 'E';
            remarks = "(Level 1-, too below agency-normalized standards)";
        } else {
            grade = 'R';
            remarks = "(Remedial standards)";
        }


        System.out.println("\n--- Result ---");
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

        // Closing the Scanner Stream.
        input.close();
    }
}
