package Assignment.OOPs_01.Level2;

// Program 4: Program to Model a Movie Ticket Booking System
// Problem Statement: Create a MovieTicket class with attributes movieName,
// seatNumber, and price. Add methods to:
// ● Book a ticket (assign seat and update price).
// ● Display ticket details.

class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    MovieTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    void bookTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket Booked Successfully!");
    }

    void displayTicket() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket("", 0, 0);
        ticket.bookTicket("Avengers: Endgame", 12, 250.0);
        ticket.displayTicket();
    }
}

