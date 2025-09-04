package Assignment.OOPs_01.Level1;

// Program 1: Program to Display Employee Details
// Problem Statement: Write a program to create an Employee class with attributes name,
// id, and salary. Add a method to display the details.

public class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Harshit", 101, 50000);
        emp.displayDetails();
    }
}

