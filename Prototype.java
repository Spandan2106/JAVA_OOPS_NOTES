import java.util.ArrayList;
import java.util.List;

// Base Prototype
abstract class Vehicle {
    private String brand;
    private String color;

    public Vehicle() {}

    // Prototype constructor
    public Vehicle(Vehicle target) {
        if (target != null) {
            this.brand = target.brand;
            this.color = target.color;
        }
    }

    public abstract Vehicle clone();

    // Getters and Setters
    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
}

// Concrete Prototype 1: Car
class Car extends Vehicle {
    private int topSpeed;

    public Car() {}

    public Car(Car target) {
        super(target);
        if (target != null) {
            this.topSpeed = target.topSpeed;
        }
    }

    @Override
    public Vehicle clone() {
        return new Car(this);
    }

    public int getTopSpeed() { return topSpeed; }
    public void setTopSpeed(int topSpeed) { this.topSpeed = topSpeed; }
}

// Concrete Prototype 2: Bus
class Bus extends Vehicle {
    private int seatingCapacity;

    public Bus() {}

    public Bus(Bus target) {
        super(target);
        if (target != null) {
            this.seatingCapacity = target.seatingCapacity;
        }
    }

    @Override
    public Vehicle clone() {
        return new Bus(this);
    }

    public int getSeatingCapacity() { return seatingCapacity; }
    public void setSeatingCapacity(int seatingCapacity) { this.seatingCapacity = seatingCapacity; }
}

// Main Class
public class Prototype {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();

        Car car = new Car();
        car.setBrand("Toyota");
        car.setColor("Red");
        car.setTopSpeed(200);
        vehicles.add(car);

        Bus bus = new Bus();
        bus.setBrand("Volvo");
        bus.setColor("Yellow");
        bus.setSeatingCapacity(50);
        vehicles.add(bus);

        List<Vehicle> clonedVehicles = new ArrayList<>();
        for (Vehicle v : vehicles) {
            clonedVehicles.add(v.clone());
        }

        Car clonedCar = (Car) clonedVehicles.get(0);
        System.out.println("Cloned Car: " + clonedCar.getBrand() + ", " + clonedCar.getColor() + ", Top Speed: " + clonedCar.getTopSpeed() + " km/h");

        Bus clonedBus = (Bus) clonedVehicles.get(1);
        System.out.println("Cloned Bus: " + clonedBus.getBrand() + ", " + clonedBus.getColor() + ", Capacity: " + clonedBus.getSeatingCapacity() + " seats");
    }
}