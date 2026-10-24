
import java.util.Scanner;

class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    double salary() {
        return 0;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary());
    }
}

class PermanentEmployee extends Employee {
    double basic, bonus;

    PermanentEmployee(int id, String name, double basic, double bonus) {
        super(id, name);
        this.basic = basic;
        this.bonus = bonus;
    }

    double salary() {
        return basic + bonus;
    }
}

class ContractEmployee extends Employee {
    double rate;
    int days;

    ContractEmployee(int id, String name, double rate, int days) {
        super(id, name);
        this.rate = rate;
        this.days = days;
    }

    double salary() {
        return rate * days;
    }
}

public class Compute2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Permanent Employee");
        System.out.println("2. Contract Employee");
        System.out.print("Enter choice: ");
        int ch = sc.nextInt();

        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        if (ch == 1) {
            System.out.print("Enter basic salary: ");
            double basic = sc.nextDouble();

            System.out.print("Enter bonus: ");
            double bonus = sc.nextDouble();

            Employee e = new PermanentEmployee(
                id, name, basic, bonus
            );
            e.display();

        } else if (ch == 2) {
            System.out.print("Enter daily rate: ");
            double rate = sc.nextDouble();

            System.out.print("Enter working days: ");
            int days = sc.nextInt();

            Employee e = new ContractEmployee(
                id, name, rate, days
            );
            e.display();
        } else {
            System.out.println("Invalid choice");
        }

        sc.close();
    }
}
