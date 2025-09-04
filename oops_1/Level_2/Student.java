package Assignment.OOPs_01.Level2;

// Program 1: Program to Simulate Student Report
// Problem Statement: Create a Student class with attributes name, rollNumber, and
// marks. Add two methods:
// ● To calculate the grade based on the marks.
// ● To display the student's details and grade.

public class Student {
    String name;
    int rollNumber;
    double marks;

    Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    String calculateGrade() {
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 50) return "C";
        else return "F";
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

    public static void main(String[] args) {
        Student s1 = new Student("Harshit", 101, 82);
        s1.displayDetails();
    }
}

