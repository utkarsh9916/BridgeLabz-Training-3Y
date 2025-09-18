
/*
Description:
Develop a library management system:

1. Use an abstract class LibraryItem with fields like itemId, title, and author.
2. Add an abstract method getLoanDuration() and a concrete method getItemDetails().
3. Create subclasses Book, Magazine, and DVD, overriding getLoanDuration() with specific logic.
4. Implement an interface Reservable with methods reserveItem() and checkAvailability().
5. Apply encapsulation to secure details like the borrower’s personal data.
6. Use polymorphism to allow a general LibraryItem reference to manage all items, regardless of type.
*/

import java.util.*;

// Interface
interface Reservable {
    void reserveItem(String borrower);
    boolean checkAvailability();
}

// Abstract class
abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;
    private String borrower; // sensitive data

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.borrower = null;
    }

    // Encapsulation
    public String getItemId() { return itemId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }

    protected String getBorrower() { return borrower; }
    protected void setBorrower(String borrower) { this.borrower = borrower; }

    // Abstract method
    public abstract int getLoanDuration();

    // Concrete method
    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Subclass: Book
class Book extends LibraryItem implements Reservable {
    private boolean available = true;

    public Book(String id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14; // 14 days
    }

    @Override
    public void reserveItem(String borrower) {
        if(available) {
            setBorrower(borrower);
            available = false;
            System.out.println("Book reserved for: " + borrower);
        } else {
            System.out.println("Book is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return available;
    }
}

// Subclass: Magazine
class Magazine extends LibraryItem implements Reservable {
    private boolean available = true;

    public Magazine(String id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // 7 days
    }

    @Override
    public void reserveItem(String borrower) {
        if(available) {
            setBorrower(borrower);
            available = false;
            System.out.println("Magazine reserved for: " + borrower);
        } else {
            System.out.println("Magazine is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return available;
    }
}

// Subclass: DVD
class DVD extends LibraryItem implements Reservable {
    private boolean available = true;

    public DVD(String id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3; // 3 days
    }

    @Override
    public void reserveItem(String borrower) {
        if(available) {
            setBorrower(borrower);
            available = false;
            System.out.println("DVD reserved for: " + borrower);
        } else {
            System.out.println("DVD is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return available;
    }
}

// Main class
public class LibraryManagementSystem {
    public static void main(String[] args) {
        List<LibraryItem> items = new ArrayList<>();

        Book b1 = new Book("B101", "The Java Handbook", "James Gosling");
        Magazine m1 = new Magazine("M202", "Tech Monthly", "Editorial Team");
        DVD d1 = new DVD("D303", "Inception", "Christopher Nolan");

        items.add(b1);
        items.add(m1);
        items.add(d1);

        // Polymorphism
        for(LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if(item instanceof Reservable) {
                Reservable res = (Reservable) item;
                System.out.println("Available: " + res.checkAvailability());
                res.reserveItem("John Doe");
                System.out.println("Available after reservation: " + res.checkAvailability());
            }

            System.out.println("-----------------------------");
        }
    }
}

