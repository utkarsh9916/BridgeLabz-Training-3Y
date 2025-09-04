package Assignment.OOPs_01.Level1;

// Program 5: Program to Handle Mobile Phone Details
// Problem Statement: Create a MobilePhone class with attributes brand, model, and
// price. Add a method to display all the details of the phone. The MobilePhone class uses
// attributes to store the phone's characteristics. The method is used to retrieve and
// display this information for each object.

public class MobilePhone {
    String brand;
    String model;
    double price;

    MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone("Samsung", "Galaxy S23", 75000);
        phone.displayDetails();
    }
}

