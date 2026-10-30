
import java.util.Scanner;

abstract class Vehicle {
    String number;
    int days;

    Vehicle(String number, int days) {
        this.number = number;
        this.days = days;
    }

    abstract void calculateRent();
}

class Car extends Vehicle {
    Car(String number, int days) {
        super(number, days);
    }

    void calculateRent() {
        System.out.println("Car Number: " + number);
        System.out.println("Total Rent: Rs. " + (days * 1500));
    }
}

class Bike extends Vehicle {
    Bike(String number, int days) {
        super(number, days);
    }

    void calculateRent() {
        System.out.println("Bike Number: " + number);
        System.out.println("Total Rent: Rs. " + (days * 500));
    }
}

public class Compute2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Car");
        System.out.println("2. Bike");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter vehicle number: ");
        String number = sc.nextLine();

        System.out.print("Enter rental days: ");
        int days = sc.nextInt();

        if (days <= 0) {
            System.out.println("Invalid rental days");
        } else {
            Vehicle v;

            if (choice == 1)
                v = new Car(number, days);
            else if (choice == 2)
                v = new Bike(number, days);
            else {
                System.out.println("Invalid choice");
                sc.close();
                return;
            }

            v.calculateRent();
        }

        sc.close();
    }
}
