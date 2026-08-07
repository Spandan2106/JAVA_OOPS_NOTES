import java.util.Scanner;

// 1. Product Interfaces
interface Monitor {
    void buy();
}

interface GPU {
    void buy();
}

// 2. MSI Products
class MsiMonitor implements Monitor {
    public void buy() {
        System.out.println("You chose MSI Monitor.");
        System.out.println("Thanks for purchasing! Purchase successful.");
    }
}

class MsiGpu implements GPU {
    public void buy() {
        System.out.println("You chose MSI GPU.");
        System.out.println("Thanks for purchasing! Purchase successful.");
    }
}

// 3. Nvidia Products
class NvidiaMonitor implements Monitor {
    public void buy() {
        System.out.println("You chose Nvidia Monitor.");
        System.out.println("Thanks for purchasing! Purchase successful.");
    }
}

class NvidiaGpu implements GPU {
    public void buy() {
        System.out.println("You chose Nvidia GPU.");
        System.out.println("Thanks for purchasing! Purchase successful.");
    }
}

// 4. Abstract Factory Interface
interface TechFactory {
    Monitor createMonitor();
    GPU createGPU();
}

// 5. Concrete Brand Factories
class MsiFactory implements TechFactory {
    public Monitor createMonitor() { return new MsiMonitor(); }
    public GPU createGPU() { return new MsiGpu(); }
}

class NvidiaFactory implements TechFactory {
    public Monitor createMonitor() { return new NvidiaMonitor(); }
    public GPU createGPU() { return new NvidiaGpu(); }
}

// 6. Application (Client Code)
class Application {
    private TechFactory factory;

    public Application(TechFactory factory) {
        this.factory = factory;
    }

    public void processPurchase(String productType) {
        if (productType.equalsIgnoreCase("Monitor")) {
            Monitor monitor = factory.createMonitor();
            monitor.buy();
        } else if (productType.equalsIgnoreCase("GPU")) {
            GPU gpu = factory.createGPU();
            gpu.buy();
        } else {
            System.out.println("Invalid product!");
        }
    }
}

// 7. Main Program
public class Abstract_Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User chooses Brand
        System.out.print("Enter Brand (MSI / Nvidia): ");
        String brandChoice = scanner.nextLine().trim();

        TechFactory factory;
        if (brandChoice.equalsIgnoreCase("MSI")) {
            factory = new MsiFactory();
        } else if (brandChoice.equalsIgnoreCase("Nvidia")) {
            factory = new NvidiaFactory();
        } else {
            System.out.println("Invalid brand!");
            scanner.close();
            return;
        }

        // Initialize Application with selected brand factory
        Application app = new Application(factory);

        // User chooses Product
        System.out.print("Enter Product to buy (Monitor / GPU): ");
        String productChoice = scanner.nextLine().trim();

        // Process purchase command
        app.processPurchase(productChoice);

        scanner.close();
    }
}