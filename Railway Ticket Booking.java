
import java.util.Scanner;

class TicketBooking {
    int seats;

    TicketBooking(int seats) {
        this.seats = seats;
    }

    void bookTicket(int n) {
        if (n <= 0)
            throw new IllegalArgumentException("Invalid ticket count");

        if (n > seats)
            throw new ArithmeticException("Not enough seats available");

        seats = seats - n;

        System.out.println("Booking successful!");
        System.out.println("Tickets booked: " + n);
        System.out.println("Remaining seats: " + seats);
    }
}

public class Compute2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TicketBooking t = new TicketBooking(50);

        int choice;

        do {
            System.out.println("\n1. Book Ticket");
            System.out.println("2. Check Available Seats");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            try {
                if (choice == 1) {
                    System.out.print("Enter number of tickets: ");
                    int n = sc.nextInt();
                    t.bookTicket(n);
                } else if (choice == 2) {
                    System.out.println("Available seats: " + t.seats);
                } else if (choice == 3) {
                    System.out.println("Thank you!");
                } else {
                    System.out.println("Invalid choice");
                }
            }
            catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }

        } while (choice != 3);

        sc.close();
    }
}
