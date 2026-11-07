
import java.util.Scanner;

abstract class Person {
    private int id;
    private String name;
    private int age;

    Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    abstract void displayDetails();
    abstract double calculateBill();
}

abstract class Doctor extends Person {
    protected String specialization;
    protected double consultationFee;

    Doctor(int id, String name, int age,
           String specialization, double consultationFee) {
        super(id, name, age);
        this.specialization = specialization;
        this.consultationFee = consultationFee;
    }
}

abstract class Patient extends Person {
    protected String disease;
    protected double roomCharges;
    protected double treatmentCharges;

    Patient(int id, String name, int age, String disease,
            double roomCharges, double treatmentCharges) {
        super(id, name, age);
        this.disease = disease;
        this.roomCharges = roomCharges;
        this.treatmentCharges = treatmentCharges;
    }
}

class PermanentDoctor extends Doctor {

    PermanentDoctor(int id, String name, int age,
                    String specialization, double fee) {
        super(id, name, age, specialization, fee);
    }

    void displayDetails() {
        System.out.println("\nDoctor ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Specialization: " + specialization);
        System.out.println("Consultation Fee: " + consultationFee);
    }

    double calculateBill() {
        return consultationFee;
    }
}

class AdmittedPatient extends Patient {

    AdmittedPatient(int id, String name, int age, String disease,
                    double roomCharges, double treatmentCharges) {
        super(id, name, age, disease, roomCharges, treatmentCharges);
    }

    void displayDetails() {
        System.out.println("\nPatient ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Disease: " + disease);
        System.out.println("Room Charges: " + roomCharges);
        System.out.println("Treatment Charges: " + treatmentCharges);
        System.out.println("Total Bill: " + calculateBill());
    }

    double calculateBill() {
        double total = roomCharges + treatmentCharges;

        if (getAge() >= 60) {
            total = total - (total * 0.20);
        }

        return total;
    }
}

public class HospitalManagement {

    static Scanner sc = new Scanner(System.in);

    static PermanentDoctor doctors[] = new PermanentDoctor[100];
    static AdmittedPatient patients[] = new AdmittedPatient[100];

    static int doctorCount = 0;
    static int patientCount = 0;

    static boolean doctorExists(int id) {
        for (int i = 0; i < doctorCount; i++) {
            if (doctors[i].getId() == id)
                return true;
        }
        return false;
    }

    static boolean patientExists(int id) {
        for (int i = 0; i < patientCount; i++) {
            if (patients[i].getId() == id)
                return true;
        }
        return false;
    }

    static void addDoctor() {
        if (doctorCount == 100) {
            System.out.println("Doctor storage is full!");
            return;
        }

        System.out.print("Enter Doctor ID: ");
        int id = sc.nextInt();

        if (doctorExists(id) || patientExists(id)) {
            System.out.println("Duplicate ID not allowed!");
            return;
        }

        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Specialization: ");
        String specialization = sc.nextLine();

        System.out.print("Enter Consultation Fee: ");
        double fee = sc.nextDouble();

        if (age < 0 || fee < 0) {
            System.out.println("Invalid input!");
            return;
        }

        doctors[doctorCount++] =
            new PermanentDoctor(id, name, age, specialization, fee);

        System.out.println("Doctor registered successfully!");
    }

    static void addPatient() {
        if (patientCount == 100) {
            System.out.println("Patient storage is full!");
            return;
        }

        System.out.print("Enter Patient ID: ");
        int id = sc.nextInt();

        if (patientExists(id) || doctorExists(id)) {
            System.out.println("Duplicate ID not allowed!");
            return;
        }

        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Disease: ");
        String disease = sc.nextLine();

        System.out.print("Enter Room Charges: ");
        double room = sc.nextDouble();

        System.out.print("Enter Treatment Charges: ");
        double treatment = sc.nextDouble();

        if (age < 0 || room < 0 || treatment < 0) {
            System.out.println("Invalid input!");
            return;
        }

        patients[patientCount++] =
            new AdmittedPatient(id, name, age, disease, room, treatment);

        System.out.println("Patient registered successfully!");
    }

    static void displayAllDoctors() {
        if (doctorCount == 0) {
            System.out.println("No doctors registered!");
            return;
        }

        for (int i = 0; i < doctorCount; i++) {
            doctors[i].displayDetails();
        }
    }

    static void displayAllPatients() {
        if (patientCount == 0) {
            System.out.println("No patients registered!");
            return;
        }

        for (int i = 0; i < patientCount; i++) {
            patients[i].displayDetails();
        }
    }

    static void searchPatient() {
        System.out.print("Enter Patient ID: ");
        int id = sc.nextInt();

        for (int i = 0; i < patientCount; i++) {
            if (patients[i].getId() == id) {
                patients[i].displayDetails();
                return;
            }
        }

        System.out.println("Patient not found!");
    }

    static void totalHospitalBill() {
        double total = 0;

        for (int i = 0; i < patientCount; i++) {
            total += patients[i].calculateBill();
        }

        System.out.println("Total Hospital Bill: Rs. " + total);
    }

    public static void main(String args[]) {

        while (true) {
            System.out.println("\n===== HOSPITAL MANAGEMENT SYSTEM =====");
            System.out.println("1. Register Doctor");
            System.out.println("2. Register Patient");
            System.out.println("3. Display All Doctors");
            System.out.println("4. Display All Patients");
            System.out.println("5. Search Patient");
            System.out.println("6. Calculate Total Hospital Bill");
            System.out.println("7. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addDoctor();
                    break;

                case 2:
                    addPatient();
                    break;

                case 3:
                    displayAllDoctors();
                    break;

                case 4:
                    displayAllPatients();
                    break;

                case 5:
                    searchPatient();
                    break;

                case 6:
                    totalHospitalBill();
                    break;

                case 7:
                    System.out.println("Exiting Hospital Management System...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
