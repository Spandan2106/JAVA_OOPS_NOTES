// The strategy interface declares operations common to all supported versions of an algorithm.
interface Strategy {
    int execute(int a, int b);
}

// Concrete strategies implement the algorithm using the Strategy interface.
class ConcreteStrategyAdd implements Strategy {
    @Override
    public int execute(int a, int b) {
        return a + b;
    }
}

class ConcreteStrategySubtract implements Strategy {
    @Override
    public int execute(int a, int b) {
        return a - b;
    }
}

class ConcreteStrategyMultiply implements Strategy {
    @Override
    public int execute(int a, int b) {
        return a * b;
    }
}

// The Context maintains a reference to a Strategy object and delegates execution to it.
class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int a, int b) {
        return this.strategy.execute(a, b);
    }
}

// Client application
public class ExampleApplication_Stategy {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        Context context = new Context();

        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();

        System.out.print("Enter action (addition, subtraction, multiplication): ");
        String action = scanner.next();

        if (action.equalsIgnoreCase("addition")) {
            context.setStrategy(new ConcreteStrategyAdd());
        } else if (action.equalsIgnoreCase("subtraction")) {
            context.setStrategy(new ConcreteStrategySubtract());
        } else if (action.equalsIgnoreCase("multiplication")) {
            context.setStrategy(new ConcreteStrategyMultiply());
        }

        int result = context.executeStrategy(firstNumber, secondNumber);
        System.out.println("Result: " + result);

        scanner.close();
    }
}