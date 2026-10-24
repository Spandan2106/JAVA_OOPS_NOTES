
import java.util.Scanner;

class Vehicle {
    String brand, reg;

    Vehicle(String brand, String reg) {
        this.brand = brand;
        this.reg = reg;
    }
}

class Car extends Vehicle {
    String fuel;
    double mileage;

    Car(String brand, String reg, String fuel, double mileage) {
        super(brand, reg);
        this.fuel = fuel;
        this.mileage = mileage;
    }

    void display(double distance, double price) {
        double cost = (distance / mileage) * price;

        System.out.println("Brand: " + brand);
        System.out.println("Registration: " + reg);
        System.out.println("Fuel: " + fuel);
        System.out.println("Mileage: " + mileage);
        System.out.println("Fuel cost: " + cost);
    }
}

public class Compute4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter brand: ");
        String brand = sc.nextLine();

        System.out.print("Enter registration number: ");
        String reg = sc.nextLine();

        System.out.print("Enter fuel type: ");
        String fuel = sc.nextLine();

        System.out.print("Enter mileage (km/litre): ");
        double mileage = sc.nextDouble();

        System.out.print("Enter distance (km): ");
        double distance = sc.nextDouble();

        System.out.print("Enter fuel price per litre: ");
        double price = sc.nextDouble();

        Car c = new Car(brand, reg, fuel, mileage);
        c.display(distance, price);

        sc.close();
    }
}
