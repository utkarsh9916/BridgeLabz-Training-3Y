package Assignment.OOPs_01.Level1;

// Program 3: Program to Handle Book Details
// Problem Statement: Write a program to create a Book class with attributes title, author,
// and price. Add a method to display the book details.

public class Book {
    String title;
    String author;
    double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Book b = new Book("Java Programming", "James Gosling", 450.50);
        b.displayDetails();
    }
}
