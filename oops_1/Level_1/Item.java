package Assignment.OOPs_01.Level1;

// Program 4: Program to Track Inventory of Items
// Problem Statement: Create an Item class with attributes itemCode, itemName, and
// price. Add a method to display item details and calculate the total cost for a given
// quantity.

public class Item {
    int itemCode;
    String itemName;
    double price;

    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per unit: " + price);
    }

    double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        Item item = new Item(201, "Laptop", 55000);
        item.displayDetails();
        int quantity = 2;
        System.out.println("Total cost for " + quantity + " units: " + item.calculateTotalCost(quantity));
    }
}

