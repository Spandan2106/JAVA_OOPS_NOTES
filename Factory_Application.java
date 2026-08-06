import java.util.Scanner;

// 1. Product Interface
interface Coffee {
    void prepare();
}

// 2. Concrete Products
class Espresso implements Coffee {
    public void prepare() {
        System.out.println("Preparing a strong Espresso!");
    }
}

class Latte implements Coffee {
    public void prepare() {
        System.out.println("Preparing a creamy Latte!");
    }
}

// 3. Creator Class
abstract class Cafe {
    public abstract Coffee createCoffee();

    public void orderCoffee() {
        Coffee coffee = createCoffee();
        coffee.prepare();
    }
}

// 4. Concrete Creators
class EspressoCafe extends Cafe {
    public Coffee createCoffee() {
        return new Espresso();
    }
}

class LatteCafe extends Cafe {
    public Coffee createCoffee() {
        return new Latte();
    }
}

// 5. Main Class with User Input
public class Factory_Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter coffee type (espresso / latte): ");
        String input = scanner.nextLine().trim();

        Cafe cafe;

        // Pick creator based on user input
        if (input.equalsIgnoreCase("espresso")) {
            cafe = new EspressoCafe();
        } else if (input.equalsIgnoreCase("latte")) {
            cafe = new LatteCafe();
        } else {
            System.out.println("Unknown coffee type!");
            scanner.close();
            return;
        }

        // Run the factory logic
        cafe.orderCoffee();

        scanner.close();
    }
}