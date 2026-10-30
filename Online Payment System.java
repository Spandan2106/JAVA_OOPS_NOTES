
import java.util.Scanner;

interface Payment {
    void pay(double amount);
}

class UPI implements Payment {
    public void pay(double amount) {
        System.out.println("Payment through UPI");
        System.out.println("Amount: Rs. " + amount);
    }
}

class CreditCard implements Payment {
    public void pay(double amount) {
        System.out.println("Payment through Credit Card");
        System.out.println("Amount: Rs. " + amount);
    }
}

public class Compute2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter payment amount: ");
        double amount = sc.nextDouble();

        if (amount <= 0) {
            System.out.println("Invalid amount");
        } else {
            System.out.println("1. UPI");
            System.out.println("2. Credit Card");
            System.out.print("Select payment method: ");
            int choice = sc.nextInt();

            Payment p;

            if (choice == 1)
                p = new UPI();
            else if (choice == 2)
                p = new CreditCard();
            else {
                System.out.println("Invalid choice");
                sc.close();
                return;
            }

            p.pay(amount);
        }

        sc.close();
    }
}
