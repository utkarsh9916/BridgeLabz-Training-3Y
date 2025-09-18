class Circle {
    private double radius;

    // Default constructor
    public Circle() {
        this(1.0); // constructor chaining
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    public void display() {
        System.out.println("Circle Radius: " + radius);
    }
}

public class Circle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5.5);

        c1.display();
        c2.display();
    }
}
