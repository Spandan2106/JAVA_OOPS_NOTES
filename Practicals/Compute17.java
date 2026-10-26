
import java.util.Scanner;

public class Compute17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            String s1 = sc.nextLine();

            System.out.print("Enter second number: ");
            String s2 = sc.nextLine();

            double a = Double.parseDouble(s1);
            double b = Double.parseDouble(s2);

            System.out.println("Addition: " + (a + b));
            System.out.println("Subtraction: " + (a - b));
            System.out.println("Multiplication: " + (a * b));

            if (b != 0)
                System.out.println("Division: " + (a / b));
            else
                System.out.println("Cannot divide by zero");
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid numeric input");
        }
        finally {
            System.out.println("Program completed");
            sc.close();
        }
    }
}
