
import java.util.Scanner;

interface Payment {
    void pay(double amount);
}

class UPIPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Payment through UPI: " + amount);
    }
}

class CardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Payment through Card: " + amount);
    }
}

public class Compute6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. UPI Payment");
        System.out.println("2. Card Payment");
        System.out.print("Enter choice: ");
        int ch = sc.nextInt();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        Payment p;

        if (ch == 1) {
            p = new UPIPayment();
            p.pay(amount);
        } else if (ch == 2) {
            p = new CardPayment();
            p.pay(amount);
        } else {
            System.out.println("Invalid choice");
        }

        sc.close();
    }
}
