class Book {
    private String title;
    private String author;
    private double price;

    // Default Constructor
    public Book() {
        this("Unknown", "Unknown", 0.0);
    }

    // Parameterized Constructor
    public Book(String title, String author, double price) {
        this.title = title;   // 'this' to resolve ambiguity
        this.author = author;
        this.price = price;
    }

    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }
}

public class Book {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java Basics", "James Gosling", 399.99);

        b1.display();
        b2.display();
    }
}
