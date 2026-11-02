import java.util.Scanner;

interface Payment {
    void makePayment(double amount);
}

interface Discount {
    double calculateDiscount(double amount);
}

class Customer {
    int customerId;
    String name;

    Customer(int id, String name) {
        customerId = id;
        this.name = name;
    }

    void display() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Customer Name: " + name);
    }
}

class OnlineOrder extends Customer implements Payment, Discount {

    OnlineOrder(int id, String name) {
        super(id, name);
    }

    public double calculateDiscount(double amount) {
        if (amount >= 5000) {
            return amount * 0.20;
        } else if (amount >= 2000) {
            return amount * 0.10;
        } else {
            return 0;
        }
    }

    public void makePayment(double amount) {
        double discount = calculateDiscount(amount);
        double finalAmount = amount - discount;

        System.out.println("Original Amount: " + amount);
        System.out.println("Discount: " + discount);
        System.out.println("Final Amount: " + finalAmount);
        System.out.println("Payment Successful!");
    }
}

public class OnlineShopping {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== ONLINE SHOPPING =====");
            System.out.println("1. Place Order");
            System.out.println("2. Exit");

            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    try {
                        System.out.print("Enter Customer ID: ");
                        int id = sc.nextInt();

                        System.out.print("Enter Customer Name: ");
                        String name = sc.next();

                        System.out.print("Enter Order Amount: ");
                        double amount = sc.nextDouble();

                        if (amount <= 0) {
                            throw new IllegalArgumentException("Invalid Amount!");
                        }

                        OnlineOrder obj = new OnlineOrder(id, name);

                        obj.display();
                        obj.makePayment(amount);

                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    } catch (java.util.InputMismatchException e) {
                        System.out.println("Invalid Input!");
                        sc.nextLine();
                    }
                    break;

                case 2:
                    System.out.println("Thank You!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
