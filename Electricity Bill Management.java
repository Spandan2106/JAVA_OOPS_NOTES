
import java.util.Scanner;

interface ConsumerDetails {
    void displayDetails();
}

interface BillCalculation {
    void calculateBill();
}

class ElectricityBill implements ConsumerDetails, BillCalculation {
    String name;
    int number, units;
    double bill;

    ElectricityBill(String name, int number, int units) {
        this.name = name;
        this.number = number;
        this.units = units;
    }

    public void displayDetails() {
        System.out.println("Consumer Name: " + name);
        System.out.println("Consumer Number: " + number);
        System.out.println("Units: " + units);
    }

    public void calculateBill() {
        if (units <= 100)
            bill = units * 2;
        else if (units <= 200)
            bill = 100 * 2 + (units - 100) * 3;
        else
            bill = 100 * 2 + 100 * 3 + (units - 200) * 5;

        System.out.println("Total Bill: Rs. " + bill);
    }
}

public class Compute1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter consumer name: ");
        String name = sc.nextLine();

        System.out.print("Enter consumer number: ");
        int number = sc.nextInt();

        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();

        if (units < 0) {
            System.out.println("Invalid units");
        } else {
            ElectricityBill e = new ElectricityBill(name, number, units);
            e.displayDetails();
            e.calculateBill();
        }

        sc.close();
    }
}
