
/*
Description:
Develop a simplified e-commerce platform:

1. Create an abstract class Product with fields like productId, name, and price, and an abstract method calculateDiscount().
2. Extend it into concrete classes: Electronics, Clothing, and Groceries.
3. Implement an interface Taxable with methods calculateTax() and getTaxDetails() for applicable product categories.
4. Use encapsulation to protect product details, allowing updates only through setter methods.
5. Showcase polymorphism by creating a method that calculates and prints the final price (price + tax - discount) for a list of Product.
*/

import java.util.*;

// Interface
interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

// Abstract class
abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Encapsulation
    public int getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    public void setPrice(double price) {
        if(price > 0) {
            this.price = price;
        }
    }

    // Abstract method
    public abstract double calculateDiscount();

    // Concrete method
    public void displayDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}

// Subclass: Electronics
class Electronics extends Product implements Taxable {
    public Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() {
        // 10% discount on electronics
        return getPrice() * 0.10;
    }

    @Override
    public double calculateTax() {
        // 18% GST
        return getPrice() * 0.18;
    }

    @Override
    public String getTaxDetails() {
        return "Electronics GST: 18%";
    }
}

// Subclass: Clothing
class Clothing extends Product implements Taxable {
    public Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() {
        // 20% discount on clothing
        return getPrice() * 0.20;
    }

    @Override
    public double calculateTax() {
        // 5% GST
        return getPrice() * 0.05;
    }

    @Override
    public String getTaxDetails() {
        return "Clothing GST: 5%";
    }
}

// Subclass: Groceries
class Groceries extends Product {
    public Groceries(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() {
        // No discount on groceries
        return 0;
    }
}

// Main Class
public class ECommercePlatform {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Electronics(201, "Laptop", 60000));
        products.add(new Clothing(202, "Shirt", 2000));
        products.add(new Groceries(203, "Rice Bag", 1500));

        // Polymorphism
        for(Product p : products) {
            p.displayDetails();
            double discount = p.calculateDiscount();
            double tax = (p instanceof Taxable) ? ((Taxable)p).calculateTax() : 0;
            double finalPrice = p.getPrice() + tax - discount;

            System.out.println("Discount: " + discount);
            System.out.println("Tax: " + tax);
            if(p instanceof Taxable) {
                System.out.println(((Taxable)p).getTaxDetails());
            }
            System.out.println("Final Price: " + finalPrice);
            System.out.println("-----------------------------");
        }
    }
}

