
import java.util.Scanner;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Doctor extends Person {
    String specialization;

    Doctor(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }

    void display() {
        System.out.println("Doctor Details:");
        super.display();
        System.out.println("Specialization: " + specialization);
    }
}

class Patient extends Person {
    String disease;

    Patient(String name, int age, String disease) {
        super(name, age);
        this.disease = disease;
    }

    void display() {
        System.out.println("Patient Details:");
        super.display();
        System.out.println("Disease: " + disease);
    }
}

public class Compute21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Doctor");
        System.out.println("2. Patient");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {
            System.out.print("Enter specialization: ");
            String sp = sc.nextLine();

            Person p = new Doctor(name, age, sp);
            p.display();
        } else if (choice == 2) {
            System.out.print("Enter disease: ");
            String disease = sc.nextLine();

            Person p = new Patient(name, age, disease);
            p.display();
        } else {
            System.out.println("Invalid choice");
        }

        sc.close();
    }
}
