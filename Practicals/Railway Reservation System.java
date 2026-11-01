import java.util.Scanner;

class Railway {
    int seats = 5;

    synchronized void bookTicket(String name, int n) {
        System.out.println(name + " is trying to book " + n + " seats.");

        if (seats >= n) {
            System.out.println("Booking successful for " + name);
            seats = seats - n;
            System.out.println("Remaining seats: " + seats);
        } else {
            System.out.println("Sorry! Seats not available for " + name);
        }
    }
}

class Passenger extends Thread {
    Railway r;
    String name;
    int seats;

    Passenger(Railway r, String name, int seats) {
        this.r = r;
        this.name = name;
        this.seats = seats;
    }

    public void run() {
        r.bookTicket(name, seats);
    }
}

public class RailwayReservation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Railway r = new Railway();

        System.out.print("Enter passenger 1 name: ");
        String n1 = sc.nextLine();

        System.out.print("Enter seats required: ");
        int s1 = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter passenger 2 name: ");
        String n2 = sc.nextLine();

        System.out.print("Enter seats required: ");
        int s2 = sc.nextInt();

        Passenger p1 = new Passenger(r, n1, s1);
        Passenger p2 = new Passenger(r, n2, s2);

        p1.start();
        p2.start();

        sc.close();
    }
}
