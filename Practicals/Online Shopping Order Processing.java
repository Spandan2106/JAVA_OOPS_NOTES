import java.util.Scanner;

class Order implements Runnable {
    String task;

    Order(String task) {
        this.task = task;
    }

    public void run() {
        System.out.println(task + " started.");

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println(task + " completed.");
    }
}

public class ShoppingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String name = sc.nextLine();

        System.out.println("Processing order for " + name);

        Thread t1 = new Thread(new Order("Order Confirmation"));
        Thread t2 = new Thread(new Order("Payment Processing"));
        Thread t3 = new Thread(new Order("Delivery Processing"));

        t1.start();
        t2.start();
        t3.start();

        sc.close();
    }
}
