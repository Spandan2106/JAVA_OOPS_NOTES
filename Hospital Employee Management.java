
import java.util.Scanner;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {
    int id;
    double salary;

    Employee(String name, int age, int id, double salary) {
        super(name, age);
        this.id = id;
        this.salary = salary;
    }
}

class Doctor extends Employee {
    String specialization;

    Doctor(String name, int age, int id,
           double salary, String specialization) {
        super(name, age, id, salary);
        this.specialization = specialization;
    }

    void display() {
        System.out.println("\n--- Doctor Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("Specialization: " + specialization);
    }
}

public class Compute1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter employee ID: ");
        int id = sc.nextInt();

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter specialization: ");
        String sp = sc.nextLine();

        Doctor d = new Doctor(name, age, id, salary, sp);
        d.display();

        sc.close();
    }
}
