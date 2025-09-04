package Assignment.OOPs_01.Level2;

// Program 5: Program to Simulate a Shopping Cart
// Problem Statement: Create a CartItem class with attributes itemName, price, and
// quantity. Add methods to:
// ● Add an item to the cart.
// ● Remove an item from the cart.
// ● Display the total cost.

class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    void addItem(int qty) {
        this.quantity += qty;
        System.out.println(qty + " more " + itemName + "(s) added to cart.");
    }

    void removeItem(int qty) {
        if (qty <= quantity) {
            this.quantity -= qty;
            System.out.println(qty + " " + itemName + "(s) removed from cart.");
        } else {
            System.out.println("Not enough items in the cart to remove!");
        }
    }

    double getTotalCost() {
        return price * quantity;
    }

    void displayCart() {
        System.out.println("Item: " + itemName);
        System.out.println("Price per unit: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + getTotalCost());
    }

    public static void main(String[] args) {
        CartItem item = new CartItem("Laptop", 60000, 1);
        item.displayCart();
        item.addItem(2);
        item.displayCart();
        item.removeItem(1);
        item.displayCart();
    }
}
