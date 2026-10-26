
import java.util.Scanner;

class Product {
    final int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    Product(int id, String name) {
        this.id = id;
        this.name = name;
        this.price = 0;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}

public class Compute20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter product name: ");
        String name = sc.nextLine();

        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        Product p1 = new Product(id, name, price);
        p1.display();

        Product p2 = new Product(102, "Pen");
        System.out.println("Second product:");
        p2.display();

        // p1.id = 200; // Error: final variable

        sc.close();
    }
}
