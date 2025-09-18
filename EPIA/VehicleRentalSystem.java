
/*

Description:
Design a system to manage vehicle rentals:

1. Define an abstract class Vehicle with fields like vehicleNumber, type, and rentalRate.
2. Add an abstract method calculateRentalCost(int days).
3. Create subclasses Car, Bike, and Truck with specific implementations of calculateRentalCost().
4. Use an interface Insurable with methods calculateInsurance() and getInsuranceDetails().
5. Apply encapsulation to restrict access to sensitive details like insurance policy numbers.
6. Demonstrate polymorphism by iterating over a list of vehicles and calculating rental and insurance costs for each.
*/

import java.util.*;

// Interface
interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

// Abstract Class
abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;
    private String insurancePolicyNumber;  // sensitive data

    public Vehicle(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    // Encapsulation
    public String getVehicleNumber() { return vehicleNumber; }
    public String getType() { return type; }
    public double getRentalRate() { return rentalRate; }

    // Sensitive field: no getter for insurance policy number
    protected String getInsurancePolicyNumber() { return insurancePolicyNumber; }

    // Abstract method
    public abstract double calculateRentalCost(int days);

    // Concrete method
    public void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Type: " + type);
        System.out.println("Rental Rate per Day: " + rentalRate);
    }
}

// Subclass: Car
class Car extends Vehicle implements Insurable {
    public Car(String number, double rate, String policy) {
        super(number, "Car", rate, policy);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;  // simple calculation
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.15;  // 15% of rate as insurance
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance (Policy: " + getInsurancePolicyNumber() + ")";
    }
}

// Subclass: Bike
class Bike extends Vehicle implements Insurable {
    public Bike(String number, double rate, String policy) {
        super(number, "Bike", rate, policy);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 0.9; // 10% discount for bikes
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.05; // 5% of rate as insurance
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance (Policy: " + getInsurancePolicyNumber() + ")";
    }
}

// Subclass: Truck
class Truck extends Vehicle implements Insurable {
    public Truck(String number, double rate, String policy) {
        super(number, "Truck", rate, policy);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days + 1000; // extra fee
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.25; // 25% of rate as insurance
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance (Policy: " + getInsurancePolicyNumber() + ")";
    }
}

// Main class
public class VehicleRentalSystem {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("C101", 2000, "CAR12345"));
        vehicles.add(new Bike("B202", 800, "BIKE56789"));
        vehicles.add(new Truck("T303", 5000, "TRUCK98765"));

        int days = 5;

        // Polymorphism
        for(Vehicle v : vehicles) {
            v.displayDetails();
            double rental = v.calculateRentalCost(days);
            double insurance = 0;

            if(v instanceof Insurable) {
                insurance = ((Insurable)v).calculateInsurance();
                System.out.println(((Insurable)v).getInsuranceDetails());
            }

            System.out.println("Rental for " + days + " days: " + rental);
            System.out.println("Insurance: " + insurance);
            System.out.println("Total Cost: " + (rental + insurance));
            System.out.println("-----------------------------");
        }
    }
}
