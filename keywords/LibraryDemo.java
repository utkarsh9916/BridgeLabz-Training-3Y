class Book {
    private static String libraryName = "City Library";
    private String title, author;
    private final String isbn; // Final variable

    // Constructor with 'this'
    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Static method
    public static void displayLibraryName() {
        System.out.println("Library: " + libraryName);
    }

    public void displayDetails() {
        if (this instanceof Book) {
            System.out.println("Book Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
        }
    }
}

public class LibraryDemo {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "James Gosling", "ISBN101");
        Book b2 = new Book("Python Crash", "Guido van Rossum", "ISBN102");

        b1.displayDetails();
        b2.displayDetails();
        Book.displayLibraryName();
    }
}
