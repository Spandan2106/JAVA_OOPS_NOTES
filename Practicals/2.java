import java.util.Scanner;

interface Payment {
    void makePayment(double amount);
}

abstract class User {
    int userId;
    String name;

    User(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    void display() {
        System.out.println("User ID: " + userId);
        System.out.println("Name: " + name);
    }
}

class CreditCardPayment extends User implements Payment {

    CreditCardPayment(int id, String name) {
        super(id, name);
    }

    public void makePayment(double amount) {
        System.out.println("Payment through Credit Card");
        System.out.println("Amount: " + amount);
    }
}

class UPIPayment extends User implements Payment {

    UPIPayment(int id, String name) {
        super(id, name);
    }

    public void makePayment(double amount) {
        System.out.println("Payment through UPI");
        System.out.println("Amount: " + amount);
    }
}

class NetBankingPayment extends User implements Payment {

    NetBankingPayment(int id, String name) {
        super(id, name);
    }

    public void makePayment(double amount) {
        System.out.println("Payment through Net Banking");
        System.out.println("Amount: " + amount);
    }
}

public class OnlinePayment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== ONLINE PAYMENT SYSTEM =====");
            System.out.println("1. Credit Card Payment");
            System.out.println("2. UPI Payment");
            System.out.println("3. Net Banking Payment");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                case 2:
                case 3:
                    System.out.print("Enter User ID: ");
                    int id = sc.nextInt();

                    System.out.print("Enter Name: ");
                    String name = sc.next();

                    System.out.print("Enter Amount: ");
                    double amount = sc.nextDouble();

                    if (amount <= 0) {
                        System.out.println("Invalid Amount!");
                        break;
                    }

                    User u;

                    if (ch == 1) {
                        u = new CreditCardPayment(id, name);
                    } else if (ch == 2) {
                        u = new UPIPayment(id, name);
                    } else {
                        u = new NetBankingPayment(id, name);
                    }

                    u.display();

                    Payment p = (Payment) u;
                    p.makePayment(amount);

                    System.out.println("Payment Successful!");
                    break;

                case 4:
                    System.out.println("Thank You!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
