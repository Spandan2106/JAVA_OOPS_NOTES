// 1. Base Component Interface
interface Beverage {
    String getDescription();
    double getCost();
}

// 2. Concrete Component
class Espresso implements Beverage {
    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public double getCost() {
        return 50.0;
    }
}

// 3. Abstract Decorator (Implements Beverage AND Has-a Beverage)
abstract class BeverageDecorator implements Beverage {
    protected Beverage decoratedBeverage; // Reference to wrapped object

    public BeverageDecorator(Beverage beverage) {
        this.decoratedBeverage = beverage;
    }

    @Override
    public String getDescription() {
        return decoratedBeverage.getDescription();
    }

    @Override
    public double getCost() {
        return decoratedBeverage.getCost();
    }
}

// 4. Concrete Decorator 1: Milk Add-on
class MilkDecorator extends BeverageDecorator {
    public MilkDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return decoratedBeverage.getDescription() + " + Steamed Milk";
    }

    @Override
    public double getCost() {
        return decoratedBeverage.getCost() + 15.0; // Adds own cost
    }
}

// 5. Concrete Decorator 2: Mocha (Chocolate) Add-on
class MochaDecorator extends BeverageDecorator {
    public MochaDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return decoratedBeverage.getDescription() + " + Dark Mocha";
    }

    @Override
    public double getCost() {
        return decoratedBeverage.getCost() + 20.0; // Adds own cost
    }
}

// 6. Execution Driver
public class DecoratorDemo {
    public static void main(String[] args) {
        // Step 1: Order a plain Espresso
        Beverage order = new Espresso();
        System.out.println(order.getDescription() + " -> Rs. " + order.getCost());

        // Step 2: Dynamically decorate with Milk at runtime
        order = new MilkDecorator(order);
        System.out.println(order.getDescription() + " -> Rs. " + order.getCost());

        // Step 3: Dynamically decorate again with Mocha
        order = new MochaDecorator(order);
        System.out.println(order.getDescription() + " -> Rs. " + order.getCost());

        // Output:
        // Espresso -> Rs. 50.0
        // Espresso + Steamed Milk -> Rs. 65.0
        // Espresso + Steamed Milk + Dark Mocha -> Rs. 85.0
    }
}