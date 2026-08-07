import java.util.Scanner;

// 1. Product Class
class Car {
    private String brand;
    private int seats;
    private String engine;
    private boolean hasGPS;

    public void setBrand(String brand) { this.brand = brand; }
    public void setSeats(int seats) { this.seats = seats; }
    public void setEngine(String engine) { this.engine = engine; }
    public void setGPS(boolean hasGPS) { this.hasGPS = hasGPS; }

    public void showDetails() {
        System.out.println("\n--- Custom Car Details ---");
        System.out.println("Brand: " + brand);
        System.out.println("Seats: " + seats);
        System.out.println("Engine: " + engine);
        System.out.println("GPS: " + (hasGPS ? "Installed" : "None"));
        System.out.println("Purchase successful!");
    }
}

// 2. Builder Interface
interface Builder {
    void reset();
    void setSeats(int seats);
    void setEngine(String engine);
    void setGPS(boolean hasGPS);
    Car getProduct();
}

// 3. Concrete Builders for Brands
class ToyotaBuilder implements Builder {
    private Car car;
    public ToyotaBuilder() { this.reset(); }
    public void reset() { this.car = new Car(); this.car.setBrand("Toyota"); }
    public void setSeats(int seats) { this.car.setSeats(seats); }
    public void setEngine(String engine) { this.car.setEngine(engine); }
    public void setGPS(boolean hasGPS) { this.car.setGPS(hasGPS); }
    public Car getProduct() { Car product = this.car; this.reset(); return product; }
}

class HondaBuilder implements Builder {
    private Car car;
    public HondaBuilder() { this.reset(); }
    public void reset() { this.car = new Car(); this.car.setBrand("Honda"); }
    public void setSeats(int seats) { this.car.setSeats(seats); }
    public void setEngine(String engine) { this.car.setEngine(engine); }
    public void setGPS(boolean hasGPS) { this.car.setGPS(hasGPS); }
    public Car getProduct() { Car product = this.car; this.reset(); return product; }
}

class FordBuilder implements Builder {
    private Car car;
    public FordBuilder() { this.reset(); }
    public void reset() { this.car = new Car(); this.car.setBrand("Ford"); }
    public void setSeats(int seats) { this.car.setSeats(seats); }
    public void setEngine(String engine) { this.car.setEngine(engine); }
    public void setGPS(boolean hasGPS) { this.car.setGPS(hasGPS); }
    public Car getProduct() { Car product = this.car; this.reset(); return product; }
}

// 4. Director with Multiple Preset Models
class Director {
    public void buildSportsCar(Builder builder) {
        builder.reset();
        builder.setSeats(2);
        builder.setEngine("V8 Turbo Engine");
        builder.setGPS(true);
    }

    public void buildFamilySUV(Builder builder) {
        builder.reset();
        builder.setSeats(7);
        builder.setEngine("V6 Engine");
        builder.setGPS(true);
    }

    public void buildEconomyCar(Builder builder) {
        builder.reset();
        builder.setSeats(4);
        builder.setEngine("1.4L 4-Cylinder Engine");
        builder.setGPS(false);
    }
}

// 5. Main Application
public class Builder_Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Director director = new Director();

        // Step 1: Select Brand (Builder)
        System.out.print("Select Brand (Toyota / Honda / Ford): ");
        String brandChoice = scanner.nextLine().trim();

        Builder builder;
        if (brandChoice.equalsIgnoreCase("Toyota")) {
            builder = new ToyotaBuilder();
        } else if (brandChoice.equalsIgnoreCase("Honda")) {
            builder = new HondaBuilder();
        } else if (brandChoice.equalsIgnoreCase("Ford")) {
            builder = new FordBuilder();
        } else {
            System.out.println("Invalid brand choice!");
            scanner.close();
            return;
        }

        // Step 2: Select Preset Type or Fully Custom
        System.out.print("Select Type (Sports / SUV / Economy / Custom): ");
        String typeChoice = scanner.nextLine().trim();

        if (typeChoice.equalsIgnoreCase("Sports")) {
            director.buildSportsCar(builder);
        } else if (typeChoice.equalsIgnoreCase("SUV")) {
            director.buildFamilySUV(builder);
        } else if (typeChoice.equalsIgnoreCase("Economy")) {
            director.buildEconomyCar(builder);
        } else if (typeChoice.equalsIgnoreCase("Custom")) {
            // Client customizes directly without Director
            builder.reset();
            System.out.print("Enter number of seats: ");
            builder.setSeats(scanner.nextInt());
            scanner.nextLine(); // clear newline
            System.out.print("Enter engine type: ");
            builder.setEngine(scanner.nextLine());
            System.out.print("Include GPS? (true/false): ");
            builder.setGPS(scanner.nextBoolean());
        } else {
            System.out.println("Invalid type choice!");
            scanner.close();
            return;
        }

        // Step 3: Produce and show Car
        Car car = builder.getProduct();
        car.showDetails();

        scanner.close();
    }
}