
/*
Problem 1: Employee Management System
-------------------------------------
Description:
Build an employee management system with the following requirements:

1. Use an abstract class Employee with fields like employeeId, name, and baseSalary.
2. Provide an abstract method calculateSalary() and a concrete method displayDetails().
3. Create two subclasses: FullTimeEmployee and PartTimeEmployee, implementing calculateSalary()
   based on work hours or fixed salary.
4. Use encapsulation to restrict direct access to fields and provide getter and setter methods.
5. Create an interface Department with methods like assignDepartment() and getDepartmentDetails().
6. Ensure polymorphism by processing a list of employees and displaying their details using the Employee reference.
*/

import java.util.*;

// Interface
interface Department {
    void assignDepartment(String deptName);
    String getDepartmentDetails();
}

// Abstract class
abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    // Constructor
    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Encapsulation: Getters and Setters
    public int getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }

    public void setBaseSalary(double baseSalary) {
        if(baseSalary > 0) {
            this.baseSalary = baseSalary;
        }
    }

    // Abstract method
    public abstract double calculateSalary();

    // Concrete method
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
    }
}

// Subclass: Full-time Employee
class FullTimeEmployee extends Employee implements Department {
    private String department;

    public FullTimeEmployee(int id, String name, double baseSalary) {
        super(id, name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        // Full-time employee has fixed salary
        return getBaseSalary();
    }

    @Override
    public void assignDepartment(String deptName) {
        this.department = deptName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + department;
    }
}

// Subclass: Part-time Employee
class PartTimeEmployee extends Employee implements Department {
    private int hoursWorked;
    private double hourlyRate;
    private String department;

    public PartTimeEmployee(int id, String name, double baseSalary, int hoursWorked, double hourlyRate) {
        super(id, name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        // Part-time employee salary = hourlyRate * hoursWorked
        return hourlyRate * hoursWorked;
    }

    @Override
    public void assignDepartment(String deptName) {
        this.department = deptName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + department;
    }
}

// Main Class
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        FullTimeEmployee e1 = new FullTimeEmployee(101, "Alice", 50000);
        e1.assignDepartment("HR");

        PartTimeEmployee e2 = new PartTimeEmployee(102, "Bob", 0, 80, 200);
        e2.assignDepartment("IT");

        employees.add(e1);
        employees.add(e2);

        // Polymorphism: Using Employee reference
        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println("Calculated Salary: " + emp.calculateSalary());
            if (emp instanceof Department) {
                System.out.println(((Department) emp).getDepartmentDetails());
            }
            System.out.println("-----------------------------");
        }
    }
}

