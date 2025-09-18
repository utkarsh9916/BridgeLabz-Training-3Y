

/*

Description:
Create an online food delivery system:

1. Define an abstract class FoodItem with fields like itemName, price, and quantity.
2. Add abstract methods calculateTotalPrice() and concrete methods like getItemDetails().
3. Extend it into classes VegItem and NonVegItem, overriding calculateTotalPrice()
   to include additional charges (e.g., for non-veg items).
4. Use an interface Discountable with methods applyDiscount() and getDiscountDetails().
5. Demonstrate encapsulation to restrict modifications to order details.
6. Use polymorphism to handle different types of food items in a single order-processing method.
*/

import java.util.*;

// Interface
interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

// Abstract class
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Encapsulation
    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    public void setPrice(double price) {
        if(price > 0) this.price = price;
    }

    public void setQuantity(int quantity) {
        if(quantity > 0) this.quantity = quantity;
    }

    // Abstract method
    public abstract double calculateTotalPrice();

    // Concrete method
    public void getItemDetails() {
        System.out.println("Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity);
    }
}

// Subclass: VegItem
class VegItem extends FoodItem implements Discountable {
    public VegItem(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity(); // no extra charges
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.10; // 10% discount
    }

    @Override
    public String getDiscountDetails() {
        return "Veg Item Discount: 10%";
    }
}

// Subclass: NonVegItem
class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        double base = getPrice() * getQuantity();
        return base + (base * 0.05); // 5% extra charge for non-veg
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.05; // 5% discount
    }

    @Override
    public String getDiscountDetails() {
        return "Non-Veg Item Discount: 5%";
    }
}

// Main class
public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        List<FoodItem> order = new ArrayList<>();

        order.add(new VegItem("Paneer Butter Masala", 250, 2));
        order.add(new NonVegItem("Chicken Biryani", 300, 3));

        double totalBill = 0;

        // Polymorphism
        for(FoodItem item : order) {
            item.getItemDetails();
            double price = item.calculateTotalPrice();
            double discount = 0;

            if(item instanceof Discountable) {
                Discountable d = (Discountable) item;
                discount = d.applyDiscount();
                System.out.println(d.getDiscountDetails());
            }

            double finalPrice = price - discount;
            System.out.println("Total Price (before discount): " + price);
            System.out.println("Discount: " + discount);
            System.out.println("Final Price: " + finalPrice);
            totalBill += finalPrice;
            System.out.println("-----------------------------");
        }

        System.out.println("Grand Total Bill: " + totalBill);
    }
}

