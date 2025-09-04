package Assignment.OOPs_01.Level1;

// Program 2: Program to Compute Area of a Circle
// Problem Statement: Write a program to create a Circle class with an attribute radius.
// Add methods to calculate and display the area and circumference of the circle.

class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }

    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    void displayDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }

    public static void main(String[] args) {
        Circle c = new Circle(5.0);
        c.displayDetails();
    }
}

