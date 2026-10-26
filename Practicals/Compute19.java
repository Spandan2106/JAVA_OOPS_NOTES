
import java.util.Scanner;

class Bank {
    static final String bankName = "State Bank";
    static double rate = 5.0;

    double simpleInterest(double p, double t) {
        return (p * rate * t) / 100;
    }
}

public class Compute19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter interest rate: ");
        Bank.rate = sc.nextDouble();

        Bank b1 = new Bank();
        Bank b2 = new Bank();

        System.out.println("Bank: " + Bank.bankName);

        System.out.print("Enter first customer's principal: ");
        double p1 = sc.nextDouble();

        System.out.print("Enter first customer's time: ");
        double t1 = sc.nextDouble();

        System.out.print("Enter second customer's principal: ");
        double p2 = sc.nextDouble();

        System.out.print("Enter second customer's time: ");
        double t2 = sc.nextDouble();

        System.out.println("Interest for customer 1: "
                + b1.simpleInterest(p1, t1));

        System.out.println("Interest for customer 2: "
                + b2.simpleInterest(p2, t2));

        // Bank.bankName = "Other Bank"; // Error: final variable

        sc.close();
    }
}
