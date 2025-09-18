
/*
Description:
Develop a ride-hailing application:

1. Define an abstract class Transport with fields like transportId, driverName, and ratePerKm.
2. Add abstract methods calculateFare(double distance) and a concrete method getTransportDetails().
3. Create subclasses Sedan, Scooter, and Rickshaw, overriding calculateFare() based on type-specific rates.
4. Use an interface Navigator with methods getCurrentLocation() and updateLocation().
5. Secure driver and transport details using encapsulation.
6. Demonstrate polymorphism by creating a method to calculate fares for different transport types dynamically.
*/

import java.util.*;

// Interface
interface Navigator {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

// Abstract class
abstract class Transport implements Navigator {
    private String transportId;
    private String driverName;
    private double ratePerKm;
    private String currentLocation;

    public Transport(String transportId, String driverName, double ratePerKm, String currentLocation) {
        this.transportId = transportId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
        this.currentLocation = currentLocation;
    }

    // Encapsulation
    public String getTransportId() { return transportId; }
    public String getDriverName() { return driverName; }
    public double getRatePerKm() { return ratePerKm; }

    // Abstract method
    public abstract double calculateFare(double distance);

    // Concrete method
    public void getTransportDetails() {
        System.out.println("Transport ID: " + transportId + ", Driver: " + driverName + ", Rate per Km: " + ratePerKm);
    }

    // Navigator implementation
    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}

// Subclass: Sedan
class Sedan extends Transport {
    public Sedan(String id, String driver, double rate, String location) {
        super(id, driver, rate, location);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }
}

// Subclass: Scooter
class Scooter extends Transport {
    public Scooter(String id, String driver, double rate, String location) {
        super(id, driver, rate, location);
    }

    @Override
    public double calculateFare(double distance) {
        // Scooters give 20% discount
        return distance * getRatePerKm() * 0.8;
    }
}

// Subclass: Rickshaw
class Rickshaw extends Transport {
    public Rickshaw(String id, String driver, double rate, String location) {
        super(id, driver, rate, location);
    }

    @Override
    public double calculateFare(double distance) {
        // Rickshaws have a base fare of 30 + per km rate
        return 30 + (distance * getRatePerKm());
    }
}

// Main class
class RideHailingApplication {
    public static void main(String[] args) {
        List<Transport> rides = new ArrayList<>();
        rides.add(new Sedan("S101", "Ravi Kumar", 15, "Downtown"));
        rides.add(new Scooter("SC202", "Amit Singh", 10, "Airport"));
        rides.add(new Rickshaw("R303", "Sunil Verma", 12, "Railway Station"));

        double distance = 10; // e.g., 10 km ride

        // Polymorphism: handling different transports through Transport reference
        for (Transport t : rides) {
            t.getTransportDetails();
            System.out.println("Current Location: " + t.getCurrentLocation());
            double fare = t.calculateFare(distance);
            System.out.println("Fare for " + distance + " km: " + fare);
            t.updateLocation("Destination Point");
            System.out.println("Updated Location: " + t.getCurrentLocation());
            System.out.println("-----------------------------");
        }
    }
}
