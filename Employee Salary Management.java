
import java.util.Scanner;

abstract class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract void calculateSalary();
}

class FullTimeEmployee extends Employee {
    double salary;

    FullTimeEmployee(String name, int id, double salary) {
        super(name, id);
        this.salary = salary;
    }

    void calculateSalary() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Monthly Salary: " + salary);
    }
}

class PartTimeEmployee extends Employee {
    int hours;
    double rate;

    PartTimeEmployee(String name, int id, int hours, double rate) {
        super(name, id);
        this.hours = hours;
        this.rate = rate;
    }

    void calculateSalary() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Part-Time Salary: " + (hours * rate));
    }
}

public class Compute1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Full-Time Employee");
        System.out.println("2. Part-Time Employee");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        Employee e;

        if (choice == 1) {
            System.out.print("Enter monthly salary: ");
            double salary = sc.nextDouble();

            e = new FullTimeEmployee(name, id, salary);
        } else if (choice == 2) {
            System.out.print("Enter working hours: ");
            int hours = sc.nextInt();

            System.out.print("Enter hourly rate: ");
            double rate = sc.nextDouble();

            e = new PartTimeEmployee(name, id, hours, rate);
        } else {
            System.out.println("Invalid choice");
            sc.close();
            return;
        }

        e.calculateSalary();
        sc.close();
    }
}
