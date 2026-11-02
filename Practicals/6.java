import java.util.Scanner;

abstract class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void displayDetails();
}

class Doctor extends Person {
    String specialization;

    Doctor(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }

    void displayDetails() {
        System.out.println("Doctor Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Specialization: " + specialization);
    }
}

class Nurse extends Person {
    String department;

    Nurse(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    void displayDetails() {
        System.out.println("Nurse Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
    }
}

class Patient extends Person {
    String disease;

    Patient(String name, int age, String disease) {
        super(name, age);
        this.disease = disease;
    }

    void displayDetails() {
        System.out.println("Patient Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Disease: " + disease);
    }
}

public class HospitalManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== HOSPITAL MANAGEMENT =====");
            System.out.println("1. Doctor Details");
            System.out.println("2. Nurse Details");
            System.out.println("3. Patient Details");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                case 2:
                case 3:
                    try {
                        System.out.print("Enter Name: ");
                        String name = sc.next();

                        System.out.print("Enter Age: ");
                        int age = sc.nextInt();

                        if (age <= 0 || age > 120) {
                            throw new IllegalArgumentException("Invalid Age!");
                        }

                        Person p;

                        if (ch == 1) {
                            System.out.print("Enter Specialization: ");
                            String sp = sc.next();
                            p = new Doctor(name, age, sp);
                        } else if (ch == 2) {
                            System.out.print("Enter Department: ");
                            String dept = sc.next();
                            p = new Nurse(name, age, dept);
                        } else {
                            System.out.print("Enter Disease: ");
                            String disease = sc.next();
                            p = new Patient(name, age, disease);
                        }

                        System.out.println("\n--- Details ---");
                        p.displayDetails();

                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    } catch (java.util.InputMismatchException e) {
                        System.out.println("Enter a valid age!");
                        sc.nextLine();
                    }
                    break;

                case 4:
                    System.out.println("Program Terminated.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
