
import java.util.Scanner;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class ElectronicProduct extends Product {
    int warranty;

    ElectronicProduct(String name, double price, int warranty) {
        super(name, price);
        this.warranty = warranty;
    }
}

class Mobile extends ElectronicProduct {
    String brand;

    Mobile(String name, double price, int warranty, String brand) {
        super(name, price, warranty);
        this.brand = brand;
    }

    void display() {
        double gst = price * 18 / 100;
        double total = price + gst;

        System.out.println("\nProduct: " + name);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Warranty: " + warranty + " years");
        System.out.println("GST: " + gst);
        System.out.println("Final Price: " + total);
    }
}

public class Compute2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product name: ");
        String name = sc.nextLine();

        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        System.out.print("Enter warranty: ");
        int warranty = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter brand: ");
        String brand = sc.nextLine();

        Mobile m = new Mobile(name, price, warranty, brand);
        m.display();

        sc.close();
    }
}
